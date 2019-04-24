// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.testutils;

import java.io.OutputStream;
import java.util.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;

// Referenced classes of package com.itextpdf.testutils:
//			CompareTool

protected class CompareTool$CompareResult
{

	protected void addError(CompareTool.ObjectPath objectpath, String s)
	{
		if(differences.size() < messageLimit)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field Map differences>
	//*   2    4:invokeinterface #37  <Method int Map.size()>
	//*   3    9:aload_0         
	//*   4   10:getfield        #28  <Field int messageLimit>
	//*   5   13:icmpge          34
			differences.put(((Object) ((CompareTool.ObjectPath)objectpath.clone())), ((Object) (s)));
	//    6   16:aload_0         
	//    7   17:getfield        #26  <Field Map differences>
	//    8   20:aload_1         
	//    9   21:invokevirtual   #43  <Method Object CompareTool$ObjectPath.clone()>
	//   10   24:checkcast       #39  <Class CompareTool$ObjectPath>
	//   11   27:aload_2         
	//   12   28:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   13   33:pop             
	//   14   34:return          
	}

	public int getErrorCount()
	{
		return differences.size();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Map differences>
	//    2    4:invokeinterface #37  <Method int Map.size()>
	//    3    9:ireturn         
	}

	public String getReport()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #52  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void StringBuilder()>
	//    3    7:astore_2        
		boolean flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		for(Iterator iterator = differences.entrySet().iterator(); iterator.hasNext();)
	//*   6   10:aload_0         
	//*   7   11:getfield        #26  <Field Map differences>
	//*   8   14:invokeinterface #57  <Method Set Map.entrySet()>
	//*   9   19:invokeinterface #63  <Method Iterator Set.iterator()>
	//*  10   24:astore_3        
	//*  11   25:aload_3         
	//*  12   26:invokeinterface #69  <Method boolean Iterator.hasNext()>
	//*  13   31:ifeq            111
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   14   34:aload_3         
	//   15   35:invokeinterface #72  <Method Object Iterator.next()>
	//   16   40:checkcast       #74  <Class java.util.Map$Entry>
	//   17   43:astore          4
			if(!flag)
	//*  18   45:iload_1         
	//*  19   46:ifne            61
				stringbuilder.append("-----------------------------").append("\n");
	//   20   49:aload_2         
	//   21   50:ldc1            #76  <String "-----------------------------">
	//   22   52:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   23   55:ldc1            #82  <String "\n">
	//   24   57:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   25   60:pop             
			CompareTool.ObjectPath objectpath = (CompareTool.ObjectPath)entry.getKey();
	//   26   61:aload           4
	//   27   63:invokeinterface #85  <Method Object java.util.Map$Entry.getKey()>
	//   28   68:checkcast       #39  <Class CompareTool$ObjectPath>
	//   29   71:astore          5
			stringbuilder.append((String)entry.getValue()).append("\n").append(objectpath.toString()).append("\n");
	//   30   73:aload_2         
	//   31   74:aload           4
	//   32   76:invokeinterface #88  <Method Object java.util.Map$Entry.getValue()>
	//   33   81:checkcast       #90  <Class String>
	//   34   84:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   35   87:ldc1            #82  <String "\n">
	//   36   89:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   37   92:aload           5
	//   38   94:invokevirtual   #93  <Method String CompareTool$ObjectPath.toString()>
	//   39   97:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   40  100:ldc1            #82  <String "\n">
	//   41  102:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   42  105:pop             
			flag = false;
	//   43  106:iconst_0        
	//   44  107:istore_1        
		}

	//*  45  108:goto            25
		return stringbuilder.toString();
	//   46  111:aload_2         
	//   47  112:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   48  115:areturn         
	}

	protected boolean isMessageLimitReached()
	{
		return differences.size() >= messageLimit;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Map differences>
	//    2    4:invokeinterface #37  <Method int Map.size()>
	//    3    9:aload_0         
	//    4   10:getfield        #28  <Field int messageLimit>
	//    5   13:icmplt          18
	//    6   16:iconst_1        
	//    7   17:ireturn         
	//    8   18:iconst_0        
	//    9   19:ireturn         
	}

	public boolean isOk()
	{
		return differences.size() == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Map differences>
	//    2    4:invokeinterface #37  <Method int Map.size()>
	//    3    9:ifne            14
	//    4   12:iconst_1        
	//    5   13:ireturn         
	//    6   14:iconst_0        
	//    7   15:ireturn         
	}

	public void writeReportToXml(OutputStream outputstream)
		throws ParserConfigurationException, TransformerException
	{
		Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
	//    0    0:invokestatic    #108 <Method DocumentBuilderFactory DocumentBuilderFactory.newInstance()>
	//    1    3:invokevirtual   #112 <Method DocumentBuilder DocumentBuilderFactory.newDocumentBuilder()>
	//    2    6:invokevirtual   #118 <Method Document DocumentBuilder.newDocument()>
	//    3    9:astore_2        
		Object obj = ((Object) (document.createElement("report")));
	//    4   10:aload_2         
	//    5   11:ldc1            #120 <String "report">
	//    6   13:invokeinterface #126 <Method Element Document.createElement(String)>
	//    7   18:astore_3        
		Element element = document.createElement("errors");
	//    8   19:aload_2         
	//    9   20:ldc1            #128 <String "errors">
	//   10   22:invokeinterface #126 <Method Element Document.createElement(String)>
	//   11   27:astore          4
		element.setAttribute("count", String.valueOf(differences.size()));
	//   12   29:aload           4
	//   13   31:ldc1            #130 <String "count">
	//   14   33:aload_0         
	//   15   34:getfield        #26  <Field Map differences>
	//   16   37:invokeinterface #37  <Method int Map.size()>
	//   17   42:invokestatic    #134 <Method String String.valueOf(int)>
	//   18   45:invokeinterface #140 <Method void Element.setAttribute(String, String)>
		((Element) (obj)).appendChild(((Node) (element)));
	//   19   50:aload_3         
	//   20   51:aload           4
	//   21   53:invokeinterface #144 <Method Node Element.appendChild(Node)>
	//   22   58:pop             
		Element element1;
		for(Iterator iterator = differences.entrySet().iterator(); iterator.hasNext(); element.appendChild(((Node) (element1))))
	//*  23   59:aload_0         
	//*  24   60:getfield        #26  <Field Map differences>
	//*  25   63:invokeinterface #57  <Method Set Map.entrySet()>
	//*  26   68:invokeinterface #63  <Method Iterator Set.iterator()>
	//*  27   73:astore          5
	//*  28   75:aload           5
	//*  29   77:invokeinterface #69  <Method boolean Iterator.hasNext()>
	//*  30   82:ifeq            190
		{
			Object obj1 = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   31   85:aload           5
	//   32   87:invokeinterface #72  <Method Object Iterator.next()>
	//   33   92:checkcast       #74  <Class java.util.Map$Entry>
	//   34   95:astore          8
			element1 = document.createElement("error");
	//   35   97:aload_2         
	//   36   98:ldc1            #146 <String "error">
	//   37  100:invokeinterface #126 <Method Element Document.createElement(String)>
	//   38  105:astore          6
			Element element2 = document.createElement("message");
	//   39  107:aload_2         
	//   40  108:ldc1            #148 <String "message">
	//   41  110:invokeinterface #126 <Method Element Document.createElement(String)>
	//   42  115:astore          7
			((Node) (element2)).appendChild(((Node) (document.createTextNode((String)((java.util.Map.Entry) (obj1)).getValue()))));
	//   43  117:aload           7
	//   44  119:aload_2         
	//   45  120:aload           8
	//   46  122:invokeinterface #88  <Method Object java.util.Map$Entry.getValue()>
	//   47  127:checkcast       #90  <Class String>
	//   48  130:invokeinterface #152 <Method org.w3c.dom.Text Document.createTextNode(String)>
	//   49  135:invokeinterface #155 <Method Node Node.appendChild(Node)>
	//   50  140:pop             
			obj1 = ((Object) (((CompareTool.ObjectPath)((java.util.Map.Entry) (obj1)).getKey()).toXmlNode(document)));
	//   51  141:aload           8
	//   52  143:invokeinterface #85  <Method Object java.util.Map$Entry.getKey()>
	//   53  148:checkcast       #39  <Class CompareTool$ObjectPath>
	//   54  151:aload_2         
	//   55  152:invokevirtual   #159 <Method Node CompareTool$ObjectPath.toXmlNode(Document)>
	//   56  155:astore          8
			((Node) (element1)).appendChild(((Node) (element2)));
	//   57  157:aload           6
	//   58  159:aload           7
	//   59  161:invokeinterface #155 <Method Node Node.appendChild(Node)>
	//   60  166:pop             
			((Node) (element1)).appendChild(((Node) (obj1)));
	//   61  167:aload           6
	//   62  169:aload           8
	//   63  171:invokeinterface #155 <Method Node Node.appendChild(Node)>
	//   64  176:pop             
		}

	//   65  177:aload           4
	//   66  179:aload           6
	//   67  181:invokeinterface #144 <Method Node Element.appendChild(Node)>
	//   68  186:pop             
	//*  69  187:goto            75
		document.appendChild(((Node) (obj)));
	//   70  190:aload_2         
	//   71  191:aload_3         
	//   72  192:invokeinterface #160 <Method Node Document.appendChild(Node)>
	//   73  197:pop             
		obj = ((Object) (TransformerFactory.newInstance().newTransformer()));
	//   74  198:invokestatic    #165 <Method TransformerFactory TransformerFactory.newInstance()>
	//   75  201:invokevirtual   #169 <Method Transformer TransformerFactory.newTransformer()>
	//   76  204:astore_3        
		((Transformer) (obj)).setOutputProperty("indent", "yes");
	//   77  205:aload_3         
	//   78  206:ldc1            #171 <String "indent">
	//   79  208:ldc1            #173 <String "yes">
	//   80  210:invokevirtual   #178 <Method void Transformer.setOutputProperty(String, String)>
		((Transformer) (obj)).transform(((javax.xml.transform.Source) (new DOMSource(((Node) (document))))), ((javax.xml.transform.Result) (new StreamResult(outputstream))));
	//   81  213:aload_3         
	//   82  214:new             #180 <Class DOMSource>
	//   83  217:dup             
	//   84  218:aload_2         
	//   85  219:invokespecial   #183 <Method void DOMSource(Node)>
	//   86  222:new             #185 <Class StreamResult>
	//   87  225:dup             
	//   88  226:aload_1         
	//   89  227:invokespecial   #187 <Method void StreamResult(OutputStream)>
	//   90  230:invokevirtual   #191 <Method void Transformer.transform(javax.xml.transform.Source, javax.xml.transform.Result)>
	//   91  233:return          
	}

	protected Map differences;
	protected int messageLimit;
	final CompareTool this$0;

	public CompareTool$CompareResult(int i)
	{
		this$0 = CompareTool.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field CompareTool this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		differences = ((Map) (new LinkedHashMap()));
	//    5    9:aload_0         
	//    6   10:new             #23  <Class LinkedHashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #24  <Method void LinkedHashMap()>
	//    9   17:putfield        #26  <Field Map differences>
		messageLimit = 1;
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:putfield        #28  <Field int messageLimit>
		messageLimit = i;
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:putfield        #28  <Field int messageLimit>
	//   16   30:return          
	}
}
