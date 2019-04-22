// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.snapshot.Node;
import java.util.Map;

// Referenced classes of package com.firebase.client.core:
//			CompoundWrite, Path

class CompoundWrite$2
	implements com.firebase.client.core.utilities.eeVisitor
{

	public volatile Object onNodeValue(Path path, Object obj, Object obj1)
	{
		return ((Object) (onNodeValue(path, (Node)obj, (Void)obj1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #34  <Class Node>
	//    4    6:aload_3         
	//    5    7:checkcast       #36  <Class Void>
	//    6   10:invokevirtual   #39  <Method Void onNodeValue(Path, Node, Void)>
	//    7   13:areturn         
	}

	public Void onNodeValue(Path path, Node node, Void void1)
	{
		val$writes.put(((Object) (path.wireFormat())), node.getValue(val$exportFormat));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Map val$writes>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #45  <Method String Path.wireFormat()>
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #26  <Field boolean val$exportFormat>
	//    7   13:invokeinterface #48  <Method Object Node.getValue(boolean)>
	//    8   18:invokeinterface #54  <Method Object Map.put(Object, Object)>
	//    9   23:pop             
		return null;
	//   10   24:aconst_null     
	//   11   25:areturn         
	}

	final CompoundWrite this$0;
	final boolean val$exportFormat;
	final Map val$writes;

	CompoundWrite$2()
	{
		this$0 = final_compoundwrite;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field CompoundWrite this$0>
		val$writes = map;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field Map val$writes>
		val$exportFormat = Z.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #26  <Field boolean val$exportFormat>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #29  <Method void Object()>
	//   11   19:return          
	}
}
