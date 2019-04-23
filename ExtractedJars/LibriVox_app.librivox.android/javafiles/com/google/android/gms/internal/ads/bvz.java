// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.n;

public final class bvz
{

	public bvz(Context context, AttributeSet attributeset)
	{
		boolean flag;
label0:
		{
			super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
			context = ((Context) (context.getResources().obtainAttributes(attributeset, n.AdsAttrs)));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #20  <Method Resources Context.getResources()>
	//    4    8:aload_2         
	//    5    9:getstatic       #26  <Field int[] n.AdsAttrs>
	//    6   12:invokevirtual   #32  <Method TypedArray Resources.obtainAttributes(AttributeSet, int[])>
	//    7   15:astore_1        
			attributeset = ((AttributeSet) (((TypedArray) (context)).getString(n.AdsAttrs_adSize)));
	//    8   16:aload_1         
	//    9   17:getstatic       #36  <Field int n.AdsAttrs_adSize>
	//   10   20:invokevirtual   #42  <Method String TypedArray.getString(int)>
	//   11   23:astore_2        
			String s = ((TypedArray) (context)).getString(n.AdsAttrs_adSizes);
	//   12   24:aload_1         
	//   13   25:getstatic       #45  <Field int n.AdsAttrs_adSizes>
	//   14   28:invokevirtual   #42  <Method String TypedArray.getString(int)>
	//   15   31:astore          5
			flag = TextUtils.isEmpty(((CharSequence) (attributeset))) ^ true;
	//   16   33:aload_2         
	//   17   34:invokestatic    #51  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   18   37:iconst_1        
	//   19   38:ixor            
	//   20   39:istore_3        
			boolean flag1 = TextUtils.isEmpty(((CharSequence) (s))) ^ true;
	//   21   40:aload           5
	//   22   42:invokestatic    #51  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   23   45:iconst_1        
	//   24   46:ixor            
	//   25   47:istore          4
			if(flag && !flag1)
	//*  26   49:iload_3         
	//*  27   50:ifeq            69
	//*  28   53:iload           4
	//*  29   55:ifne            69
			{
				a = a(((String) (attributeset)));
	//   30   58:aload_0         
	//   31   59:aload_2         
	//   32   60:invokestatic    #54  <Method f[] a(String)>
	//   33   63:putfield        #56  <Field f[] a>
			} else
	//*  34   66:goto            87
			{
				if(flag || !flag1)
					break label0;
	//   35   69:iload_3         
	//   36   70:ifne            119
	//   37   73:iload           4
	//   38   75:ifeq            119
				a = a(s);
	//   39   78:aload_0         
	//   40   79:aload           5
	//   41   81:invokestatic    #54  <Method f[] a(String)>
	//   42   84:putfield        #56  <Field f[] a>
			}
			b = ((TypedArray) (context)).getString(n.AdsAttrs_adUnitId);
	//   43   87:aload_0         
	//   44   88:aload_1         
	//   45   89:getstatic       #59  <Field int n.AdsAttrs_adUnitId>
	//   46   92:invokevirtual   #42  <Method String TypedArray.getString(int)>
	//   47   95:putfield        #61  <Field String b>
			if(!TextUtils.isEmpty(((CharSequence) (b))))
	//*  48   98:aload_0         
	//*  49   99:getfield        #61  <Field String b>
	//*  50  102:invokestatic    #51  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  51  105:ifne            109
				return;
	//   52  108:return          
			else
				throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
	//   53  109:new             #63  <Class IllegalArgumentException>
	//   54  112:dup             
	//   55  113:ldc1            #65  <String "Required XML attribute \"adUnitId\" was missing.">
	//   56  115:invokespecial   #68  <Method void IllegalArgumentException(String)>
	//   57  118:athrow          
		}
		if(flag)
	//*  58  119:iload_3         
	//*  59  120:ifeq            133
			throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
	//   60  123:new             #63  <Class IllegalArgumentException>
	//   61  126:dup             
	//   62  127:ldc1            #70  <String "Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.">
	//   63  129:invokespecial   #68  <Method void IllegalArgumentException(String)>
	//   64  132:athrow          
		else
			throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
	//   65  133:new             #63  <Class IllegalArgumentException>
	//   66  136:dup             
	//   67  137:ldc1            #72  <String "Required XML attribute \"adSize\" was missing.">
	//   68  139:invokespecial   #68  <Method void IllegalArgumentException(String)>
	//   69  142:athrow          
	}

