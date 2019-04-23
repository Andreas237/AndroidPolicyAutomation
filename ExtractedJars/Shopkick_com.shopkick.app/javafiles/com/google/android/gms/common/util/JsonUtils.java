// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.*;

// Referenced classes of package com.google.android.gms.common.util:
//			zzd

public final class JsonUtils
{

	private JsonUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:return          
	}

	public static boolean areJsonValuesEquivalent(Object obj, Object obj1)
	{
		if(obj == null && obj1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       10
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       10
			return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
		if(obj != null)
	//*   6   10:aload_0         
	//*   7   11:ifnull          202
		{
			if(obj1 == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       20
				return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
			if((obj instanceof JSONObject) && (obj1 instanceof JSONObject))
	//*  12   20:aload_0         
	//*  13   21:instanceof      #35  <Class JSONObject>
	//*  14   24:ifeq            120
	//*  15   27:aload_1         
	//*  16   28:instanceof      #35  <Class JSONObject>
	//*  17   31:ifeq            120
			{
				obj = ((Object) ((JSONObject)obj));
	//   18   34:aload_0         
	//   19   35:checkcast       #35  <Class JSONObject>
	//   20   38:astore_0        
				obj1 = ((Object) ((JSONObject)obj1));
	//   21   39:aload_1         
	//   22   40:checkcast       #35  <Class JSONObject>
	//   23   43:astore_1        
				if(((JSONObject) (obj)).length() != ((JSONObject) (obj1)).length())
	//*  24   44:aload_0         
	//*  25   45:invokevirtual   #39  <Method int JSONObject.length()>
	//*  26   48:aload_1         
	//*  27   49:invokevirtual   #39  <Method int JSONObject.length()>
	//*  28   52:icmpeq          57
					return false;
	//   29   55:iconst_0        
	//   30   56:ireturn         
				for(Iterator iterator = ((JSONObject) (obj)).keys(); iterator.hasNext();)
	//*  31   57:aload_0         
	//*  32   58:invokevirtual   #43  <Method Iterator JSONObject.keys()>
	//*  33   61:astore          4
	//*  34   63:aload           4
	//*  35   65:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//*  36   70:ifeq            118
				{
					String s = (String)iterator.next();
	//   37   73:aload           4
	//   38   75:invokeinterface #53  <Method Object Iterator.next()>
	//   39   80:checkcast       #55  <Class String>
	//   40   83:astore          5
					if(!((JSONObject) (obj1)).has(s))
	//*  41   85:aload_1         
	//*  42   86:aload           5
	//*  43   88:invokevirtual   #59  <Method boolean JSONObject.has(String)>
	//*  44   91:ifne            96
						return false;
	//   45   94:iconst_0        
	//   46   95:ireturn         
					int i;
					boolean flag;
					try
					{
						flag = areJsonValuesEquivalent(((JSONObject) (obj)).get(s), ((JSONObject) (obj1)).get(s));
	//   47   96:aload_0         
	//   48   97:aload           5
	//   49   99:invokevirtual   #63  <Method Object JSONObject.get(String)>
	//   50  102:aload_1         
	//   51  103:aload           5
	//   52  105:invokevirtual   #63  <Method Object JSONObject.get(String)>
	//   53  108:invokestatic    #65  <Method boolean areJsonValuesEquivalent(Object, Object)>
	//   54  111:istore_3        
					}
	//*  55  112:iload_3         
	//*  56  113:ifne            63
	//*  57  116:iconst_0        
	//*  58  117:ireturn         
	//*  59  118:iconst_1        
	//*  60  119:ireturn         
	//*  61  120:aload_0         
	//*  62  121:instanceof      #67  <Class JSONArray>
	//*  63  124:ifeq            196
	//*  64  127:aload_1         
	//*  65  128:instanceof      #67  <Class JSONArray>
	//*  66  131:ifeq            196
	//*  67  134:aload_0         
	//*  68  135:checkcast       #67  <Class JSONArray>
	//*  69  138:astore_0        
	//*  70  139:aload_1         
	//*  71  140:checkcast       #67  <Class JSONArray>
	//*  72  143:astore_1        
	//*  73  144:aload_0         
	//*  74  145:invokevirtual   #68  <Method int JSONArray.length()>
	//*  75  148:aload_1         
	//*  76  149:invokevirtual   #68  <Method int JSONArray.length()>
	//*  77  152:icmpeq          157
	//*  78  155:iconst_0        
	//*  79  156:ireturn         
	//*  80  157:iconst_0        
	//*  81  158:istore_2        
	//*  82  159:iload_2         
	//*  83  160:aload_0         
	//*  84  161:invokevirtual   #68  <Method int JSONArray.length()>
	//*  85  164:icmpge          194
	//*  86  167:aload_0         
	//*  87  168:iload_2         
	//*  88  169:invokevirtual   #71  <Method Object JSONArray.get(int)>
	//*  89  172:aload_1         
	//*  90  173:iload_2         
	//*  91  174:invokevirtual   #71  <Method Object JSONArray.get(int)>
	//*  92  177:invokestatic    #65  <Method boolean areJsonValuesEquivalent(Object, Object)>
	//*  93  180:istore_3        
	//*  94  181:iload_3         
	//*  95  182:ifne            187
	//*  96  185:iconst_0        
	//*  97  186:ireturn         
	//*  98  187:iload_2         
	//*  99  188:iconst_1        
	//* 100  189:iadd            
	//* 101  190:istore_2        
	//* 102  191:goto            159
	//* 103  194:iconst_1        
	//* 104  195:ireturn         
	//* 105  196:aload_0         
	//* 106  197:aload_1         
	//* 107  198:invokevirtual   #75  <Method boolean Object.equals(Object)>
	//* 108  201:ireturn         
	//* 109  202:iconst_0        
	//* 110  203:ireturn         
					// Misplaced declaration of an exception variable
					catch(Object obj)
	//* 111  204:astore_0        
					{
						return false;
	//  112  205:iconst_0        
	//  113  206:ireturn         
					}
					if(!flag)
						return false;
				}

				return true;
			} else
			if((obj instanceof JSONArray) && (obj1 instanceof JSONArray))
			{
				obj = ((Object) ((JSONArray)obj));
				obj1 = ((Object) ((JSONArray)obj1));
				if(((JSONArray) (obj)).length() != ((JSONArray) (obj1)).length())
					return false;
				i = 0;
				while(i < ((JSONArray) (obj)).length()) 
				{
					try
					{
						flag = areJsonValuesEquivalent(((JSONArray) (obj)).get(i), ((JSONArray) (obj1)).get(i));
					}
					// Misplaced declaration of an exception variable
					catch(Object obj)
	//* 114  207:astore_0        
					{
						return false;
	//  115  208:iconst_0        
	//  116  209:ireturn         
					}
					if(!flag)
						return false;
					i++;
				}
				return true;
			} else
			{
				return obj.equals(obj1);
			}
		} else
		{
			return false;
		}
	}

	public static String escapeString(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s)))) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokestatic    #84  <Method boolean TextUtils.isEmpty(CharSequence)>
	//    2    4:ifne            255
