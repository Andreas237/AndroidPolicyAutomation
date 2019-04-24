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
	//*   7    9:icmpge          129
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   12:new             #46  <Class StringBuilder>
	//    9   15:dup             
	//   10   16:invokespecial   #47  <Method void StringBuilder()>
	//   11   19:astore          5
			stringbuilder.append(s);
	//   12   21:aload           5
	//   13   23:aload           4
	//   14   25:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
			stringbuilder.append(apathdatanode[i].mType);
	//   16   29:aload           5
	//   17   31:aload_1         
	//   18   32:iload_2         
	//   19   33:aaload          
	//   20   34:getfield        #57  <Field char android.support.v4.graphics.PathParser$PathDataNode.mType>
	//   21   37:invokevirtual   #60  <Method StringBuilder StringBuilder.append(char)>
	//   22   40:pop             
			stringbuilder.append(":");
	//   23   41:aload           5
	//   24   43:ldc1            #62  <String ":">
	//   25   45:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
			s = stringbuilder.toString();
	//   27   49:aload           5
	//   28   51:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   29   54:astore          4
			float af[] = apathdatanode[i].mParams;
	//   30   56:aload_1         
	//   31   57:iload_2         
	//   32   58:aaload          
	//   33   59:getfield        #69  <Field float[] android.support.v4.graphics.PathParser$PathDataNode.mParams>
	//   34   62:astore          5
			for(int j = 0; j < af.length; j++)
	//*  35   64:iconst_0        
	//*  36   65:istore_3        
	//*  37   66:iload_3         
	//*  38   67:aload           5
	//*  39   69:arraylength     
	//*  40   70:icmpge          122
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   41   73:new             #46  <Class StringBuilder>
	//   42   76:dup             
	//   43   77:invokespecial   #47  <Method void StringBuilder()>
	//   44   80:astore          6
				stringbuilder1.append(s);
	//   45   82:aload           6
	//   46   84:aload           4
	//   47   86:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   48   89:pop             
				stringbuilder1.append(af[j]);
	//   49   90:aload           6
	//   50   92:aload           5
	//   51   94:iload_3         
	//   52   95:faload          
	//   53   96:invokevirtual   #72  <Method StringBuilder StringBuilder.append(float)>
	//   54   99:pop             
				stringbuilder1.append(",");
	//   55  100:aload           6
	//   56  102:ldc1            #74  <String ",">
	//   57  104:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   58  107:pop             
				s = stringbuilder1.toString();
	//   59  108:aload           6
	//   60  110:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   61  113:astore          4
			}

	//   62  115:iload_3         
	//   63  116:iconst_1        
	//   64  117:iadd            
	//   65  118:istore_3        
		}

	//   66  119:goto            66
	//   67  122:iload_2         
	//   68  123:iconst_1        
	//   69  124:iadd            
	//   70  125:istore_2        
	//*  71  126:goto            6
		return s;
	//   72  129:aload           4
	//   73  131:areturn         
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
	//*   6    7:icmpge          47
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   10:new             #46  <Class StringBuilder>
	//    8   13:dup             
	//    9   14:invokespecial   #47  <Method void StringBuilder()>
	//   10   17:astore          4
			stringbuilder.append(s);
	//   11   19:aload           4
	//   12   21:aload_3         
	//   13   22:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
			stringbuilder.append("    ");
	//   15   26:aload           4
	//   16   28:ldc1            #80  <String "    ">
	//   17   30:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
			s = stringbuilder.toString();
	//   19   34:aload           4
	//   20   36:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   21   39:astore_3        
		}

	//   22   40:iload_2         
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:istore_2        
	//*  26   44:goto            5
		StringBuilder stringbuilder1 = new StringBuilder();
	//   27   47:new             #46  <Class StringBuilder>
	//   28   50:dup             
	//   29   51:invokespecial   #47  <Method void StringBuilder()>
	//   30   54:astore          4
		stringbuilder1.append(s);
	//   31   56:aload           4
	//   32   58:aload_3         
	//   33   59:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder1.append("current path is :");
	//   35   63:aload           4
	//   36   65:ldc1            #82  <String "current path is :">
	//   37   67:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   38   70:pop             
		stringbuilder1.append(mPathName);
	//   39   71:aload           4
	//   40   73:aload_0         
	//   41   74:getfield        #23  <Field String mPathName>
	//   42   77:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   43   80:pop             
		stringbuilder1.append(" pathData is ");
	//   44   81:aload           4
	//   45   83:ldc1            #84  <String " pathData is ">
	//   46   85:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   47   88:pop             
		stringbuilder1.append(nodesToString(mNodes));
	//   48   89:aload           4
	//   49   91:aload_0         
	//   50   92:aload_0         
	//   51   93:getfield        #19  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
	//   52   96:invokevirtual   #86  <Method String nodesToString(android.support.v4.graphics.PathParser$PathDataNode[])>
	//   53   99:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   54  102:pop             
		Log.v("VectorDrawableCompat", stringbuilder1.toString());
	//   55  103:ldc1            #88  <String "VectorDrawableCompat">
	//   56  105:aload           4
	//   57  107:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   58  110:invokestatic    #94  <Method int Log.v(String, String)>
	//   59  113:pop             
	//   60  114:return          
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
