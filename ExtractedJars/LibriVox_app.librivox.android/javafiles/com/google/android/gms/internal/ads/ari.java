// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			arh, ark, aqh, aun, 
//			avm, aqq, atv, avw, 
//			avs

class ari extends arh
{

	ari(byte abyte0[], int i, int j)
	{
		super(((arn) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #15  <Method void arh(arn)>
		if(abyte0 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          91
		{
			int k = abyte0.length;
	//    5    9:aload_1         
	//    6   10:arraylength     
	//    7   11:istore          4
			int l = i + j;
	//    8   13:iload_2         
	//    9   14:iload_3         
	//   10   15:iadd            
	//   11   16:istore          5
			if((i | j | k - l) >= 0)
	//*  12   18:iload_2         
	//*  13   19:iload_3         
	//*  14   20:ior             
	//*  15   21:iload           4
	//*  16   23:iload           5
	//*  17   25:isub            
	//*  18   26:ior             
	//*  19   27:iflt            52
			{
				b = abyte0;
	//   20   30:aload_0         
	//   21   31:aload_1         
	//   22   32:putfield        #17  <Field byte[] b>
				c = i;
	//   23   35:aload_0         
	//   24   36:iload_2         
	//   25   37:putfield        #19  <Field int c>
				e = i;
	//   26   40:aload_0         
	//   27   41:iload_2         
	//   28   42:putfield        #21  <Field int e>
				d = l;
	//   29   45:aload_0         
	//   30   46:iload           5
	//   31   48:putfield        #23  <Field int d>
				return;
	//   32   51:return          
			} else
			{
				throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[] {
					Integer.valueOf(abyte0.length), Integer.valueOf(i), Integer.valueOf(j)
				}));
	//   33   52:new             #25  <Class IllegalArgumentException>
	//   34   55:dup             
	//   35   56:ldc1            #27  <String "Array range is invalid. Buffer.length=%d, offset=%d, length=%d">
	//   36   58:iconst_3        
	//   37   59:anewarray       Object[]
	//   38   62:dup             
	//   39   63:iconst_0        
	//   40   64:aload_1         
	//   41   65:arraylength     
	//   42   66:invokestatic    #35  <Method Integer Integer.valueOf(int)>
	//   43   69:aastore         
	//   44   70:dup             
	//   45   71:iconst_1        
	//   46   72:iload_2         
	//   47   73:invokestatic    #35  <Method Integer Integer.valueOf(int)>
	//   48   76:aastore         
	//   49   77:dup             
	//   50   78:iconst_2        
	//   51   79:iload_3         
	//   52   80:invokestatic    #35  <Method Integer Integer.valueOf(int)>
	//   53   83:aastore         
	//   54   84:invokestatic    #41  <Method String String.format(String, Object[])>
	//   55   87:invokespecial   #44  <Method void IllegalArgumentException(String)>
	//   56   90:athrow          
			}
		} else
		{
			throw new NullPointerException("buffer");
	//   57   91:new             #46  <Class NullPointerException>
	//   58   94:dup             
	//   59   95:ldc1            #48  <String "buffer">
	//   60   97:invokespecial   #49  <Method void NullPointerException(String)>
	//   61  100:athrow          
		}
	}

	public void a()
	{
	//    0    0:return          
	}

	public final void a(byte byte0)
	{
		int i;
		byte abyte0[];
		try
		{
			abyte0 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] b>
	//    2    4:astore_3        
			i = e;
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field int e>
	//    5    9:istore_2        
			e = i + 1;
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #21  <Field int e>
		}
	//*  11   17:aload_3         
	//*  12   18:iload_2         
	//*  13   19:iload_1         
	//*  14   20:bastore         
	//*  15   21:return          
		catch(IndexOutOfBoundsException indexoutofboundsexception)
	//*  16   22:astore_3        
		{
			throw new ark(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
				Integer.valueOf(e), Integer.valueOf(d), Integer.valueOf(1)
			}), ((Throwable) (indexoutofboundsexception)));
	//   17   23:new             #57  <Class ark>
	//   18   26:dup             
	//   19   27:ldc1            #59  <String "Pos: %d, limit: %d, len: %d">
	//   20   29:iconst_3        
	//   21   30:anewarray       Object[]
	//   22   33:dup             
	//   23   34:iconst_0        
	//   24   35:aload_0         
	//   25   36:getfield        #21  <Field int e>
	//   26   39:invokestatic    #35  <Method Integer Integer.valueOf(int)>
	//   27   42:aastore         
	//   28   43:dup             
	//   29   44:iconst_1        
	//   30   45:aload_0         
	//   31   46:getfield        #23  <Field int d>
	//   32   49:invokestatic    #35  <Method Integer Integer.valueOf(int)>
	//   33   52:aastore         
	//   34   53:dup             
	//   35   54:iconst_2        
	//   36   55:iconst_1        
	//   37   56:invokestatic    #35  <Method Integer Integer.valueOf(int)>
	//   38   59:aastore         
	//   39   60:invokestatic    #41  <Method String String.format(String, Object[])>
	//   40   63:aload_3         
	//   41   64:invokespecial   #62  <Method void ark(String, Throwable)>
	//   42   67:athrow          
		}
		abyte0[i] = byte0;
	}

	public final void a(int i)
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            10
		{
			((arh)this).b(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #65  <Method void arh.b(int)>
			return;
	//    5    9:return          
		} else
		{
			((arh)this).a(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:i2l             
	//    9   13:invokevirtual   #68  <Method void arh.a(long)>
			return;
	//   10   16:return          
		}
	}

	public final void a(int i, int j)
	{
		((arh)this).b(i << 3 | j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_3        
	//    3    3:ishl            
	//    4    4:iload_2         
	//    5    5:ior             
	//    6    6:invokevirtual   #65  <Method void arh.b(int)>
	//    7    9:return          
	}

	public final void a(int i, long l)
	{
		((arh)this).a(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #72  <Method void arh.a(int, int)>
		((arh)this).a(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #68  <Method void arh.a(long)>
	//    7   11:return          
	}

	public final void a(int i, aqq aqq1)
	{
		((arh)this).a(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #72  <Method void arh.a(int, int)>
		((arh)this).a(aqq1);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #76  <Method void arh.a(aqq)>
	//    7   11:return          
	}

	public final void a(int i, atv atv1)
	{
		((arh)this).a(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #72  <Method void arh.a(int, int)>
		((arh)this).a(atv1);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #80  <Method void arh.a(atv)>
	//    7   11:return          
	}

	final void a(int i, atv atv1, aun aun1)
	{
		((arh)this).a(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #72  <Method void arh.a(int, int)>
		aqh aqh1 = (aqh)atv1;
	//    4    6:aload_2         
	//    5    7:checkcast       #83  <Class aqh>
	//    6   10:astore          5
		int j = aqh1.j();
	//    7   12:aload           5
	//    8   14:invokevirtual   #87  <Method int aqh.j()>
	//    9   17:istore          4
		i = j;
	//   10   19:iload           4
	//   11   21:istore_1        
		if(j == -1)
	//*  12   22:iload           4
	//*  13   24:iconst_m1       
	//*  14   25:icmpne          43
		{
			i = aun1.b(((Object) (aqh1)));
	//   15   28:aload_3         
	//   16   29:aload           5
	//   17   31:invokeinterface #92  <Method int aun.b(Object)>
	//   18   36:istore_1        
			aqh1.a(i);
	//   19   37:aload           5
	//   20   39:iload_1         
	//   21   40:invokevirtual   #94  <Method void aqh.a(int)>
		}
		((arh)this).b(i);
	//   22   43:aload_0         
	//   23   44:iload_1         
	//   24   45:invokevirtual   #65  <Method void arh.b(int)>
		aun1.a(((Object) (atv1)), ((awf) (a)));
	//   25   48:aload_3         
	//   26   49:aload_2         
	//   27   50:aload_0         
	//   28   51:getfield        #97  <Field aro a>
	//   29   54:invokeinterface #100 <Method void aun.a(Object, awf)>
	//   30   59:return          
	}

	public final void a(int i, String s)
	{
		((arh)this).a(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #72  <Method void arh.a(int, int)>
		((arh)this).a(s);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #103 <Method void arh.a(String)>
	//    7   11:return          
	}

	public final void a(int i, boolean flag)
	{
		((arh)this).a(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #72  <Method void arh.a(int, int)>
		((arh)this).a((byte)flag);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:int2byte        
	//    7    9:invokevirtual   #106 <Method void arh.a(byte)>
	//    8   12:return          
	}

	public final void a(long l)
	{
		long l1;
		l1 = l;
	//    0    0:lload_1         
	//    1    1:lstore          4
		if(arh.d())
	//*   2    3:invokestatic    #109 <Method boolean arh.d()>
	//*   3    6:ifeq            103
		{
			l1 = l;
	//    4    9:lload_1         
	//    5   10:lstore          4
			if(((arh)this).b() >= 10)
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #111 <Method int arh.b()>
	//*   8   16:bipush          10
	//*   9   18:icmplt          103
				do
				{
					if((l & -128L) == 0L)
	//*  10   21:lload_1         
	//*  11   22:ldc2w           #112 <Long -128L>
	//*  12   25:land            
	//*  13   26:lconst_0        
	//*  14   27:lcmp            
	//*  15   28:ifne            60
					{
						byte abyte0[] = b;
	//   16   31:aload_0         
	//   17   32:getfield        #17  <Field byte[] b>
	//   18   35:astore          6
						int i = e;
	//   19   37:aload_0         
	//   20   38:getfield        #21  <Field int e>
	//   21   41:istore_3        
						e = i + 1;
	//   22   42:aload_0         
	//   23   43:iload_3         
	//   24   44:iconst_1        
	//   25   45:iadd            
	//   26   46:putfield        #21  <Field int e>
						avm.a(abyte0, i, (byte)(int)l);
	//   27   49:aload           6
	//   28   51:iload_3         
	//   29   52:i2l             
	//   30   53:lload_1         
	//   31   54:l2i             
	//   32   55:int2byte        
	//   33   56:invokestatic    #118 <Method void avm.a(byte[], long, byte)>
						return;
	//   34   59:return          
					}
					byte abyte1[] = b;
	//   35   60:aload_0         
	//   36   61:getfield        #17  <Field byte[] b>
	//   37   64:astore          6
					int j = e;
	//   38   66:aload_0         
	//   39   67:getfield        #21  <Field int e>
	//   40   70:istore_3        
					e = j + 1;
	//   41   71:aload_0         
	//   42   72:iload_3         
	//   43   73:iconst_1        
	//   44   74:iadd            
	//   45   75:putfield        #21  <Field int e>
					avm.a(abyte1, j, (byte)((int)l & 0x7f | 0x80));
	//   46   78:aload           6
	//   47   80:iload_3         
	//   48   81:i2l             
	//   49   82:lload_1         
	//   50   83:l2i             
	//   51   84:bipush          127
	//   52   86:iand            
	//   53   87:sipush          128
	//   54   90:ior             
	//   55   91:int2byte        
	//   56   92:invokestatic    #118 <Method void avm.a(byte[], long, byte)>
					l >>>= 7;
	//   57   95:lload_1         
	//   58   96:bipush          7
	//   59   98:lushr           
	//   60   99:lstore_1        
				} while(true);
	//   61  100:goto            21
		}
_L1:
		if((l1 & -128L) == 0L)
	//*  62  103:lload           4
	//*  63  105:ldc2w           #112 <Long -128L>
	//*  64  108:land            
	//*  65  109:lconst_0        
	//*  66  110:lcmp            
	//*  67  111:ifne            141
		{
			int k;
			byte abyte2[];
			try
			{
				abyte2 = b;
	//   68  114:aload_0         
	//   69  115:getfield        #17  <Field byte[] b>
	//   70  118:astore          6
				k = e;
	//   71  120:aload_0         
	//   72  121:getfield        #21  <Field int e>
	//   73  124:istore_3        
				e = k + 1;
	//   74  125:aload_0         
	//   75  126:iload_3         
	//   76  127:iconst_1        
	//   77  128:iadd            
	//   78  129:putfield        #21  <Field int e>
			}
	//*  79  132:aload           6
	//*  80  134:iload_3         
	//*  81  135:lload           4
	//*  82  137:l2i             
	//*  83  138:int2byte        
	//*  84  139:bastore         
	//*  85  140:return          
	//*  86  141:aload_0         
	//*  87  142:getfield        #17  <Field byte[] b>
	//*  88  145:astore          6
	//*  89  147:aload_0         
	//*  90  148:getfield        #21  <Field int e>
	//*  91  151:istore_3        
	//*  92  152:aload_0         
	//*  93  153:iload_3         
	//*  94  154:iconst_1        
	//*  95  155:iadd            
	//*  96  156:putfield        #21  <Field int e>
	//*  97  159:aload           6
	//*  98  161:iload_3         
	//*  99  162:lload           4
	//* 100  164:l2i             
	//* 101  165:bipush          127
	//* 102  167:iand            
	//* 103  168:sipush          128
	//* 104  171:ior             
	//* 105  172:int2byte        
	//* 106  173:bastore         
	//* 107  174:lload           4
	//* 108  176:bipush          7
	//* 109  178:lushr           
	//* 110  179:lstore          4
	//* 111  181:goto            103
			catch(IndexOutOfBoundsException indexoutofboundsexception)
	//* 112  184:astore          6
			{
				throw new ark(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
					Integer.valueOf(e), Integer.valueOf(d), Integer.valueOf(1)
				}), ((Throwable) (indexoutofboundsexception)));
	//  113  186:new             #57  <Class ark>
	//  114  189:dup             
	//  115  190:ldc1            #59  <String "Pos: %d, limit: %d, len: %d">
	//  116  192:iconst_3        
	//  117  193:anewarray       Object[]
	//  118  196:dup             
	//  119  197:iconst_0        
	//  120  198:aload_0         
	//  121  199:getfield        #21  <Field int e>
	//  122  202:invokestatic    #35  <Method Integer Integer.valueOf(int)>
	//  123  205:aastore         
	//  124  206:dup             
	//  125  207:iconst_1        
	//  126  208:aload_0         
	//  127  209:getfield        #23  <Field int d>
	//  128  212:invokestatic    #35  <Method Integer Integer.valueOf(int)>
	//  129  215:aastore         
	//  130  216:dup             
	//  131  217:iconst_2        
	//  132  218:iconst_1        
	//  133  219:invokestatic    #35  <Method Integer Integer.valueOf(int)>
	//  134  222:aastore         
	//  135  223:invokestatic    #41  <Method String String.format(String, Object[])>
	//  136  226:aload           6
	//  137  228:invokespecial   #62  <Method void ark(String, Throwable)>
	//  138  231:athrow          
			}
			abyte2[k] = (byte)(int)l1;
			return;
		}
		abyte2 = b;
		k = e;
		e = k + 1;
		abyte2[k] = (byte)((int)l1 & 0x7f | 0x80);
		l1 >>>= 7;
		  goto _L1
	}

	public final void a(aqq aqq1)
	{
		((arh)this).b(aqq1.a());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #122 <Method int aqq.a()>
	//    3    5:invokevirtual   #65  <Method void arh.b(int)>
		aqq1.a(((aqp) (this)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #125 <Method void aqq.a(aqp)>
	//    7   13:return          
	}

	public final void a(atv atv1)
	{
		((arh)this).b(atv1.l());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #130 <Method int atv.l()>
	//    3    7:invokevirtual   #65  <Method void arh.b(int)>
		atv1.a(((arh) (this)));
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:invokeinterface #133 <Method void atv.a(arh)>
	//    7   17:return          
	}

	final void a(atv atv1, aun aun1)
	{
		aqh aqh1 = (aqh)atv1;
	//    0    0:aload_1         
	//    1    1:checkcast       #83  <Class aqh>
	//    2    4:astore          5
		int j = aqh1.j();
	//    3    6:aload           5
	//    4    8:invokevirtual   #87  <Method int aqh.j()>
	//    5   11:istore          4
		int i = j;
	//    6   13:iload           4
	//    7   15:istore_3        
		if(j == -1)
	//*   8   16:iload           4
	//*   9   18:iconst_m1       
	//*  10   19:icmpne          37
		{
			i = aun1.b(((Object) (aqh1)));
	//   11   22:aload_2         
	//   12   23:aload           5
	//   13   25:invokeinterface #92  <Method int aun.b(Object)>
	//   14   30:istore_3        
			aqh1.a(i);
	//   15   31:aload           5
	//   16   33:iload_3         
	//   17   34:invokevirtual   #94  <Method void aqh.a(int)>
		}
		((arh)this).b(i);
	//   18   37:aload_0         
	//   19   38:iload_3         
	//   20   39:invokevirtual   #65  <Method void arh.b(int)>
		aun1.a(((Object) (atv1)), ((awf) (a)));
	//   21   42:aload_2         
	//   22   43:aload_1         
	//   23   44:aload_0         
	//   24   45:getfield        #97  <Field aro a>
	//   25   48:invokeinterface #100 <Method void aun.a(Object, awf)>
	//   26   53:return          
	}

	public final void a(String s)
	{
		int i = e;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int e>
	//    2    4:istore_2        
		int j;
		int k;
		try
		{
			k = g(s.length() * 3);
	//    3    5:aload_1         
	//    4    6:invokevirtual   #139 <Method int String.length()>
	//    5    9:iconst_3        
	//    6   10:imul            
	//    7   11:invokestatic    #143 <Method int g(int)>
	//    8   14:istore          4
			j = g(s.length());
	//    9   16:aload_1         
	//   10   17:invokevirtual   #139 <Method int String.length()>
	//   11   20:invokestatic    #143 <Method int g(int)>
	//   12   23:istore_3        
		}
	//*  13   24:iload_3         
	//*  14   25:iload           4
	//*  15   27:icmpne          77
	//*  16   30:aload_0         
	//*  17   31:iload_2         
	//*  18   32:iload_3         
	//*  19   33:iadd            
	//*  20   34:putfield        #21  <Field int e>
	//*  21   37:aload_1         
	//*  22   38:aload_0         
	//*  23   39:getfield        #17  <Field byte[] b>
	//*  24   42:aload_0         
	//*  25   43:getfield        #21  <Field int e>
	//*  26   46:aload_0         
	//*  27   47:invokevirtual   #111 <Method int arh.b()>
	//*  28   50:invokestatic    #148 <Method int avs.a(CharSequence, byte[], int, int)>
	//*  29   53:istore          4
	//*  30   55:aload_0         
	//*  31   56:iload_2         
	//*  32   57:putfield        #21  <Field int e>
	//*  33   60:aload_0         
	//*  34   61:iload           4
	//*  35   63:iload_2         
	//*  36   64:isub            
	//*  37   65:iload_3         
	//*  38   66:isub            
	//*  39   67:invokevirtual   #65  <Method void arh.b(int)>
	//*  40   70:aload_0         
	//*  41   71:iload           4
	//*  42   73:putfield        #21  <Field int e>
	//*  43   76:return          
	//*  44   77:aload_0         
	//*  45   78:aload_1         
	//*  46   79:invokestatic    #151 <Method int avs.a(CharSequence)>
	//*  47   82:invokevirtual   #65  <Method void arh.b(int)>
	//*  48   85:aload_0         
	//*  49   86:aload_1         
	//*  50   87:aload_0         
	//*  51   88:getfield        #17  <Field byte[] b>
	//*  52   91:aload_0         
	//*  53   92:getfield        #21  <Field int e>
	//*  54   95:aload_0         
	//*  55   96:invokevirtual   #111 <Method int arh.b()>
	//*  56   99:invokestatic    #148 <Method int avs.a(CharSequence, byte[], int, int)>
	//*  57  102:putfield        #21  <Field int e>
	//*  58  105:return          
	//*  59  106:astore_1        
	//*  60  107:new             #57  <Class ark>
	//*  61  110:dup             
	//*  62  111:aload_1         
	//*  63  112:invokespecial   #154 <Method void ark(Throwable)>
	//*  64  115:athrow          
		catch(avw avw1)
	//*  65  116:astore          5
		{
			e = i;
	//   66  118:aload_0         
	//   67  119:iload_2         
	//   68  120:putfield        #21  <Field int e>
			((arh)this).a(s, avw1);
	//   69  123:aload_0         
	//   70  124:aload_1         
	//   71  125:aload           5
	//   72  127:invokevirtual   #157 <Method void arh.a(String, avw)>
			return;
	//   73  130:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new ark(((Throwable) (s)));
		}
		if(j != k)
			break MISSING_BLOCK_LABEL_77;
		e = i + j;
		k = avs.a(((CharSequence) (s)), b, e, ((arh)this).b());
		e = i;
		((arh)this).b(k - i - j);
		e = k;
		return;
		((arh)this).b(avs.a(((CharSequence) (s))));
		e = avs.a(((CharSequence) (s)), b, e, ((arh)this).b());
		return;
	}

	public final void a(byte abyte0[], int i, int j)
	{
		((arh)this).b(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #159 <Method void arh.b(byte[], int, int)>
	//    5    7:return          
	}

	public final int b()
	{
		return d - e;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int d>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field int e>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public final void b(int i)
	{
		int j;
		j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(arh.d())
	//*   2    2:invokestatic    #109 <Method boolean arh.d()>
	//*   3    5:ifeq            92
		{
			j = i;
	//    4    8:iload_1         
	//    5    9:istore_2        
			if(((arh)this).b() >= 10)
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #111 <Method int arh.b()>
	//*   8   14:bipush          10
	//*   9   16:icmplt          92
				do
				{
					if((i & 0xffffff80) == 0)
	//*  10   19:iload_1         
	//*  11   20:bipush          -128
	//*  12   22:iand            
	//*  13   23:ifne            52
					{
						byte abyte0[] = b;
	//   14   26:aload_0         
	//   15   27:getfield        #17  <Field byte[] b>
	//   16   30:astore_3        
						j = e;
	//   17   31:aload_0         
	//   18   32:getfield        #21  <Field int e>
	//   19   35:istore_2        
						e = j + 1;
	//   20   36:aload_0         
	//   21   37:iload_2         
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:putfield        #21  <Field int e>
						avm.a(abyte0, j, (byte)i);
	//   25   43:aload_3         
	//   26   44:iload_2         
	//   27   45:i2l             
	//   28   46:iload_1         
	//   29   47:int2byte        
	//   30   48:invokestatic    #118 <Method void avm.a(byte[], long, byte)>
						return;
	//   31   51:return          
					}
					byte abyte1[] = b;
	//   32   52:aload_0         
	//   33   53:getfield        #17  <Field byte[] b>
	//   34   56:astore_3        
					j = e;
	//   35   57:aload_0         
	//   36   58:getfield        #21  <Field int e>
	//   37   61:istore_2        
					e = j + 1;
	//   38   62:aload_0         
	//   39   63:iload_2         
	//   40   64:iconst_1        
	//   41   65:iadd            
	//   42   66:putfield        #21  <Field int e>
					avm.a(abyte1, j, (byte)(i & 0x7f | 0x80));
	//   43   69:aload_3         
	//   44   70:iload_2         
	//   45   71:i2l             
	//   46   72:iload_1         
	//   47   73:bipush          127
	//   48   75:iand            
	//   49   76:sipush          128
	//   50   79:ior             
	//   51   80:int2byte        
	//   52   81:invokestatic    #118 <Method void avm.a(byte[], long, byte)>
					i >>>= 7;
	//   53   84:iload_1         
	//   54   85:bipush          7
	//   55   87:iushr           
	//   56   88:istore_1        
				} while(true);
	//   57   89:goto            19
		}
_L1:
		if((j & 0xffffff80) == 0)
	//*  58   92:iload_2         
	//*  59   93:bipush          -128
	//*  60   95:iand            
	//*  61   96:ifne            122
		{
			byte abyte2[];
			try
			{
				abyte2 = b;
	//   62   99:aload_0         
	//   63  100:getfield        #17  <Field byte[] b>
	//   64  103:astore_3        
				i = e;
	//   65  104:aload_0         
	//   66  105:getfield        #21  <Field int e>
	//   67  108:istore_1        
				e = i + 1;
	//   68  109:aload_0         
	//   69  110:iload_1         
	//   70  111:iconst_1        
	//   71  112:iadd            
	//   72  113:putfield        #21  <Field int e>
			}
	//*  73  116:aload_3         
	//*  74  117:iload_1         
	//*  75  118:iload_2         
	//*  76  119:int2byte        
	//*  77  120:bastore         
	//*  78  121:return          
	//*  79  122:aload_0         
	//*  80  123:getfield        #17  <Field byte[] b>
	//*  81  126:astore_3        
	//*  82  127:aload_0         
	//*  83  128:getfield        #21  <Field int e>
	//*  84  131:istore_1        
	//*  85  132:aload_0         
	//*  86  133:iload_1         
	//*  87  134:iconst_1        
	//*  88  135:iadd            
	//*  89  136:putfield        #21  <Field int e>
	//*  90  139:aload_3         
	//*  91  140:iload_1         
	//*  92  141:iload_2         
	//*  93  142:bipush          127
	//*  94  144:iand            
	//*  95  145:sipush          128
	//*  96  148:ior             
	//*  97  149:int2byte        
	//*  98  150:bastore         
	//*  99  151:iload_2         
	//* 100  152:bipush          7
	//* 101  154:iushr           
	//* 102  155:istore_2        
	//* 103  156:goto            92
			catch(IndexOutOfBoundsException indexoutofboundsexception)
	//* 104  159:astore_3        
			{
				throw new ark(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
					Integer.valueOf(e), Integer.valueOf(d), Integer.valueOf(1)
				}), ((Throwable) (indexoutofboundsexception)));
	//  105  160:new             #57  <Class ark>
	//  106  163:dup             
	//  107  164:ldc1            #59  <String "Pos: %d, limit: %d, len: %d">
	//  108  166:iconst_3        
	//  109  167:anewarray       Object[]
	//  110  170:dup             
	//  111  171:iconst_0        
	//  112  172:aload_0         
	//  113  173:getfield        #21  <Field int e>
	//  114  176:invokestatic    #35  <Method Integer Integer.valueOf(int)>
	//  115  179:aastore         
	//  116  180:dup             
	//  117  181:iconst_1        
	//  118  182:aload_0         
	//  119  183:getfield        #23  <Field int d>
	//  120  186:invokestatic    #35  <Method Integer Integer.valueOf(int)>
	//  121  189:aastore         
	//  122  190:dup             
	//  123  191:iconst_2        
	//  124  192:iconst_1        
	//  125  193:invokestatic    #35  <Method Integer Integer.valueOf(int)>
	//  126  196:aastore         
	//  127  197:invokestatic    #41  <Method String String.format(String, Object[])>
	//  128  200:aload_3         
	//  129  201:invokespecial   #62  <Method void ark(String, Throwable)>
	//  130  204:athrow          
			}
			abyte2[i] = (byte)j;
			return;
		}
		abyte2 = b;
		i = e;
		e = i + 1;
		abyte2[i] = (byte)(j & 0x7f | 0x80);
		j >>>= 7;
		  goto _L1
	}

	public final void b(int i, int j)
	{
		((arh)this).a(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #72  <Method void arh.a(int, int)>
		((arh)this).a(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #160 <Method void arh.a(int)>
	//    7   11:return          
	}

	public final void b(int i, aqq aqq1)
	{
		((arh)this).a(1, 3);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #72  <Method void arh.a(int, int)>
		((arh)this).c(2, i);
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #162 <Method void arh.c(int, int)>
		((arh)this).a(3, aqq1);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:aload_2         
	//   11   15:invokevirtual   #164 <Method void arh.a(int, aqq)>
		((arh)this).a(1, 4);
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:iconst_4        
	//   15   21:invokevirtual   #72  <Method void arh.a(int, int)>
	//   16   24:return          
	}

	public final void b(int i, atv atv1)
	{
		((arh)this).a(1, 3);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #72  <Method void arh.a(int, int)>
		((arh)this).c(2, i);
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #162 <Method void arh.c(int, int)>
		((arh)this).a(3, atv1);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:aload_2         
	//   11   15:invokevirtual   #166 <Method void arh.a(int, atv)>
		((arh)this).a(1, 4);
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:iconst_4        
	//   15   21:invokevirtual   #72  <Method void arh.a(int, int)>
	//   16   24:return          
	}

	public final void b(byte abyte0[], int i, int j)
	{
		try
		{
			System.arraycopy(((Object) (abyte0)), i, ((Object) (b)), e, j);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:aload_0         
	//    3    3:getfield        #17  <Field byte[] b>
	//    4    6:aload_0         
	//    5    7:getfield        #21  <Field int e>
	//    6   10:iload_3         
	//    7   11:invokestatic    #172 <Method void System.arraycopy(Object, int, Object, int, int)>
			e = e + j;
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #21  <Field int e>
	//   11   19:iload_3         
	//   12   20:iadd            
	//   13   21:putfield        #21  <Field int e>
			return;
	//   14   24:return          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  15   25:astore_1        
		{
			throw new ark(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
				Integer.valueOf(e), Integer.valueOf(d), Integer.valueOf(j)
			}), ((Throwable) (abyte0)));
	//   16   26:new             #57  <Class ark>
	//   17   29:dup             
	//   18   30:ldc1            #59  <String "Pos: %d, limit: %d, len: %d">
	//   19   32:iconst_3        
	//   20   33:anewarray       Object[]
	//   21   36:dup             
	//   22   37:iconst_0        
	//   23   38:aload_0         
	//   24   39:getfield        #21  <Field int e>
	//   25   42:invokestatic    #35  <Method Integer Integer.valueOf(int)>
	//   26   45:aastore         
	//   27   46:dup             
	//   28   47:iconst_1        
	//   29   48:aload_0         
	//   30   49:getfield        #23  <Field int d>
	//   31   52:invokestatic    #35  <Method Integer Integer.valueOf(int)>
	//   32   55:aastore         
	//   33   56:dup             
	//   34   57:iconst_2        
	//   35   58:iload_3         
	//   36   59:invokestatic    #35  <Method Integer Integer.valueOf(int)>
	//   37   62:aastore         
	//   38   63:invokestatic    #41  <Method String String.format(String, Object[])>
	//   39   66:aload_1         
	//   40   67:invokespecial   #62  <Method void ark(String, Throwable)>
	//   41   70:athrow          
		}
	}

	public final void c(int i, int j)
	{
		((arh)this).a(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #72  <Method void arh.a(int, int)>
		((arh)this).b(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #65  <Method void arh.b(int)>
	//    7   11:return          
	}

	public final void c(int i, long l)
	{
		((arh)this).a(i, 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #72  <Method void arh.a(int, int)>
		((arh)this).c(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #174 <Method void arh.c(long)>
	//    7   11:return          
	}

	public final void c(long l)
	{
		int i;
		byte abyte0[];
		try
		{
			abyte0 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] b>
	//    2    4:astore          4
			i = e;
	//    3    6:aload_0         
	//    4    7:getfield        #21  <Field int e>
	//    5   10:istore_3        
			e = i + 1;
	//    6   11:aload_0         
	//    7   12:iload_3         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:putfield        #21  <Field int e>
		}
	//*  11   18:aload           4
	//*  12   20:iload_3         
	//*  13   21:lload_1         
	//*  14   22:l2i             
	//*  15   23:int2byte        
	//*  16   24:bastore         
	//*  17   25:aload_0         
	//*  18   26:getfield        #17  <Field byte[] b>
	//*  19   29:astore          4
	//*  20   31:aload_0         
	//*  21   32:getfield        #21  <Field int e>
	//*  22   35:istore_3        
	//*  23   36:aload_0         
	//*  24   37:iload_3         
	//*  25   38:iconst_1        
	//*  26   39:iadd            
	//*  27   40:putfield        #21  <Field int e>
	//*  28   43:aload           4
	//*  29   45:iload_3         
	//*  30   46:lload_1         
	//*  31   47:bipush          8
	//*  32   49:lshr            
	//*  33   50:l2i             
	//*  34   51:int2byte        
	//*  35   52:bastore         
	//*  36   53:aload_0         
	//*  37   54:getfield        #17  <Field byte[] b>
	//*  38   57:astore          4
	//*  39   59:aload_0         
	//*  40   60:getfield        #21  <Field int e>
	//*  41   63:istore_3        
	//*  42   64:aload_0         
	//*  43   65:iload_3         
	//*  44   66:iconst_1        
	//*  45   67:iadd            
	//*  46   68:putfield        #21  <Field int e>
	//*  47   71:aload           4
	//*  48   73:iload_3         
	//*  49   74:lload_1         
	//*  50   75:bipush          16
	//*  51   77:lshr            
	//*  52   78:l2i             
	//*  53   79:int2byte        
	//*  54   80:bastore         
	//*  55   81:aload_0         
	//*  56   82:getfield        #17  <Field byte[] b>
	//*  57   85:astore          4
	//*  58   87:aload_0         
	//*  59   88:getfield        #21  <Field int e>
	//*  60   91:istore_3        
	//*  61   92:aload_0         
	//*  62   93:iload_3         
	//*  63   94:iconst_1        
	//*  64   95:iadd            
	//*  65   96:putfield        #21  <Field int e>
	//*  66   99:aload           4
	//*  67  101:iload_3         
	//*  68  102:lload_1         
	//*  69  103:bipush          24
	//*  70  105:lshr            
	//*  71  106:l2i             
	//*  72  107:int2byte        
	//*  73  108:bastore         
	//*  74  109:aload_0         
	//*  75  110:getfield        #17  <Field byte[] b>
	//*  76  113:astore          4
	//*  77  115:aload_0         
	//*  78  116:getfield        #21  <Field int e>
	//*  79  119:istore_3        
	//*  80  120:aload_0         
	//*  81  121:iload_3         
	//*  82  122:iconst_1        
	//*  83  123:iadd            
	//*  84  124:putfield        #21  <Field int e>
	//*  85  127:aload           4
	//*  86  129:iload_3         
	//*  87  130:lload_1         
	//*  88  131:bipush          32
	//*  89  133:lshr            
	//*  90  134:l2i             
	//*  91  135:int2byte        
	//*  92  136:bastore         
	//*  93  137:aload_0         
	//*  94  138:getfield        #17  <Field byte[] b>
	//*  95  141:astore          4
	//*  96  143:aload_0         
	//*  97  144:getfield        #21  <Field int e>
	//*  98  147:istore_3        
	//*  99  148:aload_0         
	//* 100  149:iload_3         
	//* 101  150:iconst_1        
	//* 102  151:iadd            
	//* 103  152:putfield        #21  <Field int e>
	//* 104  155:aload           4
	//* 105  157:iload_3         
	//* 106  158:lload_1         
	//* 107  159:bipush          40
	//* 108  161:lshr            
	//* 109  162:l2i             
	//* 110  163:int2byte        
	//* 111  164:bastore         
	//* 112  165:aload_0         
	//* 113  166:getfield        #17  <Field byte[] b>
	//* 114  169:astore          4
	//* 115  171:aload_0         
	//* 116  172:getfield        #21  <Field int e>
	//* 117  175:istore_3        
	//* 118  176:aload_0         
	//* 119  177:iload_3         
	//* 120  178:iconst_1        
	//* 121  179:iadd            
	//* 122  180:putfield        #21  <Field int e>
	//* 123  183:aload           4
	//* 124  185:iload_3         
	//* 125  186:lload_1         
	//* 126  187:bipush          48
	//* 127  189:lshr            
	//* 128  190:l2i             
	//* 129  191:int2byte        
	//* 130  192:bastore         
	//* 131  193:aload_0         
	//* 132  194:getfield        #17  <Field byte[] b>
	//* 133  197:astore          4
	//* 134  199:aload_0         
	//* 135  200:getfield        #21  <Field int e>
	//* 136  203:istore_3        
	//* 137  204:aload_0         
	//* 138  205:iload_3         
	//* 139  206:iconst_1        
	//* 140  207:iadd            
	//* 141  208:putfield        #21  <Field int e>
	//* 142  211:aload           4
	//* 143  213:iload_3         
	//* 144  214:lload_1         
	//* 145  215:bipush          56
	//* 146  217:lshr            
	//* 147  218:l2i             
	//* 148  219:int2byte        
	//* 149  220:bastore         
	//* 150  221:return          
		catch(IndexOutOfBoundsException indexoutofboundsexception)
	//* 151  222:astore          4
		{
			throw new ark(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
				Integer.valueOf(e), Integer.valueOf(d), Integer.valueOf(1)
			}), ((Throwable) (indexoutofboundsexception)));
	//  152  224:new             #57  <Class ark>
	//  153  227:dup             
	//  154  228:ldc1            #59  <String "Pos: %d, limit: %d, len: %d">
	//  155  230:iconst_3        
	//  156  231:anewarray       Object[]
	//  157  234:dup             
	//  158  235:iconst_0        
	//  159  236:aload_0         
	//  160  237:getfield        #21  <Field int e>
	//  161  240:invokestatic    #35  <Method Integer Integer.valueOf(int)>
	//  162  243:aastore         
	//  163  244:dup             
	//  164  245:iconst_1        
	//  165  246:aload_0         
	//  166  247:getfield        #23  <Field int d>
	//  167  250:invokestatic    #35  <Method Integer Integer.valueOf(int)>
	//  168  253:aastore         
	//  169  254:dup             
	//  170  255:iconst_2        
	//  171  256:iconst_1        
	//  172  257:invokestatic    #35  <Method Integer Integer.valueOf(int)>
	//  173  260:aastore         
	//  174  261:invokestatic    #41  <Method String String.format(String, Object[])>
	//  175  264:aload           4
	//  176  266:invokespecial   #62  <Method void ark(String, Throwable)>
	//  177  269:athrow          
		}
		abyte0[i] = (byte)(int)l;
		abyte0 = b;
		i = e;
		e = i + 1;
		abyte0[i] = (byte)(int)(l >> 8);
		abyte0 = b;
		i = e;
		e = i + 1;
		abyte0[i] = (byte)(int)(l >> 16);
		abyte0 = b;
		i = e;
		e = i + 1;
		abyte0[i] = (byte)(int)(l >> 24);
		abyte0 = b;
		i = e;
		e = i + 1;
		abyte0[i] = (byte)(int)(l >> 32);
		abyte0 = b;
		i = e;
		e = i + 1;
		abyte0[i] = (byte)(int)(l >> 40);
		abyte0 = b;
		i = e;
		e = i + 1;
		abyte0[i] = (byte)(int)(l >> 48);
		abyte0 = b;
		i = e;
		e = i + 1;
		abyte0[i] = (byte)(int)(l >> 56);
		return;
	}

	public final void c(byte abyte0[], int i, int j)
	{
		((arh)this).b(j);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #65  <Method void arh.b(int)>
		((arh)this).b(abyte0, 0, j);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_0        
	//    6    8:iload_3         
	//    7    9:invokevirtual   #159 <Method void arh.b(byte[], int, int)>
	//    8   12:return          
	}

	public final void d(int i)
	{
		int j;
		byte abyte0[];
		try
		{
			abyte0 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] b>
	//    2    4:astore_3        
			j = e;
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field int e>
	//    5    9:istore_2        
			e = j + 1;
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #21  <Field int e>
		}
	//*  11   17:aload_3         
	//*  12   18:iload_2         
	//*  13   19:iload_1         
	//*  14   20:int2byte        
	//*  15   21:bastore         
	//*  16   22:aload_0         
	//*  17   23:getfield        #17  <Field byte[] b>
	//*  18   26:astore_3        
	//*  19   27:aload_0         
	//*  20   28:getfield        #21  <Field int e>
	//*  21   31:istore_2        
	//*  22   32:aload_0         
	//*  23   33:iload_2         
	//*  24   34:iconst_1        
	//*  25   35:iadd            
	//*  26   36:putfield        #21  <Field int e>
	//*  27   39:aload_3         
	//*  28   40:iload_2         
	//*  29   41:iload_1         
	//*  30   42:bipush          8
	//*  31   44:ishr            
	//*  32   45:int2byte        
	//*  33   46:bastore         
	//*  34   47:aload_0         
	//*  35   48:getfield        #17  <Field byte[] b>
	//*  36   51:astore_3        
	//*  37   52:aload_0         
	//*  38   53:getfield        #21  <Field int e>
	//*  39   56:istore_2        
	//*  40   57:aload_0         
	//*  41   58:iload_2         
	//*  42   59:iconst_1        
	//*  43   60:iadd            
	//*  44   61:putfield        #21  <Field int e>
	//*  45   64:aload_3         
	//*  46   65:iload_2         
	//*  47   66:iload_1         
	//*  48   67:bipush          16
	//*  49   69:ishr            
	//*  50   70:int2byte        
	//*  51   71:bastore         
	//*  52   72:aload_0         
	//*  53   73:getfield        #17  <Field byte[] b>
	//*  54   76:astore_3        
	//*  55   77:aload_0         
	//*  56   78:getfield        #21  <Field int e>
	//*  57   81:istore_2        
	//*  58   82:aload_0         
	//*  59   83:iload_2         
	//*  60   84:iconst_1        
	//*  61   85:iadd            
	//*  62   86:putfield        #21  <Field int e>
	//*  63   89:aload_3         
	//*  64   90:iload_2         
	//*  65   91:iload_1         
	//*  66   92:bipush          24
	//*  67   94:iushr           
	//*  68   95:int2byte        
	//*  69   96:bastore         
	//*  70   97:return          
		catch(IndexOutOfBoundsException indexoutofboundsexception)
	//*  71   98:astore_3        
		{
			throw new ark(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
				Integer.valueOf(e), Integer.valueOf(d), Integer.valueOf(1)
			}), ((Throwable) (indexoutofboundsexception)));
	//   72   99:new             #57  <Class ark>
	//   73  102:dup             
	//   74  103:ldc1            #59  <String "Pos: %d, limit: %d, len: %d">
	//   75  105:iconst_3        
	//   76  106:anewarray       Object[]
	//   77  109:dup             
	//   78  110:iconst_0        
	//   79  111:aload_0         
	//   80  112:getfield        #21  <Field int e>
	//   81  115:invokestatic    #35  <Method Integer Integer.valueOf(int)>
	//   82  118:aastore         
	//   83  119:dup             
	//   84  120:iconst_1        
	//   85  121:aload_0         
	//   86  122:getfield        #23  <Field int d>
	//   87  125:invokestatic    #35  <Method Integer Integer.valueOf(int)>
	//   88  128:aastore         
	//   89  129:dup             
	//   90  130:iconst_2        
	//   91  131:iconst_1        
	//   92  132:invokestatic    #35  <Method Integer Integer.valueOf(int)>
	//   93  135:aastore         
	//   94  136:invokestatic    #41  <Method String String.format(String, Object[])>
	//   95  139:aload_3         
	//   96  140:invokespecial   #62  <Method void ark(String, Throwable)>
	//   97  143:athrow          
		}
		abyte0[j] = (byte)i;
		abyte0 = b;
		j = e;
		e = j + 1;
		abyte0[j] = (byte)(i >> 8);
		abyte0 = b;
		j = e;
		e = j + 1;
		abyte0[j] = (byte)(i >> 16);
		abyte0 = b;
		j = e;
		e = j + 1;
		abyte0[j] = (byte)(i >>> 24);
		return;
	}

	public final int e()
	{
		return e - c;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int e>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field int c>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public final void e(int i, int j)
	{
		((arh)this).a(i, 5);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_5        
	//    3    3:invokevirtual   #72  <Method void arh.a(int, int)>
		((arh)this).d(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #176 <Method void arh.d(int)>
	//    7   11:return          
	}

	private final byte b[];
	private final int c;
	private final int d;
	private int e;
}
