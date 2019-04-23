// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import java.util.HashSet;

// Referenced classes of package com.craftar:
//			CraftAROnDeviceIR

class CraftAROnDeviceIR$OnDeviceCollectionStatus
{

	public boolean loaded;
	public HashSet loadedImages;
	final CraftAROnDeviceIR this$0;

	public CraftAROnDeviceIR$OnDeviceCollectionStatus()
	{
		this$0 = CraftAROnDeviceIR.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field CraftAROnDeviceIR this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		loaded = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #23  <Field boolean loaded>
		loadedImages = new HashSet();
	//    8   14:aload_0         
	//    9   15:new             #25  <Class HashSet>
	//   10   18:dup             
	//   11   19:invokespecial   #26  <Method void HashSet()>
	//   12   22:putfield        #28  <Field HashSet loadedImages>
	//   13   25:return          
	}
}
