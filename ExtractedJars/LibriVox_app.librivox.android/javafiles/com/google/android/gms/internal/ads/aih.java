// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			awj, awh, awg, awp

public final class aih extends awj
{

	protected final int a()
	{
		int j = super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method int awj.a()>
	//    2    4:istore_2        
		String s = a;
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field String a>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(s != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          24
			i = j + awh.b(1, s);
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:invokestatic    #21  <Method int awh.b(int, String)>
	//   14   22:iadd            
	//   15   23:istore_1        
		s = c;
	//   16   24:aload_0         
	//   17   25:getfield        #23  <Field String c>
	//   18   28:astore_3        
		j = i;
	//   19   29:iload_1         
	//   20   30:istore_2        
		if(s != null)
	//*  21   31:aload_3         
	//*  22   32:ifnull          43
			j = i + awh.b(2, s);
	//   23   35:iload_1         
	//   24   36:iconst_2        
	//   25   37:aload_3         
	//   26   38:invokestatic    #21  <Method int awh.b(int, String)>
	//   27   41:iadd            
	//   28   42:istore_2        
		s = d;
	//   29   43:aload_0         
	//   30   44:getfield        #25  <Field String d>
	//   31   47:astore_3        
		i = j;
	//   32   48:iload_2         
	//   33   49:istore_1        
		if(s != null)
	//*  34   50:aload_3         
	//*  35   51:ifnull          62
			i = j + awh.b(3, s);
	//   36   54:iload_2         
	//   37   55:iconst_3        
	//   38   56:aload_3         
	//   39   57:invokestatic    #21  <Method int awh.b(int, String)>
	//   40   60:iadd            
	//   41   61:istore_1        
		s = e;
	//   42   62:aload_0         
	//   43   63:getfield        #27  <Field String e>
	//   44   66:astore_3        
		j = i;
	//   45   67:iload_1         
	//   46   68:istore_2        
		if(s != null)
	//*  47   69:aload_3         
	//*  48   70:ifnull          81
			j = i + awh.b(4, s);
	//   49   73:iload_1         
	//   50   74:iconst_4        
	//   51   75:aload_3         
	//   52   76:invokestatic    #21  <Method int awh.b(int, String)>
	//   53   79:iadd            
	//   54   80:istore_2        
		s = f;
	//   55   81:aload_0         
	//   56   82:getfield        #29  <Field String f>
	//   57   85:astore_3        
		i = j;
	//   58   86:iload_2         
	//   59   87:istore_1        
		if(s != null)
	//*  60   88:aload_3         
	//*  61   89:ifnull          100
			i = j + awh.b(5, s);
	//   62   92:iload_2         
	//   63   93:iconst_5        
	//   64   94:aload_3         
	//   65   95:invokestatic    #21  <Method int awh.b(int, String)>
	//   66   98:iadd            
	//   67   99:istore_1        
		s = b;
	//   68  100:aload_0         
	//   69  101:getfield        #31  <Field String b>
	//   70  104:astore_3        
		j = i;
	//   71  105:iload_1         
	//   72  106:istore_2        
		if(s != null)
	//*  73  107:aload_3         
	//*  74  108:ifnull          120
			j = i + awh.b(6, s);
	//   75  111:iload_1         
	//   76  112:bipush          6
	//   77  114:aload_3         
	//   78  115:invokestatic    #21  <Method int awh.b(int, String)>
	//   79  118:iadd            
	//   80  119:istore_2        
		return j;
	//   81  120:iload_2         
	//   82  121:ireturn         
	}

	public final awp a(awg awg1)
	{
		do
		{
			int i = awg1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #36  <Method int awg.a()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            122
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          111
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          100
				{
					if(i != 26)
	//*  11   21:iload_2         
	//*  12   22:bipush          26
	//*  13   24:icmpeq          89
					{
						if(i != 34)
	//*  14   27:iload_2         
	//*  15   28:bipush          34
	//*  16   30:icmpeq          78
						{
							if(i != 42)
	//*  17   33:iload_2         
	//*  18   34:bipush          42
	//*  19   36:icmpeq          67
							{
								if(i != 50)
	//*  20   39:iload_2         
	//*  21   40:bipush          50
	//*  22   42:icmpeq          56
								{
									if(!super.a(awg1, i))
	//*  23   45:aload_0         
	//*  24   46:aload_1         
	//*  25   47:iload_2         
	//*  26   48:invokespecial   #39  <Method boolean awj.a(awg, int)>
	//*  27   51:ifne            0
										return ((awp) (this));
	//   28   54:aload_0         
	//   29   55:areturn         
								} else
								{
									b = awg1.e();
	//   30   56:aload_0         
	//   31   57:aload_1         
	//   32   58:invokevirtual   #42  <Method String awg.e()>
	//   33   61:putfield        #31  <Field String b>
								}
							} else
	//*  34   64:goto            0
							{
								f = awg1.e();
	//   35   67:aload_0         
	//   36   68:aload_1         
	//   37   69:invokevirtual   #42  <Method String awg.e()>
	//   38   72:putfield        #29  <Field String f>
							}
						} else
	//*  39   75:goto            0
						{
							e = awg1.e();
	//   40   78:aload_0         
	//   41   79:aload_1         
	//   42   80:invokevirtual   #42  <Method String awg.e()>
	//   43   83:putfield        #27  <Field String e>
						}
					} else
	//*  44   86:goto            0
					{
						d = awg1.e();
	//   45   89:aload_0         
	//   46   90:aload_1         
	//   47   91:invokevirtual   #42  <Method String awg.e()>
	//   48   94:putfield        #25  <Field String d>
					}
				} else
	//*  49   97:goto            0
				{
					c = awg1.e();
	//   50  100:aload_0         
	//   51  101:aload_1         
	//   52  102:invokevirtual   #42  <Method String awg.e()>
	//   53  105:putfield        #23  <Field String c>
				}
			} else
	//*  54  108:goto            0
			{
				a = awg1.e();
	//   55  111:aload_0         
	//   56  112:aload_1         
	//   57  113:invokevirtual   #42  <Method String awg.e()>
	//   58  116:putfield        #16  <Field String a>
			}
		} while(true);
	//   59  119:goto            0
		return ((awp) (this));
	//   60  122:aload_0         
	//   61  123:areturn         
	}

