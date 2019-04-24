// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.xml.simpleparser.SimpleXMLDocHandler;
import com.itextpdf.text.xml.simpleparser.SimpleXMLParser;
import java.io.*;
import java.util.*;

public class XfdfReader
	implements SimpleXMLDocHandler
{

	public XfdfReader(InputStream inputstream)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		foundRoot = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #28  <Field boolean foundRoot>
		fieldNames = new Stack();
	//    5    9:aload_0         
	//    6   10:new             #30  <Class Stack>
	//    7   13:dup             
	//    8   14:invokespecial   #31  <Method void Stack()>
	//    9   17:putfield        #33  <Field Stack fieldNames>
		fieldValues = new Stack();
	//   10   20:aload_0         
	//   11   21:new             #30  <Class Stack>
	//   12   24:dup             
	//   13   25:invokespecial   #31  <Method void Stack()>
	//   14   28:putfield        #35  <Field Stack fieldValues>
		SimpleXMLParser.parse(((SimpleXMLDocHandler) (this)), inputstream);
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokestatic    #41  <Method void SimpleXMLParser.parse(SimpleXMLDocHandler, InputStream)>
	//   18   36:return          
	}

	public XfdfReader(String s)
		throws IOException
	{
		Exception exception;
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		foundRoot = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #28  <Field boolean foundRoot>
		fieldNames = new Stack();
	//    5    9:aload_0         
	//    6   10:new             #30  <Class Stack>
	//    7   13:dup             
	//    8   14:invokespecial   #31  <Method void Stack()>
	//    9   17:putfield        #33  <Field Stack fieldNames>
		fieldValues = new Stack();
	//   10   20:aload_0         
	//   11   21:new             #30  <Class Stack>
	//   12   24:dup             
	//   13   25:invokespecial   #31  <Method void Stack()>
	//   14   28:putfield        #35  <Field Stack fieldValues>
		exception = null;
	//   15   31:aconst_null     
	//   16   32:astore_2        
		FileInputStream fileinputstream = new FileInputStream(s);
	//   17   33:new             #48  <Class FileInputStream>
	//   18   36:dup             
	//   19   37:aload_1         
	//   20   38:invokespecial   #50  <Method void FileInputStream(String)>
	//   21   41:astore_3        
		SimpleXMLParser.parse(((SimpleXMLDocHandler) (this)), ((InputStream) (fileinputstream)));
	//   22   42:aload_0         
	//   23   43:aload_3         
	//   24   44:invokestatic    #41  <Method void SimpleXMLParser.parse(SimpleXMLDocHandler, InputStream)>
		if(fileinputstream == null)
			break MISSING_BLOCK_LABEL_55;
	//   25   47:aload_3         
	//   26   48:ifnull          55
		fileinputstream.close();
	//   27   51:aload_3         
	//   28   52:invokevirtual   #53  <Method void FileInputStream.close()>
		return;
	//   29   55:return          
		s;
	//   30   56:astore_1        
_L2:
		if(exception != null)
	//*  31   57:aload_2         
	//*  32   58:ifnull          65
			try
			{
				((FileInputStream) (exception)).close();
	//   33   61:aload_2         
	//   34   62:invokevirtual   #53  <Method void FileInputStream.close()>
			}
	//*  35   65:aload_1         
	//*  36   66:athrow          
	//*  37   67:astore_1        
	//*  38   68:return          
			// Misplaced declaration of an exception variable
			catch(Exception exception) { }
	//   39   69:astore_2        
		throw s;
		s;
		return;
	//*  40   70:goto            65
		s;
	//   41   73:astore_1        
		exception = ((Exception) (fileinputstream));
	//   42   74:aload_3         
	//   43   75:astore_2        
		if(true) goto _L2; else goto _L1
	//   44   76:goto            57
_L1:
	}

	public XfdfReader(byte abyte0[])
		throws IOException
	{
		this(((InputStream) (new ByteArrayInputStream(abyte0))));
	//    0    0:aload_0         
	//    1    1:new             #56  <Class ByteArrayInputStream>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #58  <Method void ByteArrayInputStream(byte[])>
	//    5    9:invokespecial   #60  <Method void XfdfReader(InputStream)>
	//    6   12:return          
	}

	public void endDocument()
	{
	//    0    0:return          
	}

	public void endElement(String s)
	{
		if(s.equals("value"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #64  <String "value">
	//*   2    3:invokevirtual   #70  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            173
		{
			s = "";
	//    4    9:ldc1            #72  <String "">
	//    5   11:astore_1        
			for(int i = 0; i < fieldNames.size(); i++)
	//*   6   12:iconst_0        
	//*   7   13:istore_2        
	//*   8   14:iload_2         
	//*   9   15:aload_0         
	//*  10   16:getfield        #33  <Field Stack fieldNames>
	//*  11   19:invokevirtual   #76  <Method int Stack.size()>
	//*  12   22:icmpge          66
				s = (new StringBuilder()).append(s).append(".").append((String)fieldNames.elementAt(i)).toString();
	//   13   25:new             #78  <Class StringBuilder>
	//   14   28:dup             
	//   15   29:invokespecial   #79  <Method void StringBuilder()>
	//   16   32:aload_1         
	//   17   33:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:ldc1            #85  <String ".">
	//   19   38:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   20   41:aload_0         
	//   21   42:getfield        #33  <Field Stack fieldNames>
	//   22   45:iload_2         
	//   23   46:invokevirtual   #89  <Method Object Stack.elementAt(int)>
	//   24   49:checkcast       #66  <Class String>
	//   25   52:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   26   55:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   27   58:astore_1        

	//   28   59:iload_2         
	//   29   60:iconst_1        
	//   30   61:iadd            
	//   31   62:istore_2        
	//*  32   63:goto            14
			String s1 = s;
	//   33   66:aload_1         
	//   34   67:astore_3        
			if(s.startsWith("."))
	//*  35   68:aload_1         
	//*  36   69:ldc1            #85  <String ".">
	//*  37   71:invokevirtual   #97  <Method boolean String.startsWith(String)>
	//*  38   74:ifeq            83
				s1 = s.substring(1);
	//   39   77:aload_1         
	//   40   78:iconst_1        
	//   41   79:invokevirtual   #101 <Method String String.substring(int)>
	//   42   82:astore_3        
			String s2 = (String)fieldValues.pop();
	//   43   83:aload_0         
	//   44   84:getfield        #35  <Field Stack fieldValues>
	//   45   87:invokevirtual   #105 <Method Object Stack.pop()>
	//   46   90:checkcast       #66  <Class String>
	//   47   93:astore          5
			String s3 = (String)fields.put(((Object) (s1)), ((Object) (s2)));
	//   48   95:aload_0         
	//   49   96:getfield        #107 <Field HashMap fields>
	//   50   99:aload_3         
	//   51  100:aload           5
	//   52  102:invokevirtual   #113 <Method Object HashMap.put(Object, Object)>
	//   53  105:checkcast       #66  <Class String>
	//   54  108:astore          6
			if(s3 != null)
	//*  55  110:aload           6
	//*  56  112:ifnull          172
			{
				List list = (List)listFields.get(((Object) (s1)));
	//   57  115:aload_0         
	//   58  116:getfield        #115 <Field HashMap listFields>
	//   59  119:aload_3         
	//   60  120:invokevirtual   #119 <Method Object HashMap.get(Object)>
	//   61  123:checkcast       #121 <Class List>
	//   62  126:astore          4
				s = ((String) (list));
	//   63  128:aload           4
	//   64  130:astore_1        
				if(list == null)
	//*  65  131:aload           4
	//*  66  133:ifnonnull       153
				{
					s = ((String) (new ArrayList()));
	//   67  136:new             #123 <Class ArrayList>
	//   68  139:dup             
	//   69  140:invokespecial   #124 <Method void ArrayList()>
	//   70  143:astore_1        
					((List) (s)).add(((Object) (s3)));
	//   71  144:aload_1         
	//   72  145:aload           6
	//   73  147:invokeinterface #127 <Method boolean List.add(Object)>
	//   74  152:pop             
				}
				((List) (s)).add(((Object) (s2)));
	//   75  153:aload_1         
	//   76  154:aload           5
	//   77  156:invokeinterface #127 <Method boolean List.add(Object)>
	//   78  161:pop             
				listFields.put(((Object) (s1)), ((Object) (s)));
	//   79  162:aload_0         
	//   80  163:getfield        #115 <Field HashMap listFields>
	//   81  166:aload_3         
	//   82  167:aload_1         
	//   83  168:invokevirtual   #113 <Method Object HashMap.put(Object, Object)>
	//   84  171:pop             
			}
		} else
	//*  85  172:return          
		if(s.equals("field") && !fieldNames.isEmpty())
	//*  86  173:aload_1         
	//*  87  174:ldc1            #129 <String "field">
	//*  88  176:invokevirtual   #70  <Method boolean String.equals(Object)>
	//*  89  179:ifeq            172
	//*  90  182:aload_0         
	//*  91  183:getfield        #33  <Field Stack fieldNames>
	//*  92  186:invokevirtual   #133 <Method boolean Stack.isEmpty()>
	//*  93  189:ifne            172
		{
			fieldNames.pop();
	//   94  192:aload_0         
	//   95  193:getfield        #33  <Field Stack fieldNames>
	//   96  196:invokevirtual   #105 <Method Object Stack.pop()>
	//   97  199:pop             
			return;
	//   98  200:return          
		}
	}

	public String getField(String s)
	{
		return (String)fields.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field HashMap fields>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #119 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #66  <Class String>
	//    5   11:areturn         
	}

	public String getFieldValue(String s)
	{
		String s1 = (String)fields.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field HashMap fields>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #119 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #66  <Class String>
	//    5   11:astore_2        
		s = s1;
	//    6   12:aload_2         
	//    7   13:astore_1        
		if(s1 == null)
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       20
			s = null;
	//   10   18:aconst_null     
	//   11   19:astore_1        
		return s;
	//   12   20:aload_1         
	//   13   21:areturn         
	}

	public HashMap getFields()
	{
		return fields;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field HashMap fields>
	//    2    4:areturn         
	}

	public String getFileSpec()
	{
		return fileSpec;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field String fileSpec>
	//    2    4:areturn         
	}

	public List getListValues(String s)
	{
		return (List)listFields.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field HashMap listFields>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #119 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #121 <Class List>
	//    5   11:areturn         
	}

	public void startDocument()
	{
		fileSpec = "";
	//    0    0:aload_0         
	//    1    1:ldc1            #72  <String "">
	//    2    3:putfield        #143 <Field String fileSpec>
	//    3    6:return          
	}

	public void startElement(String s, Map map)
	{
		if(!foundRoot)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean foundRoot>
	//*   2    4:ifne            42
		{
			if(!s.equals("xfdf"))
	//*   3    7:aload_1         
	//*   4    8:ldc1            #151 <String "xfdf">
	//*   5   10:invokevirtual   #70  <Method boolean String.equals(Object)>
	//*   6   13:ifne            37
				throw new RuntimeException(MessageLocalization.getComposedMessage("root.element.is.not.xfdf.1", new Object[] {
					s
				}));
	//    7   16:new             #153 <Class RuntimeException>
	//    8   19:dup             
	//    9   20:ldc1            #155 <String "root.element.is.not.xfdf.1">
	//   10   22:iconst_1        
	//   11   23:anewarray       Object[]
	//   12   26:dup             
	//   13   27:iconst_0        
	//   14   28:aload_1         
	//   15   29:aastore         
	//   16   30:invokestatic    #161 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   17   33:invokespecial   #162 <Method void RuntimeException(String)>
	//   18   36:athrow          
			foundRoot = true;
	//   19   37:aload_0         
	//   20   38:iconst_1        
	//   21   39:putfield        #28  <Field boolean foundRoot>
		}
		if(!s.equals("xfdf"))
	//*  22   42:aload_1         
	//*  23   43:ldc1            #151 <String "xfdf">
	//*  24   45:invokevirtual   #70  <Method boolean String.equals(Object)>
	//*  25   48:ifeq            52
	//*  26   51:return          
		{
			if(s.equals("f"))
	//*  27   52:aload_1         
	//*  28   53:ldc1            #164 <String "f">
	//*  29   55:invokevirtual   #70  <Method boolean String.equals(Object)>
	//*  30   58:ifeq            77
			{
				fileSpec = (String)map.get("href");
	//   31   61:aload_0         
	//   32   62:aload_2         
	//   33   63:ldc1            #166 <String "href">
	//   34   65:invokeinterface #169 <Method Object Map.get(Object)>
	//   35   70:checkcast       #66  <Class String>
	//   36   73:putfield        #143 <Field String fileSpec>
				return;
	//   37   76:return          
			}
			if(s.equals("fields"))
	//*  38   77:aload_1         
	//*  39   78:ldc1            #170 <String "fields">
	//*  40   80:invokevirtual   #70  <Method boolean String.equals(Object)>
	//*  41   83:ifeq            109
			{
				fields = new HashMap();
	//   42   86:aload_0         
	//   43   87:new             #109 <Class HashMap>
	//   44   90:dup             
	//   45   91:invokespecial   #171 <Method void HashMap()>
	//   46   94:putfield        #107 <Field HashMap fields>
				listFields = new HashMap();
	//   47   97:aload_0         
	//   48   98:new             #109 <Class HashMap>
	//   49  101:dup             
	//   50  102:invokespecial   #171 <Method void HashMap()>
	//   51  105:putfield        #115 <Field HashMap listFields>
				return;
	//   52  108:return          
			}
			if(s.equals("field"))
	//*  53  109:aload_1         
	//*  54  110:ldc1            #129 <String "field">
	//*  55  112:invokevirtual   #70  <Method boolean String.equals(Object)>
	//*  56  115:ifeq            140
			{
				s = (String)map.get("name");
	//   57  118:aload_2         
	//   58  119:ldc1            #173 <String "name">
	//   59  121:invokeinterface #169 <Method Object Map.get(Object)>
	//   60  126:checkcast       #66  <Class String>
	//   61  129:astore_1        
				fieldNames.push(((Object) (s)));
	//   62  130:aload_0         
	//   63  131:getfield        #33  <Field Stack fieldNames>
	//   64  134:aload_1         
	//   65  135:invokevirtual   #176 <Method Object Stack.push(Object)>
	//   66  138:pop             
				return;
	//   67  139:return          
			}
			if(s.equals("value"))
	//*  68  140:aload_1         
	//*  69  141:ldc1            #64  <String "value">
	//*  70  143:invokevirtual   #70  <Method boolean String.equals(Object)>
	//*  71  146:ifeq            51
			{
				fieldValues.push("");
	//   72  149:aload_0         
	//   73  150:getfield        #35  <Field Stack fieldValues>
	//   74  153:ldc1            #72  <String "">
	//   75  155:invokevirtual   #176 <Method Object Stack.push(Object)>
	//   76  158:pop             
				return;
	//   77  159:return          
			}
		}
	}

	public void text(String s)
	{
		if(fieldNames.isEmpty() || fieldValues.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field Stack fieldNames>
	//*   2    4:invokevirtual   #133 <Method boolean Stack.isEmpty()>
	//*   3    7:ifne            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #35  <Field Stack fieldValues>
	//*   6   14:invokevirtual   #133 <Method boolean Stack.isEmpty()>
	//*   7   17:ifeq            21
		{
			return;
	//    8   20:return          
		} else
		{
			String s1 = (String)fieldValues.pop();
	//    9   21:aload_0         
	//   10   22:getfield        #35  <Field Stack fieldValues>
	//   11   25:invokevirtual   #105 <Method Object Stack.pop()>
	//   12   28:checkcast       #66  <Class String>
	//   13   31:astore_2        
			s = (new StringBuilder()).append(s1).append(s).toString();
	//   14   32:new             #78  <Class StringBuilder>
	//   15   35:dup             
	//   16   36:invokespecial   #79  <Method void StringBuilder()>
	//   17   39:aload_2         
	//   18   40:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   19   43:aload_1         
	//   20   44:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   21   47:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   22   50:astore_1        
			fieldValues.push(((Object) (s)));
	//   23   51:aload_0         
	//   24   52:getfield        #35  <Field Stack fieldValues>
	//   25   55:aload_1         
	//   26   56:invokevirtual   #176 <Method Object Stack.push(Object)>
	//   27   59:pop             
			return;
	//   28   60:return          
		}
	}

	private final Stack fieldNames;
	private final Stack fieldValues;
	HashMap fields;
	String fileSpec;
	private boolean foundRoot;
	protected HashMap listFields;
}