	private static f[] a(String s)
	{
		int i;
		String as[];
		f af[];
		as = s.split("\\s*,\\s*");
	//    0    0:aload_0         
	//    1    1:ldc1            #77  <String "\\s*,\\s*">
	//    2    3:invokevirtual   #83  <Method String[] String.split(String)>
	//    3    6:astore          5
		af = new f[as.length];
	//    4    8:aload           5
	//    5   10:arraylength     
	//    6   11:anewarray       f[]
	//    7   14:astore          6
		i = 0;
	//    8   16:iconst_0        
	//    9   17:istore_1        
_L2:
		String s1;
		String as1[];
		if(i >= as.length)
			break MISSING_BLOCK_LABEL_410;
	//   10   18:iload_1         
	//   11   19:aload           5
	//   12   21:arraylength     
	//   13   22:icmpge          410
		s1 = as[i].trim();
	//   14   25:aload           5
	//   15   27:iload_1         
	//   16   28:aaload          
	//   17   29:invokevirtual   #89  <Method String String.trim()>
	//   18   32:astore          4
		if(!s1.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$"))
			break MISSING_BLOCK_LABEL_184;
	//   19   34:aload           4
	//   20   36:ldc1            #91  <String "^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$">
	//   21   38:invokevirtual   #95  <Method boolean String.matches(String)>
	//   22   41:ifeq            184
		as1 = s1.split("[xX]");
	//   23   44:aload           4
	//   24   46:ldc1            #97  <String "[xX]">
	//   25   48:invokevirtual   #83  <Method String[] String.split(String)>
	//   26   51:astore          7
		as1[0] = as1[0].trim();
	//   27   53:aload           7
	//   28   55:iconst_0        
	//   29   56:aload           7
	//   30   58:iconst_0        
	//   31   59:aaload          
	//   32   60:invokevirtual   #89  <Method String String.trim()>
	//   33   63:aastore         
		as1[1] = as1[1].trim();
	//   34   64:aload           7
	//   35   66:iconst_1        
	//   36   67:aload           7
	//   37   69:iconst_1        
	//   38   70:aaload          
	//   39   71:invokevirtual   #89  <Method String String.trim()>
	//   40   74:aastore         
		int j;
		if("FULL_WIDTH".equals(((Object) (as1[0]))))
	//*  41   75:ldc1            #99  <String "FULL_WIDTH">
	//*  42   77:aload           7
	//*  43   79:iconst_0        
	//*  44   80:aaload          
	//*  45   81:invokevirtual   #103 <Method boolean String.equals(Object)>
	//*  46   84:ifeq            92
		{
			j = -1;
	//   47   87:iconst_m1       
	//   48   88:istore_2        
			break MISSING_BLOCK_LABEL_100;
	//   49   89:goto            100
		}
		j = Integer.parseInt(as1[0]);
	//   50   92:aload           7
	//   51   94:iconst_0        
	//   52   95:aaload          
	//   53   96:invokestatic    #109 <Method int Integer.parseInt(String)>
	//   54   99:istore_2        
		int k;
		if("AUTO_HEIGHT".equals(((Object) (as1[1]))))
	//*  55  100:ldc1            #111 <String "AUTO_HEIGHT">
	//*  56  102:aload           7
	//*  57  104:iconst_1        
	//*  58  105:aaload          
	//*  59  106:invokevirtual   #103 <Method boolean String.equals(Object)>
	//*  60  109:ifeq            118
			k = -2;
	//   61  112:bipush          -2
	//   62  114:istore_3        
		else
	//*  63  115:goto            126
			try
			{
				k = Integer.parseInt(as1[1]);
	//   64  118:aload           7
	//   65  120:iconst_1        
	//   66  121:aaload          
	//   67  122:invokestatic    #109 <Method int Integer.parseInt(String)>
	//   68  125:istore_3        
			}
	//*  69  126:aload           6
	//*  70  128:iload_1         
	//*  71  129:new             #85  <Class f>
	//*  72  132:dup             
	//*  73  133:iload_2         
	//*  74  134:iload_3         
	//*  75  135:invokespecial   #114 <Method void f(int, int)>
	//*  76  138:aastore         
	//*  77  139:goto            361
	//*  78  142:aload           4
	//*  79  144:invokestatic    #118 <Method String String.valueOf(Object)>
	//*  80  147:astore_0        
	//*  81  148:aload_0         
	//*  82  149:invokevirtual   #122 <Method int String.length()>
	//*  83  152:ifeq            165
	//*  84  155:ldc1            #124 <String "Could not parse XML attribute \"adSize\": ">
	//*  85  157:aload_0         
	//*  86  158:invokevirtual   #128 <Method String String.concat(String)>
	//*  87  161:astore_0        
	//*  88  162:goto            175
	//*  89  165:new             #79  <Class String>
	//*  90  168:dup             
	//*  91  169:ldc1            #124 <String "Could not parse XML attribute \"adSize\": ">
	//*  92  171:invokespecial   #129 <Method void String(String)>
	//*  93  174:astore_0        
	//*  94  175:new             #63  <Class IllegalArgumentException>
	//*  95  178:dup             
	//*  96  179:aload_0         
	//*  97  180:invokespecial   #68  <Method void IllegalArgumentException(String)>
	//*  98  183:athrow          
	//*  99  184:ldc1            #131 <String "BANNER">
	//* 100  186:aload           4
	//* 101  188:invokevirtual   #103 <Method boolean String.equals(Object)>
	//* 102  191:ifeq            204
	//* 103  194:aload           6
	//* 104  196:iload_1         
	//* 105  197:getstatic       #134 <Field f f.a>
	//* 106  200:aastore         
	//* 107  201:goto            361
	//* 108  204:ldc1            #136 <String "LARGE_BANNER">
	//* 109  206:aload           4
	//* 110  208:invokevirtual   #103 <Method boolean String.equals(Object)>
	//* 111  211:ifeq            224
	//* 112  214:aload           6
	//* 113  216:iload_1         
	//* 114  217:getstatic       #139 <Field f f.c>
	//* 115  220:aastore         
	//* 116  221:goto            361
	//* 117  224:ldc1            #141 <String "FULL_BANNER">
	//* 118  226:aload           4
	//* 119  228:invokevirtual   #103 <Method boolean String.equals(Object)>
	//* 120  231:ifeq            244
	//* 121  234:aload           6
	//* 122  236:iload_1         
	//* 123  237:getstatic       #143 <Field f f.b>
	//* 124  240:aastore         
	//* 125  241:goto            361
	//* 126  244:ldc1            #145 <String "LEADERBOARD">
	//* 127  246:aload           4
	//* 128  248:invokevirtual   #103 <Method boolean String.equals(Object)>
	//* 129  251:ifeq            264
	//* 130  254:aload           6
	//* 131  256:iload_1         
	//* 132  257:getstatic       #148 <Field f f.d>
	//* 133  260:aastore         
	//* 134  261:goto            361
	//* 135  264:ldc1            #150 <String "MEDIUM_RECTANGLE">
	//* 136  266:aload           4
	//* 137  268:invokevirtual   #103 <Method boolean String.equals(Object)>
	//* 138  271:ifeq            284
	//* 139  274:aload           6
	//* 140  276:iload_1         
	//* 141  277:getstatic       #153 <Field f f.e>
	//* 142  280:aastore         
	//* 143  281:goto            361
	//* 144  284:ldc1            #155 <String "SMART_BANNER">
	//* 145  286:aload           4
	//* 146  288:invokevirtual   #103 <Method boolean String.equals(Object)>
	//* 147  291:ifeq            304
	//* 148  294:aload           6
	//* 149  296:iload_1         
	//* 150  297:getstatic       #158 <Field f f.g>
	//* 151  300:aastore         
	//* 152  301:goto            361
	//* 153  304:ldc1            #160 <String "WIDE_SKYSCRAPER">
	//* 154  306:aload           4
	//* 155  308:invokevirtual   #103 <Method boolean String.equals(Object)>
	//* 156  311:ifeq            324
	//* 157  314:aload           6
	//* 158  316:iload_1         
	//* 159  317:getstatic       #163 <Field f f.f>
	//* 160  320:aastore         
	//* 161  321:goto            361
	//* 162  324:ldc1            #165 <String "FLUID">
	//* 163  326:aload           4
	//* 164  328:invokevirtual   #103 <Method boolean String.equals(Object)>
	//* 165  331:ifeq            344
	//* 166  334:aload           6
	//* 167  336:iload_1         
	//* 168  337:getstatic       #168 <Field f f.h>
	//* 169  340:aastore         
	//* 170  341:goto            361
	//* 171  344:ldc1            #170 <String "ICON">
	//* 172  346:aload           4
	//* 173  348:invokevirtual   #103 <Method boolean String.equals(Object)>
	//* 174  351:ifeq            368
	//* 175  354:aload           6
	//* 176  356:iload_1         
	//* 177  357:getstatic       #173 <Field f f.i>
	//* 178  360:aastore         
	//* 179  361:iload_1         
	//* 180  362:iconst_1        
	//* 181  363:iadd            
	//* 182  364:istore_1        
	//* 183  365:goto            18
	//* 184  368:aload           4
	//* 185  370:invokestatic    #118 <Method String String.valueOf(Object)>
	//* 186  373:astore_0        
	//* 187  374:aload_0         
	//* 188  375:invokevirtual   #122 <Method int String.length()>
	//* 189  378:ifeq            391
	//* 190  381:ldc1            #124 <String "Could not parse XML attribute \"adSize\": ">
	//* 191  383:aload_0         
	//* 192  384:invokevirtual   #128 <Method String String.concat(String)>
	//* 193  387:astore_0        
	//* 194  388:goto            401
	//* 195  391:new             #79  <Class String>
	//* 196  394:dup             
	//* 197  395:ldc1            #124 <String "Could not parse XML attribute \"adSize\": ">
	//* 198  397:invokespecial   #129 <Method void String(String)>
	//* 199  400:astore_0        
	//* 200  401:new             #63  <Class IllegalArgumentException>
	//* 201  404:dup             
	//* 202  405:aload_0         
	//* 203  406:invokespecial   #68  <Method void IllegalArgumentException(String)>
	//* 204  409:athrow          
	//* 205  410:aload           6
	//* 206  412:arraylength     
	//* 207  413:ifne            457
	//* 208  416:aload_0         
	//* 209  417:invokestatic    #118 <Method String String.valueOf(Object)>
	//* 210  420:astore_0        
	//* 211  421:aload_0         
	//* 212  422:invokevirtual   #122 <Method int String.length()>
	//* 213  425:ifeq            438
	//* 214  428:ldc1            #124 <String "Could not parse XML attribute \"adSize\": ">
	//* 215  430:aload_0         
	//* 216  431:invokevirtual   #128 <Method String String.concat(String)>
	//* 217  434:astore_0        
	//* 218  435:goto            448
	//* 219  438:new             #79  <Class String>
	//* 220  441:dup             
	//* 221  442:ldc1            #124 <String "Could not parse XML attribute \"adSize\": ">
	//* 222  444:invokespecial   #129 <Method void String(String)>
	//* 223  447:astore_0        
	//* 224  448:new             #63  <Class IllegalArgumentException>
	//* 225  451:dup             
	//* 226  452:aload_0         
	//* 227  453:invokespecial   #68  <Method void IllegalArgumentException(String)>
	//* 228  456:athrow          
	//* 229  457:aload           6
	//* 230  459:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				s = String.valueOf(((Object) (s1)));
				if(s.length() != 0)
					s = "Could not parse XML attribute \"adSize\": ".concat(s);
				else
					s = new String("Could not parse XML attribute \"adSize\": ");
				throw new IllegalArgumentException(s);
			}
		af[i] = new f(j, k);
		break MISSING_BLOCK_LABEL_361;
		if("BANNER".equals(((Object) (s1))))
			af[i] = f.a;
		else
		if("LARGE_BANNER".equals(((Object) (s1))))
			af[i] = f.c;
		else
		if("FULL_BANNER".equals(((Object) (s1))))
			af[i] = f.b;
		else
		if("LEADERBOARD".equals(((Object) (s1))))
			af[i] = f.d;
		else
		if("MEDIUM_RECTANGLE".equals(((Object) (s1))))
			af[i] = f.e;
		else
		if("SMART_BANNER".equals(((Object) (s1))))
			af[i] = f.g;
		else
		if("WIDE_SKYSCRAPER".equals(((Object) (s1))))
			af[i] = f.f;
		else
		if("FLUID".equals(((Object) (s1))))
		{
			af[i] = f.h;
		} else
		{
			if(!"ICON".equals(((Object) (s1))))
				break; /* Loop/switch isn't completed */
			af[i] = f.i;
		}
		i++;
		if(true) goto _L2; else goto _L1
_L1:
		s = String.valueOf(((Object) (s1)));
		if(s.length() != 0)
			s = "Could not parse XML attribute \"adSize\": ".concat(s);
		else
			s = new String("Could not parse XML attribute \"adSize\": ");
		throw new IllegalArgumentException(s);
		if(af.length == 0)
		{
			s = String.valueOf(((Object) (s)));
			if(s.length() != 0)
				s = "Could not parse XML attribute \"adSize\": ".concat(s);
			else
				s = new String("Could not parse XML attribute \"adSize\": ");
			throw new IllegalArgumentException(s);
		} else
		{
			return af;
		}
	//* 231  460:astore_0        
	//* 232  461:goto            142
	}

	public final String a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String b>
	//    2    4:areturn         
	}

	public final f[] a(boolean flag)
	{
		if(!flag && a.length != 1)
	//*   0    0:iload_1         
	//*   1    1:ifne            26
	//*   2    4:aload_0         
	//*   3    5:getfield        #56  <Field f[] a>
	//*   4    8:arraylength     
	//*   5    9:iconst_1        
	//*   6   10:icmpne          16
	//*   7   13:goto            26
			throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
	//    8   16:new             #63  <Class IllegalArgumentException>
	//    9   19:dup             
	//   10   20:ldc1            #176 <String "The adSizes XML attribute is only allowed on PublisherAdViews.">
	//   11   22:invokespecial   #68  <Method void IllegalArgumentException(String)>
	//   12   25:athrow          
		else
			return a;
	//   13   26:aload_0         
	//   14   27:getfield        #56  <Field f[] a>
	//   15   30:areturn         
	}

	private final f a[];
	private final String b;
}
