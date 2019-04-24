// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp;

import com.itextpdf.xmp.impl.XMPMetaImpl;
import com.itextpdf.xmp.impl.XMPMetaParser;
import com.itextpdf.xmp.impl.XMPSchemaRegistryImpl;
import com.itextpdf.xmp.impl.XMPSerializerHelper;
import com.itextpdf.xmp.options.ParseOptions;
import com.itextpdf.xmp.options.SerializeOptions;
import java.io.*;

// Referenced classes of package com.itextpdf.xmp:
//			XMPException, XMPSchemaRegistry, XMPVersionInfo, XMPMeta

public final class XMPMetaFactory
{

	private XMPMetaFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	private static void assertImplementation(XMPMeta xmpmeta)
	{
		if(!(xmpmeta instanceof XMPMetaImpl))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #27  <Class XMPMetaImpl>
	//*   2    4:ifne            17
			throw new UnsupportedOperationException("The serializing service works onlywith the XMPMeta implementation of this library");
	//    3    7:new             #29  <Class UnsupportedOperationException>
	//    4   10:dup             
	//    5   11:ldc1            #31  <String "The serializing service works onlywith the XMPMeta implementation of this library">
	//    6   13:invokespecial   #34  <Method void UnsupportedOperationException(String)>
	//    7   16:athrow          
		else
			return;
	//    8   17:return          
	}

	public static XMPMeta create()
	{
		return ((XMPMeta) (new XMPMetaImpl()));
	//    0    0:new             #27  <Class XMPMetaImpl>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void XMPMetaImpl()>
	//    3    7:areturn         
	}

	public static XMPSchemaRegistry getSchemaRegistry()
	{
		return schema;
	//    0    0:getstatic       #19  <Field XMPSchemaRegistry schema>
	//    1    3:areturn         
	}

	public static XMPVersionInfo getVersionInfo()
	{
		com/itextpdf/xmp/XMPMetaFactory;
	//    0    0:ldc1            #2   <Class XMPMetaFactory>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		XMPVersionInfo xmpversioninfo = versionInfo;
	//    2    3:getstatic       #21  <Field XMPVersionInfo versionInfo>
	//    3    6:astore_0        
		if(xmpversioninfo != null)
			break MISSING_BLOCK_LABEL_21;
	//    4    7:aload_0         
	//    5    8:ifnonnull       21
		versionInfo = new XMPVersionInfo() {

			public int getBuild()
			{
				return 3;
			//    0    0:iconst_3        
			//    1    1:ireturn         
			}

			public int getMajor()
			{
				return 5;
			//    0    0:iconst_5        
			//    1    1:ireturn         
			}

			public String getMessage()
			{
				return "Adobe XMP Core 5.1.0-jc003";
			//    0    0:ldc1            #23  <String "Adobe XMP Core 5.1.0-jc003">
			//    1    2:areturn         
			}

			public int getMicro()
			{
				return 0;
			//    0    0:iconst_0        
			//    1    1:ireturn         
			}

			public int getMinor()
			{
				return 1;
			//    0    0:iconst_1        
			//    1    1:ireturn         
			}

			public boolean isDebug()
			{
				return false;
			//    0    0:iconst_0        
			//    1    1:ireturn         
			}

			public String toString()
			{
				return "Adobe XMP Core 5.1.0-jc003";
			//    0    0:ldc1            #23  <String "Adobe XMP Core 5.1.0-jc003">
			//    1    2:areturn         
			}

		}
;
	//    6   11:new             #6   <Class XMPMetaFactory$1>
	//    7   14:dup             
	//    8   15:invokespecial   #44  <Method void XMPMetaFactory$1()>
	//    9   18:putstatic       #21  <Field XMPVersionInfo versionInfo>
_L1:
		xmpversioninfo = versionInfo;
	//   10   21:getstatic       #21  <Field XMPVersionInfo versionInfo>
	//   11   24:astore_0        
		com/itextpdf/xmp/XMPMetaFactory;
	//   12   25:ldc1            #2   <Class XMPMetaFactory>
		JVM INSTR monitorexit ;
	//   13   27:monitorexit     
		return xmpversioninfo;
	//   14   28:aload_0         
	//   15   29:areturn         
		Object obj;
		obj;
	//   16   30:astore_0        
		System.out.println(obj);
	//   17   31:getstatic       #50  <Field PrintStream System.out>
	//   18   34:aload_0         
	//   19   35:invokevirtual   #56  <Method void PrintStream.println(Object)>
		  goto _L1
	//*  20   38:goto            21
		obj;
	//   21   41:astore_0        
	//*  22   42:ldc1            #2   <Class XMPMetaFactory>
		throw obj;
	//   23   44:monitorexit     
	//   24   45:aload_0         
	//   25   46:athrow          
	}

