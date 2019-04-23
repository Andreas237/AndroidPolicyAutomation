// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			aqi, asm, ash, aui, 
//			aun, ave, aqh, atv

public class asi extends aqi
{

	protected asi(ash ash1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void aqi()>
		b = ash1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field ash b>
		a = (ash)ash1.a(asm.d, ((Object) (null)), ((Object) (null)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getstatic       #22  <Field int asm.d>
	//    8   14:aconst_null     
	//    9   15:aconst_null     
	//   10   16:invokevirtual   #27  <Method Object ash.a(int, Object, Object)>
	//   11   19:checkcast       #24  <Class ash>
	//   12   22:putfield        #29  <Field ash a>
		c = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #31  <Field boolean c>
	//   16   30:return          
	}

	private static void a(ash ash1, ash ash2)
	{
		aui.a().a(((Object) (ash1))).b(((Object) (ash1)), ((Object) (ash2)));
	//    0    0:invokestatic    #38  <Method aui aui.a()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #41  <Method aun aui.a(Object)>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokeinterface #46  <Method void aun.b(Object, Object)>
	//    6   14:return          
	}

	public final aqi a()
	{
		return ((aqi) ((asi)((aqi)this).clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #51  <Method Object aqi.clone()>
	//    2    4:checkcast       #2   <Class asi>
	//    3    7:areturn         
	}

	protected final aqi a(aqh aqh)
	{
		return ((aqi) (a((ash)aqh)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #24  <Class ash>
	//    3    5:invokevirtual   #55  <Method asi a(ash)>
	//    4    8:areturn         
	}

	public final asi a(ash ash1)
	{
		b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method void b()>
		a(a, ash1);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field ash a>
	//    4    8:aload_1         
	//    5    9:invokestatic    #59  <Method void a(ash, ash)>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	protected final void b()
	{
		if(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field boolean c>
	//*   2    4:ifeq            41
		{
			ash ash1 = (ash)a.a(asm.d, ((Object) (null)), ((Object) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field ash a>
	//    5   11:getstatic       #22  <Field int asm.d>
	//    6   14:aconst_null     
	//    7   15:aconst_null     
	//    8   16:invokevirtual   #27  <Method Object ash.a(int, Object, Object)>
	//    9   19:checkcast       #24  <Class ash>
	//   10   22:astore_1        
			a(ash1, a);
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #29  <Field ash a>
	//   14   28:invokestatic    #59  <Method void a(ash, ash)>
			a = ash1;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:putfield        #29  <Field ash a>
			c = false;
	//   18   36:aload_0         
	//   19   37:iconst_0        
	//   20   38:putfield        #31  <Field boolean c>
		}
	//   21   41:return          
	}

	public ash c()
	{
		if(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field boolean c>
	//*   2    4:ifeq            12
		{
			return a;
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field ash a>
	//    5   11:areturn         
		} else
		{
			ash ash1 = a;
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field ash a>
	//    8   16:astore_1        
			aui.a().a(((Object) (ash1))).c(((Object) (ash1)));
	//    9   17:invokestatic    #38  <Method aui aui.a()>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #41  <Method aun aui.a(Object)>
	//   12   24:aload_1         
	//   13   25:invokeinterface #63  <Method void aun.c(Object)>
			c = true;
	//   14   30:aload_0         
	//   15   31:iconst_1        
	//   16   32:putfield        #31  <Field boolean c>
			return a;
	//   17   35:aload_0         
	//   18   36:getfield        #29  <Field ash a>
	//   19   39:areturn         
		}
	}

	public Object clone()
	{
		asi asi1 = (asi)((ash)b).a(asm.e, ((Object) (null)), ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ash b>
	//    2    4:checkcast       #24  <Class ash>
	//    3    7:getstatic       #66  <Field int asm.e>
	//    4   10:aconst_null     
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #27  <Method Object ash.a(int, Object, Object)>
	//    7   15:checkcast       #2   <Class asi>
	//    8   18:astore_1        
		asi1.a((ash)e());
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokevirtual   #69  <Method atv e()>
	//   12   24:checkcast       #24  <Class ash>
	//   13   27:invokevirtual   #55  <Method asi a(ash)>
	//   14   30:pop             
		return ((Object) (asi1));
	//   15   31:aload_1         
	//   16   32:areturn         
	}

	public final ash d()
	{
		ash ash2 = (ash)e();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #69  <Method atv e()>
	//    2    4:checkcast       #24  <Class ash>
	//    3    7:astore          6
		boolean flag2 = Boolean.TRUE.booleanValue();
	//    4    9:getstatic       #75  <Field Boolean Boolean.TRUE>
	//    5   12:invokevirtual   #79  <Method boolean Boolean.booleanValue()>
	//    6   15:istore          4
		byte byte0 = ((Byte)ash2.a(asm.a, ((Object) (null)), ((Object) (null)))).byteValue();
	//    7   17:aload           6
	//    8   19:getstatic       #81  <Field int asm.a>
	//    9   22:aconst_null     
	//   10   23:aconst_null     
	//   11   24:invokevirtual   #27  <Method Object ash.a(int, Object, Object)>
	//   12   27:checkcast       #83  <Class Byte>
	//   13   30:invokevirtual   #87  <Method byte Byte.byteValue()>
	//   14   33:istore_1        
		boolean flag = true;
	//   15   34:iconst_1        
	//   16   35:istore_2        
		if(byte0 != 1)
	//*  17   36:iload_1         
	//*  18   37:iconst_1        
	//*  19   38:icmpne          44
	//*  20   41:goto            106
			if(byte0 == 0)
	//*  21   44:iload_1         
	//*  22   45:ifne            53
			{
				flag = false;
	//   23   48:iconst_0        
	//   24   49:istore_2        
			} else
	//*  25   50:goto            106
			{
				boolean flag1 = aui.a().a(((Object) (ash2))).d(((Object) (ash2)));
	//   26   53:invokestatic    #38  <Method aui aui.a()>
	//   27   56:aload           6
	//   28   58:invokevirtual   #41  <Method aun aui.a(Object)>
	//   29   61:aload           6
	//   30   63:invokeinterface #90  <Method boolean aun.d(Object)>
	//   31   68:istore_3        
				flag = flag1;
	//   32   69:iload_3         
	//   33   70:istore_2        
				if(flag2)
	//*  34   71:iload           4
	//*  35   73:ifeq            106
				{
					int i = asm.b;
	//   36   76:getstatic       #92  <Field int asm.b>
	//   37   79:istore_1        
					ash ash1;
					if(flag1)
	//*  38   80:iload_3         
	//*  39   81:ifeq            91
						ash1 = ash2;
	//   40   84:aload           6
	//   41   86:astore          5
					else
	//*  42   88:goto            94
						ash1 = null;
	//   43   91:aconst_null     
	//   44   92:astore          5
					ash2.a(i, ((Object) (ash1)), ((Object) (null)));
	//   45   94:aload           6
	//   46   96:iload_1         
	//   47   97:aload           5
	//   48   99:aconst_null     
	//   49  100:invokevirtual   #27  <Method Object ash.a(int, Object, Object)>
	//   50  103:pop             
					flag = flag1;
	//   51  104:iload_3         
	//   52  105:istore_2        
				}
			}
		if(flag)
	//*  53  106:iload_2         
	//*  54  107:ifeq            113
			return ash2;
	//   55  110:aload           6
	//   56  112:areturn         
		else
			throw new ave(((atv) (ash2)));
	//   57  113:new             #94  <Class ave>
	//   58  116:dup             
	//   59  117:aload           6
	//   60  119:invokespecial   #97  <Method void ave(atv)>
	//   61  122:athrow          
	}

	public atv e()
	{
		return ((atv) (c()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #99  <Method ash c()>
	//    2    4:areturn         
	}

	public atv f()
	{
		return ((atv) (d()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method ash d()>
	//    2    4:areturn         
	}

	public final boolean k()
	{
		return ash.a(a, false);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ash a>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #106 <Method boolean ash.a(ash, boolean)>
	//    4    8:ireturn         
	}

	public final atv q()
	{
		return ((atv) (b));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ash b>
	//    2    4:areturn         
	}

	protected ash a;
	private final ash b;
	private boolean c;
}
