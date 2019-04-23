// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			awj, awt, awg, ajg, 
//			awh, awp

public final class atj extends awj
{

	public atj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void awj()>
		a = awt.d;
	//    2    4:aload_0         
	//    3    5:getstatic       #19  <Field byte[][] awt.d>
	//    4    8:putfield        #21  <Field byte[][] a>
		b = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #23  <Field byte[] b>
		aa = -1;
	//    8   16:aload_0         
	//    9   17:iconst_m1       
	//   10   18:putfield        #27  <Field int aa>
	//   11   21:return          
	}

	private final atj b(awg awg1)
	{
		IllegalArgumentException illegalargumentexception;
		do
		{
			int i = awg1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #36  <Method int awg.a()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            230
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          129
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          118
				{
					if(i != 24)
	//*  11   21:iload_2         
	//*  12   22:bipush          24
	//*  13   24:icmpeq          81
					{
						if(i != 32)
	//*  14   27:iload_2         
	//*  15   28:bipush          32
	//*  16   30:icmpeq          44
						{
							if(!super.a(awg1, i))
	//*  17   33:aload_0         
	//*  18   34:aload_1         
	//*  19   35:iload_2         
	//*  20   36:invokespecial   #39  <Method boolean awj.a(awg, int)>
	//*  21   39:ifne            0
								return this;
	//   22   42:aload_0         
	//   23   43:areturn         
						} else
						{
							int k = awg1.j();
	//   24   44:aload_1         
	//   25   45:invokevirtual   #42  <Method int awg.j()>
	//   26   48:istore_3        
							try
							{
								c = Integer.valueOf(ajg.c(awg1.g()));
	//   27   49:aload_0         
	//   28   50:aload_1         
	//   29   51:invokevirtual   #45  <Method int awg.g()>
	//   30   54:invokestatic    #50  <Method int ajg.c(int)>
	//   31   57:invokestatic    #56  <Method Integer Integer.valueOf(int)>
	//   32   60:putfield        #58  <Field Integer c>
							}
	//*  33   63:goto            0
	//*  34   66:aload_1         
	//*  35   67:iload_3         
	//*  36   68:invokevirtual   #62  <Method void awg.e(int)>
	//*  37   71:aload_0         
	//*  38   72:aload_1         
	//*  39   73:iload_2         
	//*  40   74:invokevirtual   #39  <Method boolean awj.a(awg, int)>
	//*  41   77:pop             
	//*  42   78:goto            0
	//*  43   81:aload_1         
	//*  44   82:invokevirtual   #42  <Method int awg.j()>
	//*  45   85:istore_3        
	//*  46   86:aload_0         
	//*  47   87:aload_1         
	//*  48   88:invokevirtual   #45  <Method int awg.g()>
	//*  49   91:invokestatic    #64  <Method int ajg.b(int)>
	//*  50   94:invokestatic    #56  <Method Integer Integer.valueOf(int)>
	//*  51   97:putfield        #66  <Field Integer d>
	//*  52  100:goto            0
	//*  53  103:aload_1         
	//*  54  104:iload_3         
	//*  55  105:invokevirtual   #62  <Method void awg.e(int)>
	//*  56  108:aload_0         
	//*  57  109:aload_1         
	//*  58  110:iload_2         
	//*  59  111:invokevirtual   #39  <Method boolean awj.a(awg, int)>
	//*  60  114:pop             
	//*  61  115:goto            0
	//*  62  118:aload_0         
	//*  63  119:aload_1         
	//*  64  120:invokevirtual   #70  <Method byte[] awg.f()>
	//*  65  123:putfield        #23  <Field byte[] b>
	//*  66  126:goto            0
	//*  67  129:aload_1         
	//*  68  130:bipush          10
	//*  69  132:invokestatic    #73  <Method int awt.a(awg, int)>
	//*  70  135:istore_3        
	//*  71  136:aload_0         
	//*  72  137:getfield        #21  <Field byte[][] a>
	//*  73  140:astore          4
	//*  74  142:aload           4
	//*  75  144:ifnonnull       152
	//*  76  147:iconst_0        
	//*  77  148:istore_2        
	//*  78  149:goto            156
	//*  79  152:aload           4
	//*  80  154:arraylength     
	//*  81  155:istore_2        
	//*  82  156:iload_3         
	//*  83  157:iload_2         
	//*  84  158:iadd            
	//*  85  159:anewarray       byte[][]
	//*  86  162:astore          4
	//*  87  164:iload_2         
	//*  88  165:istore_3        
	//*  89  166:iload_2         
	//*  90  167:ifeq            184
	//*  91  170:aload_0         
	//*  92  171:getfield        #21  <Field byte[][] a>
	//*  93  174:iconst_0        
	//*  94  175:aload           4
	//*  95  177:iconst_0        
	//*  96  178:iload_2         
	//*  97  179:invokestatic    #80  <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  98  182:iload_2         
	//*  99  183:istore_3        
	//* 100  184:iload_3         
	//* 101  185:aload           4
	//* 102  187:arraylength     
	//* 103  188:iconst_1        
	//* 104  189:isub            
	//* 105  190:icmpge          213
	//* 106  193:aload           4
	//* 107  195:iload_3         
	//* 108  196:aload_1         
	//* 109  197:invokevirtual   #70  <Method byte[] awg.f()>
	//* 110  200:aastore         
	//* 111  201:aload_1         
	//* 112  202:invokevirtual   #36  <Method int awg.a()>
	//* 113  205:pop             
	//* 114  206:iload_3         
	//* 115  207:iconst_1        
	//* 116  208:iadd            
	//* 117  209:istore_3        
	//* 118  210:goto            184
	//* 119  213:aload           4
	//* 120  215:iload_3         
	//* 121  216:aload_1         
	//* 122  217:invokevirtual   #70  <Method byte[] awg.f()>
	//* 123  220:aastore         
	//* 124  221:aload_0         
	//* 125  222:aload           4
	//* 126  224:putfield        #21  <Field byte[][] a>
	//* 127  227:goto            0
	//* 128  230:aload_0         
	//* 129  231:areturn         
							// Misplaced declaration of an exception variable
							catch(IllegalArgumentException illegalargumentexception)
							{
								awg1.e(k);
								((awj)this).a(awg1, i);
							}
						}
					} else
					{
						int l = awg1.j();
						try
						{
							d = Integer.valueOf(ajg.b(awg1.g()));
						}
	//* 130  232:astore          4
	//* 131  234:goto            66
						// Misplaced declaration of an exception variable
						catch(IllegalArgumentException illegalargumentexception)
						{
							awg1.e(l);
							((awj)this).a(awg1, i);
						}
					}
				} else
				{
					b = awg1.f();
				}
			} else
			{
				int i1 = awt.a(awg1, 10);
				byte abyte0[][] = a;
				int j;
				if(abyte0 == null)
					j = 0;
				else
					j = abyte0.length;
				abyte0 = new byte[i1 + j][];
				i1 = j;
				if(j != 0)
				{
					System.arraycopy(((Object) (a)), 0, ((Object) (abyte0)), 0, j);
					i1 = j;
				}
				for(; i1 < abyte0.length - 1; i1++)
				{
					abyte0[i1] = awg1.f();
					awg1.a();
				}

				abyte0[i1] = awg1.f();
				a = abyte0;
			}
		} while(true);
		return this;
	//* 132  237:astore          4
	//* 133  239:goto            103
	}

	protected final int a()
	{
		int k1 = super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method int awj.a()>
	//    2    4:istore          6
		Object obj = ((Object) (a));
	//    3    6:aload_0         
	//    4    7:getfield        #21  <Field byte[][] a>
	//    5   10:astore          7
		int i = k1;
	//    6   12:iload           6
	//    7   14:istore_1        
		if(obj != null)
	//*   8   15:aload           7
	//*   9   17:ifnull          101
		{
			i = k1;
	//   10   20:iload           6
	//   11   22:istore_1        
			if(obj.length > 0)
	//*  12   23:aload           7
	//*  13   25:arraylength     
	//*  14   26:ifle            101
			{
				i = 0;
	//   15   29:iconst_0        
	//   16   30:istore_1        
				int j = 0;
	//   17   31:iconst_0        
	//   18   32:istore_2        
				int l = 0;
	//   19   33:iconst_0        
	//   20   34:istore_3        
				do
				{
					obj = ((Object) (a));
	//   21   35:aload_0         
	//   22   36:getfield        #21  <Field byte[][] a>
	//   23   39:astore          7
					if(i >= obj.length)
						break;
	//   24   41:iload_1         
	//   25   42:aload           7
	//   26   44:arraylength     
	//   27   45:icmpge          92
					obj = ((Object) (obj[i]));
	//   28   48:aload           7
	//   29   50:iload_1         
	//   30   51:aaload          
	//   31   52:astore          7
					int j1 = j;
	//   32   54:iload_2         
	//   33   55:istore          5
					int i1 = l;
	//   34   57:iload_3         
	//   35   58:istore          4
					if(obj != null)
	//*  36   60:aload           7
	//*  37   62:ifnull          79
					{
						i1 = l + 1;
	//   38   65:iload_3         
	//   39   66:iconst_1        
	//   40   67:iadd            
	//   41   68:istore          4
						j1 = j + awh.b(((byte []) (obj)));
	//   42   70:iload_2         
	//   43   71:aload           7
	//   44   73:invokestatic    #86  <Method int awh.b(byte[])>
	//   45   76:iadd            
	//   46   77:istore          5
					}
					i++;
	//   47   79:iload_1         
	//   48   80:iconst_1        
	//   49   81:iadd            
	//   50   82:istore_1        
					j = j1;
	//   51   83:iload           5
	//   52   85:istore_2        
					l = i1;
	//   53   86:iload           4
	//   54   88:istore_3        
				} while(true);
	//   55   89:goto            35
				i = k1 + j + l * 1;
	//   56   92:iload           6
	//   57   94:iload_2         
	//   58   95:iadd            
	//   59   96:iload_3         
	//   60   97:iconst_1        
	//   61   98:imul            
	//   62   99:iadd            
	//   63  100:istore_1        
			}
		}
		obj = ((Object) (b));
	//   64  101:aload_0         
	//   65  102:getfield        #23  <Field byte[] b>
	//   66  105:astore          7
		int k = i;
	//   67  107:iload_1         
	//   68  108:istore_2        
		if(obj != null)
	//*  69  109:aload           7
	//*  70  111:ifnull          123
			k = i + awh.b(2, ((byte []) (obj)));
	//   71  114:iload_1         
	//   72  115:iconst_2        
	//   73  116:aload           7
	//   74  118:invokestatic    #89  <Method int awh.b(int, byte[])>
	//   75  121:iadd            
	//   76  122:istore_2        
		obj = ((Object) (d));
	//   77  123:aload_0         
	//   78  124:getfield        #66  <Field Integer d>
	//   79  127:astore          7
		i = k;
	//   80  129:iload_2         
	//   81  130:istore_1        
		if(obj != null)
	//*  82  131:aload           7
	//*  83  133:ifnull          148
			i = k + awh.b(3, ((Integer) (obj)).intValue());
	//   84  136:iload_2         
	//   85  137:iconst_3        
	//   86  138:aload           7
	//   87  140:invokevirtual   #92  <Method int Integer.intValue()>
	//   88  143:invokestatic    #95  <Method int awh.b(int, int)>
	//   89  146:iadd            
	//   90  147:istore_1        
		obj = ((Object) (c));
	//   91  148:aload_0         
	//   92  149:getfield        #58  <Field Integer c>
	//   93  152:astore          7
		k = i;
	//   94  154:iload_1         
	//   95  155:istore_2        
		if(obj != null)
	//*  96  156:aload           7
	//*  97  158:ifnull          173
			k = i + awh.b(4, ((Integer) (obj)).intValue());
	//   98  161:iload_1         
	//   99  162:iconst_4        
	//  100  163:aload           7
	//  101  165:invokevirtual   #92  <Method int Integer.intValue()>
	//  102  168:invokestatic    #95  <Method int awh.b(int, int)>
	//  103  171:iadd            
	//  104  172:istore_2        
		return k;
	//  105  173:iload_2         
	//  106  174:ireturn         
	}

	public final awp a(awg awg1)
	{
		return ((awp) (b(awg1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #98  <Method atj b(awg)>
	//    3    5:areturn         
	}

	public final void a(awh awh1)
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field byte[][] a>
	//    2    4:astore_3        
		if(obj != null && obj.length > 0)
	//*   3    5:aload_3         
	//*   4    6:ifnull          48
	//*   5    9:aload_3         
	//*   6   10:arraylength     
	//*   7   11:ifle            48
		{
			int i = 0;
	//    8   14:iconst_0        
	//    9   15:istore_2        
			do
			{
				obj = ((Object) (a));
	//   10   16:aload_0         
	//   11   17:getfield        #21  <Field byte[][] a>
	//   12   20:astore_3        
				if(i >= obj.length)
					break;
	//   13   21:iload_2         
	//   14   22:aload_3         
	//   15   23:arraylength     
	//   16   24:icmpge          48
				obj = ((Object) (obj[i]));
	//   17   27:aload_3         
	//   18   28:iload_2         
	//   19   29:aaload          
	//   20   30:astore_3        
				if(obj != null)
	//*  21   31:aload_3         
	//*  22   32:ifnull          41
					awh1.a(1, ((byte []) (obj)));
	//   23   35:aload_1         
	//   24   36:iconst_1        
	//   25   37:aload_3         
	//   26   38:invokevirtual   #102 <Method void awh.a(int, byte[])>
				i++;
	//   27   41:iload_2         
	//   28   42:iconst_1        
	//   29   43:iadd            
	//   30   44:istore_2        
			} while(true);
	//   31   45:goto            16
		}
		obj = ((Object) (b));
	//   32   48:aload_0         
	//   33   49:getfield        #23  <Field byte[] b>
	//   34   52:astore_3        
		if(obj != null)
	//*  35   53:aload_3         
	//*  36   54:ifnull          63
			awh1.a(2, ((byte []) (obj)));
	//   37   57:aload_1         
	//   38   58:iconst_2        
	//   39   59:aload_3         
	//   40   60:invokevirtual   #102 <Method void awh.a(int, byte[])>
		obj = ((Object) (d));
	//   41   63:aload_0         
	//   42   64:getfield        #66  <Field Integer d>
	//   43   67:astore_3        
		if(obj != null)
	//*  44   68:aload_3         
	//*  45   69:ifnull          81
			awh1.a(3, ((Integer) (obj)).intValue());
	//   46   72:aload_1         
	//   47   73:iconst_3        
	//   48   74:aload_3         
	//   49   75:invokevirtual   #92  <Method int Integer.intValue()>
	//   50   78:invokevirtual   #105 <Method void awh.a(int, int)>
		obj = ((Object) (c));
	//   51   81:aload_0         
	//   52   82:getfield        #58  <Field Integer c>
	//   53   85:astore_3        
		if(obj != null)
	//*  54   86:aload_3         
	//*  55   87:ifnull          99
			awh1.a(4, ((Integer) (obj)).intValue());
	//   56   90:aload_1         
	//   57   91:iconst_4        
	//   58   92:aload_3         
	//   59   93:invokevirtual   #92  <Method int Integer.intValue()>
	//   60   96:invokevirtual   #105 <Method void awh.a(int, int)>
		super.a(awh1);
	//   61   99:aload_0         
	//   62  100:aload_1         
	//   63  101:invokespecial   #107 <Method void awj.a(awh)>
	//   64  104:return          
	}

	public byte a[][];
	public byte b[];
	public Integer c;
	private Integer d;
}
