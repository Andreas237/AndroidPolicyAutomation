// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.os.Handler;

// Referenced classes of package com.craftar:
//			CraftAROnDeviceIR, CLog, CraftAROnDeviceCollection

class CraftAROnDeviceIR$OnDeviceInternalCollectionEventsHandler
	implements CraftARInternalInterfaces.CollectionEventsHandler
{

	public void onCollectionAdded(CraftAROnDeviceCollection craftarondevicecollection)
	{
		mHandler.post(new Runnable() {

			public void run()
			{
				CraftAROnDeviceIR.access$500();
			//    0    0:invokestatic    #28  <Method void CraftAROnDeviceIR.access$500()>
			//    1    3:return          
			}

			final CraftAROnDeviceIR.OnDeviceInternalCollectionEventsHandler this$1;

			
			{
				this$1 = CraftAROnDeviceIR.OnDeviceInternalCollectionEventsHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field CraftAROnDeviceIR$OnDeviceInternalCollectionEventsHandler this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field CraftAROnDeviceIR this$0>
	//    2    4:getfield        #27  <Field Handler CraftAROnDeviceIR.mHandler>
	//    3    7:new             #11  <Class CraftAROnDeviceIR$OnDeviceInternalCollectionEventsHandler$1>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #30  <Method void CraftAROnDeviceIR$OnDeviceInternalCollectionEventsHandler$1(CraftAROnDeviceIR$OnDeviceInternalCollectionEventsHandler)>
	//    7   15:invokevirtual   #36  <Method boolean Handler.post(Runnable)>
	//    8   18:pop             
	//    9   19:return          
	}

	public void onCollectionDeleted(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #40  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Collection with uuid ");
	//    4    8:aload_2         
	//    5    9:ldc1            #43  <String "Collection with uuid ">
	//    6   11:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append(" has been deleted!");
	//   12   21:aload_2         
	//   13   22:ldc1            #49  <String " has been deleted!">
	//   14   24:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		CLog.d(stringbuilder.toString());
	//   16   28:aload_2         
	//   17   29:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   18   32:invokestatic    #58  <Method void CLog.d(String)>
		unloadCollection(s);
	//   19   35:aload_0         
	//   20   36:getfield        #17  <Field CraftAROnDeviceIR this$0>
	//   21   39:aload_1         
	//   22   40:invokevirtual   #61  <Method void CraftAROnDeviceIR.unloadCollection(String)>
	//   23   43:return          
	}

	public void onCollectionModified(CraftAROnDeviceCollection craftarondevicecollection)
	{
	//    0    0:return          
	}

	final CraftAROnDeviceIR this$0;

	CraftAROnDeviceIR$OnDeviceInternalCollectionEventsHandler()
	{
		this$0 = CraftAROnDeviceIR.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CraftAROnDeviceIR this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
