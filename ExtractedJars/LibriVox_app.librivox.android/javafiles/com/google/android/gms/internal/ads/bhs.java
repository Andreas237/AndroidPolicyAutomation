// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bhm, bht, bhw, bnw, 
//			bhv, bhy, bhx

public final class bhs
{

	public static Pair a(String s)
	{
		byte byte0;
		byte byte1;
		String as[];
label0:
		{
			if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
				return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
			as = s.split("\\.");
	//    4    6:aload_0         
	//    5    7:ldc1            #143 <String "\\.">
	//    6    9:invokevirtual   #149 <Method String[] String.split(String)>
	//    7   12:astore          4
			byte0 = 0;
	//    8   14:iconst_0        
	//    9   15:istore_1        
			String s1 = as[0];
	//   10   16:aload           4
	//   11   18:iconst_0        
	//   12   19:aaload          
	//   13   20:astore          5
			int i = s1.hashCode();
	//   14   22:aload           5
	//   15   24:invokevirtual   #153 <Method int String.hashCode()>
	//   16   27:istore_3        
			byte1 = 2;
	//   17   28:iconst_2        
	//   18   29:istore_2        
			switch(i)
	//*  19   30:iload_3         
			{
			default:
				break;

	//*  20   31:lookupswitch    4: default 72
	//	               3006243: 118
	//	               3006244: 103
	//	               3199032: 90
	//	               3214780: 75
	//*  21   72:goto            133
			case 3214780: 
				if(!s1.equals("hvc1"))
					break;
	//   22   75:aload           5
	//   23   77:ldc1            #155 <String "hvc1">
	//   24   79:invokevirtual   #159 <Method boolean String.equals(Object)>
	//   25   82:ifeq            133
				byte0 = 1;
	//   26   85:iconst_1        
	//   27   86:istore_1        
				break label0;
	//   28   87:goto            135

			case 3199032: 
				if(!s1.equals("hev1"))
	//*  29   90:aload           5
	//*  30   92:ldc1            #161 <String "hev1">
	//*  31   94:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  32   97:ifeq            133
					break;
	//   33  100:goto            135
				break label0;

			case 3006244: 
				if(!s1.equals("avc2"))
					break;
	//   34  103:aload           5
	//   35  105:ldc1            #163 <String "avc2">
	//   36  107:invokevirtual   #159 <Method boolean String.equals(Object)>
	//   37  110:ifeq            133
				byte0 = 3;
	//   38  113:iconst_3        
	//   39  114:istore_1        
				break label0;
	//   40  115:goto            135

			case 3006243: 
				if(!s1.equals("avc1"))
					break;
	//   41  118:aload           5
	//   42  120:ldc1            #165 <String "avc1">
	//   43  122:invokevirtual   #159 <Method boolean String.equals(Object)>
	//   44  125:ifeq            133
				byte0 = 2;
	//   45  128:iconst_2        
	//   46  129:istore_1        
				break label0;
	//   47  130:goto            135
			}
			byte0 = -1;
	//   48  133:iconst_m1       
	//   49  134:istore_1        
		}
label1:
		{
			switch(byte0)
	//*  50  135:iload_1         
			{
	//*  51  136:tableswitch     0 3: default 168
	//	               0 177
	//	               1 177
	//	               2 170
	//	               3 170
			default:
				return null;
	//   52  168:aconst_null     
	//   53  169:areturn         

			case 2: // '\002'
			case 3: // '\003'
				return a(s, as);
	//   54  170:aload_0         
	//   55  171:aload           4
	//   56  173:invokestatic    #168 <Method Pair a(String, String[])>
	//   57  176:areturn         

			case 0: // '\0'
			case 1: // '\001'
				break;
			}
			if(as.length < 4)
	//*  58  177:aload           4
	//*  59  179:arraylength     
	//*  60  180:iconst_4        
	//*  61  181:icmpge          225
			{
				s = String.valueOf(((Object) (s)));
	//   62  184:aload_0         
	//   63  185:invokestatic    #171 <Method String String.valueOf(Object)>
	//   64  188:astore_0        
				if(s.length() != 0)
	//*  65  189:aload_0         
	//*  66  190:invokevirtual   #174 <Method int String.length()>
	//*  67  193:ifeq            206
					s = "Ignoring malformed HEVC codec string: ".concat(s);
	//   68  196:ldc1            #176 <String "Ignoring malformed HEVC codec string: ">
	//   69  198:aload_0         
	//   70  199:invokevirtual   #180 <Method String String.concat(String)>
	//   71  202:astore_0        
				else
	//*  72  203:goto            216
					s = new String("Ignoring malformed HEVC codec string: ");
	//   73  206:new             #145 <Class String>
	//   74  209:dup             
	//   75  210:ldc1            #176 <String "Ignoring malformed HEVC codec string: ">
	//   76  212:invokespecial   #183 <Method void String(String)>
	//   77  215:astore_0        
				Log.w("MediaCodecUtil", s);
	//   78  216:ldc1            #185 <String "MediaCodecUtil">
	//   79  218:aload_0         
	//   80  219:invokestatic    #191 <Method int Log.w(String, String)>
	//   81  222:pop             
				return null;
	//   82  223:aconst_null     
	//   83  224:areturn         
			}
			Matcher matcher = b.matcher(((CharSequence) (as[1])));
	//   84  225:getstatic       #43  <Field Pattern b>
	//   85  228:aload           4
	//   86  230:iconst_1        
	//   87  231:aaload          
	//   88  232:invokevirtual   #195 <Method Matcher Pattern.matcher(CharSequence)>
	//   89  235:astore          5
			if(!matcher.matches())
	//*  90  237:aload           5
	//*  91  239:invokevirtual   #201 <Method boolean Matcher.matches()>
	//*  92  242:ifne            286
			{
				s = String.valueOf(((Object) (s)));
	//   93  245:aload_0         
	//   94  246:invokestatic    #171 <Method String String.valueOf(Object)>
	//   95  249:astore_0        
				if(s.length() != 0)
	//*  96  250:aload_0         
	//*  97  251:invokevirtual   #174 <Method int String.length()>
	//*  98  254:ifeq            267
					s = "Ignoring malformed HEVC codec string: ".concat(s);
	//   99  257:ldc1            #176 <String "Ignoring malformed HEVC codec string: ">
	//  100  259:aload_0         
	//  101  260:invokevirtual   #180 <Method String String.concat(String)>
	//  102  263:astore_0        
				else
	//* 103  264:goto            277
					s = new String("Ignoring malformed HEVC codec string: ");
	//  104  267:new             #145 <Class String>
	//  105  270:dup             
	//  106  271:ldc1            #176 <String "Ignoring malformed HEVC codec string: ">
	//  107  273:invokespecial   #183 <Method void String(String)>
	//  108  276:astore_0        
				Log.w("MediaCodecUtil", s);
	//  109  277:ldc1            #185 <String "MediaCodecUtil">
	//  110  279:aload_0         
	//  111  280:invokestatic    #191 <Method int Log.w(String, String)>
	//  112  283:pop             
				return null;
	//  113  284:aconst_null     
	//  114  285:areturn         
			}
			s = matcher.group(1);
	//  115  286:aload           5
	//  116  288:iconst_1        
	//  117  289:invokevirtual   #205 <Method String Matcher.group(int)>
	//  118  292:astore_0        
			if("1".equals(((Object) (s))))
	//* 119  293:ldc1            #207 <String "1">
	//* 120  295:aload_0         
	//* 121  296:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 122  299:ifeq            307
			{
				byte0 = 1;
	//  123  302:iconst_1        
	//  124  303:istore_1        
			} else
	//* 125  304:goto            318
			{
				if(!"2".equals(((Object) (s))))
					break label1;
	//  126  307:ldc1            #209 <String "2">
	//  127  309:aload_0         
	//  128  310:invokevirtual   #159 <Method boolean String.equals(Object)>
	//  129  313:ifeq            397
				byte0 = byte1;
	//  130  316:iload_2         
	//  131  317:istore_1        
			}
			s = ((String) ((Integer)f.get(((Object) (as[3])))));
	//  132  318:getstatic       #67  <Field Map f>
	//  133  321:aload           4
	//  134  323:iconst_3        
	//  135  324:aaload          
	//  136  325:invokeinterface #213 <Method Object Map.get(Object)>
	//  137  330:checkcast       #71  <Class Integer>
	//  138  333:astore_0        
			if(s == null)
	//* 139  334:aload_0         
	//* 140  335:ifnonnull       384
			{
				s = String.valueOf(((Object) (matcher.group(1))));
	//  141  338:aload           5
	//  142  340:iconst_1        
	//  143  341:invokevirtual   #205 <Method String Matcher.group(int)>
	//  144  344:invokestatic    #171 <Method String String.valueOf(Object)>
	//  145  347:astore_0        
				if(s.length() != 0)
	//* 146  348:aload_0         
	//* 147  349:invokevirtual   #174 <Method int String.length()>
	//* 148  352:ifeq            365
					s = "Unknown HEVC level string: ".concat(s);
	//  149  355:ldc1            #215 <String "Unknown HEVC level string: ">
	//  150  357:aload_0         
	//  151  358:invokevirtual   #180 <Method String String.concat(String)>
	//  152  361:astore_0        
				else
	//* 153  362:goto            375
					s = new String("Unknown HEVC level string: ");
	//  154  365:new             #145 <Class String>
	//  155  368:dup             
	//  156  369:ldc1            #215 <String "Unknown HEVC level string: ">
	//  157  371:invokespecial   #183 <Method void String(String)>
	//  158  374:astore_0        
				Log.w("MediaCodecUtil", s);
	//  159  375:ldc1            #185 <String "MediaCodecUtil">
	//  160  377:aload_0         
	//  161  378:invokestatic    #191 <Method int Log.w(String, String)>
	//  162  381:pop             
				return null;
	//  163  382:aconst_null     
	//  164  383:areturn         
			} else
			{
				return new Pair(((Object) (Integer.valueOf(((int) (byte0))))), ((Object) (s)));
	//  165  384:new             #217 <Class Pair>
	//  166  387:dup             
	//  167  388:iload_1         
	//  168  389:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  169  392:aload_0         
	//  170  393:invokespecial   #220 <Method void Pair(Object, Object)>
	//  171  396:areturn         
			}
		}
		s = String.valueOf(((Object) (s)));
	//  172  397:aload_0         
	//  173  398:invokestatic    #171 <Method String String.valueOf(Object)>
	//  174  401:astore_0        
		if(s.length() != 0)
	//* 175  402:aload_0         
	//* 176  403:invokevirtual   #174 <Method int String.length()>
	//* 177  406:ifeq            419
			s = "Unknown HEVC profile string: ".concat(s);
	//  178  409:ldc1            #222 <String "Unknown HEVC profile string: ">
	//  179  411:aload_0         
	//  180  412:invokevirtual   #180 <Method String String.concat(String)>
	//  181  415:astore_0        
		else
	//* 182  416:goto            429
			s = new String("Unknown HEVC profile string: ");
	//  183  419:new             #145 <Class String>
	//  184  422:dup             
	//  185  423:ldc1            #222 <String "Unknown HEVC profile string: ">
	//  186  425:invokespecial   #183 <Method void String(String)>
	//  187  428:astore_0        
		Log.w("MediaCodecUtil", s);
	//  188  429:ldc1            #185 <String "MediaCodecUtil">
	//  189  431:aload_0         
	//  190  432:invokestatic    #191 <Method int Log.w(String, String)>
	//  191  435:pop             
		return null;
	//  192  436:aconst_null     
	//  193  437:areturn         
	}

