// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.operation;

import com.firebase.client.core.Path;
import com.firebase.client.snapshot.ChildKey;
import com.firebase.client.snapshot.Node;

// Referenced classes of package com.firebase.client.core.operation:
//			Operation, OperationSource

public class Overwrite extends Operation
{

	public Overwrite(OperationSource operationsource, Path path, Node node)
	{
		super(Operation.OperationType.Overwrite, operationsource, path);
	//    0    0:aload_0         
	//    1    1:getstatic       #14  <Field Operation$OperationType Operation$OperationType.Overwrite>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #17  <Method void Operation(Operation$OperationType, OperationSource, Path)>
		snapshot = node;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #19  <Field Node snapshot>
	//    8   14:return          
	}

	public Node getSnapshot()
	{
		return snapshot;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Node snapshot>
	//    2    4:areturn         
	}

	public Operation operationForChild(ChildKey childkey)
	{
		if(path.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Path path>
	//*   2    4:invokevirtual   #34  <Method boolean Path.isEmpty()>
	//*   3    7:ifeq            35
			return ((Operation) (new Overwrite(source, Path.getEmptyPath(), snapshot.getImmediateChild(childkey))));
	//    4   10:new             #2   <Class Overwrite>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:getfield        #38  <Field OperationSource source>
	//    8   18:invokestatic    #42  <Method Path Path.getEmptyPath()>
	//    9   21:aload_0         
	//   10   22:getfield        #19  <Field Node snapshot>
	//   11   25:aload_1         
	//   12   26:invokeinterface #48  <Method Node Node.getImmediateChild(ChildKey)>
	//   13   31:invokespecial   #50  <Method void Overwrite(OperationSource, Path, Node)>
	//   14   34:areturn         
		else
			return ((Operation) (new Overwrite(source, path.popFront(), snapshot)));
	//   15   35:new             #2   <Class Overwrite>
	//   16   38:dup             
	//   17   39:aload_0         
	//   18   40:getfield        #38  <Field OperationSource source>
	//   19   43:aload_0         
	//   20   44:getfield        #28  <Field Path path>
	//   21   47:invokevirtual   #53  <Method Path Path.popFront()>
	//   22   50:aload_0         
	//   23   51:getfield        #19  <Field Node snapshot>
	//   24   54:invokespecial   #50  <Method void Overwrite(OperationSource, Path, Node)>
	//   25   57:areturn         
	}

	public String toString()
	{
		return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", new Object[] {
			getPath(), getSource(), snapshot
		});
	//    0    0:ldc1            #57  <String "Overwrite { path=%s, source=%s, snapshot=%s }">
	//    1    2:iconst_3        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:invokevirtual   #62  <Method Path getPath()>
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:aload_0         
	//   11   16:invokevirtual   #66  <Method OperationSource getSource()>
	//   12   19:aastore         
	//   13   20:dup             
	//   14   21:iconst_2        
	//   15   22:aload_0         
	//   16   23:getfield        #19  <Field Node snapshot>
	//   17   26:aastore         
	//   18   27:invokestatic    #72  <Method String String.format(String, Object[])>
	//   19   30:areturn         
	}

	private final Node snapshot;
}
