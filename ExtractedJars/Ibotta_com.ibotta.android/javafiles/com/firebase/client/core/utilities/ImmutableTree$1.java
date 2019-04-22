// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.utilities;

import com.firebase.client.core.Path;
import java.util.ArrayList;

// Referenced classes of package com.firebase.client.core.utilities:
//			ImmutableTree

class ImmutableTree$1
	implements eeVisitor
{

	public volatile Object onNodeValue(Path path, Object obj, Object obj1)
	{
		return ((Object) (onNodeValue(path, obj, (Void)obj1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:checkcast       #30  <Class Void>
	//    5    7:invokevirtual   #33  <Method Void onNodeValue(Path, Object, Void)>
	//    6   10:areturn         
	}

	public Void onNodeValue(Path path, Object obj, Void void1)
	{
		val$list.add(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field ArrayList val$list>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #39  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
	}

	final ImmutableTree this$0;
	final ArrayList val$list;

	ImmutableTree$1()
	{
		this$0 = final_immutabletree;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ImmutableTree this$0>
		val$list = ArrayList.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field ArrayList val$list>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
