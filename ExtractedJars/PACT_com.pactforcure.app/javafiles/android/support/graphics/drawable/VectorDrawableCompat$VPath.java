// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.graphics.Path;
import android.support.v4.graphics.PathParser;
import android.util.Log;

// Referenced classes of package android.support.graphics.drawable:
//			VectorDrawableCompat

private static class VectorDrawableCompat$VPath
{

	public void applyTheme(android.content.res.Resources.Theme theme)
	{
	//    0    0:return          
	}

	public boolean canApplyTheme()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public android.support.v4.graphics.PathParser.PathDataNode[] getPathData()
	{
		return mNodes;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
	//    2    4:areturn         
	}

	public String getPathName()
	{
		return mPathName;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String mPathName>
	//    2    4:areturn         
	}

	public boolean isClipPath()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String nodesToString(android.support.v4.graphics.PathParser.PathDataNode apathdatanode[])
	{
		String s = " ";
	//    0    0:ldc1            #44  <String " ">
	//    1    2:astore          4
		for(int i = 0; i < apathdatanode.length; i++)
	//*   2    4:iconst_0        
	//*   3    5:istore_2        
	//*   4    6:iload_2         
	//*   5    7:aload_1         
	//*   6    8:arraylength     
	//*   7    9:icmpge          103
		{
			s = (new StringBuilder()).append(s).append(apathdatanode[i].mType).append(":").toString();
	//    8   12:new             #46  <Class StringBuilder>
	//    9   15:dup             
	//   10   16:invokespecial   #47  <Method void StringBuilder()>
	//   11   19:aload           4
	//   12   21:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   13   24:aload_1         
	//   14   25:iload_2         
	//   15   26:aaload          
	//   16   27:getfield        #57  <Field char android.support.v4.graphics.PathParser$PathDataNode.mType>
	//   17   30:invokevirtual   #60  <Method StringBuilder StringBuilder.append(char)>
	//   18   33:ldc1            #62  <String ":">
	//   19   35:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   21   41:astore          4
			float af[] = apathdatanode[i].mParams;
	//   22   43:aload_1         
	//   23   44:iload_2         
	//   24   45:aaload          
	//   25   46:getfield        #69  <Field float[] android.support.v4.graphics.PathParser$PathDataNode.mParams>
	//   26   49:astore          5
			for(int j = 0; j < af.length; j++)
	//*  27   51:iconst_0        
	//*  28   52:istore_3        
	//*  29   53:iload_3         
	//*  30   54:aload           5
	//*  31   56:arraylength     
	//*  32   57:icmpge          96
				s = (new StringBuilder()).append(s).append(af[j]).append(",").toString();
	//   33   60:new             #46  <Class StringBuilder>
	//   34   63:dup             
	//   35   64:invokespecial   #47  <Method void StringBuilder()>
	//   36   67:aload           4
	//   37   69:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   38   72:aload           5
	//   39   74:iload_3         
	//   40   75:faload          
	//   41   76:invokevirtual   #72  <Method StringBuilder StringBuilder.append(float)>
	//   42   79:ldc1            #74  <String ",">
	//   43   81:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   44   84:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   45   87:astore          4

	//   46   89:iload_3         
	//   47   90:iconst_1        
	//   48   91:iadd            
	//   49   92:istore_3        
		}

	//   50   93:goto            53
	//   51   96:iload_2         
	//   52   97:iconst_1        
	//   53   98:iadd            
	//   54   99:istore_2        
	//*  55  100:goto            6
		return s;
	//   56  103:aload           4
	//   57  105:areturn         
	}

