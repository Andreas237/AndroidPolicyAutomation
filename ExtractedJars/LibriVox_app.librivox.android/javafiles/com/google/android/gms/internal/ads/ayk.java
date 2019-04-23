// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			awj, ayi, arh, awh, 
//			awg, awt, axm, awp

public final class ayk extends awj
{

	public ayk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void awj()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #20  <Field axm a>
		b = ayi.b();
	//    5    9:aload_0         
	//    6   10:invokestatic    #25  <Method ayi[] ayi.b()>
	//    7   13:putfield        #27  <Field ayi[] b>
		c = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #29  <Field byte[] c>
		d = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #31  <Field byte[] d>
		e = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #33  <Field Integer e>
		f = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #35  <Field byte[] f>
		Z = null;
	//   20   36:aload_0         
	//   21   37:aconst_null     
	//   22   38:putfield        #39  <Field awl Z>
		aa = -1;
	//   23   41:aload_0         
	//   24   42:iconst_m1       
	//   25   43:putfield        #43  <Field int aa>
	//   26   46:return          
	}

	protected final int a()
	{
		int j = super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method int awj.a()>
	//    2    4:istore_2        
		Object obj = ((Object) (a));
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field axm a>
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
	//   13   22:invokestatic    #52  <Method int arh.c(int, atv)>
	//   14   25:iadd            
	//   15   26:istore_1        
		Object aobj[] = ((Object []) (b));
	//   16   27:aload_0         
	//   17   28:getfield        #27  <Field ayi[] b>
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
					aobj = ((Object []) (b));
	//   30   50:aload_0         
	//   31   51:getfield        #27  <Field ayi[] b>
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
	//   50   82:invokestatic    #57  <Method int awh.b(int, awp)>
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
	//   61   97:getfield        #29  <Field byte[] c>
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
	//   70  113:invokestatic    #60  <Method int awh.b(int, byte[])>
	//   71  116:iadd            
	//   72  117:istore_1        
		aobj = ((Object []) (d));
	//   73  118:aload_0         
	//   74  119:getfield        #31  <Field byte[] d>
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
	//   83  135:invokestatic    #60  <Method int awh.b(int, byte[])>
	//   84  138:iadd            
	//   85  139:istore_2        
		aobj = ((Object []) (e));
	//   86  140:aload_0         
	//   87  141:getfield        #33  <Field Integer e>
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
	//   96  157:invokevirtual   #65  <Method int Integer.intValue()>
	//   97  160:invokestatic    #68  <Method int awh.b(int, int)>
	//   98  163:iadd            
	//   99  164:istore_1        
		aobj = ((Object []) (f));
	//  100  165:aload_0         
	//  101  166:getfield        #35  <Field byte[] f>
	//  102  169:astore          4
		j = i;
	//  103  171:iload_1         
	//  104  172:istore_2        
		if(aobj != null)
	//* 105  173:aload           4
	//* 106  175:ifnull          188
			j = i + awh.b(6, ((byte []) (aobj)));
	//  107  178:iload_1         
	//  108  179:bipush          6
	//  109  181:aload           4
	//  110  183:invokestatic    #60  <Method int awh.b(int, byte[])>
	//  111  186:iadd            
	//  112  187:istore_2        
		return j;
	//  113  188:iload_2         
	//  114  189:ireturn         
	}

	public final awp a(awg awg1)
	{
		do
		{
			int i = awg1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #72  <Method int awg.a()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            243
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          226
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          103
				{
					if(i != 26)
	//*  11   21:iload_2         
	//*  12   22:bipush          26
	//*  13   24:icmpeq          92
					{
						if(i != 34)
	//*  14   27:iload_2         
	//*  15   28:bipush          34
	//*  16   30:icmpeq          81
						{
							if(i != 40)
	//*  17   33:iload_2         
	//*  18   34:bipush          40
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
	//*  26   48:invokespecial   #75  <Method boolean awj.a(awg, int)>
	//*  27   51:ifne            0
										return ((awp) (this));
	//   28   54:aload_0         
	//   29   55:areturn         
								} else
								{
									f = awg1.f();
	//   30   56:aload_0         
	//   31   57:aload_1         
	//   32   58:invokevirtual   #78  <Method byte[] awg.f()>
	//   33   61:putfield        #35  <Field byte[] f>
								}
							} else
	//*  34   64:goto            0
							{
								e = Integer.valueOf(awg1.c());
	//   35   67:aload_0         
	//   36   68:aload_1         
	//   37   69:invokevirtual   #80  <Method int awg.c()>
	//   38   72:invokestatic    #84  <Method Integer Integer.valueOf(int)>
	//   39   75:putfield        #33  <Field Integer e>
							}
						} else
	//*  40   78:goto            0
						{
							d = awg1.f();
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:invokevirtual   #78  <Method byte[] awg.f()>
	//   44   86:putfield        #31  <Field byte[] d>
						}
					} else
	//*  45   89:goto            0
					{
						c = awg1.f();
	//   46   92:aload_0         
	//   47   93:aload_1         
	//   48   94:invokevirtual   #78  <Method byte[] awg.f()>
	//   49   97:putfield        #29  <Field byte[] c>
					}
				} else
	//*  50  100:goto            0
				{
					int k = awt.a(awg1, 18);
	//   51  103:aload_1         
	//   52  104:bipush          18
	//   53  106:invokestatic    #89  <Method int awt.a(awg, int)>
	//   54  109:istore_3        
					ayi aayi[] = b;
	//   55  110:aload_0         
	//   56  111:getfield        #27  <Field ayi[] b>
	//   57  114:astore          4
					int j;
					if(aayi == null)
	//*  58  116:aload           4
	//*  59  118:ifnonnull       126
						j = 0;
	//   60  121:iconst_0        
	//   61  122:istore_2        
					else
	//*  62  123:goto            130
						j = aayi.length;
	//   63  126:aload           4
	//   64  128:arraylength     
	//   65  129:istore_2        
					aayi = new ayi[k + j];
	//   66  130:iload_3         
	//   67  131:iload_2         
	//   68  132:iadd            
	//   69  133:anewarray       ayi[]
	//   70  136:astore          4
					k = j;
	//   71  138:iload_2         
	//   72  139:istore_3        
					if(j != 0)
	//*  73  140:iload_2         
	//*  74  141:ifeq            158
					{
						System.arraycopy(((Object) (b)), 0, ((Object) (aayi)), 0, j);
	//   75  144:aload_0         
	//   76  145:getfield        #27  <Field ayi[] b>
	//   77  148:iconst_0        
	//   78  149:aload           4
	//   79  151:iconst_0        
	//   80  152:iload_2         
	//   81  153:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
						k = j;
	//   82  156:iload_2         
	//   83  157:istore_3        
					}
					for(; k < aayi.length - 1; k++)
	//*  84  158:iload_3         
	//*  85  159:aload           4
	//*  86  161:arraylength     
	//*  87  162:iconst_1        
	//*  88  163:isub            
	//*  89  164:icmpge          198
					{
						aayi[k] = new ayi();
	//   90  167:aload           4
	//   91  169:iload_3         
	//   92  170:new             #22  <Class ayi>
	//   93  173:dup             
	//   94  174:invokespecial   #96  <Method void ayi()>
	//   95  177:aastore         
						awg1.a(((awp) (aayi[k])));
	//   96  178:aload_1         
	//   97  179:aload           4
	//   98  181:iload_3         
	//   99  182:aaload          
	//  100  183:invokevirtual   #99  <Method void awg.a(awp)>
						awg1.a();
	//  101  186:aload_1         
	//  102  187:invokevirtual   #72  <Method int awg.a()>
	//  103  190:pop             
					}

	//  104  191:iload_3         
	//  105  192:iconst_1        
	//  106  193:iadd            
	//  107  194:istore_3        
	//* 108  195:goto            158
					aayi[k] = new ayi();
	//  109  198:aload           4
	//  110  200:iload_3         
	//  111  201:new             #22  <Class ayi>
	//  112  204:dup             
	//  113  205:invokespecial   #96  <Method void ayi()>
	//  114  208:aastore         
					awg1.a(((awp) (aayi[k])));
	//  115  209:aload_1         
	//  116  210:aload           4
	//  117  212:iload_3         
	//  118  213:aaload          
	//  119  214:invokevirtual   #99  <Method void awg.a(awp)>
					b = aayi;
	//  120  217:aload_0         
	//  121  218:aload           4
	//  122  220:putfield        #27  <Field ayi[] b>
				}
			} else
	//* 123  223:goto            0
			{
				a = (axm)awg1.a(axm.a());
	//  124  226:aload_0         
	//  125  227:aload_1         
	//  126  228:invokestatic    #104 <Method aug axm.a()>
	//  127  231:invokevirtual   #107 <Method ash awg.a(aug)>
	//  128  234:checkcast       #101 <Class axm>
	//  129  237:putfield        #20  <Field axm a>
			}
		} while(true);
	//  130  240:goto            0
		return ((awp) (this));
	//  131  243:aload_0         
	//  132  244:areturn         
	}

	public final void a(awh awh1)
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field axm a>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          15
			awh1.a(1, ((atv) (obj)));
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_3         
	//    8   12:invokevirtual   #111 <Method void awh.a(int, atv)>
		Object aobj[] = ((Object []) (b));
	//    9   15:aload_0         
	//   10   16:getfield        #27  <Field ayi[] b>
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
				aobj = ((Object []) (b));
	//   19   31:aload_0         
	//   20   32:getfield        #27  <Field ayi[] b>
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
	//   35   53:invokevirtual   #114 <Method void awh.a(int, awp)>
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
	//   42   64:getfield        #29  <Field byte[] c>
	//   43   67:astore_3        
		if(aobj != null)
	//*  44   68:aload_3         
	//*  45   69:ifnull          78
			awh1.a(3, ((byte []) (aobj)));
	//   46   72:aload_1         
	//   47   73:iconst_3        
	//   48   74:aload_3         
	//   49   75:invokevirtual   #117 <Method void awh.a(int, byte[])>
		aobj = ((Object []) (d));
	//   50   78:aload_0         
	//   51   79:getfield        #31  <Field byte[] d>
	//   52   82:astore_3        
		if(aobj != null)
	//*  53   83:aload_3         
	//*  54   84:ifnull          93
			awh1.a(4, ((byte []) (aobj)));
	//   55   87:aload_1         
	//   56   88:iconst_4        
	//   57   89:aload_3         
	//   58   90:invokevirtual   #117 <Method void awh.a(int, byte[])>
		aobj = ((Object []) (e));
	//   59   93:aload_0         
	//   60   94:getfield        #33  <Field Integer e>
	//   61   97:astore_3        
		if(aobj != null)
	//*  62   98:aload_3         
	//*  63   99:ifnull          111
			awh1.a(5, ((Integer) (aobj)).intValue());
	//   64  102:aload_1         
	//   65  103:iconst_5        
	//   66  104:aload_3         
	//   67  105:invokevirtual   #65  <Method int Integer.intValue()>
	//   68  108:invokevirtual   #120 <Method void awh.a(int, int)>
		aobj = ((Object []) (f));
	//   69  111:aload_0         
	//   70  112:getfield        #35  <Field byte[] f>
	//   71  115:astore_3        
		if(aobj != null)
	//*  72  116:aload_3         
	//*  73  117:ifnull          127
			awh1.a(6, ((byte []) (aobj)));
	//   74  120:aload_1         
	//   75  121:bipush          6
	//   76  123:aload_3         
	//   77  124:invokevirtual   #117 <Method void awh.a(int, byte[])>
		super.a(awh1);
	//   78  127:aload_0         
	//   79  128:aload_1         
	//   80  129:invokespecial   #122 <Method void awj.a(awh)>
	//   81  132:return          
	}

	private axm a;
	private ayi b[];
	private byte c[];
	private byte d[];
	private Integer e;
	private byte f[];
}
