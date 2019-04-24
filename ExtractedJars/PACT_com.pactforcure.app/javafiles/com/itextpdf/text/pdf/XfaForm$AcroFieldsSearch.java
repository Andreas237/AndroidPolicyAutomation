// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			XfaForm

public static class XfaForm$AcroFieldsSearch extends XfaForm.Xml2Som
{

	public HashMap getAcroShort2LongName()
	{
		return acroShort2LongName;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field HashMap acroShort2LongName>
	//    2    4:areturn         
	}

	public void setAcroShort2LongName(HashMap hashmap)
	{
		acroShort2LongName = hashmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field HashMap acroShort2LongName>
	//    3    5:return          
	}

	private HashMap acroShort2LongName;

	public XfaForm$AcroFieldsSearch(Collection collection)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void XfaForm$Xml2Som()>
		inverseSearch = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #17  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void HashMap()>
	//    6   12:putfield        #21  <Field HashMap inverseSearch>
		acroShort2LongName = new HashMap();
	//    7   15:aload_0         
	//    8   16:new             #17  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #18  <Method void HashMap()>
	//   11   23:putfield        #23  <Field HashMap acroShort2LongName>
		String s;
		String s1;
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); inverseSearchAdd(inverseSearch, splitParts(s1), s))
	//*  12   26:aload_1         
	//*  13   27:invokeinterface #29  <Method Iterator Collection.iterator()>
	//*  14   32:astore_1        
	//*  15   33:aload_1         
	//*  16   34:invokeinterface #35  <Method boolean Iterator.hasNext()>
	//*  17   39:ifeq            82
		{
			s = (String)((Iterator) (collection)).next();
	//   18   42:aload_1         
	//   19   43:invokeinterface #39  <Method Object Iterator.next()>
	//   20   48:checkcast       #41  <Class String>
	//   21   51:astore_2        
			s1 = getShortName(s);
	//   22   52:aload_2         
	//   23   53:invokestatic    #45  <Method String getShortName(String)>
	//   24   56:astore_3        
			acroShort2LongName.put(((Object) (s1)), ((Object) (s)));
	//   25   57:aload_0         
	//   26   58:getfield        #23  <Field HashMap acroShort2LongName>
	//   27   61:aload_3         
	//   28   62:aload_2         
	//   29   63:invokevirtual   #49  <Method Object HashMap.put(Object, Object)>
	//   30   66:pop             
		}

	//   31   67:aload_0         
	//   32   68:getfield        #21  <Field HashMap inverseSearch>
	//   33   71:aload_3         
	//   34   72:invokestatic    #53  <Method XfaForm$Stack2 splitParts(String)>
	//   35   75:aload_2         
	//   36   76:invokestatic    #57  <Method void inverseSearchAdd(HashMap, XfaForm$Stack2, String)>
	//*  37   79:goto            33
	//   38   82:return          
	}
}