	public void printVPath(int i)
	{
		String s = "";
	//    0    0:ldc1            #78  <String "">
	//    1    2:astore_3        
		for(int j = 0; j < i; j++)
	//*   2    3:iconst_0        
	//*   3    4:istore_2        
	//*   4    5:iload_2         
	//*   5    6:iload_1         
	//*   6    7:icmpge          37
			s = (new StringBuilder()).append(s).append("    ").toString();
	//    7   10:new             #46  <Class StringBuilder>
	//    8   13:dup             
	//    9   14:invokespecial   #47  <Method void StringBuilder()>
	//   10   17:aload_3         
	//   11   18:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   12   21:ldc1            #80  <String "    ">
	//   13   23:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   14   26:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   15   29:astore_3        

	//   16   30:iload_2         
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:istore_2        
	//*  20   34:goto            5
		Log.v("VectorDrawableCompat", (new StringBuilder()).append(s).append("current path is :").append(mPathName).append(" pathData is ").append(nodesToString(mNodes)).toString());
	//   21   37:ldc1            #82  <String "VectorDrawableCompat">
	//   22   39:new             #46  <Class StringBuilder>
	//   23   42:dup             
	//   24   43:invokespecial   #47  <Method void StringBuilder()>
	//   25   46:aload_3         
	//   26   47:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   27   50:ldc1            #84  <String "current path is :">
	//   28   52:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   29   55:aload_0         
	//   30   56:getfield        #23  <Field String mPathName>
	//   31   59:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   32   62:ldc1            #86  <String " pathData is ">
	//   33   64:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   34   67:aload_0         
	//   35   68:aload_0         
	//   36   69:getfield        #19  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
	//   37   72:invokevirtual   #88  <Method String nodesToString(android.support.v4.graphics.PathParser$PathDataNode[])>
	//   38   75:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   39   78:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   40   81:invokestatic    #94  <Method int Log.v(String, String)>
	//   41   84:pop             
	//   42   85:return          
	}

	public void setPathData(android.support.v4.graphics.PathParser.PathDataNode apathdatanode[])
	{
		if(!PathParser.canMorph(mNodes, apathdatanode))
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #100 <Method boolean PathParser.canMorph(android.support.v4.graphics.PathParser$PathDataNode[], android.support.v4.graphics.PathParser$PathDataNode[])>
	//*   4    8:ifne            20
		{
			mNodes = PathParser.deepCopyNodes(apathdatanode);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokestatic    #31  <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.deepCopyNodes(android.support.v4.graphics.PathParser$PathDataNode[])>
	//    8   16:putfield        #19  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
			return;
	//    9   19:return          
		} else
		{
			PathParser.updateNodes(mNodes, apathdatanode);
	//   10   20:aload_0         
	//   11   21:getfield        #19  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
	//   12   24:aload_1         
	//   13   25:invokestatic    #104 <Method void PathParser.updateNodes(android.support.v4.graphics.PathParser$PathDataNode[], android.support.v4.graphics.PathParser$PathDataNode[])>
			return;
	//   14   28:return          
		}
	}

	public void toPath(Path path)
	{
		path.reset();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #111 <Method void Path.reset()>
		if(mNodes != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #19  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
	//*   4    8:ifnull          19
			android.support.v4.graphics.PathParser.PathDataNode.nodesToPath(mNodes, path);
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
	//    7   15:aload_1         
	//    8   16:invokestatic    #115 <Method void android.support.v4.graphics.PathParser$PathDataNode.nodesToPath(android.support.v4.graphics.PathParser$PathDataNode[], Path)>
	//    9   19:return          
	}

	int mChangingConfigurations;
	protected android.support.v4.graphics.PathParser.PathDataNode mNodes[];
	String mPathName;

	public VectorDrawableCompat$VPath()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mNodes = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
	//    5    9:return          
	}

	public VectorDrawableCompat$VPath(VectorDrawableCompat$VPath vectordrawablecompat$vpath)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mNodes = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
		mPathName = vectordrawablecompat$vpath.mPathName;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #23  <Field String mPathName>
	//    8   14:putfield        #23  <Field String mPathName>
		mChangingConfigurations = vectordrawablecompat$vpath.mChangingConfigurations;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:getfield        #25  <Field int mChangingConfigurations>
	//   12   22:putfield        #25  <Field int mChangingConfigurations>
		mNodes = PathParser.deepCopyNodes(vectordrawablecompat$vpath.mNodes);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:getfield        #19  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
	//   16   30:invokestatic    #31  <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.deepCopyNodes(android.support.v4.graphics.PathParser$PathDataNode[])>
	//   17   33:putfield        #19  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
	//   18   36:return          
	}
}
