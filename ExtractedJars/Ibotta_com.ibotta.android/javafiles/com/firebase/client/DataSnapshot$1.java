// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;

import com.firebase.client.snapshot.ChildKey;
import com.firebase.client.snapshot.IndexedNode;
import com.firebase.client.snapshot.NamedNode;
import java.util.Iterator;

// Referenced classes of package com.firebase.client:
//			DataSnapshot, Firebase

class DataSnapshot$1
	implements Iterable
{

	public Iterator iterator()
	{
		return new Iterator() {

			public boolean hasNext()
			{
				return iter.hasNext();
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field DataSnapshot$1 this$1>
			//    2    4:getfield        #28  <Field Iterator DataSnapshot$1.val$iter>
			//    3    7:invokeinterface #30  <Method boolean Iterator.hasNext()>
			//    4   12:ireturn         
			}

			public DataSnapshot next()
			{
				NamedNode namednode = (NamedNode)iter.next();
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field DataSnapshot$1 this$1>
			//    2    4:getfield        #28  <Field Iterator DataSnapshot$1.val$iter>
			//    3    7:invokeinterface #35  <Method Object Iterator.next()>
			//    4   12:checkcast       #37  <Class NamedNode>
			//    5   15:astore_1        
				return new DataSnapshot(DataSnapshot.access$000(this$0).child(namednode.getName().asString()), IndexedNode.from(namednode.getNode()));
			//    6   16:new             #39  <Class DataSnapshot>
			//    7   19:dup             
			//    8   20:aload_0         
			//    9   21:getfield        #18  <Field DataSnapshot$1 this$1>
			//   10   24:getfield        #43  <Field DataSnapshot DataSnapshot$1.this$0>
			//   11   27:invokestatic    #47  <Method Firebase DataSnapshot.access$000(DataSnapshot)>
			//   12   30:aload_1         
			//   13   31:invokevirtual   #51  <Method ChildKey NamedNode.getName()>
			//   14   34:invokevirtual   #57  <Method String ChildKey.asString()>
			//   15   37:invokevirtual   #63  <Method Firebase Firebase.child(String)>
			//   16   40:aload_1         
			//   17   41:invokevirtual   #67  <Method com.firebase.client.snapshot.Node NamedNode.getNode()>
			//   18   44:invokestatic    #73  <Method IndexedNode IndexedNode.from(com.firebase.client.snapshot.Node)>
			//   19   47:invokespecial   #76  <Method void DataSnapshot(Firebase, IndexedNode)>
			//   20   50:areturn         
			}

			public volatile Object next()
			{
				return ((Object) (next()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #78  <Method DataSnapshot next()>
			//    2    4:areturn         
			}

			public void remove()
			{
				throw new UnsupportedOperationException("remove called on immutable collection");
			//    0    0:new             #81  <Class UnsupportedOperationException>
			//    1    3:dup             
			//    2    4:ldc1            #83  <String "remove called on immutable collection">
			//    3    6:invokespecial   #86  <Method void UnsupportedOperationException(String)>
			//    4    9:athrow          
			}

			final DataSnapshot._cls1 this$1;

			
			{
				this$1 = DataSnapshot._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field DataSnapshot$1 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #14  <Class DataSnapshot$1$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void DataSnapshot$1$1(DataSnapshot$1)>
	//    4    8:areturn         
	}

	final DataSnapshot this$0;
	final Iterator val$iter;

	DataSnapshot$1()
	{
		this$0 = final_datasnapshot;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field DataSnapshot this$0>
		val$iter = Iterator.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field Iterator val$iter>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
