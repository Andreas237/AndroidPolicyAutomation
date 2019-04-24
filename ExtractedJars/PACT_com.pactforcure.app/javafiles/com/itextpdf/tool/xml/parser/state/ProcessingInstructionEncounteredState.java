// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser.state;

import com.itextpdf.tool.xml.parser.*;

// Referenced classes of package com.itextpdf.tool.xml.parser.state:
//			TagAttributeState

public class ProcessingInstructionEncounteredState extends TagAttributeState
{

	public ProcessingInstructionEncounteredState(XMLParser xmlparser)
	{
		super(xmlparser);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void TagAttributeState(XMLParser)>
		name = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #12  <Field String name>
	//    6   10:return          
	}

	public void process(char c)
	{
		String s;
		s = parser.bufferToString();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field XMLParser parser>
	//    2    4:invokevirtual   #25  <Method String XMLParser.bufferToString()>
	//    3    7:astore_2        
		if(name != null || !Character.isWhitespace(c))
			break MISSING_BLOCK_LABEL_81;
	//    4    8:aload_0         
	//    5    9:getfield        #12  <Field String name>
	//    6   12:ifnonnull       81
	//    7   15:iload_1         
	//    8   16:invokestatic    #31  <Method boolean Character.isWhitespace(char)>
	//    9   19:ifeq            81
		if(!Character.isWhitespace(c)) goto _L2; else goto _L1
	//   10   22:iload_1         
	//   11   23:invokestatic    #31  <Method boolean Character.isWhitespace(char)>
	//   12   26:ifeq            56
_L1:
		name = s;
	//   13   29:aload_0         
	//   14   30:aload_2         
	//   15   31:putfield        #12  <Field String name>
		parser.memory().currentTag(name);
	//   16   34:aload_0         
	//   17   35:getfield        #19  <Field XMLParser parser>
	//   18   38:invokevirtual   #35  <Method XMLParserMemory XMLParser.memory()>
	//   19   41:aload_0         
	//   20   42:getfield        #12  <Field String name>
	//   21   45:invokevirtual   #41  <Method void XMLParserMemory.currentTag(String)>
		parser.flush();
	//   22   48:aload_0         
	//   23   49:getfield        #19  <Field XMLParser parser>
	//   24   52:invokevirtual   #45  <Method void XMLParser.flush()>
_L4:
		return;
	//   25   55:return          
_L2:
		if(c != '?') goto _L4; else goto _L3
	//   26   56:iload_1         
	//   27   57:bipush          63
	//   28   59:icmpne          55
_L3:
		parser.flush();
	//   29   62:aload_0         
	//   30   63:getfield        #19  <Field XMLParser parser>
	//   31   66:invokevirtual   #45  <Method void XMLParser.flush()>
		parser.selectState().selfClosing();
	//   32   69:aload_0         
	//   33   70:getfield        #19  <Field XMLParser parser>
	//   34   73:invokevirtual   #49  <Method StateController XMLParser.selectState()>
	//   35   76:invokevirtual   #55  <Method XMLParser StateController.selfClosing()>
	//   36   79:pop             
		return;
	//   37   80:return          
		if(Character.isWhitespace(c))
	//*  38   81:iload_1         
	//*  39   82:invokestatic    #31  <Method boolean Character.isWhitespace(char)>
	//*  40   85:ifeq            100
		{
			checkAttributeWithNoValue();
	//   41   88:aload_0         
	//   42   89:invokevirtual   #58  <Method void checkAttributeWithNoValue()>
			parser.flush();
	//   43   92:aload_0         
	//   44   93:getfield        #19  <Field XMLParser parser>
	//   45   96:invokevirtual   #45  <Method void XMLParser.flush()>
			return;
	//   46   99:return          
		}
		if(c == '?')
	//*  47  100:iload_1         
	//*  48  101:bipush          63
	//*  49  103:icmpne          134
		{
			name = null;
	//   50  106:aload_0         
	//   51  107:aconst_null     
	//   52  108:putfield        #12  <Field String name>
			checkAttributeWithNoValue();
	//   53  111:aload_0         
	//   54  112:invokevirtual   #58  <Method void checkAttributeWithNoValue()>
			parser.flush();
	//   55  115:aload_0         
	//   56  116:getfield        #19  <Field XMLParser parser>
	//   57  119:invokevirtual   #45  <Method void XMLParser.flush()>
			parser.selectState().selfClosing();
	//   58  122:aload_0         
	//   59  123:getfield        #19  <Field XMLParser parser>
	//   60  126:invokevirtual   #49  <Method StateController XMLParser.selectState()>
	//   61  129:invokevirtual   #55  <Method XMLParser StateController.selfClosing()>
	//   62  132:pop             
			return;
	//   63  133:return          
		} else
		{
			parser.append(c);
	//   64  134:aload_0         
	//   65  135:getfield        #19  <Field XMLParser parser>
	//   66  138:iload_1         
	//   67  139:invokevirtual   #62  <Method XMLParser XMLParser.append(char)>
	//   68  142:pop             
			return;
	//   69  143:return          
		}
	}

	protected String name;
}
