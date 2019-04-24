// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.options;

import com.itextpdf.xmp.XMPException;

// Referenced classes of package com.itextpdf.xmp.options:
//			Options, PropertyOptions

public final class AliasOptions extends Options
{

	public AliasOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Options()>
	//    2    4:return          
	}

	public AliasOptions(int i)
		throws XMPException
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #25  <Method void Options(int)>
	//    3    5:return          
	}

	protected String defineOptionName(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    5: default 52
	//	               0: 54
	//	               512: 57
	//	               1024: 60
	//	               2048: 63
	//	               4096: 66
		default:
			return null;
	//    2   52:aconst_null     
	//    3   53:areturn         

		case 0: // '\0'
			return "PROP_DIRECT";
	//    4   54:ldc1            #29  <String "PROP_DIRECT">
	//    5   56:areturn         

		case 512: 
			return "ARRAY";
	//    6   57:ldc1            #31  <String "ARRAY">
	//    7   59:areturn         

		case 1024: 
			return "ARRAY_ORDERED";
	//    8   60:ldc1            #33  <String "ARRAY_ORDERED">
	//    9   62:areturn         

		case 2048: 
			return "ARRAY_ALTERNATE";
	//   10   63:ldc1            #35  <String "ARRAY_ALTERNATE">
	//   11   65:areturn         

		case 4096: 
			return "ARRAY_ALT_TEXT";
	//   12   66:ldc1            #37  <String "ARRAY_ALT_TEXT">
	//   13   68:areturn         
		}
	}

	protected int getValidOptions()
	{
		return 7680;
	//    0    0:sipush          7680
	//    1    3:ireturn         
	}

	public boolean isArray()
	{
		return getOption(512);
	//    0    0:aload_0         
	//    1    1:sipush          512
	//    2    4:invokevirtual   #45  <Method boolean getOption(int)>
	//    3    7:ireturn         
	}

	public boolean isArrayAltText()
	{
		return getOption(4096);
	//    0    0:aload_0         
	//    1    1:sipush          4096
	//    2    4:invokevirtual   #45  <Method boolean getOption(int)>
	//    3    7:ireturn         
	}

	public boolean isArrayAlternate()
	{
		return getOption(2048);
	//    0    0:aload_0         
	//    1    1:sipush          2048
	//    2    4:invokevirtual   #45  <Method boolean getOption(int)>
	//    3    7:ireturn         
	}

	public boolean isArrayOrdered()
	{
		return getOption(1024);
	//    0    0:aload_0         
	//    1    1:sipush          1024
	//    2    4:invokevirtual   #45  <Method boolean getOption(int)>
	//    3    7:ireturn         
	}

	public boolean isSimple()
	{
		return getOptions() == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method int getOptions()>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public AliasOptions setArray(boolean flag)
	{
		setOption(512, flag);
	//    0    0:aload_0         
	//    1    1:sipush          512
	//    2    4:iload_1         
	//    3    5:invokevirtual   #58  <Method void setOption(int, boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AliasOptions setArrayAltText(boolean flag)
	{
		setOption(7680, flag);
	//    0    0:aload_0         
	//    1    1:sipush          7680
	//    2    4:iload_1         
	//    3    5:invokevirtual   #58  <Method void setOption(int, boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AliasOptions setArrayAlternate(boolean flag)
	{
		setOption(3584, flag);
	//    0    0:aload_0         
	//    1    1:sipush          3584
	//    2    4:iload_1         
	//    3    5:invokevirtual   #58  <Method void setOption(int, boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AliasOptions setArrayOrdered(boolean flag)
	{
		setOption(1536, flag);
	//    0    0:aload_0         
	//    1    1:sipush          1536
	//    2    4:iload_1         
	//    3    5:invokevirtual   #58  <Method void setOption(int, boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public PropertyOptions toPropertyOptions()
		throws XMPException
	{
		return new PropertyOptions(getOptions());
	//    0    0:new             #65  <Class PropertyOptions>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #52  <Method int getOptions()>
	//    4    8:invokespecial   #66  <Method void PropertyOptions(int)>
	//    5   11:areturn         
	}

	public static final int PROP_ARRAY = 512;
	public static final int PROP_ARRAY_ALTERNATE = 2048;
	public static final int PROP_ARRAY_ALT_TEXT = 4096;
	public static final int PROP_ARRAY_ORDERED = 1024;
	public static final int PROP_DIRECT = 0;
}
