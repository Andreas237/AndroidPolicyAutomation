// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			awo, asu, arc, ars, 
//			ash, awp, awt, awn, 
//			aug

public final class awg
{

	private awg(byte abyte0[], int i1, int j1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		h = 0x7fffffff;
	//    2    4:aload_0         
	//    3    5:ldc1            #25  <Int 0x7fffffff>
	//    4    7:putfield        #27  <Field int h>
		j = 64;
	//    5   10:aload_0         
	//    6   11:bipush          64
	//    7   13:putfield        #29  <Field int j>
		k = 0x4000000;
	//    8   16:aload_0         
	//    9   17:ldc1            #30  <Int 0x4000000>
	//   10   19:putfield        #32  <Field int k>
		a = abyte0;
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:putfield        #34  <Field byte[] a>
		b = i1;
	//   14   27:aload_0         
	//   15   28:iload_2         
	//   16   29:putfield        #36  <Field int b>
		j1 += i1;
	//   17   32:iload_3         
	//   18   33:iload_2         
	//   19   34:iadd            
	//   20   35:istore_3        
		d = j1;
	//   21   36:aload_0         
	//   22   37:iload_3         
	//   23   38:putfield        #38  <Field int d>
		c = j1;
	//   24   41:aload_0         
	//   25   42:iload_3         
	//   26   43:putfield        #40  <Field int c>
		f = i1;
	//   27   46:aload_0         
	//   28   47:iload_2         
	//   29   48:putfield        #42  <Field int f>
	//   30   51:return          
	}

	public static awg a(byte abyte0[], int i1, int j1)
	{
		return new awg(abyte0, 0, j1);
	//    0    0:new             #2   <Class awg>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:iload_2         
	//    5    7:invokespecial   #46  <Method void awg(byte[], int, int)>
	//    6   10:areturn         
	}

