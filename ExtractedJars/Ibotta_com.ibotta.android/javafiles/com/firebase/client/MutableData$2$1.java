// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;

import com.firebase.client.core.Path;
import com.firebase.client.snapshot.NamedNode;
import java.util.Iterator;

// Referenced classes of package com.firebase.client:
//			MutableData

class MutableData$2$1
	implements Iterator
{

	public boolean hasNext()
	{
		return val$iter.hasNext();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MutableData$2 this$1>
	//    2    4:getfield        #28  <Field Iterator MutableData$2.val$iter>
	//    3    7:invokeinterface #30  <Method boolean Iterator.hasNext()>
	//    4   12:ireturn         
	}

	public MutableData next()
	{
		NamedNode namednode = (NamedNode)val$iter.next();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MutableData$2 this$1>
	//    2    4:getfield        #28  <Field Iterator MutableData$2.val$iter>
	//    3    7:invokeinterface #35  <Method Object Iterator.next()>
	//    4   12:checkcast       #37  <Class NamedNode>
	//    5   15:astore_1        
		return new MutableData(MutableData.access$000(this$0), MutableData.access$100(this$0).child(namednode.getName()), ((MutableData._cls1) (null)));
	//    6   16:new             #39  <Class MutableData>
	//    7   19:dup             
	//    8   20:aload_0         
	//    9   21:getfield        #18  <Field MutableData$2 this$1>
	//   10   24:getfield        #43  <Field MutableData MutableData$2.this$0>
	//   11   27:invokestatic    #47  <Method com.firebase.client.core.SnapshotHolder MutableData.access$000(MutableData)>
	//   12   30:aload_0         
	//   13   31:getfield        #18  <Field MutableData$2 this$1>
	//   14   34:getfield        #43  <Field MutableData MutableData$2.this$0>
	//   15   37:invokestatic    #51  <Method Path MutableData.access$100(MutableData)>
	//   16   40:aload_1         
	//   17   41:invokevirtual   #55  <Method com.firebase.client.snapshot.ChildKey NamedNode.getName()>
	//   18   44:invokevirtual   #61  <Method Path Path.child(com.firebase.client.snapshot.ChildKey)>
	//   19   47:aconst_null     
	//   20   48:invokespecial   #64  <Method void MutableData(com.firebase.client.core.SnapshotHolder, Path, MutableData$1)>
	//   21   51:areturn         
	}

	public volatile Object next()
	{
		return ((Object) (next()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method MutableData next()>
	//    2    4:areturn         
	}

	public void remove()
	{
		throw new UnsupportedOperationException("remove called on immutable collection");
	//    0    0:new             #69  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #71  <String "remove called on immutable collection">
	//    3    6:invokespecial   #74  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	final MutableData._cls2 this$1;

	MutableData$2$1()
	{
		this$1 = MutableData._cls2.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field MutableData$2 this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/firebase/client/MutableData$2

/* anonymous class */
	class MutableData._cls2
		implements Iterable
	{

		public Iterator iterator()
		{
			return ((Iterator) (new MutableData._cls2._cls1()));
		//    0    0:new             #14  <Class MutableData$2$1>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #33  <Method void MutableData$2$1(MutableData$2)>
		//    4    8:areturn         
		}

		final MutableData this$0;
		final Iterator val$iter;

			
			{
				this$0 = final_mutabledata;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field MutableData this$0>
				iter = Iterator.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Iterator val$iter>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
	}

}
