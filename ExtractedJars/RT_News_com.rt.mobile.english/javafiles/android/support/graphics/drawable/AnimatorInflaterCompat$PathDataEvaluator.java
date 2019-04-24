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
	//    3    3:checkcast       #25  <Class android.support.v4.graphics.PathParser$PathDataNode[]>
	//    4    6:aload_3         
	//    5    7:checkcast       #25  <Class android.support.v4.graphics.PathParser$PathDataNode[]>
	//    6   10:invokevirtual   #28  <Method android.support.v4.graphics.PathParser$PathDataNode[] evaluate(float, android.support.v4.graphics.PathParser$PathDataNode[], android.support.v4.graphics.PathParser$PathDataNode[])>
	//    7   13:areturn         
	}

	public android.support.v4.graphics.PathParser.PathDataNode[] evaluate(float f, android.support.v4.graphics.PathParser.PathDataNode apathdatanode[], android.support.v4.graphics.PathParser.PathDataNode apathdatanode1[])
	{
		if(!PathParser.canMorph(apathdatanode, apathdatanode1))
	//*   0    0:aload_2         
	//*   1    1:aload_3         
	//*   2    2:invokestatic    #34  <Method boolean PathParser.canMorph(android.support.v4.graphics.PathParser$PathDataNode[], android.support.v4.graphics.PathParser$PathDataNode[])>
	//*   3    5:ifne            18
			throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
	//    4    8:new             #36  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #38  <String "Can't interpolate between two incompatible pathData">
	//    7   14:invokespecial   #41  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		if(mNodeArray == null || !PathParser.canMorph(mNodeArray, apathdatanode))
	//*   9   18:aload_0         
	//*  10   19:getfield        #22  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodeArray>
	//*  11   22:ifnull          36
	//*  12   25:aload_0         
	//*  13   26:getfield        #22  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodeArray>
	//*  14   29:aload_2         
	//*  15   30:invokestatic    #34  <Method boolean PathParser.canMorph(android.support.v4.graphics.PathParser$PathDataNode[], android.support.v4.graphics.PathParser$PathDataNode[])>
	//*  16   33:ifne            44
			mNodeArray = PathParser.deepCopyNodes(apathdatanode);
	//   17   36:aload_0         
	//   18   37:aload_2         
	//   19   38:invokestatic    #45  <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.deepCopyNodes(android.support.v4.graphics.PathParser$PathDataNode[])>
	//   20   41:putfield        #22  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodeArray>
		for(int i = 0; i < apathdatanode.length; i++)
	//*  21   44:iconst_0        
	//*  22   45:istore          4
	//*  23   47:iload           4
	//*  24   49:aload_2         
	//*  25   50:arraylength     
	//*  26   51:icmpge          82
			mNodeArray[i].interpolatePathDataNode(apathdatanode[i], apathdatanode1[i], f);
	//   27   54:aload_0         
	//   28   55:getfield        #22  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodeArray>
	//   29   58:iload           4
	//   30   60:aaload          
	//   31   61:aload_2         
	//   32   62:iload           4
	//   33   64:aaload          
	//   34   65:aload_3         
	//   35   66:iload           4
	//   36   68:aaload          
	//   37   69:fload_1         
	//   38   70:invokevirtual   #51  <Method void android.support.v4.graphics.PathParser$PathDataNode.interpolatePathDataNode(android.support.v4.graphics.PathParser$PathDataNode, android.support.v4.graphics.PathParser$PathDataNode, float)>

	//   39   73:iload           4
	//   40   75:iconst_1        
	//   41   76:iadd            
	//   42   77:istore          4
	//*  43   79:goto            47
		return mNodeArray;
	//   44   82:aload_0         
	//   45   83:getfield        #22  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodeArray>
	//   46   86:areturn         
	}

	private android.support.v4.graphics.PathParser.PathDataNode mNodeArray[];

	private AnimatorInflaterCompat$PathDataEvaluator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	AnimatorInflaterCompat$PathDataEvaluator(AnimatorInflaterCompat._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void AnimatorInflaterCompat$PathDataEvaluator()>
	//    2    4:return          
	}

	AnimatorInflaterCompat$PathDataEvaluator(android.support.v4.graphics.PathParser.PathDataNode apathdatanode[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mNodeArray = apathdatanode;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodeArray>
	//    5    9:return          
	}
}