	private final void f(int i1)
	{
		if(i1 >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            54
		{
			int j1 = f;
	//    2    4:aload_0         
	//    3    5:getfield        #42  <Field int f>
	//    4    8:istore_2        
			int k1 = h;
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field int h>
	//    7   13:istore_3        
			if(j1 + i1 <= k1)
	//*   8   14:iload_2         
	//*   9   15:iload_1         
	//*  10   16:iadd            
	//*  11   17:iload_3         
	//*  12   18:icmpgt          43
			{
				if(i1 <= d - j1)
	//*  13   21:iload_1         
	//*  14   22:aload_0         
	//*  15   23:getfield        #38  <Field int d>
	//*  16   26:iload_2         
	//*  17   27:isub            
	//*  18   28:icmpgt          39
				{
					f = j1 + i1;
	//   19   31:aload_0         
	//   20   32:iload_2         
	//   21   33:iload_1         
	//   22   34:iadd            
	//   23   35:putfield        #42  <Field int f>
					return;
	//   24   38:return          
				} else
				{
					throw awo.a();
	//   25   39:invokestatic    #52  <Method awo awo.a()>
	//   26   42:athrow          
				}
			} else
			{
				f(k1 - j1);
	//   27   43:aload_0         
	//   28   44:iload_3         
	//   29   45:iload_2         
	//   30   46:isub            
	//   31   47:invokespecial   #54  <Method void f(int)>
				throw awo.a();
	//   32   50:invokestatic    #52  <Method awo awo.a()>
	//   33   53:athrow          
			}
		} else
		{
			throw awo.b();
	//   34   54:invokestatic    #56  <Method awo awo.b()>
	//   35   57:athrow          
		}
	}

	private final void k()
	{
		d = d + e;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #38  <Field int d>
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field int e>
	//    5    9:iadd            
	//    6   10:putfield        #38  <Field int d>
		int i1 = d;
	//    7   13:aload_0         
	//    8   14:getfield        #38  <Field int d>
	//    9   17:istore_1        
		int j1 = h;
	//   10   18:aload_0         
	//   11   19:getfield        #27  <Field int h>
	//   12   22:istore_2        
		if(i1 > j1)
	//*  13   23:iload_1         
	//*  14   24:iload_2         
	//*  15   25:icmple          46
		{
			e = i1 - j1;
	//   16   28:aload_0         
	//   17   29:iload_1         
	//   18   30:iload_2         
	//   19   31:isub            
	//   20   32:putfield        #58  <Field int e>
			d = i1 - e;
	//   21   35:aload_0         
	//   22   36:iload_1         
	//   23   37:aload_0         
	//   24   38:getfield        #58  <Field int e>
	//   25   41:isub            
	//   26   42:putfield        #38  <Field int d>
			return;
	//   27   45:return          
		} else
		{
			e = 0;
	//   28   46:aload_0         
	//   29   47:iconst_0        
	//   30   48:putfield        #58  <Field int e>
			return;
	//   31   51:return          
		}
	}

	private final byte l()
	{
		int i1 = f;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int f>
	//    2    4:istore_1        
		if(i1 != d)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #38  <Field int d>
	//*   6   10:icmpeq          29
		{
			byte abyte0[] = a;
	//    7   13:aload_0         
	//    8   14:getfield        #34  <Field byte[] a>
	//    9   17:astore_2        
			f = i1 + 1;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:iconst_1        
	//   13   21:iadd            
	//   14   22:putfield        #42  <Field int f>
			return abyte0[i1];
	//   15   25:aload_2         
	//   16   26:iload_1         
	//   17   27:baload          
	//   18   28:ireturn         
		} else
		{
			throw awo.a();
	//   19   29:invokestatic    #52  <Method awo awo.a()>
	//   20   32:athrow          
		}
	}

	public final int a()
	{
		if(f == d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field int f>
	//*   2    4:aload_0         
	//*   3    5:getfield        #38  <Field int d>
	//*   4    8:icmpne          18
		{
			g = 0;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #62  <Field int g>
			return 0;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		}
		g = g();
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:invokevirtual   #64  <Method int g()>
	//   13   23:putfield        #62  <Field int g>
		int i1 = g;
	//   14   26:aload_0         
	//   15   27:getfield        #62  <Field int g>
	//   16   30:istore_1        
		if(i1 != 0)
	//*  17   31:iload_1         
	//*  18   32:ifeq            37
			return i1;
	//   19   35:iload_1         
	//   20   36:ireturn         
		else
			throw new awo("Protocol message contained an invalid tag (zero).");
	//   21   37:new             #49  <Class awo>
	//   22   40:dup             
	//   23   41:ldc1            #66  <String "Protocol message contained an invalid tag (zero).">
	//   24   43:invokespecial   #69  <Method void awo(String)>
	//   25   46:athrow          
	}

	public final ash a(aug aug)
	{
		int i1;
		int j1;
		try
		{
			if(l == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field arc l>
	//*   2    4:ifnonnull       26
				l = arc.a(a, b, c);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field byte[] a>
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field int b>
	//    8   16:aload_0         
	//    9   17:getfield        #40  <Field int c>
	//   10   20:invokestatic    #79  <Method arc arc.a(byte[], int, int)>
	//   11   23:putfield        #74  <Field arc l>
			i1 = l.u();
	//   12   26:aload_0         
	//   13   27:getfield        #74  <Field arc l>
	//   14   30:invokevirtual   #82  <Method int arc.u()>
	//   15   33:istore_2        
			j1 = f - b;
	//   16   34:aload_0         
	//   17   35:getfield        #42  <Field int f>
	//   18   38:aload_0         
	//   19   39:getfield        #36  <Field int b>
	//   20   42:isub            
	//   21   43:istore_3        
		}
	//*  22   44:iload_2         
	//*  23   45:iload_3         
	//*  24   46:icmpgt          102
	//*  25   49:aload_0         
	//*  26   50:getfield        #74  <Field arc l>
	//*  27   53:iload_3         
	//*  28   54:iload_2         
	//*  29   55:isub            
	//*  30   56:invokevirtual   #83  <Method void arc.f(int)>
	//*  31   59:aload_0         
	//*  32   60:getfield        #74  <Field arc l>
	//*  33   63:aload_0         
	//*  34   64:getfield        #29  <Field int j>
	//*  35   67:aload_0         
	//*  36   68:getfield        #85  <Field int i>
	//*  37   71:isub            
	//*  38   72:invokevirtual   #88  <Method int arc.c(int)>
	//*  39   75:pop             
	//*  40   76:aload_0         
	//*  41   77:getfield        #74  <Field arc l>
	//*  42   80:aload_1         
	//*  43   81:invokestatic    #93  <Method ars ars.b()>
	//*  44   84:invokevirtual   #96  <Method atv arc.a(aug, ars)>
	//*  45   87:checkcast       #98  <Class ash>
	//*  46   90:astore_1        
	//*  47   91:aload_0         
	//*  48   92:aload_0         
	//*  49   93:getfield        #62  <Field int g>
	//*  50   96:invokevirtual   #101 <Method boolean b(int)>
	//*  51   99:pop             
	//*  52  100:aload_1         
	//*  53  101:areturn         
	//*  54  102:new             #103 <Class IOException>
	//*  55  105:dup             
	//*  56  106:ldc1            #105 <String "CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s">
	//*  57  108:iconst_2        
	//*  58  109:anewarray       Object[]
	//*  59  112:dup             
	//*  60  113:iconst_0        
	//*  61  114:iload_2         
	//*  62  115:invokestatic    #111 <Method Integer Integer.valueOf(int)>
	//*  63  118:aastore         
	//*  64  119:dup             
	//*  65  120:iconst_1        
	//*  66  121:iload_3         
	//*  67  122:invokestatic    #111 <Method Integer Integer.valueOf(int)>
	//*  68  125:aastore         
	//*  69  126:invokestatic    #117 <Method String String.format(String, Object[])>
	//*  70  129:invokespecial   #118 <Method void IOException(String)>
	//*  71  132:athrow          
		// Misplaced declaration of an exception variable
		catch(aug aug)
	//*  72  133:astore_1        
		{
			throw new awo("", ((Exception) (aug)));
	//   73  134:new             #49  <Class awo>
	//   74  137:dup             
	//   75  138:ldc1            #120 <String "">
	//   76  140:aload_1         
	//   77  141:invokespecial   #123 <Method void awo(String, Exception)>
	//   78  144:athrow          
		}
		if(i1 > j1)
			break MISSING_BLOCK_LABEL_102;
		l.f(j1 - i1);
		l.c(j - i);
		aug = ((aug) ((ash)l.a(aug, ars.b())));
		b(g);
		return ((ash) (aug));
		throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", new Object[] {
			Integer.valueOf(i1), Integer.valueOf(j1)
		}));
	}