_L1:
		StringBuffer stringbuffer;
		Matcher matcher;
		matcher = zzhd.matcher(((CharSequence) (s)));
	//    3    7:getstatic       #25  <Field Pattern zzhd>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #88  <Method Matcher Pattern.matcher(CharSequence)>
	//    6   14:astore          4
		stringbuffer = null;
	//    7   16:aconst_null     
	//    8   17:astore_2        
_L4:
		if(matcher.find())
	//*   9   18:aload           4
	//*  10   20:invokevirtual   #93  <Method boolean Matcher.find()>
	//*  11   23:ifeq            237
		{
			StringBuffer stringbuffer1 = stringbuffer;
	//   12   26:aload_2         
	//   13   27:astore_3        
			if(stringbuffer == null)
	//*  14   28:aload_2         
	//*  15   29:ifnonnull       40
				stringbuffer1 = new StringBuffer();
	//   16   32:new             #95  <Class StringBuffer>
	//   17   35:dup             
	//   18   36:invokespecial   #96  <Method void StringBuffer()>
	//   19   39:astore_3        
			char c = matcher.group().charAt(0);
	//   20   40:aload           4
	//   21   42:invokevirtual   #100 <Method String Matcher.group()>
	//   22   45:iconst_0        
	//   23   46:invokevirtual   #104 <Method char String.charAt(int)>
	//   24   49:istore_1        
			if(c != '"')
	//*  25   50:iload_1         
	//*  26   51:bipush          34
	//*  27   53:icmpeq          223
			{
				if(c != '/')
	//*  28   56:iload_1         
	//*  29   57:bipush          47
	//*  30   59:icmpeq          209
				{
					if(c != '\\')
	//*  31   62:iload_1         
	//*  32   63:bipush          92
	//*  33   65:icmpeq          195
					{
						switch(c)
	//*  34   68:iload_1         
						{
	//*  35   69:tableswitch     8 10: default 96
	//	               8 181
	//	               9 167
	//	               10 153
						default:
							switch(c)
	//*  36   96:iload_1         
							{
	//*  37   97:tableswitch     12 13: default 120
	//	               12 139
	//	               13 125
							default:
								stringbuffer = stringbuffer1;
	//   38  120:aload_3         
	//   39  121:astore_2        
								break;

	//*  40  122:goto            18
							case 13: // '\r'
								matcher.appendReplacement(stringbuffer1, "\\\\r");
	//   41  125:aload           4
	//   42  127:aload_3         
	//   43  128:ldc1            #106 <String "\\\\r">
	//   44  130:invokevirtual   #110 <Method Matcher Matcher.appendReplacement(StringBuffer, String)>
	//   45  133:pop             
								stringbuffer = stringbuffer1;
	//   46  134:aload_3         
	//   47  135:astore_2        
								break;

	//*  48  136:goto            18
							case 12: // '\f'
								matcher.appendReplacement(stringbuffer1, "\\\\f");
	//   49  139:aload           4
	//   50  141:aload_3         
	//   51  142:ldc1            #112 <String "\\\\f">
	//   52  144:invokevirtual   #110 <Method Matcher Matcher.appendReplacement(StringBuffer, String)>
	//   53  147:pop             
								stringbuffer = stringbuffer1;
	//   54  148:aload_3         
	//   55  149:astore_2        
								break;
							}
							break;

	//*  56  150:goto            18
						case 10: // '\n'
							matcher.appendReplacement(stringbuffer1, "\\\\n");
	//   57  153:aload           4
	//   58  155:aload_3         
	//   59  156:ldc1            #114 <String "\\\\n">
	//   60  158:invokevirtual   #110 <Method Matcher Matcher.appendReplacement(StringBuffer, String)>
	//   61  161:pop             
							stringbuffer = stringbuffer1;
	//   62  162:aload_3         
	//   63  163:astore_2        
							break;

	//*  64  164:goto            18
						case 9: // '\t'
							matcher.appendReplacement(stringbuffer1, "\\\\t");
	//   65  167:aload           4
	//   66  169:aload_3         
	//   67  170:ldc1            #116 <String "\\\\t">
	//   68  172:invokevirtual   #110 <Method Matcher Matcher.appendReplacement(StringBuffer, String)>
	//   69  175:pop             
							stringbuffer = stringbuffer1;
	//   70  176:aload_3         
	//   71  177:astore_2        
							break;

	//*  72  178:goto            18
						case 8: // '\b'
							matcher.appendReplacement(stringbuffer1, "\\\\b");
	//   73  181:aload           4
	//   74  183:aload_3         
	//   75  184:ldc1            #118 <String "\\\\b">
	//   76  186:invokevirtual   #110 <Method Matcher Matcher.appendReplacement(StringBuffer, String)>
	//   77  189:pop             
							stringbuffer = stringbuffer1;
	//   78  190:aload_3         
	//   79  191:astore_2        
							break;
						}
					} else
	//*  80  192:goto            18
					{
						matcher.appendReplacement(stringbuffer1, "\\\\\\\\");
	//   81  195:aload           4
	//   82  197:aload_3         
	//   83  198:ldc1            #120 <String "\\\\\\\\">
	//   84  200:invokevirtual   #110 <Method Matcher Matcher.appendReplacement(StringBuffer, String)>
	//   85  203:pop             
						stringbuffer = stringbuffer1;
	//   86  204:aload_3         
	//   87  205:astore_2        
					}
				} else
	//*  88  206:goto            18
				{
					matcher.appendReplacement(stringbuffer1, "\\\\/");
	//   89  209:aload           4
	//   90  211:aload_3         
	//   91  212:ldc1            #122 <String "\\\\/">
	//   92  214:invokevirtual   #110 <Method Matcher Matcher.appendReplacement(StringBuffer, String)>
	//   93  217:pop             
					stringbuffer = stringbuffer1;
	//   94  218:aload_3         
	//   95  219:astore_2        
				}
			} else
	//*  96  220:goto            18
			{
				matcher.appendReplacement(stringbuffer1, "\\\\\\\"");
	//   97  223:aload           4
	//   98  225:aload_3         
	//   99  226:ldc1            #124 <String "\\\\\\\"">
	//  100  228:invokevirtual   #110 <Method Matcher Matcher.appendReplacement(StringBuffer, String)>
	//  101  231:pop             
				stringbuffer = stringbuffer1;
	//  102  232:aload_3         
	//  103  233:astore_2        
			}
		} else
	//* 104  234:goto            18
		if(stringbuffer == null)
	//* 105  237:aload_2         
	//* 106  238:ifnonnull       243
		{
			return s;
	//  107  241:aload_0         
	//  108  242:areturn         
		} else
		{
			matcher.appendTail(stringbuffer);
	//  109  243:aload           4
	//  110  245:aload_2         
	//  111  246:invokevirtual   #128 <Method StringBuffer Matcher.appendTail(StringBuffer)>
	//  112  249:pop             
			return stringbuffer.toString();
	//  113  250:aload_2         
	//  114  251:invokevirtual   #131 <Method String StringBuffer.toString()>
	//  115  254:areturn         
		}
		continue; /* Loop/switch isn't completed */
