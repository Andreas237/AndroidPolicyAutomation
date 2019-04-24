// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser;

import com.itextpdf.tool.xml.parser.state.AttributeValueState;
import com.itextpdf.tool.xml.parser.state.CdataState;
import com.itextpdf.tool.xml.parser.state.CloseCommentState;
import com.itextpdf.tool.xml.parser.state.CloseStarCommentState;
import com.itextpdf.tool.xml.parser.state.ClosingTagState;
import com.itextpdf.tool.xml.parser.state.CommentState;
import com.itextpdf.tool.xml.parser.state.DocTypeState;
import com.itextpdf.tool.xml.parser.state.DoubleQuotedAttrValueState;
import com.itextpdf.tool.xml.parser.state.InsideTagHTMLState;
import com.itextpdf.tool.xml.parser.state.InsideTagState;
import com.itextpdf.tool.xml.parser.state.ProcessingInstructionEncounteredState;
import com.itextpdf.tool.xml.parser.state.SelfClosingTagState;
import com.itextpdf.tool.xml.parser.state.SingleQuotedAttrValueState;
import com.itextpdf.tool.xml.parser.state.SpecialCharState;
import com.itextpdf.tool.xml.parser.state.StarCommentState;
import com.itextpdf.tool.xml.parser.state.TagAttributeState;
import com.itextpdf.tool.xml.parser.state.TagEncounteredState;
import com.itextpdf.tool.xml.parser.state.UnknownState;
import com.itextpdf.tool.xml.parser.state.UnquotedAttrState;
import com.itextpdf.tool.xml.parser.state.XmlState;

// Referenced classes of package com.itextpdf.tool.xml.parser:
//			XMLParser, State

public class StateController
{

