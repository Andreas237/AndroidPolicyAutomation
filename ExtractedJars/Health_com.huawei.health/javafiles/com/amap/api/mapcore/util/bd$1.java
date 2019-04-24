// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.io.File;

// Referenced classes of package com.amap.api.mapcore.util:
//			bd, ch, cb

class bd$1
	implements bv$a
{

	public void a(String s, String s1)
	{
	//    0    0:return          
	}

	public void a(String s, String s1, float f)
	{
		int i = c.getcompleteCode();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field bd c>
	//    2    4:invokevirtual   #34  <Method int bd.getcompleteCode()>
	//    3    7:istore          4
		int j = (int)((double)f * 0.39000000000000001D + 60D);
	//    4    9:fload_3         
	//    5   10:f2d             
	//    6   11:ldc2w           #35  <Double 0.39000000000000001D>
	//    7   14:dmul            
	//    8   15:ldc2w           #37  <Double 60D>
	//    9   18:dadd            
	//   10   19:d2i             
	//   11   20:istore          5
		if(j - i > 0 && System.currentTimeMillis() - bd.a(c) > 1000L)
	//*  12   22:iload           5
	//*  13   24:iload           4
	//*  14   26:isub            
	//*  15   27:ifle            68
	//*  16   30:invokestatic    #44  <Method long System.currentTimeMillis()>
	//*  17   33:aload_0         
	//*  18   34:getfield        #20  <Field bd c>
	//*  19   37:invokestatic    #47  <Method long bd.a(bd)>
	//*  20   40:lsub            
	//*  21   41:ldc2w           #48  <Long 1000L>
	//*  22   44:lcmp            
	//*  23   45:ifle            68
		{
			c.setCompleteCode(j);
	//   24   48:aload_0         
	//   25   49:getfield        #20  <Field bd c>
	//   26   52:iload           5
	//   27   54:invokevirtual   #53  <Method void bd.setCompleteCode(int)>
			bd.a(c, System.currentTimeMillis());
	//   28   57:aload_0         
	//   29   58:getfield        #20  <Field bd c>
	//   30   61:invokestatic    #44  <Method long System.currentTimeMillis()>
	//   31   64:invokestatic    #56  <Method long bd.a(bd, long)>
	//   32   67:pop2            
		}
	//   33   68:return          
	}

	public void a(String s, String s1, int i)
	{
		c.l.a(c.k.b());
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field bd c>
	//    2    4:getfield        #61  <Field ch bd.l>
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field bd c>
	//    5   11:getfield        #64  <Field ch bd.k>
	//    6   14:invokevirtual   #68  <Method int ch.b()>
	//    7   17:invokevirtual   #70  <Method void ch.a(int)>
	//    8   20:return          
	}

	public void b(String s, String s1)
	{
		boolean flag = (new File(a)).delete();
	//    0    0:new             #74  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field String a>
	//    4    8:invokespecial   #77  <Method void File(String)>
	//    5   11:invokevirtual   #81  <Method boolean File.delete()>
	//    6   14:istore_3        
		if(!flag)
	//*   7   15:iload_3         
	//*   8   16:ifne            20
			return;
	//    9   19:return          
		try
		{
			cb.b(b);
	//   10   20:aload_0         
	//   11   21:getfield        #24  <Field File b>
	//   12   24:invokestatic    #86  <Method boolean cb.b(File)>
	//   13   27:pop             
			c.setCompleteCode(100);
	//   14   28:aload_0         
	//   15   29:getfield        #20  <Field bd c>
	//   16   32:bipush          100
	//   17   34:invokevirtual   #53  <Method void bd.setCompleteCode(int)>
			c.l.g();
	//   18   37:aload_0         
	//   19   38:getfield        #20  <Field bd c>
	//   20   41:getfield        #61  <Field ch bd.l>
	//   21   44:invokevirtual   #89  <Method void ch.g()>
			return;
	//   22   47:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  23   48:astore_1        
		{
			c.l.a(c.k.b());
	//   24   49:aload_0         
	//   25   50:getfield        #20  <Field bd c>
	//   26   53:getfield        #61  <Field ch bd.l>
	//   27   56:aload_0         
	//   28   57:getfield        #20  <Field bd c>
	//   29   60:getfield        #64  <Field ch bd.k>
	//   30   63:invokevirtual   #68  <Method int ch.b()>
	//   31   66:invokevirtual   #70  <Method void ch.a(int)>
		}
		return;
	//   32   69:return          
	}

	final String a;
	final File b;
	final bd c;

	bd$1(bd bd1, String s, File file)
	{
		c = bd1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field bd c>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field String a>
		b = file;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field File b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
