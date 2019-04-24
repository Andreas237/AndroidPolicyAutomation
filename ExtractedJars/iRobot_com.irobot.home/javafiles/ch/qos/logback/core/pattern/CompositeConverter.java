// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.pattern;


// Referenced classes of package ch.qos.logback.core.pattern:
//			DynamicConverter, Converter

public abstract class CompositeConverter extends DynamicConverter
{

	public CompositeConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void DynamicConverter()>
	//    2    4:return          
	}

	public String convert(Object obj)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #17  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void StringBuilder()>
	//    3    7:astore_3        
		for(Converter converter = childConverter; converter != null; converter = converter.next)
	//*   4    8:aload_0         
	//*   5    9:getfield        #20  <Field Converter childConverter>
	//*   6   12:astore_2        
	//*   7   13:aload_2         
	//*   8   14:ifnull          31
			converter.write(stringbuilder, obj);
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #26  <Method void Converter.write(StringBuilder, Object)>

	//   13   23:aload_2         
	//   14   24:getfield        #29  <Field Converter Converter.next>
	//   15   27:astore_2        
	//*  16   28:goto            13
		return transform(obj, stringbuilder.toString());
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:aload_3         
	//   20   34:invokevirtual   #33  <Method String StringBuilder.toString()>
	//   21   37:invokevirtual   #37  <Method String transform(Object, String)>
	//   22   40:areturn         
	}

	public Converter getChildConverter()
	{
		return childConverter;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Converter childConverter>
	//    2    4:areturn         
	}

	public void setChildConverter(Converter converter)
	{
		childConverter = converter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Converter childConverter>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #17  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("CompositeConverter<");
	//    4    8:aload_1         
	//    5    9:ldc1            #47  <String "CompositeConverter<">
	//    6   11:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		if(formattingInfo != null)
	//*   8   15:aload_0         
	//*   9   16:getfield        #55  <Field FormatInfo formattingInfo>
	//*  10   19:ifnull          31
			stringbuilder.append(((Object) (formattingInfo)));
	//   11   22:aload_1         
	//   12   23:aload_0         
	//   13   24:getfield        #55  <Field FormatInfo formattingInfo>
	//   14   27:invokevirtual   #58  <Method StringBuilder StringBuilder.append(Object)>
	//   15   30:pop             
		if(childConverter != null)
	//*  16   31:aload_0         
	//*  17   32:getfield        #20  <Field Converter childConverter>
	//*  18   35:ifnull          54
		{
			stringbuilder.append(", children: ");
	//   19   38:aload_1         
	//   20   39:ldc1            #60  <String ", children: ">
	//   21   41:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
			stringbuilder.append(((Object) (childConverter)));
	//   23   45:aload_1         
	//   24   46:aload_0         
	//   25   47:getfield        #20  <Field Converter childConverter>
	//   26   50:invokevirtual   #58  <Method StringBuilder StringBuilder.append(Object)>
	//   27   53:pop             
		}
		stringbuilder.append(">");
	//   28   54:aload_1         
	//   29   55:ldc1            #62  <String ">">
	//   30   57:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   31   60:pop             
		return stringbuilder.toString();
	//   32   61:aload_1         
	//   33   62:invokevirtual   #33  <Method String StringBuilder.toString()>
	//   34   65:areturn         
	}

	protected abstract String transform(Object obj, String s);

	Converter childConverter;
}
