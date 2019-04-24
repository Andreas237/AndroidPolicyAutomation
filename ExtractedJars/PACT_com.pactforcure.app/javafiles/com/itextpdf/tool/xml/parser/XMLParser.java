// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser;

import com.itextpdf.text.xml.XMLUtil;
import com.itextpdf.text.xml.simpleparser.IanaEncodings;
import com.itextpdf.tool.xml.parser.io.EncodingUtil;
import com.itextpdf.tool.xml.parser.io.MonitorInputReader;
import com.itextpdf.tool.xml.parser.io.ParserMonitor;
import java.io.*;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.itextpdf.tool.xml.parser:
//			StateController, XMLParserMemory, XMLParserListener, State, 
//			TagState

public class XMLParser
{

	public XMLParser()
	{
		this(true, Charset.defaultCharset());
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #29  <Method Charset Charset.defaultCharset()>
	//    3    5:invokespecial   #32  <Method void XMLParser(boolean, Charset)>
	//    4    8:return          
	}

	public XMLParser(XMLParserListener xmlparserlistener)
	{
		this(true, Charset.defaultCharset());
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #29  <Method Charset Charset.defaultCharset()>
	//    3    5:invokespecial   #32  <Method void XMLParser(boolean, Charset)>
		listeners.add(((Object) (xmlparserlistener)));
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field List listeners>
	//    6   12:aload_1         
	//    7   13:invokeinterface #42  <Method boolean List.add(Object)>
	//    8   18:pop             
	//    9   19:return          
	}