	public final void a(awh awh1)
	{
		String s = a;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field String a>
	//    2    4:astore_2        
		if(s != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			awh1.a(1, s);
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #46  <Method void awh.a(int, String)>
		s = c;
	//    9   15:aload_0         
	//   10   16:getfield        #23  <Field String c>
	//   11   19:astore_2        
		if(s != null)
	//*  12   20:aload_2         
	//*  13   21:ifnull          30
			awh1.a(2, s);
	//   14   24:aload_1         
	//   15   25:iconst_2        
	//   16   26:aload_2         
	//   17   27:invokevirtual   #46  <Method void awh.a(int, String)>
		s = d;
	//   18   30:aload_0         
	//   19   31:getfield        #25  <Field String d>
	//   20   34:astore_2        
		if(s != null)
	//*  21   35:aload_2         
	//*  22   36:ifnull          45
			awh1.a(3, s);
	//   23   39:aload_1         
	//   24   40:iconst_3        
	//   25   41:aload_2         
	//   26   42:invokevirtual   #46  <Method void awh.a(int, String)>
		s = e;
	//   27   45:aload_0         
	//   28   46:getfield        #27  <Field String e>
	//   29   49:astore_2        
		if(s != null)
	//*  30   50:aload_2         
	//*  31   51:ifnull          60
			awh1.a(4, s);
	//   32   54:aload_1         
	//   33   55:iconst_4        
	//   34   56:aload_2         
	//   35   57:invokevirtual   #46  <Method void awh.a(int, String)>
		s = f;
	//   36   60:aload_0         
	//   37   61:getfield        #29  <Field String f>
	//   38   64:astore_2        
		if(s != null)
	//*  39   65:aload_2         
	//*  40   66:ifnull          75
			awh1.a(5, s);
	//   41   69:aload_1         
	//   42   70:iconst_5        
	//   43   71:aload_2         
	//   44   72:invokevirtual   #46  <Method void awh.a(int, String)>
		s = b;
	//   45   75:aload_0         
	//   46   76:getfield        #31  <Field String b>
	//   47   79:astore_2        
		if(s != null)
	//*  48   80:aload_2         
	//*  49   81:ifnull          91
			awh1.a(6, s);
	//   50   84:aload_1         
	//   51   85:bipush          6
	//   52   87:aload_2         
	//   53   88:invokevirtual   #46  <Method void awh.a(int, String)>
		super.a(awh1);
	//   54   91:aload_0         
	//   55   92:aload_1         
	//   56   93:invokespecial   #48  <Method void awj.a(awh)>
	//   57   96:return          
	}

	public String a;
	public String b;
	private String c;
	private String d;
	private String e;
	private String f;
}
