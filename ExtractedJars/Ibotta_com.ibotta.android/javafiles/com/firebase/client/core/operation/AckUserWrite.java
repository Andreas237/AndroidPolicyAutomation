// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.operation;

import com.firebase.client.collection.ImmutableSortedMap;
import com.firebase.client.core.Path;
import com.firebase.client.core.utilities.ImmutableTree;
import com.firebase.client.snapshot.ChildKey;
import com.firebase.client.utilities.Utilities;

// Referenced classes of package com.firebase.client.core.operation:
//			Operation, OperationSource

public class AckUserWrite extends Operation
{

	public AckUserWrite(Path path, ImmutableTree immutabletree, boolean flag)
	{
		super(Operation.OperationType.AckUserWrite, OperationSource.USER, path);
	//    0    0:aload_0         
	//    1    1:getstatic       #17  <Field Operation$OperationType Operation$OperationType.AckUserWrite>
	//    2    4:getstatic       #23  <Field OperationSource OperationSource.USER>
	//    3    7:aload_1         
	//    4    8:invokespecial   #26  <Method void Operation(Operation$OperationType, OperationSource, Path)>
		affectedTree = immutabletree;
	//    5   11:aload_0         
	//    6   12:aload_2         
	//    7   13:putfield        #28  <Field ImmutableTree affectedTree>
		revert = flag;
	//    8   16:aload_0         
	//    9   17:iload_3         
	//   10   18:putfield        #30  <Field boolean revert>
	//   11   21:return          
	}

	public ImmutableTree getAffectedTree()
	{
		return affectedTree;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ImmutableTree affectedTree>
	//    2    4:areturn         
	}

	public boolean isRevert()
	{
		return revert;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field boolean revert>
	//    2    4:ireturn         
	}

	public Operation operationForChild(ChildKey childkey)
	{
		if(!path.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field Path path>
	//*   2    4:invokevirtual   #49  <Method boolean Path.isEmpty()>
	//*   3    7:ifne            49
		{
			Utilities.hardAssert(path.getFront().equals(((Object) (childkey))), "operationForChild called for unrelated child.");
	//    4   10:aload_0         
	//    5   11:getfield        #44  <Field Path path>
	//    6   14:invokevirtual   #53  <Method ChildKey Path.getFront()>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #59  <Method boolean ChildKey.equals(Object)>
	//    9   21:ldc1            #61  <String "operationForChild called for unrelated child.">
	//   10   23:invokestatic    #67  <Method void Utilities.hardAssert(boolean, String)>
			return ((Operation) (new AckUserWrite(path.popFront(), affectedTree, revert)));
	//   11   26:new             #2   <Class AckUserWrite>
	//   12   29:dup             
	//   13   30:aload_0         
	//   14   31:getfield        #44  <Field Path path>
	//   15   34:invokevirtual   #71  <Method Path Path.popFront()>
	//   16   37:aload_0         
	//   17   38:getfield        #28  <Field ImmutableTree affectedTree>
	//   18   41:aload_0         
	//   19   42:getfield        #30  <Field boolean revert>
	//   20   45:invokespecial   #73  <Method void AckUserWrite(Path, ImmutableTree, boolean)>
	//   21   48:areturn         
		}
		if(affectedTree.getValue() != null)
	//*  22   49:aload_0         
	//*  23   50:getfield        #28  <Field ImmutableTree affectedTree>
	//*  24   53:invokevirtual   #79  <Method Object ImmutableTree.getValue()>
	//*  25   56:ifnull          76
		{
			Utilities.hardAssert(affectedTree.getChildren().isEmpty(), "affectedTree should not have overlapping affected paths.");
	//   26   59:aload_0         
	//   27   60:getfield        #28  <Field ImmutableTree affectedTree>
	//   28   63:invokevirtual   #83  <Method ImmutableSortedMap ImmutableTree.getChildren()>
	//   29   66:invokevirtual   #86  <Method boolean ImmutableSortedMap.isEmpty()>
	//   30   69:ldc1            #88  <String "affectedTree should not have overlapping affected paths.">
	//   31   71:invokestatic    #67  <Method void Utilities.hardAssert(boolean, String)>
			return ((Operation) (this));
	//   32   74:aload_0         
	//   33   75:areturn         
		} else
		{
			childkey = ((ChildKey) (affectedTree.subtree(new Path(new ChildKey[] {
				childkey
			}))));
	//   34   76:aload_0         
	//   35   77:getfield        #28  <Field ImmutableTree affectedTree>
	//   36   80:new             #46  <Class Path>
	//   37   83:dup             
	//   38   84:iconst_1        
	//   39   85:anewarray       ChildKey[]
	//   40   88:dup             
	//   41   89:iconst_0        
	//   42   90:aload_1         
	//   43   91:aastore         
	//   44   92:invokespecial   #91  <Method void Path(ChildKey[])>
	//   45   95:invokevirtual   #95  <Method ImmutableTree ImmutableTree.subtree(Path)>
	//   46   98:astore_1        
			return ((Operation) (new AckUserWrite(Path.getEmptyPath(), ((ImmutableTree) (childkey)), revert)));
	//   47   99:new             #2   <Class AckUserWrite>
	//   48  102:dup             
	//   49  103:invokestatic    #98  <Method Path Path.getEmptyPath()>
	//   50  106:aload_1         
	//   51  107:aload_0         
	//   52  108:getfield        #30  <Field boolean revert>
	//   53  111:invokespecial   #73  <Method void AckUserWrite(Path, ImmutableTree, boolean)>
	//   54  114:areturn         
		}
	}

	public String toString()
	{
		return String.format("AckUserWrite { path=%s, revert=%s, affectedTree=%s }", new Object[] {
			getPath(), Boolean.valueOf(revert), affectedTree
		});
	//    0    0:ldc1            #102 <String "AckUserWrite { path=%s, revert=%s, affectedTree=%s }">
	//    1    2:iconst_3        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:invokevirtual   #107 <Method Path getPath()>
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:aload_0         
	//   11   16:getfield        #30  <Field boolean revert>
	//   12   19:invokestatic    #113 <Method Boolean Boolean.valueOf(boolean)>
	//   13   22:aastore         
	//   14   23:dup             
	//   15   24:iconst_2        
	//   16   25:aload_0         
	//   17   26:getfield        #28  <Field ImmutableTree affectedTree>
	//   18   29:aastore         
	//   19   30:invokestatic    #119 <Method String String.format(String, Object[])>
	//   20   33:areturn         
	}

	private final ImmutableTree affectedTree;
	private final boolean revert;
}
