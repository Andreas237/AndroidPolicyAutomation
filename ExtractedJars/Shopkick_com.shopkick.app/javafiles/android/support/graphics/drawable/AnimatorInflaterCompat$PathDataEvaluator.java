// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.animation.TypeEvaluator;
import android.support.v4.graphics.PathParser;

// Referenced classes of package android.support.graphics.drawable:
//			AnimatorInflaterCompat

private static class AnimatorInflaterCompat$PathDataEvaluator
	implements TypeEvaluator
{

	public volatile Object evaluate(float f, Object obj, Object obj1)
	{
		return ((Object) (evaluate(f, (android.support.v4.graphics.PathParser.PathDataNode[])obj, (android.support.v4.graphics.PathParser.PathDataNode[])obj1)));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #23  <Class android.support.v4.graphics.PathParser$PathDataNode[]>
	//    4    6:aload_3         
	//    5    7:checkcast       #23  <Class android.support.v4.graphics.PathParser$PathDataNode[]>
	//    6   10:invokevirtual   #26  <Method android.support.v4.graphics.PathParser$PathDataNode[] evaluate(float, android.support.v4.graphics.PathParser$PathDataNode[], android.support.v4.graphics.PathParser$PathDataNode[])>
	//    7   13:areturn         
	}

	public android.support.v4.graphics.PathParser.PathDataNode[] evaluate(float f, android.support.v4.graphics.PathParser.PathDataNode apathdatanode[], android.support.v4.graphics.PathParser.PathDataNode apathdatanode1[])
	{
		if(PathParser.canMorph(apathdatanode, apathdatanode1))
	//*   0    0:aload_2         
	//*   1    1:aload_3         
	//*   2    2:invokestatic    #32  <Method boolean PathParser.canMorph(android.support.v4.graphics.PathParser$PathDataNode[], android.support.v4.graphics.PathParser$PathDataNode[])>
	//*   3    5:ifeq            79
		{
			android.support.v4.graphics.PathParser.PathDataNode apathdatanode2[] = mNodeArray;
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodeArray>
	//    6   12:astore          5
			if(apathdatanode2 == null || !PathParser.canMorph(apathdatanode2, apathdatanode))
	//*   7   14:aload           5
	//*   8   16:ifnull          28
	//*   9   19:aload           5
	//*  10   21:aload_2         
	//*  11   22:invokestatic    #32  <Method boolean PathParser.canMorph(android.support.v4.graphics.PathParser$PathDataNode[], android.support.v4.graphics.PathParser$PathDataNode[])>
	//*  12   25:ifne            36
				mNodeArray = PathParser.deepCopyNodes(apathdatanode);
	//   13   28:aload_0         
	//   14   29:aload_2         
	//   15   30:invokestatic    #36  <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.deepCopyNodes(android.support.v4.graphics.PathParser$PathDataNode[])>
	//   16   33:putfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodeArray>
			for(int i = 0; i < apathdatanode.length; i++)
	//*  17   36:iconst_0        
	//*  18   37:istore          4
	//*  19   39:iload           4
	//*  20   41:aload_2         
	//*  21   42:arraylength     
	//*  22   43:icmpge          74
				mNodeArray[i].interpolatePathDataNode(apathdatanode[i], apathdatanode1[i], f);
	//   23   46:aload_0         
	//   24   47:getfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodeArray>
	//   25   50:iload           4
	//   26   52:aaload          
	//   27   53:aload_2         
	//   28   54:iload           4
	//   29   56:aaload          
	//   30   57:aload_3         
	//   31   58:iload           4
	//   32   60:aaload          
	//   33   61:fload_1         
	//   34   62:invokevirtual   #42  <Method void android.support.v4.graphics.PathParser$PathDataNode.interpolatePathDataNode(android.support.v4.graphics.PathParser$PathDataNode, android.support.v4.graphics.PathParser$PathDataNode, float)>

	//   35   65:iload           4
	//   36   67:iconst_1        
	//   37   68:iadd            
	//   38   69:istore          4
	//*  39   71:goto            39
			return mNodeArray;
	//   40   74:aload_0         
	//   41   75:getfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodeArray>
	//   42   78:areturn         
		} else
		{
			throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
	//   43   79:new             #44  <Class IllegalArgumentException>
	//   44   82:dup             
	//   45   83:ldc1            #46  <String "Can't interpolate between two incompatible pathData">
	//   46   85:invokespecial   #49  <Method void IllegalArgumentException(String)>
	//   47   88:athrow          
		}
	}

	private android.support.v4.graphics.PathParser.PathDataNode mNodeArray[];

	AnimatorInflaterCompat$PathDataEvaluator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	AnimatorInflaterCompat$PathDataEvaluator(android.support.v4.graphics.PathParser.PathDataNode apathdatanode[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mNodeArray = apathdatanode;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodeArray>
	//    5    9:return          
	}
}