	private static Pair a(String s, String as[])
	{
		if(as.length < 2)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:iconst_2        
	//*   3    3:icmpge          47
		{
			s = String.valueOf(((Object) (s)));
	//    4    6:aload_0         
	//    5    7:invokestatic    #171 <Method String String.valueOf(Object)>
	//    6   10:astore_0        
			if(s.length() != 0)
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #174 <Method int String.length()>
	//*   9   15:ifeq            28
				s = "Ignoring malformed AVC codec string: ".concat(s);
	//   10   18:ldc1            #226 <String "Ignoring malformed AVC codec string: ">
	//   11   20:aload_0         
	//   12   21:invokevirtual   #180 <Method String String.concat(String)>
	//   13   24:astore_0        
			else
	//*  14   25:goto            38
				s = new String("Ignoring malformed AVC codec string: ");
	//   15   28:new             #145 <Class String>
	//   16   31:dup             
	//   17   32:ldc1            #226 <String "Ignoring malformed AVC codec string: ">
	//   18   34:invokespecial   #183 <Method void String(String)>
	//   19   37:astore_0        
			Log.w("MediaCodecUtil", s);
	//   20   38:ldc1            #185 <String "MediaCodecUtil">
	//   21   40:aload_0         
	//   22   41:invokestatic    #191 <Method int Log.w(String, String)>
	//   23   44:pop             
			return null;
	//   24   45:aconst_null     
	//   25   46:areturn         
		}
		Integer integer;
		if(as[1].length() != 6)
			break MISSING_BLOCK_LABEL_98;
	//   26   47:aload_1         
	//   27   48:iconst_1        
	//   28   49:aaload          
	//   29   50:invokevirtual   #174 <Method int String.length()>
	//   30   53:bipush          6
	//   31   55:icmpne          98
		int i = Integer.parseInt(as[1].substring(0, 2), 16);
	//   32   58:aload_1         
	//   33   59:iconst_1        
	//   34   60:aaload          
	//   35   61:iconst_0        
	//   36   62:iconst_2        
	//   37   63:invokevirtual   #230 <Method String String.substring(int, int)>
	//   38   66:bipush          16
	//   39   68:invokestatic    #234 <Method int Integer.parseInt(String, int)>
	//   40   71:istore_2        
		integer = Integer.valueOf(Integer.parseInt(as[1].substring(4), 16));
	//   41   72:aload_1         
	//   42   73:iconst_1        
	//   43   74:aaload          
	//   44   75:iconst_4        
	//   45   76:invokevirtual   #236 <Method String String.substring(int)>
	//   46   79:bipush          16
	//   47   81:invokestatic    #234 <Method int Integer.parseInt(String, int)>
	//   48   84:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//   49   87:astore_3        
		as = ((String []) (Integer.valueOf(i)));
	//   50   88:iload_2         
	//   51   89:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//   52   92:astore_1        
		s = ((String) (integer));
	//   53   93:aload_3         
	//   54   94:astore_0        
		break MISSING_BLOCK_LABEL_128;
	//   55   95:goto            128
		if(as.length < 3)
			break MISSING_BLOCK_LABEL_271;
	//   56   98:aload_1         
	//   57   99:arraylength     
	//   58  100:iconst_3        
	//   59  101:icmplt          271
		integer = Integer.valueOf(Integer.parseInt(as[1]));
	//   60  104:aload_1         
	//   61  105:iconst_1        
	//   62  106:aaload          
	//   63  107:invokestatic    #239 <Method int Integer.parseInt(String)>
	//   64  110:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//   65  113:astore_3        
		as = ((String []) (Integer.valueOf(Integer.parseInt(as[2]))));
	//   66  114:aload_1         
	//   67  115:iconst_2        
	//   68  116:aaload          
	//   69  117:invokestatic    #239 <Method int Integer.parseInt(String)>
	//   70  120:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//   71  123:astore_1        
		s = ((String) (as));
	//   72  124:aload_1         
	//   73  125:astore_0        
		as = ((String []) (integer));
	//   74  126:aload_3         
	//   75  127:astore_1        
		Integer integer1 = Integer.valueOf(d.get(((Integer) (as)).intValue()));
	//   76  128:getstatic       #57  <Field SparseIntArray d>
	//   77  131:aload_1         
	//   78  132:invokevirtual   #242 <Method int Integer.intValue()>
	//   79  135:invokevirtual   #245 <Method int SparseIntArray.get(int)>
	//   80  138:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//   81  141:astore_3        
		if(integer1 == null)
	//*  82  142:aload_3         
	//*  83  143:ifnonnull       194
		{
			s = String.valueOf(((Object) (as)));
	//   84  146:aload_1         
	//   85  147:invokestatic    #171 <Method String String.valueOf(Object)>
	//   86  150:astore_0        
			as = ((String []) (new StringBuilder(String.valueOf(((Object) (s))).length() + 21)));
	//   87  151:new             #247 <Class StringBuilder>
	//   88  154:dup             
	//   89  155:aload_0         
	//   90  156:invokestatic    #171 <Method String String.valueOf(Object)>
	//   91  159:invokevirtual   #174 <Method int String.length()>
	//   92  162:bipush          21
	//   93  164:iadd            
	//   94  165:invokespecial   #250 <Method void StringBuilder(int)>
	//   95  168:astore_1        
			((StringBuilder) (as)).append("Unknown AVC profile: ");
	//   96  169:aload_1         
	//   97  170:ldc1            #252 <String "Unknown AVC profile: ">
	//   98  172:invokevirtual   #256 <Method StringBuilder StringBuilder.append(String)>
	//   99  175:pop             
			((StringBuilder) (as)).append(s);
	//  100  176:aload_1         
	//  101  177:aload_0         
	//  102  178:invokevirtual   #256 <Method StringBuilder StringBuilder.append(String)>
	//  103  181:pop             
			Log.w("MediaCodecUtil", ((StringBuilder) (as)).toString());
	//  104  182:ldc1            #185 <String "MediaCodecUtil">
	//  105  184:aload_1         
	//  106  185:invokevirtual   #260 <Method String StringBuilder.toString()>
	//  107  188:invokestatic    #191 <Method int Log.w(String, String)>
	//  108  191:pop             
			return null;
	//  109  192:aconst_null     
	//  110  193:areturn         
		}
		as = ((String []) (Integer.valueOf(e.get(((Integer) (s)).intValue()))));
	//  111  194:getstatic       #63  <Field SparseIntArray e>
	//  112  197:aload_0         
	//  113  198:invokevirtual   #242 <Method int Integer.intValue()>
	//  114  201:invokevirtual   #245 <Method int SparseIntArray.get(int)>
	//  115  204:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  116  207:astore_1        
		if(as == null)
	//* 117  208:aload_1         
	//* 118  209:ifnonnull       261
		{
			s = String.valueOf(((Object) (s)));
	//  119  212:aload_0         
	//  120  213:invokestatic    #171 <Method String String.valueOf(Object)>
	//  121  216:astore_0        
			as = ((String []) (new StringBuilder(String.valueOf(((Object) (s))).length() + 19)));
	//  122  217:new             #247 <Class StringBuilder>
	//  123  220:dup             
	//  124  221:aload_0         
	//  125  222:invokestatic    #171 <Method String String.valueOf(Object)>
	//  126  225:invokevirtual   #174 <Method int String.length()>
	//  127  228:bipush          19
	//  128  230:iadd            
	//  129  231:invokespecial   #250 <Method void StringBuilder(int)>
	//  130  234:astore_1        
			((StringBuilder) (as)).append("Unknown AVC level: ");
	//  131  235:aload_1         
	//  132  236:ldc2            #262 <String "Unknown AVC level: ">
	//  133  239:invokevirtual   #256 <Method StringBuilder StringBuilder.append(String)>
	//  134  242:pop             
			((StringBuilder) (as)).append(s);
	//  135  243:aload_1         
	//  136  244:aload_0         
	//  137  245:invokevirtual   #256 <Method StringBuilder StringBuilder.append(String)>
	//  138  248:pop             
			Log.w("MediaCodecUtil", ((StringBuilder) (as)).toString());
	//  139  249:ldc1            #185 <String "MediaCodecUtil">
	//  140  251:aload_1         
	//  141  252:invokevirtual   #260 <Method String StringBuilder.toString()>
	//  142  255:invokestatic    #191 <Method int Log.w(String, String)>
	//  143  258:pop             
			return null;
	//  144  259:aconst_null     
	//  145  260:areturn         
		} else
		{
			return new Pair(((Object) (integer1)), ((Object) (as)));
	//  146  261:new             #217 <Class Pair>
	//  147  264:dup             
	//  148  265:aload_3         
	//  149  266:aload_1         
	//  150  267:invokespecial   #220 <Method void Pair(Object, Object)>
	//  151  270:areturn         
		}
		try
		{
			as = ((String []) (String.valueOf(((Object) (s)))));
	//  152  271:aload_0         
	//  153  272:invokestatic    #171 <Method String String.valueOf(Object)>
	//  154  275:astore_1        
			if(((String) (as)).length() != 0)
	//* 155  276:aload_1         
	//* 156  277:invokevirtual   #174 <Method int String.length()>
	//* 157  280:ifeq            293
			{
				as = ((String []) ("Ignoring malformed AVC codec string: ".concat(((String) (as)))));
	//  158  283:ldc1            #226 <String "Ignoring malformed AVC codec string: ">
	//  159  285:aload_1         
	//  160  286:invokevirtual   #180 <Method String String.concat(String)>
	//  161  289:astore_1        
				break MISSING_BLOCK_LABEL_303;
	//  162  290:goto            303
			}
		}
	//* 163  293:new             #145 <Class String>
	//* 164  296:dup             
	//* 165  297:ldc1            #226 <String "Ignoring malformed AVC codec string: ">
	//* 166  299:invokespecial   #183 <Method void String(String)>
	//* 167  302:astore_1        
	//* 168  303:ldc1            #185 <String "MediaCodecUtil">
	//* 169  305:aload_1         
	//* 170  306:invokestatic    #191 <Method int Log.w(String, String)>
	//* 171  309:pop             
	//* 172  310:aconst_null     
	//* 173  311:areturn         
	//* 174  312:aload_0         
	//* 175  313:invokestatic    #171 <Method String String.valueOf(Object)>
	//* 176  316:astore_0        
	//* 177  317:aload_0         
	//* 178  318:invokevirtual   #174 <Method int String.length()>
	//* 179  321:ifeq            334
	//* 180  324:ldc1            #226 <String "Ignoring malformed AVC codec string: ">
	//* 181  326:aload_0         
	//* 182  327:invokevirtual   #180 <Method String String.concat(String)>
	//* 183  330:astore_0        
	//* 184  331:goto            344
	//* 185  334:new             #145 <Class String>
	//* 186  337:dup             
	//* 187  338:ldc1            #226 <String "Ignoring malformed AVC codec string: ">
	//* 188  340:invokespecial   #183 <Method void String(String)>
	//* 189  343:astore_0        
	//* 190  344:ldc1            #185 <String "MediaCodecUtil">
	//* 191  346:aload_0         
	//* 192  347:invokestatic    #191 <Method int Log.w(String, String)>
	//* 193  350:pop             
	//* 194  351:aconst_null     
	//* 195  352:areturn         
		// Misplaced declaration of an exception variable
		catch(String as[])
		{
			s = String.valueOf(((Object) (s)));
			if(s.length() != 0)
				s = "Ignoring malformed AVC codec string: ".concat(s);
			else
				s = new String("Ignoring malformed AVC codec string: ");
			Log.w("MediaCodecUtil", s);
			return null;
		}
		as = ((String []) (new String("Ignoring malformed AVC codec string: ")));
		Log.w("MediaCodecUtil", ((String) (as)));
		return null;
	//* 196  353:astore_1        
	//* 197  354:goto            312
	}