	public StateController(XMLParser xmlparser, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		parser = xmlparser;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field XMLParser parser>
		unknown = ((State) (new UnknownState(xmlparser)));
	//    5    9:aload_0         
	//    6   10:new             #37  <Class UnknownState>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #40  <Method void UnknownState(XMLParser)>
	//   10   18:putfield        #42  <Field State unknown>
		tagEncountered = ((State) (new TagEncounteredState(xmlparser)));
	//   11   21:aload_0         
	//   12   22:new             #44  <Class TagEncounteredState>
	//   13   25:dup             
	//   14   26:aload_1         
	//   15   27:invokespecial   #45  <Method void TagEncounteredState(XMLParser)>
	//   16   30:putfield        #47  <Field State tagEncountered>
		tagAttributes = ((State) (new TagAttributeState(xmlparser)));
	//   17   33:aload_0         
	//   18   34:new             #49  <Class TagAttributeState>
	//   19   37:dup             
	//   20   38:aload_1         
	//   21   39:invokespecial   #50  <Method void TagAttributeState(XMLParser)>
	//   22   42:putfield        #52  <Field State tagAttributes>
		Object obj;
		if(flag)
	//*  23   45:iload_2         
	//*  24   46:ifeq            254
			obj = ((Object) (new InsideTagHTMLState(xmlparser)));
	//   25   49:new             #54  <Class InsideTagHTMLState>
	//   26   52:dup             
	//   27   53:aload_1         
	//   28   54:invokespecial   #55  <Method void InsideTagHTMLState(XMLParser)>
	//   29   57:astore_3        
		else
	//*  30   58:aload_0         
	//*  31   59:aload_3         
	//*  32   60:putfield        #57  <Field State inTag>
	//*  33   63:aload_0         
	//*  34   64:new             #59  <Class AttributeValueState>
	//*  35   67:dup             
	//*  36   68:aload_1         
	//*  37   69:invokespecial   #60  <Method void AttributeValueState(XMLParser)>
	//*  38   72:putfield        #62  <Field State attrValue>
	//*  39   75:aload_0         
	//*  40   76:new             #64  <Class SingleQuotedAttrValueState>
	//*  41   79:dup             
	//*  42   80:aload_1         
	//*  43   81:invokespecial   #65  <Method void SingleQuotedAttrValueState(XMLParser)>
	//*  44   84:putfield        #67  <Field State singleQuoted>
	//*  45   87:aload_0         
	//*  46   88:new             #69  <Class DoubleQuotedAttrValueState>
	//*  47   91:dup             
	//*  48   92:aload_1         
	//*  49   93:invokespecial   #70  <Method void DoubleQuotedAttrValueState(XMLParser)>
	//*  50   96:putfield        #72  <Field State doubleQuoted>
	//*  51   99:aload_0         
	//*  52  100:new             #74  <Class SelfClosingTagState>
	//*  53  103:dup             
	//*  54  104:aload_1         
	//*  55  105:invokespecial   #75  <Method void SelfClosingTagState(XMLParser)>
	//*  56  108:putfield        #77  <Field State selfClosing>
	//*  57  111:aload_0         
	//*  58  112:new             #79  <Class SpecialCharState>
	//*  59  115:dup             
	//*  60  116:aload_1         
	//*  61  117:invokespecial   #80  <Method void SpecialCharState(XMLParser)>
	//*  62  120:putfield        #82  <Field State specialChar>
	//*  63  123:aload_0         
	//*  64  124:new             #84  <Class ClosingTagState>
	//*  65  127:dup             
	//*  66  128:aload_1         
	//*  67  129:invokespecial   #85  <Method void ClosingTagState(XMLParser)>
	//*  68  132:putfield        #87  <Field State closingTag>
	//*  69  135:aload_0         
	//*  70  136:new             #89  <Class CommentState>
	//*  71  139:dup             
	//*  72  140:aload_1         
	//*  73  141:invokespecial   #90  <Method void CommentState(XMLParser)>
	//*  74  144:putfield        #92  <Field State comment>
	//*  75  147:aload_0         
	//*  76  148:new             #94  <Class CloseCommentState>
	//*  77  151:dup             
	//*  78  152:aload_1         
	//*  79  153:invokespecial   #95  <Method void CloseCommentState(XMLParser)>
	//*  80  156:putfield        #97  <Field State closeComment>
	//*  81  159:aload_0         
	//*  82  160:new             #99  <Class CdataState>
	//*  83  163:dup             
	//*  84  164:aload_1         
	//*  85  165:invokespecial   #100 <Method void CdataState(XMLParser)>
	//*  86  168:putfield        #102 <Field State cdata>
	//*  87  171:aload_0         
	//*  88  172:new             #104 <Class XmlState>
	//*  89  175:dup             
	//*  90  176:aload_1         
	//*  91  177:invokespecial   #105 <Method void XmlState(XMLParser)>
	//*  92  180:putfield        #107 <Field State xml>
	//*  93  183:aload_0         
	//*  94  184:new             #109 <Class DocTypeState>
	//*  95  187:dup             
	//*  96  188:aload_1         
	//*  97  189:invokespecial   #110 <Method void DocTypeState(XMLParser)>
	//*  98  192:putfield        #112 <Field State doctype>
	//*  99  195:aload_0         
	//* 100  196:new             #114 <Class UnquotedAttrState>
	//* 101  199:dup             
	//* 102  200:aload_1         
	//* 103  201:invokespecial   #115 <Method void UnquotedAttrState(XMLParser)>
	//* 104  204:putfield        #117 <Field State unquoted>
	//* 105  207:aload_0         
	//* 106  208:new             #119 <Class ProcessingInstructionEncounteredState>
	//* 107  211:dup             
	//* 108  212:aload_1         
	//* 109  213:invokespecial   #120 <Method void ProcessingInstructionEncounteredState(XMLParser)>
	//* 110  216:putfield        #122 <Field State processingInstruction>
	//* 111  219:aload_0         
	//* 112  220:aconst_null     
	//* 113  221:putfield        #124 <Field State previousState>
	//* 114  224:aload_0         
	//* 115  225:aconst_null     
	//* 116  226:putfield        #126 <Field State currentState>
	//* 117  229:aload_0         
	//* 118  230:new             #128 <Class StarCommentState>
	//* 119  233:dup             
	//* 120  234:aload_1         
	//* 121  235:invokespecial   #129 <Method void StarCommentState(XMLParser)>
	//* 122  238:putfield        #131 <Field State starComment>
	//* 123  241:aload_0         
	//* 124  242:new             #133 <Class CloseStarCommentState>
	//* 125  245:dup             
	//* 126  246:aload_1         
	//* 127  247:invokespecial   #134 <Method void CloseStarCommentState(XMLParser)>
	//* 128  250:putfield        #136 <Field State closeStarComment>
	//* 129  253:return          
			obj = ((Object) (new InsideTagState(xmlparser)));
	//  130  254:new             #138 <Class InsideTagState>
	//  131  257:dup             
	//  132  258:aload_1         
	//  133  259:invokespecial   #139 <Method void InsideTagState(XMLParser)>
	//  134  262:astore_3        
		inTag = ((State) (obj));
		attrValue = ((State) (new AttributeValueState(xmlparser)));
		singleQuoted = ((State) (new SingleQuotedAttrValueState(xmlparser)));
		doubleQuoted = ((State) (new DoubleQuotedAttrValueState(xmlparser)));
		selfClosing = ((State) (new SelfClosingTagState(xmlparser)));
		specialChar = ((State) (new SpecialCharState(xmlparser)));
		closingTag = ((State) (new ClosingTagState(xmlparser)));
		comment = ((State) (new CommentState(xmlparser)));
		closeComment = ((State) (new CloseCommentState(xmlparser)));
		cdata = ((State) (new CdataState(xmlparser)));
		xml = ((State) (new XmlState(xmlparser)));
		doctype = ((State) (new DocTypeState(xmlparser)));
		unquoted = ((State) (new UnquotedAttrState(xmlparser)));
		processingInstruction = ((State) (new ProcessingInstructionEncounteredState(xmlparser)));
		previousState = null;
		currentState = null;
		starComment = ((State) (new StarCommentState(xmlparser)));
		closeStarComment = ((State) (new CloseStarCommentState(xmlparser)));
	//* 135  263:goto            58
	}

