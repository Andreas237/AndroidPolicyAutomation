// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			awo, awg, awh, awr

public abstract class awp
{

	public awp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
		aa = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #12  <Field int aa>
	//    5    9:return          
	}

	public static final awp a(awp awp1, byte abyte0[])
	{
		return a(awp1, abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokestatic    #18  <Method awp a(awp, byte[], int, int)>
	//    6    8:areturn         
	}

	private static final awp a(awp awp1, byte abyte0[], int i, int j)
	{
		try
		{
			abyte0 = ((byte []) (awg.a(abyte0, 0, j)));
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:iload_3         
	//    3    3:invokestatic    #27  <Method awg awg.a(byte[], int, int)>
	//    4    6:astore_1        
			awp1.a(((awg) (abyte0)));
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokevirtual   #30  <Method awp a(awg)>
	//    8   12:pop             
			((awg) (abyte0)).a(0);
	//    9   13:aload_1         
	//   10   14:iconst_0        
	//   11   15:invokevirtual   #33  <Method void awg.a(int)>
		}
	//*  12   18:aload_0         
	//*  13   19:areturn         
	//*  14   20:astore_0        
	//*  15   21:new             #35  <Class RuntimeException>
	//*  16   24:dup             
	//*  17   25:ldc1            #37  <String "Reading from a byte array threw an IOException (should never happen).">
	//*  18   27:aload_0         
	//*  19   28:invokespecial   #40  <Method void RuntimeException(String, Throwable)>
	//*  20   31:athrow          
		// Misplaced declaration of an exception variable
		catch(awp awp1)
	//*  21   32:astore_0        
		{
			throw awp1;
	//   22   33:aload_0         
	//   23   34:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(awp awp1)
		{
			throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", ((Throwable) (awp1)));
		}
		return awp1;
	}

	public static final byte[] a(awp awp1)
	{
		byte abyte0[] = new byte[awp1.d()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method int d()>
	//    2    4:newarray        byte[]
	//    3    6:astore_2        
		int i = abyte0.length;
	//    4    7:aload_2         
	//    5    8:arraylength     
	//    6    9:istore_1        
		try
		{
			awh awh1 = awh.a(abyte0, 0, i);
	//    7   10:aload_2         
	//    8   11:iconst_0        
	//    9   12:iload_1         
	//   10   13:invokestatic    #50  <Method awh awh.a(byte[], int, int)>
	//   11   16:astore_3        
			awp1.a(awh1);
	//   12   17:aload_0         
	//   13   18:aload_3         
	//   14   19:invokevirtual   #53  <Method void a(awh)>
			awh1.a();
	//   15   22:aload_3         
	//   16   23:invokevirtual   #55  <Method void awh.a()>
		}
	//*  17   26:aload_2         
	//*  18   27:areturn         
		// Misplaced declaration of an exception variable
		catch(awp awp1)
	//*  19   28:astore_0        
		{
			throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", ((Throwable) (awp1)));
	//   20   29:new             #35  <Class RuntimeException>
	//   21   32:dup             
	//   22   33:ldc1            #57  <String "Serializing to a byte array threw an IOException (should never happen).">
	//   23   35:aload_0         
	//   24   36:invokespecial   #40  <Method void RuntimeException(String, Throwable)>
	//   25   39:athrow          
		}
		return abyte0;
	}

	protected int a()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public abstract awp a(awg awg1);

	public void a(awh awh1)
	{
	//    0    0:return          
	}

	public awp c()
	{
		return (awp)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class awp>
	//    3    7:areturn         
	}

	public Object clone()
	{
		return ((Object) (c()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method awp c()>
	//    2    4:areturn         
	}

	public final int d()
	{
		int i = a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #67  <Method int a()>
	//    2    4:istore_1        
		aa = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #12  <Field int aa>
		return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
	}

	public String toString()
	{
		return awr.a(this);
	//    0    0:aload_0         
	//    1    1:invokestatic    #74  <Method String awr.a(awp)>
	//    2    4:areturn         
	}

	protected volatile int aa;
}
