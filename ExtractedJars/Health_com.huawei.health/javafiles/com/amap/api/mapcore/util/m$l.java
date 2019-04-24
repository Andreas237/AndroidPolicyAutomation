// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.util.Log;
import java.io.Writer;

// Referenced classes of package com.amap.api.mapcore.util:
//			m

static class m$l extends Writer
{

	private void a()
	{
		if(a.length() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field StringBuilder a>
	//*   2    4:invokevirtual   #23  <Method int StringBuilder.length()>
	//*   3    7:ifle            39
		{
			Log.v("GLSurfaceView", a.toString());
	//    4   10:ldc1            #25  <String "GLSurfaceView">
	//    5   12:aload_0         
	//    6   13:getfield        #18  <Field StringBuilder a>
	//    7   16:invokevirtual   #29  <Method String StringBuilder.toString()>
	//    8   19:invokestatic    #35  <Method int Log.v(String, String)>
	//    9   22:pop             
			a.delete(0, a.length());
	//   10   23:aload_0         
	//   11   24:getfield        #18  <Field StringBuilder a>
	//   12   27:iconst_0        
	//   13   28:aload_0         
	//   14   29:getfield        #18  <Field StringBuilder a>
	//   15   32:invokevirtual   #23  <Method int StringBuilder.length()>
	//   16   35:invokevirtual   #39  <Method StringBuilder StringBuilder.delete(int, int)>
	//   17   38:pop             
		}
	//   18   39:return          
	}

	public void close()
	{
		a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void a()>
	//    2    4:return          
	}

	public void flush()
	{
		a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void a()>
	//    2    4:return          
	}

	public void write(char ac[], int i, int j)
	{
		for(int k = 0; k < j; k++)
	//*   0    0:iconst_0        
	//*   1    1:istore          5
	//*   2    3:iload           5
	//*   3    5:iload_3         
	//*   4    6:icmpge          50
		{
			char c = ac[i + k];
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:iload           5
	//    8   13:iadd            
	//    9   14:caload          
	//   10   15:istore          4
			if(c == '\n')
	//*  11   17:iload           4
	//*  12   19:bipush          10
	//*  13   21:icmpne          31
				a();
	//   14   24:aload_0         
	//   15   25:invokespecial   #42  <Method void a()>
			else
	//*  16   28:goto            41
				a.append(c);
	//   17   31:aload_0         
	//   18   32:getfield        #18  <Field StringBuilder a>
	//   19   35:iload           4
	//   20   37:invokevirtual   #49  <Method StringBuilder StringBuilder.append(char)>
	//   21   40:pop             
		}

	//   22   41:iload           5
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore          5
	//*  26   47:goto            3
	//   27   50:return          
	}

	private StringBuilder a;

	m$l()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Writer()>
		a = new StringBuilder();
	//    2    4:aload_0         
	//    3    5:new             #15  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void StringBuilder()>
	//    6   12:putfield        #18  <Field StringBuilder a>
	//    7   15:return          
	}
}
