// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.EnumSet;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			ce, v

public final class ck
	implements ce, IPutIntoJson
{

	public ck(AppboyConfigurationProvider appboyconfigurationprovider, String s, String s1, String s2, String s3, String s4, String s5, 
			Boolean boolean1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		i = appboyconfigurationprovider;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #40  <Field AppboyConfigurationProvider i>
		b = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #42  <Field String b>
		c = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #44  <Field String c>
		d = s2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #46  <Field String d>
		e = s3;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #48  <Field String e>
		g = s4;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #50  <Field String g>
		f = s5;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #52  <Field String f>
		h = boolean1;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #54  <Field Boolean h>
	//   26   49:return          
	}

	public static ck a(AppboyConfigurationProvider appboyconfigurationprovider, JSONObject jsonobject)
	{
		v av[] = v.values();
	//    0    0:invokestatic    #61  <Method v[] v.values()>
	//    1    3:astore          17
		int k = av.length;
	//    2    5:aload           17
	//    3    7:arraylength     
	//    4    8:istore_3        
		int j = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		String s5 = null;
	//    7   11:aconst_null     
	//    8   12:astore          10
		String s = s5;
	//    9   14:aload           10
	//   10   16:astore          4
		String s1 = s;
	//   11   18:aload           4
	//   12   20:astore          5
		String s2 = s1;
	//   13   22:aload           5
	//   14   24:astore          6
		String s3 = s2;
	//   15   26:aload           6
	//   16   28:astore          7
		String s4 = s3;
	//   17   30:aload           7
	//   18   32:astore          8
		Object obj = ((Object) (s4));
	//   19   34:aload           8
	//   20   36:astore          9
		while(j < k) 
	//*  21   38:iload_2         
	//*  22   39:iload_3         
	//*  23   40:icmpge          496
		{
			v v1 = av[j];
	//   24   43:aload           17
	//   25   45:iload_2         
	//   26   46:aaload          
	//   27   47:astore          18
			static class _cls1
			{

				static final int a[];

				static 
				{
					a = new int[v.values().length];
				//    0    0:invokestatic    #18  <Method v[] v.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] a>
					try
					{
						a[v.f.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] a>
				//    5   12:getstatic       #24  <Field v v.f>
				//    6   15:invokevirtual   #28  <Method int v.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #20  <Field int[] a>
				//*  10   23:getstatic       #31  <Field v v.b>
				//*  11   26:invokevirtual   #28  <Method int v.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #20  <Field int[] a>
				//*  15   34:getstatic       #33  <Field v v.a>
				//*  16   37:invokevirtual   #28  <Method int v.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:getstatic       #20  <Field int[] a>
				//*  20   45:getstatic       #36  <Field v v.d>
				//*  21   48:invokevirtual   #28  <Method int v.ordinal()>
				//*  22   51:iconst_4        
				//*  23   52:iastore         
				//*  24   53:getstatic       #20  <Field int[] a>
				//*  25   56:getstatic       #39  <Field v v.e>
				//*  26   59:invokevirtual   #28  <Method int v.ordinal()>
				//*  27   62:iconst_5        
				//*  28   63:iastore         
				//*  29   64:getstatic       #20  <Field int[] a>
				//*  30   67:getstatic       #42  <Field v v.c>
				//*  31   70:invokevirtual   #28  <Method int v.ordinal()>
				//*  32   73:bipush          6
				//*  33   75:iastore         
				//*  34   76:getstatic       #20  <Field int[] a>
				//*  35   79:getstatic       #45  <Field v v.g>
				//*  36   82:invokevirtual   #28  <Method int v.ordinal()>
				//*  37   85:bipush          7
				//*  38   87:iastore         
				//*  39   88:return          
					catch(NoSuchFieldError nosuchfielderror) { }
				//   40   89:astore_0        
					try
					{
						a[v.b.ordinal()] = 2;
					}
				//*  41   90:goto            20
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   42   93:astore_0        
					try
					{
						a[v.a.ordinal()] = 3;
					}
				//*  43   94:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   44   97:astore_0        
					try
					{
						a[v.d.ordinal()] = 4;
					}
				//*  45   98:goto            42
					catch(NoSuchFieldError nosuchfielderror3) { }
				//   46  101:astore_0        
					try
					{
						a[v.e.ordinal()] = 5;
					}
				//*  47  102:goto            53
					catch(NoSuchFieldError nosuchfielderror4) { }
				//   48  105:astore_0        
					try
					{
						a[v.c.ordinal()] = 6;
					}
				//*  49  106:goto            64
					catch(NoSuchFieldError nosuchfielderror5) { }
				//   50  109:astore_0        
					try
					{
						a[v.g.ordinal()] = 7;
					}
				//*  51  110:goto            76
					catch(NoSuchFieldError nosuchfielderror6) { }
				//   52  113:astore_0        
				//*  53  114:return          
				}
			}

			String s6;
			Object obj1;
			String s7;
			String s8;
			String s9;
			String s10;
			switch(_cls1.a[v1.ordinal()])
	//*  28   49:getstatic       #64  <Field int[] ck$1.a>
	//*  29   52:aload           18
	//*  30   54:invokevirtual   #68  <Method int v.ordinal()>
	//*  31   57:iaload          
			{
	//*  32   58:tableswitch     1 7: default 100
	//	               1 431
	//	               2 394
	//	               3 357
	//	               4 320
	//	               5 283
	//	               6 246
	//	               7 168
			default:
				s6 = a;
	//   33  100:getstatic       #33  <Field String a>
	//   34  103:astore          11
				obj1 = ((Object) (new StringBuilder()));
	//   35  105:new             #70  <Class StringBuilder>
	//   36  108:dup             
	//   37  109:invokespecial   #71  <Method void StringBuilder()>
	//   38  112:astore          12
				((StringBuilder) (obj1)).append("Unknown key encountered in Device createFromJson ");
	//   39  114:aload           12
	//   40  116:ldc1            #73  <String "Unknown key encountered in Device createFromJson ">
	//   41  118:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   42  121:pop             
				((StringBuilder) (obj1)).append(((Object) (v1)));
	//   43  122:aload           12
	//   44  124:aload           18
	//   45  126:invokevirtual   #80  <Method StringBuilder StringBuilder.append(Object)>
	//   46  129:pop             
				AppboyLogger.e(s6, ((StringBuilder) (obj1)).toString());
	//   47  130:aload           11
	//   48  132:aload           12
	//   49  134:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   50  137:invokestatic    #87  <Method int AppboyLogger.e(String, String)>
	//   51  140:pop             
				s6 = s5;
	//   52  141:aload           10
	//   53  143:astore          11
				obj1 = ((Object) (s));
	//   54  145:aload           4
	//   55  147:astore          12
				s7 = s1;
	//   56  149:aload           5
	//   57  151:astore          13
				s8 = s2;
	//   58  153:aload           6
	//   59  155:astore          14
				s9 = s3;
	//   60  157:aload           7
	//   61  159:astore          15
				s10 = s4;
	//   62  161:aload           8
	//   63  163:astore          16
				break;
	//   64  165:goto            465

			case 7: // '\007'
				s6 = s5;
	//   65  168:aload           10
	//   66  170:astore          11
				obj1 = ((Object) (s));
	//   67  172:aload           4
	//   68  174:astore          12
				s7 = s1;
	//   69  176:aload           5
	//   70  178:astore          13
				s8 = s2;
	//   71  180:aload           6
	//   72  182:astore          14
				s9 = s3;
	//   73  184:aload           7
	//   74  186:astore          15
				s10 = s4;
	//   75  188:aload           8
	//   76  190:astore          16
				if(jsonobject.has(v1.a()))
	//*  77  192:aload_1         
	//*  78  193:aload           18
	//*  79  195:invokevirtual   #89  <Method String v.a()>
	//*  80  198:invokevirtual   #95  <Method boolean JSONObject.has(String)>
	//*  81  201:ifeq            465
				{
					obj = ((Object) (Boolean.valueOf(jsonobject.optBoolean(v1.a(), true))));
	//   82  204:aload_1         
	//   83  205:aload           18
	//   84  207:invokevirtual   #89  <Method String v.a()>
	//   85  210:iconst_1        
	//   86  211:invokevirtual   #99  <Method boolean JSONObject.optBoolean(String, boolean)>
	//   87  214:invokestatic    #105 <Method Boolean Boolean.valueOf(boolean)>
	//   88  217:astore          9
					s6 = s5;
	//   89  219:aload           10
	//   90  221:astore          11
					obj1 = ((Object) (s));
	//   91  223:aload           4
	//   92  225:astore          12
					s7 = s1;
	//   93  227:aload           5
	//   94  229:astore          13
					s8 = s2;
	//   95  231:aload           6
	//   96  233:astore          14
					s9 = s3;
	//   97  235:aload           7
	//   98  237:astore          15
					s10 = s4;
	//   99  239:aload           8
	//  100  241:astore          16
				}
				break;

	//* 101  243:goto            465
			case 6: // '\006'
				s7 = StringUtils.emptyToNull(jsonobject.optString(v1.a()));
	//  102  246:aload_1         
	//  103  247:aload           18
	//  104  249:invokevirtual   #89  <Method String v.a()>
	//  105  252:invokevirtual   #109 <Method String JSONObject.optString(String)>
	//  106  255:invokestatic    #114 <Method String StringUtils.emptyToNull(String)>
	//  107  258:astore          13
				s6 = s5;
	//  108  260:aload           10
	//  109  262:astore          11
				obj1 = ((Object) (s));
	//  110  264:aload           4
	//  111  266:astore          12
				s8 = s2;
	//  112  268:aload           6
	//  113  270:astore          14
				s9 = s3;
	//  114  272:aload           7
	//  115  274:astore          15
				s10 = s4;
	//  116  276:aload           8
	//  117  278:astore          16
				break;

	//* 118  280:goto            465
			case 5: // '\005'
				s8 = StringUtils.emptyToNull(jsonobject.optString(v1.a()));
	//  119  283:aload_1         
	//  120  284:aload           18
	//  121  286:invokevirtual   #89  <Method String v.a()>
	//  122  289:invokevirtual   #109 <Method String JSONObject.optString(String)>
	//  123  292:invokestatic    #114 <Method String StringUtils.emptyToNull(String)>
	//  124  295:astore          14
				s6 = s5;
	//  125  297:aload           10
	//  126  299:astore          11
				obj1 = ((Object) (s));
	//  127  301:aload           4
	//  128  303:astore          12
				s7 = s1;
	//  129  305:aload           5
	//  130  307:astore          13
				s9 = s3;
	//  131  309:aload           7
	//  132  311:astore          15
				s10 = s4;
	//  133  313:aload           8
	//  134  315:astore          16
				break;

	//* 135  317:goto            465
			case 4: // '\004'
				s10 = StringUtils.emptyToNull(jsonobject.optString(v1.a()));
	//  136  320:aload_1         
	//  137  321:aload           18
	//  138  323:invokevirtual   #89  <Method String v.a()>
	//  139  326:invokevirtual   #109 <Method String JSONObject.optString(String)>
	//  140  329:invokestatic    #114 <Method String StringUtils.emptyToNull(String)>
	//  141  332:astore          16
				s6 = s5;
	//  142  334:aload           10
	//  143  336:astore          11
				obj1 = ((Object) (s));
	//  144  338:aload           4
	//  145  340:astore          12
				s7 = s1;
	//  146  342:aload           5
	//  147  344:astore          13
				s8 = s2;
	//  148  346:aload           6
	//  149  348:astore          14
				s9 = s3;
	//  150  350:aload           7
	//  151  352:astore          15
				break;

	//* 152  354:goto            465
			case 3: // '\003'
				s6 = StringUtils.emptyToNull(jsonobject.optString(v1.a()));
	//  153  357:aload_1         
	//  154  358:aload           18
	//  155  360:invokevirtual   #89  <Method String v.a()>
	//  156  363:invokevirtual   #109 <Method String JSONObject.optString(String)>
	//  157  366:invokestatic    #114 <Method String StringUtils.emptyToNull(String)>
	//  158  369:astore          11
				obj1 = ((Object) (s));
	//  159  371:aload           4
	//  160  373:astore          12
				s7 = s1;
	//  161  375:aload           5
	//  162  377:astore          13
				s8 = s2;
	//  163  379:aload           6
	//  164  381:astore          14
				s9 = s3;
	//  165  383:aload           7
	//  166  385:astore          15
				s10 = s4;
	//  167  387:aload           8
	//  168  389:astore          16
				break;

	//* 169  391:goto            465
			case 2: // '\002'
				obj1 = ((Object) (StringUtils.emptyToNull(jsonobject.optString(v1.a()))));
	//  170  394:aload_1         
	//  171  395:aload           18
	//  172  397:invokevirtual   #89  <Method String v.a()>
	//  173  400:invokevirtual   #109 <Method String JSONObject.optString(String)>
	//  174  403:invokestatic    #114 <Method String StringUtils.emptyToNull(String)>
	//  175  406:astore          12
				s6 = s5;
	//  176  408:aload           10
	//  177  410:astore          11
				s7 = s1;
	//  178  412:aload           5
	//  179  414:astore          13
				s8 = s2;
	//  180  416:aload           6
	//  181  418:astore          14
				s9 = s3;
	//  182  420:aload           7
	//  183  422:astore          15
				s10 = s4;
	//  184  424:aload           8
	//  185  426:astore          16
				break;

	//* 186  428:goto            465
			case 1: // '\001'
				s9 = StringUtils.emptyToNull(jsonobject.optString(v1.a()));
	//  187  431:aload_1         
	//  188  432:aload           18
	//  189  434:invokevirtual   #89  <Method String v.a()>
	//  190  437:invokevirtual   #109 <Method String JSONObject.optString(String)>
	//  191  440:invokestatic    #114 <Method String StringUtils.emptyToNull(String)>
	//  192  443:astore          15
				s10 = s4;
	//  193  445:aload           8
	//  194  447:astore          16
				s8 = s2;
	//  195  449:aload           6
	//  196  451:astore          14
				s7 = s1;
	//  197  453:aload           5
	//  198  455:astore          13
				obj1 = ((Object) (s));
	//  199  457:aload           4
	//  200  459:astore          12
				s6 = s5;
	//  201  461:aload           10
	//  202  463:astore          11
				break;
			}
			j++;
	//  203  465:iload_2         
	//  204  466:iconst_1        
	//  205  467:iadd            
	//  206  468:istore_2        
			s5 = s6;
	//  207  469:aload           11
	//  208  471:astore          10
			s = ((String) (obj1));
	//  209  473:aload           12
	//  210  475:astore          4
			s1 = s7;
	//  211  477:aload           13
	//  212  479:astore          5
			s2 = s8;
	//  213  481:aload           14
	//  214  483:astore          6
			s3 = s9;
	//  215  485:aload           15
	//  216  487:astore          7
			s4 = s10;
	//  217  489:aload           16
	//  218  491:astore          8
		}
	//* 219  493:goto            38
		return new ck(appboyconfigurationprovider, s5, s, s1, s2, s3, s4, ((Boolean) (obj)));
	//  220  496:new             #2   <Class ck>
	//  221  499:dup             
	//  222  500:aload_0         
	//  223  501:aload           10
	//  224  503:aload           4
	//  225  505:aload           5
	//  226  507:aload           6
	//  227  509:aload           7
	//  228  511:aload           8
	//  229  513:aload           9
	//  230  515:invokespecial   #116 <Method void ck(AppboyConfigurationProvider, String, String, String, String, String, String, Boolean)>
	//  231  518:areturn         
	}

	static void a(AppboyConfigurationProvider appboyconfigurationprovider, JSONObject jsonobject, v v1, Object obj)
	{
		if(!appboyconfigurationprovider.getIsDeviceObjectWhitelistEnabled() || appboyconfigurationprovider.getDeviceObjectWhitelist().contains(((Object) (v1))))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #124 <Method boolean AppboyConfigurationProvider.getIsDeviceObjectWhitelistEnabled()>
	//*   2    4:ifeq            18
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #128 <Method EnumSet AppboyConfigurationProvider.getDeviceObjectWhitelist()>
	//*   5   11:aload_2         
	//*   6   12:invokevirtual   #134 <Method boolean EnumSet.contains(Object)>
	//*   7   15:ifeq            28
			jsonobject.putOpt(v1.a(), obj);
	//    8   18:aload_1         
	//    9   19:aload_2         
	//   10   20:invokevirtual   #89  <Method String v.a()>
	//   11   23:aload_3         
	//   12   24:invokevirtual   #138 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   13   27:pop             
	//   14   28:return          
	}

	public JSONObject a()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #91  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #143 <Method void JSONObject()>
	//    3    7:astore_1        
		a(i, jsonobject, v.a, ((Object) (b)));
	//    4    8:aload_0         
	//    5    9:getfield        #40  <Field AppboyConfigurationProvider i>
	//    6   12:aload_1         
	//    7   13:getstatic       #146 <Field v v.a>
	//    8   16:aload_0         
	//    9   17:getfield        #42  <Field String b>
	//   10   20:invokestatic    #148 <Method void a(AppboyConfigurationProvider, JSONObject, v, Object)>
		a(i, jsonobject, v.b, ((Object) (c)));
	//   11   23:aload_0         
	//   12   24:getfield        #40  <Field AppboyConfigurationProvider i>
	//   13   27:aload_1         
	//   14   28:getstatic       #150 <Field v v.b>
	//   15   31:aload_0         
	//   16   32:getfield        #44  <Field String c>
	//   17   35:invokestatic    #148 <Method void a(AppboyConfigurationProvider, JSONObject, v, Object)>
		a(i, jsonobject, v.c, ((Object) (d)));
	//   18   38:aload_0         
	//   19   39:getfield        #40  <Field AppboyConfigurationProvider i>
	//   20   42:aload_1         
	//   21   43:getstatic       #152 <Field v v.c>
	//   22   46:aload_0         
	//   23   47:getfield        #46  <Field String d>
	//   24   50:invokestatic    #148 <Method void a(AppboyConfigurationProvider, JSONObject, v, Object)>
		a(i, jsonobject, v.d, ((Object) (f)));
	//   25   53:aload_0         
	//   26   54:getfield        #40  <Field AppboyConfigurationProvider i>
	//   27   57:aload_1         
	//   28   58:getstatic       #154 <Field v v.d>
	//   29   61:aload_0         
	//   30   62:getfield        #52  <Field String f>
	//   31   65:invokestatic    #148 <Method void a(AppboyConfigurationProvider, JSONObject, v, Object)>
		a(i, jsonobject, v.e, ((Object) (e)));
	//   32   68:aload_0         
	//   33   69:getfield        #40  <Field AppboyConfigurationProvider i>
	//   34   72:aload_1         
	//   35   73:getstatic       #156 <Field v v.e>
	//   36   76:aload_0         
	//   37   77:getfield        #48  <Field String e>
	//   38   80:invokestatic    #148 <Method void a(AppboyConfigurationProvider, JSONObject, v, Object)>
		a(i, jsonobject, v.g, ((Object) (h)));
	//   39   83:aload_0         
	//   40   84:getfield        #40  <Field AppboyConfigurationProvider i>
	//   41   87:aload_1         
	//   42   88:getstatic       #158 <Field v v.g>
	//   43   91:aload_0         
	//   44   92:getfield        #54  <Field Boolean h>
	//   45   95:invokestatic    #148 <Method void a(AppboyConfigurationProvider, JSONObject, v, Object)>
		if(StringUtils.isNullOrBlank(g))
			break MISSING_BLOCK_LABEL_136;
	//   46   98:aload_0         
	//   47   99:getfield        #50  <Field String g>
	//   48  102:invokestatic    #161 <Method boolean StringUtils.isNullOrBlank(String)>
	//   49  105:ifne            136
		a(i, jsonobject, v.f, ((Object) (g)));
	//   50  108:aload_0         
	//   51  109:getfield        #40  <Field AppboyConfigurationProvider i>
	//   52  112:aload_1         
	//   53  113:getstatic       #163 <Field v v.f>
	//   54  116:aload_0         
	//   55  117:getfield        #50  <Field String g>
	//   56  120:invokestatic    #148 <Method void a(AppboyConfigurationProvider, JSONObject, v, Object)>
		return jsonobject;
	//   57  123:aload_1         
	//   58  124:areturn         
		JSONException jsonexception;
		jsonexception;
	//   59  125:astore_2        
		AppboyLogger.e(a, "Caught exception creating device Json.", ((Throwable) (jsonexception)));
	//   60  126:getstatic       #33  <Field String a>
	//   61  129:ldc1            #165 <String "Caught exception creating device Json.">
	//   62  131:aload_2         
	//   63  132:invokestatic    #168 <Method int AppboyLogger.e(String, String, Throwable)>
	//   64  135:pop             
		return jsonobject;
	//   65  136:aload_1         
	//   66  137:areturn         
	}

	public boolean b()
	{
		return a().length() == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #170 <Method JSONObject a()>
	//    2    4:invokevirtual   #173 <Method int JSONObject.length()>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public Object forJsonPut()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #170 <Method JSONObject a()>
	//    2    4:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/ck);
	private final String b;
	private final String c;
	private final String d;
	private final String e;
	private final String f;
	private String g;
	private final Boolean h;
	private final AppboyConfigurationProvider i;

	static 
	{
	//    0    0:ldc1            #2   <Class ck>
	//    1    2:invokestatic    #31  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #33  <Field String a>
	//*   3    8:return          
	}
}
