// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import com.itextpdf.xmp.*;

// Referenced classes of package com.itextpdf.xmp.impl:
//			XMPMetaImpl

class ParameterAsserts
	implements XMPConst
{

	private ParameterAsserts()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static void assertArrayName(String s)
		throws XMPException
	{
		if(s == null || s.length() == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #21  <Method int String.length()>
	//*   4    8:ifne            22
			throw new XMPException("Empty array name", 4);
	//    5   11:new             #15  <Class XMPException>
	//    6   14:dup             
	//    7   15:ldc1            #23  <String "Empty array name">
	//    8   17:iconst_4        
	//    9   18:invokespecial   #26  <Method void XMPException(String, int)>
	//   10   21:athrow          
		else
			return;
	//   11   22:return          
	}

	public static void assertImplementation(XMPMeta xmpmeta)
		throws XMPException
	{
		if(xmpmeta == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       15
			throw new XMPException("Parameter must not be null", 4);
	//    2    4:new             #15  <Class XMPException>
	//    3    7:dup             
	//    4    8:ldc1            #31  <String "Parameter must not be null">
	//    5   10:iconst_4        
	//    6   11:invokespecial   #26  <Method void XMPException(String, int)>
	//    7   14:athrow          
		if(!(xmpmeta instanceof XMPMetaImpl))
	//*   8   15:aload_0         
	//*   9   16:instanceof      #33  <Class XMPMetaImpl>
	//*  10   19:ifne            33
			throw new XMPException("The XMPMeta-object is not compatible with this implementation", 4);
	//   11   22:new             #15  <Class XMPException>
	//   12   25:dup             
	//   13   26:ldc1            #35  <String "The XMPMeta-object is not compatible with this implementation">
	//   14   28:iconst_4        
	//   15   29:invokespecial   #26  <Method void XMPException(String, int)>
	//   16   32:athrow          
		else
			return;
	//   17   33:return          
	}

	public static void assertNotNull(Object obj)
		throws XMPException
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       15
			throw new XMPException("Parameter must not be null", 4);
	//    2    4:new             #15  <Class XMPException>
	//    3    7:dup             
	//    4    8:ldc1            #31  <String "Parameter must not be null">
	//    5   10:iconst_4        
	//    6   11:invokespecial   #26  <Method void XMPException(String, int)>
	//    7   14:athrow          
		if((obj instanceof String) && ((String)obj).length() == 0)
	//*   8   15:aload_0         
	//*   9   16:instanceof      #17  <Class String>
	//*  10   19:ifeq            43
	//*  11   22:aload_0         
	//*  12   23:checkcast       #17  <Class String>
	//*  13   26:invokevirtual   #21  <Method int String.length()>
	//*  14   29:ifne            43
			throw new XMPException("Parameter must not be null or empty", 4);
	//   15   32:new             #15  <Class XMPException>
	//   16   35:dup             
	//   17   36:ldc1            #39  <String "Parameter must not be null or empty">
	//   18   38:iconst_4        
	//   19   39:invokespecial   #26  <Method void XMPException(String, int)>
	//   20   42:athrow          
		else
			return;
	//   21   43:return          
	}

	public static void assertPrefix(String s)
		throws XMPException
	{
		if(s == null || s.length() == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #21  <Method int String.length()>
	//*   4    8:ifne            22
			throw new XMPException("Empty prefix", 4);
	//    5   11:new             #15  <Class XMPException>
	//    6   14:dup             
	//    7   15:ldc1            #42  <String "Empty prefix">
	//    8   17:iconst_4        
	//    9   18:invokespecial   #26  <Method void XMPException(String, int)>
	//   10   21:athrow          
		else
			return;
	//   11   22:return          
	}

	public static void assertPropName(String s)
		throws XMPException
	{
		if(s == null || s.length() == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #21  <Method int String.length()>
	//*   4    8:ifne            22
			throw new XMPException("Empty property name", 4);
	//    5   11:new             #15  <Class XMPException>
	//    6   14:dup             
	//    7   15:ldc1            #45  <String "Empty property name">
	//    8   17:iconst_4        
	//    9   18:invokespecial   #26  <Method void XMPException(String, int)>
	//   10   21:athrow          
		else
			return;
	//   11   22:return          
	}

	public static void assertSchemaNS(String s)
		throws XMPException
	{
		if(s == null || s.length() == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #21  <Method int String.length()>
	//*   4    8:ifne            22
			throw new XMPException("Empty schema namespace URI", 4);
	//    5   11:new             #15  <Class XMPException>
	//    6   14:dup             
	//    7   15:ldc1            #48  <String "Empty schema namespace URI">
	//    8   17:iconst_4        
	//    9   18:invokespecial   #26  <Method void XMPException(String, int)>
	//   10   21:athrow          
		else
			return;
	//   11   22:return          
	}

	public static void assertSpecificLang(String s)
		throws XMPException
	{
		if(s == null || s.length() == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #21  <Method int String.length()>
	//*   4    8:ifne            22
			throw new XMPException("Empty specific language", 4);
	//    5   11:new             #15  <Class XMPException>
	//    6   14:dup             
	//    7   15:ldc1            #51  <String "Empty specific language">
	//    8   17:iconst_4        
	//    9   18:invokespecial   #26  <Method void XMPException(String, int)>
	//   10   21:athrow          
		else
			return;
	//   11   22:return          
	}

	public static void assertStructName(String s)
		throws XMPException
	{
		if(s == null || s.length() == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #21  <Method int String.length()>
	//*   4    8:ifne            22
			throw new XMPException("Empty array name", 4);
	//    5   11:new             #15  <Class XMPException>
	//    6   14:dup             
	//    7   15:ldc1            #23  <String "Empty array name">
	//    8   17:iconst_4        
	//    9   18:invokespecial   #26  <Method void XMPException(String, int)>
	//   10   21:athrow          
		else
			return;
	//   11   22:return          
	}
}
