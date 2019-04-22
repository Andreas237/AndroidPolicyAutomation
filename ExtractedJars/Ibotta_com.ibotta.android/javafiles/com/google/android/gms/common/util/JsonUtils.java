// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.newrelic.agent.android.instrumentation.JSONArrayInstrumentation;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.*;

// Referenced classes of package com.google.android.gms.common.util:
//			UnicodeUtils

public final class JsonUtils
{

	private JsonUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:return          
	}

	public static boolean areJsonStringsEquivalent(String s, String s1)
	{
		if(s == null && s1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       10
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       10
			return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
		if(s != null)
	//*   6   10:aload_0         
	//*   7   11:ifnull          48
		{
			if(s1 == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       20
				return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
			boolean flag;
			try
			{
				flag = areJsonValuesEquivalent(((Object) (JSONObjectInstrumentation.init(s))), ((Object) (JSONObjectInstrumentation.init(s1))));
	//   12   20:aload_0         
	//   13   21:invokestatic    #39  <Method JSONObject JSONObjectInstrumentation.init(String)>
	//   14   24:aload_1         
	//   15   25:invokestatic    #39  <Method JSONObject JSONObjectInstrumentation.init(String)>
	//   16   28:invokestatic    #43  <Method boolean areJsonValuesEquivalent(Object, Object)>
	//   17   31:istore_2        
			}
	//*  18   32:iload_2         
	//*  19   33:ireturn         
	//*  20   34:aload_0         
	//*  21   35:invokestatic    #48  <Method JSONArray JSONArrayInstrumentation.init(String)>
	//*  22   38:aload_1         
	//*  23   39:invokestatic    #48  <Method JSONArray JSONArrayInstrumentation.init(String)>
	//*  24   42:invokestatic    #43  <Method boolean areJsonValuesEquivalent(Object, Object)>
	//*  25   45:istore_2        
	//*  26   46:iload_2         
	//*  27   47:ireturn         
	//*  28   48:iconst_0        
	//*  29   49:ireturn         
			// Misplaced declaration of an exception variable
			catch(JSONException jsonexception)
			{
				JSONException jsonexception;
				try
				{
					flag = areJsonValuesEquivalent(((Object) (JSONArrayInstrumentation.init(s))), ((Object) (JSONArrayInstrumentation.init(s1))));
				}
	//*  30   50:astore_3        
	//*  31   51:goto            34
				// Misplaced declaration of an exception variable
				catch(String s)
	//*  32   54:astore_0        
				{
					return false;
	//   33   55:iconst_0        
	//   34   56:ireturn         
				}
				return flag;
			}
			return flag;
		} else
		{
			return false;
		}
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
	//*  13   21:instanceof      #50  <Class JSONObject>
	//*  14   24:ifeq            120
	//*  15   27:aload_1         
	//*  16   28:instanceof      #50  <Class JSONObject>
	//*  17   31:ifeq            120
			{
				obj = ((Object) ((JSONObject)obj));
	//   18   34:aload_0         
	//   19   35:checkcast       #50  <Class JSONObject>
	//   20   38:astore_0        
				obj1 = ((Object) ((JSONObject)obj1));
	//   21   39:aload_1         
	//   22   40:checkcast       #50  <Class JSONObject>
	//   23   43:astore_1        
				if(((JSONObject) (obj)).length() != ((JSONObject) (obj1)).length())
	//*  24   44:aload_0         
	//*  25   45:invokevirtual   #54  <Method int JSONObject.length()>
	//*  26   48:aload_1         
	//*  27   49:invokevirtual   #54  <Method int JSONObject.length()>
	//*  28   52:icmpeq          57
					return false;
	//   29   55:iconst_0        
	//   30   56:ireturn         
				for(Iterator iterator = ((JSONObject) (obj)).keys(); iterator.hasNext();)
	//*  31   57:aload_0         
	//*  32   58:invokevirtual   #58  <Method Iterator JSONObject.keys()>
	//*  33   61:astore          4
	//*  34   63:aload           4
	//*  35   65:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//*  36   70:ifeq            118
				{
					String s = (String)iterator.next();
	//   37   73:aload           4
	//   38   75:invokeinterface #68  <Method Object Iterator.next()>
	//   39   80:checkcast       #70  <Class String>
	//   40   83:astore          5
					if(!((JSONObject) (obj1)).has(s))
	//*  41   85:aload_1         
	//*  42   86:aload           5
	//*  43   88:invokevirtual   #74  <Method boolean JSONObject.has(String)>
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
	//   49   99:invokevirtual   #78  <Method Object JSONObject.get(String)>
	//   50  102:aload_1         
	//   51  103:aload           5
	//   52  105:invokevirtual   #78  <Method Object JSONObject.get(String)>
	//   53  108:invokestatic    #43  <Method boolean areJsonValuesEquivalent(Object, Object)>
	//   54  111:istore_3        
					}
	//*  55  112:iload_3         
	//*  56  113:ifne            63
	//*  57  116:iconst_0        
	//*  58  117:ireturn         
	//*  59  118:iconst_1        
	//*  60  119:ireturn         
	//*  61  120:aload_0         
	//*  62  121:instanceof      #80  <Class JSONArray>
	//*  63  124:ifeq            196
	//*  64  127:aload_1         
	//*  65  128:instanceof      #80  <Class JSONArray>
	//*  66  131:ifeq            196
	//*  67  134:aload_0         
	//*  68  135:checkcast       #80  <Class JSONArray>
	//*  69  138:astore_0        
	//*  70  139:aload_1         
	//*  71  140:checkcast       #80  <Class JSONArray>
	//*  72  143:astore_1        
	//*  73  144:aload_0         
	//*  74  145:invokevirtual   #81  <Method int JSONArray.length()>
	//*  75  148:aload_1         
	//*  76  149:invokevirtual   #81  <Method int JSONArray.length()>
	//*  77  152:icmpeq          157
	//*  78  155:iconst_0        
	//*  79  156:ireturn         
	//*  80  157:iconst_0        
	//*  81  158:istore_2        
	//*  82  159:iload_2         
	//*  83  160:aload_0         
	//*  84  161:invokevirtual   #81  <Method int JSONArray.length()>
	//*  85  164:icmpge          194
	//*  86  167:aload_0         
	//*  87  168:iload_2         
	//*  88  169:invokevirtual   #84  <Method Object JSONArray.get(int)>
	//*  89  172:aload_1         
	//*  90  173:iload_2         
	//*  91  174:invokevirtual   #84  <Method Object JSONArray.get(int)>
	//*  92  177:invokestatic    #43  <Method boolean areJsonValuesEquivalent(Object, Object)>
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
	//* 107  198:invokevirtual   #88  <Method boolean Object.equals(Object)>
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
		Object obj = ((Object) (s));
	//    0    0:aload_0         
	//    1    1:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (s)))) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:invokestatic    #96  <Method boolean TextUtils.isEmpty(CharSequence)>
	//    4    6:ifne            201
_L1:
		Matcher matcher;
		matcher = zzaaf.matcher(((CharSequence) (s)));
	//    5    9:getstatic       #25  <Field Pattern zzaaf>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #100 <Method Matcher Pattern.matcher(CharSequence)>
	//    8   16:astore          4
		obj = null;
	//    9   18:aconst_null     
	//   10   19:astore_2        
_L17:
		if(!matcher.find()) goto _L4; else goto _L3
	//   11   20:aload           4
	//   12   22:invokevirtual   #105 <Method boolean Matcher.find()>
	//   13   25:ifeq            183
_L3:
		char c;
		Object obj1;
		obj1 = obj;
	//   14   28:aload_2         
	//   15   29:astore_3        
		if(obj == null)
	//*  16   30:aload_2         
	//*  17   31:ifnonnull       42
			obj1 = ((Object) (new StringBuffer()));
	//   18   34:new             #107 <Class StringBuffer>
	//   19   37:dup             
	//   20   38:invokespecial   #108 <Method void StringBuffer()>
	//   21   41:astore_3        
		c = matcher.group().charAt(0);
	//   22   42:aload           4
	//   23   44:invokevirtual   #112 <Method String Matcher.group()>
	//   24   47:iconst_0        
	//   25   48:invokevirtual   #116 <Method char String.charAt(int)>
	//   26   51:istore_1        
		if(c == '"') goto _L6; else goto _L5
	//   27   52:iload_1         
	//   28   53:bipush          34
	//   29   55:icmpeq          177
_L5:
		if(c == '/') goto _L8; else goto _L7
	//   30   58:iload_1         
	//   31   59:bipush          47
	//   32   61:icmpeq          171
_L7:
		if(c == '\\') goto _L10; else goto _L9
	//   33   64:iload_1         
	//   34   65:bipush          92
	//   35   67:icmpeq          165
_L9:
		c;
	//   36   70:iload_1         
		JVM INSTR tableswitch 8 10: default 96
	//	               8 159
	//	               9 143
	//	               10 137;
	//   37   71:tableswitch     8 10: default 96
	//	               8 159
	//	               9 143
	//	               10 137
		   goto _L11 _L12 _L13 _L14
_L11:
		switch(c)
	//*  38   96:iload_1         
		{
	//*  39   97:tableswitch     12 13: default 120
	//	               12 131
	//	               13 125
		default:
			obj = obj1;
	//   40  120:aload_3         
	//   41  121:astore_2        
			break;

	//*  42  122:goto            20
		case 13: // '\r'
			obj = "\\\\r";
	//   43  125:ldc1            #118 <String "\\\\r">
	//   44  127:astore_2        
			break; /* Loop/switch isn't completed */
	//   45  128:goto            146

		case 12: // '\f'
			obj = "\\\\f";
	//   46  131:ldc1            #120 <String "\\\\f">
	//   47  133:astore_2        
			break; /* Loop/switch isn't completed */
	//   48  134:goto            146
		}
		continue; /* Loop/switch isn't completed */
_L14:
		obj = "\\\\n";
	//   49  137:ldc1            #122 <String "\\\\n">
	//   50  139:astore_2        
		break; /* Loop/switch isn't completed */
	//   51  140:goto            146
_L13:
		obj = "\\\\t";
	//   52  143:ldc1            #124 <String "\\\\t">
	//   53  145:astore_2        
_L15:
		matcher.appendReplacement(((StringBuffer) (obj1)), ((String) (obj)));
	//   54  146:aload           4
	//   55  148:aload_3         
	//   56  149:aload_2         
	//   57  150:invokevirtual   #128 <Method Matcher Matcher.appendReplacement(StringBuffer, String)>
	//   58  153:pop             
		obj = obj1;
	//   59  154:aload_3         
	//   60  155:astore_2        
		continue; /* Loop/switch isn't completed */
	//   61  156:goto            20
_L12:
		obj = "\\\\b";
	//   62  159:ldc1            #130 <String "\\\\b">
	//   63  161:astore_2        
		continue; /* Loop/switch isn't completed */
	//   64  162:goto            146
_L10:
		obj = "\\\\\\\\";
	//   65  165:ldc1            #132 <String "\\\\\\\\">
	//   66  167:astore_2        
		continue; /* Loop/switch isn't completed */
	//   67  168:goto            146
_L8:
		obj = "\\\\/";
	//   68  171:ldc1            #134 <String "\\\\/">
	//   69  173:astore_2        
		continue; /* Loop/switch isn't completed */
	//   70  174:goto            146
_L6:
		obj = "\\\\\\\"";
	//   71  177:ldc1            #136 <String "\\\\\\\"">
	//   72  179:astore_2        
		if(true) goto _L15; else goto _L4
	//   73  180:goto            146
_L4:
		if(obj == null)
	//*  74  183:aload_2         
	//*  75  184:ifnonnull       189
			return s;
	//   76  187:aload_0         
	//   77  188:areturn         
		matcher.appendTail(((StringBuffer) (obj)));
	//   78  189:aload           4
	//   79  191:aload_2         
	//   80  192:invokevirtual   #140 <Method StringBuffer Matcher.appendTail(StringBuffer)>
	//   81  195:pop             
		obj = ((Object) (((StringBuffer) (obj)).toString()));
	//   82  196:aload_2         
	//   83  197:invokevirtual   #143 <Method String StringBuffer.toString()>
	//   84  200:astore_2        
_L2:
		return ((String) (obj));
	//   85  201:aload_2         
	//   86  202:areturn         
		if(true) goto _L17; else goto _L16
_L16:
	}

	public static String unescapeString(String s)
	{
		Object obj = ((Object) (s));
	//    0    0:aload_0         
	//    1    1:astore_2        
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   2    2:aload_0         
	//*   3    3:invokestatic    #96  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4    6:ifne            191
		{
			String s1 = UnicodeUtils.unescape(s);
	//    5    9:aload_0         
	//    6   10:invokestatic    #149 <Method String UnicodeUtils.unescape(String)>
	//    7   13:astore_3        
			Matcher matcher = zzaae.matcher(((CharSequence) (s1)));
	//    8   14:getstatic       #21  <Field Pattern zzaae>
	//    9   17:aload_3         
	//   10   18:invokevirtual   #100 <Method Matcher Pattern.matcher(CharSequence)>
	//   11   21:astore          4
			for(s = null; matcher.find(); s = ((String) (obj)))
	//*  12   23:aconst_null     
	//*  13   24:astore_0        
	//*  14   25:aload           4
	//*  15   27:invokevirtual   #105 <Method boolean Matcher.find()>
	//*  16   30:ifeq            173
			{
				obj = ((Object) (s));
	//   17   33:aload_0         
	//   18   34:astore_2        
				if(s == null)
	//*  19   35:aload_0         
	//*  20   36:ifnonnull       47
					obj = ((Object) (new StringBuffer()));
	//   21   39:new             #107 <Class StringBuffer>
	//   22   42:dup             
	//   23   43:invokespecial   #108 <Method void StringBuffer()>
	//   24   46:astore_2        
				char c = matcher.group().charAt(1);
	//   25   47:aload           4
	//   26   49:invokevirtual   #112 <Method String Matcher.group()>
	//   27   52:iconst_1        
	//   28   53:invokevirtual   #116 <Method char String.charAt(int)>
	//   29   56:istore_1        
				if(c != '"')
	//*  30   57:iload_1         
	//*  31   58:bipush          34
	//*  32   60:icmpeq          157
				{
					if(c != '/')
	//*  33   63:iload_1         
	//*  34   64:bipush          47
	//*  35   66:icmpeq          151
					{
						if(c != '\\')
	//*  36   69:iload_1         
	//*  37   70:bipush          92
	//*  38   72:icmpeq          145
						{
							if(c != 'b')
	//*  39   75:iload_1         
	//*  40   76:bipush          98
	//*  41   78:icmpeq          139
							{
								if(c != 'f')
	//*  42   81:iload_1         
	//*  43   82:bipush          102
	//*  44   84:icmpeq          133
								{
									if(c != 'n')
	//*  45   87:iload_1         
	//*  46   88:bipush          110
	//*  47   90:icmpeq          127
									{
										if(c != 'r')
	//*  48   93:iload_1         
	//*  49   94:bipush          114
	//*  50   96:icmpeq          121
										{
											if(c == 't')
	//*  51   99:iload_1         
	//*  52  100:bipush          116
	//*  53  102:icmpne          111
												s = "\t";
	//   54  105:ldc1            #151 <String "\t">
	//   55  107:astore_0        
											else
	//*  56  108:goto            160
												throw new IllegalStateException("Found an escaped character that should never be.");
	//   57  111:new             #153 <Class IllegalStateException>
	//   58  114:dup             
	//   59  115:ldc1            #155 <String "Found an escaped character that should never be.">
	//   60  117:invokespecial   #158 <Method void IllegalStateException(String)>
	//   61  120:athrow          
										} else
										{
											s = "\r";
	//   62  121:ldc1            #160 <String "\r">
	//   63  123:astore_0        
										}
									} else
	//*  64  124:goto            160
									{
										s = "\n";
	//   65  127:ldc1            #162 <String "\n">
	//   66  129:astore_0        
									}
								} else
	//*  67  130:goto            160
								{
									s = "\f";
	//   68  133:ldc1            #164 <String "\f">
	//   69  135:astore_0        
								}
							} else
	//*  70  136:goto            160
							{
								s = "\b";
	//   71  139:ldc1            #166 <String "\b">
	//   72  141:astore_0        
							}
						} else
	//*  73  142:goto            160
						{
							s = "\\\\";
	//   74  145:ldc1            #168 <String "\\\\">
	//   75  147:astore_0        
						}
					} else
	//*  76  148:goto            160
					{
						s = "/";
	//   77  151:ldc1            #170 <String "/">
	//   78  153:astore_0        
					}
				} else
	//*  79  154:goto            160
				{
					s = "\"";
	//   80  157:ldc1            #172 <String "\"">
	//   81  159:astore_0        
				}
				matcher.appendReplacement(((StringBuffer) (obj)), s);
	//   82  160:aload           4
	//   83  162:aload_2         
	//   84  163:aload_0         
	//   85  164:invokevirtual   #128 <Method Matcher Matcher.appendReplacement(StringBuffer, String)>
	//   86  167:pop             
			}

	//   87  168:aload_2         
	//   88  169:astore_0        
	//*  89  170:goto            25
			if(s == null)
	//*  90  173:aload_0         
	//*  91  174:ifnonnull       179
				return s1;
	//   92  177:aload_3         
	//   93  178:areturn         
			matcher.appendTail(((StringBuffer) (s)));
	//   94  179:aload           4
	//   95  181:aload_0         
	//   96  182:invokevirtual   #140 <Method StringBuffer Matcher.appendTail(StringBuffer)>
	//   97  185:pop             
			obj = ((Object) (((StringBuffer) (s)).toString()));
	//   98  186:aload_0         
	//   99  187:invokevirtual   #143 <Method String StringBuffer.toString()>
	//  100  190:astore_2        
		}
		return ((String) (obj));
	//  101  191:aload_2         
	//  102  192:areturn         
	}

	private static final Pattern zzaae = Pattern.compile("\\\\.");
	private static final Pattern zzaaf = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

	static 
	{
	//    0    0:ldc1            #13  <String "\\\\.">
	//    1    2:invokestatic    #19  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #21  <Field Pattern zzaae>
	//    3    8:ldc1            #23  <String "[\\\\\"/\b\f\n\r\t]">
	//    4   10:invokestatic    #19  <Method Pattern Pattern.compile(String)>
	//    5   13:putstatic       #25  <Field Pattern zzaaf>
	//*   6   16:return          
	}
}
