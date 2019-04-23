// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package afu.org.checkerframework.checker.formatter;

import afu.org.checkerframework.checker.formatter.qual.ConversionCategory;

// Referenced classes of package afu.org.checkerframework.checker.formatter:
//			FormatUtil

private static class FormatUtil$Conversion
{

	ConversionCategory category()
	{
		return cath;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field ConversionCategory cath>
	//    2    4:areturn         
	}

	int index()
	{
		return index;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int index>
	//    2    4:ireturn         
	}

	private final ConversionCategory cath;
	private final int index;

	public FormatUtil$Conversion(char c, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		index = i;
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:putfield        #18  <Field int index>
		cath = ConversionCategory.fromConversionChar(c);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokestatic    #24  <Method ConversionCategory ConversionCategory.fromConversionChar(char)>
	//    8   14:putfield        #26  <Field ConversionCategory cath>
	//    9   17:return          
	}
}
