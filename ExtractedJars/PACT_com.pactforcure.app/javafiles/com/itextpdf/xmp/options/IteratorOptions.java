// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.options;


// Referenced classes of package com.itextpdf.xmp.options:
//			Options

public final class IteratorOptions extends Options
{

	public IteratorOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Options()>
	//    2    4:return          
	}

	protected String defineOptionName(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    4: default 44
	//	               256: 46
	//	               512: 49
	//	               1024: 52
	//	               4096: 55
		default:
			return null;
	//    2   44:aconst_null     
	//    3   45:areturn         

		case 256: 
			return "JUST_CHILDREN";
	//    4   46:ldc1            #21  <String "JUST_CHILDREN">
	//    5   48:areturn         

		case 512: 
			return "JUST_LEAFNODES";
	//    6   49:ldc1            #22  <String "JUST_LEAFNODES">
	//    7   51:areturn         

		case 1024: 
			return "JUST_LEAFNAME";
	//    8   52:ldc1            #23  <String "JUST_LEAFNAME">
	//    9   54:areturn         

		case 4096: 
			return "OMIT_QUALIFIERS";
	//   10   55:ldc1            #24  <String "OMIT_QUALIFIERS">
	//   11   57:areturn         
		}
	}

	protected int getValidOptions()
	{
		return 5888;
	//    0    0:sipush          5888
	//    1    3:ireturn         
	}

	public boolean isJustChildren()
	{
		return getOption(256);
	//    0    0:aload_0         
	//    1    1:sipush          256
	//    2    4:invokevirtual   #32  <Method boolean getOption(int)>
	//    3    7:ireturn         
	}

	public boolean isJustLeafname()
	{
		return getOption(1024);
	//    0    0:aload_0         
	//    1    1:sipush          1024
	//    2    4:invokevirtual   #32  <Method boolean getOption(int)>
	//    3    7:ireturn         
	}

	public boolean isJustLeafnodes()
	{
		return getOption(512);
	//    0    0:aload_0         
	//    1    1:sipush          512
	//    2    4:invokevirtual   #32  <Method boolean getOption(int)>
	//    3    7:ireturn         
	}

	public boolean isOmitQualifiers()
	{
		return getOption(4096);
	//    0    0:aload_0         
	//    1    1:sipush          4096
	//    2    4:invokevirtual   #32  <Method boolean getOption(int)>
	//    3    7:ireturn         
	}

	public IteratorOptions setJustChildren(boolean flag)
	{
		setOption(256, flag);
	//    0    0:aload_0         
	//    1    1:sipush          256
	//    2    4:iload_1         
	//    3    5:invokevirtual   #41  <Method void setOption(int, boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public IteratorOptions setJustLeafname(boolean flag)
	{
		setOption(1024, flag);
	//    0    0:aload_0         
	//    1    1:sipush          1024
	//    2    4:iload_1         
	//    3    5:invokevirtual   #41  <Method void setOption(int, boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public IteratorOptions setJustLeafnodes(boolean flag)
	{
		setOption(512, flag);
	//    0    0:aload_0         
	//    1    1:sipush          512
	//    2    4:iload_1         
	//    3    5:invokevirtual   #41  <Method void setOption(int, boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public IteratorOptions setOmitQualifiers(boolean flag)
	{
		setOption(4096, flag);
	//    0    0:aload_0         
	//    1    1:sipush          4096
	//    2    4:iload_1         
	//    3    5:invokevirtual   #41  <Method void setOption(int, boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public static final int JUST_CHILDREN = 256;
	public static final int JUST_LEAFNAME = 1024;
	public static final int JUST_LEAFNODES = 512;
	public static final int OMIT_QUALIFIERS = 4096;
}
