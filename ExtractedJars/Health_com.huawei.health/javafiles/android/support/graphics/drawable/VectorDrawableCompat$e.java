// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.graphics.Path;
import android.util.Log;

// Referenced classes of package android.support.graphics.drawable:
//			VectorDrawableCompat, PathParser

static class VectorDrawableCompat$e
{

	public String a( a1[])
	{
		String s = " ";
	//    0    0:ldc1            #35  <String " ">
	//    1    2:astore          4
		for(int i = 0; i < a1.length; i++)
	//*   2    4:iconst_0        
	//*   3    5:istore_2        
	//*   4    6:iload_2         
	//*   5    7:aload_1         
	//*   6    8:arraylength     
	//*   7    9:icmpge          103
		{
			s = (new StringBuilder()).append(s).append(a1[i].type).append(":").toString();
	//    8   12:new             #37  <Class StringBuilder>
	//    9   15:dup             
	//   10   16:invokespecial   #38  <Method void StringBuilder()>
	//   11   19:aload           4
	//   12   21:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   13   24:aload_1         
	//   14   25:iload_2         
	//   15   26:aaload          
	//   16   27:getfield        #48  <Field char PathParser$PathDataNode.type>
	//   17   30:invokevirtual   #51  <Method StringBuilder StringBuilder.append(char)>
	//   18   33:ldc1            #53  <String ":">
	//   19   35:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   21   41:astore          4
			float af[] = a1[i].params;
	//   22   43:aload_1         
	//   23   44:iload_2         
	//   24   45:aaload          
	//   25   46:getfield        #61  <Field float[] PathParser$PathDataNode.params>
	//   26   49:astore          5
			for(int j = 0; j < af.length; j++)
	//*  27   51:iconst_0        
	//*  28   52:istore_3        
	//*  29   53:iload_3         
	//*  30   54:aload           5
	//*  31   56:arraylength     
	//*  32   57:icmpge          96
				s = (new StringBuilder()).append(s).append(af[j]).append(",").toString();
	//   33   60:new             #37  <Class StringBuilder>
	//   34   63:dup             
	//   35   64:invokespecial   #38  <Method void StringBuilder()>
	//   36   67:aload           4
	//   37   69:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   38   72:aload           5
	//   39   74:iload_3         
	//   40   75:faload          
	//   41   76:invokevirtual   #64  <Method StringBuilder StringBuilder.append(float)>
	//   42   79:ldc1            #66  <String ",">
	//   43   81:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   44   84:invokevirtual   #57  <Method String StringBuilder.toString()>
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

	public void a(Path path)
	{
		path.reset();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #72  <Method void Path.reset()>
		if(l != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #19  <Field PathParser$PathDataNode[] l>
	//*   4    8:ifnull          19
			.nodesToPath(l, path);
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field PathParser$PathDataNode[] l>
	//    7   15:aload_1         
	//    8   16:invokestatic    #76  <Method void PathParser$PathDataNode.nodesToPath(PathParser$PathDataNode[], Path)>
	//    9   19:return          
	}

	public boolean d()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void e(int i)
	{
		String s = "";
	//    0    0:ldc1            #81  <String "">
	//    1    2:astore_3        
		for(int j = 0; j < i; j++)
	//*   2    3:iconst_0        
	//*   3    4:istore_2        
	//*   4    5:iload_2         
	//*   5    6:iload_1         
	//*   6    7:icmpge          37
			s = (new StringBuilder()).append(s).append("    ").toString();
	//    7   10:new             #37  <Class StringBuilder>
	//    8   13:dup             
	//    9   14:invokespecial   #38  <Method void StringBuilder()>
	//   10   17:aload_3         
	//   11   18:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   12   21:ldc1            #83  <String "    ">
	//   13   23:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   14   26:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   15   29:astore_3        

	//   16   30:iload_2         
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:istore_2        
	//*  20   34:goto            5
		Log.v("VectorDrawableCompat", (new StringBuilder()).append(s).append("current path is :").append(p).append(" pathData is ").append(a(l)).toString());
	//   21   37:ldc1            #85  <String "VectorDrawableCompat">
	//   22   39:new             #37  <Class StringBuilder>
	//   23   42:dup             
	//   24   43:invokespecial   #38  <Method void StringBuilder()>
	//   25   46:aload_3         
	//   26   47:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   27   50:ldc1            #87  <String "current path is :">
	//   28   52:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   29   55:aload_0         
	//   30   56:getfield        #23  <Field String p>
	//   31   59:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   32   62:ldc1            #89  <String " pathData is ">
	//   33   64:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   34   67:aload_0         
	//   35   68:aload_0         
	//   36   69:getfield        #19  <Field PathParser$PathDataNode[] l>
	//   37   72:invokevirtual   #91  <Method String a(PathParser$PathDataNode[])>
	//   38   75:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   39   78:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   40   81:invokestatic    #97  <Method int Log.v(String, String)>
	//   41   84:pop             
	//   42   85:return          
	}

	public [] getPathData()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field PathParser$PathDataNode[] l>
	//    2    4:areturn         
	}

	public String getPathName()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String p>
	//    2    4:areturn         
	}

	public void setPathData( a1[])
	{
		if(!PathParser.d(l, a1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field PathParser$PathDataNode[] l>
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #105 <Method boolean PathParser.d(PathParser$PathDataNode[], PathParser$PathDataNode[])>
	//*   4    8:ifne            20
		{
			l = PathParser.b(a1);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokestatic    #31  <Method PathParser$PathDataNode[] PathParser.b(PathParser$PathDataNode[])>
	//    8   16:putfield        #19  <Field PathParser$PathDataNode[] l>
			return;
	//    9   19:return          
		} else
		{
			PathParser.e(l, a1);
	//   10   20:aload_0         
	//   11   21:getfield        #19  <Field PathParser$PathDataNode[] l>
	//   12   24:aload_1         
	//   13   25:invokestatic    #108 <Method void PathParser.e(PathParser$PathDataNode[], PathParser$PathDataNode[])>
			return;
	//   14   28:return          
		}
	}

	protected  l[];
	int m;
	String p;

	public VectorDrawableCompat$e()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		l = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field PathParser$PathDataNode[] l>
	//    5    9:return          
	}

	public VectorDrawableCompat$e(VectorDrawableCompat$e vectordrawablecompat$e)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		l = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field PathParser$PathDataNode[] l>
		p = vectordrawablecompat$e.p;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #23  <Field String p>
	//    8   14:putfield        #23  <Field String p>
		m = vectordrawablecompat$e.m;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:getfield        #25  <Field int m>
	//   12   22:putfield        #25  <Field int m>
		l = PathParser.b(vectordrawablecompat$e.l);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:getfield        #19  <Field PathParser$PathDataNode[] l>
	//   16   30:invokestatic    #31  <Method PathParser$PathDataNode[] PathParser.b(PathParser$PathDataNode[])>
	//   17   33:putfield        #19  <Field PathParser$PathDataNode[] l>
	//   18   36:return          
	}
}
