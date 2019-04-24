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
	//    1    1:getfield        #18  <Field String value>
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
	//    7   13:getfield        #18  <Field String value>
	//    8   16:aload_1         
	//    9   17:getfield        #18  <Field String value>
	//   10   20:invokevirtual   #27  <Method boolean String.equals(Object)>
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
	//    1    1:getfield        #18  <Field String value>
	//    2    4:invokevirtual   #31  <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("StringHeaderFactory{value='").append(value).append('\'').append('}').toString();
	//    0    0:new             #34  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void StringBuilder()>
	//    3    7:ldc1            #37  <String "StringHeaderFactory{value='">
	//    4    9:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #18  <Field String value>
	//    7   16:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:bipush          39
	//    9   21:invokevirtual   #44  <Method StringBuilder StringBuilder.append(char)>
	//   10   24:bipush          125
	//   11   26:invokevirtual   #44  <Method StringBuilder StringBuilder.append(char)>
	//   12   29:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   13   32:areturn         
	}

	private final String value;

	LazyHeaders$StringHeaderFactory(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		value = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String value>
	//    5    9:return          
	}
}
