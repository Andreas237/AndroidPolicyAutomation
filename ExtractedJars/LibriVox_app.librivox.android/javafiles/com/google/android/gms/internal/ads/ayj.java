// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			awj, ayi, arh, awh, 
//			awg, awt, axi, awp

public final class ayj extends awj
{

	public ayj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void awj()>
		b = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field axi b>
		a = ayi.b();
	//    5    9:aload_0         
	//    6   10:invokestatic    #24  <Method ayi[] ayi.b()>
	//    7   13:putfield        #26  <Field ayi[] a>
		c = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #28  <Field byte[] c>
		d = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #30  <Field byte[] d>
		e = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #32  <Field Integer e>
		Z = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #36  <Field awl Z>
		aa = -1;
	//   20   36:aload_0         
	//   21   37:iconst_m1       
	//   22   38:putfield        #40  <Field int aa>
	//   23   41:return          
	}

	protected final int a()
	{
		int j = super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method int awj.a()>
	//    2    4:istore_2        
		Object obj = ((Object) (b));
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field axi b>
	//    5    9:astore          4
		int i = j;
	//    6   11:iload_2         
	//    7   12:istore_1        
		if(obj != null)
	//*   8   13:aload           4
	//*   9   15:ifnull          27
			i = j + arh.c(1, ((atv) (obj)));
	//   10   18:iload_2         
	//   11   19:iconst_1        
	//   12   20:aload           4
	//   13   22:invokestatic    #49  <Method int arh.c(int, atv)>
	//   14   25:iadd            
	//   15   26:istore_1        
		Object aobj[] = ((Object []) (a));
	//   16   27:aload_0         
	//   17   28:getfield        #26  <Field ayi[] a>
	//   18   31:astore          4
		j = i;
	//   19   33:iload_1         
	//   20   34:istore_2        
		if(aobj != null)
	//*  21   35:aload           4
	//*  22   37:ifnull          96
		{
			j = i;
	//   23   40:iload_1         
	//   24   41:istore_2        
			if(aobj.length > 0)
	//*  25   42:aload           4
	//*  26   44:arraylength     
	//*  27   45:ifle            96
			{
				int k = 0;
	//   28   48:iconst_0        
	//   29   49:istore_3        
				do
				{
					aobj = ((Object []) (a));
	//   30   50:aload_0         
	//   31   51:getfield        #26  <Field ayi[] a>
	//   32   54:astore          4
					j = i;
	//   33   56:iload_1         
	//   34   57:istore_2        
					if(k >= aobj.length)
						break;
	//   35   58:iload_3         
	//   36   59:aload           4
	//   37   61:arraylength     
	//   38   62:icmpge          96
					aobj = ((Object []) (aobj[k]));
	//   39   65:aload           4
	//   40   67:iload_3         
	//   41   68:aaload          
	//   42   69:astore          4
					j = i;
	//   43   71:iload_1         
	//   44   72:istore_2        
					if(aobj != null)
	//*  45   73:aload           4
	//*  46   75:ifnull          87
						j = i + awh.b(2, ((awp) (aobj)));
	//   47   78:iload_1         
	//   48   79:iconst_2        
	//   49   80:aload           4
	//   50   82:invokestatic    #54  <Method int awh.b(int, awp)>
	//   51   85:iadd            
	//   52   86:istore_2        
					k++;
	//   53   87:iload_3         
	//   54   88:iconst_1        
	//   55   89:iadd            
	//   56   90:istore_3        
					i = j;
	//   57   91:iload_2         
	//   58   92:istore_1        
				} while(true);
	//   59   93:goto            50
			}
		}
		aobj = ((Object []) (c));
	//   60   96:aload_0         
	//   61   97:getfield        #28  <Field byte[] c>
	//   62  100:astore          4
		i = j;
	//   63  102:iload_2         
	//   64  103:istore_1        
		if(aobj != null)
	//*  65  104:aload           4
	//*  66  106:ifnull          118
			i = j + awh.b(3, ((byte []) (aobj)));
	//   67  109:iload_2         
	//   68  110:iconst_3        
	//   69  111:aload           4
	//   70  113:invokestatic    #57  <Method int awh.b(int, byte[])>
	//   71  116:iadd            
	//   72  117:istore_1        
		aobj = ((Object []) (d));
	//   73  118:aload_0         
	//   74  119:getfield        #30  <Field byte[] d>
	//   75  122:astore          4
		j = i;
	//   76  124:iload_1         
	//   77  125:istore_2        
		if(aobj != null)
	//*  78  126:aload           4
	//*  79  128:ifnull          140
			j = i + awh.b(4, ((byte []) (aobj)));
	//   80  131:iload_1         
	//   81  132:iconst_4        
	//   82  133:aload           4
	//   83  135:invokestatic    #57  <Method int awh.b(int, byte[])>
	//   84  138:iadd            
	//   85  139:istore_2        
		aobj = ((Object []) (e));
	//   86  140:aload_0         
	//   87  141:getfield        #32  <Field Integer e>
	//   88  144:astore          4
		i = j;
	//   89  146:iload_2         
	//   90  147:istore_1        
		if(aobj != null)
	//*  91  148:aload           4
	//*  92  150:ifnull          165
			i = j + awh.b(5, ((Integer) (aobj)).intValue());
	//   93  153:iload_2         
	//   94  154:iconst_5        
	//   95  155:aload           4
	//   96  157:invokevirtual   #62  <Method int Integer.intValue()>
	//   97  160:invokestatic    #65  <Method int awh.b(int, int)>
	//   98  163:iadd            
	//   99  164:istore_1        
		return i;
	//  100  165:iload_1         
	//  101  166:ireturn         
	}

	public final awp a(awg awg1)
	{
		do
		{
			int i = awg1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #69  <Method int awg.a()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            226
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          209
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          86
				{
					if(i != 26)
	//*  11   21:iload_2         
	//*  12   22:bipush          26
	//*  13   24:icmpeq          75
					{
						if(i != 34)
	//*  14   27:iload_2         
	//*  15   28:bipush          34
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
	//*  23   42:invokespecial   #72  <Method boolean awj.a(awg, int)>
	//*  24   45:ifne            0
									return ((awp) (this));
	//   25   48:aload_0         
	//   26   49:areturn         
							} else
							{
								e = Integer.valueOf(awg1.c());
	//   27   50:aload_0         
	//   28   51:aload_1         
	//   29   52:invokevirtual   #74  <Method int awg.c()>
	//   30   55:invokestatic    #78  <Method Integer Integer.valueOf(int)>
	//   31   58:putfield        #32  <Field Integer e>
							}
						} else
	//*  32   61:goto            0
						{
							d = awg1.f();
	//   33   64:aload_0         
	//   34   65:aload_1         
	//   35   66:invokevirtual   #82  <Method byte[] awg.f()>
	//   36   69:putfield        #30  <Field byte[] d>
						}
					} else
	//*  37   72:goto            0
					{
						c = awg1.f();
	//   38   75:aload_0         
	//   39   76:aload_1         
	//   40   77:invokevirtual   #82  <Method byte[] awg.f()>
	//   41   80:putfield        #28  <Field byte[] c>
					}
				} else
	//*  42   83:goto            0
				{
					int k = awt.a(awg1, 18);
	//   43   86:aload_1         
	//   44   87:bipush          18
	//   45   89:invokestatic    #87  <Method int awt.a(awg, int)>
	//   46   92:istore_3        
					ayi aayi[] = a;
	//   47   93:aload_0         
	//   48   94:getfield        #26  <Field ayi[] a>
	//   49   97:astore          4
					int j;
					if(aayi == null)
	//*  50   99:aload           4
	//*  51  101:ifnonnull       109
						j = 0;
	//   52  104:iconst_0        
	//   53  105:istore_2        
					else
	//*  54  106:goto            113
						j = aayi.length;
	//   55  109:aload           4
	//   56  111:arraylength     
	//   57  112:istore_2        
					aayi = new ayi[k + j];
	//   58  113:iload_3         
	//   59  114:iload_2         
	//   60  115:iadd            
	//   61  116:anewarray       ayi[]
	//   62  119:astore          4
					k = j;
	//   63  121:iload_2         
	//   64  122:istore_3        
					if(j != 0)
	//*  65  123:iload_2         
	//*  66  124:ifeq            141
					{
						System.arraycopy(((Object) (a)), 0, ((Object) (aayi)), 0, j);
	//   67  127:aload_0         
	//   68  128:getfield        #26  <Field ayi[] a>
	//   69  131:iconst_0        
	//   70  132:aload           4
	//   71  134:iconst_0        
	//   72  135:iload_2         
	//   73  136:invokestatic    #93  <Method void System.arraycopy(Object, int, Object, int, int)>
						k = j;
	//   74  139:iload_2         
	//   75  140:istore_3        
					}
					for(; k < aayi.length - 1; k++)
	//*  76  141:iload_3         
	//*  77  142:aload           4
	//*  78  144:arraylength     
	//*  79  145:iconst_1        
	//*  80  146:isub            
	//*  81  147:icmpge          181
					{
						aayi[k] = new ayi();
	//   82  150:aload           4
	//   83  152:iload_3         
	//   84  153:new             #21  <Class ayi>
	//   85  156:dup             
	//   86  157:invokespecial   #94  <Method void ayi()>
	//   87  160:aastore         
						awg1.a(((awp) (aayi[k])));
	//   88  161:aload_1         
	//   89  162:aload           4
	//   90  164:iload_3         
	//   91  165:aaload          
	//   92  166:invokevirtual   #97  <Method void awg.a(awp)>
						awg1.a();
	//   93  169:aload_1         
	//   94  170:invokevirtual   #69  <Method int awg.a()>
	//   95  173:pop             
					}

	//   96  174:iload_3         
	//   97  175:iconst_1        
	//   98  176:iadd            
	//   99  177:istore_3        
	//* 100  178:goto            141
					aayi[k] = new ayi();
	//  101  181:aload           4
	//  102  183:iload_3         
	//  103  184:new             #21  <Class ayi>
	//  104  187:dup             
	//  105  188:invokespecial   #94  <Method void ayi()>
	//  106  191:aastore         
					awg1.a(((awp) (aayi[k])));
	//  107  192:aload_1         
	//  108  193:aload           4
	//  109  195:iload_3         
	//  110  196:aaload          
	//  111  197:invokevirtual   #97  <Method void awg.a(awp)>
					a = aayi;
	//  112  200:aload_0         
	//  113  201:aload           4
	//  114  203:putfield        #26  <Field ayi[] a>
				}
			} else
	//* 115  206:goto            0
			{
				b = (axi)awg1.a(axi.a());
	//  116  209:aload_0         
	//  117  210:aload_1         
	//  118  211:invokestatic    #102 <Method aug axi.a()>
	//  119  214:invokevirtual   #105 <Method ash awg.a(aug)>
	//  120  217:checkcast       #99  <Class axi>
	//  121  220:putfield        #19  <Field axi b>
			}
		} while(true);
	//  122  223:goto            0
		return ((awp) (this));
	//  123  226:aload_0         
	//  124  227:areturn         
	}

	public final void a(awh awh1)
	{
		Object obj = ((Object) (b));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field axi b>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          15
			awh1.a(1, ((atv) (obj)));
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_3         
	//    8   12:invokevirtual   #109 <Method void awh.a(int, atv)>
		Object aobj[] = ((Object []) (a));
	//    9   15:aload_0         
	//   10   16:getfield        #26  <Field ayi[] a>
	//   11   19:astore_3        
		if(aobj != null && aobj.length > 0)
	//*  12   20:aload_3         
	//*  13   21:ifnull          63
	//*  14   24:aload_3         
	//*  15   25:arraylength     
	//*  16   26:ifle            63
		{
			int i = 0;
	//   17   29:iconst_0        
	//   18   30:istore_2        
			do
			{
				aobj = ((Object []) (a));
	//   19   31:aload_0         
	//   20   32:getfield        #26  <Field ayi[] a>
	//   21   35:astore_3        
				if(i >= aobj.length)
					break;
	//   22   36:iload_2         
	//   23   37:aload_3         
	//   24   38:arraylength     
	//   25   39:icmpge          63
				aobj = ((Object []) (aobj[i]));
	//   26   42:aload_3         
	//   27   43:iload_2         
	//   28   44:aaload          
	//   29   45:astore_3        
				if(aobj != null)
	//*  30   46:aload_3         
	//*  31   47:ifnull          56
					awh1.a(2, ((awp) (aobj)));
	//   32   50:aload_1         
	//   33   51:iconst_2        
	//   34   52:aload_3         
	//   35   53:invokevirtual   #112 <Method void awh.a(int, awp)>
				i++;
	//   36   56:iload_2         
	//   37   57:iconst_1        
	//   38   58:iadd            
	//   39   59:istore_2        
			} while(true);
	//   40   60:goto            31
		}
		aobj = ((Object []) (c));
	//   41   63:aload_0         
	//   42   64:getfield        #28  <Field byte[] c>
	//   43   67:astore_3        
		if(aobj != null)
	//*  44   68:aload_3         
	//*  45   69:ifnull          78
			awh1.a(3, ((byte []) (aobj)));
	//   46   72:aload_1         
	//   47   73:iconst_3        
	//   48   74:aload_3         
	//   49   75:invokevirtual   #115 <Method void awh.a(int, byte[])>
		aobj = ((Object []) (d));
	//   50   78:aload_0         
	//   51   79:getfield        #30  <Field byte[] d>
	//   52   82:astore_3        
		if(aobj != null)
	//*  53   83:aload_3         
	//*  54   84:ifnull          93
			awh1.a(4, ((byte []) (aobj)));
	//   55   87:aload_1         
	//   56   88:iconst_4        
	//   57   89:aload_3         
	//   58   90:invokevirtual   #115 <Method void awh.a(int, byte[])>
		aobj = ((Object []) (e));
	//   59   93:aload_0         
	//   60   94:getfield        #32  <Field Integer e>
	//   61   97:astore_3        
		if(aobj != null)
	//*  62   98:aload_3         
	//*  63   99:ifnull          111
			awh1.a(5, ((Integer) (aobj)).intValue());
	//   64  102:aload_1         
	//   65  103:iconst_5        
	//   66  104:aload_3         
	//   67  105:invokevirtual   #62  <Method int Integer.intValue()>
	//   68  108:invokevirtual   #118 <Method void awh.a(int, int)>
		super.a(awh1);
	//   69  111:aload_0         
	//   70  112:aload_1         
	//   71  113:invokespecial   #120 <Method void awj.a(awh)>
	//   72  116:return          
	}

	public ayi a[];
	private axi b;
	private byte c[];
	private byte d[];
	private Integer e;
}
