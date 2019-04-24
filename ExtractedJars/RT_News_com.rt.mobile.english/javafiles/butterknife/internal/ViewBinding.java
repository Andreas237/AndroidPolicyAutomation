// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package butterknife.internal;


// Referenced classes of package butterknife.internal:
//			Binding

final class ViewBinding
	implements Binding
{

	ViewBinding(String s, String s1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String name>
		type = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field String type>
		required = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #22  <Field boolean required>
	//   11   19:return          
	}

	public String getDescription()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #27  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("field '");
	//    4    8:aload_1         
	//    5    9:ldc1            #30  <String "field '">
	//    6   11:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(name);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #18  <Field String name>
	//   11   20:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append("'");
	//   13   24:aload_1         
	//   14   25:ldc1            #36  <String "'">
	//   15   27:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #39  <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String name>
	//    2    4:areturn         
	}

	public String getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String type>
	//    2    4:areturn         
	}

	public boolean isRequired()
	{
		return required;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean required>
	//    2    4:ireturn         
	}

	private final String name;
	private final boolean required;
	private final String type;
}
