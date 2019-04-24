// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;

public final class zzjq
{

	public zzjq(Context context, AttributeSet attributeset)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		attributeset = ((AttributeSet) (context.getResources().obtainAttributes(attributeset, com.google.android.gms.ads.R.styleable.AdsAttrs)));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #20  <Method Resources Context.getResources()>
	//    4    8:aload_2         
	//    5    9:getstatic       #26  <Field int[] com.google.android.gms.ads.R$styleable.AdsAttrs>
	//    6   12:invokevirtual   #32  <Method TypedArray Resources.obtainAttributes(AttributeSet, int[])>
	//    7   15:astore_2        
		context = ((Context) (((TypedArray) (attributeset)).getString(com.google.android.gms.ads.R.styleable.AdsAttrs_adSize)));
	//    8   16:aload_2         
	//    9   17:getstatic       #36  <Field int com.google.android.gms.ads.R$styleable.AdsAttrs_adSize>
	//   10   20:invokevirtual   #42  <Method String TypedArray.getString(int)>
	//   11   23:astore_1        
		String s = ((TypedArray) (attributeset)).getString(com.google.android.gms.ads.R.styleable.AdsAttrs_adSizes);
	//   12   24:aload_2         
	//   13   25:getstatic       #45  <Field int com.google.android.gms.ads.R$styleable.AdsAttrs_adSizes>
	//   14   28:invokevirtual   #42  <Method String TypedArray.getString(int)>
	//   15   31:astore          5
		boolean flag = TextUtils.isEmpty(((CharSequence) (context))) ^ true;
	//   16   33:aload_1         
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
	//*  27   50:ifeq            71
	//*  28   53:iload           4
	//*  29   55:ifne            71
			context = ((Context) (zzab(((String) (context)))));
	//   30   58:aload_1         
	//   31   59:invokestatic    #55  <Method AdSize[] zzab(String)>
	//   32   62:astore_1        
		else
	//*  33   63:aload_0         
	//*  34   64:aload_1         
	//*  35   65:putfield        #57  <Field AdSize[] zzarh>
	//*  36   68:goto            89
		if(!flag && flag1)
	//*  37   71:iload_3         
	//*  38   72:ifne            121
	//*  39   75:iload           4
	//*  40   77:ifeq            121
			context = ((Context) (zzab(s)));
	//   41   80:aload           5
	//   42   82:invokestatic    #55  <Method AdSize[] zzab(String)>
	//   43   85:astore_1        
		else
	//*  44   86:goto            63
	//*  45   89:aload_0         
	//*  46   90:aload_2         
	//*  47   91:getstatic       #60  <Field int com.google.android.gms.ads.R$styleable.AdsAttrs_adUnitId>
	//*  48   94:invokevirtual   #42  <Method String TypedArray.getString(int)>
	//*  49   97:putfield        #62  <Field String zzye>
	//*  50  100:aload_0         
	//*  51  101:getfield        #62  <Field String zzye>
	//*  52  104:invokestatic    #51  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  53  107:ifeq            120
	//*  54  110:new             #64  <Class IllegalArgumentException>
	//*  55  113:dup             
	//*  56  114:ldc1            #66  <String "Required XML attribute \"adUnitId\" was missing.">
	//*  57  116:invokespecial   #69  <Method void IllegalArgumentException(String)>
	//*  58  119:athrow          
	//*  59  120:return          
		if(flag)
	//*  60  121:iload_3         
	//*  61  122:ifeq            135
			throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
	//   62  125:new             #64  <Class IllegalArgumentException>
	//   63  128:dup             
	//   64  129:ldc1            #71  <String "Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.">
	//   65  131:invokespecial   #69  <Method void IllegalArgumentException(String)>
	//   66  134:athrow          
		else
			throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
	//   67  135:new             #64  <Class IllegalArgumentException>
	//   68  138:dup             
	//   69  139:ldc1            #73  <String "Required XML attribute \"adSize\" was missing.">
	//   70  141:invokespecial   #69  <Method void IllegalArgumentException(String)>
	//   71  144:athrow          
		zzarh = ((AdSize []) (context));
		zzye = ((TypedArray) (attributeset)).getString(com.google.android.gms.ads.R.styleable.AdsAttrs_adUnitId);
		if(TextUtils.isEmpty(((CharSequence) (zzye))))
			throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
		else
			return;
	}

	private static AdSize[] zzab(String s)
	{
		int i;
		String as[];
		AdSize aadsize[];
		as = s.split("\\s*,\\s*");
	//    0    0:aload_0         
	//    1    1:ldc1            #78  <String "\\s*,\\s*">
	//    2    3:invokevirtual   #84  <Method String[] String.split(String)>
	//    3    6:astore          5
		aadsize = new AdSize[as.length];
	//    4    8:aload           5
	//    5   10:arraylength     
	//    6   11:anewarray       AdSize[]
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
	//   17   29:invokevirtual   #90  <Method String String.trim()>
	//   18   32:astore          4
		if(!s1.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$"))
			break MISSING_BLOCK_LABEL_184;
	//   19   34:aload           4
	//   20   36:ldc1            #92  <String "^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$">
	//   21   38:invokevirtual   #96  <Method boolean String.matches(String)>
	//   22   41:ifeq            184
		as1 = s1.split("[xX]");
	//   23   44:aload           4
	//   24   46:ldc1            #98  <String "[xX]">
	//   25   48:invokevirtual   #84  <Method String[] String.split(String)>
	//   26   51:astore          7
		as1[0] = as1[0].trim();
	//   27   53:aload           7
	//   28   55:iconst_0        
	//   29   56:aload           7
	//   30   58:iconst_0        
	//   31   59:aaload          
	//   32   60:invokevirtual   #90  <Method String String.trim()>
	//   33   63:aastore         
		as1[1] = as1[1].trim();
	//   34   64:aload           7
	//   35   66:iconst_1        
	//   36   67:aload           7
	//   37   69:iconst_1        
	//   38   70:aaload          
	//   39   71:invokevirtual   #90  <Method String String.trim()>
	//   40   74:aastore         
		int j;
		if("FULL_WIDTH".equals(((Object) (as1[0]))))
	//*  41   75:ldc1            #100 <String "FULL_WIDTH">
	//*  42   77:aload           7
	//*  43   79:iconst_0        
	//*  44   80:aaload          
	//*  45   81:invokevirtual   #104 <Method boolean String.equals(Object)>
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
	//   53   96:invokestatic    #110 <Method int Integer.parseInt(String)>
	//   54   99:istore_2        
		int k;
		if("AUTO_HEIGHT".equals(((Object) (as1[1]))))
	//*  55  100:ldc1            #112 <String "AUTO_HEIGHT">
	//*  56  102:aload           7
	//*  57  104:iconst_1        
	//*  58  105:aaload          
	//*  59  106:invokevirtual   #104 <Method boolean String.equals(Object)>
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
	//   67  122:invokestatic    #110 <Method int Integer.parseInt(String)>
	//   68  125:istore_3        
			}
	//*  69  126:aload           6
	//*  70  128:iload_1         
	//*  71  129:new             #86  <Class AdSize>
	//*  72  132:dup             
	//*  73  133:iload_2         
	//*  74  134:iload_3         
	//*  75  135:invokespecial   #115 <Method void AdSize(int, int)>
	//*  76  138:aastore         
	//*  77  139:goto            361
	//*  78  142:aload           4
	//*  79  144:invokestatic    #119 <Method String String.valueOf(Object)>
	//*  80  147:astore_0        
	//*  81  148:aload_0         
	//*  82  149:invokevirtual   #123 <Method int String.length()>
	//*  83  152:ifeq            165
	//*  84  155:ldc1            #125 <String "Could not parse XML attribute \"adSize\": ">
	//*  85  157:aload_0         
	//*  86  158:invokevirtual   #129 <Method String String.concat(String)>
	//*  87  161:astore_0        
	//*  88  162:goto            175
	//*  89  165:new             #80  <Class String>
	//*  90  168:dup             
	//*  91  169:ldc1            #125 <String "Could not parse XML attribute \"adSize\": ">
	//*  92  171:invokespecial   #130 <Method void String(String)>
	//*  93  174:astore_0        
	//*  94  175:new             #64  <Class IllegalArgumentException>
	//*  95  178:dup             
	//*  96  179:aload_0         
	//*  97  180:invokespecial   #69  <Method void IllegalArgumentException(String)>
	//*  98  183:athrow          
	//*  99  184:ldc1            #132 <String "BANNER">
	//* 100  186:aload           4
	//* 101  188:invokevirtual   #104 <Method boolean String.equals(Object)>
	//* 102  191:ifeq            204
	//* 103  194:aload           6
	//* 104  196:iload_1         
	//* 105  197:getstatic       #135 <Field AdSize AdSize.BANNER>
	//* 106  200:aastore         
	//* 107  201:goto            361
	//* 108  204:ldc1            #137 <String "LARGE_BANNER">
	//* 109  206:aload           4
	//* 110  208:invokevirtual   #104 <Method boolean String.equals(Object)>
	//* 111  211:ifeq            224
	//* 112  214:aload           6
	//* 113  216:iload_1         
	//* 114  217:getstatic       #139 <Field AdSize AdSize.LARGE_BANNER>
	//* 115  220:aastore         
	//* 116  221:goto            361
	//* 117  224:ldc1            #141 <String "FULL_BANNER">
	//* 118  226:aload           4
	//* 119  228:invokevirtual   #104 <Method boolean String.equals(Object)>
	//* 120  231:ifeq            244
	//* 121  234:aload           6
	//* 122  236:iload_1         
	//* 123  237:getstatic       #143 <Field AdSize AdSize.FULL_BANNER>
	//* 124  240:aastore         
	//* 125  241:goto            361
	//* 126  244:ldc1            #145 <String "LEADERBOARD">
	//* 127  246:aload           4
	//* 128  248:invokevirtual   #104 <Method boolean String.equals(Object)>
	//* 129  251:ifeq            264
	//* 130  254:aload           6
	//* 131  256:iload_1         
	//* 132  257:getstatic       #147 <Field AdSize AdSize.LEADERBOARD>
	//* 133  260:aastore         
	//* 134  261:goto            361
	//* 135  264:ldc1            #149 <String "MEDIUM_RECTANGLE">
	//* 136  266:aload           4
	//* 137  268:invokevirtual   #104 <Method boolean String.equals(Object)>
	//* 138  271:ifeq            284
	//* 139  274:aload           6
	//* 140  276:iload_1         
	//* 141  277:getstatic       #151 <Field AdSize AdSize.MEDIUM_RECTANGLE>
	//* 142  280:aastore         
	//* 143  281:goto            361
	//* 144  284:ldc1            #153 <String "SMART_BANNER">
	//* 145  286:aload           4
	//* 146  288:invokevirtual   #104 <Method boolean String.equals(Object)>
	//* 147  291:ifeq            304
	//* 148  294:aload           6
	//* 149  296:iload_1         
	//* 150  297:getstatic       #155 <Field AdSize AdSize.SMART_BANNER>
	//* 151  300:aastore         
	//* 152  301:goto            361
	//* 153  304:ldc1            #157 <String "WIDE_SKYSCRAPER">
	//* 154  306:aload           4
	//* 155  308:invokevirtual   #104 <Method boolean String.equals(Object)>
	//* 156  311:ifeq            324
	//* 157  314:aload           6
	//* 158  316:iload_1         
	//* 159  317:getstatic       #159 <Field AdSize AdSize.WIDE_SKYSCRAPER>
	//* 160  320:aastore         
	//* 161  321:goto            361
	//* 162  324:ldc1            #161 <String "FLUID">
	//* 163  326:aload           4
	//* 164  328:invokevirtual   #104 <Method boolean String.equals(Object)>
	//* 165  331:ifeq            344
	//* 166  334:aload           6
	//* 167  336:iload_1         
	//* 168  337:getstatic       #163 <Field AdSize AdSize.FLUID>
	//* 169  340:aastore         
	//* 170  341:goto            361
	//* 171  344:ldc1            #165 <String "ICON">
	//* 172  346:aload           4
	//* 173  348:invokevirtual   #104 <Method boolean String.equals(Object)>
	//* 174  351:ifeq            368
	//* 175  354:aload           6
	//* 176  356:iload_1         
	//* 177  357:getstatic       #168 <Field AdSize AdSize.zzup>
	//* 178  360:aastore         
	//* 179  361:iload_1         
	//* 180  362:iconst_1        
	//* 181  363:iadd            
	//* 182  364:istore_1        
	//* 183  365:goto            18
	//* 184  368:aload           4
	//* 185  370:invokestatic    #119 <Method String String.valueOf(Object)>
	//* 186  373:astore_0        
	//* 187  374:aload_0         
	//* 188  375:invokevirtual   #123 <Method int String.length()>
	//* 189  378:ifeq            391
	//* 190  381:ldc1            #125 <String "Could not parse XML attribute \"adSize\": ">
	//* 191  383:aload_0         
	//* 192  384:invokevirtual   #129 <Method String String.concat(String)>
	//* 193  387:astore_0        
	//* 194  388:goto            401
	//* 195  391:new             #80  <Class String>
	//* 196  394:dup             
	//* 197  395:ldc1            #125 <String "Could not parse XML attribute \"adSize\": ">
	//* 198  397:invokespecial   #130 <Method void String(String)>
	//* 199  400:astore_0        
	//* 200  401:new             #64  <Class IllegalArgumentException>
	//* 201  404:dup             
	//* 202  405:aload_0         
	//* 203  406:invokespecial   #69  <Method void IllegalArgumentException(String)>
	//* 204  409:athrow          
	//* 205  410:aload           6
	//* 206  412:arraylength     
	//* 207  413:ifne            457
	//* 208  416:aload_0         
	//* 209  417:invokestatic    #119 <Method String String.valueOf(Object)>
	//* 210  420:astore_0        
	//* 211  421:aload_0         
	//* 212  422:invokevirtual   #123 <Method int String.length()>
	//* 213  425:ifeq            438
	//* 214  428:ldc1            #125 <String "Could not parse XML attribute \"adSize\": ">
	//* 215  430:aload_0         
	//* 216  431:invokevirtual   #129 <Method String String.concat(String)>
	//* 217  434:astore_0        
	//* 218  435:goto            448
	//* 219  438:new             #80  <Class String>
	//* 220  441:dup             
	//* 221  442:ldc1            #125 <String "Could not parse XML attribute \"adSize\": ">
	//* 222  444:invokespecial   #130 <Method void String(String)>
	//* 223  447:astore_0        
	//* 224  448:new             #64  <Class IllegalArgumentException>
	//* 225  451:dup             
	//* 226  452:aload_0         
	//* 227  453:invokespecial   #69  <Method void IllegalArgumentException(String)>
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
		aadsize[i] = new AdSize(j, k);
		break MISSING_BLOCK_LABEL_361;
		if("BANNER".equals(((Object) (s1))))
			aadsize[i] = AdSize.BANNER;
		else
		if("LARGE_BANNER".equals(((Object) (s1))))
			aadsize[i] = AdSize.LARGE_BANNER;
		else
		if("FULL_BANNER".equals(((Object) (s1))))
			aadsize[i] = AdSize.FULL_BANNER;
		else
		if("LEADERBOARD".equals(((Object) (s1))))
			aadsize[i] = AdSize.LEADERBOARD;
		else
		if("MEDIUM_RECTANGLE".equals(((Object) (s1))))
			aadsize[i] = AdSize.MEDIUM_RECTANGLE;
		else
		if("SMART_BANNER".equals(((Object) (s1))))
			aadsize[i] = AdSize.SMART_BANNER;
		else
		if("WIDE_SKYSCRAPER".equals(((Object) (s1))))
			aadsize[i] = AdSize.WIDE_SKYSCRAPER;
		else
		if("FLUID".equals(((Object) (s1))))
		{
			aadsize[i] = AdSize.FLUID;
		} else
		{
			if(!"ICON".equals(((Object) (s1))))
				break; /* Loop/switch isn't completed */
			aadsize[i] = AdSize.zzup;
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
		if(aadsize.length == 0)
		{
			s = String.valueOf(((Object) (s)));
			if(s.length() != 0)
				s = "Could not parse XML attribute \"adSize\": ".concat(s);
			else
				s = new String("Could not parse XML attribute \"adSize\": ");
			throw new IllegalArgumentException(s);
		} else
		{
			return aadsize;
		}
	//* 231  460:astore_0        
	//* 232  461:goto            142
	}

	public final String getAdUnitId()
	{
		return zzye;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field String zzye>
	//    2    4:areturn         
	}

	public final AdSize[] zzi(boolean flag)
	{
		if(!flag && zzarh.length != 1)
	//*   0    0:iload_1         
	//*   1    1:ifne            23
	//*   2    4:aload_0         
	//*   3    5:getfield        #57  <Field AdSize[] zzarh>
	//*   4    8:arraylength     
	//*   5    9:iconst_1        
	//*   6   10:icmpeq          23
			throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
	//    7   13:new             #64  <Class IllegalArgumentException>
	//    8   16:dup             
	//    9   17:ldc1            #173 <String "The adSizes XML attribute is only allowed on PublisherAdViews.">
	//   10   19:invokespecial   #69  <Method void IllegalArgumentException(String)>
	//   11   22:athrow          
		else
			return zzarh;
	//   12   23:aload_0         
	//   13   24:getfield        #57  <Field AdSize[] zzarh>
	//   14   27:areturn         
	}

	private final AdSize zzarh[];
	private final String zzye;
}
