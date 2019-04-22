// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.snapshot.ChildKey;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.firebase.client.core:
//			Path

class Path$1
	implements Iterator
{

	public boolean hasNext()
	{
		return offset < Path.access$100(Path.this);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int offset>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Path this$0>
	//    4    8:invokestatic    #35  <Method int Path.access$100(Path)>
	//    5   11:icmpge          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public ChildKey next()
	{
		if(hasNext())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #39  <Method boolean hasNext()>
	//*   2    4:ifeq            33
		{
			ChildKey achildkey[] = Path.access$200(Path.this);
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field Path this$0>
	//    5   11:invokestatic    #43  <Method ChildKey[] Path.access$200(Path)>
	//    6   14:astore_2        
			int i = offset;
	//    7   15:aload_0         
	//    8   16:getfield        #29  <Field int offset>
	//    9   19:istore_1        
			ChildKey childkey = achildkey[i];
	//   10   20:aload_2         
	//   11   21:iload_1         
	//   12   22:aaload          
	//   13   23:astore_2        
			offset = i + 1;
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:iconst_1        
	//   17   27:iadd            
	//   18   28:putfield        #29  <Field int offset>
			return childkey;
	//   19   31:aload_2         
	//   20   32:areturn         
		} else
		{
			throw new NoSuchElementException("No more elements.");
	//   21   33:new             #45  <Class NoSuchElementException>
	//   22   36:dup             
	//   23   37:ldc1            #47  <String "No more elements.">
	//   24   39:invokespecial   #50  <Method void NoSuchElementException(String)>
	//   25   42:athrow          
		}
	}

	public volatile Object next()
	{
		return ((Object) (next()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method ChildKey next()>
	//    2    4:areturn         
	}

	public void remove()
	{
		throw new UnsupportedOperationException("Can't remove component from immutable Path!");
	//    0    0:new             #56  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #58  <String "Can't remove component from immutable Path!">
	//    3    6:invokespecial   #59  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	int offset;
	final Path this$0;

	Path$1()
	{
		this$0 = Path.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Path this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
		offset = Path.access$000(Path.this);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #20  <Field Path this$0>
	//    8   14:invokestatic    #27  <Method int Path.access$000(Path)>
	//    9   17:putfield        #29  <Field int offset>
	//   10   20:return          
	}
}
