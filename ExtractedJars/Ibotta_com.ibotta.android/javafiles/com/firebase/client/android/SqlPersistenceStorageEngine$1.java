// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.android;

import com.firebase.client.core.Path;
import com.firebase.client.core.utilities.ImmutableTree;

// Referenced classes of package com.firebase.client.android:
//			SqlPersistenceStorageEngine

class SqlPersistenceStorageEngine$1
	implements com.firebase.client.core.utilities.ImmutableTree.TreeVisitor
{

	public Integer onNodeValue(Path path, Void void1, Integer integer)
	{
		int i;
		if(val$rowIdsToKeep.get(path) == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field ImmutableTree val$rowIdsToKeep>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #34  <Method Object ImmutableTree.get(Path)>
	//*   4    8:ifnonnull       22
			i = integer.intValue() + 1;
	//    5   11:aload_3         
	//    6   12:invokevirtual   #40  <Method int Integer.intValue()>
	//    7   15:iconst_1        
	//    8   16:iadd            
	//    9   17:istore          4
		else
	//*  10   19:goto            28
			i = integer.intValue();
	//   11   22:aload_3         
	//   12   23:invokevirtual   #40  <Method int Integer.intValue()>
	//   13   26:istore          4
		return Integer.valueOf(i);
	//   14   28:iload           4
	//   15   30:invokestatic    #44  <Method Integer Integer.valueOf(int)>
	//   16   33:areturn         
	}

	public volatile Object onNodeValue(Path path, Object obj, Object obj1)
	{
		return ((Object) (onNodeValue(path, (Void)obj, (Integer)obj1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #47  <Class Void>
	//    4    6:aload_3         
	//    5    7:checkcast       #36  <Class Integer>
	//    6   10:invokevirtual   #49  <Method Integer onNodeValue(Path, Void, Integer)>
	//    7   13:areturn         
	}

	final SqlPersistenceStorageEngine this$0;
	final ImmutableTree val$rowIdsToKeep;

	SqlPersistenceStorageEngine$1()
	{
		this$0 = final_sqlpersistencestorageengine;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field SqlPersistenceStorageEngine this$0>
		val$rowIdsToKeep = ImmutableTree.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field ImmutableTree val$rowIdsToKeep>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