	public static XMPMeta parse(InputStream inputstream)
		throws XMPException
	{
		return parse(inputstream, ((ParseOptions) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #63  <Method XMPMeta parse(InputStream, ParseOptions)>
	//    3    5:areturn         
	}

	public static XMPMeta parse(InputStream inputstream, ParseOptions parseoptions)
		throws XMPException
	{
		return XMPMetaParser.parse(((Object) (inputstream)), parseoptions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #69  <Method XMPMeta XMPMetaParser.parse(Object, ParseOptions)>
	//    3    5:areturn         
	}

	public static XMPMeta parseFromBuffer(byte abyte0[])
		throws XMPException
	{
		return parseFromBuffer(abyte0, ((ParseOptions) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #74  <Method XMPMeta parseFromBuffer(byte[], ParseOptions)>
	//    3    5:areturn         
	}

	public static XMPMeta parseFromBuffer(byte abyte0[], ParseOptions parseoptions)
		throws XMPException
	{
		return XMPMetaParser.parse(((Object) (abyte0)), parseoptions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #69  <Method XMPMeta XMPMetaParser.parse(Object, ParseOptions)>
	//    3    5:areturn         
	}

	public static XMPMeta parseFromString(String s)
		throws XMPException
	{
		return parseFromString(s, ((ParseOptions) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #79  <Method XMPMeta parseFromString(String, ParseOptions)>
	//    3    5:areturn         
	}

	public static XMPMeta parseFromString(String s, ParseOptions parseoptions)
		throws XMPException
	{
		return XMPMetaParser.parse(((Object) (s)), parseoptions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #69  <Method XMPMeta XMPMetaParser.parse(Object, ParseOptions)>
	//    3    5:areturn         
	}

	public static void reset()
	{
		schema = ((XMPSchemaRegistry) (new XMPSchemaRegistryImpl()));
	//    0    0:new             #14  <Class XMPSchemaRegistryImpl>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void XMPSchemaRegistryImpl()>
	//    3    7:putstatic       #19  <Field XMPSchemaRegistry schema>
	//    4   10:return          
	}

	public static void serialize(XMPMeta xmpmeta, OutputStream outputstream)
		throws XMPException
	{
		serialize(xmpmeta, outputstream, ((SerializeOptions) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #85  <Method void serialize(XMPMeta, OutputStream, SerializeOptions)>
	//    4    6:return          
	}

	public static void serialize(XMPMeta xmpmeta, OutputStream outputstream, SerializeOptions serializeoptions)
		throws XMPException
	{
		assertImplementation(xmpmeta);
	//    0    0:aload_0         
	//    1    1:invokestatic    #87  <Method void assertImplementation(XMPMeta)>
		XMPSerializerHelper.serialize((XMPMetaImpl)xmpmeta, outputstream, serializeoptions);
	//    2    4:aload_0         
	//    3    5:checkcast       #27  <Class XMPMetaImpl>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #92  <Method void XMPSerializerHelper.serialize(XMPMetaImpl, OutputStream, SerializeOptions)>
	//    7   13:return          
	}

	public static byte[] serializeToBuffer(XMPMeta xmpmeta, SerializeOptions serializeoptions)
		throws XMPException
	{
		assertImplementation(xmpmeta);
	//    0    0:aload_0         
	//    1    1:invokestatic    #87  <Method void assertImplementation(XMPMeta)>
		return XMPSerializerHelper.serializeToBuffer((XMPMetaImpl)xmpmeta, serializeoptions);
	//    2    4:aload_0         
	//    3    5:checkcast       #27  <Class XMPMetaImpl>
	//    4    8:aload_1         
	//    5    9:invokestatic    #97  <Method byte[] XMPSerializerHelper.serializeToBuffer(XMPMetaImpl, SerializeOptions)>
	//    6   12:areturn         
	}

	public static String serializeToString(XMPMeta xmpmeta, SerializeOptions serializeoptions)
		throws XMPException
	{
		assertImplementation(xmpmeta);
	//    0    0:aload_0         
	//    1    1:invokestatic    #87  <Method void assertImplementation(XMPMeta)>
		return XMPSerializerHelper.serializeToString((XMPMetaImpl)xmpmeta, serializeoptions);
	//    2    4:aload_0         
	//    3    5:checkcast       #27  <Class XMPMetaImpl>
	//    4    8:aload_1         
	//    5    9:invokestatic    #102 <Method String XMPSerializerHelper.serializeToString(XMPMetaImpl, SerializeOptions)>
	//    6   12:areturn         
	}

	private static XMPSchemaRegistry schema = new XMPSchemaRegistryImpl();
	private static XMPVersionInfo versionInfo = null;

	static 
	{
	//    0    0:new             #14  <Class XMPSchemaRegistryImpl>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void XMPSchemaRegistryImpl()>
	//    3    7:putstatic       #19  <Field XMPSchemaRegistry schema>
	//    4   10:aconst_null     
	//    5   11:putstatic       #21  <Field XMPVersionInfo versionInfo>
	//*   6   14:return          
	}
}
