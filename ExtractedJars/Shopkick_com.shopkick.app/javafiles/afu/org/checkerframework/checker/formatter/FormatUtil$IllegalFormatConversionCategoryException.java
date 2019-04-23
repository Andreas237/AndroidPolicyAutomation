// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package afu.org.checkerframework.checker.formatter;

import afu.org.checkerframework.checker.formatter.qual.ConversionCategory;
import java.util.IllegalFormatConversionException;

// Referenced classes of package afu.org.checkerframework.checker.formatter:
//			FormatUtil

public static class FormatUtil$IllegalFormatConversionCategoryException extends IllegalFormatConversionException
{

	public ConversionCategory getExpected()
	{
		return expected;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field ConversionCategory expected>
	//    2    4:areturn         
	}

	public ConversionCategory getFound()
	{
		return found;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ConversionCategory found>
	//    2    4:areturn         
	}

	public String getMessage()
	{
		return String.format("Expected category %s but found %s.", new Object[] {
			expected, found
		});
	//    0    0:ldc1            #53  <String "Expected category %s but found %s.">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #43  <Field ConversionCategory expected>
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:aload_0         
	//   11   16:getfield        #45  <Field ConversionCategory found>
	//   12   19:aastore         
	//   13   20:invokestatic    #57  <Method String String.format(String, Object[])>
	//   14   23:areturn         
	}

	private static final long serialVersionUID = 0x10366beL;
	private final ConversionCategory expected;
	private final ConversionCategory found;

	public FormatUtil$IllegalFormatConversionCategoryException(ConversionCategory conversioncategory, ConversionCategory conversioncategory1)
	{
		char c;
		if(conversioncategory.chars.length() == 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #22  <Field String ConversionCategory.chars>
	//*   2    4:invokevirtual   #28  <Method int String.length()>
	//*   3    7:ifne            16
			c = '-';
	//    4   10:bipush          45
	//    5   12:istore_3        
		else
	//*   6   13:goto            25
			c = conversioncategory.chars.charAt(0);
	//    7   16:aload_1         
	//    8   17:getfield        #22  <Field String ConversionCategory.chars>
	//    9   20:iconst_0        
	//   10   21:invokevirtual   #32  <Method char String.charAt(int)>
	//   11   24:istore_3        
		Object obj;
		if(conversioncategory1.types == null)
	//*  12   25:aload_2         
	//*  13   26:getfield        #36  <Field Class[] ConversionCategory.types>
	//*  14   29:ifnonnull       39
			obj = java/lang/Object;
	//   15   32:ldc1            #38  <Class Object>
	//   16   34:astore          4
		else
	//*  17   36:goto            47
			obj = ((Object) (conversioncategory1.types[0]));
	//   18   39:aload_2         
	//   19   40:getfield        #36  <Field Class[] ConversionCategory.types>
	//   20   43:iconst_0        
	//   21   44:aaload          
	//   22   45:astore          4
		super(c, ((Class) (obj)));
	//   23   47:aload_0         
	//   24   48:iload_3         
	//   25   49:aload           4
	//   26   51:invokespecial   #41  <Method void IllegalFormatConversionException(char, Class)>
		expected = conversioncategory;
	//   27   54:aload_0         
	//   28   55:aload_1         
	//   29   56:putfield        #43  <Field ConversionCategory expected>
		found = conversioncategory1;
	//   30   59:aload_0         
	//   31   60:aload_2         
	//   32   61:putfield        #45  <Field ConversionCategory found>
	//   33   64:return          
	}
}
