// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			awp, awl, awm, awg, 
//			aws, awn, awh

public abstract class awj extends awp
{

	public awj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void awp()>
	//    2    4:return          
	}

	protected int a()
	{
		awl awl1 = Z;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field awl Z>
	//    2    4:astore          4
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		int k;
		if(awl1 != null)
	//*   5    8:aload           4
	//*   6   10:ifnull          49
		{
			int i = 0;
	//    7   13:iconst_0        
	//    8   14:istore_1        
			do
			{
				k = i;
	//    9   15:iload_1         
	//   10   16:istore_3        
				if(j >= Z.a())
					break;
	//   11   17:iload_2         
	//   12   18:aload_0         
	//   13   19:getfield        #15  <Field awl Z>
	//   14   22:invokevirtual   #19  <Method int awl.a()>
	//   15   25:icmpge          51
				i += Z.b(j).a();
	//   16   28:iload_1         
	//   17   29:aload_0         
	//   18   30:getfield        #15  <Field awl Z>
	//   19   33:iload_2         
	//   20   34:invokevirtual   #23  <Method awm awl.b(int)>
	//   21   37:invokevirtual   #26  <Method int awm.a()>
	//   22   40:iadd            
	//   23   41:istore_1        
				j++;
	//   24   42:iload_2         
	//   25   43:iconst_1        
	//   26   44:iadd            
	//   27   45:istore_2        
			} while(true);
	//   28   46:goto            15
		} else
		{
			k = 0;
	//   29   49:iconst_0        
	//   30   50:istore_3        
		}
		return k;
	//   31   51:iload_3         
	//   32   52:ireturn         
	}

	public void a(awh awh)
	{
		if(Z == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field awl Z>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		for(int i = 0; i < Z.a(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:getfield        #15  <Field awl Z>
	//*   9   15:invokevirtual   #19  <Method int awl.a()>
	//*  10   18:icmpge          40
			Z.b(i).a(awh);
	//   11   21:aload_0         
	//   12   22:getfield        #15  <Field awl Z>
	//   13   25:iload_2         
	//   14   26:invokevirtual   #23  <Method awm awl.b(int)>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #29  <Method void awm.a(awh)>

	//   17   33:iload_2         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:istore_2        
	//*  21   37:goto            10
	//   22   40:return          
	}

	protected final boolean a(awg awg1, int i)
	{
		int j = awg1.j();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #35  <Method int awg.j()>
	//    2    4:istore_3        
		if(!awg1.b(i))
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #38  <Method boolean awg.b(int)>
	//*   6   10:ifne            15
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
		int k = i >>> 3;
	//    9   15:iload_2         
	//   10   16:iconst_3        
	//   11   17:iushr           
	//   12   18:istore          4
		aws aws1 = new aws(i, awg1.a(j, awg1.j() - j));
	//   13   20:new             #40  <Class aws>
	//   14   23:dup             
	//   15   24:iload_2         
	//   16   25:aload_1         
	//   17   26:iload_3         
	//   18   27:aload_1         
	//   19   28:invokevirtual   #35  <Method int awg.j()>
	//   20   31:iload_3         
	//   21   32:isub            
	//   22   33:invokevirtual   #43  <Method byte[] awg.a(int, int)>
	//   23   36:invokespecial   #46  <Method void aws(int, byte[])>
	//   24   39:astore          6
		awg1 = null;
	//   25   41:aconst_null     
	//   26   42:astore_1        
		Object obj = ((Object) (Z));
	//   27   43:aload_0         
	//   28   44:getfield        #15  <Field awl Z>
	//   29   47:astore          5
		if(obj == null)
	//*  30   49:aload           5
	//*  31   51:ifnonnull       68
			Z = new awl();
	//   32   54:aload_0         
	//   33   55:new             #17  <Class awl>
	//   34   58:dup             
	//   35   59:invokespecial   #47  <Method void awl()>
	//   36   62:putfield        #15  <Field awl Z>
		else
	//*  37   65:goto            76
			awg1 = ((awg) (((awl) (obj)).a(k)));
	//   38   68:aload           5
	//   39   70:iload           4
	//   40   72:invokevirtual   #49  <Method awm awl.a(int)>
	//   41   75:astore_1        
		obj = ((Object) (awg1));
	//   42   76:aload_1         
	//   43   77:astore          5
		if(awg1 == null)
	//*  44   79:aload_1         
	//*  45   80:ifnonnull       103
		{
			obj = ((Object) (new awm()));
	//   46   83:new             #25  <Class awm>
	//   47   86:dup             
	//   48   87:invokespecial   #50  <Method void awm()>
	//   49   90:astore          5
			Z.a(k, ((awm) (obj)));
	//   50   92:aload_0         
	//   51   93:getfield        #15  <Field awl Z>
	//   52   96:iload           4
	//   53   98:aload           5
	//   54  100:invokevirtual   #53  <Method void awl.a(int, awm)>
		}
		((awm) (obj)).a(aws1);
	//   55  103:aload           5
	//   56  105:aload           6
	//   57  107:invokevirtual   #56  <Method void awm.a(aws)>
		return true;
	//   58  110:iconst_1        
	//   59  111:ireturn         
	}

	public final awp c()
	{
		return ((awp) ((awj)((awp)this).clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method Object awp.clone()>
	//    2    4:checkcast       #2   <Class awj>
	//    3    7:areturn         
	}

	public Object clone()
	{
		awj awj1 = (awj)super.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method awp awp.c()>
	//    2    4:checkcast       #2   <Class awj>
	//    3    7:astore_1        
		awn.a(this, awj1);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #69  <Method void awn.a(awj, awj)>
		return ((Object) (awj1));
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	protected awl Z;
}
