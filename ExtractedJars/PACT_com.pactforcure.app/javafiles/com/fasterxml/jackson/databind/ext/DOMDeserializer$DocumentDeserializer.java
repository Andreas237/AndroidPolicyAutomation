// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.DeserializationContext;
import org.w3c.dom.Document;

// Referenced classes of package com.fasterxml.jackson.databind.ext:
//			DOMDeserializer

public static class DOMDeserializer$DocumentDeserializer extends DOMDeserializer
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

	public DOMDeserializer$DocumentDeserializer()
	{
		super(org/w3c/dom/Document);
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <Class Document>
	//    2    3:invokespecial   #17  <Method void DOMDeserializer(Class)>
	//    3    6:return          
	}
}
