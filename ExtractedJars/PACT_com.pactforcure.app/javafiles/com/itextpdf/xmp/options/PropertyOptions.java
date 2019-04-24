// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.options;

import com.itextpdf.xmp.XMPException;

// Referenced classes of package com.itextpdf.xmp.options:
//			Options

public final class PropertyOptions extends Options
{

	public PropertyOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Options()>
	//    2    4:return          
	}

	public PropertyOptions(int i)
		throws XMPException
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #43  <Method void Options(int)>
	//    3    5:return          
	}

	public void assertConsistency(int i)
		throws XMPException
	{
		if((i & 0x100) > 0 && (i & 0x200) > 0)
	//*   0    0:iload_1         
	//*   1    1:sipush          256
	//*   2    4:iand            
	//*   3    5:ifle            28
	//*   4    8:iload_1         
	//*   5    9:sipush          512
	//*   6   12:iand            
	//*   7   13:ifle            28
			throw new XMPException("IsStruct and IsArray options are mutually exclusive", 103);
	//    8   16:new             #41  <Class XMPException>
	//    9   19:dup             
	//   10   20:ldc1            #47  <String "IsStruct and IsArray options are mutually exclusive">
	//   11   22:bipush          103
	//   12   24:invokespecial   #50  <Method void XMPException(String, int)>
	//   13   27:athrow          
		if((i & 2) > 0 && (i & 0x300) > 0)
	//*  14   28:iload_1         
	//*  15   29:iconst_2        
	//*  16   30:iand            
	//*  17   31:ifle            54
	//*  18   34:iload_1         
	//*  19   35:sipush          768
	//*  20   38:iand            
	//*  21   39:ifle            54
			throw new XMPException("Structs and arrays can't have \"value\" options", 103);
	//   22   42:new             #41  <Class XMPException>
	//   23   45:dup             
	//   24   46:ldc1            #52  <String "Structs and arrays can't have \"value\" options">
	//   25   48:bipush          103
	//   26   50:invokespecial   #50  <Method void XMPException(String, int)>
	//   27   53:athrow          
		else
			return;
	//   28   54:return          
	}

	protected String defineOptionName(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    11: default 100
	//	               -2147483648: 132
	//	               2: 102
	//	               16: 105
	//	               32: 108
	//	               64: 111
	//	               128: 114
	//	               256: 117
	//	               512: 120
	//	               1024: 123
	//	               2048: 126
	//	               4096: 129
		default:
			return null;
	//    2  100:aconst_null     
	//    3  101:areturn         

		case 2: // '\002'
			return "URI";
	//    4  102:ldc1            #55  <String "URI">
	//    5  104:areturn         

		case 16: // '\020'
			return "HAS_QUALIFIER";
	//    6  105:ldc1            #57  <String "HAS_QUALIFIER">
	//    7  107:areturn         

		case 32: // ' '
			return "QUALIFIER";
	//    8  108:ldc1            #58  <String "QUALIFIER">
	//    9  110:areturn         

		case 64: // '@'
			return "HAS_LANGUAGE";
	//   10  111:ldc1            #59  <String "HAS_LANGUAGE">
	//   11  113:areturn         

		case 128: 
			return "HAS_TYPE";
	//   12  114:ldc1            #60  <String "HAS_TYPE">
	//   13  116:areturn         

		case 256: 
			return "STRUCT";
	//   14  117:ldc1            #61  <String "STRUCT">
	//   15  119:areturn         

		case 512: 
			return "ARRAY";
	//   16  120:ldc1            #62  <String "ARRAY">
	//   17  122:areturn         

		case 1024: 
			return "ARRAY_ORDERED";
	//   18  123:ldc1            #63  <String "ARRAY_ORDERED">
	//   19  125:areturn         

		case 2048: 
			return "ARRAY_ALTERNATE";
	//   20  126:ldc1            #64  <String "ARRAY_ALTERNATE">
	//   21  128:areturn         

		case 4096: 
			return "ARRAY_ALT_TEXT";
	//   22  129:ldc1            #65  <String "ARRAY_ALT_TEXT">
	//   23  131:areturn         

		case -2147483648: 
			return "SCHEMA_NODE";
	//   24  132:ldc1            #66  <String "SCHEMA_NODE">
	//   25  134:areturn         
		}
	}

	public boolean equalArrayTypes(PropertyOptions propertyoptions)
	{
		return isArray() == propertyoptions.isArray() && isArrayOrdered() == propertyoptions.isArrayOrdered() && isArrayAlternate() == propertyoptions.isArrayAlternate() && isArrayAltText() == propertyoptions.isArrayAltText();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method boolean isArray()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #72  <Method boolean isArray()>
	//    4    8:icmpne          46
	//    5   11:aload_0         
	//    6   12:invokevirtual   #75  <Method boolean isArrayOrdered()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #75  <Method boolean isArrayOrdered()>
	//    9   19:icmpne          46
	//   10   22:aload_0         
	//   11   23:invokevirtual   #78  <Method boolean isArrayAlternate()>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #78  <Method boolean isArrayAlternate()>
	//   14   30:icmpne          46
	//   15   33:aload_0         
	//   16   34:invokevirtual   #81  <Method boolean isArrayAltText()>
	//   17   37:aload_1         
	//   18   38:invokevirtual   #81  <Method boolean isArrayAltText()>
	//   19   41:icmpne          46
	//   20   44:iconst_1        
	//   21   45:ireturn         
	//   22   46:iconst_0        
	//   23   47:ireturn         
	}

	public boolean getHasLanguage()
	{
		return getOption(64);
	//    0    0:aload_0         
	//    1    1:bipush          64
	//    2    3:invokevirtual   #86  <Method boolean getOption(int)>
	//    3    6:ireturn         
	}

	public boolean getHasQualifiers()
	{
		return getOption(16);
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:invokevirtual   #86  <Method boolean getOption(int)>
	//    3    6:ireturn         
	}

	public boolean getHasType()
	{
		return getOption(128);
	//    0    0:aload_0         
	//    1    1:sipush          128
	//    2    4:invokevirtual   #86  <Method boolean getOption(int)>
	//    3    7:ireturn         
	}

	protected int getValidOptions()
	{
		return 0xc0001ff2;
	//    0    0:ldc1            #91  <Int 0xc0001ff2>
	//    1    2:ireturn         
	}

	public boolean isArray()
	{
		return getOption(512);
	//    0    0:aload_0         
	//    1    1:sipush          512
	//    2    4:invokevirtual   #86  <Method boolean getOption(int)>
	//    3    7:ireturn         
	}

	public boolean isArrayAltText()
	{
		return getOption(4096);
	//    0    0:aload_0         
	//    1    1:sipush          4096
	//    2    4:invokevirtual   #86  <Method boolean getOption(int)>
	//    3    7:ireturn         
	}

	public boolean isArrayAlternate()
	{
		return getOption(2048);
	//    0    0:aload_0         
	//    1    1:sipush          2048
	//    2    4:invokevirtual   #86  <Method boolean getOption(int)>
	//    3    7:ireturn         
	}

	public boolean isArrayOrdered()
	{
		return getOption(1024);
	//    0    0:aload_0         
	//    1    1:sipush          1024
	//    2    4:invokevirtual   #86  <Method boolean getOption(int)>
	//    3    7:ireturn         
	}

	public boolean isCompositeProperty()
	{
		return (getOptions() & 0x300) > 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #95  <Method int getOptions()>
	//    2    4:sipush          768
	//    3    7:iand            
	//    4    8:ifle            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public boolean isOnlyArrayOptions()
	{
		return (getOptions() & 0xffffe1ff) == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #95  <Method int getOptions()>
	//    2    4:sipush          -7681
	//    3    7:iand            
	//    4    8:ifne            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public boolean isQualifier()
	{
		return getOption(32);
	//    0    0:aload_0         
	//    1    1:bipush          32
	//    2    3:invokevirtual   #86  <Method boolean getOption(int)>
	//    3    6:ireturn         
	}

	public boolean isSchemaNode()
	{
		return getOption(0x80000000);
	//    0    0:aload_0         
	//    1    1:ldc1            #27  <Int 0x80000000>
	//    2    3:invokevirtual   #86  <Method boolean getOption(int)>
	//    3    6:ireturn         
	}

	public boolean isSimple()
	{
		return (getOptions() & 0x300) == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #95  <Method int getOptions()>
	//    2    4:sipush          768
	//    3    7:iand            
	//    4    8:ifne            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public boolean isStruct()
	{
		return getOption(256);
	//    0    0:aload_0         
	//    1    1:sipush          256
	//    2    4:invokevirtual   #86  <Method boolean getOption(int)>
	//    3    7:ireturn         
	}

	public boolean isURI()
	{
		return getOption(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokevirtual   #86  <Method boolean getOption(int)>
	//    3    5:ireturn         
	}

	public void mergeWith(PropertyOptions propertyoptions)
		throws XMPException
	{
		if(propertyoptions != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          17
			setOptions(getOptions() | propertyoptions.getOptions());
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #95  <Method int getOptions()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #95  <Method int getOptions()>
	//    7   13:ior             
	//    8   14:invokevirtual   #106 <Method void setOptions(int)>
	//    9   17:return          
	}

	public PropertyOptions setArray(boolean flag)
	{
		setOption(512, flag);
	//    0    0:aload_0         
	//    1    1:sipush          512
	//    2    4:iload_1         
	//    3    5:invokevirtual   #112 <Method void setOption(int, boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public PropertyOptions setArrayAltText(boolean flag)
	{
		setOption(4096, flag);
	//    0    0:aload_0         
	//    1    1:sipush          4096
	//    2    4:iload_1         
	//    3    5:invokevirtual   #112 <Method void setOption(int, boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public PropertyOptions setArrayAlternate(boolean flag)
	{
		setOption(2048, flag);
	//    0    0:aload_0         
	//    1    1:sipush          2048
	//    2    4:iload_1         
	//    3    5:invokevirtual   #112 <Method void setOption(int, boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public PropertyOptions setArrayOrdered(boolean flag)
	{
		setOption(1024, flag);
	//    0    0:aload_0         
	//    1    1:sipush          1024
	//    2    4:iload_1         
	//    3    5:invokevirtual   #112 <Method void setOption(int, boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public PropertyOptions setHasLanguage(boolean flag)
	{
		setOption(64, flag);
	//    0    0:aload_0         
	//    1    1:bipush          64
	//    2    3:iload_1         
	//    3    4:invokevirtual   #112 <Method void setOption(int, boolean)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public PropertyOptions setHasQualifiers(boolean flag)
	{
		setOption(16, flag);
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:iload_1         
	//    3    4:invokevirtual   #112 <Method void setOption(int, boolean)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public PropertyOptions setHasType(boolean flag)
	{
		setOption(128, flag);
	//    0    0:aload_0         
	//    1    1:sipush          128
	//    2    4:iload_1         
	//    3    5:invokevirtual   #112 <Method void setOption(int, boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public PropertyOptions setQualifier(boolean flag)
	{
		setOption(32, flag);
	//    0    0:aload_0         
	//    1    1:bipush          32
	//    2    3:iload_1         
	//    3    4:invokevirtual   #112 <Method void setOption(int, boolean)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public PropertyOptions setSchemaNode(boolean flag)
	{
		setOption(0x80000000, flag);
	//    0    0:aload_0         
	//    1    1:ldc1            #27  <Int 0x80000000>
	//    2    3:iload_1         
	//    3    4:invokevirtual   #112 <Method void setOption(int, boolean)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public PropertyOptions setStruct(boolean flag)
	{
		setOption(256, flag);
	//    0    0:aload_0         
	//    1    1:sipush          256
	//    2    4:iload_1         
	//    3    5:invokevirtual   #112 <Method void setOption(int, boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public PropertyOptions setURI(boolean flag)
	{
		setOption(2, flag);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:iload_1         
	//    3    3:invokevirtual   #112 <Method void setOption(int, boolean)>
		return this;
	//    4    6:aload_0         
	//    5    7:areturn         
	}

	public static final int ARRAY = 512;
	public static final int ARRAY_ALTERNATE = 2048;
	public static final int ARRAY_ALT_TEXT = 4096;
	public static final int ARRAY_ORDERED = 1024;
	public static final int DELETE_EXISTING = 0x20000000;
	public static final int HAS_LANGUAGE = 64;
	public static final int HAS_QUALIFIERS = 16;
	public static final int HAS_TYPE = 128;
	public static final int NO_OPTIONS = 0;
	public static final int QUALIFIER = 32;
	public static final int SCHEMA_NODE = 0x80000000;
	public static final int SEPARATE_NODE = 0x40000000;
	public static final int STRUCT = 256;
	public static final int URI = 2;
}