	public XMLParser attributeValue()
	{
		return setState(attrValue);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #62  <Field State attrValue>
	//    3    5:invokevirtual   #146 <Method XMLParser setState(State)>
	//    4    8:areturn         
	}

	public XMLParser cdata()
	{
		return setState(cdata);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #102 <Field State cdata>
	//    3    5:invokevirtual   #146 <Method XMLParser setState(State)>
	//    4    8:areturn         
	}

	public XMLParser closeComment()
	{
		return setState(closeComment);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #97  <Field State closeComment>
	//    3    5:invokevirtual   #146 <Method XMLParser setState(State)>
	//    4    8:areturn         
	}

	public XMLParser closeStarComment()
	{
		return setState(closeStarComment);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #136 <Field State closeStarComment>
	//    3    5:invokevirtual   #146 <Method XMLParser setState(State)>
	//    4    8:areturn         
	}

	public XMLParser closingTag()
	{
		return setState(closingTag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field State closingTag>
	//    3    5:invokevirtual   #146 <Method XMLParser setState(State)>
	//    4    8:areturn         
	}

	public XMLParser comment()
	{
		return setState(comment);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #92  <Field State comment>
	//    3    5:invokevirtual   #146 <Method XMLParser setState(State)>
	//    4    8:areturn         
	}

	public XMLParser doctype()
	{
		return setState(doctype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #112 <Field State doctype>
	//    3    5:invokevirtual   #146 <Method XMLParser setState(State)>
	//    4    8:areturn         
	}

	public XMLParser doubleQuotedAttr()
	{
		return setState(doubleQuoted);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #72  <Field State doubleQuoted>
	//    3    5:invokevirtual   #146 <Method XMLParser setState(State)>
	//    4    8:areturn         
	}

	public XMLParser inTag()
	{
		return setState(inTag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #57  <Field State inTag>
	//    3    5:invokevirtual   #146 <Method XMLParser setState(State)>
	//    4    8:areturn         
	}

	public XMLParser previousState()
	{
		parser.setState(previousState);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field XMLParser parser>
	//    2    4:aload_0         
	//    3    5:getfield        #124 <Field State previousState>
	//    4    8:invokevirtual   #152 <Method void XMLParser.setState(State)>
		State state = currentState;
	//    5   11:aload_0         
	//    6   12:getfield        #126 <Field State currentState>
	//    7   15:astore_1        
		currentState = previousState;
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #124 <Field State previousState>
	//   11   21:putfield        #126 <Field State currentState>
		previousState = state;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:putfield        #124 <Field State previousState>
		return parser;
	//   15   29:aload_0         
	//   16   30:getfield        #35  <Field XMLParser parser>
	//   17   33:areturn         
	}

	public XMLParser processingInstructions()
	{
		return setState(processingInstruction);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #122 <Field State processingInstruction>
	//    3    5:invokevirtual   #146 <Method XMLParser setState(State)>
	//    4    8:areturn         
	}

	public XMLParser selfClosing()
	{
		return setState(selfClosing);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #77  <Field State selfClosing>
	//    3    5:invokevirtual   #146 <Method XMLParser setState(State)>
	//    4    8:areturn         
	}

	public XMLParser setState(State state)
	{
		previousState = currentState;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #126 <Field State currentState>
	//    3    5:putfield        #124 <Field State previousState>
		currentState = state;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #126 <Field State currentState>
		parser.setState(state);
	//    7   13:aload_0         
	//    8   14:getfield        #35  <Field XMLParser parser>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #152 <Method void XMLParser.setState(State)>
		return parser;
	//   11   21:aload_0         
	//   12   22:getfield        #35  <Field XMLParser parser>
	//   13   25:areturn         
	}

	public XMLParser singleQuotedAttr()
	{
		return setState(singleQuoted);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #67  <Field State singleQuoted>
	//    3    5:invokevirtual   #146 <Method XMLParser setState(State)>
	//    4    8:areturn         
	}

	public XMLParser specialChar()
	{
		return setState(specialChar);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #82  <Field State specialChar>
	//    3    5:invokevirtual   #146 <Method XMLParser setState(State)>
	//    4    8:areturn         
	}

	public XMLParser starComment()
	{
		return setState(starComment);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #131 <Field State starComment>
	//    3    5:invokevirtual   #146 <Method XMLParser setState(State)>
	//    4    8:areturn         
	}

	public XMLParser tagAttributes()
	{
		return setState(tagAttributes);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #52  <Field State tagAttributes>
	//    3    5:invokevirtual   #146 <Method XMLParser setState(State)>
	//    4    8:areturn         
	}

	public XMLParser tagEncountered()
	{
		return setState(tagEncountered);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #47  <Field State tagEncountered>
	//    3    5:invokevirtual   #146 <Method XMLParser setState(State)>
	//    4    8:areturn         
	}

	public XMLParser unknown()
	{
		return setState(unknown);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #42  <Field State unknown>
	//    3    5:invokevirtual   #146 <Method XMLParser setState(State)>
	//    4    8:areturn         
	}

	public XMLParser unquotedAttr()
	{
		return setState(unquoted);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #117 <Field State unquoted>
	//    3    5:invokevirtual   #146 <Method XMLParser setState(State)>
	//    4    8:areturn         
	}

	private final State attrValue;
	private final State cdata;
	private final State closeComment;
	private State closeStarComment;
	private final State closingTag;
	private final State comment;
	private State currentState;
	private final State doctype;
	private final State doubleQuoted;
	private final State inTag;
	private final XMLParser parser;
	private State previousState;
	private final State processingInstruction;
	private final State selfClosing;
	private final State singleQuoted;
	private final State specialChar;
	private State starComment;
	private final State tagAttributes;
	private final State tagEncountered;
	private final State unknown;
	private final State unquoted;
	private final State xml;
}