_L2:
		return s;
	//  116  255:aload_0         
	//  117  256:areturn         
		if(true) goto _L4; else goto _L3
_L3:
	}

	public static String unescapeString(String s)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #84  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            243
		{
			String s1 = zzd.unescape(s);
	//    3    7:aload_0         
	//    4    8:invokestatic    #137 <Method String zzd.unescape(String)>
	//    5   11:astore_3        
			Matcher matcher = zzhc.matcher(((CharSequence) (s1)));
	//    6   12:getstatic       #21  <Field Pattern zzhc>
	//    7   15:aload_3         
	//    8   16:invokevirtual   #88  <Method Matcher Pattern.matcher(CharSequence)>
	//    9   19:astore          4
			s = null;
	//   10   21:aconst_null     
	//   11   22:astore_0        
			while(matcher.find()) 
	//*  12   23:aload           4
	//*  13   25:invokevirtual   #93  <Method boolean Matcher.find()>
	//*  14   28:ifeq            225
			{
				Object obj = ((Object) (s));
	//   15   31:aload_0         
	//   16   32:astore_2        
				if(s == null)
	//*  17   33:aload_0         
	//*  18   34:ifnonnull       45
					obj = ((Object) (new StringBuffer()));
	//   19   37:new             #95  <Class StringBuffer>
	//   20   40:dup             
	//   21   41:invokespecial   #96  <Method void StringBuffer()>
	//   22   44:astore_2        
				char c = matcher.group().charAt(1);
	//   23   45:aload           4
	//   24   47:invokevirtual   #100 <Method String Matcher.group()>
	//   25   50:iconst_1        
	//   26   51:invokevirtual   #104 <Method char String.charAt(int)>
	//   27   54:istore_1        
				if(c != '"')
	//*  28   55:iload_1         
	//*  29   56:bipush          34
	//*  30   58:icmpeq          211
				{
					if(c != '/')
	//*  31   61:iload_1         
	//*  32   62:bipush          47
	//*  33   64:icmpeq          197
					{
						if(c != '\\')
	//*  34   67:iload_1         
	//*  35   68:bipush          92
	//*  36   70:icmpeq          183
						{
							if(c != 'b')
	//*  37   73:iload_1         
	//*  38   74:bipush          98
	//*  39   76:icmpeq          169
							{
								if(c != 'f')
	//*  40   79:iload_1         
	//*  41   80:bipush          102
	//*  42   82:icmpeq          155
								{
									if(c != 'n')
	//*  43   85:iload_1         
	//*  44   86:bipush          110
	//*  45   88:icmpeq          141
									{
										if(c != 'r')
	//*  46   91:iload_1         
	//*  47   92:bipush          114
	//*  48   94:icmpeq          127
										{
											if(c == 't')
	//*  49   97:iload_1         
	//*  50   98:bipush          116
	//*  51  100:icmpne          117
											{
												matcher.appendReplacement(((StringBuffer) (obj)), "\t");
	//   52  103:aload           4
	//   53  105:aload_2         
	//   54  106:ldc1            #139 <String "\t">
	//   55  108:invokevirtual   #110 <Method Matcher Matcher.appendReplacement(StringBuffer, String)>
	//   56  111:pop             
												s = ((String) (obj));
	//   57  112:aload_2         
	//   58  113:astore_0        
											} else
	//*  59  114:goto            23
											{
												throw new IllegalStateException("Found an escaped character that should never be.");
	//   60  117:new             #141 <Class IllegalStateException>
	//   61  120:dup             
	//   62  121:ldc1            #143 <String "Found an escaped character that should never be.">
	//   63  123:invokespecial   #146 <Method void IllegalStateException(String)>
	//   64  126:athrow          
											}
										} else
										{
											matcher.appendReplacement(((StringBuffer) (obj)), "\r");
	//   65  127:aload           4
	//   66  129:aload_2         
	//   67  130:ldc1            #148 <String "\r">
	//   68  132:invokevirtual   #110 <Method Matcher Matcher.appendReplacement(StringBuffer, String)>
	//   69  135:pop             
											s = ((String) (obj));
	//   70  136:aload_2         
	//   71  137:astore_0        
										}
									} else
	//*  72  138:goto            23
									{
										matcher.appendReplacement(((StringBuffer) (obj)), "\n");
	//   73  141:aload           4
	//   74  143:aload_2         
	//   75  144:ldc1            #150 <String "\n">
	//   76  146:invokevirtual   #110 <Method Matcher Matcher.appendReplacement(StringBuffer, String)>
	//   77  149:pop             
										s = ((String) (obj));
	//   78  150:aload_2         
	//   79  151:astore_0        
									}
								} else
	//*  80  152:goto            23
								{
									matcher.appendReplacement(((StringBuffer) (obj)), "\f");
	//   81  155:aload           4
	//   82  157:aload_2         
	//   83  158:ldc1            #152 <String "\f">
	//   84  160:invokevirtual   #110 <Method Matcher Matcher.appendReplacement(StringBuffer, String)>
	//   85  163:pop             
									s = ((String) (obj));
	//   86  164:aload_2         
	//   87  165:astore_0        
								}
							} else
	//*  88  166:goto            23
							{
								matcher.appendReplacement(((StringBuffer) (obj)), "\b");
	//   89  169:aload           4
	//   90  171:aload_2         
	//   91  172:ldc1            #154 <String "\b">
	//   92  174:invokevirtual   #110 <Method Matcher Matcher.appendReplacement(StringBuffer, String)>
	//   93  177:pop             
								s = ((String) (obj));
	//   94  178:aload_2         
	//   95  179:astore_0        
							}
						} else
	//*  96  180:goto            23
						{
							matcher.appendReplacement(((StringBuffer) (obj)), "\\\\");
	//   97  183:aload           4
	//   98  185:aload_2         
	//   99  186:ldc1            #156 <String "\\\\">
	//  100  188:invokevirtual   #110 <Method Matcher Matcher.appendReplacement(StringBuffer, String)>
	//  101  191:pop             
							s = ((String) (obj));
	//  102  192:aload_2         
	//  103  193:astore_0        
						}
					} else
	//* 104  194:goto            23
					{
						matcher.appendReplacement(((StringBuffer) (obj)), "/");
	//  105  197:aload           4
	//  106  199:aload_2         
	//  107  200:ldc1            #158 <String "/">
	//  108  202:invokevirtual   #110 <Method Matcher Matcher.appendReplacement(StringBuffer, String)>
	//  109  205:pop             
						s = ((String) (obj));
	//  110  206:aload_2         
	//  111  207:astore_0        
					}
				} else
	//* 112  208:goto            23
				{
					matcher.appendReplacement(((StringBuffer) (obj)), "\"");
	//  113  211:aload           4
	//  114  213:aload_2         
	//  115  214:ldc1            #160 <String "\"">
	//  116  216:invokevirtual   #110 <Method Matcher Matcher.appendReplacement(StringBuffer, String)>
	//  117  219:pop             
					s = ((String) (obj));
	//  118  220:aload_2         
	//  119  221:astore_0        
				}
			}
	//* 120  222:goto            23
			if(s == null)
	//* 121  225:aload_0         
	//* 122  226:ifnonnull       231
			{
				return s1;
	//  123  229:aload_3         
	//  124  230:areturn         
			} else
			{
				matcher.appendTail(((StringBuffer) (s)));
	//  125  231:aload           4
	//  126  233:aload_0         
	//  127  234:invokevirtual   #128 <Method StringBuffer Matcher.appendTail(StringBuffer)>
	//  128  237:pop             
				return ((StringBuffer) (s)).toString();
	//  129  238:aload_0         
	//  130  239:invokevirtual   #131 <Method String StringBuffer.toString()>
	//  131  242:areturn         
			}
		} else
		{
			return s;
	//  132  243:aload_0         
	//  133  244:areturn         
		}
	}

	private static final Pattern zzhc = Pattern.compile("\\\\.");
	private static final Pattern zzhd = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

	static 
	{
	//    0    0:ldc1            #13  <String "\\\\.">
	//    1    2:invokestatic    #19  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #21  <Field Pattern zzhc>
	//    3    8:ldc1            #23  <String "[\\\\\"/\b\f\n\r\t]">
	//    4   10:invokestatic    #19  <Method Pattern Pattern.compile(String)>
	//    5   13:putstatic       #25  <Field Pattern zzhd>
	//*   6   16:return          
	}
}
