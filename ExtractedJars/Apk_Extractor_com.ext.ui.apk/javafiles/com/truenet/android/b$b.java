// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.support.v7.ae;
import java.util.List;

// Referenced classes of package com.truenet.android:
//			b

public static final class b$b
{

	public static volatile b$b a(b$b b$b1, String s, long l, int i, List list, String s1, int j, 
			Object obj)
	{
		if((j & 1) != 0)
	//*   0    0:iload           7
	//*   1    2:iconst_1        
	//*   2    3:iand            
	//*   3    4:ifeq            90
			s = b$b1.a;
	//    4    7:aload_0         
	//    5    8:getfield        #32  <Field String a>
	//    6   11:astore_1        
		if((j & 2) != 0)
	//*   7   12:iload           7
	//*   8   14:iconst_2        
	//*   9   15:iand            
	//*  10   16:ifeq            87
			l = b$b1.b;
	//   11   19:aload_0         
	//   12   20:getfield        #34  <Field long b>
	//   13   23:lstore_2        
		if((j & 4) != 0)
	//*  14   24:iload           7
	//*  15   26:iconst_4        
	//*  16   27:iand            
	//*  17   28:ifeq            84
			i = b$b1.c;
	//   18   31:aload_0         
	//   19   32:getfield        #36  <Field int c>
	//   20   35:istore          4
		if((j & 8) != 0)
	//*  21   37:iload           7
	//*  22   39:bipush          8
	//*  23   41:iand            
	//*  24   42:ifeq            81
			list = b$b1.d;
	//   25   45:aload_0         
	//   26   46:getfield        #38  <Field List d>
	//   27   49:astore          5
		if((j & 0x10) != 0)
	//*  28   51:iload           7
	//*  29   53:bipush          16
	//*  30   55:iand            
	//*  31   56:ifeq            78
			s1 = b$b1.e;
	//   32   59:aload_0         
	//   33   60:getfield        #40  <Field String e>
	//   34   63:astore          6
		return b$b1.a(s, l, i, list, s1);
	//   35   65:aload_0         
	//   36   66:aload_1         
	//   37   67:lload_2         
	//   38   68:iload           4
	//   39   70:aload           5
	//   40   72:aload           6
	//   41   74:invokevirtual   #48  <Method b$b a(String, long, int, List, String)>
	//   42   77:areturn         
	//*  43   78:goto            65
	//*  44   81:goto            51
	//*  45   84:goto            37
	//*  46   87:goto            24
	//*  47   90:goto            12
	}

	public final b$b a(String s, long l, int i, List list, String s1)
	{
		ae.b(((Object) (s)), "url");
	//    0    0:aload_1         
	//    1    1:ldc1            #22  <String "url">
	//    2    3:invokestatic    #27  <Method void ae.b(Object, String)>
		return new b$b(s, l, i, list, s1);
	//    3    6:new             #2   <Class b$b>
	//    4    9:dup             
	//    5   10:aload_1         
	//    6   11:lload_2         
	//    7   12:iload           4
	//    8   14:aload           5
	//    9   16:aload           6
	//   10   18:invokespecial   #51  <Method void b$b(String, long, int, List, String)>
	//   11   21:areturn         
	}

