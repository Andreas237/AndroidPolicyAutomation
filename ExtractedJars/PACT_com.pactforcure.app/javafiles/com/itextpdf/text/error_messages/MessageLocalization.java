// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.error_messages;

import com.itextpdf.text.io.StreamUtil;
import java.io.*;
import java.util.HashMap;

public final class MessageLocalization
{

	private MessageLocalization()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	public static String getComposedMessage(String s, int i)
	{
		return getComposedMessage(s, new Object[] {
			String.valueOf(i), null, null, null
		});
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:anewarray       Object[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:iload_1         
	//    6    8:invokestatic    #39  <Method String String.valueOf(int)>
	//    7   11:aastore         
	//    8   12:dup             
	//    9   13:iconst_1        
	//   10   14:aconst_null     
	//   11   15:aastore         
	//   12   16:dup             
	//   13   17:iconst_2        
	//   14   18:aconst_null     
	//   15   19:aastore         
	//   16   20:dup             
	//   17   21:iconst_3        
	//   18   22:aconst_null     
	//   19   23:aastore         
	//   20   24:invokestatic    #42  <Method String getComposedMessage(String, Object[])>
	//   21   27:areturn         
	}

	public static transient String getComposedMessage(String s, Object aobj[])
	{
		s = getMessage(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #46  <Method String getMessage(String)>
	//    2    4:astore_0        
		String s1 = s;
	//    3    5:aload_0         
	//    4    6:astore          5
		if(aobj != null)
	//*   5    8:aload_1         
	//*   6    9:ifnull          91
		{
			int j = 1;
	//    7   12:iconst_1        
	//    8   13:istore_3        
			int k = aobj.length;
	//    9   14:aload_1         
	//   10   15:arraylength     
	//   11   16:istore          4
			int i = 0;
	//   12   18:iconst_0        
	//   13   19:istore_2        
			do
			{
				s1 = s;
	//   14   20:aload_0         
	//   15   21:astore          5
				if(i >= k)
					break;
	//   16   23:iload_2         
	//   17   24:iload           4
	//   18   26:icmpge          91
				Object obj = aobj[i];
	//   19   29:aload_1         
	//   20   30:iload_2         
	//   21   31:aaload          
	//   22   32:astore          6
				s1 = s;
	//   23   34:aload_0         
	//   24   35:astore          5
				if(obj != null)
	//*  25   37:aload           6
	//*  26   39:ifnull          77
					s1 = s.replace(((CharSequence) ((new StringBuilder()).append("{").append(j).append("}").toString())), ((CharSequence) (obj.toString())));
	//   27   42:aload_0         
	//   28   43:new             #48  <Class StringBuilder>
	//   29   46:dup             
	//   30   47:invokespecial   #49  <Method void StringBuilder()>
	//   31   50:ldc1            #51  <String "{">
	//   32   52:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   33   55:iload_3         
	//   34   56:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   35   59:ldc1            #60  <String "}">
	//   36   61:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   37   64:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   38   67:aload           6
	//   39   69:invokevirtual   #65  <Method String Object.toString()>
	//   40   72:invokevirtual   #69  <Method String String.replace(CharSequence, CharSequence)>
	//   41   75:astore          5
				j++;
	//   42   77:iload_3         
	//   43   78:iconst_1        
	//   44   79:iadd            
	//   45   80:istore_3        
				i++;
	//   46   81:iload_2         
	//   47   82:iconst_1        
	//   48   83:iadd            
	//   49   84:istore_2        
				s = s1;
	//   50   85:aload           5
	//   51   87:astore_0        
			} while(true);
	//   52   88:goto            20
		}
		return s1;
	//   53   91:aload           5
	//   54   93:areturn         
	}

	private static HashMap getLanguageMessages(String s, String s1)
		throws IOException
	{
		Object obj2;
		Object obj3;
		obj2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		if(s == null)
	//*   2    3:aload_0         
	//*   3    4:ifnonnull       17
			throw new IllegalArgumentException("The language cannot be null.");
	//    4    7:new             #73  <Class IllegalArgumentException>
	//    5   10:dup             
	//    6   11:ldc1            #75  <String "The language cannot be null.">
	//    7   13:invokespecial   #78  <Method void IllegalArgumentException(String)>
	//    8   16:athrow          
		obj3 = null;
	//    9   17:aconst_null     
	//   10   18:astore          5
		if(s1 == null) goto _L2; else goto _L1
	//   11   20:aload_1         
	//   12   21:ifnull          120
_L1:
		Object obj = ((Object) (obj3));
	//   13   24:aload           5
	//   14   26:astore_2        
		Object obj1 = ((Object) ((new StringBuilder()).append(s).append("_").append(s1).append(".lng").toString()));
	//   15   27:new             #48  <Class StringBuilder>
	//   16   30:dup             
	//   17   31:invokespecial   #49  <Method void StringBuilder()>
	//   18   34:aload_0         
	//   19   35:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:ldc1            #80  <String "_">
	//   21   40:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   22   43:aload_1         
	//   23   44:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   24   47:ldc1            #82  <String ".lng">
	//   25   49:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   26   52:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   27   55:astore_3        
_L10:
		obj = ((Object) (obj3));
	//   28   56:aload           5
	//   29   58:astore_2        
		obj1 = ((Object) (StreamUtil.getResourceStream((new StringBuilder()).append("com/itextpdf/text/l10n/error/").append(((String) (obj1))).toString(), ((Object) (new MessageLocalization())).getClass().getClassLoader())));
	//   30   59:new             #48  <Class StringBuilder>
	//   31   62:dup             
	//   32   63:invokespecial   #49  <Method void StringBuilder()>
	//   33   66:ldc1            #8   <String "com/itextpdf/text/l10n/error/">
	//   34   68:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   35   71:aload_3         
	//   36   72:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   37   75:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   38   78:new             #2   <Class MessageLocalization>
	//   39   81:dup             
	//   40   82:invokespecial   #83  <Method void MessageLocalization()>
	//   41   85:invokevirtual   #87  <Method Class Object.getClass()>
	//   42   88:invokevirtual   #93  <Method ClassLoader Class.getClassLoader()>
	//   43   91:invokestatic    #99  <Method InputStream StreamUtil.getResourceStream(String, ClassLoader)>
	//   44   94:astore_3        
		if(obj1 == null) goto _L4; else goto _L3
	//   45   95:aload_3         
	//   46   96:ifnull          146
_L3:
		obj = obj1;
	//   47   99:aload_3         
	//   48  100:astore_2        
		s1 = ((String) (readLanguageStream(((InputStream) (obj1)))));
	//   49  101:aload_3         
	//   50  102:invokestatic    #103 <Method HashMap readLanguageStream(InputStream)>
	//   51  105:astore_1        
		s = s1;
	//   52  106:aload_1         
	//   53  107:astore_0        
		if(obj1 != null)
	//*  54  108:aload_3         
	//*  55  109:ifnull          118
		{
			try
			{
				((InputStream) (obj1)).close();
	//   56  112:aload_3         
	//   57  113:invokevirtual   #108 <Method void InputStream.close()>
			}
	//*  58  116:aload_1         
	//*  59  117:astore_0        
	//*  60  118:aload_0         
	//*  61  119:areturn         
	//*  62  120:aload           5
	//*  63  122:astore_2        
	//*  64  123:new             #48  <Class StringBuilder>
	//*  65  126:dup             
	//*  66  127:invokespecial   #49  <Method void StringBuilder()>
	//*  67  130:aload_0         
	//*  68  131:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//*  69  134:ldc1            #82  <String ".lng">
	//*  70  136:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//*  71  139:invokevirtual   #64  <Method String StringBuilder.toString()>
	//*  72  142:astore_3        
	//*  73  143:goto            56
	//*  74  146:aload_1         
	//*  75  147:ifnonnull       166
	//*  76  150:aload           4
	//*  77  152:astore_0        
	//*  78  153:aload_3         
	//*  79  154:ifnull          118
	//*  80  157:aload_3         
	//*  81  158:invokevirtual   #108 <Method void InputStream.close()>
	//*  82  161:aconst_null     
	//*  83  162:areturn         
	//*  84  163:astore_0        
	//*  85  164:aconst_null     
	//*  86  165:areturn         
	//*  87  166:aload_3         
	//*  88  167:astore_2        
	//*  89  168:new             #48  <Class StringBuilder>
	//*  90  171:dup             
	//*  91  172:invokespecial   #49  <Method void StringBuilder()>
	//*  92  175:aload_0         
	//*  93  176:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//*  94  179:ldc1            #82  <String ".lng">
	//*  95  181:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//*  96  184:invokevirtual   #64  <Method String StringBuilder.toString()>
	//*  97  187:astore_0        
	//*  98  188:aload_3         
	//*  99  189:astore_2        
	//* 100  190:new             #48  <Class StringBuilder>
	//* 101  193:dup             
	//* 102  194:invokespecial   #49  <Method void StringBuilder()>
	//* 103  197:ldc1            #8   <String "com/itextpdf/text/l10n/error/">
	//* 104  199:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//* 105  202:aload_0         
	//* 106  203:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//* 107  206:invokevirtual   #64  <Method String StringBuilder.toString()>
	//* 108  209:new             #2   <Class MessageLocalization>
	//* 109  212:dup             
	//* 110  213:invokespecial   #83  <Method void MessageLocalization()>
	//* 111  216:invokevirtual   #87  <Method Class Object.getClass()>
	//* 112  219:invokevirtual   #93  <Method ClassLoader Class.getClassLoader()>
	//* 113  222:invokestatic    #99  <Method InputStream StreamUtil.getResourceStream(String, ClassLoader)>
	//* 114  225:astore_3        
	//* 115  226:aload_3         
	//* 116  227:ifnull          252
	//* 117  230:aload_3         
	//* 118  231:astore_2        
	//* 119  232:aload_3         
	//* 120  233:invokestatic    #103 <Method HashMap readLanguageStream(InputStream)>
	//* 121  236:astore_1        
	//* 122  237:aload_1         
	//* 123  238:astore_0        
	//* 124  239:aload_3         
	//* 125  240:ifnull          118
	//* 126  243:aload_3         
	//* 127  244:invokevirtual   #108 <Method void InputStream.close()>
	//* 128  247:aload_1         
	//* 129  248:areturn         
	//* 130  249:astore_0        
	//* 131  250:aload_1         
	//* 132  251:areturn         
	//* 133  252:aload           4
	//* 134  254:astore_0        
	//* 135  255:aload_3         
	//* 136  256:ifnull          118
	//* 137  259:aload_3         
	//* 138  260:invokevirtual   #108 <Method void InputStream.close()>
	//* 139  263:aconst_null     
	//* 140  264:areturn         
	//* 141  265:astore_0        
	//* 142  266:aconst_null     
	//* 143  267:areturn         
	//* 144  268:astore_0        
	//* 145  269:aload_2         
	//* 146  270:ifnull          277
	//* 147  273:aload_2         
	//* 148  274:invokevirtual   #108 <Method void InputStream.close()>
	//* 149  277:aload_0         
	//* 150  278:athrow          
			// Misplaced declaration of an exception variable
			catch(String s)
	//* 151  279:astore_0        
			{
				return ((HashMap) (s1));
	//  152  280:aload_1         
	//  153  281:areturn         
			}
			s = s1;
		}
		return ((HashMap) (s));
_L2:
		obj = ((Object) (obj3));
		obj1 = ((Object) ((new StringBuilder()).append(s).append(".lng").toString()));
		continue; /* Loop/switch isn't completed */
_L4:
		if(s1 != null)
			break; /* Loop/switch isn't completed */
		s = ((String) (obj2));
		if(obj1 != null)
		{
			try
			{
				((InputStream) (obj1)).close();
			}
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				return null;
			}
			return null;
		}
		if(true) goto _L6; else goto _L5
_L6:
		break MISSING_BLOCK_LABEL_118;
_L5:
		obj = obj1;
		s = (new StringBuilder()).append(s).append(".lng").toString();
		obj = obj1;
		obj1 = ((Object) (StreamUtil.getResourceStream((new StringBuilder()).append("com/itextpdf/text/l10n/error/").append(s).toString(), ((Object) (new MessageLocalization())).getClass().getClassLoader())));
		if(obj1 == null)
			break; /* Loop/switch isn't completed */
		obj = obj1;
		s1 = ((String) (readLanguageStream(((InputStream) (obj1)))));
		s = s1;
		if(obj1 != null)
		{
			try
			{
				((InputStream) (obj1)).close();
			}
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				return ((HashMap) (s1));
			}
			return ((HashMap) (s1));
		}
		if(true) goto _L8; else goto _L7
_L8:
		break MISSING_BLOCK_LABEL_118;
_L7:
		s = ((String) (obj2));
		if(obj1 != null)
		{
			try
			{
				((InputStream) (obj1)).close();
			}
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				return null;
			}
			return null;
		} else
		{
			break MISSING_BLOCK_LABEL_118;
		}
		s;
		if(obj != null)
			try
			{
				((InputStream) (obj)).close();
			}
			// Misplaced declaration of an exception variable
			catch(String s1) { }
	//  154  282:astore_1        
		throw s;
		if(true) goto _L10; else goto _L9
	//  155  283:goto            277
_L9:
	}

	public static String getMessage(String s)
	{
		return getMessage(s, true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #114 <Method String getMessage(String, boolean)>
	//    3    5:areturn         
	}

	public static String getMessage(String s, boolean flag)
	{
		Object obj = ((Object) (currentLanguage));
	//    0    0:getstatic       #116 <Field HashMap currentLanguage>
	//    1    3:astore_2        
		if(obj == null) goto _L2; else goto _L1
	//    2    4:aload_2         
	//    3    5:ifnull          23
_L1:
		obj = ((Object) ((String)((HashMap) (obj)).get(((Object) (s)))));
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #120 <Method Object HashMap.get(Object)>
	//    7   13:checkcast       #35  <Class String>
	//    8   16:astore_2        
		if(obj == null) goto _L2; else goto _L3
	//    9   17:aload_2         
	//   10   18:ifnull          23
_L3:
		return ((String) (obj));
	//   11   21:aload_2         
	//   12   22:areturn         
_L2:
		String s1;
		if(!flag)
			break; /* Loop/switch isn't completed */
	//   13   23:iload_1         
	//   14   24:ifeq            44
		s1 = (String)defaultLanguage.get(((Object) (s)));
	//   15   27:getstatic       #23  <Field HashMap defaultLanguage>
	//   16   30:aload_0         
	//   17   31:invokevirtual   #120 <Method Object HashMap.get(Object)>
	//   18   34:checkcast       #35  <Class String>
	//   19   37:astore_3        
		obj = ((Object) (s1));
	//   20   38:aload_3         
	//   21   39:astore_2        
		if(s1 != null) goto _L3; else goto _L4
	//   22   40:aload_3         
	//   23   41:ifnonnull       21
_L4:
		return (new StringBuilder()).append("No message found for ").append(s).toString();
	//   24   44:new             #48  <Class StringBuilder>
	//   25   47:dup             
	//   26   48:invokespecial   #49  <Method void StringBuilder()>
	//   27   51:ldc1            #122 <String "No message found for ">
	//   28   53:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   29   56:aload_0         
	//   30   57:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   31   60:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   32   63:areturn         
	}

	private static HashMap readLanguageStream(InputStream inputstream)
		throws IOException
	{
		return readLanguageStream(((Reader) (new InputStreamReader(inputstream, "UTF-8"))));
	//    0    0:new             #124 <Class InputStreamReader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #126 <String "UTF-8">
	//    4    7:invokespecial   #129 <Method void InputStreamReader(InputStream, String)>
	//    5   10:invokestatic    #132 <Method HashMap readLanguageStream(Reader)>
	//    6   13:areturn         
	}

	private static HashMap readLanguageStream(Reader reader)
		throws IOException
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #18  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void HashMap()>
	//    3    7:astore_2        
		reader = ((Reader) (new BufferedReader(reader)));
	//    4    8:new             #135 <Class BufferedReader>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #138 <Method void BufferedReader(Reader)>
	//    8   16:astore_0        
		do
		{
			String s = ((BufferedReader) (reader)).readLine();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #141 <Method String BufferedReader.readLine()>
	//   11   21:astore_3        
			if(s == null)
				break;
	//   12   22:aload_3         
	//   13   23:ifnull          75
			int i = s.indexOf('=');
	//   14   26:aload_3         
	//   15   27:bipush          61
	//   16   29:invokevirtual   #145 <Method int String.indexOf(int)>
	//   17   32:istore_1        
			if(i >= 0)
	//*  18   33:iload_1         
	//*  19   34:iflt            17
			{
				String s1 = s.substring(0, i).trim();
	//   20   37:aload_3         
	//   21   38:iconst_0        
	//   22   39:iload_1         
	//   23   40:invokevirtual   #149 <Method String String.substring(int, int)>
	//   24   43:invokevirtual   #152 <Method String String.trim()>
	//   25   46:astore          4
				if(!s1.startsWith("#"))
	//*  26   48:aload           4
	//*  27   50:ldc1            #154 <String "#">
	//*  28   52:invokevirtual   #158 <Method boolean String.startsWith(String)>
	//*  29   55:ifne            17
					hashmap.put(((Object) (s1)), ((Object) (s.substring(i + 1))));
	//   30   58:aload_2         
	//   31   59:aload           4
	//   32   61:aload_3         
	//   33   62:iload_1         
	//   34   63:iconst_1        
	//   35   64:iadd            
	//   36   65:invokevirtual   #160 <Method String String.substring(int)>
	//   37   68:invokevirtual   #164 <Method Object HashMap.put(Object, Object)>
	//   38   71:pop             
			}
		} while(true);
	//   39   72:goto            17
		return hashmap;
	//   40   75:aload_2         
	//   41   76:areturn         
	}

	public static boolean setLanguage(String s, String s1)
		throws IOException
	{
		s = ((String) (getLanguageMessages(s, s1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #29  <Method HashMap getLanguageMessages(String, String)>
	//    3    5:astore_0        
		if(s == null)
	//*   4    6:aload_0         
	//*   5    7:ifnonnull       12
		{
			return false;
	//    6   10:iconst_0        
	//    7   11:ireturn         
		} else
		{
			currentLanguage = ((HashMap) (s));
	//    8   12:aload_0         
	//    9   13:putstatic       #116 <Field HashMap currentLanguage>
			return true;
	//   10   16:iconst_1        
	//   11   17:ireturn         
		}
	}

	public static void setMessages(Reader reader)
		throws IOException
	{
		currentLanguage = readLanguageStream(reader);
	//    0    0:aload_0         
	//    1    1:invokestatic    #132 <Method HashMap readLanguageStream(Reader)>
	//    2    4:putstatic       #116 <Field HashMap currentLanguage>
	//    3    7:return          
	}

	private static final String BASE_PATH = "com/itextpdf/text/l10n/error/";
	private static HashMap currentLanguage;
	private static HashMap defaultLanguage;

	static 
	{
		defaultLanguage = new HashMap();
	//    0    0:new             #18  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void HashMap()>
	//    3    7:putstatic       #23  <Field HashMap defaultLanguage>
		try
		{
			defaultLanguage = getLanguageMessages("en", ((String) (null)));
	//    4   10:ldc1            #25  <String "en">
	//    5   12:aconst_null     
	//    6   13:invokestatic    #29  <Method HashMap getLanguageMessages(String, String)>
	//    7   16:putstatic       #23  <Field HashMap defaultLanguage>
		}
	//*   8   19:getstatic       #23  <Field HashMap defaultLanguage>
	//*   9   22:ifnonnull       35
	//*  10   25:new             #18  <Class HashMap>
	//*  11   28:dup             
	//*  12   29:invokespecial   #21  <Method void HashMap()>
	//*  13   32:putstatic       #23  <Field HashMap defaultLanguage>
	//*  14   35:return          
		catch(Exception exception) { }
	//   15   36:astore_0        
		if(defaultLanguage == null)
			defaultLanguage = new HashMap();
	//*  16   37:goto            19
	}
}
