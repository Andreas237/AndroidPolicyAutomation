// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.utilities;

import java.io.*;

// Referenced classes of package com.firebase.client.utilities:
//			Base64

static final class Base64$1 extends ObjectInputStream
{

	public Class resolveClass(ObjectStreamClass objectstreamclass)
		throws IOException, ClassNotFoundException
	{
		Class class1 = Class.forName(objectstreamclass.getName(), false, val$loader);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #31  <Method String ObjectStreamClass.getName()>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:getfield        #15  <Field ClassLoader val$loader>
	//    5    9:invokestatic    #37  <Method Class Class.forName(String, boolean, ClassLoader)>
	//    6   12:astore_2        
		if(class1 == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       23
			return super.resolveClass(objectstreamclass);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokespecial   #39  <Method Class ObjectInputStream.resolveClass(ObjectStreamClass)>
	//   12   22:areturn         
		else
			return class1;
	//   13   23:aload_2         
	//   14   24:areturn         
	}

	final ClassLoader val$loader;

	Base64$1(InputStream inputstream, ClassLoader classloader)
	{
		val$loader = classloader;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field ClassLoader val$loader>
		super(inputstream);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #18  <Method void ObjectInputStream(InputStream)>
	//    6   10:return          
	}
}
