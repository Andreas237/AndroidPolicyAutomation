// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.versionedparcelable;

import java.io.*;

// Referenced classes of package androidx.versionedparcelable:
//			VersionedParcel

class VersionedParcel$1 extends ObjectInputStream
{

	protected Class resolveClass(ObjectStreamClass objectstreamclass)
		throws IOException, ClassNotFoundException
	{
		Class class1 = Class.forName(objectstreamclass.getName(), false, ((Object)this).getClass().getClassLoader());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #31  <Method String ObjectStreamClass.getName()>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:invokevirtual   #37  <Method Class Object.getClass()>
	//    5    9:invokevirtual   #43  <Method ClassLoader Class.getClassLoader()>
	//    6   12:invokestatic    #47  <Method Class Class.forName(String, boolean, ClassLoader)>
	//    7   15:astore_2        
		if(class1 != null)
	//*   8   16:aload_2         
	//*   9   17:ifnull          22
			return class1;
	//   10   20:aload_2         
	//   11   21:areturn         
		else
			return super.resolveClass(objectstreamclass);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokespecial   #49  <Method Class ObjectInputStream.resolveClass(ObjectStreamClass)>
	//   15   27:areturn         
	}

	final VersionedParcel this$0;

	VersionedParcel$1(InputStream inputstream)
	{
		this$0 = VersionedParcel.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field VersionedParcel this$0>
		super(inputstream);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void ObjectInputStream(InputStream)>
	//    6   10:return          
	}
}
