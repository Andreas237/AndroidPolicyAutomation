// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;

import java.nio.charset.Charset;

// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			dr, ev, di, dn, 
//			dh, hy

class ds extends dr
{

	ds(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void dr()>
		if(abyte0 != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          14
		{
			b = abyte0;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #13  <Field byte[] b>
			return;
	//    7   13:return          
		} else
		{
			throw new NullPointerException();
	//    8   14:new             #15  <Class NullPointerException>
	//    9   17:dup             
	//   10   18:invokespecial   #16  <Method void NullPointerException()>
	//   11   21:athrow          
		}
	}

	public byte a(int i)
	{
		return b[i];
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field byte[] b>
	//    2    4:iload_1         
	//    3    5:baload          
	//    4    6:ireturn         
	}

	public int a()
	{
		return b.length;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field byte[] b>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	protected final int a(int i, int j, int k)
	{
		return ev.a(i, b, e(), k);
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #13  <Field byte[] b>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #24  <Method int e()>
	//    5    9:iload_3         
	//    6   10:invokestatic    #29  <Method int ev.a(int, byte[], int, int)>
	//    7   13:ireturn         
	}

	public final di a(int i, int j)
	{
		i = b(0, j, ((di)this).a());
	//    0    0:iconst_0        
	//    1    1:iload_2         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #34  <Method int di.a()>
	//    4    6:invokestatic    #36  <Method int b(int, int, int)>
	//    5    9:istore_1        
		if(i == 0)
	//*   6   10:iload_1         
	//*   7   11:ifne            18
			return di.a;
	//    8   14:getstatic       #39  <Field di di.a>
	//    9   17:areturn         
		else
			return ((di) (new dn(b, e(), i)));
	//   10   18:new             #41  <Class dn>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:getfield        #13  <Field byte[] b>
	//   14   26:aload_0         
	//   15   27:invokevirtual   #24  <Method int e()>
	//   16   30:iload_1         
	//   17   31:invokespecial   #44  <Method void dn(byte[], int, int)>
	//   18   34:areturn         
	}

	protected final String a(Charset charset)
	{
		return new String(b, e(), ((di)this).a(), charset);
	//    0    0:new             #47  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field byte[] b>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #24  <Method int e()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #34  <Method int di.a()>
	//    8   16:aload_1         
	//    9   17:invokespecial   #50  <Method void String(byte[], int, int, Charset)>
	//   10   20:areturn         
	}

	final void a(dh dh1)
	{
		dh1.a(b, e(), ((di)this).a());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #13  <Field byte[] b>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #24  <Method int e()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #34  <Method int di.a()>
	//    7   13:invokevirtual   #55  <Method void dh.a(byte[], int, int)>
	//    8   16:return          
	}

	final boolean a(di di1, int i, int j)
	{
		if(j <= di1.a())
	//*   0    0:iload_3         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #34  <Method int di.a()>
	//*   3    5:icmpgt          164
		{
			if(j <= di1.a())
	//*   4    8:iload_3         
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #34  <Method int di.a()>
	//*   7   13:icmpgt          111
			{
				if(di1 instanceof ds)
	//*   8   16:aload_1         
	//*   9   17:instanceof      #2   <Class ds>
	//*  10   20:ifeq            95
				{
					di1 = ((di) ((ds)di1));
	//   11   23:aload_1         
	//   12   24:checkcast       #2   <Class ds>
	//   13   27:astore_1        
					byte abyte0[] = b;
	//   14   28:aload_0         
	//   15   29:getfield        #13  <Field byte[] b>
	//   16   32:astore          6
					byte abyte1[] = ((ds) (di1)).b;
	//   17   34:aload_1         
	//   18   35:getfield        #13  <Field byte[] b>
	//   19   38:astore          7
					int l = e();
	//   20   40:aload_0         
	//   21   41:invokevirtual   #24  <Method int e()>
	//   22   44:istore          5
					int k = e();
	//   23   46:aload_0         
	//   24   47:invokevirtual   #24  <Method int e()>
	//   25   50:istore          4
					for(i = ((ds) (di1)).e(); k < l + j; i++)
	//*  26   52:aload_1         
	//*  27   53:invokevirtual   #24  <Method int e()>
	//*  28   56:istore_2        
	//*  29   57:iload           4
	//*  30   59:iload           5
	//*  31   61:iload_3         
	//*  32   62:iadd            
	//*  33   63:icmpge          93
					{
						if(abyte0[k] != abyte1[i])
	//*  34   66:aload           6
	//*  35   68:iload           4
	//*  36   70:baload          
	//*  37   71:aload           7
	//*  38   73:iload_2         
	//*  39   74:baload          
	//*  40   75:icmpeq          80
							return false;
	//   41   78:iconst_0        
	//   42   79:ireturn         
						k++;
	//   43   80:iload           4
	//   44   82:iconst_1        
	//   45   83:iadd            
	//   46   84:istore          4
					}

	//   47   86:iload_2         
	//   48   87:iconst_1        
	//   49   88:iadd            
	//   50   89:istore_2        
	//*  51   90:goto            57
					return true;
	//   52   93:iconst_1        
	//   53   94:ireturn         
				} else
				{
					return di1.a(0, j).equals(((Object) (((di)this).a(0, j))));
	//   54   95:aload_1         
	//   55   96:iconst_0        
	//   56   97:iload_3         
	//   57   98:invokevirtual   #58  <Method di di.a(int, int)>
	//   58  101:aload_0         
	//   59  102:iconst_0        
	//   60  103:iload_3         
	//   61  104:invokevirtual   #58  <Method di di.a(int, int)>
	//   62  107:invokevirtual   #62  <Method boolean di.equals(Object)>
	//   63  110:ireturn         
				}
			} else
			{
				i = di1.a();
	//   64  111:aload_1         
	//   65  112:invokevirtual   #34  <Method int di.a()>
	//   66  115:istore_2        
				di1 = ((di) (new StringBuilder(59)));
	//   67  116:new             #64  <Class StringBuilder>
	//   68  119:dup             
	//   69  120:bipush          59
	//   70  122:invokespecial   #67  <Method void StringBuilder(int)>
	//   71  125:astore_1        
				((StringBuilder) (di1)).append("Ran off end of other: 0, ");
	//   72  126:aload_1         
	//   73  127:ldc1            #69  <String "Ran off end of other: 0, ">
	//   74  129:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   75  132:pop             
				((StringBuilder) (di1)).append(j);
	//   76  133:aload_1         
	//   77  134:iload_3         
	//   78  135:invokevirtual   #76  <Method StringBuilder StringBuilder.append(int)>
	//   79  138:pop             
				((StringBuilder) (di1)).append(", ");
	//   80  139:aload_1         
	//   81  140:ldc1            #78  <String ", ">
	//   82  142:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   83  145:pop             
				((StringBuilder) (di1)).append(i);
	//   84  146:aload_1         
	//   85  147:iload_2         
	//   86  148:invokevirtual   #76  <Method StringBuilder StringBuilder.append(int)>
	//   87  151:pop             
				throw new IllegalArgumentException(((StringBuilder) (di1)).toString());
	//   88  152:new             #80  <Class IllegalArgumentException>
	//   89  155:dup             
	//   90  156:aload_1         
	//   91  157:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   92  160:invokespecial   #87  <Method void IllegalArgumentException(String)>
	//   93  163:athrow          
			}
		} else
		{
			i = ((di)this).a();
	//   94  164:aload_0         
	//   95  165:invokevirtual   #34  <Method int di.a()>
	//   96  168:istore_2        
			di1 = ((di) (new StringBuilder(40)));
	//   97  169:new             #64  <Class StringBuilder>
	//   98  172:dup             
	//   99  173:bipush          40
	//  100  175:invokespecial   #67  <Method void StringBuilder(int)>
	//  101  178:astore_1        
			((StringBuilder) (di1)).append("Length too large: ");
	//  102  179:aload_1         
	//  103  180:ldc1            #89  <String "Length too large: ">
	//  104  182:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//  105  185:pop             
			((StringBuilder) (di1)).append(j);
	//  106  186:aload_1         
	//  107  187:iload_3         
	//  108  188:invokevirtual   #76  <Method StringBuilder StringBuilder.append(int)>
	//  109  191:pop             
			((StringBuilder) (di1)).append(i);
	//  110  192:aload_1         
	//  111  193:iload_2         
	//  112  194:invokevirtual   #76  <Method StringBuilder StringBuilder.append(int)>
	//  113  197:pop             
			throw new IllegalArgumentException(((StringBuilder) (di1)).toString());
	//  114  198:new             #80  <Class IllegalArgumentException>
	//  115  201:dup             
	//  116  202:aload_1         
	//  117  203:invokevirtual   #84  <Method String StringBuilder.toString()>
	//  118  206:invokespecial   #87  <Method void IllegalArgumentException(String)>
	//  119  209:athrow          
		}
	}

	byte b(int i)
	{
		return b[i];
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field byte[] b>
	//    2    4:iload_1         
	//    3    5:baload          
	//    4    6:ireturn         
	}

	public final boolean c()
	{
		int i = e();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method int e()>
	//    2    4:istore_1        
		return hy.a(b, i, ((di)this).a() + i);
	//    3    5:aload_0         
	//    4    6:getfield        #13  <Field byte[] b>
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #34  <Method int di.a()>
	//    8   14:iload_1         
	//    9   15:iadd            
	//   10   16:invokestatic    #96  <Method boolean hy.a(byte[], int, int)>
	//   11   19:ireturn         
	}

	protected int e()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof di))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #32  <Class di>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		if(((di)this).a() != ((di)obj).a())
	//*  10   16:aload_0         
	//*  11   17:invokevirtual   #34  <Method int di.a()>
	//*  12   20:aload_1         
	//*  13   21:checkcast       #32  <Class di>
	//*  14   24:invokevirtual   #34  <Method int di.a()>
	//*  15   27:icmpeq          32
			return false;
	//   16   30:iconst_0        
	//   17   31:ireturn         
		if(((di)this).a() == 0)
	//*  18   32:aload_0         
	//*  19   33:invokevirtual   #34  <Method int di.a()>
	//*  20   36:ifne            41
			return true;
	//   21   39:iconst_1        
	//   22   40:ireturn         
		if(obj instanceof ds)
	//*  23   41:aload_1         
	//*  24   42:instanceof      #2   <Class ds>
	//*  25   45:ifeq            89
		{
			obj = ((Object) ((ds)obj));
	//   26   48:aload_1         
	//   27   49:checkcast       #2   <Class ds>
	//   28   52:astore_1        
			int i = ((di)this).d();
	//   29   53:aload_0         
	//   30   54:invokevirtual   #99  <Method int di.d()>
	//   31   57:istore_2        
			int j = ((di) (obj)).d();
	//   32   58:aload_1         
	//   33   59:invokevirtual   #99  <Method int di.d()>
	//   34   62:istore_3        
			if(i != 0 && j != 0 && i != j)
	//*  35   63:iload_2         
	//*  36   64:ifeq            78
	//*  37   67:iload_3         
	//*  38   68:ifeq            78
	//*  39   71:iload_2         
	//*  40   72:iload_3         
	//*  41   73:icmpeq          78
				return false;
	//   42   76:iconst_0        
	//   43   77:ireturn         
			else
				return ((dr)this).a(((di) (obj)), 0, ((di)this).a());
	//   44   78:aload_0         
	//   45   79:aload_1         
	//   46   80:iconst_0        
	//   47   81:aload_0         
	//   48   82:invokevirtual   #34  <Method int di.a()>
	//   49   85:invokevirtual   #101 <Method boolean dr.a(di, int, int)>
	//   50   88:ireturn         
		} else
		{
			return obj.equals(((Object) (this)));
	//   51   89:aload_1         
	//   52   90:aload_0         
	//   53   91:invokevirtual   #104 <Method boolean Object.equals(Object)>
	//   54   94:ireturn         
		}
	}

	protected final byte b[];
}
