// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.event;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.spi.ElementPath;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.ContextAwareImpl;
import ch.qos.logback.core.status.Status;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.sax2.Driver;

// Referenced classes of package ch.qos.logback.core.joran.event:
//			BodyEvent, EndEvent, SaxEvent, StartEvent

public class SaxEventRecorder extends DefaultHandler
	implements ContextAware
{

	public SaxEventRecorder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void DefaultHandler()>
		saxEventList = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #21  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void ArrayList()>
	//    6   12:putfield        #24  <Field List saxEventList>
		globalElementPath = new ElementPath();
	//    7   15:aload_0         
	//    8   16:new             #26  <Class ElementPath>
	//    9   19:dup             
	//   10   20:invokespecial   #27  <Method void ElementPath()>
	//   11   23:putfield        #29  <Field ElementPath globalElementPath>
		cai = new ContextAwareImpl(((Context) (null)), ((Object) (this)));
	//   12   26:aload_0         
	//   13   27:new             #31  <Class ContextAwareImpl>
	//   14   30:dup             
	//   15   31:aconst_null     
	//   16   32:aload_0         
	//   17   33:invokespecial   #34  <Method void ContextAwareImpl(Context, Object)>
	//   18   36:putfield        #36  <Field ContextAwareImpl cai>
	//   19   39:return          
	}

	public SaxEventRecorder(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void DefaultHandler()>
		saxEventList = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #21  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void ArrayList()>
	//    6   12:putfield        #24  <Field List saxEventList>
		globalElementPath = new ElementPath();
	//    7   15:aload_0         
	//    8   16:new             #26  <Class ElementPath>
	//    9   19:dup             
	//   10   20:invokespecial   #27  <Method void ElementPath()>
	//   11   23:putfield        #29  <Field ElementPath globalElementPath>
		cai = new ContextAwareImpl(context, ((Object) (this)));
	//   12   26:aload_0         
	//   13   27:new             #31  <Class ContextAwareImpl>
	//   14   30:dup             
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:invokespecial   #34  <Method void ContextAwareImpl(Context, Object)>
	//   18   36:putfield        #36  <Field ContextAwareImpl cai>
	//   19   39:return          
	}

	private Driver buildPullParser()
	{
		Driver driver = new Driver();
	//    0    0:new             #46  <Class Driver>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void Driver()>
	//    3    7:astore_1        
		Exception exception;
		try
		{
			driver.setFeature("http://xml.org/sax/features/validation", false);
	//    4    8:aload_1         
	//    5    9:ldc1            #49  <String "http://xml.org/sax/features/validation">
	//    6   11:iconst_0        
	//    7   12:invokevirtual   #53  <Method void Driver.setFeature(String, boolean)>
		}
	//*   8   15:aload_1         
	//*   9   16:ldc1            #55  <String "http://xml.org/sax/features/namespaces">
	//*  10   18:iconst_1        
	//*  11   19:invokevirtual   #53  <Method void Driver.setFeature(String, boolean)>
	//*  12   22:aload_1         
	//*  13   23:areturn         
	//*  14   24:astore_1        
	//*  15   25:aload_0         
	//*  16   26:ldc1            #57  <String "Parser configuration error occurred">
	//*  17   28:aload_1         
	//*  18   29:invokevirtual   #61  <Method void addError(String, Throwable)>
	//*  19   32:new             #63  <Class JoranException>
	//*  20   35:dup             
	//*  21   36:ldc1            #57  <String "Parser configuration error occurred">
	//*  22   38:aload_1         
	//*  23   39:invokespecial   #65  <Method void JoranException(String, Throwable)>
	//*  24   42:athrow          
		catch(SAXNotSupportedException saxnotsupportedexception) { }
	//   25   43:astore_2        
		driver.setFeature("http://xml.org/sax/features/namespaces", true);
		return driver;
		exception;
		addError("Parser configuration error occurred", ((Throwable) (exception)));
		throw new JoranException("Parser configuration error occurred", ((Throwable) (exception)));
	//*  26   44:goto            15
	}

	private void handleError(String s, Throwable throwable)
	{
		addError(s, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #61  <Method void addError(String, Throwable)>
		throw new JoranException(s, throwable);
	//    4    6:new             #63  <Class JoranException>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokespecial   #65  <Method void JoranException(String, Throwable)>
	//    9   15:athrow          
	}

	public void addError(String s)
	{
		cai.addError(s);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ContextAwareImpl cai>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #69  <Method void ContextAwareImpl.addError(String)>
	//    4    8:return          
	}

	public void addError(String s, Throwable throwable)
	{
		cai.addError(s, throwable);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ContextAwareImpl cai>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #70  <Method void ContextAwareImpl.addError(String, Throwable)>
	//    5    9:return          
	}

	public void addInfo(String s)
	{
		cai.addInfo(s);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ContextAwareImpl cai>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #73  <Method void ContextAwareImpl.addInfo(String)>
	//    4    8:return          
	}

	public void addInfo(String s, Throwable throwable)
	{
		cai.addInfo(s, throwable);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ContextAwareImpl cai>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #75  <Method void ContextAwareImpl.addInfo(String, Throwable)>
	//    5    9:return          
	}

	public void addStatus(Status status)
	{
		cai.addStatus(status);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ContextAwareImpl cai>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #79  <Method void ContextAwareImpl.addStatus(Status)>
	//    4    8:return          
	}

	public void addWarn(String s)
	{
		cai.addWarn(s);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ContextAwareImpl cai>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #82  <Method void ContextAwareImpl.addWarn(String)>
	//    4    8:return          
	}

	public void addWarn(String s, Throwable throwable)
	{
		cai.addWarn(s, throwable);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ContextAwareImpl cai>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #84  <Method void ContextAwareImpl.addWarn(String, Throwable)>
	//    5    9:return          
	}

	public void characters(char ac[], int i, int j)
	{
		ac = ((char []) (new String(ac, i, j)));
	//    0    0:new             #88  <Class String>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokespecial   #90  <Method void String(char[], int, int)>
	//    6   10:astore_1        
		SaxEvent saxevent = getLastEvent();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #94  <Method SaxEvent getLastEvent()>
	//    9   15:astore          4
		if(saxevent instanceof BodyEvent)
	//*  10   17:aload           4
	//*  11   19:instanceof      #96  <Class BodyEvent>
	//*  12   22:ifeq            35
		{
			((BodyEvent)saxevent).append(((String) (ac)));
	//   13   25:aload           4
	//   14   27:checkcast       #96  <Class BodyEvent>
	//   15   30:aload_1         
	//   16   31:invokevirtual   #99  <Method void BodyEvent.append(String)>
			return;
	//   17   34:return          
		}
		if(!isSpaceOnly(((String) (ac))))
	//*  18   35:aload_0         
	//*  19   36:aload_1         
	//*  20   37:invokevirtual   #103 <Method boolean isSpaceOnly(String)>
	//*  21   40:ifne            65
			saxEventList.add(((Object) (new BodyEvent(((String) (ac)), getLocator()))));
	//   22   43:aload_0         
	//   23   44:getfield        #24  <Field List saxEventList>
	//   24   47:new             #96  <Class BodyEvent>
	//   25   50:dup             
	//   26   51:aload_1         
	//   27   52:aload_0         
	//   28   53:invokevirtual   #107 <Method Locator getLocator()>
	//   29   56:invokespecial   #110 <Method void BodyEvent(String, Locator)>
	//   30   59:invokeinterface #116 <Method boolean List.add(Object)>
	//   31   64:pop             
	//   32   65:return          
	}

	public void endElement(String s, String s1, String s2)
	{
		if(s2 != null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          9
			s2.length();
	//    2    4:aload_3         
	//    3    5:invokevirtual   #122 <Method int String.length()>
	//    4    8:pop             
		saxEventList.add(((Object) (new EndEvent(s, s1, s2, getLocator()))));
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field List saxEventList>
	//    7   13:new             #124 <Class EndEvent>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:aload_3         
	//   12   20:aload_0         
	//   13   21:invokevirtual   #107 <Method Locator getLocator()>
	//   14   24:invokespecial   #127 <Method void EndEvent(String, String, String, Locator)>
	//   15   27:invokeinterface #116 <Method boolean List.add(Object)>
	//   16   32:pop             
		globalElementPath.pop();
	//   17   33:aload_0         
	//   18   34:getfield        #29  <Field ElementPath globalElementPath>
	//   19   37:invokevirtual   #130 <Method void ElementPath.pop()>
	//   20   40:return          
	}

	public void error(SAXParseException saxparseexception)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #134 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #135 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("XML_PARSING - Parsing error on line ");
	//    4    8:aload_2         
	//    5    9:ldc1            #137 <String "XML_PARSING - Parsing error on line ">
	//    6   11:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(saxparseexception.getLineNumber());
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #145 <Method int SAXParseException.getLineNumber()>
	//   11   20:invokevirtual   #148 <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(" and column ");
	//   13   24:aload_2         
	//   14   25:ldc1            #150 <String " and column ">
	//   15   27:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(saxparseexception.getColumnNumber());
	//   17   31:aload_2         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #153 <Method int SAXParseException.getColumnNumber()>
	//   20   36:invokevirtual   #148 <Method StringBuilder StringBuilder.append(int)>
	//   21   39:pop             
		addError(stringbuilder.toString(), ((Throwable) (saxparseexception)));
	//   22   40:aload_0         
	//   23   41:aload_2         
	//   24   42:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   25   45:aload_1         
	//   26   46:invokevirtual   #61  <Method void addError(String, Throwable)>
	//   27   49:return          
	}

	public void fatalError(SAXParseException saxparseexception)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #134 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #135 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("XML_PARSING - Parsing fatal error on line ");
	//    4    8:aload_2         
	//    5    9:ldc1            #160 <String "XML_PARSING - Parsing fatal error on line ">
	//    6   11:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(saxparseexception.getLineNumber());
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #145 <Method int SAXParseException.getLineNumber()>
	//   11   20:invokevirtual   #148 <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(" and column ");
	//   13   24:aload_2         
	//   14   25:ldc1            #150 <String " and column ">
	//   15   27:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(saxparseexception.getColumnNumber());
	//   17   31:aload_2         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #153 <Method int SAXParseException.getColumnNumber()>
	//   20   36:invokevirtual   #148 <Method StringBuilder StringBuilder.append(int)>
	//   21   39:pop             
		addError(stringbuilder.toString(), ((Throwable) (saxparseexception)));
	//   22   40:aload_0         
	//   23   41:aload_2         
	//   24   42:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   25   45:aload_1         
	//   26   46:invokevirtual   #61  <Method void addError(String, Throwable)>
	//   27   49:return          
	}

	public Context getContext()
	{
		return cai.getContext();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ContextAwareImpl cai>
	//    2    4:invokevirtual   #164 <Method Context ContextAwareImpl.getContext()>
	//    3    7:areturn         
	}

	SaxEvent getLastEvent()
	{
		if(saxEventList.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field List saxEventList>
	//*   2    4:invokeinterface #168 <Method boolean List.isEmpty()>
	//*   3    9:ifeq            14
		{
			return null;
	//    4   12:aconst_null     
	//    5   13:areturn         
		} else
		{
			int i = saxEventList.size();
	//    6   14:aload_0         
	//    7   15:getfield        #24  <Field List saxEventList>
	//    8   18:invokeinterface #171 <Method int List.size()>
	//    9   23:istore_1        
			return (SaxEvent)saxEventList.get(i - 1);
	//   10   24:aload_0         
	//   11   25:getfield        #24  <Field List saxEventList>
	//   12   28:iload_1         
	//   13   29:iconst_1        
	//   14   30:isub            
	//   15   31:invokeinterface #175 <Method Object List.get(int)>
	//   16   36:checkcast       #177 <Class SaxEvent>
	//   17   39:areturn         
		}
	}

	public Locator getLocator()
	{
		return locator;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field Locator locator>
	//    2    4:areturn         
	}

	public List getSaxEventList()
	{
		return saxEventList;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field List saxEventList>
	//    2    4:areturn         
	}

	String getTagName(String s, String s1)
	{
		String s2;
label0:
		{
			if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          14
			{
				s2 = s;
	//    2    4:aload_1         
	//    3    5:astore_3        
				if(s.length() >= 1)
					break label0;
	//    4    6:aload_1         
	//    5    7:invokevirtual   #122 <Method int String.length()>
	//    6   10:iconst_1        
	//    7   11:icmpge          16
			}
			s2 = s1;
	//    8   14:aload_2         
	//    9   15:astore_3        
		}
		return s2;
	//   10   16:aload_3         
	//   11   17:areturn         
	}

	boolean isSpaceOnly(String s)
	{
		return s.trim().length() == 0;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #188 <Method String String.trim()>
	//    2    4:invokevirtual   #122 <Method int String.length()>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public List recordEvents(InputSource inputsource)
	{
		Driver driver = buildPullParser();
	//    0    0:aload_0         
	//    1    1:invokespecial   #198 <Method Driver buildPullParser()>
	//    2    4:astore_2        
		driver.setContentHandler(((org.xml.sax.ContentHandler) (this)));
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #202 <Method void Driver.setContentHandler(org.xml.sax.ContentHandler)>
		driver.setErrorHandler(((org.xml.sax.ErrorHandler) (this)));
	//    6   10:aload_2         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #206 <Method void Driver.setErrorHandler(org.xml.sax.ErrorHandler)>
		driver.parse(inputsource);
	//    9   15:aload_2         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #210 <Method void Driver.parse(InputSource)>
		inputsource = ((InputSource) (saxEventList));
	//   12   20:aload_0         
	//   13   21:getfield        #24  <Field List saxEventList>
	//   14   24:astore_1        
		return ((List) (inputsource));
	//   15   25:aload_1         
	//   16   26:areturn         
		Object obj;
		obj;
	//   17   27:astore_2        
		inputsource = "Unexpected exception while parsing XML document.";
	//   18   28:ldc1            #212 <String "Unexpected exception while parsing XML document.">
	//   19   30:astore_1        
		break MISSING_BLOCK_LABEL_50;
	//   20   31:goto            50
		inputsource;
	//   21   34:astore_1        
		throw new JoranException("Problem parsing XML document. See previously reported errors.", ((Throwable) (inputsource)));
	//   22   35:new             #63  <Class JoranException>
	//   23   38:dup             
	//   24   39:ldc1            #214 <String "Problem parsing XML document. See previously reported errors.">
	//   25   41:aload_1         
	//   26   42:invokespecial   #65  <Method void JoranException(String, Throwable)>
	//   27   45:athrow          
		obj;
	//   28   46:astore_2        
		inputsource = "I/O error occurred while parsing xml file";
	//   29   47:ldc1            #216 <String "I/O error occurred while parsing xml file">
	//   30   49:astore_1        
		handleError(((String) (inputsource)), ((Throwable) (obj)));
	//   31   50:aload_0         
	//   32   51:aload_1         
	//   33   52:aload_2         
	//   34   53:invokespecial   #218 <Method void handleError(String, Throwable)>
		break MISSING_BLOCK_LABEL_84;
	//   35   56:goto            84
		inputsource;
	//   36   59:astore_1        
		handleError(((EOFException) (inputsource)).getLocalizedMessage(), ((Throwable) (new SAXParseException(((EOFException) (inputsource)).getLocalizedMessage(), locator, ((Exception) (inputsource))))));
	//   37   60:aload_0         
	//   38   61:aload_1         
	//   39   62:invokevirtual   #221 <Method String EOFException.getLocalizedMessage()>
	//   40   65:new             #142 <Class SAXParseException>
	//   41   68:dup             
	//   42   69:aload_1         
	//   43   70:invokevirtual   #221 <Method String EOFException.getLocalizedMessage()>
	//   44   73:aload_0         
	//   45   74:getfield        #179 <Field Locator locator>
	//   46   77:aload_1         
	//   47   78:invokespecial   #224 <Method void SAXParseException(String, Locator, Exception)>
	//   48   81:invokespecial   #218 <Method void handleError(String, Throwable)>
		throw new IllegalStateException("This point can never be reached");
	//   49   84:new             #226 <Class IllegalStateException>
	//   50   87:dup             
	//   51   88:ldc1            #228 <String "This point can never be reached">
	//   52   90:invokespecial   #230 <Method void IllegalStateException(String)>
	//   53   93:athrow          
	}

	public final void recordEvents(InputStream inputstream)
	{
		recordEvents(new InputSource(inputstream));
	//    0    0:aload_0         
	//    1    1:new             #234 <Class InputSource>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #236 <Method void InputSource(InputStream)>
	//    5    9:invokevirtual   #238 <Method List recordEvents(InputSource)>
	//    6   12:pop             
	//    7   13:return          
	}

	public void setContext(Context context)
	{
		cai.setContext(context);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ContextAwareImpl cai>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #241 <Method void ContextAwareImpl.setContext(Context)>
	//    4    8:return          
	}

	public void setDocumentLocator(Locator locator1)
	{
		locator = locator1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #179 <Field Locator locator>
	//    3    5:return          
	}

	public void startDocument()
	{
	//    0    0:return          
	}

	public void startElement(String s, String s1, String s2, Attributes attributes)
	{
		if(s2 != null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          9
			s2.length();
	//    2    4:aload_3         
	//    3    5:invokevirtual   #122 <Method int String.length()>
	//    4    8:pop             
		Object obj = ((Object) (getTagName(s1, s2)));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokevirtual   #248 <Method String getTagName(String, String)>
	//    9   15:astore          5
		globalElementPath.push(((String) (obj)));
	//   10   17:aload_0         
	//   11   18:getfield        #29  <Field ElementPath globalElementPath>
	//   12   21:aload           5
	//   13   23:invokevirtual   #251 <Method void ElementPath.push(String)>
		obj = ((Object) (globalElementPath.duplicate()));
	//   14   26:aload_0         
	//   15   27:getfield        #29  <Field ElementPath globalElementPath>
	//   16   30:invokevirtual   #255 <Method ElementPath ElementPath.duplicate()>
	//   17   33:astore          5
		saxEventList.add(((Object) (new StartEvent(((ElementPath) (obj)), s, s1, s2, attributes, getLocator()))));
	//   18   35:aload_0         
	//   19   36:getfield        #24  <Field List saxEventList>
	//   20   39:new             #257 <Class StartEvent>
	//   21   42:dup             
	//   22   43:aload           5
	//   23   45:aload_1         
	//   24   46:aload_2         
	//   25   47:aload_3         
	//   26   48:aload           4
	//   27   50:aload_0         
	//   28   51:invokevirtual   #107 <Method Locator getLocator()>
	//   29   54:invokespecial   #260 <Method void StartEvent(ElementPath, String, String, String, Attributes, Locator)>
	//   30   57:invokeinterface #116 <Method boolean List.add(Object)>
	//   31   62:pop             
	//   32   63:return          
	}

	public void warning(SAXParseException saxparseexception)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #134 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #135 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("XML_PARSING - Parsing warning on line ");
	//    4    8:aload_2         
	//    5    9:ldc2            #263 <String "XML_PARSING - Parsing warning on line ">
	//    6   12:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(saxparseexception.getLineNumber());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #145 <Method int SAXParseException.getLineNumber()>
	//   11   21:invokevirtual   #148 <Method StringBuilder StringBuilder.append(int)>
	//   12   24:pop             
		stringbuilder.append(" and column ");
	//   13   25:aload_2         
	//   14   26:ldc1            #150 <String " and column ">
	//   15   28:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		stringbuilder.append(saxparseexception.getColumnNumber());
	//   17   32:aload_2         
	//   18   33:aload_1         
	//   19   34:invokevirtual   #153 <Method int SAXParseException.getColumnNumber()>
	//   20   37:invokevirtual   #148 <Method StringBuilder StringBuilder.append(int)>
	//   21   40:pop             
		addWarn(stringbuilder.toString(), ((Throwable) (saxparseexception)));
	//   22   41:aload_0         
	//   23   42:aload_2         
	//   24   43:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   25   46:aload_1         
	//   26   47:invokevirtual   #264 <Method void addWarn(String, Throwable)>
	//   27   50:return          
	}

	private final ContextAwareImpl cai;
	ElementPath globalElementPath;
	private Locator locator;
	private List saxEventList;
}
