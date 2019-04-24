// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.options;

import com.itextpdf.xmp.XMPException;

// Referenced classes of package com.itextpdf.xmp.options:
//			Options

public final class SerializeOptions extends Options
{

	public SerializeOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Options()>
		padding = 2048;
	//    2    4:aload_0         
	//    3    5:sipush          2048
	//    4    8:putfield        #44  <Field int padding>
		newline = "\n";
	//    5   11:aload_0         
	//    6   12:ldc1            #46  <String "\n">
	//    7   14:putfield        #48  <Field String newline>
		indent = "  ";
	//    8   17:aload_0         
	//    9   18:ldc1            #50  <String "  ">
	//   10   20:putfield        #52  <Field String indent>
		baseIndent = 0;
	//   11   23:aload_0         
	//   12   24:iconst_0        
	//   13   25:putfield        #54  <Field int baseIndent>
		omitVersionAttribute = false;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #56  <Field boolean omitVersionAttribute>
	//   17   33:return          
	}

	public SerializeOptions(int i)
		throws XMPException
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #62  <Method void Options(int)>
		padding = 2048;
	//    3    5:aload_0         
	//    4    6:sipush          2048
	//    5    9:putfield        #44  <Field int padding>
		newline = "\n";
	//    6   12:aload_0         
	//    7   13:ldc1            #46  <String "\n">
	//    8   15:putfield        #48  <Field String newline>
		indent = "  ";
	//    9   18:aload_0         
	//   10   19:ldc1            #50  <String "  ">
	//   11   21:putfield        #52  <Field String indent>
		baseIndent = 0;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #54  <Field int baseIndent>
		omitVersionAttribute = false;
	//   15   29:aload_0         
	//   16   30:iconst_0        
	//   17   31:putfield        #56  <Field boolean omitVersionAttribute>
	//   18   34:return          
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		SerializeOptions serializeoptions;
		try
		{
			serializeoptions = new SerializeOptions(getOptions());
	//    0    0:new             #2   <Class SerializeOptions>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #71  <Method int getOptions()>
	//    4    8:invokespecial   #72  <Method void SerializeOptions(int)>
	//    5   11:astore_1        
			serializeoptions.setBaseIndent(baseIndent);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #54  <Field int baseIndent>
	//    9   17:invokevirtual   #76  <Method SerializeOptions setBaseIndent(int)>
	//   10   20:pop             
			serializeoptions.setIndent(indent);
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:getfield        #52  <Field String indent>
	//   14   26:invokevirtual   #80  <Method SerializeOptions setIndent(String)>
	//   15   29:pop             
			serializeoptions.setNewline(newline);
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #48  <Field String newline>
	//   19   35:invokevirtual   #83  <Method SerializeOptions setNewline(String)>
	//   20   38:pop             
			serializeoptions.setPadding(padding);
	//   21   39:aload_1         
	//   22   40:aload_0         
	//   23   41:getfield        #44  <Field int padding>
	//   24   44:invokevirtual   #86  <Method SerializeOptions setPadding(int)>
	//   25   47:pop             
		}
	//*  26   48:aload_1         
	//*  27   49:areturn         
		catch(XMPException xmpexception)
	//*  28   50:astore_1        
		{
			return ((Object) (null));
	//   29   51:aconst_null     
	//   30   52:areturn         
		}
		return ((Object) (serializeoptions));
	}

	protected String defineOptionName(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    7: default 68
	//	               16: 70
	//	               32: 73
	//	               64: 76
	//	               256: 79
	//	               512: 82
	//	               4096: 85
	//	               8192: 88
		default:
			return null;
	//    2   68:aconst_null     
	//    3   69:areturn         

		case 16: // '\020'
			return "OMIT_PACKET_WRAPPER";
	//    4   70:ldc1            #89  <String "OMIT_PACKET_WRAPPER">
	//    5   72:areturn         

		case 32: // ' '
			return "READONLY_PACKET";
	//    6   73:ldc1            #90  <String "READONLY_PACKET">
	//    7   75:areturn         

		case 64: // '@'
			return "USE_COMPACT_FORMAT";
	//    8   76:ldc1            #91  <String "USE_COMPACT_FORMAT">
	//    9   78:areturn         

		case 256: 
			return "INCLUDE_THUMBNAIL_PAD";
	//   10   79:ldc1            #92  <String "INCLUDE_THUMBNAIL_PAD">
	//   11   81:areturn         

		case 512: 
			return "EXACT_PACKET_LENGTH";
	//   12   82:ldc1            #93  <String "EXACT_PACKET_LENGTH">
	//   13   84:areturn         

		case 4096: 
			return "OMIT_XMPMETA_ELEMENT";
	//   14   85:ldc1            #94  <String "OMIT_XMPMETA_ELEMENT">
	//   15   87:areturn         

		case 8192: 
			return "NORMALIZED";
	//   16   88:ldc1            #96  <String "NORMALIZED">
	//   17   90:areturn         
		}
	}

	public int getBaseIndent()
	{
		return baseIndent;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int baseIndent>
	//    2    4:ireturn         
	}

	public boolean getEncodeUTF16BE()
	{
		return (getOptions() & 3) == 2;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method int getOptions()>
	//    2    4:iconst_3        
	//    3    5:iand            
	//    4    6:iconst_2        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean getEncodeUTF16LE()
	{
		return (getOptions() & 3) == 3;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method int getOptions()>
	//    2    4:iconst_3        
	//    3    5:iand            
	//    4    6:iconst_3        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public String getEncoding()
	{
		if(getEncodeUTF16BE())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #104 <Method boolean getEncodeUTF16BE()>
	//*   2    4:ifeq            10
			return "UTF-16BE";
	//    3    7:ldc1            #106 <String "UTF-16BE">
	//    4    9:areturn         
		if(getEncodeUTF16LE())
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #108 <Method boolean getEncodeUTF16LE()>
	//*   7   14:ifeq            20
			return "UTF-16LE";
	//    8   17:ldc1            #110 <String "UTF-16LE">
	//    9   19:areturn         
		else
			return "UTF-8";
	//   10   20:ldc1            #112 <String "UTF-8">
	//   11   22:areturn         
	}

	public boolean getExactPacketLength()
	{
		return getOption(512);
	//    0    0:aload_0         
	//    1    1:sipush          512
	//    2    4:invokevirtual   #117 <Method boolean getOption(int)>
	//    3    7:ireturn         
	}

	public boolean getIncludeThumbnailPad()
	{
		return getOption(256);
	//    0    0:aload_0         
	//    1    1:sipush          256
	//    2    4:invokevirtual   #117 <Method boolean getOption(int)>
	//    3    7:ireturn         
	}

	public String getIndent()
	{
		return indent;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String indent>
	//    2    4:areturn         
	}

	public String getNewline()
	{
		return newline;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String newline>
	//    2    4:areturn         
	}

	public boolean getOmitPacketWrapper()
	{
		return getOption(16);
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:invokevirtual   #117 <Method boolean getOption(int)>
	//    3    6:ireturn         
	}

	public boolean getOmitVersionAttribute()
	{
		return omitVersionAttribute;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field boolean omitVersionAttribute>
	//    2    4:ireturn         
	}

	public boolean getOmitXmpMetaElement()
	{
		return getOption(4096);
	//    0    0:aload_0         
	//    1    1:sipush          4096
	//    2    4:invokevirtual   #117 <Method boolean getOption(int)>
	//    3    7:ireturn         
	}

	public int getPadding()
	{
		return padding;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int padding>
	//    2    4:ireturn         
	}

	public boolean getReadOnlyPacket()
	{
		return getOption(32);
	//    0    0:aload_0         
	//    1    1:bipush          32
	//    2    3:invokevirtual   #117 <Method boolean getOption(int)>
	//    3    6:ireturn         
	}

	public boolean getSort()
	{
		return getOption(8192);
	//    0    0:aload_0         
	//    1    1:sipush          8192
	//    2    4:invokevirtual   #117 <Method boolean getOption(int)>
	//    3    7:ireturn         
	}

	public boolean getUseCanonicalFormat()
	{
		return getOption(128);
	//    0    0:aload_0         
	//    1    1:sipush          128
	//    2    4:invokevirtual   #117 <Method boolean getOption(int)>
	//    3    7:ireturn         
	}

	public boolean getUseCompactFormat()
	{
		return getOption(64);
	//    0    0:aload_0         
	//    1    1:bipush          64
	//    2    3:invokevirtual   #117 <Method boolean getOption(int)>
	//    3    6:ireturn         
	}

	protected int getValidOptions()
	{
		return 13168;
	//    0    0:sipush          13168
	//    1    3:ireturn         
	}

	public SerializeOptions setBaseIndent(int i)
	{
		baseIndent = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #54  <Field int baseIndent>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SerializeOptions setEncodeUTF16BE(boolean flag)
	{
		setOption(3, false);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #135 <Method void setOption(int, boolean)>
		setOption(2, flag);
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #135 <Method void setOption(int, boolean)>
		return this;
	//    8   12:aload_0         
	//    9   13:areturn         
	}

	public SerializeOptions setEncodeUTF16LE(boolean flag)
	{
		setOption(3, false);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #135 <Method void setOption(int, boolean)>
		setOption(3, flag);
	//    4    6:aload_0         
	//    5    7:iconst_3        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #135 <Method void setOption(int, boolean)>
		return this;
	//    8   12:aload_0         
	//    9   13:areturn         
	}

	public SerializeOptions setExactPacketLength(boolean flag)
	{
		setOption(512, flag);
	//    0    0:aload_0         
	//    1    1:sipush          512
	//    2    4:iload_1         
	//    3    5:invokevirtual   #135 <Method void setOption(int, boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public SerializeOptions setIncludeThumbnailPad(boolean flag)
	{
		setOption(256, flag);
	//    0    0:aload_0         
	//    1    1:sipush          256
	//    2    4:iload_1         
	//    3    5:invokevirtual   #135 <Method void setOption(int, boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public SerializeOptions setIndent(String s)
	{
		indent = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field String indent>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SerializeOptions setNewline(String s)
	{
		newline = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field String newline>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SerializeOptions setOmitPacketWrapper(boolean flag)
	{
		setOption(16, flag);
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:iload_1         
	//    3    4:invokevirtual   #135 <Method void setOption(int, boolean)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public SerializeOptions setOmitXmpMetaElement(boolean flag)
	{
		setOption(4096, flag);
	//    0    0:aload_0         
	//    1    1:sipush          4096
	//    2    4:iload_1         
	//    3    5:invokevirtual   #135 <Method void setOption(int, boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public SerializeOptions setPadding(int i)
	{
		padding = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #44  <Field int padding>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SerializeOptions setReadOnlyPacket(boolean flag)
	{
		setOption(32, flag);
	//    0    0:aload_0         
	//    1    1:bipush          32
	//    2    3:iload_1         
	//    3    4:invokevirtual   #135 <Method void setOption(int, boolean)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public SerializeOptions setSort(boolean flag)
	{
		setOption(8192, flag);
	//    0    0:aload_0         
	//    1    1:sipush          8192
	//    2    4:iload_1         
	//    3    5:invokevirtual   #135 <Method void setOption(int, boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public SerializeOptions setUseCanonicalFormat(boolean flag)
	{
		setOption(128, flag);
	//    0    0:aload_0         
	//    1    1:sipush          128
	//    2    4:iload_1         
	//    3    5:invokevirtual   #135 <Method void setOption(int, boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public SerializeOptions setUseCompactFormat(boolean flag)
	{
		setOption(64, flag);
	//    0    0:aload_0         
	//    1    1:bipush          64
	//    2    3:iload_1         
	//    3    4:invokevirtual   #135 <Method void setOption(int, boolean)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public static final int ENCODE_UTF16BE = 2;
	public static final int ENCODE_UTF16LE = 3;
	public static final int ENCODE_UTF8 = 0;
	private static final int ENCODING_MASK = 3;
	public static final int EXACT_PACKET_LENGTH = 512;
	public static final int INCLUDE_THUMBNAIL_PAD = 256;
	private static final int LITTLEENDIAN_BIT = 1;
	public static final int OMIT_PACKET_WRAPPER = 16;
	public static final int OMIT_XMPMETA_ELEMENT = 4096;
	public static final int READONLY_PACKET = 32;
	public static final int SORT = 8192;
	public static final int USE_CANONICAL_FORMAT = 128;
	public static final int USE_COMPACT_FORMAT = 64;
	private static final int UTF16_BIT = 2;
	private int baseIndent;
	private String indent;
	private String newline;
	private boolean omitVersionAttribute;
	private int padding;
}
