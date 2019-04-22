// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.graphics.Path;
import android.support.v4.graphics.PathParser;

// Referenced classes of package android.support.graphics.drawable:
//			VectorDrawableCompat

private static abstract class VectorDrawableCompat$VPath extends t
{

	public android.support.v4.graphics.PathParser.PathDataNode[] getPathData()
	{
		return mNodes;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
	//    2    4:areturn         
	}

	public String getPathName()
	{
		return mPathName;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String mPathName>
	//    2    4:areturn         
	}

	public boolean isClipPath()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setPathData(android.support.v4.graphics.PathParser.PathDataNode apathdatanode[])
	{
		if(!PathParser.canMorph(mNodes, apathdatanode))
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #44  <Method boolean PathParser.canMorph(android.support.v4.graphics.PathParser$PathDataNode[], android.support.v4.graphics.PathParser$PathDataNode[])>
	//*   4    8:ifne            20
		{
			mNodes = PathParser.deepCopyNodes(apathdatanode);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokestatic    #32  <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.deepCopyNodes(android.support.v4.graphics.PathParser$PathDataNode[])>
	//    8   16:putfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
			return;
	//    9   19:return          
		} else
		{
			PathParser.updateNodes(mNodes, apathdatanode);
	//   10   20:aload_0         
	//   11   21:getfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
	//   12   24:aload_1         
	//   13   25:invokestatic    #48  <Method void PathParser.updateNodes(android.support.v4.graphics.PathParser$PathDataNode[], android.support.v4.graphics.PathParser$PathDataNode[])>
			return;
	//   14   28:return          
		}
	}

	public void toPath(Path path)
	{
		path.reset();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #55  <Method void Path.reset()>
		android.support.v4.graphics.PathParser.PathDataNode apathdatanode[] = mNodes;
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
	//    4    8:astore_2        
		if(apathdatanode != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          18
			android.support.v4.graphics.PathParser.PathDataNode.nodesToPath(apathdatanode, path);
	//    7   13:aload_2         
	//    8   14:aload_1         
	//    9   15:invokestatic    #61  <Method void android.support.v4.graphics.PathParser$PathDataNode.nodesToPath(android.support.v4.graphics.PathParser$PathDataNode[], Path)>
	//   10   18:return          
	}

	int mChangingConfigurations;
	protected android.support.v4.graphics.PathParser.PathDataNode mNodes[];
	String mPathName;

	public VectorDrawableCompat$VPath()
	{
		super(((VectorDrawableCompat._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #18  <Method void VectorDrawableCompat$VObject(VectorDrawableCompat$1)>
		mNodes = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
	//    6   10:return          
	}

	public VectorDrawableCompat$VPath(VectorDrawableCompat$VPath vectordrawablecompat$vpath)
	{
		super(((VectorDrawableCompat._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #18  <Method void VectorDrawableCompat$VObject(VectorDrawableCompat$1)>
		mNodes = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
		mPathName = vectordrawablecompat$vpath.mPathName;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getfield        #24  <Field String mPathName>
	//    9   15:putfield        #24  <Field String mPathName>
		mChangingConfigurations = vectordrawablecompat$vpath.mChangingConfigurations;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:getfield        #26  <Field int mChangingConfigurations>
	//   13   23:putfield        #26  <Field int mChangingConfigurations>
		mNodes = PathParser.deepCopyNodes(vectordrawablecompat$vpath.mNodes);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
	//   17   31:invokestatic    #32  <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.deepCopyNodes(android.support.v4.graphics.PathParser$PathDataNode[])>
	//   18   34:putfield        #20  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
	//   19   37:return          
	}
}
