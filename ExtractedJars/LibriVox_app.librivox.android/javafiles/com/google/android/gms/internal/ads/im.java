// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			abu, in, abs, io, 
//			ip, iq

public final class im extends abu
{

	public im(iq iq)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void abu()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void Object()>
	//    6   12:putfield        #20  <Field Object a>
		b = iq;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #22  <Field iq b>
	//   10   20:return          
	}

	static iq a(im im1)
	{
		return im1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field iq b>
	//    2    4:areturn         
	}

	public final void a()
	{
label0:
		{
			synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field Object a>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(!c)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field boolean c>
	//    7   11:ifeq            17
			}
	//    8   14:aload_1         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		c = true;
	//   11   17:aload_0         
	//   12   18:iconst_1        
	//   13   19:putfield        #26  <Field boolean c>
		((abu)this).a(((abt) (new in(this))), ((abr) (new abs())));
	//   14   22:aload_0         
	//   15   23:new             #28  <Class in>
	//   16   26:dup             
	//   17   27:aload_0         
	//   18   28:invokespecial   #31  <Method void in(im)>
	//   19   31:new             #33  <Class abs>
	//   20   34:dup             
	//   21   35:invokespecial   #34  <Method void abs()>
	//   22   38:invokevirtual   #37  <Method void abu.a(abt, abr)>
		((abu)this).a(((abt) (new io(this))), ((abr) (new ip(this))));
	//   23   41:aload_0         
	//   24   42:new             #39  <Class io>
	//   25   45:dup             
	//   26   46:aload_0         
	//   27   47:invokespecial   #40  <Method void io(im)>
	//   28   50:new             #42  <Class ip>
	//   29   53:dup             
	//   30   54:aload_0         
	//   31   55:invokespecial   #43  <Method void ip(im)>
	//   32   58:invokevirtual   #37  <Method void abu.a(abt, abr)>
		obj;
	//   33   61:aload_1         
		JVM INSTR monitorexit ;
	//   34   62:monitorexit     
		return;
	//   35   63:return          
		exception;
	//   36   64:astore_2        
		obj;
	//   37   65:aload_1         
		JVM INSTR monitorexit ;
	//   38   66:monitorexit     
		throw exception;
	//   39   67:aload_2         
	//   40   68:athrow          
	}

	private final Object a = new Object();
	private final iq b;
	private boolean c;
}
