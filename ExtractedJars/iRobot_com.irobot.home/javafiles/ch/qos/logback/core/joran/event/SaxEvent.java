// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.event;

import org.xml.sax.Locator;
import org.xml.sax.helpers.LocatorImpl;

public class SaxEvent
{

	SaxEvent(String s, String s1, String s2, Locator locator1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		namespaceURI = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field String namespaceURI>
		localName = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field String localName>
		qName = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #21  <Field String qName>
		locator = ((Locator) (new LocatorImpl(locator1)));
	//   11   19:aload_0         
	//   12   20:new             #23  <Class LocatorImpl>
	//   13   23:dup             
	//   14   24:aload           4
	//   15   26:invokespecial   #26  <Method void LocatorImpl(Locator)>
	//   16   29:putfield        #28  <Field Locator locator>
	//   17   32:return          
	}

	public String getLocalName()
	{
		return localName;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String localName>
	//    2    4:areturn         
	}

	public Locator getLocator()
	{
		return locator;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Locator locator>
	//    2    4:areturn         
	}

	public String getNamespaceURI()
	{
		return namespaceURI;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field String namespaceURI>
	//    2    4:areturn         
	}

	public String getQName()
	{
		return qName;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String qName>
	//    2    4:areturn         
	}

	public final String localName;
	public final Locator locator;
	public final String namespaceURI;
	public final String qName;
}
