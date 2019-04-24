// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import com.itextpdf.xmp.XMPException;
import com.itextpdf.xmp.options.SerializeOptions;
import java.io.*;

// Referenced classes of package com.itextpdf.xmp.impl:
//			XMPMetaImpl, XMPSerializerRDF

public class XMPSerializerHelper
{

	public XMPSerializerHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void serialize(XMPMetaImpl xmpmetaimpl, OutputStream outputstream, SerializeOptions serializeoptions)
		throws XMPException
	{
		if(serializeoptions == null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          29
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #19  <Method boolean SerializeOptions.getSort()>
	//*   4    8:ifeq            15
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #24  <Method void XMPMetaImpl.sort()>
	//*   7   15:new             #26  <Class XMPSerializerRDF>
	//*   8   18:dup             
	//*   9   19:invokespecial   #27  <Method void XMPSerializerRDF()>
	//*  10   22:aload_0         
	//*  11   23:aload_1         
	//*  12   24:aload_2         
	//*  13   25:invokevirtual   #30  <Method void XMPSerializerRDF.serialize(com.itextpdf.xmp.XMPMeta, OutputStream, SerializeOptions)>
	//*  14   28:return          
			serializeoptions = new SerializeOptions();
	//   15   29:new             #15  <Class SerializeOptions>
	//   16   32:dup             
	//   17   33:invokespecial   #31  <Method void SerializeOptions()>
	//   18   36:astore_2        
		if(serializeoptions.getSort())
			xmpmetaimpl.sort();
		(new XMPSerializerRDF()).serialize(((com.itextpdf.xmp.XMPMeta) (xmpmetaimpl)), outputstream, serializeoptions);
	//*  19   37:goto            4
	}

	public static byte[] serializeToBuffer(XMPMetaImpl xmpmetaimpl, SerializeOptions serializeoptions)
		throws XMPException
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(2048);
	//    0    0:new             #36  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:sipush          2048
	//    3    7:invokespecial   #39  <Method void ByteArrayOutputStream(int)>
	//    4   10:astore_2        
		serialize(xmpmetaimpl, ((OutputStream) (bytearrayoutputstream)), serializeoptions);
	//    5   11:aload_0         
	//    6   12:aload_2         
	//    7   13:aload_1         
	//    8   14:invokestatic    #41  <Method void serialize(XMPMetaImpl, OutputStream, SerializeOptions)>
		return bytearrayoutputstream.toByteArray();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #45  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   11   21:areturn         
	}

	public static String serializeToString(XMPMetaImpl xmpmetaimpl, SerializeOptions serializeoptions)
		throws XMPException
	{
		ByteArrayOutputStream bytearrayoutputstream;
		if(serializeoptions == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          38
	//*   2    4:aload_1         
	//*   3    5:iconst_1        
	//*   4    6:invokevirtual   #53  <Method SerializeOptions SerializeOptions.setEncodeUTF16BE(boolean)>
	//*   5    9:pop             
	//*   6   10:new             #36  <Class ByteArrayOutputStream>
	//*   7   13:dup             
	//*   8   14:sipush          2048
	//*   9   17:invokespecial   #39  <Method void ByteArrayOutputStream(int)>
	//*  10   20:astore_2        
	//*  11   21:aload_0         
	//*  12   22:aload_2         
	//*  13   23:aload_1         
	//*  14   24:invokestatic    #41  <Method void serialize(XMPMetaImpl, OutputStream, SerializeOptions)>
	//*  15   27:aload_2         
	//*  16   28:aload_1         
	//*  17   29:invokevirtual   #57  <Method String SerializeOptions.getEncoding()>
	//*  18   32:invokevirtual   #61  <Method String ByteArrayOutputStream.toString(String)>
	//*  19   35:astore_0        
	//*  20   36:aload_0         
	//*  21   37:areturn         
			serializeoptions = new SerializeOptions();
	//   22   38:new             #15  <Class SerializeOptions>
	//   23   41:dup             
	//   24   42:invokespecial   #31  <Method void SerializeOptions()>
	//   25   45:astore_1        
		serializeoptions.setEncodeUTF16BE(true);
		bytearrayoutputstream = new ByteArrayOutputStream(2048);
		serialize(xmpmetaimpl, ((OutputStream) (bytearrayoutputstream)), serializeoptions);
		try
		{
			xmpmetaimpl = ((XMPMetaImpl) (bytearrayoutputstream.toString(serializeoptions.getEncoding())));
		}
	//*  26   46:goto            4
		// Misplaced declaration of an exception variable
		catch(XMPMetaImpl xmpmetaimpl)
	//*  27   49:astore_0        
		{
			return bytearrayoutputstream.toString();
	//   28   50:aload_2         
	//   29   51:invokevirtual   #63  <Method String ByteArrayOutputStream.toString()>
	//   30   54:areturn         
		}
		return ((String) (xmpmetaimpl));
	}
}
