// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css.parser;

import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.css.CssSelectorItem;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.itextpdf.tool.xml.css.parser:
//			CssSelectorParser

static class CssSelectorParser$CssAttributeSelector
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
	//	               0: 102
	//	               36: 159
	//	               42: 217
	//	               94: 146
	//	               124: 115
	//	               126: 172;
	//   20   40:lookupswitch    6: default 100
	//	               0: 102
	//	               36: 159
	//	               42: 217
	//	               94: 146
	//	               124: 115
	//	               126: 172
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

	CssSelectorParser$CssAttributeSelector(String s)
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