	public static bhm a()
	{
		return a;
	//    0    0:getstatic       #33  <Field bhm a>
	//    1    3:areturn         
	}

	public static bhm a(String s, boolean flag)
	{
		s = ((String) (b(s, flag)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #267 <Method List b(String, boolean)>
	//    3    5:astore_0        
		if(((List) (s)).isEmpty())
	//*   4    6:aload_0         
	//*   5    7:invokeinterface #272 <Method boolean List.isEmpty()>
	//*   6   12:ifeq            17
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
		else
			return (bhm)((List) (s)).get(0);
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:invokeinterface #275 <Method Object List.get(int)>
	//   12   24:checkcast       #28  <Class bhm>
	//   13   27:areturn         
	}

	private static List a(bht bht1, bhw bhw1)
	{
		int i;
		int j;
		int k;
		int l;
		boolean flag;
		boolean flag2;
		boolean flag3;
		android.media.MediaCodecInfo.CodecCapabilities codeccapabilities;
		Object obj;
		String s;
		ArrayList arraylist;
		String s1;
		MediaCodecInfo mediacodecinfo;
		String as[];
		String s2;
		String s3;
		try
		{
			arraylist = new ArrayList();
	//    0    0:new             #280 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #281 <Method void ArrayList()>
	//    3    7:astore          11
			s1 = bht1.a;
	//    4    9:aload_0         
	//    5   10:getfield        #286 <Field String bht.a>
	//    6   13:astore          12
			k = bhw1.a();
	//    7   15:aload_1         
	//    8   16:invokeinterface #290 <Method int bhw.a()>
	//    9   21:istore          4
			flag2 = bhw1.b();
	//   10   23:aload_1         
	//   11   24:invokeinterface #292 <Method boolean bhw.b()>
	//   12   29:istore          7
		}
	//*  13   31:iconst_0        
	//*  14   32:istore_3        
	//*  15   33:iload_3         
	//*  16   34:iload           4
	//*  17   36:icmpge          989
	//*  18   39:aload_1         
	//*  19   40:iload_3         
	//*  20   41:invokeinterface #295 <Method MediaCodecInfo bhw.a(int)>
	//*  21   46:astore          13
	//*  22   48:aload           13
	//*  23   50:invokevirtual   #300 <Method String MediaCodecInfo.getName()>
	//*  24   53:astore          10
	//*  25   55:aload           13
	//*  26   57:invokevirtual   #303 <Method boolean MediaCodecInfo.isEncoder()>
	//*  27   60:ifne            1028
	//*  28   63:iload           7
	//*  29   65:ifne            82
	//*  30   68:aload           10
	//*  31   70:ldc2            #305 <String ".secure">
	//*  32   73:invokevirtual   #309 <Method boolean String.endsWith(String)>
	//*  33   76:ifeq            82
	//*  34   79:goto            1028
	//*  35   82:getstatic       #313 <Field int bnw.a>
	//*  36   85:bipush          21
	//*  37   87:icmpge          159
	//*  38   90:ldc2            #315 <String "CIPAACDecoder">
	//*  39   93:aload           10
	//*  40   95:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  41   98:ifne            1003
	//*  42  101:ldc2            #317 <String "CIPMP3Decoder">
	//*  43  104:aload           10
	//*  44  106:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  45  109:ifne            1003
	//*  46  112:ldc2            #319 <String "CIPVorbisDecoder">
	//*  47  115:aload           10
	//*  48  117:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  49  120:ifne            1003
	//*  50  123:ldc2            #321 <String "CIPAMRNBDecoder">
	//*  51  126:aload           10
	//*  52  128:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  53  131:ifne            1003
	//*  54  134:ldc2            #323 <String "AACDecoder">
	//*  55  137:aload           10
	//*  56  139:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  57  142:ifne            1003
	//*  58  145:ldc2            #325 <String "MP3Decoder">
	//*  59  148:aload           10
	//*  60  150:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  61  153:ifeq            159
	//*  62  156:goto            1003
	//*  63  159:getstatic       #313 <Field int bnw.a>
	//*  64  162:bipush          18
	//*  65  164:icmpge          183
	//*  66  167:ldc2            #327 <String "OMX.SEC.MP3.Decoder">
	//*  67  170:aload           10
	//*  68  172:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  69  175:ifeq            183
	//*  70  178:iconst_0        
	//*  71  179:istore_2        
	//*  72  180:goto            585
	//*  73  183:getstatic       #313 <Field int bnw.a>
	//*  74  186:bipush          18
	//*  75  188:icmpge          219
	//*  76  191:ldc2            #329 <String "OMX.MTK.AUDIO.DECODER.AAC">
	//*  77  194:aload           10
	//*  78  196:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  79  199:ifeq            219
	//*  80  202:ldc2            #331 <String "a70">
	//*  81  205:getstatic       #333 <Field String bnw.b>
	//*  82  208:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  83  211:ifeq            219
	//*  84  214:iconst_0        
	//*  85  215:istore_2        
	//*  86  216:goto            585
	//*  87  219:getstatic       #313 <Field int bnw.a>
	//*  88  222:bipush          16
	//*  89  224:icmpne          385
	//*  90  227:ldc2            #335 <String "OMX.qcom.audio.decoder.mp3">
	//*  91  230:aload           10
	//*  92  232:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  93  235:ifeq            385
	//*  94  238:ldc2            #337 <String "dlxu">
	//*  95  241:getstatic       #333 <Field String bnw.b>
	//*  96  244:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  97  247:ifne            1008
	//*  98  250:ldc2            #339 <String "protou">
	//*  99  253:getstatic       #333 <Field String bnw.b>
	//* 100  256:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 101  259:ifne            1008
	//* 102  262:ldc2            #341 <String "ville">
	//* 103  265:getstatic       #333 <Field String bnw.b>
	//* 104  268:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 105  271:ifne            1008
	//* 106  274:ldc2            #343 <String "villeplus">
	//* 107  277:getstatic       #333 <Field String bnw.b>
	//* 108  280:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 109  283:ifne            1008
	//* 110  286:ldc2            #345 <String "villec2">
	//* 111  289:getstatic       #333 <Field String bnw.b>
	//* 112  292:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 113  295:ifne            1008
	//* 114  298:getstatic       #333 <Field String bnw.b>
	//* 115  301:ldc2            #347 <String "gee">
	//* 116  304:invokevirtual   #350 <Method boolean String.startsWith(String)>
	//* 117  307:ifne            1008
	//* 118  310:ldc2            #352 <String "C6602">
	//* 119  313:getstatic       #333 <Field String bnw.b>
	//* 120  316:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 121  319:ifne            1008
	//* 122  322:ldc2            #354 <String "C6603">
	//* 123  325:getstatic       #333 <Field String bnw.b>
	//* 124  328:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 125  331:ifne            1008
	//* 126  334:ldc2            #356 <String "C6606">
	//* 127  337:getstatic       #333 <Field String bnw.b>
	//* 128  340:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 129  343:ifne            1008
	//* 130  346:ldc2            #358 <String "C6616">
	//* 131  349:getstatic       #333 <Field String bnw.b>
	//* 132  352:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 133  355:ifne            1008
	//* 134  358:ldc2            #360 <String "L36h">
	//* 135  361:getstatic       #333 <Field String bnw.b>
	//* 136  364:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 137  367:ifne            1008
	//* 138  370:ldc2            #362 <String "SO-02E">
	//* 139  373:getstatic       #333 <Field String bnw.b>
	//* 140  376:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 141  379:ifeq            385
	//* 142  382:goto            1008
	//* 143  385:getstatic       #313 <Field int bnw.a>
	//* 144  388:bipush          16
	//* 145  390:icmpne          455
	//* 146  393:ldc2            #364 <String "OMX.qcom.audio.decoder.aac">
	//* 147  396:aload           10
	//* 148  398:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 149  401:ifeq            455
	//* 150  404:ldc2            #366 <String "C1504">
	//* 151  407:getstatic       #333 <Field String bnw.b>
	//* 152  410:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 153  413:ifne            1013
	//* 154  416:ldc2            #368 <String "C1505">
	//* 155  419:getstatic       #333 <Field String bnw.b>
	//* 156  422:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 157  425:ifne            1013
	//* 158  428:ldc2            #370 <String "C1604">
	//* 159  431:getstatic       #333 <Field String bnw.b>
	//* 160  434:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 161  437:ifne            1013
	//* 162  440:ldc2            #372 <String "C1605">
	//* 163  443:getstatic       #333 <Field String bnw.b>
	//* 164  446:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 165  449:ifeq            455
	//* 166  452:goto            1013
	//* 167  455:getstatic       #313 <Field int bnw.a>
	//* 168  458:bipush          19
	//* 169  460:icmpgt          549
	//* 170  463:ldc2            #374 <String "OMX.SEC.vp8.dec">
	//* 171  466:aload           10
	//* 172  468:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 173  471:ifeq            549
	//* 174  474:ldc2            #376 <String "samsung">
	//* 175  477:getstatic       #378 <Field String bnw.c>
	//* 176  480:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 177  483:ifeq            549
	//* 178  486:getstatic       #333 <Field String bnw.b>
	//* 179  489:ldc2            #380 <String "d2">
	//* 180  492:invokevirtual   #350 <Method boolean String.startsWith(String)>
	//* 181  495:ifne            1018
	//* 182  498:getstatic       #333 <Field String bnw.b>
	//* 183  501:ldc2            #382 <String "serrano">
	//* 184  504:invokevirtual   #350 <Method boolean String.startsWith(String)>
	//* 185  507:ifne            1018
	//* 186  510:getstatic       #333 <Field String bnw.b>
	//* 187  513:ldc2            #384 <String "jflte">
	//* 188  516:invokevirtual   #350 <Method boolean String.startsWith(String)>
	//* 189  519:ifne            1018
	//* 190  522:getstatic       #333 <Field String bnw.b>
	//* 191  525:ldc2            #386 <String "santos">
	//* 192  528:invokevirtual   #350 <Method boolean String.startsWith(String)>
	//* 193  531:ifne            1018
	//* 194  534:getstatic       #333 <Field String bnw.b>
	//* 195  537:ldc2            #388 <String "t0">
	//* 196  540:invokevirtual   #350 <Method boolean String.startsWith(String)>
	//* 197  543:ifeq            549
	//* 198  546:goto            1018
	//* 199  549:getstatic       #313 <Field int bnw.a>
	//* 200  552:bipush          19
	//* 201  554:icmpgt          1023
	//* 202  557:getstatic       #333 <Field String bnw.b>
	//* 203  560:ldc2            #384 <String "jflte">
	//* 204  563:invokevirtual   #350 <Method boolean String.startsWith(String)>
	//* 205  566:ifeq            1023
	//* 206  569:ldc2            #390 <String "OMX.qcom.video.decoder.vp8">
	//* 207  572:aload           10
	//* 208  574:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 209  577:ifeq            1023
	//* 210  580:iconst_0        
	//* 211  581:istore_2        
	//* 212  582:goto            585
	//* 213  585:iload_2         
	//* 214  586:ifeq            982
	//* 215  589:aload           13
	//* 216  591:invokevirtual   #394 <Method String[] MediaCodecInfo.getSupportedTypes()>
	//* 217  594:astore          14
	//* 218  596:aload           14
	//* 219  598:arraylength     
	//* 220  599:istore          5
	//* 221  601:iconst_0        
	//* 222  602:istore_2        
	//* 223  603:iload_2         
	//* 224  604:iload           5
	//* 225  606:icmpge          982
	//* 226  609:aload           14
	//* 227  611:iload_2         
	//* 228  612:aaload          
	//* 229  613:astore          15
	//* 230  615:aload           15
	//* 231  617:aload           12
	//* 232  619:invokevirtual   #397 <Method boolean String.equalsIgnoreCase(String)>
	//* 233  622:istore          6
	//* 234  624:iload           6
	//* 235  626:ifeq            975
	//* 236  629:aload           13
	//* 237  631:aload           15
	//* 238  633:invokevirtual   #401 <Method android.media.MediaCodecInfo$CodecCapabilities MediaCodecInfo.getCapabilitiesForType(String)>
	//* 239  636:astore          9
	//* 240  638:aload_1         
	//* 241  639:aload           12
	//* 242  641:aload           9
	//* 243  643:invokeinterface #404 <Method boolean bhw.a(String, android.media.MediaCodecInfo$CodecCapabilities)>
	//* 244  648:istore          8
	//* 245  650:getstatic       #313 <Field int bnw.a>
	//* 246  653:bipush          22
	//* 247  655:icmpgt          1039
	//* 248  658:getstatic       #406 <Field String bnw.d>
	//* 249  661:ldc2            #408 <String "ODROID-XU3">
	//* 250  664:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 251  667:ifne            682
	//* 252  670:getstatic       #406 <Field String bnw.d>
	//* 253  673:ldc2            #410 <String "Nexus 10">
	//* 254  676:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 255  679:ifeq            1039
	//* 256  682:ldc2            #412 <String "OMX.Exynos.AVC.Decoder">
	//* 257  685:aload           10
	//* 258  687:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 259  690:ifne            1033
	//* 260  693:ldc2            #414 <String "OMX.Exynos.AVC.Decoder.secure">
	//* 261  696:aload           10
	//* 262  698:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 263  701:ifeq            1039
	//* 264  704:goto            1033
	//* 265  707:iload           7
	//* 266  709:ifeq            724
	//* 267  712:aload_0         
	//* 268  713:getfield        #417 <Field boolean bht.b>
	//* 269  716:iload           8
	//* 270  718:icmpeq          1045
	//* 271  721:goto            724
	//* 272  724:iload           7
	//* 273  726:ifne            762
	//* 274  729:aload_0         
	//* 275  730:getfield        #417 <Field boolean bht.b>
	//* 276  733:ifne            762
	//* 277  736:goto            1045
	//* 278  739:aload           11
	//* 279  741:aload           10
	//* 280  743:aload           12
	//* 281  745:aload           9
	//* 282  747:iload           6
	//* 283  749:iconst_0        
	//* 284  750:invokestatic    #420 <Method bhm bhm.a(String, String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean)>
	//* 285  753:invokeinterface #423 <Method boolean List.add(Object)>
	//* 286  758:pop             
	//* 287  759:goto            975
	//* 288  762:iload           7
	//* 289  764:ifne            813
	//* 290  767:iload           8
	//* 291  769:ifeq            813
	//* 292  772:aload           10
	//* 293  774:invokestatic    #171 <Method String String.valueOf(Object)>
	//* 294  777:ldc2            #305 <String ".secure">
	//* 295  780:invokevirtual   #180 <Method String String.concat(String)>
	//* 296  783:astore          16
	//* 297  785:aload           11
	//* 298  787:aload           16
	//* 299  789:aload           12
	//* 300  791:aload           9
	//* 301  793:iload           6
	//* 302  795:iconst_1        
	//* 303  796:invokestatic    #420 <Method bhm bhm.a(String, String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean)>
	//* 304  799:invokeinterface #423 <Method boolean List.add(Object)>
	//* 305  804:pop             
	//* 306  805:aload           11
	//* 307  807:areturn         
	//* 308  808:astore          9
	//* 309  810:goto            818
	//* 310  813:goto            975
	//* 311  816:astore          9
	//* 312  818:getstatic       #313 <Field int bnw.a>
	//* 313  821:bipush          23
	//* 314  823:icmpgt          896
	//* 315  826:aload           11
	//* 316  828:invokeinterface #272 <Method boolean List.isEmpty()>
	//* 317  833:ifne            896
	//* 318  836:new             #247 <Class StringBuilder>
	//* 319  839:dup             
	//* 320  840:aload           10
	//* 321  842:invokestatic    #171 <Method String String.valueOf(Object)>
	//* 322  845:invokevirtual   #174 <Method int String.length()>
	//* 323  848:bipush          46
	//* 324  850:iadd            
	//* 325  851:invokespecial   #250 <Method void StringBuilder(int)>
	//* 326  854:astore          9
	//* 327  856:aload           9
	//* 328  858:ldc2            #425 <String "Skipping codec ">
	//* 329  861:invokevirtual   #256 <Method StringBuilder StringBuilder.append(String)>
	//* 330  864:pop             
	//* 331  865:aload           9
	//* 332  867:aload           10
	//* 333  869:invokevirtual   #256 <Method StringBuilder StringBuilder.append(String)>
	//* 334  872:pop             
	//* 335  873:aload           9
	//* 336  875:ldc2            #427 <String " (failed to query capabilities)">
	//* 337  878:invokevirtual   #256 <Method StringBuilder StringBuilder.append(String)>
	//* 338  881:pop             
	//* 339  882:ldc1            #185 <String "MediaCodecUtil">
	//* 340  884:aload           9
	//* 341  886:invokevirtual   #260 <Method String StringBuilder.toString()>
	//* 342  889:invokestatic    #429 <Method int Log.e(String, String)>
	//* 343  892:pop             
	//* 344  893:goto            975
	//* 345  896:new             #247 <Class StringBuilder>
	//* 346  899:dup             
	//* 347  900:aload           10
	//* 348  902:invokestatic    #171 <Method String String.valueOf(Object)>
	//* 349  905:invokevirtual   #174 <Method int String.length()>
	//* 350  908:bipush          25
	//* 351  910:iadd            
	//* 352  911:aload           15
	//* 353  913:invokestatic    #171 <Method String String.valueOf(Object)>
	//* 354  916:invokevirtual   #174 <Method int String.length()>
	//* 355  919:iadd            
	//* 356  920:invokespecial   #250 <Method void StringBuilder(int)>
	//* 357  923:astore_0        
	//* 358  924:aload_0         
	//* 359  925:ldc2            #431 <String "Failed to query codec ">
	//* 360  928:invokevirtual   #256 <Method StringBuilder StringBuilder.append(String)>
	//* 361  931:pop             
	//* 362  932:aload_0         
	//* 363  933:aload           10
	//* 364  935:invokevirtual   #256 <Method StringBuilder StringBuilder.append(String)>
	//* 365  938:pop             
	//* 366  939:aload_0         
	//* 367  940:ldc2            #433 <String " (">
	//* 368  943:invokevirtual   #256 <Method StringBuilder StringBuilder.append(String)>
	//* 369  946:pop             
	//* 370  947:aload_0         
	//* 371  948:aload           15
	//* 372  950:invokevirtual   #256 <Method StringBuilder StringBuilder.append(String)>
	//* 373  953:pop             
	//* 374  954:aload_0         
	//* 375  955:ldc2            #435 <String ")">
	//* 376  958:invokevirtual   #256 <Method StringBuilder StringBuilder.append(String)>
	//* 377  961:pop             
	//* 378  962:ldc1            #185 <String "MediaCodecUtil">
	//* 379  964:aload_0         
	//* 380  965:invokevirtual   #260 <Method String StringBuilder.toString()>
	//* 381  968:invokestatic    #429 <Method int Log.e(String, String)>
	//* 382  971:pop             
	//* 383  972:aload           9
	//* 384  974:athrow          
	//* 385  975:iload_2         
	//* 386  976:iconst_1        
	//* 387  977:iadd            
	//* 388  978:istore_2        
	//* 389  979:goto            603
	//* 390  982:iload_3         
	//* 391  983:iconst_1        
	//* 392  984:iadd            
	//* 393  985:istore_3        
	//* 394  986:goto            33
	//* 395  989:aload           11
	//* 396  991:areturn         
		// Misplaced declaration of an exception variable
		catch(bht bht1)
	//* 397  992:astore_0        
		{
			throw new bhv(((Throwable) (bht1)), ((bhu) (null)));
	//  398  993:new             #437 <Class bhv>
	//  399  996:dup             
	//  400  997:aload_0         
	//  401  998:aconst_null     
	//  402  999:invokespecial   #440 <Method void bhv(Throwable, bhu)>
	//  403 1002:athrow          
		}
		j = 0;
		if(j >= k) goto _L2; else goto _L1
_L1:
		mediacodecinfo = bhw1.a(j);
		s = mediacodecinfo.getName();
		if(mediacodecinfo.isEncoder())
			break MISSING_BLOCK_LABEL_1028;
		if(flag2)
			break MISSING_BLOCK_LABEL_82;
		if(s.endsWith(".secure"))
			break MISSING_BLOCK_LABEL_1028;
		if(bnw.a >= 21 || !"CIPAACDecoder".equals(((Object) (s))) && !"CIPMP3Decoder".equals(((Object) (s))) && !"CIPVorbisDecoder".equals(((Object) (s))) && !"CIPAMRNBDecoder".equals(((Object) (s))) && !"AACDecoder".equals(((Object) (s))) && !"MP3Decoder".equals(((Object) (s)))) goto _L4; else goto _L3
_L4:
		if(bnw.a >= 18 || !"OMX.SEC.MP3.Decoder".equals(((Object) (s)))) goto _L6; else goto _L5
_L5:
		i = 0;
		  goto _L7
_L6:
		if(bnw.a >= 18 || !"OMX.MTK.AUDIO.DECODER.AAC".equals(((Object) (s))) || !"a70".equals(((Object) (bnw.b)))) goto _L9; else goto _L8
_L8:
		i = 0;
		  goto _L7
_L9:
		if(bnw.a != 16 || !"OMX.qcom.audio.decoder.mp3".equals(((Object) (s))) || !"dlxu".equals(((Object) (bnw.b))) && !"protou".equals(((Object) (bnw.b))) && !"ville".equals(((Object) (bnw.b))) && !"villeplus".equals(((Object) (bnw.b))) && !"villec2".equals(((Object) (bnw.b))) && !bnw.b.startsWith("gee") && !"C6602".equals(((Object) (bnw.b))) && !"C6603".equals(((Object) (bnw.b))) && !"C6606".equals(((Object) (bnw.b))) && !"C6616".equals(((Object) (bnw.b))) && !"L36h".equals(((Object) (bnw.b))) && !"SO-02E".equals(((Object) (bnw.b)))) goto _L11; else goto _L10
_L11:
		if(bnw.a != 16 || !"OMX.qcom.audio.decoder.aac".equals(((Object) (s))) || !"C1504".equals(((Object) (bnw.b))) && !"C1505".equals(((Object) (bnw.b))) && !"C1604".equals(((Object) (bnw.b))) && !"C1605".equals(((Object) (bnw.b)))) goto _L13; else goto _L12
_L13:
		if(bnw.a > 19 || !"OMX.SEC.vp8.dec".equals(((Object) (s))) || !"samsung".equals(((Object) (bnw.c))) || !bnw.b.startsWith("d2") && !bnw.b.startsWith("serrano") && !bnw.b.startsWith("jflte") && !bnw.b.startsWith("santos") && !bnw.b.startsWith("t0")) goto _L15; else goto _L14
_L15:
		if(bnw.a <= 19 && bnw.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(((Object) (s))))
			i = 0;
		else
	//* 404 1003:iconst_0        
	//* 405 1004:istore_2        
	//* 406 1005:goto            585
	//* 407 1008:iconst_0        
	//* 408 1009:istore_2        
	//* 409 1010:goto            585
	//* 410 1013:iconst_0        
	//* 411 1014:istore_2        
	//* 412 1015:goto            585
	//* 413 1018:iconst_0        
	//* 414 1019:istore_2        
	//* 415 1020:goto            585
			i = 1;
	//  416 1023:iconst_1        
	//  417 1024:istore_2        
_L7:
		if(i == 0)
			continue; /* Loop/switch isn't completed */
		as = mediacodecinfo.getSupportedTypes();
		l = as.length;
		i = 0;
_L18:
		if(i >= l) goto _L17; else goto _L16
_L16:
		s2 = as[i];
		flag = s2.equalsIgnoreCase(s1);
		if(!flag)
			continue; /* Loop/switch isn't completed */
		codeccapabilities = mediacodecinfo.getCapabilitiesForType(s2);
		flag3 = bhw1.a(s1, codeccapabilities);
		boolean flag1;
		if(bnw.a <= 22 && (bnw.d.equals("ODROID-XU3") || bnw.d.equals("Nexus 10")) && ("OMX.Exynos.AVC.Decoder".equals(((Object) (s))) || "OMX.Exynos.AVC.Decoder.secure".equals(((Object) (s)))))
	//* 418 1025:goto            585
	//* 419 1028:iconst_0        
	//* 420 1029:istore_2        
	//* 421 1030:goto            585
			flag1 = true;
	//  422 1033:iconst_1        
	//  423 1034:istore          6
		else
	//* 424 1036:goto            707
			flag1 = false;
	//  425 1039:iconst_0        
	//  426 1040:istore          6
		if(!flag2)
			break MISSING_BLOCK_LABEL_724;
		if(bht1.b == flag3)
			break MISSING_BLOCK_LABEL_739;
		if(flag2)
			break MISSING_BLOCK_LABEL_762;
		if(bht1.b)
			break MISSING_BLOCK_LABEL_762;
		try
		{
			((List) (arraylist)).add(((Object) (bhm.a(s, s1, codeccapabilities, flag1, false))));
			continue; /* Loop/switch isn't completed */
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		break MISSING_BLOCK_LABEL_818;
		if(flag2 || !flag3)
			continue; /* Loop/switch isn't completed */
		s3 = String.valueOf(((Object) (s))).concat(".secure");
		((List) (arraylist)).add(((Object) (bhm.a(s3, s1, codeccapabilities, flag1, true))));
		return ((List) (arraylist));
		obj;
		if(bnw.a <= 23 && !((List) (arraylist)).isEmpty())
		{
			obj = ((Object) (new StringBuilder(String.valueOf(((Object) (s))).length() + 46)));
			((StringBuilder) (obj)).append("Skipping codec ");
			((StringBuilder) (obj)).append(s);
			((StringBuilder) (obj)).append(" (failed to query capabilities)");
			Log.e("MediaCodecUtil", ((StringBuilder) (obj)).toString());
			continue; /* Loop/switch isn't completed */
		}
		bht1 = ((bht) (new StringBuilder(String.valueOf(((Object) (s))).length() + 25 + String.valueOf(((Object) (s2))).length())));
		((StringBuilder) (bht1)).append("Failed to query codec ");
		((StringBuilder) (bht1)).append(s);
		((StringBuilder) (bht1)).append(" (");
		((StringBuilder) (bht1)).append(s2);
		((StringBuilder) (bht1)).append(")");
		Log.e("MediaCodecUtil", ((StringBuilder) (bht1)).toString());
		throw obj;
		i++;
		  goto _L18
_L17:
		j++;
		break MISSING_BLOCK_LABEL_33;
_L2:
		return ((List) (arraylist));
_L3:
		i = 0;
		continue; /* Loop/switch isn't completed */
_L10:
		i = 0;
		continue; /* Loop/switch isn't completed */
_L12:
		i = 0;
		continue; /* Loop/switch isn't completed */
_L14:
		i = 0;
		continue; /* Loop/switch isn't completed */
		i = 0;
		if(true) goto _L7; else goto _L19
_L19:
	//* 427 1042:goto            707
	//* 428 1045:goto            739
	}

	public static int b()
	{
		if(g == -1)
	//*   0    0:getstatic       #52  <Field int g>
	//*   1    3:iconst_m1       
	//*   2    4:icmpne          342
		{
			int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_0        
			int k = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
			bhm bhm1 = a("video/avc", false);
	//    7   11:ldc2            #442 <String "video/avc">
	//    8   14:iconst_0        
	//    9   15:invokestatic    #444 <Method bhm a(String, boolean)>
	//   10   18:astore          4
			if(bhm1 != null)
	//*  11   20:aload           4
	//*  12   22:ifnull          338
			{
				android.media.MediaCodecInfo.CodecProfileLevel acodecprofilelevel[] = bhm1.a();
	//   13   25:aload           4
	//   14   27:invokevirtual   #447 <Method android.media.MediaCodecInfo$CodecProfileLevel[] bhm.a()>
	//   15   30:astore          4
				int l = acodecprofilelevel.length;
	//   16   32:aload           4
	//   17   34:arraylength     
	//   18   35:istore_3        
				int j = 0;
	//   19   36:iconst_0        
	//   20   37:istore_1        
				for(; k < l; k++)
	//*  21   38:iload_2         
	//*  22   39:iload_3         
	//*  23   40:icmpge          313
				{
					switch(acodecprofilelevel[k].level)
	//*  24   43:aload           4
	//*  25   45:iload_2         
	//*  26   46:aaload          
	//*  27   47:getfield        #452 <Field int android.media.MediaCodecInfo$CodecProfileLevel.level>
					{
	//*  28   50:lookupswitch    16: default 188
	//	               1: 296
	//	               2: 289
	//	               8: 282
	//	               16: 275
	//	               32: 268
	//	               64: 261
	//	               128: 254
	//	               256: 247
	//	               512: 240
	//	               1024: 233
	//	               2048: 227
	//	               4096: 221
	//	               8192: 214
	//	               16384: 207
	//	               32768: 200
	//	               65536: 193
					default:
						i = -1;
	//   29  188:iconst_m1       
	//   30  189:istore_0        
						break;

	//*  31  190:goto            300
					case 65536: 
						i = 0x900000;
	//   32  193:ldc2            #453 <Int 0x900000>
	//   33  196:istore_0        
						break;

	//*  34  197:goto            300
					case 32768: 
						i = 0x900000;
	//   35  200:ldc2            #453 <Int 0x900000>
	//   36  203:istore_0        
						break;

	//*  37  204:goto            300
					case 16384: 
						i = 0x564000;
	//   38  207:ldc2            #454 <Int 0x564000>
	//   39  210:istore_0        
						break;

	//*  40  211:goto            300
					case 8192: 
						i = 0x220000;
	//   41  214:ldc2            #455 <Int 0x220000>
	//   42  217:istore_0        
						break;

	//*  43  218:goto            300
					case 4096: 
						i = 0x200000;
	//   44  221:ldc1            #133 <Int 0x200000>
	//   45  223:istore_0        
						break;

	//*  46  224:goto            300
					case 2048: 
						i = 0x200000;
	//   47  227:ldc1            #133 <Int 0x200000>
	//   48  229:istore_0        
						break;

	//*  49  230:goto            300
					case 1024: 
						i = 0x140000;
	//   50  233:ldc2            #456 <Int 0x140000>
	//   51  236:istore_0        
						break;

	//*  52  237:goto            300
					case 512: 
						i = 0xe1000;
	//   53  240:ldc2            #457 <Int 0xe1000>
	//   54  243:istore_0        
						break;

	//*  55  244:goto            300
					case 256: 
						i = 0x65400;
	//   56  247:ldc2            #458 <Int 0x65400>
	//   57  250:istore_0        
						break;

	//*  58  251:goto            300
					case 128: 
						i = 0x65400;
	//   59  254:ldc2            #458 <Int 0x65400>
	//   60  257:istore_0        
						break;

	//*  61  258:goto            300
					case 64: // '@'
						i = 0x31800;
	//   62  261:ldc2            #459 <Int 0x31800>
	//   63  264:istore_0        
						break;

	//*  64  265:goto            300
					case 32: // ' '
						i = 0x18c00;
	//   65  268:ldc2            #460 <Int 0x18c00>
	//   66  271:istore_0        
						break;

	//*  67  272:goto            300
					case 16: // '\020'
						i = 0x18c00;
	//   68  275:ldc2            #460 <Int 0x18c00>
	//   69  278:istore_0        
						break;

	//*  70  279:goto            300
					case 8: // '\b'
						i = 0x18c00;
	//   71  282:ldc2            #460 <Int 0x18c00>
	//   72  285:istore_0        
						break;

	//*  73  286:goto            300
					case 2: // '\002'
						i = 25344;
	//   74  289:sipush          25344
	//   75  292:istore_0        
						break;

	//*  76  293:goto            300
					case 1: // '\001'
						i = 25344;
	//   77  296:sipush          25344
	//   78  299:istore_0        
						break;
					}
					j = Math.max(i, j);
	//   79  300:iload_0         
	//   80  301:iload_1         
	//   81  302:invokestatic    #466 <Method int Math.max(int, int)>
	//   82  305:istore_1        
				}

	//   83  306:iload_2         
	//   84  307:iconst_1        
	//   85  308:iadd            
	//   86  309:istore_2        
	//*  87  310:goto            38
				if(bnw.a >= 21)
	//*  88  313:getstatic       #313 <Field int bnw.a>
	//*  89  316:bipush          21
	//*  90  318:icmplt          328
					i = 0x54600;
	//   91  321:ldc2            #467 <Int 0x54600>
	//   92  324:istore_0        
				else
	//*  93  325:goto            332
					i = 0x2a300;
	//   94  328:ldc2            #468 <Int 0x2a300>
	//   95  331:istore_0        
				i = Math.max(j, i);
	//   96  332:iload_1         
	//   97  333:iload_0         
	//   98  334:invokestatic    #466 <Method int Math.max(int, int)>
	//   99  337:istore_0        
			}
			g = i;
	//  100  338:iload_0         
	//  101  339:putstatic       #52  <Field int g>
		}
		return g;
	//  102  342:getstatic       #52  <Field int g>
	//  103  345:ireturn         
	}

	private static List b(String s, boolean flag)
	{
		com/google/android/gms/internal/ads/bhs;
	//    0    0:ldc1            #2   <Class bhs>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Object obj;
		bht bht1;
		bht1 = new bht(s, flag);
	//    2    3:new             #283 <Class bht>
	//    3    6:dup             
	//    4    7:aload_0         
	//    5    8:iload_1         
	//    6    9:invokespecial   #471 <Method void bht(String, boolean)>
	//    7   12:astore          4
		obj = ((Object) ((List)c.get(((Object) (bht1)))));
	//    8   14:getstatic       #50  <Field HashMap c>
	//    9   17:aload           4
	//   10   19:invokevirtual   #472 <Method Object HashMap.get(Object)>
	//   11   22:checkcast       #269 <Class List>
	//   12   25:astore_2        
		if(obj == null)
			break MISSING_BLOCK_LABEL_35;
	//   13   26:aload_2         
	//   14   27:ifnull          35
		com/google/android/gms/internal/ads/bhs;
	//   15   30:ldc1            #2   <Class bhs>
		JVM INSTR monitorexit ;
	//   16   32:monitorexit     
		return ((List) (obj));
	//   17   33:aload_2         
	//   18   34:areturn         
		if(bnw.a >= 21)
	//*  19   35:getstatic       #313 <Field int bnw.a>
	//*  20   38:bipush          21
	//*  21   40:icmplt          55
		{
			obj = ((Object) (new bhy(flag)));
	//   22   43:new             #474 <Class bhy>
	//   23   46:dup             
	//   24   47:iload_1         
	//   25   48:invokespecial   #477 <Method void bhy(boolean)>
	//   26   51:astore_2        
			break MISSING_BLOCK_LABEL_64;
	//   27   52:goto            64
		}
		obj = ((Object) (new bhx(((bhu) (null)))));
	//   28   55:new             #479 <Class bhx>
	//   29   58:dup             
	//   30   59:aconst_null     
	//   31   60:invokespecial   #482 <Method void bhx(bhu)>
	//   32   63:astore_2        
		List list = a(bht1, ((bhw) (obj)));
	//   33   64:aload           4
	//   34   66:aload_2         
	//   35   67:invokestatic    #484 <Method List a(bht, bhw)>
	//   36   70:astore_3        
		obj = ((Object) (list));
	//   37   71:aload_3         
	//   38   72:astore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_219;
	//   39   73:iload_1         
	//   40   74:ifeq            219
		obj = ((Object) (list));
	//   41   77:aload_3         
	//   42   78:astore_2        
		if(!list.isEmpty())
			break MISSING_BLOCK_LABEL_219;
	//   43   79:aload_3         
	//   44   80:invokeinterface #272 <Method boolean List.isEmpty()>
	//   45   85:ifeq            219
		obj = ((Object) (list));
	//   46   88:aload_3         
	//   47   89:astore_2        
		if(21 > bnw.a)
			break MISSING_BLOCK_LABEL_219;
	//   48   90:bipush          21
	//   49   92:getstatic       #313 <Field int bnw.a>
	//   50   95:icmpgt          219
		obj = ((Object) (list));
	//   51   98:aload_3         
	//   52   99:astore_2        
		if(bnw.a > 23)
			break MISSING_BLOCK_LABEL_219;
	//   53  100:getstatic       #313 <Field int bnw.a>
	//   54  103:bipush          23
	//   55  105:icmpgt          219
		list = a(bht1, ((bhw) (new bhx(((bhu) (null))))));
	//   56  108:aload           4
	//   57  110:new             #479 <Class bhx>
	//   58  113:dup             
	//   59  114:aconst_null     
	//   60  115:invokespecial   #482 <Method void bhx(bhu)>
	//   61  118:invokestatic    #484 <Method List a(bht, bhw)>
	//   62  121:astore_3        
		obj = ((Object) (list));
	//   63  122:aload_3         
	//   64  123:astore_2        
		if(list.isEmpty())
			break MISSING_BLOCK_LABEL_219;
	//   65  124:aload_3         
	//   66  125:invokeinterface #272 <Method boolean List.isEmpty()>
	//   67  130:ifne            219
		obj = ((Object) (((bhm)list.get(0)).a));
	//   68  133:aload_3         
	//   69  134:iconst_0        
	//   70  135:invokeinterface #275 <Method Object List.get(int)>
	//   71  140:checkcast       #28  <Class bhm>
	//   72  143:getfield        #485 <Field String bhm.a>
	//   73  146:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 63 + String.valueOf(obj).length());
	//   74  147:new             #247 <Class StringBuilder>
	//   75  150:dup             
	//   76  151:aload_0         
	//   77  152:invokestatic    #171 <Method String String.valueOf(Object)>
	//   78  155:invokevirtual   #174 <Method int String.length()>
	//   79  158:bipush          63
	//   80  160:iadd            
	//   81  161:aload_2         
	//   82  162:invokestatic    #171 <Method String String.valueOf(Object)>
	//   83  165:invokevirtual   #174 <Method int String.length()>
	//   84  168:iadd            
	//   85  169:invokespecial   #250 <Method void StringBuilder(int)>
	//   86  172:astore          5
		stringbuilder.append("MediaCodecList API didn't list secure decoder for: ");
	//   87  174:aload           5
	//   88  176:ldc2            #487 <String "MediaCodecList API didn't list secure decoder for: ">
	//   89  179:invokevirtual   #256 <Method StringBuilder StringBuilder.append(String)>
	//   90  182:pop             
		stringbuilder.append(s);
	//   91  183:aload           5
	//   92  185:aload_0         
	//   93  186:invokevirtual   #256 <Method StringBuilder StringBuilder.append(String)>
	//   94  189:pop             
		stringbuilder.append(". Assuming: ");
	//   95  190:aload           5
	//   96  192:ldc2            #489 <String ". Assuming: ">
	//   97  195:invokevirtual   #256 <Method StringBuilder StringBuilder.append(String)>
	//   98  198:pop             
		stringbuilder.append(((String) (obj)));
	//   99  199:aload           5
	//  100  201:aload_2         
	//  101  202:invokevirtual   #256 <Method StringBuilder StringBuilder.append(String)>
	//  102  205:pop             
		Log.w("MediaCodecUtil", stringbuilder.toString());
	//  103  206:ldc1            #185 <String "MediaCodecUtil">
	//  104  208:aload           5
	//  105  210:invokevirtual   #260 <Method String StringBuilder.toString()>
	//  106  213:invokestatic    #191 <Method int Log.w(String, String)>
	//  107  216:pop             
		obj = ((Object) (list));
	//  108  217:aload_3         
	//  109  218:astore_2        
		s = ((String) (Collections.unmodifiableList(((List) (obj)))));
	//  110  219:aload_2         
	//  111  220:invokestatic    #495 <Method List Collections.unmodifiableList(List)>
	//  112  223:astore_0        
		c.put(((Object) (bht1)), ((Object) (s)));
	//  113  224:getstatic       #50  <Field HashMap c>
	//  114  227:aload           4
	//  115  229:aload_0         
	//  116  230:invokevirtual   #496 <Method Object HashMap.put(Object, Object)>
	//  117  233:pop             
		com/google/android/gms/internal/ads/bhs;
	//  118  234:ldc1            #2   <Class bhs>
		JVM INSTR monitorexit ;
	//  119  236:monitorexit     
		return ((List) (s));
	//  120  237:aload_0         
	//  121  238:areturn         
		s;
	//  122  239:astore_0        
	//* 123  240:ldc1            #2   <Class bhs>
		throw s;
	//  124  242:monitorexit     
	//  125  243:aload_0         
	//  126  244:athrow          
	}

	private static final bhm a = bhm.a("OMX.google.raw.decoder");
	private static final Pattern b = Pattern.compile("^\\D?(\\d+)$");
	private static final HashMap c = new HashMap();
	private static final SparseIntArray d;
	private static final SparseIntArray e;
	private static final Map f;
	private static int g = -1;

	static 
	{
	//    0    0:ldc1            #26  <String "OMX.google.raw.decoder">
	//    1    2:invokestatic    #31  <Method bhm bhm.a(String)>
	//    2    5:putstatic       #33  <Field bhm a>
	//    3    8:ldc1            #35  <String "^\\D?(\\d+)$">
	//    4   10:invokestatic    #41  <Method Pattern Pattern.compile(String)>
	//    5   13:putstatic       #43  <Field Pattern b>
	//    6   16:new             #45  <Class HashMap>
	//    7   19:dup             
	//    8   20:invokespecial   #48  <Method void HashMap()>
	//    9   23:putstatic       #50  <Field HashMap c>
	//   10   26:iconst_m1       
	//   11   27:putstatic       #52  <Field int g>
		Object obj = ((Object) (new SparseIntArray()));
	//   12   30:new             #54  <Class SparseIntArray>
	//   13   33:dup             
	//   14   34:invokespecial   #55  <Method void SparseIntArray()>
	//   15   37:astore_0        
		d = ((SparseIntArray) (obj));
	//   16   38:aload_0         
	//   17   39:putstatic       #57  <Field SparseIntArray d>
		((SparseIntArray) (obj)).put(66, 1);
	//   18   42:aload_0         
	//   19   43:bipush          66
	//   20   45:iconst_1        
	//   21   46:invokevirtual   #61  <Method void SparseIntArray.put(int, int)>
		d.put(77, 2);
	//   22   49:getstatic       #57  <Field SparseIntArray d>
	//   23   52:bipush          77
	//   24   54:iconst_2        
	//   25   55:invokevirtual   #61  <Method void SparseIntArray.put(int, int)>
		d.put(88, 4);
	//   26   58:getstatic       #57  <Field SparseIntArray d>
	//   27   61:bipush          88
	//   28   63:iconst_4        
	//   29   64:invokevirtual   #61  <Method void SparseIntArray.put(int, int)>
		d.put(100, 8);
	//   30   67:getstatic       #57  <Field SparseIntArray d>
	//   31   70:bipush          100
	//   32   72:bipush          8
	//   33   74:invokevirtual   #61  <Method void SparseIntArray.put(int, int)>
		obj = ((Object) (new SparseIntArray()));
	//   34   77:new             #54  <Class SparseIntArray>
	//   35   80:dup             
	//   36   81:invokespecial   #55  <Method void SparseIntArray()>
	//   37   84:astore_0        
		e = ((SparseIntArray) (obj));
	//   38   85:aload_0         
	//   39   86:putstatic       #63  <Field SparseIntArray e>
		((SparseIntArray) (obj)).put(10, 1);
	//   40   89:aload_0         
	//   41   90:bipush          10
	//   42   92:iconst_1        
	//   43   93:invokevirtual   #61  <Method void SparseIntArray.put(int, int)>
		e.put(11, 4);
	//   44   96:getstatic       #63  <Field SparseIntArray e>
	//   45   99:bipush          11
	//   46  101:iconst_4        
	//   47  102:invokevirtual   #61  <Method void SparseIntArray.put(int, int)>
		e.put(12, 8);
	//   48  105:getstatic       #63  <Field SparseIntArray e>
	//   49  108:bipush          12
	//   50  110:bipush          8
	//   51  112:invokevirtual   #61  <Method void SparseIntArray.put(int, int)>
		e.put(13, 16);
	//   52  115:getstatic       #63  <Field SparseIntArray e>
	//   53  118:bipush          13
	//   54  120:bipush          16
	//   55  122:invokevirtual   #61  <Method void SparseIntArray.put(int, int)>
		e.put(20, 32);
	//   56  125:getstatic       #63  <Field SparseIntArray e>
	//   57  128:bipush          20
	//   58  130:bipush          32
	//   59  132:invokevirtual   #61  <Method void SparseIntArray.put(int, int)>
		e.put(21, 64);
	//   60  135:getstatic       #63  <Field SparseIntArray e>
	//   61  138:bipush          21
	//   62  140:bipush          64
	//   63  142:invokevirtual   #61  <Method void SparseIntArray.put(int, int)>
		e.put(22, 128);
	//   64  145:getstatic       #63  <Field SparseIntArray e>
	//   65  148:bipush          22
	//   66  150:sipush          128
	//   67  153:invokevirtual   #61  <Method void SparseIntArray.put(int, int)>
		e.put(30, 256);
	//   68  156:getstatic       #63  <Field SparseIntArray e>
	//   69  159:bipush          30
	//   70  161:sipush          256
	//   71  164:invokevirtual   #61  <Method void SparseIntArray.put(int, int)>
		e.put(31, 512);
	//   72  167:getstatic       #63  <Field SparseIntArray e>
	//   73  170:bipush          31
	//   74  172:sipush          512
	//   75  175:invokevirtual   #61  <Method void SparseIntArray.put(int, int)>
		e.put(32, 1024);
	//   76  178:getstatic       #63  <Field SparseIntArray e>
	//   77  181:bipush          32
	//   78  183:sipush          1024
	//   79  186:invokevirtual   #61  <Method void SparseIntArray.put(int, int)>
		e.put(40, 2048);
	//   80  189:getstatic       #63  <Field SparseIntArray e>
	//   81  192:bipush          40
	//   82  194:sipush          2048
	//   83  197:invokevirtual   #61  <Method void SparseIntArray.put(int, int)>
		e.put(41, 4096);
	//   84  200:getstatic       #63  <Field SparseIntArray e>
	//   85  203:bipush          41
	//   86  205:sipush          4096
	//   87  208:invokevirtual   #61  <Method void SparseIntArray.put(int, int)>
		e.put(42, 8192);
	//   88  211:getstatic       #63  <Field SparseIntArray e>
	//   89  214:bipush          42
	//   90  216:sipush          8192
	//   91  219:invokevirtual   #61  <Method void SparseIntArray.put(int, int)>
		e.put(50, 16384);
	//   92  222:getstatic       #63  <Field SparseIntArray e>
	//   93  225:bipush          50
	//   94  227:sipush          16384
	//   95  230:invokevirtual   #61  <Method void SparseIntArray.put(int, int)>
		e.put(51, 32768);
	//   96  233:getstatic       #63  <Field SparseIntArray e>
	//   97  236:bipush          51
	//   98  238:ldc1            #64  <Int 32768>
	//   99  240:invokevirtual   #61  <Method void SparseIntArray.put(int, int)>
		e.put(52, 0x10000);
	//  100  243:getstatic       #63  <Field SparseIntArray e>
	//  101  246:bipush          52
	//  102  248:ldc1            #65  <Int 0x10000>
	//  103  250:invokevirtual   #61  <Method void SparseIntArray.put(int, int)>
		obj = ((Object) (new HashMap()));
	//  104  253:new             #45  <Class HashMap>
	//  105  256:dup             
	//  106  257:invokespecial   #48  <Method void HashMap()>
	//  107  260:astore_0        
		f = ((Map) (obj));
	//  108  261:aload_0         
	//  109  262:putstatic       #67  <Field Map f>
		((Map) (obj)).put("L30", ((Object) (Integer.valueOf(1))));
	//  110  265:aload_0         
	//  111  266:ldc1            #69  <String "L30">
	//  112  268:iconst_1        
	//  113  269:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  114  272:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  115  277:pop             
		f.put("L60", ((Object) (Integer.valueOf(4))));
	//  116  278:getstatic       #67  <Field Map f>
	//  117  281:ldc1            #82  <String "L60">
	//  118  283:iconst_4        
	//  119  284:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  120  287:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  121  292:pop             
		f.put("L63", ((Object) (Integer.valueOf(16))));
	//  122  293:getstatic       #67  <Field Map f>
	//  123  296:ldc1            #84  <String "L63">
	//  124  298:bipush          16
	//  125  300:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  126  303:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  127  308:pop             
		f.put("L90", ((Object) (Integer.valueOf(64))));
	//  128  309:getstatic       #67  <Field Map f>
	//  129  312:ldc1            #86  <String "L90">
	//  130  314:bipush          64
	//  131  316:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  132  319:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  133  324:pop             
		f.put("L93", ((Object) (Integer.valueOf(256))));
	//  134  325:getstatic       #67  <Field Map f>
	//  135  328:ldc1            #88  <String "L93">
	//  136  330:sipush          256
	//  137  333:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  138  336:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  139  341:pop             
		f.put("L120", ((Object) (Integer.valueOf(1024))));
	//  140  342:getstatic       #67  <Field Map f>
	//  141  345:ldc1            #90  <String "L120">
	//  142  347:sipush          1024
	//  143  350:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  144  353:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  145  358:pop             
		f.put("L123", ((Object) (Integer.valueOf(4096))));
	//  146  359:getstatic       #67  <Field Map f>
	//  147  362:ldc1            #92  <String "L123">
	//  148  364:sipush          4096
	//  149  367:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  150  370:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  151  375:pop             
		f.put("L150", ((Object) (Integer.valueOf(16384))));
	//  152  376:getstatic       #67  <Field Map f>
	//  153  379:ldc1            #94  <String "L150">
	//  154  381:sipush          16384
	//  155  384:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  156  387:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  157  392:pop             
		f.put("L153", ((Object) (Integer.valueOf(0x10000))));
	//  158  393:getstatic       #67  <Field Map f>
	//  159  396:ldc1            #96  <String "L153">
	//  160  398:ldc1            #65  <Int 0x10000>
	//  161  400:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  162  403:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  163  408:pop             
		f.put("L156", ((Object) (Integer.valueOf(0x40000))));
	//  164  409:getstatic       #67  <Field Map f>
	//  165  412:ldc1            #98  <String "L156">
	//  166  414:ldc1            #99  <Int 0x40000>
	//  167  416:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  168  419:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  169  424:pop             
		f.put("L180", ((Object) (Integer.valueOf(0x100000))));
	//  170  425:getstatic       #67  <Field Map f>
	//  171  428:ldc1            #101 <String "L180">
	//  172  430:ldc1            #102 <Int 0x100000>
	//  173  432:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  174  435:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  175  440:pop             
		f.put("L183", ((Object) (Integer.valueOf(0x400000))));
	//  176  441:getstatic       #67  <Field Map f>
	//  177  444:ldc1            #104 <String "L183">
	//  178  446:ldc1            #105 <Int 0x400000>
	//  179  448:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  180  451:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  181  456:pop             
		f.put("L186", ((Object) (Integer.valueOf(0x1000000))));
	//  182  457:getstatic       #67  <Field Map f>
	//  183  460:ldc1            #107 <String "L186">
	//  184  462:ldc1            #108 <Int 0x1000000>
	//  185  464:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  186  467:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  187  472:pop             
		f.put("H30", ((Object) (Integer.valueOf(2))));
	//  188  473:getstatic       #67  <Field Map f>
	//  189  476:ldc1            #110 <String "H30">
	//  190  478:iconst_2        
	//  191  479:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  192  482:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  193  487:pop             
		f.put("H60", ((Object) (Integer.valueOf(8))));
	//  194  488:getstatic       #67  <Field Map f>
	//  195  491:ldc1            #112 <String "H60">
	//  196  493:bipush          8
	//  197  495:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  198  498:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  199  503:pop             
		f.put("H63", ((Object) (Integer.valueOf(32))));
	//  200  504:getstatic       #67  <Field Map f>
	//  201  507:ldc1            #114 <String "H63">
	//  202  509:bipush          32
	//  203  511:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  204  514:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  205  519:pop             
		f.put("H90", ((Object) (Integer.valueOf(128))));
	//  206  520:getstatic       #67  <Field Map f>
	//  207  523:ldc1            #116 <String "H90">
	//  208  525:sipush          128
	//  209  528:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  210  531:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  211  536:pop             
		f.put("H93", ((Object) (Integer.valueOf(512))));
	//  212  537:getstatic       #67  <Field Map f>
	//  213  540:ldc1            #118 <String "H93">
	//  214  542:sipush          512
	//  215  545:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  216  548:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  217  553:pop             
		f.put("H120", ((Object) (Integer.valueOf(2048))));
	//  218  554:getstatic       #67  <Field Map f>
	//  219  557:ldc1            #120 <String "H120">
	//  220  559:sipush          2048
	//  221  562:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  222  565:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  223  570:pop             
		f.put("H123", ((Object) (Integer.valueOf(8192))));
	//  224  571:getstatic       #67  <Field Map f>
	//  225  574:ldc1            #122 <String "H123">
	//  226  576:sipush          8192
	//  227  579:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  228  582:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  229  587:pop             
		f.put("H150", ((Object) (Integer.valueOf(32768))));
	//  230  588:getstatic       #67  <Field Map f>
	//  231  591:ldc1            #124 <String "H150">
	//  232  593:ldc1            #64  <Int 32768>
	//  233  595:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  234  598:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  235  603:pop             
		f.put("H153", ((Object) (Integer.valueOf(0x20000))));
	//  236  604:getstatic       #67  <Field Map f>
	//  237  607:ldc1            #126 <String "H153">
	//  238  609:ldc1            #127 <Int 0x20000>
	//  239  611:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  240  614:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  241  619:pop             
		f.put("H156", ((Object) (Integer.valueOf(0x80000))));
	//  242  620:getstatic       #67  <Field Map f>
	//  243  623:ldc1            #129 <String "H156">
	//  244  625:ldc1            #130 <Int 0x80000>
	//  245  627:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  246  630:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  247  635:pop             
		f.put("H180", ((Object) (Integer.valueOf(0x200000))));
	//  248  636:getstatic       #67  <Field Map f>
	//  249  639:ldc1            #132 <String "H180">
	//  250  641:ldc1            #133 <Int 0x200000>
	//  251  643:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  252  646:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  253  651:pop             
		f.put("H183", ((Object) (Integer.valueOf(0x800000))));
	//  254  652:getstatic       #67  <Field Map f>
	//  255  655:ldc1            #135 <String "H183">
	//  256  657:ldc1            #136 <Int 0x800000>
	//  257  659:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  258  662:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  259  667:pop             
		f.put("H186", ((Object) (Integer.valueOf(0x2000000))));
	//  260  668:getstatic       #67  <Field Map f>
	//  261  671:ldc1            #138 <String "H186">
	//  262  673:ldc1            #139 <Int 0x2000000>
	//  263  675:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  264  678:invokeinterface #80  <Method Object Map.put(Object, Object)>
	//  265  683:pop             
	//* 266  684:return          
	}
}
