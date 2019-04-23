// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bml, bnf, bmp

public final class bmk
	implements bml
{

	public bmk(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		bnf.a(((Object) (abyte0)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #23  <Method Object bnf.a(Object)>
	//    4    8:pop             
		boolean flag;
		if(abyte0.length > 0)
	//*   5    9:aload_1         
	//*   6   10:arraylength     
	//*   7   11:ifle            19
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore_2        
		else
	//*  10   16:goto            21
			flag = false;
	//   11   19:iconst_0        
	//   12   20:istore_2        
		bnf.a(flag);
	//   13   21:iload_2         
	//   14   22:invokestatic    #26  <Method void bnf.a(boolean)>
		a = abyte0;
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:putfield        #28  <Field byte[] a>
	//   18   30:return          
	}

	public final int a(byte abyte0[], int i, int j)
	{
		if(j == 0)
	//*   0    0:iload_3         
	//*   1    1:ifne            6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int k = d;
	//    4    6:aload_0         
	//    5    7:getfield        #32  <Field int d>
	//    6   10:istore          4
		if(k == 0)
	//*   7   12:iload           4
	//*   8   14:ifne            19
		{
			return -1;
	//    9   17:iconst_m1       
	//   10   18:ireturn         
		} else
		{
			j = Math.min(j, k);
	//   11   19:iload_3         
	//   12   20:iload           4
	//   13   22:invokestatic    #38  <Method int Math.min(int, int)>
	//   14   25:istore_3        
			System.arraycopy(((Object) (a)), c, ((Object) (abyte0)), i, j);
	//   15   26:aload_0         
	//   16   27:getfield        #28  <Field byte[] a>
	//   17   30:aload_0         
	//   18   31:getfield        #40  <Field int c>
	//   19   34:aload_1         
	//   20   35:iload_2         
	//   21   36:iload_3         
	//   22   37:invokestatic    #46  <Method void System.arraycopy(Object, int, Object, int, int)>
			c = c + j;
	//   23   40:aload_0         
	//   24   41:aload_0         
	//   25   42:getfield        #40  <Field int c>
	//   26   45:iload_3         
	//   27   46:iadd            
	//   28   47:putfield        #40  <Field int c>
			d = d - j;
	//   29   50:aload_0         
	//   30   51:aload_0         
	//   31   52:getfield        #32  <Field int d>
	//   32   55:iload_3         
	//   33   56:isub            
	//   34   57:putfield        #32  <Field int d>
			return j;
	//   35   60:iload_3         
	//   36   61:ireturn         
		}
	}

	public final long a(bmp bmp1)
	{
		b = bmp1.a;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #51  <Field Uri bmp.a>
	//    3    5:putfield        #53  <Field Uri b>
		c = (int)bmp1.d;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #56  <Field long bmp.d>
	//    7   13:l2i             
	//    8   14:putfield        #40  <Field int c>
		long l;
		if(bmp1.e == -1L)
	//*   9   17:aload_1         
	//*  10   18:getfield        #59  <Field long bmp.e>
	//*  11   21:ldc2w           #60  <Long -1L>
	//*  12   24:lcmp            
	//*  13   25:ifne            44
			l = (long)a.length - bmp1.d;
	//   14   28:aload_0         
	//   15   29:getfield        #28  <Field byte[] a>
	//   16   32:arraylength     
	//   17   33:i2l             
	//   18   34:aload_1         
	//   19   35:getfield        #56  <Field long bmp.d>
	//   20   38:lsub            
	//   21   39:lstore          4
		else
	//*  22   41:goto            50
			l = bmp1.e;
	//   23   44:aload_1         
	//   24   45:getfield        #59  <Field long bmp.e>
	//   25   48:lstore          4
		d = (int)l;
	//   26   50:aload_0         
	//   27   51:lload           4
	//   28   53:l2i             
	//   29   54:putfield        #32  <Field int d>
		int i = d;
	//   30   57:aload_0         
	//   31   58:getfield        #32  <Field int d>
	//   32   61:istore_2        
		if(i > 0 && c + i <= a.length)
	//*  33   62:iload_2         
	//*  34   63:ifle            83
	//*  35   66:aload_0         
	//*  36   67:getfield        #40  <Field int c>
	//*  37   70:iload_2         
	//*  38   71:iadd            
	//*  39   72:aload_0         
	//*  40   73:getfield        #28  <Field byte[] a>
	//*  41   76:arraylength     
	//*  42   77:icmpgt          83
		{
			return (long)i;
	//   43   80:iload_2         
	//   44   81:i2l             
	//   45   82:lreturn         
		} else
		{
			int j = c;
	//   46   83:aload_0         
	//   47   84:getfield        #40  <Field int c>
	//   48   87:istore_2        
			long l1 = bmp1.e;
	//   49   88:aload_1         
	//   50   89:getfield        #59  <Field long bmp.e>
	//   51   92:lstore          4
			int k = a.length;
	//   52   94:aload_0         
	//   53   95:getfield        #28  <Field byte[] a>
	//   54   98:arraylength     
	//   55   99:istore_3        
			bmp1 = ((bmp) (new StringBuilder(77)));
	//   56  100:new             #63  <Class StringBuilder>
	//   57  103:dup             
	//   58  104:bipush          77
	//   59  106:invokespecial   #66  <Method void StringBuilder(int)>
	//   60  109:astore_1        
			((StringBuilder) (bmp1)).append("Unsatisfiable range: [");
	//   61  110:aload_1         
	//   62  111:ldc1            #68  <String "Unsatisfiable range: [">
	//   63  113:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   64  116:pop             
			((StringBuilder) (bmp1)).append(j);
	//   65  117:aload_1         
	//   66  118:iload_2         
	//   67  119:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
	//   68  122:pop             
			((StringBuilder) (bmp1)).append(", ");
	//   69  123:aload_1         
	//   70  124:ldc1            #77  <String ", ">
	//   71  126:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   72  129:pop             
			((StringBuilder) (bmp1)).append(l1);
	//   73  130:aload_1         
	//   74  131:lload           4
	//   75  133:invokevirtual   #80  <Method StringBuilder StringBuilder.append(long)>
	//   76  136:pop             
			((StringBuilder) (bmp1)).append("], length: ");
	//   77  137:aload_1         
	//   78  138:ldc1            #82  <String "], length: ">
	//   79  140:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   80  143:pop             
			((StringBuilder) (bmp1)).append(k);
	//   81  144:aload_1         
	//   82  145:iload_3         
	//   83  146:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
	//   84  149:pop             
			throw new IOException(((StringBuilder) (bmp1)).toString());
	//   85  150:new             #84  <Class IOException>
	//   86  153:dup             
	//   87  154:aload_1         
	//   88  155:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   89  158:invokespecial   #91  <Method void IOException(String)>
	//   90  161:athrow          
		}
	}

	public final void a()
	{
		b = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #53  <Field Uri b>
	//    3    5:return          
	}

	public final Uri b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Uri b>
	//    2    4:areturn         
	}

	private final byte a[];
	private Uri b;
	private int c;
	private int d;
}
