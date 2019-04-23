// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package afu.org.checkerframework.checker.formatter;

import java.util.MissingFormatArgumentException;

// Referenced classes of package afu.org.checkerframework.checker.formatter:
//			FormatUtil

public static class FormatUtil$ExcessiveOrMissingFormatArgumentException extends MissingFormatArgumentException
{

	public int getExpected()
	{
		return expected;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int expected>
	//    2    4:ireturn         
	}

	public int getFound()
	{
		return found;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int found>
	//    2    4:ireturn         
	}

	public String getMessage()
	{
		return String.format("Expected %d arguments but found %d.", new Object[] {
			Integer.valueOf(expected), Integer.valueOf(found)
		});
	//    0    0:ldc1            #33  <String "Expected %d arguments but found %d.">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #23  <Field int expected>
	//    7   12:invokestatic    #41  <Method Integer Integer.valueOf(int)>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_0         
	//   12   19:getfield        #25  <Field int found>
	//   13   22:invokestatic    #41  <Method Integer Integer.valueOf(int)>
	//   14   25:aastore         
	//   15   26:invokestatic    #47  <Method String String.format(String, Object[])>
	//   16   29:areturn         
	}

	private static final long serialVersionUID = 0x10366beL;
	private final int expected;
	private final int found;

	public FormatUtil$ExcessiveOrMissingFormatArgumentException(int i, int j)
	{
		super("-");
	//    0    0:aload_0         
	//    1    1:ldc1            #18  <String "-">
	//    2    3:invokespecial   #21  <Method void MissingFormatArgumentException(String)>
		expected = i;
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:putfield        #23  <Field int expected>
		found = j;
	//    6   11:aload_0         
	//    7   12:iload_2         
	//    8   13:putfield        #25  <Field int found>
	//    9   16:return          
	}
}
