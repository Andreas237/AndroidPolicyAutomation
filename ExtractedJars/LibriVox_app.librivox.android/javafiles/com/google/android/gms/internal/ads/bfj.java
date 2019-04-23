// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bfu, bnw

public final class bfj
	implements bfu
{

	public bfj(int ai[], long al[], long al1[], long al2[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		b = ai;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field int[] b>
		c = al;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field long[] c>
		d = al1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field long[] d>
		e = al2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #29  <Field long[] e>
		a = ai.length;
	//   14   25:aload_0         
	//   15   26:aload_1         
	//   16   27:arraylength     
	//   17   28:putfield        #31  <Field int a>
		int i = a;
	//   18   31:aload_0         
	//   19   32:getfield        #31  <Field int a>
	//   20   35:istore          5
		if(i > 0)
	//*  21   37:iload           5
	//*  22   39:ifle            61
		{
			f = al1[i - 1] + al2[i - 1];
	//   23   42:aload_0         
	//   24   43:aload_3         
	//   25   44:iload           5
	//   26   46:iconst_1        
	//   27   47:isub            
	//   28   48:laload          
	//   29   49:aload           4
	//   30   51:iload           5
	//   31   53:iconst_1        
	//   32   54:isub            
	//   33   55:laload          
	//   34   56:ladd            
	//   35   57:putfield        #33  <Field long f>
			return;
	//   36   60:return          
		} else
		{
			f = 0L;
	//   37   61:aload_0         
	//   38   62:lconst_0        
	//   39   63:putfield        #33  <Field long f>
			return;
	//   40   66:return          
		}
	}

	public final int a(long l)
	{
		return bnw.a(e, l, true, true);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field long[] e>
	//    2    4:lload_1         
	//    3    5:iconst_1        
	//    4    6:iconst_1        
	//    5    7:invokestatic    #40  <Method int bnw.a(long[], long, boolean, boolean)>
	//    6   10:ireturn         
	}

	public final boolean a()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final long b()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field long f>
	//    2    4:lreturn         
	}

	public final long b(long l)
	{
		return c[a(l)];
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field long[] c>
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:invokevirtual   #45  <Method int a(long)>
	//    5    9:laload          
	//    6   10:lreturn         
	}

	public final int a;
	public final int b[];
	public final long c[];
	public final long d[];
	public final long e[];
	private final long f;
}
