// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public abstract class DOMDeserializer extends FromStringDeserializer
{
	public static class DocumentDeserializer extends DOMDeserializer
	{

		public volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
		{
			return ((Object) (_deserialize(s, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #23  <Method Document _deserialize(String, DeserializationContext)>
		//    4    6:areturn         
		}

		public Document _deserialize(String s, DeserializationContext deserializationcontext)
			throws IllegalArgumentException
		{
			return parse(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #29  <Method Document parse(String)>
		//    3    5:areturn         
		}

		private static final long serialVersionUID = 1L;

		public DocumentDeserializer()
		{
			super(org/w3c/dom/Document);
		//    0    0:aload_0         
		//    1    1:ldc1            #14  <Class Document>
		//    2    3:invokespecial   #17  <Method void DOMDeserializer(Class)>
		//    3    6:return          
		}
	}

	public static class NodeDeserializer extends DOMDeserializer
	{

		public volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
		{
			return ((Object) (_deserialize(s, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #23  <Method Node _deserialize(String, DeserializationContext)>
		//    4    6:areturn         
		}

		public Node _deserialize(String s, DeserializationContext deserializationcontext)
			throws IllegalArgumentException
		{
			return ((Node) (parse(s)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #29  <Method Document parse(String)>
		//    3    5:areturn         
		}

		private static final long serialVersionUID = 1L;

		public NodeDeserializer()
		{
			super(org/w3c/dom/Node);
		//    0    0:aload_0         
		//    1    1:ldc1            #14  <Class Node>
		//    2    3:invokespecial   #17  <Method void DOMDeserializer(Class)>
		//    3    6:return          
		}
	}


	protected DOMDeserializer(Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #36  <Method void FromStringDeserializer(Class)>
	//    3    5:return          
	}

	public abstract Object _deserialize(String s, DeserializationContext deserializationcontext);

	protected final Document parse(String s)
		throws IllegalArgumentException
	{
		try
		{
			s = ((String) (_parserFactory.newDocumentBuilder().parse(new InputSource(((java.io.Reader) (new StringReader(s)))))));
	//    0    0:getstatic       #27  <Field DocumentBuilderFactory _parserFactory>
	//    1    3:invokevirtual   #50  <Method DocumentBuilder DocumentBuilderFactory.newDocumentBuilder()>
	//    2    6:new             #52  <Class InputSource>
	//    3    9:dup             
	//    4   10:new             #54  <Class StringReader>
	//    5   13:dup             
	//    6   14:aload_1         
	//    7   15:invokespecial   #57  <Method void StringReader(String)>
	//    8   18:invokespecial   #60  <Method void InputSource(java.io.Reader)>
	//    9   21:invokevirtual   #65  <Method Document DocumentBuilder.parse(InputSource)>
	//   10   24:astore_1        
		}
	//*  11   25:aload_1         
	//*  12   26:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  13   27:astore_1        
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Failed to parse JSON String as XML: ").append(((Exception) (s)).getMessage()).toString(), ((Throwable) (s)));
	//   14   28:new             #44  <Class IllegalArgumentException>
	//   15   31:dup             
	//   16   32:new             #67  <Class StringBuilder>
	//   17   35:dup             
	//   18   36:invokespecial   #69  <Method void StringBuilder()>
	//   19   39:ldc1            #71  <String "Failed to parse JSON String as XML: ">
	//   20   41:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:aload_1         
	//   22   45:invokevirtual   #79  <Method String Exception.getMessage()>
	//   23   48:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   24   51:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   25   54:aload_1         
	//   26   55:invokespecial   #85  <Method void IllegalArgumentException(String, Throwable)>
	//   27   58:athrow          
		}
		return ((Document) (s));
	}

	private static final DocumentBuilderFactory _parserFactory;
	private static final long serialVersionUID = 1L;

	static 
	{
		_parserFactory = DocumentBuilderFactory.newInstance();
	//    0    0:invokestatic    #25  <Method DocumentBuilderFactory DocumentBuilderFactory.newInstance()>
	//    1    3:putstatic       #27  <Field DocumentBuilderFactory _parserFactory>
		_parserFactory.setNamespaceAware(true);
	//    2    6:getstatic       #27  <Field DocumentBuilderFactory _parserFactory>
	//    3    9:iconst_1        
	//    4   10:invokevirtual   #31  <Method void DocumentBuilderFactory.setNamespaceAware(boolean)>
	//*   5   13:return          
	}
}
