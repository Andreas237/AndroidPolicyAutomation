// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			awj, btb, awh, awg, 
//			bvj, awp

public final class bvh extends awj
{

	public bvh()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void awj()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #17  <Field btb a>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #19  <Field bvj b>
		c = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #21  <Field String c>
		d = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #23  <Field String d>
		Z = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #27  <Field awl Z>
		aa = -1;
	//   17   29:aload_0         
	//   18   30:iconst_m1       
	//   19   31:putfield        #31  <Field int aa>
	//   20   34:return          
	}

	protected final int a()
	{
		int j = super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method int awj.a()>
	//    2    4:istore_2        
		Object obj = ((Object) (a));
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field btb a>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(obj != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          33
		{
			i = j;
	//   10   16:iload_2         
	//   11   17:istore_1        
			if(obj != null)
	//*  12   18:aload_3         
	//*  13   19:ifnull          33
				i = j + awh.b(5, ((btb) (obj)).a());
	//   14   22:iload_2         
	//   15   23:iconst_5        
	//   16   24:aload_3         
	//   17   25:invokevirtual   #38  <Method int btb.a()>
	//   18   28:invokestatic    #43  <Method int awh.b(int, int)>
	//   19   31:iadd            
	//   20   32:istore_1        
		}
		obj = ((Object) (b));
	//   21   33:aload_0         
	//   22   34:getfield        #19  <Field bvj b>
	//   23   37:astore_3        
		j = i;
	//   24   38:iload_1         
	//   25   39:istore_2        
		if(obj != null)
	//*  26   40:aload_3         
	//*  27   41:ifnull          53
			j = i + awh.b(6, ((awp) (obj)));
	//   28   44:iload_1         
	//   29   45:bipush          6
	//   30   47:aload_3         
	//   31   48:invokestatic    #46  <Method int awh.b(int, awp)>
	//   32   51:iadd            
	//   33   52:istore_2        
		obj = ((Object) (c));
	//   34   53:aload_0         
	//   35   54:getfield        #21  <Field String c>
	//   36   57:astore_3        
		i = j;
	//   37   58:iload_2         
	//   38   59:istore_1        
		if(obj != null)
	//*  39   60:aload_3         
	//*  40   61:ifnull          73
			i = j + awh.b(7, ((String) (obj)));
	//   41   64:iload_2         
	//   42   65:bipush          7
	//   43   67:aload_3         
	//   44   68:invokestatic    #49  <Method int awh.b(int, String)>
	//   45   71:iadd            
	//   46   72:istore_1        
		obj = ((Object) (d));
	//   47   73:aload_0         
	//   48   74:getfield        #23  <Field String d>
	//   49   77:astore_3        
		j = i;
	//   50   78:iload_1         
	//   51   79:istore_2        
		if(obj != null)
	//*  52   80:aload_3         
	//*  53   81:ifnull          93
			j = i + awh.b(8, ((String) (obj)));
	//   54   84:iload_1         
	//   55   85:bipush          8
	//   56   87:aload_3         
	//   57   88:invokestatic    #49  <Method int awh.b(int, String)>
	//   58   91:iadd            
	//   59   92:istore_2        
		return j;
	//   60   93:iload_2         
	//   61   94:ireturn         
	}

	public final awp a(awg awg1)
	{
label0:
		do
			do
			{
				int i = awg1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #53  <Method int awg.a()>
	//    2    4:istore_2        
				if(i != 0)
	//*   3    5:iload_2         
	//*   4    6:ifeq            163
				{
					if(i != 40)
	//*   5    9:iload_2         
	//*   6   10:bipush          40
	//*   7   12:icmpeq          95
					{
						if(i != 50)
	//*   8   15:iload_2         
	//*   9   16:bipush          50
	//*  10   18:icmpeq          66
						{
							if(i != 58)
	//*  11   21:iload_2         
	//*  12   22:bipush          58
	//*  13   24:icmpeq          55
							{
								if(i != 66)
	//*  14   27:iload_2         
	//*  15   28:bipush          66
	//*  16   30:icmpeq          44
								{
									if(!super.a(awg1, i))
	//*  17   33:aload_0         
	//*  18   34:aload_1         
	//*  19   35:iload_2         
	//*  20   36:invokespecial   #56  <Method boolean awj.a(awg, int)>
	//*  21   39:ifne            0
										return ((awp) (this));
	//   22   42:aload_0         
	//   23   43:areturn         
								} else
								{
									d = awg1.e();
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:invokevirtual   #60  <Method String awg.e()>
	//   27   49:putfield        #23  <Field String d>
								}
							} else
	//*  28   52:goto            0
							{
								c = awg1.e();
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:invokevirtual   #60  <Method String awg.e()>
	//   32   60:putfield        #21  <Field String c>
							}
						} else
	//*  33   63:goto            0
						{
							if(b == null)
	//*  34   66:aload_0         
	//*  35   67:getfield        #19  <Field bvj b>
	//*  36   70:ifnonnull       84
								b = new bvj();
	//   37   73:aload_0         
	//   38   74:new             #62  <Class bvj>
	//   39   77:dup             
	//   40   78:invokespecial   #63  <Method void bvj()>
	//   41   81:putfield        #19  <Field bvj b>
							awg1.a(((awp) (b)));
	//   42   84:aload_1         
	//   43   85:aload_0         
	//   44   86:getfield        #19  <Field bvj b>
	//   45   89:invokevirtual   #66  <Method void awg.a(awp)>
						}
					} else
	//*  46   92:goto            0
					{
						int j = awg1.j();
	//   47   95:aload_1         
	//   48   96:invokevirtual   #69  <Method int awg.j()>
	//   49   99:istore_3        
						int k = awg1.g();
	//   50  100:aload_1         
	//   51  101:invokevirtual   #72  <Method int awg.g()>
	//   52  104:istore          4
						switch(k)
	//*  53  106:iload           4
						{
	//*  54  108:tableswitch     0 2: default 136
	//	               0 151
	//	               1 151
	//	               2 151
						default:
							awg1.e(j);
	//   55  136:aload_1         
	//   56  137:iload_3         
	//   57  138:invokevirtual   #75  <Method void awg.e(int)>
							((awj)this).a(awg1, i);
	//   58  141:aload_0         
	//   59  142:aload_1         
	//   60  143:iload_2         
	//   61  144:invokevirtual   #56  <Method boolean awj.a(awg, int)>
	//   62  147:pop             
							break;

	//*  63  148:goto            0
						case 0: // '\0'
						case 1: // '\001'
						case 2: // '\002'
							a = btb.a(k);
	//   64  151:aload_0         
	//   65  152:iload           4
	//   66  154:invokestatic    #78  <Method btb btb.a(int)>
	//   67  157:putfield        #17  <Field btb a>
							break;
						}
						continue label0;
	//   68  160:goto            0
					}
				} else
				{
					return ((awp) (this));
	//   69  163:aload_0         
	//   70  164:areturn         
				}
			} while(true);
		while(true);
	}

	public final void a(awh awh1)
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field btb a>
	//    2    4:astore_2        
		if(obj != null && obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          22
	//*   5    9:aload_2         
	//*   6   10:ifnull          22
			awh1.a(5, ((btb) (obj)).a());
	//    7   13:aload_1         
	//    8   14:iconst_5        
	//    9   15:aload_2         
	//   10   16:invokevirtual   #38  <Method int btb.a()>
	//   11   19:invokevirtual   #82  <Method void awh.a(int, int)>
		obj = ((Object) (b));
	//   12   22:aload_0         
	//   13   23:getfield        #19  <Field bvj b>
	//   14   26:astore_2        
		if(obj != null)
	//*  15   27:aload_2         
	//*  16   28:ifnull          38
			awh1.a(6, ((awp) (obj)));
	//   17   31:aload_1         
	//   18   32:bipush          6
	//   19   34:aload_2         
	//   20   35:invokevirtual   #85  <Method void awh.a(int, awp)>
		obj = ((Object) (c));
	//   21   38:aload_0         
	//   22   39:getfield        #21  <Field String c>
	//   23   42:astore_2        
		if(obj != null)
	//*  24   43:aload_2         
	//*  25   44:ifnull          54
			awh1.a(7, ((String) (obj)));
	//   26   47:aload_1         
	//   27   48:bipush          7
	//   28   50:aload_2         
	//   29   51:invokevirtual   #88  <Method void awh.a(int, String)>
		obj = ((Object) (d));
	//   30   54:aload_0         
	//   31   55:getfield        #23  <Field String d>
	//   32   58:astore_2        
		if(obj != null)
	//*  33   59:aload_2         
	//*  34   60:ifnull          70
			awh1.a(8, ((String) (obj)));
	//   35   63:aload_1         
	//   36   64:bipush          8
	//   37   66:aload_2         
	//   38   67:invokevirtual   #88  <Method void awh.a(int, String)>
		super.a(awh1);
	//   39   70:aload_0         
	//   40   71:aload_1         
	//   41   72:invokespecial   #90  <Method void awj.a(awh)>
	//   42   75:return          
	}

	private btb a;
	private bvj b;
	private String c;
	private String d;
}
