// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ara, aso, aql, arb, 
//			aqt, aqs, aqv, aqy, 
//			aqr, aqp, arc

public abstract class aqq
	implements Serializable, Iterable
{

	aqq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
		c = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #56  <Field int c>
	//    5    9:return          
	}

	static int a(byte byte0)
	{
		return b(byte0);
	//    0    0:iload_0         
	//    1    1:invokestatic    #59  <Method int b(byte)>
	//    2    4:ireturn         
	}

	public static aqq a(String s)
	{
		return ((aqq) (new ara(s.getBytes(aso.a))));
	//    0    0:new             #20  <Class ara>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #63  <Field Charset aso.a>
	//    4    8:invokevirtual   #69  <Method byte[] String.getBytes(Charset)>
	//    5   11:invokespecial   #29  <Method void ara(byte[])>
	//    6   14:areturn         
	}

	public static aqq a(byte abyte0[])
	{
		return a(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:invokestatic    #73  <Method aqq a(byte[], int, int)>
	//    5    7:areturn         
	}

	public static aqq a(byte abyte0[], int i, int j)
	{
		b(i, i + j, abyte0.length);
	//    0    0:iload_1         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iadd            
	//    4    4:aload_0         
	//    5    5:arraylength     
	//    6    6:invokestatic    #76  <Method int b(int, int, int)>
	//    7    9:pop             
		return ((aqq) (new ara(b.a(abyte0, i, j))));
	//    8   10:new             #20  <Class ara>
	//    9   13:dup             
	//   10   14:getstatic       #46  <Field aqv b>
	//   11   17:aload_0         
	//   12   18:iload_1         
	//   13   19:iload_2         
	//   14   20:invokeinterface #81  <Method byte[] aqv.a(byte[], int, int)>
	//   15   25:invokespecial   #29  <Method void ara(byte[])>
	//   16   28:areturn         
	}

	private static int b(byte byte0)
	{
		return byte0 & 0xff;
	//    0    0:iload_0         
	//    1    1:sipush          255
	//    2    4:iand            
	//    3    5:ireturn         
	}

	static int b(int i, int j, int k)
	{
		int l = j - i;
	//    0    0:iload_1         
	//    1    1:iload_0         
	//    2    2:isub            
	//    3    3:istore_3        
		if((i | j | l | k - j) < 0)
	//*   4    4:iload_0         
	//*   5    5:iload_1         
	//*   6    6:ior             
	//*   7    7:iload_3         
	//*   8    8:ior             
	//*   9    9:iload_2         
	//*  10   10:iload_1         
	//*  11   11:isub            
	//*  12   12:ior             
	//*  13   13:ifge            180
		{
			if(i >= 0)
	//*  14   16:iload_0         
	//*  15   17:iflt            133
			{
				if(j < i)
	//*  16   20:iload_1         
	//*  17   21:iload_0         
	//*  18   22:icmpge          79
				{
					StringBuilder stringbuilder = new StringBuilder(66);
	//   19   25:new             #83  <Class StringBuilder>
	//   20   28:dup             
	//   21   29:bipush          66
	//   22   31:invokespecial   #86  <Method void StringBuilder(int)>
	//   23   34:astore          4
					stringbuilder.append("Beginning index larger than ending index: ");
	//   24   36:aload           4
	//   25   38:ldc1            #88  <String "Beginning index larger than ending index: ">
	//   26   40:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   27   43:pop             
					stringbuilder.append(i);
	//   28   44:aload           4
	//   29   46:iload_0         
	//   30   47:invokevirtual   #95  <Method StringBuilder StringBuilder.append(int)>
	//   31   50:pop             
					stringbuilder.append(", ");
	//   32   51:aload           4
	//   33   53:ldc1            #97  <String ", ">
	//   34   55:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   35   58:pop             
					stringbuilder.append(j);
	//   36   59:aload           4
	//   37   61:iload_1         
	//   38   62:invokevirtual   #95  <Method StringBuilder StringBuilder.append(int)>
	//   39   65:pop             
					throw new IndexOutOfBoundsException(stringbuilder.toString());
	//   40   66:new             #99  <Class IndexOutOfBoundsException>
	//   41   69:dup             
	//   42   70:aload           4
	//   43   72:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   44   75:invokespecial   #106 <Method void IndexOutOfBoundsException(String)>
	//   45   78:athrow          
				} else
				{
					StringBuilder stringbuilder1 = new StringBuilder(37);
	//   46   79:new             #83  <Class StringBuilder>
	//   47   82:dup             
	//   48   83:bipush          37
	//   49   85:invokespecial   #86  <Method void StringBuilder(int)>
	//   50   88:astore          4
					stringbuilder1.append("End index: ");
	//   51   90:aload           4
	//   52   92:ldc1            #108 <String "End index: ">
	//   53   94:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   54   97:pop             
					stringbuilder1.append(j);
	//   55   98:aload           4
	//   56  100:iload_1         
	//   57  101:invokevirtual   #95  <Method StringBuilder StringBuilder.append(int)>
	//   58  104:pop             
					stringbuilder1.append(" >= ");
	//   59  105:aload           4
	//   60  107:ldc1            #110 <String " >= ">
	//   61  109:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   62  112:pop             
					stringbuilder1.append(k);
	//   63  113:aload           4
	//   64  115:iload_2         
	//   65  116:invokevirtual   #95  <Method StringBuilder StringBuilder.append(int)>
	//   66  119:pop             
					throw new IndexOutOfBoundsException(stringbuilder1.toString());
	//   67  120:new             #99  <Class IndexOutOfBoundsException>
	//   68  123:dup             
	//   69  124:aload           4
	//   70  126:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   71  129:invokespecial   #106 <Method void IndexOutOfBoundsException(String)>
	//   72  132:athrow          
				}
			} else
			{
				StringBuilder stringbuilder2 = new StringBuilder(32);
	//   73  133:new             #83  <Class StringBuilder>
	//   74  136:dup             
	//   75  137:bipush          32
	//   76  139:invokespecial   #86  <Method void StringBuilder(int)>
	//   77  142:astore          4
				stringbuilder2.append("Beginning index: ");
	//   78  144:aload           4
	//   79  146:ldc1            #112 <String "Beginning index: ">
	//   80  148:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   81  151:pop             
				stringbuilder2.append(i);
	//   82  152:aload           4
	//   83  154:iload_0         
	//   84  155:invokevirtual   #95  <Method StringBuilder StringBuilder.append(int)>
	//   85  158:pop             
				stringbuilder2.append(" < 0");
	//   86  159:aload           4
	//   87  161:ldc1            #114 <String " < 0">
	//   88  163:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   89  166:pop             
				throw new IndexOutOfBoundsException(stringbuilder2.toString());
	//   90  167:new             #99  <Class IndexOutOfBoundsException>
	//   91  170:dup             
	//   92  171:aload           4
	//   93  173:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   94  176:invokespecial   #106 <Method void IndexOutOfBoundsException(String)>
	//   95  179:athrow          
			}
		} else
		{
			return l;
	//   96  180:iload_3         
	//   97  181:ireturn         
		}
	}

	static aqq b(byte abyte0[])
	{
		return ((aqq) (new ara(abyte0)));
	//    0    0:new             #20  <Class ara>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #29  <Method void ara(byte[])>
	//    4    8:areturn         
	}

	static aqy b(int i)
	{
		return new aqy(i, ((aqr) (null)));
	//    0    0:new             #117 <Class aqy>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #120 <Method void aqy(int, aqr)>
	//    5    9:areturn         
	}

	public abstract byte a(int i);

	public abstract int a();

	protected abstract int a(int i, int j, int k);

	public abstract aqq a(int i, int j);

	protected abstract String a(Charset charset);

	abstract void a(aqp aqp);

	protected abstract void a(byte abyte0[], int i, int j, int k);

	public final byte[] b()
	{
		int i = a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #129 <Method int a()>
	//    2    4:istore_1        
		if(i == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            13
		{
			return aso.b;
	//    5    9:getstatic       #25  <Field byte[] aso.b>
	//    6   12:areturn         
		} else
		{
			byte abyte0[] = new byte[i];
	//    7   13:iload_1         
	//    8   14:newarray        byte[]
	//    9   16:astore_2        
			a(abyte0, 0, 0, i);
	//   10   17:aload_0         
	//   11   18:aload_2         
	//   12   19:iconst_0        
	//   13   20:iconst_0        
	//   14   21:iload_1         
	//   15   22:invokevirtual   #131 <Method void a(byte[], int, int, int)>
			return abyte0;
	//   16   25:aload_2         
	//   17   26:areturn         
		}
	}

	public final String c()
	{
		Charset charset = aso.a;
	//    0    0:getstatic       #63  <Field Charset aso.a>
	//    1    3:astore_1        
		if(a() == 0)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #129 <Method int a()>
	//*   4    8:ifne            14
			return "";
	//    5   11:ldc1            #133 <String "">
	//    6   13:areturn         
		else
			return a(charset);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #135 <Method String a(Charset)>
	//   10   19:areturn         
	}

	public abstract boolean d();

	public abstract arc e();

	public abstract boolean equals(Object obj);

	protected final int f()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int c>
	//    2    4:ireturn         
	}

	public final int hashCode()
	{
		int j = c;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int c>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            37
		{
			i = a();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #129 <Method int a()>
	//    9   15:istore_1        
			int k = a(i, 0, i);
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:iconst_0        
	//   13   19:iload_1         
	//   14   20:invokevirtual   #143 <Method int a(int, int, int)>
	//   15   23:istore_2        
			i = k;
	//   16   24:iload_2         
	//   17   25:istore_1        
			if(k == 0)
	//*  18   26:iload_2         
	//*  19   27:ifne            32
				i = 1;
	//   20   30:iconst_1        
	//   21   31:istore_1        
			c = i;
	//   22   32:aload_0         
	//   23   33:iload_1         
	//   24   34:putfield        #56  <Field int c>
		}
		return i;
	//   25   37:iload_1         
	//   26   38:ireturn         
	}

	public Iterator iterator()
	{
		return ((Iterator) (new aqr(this)));
	//    0    0:new             #147 <Class aqr>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #150 <Method void aqr(aqq)>
	//    4    8:areturn         
	}

	public final String toString()
	{
		return String.format("<ByteString@%s size=%d>", new Object[] {
			Integer.toHexString(System.identityHashCode(((Object) (this)))), Integer.valueOf(a())
		});
	//    0    0:ldc1            #152 <String "<ByteString@%s size=%d>">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:invokestatic    #158 <Method int System.identityHashCode(Object)>
	//    7   12:invokestatic    #164 <Method String Integer.toHexString(int)>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_0         
	//   12   19:invokevirtual   #129 <Method int a()>
	//   13   22:invokestatic    #168 <Method Integer Integer.valueOf(int)>
	//   14   25:aastore         
	//   15   26:invokestatic    #172 <Method String String.format(String, Object[])>
	//   16   29:areturn         
	}

	public static final aqq a;
	private static final aqv b;
	private static final Comparator d = new aqs();
	private int c;

	static 
	{
		a = ((aqq) (new ara(aso.b)));
	//    0    0:new             #20  <Class ara>
	//    1    3:dup             
	//    2    4:getstatic       #25  <Field byte[] aso.b>
	//    3    7:invokespecial   #29  <Method void ara(byte[])>
	//    4   10:putstatic       #31  <Field aqq a>
		Object obj;
		if(aql.a())
	//*   5   13:invokestatic    #36  <Method boolean aql.a()>
	//*   6   16:ifeq            31
			obj = ((Object) (new arb(((aqr) (null)))));
	//    7   19:new             #38  <Class arb>
	//    8   22:dup             
	//    9   23:aconst_null     
	//   10   24:invokespecial   #41  <Method void arb(aqr)>
	//   11   27:astore_0        
		else
	//*  12   28:goto            40
			obj = ((Object) (new aqt(((aqr) (null)))));
	//   13   31:new             #43  <Class aqt>
	//   14   34:dup             
	//   15   35:aconst_null     
	//   16   36:invokespecial   #44  <Method void aqt(aqr)>
	//   17   39:astore_0        
		b = ((aqv) (obj));
	//   18   40:aload_0         
	//   19   41:putstatic       #46  <Field aqv b>
	//   20   44:new             #48  <Class aqs>
	//   21   47:dup             
	//   22   48:invokespecial   #50  <Method void aqs()>
	//   23   51:putstatic       #52  <Field Comparator d>
	//*  24   54:return          
	}
}
