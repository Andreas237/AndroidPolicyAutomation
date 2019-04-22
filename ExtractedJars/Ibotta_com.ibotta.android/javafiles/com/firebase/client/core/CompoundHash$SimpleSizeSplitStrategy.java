// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.snapshot.ChildKey;
import com.firebase.client.snapshot.Node;
import com.firebase.client.utilities.NodeSizeEstimator;

// Referenced classes of package com.firebase.client.core:
//			CompoundHash, Path

private static class CompoundHash$SimpleSizeSplitStrategy
	implements CompoundHash.SplitStrategy
{

	public boolean shouldSplit(CompoundHash.CompoundHashBuilder compoundhashbuilder)
	{
		return (long)compoundhashbuilder.currentHashLength() > splitThreshold && (compoundhashbuilder.currentPath().isEmpty() || !compoundhashbuilder.currentPath().getBack().equals(((Object) (ChildKey.getPriorityKey()))));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #47  <Method int CompoundHash$CompoundHashBuilder.currentHashLength()>
	//    2    4:i2l             
	//    3    5:aload_0         
	//    4    6:getfield        #38  <Field long splitThreshold>
	//    5    9:lcmp            
	//    6   10:ifle            41
	//    7   13:aload_1         
	//    8   14:invokevirtual   #51  <Method Path CompoundHash$CompoundHashBuilder.currentPath()>
	//    9   17:invokevirtual   #57  <Method boolean Path.isEmpty()>
	//   10   20:ifne            39
	//   11   23:aload_1         
	//   12   24:invokevirtual   #51  <Method Path CompoundHash$CompoundHashBuilder.currentPath()>
	//   13   27:invokevirtual   #61  <Method ChildKey Path.getBack()>
	//   14   30:invokestatic    #66  <Method ChildKey ChildKey.getPriorityKey()>
	//   15   33:invokevirtual   #70  <Method boolean ChildKey.equals(Object)>
	//   16   36:ifne            41
	//   17   39:iconst_1        
	//   18   40:ireturn         
	//   19   41:iconst_0        
	//   20   42:ireturn         
	}

	private final long splitThreshold;

	public CompoundHash$SimpleSizeSplitStrategy(Node node)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		splitThreshold = Math.max(512L, (long)Math.sqrt(NodeSizeEstimator.estimateSerializedNodeSize(node) * 100L));
	//    2    4:aload_0         
	//    3    5:ldc2w           #17  <Long 512L>
	//    4    8:aload_1         
	//    5    9:invokestatic    #24  <Method long NodeSizeEstimator.estimateSerializedNodeSize(Node)>
	//    6   12:ldc2w           #25  <Long 100L>
	//    7   15:lmul            
	//    8   16:l2d             
	//    9   17:invokestatic    #32  <Method double Math.sqrt(double)>
	//   10   20:d2l             
	//   11   21:invokestatic    #36  <Method long Math.max(long, long)>
	//   12   24:putfield        #38  <Field long splitThreshold>
	//   13   27:return          
	}
}