	public final String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String a>
	//    2    4:areturn         
	}

	public final long b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field long b>
	//    2    4:lreturn         
	}

	public final int c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int c>
	//    2    4:ireturn         
	}

	public final List d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field List d>
	//    2    4:areturn         
	}

	public final String e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String e>
	//    2    4:areturn         
	}

	public boolean equals(Object obj)
	{
label0:
		{
			boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
			if(this != obj)
	//*   2    3:aload_0         
	//*   3    4:aload_1         
	//*   4    5:if_acmpeq       115
			{
				boolean flag1 = flag2;
	//    5    8:iload           4
	//    6   10:istore_3        
				if(!(obj instanceof b$b))
					break label0;
	//    7   11:aload_1         
	//    8   12:instanceof      #2   <Class b$b>
	//    9   15:ifeq            117
				obj = ((Object) ((b$b)obj));
	//   10   18:aload_1         
	//   11   19:checkcast       #2   <Class b$b>
	//   12   22:astore_1        
				flag1 = flag2;
	//   13   23:iload           4
	//   14   25:istore_3        
				if(!ae.a(((Object) (a)), ((Object) (((b$b) (obj)).a))))
					break label0;
	//   15   26:aload_0         
	//   16   27:getfield        #32  <Field String a>
	//   17   30:aload_1         
	//   18   31:getfield        #32  <Field String a>
	//   19   34:invokestatic    #62  <Method boolean ae.a(Object, Object)>
	//   20   37:ifeq            117
				boolean flag;
				if(b == ((b$b) (obj)).b)
	//*  21   40:aload_0         
	//*  22   41:getfield        #34  <Field long b>
	//*  23   44:aload_1         
	//*  24   45:getfield        #34  <Field long b>
	//*  25   48:lcmp            
	//*  26   49:ifne            119
					flag = true;
	//   27   52:iconst_1        
	//   28   53:istore_2        
				else
	//*  29   54:iload           4
	//*  30   56:istore_3        
	//*  31   57:iload_2         
	//*  32   58:ifeq            117
	//*  33   61:aload_0         
	//*  34   62:getfield        #36  <Field int c>
	//*  35   65:aload_1         
	//*  36   66:getfield        #36  <Field int c>
	//*  37   69:icmpne          124
	//*  38   72:iconst_1        
	//*  39   73:istore_2        
	//*  40   74:iload           4
	//*  41   76:istore_3        
	//*  42   77:iload_2         
	//*  43   78:ifeq            117
	//*  44   81:iload           4
	//*  45   83:istore_3        
	//*  46   84:aload_0         
	//*  47   85:getfield        #38  <Field List d>
	//*  48   88:aload_1         
	//*  49   89:getfield        #38  <Field List d>
	//*  50   92:invokestatic    #62  <Method boolean ae.a(Object, Object)>
	//*  51   95:ifeq            117
	//*  52   98:iload           4
	//*  53  100:istore_3        
	//*  54  101:aload_0         
	//*  55  102:getfield        #40  <Field String e>
	//*  56  105:aload_1         
	//*  57  106:getfield        #40  <Field String e>
	//*  58  109:invokestatic    #62  <Method boolean ae.a(Object, Object)>
	//*  59  112:ifeq            117
	//*  60  115:iconst_1        
	//*  61  116:istore_3        
	//*  62  117:iload_3         
	//*  63  118:ireturn         
					flag = false;
	//   64  119:iconst_0        
	//   65  120:istore_2        
				flag1 = flag2;
				if(!flag)
					break label0;
				if(c == ((b$b) (obj)).c)
					flag = true;
				else
	//*  66  121:goto            54
					flag = false;
	//   67  124:iconst_0        
	//   68  125:istore_2        
				flag1 = flag2;
				if(!flag)
					break label0;
				flag1 = flag2;
				if(!ae.a(((Object) (d)), ((Object) (((b$b) (obj)).d))))
					break label0;
				flag1 = flag2;
				if(!ae.a(((Object) (e)), ((Object) (((b$b) (obj)).e))))
					break label0;
			}
			flag1 = true;
		}
		return flag1;
	//*  69  126:goto            74
	}

	public int hashCode()
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		Object obj = ((Object) (a));
	//    2    2:aload_0         
	//    3    3:getfield        #32  <Field String a>
	//    4    6:astore          8
		int i;
		int j;
		int l;
		int i1;
		long l1;
		if(obj != null)
	//*   5    8:aload           8
	//*   6   10:ifnull          100
			i = obj.hashCode();
	//    7   13:aload           8
	//    8   15:invokevirtual   #65  <Method int Object.hashCode()>
	//    9   18:istore_1        
		else
	//*  10   19:aload_0         
	//*  11   20:getfield        #34  <Field long b>
	//*  12   23:lstore          6
	//*  13   25:lload           6
	//*  14   27:lload           6
	//*  15   29:bipush          32
	//*  16   31:lushr           
	//*  17   32:lxor            
	//*  18   33:l2i             
	//*  19   34:istore          4
	//*  20   36:aload_0         
	//*  21   37:getfield        #36  <Field int c>
	//*  22   40:istore          5
	//*  23   42:aload_0         
	//*  24   43:getfield        #38  <Field List d>
	//*  25   46:astore          8
	//*  26   48:aload           8
	//*  27   50:ifnull          105
	//*  28   53:aload           8
	//*  29   55:invokevirtual   #65  <Method int Object.hashCode()>
	//*  30   58:istore_2        
	//*  31   59:aload_0         
	//*  32   60:getfield        #40  <Field String e>
	//*  33   63:astore          8
	//*  34   65:aload           8
	//*  35   67:ifnull          76
	//*  36   70:aload           8
	//*  37   72:invokevirtual   #65  <Method int Object.hashCode()>
	//*  38   75:istore_3        
	//*  39   76:iload_2         
	//*  40   77:iload_1         
	//*  41   78:bipush          31
	//*  42   80:imul            
	//*  43   81:iload           4
	//*  44   83:iadd            
	//*  45   84:bipush          31
	//*  46   86:imul            
	//*  47   87:iload           5
	//*  48   89:iadd            
	//*  49   90:bipush          31
	//*  50   92:imul            
	//*  51   93:iadd            
	//*  52   94:bipush          31
	//*  53   96:imul            
	//*  54   97:iload_3         
	//*  55   98:iadd            
	//*  56   99:ireturn         
			i = 0;
	//   57  100:iconst_0        
	//   58  101:istore_1        
		l1 = b;
		l = (int)(l1 ^ l1 >>> 32);
		i1 = c;
		obj = ((Object) (d));
		if(obj != null)
			j = obj.hashCode();
		else
	//*  59  102:goto            19
			j = 0;
	//   60  105:iconst_0        
	//   61  106:istore_2        
		obj = ((Object) (e));
		if(obj != null)
			k = obj.hashCode();
		return (j + ((i * 31 + l) * 31 + i1) * 31) * 31 + k;
	//*  62  107:goto            59
	}

	public String toString()
	{
		return (new StringBuilder()).append("ConnectionInfo(url=").append(a).append(", loadTime=").append(b).append(", httpCode=").append(c).append(", cookie=").append(((Object) (d))).append(", redirectUrl=").append(e).append(")").toString();
	//    0    0:new             #68  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void StringBuilder()>
	//    3    7:ldc1            #71  <String "ConnectionInfo(url=">
	//    4    9:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #32  <Field String a>
	//    7   16:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #77  <String ", loadTime=">
	//    9   21:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #34  <Field long b>
	//   12   28:invokevirtual   #80  <Method StringBuilder StringBuilder.append(long)>
	//   13   31:ldc1            #82  <String ", httpCode=">
	//   14   33:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #36  <Field int c>
	//   17   40:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//   18   43:ldc1            #87  <String ", cookie=">
	//   19   45:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #38  <Field List d>
	//   22   52:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
	//   23   55:ldc1            #92  <String ", redirectUrl=">
	//   24   57:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   25   60:aload_0         
	//   26   61:getfield        #40  <Field String e>
	//   27   64:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   28   67:ldc1            #94  <String ")">
	//   29   69:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   30   72:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   31   75:areturn         
	}

	private final String a;
	private final long b;
	private final int c;
	private final List d;
	private final String e;

	public b$b(String s, long l, int i, List list, String s1)
	{
		ae.b(((Object) (s)), "url");
	//    0    0:aload_1         
	//    1    1:ldc1            #22  <String "url">
	//    2    3:invokestatic    #27  <Method void ae.b(Object, String)>
		super();
	//    3    6:aload_0         
	//    4    7:invokespecial   #30  <Method void Object()>
		a = s;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #32  <Field String a>
		b = l;
	//    8   15:aload_0         
	//    9   16:lload_2         
	//   10   17:putfield        #34  <Field long b>
		c = i;
	//   11   20:aload_0         
	//   12   21:iload           4
	//   13   23:putfield        #36  <Field int c>
		d = list;
	//   14   26:aload_0         
	//   15   27:aload           5
	//   16   29:putfield        #38  <Field List d>
		e = s1;
	//   17   32:aload_0         
	//   18   33:aload           6
	//   19   35:putfield        #40  <Field String e>
	//   20   38:return          
	}
}
