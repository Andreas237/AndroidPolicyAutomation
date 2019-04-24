// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp;

import com.itextpdf.xmp.impl.Utils;
import com.itextpdf.xmp.impl.xpath.XMPPath;
import com.itextpdf.xmp.impl.xpath.XMPPathParser;
import com.itextpdf.xmp.impl.xpath.XMPPathSegment;

// Referenced classes of package com.itextpdf.xmp:
//			XMPException

public final class XMPPathFactory
{

	private XMPPathFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	private static void assertFieldNS(String s)
		throws XMPException
	{
		if(s == null || s.length() == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #19  <Method int String.length()>
	//*   4    8:ifne            23
			throw new XMPException("Empty field namespace URI", 101);
	//    5   11:new             #13  <Class XMPException>
	//    6   14:dup             
	//    7   15:ldc1            #21  <String "Empty field namespace URI">
	//    8   17:bipush          101
	//    9   19:invokespecial   #24  <Method void XMPException(String, int)>
	//   10   22:athrow          
		else
			return;
	//   11   23:return          
	}

	private static void assertFieldName(String s)
		throws XMPException
	{
		if(s == null || s.length() == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #19  <Method int String.length()>
	//*   4    8:ifne            23
			throw new XMPException("Empty f name", 102);
	//    5   11:new             #13  <Class XMPException>
	//    6   14:dup             
	//    7   15:ldc1            #28  <String "Empty f name">
	//    8   17:bipush          102
	//    9   19:invokespecial   #24  <Method void XMPException(String, int)>
	//   10   22:athrow          
		else
			return;
	//   11   23:return          
	}

	private static void assertQualNS(String s)
		throws XMPException
	{
		if(s == null || s.length() == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #19  <Method int String.length()>
	//*   4    8:ifne            23
			throw new XMPException("Empty qualifier namespace URI", 101);
	//    5   11:new             #13  <Class XMPException>
	//    6   14:dup             
	//    7   15:ldc1            #31  <String "Empty qualifier namespace URI">
	//    8   17:bipush          101
	//    9   19:invokespecial   #24  <Method void XMPException(String, int)>
	//   10   22:athrow          
		else
			return;
	//   11   23:return          
	}

	private static void assertQualName(String s)
		throws XMPException
	{
		if(s == null || s.length() == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #19  <Method int String.length()>
	//*   4    8:ifne            23
			throw new XMPException("Empty qualifier name", 102);
	//    5   11:new             #13  <Class XMPException>
	//    6   14:dup             
	//    7   15:ldc1            #34  <String "Empty qualifier name">
	//    8   17:bipush          102
	//    9   19:invokespecial   #24  <Method void XMPException(String, int)>
	//   10   22:athrow          
		else
			return;
	//   11   23:return          
	}

	public static String composeArrayItemPath(String s, int i)
		throws XMPException
	{
		if(i > 0)
	//*   0    0:iload_1         
	//*   1    1:ifle            33
			return (new StringBuilder()).append(s).append('[').append(i).append(']').toString();
	//    2    4:new             #38  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #39  <Method void StringBuilder()>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:bipush          91
	//    8   17:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//    9   20:iload_1         
	//   10   21:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
	//   11   24:bipush          93
	//   12   26:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//   13   29:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   14   32:areturn         
		if(i == -1)
	//*  15   33:iload_1         
	//*  16   34:iconst_m1       
	//*  17   35:icmpne          58
			return (new StringBuilder()).append(s).append("[last()]").toString();
	//   18   38:new             #38  <Class StringBuilder>
	//   19   41:dup             
	//   20   42:invokespecial   #39  <Method void StringBuilder()>
	//   21   45:aload_0         
	//   22   46:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   23   49:ldc1            #55  <String "[last()]">
	//   24   51:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   25   54:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   26   57:areturn         
		else
			throw new XMPException("Array index must be larger than zero", 104);
	//   27   58:new             #13  <Class XMPException>
	//   28   61:dup             
	//   29   62:ldc1            #57  <String "Array index must be larger than zero">
	//   30   64:bipush          104
	//   31   66:invokespecial   #24  <Method void XMPException(String, int)>
	//   32   69:athrow          
	}

	public static String composeFieldSelector(String s, String s1, String s2, String s3)
		throws XMPException
	{
		s1 = ((String) (XMPPathParser.expandXPath(s1, s2)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #65  <Method XMPPath XMPPathParser.expandXPath(String, String)>
	//    3    5:astore_1        
		if(((XMPPath) (s1)).size() != 2)
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #70  <Method int XMPPath.size()>
	//*   6   10:iconst_2        
	//*   7   11:icmpeq          26
			throw new XMPException("The fieldName name must be simple", 102);
	//    8   14:new             #13  <Class XMPException>
	//    9   17:dup             
	//   10   18:ldc1            #72  <String "The fieldName name must be simple">
	//   11   20:bipush          102
	//   12   22:invokespecial   #24  <Method void XMPException(String, int)>
	//   13   25:athrow          
		else
			return (new StringBuilder()).append(s).append('[').append(((XMPPath) (s1)).getSegment(1).getName()).append("=\"").append(s3).append("\"]").toString();
	//   14   26:new             #38  <Class StringBuilder>
	//   15   29:dup             
	//   16   30:invokespecial   #39  <Method void StringBuilder()>
	//   17   33:aload_0         
	//   18   34:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:bipush          91
	//   20   39:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//   21   42:aload_1         
	//   22   43:iconst_1        
	//   23   44:invokevirtual   #76  <Method XMPPathSegment XMPPath.getSegment(int)>
	//   24   47:invokevirtual   #81  <Method String XMPPathSegment.getName()>
	//   25   50:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   26   53:ldc1            #83  <String "=\"">
	//   27   55:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   28   58:aload_3         
	//   29   59:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   30   62:ldc1            #85  <String "\"]">
	//   31   64:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   32   67:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   33   70:areturn         
	}

	public static String composeLangSelector(String s, String s1)
	{
		return (new StringBuilder()).append(s).append("[?xml:lang=\"").append(Utils.normalizeLangValue(s1)).append("\"]").toString();
	//    0    0:new             #38  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    5   11:ldc1            #89  <String "[?xml:lang=\"">
	//    6   13:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_1         
	//    8   17:invokestatic    #95  <Method String Utils.normalizeLangValue(String)>
	//    9   20:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:ldc1            #85  <String "\"]">
	//   11   25:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   12   28:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   13   31:areturn         
	}

	public static String composeQualifierPath(String s, String s1)
		throws XMPException
	{
		assertQualNS(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #98  <Method void assertQualNS(String)>
		assertQualName(s1);
	//    2    4:aload_1         
	//    3    5:invokestatic    #100 <Method void assertQualName(String)>
		s = ((String) (XMPPathParser.expandXPath(s, s1)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #65  <Method XMPPath XMPPathParser.expandXPath(String, String)>
	//    7   13:astore_0        
		if(((XMPPath) (s)).size() != 2)
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #70  <Method int XMPPath.size()>
	//*  10   18:iconst_2        
	//*  11   19:icmpeq          34
			throw new XMPException("The qualifier name must be simple", 102);
	//   12   22:new             #13  <Class XMPException>
	//   13   25:dup             
	//   14   26:ldc1            #102 <String "The qualifier name must be simple">
	//   15   28:bipush          102
	//   16   30:invokespecial   #24  <Method void XMPException(String, int)>
	//   17   33:athrow          
		else
			return (new StringBuilder()).append("/?").append(((XMPPath) (s)).getSegment(1).getName()).toString();
	//   18   34:new             #38  <Class StringBuilder>
	//   19   37:dup             
	//   20   38:invokespecial   #39  <Method void StringBuilder()>
	//   21   41:ldc1            #104 <String "/?">
	//   22   43:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:aload_0         
	//   24   47:iconst_1        
	//   25   48:invokevirtual   #76  <Method XMPPathSegment XMPPath.getSegment(int)>
	//   26   51:invokevirtual   #81  <Method String XMPPathSegment.getName()>
	//   27   54:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   28   57:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   29   60:areturn         
	}

	public static String composeStructFieldPath(String s, String s1)
		throws XMPException
	{
		assertFieldNS(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #107 <Method void assertFieldNS(String)>
		assertFieldName(s1);
	//    2    4:aload_1         
	//    3    5:invokestatic    #109 <Method void assertFieldName(String)>
		s = ((String) (XMPPathParser.expandXPath(s, s1)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #65  <Method XMPPath XMPPathParser.expandXPath(String, String)>
	//    7   13:astore_0        
		if(((XMPPath) (s)).size() != 2)
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #70  <Method int XMPPath.size()>
	//*  10   18:iconst_2        
	//*  11   19:icmpeq          34
			throw new XMPException("The field name must be simple", 102);
	//   12   22:new             #13  <Class XMPException>
	//   13   25:dup             
	//   14   26:ldc1            #111 <String "The field name must be simple">
	//   15   28:bipush          102
	//   16   30:invokespecial   #24  <Method void XMPException(String, int)>
	//   17   33:athrow          
		else
			return (new StringBuilder()).append('/').append(((XMPPath) (s)).getSegment(1).getName()).toString();
	//   18   34:new             #38  <Class StringBuilder>
	//   19   37:dup             
	//   20   38:invokespecial   #39  <Method void StringBuilder()>
	//   21   41:bipush          47
	//   22   43:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//   23   46:aload_0         
	//   24   47:iconst_1        
	//   25   48:invokevirtual   #76  <Method XMPPathSegment XMPPath.getSegment(int)>
	//   26   51:invokevirtual   #81  <Method String XMPPathSegment.getName()>
	//   27   54:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   28   57:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   29   60:areturn         
	}
}
