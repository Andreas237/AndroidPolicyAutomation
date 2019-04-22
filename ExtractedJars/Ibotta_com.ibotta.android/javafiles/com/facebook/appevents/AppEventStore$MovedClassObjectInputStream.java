// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import java.io.*;

// Referenced classes of package com.facebook.appevents:
//			AppEventStore

private static class AppEventStore$MovedClassObjectInputStream extends ObjectInputStream
{

	protected ObjectStreamClass readClassDescriptor()
		throws IOException, ClassNotFoundException
	{
		ObjectStreamClass objectstreamclass1 = super.readClassDescriptor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method ObjectStreamClass ObjectInputStream.readClassDescriptor()>
	//    2    4:astore_2        
		if(objectstreamclass1.getName().equals("com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1"))
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #27  <Method String ObjectStreamClass.getName()>
	//*   5    9:ldc1            #29  <String "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1">
	//*   6   11:invokevirtual   #35  <Method boolean String.equals(Object)>
	//*   7   14:ifeq            23
			return ObjectStreamClass.lookup(com/facebook/appevents/AccessTokenAppIdPair$SerializationProxyV1);
	//    8   17:ldc1            #37  <Class AccessTokenAppIdPair$SerializationProxyV1>
	//    9   19:invokestatic    #41  <Method ObjectStreamClass ObjectStreamClass.lookup(Class)>
	//   10   22:areturn         
		ObjectStreamClass objectstreamclass = objectstreamclass1;
	//   11   23:aload_2         
	//   12   24:astore_1        
		if(objectstreamclass1.getName().equals("com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1"))
	//*  13   25:aload_2         
	//*  14   26:invokevirtual   #27  <Method String ObjectStreamClass.getName()>
	//*  15   29:ldc1            #43  <String "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1">
	//*  16   31:invokevirtual   #35  <Method boolean String.equals(Object)>
	//*  17   34:ifeq            43
			objectstreamclass = ObjectStreamClass.lookup(com/facebook/appevents/AppEvent$SerializationProxyV1);
	//   18   37:ldc1            #45  <Class AppEvent$SerializationProxyV1>
	//   19   39:invokestatic    #41  <Method ObjectStreamClass ObjectStreamClass.lookup(Class)>
	//   20   42:astore_1        
		return objectstreamclass;
	//   21   43:aload_1         
	//   22   44:areturn         
	}

	public AppEventStore$MovedClassObjectInputStream(InputStream inputstream)
		throws IOException
	{
		super(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void ObjectInputStream(InputStream)>
	//    3    5:return          
	}
}
