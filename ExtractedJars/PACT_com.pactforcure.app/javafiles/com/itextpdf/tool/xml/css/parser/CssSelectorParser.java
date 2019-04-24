// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css.parser;

import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.css.CssSelectorItem;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CssSelectorParser
{
	static class CssAttributeSelector
		implements CssSelectorItem
	{

		public char getSeparator()
		{
			return '\0';
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getSpecificity()
		{
			return 256;
		//    0    0:sipush          256
		//    1    3:ireturn         
		}

		public boolean matches(Tag tag)
		{
			if(tag != null) goto _L2; else goto _L1
		//    0    0:aload_1         
		//    1    1:ifnonnull       6
_L1:
			return false;
		//    2    4:iconst_0        
		//    3    5:ireturn         
		//*   4    6:aload_1         
		//*   5    7:invokevirtual   #57  <Method Map Tag.getAttributes()>
		//*   6   10:aload_0         
		//*   7   11:getfield        #39  <Field String property>
		//*   8   14:invokeinterface #63  <Method Object Map.get(Object)>
		//*   9   19:checkcast       #25  <Class String>
		//*  10   22:astore_1        
_L2:
			if((tag = ((Tag) ((String)tag.getAttributes().get(((Object) (property)))))) == null) goto _L1; else goto _L3
		//   11   23:aload_1         
		//   12   24:ifnull          4
_L3:
			if(value == null)
		//*  13   27:aload_0         
		//*  14   28:getfield        #23  <Field String value>
		//*  15   31:ifnonnull       36
				return true;
		//   16   34:iconst_1        
		//   17   35:ireturn         
			matchSymbol;
		//   18   36:aload_0         
		//   19   37:getfield        #21  <Field char matchSymbol>
			JVM INSTR lookupswitch 6: default 100
		//		               0: 102
		//		               36: 159
		//		               42: 217
		//		               94: 146
		//		               124: 115
		//		               126: 172;
		//   20   40:lookupswitch    6: default 100
		//		               0: 102
		//		               36: 159
		//		               42: 217
		//		               94: 146
		//		               124: 115
		//		               126: 172
			   goto _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L7:
			continue; /* Loop/switch isn't completed */
_L4:
			return false;
		//   21  100:iconst_0        
		//   22  101:ireturn         
_L5:
			if(!((String) (tag)).equals(((Object) (value)))) goto _L1; else goto _L11
		//   23  102:aload_1         
		//   24  103:aload_0         
		//   25  104:getfield        #23  <Field String value>
		//   26  107:invokevirtual   #67  <Method boolean String.equals(Object)>
		//   27  110:ifeq            4
_L11:
			return true;
		//   28  113:iconst_1        
		//   29  114:ireturn         
_L9:
			if(!Pattern.compile(String.format("^%s-?", new Object[] {
				value
			})).matcher(((CharSequence) (tag))).find()) goto _L1; else goto _L12
		//   30  115:ldc1            #69  <String "^%s-?">
		//   31  117:iconst_1        
		//   32  118:anewarray       Object[]
		//   33  121:dup             
		//   34  122:iconst_0        
		//   35  123:aload_0         
		//   36  124:getfield        #23  <Field String value>
		//   37  127:aastore         
		//   38  128:invokestatic    #73  <Method String String.format(String, Object[])>
		//   39  131:invokestatic    #79  <Method Pattern Pattern.compile(String)>
		//   40  134:aload_1         
		//   41  135:invokevirtual   #83  <Method Matcher Pattern.matcher(CharSequence)>
		//   42  138:invokevirtual   #89  <Method boolean Matcher.find()>
		//   43  141:ifeq            4
_L12:
			return true;
		//   44  144:iconst_1        
		//   45  145:ireturn         
_L8:
			if(!((String) (tag)).startsWith(value)) goto _L1; else goto _L13
		//   46  146:aload_1         
		//   47  147:aload_0         
		//   48  148:getfield        #23  <Field String value>
		//   49  151:invokevirtual   #93  <Method boolean String.startsWith(String)>
		//   50  154:ifeq            4
_L13:
			return true;
		//   51  157:iconst_1        
		//   52  158:ireturn         
_L6:
			if(!((String) (tag)).endsWith(value)) goto _L1; else goto _L14
		//   53  159:aload_1         
		//   54  160:aload_0         
		//   55  161:getfield        #23  <Field String value>
		//   56  164:invokevirtual   #96  <Method boolean String.endsWith(String)>
		//   57  167:ifeq            4
_L14:
			return true;
		//   58  170:iconst_1        
		//   59  171:ireturn         
_L10:
			if(!Pattern.compile(String.format("(^%s\\s+)|(\\s+%s\\s+)|(\\s+%s$)", new Object[] {
				value, value, value
			})).matcher(((CharSequence) (tag))).find()) goto _L1; else goto _L15
		//   60  172:ldc1            #98  <String "(^%s\\s+)|(\\s+%s\\s+)|(\\s+%s$)">
		//   61  174:iconst_3        
		//   62  175:anewarray       Object[]
		//   63  178:dup             
		//   64  179:iconst_0        
		//   65  180:aload_0         
		//   66  181:getfield        #23  <Field String value>
		//   67  184:aastore         
		//   68  185:dup             
		//   69  186:iconst_1        
		//   70  187:aload_0         
		//   71  188:getfield        #23  <Field String value>
		//   72  191:aastore         
		//   73  192:dup             
		//   74  193:iconst_2        
		//   75  194:aload_0         
		//   76  195:getfield        #23  <Field String value>
		//   77  198:aastore         
		//   78  199:invokestatic    #73  <Method String String.format(String, Object[])>
		//   79  202:invokestatic    #79  <Method Pattern Pattern.compile(String)>
		//   80  205:aload_1         
		//   81  206:invokevirtual   #83  <Method Matcher Pattern.matcher(CharSequence)>
		//   82  209:invokevirtual   #89  <Method boolean Matcher.find()>
		//   83  212:ifeq            4
_L15:
			return true;
		//   84  215:iconst_1        
		//   85  216:ireturn         
			if(!((String) (tag)).contains(((CharSequence) (value)))) goto _L1; else goto _L16
		//   86  217:aload_1         
		//   87  218:aload_0         
		//   88  219:getfield        #23  <Field String value>
		//   89  222:invokevirtual   #102 <Method boolean String.contains(CharSequence)>
		//   90  225:ifeq            4
_L16:
			return true;
		//   91  228:iconst_1        
		//   92  229:ireturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #106 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #107 <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append('[').append(property);
		//    4    8:aload_1         
		//    5    9:bipush          91
		//    6   11:invokevirtual   #111 <Method StringBuilder StringBuilder.append(char)>
		//    7   14:aload_0         
		//    8   15:getfield        #39  <Field String property>
		//    9   18:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
		//   10   21:pop             
			if(matchSymbol != 0)
		//*  11   22:aload_0         
		//*  12   23:getfield        #21  <Field char matchSymbol>
		//*  13   26:ifeq            38
				stringbuilder.append(matchSymbol);
		//   14   29:aload_1         
		//   15   30:aload_0         
		//   16   31:getfield        #21  <Field char matchSymbol>
		//   17   34:invokevirtual   #111 <Method StringBuilder StringBuilder.append(char)>
		//   18   37:pop             
			if(value != null)
		//*  19   38:aload_0         
		//*  20   39:getfield        #23  <Field String value>
		//*  21   42:ifnull          69
				stringbuilder.append('=').append('"').append(value).append('"');
		//   22   45:aload_1         
		//   23   46:bipush          61
		//   24   48:invokevirtual   #111 <Method StringBuilder StringBuilder.append(char)>
		//   25   51:bipush          34
		//   26   53:invokevirtual   #111 <Method StringBuilder StringBuilder.append(char)>
		//   27   56:aload_0         
		//   28   57:getfield        #23  <Field String value>
		//   29   60:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
		//   30   63:bipush          34
		//   31   65:invokevirtual   #111 <Method StringBuilder StringBuilder.append(char)>
		//   32   68:pop             
			stringbuilder.append(']');
		//   33   69:aload_1         
		//   34   70:bipush          93
		//   35   72:invokevirtual   #111 <Method StringBuilder StringBuilder.append(char)>
		//   36   75:pop             
			return stringbuilder.toString();
		//   37   76:aload_1         
		//   38   77:invokevirtual   #116 <Method String StringBuilder.toString()>
		//   39   80:areturn         
		}

		private char matchSymbol;
		private String property;
		private String value;

		CssAttributeSelector(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			matchSymbol = '\0';
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #21  <Field char matchSymbol>
			value = null;
		//    5    9:aload_0         
		//    6   10:aconst_null     
		//    7   11:putfield        #23  <Field String value>
			int i = s.indexOf('=');
		//    8   14:aload_1         
		//    9   15:bipush          61
		//   10   17:invokevirtual   #29  <Method int String.indexOf(int)>
		//   11   20:istore_2        
			if(i == -1)
		//*  12   21:iload_2         
		//*  13   22:iconst_m1       
		//*  14   23:icmpne          42
			{
				property = s.substring(1, s.length() - 1);
		//   15   26:aload_0         
		//   16   27:aload_1         
		//   17   28:iconst_1        
		//   18   29:aload_1         
		//   19   30:invokevirtual   #33  <Method int String.length()>
		//   20   33:iconst_1        
		//   21   34:isub            
		//   22   35:invokevirtual   #37  <Method String String.substring(int, int)>
		//   23   38:putfield        #39  <Field String property>
				return;
		//   24   41:return          
			}
			if(s.charAt(i + 1) == '"')
		//*  25   42:aload_1         
		//*  26   43:iload_2         
		//*  27   44:iconst_1        
		//*  28   45:iadd            
		//*  29   46:invokevirtual   #43  <Method char String.charAt(int)>
		//*  30   49:bipush          34
		//*  31   51:icmpne          111
				value = s.substring(i + 2, s.length() - 2);
		//   32   54:aload_0         
		//   33   55:aload_1         
		//   34   56:iload_2         
		//   35   57:iconst_2        
		//   36   58:iadd            
		//   37   59:aload_1         
		//   38   60:invokevirtual   #33  <Method int String.length()>
		//   39   63:iconst_2        
		//   40   64:isub            
		//   41   65:invokevirtual   #37  <Method String String.substring(int, int)>
		//   42   68:putfield        #23  <Field String value>
			else
		//*  43   71:aload_0         
		//*  44   72:aload_1         
		//*  45   73:iload_2         
		//*  46   74:iconst_1        
		//*  47   75:isub            
		//*  48   76:invokevirtual   #43  <Method char String.charAt(int)>
		//*  49   79:putfield        #21  <Field char matchSymbol>
		//*  50   82:ldc1            #45  <String "~^$*|">
		//*  51   84:aload_0         
		//*  52   85:getfield        #21  <Field char matchSymbol>
		//*  53   88:invokevirtual   #29  <Method int String.indexOf(int)>
		//*  54   91:iconst_m1       
		//*  55   92:icmpne          131
		//*  56   95:aload_0         
		//*  57   96:iconst_0        
		//*  58   97:putfield        #21  <Field char matchSymbol>
		//*  59  100:aload_0         
		//*  60  101:aload_1         
		//*  61  102:iconst_1        
		//*  62  103:iload_2         
		//*  63  104:invokevirtual   #37  <Method String String.substring(int, int)>
		//*  64  107:putfield        #39  <Field String property>
		//*  65  110:return          
				value = s.substring(i + 1, s.length() - 1);
		//   66  111:aload_0         
		//   67  112:aload_1         
		//   68  113:iload_2         
		//   69  114:iconst_1        
		//   70  115:iadd            
		//   71  116:aload_1         
		//   72  117:invokevirtual   #33  <Method int String.length()>
		//   73  120:iconst_1        
		//   74  121:isub            
		//   75  122:invokevirtual   #37  <Method String String.substring(int, int)>
		//   76  125:putfield        #23  <Field String value>
			matchSymbol = s.charAt(i - 1);
			if("~^$*|".indexOf(((int) (matchSymbol))) == -1)
			{
				matchSymbol = '\0';
				property = s.substring(1, i);
				return;
			} else
		//*  77  128:goto            71
			{
				property = s.substring(1, i - 1);
		//   78  131:aload_0         
		//   79  132:aload_1         
		//   80  133:iconst_1        
		//   81  134:iload_2         
		//   82  135:iconst_1        
		//   83  136:isub            
		//   84  137:invokevirtual   #37  <Method String String.substring(int, int)>
		//   85  140:putfield        #39  <Field String property>
				return;
		//   86  143:return          
			}
		}
	}

	static class CssClassSelector
		implements CssSelectorItem
	{

		public char getSeparator()
		{
			return '\0';
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getSpecificity()
		{
			return 256;
		//    0    0:sipush          256
		//    1    3:ireturn         
		}

		public boolean matches(Tag tag)
		{
			tag = ((Tag) ((String)tag.getAttributes().get("class")));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #31  <Method Map Tag.getAttributes()>
		//    2    4:ldc1            #33  <String "class">
		//    3    6:invokeinterface #39  <Method Object Map.get(Object)>
		//    4   11:checkcast       #41  <Class String>
		//    5   14:astore_1        
			if(tag != null && ((String) (tag)).length() != 0)
		//*   6   15:aload_1         
		//*   7   16:ifnull          26
		//*   8   19:aload_1         
		//*   9   20:invokevirtual   #44  <Method int String.length()>
		//*  10   23:ifne            28
		//*  11   26:iconst_0        
		//*  12   27:ireturn         
			{
				tag = ((Tag) (((String) (tag)).split(" ")));
		//   13   28:aload_1         
		//   14   29:ldc1            #46  <String " ">
		//   15   31:invokevirtual   #50  <Method String[] String.split(String)>
		//   16   34:astore_1        
				int j = tag.length;
		//   17   35:aload_1         
		//   18   36:arraylength     
		//   19   37:istore_3        
				int i = 0;
		//   20   38:iconst_0        
		//   21   39:istore_2        
				while(i < j) 
		//*  22   40:iload_2         
		//*  23   41:iload_3         
		//*  24   42:icmpge          26
				{
					String s = ((String) (tag[i]));
		//   25   45:aload_1         
		//   26   46:iload_2         
		//   27   47:aaload          
		//   28   48:astore          4
					if(className.equals(((Object) (s.trim()))))
		//*  29   50:aload_0         
		//*  30   51:getfield        #18  <Field String className>
		//*  31   54:aload           4
		//*  32   56:invokevirtual   #54  <Method String String.trim()>
		//*  33   59:invokevirtual   #58  <Method boolean String.equals(Object)>
		//*  34   62:ifeq            67
						return true;
		//   35   65:iconst_1        
		//   36   66:ireturn         
					i++;
		//   37   67:iload_2         
		//   38   68:iconst_1        
		//   39   69:iadd            
		//   40   70:istore_2        
				}
			}
			return false;
		//*  41   71:goto            40
		}

		public String toString()
		{
			return (new StringBuilder()).append(".").append(className).toString();
		//    0    0:new             #61  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #62  <Method void StringBuilder()>
		//    3    7:ldc1            #64  <String ".">
		//    4    9:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//    5   12:aload_0         
		//    6   13:getfield        #18  <Field String className>
		//    7   16:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//    8   19:invokevirtual   #70  <Method String StringBuilder.toString()>
		//    9   22:areturn         
		}

		private String className;

		CssClassSelector(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			className = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field String className>
		//    5    9:return          
		}
	}

	static class CssIdSelector
		implements CssSelectorItem
	{

		public char getSeparator()
		{
			return '\0';
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getSpecificity()
		{
			return 0x10000;
		//    0    0:ldc1            #24  <Int 0x10000>
		//    1    2:ireturn         
		}

		public boolean matches(Tag tag)
		{
			tag = ((Tag) ((String)tag.getAttributes().get("id")));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #32  <Method Map Tag.getAttributes()>
		//    2    4:ldc1            #33  <String "id">
		//    3    6:invokeinterface #39  <Method Object Map.get(Object)>
		//    4   11:checkcast       #41  <Class String>
		//    5   14:astore_1        
			return tag != null && id.equals(((Object) (((String) (tag)).trim())));
		//    6   15:aload_1         
		//    7   16:ifnull          35
		//    8   19:aload_0         
		//    9   20:getfield        #18  <Field String id>
		//   10   23:aload_1         
		//   11   24:invokevirtual   #45  <Method String String.trim()>
		//   12   27:invokevirtual   #49  <Method boolean String.equals(Object)>
		//   13   30:ifeq            35
		//   14   33:iconst_1        
		//   15   34:ireturn         
		//   16   35:iconst_0        
		//   17   36:ireturn         
		}

		public String toString()
		{
			return (new StringBuilder()).append("#").append(id).toString();
		//    0    0:new             #52  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #53  <Method void StringBuilder()>
		//    3    7:ldc1            #55  <String "#">
		//    4    9:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
		//    5   12:aload_0         
		//    6   13:getfield        #18  <Field String id>
		//    7   16:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
		//    8   19:invokevirtual   #61  <Method String StringBuilder.toString()>
		//    9   22:areturn         
		}

		private String id;

		CssIdSelector(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			id = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field String id>
		//    5    9:return          
		}
	}

	static class CssPseudoSelector
		implements CssSelectorItem
	{

		public char getSeparator()
		{
			return '\0';
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getSpecificity()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean matches(Tag tag)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public String toString()
		{
			return selector;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field String selector>
		//    2    4:areturn         
		}

		private String selector;

		CssPseudoSelector(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			selector = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field String selector>
		//    5    9:return          
		}
	}

	static class CssSeparatorSelector
		implements CssSelectorItem
	{

		public char getSeparator()
		{
			return separator;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field char separator>
		//    2    4:ireturn         
		}

		public int getSpecificity()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean matches(Tag tag)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public String toString()
		{
			return String.valueOf(separator);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field char separator>
		//    2    4:invokestatic    #33  <Method String String.valueOf(char)>
		//    3    7:areturn         
		}

		private char separator;

		CssSeparatorSelector(char c1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			separator = c1;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #18  <Field char separator>
		//    5    9:return          
		}
	}

	static class CssTagSelector
		implements CssSelectorItem
	{

		public char getSeparator()
		{
			return '\0';
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getSpecificity()
		{
			return !isUniversal ? 1 : 0;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field boolean isUniversal>
		//    2    4:ifeq            9
		//    3    7:iconst_0        
		//    4    8:ireturn         
		//    5    9:iconst_1        
		//    6   10:ireturn         
		}

		public boolean matches(Tag tag)
		{
			return isUniversal || t.equals(((Object) (tag.getName())));
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field boolean isUniversal>
		//    2    4:ifne            21
		//    3    7:aload_0         
		//    4    8:getfield        #20  <Field String t>
		//    5   11:aload_1         
		//    6   12:invokevirtual   #43  <Method String Tag.getName()>
		//    7   15:invokevirtual   #28  <Method boolean String.equals(Object)>
		//    8   18:ifeq            23
		//    9   21:iconst_1        
		//   10   22:ireturn         
		//   11   23:iconst_0        
		//   12   24:ireturn         
		}

		public String toString()
		{
			return t;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field String t>
		//    2    4:areturn         
		}

		private boolean isUniversal;
		private String t;

		CssTagSelector(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			t = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field String t>
			boolean flag;
			if(t.equals("*"))
		//*   5    9:aload_0         
		//*   6   10:getfield        #20  <Field String t>
		//*   7   13:ldc1            #22  <String "*">
		//*   8   15:invokevirtual   #28  <Method boolean String.equals(Object)>
		//*   9   18:ifeq            29
				flag = true;
		//   10   21:iconst_1        
		//   11   22:istore_2        
			else
		//*  12   23:aload_0         
		//*  13   24:iload_2         
		//*  14   25:putfield        #30  <Field boolean isUniversal>
		//*  15   28:return          
				flag = false;
		//   16   29:iconst_0        
		//   17   30:istore_2        
			isUniversal = flag;
		//*  18   31:goto            23
		}
	}


	public CssSelectorParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
	//    2    4:return          
	}

	public static List createCssSelector(String s)
	{
		boolean flag;
		int i;
		ArrayList arraylist;
		Matcher matcher;
		arraylist = new ArrayList();
	//    0    0:new             #53  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void ArrayList()>
	//    3    7:astore          4
		matcher = selectorPattern.matcher(((CharSequence) (s)));
	//    4    9:getstatic       #45  <Field Pattern selectorPattern>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #58  <Method Matcher Pattern.matcher(CharSequence)>
	//    7   16:astore          5
		flag = false;
	//    8   18:iconst_0        
	//    9   19:istore_1        
		i = 0;
	//   10   20:iconst_0        
	//   11   21:istore_2        
_L14:
		if(!matcher.find()) goto _L2; else goto _L1
	//   12   22:aload           5
	//   13   24:invokevirtual   #64  <Method boolean Matcher.find()>
	//   14   27:ifeq            382
_L1:
		int j;
		String s1;
		s1 = matcher.group(0);
	//   15   30:aload           5
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #68  <Method String Matcher.group(int)>
	//   18   36:astore          6
		j = i + s1.length();
	//   19   38:iload_2         
	//   20   39:aload           6
	//   21   41:invokevirtual   #74  <Method int String.length()>
	//   22   44:iadd            
	//   23   45:istore_3        
		s1.charAt(0);
	//   24   46:aload           6
	//   25   48:iconst_0        
	//   26   49:invokevirtual   #78  <Method char String.charAt(int)>
		JVM INSTR lookupswitch 8: default 128
	//	               32: 234
	//	               35: 138
	//	               43: 234
	//	               46: 164
	//	               58: 212
	//	               62: 234
	//	               91: 190
	//	               126: 234;
	//   27   52:lookupswitch    8: default 128
	//	               32: 234
	//	               35: 138
	//	               43: 234
	//	               46: 164
	//	               58: 212
	//	               62: 234
	//	               91: 190
	//	               126: 234
		   goto _L3 _L4 _L5 _L4 _L6 _L7 _L4 _L8 _L4
_L3:
		if(!flag) goto _L10; else goto _L9
	//   28  128:iload_1         
	//   29  129:ifeq            358
_L9:
		arraylist = null;
	//   30  132:aconst_null     
	//   31  133:astore          4
_L12:
		return ((List) (arraylist));
	//   32  135:aload           4
	//   33  137:areturn         
_L5:
		((List) (arraylist)).add(((Object) (new CssIdSelector(s1.substring(1)))));
	//   34  138:aload           4
	//   35  140:new             #12  <Class CssSelectorParser$CssIdSelector>
	//   36  143:dup             
	//   37  144:aload           6
	//   38  146:iconst_1        
	//   39  147:invokevirtual   #81  <Method String String.substring(int)>
	//   40  150:invokespecial   #84  <Method void CssSelectorParser$CssIdSelector(String)>
	//   41  153:invokeinterface #90  <Method boolean List.add(Object)>
	//   42  158:pop             
		i = j;
	//   43  159:iload_3         
	//   44  160:istore_2        
		continue; /* Loop/switch isn't completed */
	//   45  161:goto            22
_L6:
		((List) (arraylist)).add(((Object) (new CssClassSelector(s1.substring(1)))));
	//   46  164:aload           4
	//   47  166:new             #9   <Class CssSelectorParser$CssClassSelector>
	//   48  169:dup             
	//   49  170:aload           6
	//   50  172:iconst_1        
	//   51  173:invokevirtual   #81  <Method String String.substring(int)>
	//   52  176:invokespecial   #91  <Method void CssSelectorParser$CssClassSelector(String)>
	//   53  179:invokeinterface #90  <Method boolean List.add(Object)>
	//   54  184:pop             
		i = j;
	//   55  185:iload_3         
	//   56  186:istore_2        
		continue; /* Loop/switch isn't completed */
	//   57  187:goto            22
_L8:
		((List) (arraylist)).add(((Object) (new CssAttributeSelector(s1))));
	//   58  190:aload           4
	//   59  192:new             #6   <Class CssSelectorParser$CssAttributeSelector>
	//   60  195:dup             
	//   61  196:aload           6
	//   62  198:invokespecial   #92  <Method void CssSelectorParser$CssAttributeSelector(String)>
	//   63  201:invokeinterface #90  <Method boolean List.add(Object)>
	//   64  206:pop             
		i = j;
	//   65  207:iload_3         
	//   66  208:istore_2        
		continue; /* Loop/switch isn't completed */
	//   67  209:goto            22
_L7:
		((List) (arraylist)).add(((Object) (new CssPseudoSelector(s1))));
	//   68  212:aload           4
	//   69  214:new             #15  <Class CssSelectorParser$CssPseudoSelector>
	//   70  217:dup             
	//   71  218:aload           6
	//   72  220:invokespecial   #93  <Method void CssSelectorParser$CssPseudoSelector(String)>
	//   73  223:invokeinterface #90  <Method boolean List.add(Object)>
	//   74  228:pop             
		i = j;
	//   75  229:iload_3         
	//   76  230:istore_2        
		continue; /* Loop/switch isn't completed */
	//   77  231:goto            22
_L4:
		if(((List) (arraylist)).size() == 0)
	//*  78  234:aload           4
	//*  79  236:invokeinterface #96  <Method int List.size()>
	//*  80  241:ifne            246
			return null;
	//   81  244:aconst_null     
	//   82  245:areturn         
		CssSelectorItem cssselectoritem = (CssSelectorItem)((List) (arraylist)).get(((List) (arraylist)).size() - 1);
	//   83  246:aload           4
	//   84  248:aload           4
	//   85  250:invokeinterface #96  <Method int List.size()>
	//   86  255:iconst_1        
	//   87  256:isub            
	//   88  257:invokeinterface #100 <Method Object List.get(int)>
	//   89  262:checkcast       #102 <Class CssSelectorItem>
	//   90  265:astore          7
		CssSeparatorSelector cssseparatorselector = new CssSeparatorSelector(s1.charAt(0));
	//   91  267:new             #18  <Class CssSelectorParser$CssSeparatorSelector>
	//   92  270:dup             
	//   93  271:aload           6
	//   94  273:iconst_0        
	//   95  274:invokevirtual   #78  <Method char String.charAt(int)>
	//   96  277:invokespecial   #105 <Method void CssSelectorParser$CssSeparatorSelector(char)>
	//   97  280:astore          8
		if(cssselectoritem instanceof CssSeparatorSelector)
	//*  98  282:aload           7
	//*  99  284:instanceof      #18  <Class CssSelectorParser$CssSeparatorSelector>
	//* 100  287:ifeq            341
		{
			i = j;
	//  101  290:iload_3         
	//  102  291:istore_2        
			if(s1.charAt(0) != ' ')
	//* 103  292:aload           6
	//* 104  294:iconst_0        
	//* 105  295:invokevirtual   #78  <Method char String.charAt(int)>
	//* 106  298:bipush          32
	//* 107  300:icmpeq          22
				if(cssselectoritem.getSeparator() == ' ')
	//* 108  303:aload           7
	//* 109  305:invokeinterface #109 <Method char CssSelectorItem.getSeparator()>
	//* 110  310:bipush          32
	//* 111  312:icmpne          339
				{
					((List) (arraylist)).set(((List) (arraylist)).size() - 1, ((Object) (cssseparatorselector)));
	//  112  315:aload           4
	//  113  317:aload           4
	//  114  319:invokeinterface #96  <Method int List.size()>
	//  115  324:iconst_1        
	//  116  325:isub            
	//  117  326:aload           8
	//  118  328:invokeinterface #113 <Method Object List.set(int, Object)>
	//  119  333:pop             
					i = j;
	//  120  334:iload_3         
	//  121  335:istore_2        
				} else
	//* 122  336:goto            22
				{
					return null;
	//  123  339:aconst_null     
	//  124  340:areturn         
				}
		} else
		{
			((List) (arraylist)).add(((Object) (cssseparatorselector)));
	//  125  341:aload           4
	//  126  343:aload           8
	//  127  345:invokeinterface #90  <Method boolean List.add(Object)>
	//  128  350:pop             
			flag = false;
	//  129  351:iconst_0        
	//  130  352:istore_1        
			i = j;
	//  131  353:iload_3         
	//  132  354:istore_2        
		}
		continue; /* Loop/switch isn't completed */
	//  133  355:goto            22
_L10:
		flag = true;
	//  134  358:iconst_1        
	//  135  359:istore_1        
		((List) (arraylist)).add(((Object) (new CssTagSelector(s1))));
	//  136  360:aload           4
	//  137  362:new             #21  <Class CssSelectorParser$CssTagSelector>
	//  138  365:dup             
	//  139  366:aload           6
	//  140  368:invokespecial   #114 <Method void CssSelectorParser$CssTagSelector(String)>
	//  141  371:invokeinterface #90  <Method boolean List.add(Object)>
	//  142  376:pop             
		i = j;
	//  143  377:iload_3         
	//  144  378:istore_2        
		continue; /* Loop/switch isn't completed */
	//  145  379:goto            22
_L2:
		if(s.length() != 0 && s.length() == i) goto _L12; else goto _L11
	//  146  382:aload_0         
	//  147  383:invokevirtual   #74  <Method int String.length()>
	//  148  386:ifeq            397
	//  149  389:aload_0         
	//  150  390:invokevirtual   #74  <Method int String.length()>
	//  151  393:iload_2         
	//  152  394:icmpeq          135
_L11:
		return null;
	//  153  397:aconst_null     
	//  154  398:areturn         
		if(true) goto _L14; else goto _L13
_L13:
	}

	private static final int a = 0x10000;
	private static final int b = 256;
	private static final int c = 1;
	private static final Pattern selectorPattern = Pattern.compile("(\\*)|([_a-zA-Z][\\w-]*)|(\\.[_a-zA-Z][\\w-]*)|(#[_a-z][\\w-]*)|(\\[[_a-zA-Z][\\w-]*(([~^$*|])?=((\"[\\w-]+\")|([\\w-]+)))?\\])|(:[\\w()-]*)|( )|(\\+)|(>)|(~)");
	private static final String selectorPatternString = "(\\*)|([_a-zA-Z][\\w-]*)|(\\.[_a-zA-Z][\\w-]*)|(#[_a-z][\\w-]*)|(\\[[_a-zA-Z][\\w-]*(([~^$*|])?=((\"[\\w-]+\")|([\\w-]+)))?\\])|(:[\\w()-]*)|( )|(\\+)|(>)|(~)";

	static 
	{
	//    0    0:ldc1            #35  <String "(\\*)|([_a-zA-Z][\\w-]*)|(\\.[_a-zA-Z][\\w-]*)|(#[_a-z][\\w-]*)|(\\[[_a-zA-Z][\\w-]*(([~^$*|])?=((\"[\\w-]+\")|([\\w-]+)))?\\])|(:[\\w()-]*)|( )|(\\+)|(>)|(~)">
	//    1    2:invokestatic    #43  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #45  <Field Pattern selectorPattern>
	//*   3    8:return          
	}
}
