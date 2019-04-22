// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.firebase.client:
//			MutableData

class MutableData$1
	implements Iterable
{

	public Iterator iterator()
	{
		return new Iterator() {

			public boolean hasNext()
			{
				return false;
			//    0    0:iconst_0        
			//    1    1:ireturn         
			}

			public MutableData next()
			{
				throw new NoSuchElementException();
			//    0    0:new             #28  <Class NoSuchElementException>
			//    1    3:dup             
			//    2    4:invokespecial   #29  <Method void NoSuchElementException()>
			//    3    7:athrow          
			}

			public volatile Object next()
			{
				return ((Object) (next()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #32  <Method MutableData next()>
			//    2    4:areturn         
			}

			public void remove()
			{
				throw new UnsupportedOperationException("remove called on immutable collection");
			//    0    0:new             #35  <Class UnsupportedOperationException>
			//    1    3:dup             
			//    2    4:ldc1            #37  <String "remove called on immutable collection">
			//    3    6:invokespecial   #40  <Method void UnsupportedOperationException(String)>
			//    4    9:athrow          
			}

			final MutableData._cls1 this$1;

			
			{
				this$1 = MutableData._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field MutableData$1 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #14  <Class MutableData$1$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #29  <Method void MutableData$1$1(MutableData$1)>
	//    4    8:areturn         
	}

	final MutableData this$0;

	MutableData$1()
	{
		this$0 = MutableData.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field MutableData this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
	//    5    9:return          
	}
}
