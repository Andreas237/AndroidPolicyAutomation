// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			awj, awg, awh, awp

public final class ayl extends awj
{

	public ayl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void awj()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #16  <Field Integer a>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #18  <Field String b>
		c = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #20  <Field byte[] c>
		Z = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #24  <Field awl Z>
		aa = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #28  <Field int aa>
	//   17   29:return          
	}

	private final ayl b(awg awg1)
	{
_L2:
		int i;
		int j;
		i = awg1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #37  <Method int awg.a()>
	//    2    4:istore_2        
		if(i == 0)
			break; /* Loop/switch isn't completed */
	//    3    5:iload_2         
	//    4    6:ifeq            149
		if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          60
		{
			if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          49
			{
				if(i != 26)
	//*  11   21:iload_2         
	//*  12   22:bipush          26
	//*  13   24:icmpeq          38
				{
					if(!super.a(awg1, i))
	//*  14   27:aload_0         
	//*  15   28:aload_1         
	//*  16   29:iload_2         
	//*  17   30:invokespecial   #40  <Method boolean awj.a(awg, int)>
	//*  18   33:ifne            0
						return this;
	//   19   36:aload_0         
	//   20   37:areturn         
				} else
				{
					c = awg1.f();
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:invokevirtual   #44  <Method byte[] awg.f()>
	//   24   43:putfield        #20  <Field byte[] c>
				}
			} else
	//*  25   46:goto            0
			{
				b = awg1.e();
	//   26   49:aload_0         
	//   27   50:aload_1         
	//   28   51:invokevirtual   #48  <Method String awg.e()>
	//   29   54:putfield        #18  <Field String b>
			}
			continue; /* Loop/switch isn't completed */
	//   30   57:goto            0
		}
		j = awg1.j();
	//   31   60:aload_1         
	//   32   61:invokevirtual   #51  <Method int awg.j()>
	//   33   64:istore_3        
		int k = awg1.c();
	//   34   65:aload_1         
	//   35   66:invokevirtual   #53  <Method int awg.c()>
	//   36   69:istore          4
		if(k < 0 || k > 1)
			break MISSING_BLOCK_LABEL_94;
	//   37   71:iload           4
	//   38   73:iflt            94
	//   39   76:iload           4
	//   40   78:iconst_1        
	//   41   79:icmpgt          94
		a = Integer.valueOf(k);
	//   42   82:aload_0         
	//   43   83:iload           4
	//   44   85:invokestatic    #59  <Method Integer Integer.valueOf(int)>
	//   45   88:putfield        #16  <Field Integer a>
		continue; /* Loop/switch isn't completed */
	//   46   91:goto            0
		try
		{
			StringBuilder stringbuilder = new StringBuilder(36);
	//   47   94:new             #61  <Class StringBuilder>
	//   48   97:dup             
	//   49   98:bipush          36
	//   50  100:invokespecial   #64  <Method void StringBuilder(int)>
	//   51  103:astore          5
			stringbuilder.append(k);
	//   52  105:aload           5
	//   53  107:iload           4
	//   54  109:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
	//   55  112:pop             
			stringbuilder.append(" is not a valid enum Type");
	//   56  113:aload           5
	//   57  115:ldc1            #70  <String " is not a valid enum Type">
	//   58  117:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   59  120:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   60  121:new             #32  <Class IllegalArgumentException>
	//   61  124:dup             
	//   62  125:aload           5
	//   63  127:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   64  130:invokespecial   #79  <Method void IllegalArgumentException(String)>
	//   65  133:athrow          
		}
	//*  66  134:aload_1         
	//*  67  135:iload_3         
	//*  68  136:invokevirtual   #81  <Method void awg.e(int)>
	//*  69  139:aload_0         
	//*  70  140:aload_1         
	//*  71  141:iload_2         
	//*  72  142:invokevirtual   #40  <Method boolean awj.a(awg, int)>
	//*  73  145:pop             
	//*  74  146:goto            0
	//*  75  149:aload_0         
	//*  76  150:areturn         
		// Misplaced declaration of an exception variable
		catch(IllegalArgumentException illegalargumentexception)
		{
			awg1.e(j);
		}
		((awj)this).a(awg1, i);
		if(true) goto _L2; else goto _L1
_L1:
		IllegalArgumentException illegalargumentexception;
		return this;
	//*  77  151:astore          5
	//*  78  153:goto            134
	}

	protected final int a()
	{
		int j = super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method int awj.a()>
	//    2    4:istore_2        
		Object obj = ((Object) (a));
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field Integer a>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(obj != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          27
			i = j + awh.b(1, ((Integer) (obj)).intValue());
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:invokevirtual   #85  <Method int Integer.intValue()>
	//   14   22:invokestatic    #90  <Method int awh.b(int, int)>
	//   15   25:iadd            
	//   16   26:istore_1        
		obj = ((Object) (b));
	//   17   27:aload_0         
	//   18   28:getfield        #18  <Field String b>
	//   19   31:astore_3        
		j = i;
	//   20   32:iload_1         
	//   21   33:istore_2        
		if(obj != null)
	//*  22   34:aload_3         
	//*  23   35:ifnull          46
			j = i + awh.b(2, ((String) (obj)));
	//   24   38:iload_1         
	//   25   39:iconst_2        
	//   26   40:aload_3         
	//   27   41:invokestatic    #93  <Method int awh.b(int, String)>
	//   28   44:iadd            
	//   29   45:istore_2        
		byte abyte0[] = c;
	//   30   46:aload_0         
	//   31   47:getfield        #20  <Field byte[] c>
	//   32   50:astore_3        
		i = j;
	//   33   51:iload_2         
	//   34   52:istore_1        
		if(abyte0 != null)
	//*  35   53:aload_3         
	//*  36   54:ifnull          65
			i = j + awh.b(3, abyte0);
	//   37   57:iload_2         
	//   38   58:iconst_3        
	//   39   59:aload_3         
	//   40   60:invokestatic    #96  <Method int awh.b(int, byte[])>
	//   41   63:iadd            
	//   42   64:istore_1        
		return i;
	//   43   65:iload_1         
	//   44   66:ireturn         
	}

	public final awp a(awg awg1)
	{
		return ((awp) (b(awg1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #99  <Method ayl b(awg)>
	//    3    5:areturn         
	}

	public final void a(awh awh1)
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Integer a>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          18
			awh1.a(1, ((Integer) (obj)).intValue());
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #85  <Method int Integer.intValue()>
	//    9   15:invokevirtual   #103 <Method void awh.a(int, int)>
		obj = ((Object) (b));
	//   10   18:aload_0         
	//   11   19:getfield        #18  <Field String b>
	//   12   22:astore_2        
		if(obj != null)
	//*  13   23:aload_2         
	//*  14   24:ifnull          33
			awh1.a(2, ((String) (obj)));
	//   15   27:aload_1         
	//   16   28:iconst_2        
	//   17   29:aload_2         
	//   18   30:invokevirtual   #106 <Method void awh.a(int, String)>
		byte abyte0[] = c;
	//   19   33:aload_0         
	//   20   34:getfield        #20  <Field byte[] c>
	//   21   37:astore_2        
		if(abyte0 != null)
	//*  22   38:aload_2         
	//*  23   39:ifnull          48
			awh1.a(3, abyte0);
	//   24   42:aload_1         
	//   25   43:iconst_3        
	//   26   44:aload_2         
	//   27   45:invokevirtual   #109 <Method void awh.a(int, byte[])>
		super.a(awh1);
	//   28   48:aload_0         
	//   29   49:aload_1         
	//   30   50:invokespecial   #111 <Method void awj.a(awh)>
	//   31   53:return          
	}

	public Integer a;
	public String b;
	public byte c[];
}