	public final void a(int i1)
	{
		if(g == i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field int g>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		else
			throw new awo("Protocol message end-group tag did not match expected tag.");
	//    5    9:new             #49  <Class awo>
	//    6   12:dup             
	//    7   13:ldc1            #125 <String "Protocol message end-group tag did not match expected tag.">
	//    8   15:invokespecial   #69  <Method void awo(String)>
	//    9   18:athrow          
	}

	public final void a(awp awp1)
	{
		int i1 = g();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method int g()>
	//    2    4:istore_2        
		if(i < j)
	//*   3    5:aload_0         
	//*   4    6:getfield        #85  <Field int i>
	//*   5    9:aload_0         
	//*   6   10:getfield        #29  <Field int j>
	//*   7   13:icmpge          59
		{
			i1 = c(i1);
	//    8   16:aload_0         
	//    9   17:iload_2         
	//   10   18:invokevirtual   #127 <Method int c(int)>
	//   11   21:istore_2        
			i = i + 1;
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #85  <Field int i>
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #85  <Field int i>
			awp1.a(this);
	//   18   32:aload_1         
	//   19   33:aload_0         
	//   20   34:invokevirtual   #132 <Method awp awp.a(awg)>
	//   21   37:pop             
			a(0);
	//   22   38:aload_0         
	//   23   39:iconst_0        
	//   24   40:invokevirtual   #134 <Method void a(int)>
			i = i - 1;
	//   25   43:aload_0         
	//   26   44:aload_0         
	//   27   45:getfield        #85  <Field int i>
	//   28   48:iconst_1        
	//   29   49:isub            
	//   30   50:putfield        #85  <Field int i>
			d(i1);
	//   31   53:aload_0         
	//   32   54:iload_2         
	//   33   55:invokevirtual   #136 <Method void d(int)>
			return;
	//   34   58:return          
		} else
		{
			throw new awo("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
	//   35   59:new             #49  <Class awo>
	//   36   62:dup             
	//   37   63:ldc1            #138 <String "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.">
	//   38   65:invokespecial   #69  <Method void awo(String)>
	//   39   68:athrow          
		}
	}

	public final byte[] a(int i1, int j1)
	{
		if(j1 == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            8
		{
			return awt.e;
	//    2    4:getstatic       #143 <Field byte[] awt.e>
	//    3    7:areturn         
		} else
		{
			byte abyte0[] = new byte[j1];
	//    4    8:iload_2         
	//    5    9:newarray        byte[]
	//    6   11:astore          4
			int k1 = b;
	//    7   13:aload_0         
	//    8   14:getfield        #36  <Field int b>
	//    9   17:istore_3        
			System.arraycopy(((Object) (a)), k1 + i1, ((Object) (abyte0)), 0, j1);
	//   10   18:aload_0         
	//   11   19:getfield        #34  <Field byte[] a>
	//   12   22:iload_3         
	//   13   23:iload_1         
	//   14   24:iadd            
	//   15   25:aload           4
	//   16   27:iconst_0        
	//   17   28:iload_2         
	//   18   29:invokestatic    #149 <Method void System.arraycopy(Object, int, Object, int, int)>
			return abyte0;
	//   19   32:aload           4
	//   20   34:areturn         
		}
	}

	public final long b()
	{
		return h();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #152 <Method long h()>
	//    2    4:lreturn         
	}

	final void b(int i1, int j1)
	{
		int k1 = f;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int f>
	//    2    4:istore_3        
		int l1 = b;
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field int b>
	//    5    9:istore          4
		if(i1 <= k1 - l1)
	//*   6   11:iload_1         
	//*   7   12:iload_3         
	//*   8   13:iload           4
	//*   9   15:isub            
	//*  10   16:icmpgt          76
		{
			if(i1 >= 0)
	//*  11   19:iload_1         
	//*  12   20:iflt            37
			{
				f = l1 + i1;
	//   13   23:aload_0         
	//   14   24:iload           4
	//   15   26:iload_1         
	//   16   27:iadd            
	//   17   28:putfield        #42  <Field int f>
				g = j1;
	//   18   31:aload_0         
	//   19   32:iload_2         
	//   20   33:putfield        #62  <Field int g>
				return;
	//   21   36:return          
			} else
			{
				StringBuilder stringbuilder = new StringBuilder(24);
	//   22   37:new             #155 <Class StringBuilder>
	//   23   40:dup             
	//   24   41:bipush          24
	//   25   43:invokespecial   #157 <Method void StringBuilder(int)>
	//   26   46:astore          5
				stringbuilder.append("Bad position ");
	//   27   48:aload           5
	//   28   50:ldc1            #159 <String "Bad position ">
	//   29   52:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
				stringbuilder.append(i1);
	//   31   56:aload           5
	//   32   58:iload_1         
	//   33   59:invokevirtual   #166 <Method StringBuilder StringBuilder.append(int)>
	//   34   62:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   35   63:new             #168 <Class IllegalArgumentException>
	//   36   66:dup             
	//   37   67:aload           5
	//   38   69:invokevirtual   #172 <Method String StringBuilder.toString()>
	//   39   72:invokespecial   #173 <Method void IllegalArgumentException(String)>
	//   40   75:athrow          
			}
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder(50);
	//   41   76:new             #155 <Class StringBuilder>
	//   42   79:dup             
	//   43   80:bipush          50
	//   44   82:invokespecial   #157 <Method void StringBuilder(int)>
	//   45   85:astore          5
			stringbuilder1.append("Position ");
	//   46   87:aload           5
	//   47   89:ldc1            #175 <String "Position ">
	//   48   91:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//   49   94:pop             
			stringbuilder1.append(i1);
	//   50   95:aload           5
	//   51   97:iload_1         
	//   52   98:invokevirtual   #166 <Method StringBuilder StringBuilder.append(int)>
	//   53  101:pop             
			stringbuilder1.append(" is beyond current ");
	//   54  102:aload           5
	//   55  104:ldc1            #177 <String " is beyond current ">
	//   56  106:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//   57  109:pop             
			stringbuilder1.append(k1 - l1);
	//   58  110:aload           5
	//   59  112:iload_3         
	//   60  113:iload           4
	//   61  115:isub            
	//   62  116:invokevirtual   #166 <Method StringBuilder StringBuilder.append(int)>
	//   63  119:pop             
			throw new IllegalArgumentException(stringbuilder1.toString());
	//   64  120:new             #168 <Class IllegalArgumentException>
	//   65  123:dup             
	//   66  124:aload           5
	//   67  126:invokevirtual   #172 <Method String StringBuilder.toString()>
	//   68  129:invokespecial   #173 <Method void IllegalArgumentException(String)>
	//   69  132:athrow          
		}
	}

	public final boolean b(int i1)
	{
		switch(i1 & 7)
	//*   0    0:iload_1         
	//*   1    1:bipush          7
	//*   2    3:iand            
		{
	//*   3    4:tableswitch     0 5: default 44
	//	               0 160
	//	               1 118
	//	               2 108
	//	               3 78
	//	               4 76
	//	               5 54
		default:
			throw new awo("Protocol message tag had invalid wire type.");
	//    4   44:new             #49  <Class awo>
	//    5   47:dup             
	//    6   48:ldc1            #179 <String "Protocol message tag had invalid wire type.">
	//    7   50:invokespecial   #69  <Method void awo(String)>
	//    8   53:athrow          

		case 5: // '\005'
			l();
	//    9   54:aload_0         
	//   10   55:invokespecial   #181 <Method byte l()>
	//   11   58:pop             
			l();
	//   12   59:aload_0         
	//   13   60:invokespecial   #181 <Method byte l()>
	//   14   63:pop             
			l();
	//   15   64:aload_0         
	//   16   65:invokespecial   #181 <Method byte l()>
	//   17   68:pop             
			l();
	//   18   69:aload_0         
	//   19   70:invokespecial   #181 <Method byte l()>
	//   20   73:pop             
			return true;
	//   21   74:iconst_1        
	//   22   75:ireturn         

		case 4: // '\004'
			return false;
	//   23   76:iconst_0        
	//   24   77:ireturn         

		case 3: // '\003'
			int j1;
			do
				j1 = a();
	//   25   78:aload_0         
	//   26   79:invokevirtual   #183 <Method int a()>
	//   27   82:istore_2        
			while(j1 != 0 && b(j1));
	//   28   83:iload_2         
	//   29   84:ifeq            95
	//   30   87:aload_0         
	//   31   88:iload_2         
	//   32   89:invokevirtual   #101 <Method boolean b(int)>
	//   33   92:ifne            78
			a((i1 >>> 3) << 3 | 4);
	//   34   95:aload_0         
	//   35   96:iload_1         
	//   36   97:iconst_3        
	//   37   98:iushr           
	//   38   99:iconst_3        
	//   39  100:ishl            
	//   40  101:iconst_4        
	//   41  102:ior             
	//   42  103:invokevirtual   #134 <Method void a(int)>
			return true;
	//   43  106:iconst_1        
	//   44  107:ireturn         

		case 2: // '\002'
			f(g());
	//   45  108:aload_0         
	//   46  109:aload_0         
	//   47  110:invokevirtual   #64  <Method int g()>
	//   48  113:invokespecial   #54  <Method void f(int)>
			return true;
	//   49  116:iconst_1        
	//   50  117:ireturn         

		case 1: // '\001'
			l();
	//   51  118:aload_0         
	//   52  119:invokespecial   #181 <Method byte l()>
	//   53  122:pop             
			l();
	//   54  123:aload_0         
	//   55  124:invokespecial   #181 <Method byte l()>
	//   56  127:pop             
			l();
	//   57  128:aload_0         
	//   58  129:invokespecial   #181 <Method byte l()>
	//   59  132:pop             
			l();
	//   60  133:aload_0         
	//   61  134:invokespecial   #181 <Method byte l()>
	//   62  137:pop             
			l();
	//   63  138:aload_0         
	//   64  139:invokespecial   #181 <Method byte l()>
	//   65  142:pop             
			l();
	//   66  143:aload_0         
	//   67  144:invokespecial   #181 <Method byte l()>
	//   68  147:pop             
			l();
	//   69  148:aload_0         
	//   70  149:invokespecial   #181 <Method byte l()>
	//   71  152:pop             
			l();
	//   72  153:aload_0         
	//   73  154:invokespecial   #181 <Method byte l()>
	//   74  157:pop             
			return true;
	//   75  158:iconst_1        
	//   76  159:ireturn         

		case 0: // '\0'
			g();
	//   77  160:aload_0         
	//   78  161:invokevirtual   #64  <Method int g()>
	//   79  164:pop             
			return true;
	//   80  165:iconst_1        
	//   81  166:ireturn         
		}
	}

	public final int c()
	{
		return g();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method int g()>
	//    2    4:ireturn         
	}

	public final int c(int i1)
	{
		if(i1 >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            36
		{
			i1 += f;
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #42  <Field int f>
	//    5    9:iadd            
	//    6   10:istore_1        
			int j1 = h;
	//    7   11:aload_0         
	//    8   12:getfield        #27  <Field int h>
	//    9   15:istore_2        
			if(i1 <= j1)
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpgt          32
			{
				h = i1;
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:putfield        #27  <Field int h>
				k();
	//   16   26:aload_0         
	//   17   27:invokespecial   #185 <Method void k()>
				return j1;
	//   18   30:iload_2         
	//   19   31:ireturn         
			} else
			{
				throw awo.a();
	//   20   32:invokestatic    #52  <Method awo awo.a()>
	//   21   35:athrow          
			}
		} else
		{
			throw awo.b();
	//   22   36:invokestatic    #56  <Method awo awo.b()>
	//   23   39:athrow          
		}
	}

	public final void d(int i1)
	{
		h = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field int h>
		k();
	//    3    5:aload_0         
	//    4    6:invokespecial   #185 <Method void k()>
	//    5    9:return          
	}

	public final boolean d()
	{
		return g() != 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method int g()>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final String e()
	{
		int i1 = g();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method int g()>
	//    2    4:istore_1        
		if(i1 >= 0)
	//*   3    5:iload_1         
	//*   4    6:iflt            61
		{
			int j1 = d;
	//    5    9:aload_0         
	//    6   10:getfield        #38  <Field int d>
	//    7   13:istore_2        
			int k1 = f;
	//    8   14:aload_0         
	//    9   15:getfield        #42  <Field int f>
	//   10   18:istore_3        
			if(i1 <= j1 - k1)
	//*  11   19:iload_1         
	//*  12   20:iload_2         
	//*  13   21:iload_3         
	//*  14   22:isub            
	//*  15   23:icmpgt          57
			{
				String s = new String(a, k1, i1, awn.a);
	//   16   26:new             #113 <Class String>
	//   17   29:dup             
	//   18   30:aload_0         
	//   19   31:getfield        #34  <Field byte[] a>
	//   20   34:iload_3         
	//   21   35:iload_1         
	//   22   36:getstatic       #191 <Field java.nio.charset.Charset awn.a>
	//   23   39:invokespecial   #194 <Method void String(byte[], int, int, java.nio.charset.Charset)>
	//   24   42:astore          4
				f = f + i1;
	//   25   44:aload_0         
	//   26   45:aload_0         
	//   27   46:getfield        #42  <Field int f>
	//   28   49:iload_1         
	//   29   50:iadd            
	//   30   51:putfield        #42  <Field int f>
				return s;
	//   31   54:aload           4
	//   32   56:areturn         
			} else
			{
				throw awo.a();
	//   33   57:invokestatic    #52  <Method awo awo.a()>
	//   34   60:athrow          
			}
		} else
		{
			throw awo.b();
	//   35   61:invokestatic    #56  <Method awo awo.b()>
	//   36   64:athrow          
		}
	}

	public final void e(int i1)
	{
		b(i1, g);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #62  <Field int g>
	//    4    6:invokevirtual   #196 <Method void b(int, int)>
	//    5    9:return          
	}

	public final byte[] f()
	{
		int i1 = g();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method int g()>
	//    2    4:istore_1        
		if(i1 >= 0)
	//*   3    5:iload_1         
	//*   4    6:iflt            68
		{
			if(i1 == 0)
	//*   5    9:iload_1         
	//*   6   10:ifne            17
				return awt.e;
	//    7   13:getstatic       #143 <Field byte[] awt.e>
	//    8   16:areturn         
			int j1 = d;
	//    9   17:aload_0         
	//   10   18:getfield        #38  <Field int d>
	//   11   21:istore_2        
			int k1 = f;
	//   12   22:aload_0         
	//   13   23:getfield        #42  <Field int f>
	//   14   26:istore_3        
			if(i1 <= j1 - k1)
	//*  15   27:iload_1         
	//*  16   28:iload_2         
	//*  17   29:iload_3         
	//*  18   30:isub            
	//*  19   31:icmpgt          64
			{
				byte abyte0[] = new byte[i1];
	//   20   34:iload_1         
	//   21   35:newarray        byte[]
	//   22   37:astore          4
				System.arraycopy(((Object) (a)), k1, ((Object) (abyte0)), 0, i1);
	//   23   39:aload_0         
	//   24   40:getfield        #34  <Field byte[] a>
	//   25   43:iload_3         
	//   26   44:aload           4
	//   27   46:iconst_0        
	//   28   47:iload_1         
	//   29   48:invokestatic    #149 <Method void System.arraycopy(Object, int, Object, int, int)>
				f = f + i1;
	//   30   51:aload_0         
	//   31   52:aload_0         
	//   32   53:getfield        #42  <Field int f>
	//   33   56:iload_1         
	//   34   57:iadd            
	//   35   58:putfield        #42  <Field int f>
				return abyte0;
	//   36   61:aload           4
	//   37   63:areturn         
			} else
			{
				throw awo.a();
	//   38   64:invokestatic    #52  <Method awo awo.a()>
	//   39   67:athrow          
			}
		} else
		{
			throw awo.b();
	//   40   68:invokestatic    #56  <Method awo awo.b()>
	//   41   71:athrow          
		}
	}

	public final int g()
	{
		int i1 = ((int) (l()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #181 <Method byte l()>
	//    2    4:istore_1        
		if(i1 >= 0)
	//*   3    5:iload_1         
	//*   4    6:iflt            11
			return i1;
	//    5    9:iload_1         
	//    6   10:ireturn         
		i1 &= 0x7f;
	//    7   11:iload_1         
	//    8   12:bipush          127
	//    9   14:iand            
	//   10   15:istore_1        
		int k1 = ((int) (l()));
	//   11   16:aload_0         
	//   12   17:invokespecial   #181 <Method byte l()>
	//   13   20:istore_2        
		if(k1 >= 0)
	//*  14   21:iload_2         
	//*  15   22:iflt            32
			return i1 | k1 << 7;
	//   16   25:iload_1         
	//   17   26:iload_2         
	//   18   27:bipush          7
	//   19   29:ishl            
	//   20   30:ior             
	//   21   31:ireturn         
		i1 |= (k1 & 0x7f) << 7;
	//   22   32:iload_1         
	//   23   33:iload_2         
	//   24   34:bipush          127
	//   25   36:iand            
	//   26   37:bipush          7
	//   27   39:ishl            
	//   28   40:ior             
	//   29   41:istore_1        
		k1 = ((int) (l()));
	//   30   42:aload_0         
	//   31   43:invokespecial   #181 <Method byte l()>
	//   32   46:istore_2        
		if(k1 >= 0)
	//*  33   47:iload_2         
	//*  34   48:iflt            58
			return i1 | k1 << 14;
	//   35   51:iload_1         
	//   36   52:iload_2         
	//   37   53:bipush          14
	//   38   55:ishl            
	//   39   56:ior             
	//   40   57:ireturn         
		k1 = i1 | (k1 & 0x7f) << 14;
	//   41   58:iload_1         
	//   42   59:iload_2         
	//   43   60:bipush          127
	//   44   62:iand            
	//   45   63:bipush          14
	//   46   65:ishl            
	//   47   66:ior             
	//   48   67:istore_2        
		byte byte0 = l();
	//   49   68:aload_0         
	//   50   69:invokespecial   #181 <Method byte l()>
	//   51   72:istore_3        
		if(byte0 >= 0)
	//*  52   73:iload_3         
	//*  53   74:iflt            84
			return k1 | byte0 << 21;
	//   54   77:iload_2         
	//   55   78:iload_3         
	//   56   79:bipush          21
	//   57   81:ishl            
	//   58   82:ior             
	//   59   83:ireturn         
		i1 = ((int) (l()));
	//   60   84:aload_0         
	//   61   85:invokespecial   #181 <Method byte l()>
	//   62   88:istore_1        
		k1 = k1 | (byte0 & 0x7f) << 21 | i1 << 28;
	//   63   89:iload_2         
	//   64   90:iload_3         
	//   65   91:bipush          127
	//   66   93:iand            
	//   67   94:bipush          21
	//   68   96:ishl            
	//   69   97:ior             
	//   70   98:iload_1         
	//   71   99:bipush          28
	//   72  101:ishl            
	//   73  102:ior             
	//   74  103:istore_2        
		if(i1 < 0)
	//*  75  104:iload_1         
	//*  76  105:ifge            135
		{
			for(int j1 = 0; j1 < 5; j1++)
	//*  77  108:iconst_0        
	//*  78  109:istore_1        
	//*  79  110:iload_1         
	//*  80  111:iconst_5        
	//*  81  112:icmpge          131
				if(l() >= 0)
	//*  82  115:aload_0         
	//*  83  116:invokespecial   #181 <Method byte l()>
	//*  84  119:iflt            124
					return k1;
	//   85  122:iload_2         
	//   86  123:ireturn         

	//   87  124:iload_1         
	//   88  125:iconst_1        
	//   89  126:iadd            
	//   90  127:istore_1        
	//*  91  128:goto            110
			throw awo.c();
	//   92  131:invokestatic    #199 <Method awo awo.c()>
	//   93  134:athrow          
		} else
		{
			return k1;
	//   94  135:iload_2         
	//   95  136:ireturn         
		}
	}

	public final long h()
	{
		int i1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		long l1 = 0L;
	//    2    2:lconst_0        
	//    3    3:lstore_3        
		for(; i1 < 64; i1 += 7)
	//*   4    4:iload_1         
	//*   5    5:bipush          64
	//*   6    7:icmpge          43
		{
			byte byte0 = l();
	//    7   10:aload_0         
	//    8   11:invokespecial   #181 <Method byte l()>
	//    9   14:istore_2        
			l1 |= (long)(byte0 & 0x7f) << i1;
	//   10   15:lload_3         
	//   11   16:iload_2         
	//   12   17:bipush          127
	//   13   19:iand            
	//   14   20:i2l             
	//   15   21:iload_1         
	//   16   22:lshl            
	//   17   23:lor             
	//   18   24:lstore_3        
			if((byte0 & 0x80) == 0)
	//*  19   25:iload_2         
	//*  20   26:sipush          128
	//*  21   29:iand            
	//*  22   30:ifne            35
				return l1;
	//   23   33:lload_3         
	//   24   34:lreturn         
		}

	//   25   35:iload_1         
	//   26   36:bipush          7
	//   27   38:iadd            
	//   28   39:istore_1        
	//*  29   40:goto            4
		throw awo.c();
	//   30   43:invokestatic    #199 <Method awo awo.c()>
	//   31   46:athrow          
	}

	public final int i()
	{
		int i1 = h;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int h>
	//    2    4:istore_1        
		if(i1 == 0x7fffffff)
	//*   3    5:iload_1         
	//*   4    6:ldc1            #25  <Int 0x7fffffff>
	//*   5    8:icmpne          13
			return -1;
	//    6   11:iconst_m1       
	//    7   12:ireturn         
		else
			return i1 - f;
	//    8   13:iload_1         
	//    9   14:aload_0         
	//   10   15:getfield        #42  <Field int f>
	//   11   18:isub            
	//   12   19:ireturn         
	}

	public final int j()
	{
		return f - b;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int f>
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field int b>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	private final byte a[];
	private final int b;
	private final int c;
	private int d;
	private int e;
	private int f;
	private int g;
	private int h;
	private int i;
	private int j;
	private int k;
	private arc l;
}
