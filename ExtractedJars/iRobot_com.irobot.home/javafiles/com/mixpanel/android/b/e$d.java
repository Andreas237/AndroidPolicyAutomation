// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.b;

import com.mixpanel.android.java_websocket.c.f;
import com.mixpanel.android.java_websocket.c.g;
import java.io.OutputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.mixpanel.android.b:
//			e

private class e$d extends OutputStream
{

	public void close()
	{
		try
		{
			e.c(a).a(com.mixpanel.android.java_websocket.d.d$a.TEXT, e.d(), true);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field e a>
	//    2    4:invokestatic    #29  <Method e$b e.c(e)>
	//    3    7:getstatic       #35  <Field com.mixpanel.android.java_websocket.d.d$a com.mixpanel.android.java_websocket.d.d$a.TEXT>
	//    4   10:invokestatic    #38  <Method ByteBuffer e.d()>
	//    5   13:iconst_1        
	//    6   14:invokevirtual   #43  <Method void e$b.a(com.mixpanel.android.java_websocket.d.d$a, ByteBuffer, boolean)>
			return;
	//    7   17:return          
		}
	//*   8   18:astore_1        
	//*   9   19:new             #45  <Class e$c>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:getfield        #13  <Field e a>
	//*  13   27:aload_1         
	//*  14   28:invokespecial   #48  <Method void e$c(e, Throwable)>
	//*  15   31:athrow          
		catch(g g1)
	//*  16   32:astore_1        
		{
			throw new e$c(a, ((Throwable) (g1)));
	//   17   33:new             #45  <Class e$c>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:getfield        #13  <Field e a>
	//   21   41:aload_1         
	//   22   42:invokespecial   #48  <Method void e$c(e, Throwable)>
	//   23   45:athrow          
		}
		catch(f f1)
		{
			throw new e$c(a, ((Throwable) (f1)));
		}
	}

	public void write(int i)
	{
		write(new byte[] {
			(byte)i
		}, 0, 1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:newarray        byte[]
	//    3    4:dup             
	//    4    5:iconst_0        
	//    5    6:iload_1         
	//    6    7:int2byte        
	//    7    8:bastore         
	//    8    9:iconst_0        
	//    9   10:iconst_1        
	//   10   11:invokevirtual   #53  <Method void write(byte[], int, int)>
	//   11   14:return          
	}

	public void write(byte abyte0[])
	{
		write(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokevirtual   #53  <Method void write(byte[], int, int)>
	//    6    8:return          
	}

	public void write(byte abyte0[], int i, int j)
	{
		abyte0 = ((byte []) (ByteBuffer.wrap(abyte0, i, j)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:invokestatic    #60  <Method ByteBuffer ByteBuffer.wrap(byte[], int, int)>
	//    4    6:astore_1        
		try
		{
			e.c(a).a(com.mixpanel.android.java_websocket.d.d$a.TEXT, ((ByteBuffer) (abyte0)), false);
	//    5    7:aload_0         
	//    6    8:getfield        #13  <Field e a>
	//    7   11:invokestatic    #29  <Method e$b e.c(e)>
	//    8   14:getstatic       #35  <Field com.mixpanel.android.java_websocket.d.d$a com.mixpanel.android.java_websocket.d.d$a.TEXT>
	//    9   17:aload_1         
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #43  <Method void e$b.a(com.mixpanel.android.java_websocket.d.d$a, ByteBuffer, boolean)>
			return;
	//   12   22:return          
		}
	//*  13   23:astore_1        
	//*  14   24:new             #45  <Class e$c>
	//*  15   27:dup             
	//*  16   28:aload_0         
	//*  17   29:getfield        #13  <Field e a>
	//*  18   32:aload_1         
	//*  19   33:invokespecial   #48  <Method void e$c(e, Throwable)>
	//*  20   36:athrow          
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  21   37:astore_1        
		{
			throw new e$c(a, ((Throwable) (abyte0)));
	//   22   38:new             #45  <Class e$c>
	//   23   41:dup             
	//   24   42:aload_0         
	//   25   43:getfield        #13  <Field e a>
	//   26   46:aload_1         
	//   27   47:invokespecial   #48  <Method void e$c(e, Throwable)>
	//   28   50:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			throw new e$c(a, ((Throwable) (abyte0)));
		}
	}

	final e a;

	private e$d(e e1)
	{
		a = e1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field e a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void OutputStream()>
	//    5    9:return          
	}

	e$d(e e1, e$1 e$1)
	{
		this(e1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void e$d(e)>
	//    3    5:return          
	}
}
