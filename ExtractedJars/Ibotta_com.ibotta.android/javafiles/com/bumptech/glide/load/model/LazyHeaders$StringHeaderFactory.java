// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;


// Referenced classes of package com.bumptech.glide.load.model:
//			LazyHeaderFactory, LazyHeaders

static final class LazyHeaders$StringHeaderFactory
	implements LazyHeaderFactory
{

	public String buildHeader()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String value>
	//    2    4:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof LazyHeaders$StringHeaderFactory)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class LazyHeaders$StringHeaderFactory>
	//*   2    4:ifeq            24
		{
			obj = ((Object) ((LazyHeaders$StringHeaderFactory)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class LazyHeaders$StringHeaderFactory>
	//    5   11:astore_1        
			return value.equals(((Object) (((LazyHeaders$StringHeaderFactory) (obj)).value)));
	//    6   12:aload_0         
	//    7   13:getfield        #19  <Field String value>
	//    8   16:aload_1         
	//    9   17:getfield        #19  <Field String value>
	//   10   20:invokevirtual   #29  <Method boolean String.equals(Object)>
	//   11   23:ireturn         
		} else
		{
			return false;
	//   12   24:iconst_0        
	//   13   25:ireturn         
		}
	}

	public int hashCode()
	{
		return value.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String value>
	//    2    4:invokevirtual   #33  <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #36  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("StringHeaderFactory{value='");
	//    4    8:aload_1         
	//    5    9:ldc1            #39  <String "StringHeaderFactory{value='">
	//    6   11:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(value);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #19  <Field String value>
	//   11   20:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append('\'');
	//   13   24:aload_1         
	//   14   25:bipush          39
	//   15   27:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//   16   30:pop             
		stringbuilder.append('}');
	//   17   31:aload_1         
	//   18   32:bipush          125
	//   19   34:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//   20   37:pop             
		return stringbuilder.toString();
	//   21   38:aload_1         
	//   22   39:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   23   42:areturn         
	}

	private final String value;

	LazyHeaders$StringHeaderFactory(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		value = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field String value>
	//    5    9:return          
	}
}
