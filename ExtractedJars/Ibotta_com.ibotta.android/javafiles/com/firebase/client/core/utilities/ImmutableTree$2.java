// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.utilities;

import com.firebase.client.core.Path;
import java.util.List;

// Referenced classes of package com.firebase.client.core.utilities:
//			ImmutableTree

class ImmutableTree$2
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
		val$list.add(((Object) (new java.util.leImmutableEntry(((Object) (path)), obj))));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field List val$list>
	//    2    4:new             #35  <Class java.util.AbstractMap$SimpleImmutableEntry>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #38  <Method void java.util.AbstractMap$SimpleImmutableEntry(Object, Object)>
	//    7   13:invokeinterface #44  <Method boolean List.add(Object)>
	//    8   18:pop             
		return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
	}

	final ImmutableTree this$0;
	final List val$list;

	ImmutableTree$2()
	{
		this$0 = final_immutabletree;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ImmutableTree this$0>
		val$list = List.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field List val$list>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