	public XMLParser(XMLParserListener xmlparserlistener, Charset charset1)
	{
		this(true, charset1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_2         
	//    3    3:invokespecial   #32  <Method void XMLParser(boolean, Charset)>
		listeners.add(((Object) (xmlparserlistener)));
	//    4    6:aload_0         
	//    5    7:getfield        #36  <Field List listeners>
	//    6   10:aload_1         
	//    7   11:invokeinterface #42  <Method boolean List.add(Object)>
	//    8   16:pop             
	//    9   17:return          
	}

	public XMLParser(boolean flag, XMLParserListener xmlparserlistener)
	{
		this(flag, Charset.defaultCharset());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #29  <Method Charset Charset.defaultCharset()>
	//    3    5:invokespecial   #32  <Method void XMLParser(boolean, Charset)>
		listeners.add(((Object) (xmlparserlistener)));
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field List listeners>
	//    6   12:aload_2         
	//    7   13:invokeinterface #42  <Method boolean List.add(Object)>
	//    8   18:pop             
	//    9   19:return          
	}

	public XMLParser(boolean flag, XMLParserListener xmlparserlistener, Charset charset1)
	{
		this(flag, charset1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #32  <Method void XMLParser(boolean, Charset)>
		listeners.add(((Object) (xmlparserlistener)));
	//    4    6:aload_0         
	//    5    7:getfield        #36  <Field List listeners>
	//    6   10:aload_2         
	//    7   11:invokeinterface #42  <Method boolean List.add(Object)>
	//    8   16:pop             
	//    9   17:return          
	}

	public XMLParser(boolean flag, Charset charset1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		text = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #49  <Field String text>
		charset = charset1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #51  <Field Charset charset>
		controller = new StateController(this, flag);
	//    8   14:aload_0         
	//    9   15:new             #53  <Class StateController>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokespecial   #56  <Method void StateController(XMLParser, boolean)>
	//   14   24:putfield        #58  <Field StateController controller>
		controller.unknown();
	//   15   27:aload_0         
	//   16   28:getfield        #58  <Field StateController controller>
	//   17   31:invokevirtual   #62  <Method XMLParser StateController.unknown()>
	//   18   34:pop             
		memory = new XMLParserMemory(flag);
	//   19   35:aload_0         
	//   20   36:new             #64  <Class XMLParserMemory>
	//   21   39:dup             
	//   22   40:iload_1         
	//   23   41:invokespecial   #67  <Method void XMLParserMemory(boolean)>
	//   24   44:putfield        #69  <Field XMLParserMemory memory>
		listeners = ((List) (new CopyOnWriteArrayList()));
	//   25   47:aload_0         
	//   26   48:new             #71  <Class CopyOnWriteArrayList>
	//   27   51:dup             
	//   28   52:invokespecial   #72  <Method void CopyOnWriteArrayList()>
	//   29   55:putfield        #36  <Field List listeners>
	//   30   58:return          
	}

	private void callText()
	{
		if(text != null && text.length() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field String text>
	//*   2    4:ifnull          62
	//*   3    7:aload_0         
	//*   4    8:getfield        #49  <Field String text>
	//*   5   11:invokevirtual   #79  <Method int String.length()>
	//*   6   14:ifle            62
		{
			for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((XMLParserListener)iterator.next()).text(text));
	//    7   17:aload_0         
	//    8   18:getfield        #36  <Field List listeners>
	//    9   21:invokeinterface #83  <Method Iterator List.iterator()>
	//   10   26:astore_1        
	//   11   27:aload_1         
	//   12   28:invokeinterface #89  <Method boolean Iterator.hasNext()>
	//   13   33:ifeq            57
	//   14   36:aload_1         
	//   15   37:invokeinterface #93  <Method Object Iterator.next()>
	//   16   42:checkcast       #95  <Class XMLParserListener>
	//   17   45:aload_0         
	//   18   46:getfield        #49  <Field String text>
	//   19   49:invokeinterface #98  <Method void XMLParserListener.text(String)>
	//*  20   54:goto            27
			text = null;
	//   21   57:aload_0         
	//   22   58:aconst_null     
	//   23   59:putfield        #49  <Field String text>
		}
	//   24   62:return          
	}

	private void currentTagState(TagState tagstate)
	{
		tagState = tagstate;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #102 <Field TagState tagState>
	//    3    5:return          
	}

	private void parseWithReader(Reader reader)
		throws IOException
	{
		char ac[];
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((XMLParserListener)iterator.next()).init());
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field List listeners>
	//    2    4:invokeinterface #83  <Method Iterator List.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #89  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            36
	//    7   19:aload_2         
	//    8   20:invokeinterface #93  <Method Object Iterator.next()>
	//    9   25:checkcast       #95  <Class XMLParserListener>
	//   10   28:invokeinterface #109 <Method void XMLParserListener.init()>
	//*  11   33:goto            10
		if(monitor != null)
	//*  12   36:aload_0         
	//*  13   37:getfield        #111 <Field ParserMonitor monitor>
	//*  14   40:ifnull          121
			reader = ((Reader) (new MonitorInputReader(reader, monitor)));
	//   15   43:new             #113 <Class MonitorInputReader>
	//   16   46:dup             
	//   17   47:aload_1         
	//   18   48:aload_0         
	//   19   49:getfield        #111 <Field ParserMonitor monitor>
	//   20   52:invokespecial   #116 <Method void MonitorInputReader(Reader, ParserMonitor)>
	//   21   55:astore_1        
		ac = new char[1];
	//   22   56:iconst_1        
	//   23   57:newarray        char[]
	//   24   59:astore_2        
		while(-1 != reader.read(ac)) 
	//*  25   60:iconst_m1       
	//*  26   61:aload_1         
	//*  27   62:aload_2         
	//*  28   63:invokevirtual   #122 <Method int Reader.read(char[])>
	//*  29   66:icmpeq          124
			state.process(ac[0]);
	//   30   69:aload_0         
	//   31   70:getfield        #124 <Field State state>
	//   32   73:aload_2         
	//   33   74:iconst_0        
	//   34   75:caload          
	//   35   76:invokeinterface #130 <Method void State.process(char)>
		break MISSING_BLOCK_LABEL_124;
	//   36   81:goto            60
		Object obj;
		obj;
	//   37   84:astore_2        
		for(Iterator iterator1 = listeners.iterator(); iterator1.hasNext(); ((XMLParserListener)iterator1.next()).close());
	//   38   85:aload_0         
	//   39   86:getfield        #36  <Field List listeners>
	//   40   89:invokeinterface #83  <Method Iterator List.iterator()>
	//   41   94:astore_3        
	//   42   95:aload_3         
	//   43   96:invokeinterface #89  <Method boolean Iterator.hasNext()>
	//   44  101:ifeq            165
	//   45  104:aload_3         
	//   46  105:invokeinterface #93  <Method Object Iterator.next()>
	//   47  110:checkcast       #95  <Class XMLParserListener>
	//   48  113:invokeinterface #133 <Method void XMLParserListener.close()>
		break MISSING_BLOCK_LABEL_165;
	//   49  118:goto            95
	//*  50  121:goto            56
		for(obj = ((Object) (listeners.iterator())); ((Iterator) (obj)).hasNext(); ((XMLParserListener)((Iterator) (obj)).next()).close());
	//   51  124:aload_0         
	//   52  125:getfield        #36  <Field List listeners>
	//   53  128:invokeinterface #83  <Method Iterator List.iterator()>
	//   54  133:astore_2        
	//   55  134:aload_2         
	//   56  135:invokeinterface #89  <Method boolean Iterator.hasNext()>
	//   57  140:ifeq            160
	//   58  143:aload_2         
	//   59  144:invokeinterface #93  <Method Object Iterator.next()>
	//   60  149:checkcast       #95  <Class XMLParserListener>
	//   61  152:invokeinterface #133 <Method void XMLParserListener.close()>
	//*  62  157:goto            134
		reader.close();
	//   63  160:aload_1         
	//   64  161:invokevirtual   #134 <Method void Reader.close()>
		return;
	//   65  164:return          
		reader.close();
	//   66  165:aload_1         
	//   67  166:invokevirtual   #134 <Method void Reader.close()>
		throw obj;
	//   68  169:aload_2         
	//   69  170:athrow          
	}

	public XMLParser addListener(XMLParserListener xmlparserlistener)
	{
		listeners.add(((Object) (xmlparserlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field List listeners>
	//    2    4:aload_1         
	//    3    5:invokeinterface #42  <Method boolean List.add(Object)>
	//    4   10:pop             
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public XMLParser append(char c)
	{
		memory.current().append(c);
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field XMLParserMemory memory>
	//    2    4:invokevirtual   #143 <Method StringBuilder XMLParserMemory.current()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #148 <Method StringBuilder StringBuilder.append(char)>
	//    5   11:pop             
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public XMLParser append(String s)
	{
		memory.current().append(s);
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field XMLParserMemory memory>
	//    2    4:invokevirtual   #143 <Method StringBuilder XMLParserMemory.current()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//    5   11:pop             
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public XMLParser append(char ac[])
	{
		memory.current().append(ac);
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field XMLParserMemory memory>
	//    2    4:invokevirtual   #143 <Method StringBuilder XMLParserMemory.current()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #156 <Method StringBuilder StringBuilder.append(char[])>
	//    5   11:pop             
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public int bufferSize()
	{
		if(memory.current() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field XMLParserMemory memory>
	//*   2    4:invokevirtual   #143 <Method StringBuilder XMLParserMemory.current()>
	//*   3    7:ifnull          21
			return memory.current().length();
	//    4   10:aload_0         
	//    5   11:getfield        #69  <Field XMLParserMemory memory>
	//    6   14:invokevirtual   #143 <Method StringBuilder XMLParserMemory.current()>
	//    7   17:invokevirtual   #158 <Method int StringBuilder.length()>
	//    8   20:ireturn         
		else
			return 0;
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public String bufferToString()
	{
		return memory.current().toString();
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field XMLParserMemory memory>
	//    2    4:invokevirtual   #143 <Method StringBuilder XMLParserMemory.current()>
	//    3    7:invokevirtual   #163 <Method String StringBuilder.toString()>
	//    4   10:areturn         
	}

	public void comment()
	{
		callText();
	//    0    0:aload_0         
	//    1    1:invokespecial   #166 <Method void callText()>
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((XMLParserListener)iterator.next()).comment(memory.current().toString()));
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field List listeners>
	//    4    8:invokeinterface #83  <Method Iterator List.iterator()>
	//    5   13:astore_1        
	//    6   14:aload_1         
	//    7   15:invokeinterface #89  <Method boolean Iterator.hasNext()>
	//    8   20:ifeq            50
	//    9   23:aload_1         
	//   10   24:invokeinterface #93  <Method Object Iterator.next()>
	//   11   29:checkcast       #95  <Class XMLParserListener>
	//   12   32:aload_0         
	//   13   33:getfield        #69  <Field XMLParserMemory memory>
	//   14   36:invokevirtual   #143 <Method StringBuilder XMLParserMemory.current()>
	//   15   39:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   16   42:invokeinterface #168 <Method void XMLParserListener.comment(String)>
	//*  17   47:goto            14
	//   18   50:return          
	}

	public String current()
	{
		return memory.current().toString();
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field XMLParserMemory memory>
	//    2    4:invokevirtual   #143 <Method StringBuilder XMLParserMemory.current()>
	//    3    7:invokevirtual   #163 <Method String StringBuilder.toString()>
	//    4   10:areturn         
	}

	public char currentLastChar()
	{
		Object obj = ((Object) (memory.current()));
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field XMLParserMemory memory>
	//    2    4:invokevirtual   #143 <Method StringBuilder XMLParserMemory.current()>
	//    3    7:astore_2        
		int i = ((StringBuilder) (obj)).length();
	//    4    8:aload_2         
	//    5    9:invokevirtual   #158 <Method int StringBuilder.length()>
	//    6   12:istore_1        
		obj = ((Object) (((StringBuilder) (obj)).subSequence(i - 2, i - 1)));
	//    7   13:aload_2         
	//    8   14:iload_1         
	//    9   15:iconst_2        
	//   10   16:isub            
	//   11   17:iload_1         
	//   12   18:iconst_1        
	//   13   19:isub            
	//   14   20:invokevirtual   #174 <Method CharSequence StringBuilder.subSequence(int, int)>
	//   15   23:astore_2        
		if(((CharSequence) (obj)).length() > 0)
	//*  16   24:aload_2         
	//*  17   25:invokeinterface #177 <Method int CharSequence.length()>
	//*  18   30:ifle            43
			return (char)(((CharSequence) (obj)).length() - 1);
	//   19   33:aload_2         
	//   20   34:invokeinterface #177 <Method int CharSequence.length()>
	//   21   39:iconst_1        
	//   22   40:isub            
	//   23   41:int2char        
	//   24   42:ireturn         
		else
			return ' ';
	//   25   43:bipush          32
	//   26   45:ireturn         
	}

	public String currentTag()
	{
		return memory.getCurrentTag();
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field XMLParserMemory memory>
	//    2    4:invokevirtual   #181 <Method String XMLParserMemory.getCurrentTag()>
	//    3    7:areturn         
	}

	public TagState currentTagState()
	{
		return tagState;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field TagState tagState>
	//    2    4:areturn         
	}

	public InputStreamReader detectEncoding(InputStream inputstream)
		throws IOException, UnsupportedEncodingException
	{
		Object obj;
		String s;
		inputstream.mark(1028);
	//    0    0:aload_1         
	//    1    1:sipush          1028
	//    2    4:invokevirtual   #192 <Method void InputStream.mark(int)>
		byte abyte0[] = new byte[4];
	//    3    7:iconst_4        
	//    4    8:newarray        byte[]
	//    5   10:astore_3        
		if(inputstream.read(abyte0) != 4)
	//*   6   11:aload_1         
	//*   7   12:aload_3         
	//*   8   13:invokevirtual   #195 <Method int InputStream.read(byte[])>
	//*   9   16:iconst_4        
	//*  10   17:icmpeq          30
			throw new IOException("Insufficient length");
	//   11   20:new             #106 <Class IOException>
	//   12   23:dup             
	//   13   24:ldc1            #197 <String "Insufficient length">
	//   14   26:invokespecial   #199 <Method void IOException(String)>
	//   15   29:athrow          
		s = XMLUtil.getEncodingName(abyte0);
	//   16   30:aload_3         
	//   17   31:invokestatic    #205 <Method String XMLUtil.getEncodingName(byte[])>
	//   18   34:astore          5
		obj = null;
	//   19   36:aconst_null     
	//   20   37:astore_3        
		if(!s.equals("UTF-8")) goto _L2; else goto _L1
	//   21   38:aload           5
	//   22   40:ldc1            #207 <String "UTF-8">
	//   23   42:invokevirtual   #210 <Method boolean String.equals(Object)>
	//   24   45:ifeq            129
_L1:
		obj = ((Object) (new StringBuffer()));
	//   25   48:new             #212 <Class StringBuffer>
	//   26   51:dup             
	//   27   52:invokespecial   #213 <Method void StringBuffer()>
	//   28   55:astore_3        
_L5:
		int i = inputstream.read();
	//   29   56:aload_1         
	//   30   57:invokevirtual   #215 <Method int InputStream.read()>
	//   31   60:istore_2        
		if(i != -1 && i != 62) goto _L4; else goto _L3
	//   32   61:iload_2         
	//   33   62:iconst_m1       
	//   34   63:icmpeq          72
	//   35   66:iload_2         
	//   36   67:bipush          62
	//   37   69:icmpne          119
_L3:
		obj = ((Object) (((StringBuffer) (obj)).toString()));
	//   38   72:aload_3         
	//   39   73:invokevirtual   #216 <Method String StringBuffer.toString()>
	//   40   76:astore_3        
_L7:
		Object obj1 = ((Object) (s));
	//   41   77:aload           5
	//   42   79:astore          4
		if(obj != null)
	//*  43   81:aload_3         
	//*  44   82:ifnull          101
		{
			obj = ((Object) (EncodingUtil.getDeclaredEncoding(((String) (obj)))));
	//   45   85:aload_3         
	//   46   86:invokestatic    #222 <Method String EncodingUtil.getDeclaredEncoding(String)>
	//   47   89:astore_3        
			obj1 = ((Object) (s));
	//   48   90:aload           5
	//   49   92:astore          4
			if(obj != null)
	//*  50   94:aload_3         
	//*  51   95:ifnull          101
				obj1 = obj;
	//   52   98:aload_3         
	//   53   99:astore          4
		}
		inputstream.reset();
	//   54  101:aload_1         
	//   55  102:invokevirtual   #225 <Method void InputStream.reset()>
		return new InputStreamReader(inputstream, IanaEncodings.getJavaEncoding(((String) (obj1))));
	//   56  105:new             #227 <Class InputStreamReader>
	//   57  108:dup             
	//   58  109:aload_1         
	//   59  110:aload           4
	//   60  112:invokestatic    #232 <Method String IanaEncodings.getJavaEncoding(String)>
	//   61  115:invokespecial   #235 <Method void InputStreamReader(InputStream, String)>
	//   62  118:areturn         
_L4:
		((StringBuffer) (obj)).append((char)i);
	//   63  119:aload_3         
	//   64  120:iload_2         
	//   65  121:int2char        
	//   66  122:invokevirtual   #238 <Method StringBuffer StringBuffer.append(char)>
	//   67  125:pop             
		  goto _L5
	//*  68  126:goto            56
_L2:
		if(!s.equals("CP037")) goto _L7; else goto _L6
	//   69  129:aload           5
	//   70  131:ldc1            #240 <String "CP037">
	//   71  133:invokevirtual   #210 <Method boolean String.equals(Object)>
	//   72  136:ifeq            77
_L6:
		obj = ((Object) (new ByteArrayOutputStream()));
	//   73  139:new             #242 <Class ByteArrayOutputStream>
	//   74  142:dup             
	//   75  143:invokespecial   #243 <Method void ByteArrayOutputStream()>
	//   76  146:astore_3        
_L8:
label0:
		{
			i = inputstream.read();
	//   77  147:aload_1         
	//   78  148:invokevirtual   #215 <Method int InputStream.read()>
	//   79  151:istore_2        
			if(i != -1 && i != 110)
				break label0;
	//   80  152:iload_2         
	//   81  153:iconst_m1       
	//   82  154:icmpeq          163
	//   83  157:iload_2         
	//   84  158:bipush          110
	//   85  160:icmpne          180
			obj = ((Object) (new String(((ByteArrayOutputStream) (obj)).toByteArray(), "CP037")));
	//   86  163:new             #75  <Class String>
	//   87  166:dup             
	//   88  167:aload_3         
	//   89  168:invokevirtual   #247 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   90  171:ldc1            #240 <String "CP037">
	//   91  173:invokespecial   #250 <Method void String(byte[], String)>
	//   92  176:astore_3        
		}
		  goto _L7
	//*  93  177:goto            77
		((ByteArrayOutputStream) (obj)).write(i);
	//   94  180:aload_3         
	//   95  181:iload_2         
	//   96  182:invokevirtual   #253 <Method void ByteArrayOutputStream.write(int)>
		  goto _L8
	//*  97  185:goto            147
	}

	public void endElement()
	{
		currentTagState(TagState.CLOSE);
	//    0    0:aload_0         
	//    1    1:getstatic       #259 <Field TagState TagState.CLOSE>
	//    2    4:invokespecial   #261 <Method void currentTagState(TagState)>
		callText();
	//    3    7:aload_0         
	//    4    8:invokespecial   #166 <Method void callText()>
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((XMLParserListener)iterator.next()).endElement(memory.getCurrentTag(), memory.getNameSpace()));
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field List listeners>
	//    7   15:invokeinterface #83  <Method Iterator List.iterator()>
	//    8   20:astore_1        
	//    9   21:aload_1         
	//   10   22:invokeinterface #89  <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            61
	//   12   30:aload_1         
	//   13   31:invokeinterface #93  <Method Object Iterator.next()>
	//   14   36:checkcast       #95  <Class XMLParserListener>
	//   15   39:aload_0         
	//   16   40:getfield        #69  <Field XMLParserMemory memory>
	//   17   43:invokevirtual   #181 <Method String XMLParserMemory.getCurrentTag()>
	//   18   46:aload_0         
	//   19   47:getfield        #69  <Field XMLParserMemory memory>
	//   20   50:invokevirtual   #264 <Method String XMLParserMemory.getNameSpace()>
	//   21   53:invokeinterface #267 <Method void XMLParserListener.endElement(String, String)>
	//*  22   58:goto            21
	//   23   61:return          
	}

	public void flush()
	{
		memory.resetBuffer();
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field XMLParserMemory memory>
	//    2    4:invokevirtual   #271 <Method void XMLParserMemory.resetBuffer()>
	//    3    7:return          
	}

	public Charset getCharset()
	{
		return charset;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Charset charset>
	//    2    4:areturn         
	}

	public XMLParserMemory memory()
	{
		return memory;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field XMLParserMemory memory>
	//    2    4:areturn         
	}

	public void parse(InputStream inputstream)
		throws IOException
	{
		parse(((Reader) (new InputStreamReader(inputstream))));
	//    0    0:aload_0         
	//    1    1:new             #227 <Class InputStreamReader>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #277 <Method void InputStreamReader(InputStream)>
	//    5    9:invokevirtual   #279 <Method void parse(Reader)>
	//    6   12:return          
	}

	public void parse(InputStream inputstream, Charset charset1)
		throws IOException
	{
		charset = charset1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #51  <Field Charset charset>
		parse(((Reader) (new InputStreamReader(inputstream, charset1))));
	//    3    5:aload_0         
	//    4    6:new             #227 <Class InputStreamReader>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokespecial   #282 <Method void InputStreamReader(InputStream, Charset)>
	//    9   15:invokevirtual   #279 <Method void parse(Reader)>
	//   10   18:return          
	}

	public void parse(InputStream inputstream, boolean flag)
		throws IOException
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            21
		{
			parse(((Reader) (detectEncoding(((InputStream) (new BufferedInputStream(inputstream)))))));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:new             #285 <Class BufferedInputStream>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokespecial   #286 <Method void BufferedInputStream(InputStream)>
	//    8   14:invokevirtual   #288 <Method InputStreamReader detectEncoding(InputStream)>
	//    9   17:invokevirtual   #279 <Method void parse(Reader)>
			return;
	//   10   20:return          
		} else
		{
			parse(inputstream);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #290 <Method void parse(InputStream)>
			return;
	//   14   26:return          
		}
	}

	public void parse(Reader reader)
		throws IOException
	{
		parseWithReader(reader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #292 <Method void parseWithReader(Reader)>
	//    3    5:return          
	}

	public XMLParser removeListener(XMLParserListener xmlparserlistener)
	{
		listeners.remove(((Object) (xmlparserlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field List listeners>
	//    2    4:aload_1         
	//    3    5:invokeinterface #296 <Method boolean List.remove(Object)>
	//    4   10:pop             
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public StateController selectState()
	{
		return controller;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field StateController controller>
	//    2    4:areturn         
	}

	public void setMonitor(ParserMonitor parsermonitor)
	{
		monitor = parsermonitor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #111 <Field ParserMonitor monitor>
	//    3    5:return          
	}

	protected void setState(State state1)
	{
		state = state1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #124 <Field State state>
	//    3    5:return          
	}

	public void startElement()
	{
		currentTagState(TagState.OPEN);
	//    0    0:aload_0         
	//    1    1:getstatic       #306 <Field TagState TagState.OPEN>
	//    2    4:invokespecial   #261 <Method void currentTagState(TagState)>
		callText();
	//    3    7:aload_0         
	//    4    8:invokespecial   #166 <Method void callText()>
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((XMLParserListener)iterator.next()).startElement(memory.getCurrentTag(), memory.getAttributes(), memory.getNameSpace()));
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field List listeners>
	//    7   15:invokeinterface #83  <Method Iterator List.iterator()>
	//    8   20:astore_1        
	//    9   21:aload_1         
	//   10   22:invokeinterface #89  <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            68
	//   12   30:aload_1         
	//   13   31:invokeinterface #93  <Method Object Iterator.next()>
	//   14   36:checkcast       #95  <Class XMLParserListener>
	//   15   39:aload_0         
	//   16   40:getfield        #69  <Field XMLParserMemory memory>
	//   17   43:invokevirtual   #181 <Method String XMLParserMemory.getCurrentTag()>
	//   18   46:aload_0         
	//   19   47:getfield        #69  <Field XMLParserMemory memory>
	//   20   50:invokevirtual   #310 <Method java.util.Map XMLParserMemory.getAttributes()>
	//   21   53:aload_0         
	//   22   54:getfield        #69  <Field XMLParserMemory memory>
	//   23   57:invokevirtual   #264 <Method String XMLParserMemory.getNameSpace()>
	//   24   60:invokeinterface #313 <Method void XMLParserListener.startElement(String, java.util.Map, String)>
	//*  25   65:goto            21
		memory().flushNameSpace();
	//   26   68:aload_0         
	//   27   69:invokevirtual   #315 <Method XMLParserMemory memory()>
	//   28   72:invokevirtual   #318 <Method void XMLParserMemory.flushNameSpace()>
	//   29   75:return          
	}

	public void text(String s)
	{
		text = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field String text>
	//    3    5:return          
	}

	public void unknownData()
	{
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((XMLParserListener)iterator.next()).unknownText(memory.current().toString()));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field List listeners>
	//    2    4:invokeinterface #83  <Method Iterator List.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #89  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            46
	//    7   19:aload_1         
	//    8   20:invokeinterface #93  <Method Object Iterator.next()>
	//    9   25:checkcast       #95  <Class XMLParserListener>
	//   10   28:aload_0         
	//   11   29:getfield        #69  <Field XMLParserMemory memory>
	//   12   32:invokevirtual   #143 <Method StringBuilder XMLParserMemory.current()>
	//   13   35:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   14   38:invokeinterface #322 <Method void XMLParserListener.unknownText(String)>
	//*  15   43:goto            10
	//   16   46:return          
	}

	private Charset charset;
	private final StateController controller;
	private final List listeners;
	private final XMLParserMemory memory;
	private ParserMonitor monitor;
	private State state;
	private TagState tagState;
	private String text;
}
