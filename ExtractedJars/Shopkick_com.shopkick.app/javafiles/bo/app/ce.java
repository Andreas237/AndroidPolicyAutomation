// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			bw, s

public final class ce
	implements bw, IPutIntoJson
{

	public ce(String s1, String s2, String s3, String s4, String s5, String s6, Boolean boolean1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		b = s1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field String b>
		c = s2;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #40  <Field String c>
		d = s3;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #42  <Field String d>
		e = s4;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #44  <Field String e>
		g = s5;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #46  <Field String g>
		f = s6;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #48  <Field String f>
		h = boolean1;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #50  <Field Boolean h>
	//   23   43:return          
	}

	public static ce a(JSONObject jsonobject)
	{
		s as[] = s.values();
	//    0    0:invokestatic    #57  <Method s[] s.values()>
	//    1    3:astore          16
		int j = as.length;
	//    2    5:aload           16
	//    3    7:arraylength     
	//    4    8:istore_2        
		int i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_1        
		String s6 = null;
	//    7   11:aconst_null     
	//    8   12:astore          9
		String s1 = s6;
	//    9   14:aload           9
	//   10   16:astore_3        
		String s2 = s1;
	//   11   17:aload_3         
	//   12   18:astore          4
		String s3 = s2;
	//   13   20:aload           4
	//   14   22:astore          5
		String s4 = s3;
	//   15   24:aload           5
	//   16   26:astore          6
		String s5 = s4;
	//   17   28:aload           6
	//   18   30:astore          7
		Object obj = ((Object) (s5));
	//   19   32:aload           7
	//   20   34:astore          8
		while(i < j) 
	//*  21   36:iload_1         
	//*  22   37:iload_2         
	//*  23   38:icmpge          487
		{
			s s12 = as[i];
	//   24   41:aload           16
	//   25   43:iload_1         
	//   26   44:aaload          
	//   27   45:astore          17
			static class _cls1
			{

				static final int a[];

				static 
				{
					a = new int[s.values().length];
				//    0    0:invokestatic    #18  <Method s[] s.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] a>
					try
					{
						a[s.f.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] a>
				//    5   12:getstatic       #24  <Field s s.f>
				//    6   15:invokevirtual   #28  <Method int s.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #20  <Field int[] a>
				//*  10   23:getstatic       #31  <Field s s.b>
				//*  11   26:invokevirtual   #28  <Method int s.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #20  <Field int[] a>
				//*  15   34:getstatic       #33  <Field s s.a>
				//*  16   37:invokevirtual   #28  <Method int s.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:getstatic       #20  <Field int[] a>
				//*  20   45:getstatic       #36  <Field s s.d>
				//*  21   48:invokevirtual   #28  <Method int s.ordinal()>
				//*  22   51:iconst_4        
				//*  23   52:iastore         
				//*  24   53:getstatic       #20  <Field int[] a>
				//*  25   56:getstatic       #39  <Field s s.e>
				//*  26   59:invokevirtual   #28  <Method int s.ordinal()>
				//*  27   62:iconst_5        
				//*  28   63:iastore         
				//*  29   64:getstatic       #20  <Field int[] a>
				//*  30   67:getstatic       #42  <Field s s.c>
				//*  31   70:invokevirtual   #28  <Method int s.ordinal()>
				//*  32   73:bipush          6
				//*  33   75:iastore         
				//*  34   76:getstatic       #20  <Field int[] a>
				//*  35   79:getstatic       #45  <Field s s.g>
				//*  36   82:invokevirtual   #28  <Method int s.ordinal()>
				//*  37   85:bipush          7
				//*  38   87:iastore         
				//*  39   88:return          
					catch(NoSuchFieldError nosuchfielderror) { }
				//   40   89:astore_0        
					try
					{
						a[s.b.ordinal()] = 2;
					}
				//*  41   90:goto            20
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   42   93:astore_0        
					try
					{
						a[s.a.ordinal()] = 3;
					}
				//*  43   94:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   44   97:astore_0        
					try
					{
						a[s.d.ordinal()] = 4;
					}
				//*  45   98:goto            42
					catch(NoSuchFieldError nosuchfielderror3) { }
				//   46  101:astore_0        
					try
					{
						a[s.e.ordinal()] = 5;
					}
				//*  47  102:goto            53
					catch(NoSuchFieldError nosuchfielderror4) { }
				//   48  105:astore_0        
					try
					{
						a[s.c.ordinal()] = 6;
					}
				//*  49  106:goto            64
					catch(NoSuchFieldError nosuchfielderror5) { }
				//   50  109:astore_0        
					try
					{
						a[s.g.ordinal()] = 7;
					}
				//*  51  110:goto            76
					catch(NoSuchFieldError nosuchfielderror6) { }
				//   52  113:astore_0        
				//*  53  114:return          
				}
			}

			String s7;
			Object obj1;
			String s8;
			String s9;
			String s10;
			String s11;
			switch(_cls1.a[s12.ordinal()])
	//*  28   47:getstatic       #60  <Field int[] ce$1.a>
	//*  29   50:aload           17
	//*  30   52:invokevirtual   #64  <Method int s.ordinal()>
	//*  31   55:iaload          
			{
	//*  32   56:tableswitch     1 7: default 100
	//	               1 424
	//	               2 387
	//	               3 351
	//	               4 315
	//	               5 279
	//	               6 243
	//	               7 167
			default:
				s7 = a;
	//   33  100:getstatic       #31  <Field String a>
	//   34  103:astore          10
				obj1 = ((Object) (new StringBuilder()));
	//   35  105:new             #66  <Class StringBuilder>
	//   36  108:dup             
	//   37  109:invokespecial   #67  <Method void StringBuilder()>
	//   38  112:astore          11
				((StringBuilder) (obj1)).append("Unknown key encountered in Device createFromJson ");
	//   39  114:aload           11
	//   40  116:ldc1            #69  <String "Unknown key encountered in Device createFromJson ">
	//   41  118:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   42  121:pop             
				((StringBuilder) (obj1)).append(((Object) (s12)));
	//   43  122:aload           11
	//   44  124:aload           17
	//   45  126:invokevirtual   #76  <Method StringBuilder StringBuilder.append(Object)>
	//   46  129:pop             
				AppboyLogger.e(s7, ((StringBuilder) (obj1)).toString());
	//   47  130:aload           10
	//   48  132:aload           11
	//   49  134:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   50  137:invokestatic    #83  <Method int AppboyLogger.e(String, String)>
	//   51  140:pop             
				s7 = s6;
	//   52  141:aload           9
	//   53  143:astore          10
				obj1 = ((Object) (s1));
	//   54  145:aload_3         
	//   55  146:astore          11
				s8 = s2;
	//   56  148:aload           4
	//   57  150:astore          12
				s9 = s3;
	//   58  152:aload           5
	//   59  154:astore          13
				s10 = s4;
	//   60  156:aload           6
	//   61  158:astore          14
				s11 = s5;
	//   62  160:aload           7
	//   63  162:astore          15
				break;
	//   64  164:goto            457

			case 7: // '\007'
				s7 = s6;
	//   65  167:aload           9
	//   66  169:astore          10
				obj1 = ((Object) (s1));
	//   67  171:aload_3         
	//   68  172:astore          11
				s8 = s2;
	//   69  174:aload           4
	//   70  176:astore          12
				s9 = s3;
	//   71  178:aload           5
	//   72  180:astore          13
				s10 = s4;
	//   73  182:aload           6
	//   74  184:astore          14
				s11 = s5;
	//   75  186:aload           7
	//   76  188:astore          15
				if(jsonobject.has(s12.a()))
	//*  77  190:aload_0         
	//*  78  191:aload           17
	//*  79  193:invokevirtual   #85  <Method String s.a()>
	//*  80  196:invokevirtual   #91  <Method boolean JSONObject.has(String)>
	//*  81  199:ifeq            457
				{
					obj = ((Object) (Boolean.valueOf(jsonobject.optBoolean(s12.a(), true))));
	//   82  202:aload_0         
	//   83  203:aload           17
	//   84  205:invokevirtual   #85  <Method String s.a()>
	//   85  208:iconst_1        
	//   86  209:invokevirtual   #95  <Method boolean JSONObject.optBoolean(String, boolean)>
	//   87  212:invokestatic    #101 <Method Boolean Boolean.valueOf(boolean)>
	//   88  215:astore          8
					s7 = s6;
	//   89  217:aload           9
	//   90  219:astore          10
					obj1 = ((Object) (s1));
	//   91  221:aload_3         
	//   92  222:astore          11
					s8 = s2;
	//   93  224:aload           4
	//   94  226:astore          12
					s9 = s3;
	//   95  228:aload           5
	//   96  230:astore          13
					s10 = s4;
	//   97  232:aload           6
	//   98  234:astore          14
					s11 = s5;
	//   99  236:aload           7
	//  100  238:astore          15
				}
				break;

	//* 101  240:goto            457
			case 6: // '\006'
				s8 = StringUtils.emptyToNull(jsonobject.optString(s12.a()));
	//  102  243:aload_0         
	//  103  244:aload           17
	//  104  246:invokevirtual   #85  <Method String s.a()>
	//  105  249:invokevirtual   #105 <Method String JSONObject.optString(String)>
	//  106  252:invokestatic    #110 <Method String StringUtils.emptyToNull(String)>
	//  107  255:astore          12
				s7 = s6;
	//  108  257:aload           9
	//  109  259:astore          10
				obj1 = ((Object) (s1));
	//  110  261:aload_3         
	//  111  262:astore          11
				s9 = s3;
	//  112  264:aload           5
	//  113  266:astore          13
				s10 = s4;
	//  114  268:aload           6
	//  115  270:astore          14
				s11 = s5;
	//  116  272:aload           7
	//  117  274:astore          15
				break;

	//* 118  276:goto            457
			case 5: // '\005'
				s9 = StringUtils.emptyToNull(jsonobject.optString(s12.a()));
	//  119  279:aload_0         
	//  120  280:aload           17
	//  121  282:invokevirtual   #85  <Method String s.a()>
	//  122  285:invokevirtual   #105 <Method String JSONObject.optString(String)>
	//  123  288:invokestatic    #110 <Method String StringUtils.emptyToNull(String)>
	//  124  291:astore          13
				s7 = s6;
	//  125  293:aload           9
	//  126  295:astore          10
				obj1 = ((Object) (s1));
	//  127  297:aload_3         
	//  128  298:astore          11
				s8 = s2;
	//  129  300:aload           4
	//  130  302:astore          12
				s10 = s4;
	//  131  304:aload           6
	//  132  306:astore          14
				s11 = s5;
	//  133  308:aload           7
	//  134  310:astore          15
				break;

	//* 135  312:goto            457
			case 4: // '\004'
				s11 = StringUtils.emptyToNull(jsonobject.optString(s12.a()));
	//  136  315:aload_0         
	//  137  316:aload           17
	//  138  318:invokevirtual   #85  <Method String s.a()>
	//  139  321:invokevirtual   #105 <Method String JSONObject.optString(String)>
	//  140  324:invokestatic    #110 <Method String StringUtils.emptyToNull(String)>
	//  141  327:astore          15
				s7 = s6;
	//  142  329:aload           9
	//  143  331:astore          10
				obj1 = ((Object) (s1));
	//  144  333:aload_3         
	//  145  334:astore          11
				s8 = s2;
	//  146  336:aload           4
	//  147  338:astore          12
				s9 = s3;
	//  148  340:aload           5
	//  149  342:astore          13
				s10 = s4;
	//  150  344:aload           6
	//  151  346:astore          14
				break;

	//* 152  348:goto            457
			case 3: // '\003'
				s7 = StringUtils.emptyToNull(jsonobject.optString(s12.a()));
	//  153  351:aload_0         
	//  154  352:aload           17
	//  155  354:invokevirtual   #85  <Method String s.a()>
	//  156  357:invokevirtual   #105 <Method String JSONObject.optString(String)>
	//  157  360:invokestatic    #110 <Method String StringUtils.emptyToNull(String)>
	//  158  363:astore          10
				obj1 = ((Object) (s1));
	//  159  365:aload_3         
	//  160  366:astore          11
				s8 = s2;
	//  161  368:aload           4
	//  162  370:astore          12
				s9 = s3;
	//  163  372:aload           5
	//  164  374:astore          13
				s10 = s4;
	//  165  376:aload           6
	//  166  378:astore          14
				s11 = s5;
	//  167  380:aload           7
	//  168  382:astore          15
				break;

	//* 169  384:goto            457
			case 2: // '\002'
				obj1 = ((Object) (StringUtils.emptyToNull(jsonobject.optString(s12.a()))));
	//  170  387:aload_0         
	//  171  388:aload           17
	//  172  390:invokevirtual   #85  <Method String s.a()>
	//  173  393:invokevirtual   #105 <Method String JSONObject.optString(String)>
	//  174  396:invokestatic    #110 <Method String StringUtils.emptyToNull(String)>
	//  175  399:astore          11
				s7 = s6;
	//  176  401:aload           9
	//  177  403:astore          10
				s8 = s2;
	//  178  405:aload           4
	//  179  407:astore          12
				s9 = s3;
	//  180  409:aload           5
	//  181  411:astore          13
				s10 = s4;
	//  182  413:aload           6
	//  183  415:astore          14
				s11 = s5;
	//  184  417:aload           7
	//  185  419:astore          15
				break;

	//* 186  421:goto            457
			case 1: // '\001'
				s10 = StringUtils.emptyToNull(jsonobject.optString(s12.a()));
	//  187  424:aload_0         
	//  188  425:aload           17
	//  189  427:invokevirtual   #85  <Method String s.a()>
	//  190  430:invokevirtual   #105 <Method String JSONObject.optString(String)>
	//  191  433:invokestatic    #110 <Method String StringUtils.emptyToNull(String)>
	//  192  436:astore          14
				s11 = s5;
	//  193  438:aload           7
	//  194  440:astore          15
				s9 = s3;
	//  195  442:aload           5
	//  196  444:astore          13
				s8 = s2;
	//  197  446:aload           4
	//  198  448:astore          12
				obj1 = ((Object) (s1));
	//  199  450:aload_3         
	//  200  451:astore          11
				s7 = s6;
	//  201  453:aload           9
	//  202  455:astore          10
				break;
			}
			i++;
	//  203  457:iload_1         
	//  204  458:iconst_1        
	//  205  459:iadd            
	//  206  460:istore_1        
			s6 = s7;
	//  207  461:aload           10
	//  208  463:astore          9
			s1 = ((String) (obj1));
	//  209  465:aload           11
	//  210  467:astore_3        
			s2 = s8;
	//  211  468:aload           12
	//  212  470:astore          4
			s3 = s9;
	//  213  472:aload           13
	//  214  474:astore          5
			s4 = s10;
	//  215  476:aload           14
	//  216  478:astore          6
			s5 = s11;
	//  217  480:aload           15
	//  218  482:astore          7
		}
	//* 219  484:goto            36
		return new ce(s6, s1, s2, s3, s4, s5, ((Boolean) (obj)));
	//  220  487:new             #2   <Class ce>
	//  221  490:dup             
	//  222  491:aload           9
	//  223  493:aload_3         
	//  224  494:aload           4
	//  225  496:aload           5
	//  226  498:aload           6
	//  227  500:aload           7
	//  228  502:aload           8
	//  229  504:invokespecial   #112 <Method void ce(String, String, String, String, String, String, Boolean)>
	//  230  507:areturn         
	}

	public JSONObject a()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #87  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #116 <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.putOpt(s.a.a(), ((Object) (b)));
	//    4    8:aload_1         
	//    5    9:getstatic       #119 <Field s s.a>
	//    6   12:invokevirtual   #85  <Method String s.a()>
	//    7   15:aload_0         
	//    8   16:getfield        #38  <Field String b>
	//    9   19:invokevirtual   #123 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   10   22:pop             
		jsonobject.putOpt(s.b.a(), ((Object) (c)));
	//   11   23:aload_1         
	//   12   24:getstatic       #125 <Field s s.b>
	//   13   27:invokevirtual   #85  <Method String s.a()>
	//   14   30:aload_0         
	//   15   31:getfield        #40  <Field String c>
	//   16   34:invokevirtual   #123 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   17   37:pop             
		jsonobject.putOpt(s.c.a(), ((Object) (d)));
	//   18   38:aload_1         
	//   19   39:getstatic       #127 <Field s s.c>
	//   20   42:invokevirtual   #85  <Method String s.a()>
	//   21   45:aload_0         
	//   22   46:getfield        #42  <Field String d>
	//   23   49:invokevirtual   #123 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   24   52:pop             
		jsonobject.putOpt(s.d.a(), ((Object) (f)));
	//   25   53:aload_1         
	//   26   54:getstatic       #129 <Field s s.d>
	//   27   57:invokevirtual   #85  <Method String s.a()>
	//   28   60:aload_0         
	//   29   61:getfield        #48  <Field String f>
	//   30   64:invokevirtual   #123 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   31   67:pop             
		jsonobject.putOpt(s.e.a(), ((Object) (e)));
	//   32   68:aload_1         
	//   33   69:getstatic       #131 <Field s s.e>
	//   34   72:invokevirtual   #85  <Method String s.a()>
	//   35   75:aload_0         
	//   36   76:getfield        #44  <Field String e>
	//   37   79:invokevirtual   #123 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   38   82:pop             
		jsonobject.putOpt(s.g.a(), ((Object) (h)));
	//   39   83:aload_1         
	//   40   84:getstatic       #133 <Field s s.g>
	//   41   87:invokevirtual   #85  <Method String s.a()>
	//   42   90:aload_0         
	//   43   91:getfield        #50  <Field Boolean h>
	//   44   94:invokevirtual   #123 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   45   97:pop             
		if(StringUtils.isNullOrBlank(g))
			break MISSING_BLOCK_LABEL_136;
	//   46   98:aload_0         
	//   47   99:getfield        #46  <Field String g>
	//   48  102:invokestatic    #136 <Method boolean StringUtils.isNullOrBlank(String)>
	//   49  105:ifne            136
		jsonobject.put(s.f.a(), ((Object) (g)));
	//   50  108:aload_1         
	//   51  109:getstatic       #138 <Field s s.f>
	//   52  112:invokevirtual   #85  <Method String s.a()>
	//   53  115:aload_0         
	//   54  116:getfield        #46  <Field String g>
	//   55  119:invokevirtual   #141 <Method JSONObject JSONObject.put(String, Object)>
	//   56  122:pop             
		return jsonobject;
	//   57  123:aload_1         
	//   58  124:areturn         
		JSONException jsonexception;
		jsonexception;
	//   59  125:astore_2        
		AppboyLogger.e(a, "Caught exception creating device Json.", ((Throwable) (jsonexception)));
	//   60  126:getstatic       #31  <Field String a>
	//   61  129:ldc1            #143 <String "Caught exception creating device Json.">
	//   62  131:aload_2         
	//   63  132:invokestatic    #146 <Method int AppboyLogger.e(String, String, Throwable)>
	//   64  135:pop             
		return jsonobject;
	//   65  136:aload_1         
	//   66  137:areturn         
	}

	public boolean b()
	{
		return a().length() == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #149 <Method JSONObject a()>
	//    2    4:invokevirtual   #152 <Method int JSONObject.length()>
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
	//    1    1:invokevirtual   #149 <Method JSONObject a()>
	//    2    4:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/ce);
	private final String b;
	private final String c;
	private final String d;
	private final String e;
	private final String f;
	private String g;
	private final Boolean h;

	static 
	{
	//    0    0:ldc1            #2   <Class ce>
	//    1    2:invokestatic    #29  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #31  <Field String a>
	//*   3    8:return          
	}
}
