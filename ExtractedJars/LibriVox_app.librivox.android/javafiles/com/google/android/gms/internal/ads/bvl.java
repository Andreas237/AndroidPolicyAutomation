// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			awj, awh, buv, arh, 
//			awg, btw, buc, bvj, 
//			awp

public final class bvl extends awj
{

	public bvl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void awj()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #18  <Field bvj a>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #20  <Field buv b>
		c = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #22  <Field buc c>
		d = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #24  <Field btw d>
		Z = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #28  <Field awl Z>
		aa = -1;
	//   17   29:aload_0         
	//   18   30:iconst_m1       
	//   19   31:putfield        #32  <Field int aa>
	//   20   34:return          
	}

	protected final int a()
	{
		int j = super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method int awj.a()>
	//    2    4:istore_2        
		Object obj = ((Object) (a));
	//    3    5:aload_0         
	//    4    6:getfield        #18  <Field bvj a>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(obj != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          24
			i = j + awh.b(1, ((awp) (obj)));
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:invokestatic    #41  <Method int awh.b(int, awp)>
	//   14   22:iadd            
	//   15   23:istore_1        
		obj = ((Object) (b));
	//   16   24:aload_0         
	//   17   25:getfield        #20  <Field buv b>
	//   18   28:astore_3        
		j = i;
	//   19   29:iload_1         
	//   20   30:istore_2        
		if(obj != null)
	//*  21   31:aload_3         
	//*  22   32:ifnull          52
		{
			j = i;
	//   23   35:iload_1         
	//   24   36:istore_2        
			if(obj != null)
	//*  25   37:aload_3         
	//*  26   38:ifnull          52
				j = i + awh.b(2, ((buv) (obj)).a());
	//   27   41:iload_1         
	//   28   42:iconst_2        
	//   29   43:aload_3         
	//   30   44:invokevirtual   #44  <Method int buv.a()>
	//   31   47:invokestatic    #47  <Method int awh.b(int, int)>
	//   32   50:iadd            
	//   33   51:istore_2        
		}
		obj = ((Object) (c));
	//   34   52:aload_0         
	//   35   53:getfield        #22  <Field buc c>
	//   36   56:astore_3        
		i = j;
	//   37   57:iload_2         
	//   38   58:istore_1        
		if(obj != null)
	//*  39   59:aload_3         
	//*  40   60:ifnull          71
			i = j + arh.c(3, ((atv) (obj)));
	//   41   63:iload_2         
	//   42   64:iconst_3        
	//   43   65:aload_3         
	//   44   66:invokestatic    #52  <Method int arh.c(int, atv)>
	//   45   69:iadd            
	//   46   70:istore_1        
		obj = ((Object) (d));
	//   47   71:aload_0         
	//   48   72:getfield        #24  <Field btw d>
	//   49   75:astore_3        
		j = i;
	//   50   76:iload_1         
	//   51   77:istore_2        
		if(obj != null)
	//*  52   78:aload_3         
	//*  53   79:ifnull          90
			j = i + arh.c(4, ((atv) (obj)));
	//   54   82:iload_1         
	//   55   83:iconst_4        
	//   56   84:aload_3         
	//   57   85:invokestatic    #52  <Method int arh.c(int, atv)>
	//   58   88:iadd            
	//   59   89:istore_2        
		return j;
	//   60   90:iload_2         
	//   61   91:ireturn         
	}

	public final awp a(awg awg1)
	{
label0:
		do
			do
			{
				int i = awg1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #56  <Method int awg.a()>
	//    2    4:istore_2        
				if(i != 0)
	//*   3    5:iload_2         
	//*   4    6:ifeq            176
				{
					if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          147
					{
						if(i != 16)
	//*   8   15:iload_2         
	//*   9   16:bipush          16
	//*  10   18:icmpeq          78
						{
							if(i != 26)
	//*  11   21:iload_2         
	//*  12   22:bipush          26
	//*  13   24:icmpeq          61
							{
								if(i != 34)
	//*  14   27:iload_2         
	//*  15   28:bipush          34
	//*  16   30:icmpeq          44
								{
									if(!super.a(awg1, i))
	//*  17   33:aload_0         
	//*  18   34:aload_1         
	//*  19   35:iload_2         
	//*  20   36:invokespecial   #59  <Method boolean awj.a(awg, int)>
	//*  21   39:ifne            0
										return ((awp) (this));
	//   22   42:aload_0         
	//   23   43:areturn         
								} else
								{
									d = (btw)awg1.a(btw.a());
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:invokestatic    #64  <Method aug btw.a()>
	//   27   49:invokevirtual   #67  <Method ash awg.a(aug)>
	//   28   52:checkcast       #61  <Class btw>
	//   29   55:putfield        #24  <Field btw d>
								}
							} else
	//*  30   58:goto            0
							{
								c = (buc)awg1.a(buc.a());
	//   31   61:aload_0         
	//   32   62:aload_1         
	//   33   63:invokestatic    #70  <Method aug buc.a()>
	//   34   66:invokevirtual   #67  <Method ash awg.a(aug)>
	//   35   69:checkcast       #69  <Class buc>
	//   36   72:putfield        #22  <Field buc c>
							}
						} else
	//*  37   75:goto            0
						{
							int j = awg1.j();
	//   38   78:aload_1         
	//   39   79:invokevirtual   #73  <Method int awg.j()>
	//   40   82:istore_3        
							int k = awg1.g();
	//   41   83:aload_1         
	//   42   84:invokevirtual   #76  <Method int awg.g()>
	//   43   87:istore          4
							if(k != 1000)
	//*  44   89:iload           4
	//*  45   91:sipush          1000
	//*  46   94:icmpeq          135
								switch(k)
	//*  47   97:iload           4
								{
	//*  48   99:tableswitch     0 1: default 120
	//	               0 135
	//	               1 135
								default:
									awg1.e(j);
	//   49  120:aload_1         
	//   50  121:iload_3         
	//   51  122:invokevirtual   #80  <Method void awg.e(int)>
									((awj)this).a(awg1, i);
	//   52  125:aload_0         
	//   53  126:aload_1         
	//   54  127:iload_2         
	//   55  128:invokevirtual   #59  <Method boolean awj.a(awg, int)>
	//   56  131:pop             
									continue label0;
	//   57  132:goto            0

								case 0: // '\0'
								case 1: // '\001'
									break;
								}
							b = buv.a(k);
	//   58  135:aload_0         
	//   59  136:iload           4
	//   60  138:invokestatic    #83  <Method buv buv.a(int)>
	//   61  141:putfield        #20  <Field buv b>
							continue label0;
	//   62  144:goto            0
						}
					} else
					{
						if(a == null)
	//*  63  147:aload_0         
	//*  64  148:getfield        #18  <Field bvj a>
	//*  65  151:ifnonnull       165
							a = new bvj();
	//   66  154:aload_0         
	//   67  155:new             #85  <Class bvj>
	//   68  158:dup             
	//   69  159:invokespecial   #86  <Method void bvj()>
	//   70  162:putfield        #18  <Field bvj a>
						awg1.a(((awp) (a)));
	//   71  165:aload_1         
	//   72  166:aload_0         
	//   73  167:getfield        #18  <Field bvj a>
	//   74  170:invokevirtual   #89  <Method void awg.a(awp)>
						continue label0;
	//   75  173:goto            0
					}
				} else
				{
					return ((awp) (this));
	//   76  176:aload_0         
	//   77  177:areturn         
				}
			} while(true);
		while(true);
	}

	public final void a(awh awh1)
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field bvj a>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			awh1.a(1, ((awp) (obj)));
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #93  <Method void awh.a(int, awp)>
		obj = ((Object) (b));
	//    9   15:aload_0         
	//   10   16:getfield        #20  <Field buv b>
	//   11   19:astore_2        
		if(obj != null && obj != null)
	//*  12   20:aload_2         
	//*  13   21:ifnull          37
	//*  14   24:aload_2         
	//*  15   25:ifnull          37
			awh1.a(2, ((buv) (obj)).a());
	//   16   28:aload_1         
	//   17   29:iconst_2        
	//   18   30:aload_2         
	//   19   31:invokevirtual   #44  <Method int buv.a()>
	//   20   34:invokevirtual   #96  <Method void awh.a(int, int)>
		obj = ((Object) (c));
	//   21   37:aload_0         
	//   22   38:getfield        #22  <Field buc c>
	//   23   41:astore_2        
		if(obj != null)
	//*  24   42:aload_2         
	//*  25   43:ifnull          52
			awh1.a(3, ((atv) (obj)));
	//   26   46:aload_1         
	//   27   47:iconst_3        
	//   28   48:aload_2         
	//   29   49:invokevirtual   #99  <Method void awh.a(int, atv)>
		obj = ((Object) (d));
	//   30   52:aload_0         
	//   31   53:getfield        #24  <Field btw d>
	//   32   56:astore_2        
		if(obj != null)
	//*  33   57:aload_2         
	//*  34   58:ifnull          67
			awh1.a(4, ((atv) (obj)));
	//   35   61:aload_1         
	//   36   62:iconst_4        
	//   37   63:aload_2         
	//   38   64:invokevirtual   #99  <Method void awh.a(int, atv)>
		super.a(awh1);
	//   39   67:aload_0         
	//   40   68:aload_1         
	//   41   69:invokespecial   #101 <Method void awj.a(awh)>
	//   42   72:return          
	}

	private bvj a;
	private buv b;
	private buc c;
	private btw d;
}
