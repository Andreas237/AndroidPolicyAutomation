// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.options;


// Referenced classes of package com.itextpdf.xmp.options:
//			Options

public final class ParseOptions extends Options
{

	public ParseOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Options()>
		setOption(24, true);
	//    2    4:aload_0         
	//    3    5:bipush          24
	//    4    7:iconst_1        
	//    5    8:invokevirtual   #23  <Method void setOption(int, boolean)>
	//    6   11:return          
	}

	protected String defineOptionName(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    5: default 52
	//	               1: 54
	//	               4: 57
	//	               8: 60
	//	               16: 63
	//	               32: 66
		default:
			return null;
	//    2   52:aconst_null     
	//    3   53:areturn         

		case 1: // '\001'
			return "REQUIRE_XMP_META";
	//    4   54:ldc1            #27  <String "REQUIRE_XMP_META">
	//    5   56:areturn         

		case 4: // '\004'
			return "STRICT_ALIASING";
	//    6   57:ldc1            #28  <String "STRICT_ALIASING">
	//    7   59:areturn         

		case 8: // '\b'
			return "FIX_CONTROL_CHARS";
	//    8   60:ldc1            #29  <String "FIX_CONTROL_CHARS">
	//    9   62:areturn         

		case 16: // '\020'
			return "ACCEPT_LATIN_1";
	//   10   63:ldc1            #30  <String "ACCEPT_LATIN_1">
	//   11   65:areturn         

		case 32: // ' '
			return "OMIT_NORMALIZATION";
	//   12   66:ldc1            #31  <String "OMIT_NORMALIZATION">
	//   13   68:areturn         
		}
	}

	public boolean getAcceptLatin1()
	{
		return getOption(16);
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:invokevirtual   #37  <Method boolean getOption(int)>
	//    3    6:ireturn         
	}

	public boolean getFixControlChars()
	{
		return getOption(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #37  <Method boolean getOption(int)>
	//    3    6:ireturn         
	}

	public boolean getOmitNormalization()
	{
		return getOption(32);
	//    0    0:aload_0         
	//    1    1:bipush          32
	//    2    3:invokevirtual   #37  <Method boolean getOption(int)>
	//    3    6:ireturn         
	}

	public boolean getRequireXMPMeta()
	{
		return getOption(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #37  <Method boolean getOption(int)>
	//    3    5:ireturn         
	}

	public boolean getStrictAliasing()
	{
		return getOption(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokevirtual   #37  <Method boolean getOption(int)>
	//    3    5:ireturn         
	}

	protected int getValidOptions()
	{
		return 61;
	//    0    0:bipush          61
	//    1    2:ireturn         
	}

	public ParseOptions setAcceptLatin1(boolean flag)
	{
		setOption(16, flag);
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:iload_1         
	//    3    4:invokevirtual   #23  <Method void setOption(int, boolean)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public ParseOptions setFixControlChars(boolean flag)
	{
		setOption(8, flag);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:iload_1         
	//    3    4:invokevirtual   #23  <Method void setOption(int, boolean)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public ParseOptions setOmitNormalization(boolean flag)
	{
		setOption(32, flag);
	//    0    0:aload_0         
	//    1    1:bipush          32
	//    2    3:iload_1         
	//    3    4:invokevirtual   #23  <Method void setOption(int, boolean)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public ParseOptions setRequireXMPMeta(boolean flag)
	{
		setOption(1, flag);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_1         
	//    3    3:invokevirtual   #23  <Method void setOption(int, boolean)>
		return this;
	//    4    6:aload_0         
	//    5    7:areturn         
	}

	public ParseOptions setStrictAliasing(boolean flag)
	{
		setOption(4, flag);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:iload_1         
	//    3    3:invokevirtual   #23  <Method void setOption(int, boolean)>
		return this;
	//    4    6:aload_0         
	//    5    7:areturn         
	}

	public static final int ACCEPT_LATIN_1 = 16;
	public static final int FIX_CONTROL_CHARS = 8;
	public static final int OMIT_NORMALIZATION = 32;
	public static final int REQUIRE_XMP_META = 1;
	public static final int STRICT_ALIASING = 4;
}
