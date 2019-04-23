// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			iy, iu, iv, ip, 
//			ja, iw, iq

public abstract class is extends iy
{

	public is()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void iy()>
	//    2    4:return          
	}

	public void a(iq iq)
	{
		if(L == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field iu L>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		for(int i = 0; i < L.a(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:getfield        #15  <Field iu L>
	//*   9   15:invokevirtual   #20  <Method int iu.a()>
	//*  10   18:icmpge          40
			L.b(i).a(iq);
	//   11   21:aload_0         
	//   12   22:getfield        #15  <Field iu L>
	//   13   25:iload_2         
	//   14   26:invokevirtual   #24  <Method iv iu.b(int)>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #28  <Method void iv.a(iq)>

	//   17   33:iload_2         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:istore_2        
	//*  21   37:goto            10
	//   22   40:return          
	}

	protected final boolean a(ip ip1, int i)
	{
		int j = ip1.i();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #34  <Method int ip.i()>
	//    2    4:istore_3        
		if(!ip1.b(i))
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #37  <Method boolean ip.b(int)>
	//*   6   10:ifne            15
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
		int k = i >>> 3;
	//    9   15:iload_2         
	//   10   16:iconst_3        
	//   11   17:iushr           
	//   12   18:istore          4
		ja ja1 = new ja(i, ip1.a(j, ip1.i() - j));
	//   13   20:new             #39  <Class ja>
	//   14   23:dup             
	//   15   24:iload_2         
	//   16   25:aload_1         
	//   17   26:iload_3         
	//   18   27:aload_1         
	//   19   28:invokevirtual   #34  <Method int ip.i()>
	//   20   31:iload_3         
	//   21   32:isub            
	//   22   33:invokevirtual   #42  <Method byte[] ip.a(int, int)>
	//   23   36:invokespecial   #45  <Method void ja(int, byte[])>
	//   24   39:astore          6
		ip1 = null;
	//   25   41:aconst_null     
	//   26   42:astore_1        
		Object obj = ((Object) (L));
	//   27   43:aload_0         
	//   28   44:getfield        #15  <Field iu L>
	//   29   47:astore          5
		if(obj == null)
	//*  30   49:aload           5
	//*  31   51:ifnonnull       68
			L = new iu();
	//   32   54:aload_0         
	//   33   55:new             #17  <Class iu>
	//   34   58:dup             
	//   35   59:invokespecial   #46  <Method void iu()>
	//   36   62:putfield        #15  <Field iu L>
		else
	//*  37   65:goto            76
			ip1 = ((ip) (((iu) (obj)).a(k)));
	//   38   68:aload           5
	//   39   70:iload           4
	//   40   72:invokevirtual   #48  <Method iv iu.a(int)>
	//   41   75:astore_1        
		obj = ((Object) (ip1));
	//   42   76:aload_1         
	//   43   77:astore          5
		if(ip1 == null)
	//*  44   79:aload_1         
	//*  45   80:ifnonnull       103
		{
			obj = ((Object) (new iv()));
	//   46   83:new             #26  <Class iv>
	//   47   86:dup             
	//   48   87:invokespecial   #49  <Method void iv()>
	//   49   90:astore          5
			L.a(k, ((iv) (obj)));
	//   50   92:aload_0         
	//   51   93:getfield        #15  <Field iu L>
	//   52   96:iload           4
	//   53   98:aload           5
	//   54  100:invokevirtual   #52  <Method void iu.a(int, iv)>
		}
		((iv) (obj)).a(ja1);
	//   55  103:aload           5
	//   56  105:aload           6
	//   57  107:invokevirtual   #55  <Method void iv.a(ja)>
		return true;
	//   58  110:iconst_1        
	//   59  111:ireturn         
	}

	protected int b()
	{
		iu iu1 = L;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field iu L>
	//    2    4:astore          4
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		int k;
		if(iu1 != null)
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
				if(j >= L.a())
					break;
	//   11   17:iload_2         
	//   12   18:aload_0         
	//   13   19:getfield        #15  <Field iu L>
	//   14   22:invokevirtual   #20  <Method int iu.a()>
	//   15   25:icmpge          51
				i += L.b(j).a();
	//   16   28:iload_1         
	//   17   29:aload_0         
	//   18   30:getfield        #15  <Field iu L>
	//   19   33:iload_2         
	//   20   34:invokevirtual   #24  <Method iv iu.b(int)>
	//   21   37:invokevirtual   #56  <Method int iv.a()>
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

	public final iy c()
	{
		return ((iy) ((is)((iy)this).clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method Object iy.clone()>
	//    2    4:checkcast       #2   <Class is>
	//    3    7:areturn         
	}

	public Object clone()
	{
		is is1 = (is)super.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method iy iy.c()>
	//    2    4:checkcast       #2   <Class is>
	//    3    7:astore_1        
		iw.a(this, is1);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #69  <Method void iw.a(is, is)>
		return ((Object) (is1));
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	protected iu L;
}
