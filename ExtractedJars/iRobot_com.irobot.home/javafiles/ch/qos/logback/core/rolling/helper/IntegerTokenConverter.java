// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.pattern.DynamicConverter;

// Referenced classes of package ch.qos.logback.core.rolling.helper:
//			MonoTypedConverter

public class IntegerTokenConverter extends DynamicConverter
	implements MonoTypedConverter
{

	public IntegerTokenConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void DynamicConverter()>
	//    2    4:return          
	}

	public String convert(int i)
	{
		return Integer.toString(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #22  <Method String Integer.toString(int)>
	//    2    4:areturn         
	}

	public String convert(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("Null argument forbidden");
	//    2    4:new             #25  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #27  <String "Null argument forbidden">
	//    5   10:invokespecial   #30  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(obj instanceof Integer)
	//*   7   14:aload_1         
	//*   8   15:instanceof      #19  <Class Integer>
	//*   9   18:ifeq            33
		{
			return convert(((Integer)obj).intValue());
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:checkcast       #19  <Class Integer>
	//   13   26:invokevirtual   #34  <Method int Integer.intValue()>
	//   14   29:invokevirtual   #36  <Method String convert(int)>
	//   15   32:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   16   33:new             #38  <Class StringBuilder>
	//   17   36:dup             
	//   18   37:invokespecial   #39  <Method void StringBuilder()>
	//   19   40:astore_2        
			stringbuilder.append("Cannot convert ");
	//   20   41:aload_2         
	//   21   42:ldc1            #41  <String "Cannot convert ">
	//   22   44:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
			stringbuilder.append(obj);
	//   24   48:aload_2         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
	//   27   53:pop             
			stringbuilder.append(" of type");
	//   28   54:aload_2         
	//   29   55:ldc1            #50  <String " of type">
	//   30   57:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   31   60:pop             
			stringbuilder.append(obj.getClass().getName());
	//   32   61:aload_2         
	//   33   62:aload_1         
	//   34   63:invokevirtual   #56  <Method Class Object.getClass()>
	//   35   66:invokevirtual   #62  <Method String Class.getName()>
	//   36   69:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   37   72:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   38   73:new             #25  <Class IllegalArgumentException>
	//   39   76:dup             
	//   40   77:aload_2         
	//   41   78:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   42   81:invokespecial   #30  <Method void IllegalArgumentException(String)>
	//   43   84:athrow          
		}
	}

	public boolean isApplicable(Object obj)
	{
		return obj instanceof Integer;
	//    0    0:aload_1         
	//    1    1:instanceof      #19  <Class Integer>
	//    2    4:ireturn         
	}

	public static final String CONVERTER_KEY = "i";
}
