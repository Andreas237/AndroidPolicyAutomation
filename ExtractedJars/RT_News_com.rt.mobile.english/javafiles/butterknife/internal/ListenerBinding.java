// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package butterknife.internal;

import java.util.*;

// Referenced classes of package butterknife.internal:
//			Binding

final class ListenerBinding
	implements Binding
{

	ListenerBinding(String s, List list, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field String name>
		parameters = Collections.unmodifiableList(((List) (new ArrayList(((java.util.Collection) (list))))));
	//    5    9:aload_0         
	//    6   10:new             #22  <Class ArrayList>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokespecial   #25  <Method void ArrayList(java.util.Collection)>
	//   10   18:invokestatic    #31  <Method List Collections.unmodifiableList(List)>
	//   11   21:putfield        #33  <Field List parameters>
		required = flag;
	//   12   24:aload_0         
	//   13   25:iload_3         
	//   14   26:putfield        #35  <Field boolean required>
	//   15   29:return          
	}

	public String getDescription()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #42  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("method '");
	//    4    8:aload_1         
	//    5    9:ldc1            #45  <String "method '">
	//    6   11:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(name);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #20  <Field String name>
	//   11   20:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append("'");
	//   13   24:aload_1         
	//   14   25:ldc1            #51  <String "'">
	//   15   27:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String name>
	//    2    4:areturn         
	}

	public List getParameters()
	{
		return parameters;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field List parameters>
	//    2    4:areturn         
	}

	public boolean isRequired()
	{
		return required;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean required>
	//    2    4:ireturn         
	}

	private final String name;
	private final List parameters;
	private final boolean required;
}
