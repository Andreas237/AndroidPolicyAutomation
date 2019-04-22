// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.operation;

import com.firebase.client.core.CompoundWrite;
import com.firebase.client.core.Path;
import com.firebase.client.snapshot.ChildKey;

// Referenced classes of package com.firebase.client.core.operation:
//			Operation, Overwrite, OperationSource

public class Merge extends Operation
{

	public Merge(OperationSource operationsource, Path path, CompoundWrite compoundwrite)
	{
		super(Operation.OperationType.Merge, operationsource, path);
	//    0    0:aload_0         
	//    1    1:getstatic       #14  <Field Operation$OperationType Operation$OperationType.Merge>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #17  <Method void Operation(Operation$OperationType, OperationSource, Path)>
		children = compoundwrite;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #19  <Field CompoundWrite children>
	//    8   14:return          
	}

	public CompoundWrite getChildren()
	{
		return children;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field CompoundWrite children>
	//    2    4:areturn         
	}

	public Operation operationForChild(ChildKey childkey)
	{
		if(path.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Path path>
	//*   2    4:invokevirtual   #34  <Method boolean Path.isEmpty()>
	//*   3    7:ifeq            84
		{
			childkey = ((ChildKey) (children.childCompoundWrite(new Path(new ChildKey[] {
				childkey
			}))));
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field CompoundWrite children>
	//    6   14:new             #30  <Class Path>
	//    7   17:dup             
	//    8   18:iconst_1        
	//    9   19:anewarray       ChildKey[]
	//   10   22:dup             
	//   11   23:iconst_0        
	//   12   24:aload_1         
	//   13   25:aastore         
	//   14   26:invokespecial   #39  <Method void Path(ChildKey[])>
	//   15   29:invokevirtual   #45  <Method CompoundWrite CompoundWrite.childCompoundWrite(Path)>
	//   16   32:astore_1        
			if(((CompoundWrite) (childkey)).isEmpty())
	//*  17   33:aload_1         
	//*  18   34:invokevirtual   #46  <Method boolean CompoundWrite.isEmpty()>
	//*  19   37:ifeq            42
				return null;
	//   20   40:aconst_null     
	//   21   41:areturn         
			if(((CompoundWrite) (childkey)).rootWrite() != null)
	//*  22   42:aload_1         
	//*  23   43:invokevirtual   #50  <Method com.firebase.client.snapshot.Node CompoundWrite.rootWrite()>
	//*  24   46:ifnull          68
				return ((Operation) (new Overwrite(source, Path.getEmptyPath(), ((CompoundWrite) (childkey)).rootWrite())));
	//   25   49:new             #52  <Class Overwrite>
	//   26   52:dup             
	//   27   53:aload_0         
	//   28   54:getfield        #56  <Field OperationSource source>
	//   29   57:invokestatic    #60  <Method Path Path.getEmptyPath()>
	//   30   60:aload_1         
	//   31   61:invokevirtual   #50  <Method com.firebase.client.snapshot.Node CompoundWrite.rootWrite()>
	//   32   64:invokespecial   #63  <Method void Overwrite(OperationSource, Path, com.firebase.client.snapshot.Node)>
	//   33   67:areturn         
			else
				return ((Operation) (new Merge(source, Path.getEmptyPath(), ((CompoundWrite) (childkey)))));
	//   34   68:new             #2   <Class Merge>
	//   35   71:dup             
	//   36   72:aload_0         
	//   37   73:getfield        #56  <Field OperationSource source>
	//   38   76:invokestatic    #60  <Method Path Path.getEmptyPath()>
	//   39   79:aload_1         
	//   40   80:invokespecial   #65  <Method void Merge(OperationSource, Path, CompoundWrite)>
	//   41   83:areturn         
		}
		if(path.getFront().equals(((Object) (childkey))))
	//*  42   84:aload_0         
	//*  43   85:getfield        #28  <Field Path path>
	//*  44   88:invokevirtual   #69  <Method ChildKey Path.getFront()>
	//*  45   91:aload_1         
	//*  46   92:invokevirtual   #73  <Method boolean ChildKey.equals(Object)>
	//*  47   95:ifeq            121
			return ((Operation) (new Merge(source, path.popFront(), children)));
	//   48   98:new             #2   <Class Merge>
	//   49  101:dup             
	//   50  102:aload_0         
	//   51  103:getfield        #56  <Field OperationSource source>
	//   52  106:aload_0         
	//   53  107:getfield        #28  <Field Path path>
	//   54  110:invokevirtual   #76  <Method Path Path.popFront()>
	//   55  113:aload_0         
	//   56  114:getfield        #19  <Field CompoundWrite children>
	//   57  117:invokespecial   #65  <Method void Merge(OperationSource, Path, CompoundWrite)>
	//   58  120:areturn         
		else
			return null;
	//   59  121:aconst_null     
	//   60  122:areturn         
	}

	public String toString()
	{
		return String.format("Merge { path=%s, source=%s, children=%s }", new Object[] {
			getPath(), getSource(), children
		});
	//    0    0:ldc1            #80  <String "Merge { path=%s, source=%s, children=%s }">
	//    1    2:iconst_3        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:invokevirtual   #85  <Method Path getPath()>
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:aload_0         
	//   11   16:invokevirtual   #89  <Method OperationSource getSource()>
	//   12   19:aastore         
	//   13   20:dup             
	//   14   21:iconst_2        
	//   15   22:aload_0         
	//   16   23:getfield        #19  <Field CompoundWrite children>
	//   17   26:aastore         
	//   18   27:invokestatic    #95  <Method String String.format(String, Object[])>
	//   19   30:areturn         
	}

	private final CompoundWrite children;
}
