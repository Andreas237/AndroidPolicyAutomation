// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			awj, awh, awg, awp

public final class anf extends awj
{

	public anf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void awj()>
		d = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #16  <Field Long d>
		e = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #18  <Field Long e>
		a = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #20  <Field Long a>
		b = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #22  <Field Long b>
		c = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #24  <Field Long c>
		aa = -1;
	//   17   29:aload_0         
	//   18   30:iconst_m1       
	//   19   31:putfield        #28  <Field int aa>
	//   20   34:return          
	}

	protected final int a()
	{
		int j = super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method int awj.a()>
	//    2    4:istore_2        
		Long long1 = d;
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field Long d>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(long1 != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          27
			i = j + awh.d(1, long1.longValue());
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:invokevirtual   #38  <Method long Long.longValue()>
	//   14   22:invokestatic    #43  <Method int awh.d(int, long)>
	//   15   25:iadd            
	//   16   26:istore_1        
		long1 = e;
	//   17   27:aload_0         
	//   18   28:getfield        #18  <Field Long e>
	//   19   31:astore_3        
		j = i;
	//   20   32:iload_1         
	//   21   33:istore_2        
		if(long1 != null)
	//*  22   34:aload_3         
	//*  23   35:ifnull          49
			j = i + awh.d(2, long1.longValue());
	//   24   38:iload_1         
	//   25   39:iconst_2        
	//   26   40:aload_3         
	//   27   41:invokevirtual   #38  <Method long Long.longValue()>
	//   28   44:invokestatic    #43  <Method int awh.d(int, long)>
	//   29   47:iadd            
	//   30   48:istore_2        
		long1 = a;
	//   31   49:aload_0         
	//   32   50:getfield        #20  <Field Long a>
	//   33   53:astore_3        
		i = j;
	//   34   54:iload_2         
	//   35   55:istore_1        
		if(long1 != null)
	//*  36   56:aload_3         
	//*  37   57:ifnull          71
			i = j + awh.d(3, long1.longValue());
	//   38   60:iload_2         
	//   39   61:iconst_3        
	//   40   62:aload_3         
	//   41   63:invokevirtual   #38  <Method long Long.longValue()>
	//   42   66:invokestatic    #43  <Method int awh.d(int, long)>
	//   43   69:iadd            
	//   44   70:istore_1        
		long1 = b;
	//   45   71:aload_0         
	//   46   72:getfield        #22  <Field Long b>
	//   47   75:astore_3        
		j = i;
	//   48   76:iload_1         
	//   49   77:istore_2        
		if(long1 != null)
	//*  50   78:aload_3         
	//*  51   79:ifnull          93
			j = i + awh.d(4, long1.longValue());
	//   52   82:iload_1         
	//   53   83:iconst_4        
	//   54   84:aload_3         
	//   55   85:invokevirtual   #38  <Method long Long.longValue()>
	//   56   88:invokestatic    #43  <Method int awh.d(int, long)>
	//   57   91:iadd            
	//   58   92:istore_2        
		long1 = c;
	//   59   93:aload_0         
	//   60   94:getfield        #24  <Field Long c>
	//   61   97:astore_3        
		i = j;
	//   62   98:iload_2         
	//   63   99:istore_1        
		if(long1 != null)
	//*  64  100:aload_3         
	//*  65  101:ifnull          115
			i = j + awh.d(5, long1.longValue());
	//   66  104:iload_2         
	//   67  105:iconst_5        
	//   68  106:aload_3         
	//   69  107:invokevirtual   #38  <Method long Long.longValue()>
	//   70  110:invokestatic    #43  <Method int awh.d(int, long)>
	//   71  113:iadd            
	//   72  114:istore_1        
		return i;
	//   73  115:iload_1         
	//   74  116:ireturn         
	}

	public final awp a(awg awg1)
	{
		do
		{
			int i = awg1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #47  <Method int awg.a()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            120
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          106
			{
				if(i != 16)
	//*   8   15:iload_2         
	//*   9   16:bipush          16
	//*  10   18:icmpeq          92
				{
					if(i != 24)
	//*  11   21:iload_2         
	//*  12   22:bipush          24
	//*  13   24:icmpeq          78
					{
						if(i != 32)
	//*  14   27:iload_2         
	//*  15   28:bipush          32
	//*  16   30:icmpeq          64
						{
							if(i != 40)
	//*  17   33:iload_2         
	//*  18   34:bipush          40
	//*  19   36:icmpeq          50
							{
								if(!super.a(awg1, i))
	//*  20   39:aload_0         
	//*  21   40:aload_1         
	//*  22   41:iload_2         
	//*  23   42:invokespecial   #50  <Method boolean awj.a(awg, int)>
	//*  24   45:ifne            0
									return ((awp) (this));
	//   25   48:aload_0         
	//   26   49:areturn         
							} else
							{
								c = Long.valueOf(awg1.h());
	//   27   50:aload_0         
	//   28   51:aload_1         
	//   29   52:invokevirtual   #53  <Method long awg.h()>
	//   30   55:invokestatic    #57  <Method Long Long.valueOf(long)>
	//   31   58:putfield        #24  <Field Long c>
							}
						} else
	//*  32   61:goto            0
						{
							b = Long.valueOf(awg1.h());
	//   33   64:aload_0         
	//   34   65:aload_1         
	//   35   66:invokevirtual   #53  <Method long awg.h()>
	//   36   69:invokestatic    #57  <Method Long Long.valueOf(long)>
	//   37   72:putfield        #22  <Field Long b>
						}
					} else
	//*  38   75:goto            0
					{
						a = Long.valueOf(awg1.h());
	//   39   78:aload_0         
	//   40   79:aload_1         
	//   41   80:invokevirtual   #53  <Method long awg.h()>
	//   42   83:invokestatic    #57  <Method Long Long.valueOf(long)>
	//   43   86:putfield        #20  <Field Long a>
					}
				} else
	//*  44   89:goto            0
				{
					e = Long.valueOf(awg1.h());
	//   45   92:aload_0         
	//   46   93:aload_1         
	//   47   94:invokevirtual   #53  <Method long awg.h()>
	//   48   97:invokestatic    #57  <Method Long Long.valueOf(long)>
	//   49  100:putfield        #18  <Field Long e>
				}
			} else
	//*  50  103:goto            0
			{
				d = Long.valueOf(awg1.h());
	//   51  106:aload_0         
	//   52  107:aload_1         
	//   53  108:invokevirtual   #53  <Method long awg.h()>
	//   54  111:invokestatic    #57  <Method Long Long.valueOf(long)>
	//   55  114:putfield        #16  <Field Long d>
			}
		} while(true);
	//   56  117:goto            0
		return ((awp) (this));
	//   57  120:aload_0         
	//   58  121:areturn         
	}

	public final void a(awh awh1)
	{
		Long long1 = d;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Long d>
	//    2    4:astore_2        
		if(long1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          18
			awh1.b(1, long1.longValue());
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #38  <Method long Long.longValue()>
	//    9   15:invokevirtual   #61  <Method void awh.b(int, long)>
		long1 = e;
	//   10   18:aload_0         
	//   11   19:getfield        #18  <Field Long e>
	//   12   22:astore_2        
		if(long1 != null)
	//*  13   23:aload_2         
	//*  14   24:ifnull          36
			awh1.b(2, long1.longValue());
	//   15   27:aload_1         
	//   16   28:iconst_2        
	//   17   29:aload_2         
	//   18   30:invokevirtual   #38  <Method long Long.longValue()>
	//   19   33:invokevirtual   #61  <Method void awh.b(int, long)>
		long1 = a;
	//   20   36:aload_0         
	//   21   37:getfield        #20  <Field Long a>
	//   22   40:astore_2        
		if(long1 != null)
	//*  23   41:aload_2         
	//*  24   42:ifnull          54
			awh1.b(3, long1.longValue());
	//   25   45:aload_1         
	//   26   46:iconst_3        
	//   27   47:aload_2         
	//   28   48:invokevirtual   #38  <Method long Long.longValue()>
	//   29   51:invokevirtual   #61  <Method void awh.b(int, long)>
		long1 = b;
	//   30   54:aload_0         
	//   31   55:getfield        #22  <Field Long b>
	//   32   58:astore_2        
		if(long1 != null)
	//*  33   59:aload_2         
	//*  34   60:ifnull          72
			awh1.b(4, long1.longValue());
	//   35   63:aload_1         
	//   36   64:iconst_4        
	//   37   65:aload_2         
	//   38   66:invokevirtual   #38  <Method long Long.longValue()>
	//   39   69:invokevirtual   #61  <Method void awh.b(int, long)>
		long1 = c;
	//   40   72:aload_0         
	//   41   73:getfield        #24  <Field Long c>
	//   42   76:astore_2        
		if(long1 != null)
	//*  43   77:aload_2         
	//*  44   78:ifnull          90
			awh1.b(5, long1.longValue());
	//   45   81:aload_1         
	//   46   82:iconst_5        
	//   47   83:aload_2         
	//   48   84:invokevirtual   #38  <Method long Long.longValue()>
	//   49   87:invokevirtual   #61  <Method void awh.b(int, long)>
		super.a(awh1);
	//   50   90:aload_0         
	//   51   91:aload_1         
	//   52   92:invokespecial   #63  <Method void awj.a(awh)>
	//   53   95:return          
	}

	public Long a;
	public Long b;
	public Long c;
	private Long d;
	private Long e;
}
