// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.operation;

import com.firebase.client.core.Path;
import com.firebase.client.snapshot.ChildKey;

// Referenced classes of package com.firebase.client.core.operation:
//			Operation, OperationSource

public class ListenComplete extends Operation
{

	public ListenComplete(OperationSource operationsource, Path path)
	{
		super(Operation.OperationType.ListenComplete, operationsource, path);
	//    0    0:aload_0         
	//    1    1:getstatic       #18  <Field Operation$OperationType Operation$OperationType.ListenComplete>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #21  <Method void Operation(Operation$OperationType, OperationSource, Path)>
	//    5    9:return          
	}

	public Operation operationForChild(ChildKey childkey)
	{
		if(path.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Path path>
	//*   2    4:invokevirtual   #33  <Method boolean Path.isEmpty()>
	//*   3    7:ifeq            25
			return ((Operation) (new ListenComplete(source, Path.getEmptyPath())));
	//    4   10:new             #2   <Class ListenComplete>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:getfield        #37  <Field OperationSource source>
	//    8   18:invokestatic    #41  <Method Path Path.getEmptyPath()>
	//    9   21:invokespecial   #43  <Method void ListenComplete(OperationSource, Path)>
	//   10   24:areturn         
		else
			return ((Operation) (new ListenComplete(source, path.popFront())));
	//   11   25:new             #2   <Class ListenComplete>
	//   12   28:dup             
	//   13   29:aload_0         
	//   14   30:getfield        #37  <Field OperationSource source>
	//   15   33:aload_0         
	//   16   34:getfield        #27  <Field Path path>
	//   17   37:invokevirtual   #46  <Method Path Path.popFront()>
	//   18   40:invokespecial   #43  <Method void ListenComplete(OperationSource, Path)>
	//   19   43:areturn         
	}

	public String toString()
	{
		return String.format("ListenComplete { path=%s, source=%s }", new Object[] {
			getPath(), getSource()
		});
	//    0    0:ldc1            #50  <String "ListenComplete { path=%s, source=%s }">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:invokevirtual   #55  <Method Path getPath()>
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:aload_0         
	//   11   16:invokevirtual   #59  <Method OperationSource getSource()>
	//   12   19:aastore         
	//   13   20:invokestatic    #65  <Method String String.format(String, Object[])>
	//   14   23:areturn         
	}

	static final boolean $assertionsDisabled = false;

	static 
	{
	//    0    0:return          
	}
}
