// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bji, bjx, bjf, bnf, 
//			bdg, bfc

public final class bjy
	implements bji
{

	public bjy(bjx bjx1, bjx bjx2, bjf bjf1, int i)
	{
		d = bjx1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field bjx d>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		a = bjx2;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field bjx a>
		b = bjf1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field bjf b>
		c = i;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #26  <Field int c>
	//   14   25:return          
	}

	public final int a(bdg bdg, bfc bfc, boolean flag)
	{
		if(d.f())
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field bjx d>
	//*   2    4:invokevirtual   #34  <Method boolean bjx.f()>
	//*   3    7:ifeq            13
			return -3;
	//    4   10:bipush          -3
	//    5   12:ireturn         
		else
			return b.a(bdg, bfc, flag, d.b, d.a);
	//    6   13:aload_0         
	//    7   14:getfield        #24  <Field bjf b>
	//    8   17:aload_1         
	//    9   18:aload_2         
	//   10   19:iload_3         
	//   11   20:aload_0         
	//   12   21:getfield        #17  <Field bjx d>
	//   13   24:getfield        #37  <Field boolean bjx.b>
	//   14   27:aload_0         
	//   15   28:getfield        #17  <Field bjx d>
	//   16   31:getfield        #40  <Field long bjx.a>
	//   17   34:invokevirtual   #45  <Method int bjf.a(bdg, bfc, boolean, boolean, long)>
	//   18   37:ireturn         
	}

	public final boolean a()
	{
		return d.b || !d.f() && b.c();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field bjx d>
	//    2    4:getfield        #37  <Field boolean bjx.b>
	//    3    7:ifne            35
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field bjx d>
	//    6   14:invokevirtual   #34  <Method boolean bjx.f()>
	//    7   17:ifne            33
	//    8   20:aload_0         
	//    9   21:getfield        #24  <Field bjf b>
	//   10   24:invokevirtual   #47  <Method boolean bjf.c()>
	//   11   27:ifeq            33
	//   12   30:goto            35
	//   13   33:iconst_0        
	//   14   34:ireturn         
	//   15   35:iconst_1        
	//   16   36:ireturn         
	}

	public final void a_(long l)
	{
		if(d.b && l > b.f())
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field bjx d>
	//*   2    4:getfield        #37  <Field boolean bjx.b>
	//*   3    7:ifeq            30
	//*   4   10:lload_1         
	//*   5   11:aload_0         
	//*   6   12:getfield        #24  <Field bjf b>
	//*   7   15:invokevirtual   #52  <Method long bjf.f()>
	//*   8   18:lcmp            
	//*   9   19:ifle            30
		{
			b.g();
	//   10   22:aload_0         
	//   11   23:getfield        #24  <Field bjf b>
	//   12   26:invokevirtual   #55  <Method void bjf.g()>
			return;
	//   13   29:return          
		} else
		{
			b.a(l, true);
	//   14   30:aload_0         
	//   15   31:getfield        #24  <Field bjf b>
	//   16   34:lload_1         
	//   17   35:iconst_1        
	//   18   36:invokevirtual   #58  <Method boolean bjf.a(long, boolean)>
	//   19   39:pop             
			return;
	//   20   40:return          
		}
	}

	public final void b()
	{
	//    0    0:return          
	}

	public final void c()
	{
		bnf.b(bjx.a(d)[c]);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field bjx d>
	//    2    4:invokestatic    #61  <Method boolean[] bjx.a(bjx)>
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field int c>
	//    5   11:baload          
	//    6   12:invokestatic    #66  <Method void bnf.b(boolean)>
		bjx.a(d)[c] = false;
	//    7   15:aload_0         
	//    8   16:getfield        #17  <Field bjx d>
	//    9   19:invokestatic    #61  <Method boolean[] bjx.a(bjx)>
	//   10   22:aload_0         
	//   11   23:getfield        #26  <Field int c>
	//   12   26:iconst_0        
	//   13   27:bastore         
	//   14   28:return          
	}

	public final bjx a;
	private final bjf b;
	private final int c;
	private final bjx d;
}
