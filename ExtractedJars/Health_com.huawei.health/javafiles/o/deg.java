// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			dek, dem

public class deg extends dek
{

	public deg()
	{
		this(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #152 <Method void deg(int)>
	//    3    5:return          
	}

	public deg(int j)
	{
		this(j, c);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:getstatic       #89  <Field byte[] c>
	//    3    5:invokespecial   #155 <Method void deg(int, byte[])>
	//    4    8:return          
	}

	public deg(int j, byte abyte0[])
	{
		this(j, abyte0, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #158 <Method void deg(int, byte[], boolean)>
	//    5    7:return          
	}

	public deg(int j, byte abyte0[], boolean flag)
	{
		int i1;
		if(abyte0 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
			i1 = 0;
	//    2    4:iconst_0        
	//    3    5:istore          4
		else
	//*   4    7:goto            14
			i1 = abyte0.length;
	//    5   10:aload_2         
	//    6   11:arraylength     
	//    7   12:istore          4
		super(3, 4, j, i1);
	//    8   14:aload_0         
	//    9   15:iconst_3        
	//   10   16:iconst_4        
	//   11   17:iload_1         
	//   12   18:iload           4
	//   13   20:invokespecial   #161 <Method void dek(int, int, int, int)>
		g = f;
	//   14   23:aload_0         
	//   15   24:getstatic       #147 <Field byte[] f>
	//   16   27:putfield        #163 <Field byte[] g>
		if(abyte0 != null)
	//*  17   30:aload_2         
	//*  18   31:ifnull          127
		{
			if(e(abyte0))
	//*  19   34:aload_0         
	//*  20   35:aload_2         
	//*  21   36:invokevirtual   #167 <Method boolean e(byte[])>
	//*  22   39:ifeq            79
			{
				abyte0 = ((byte []) (dem.c(abyte0)));
	//   23   42:aload_2         
	//   24   43:invokestatic    #172 <Method String dem.c(byte[])>
	//   25   46:astore_2        
				throw new IllegalArgumentException((new StringBuilder()).append("lineSeparator must not contain base64 characters: [").append(((String) (abyte0))).append("]").toString());
	//   26   47:new             #174 <Class IllegalArgumentException>
	//   27   50:dup             
	//   28   51:new             #176 <Class StringBuilder>
	//   29   54:dup             
	//   30   55:invokespecial   #178 <Method void StringBuilder()>
	//   31   58:ldc1            #180 <String "lineSeparator must not contain base64 characters: [">
	//   32   60:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   33   63:aload_2         
	//   34   64:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   35   67:ldc1            #186 <String "]">
	//   36   69:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   37   72:invokevirtual   #190 <Method String StringBuilder.toString()>
	//   38   75:invokespecial   #193 <Method void IllegalArgumentException(String)>
	//   39   78:athrow          
			}
			if(j > 0)
	//*  40   79:iload_1         
	//*  41   80:ifle            114
			{
				l = abyte0.length + 4;
	//   42   83:aload_0         
	//   43   84:aload_2         
	//   44   85:arraylength     
	//   45   86:iconst_4        
	//   46   87:iadd            
	//   47   88:putfield        #195 <Field int l>
				k = new byte[abyte0.length];
	//   48   91:aload_0         
	//   49   92:aload_2         
	//   50   93:arraylength     
	//   51   94:newarray        byte[]
	//   52   96:putfield        #197 <Field byte[] k>
				System.arraycopy(((Object) (abyte0)), 0, ((Object) (k)), 0, abyte0.length);
	//   53   99:aload_2         
	//   54  100:iconst_0        
	//   55  101:aload_0         
	//   56  102:getfield        #197 <Field byte[] k>
	//   57  105:iconst_0        
	//   58  106:aload_2         
	//   59  107:arraylength     
	//   60  108:invokestatic    #203 <Method void System.arraycopy(Object, int, Object, int, int)>
			} else
	//*  61  111:goto            137
			{
				l = 4;
	//   62  114:aload_0         
	//   63  115:iconst_4        
	//   64  116:putfield        #195 <Field int l>
				k = null;
	//   65  119:aload_0         
	//   66  120:aconst_null     
	//   67  121:putfield        #197 <Field byte[] k>
			}
		} else
	//*  68  124:goto            137
		{
			l = 4;
	//   69  127:aload_0         
	//   70  128:iconst_4        
	//   71  129:putfield        #195 <Field int l>
			k = null;
	//   72  132:aload_0         
	//   73  133:aconst_null     
	//   74  134:putfield        #197 <Field byte[] k>
		}
		i = l - 1;
	//   75  137:aload_0         
	//   76  138:aload_0         
	//   77  139:getfield        #195 <Field int l>
	//   78  142:iconst_1        
	//   79  143:isub            
	//   80  144:putfield        #205 <Field int i>
		if(flag)
	//*  81  147:iload_3         
	//*  82  148:ifeq            158
			abyte0 = d;
	//   83  151:getstatic       #95  <Field byte[] d>
	//   84  154:astore_2        
		else
	//*  85  155:goto            162
			abyte0 = b;
	//   86  158:getstatic       #91  <Field byte[] b>
	//   87  161:astore_2        
		h = abyte0;
	//   88  162:aload_0         
	//   89  163:aload_2         
	//   90  164:putfield        #207 <Field byte[] h>
	//   91  167:return          
	}

	public deg(boolean flag)
	{
		this(76, c, flag);
	//    0    0:aload_0         
	//    1    1:bipush          76
	//    2    3:getstatic       #89  <Field byte[] c>
	//    3    6:iload_1         
	//    4    7:invokespecial   #158 <Method void deg(int, byte[], boolean)>
	//    5   10:return          
	}

	public static String a(byte abyte0[])
	{
		return dem.c(a(abyte0, false));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #211 <Method byte[] a(byte[], boolean)>
	//    3    5:invokestatic    #172 <Method String dem.c(byte[])>
	//    4    8:areturn         
	}

	public static byte[] a(byte abyte0[], boolean flag)
	{
		return e(abyte0, flag, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #214 <Method byte[] e(byte[], boolean, boolean)>
	//    4    6:areturn         
	}

	public static String b(byte abyte0[], int j, int i1)
	{
		char ac[] = new char[((i1 + 2) / 3) * 4];
	//    0    0:iload_2         
	//    1    1:iconst_2        
	//    2    2:iadd            
	//    3    3:iconst_3        
	//    4    4:idiv            
	//    5    5:iconst_4        
	//    6    6:imul            
	//    7    7:newarray        char[]
	//    8    9:astore          5
		int k1 = 0;
	//    9   11:iconst_0        
	//   10   12:istore          4
		for(int j1 = 0; j1 < ac.length; j1 += 4)
	//*  11   14:iconst_0        
	//*  12   15:istore_3        
	//*  13   16:iload_3         
	//*  14   17:aload           5
	//*  15   19:arraylength     
	//*  16   20:icmpge          51
		{
			c(abyte0, j + k1, i1 - k1, ac, j1);
	//   17   23:aload_0         
	//   18   24:iload_1         
	//   19   25:iload           4
	//   20   27:iadd            
	//   21   28:iload_2         
	//   22   29:iload           4
	//   23   31:isub            
	//   24   32:aload           5
	//   25   34:iload_3         
	//   26   35:invokestatic    #218 <Method void c(byte[], int, int, char[], int)>
			k1 += 3;
	//   27   38:iload           4
	//   28   40:iconst_3        
	//   29   41:iadd            
	//   30   42:istore          4
		}

	//   31   44:iload_3         
	//   32   45:iconst_4        
	//   33   46:iadd            
	//   34   47:istore_3        
	//*  35   48:goto            16
		return new String(ac);
	//   36   51:new             #220 <Class String>
	//   37   54:dup             
	//   38   55:aload           5
	//   39   57:invokespecial   #223 <Method void String(char[])>
	//   40   60:areturn         
	}

	private static void c(byte abyte0[], int j, int i1, char ac[], int j1)
	{
		byte byte0 = abyte0[j];
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:baload          
	//    3    3:istore          5
		ac[j1] = a[byte0 >>> 2 & 0x3f];
	//    4    5:aload_3         
	//    5    6:iload           4
	//    6    8:getstatic       #85  <Field char[] a>
	//    7   11:iload           5
	//    8   13:iconst_2        
	//    9   14:iushr           
	//   10   15:bipush          63
	//   11   17:iand            
	//   12   18:caload          
	//   13   19:castore         
		if(i1 > 2)
	//*  14   20:iload_2         
	//*  15   21:iconst_2        
	//*  16   22:icmple          99
		{
			i1 = ((int) (abyte0[j + 1]));
	//   17   25:aload_0         
	//   18   26:iload_1         
	//   19   27:iconst_1        
	//   20   28:iadd            
	//   21   29:baload          
	//   22   30:istore_2        
			j = ((int) (abyte0[j + 2]));
	//   23   31:aload_0         
	//   24   32:iload_1         
	//   25   33:iconst_2        
	//   26   34:iadd            
	//   27   35:baload          
	//   28   36:istore_1        
			ac[j1 + 1] = a[(byte0 << 4 & 0x30) + (i1 >>> 4 & 0xf)];
	//   29   37:aload_3         
	//   30   38:iload           4
	//   31   40:iconst_1        
	//   32   41:iadd            
	//   33   42:getstatic       #85  <Field char[] a>
	//   34   45:iload           5
	//   35   47:iconst_4        
	//   36   48:ishl            
	//   37   49:bipush          48
	//   38   51:iand            
	//   39   52:iload_2         
	//   40   53:iconst_4        
	//   41   54:iushr           
	//   42   55:bipush          15
	//   43   57:iand            
	//   44   58:iadd            
	//   45   59:caload          
	//   46   60:castore         
			ac[j1 + 2] = a[(i1 << 2 & 0x3c) + (j >>> 6 & 3)];
	//   47   61:aload_3         
	//   48   62:iload           4
	//   49   64:iconst_2        
	//   50   65:iadd            
	//   51   66:getstatic       #85  <Field char[] a>
	//   52   69:iload_2         
	//   53   70:iconst_2        
	//   54   71:ishl            
	//   55   72:bipush          60
	//   56   74:iand            
	//   57   75:iload_1         
	//   58   76:bipush          6
	//   59   78:iushr           
	//   60   79:iconst_3        
	//   61   80:iand            
	//   62   81:iadd            
	//   63   82:caload          
	//   64   83:castore         
			ac[j1 + 3] = a[j & 0x3f];
	//   65   84:aload_3         
	//   66   85:iload           4
	//   67   87:iconst_3        
	//   68   88:iadd            
	//   69   89:getstatic       #85  <Field char[] a>
	//   70   92:iload_1         
	//   71   93:bipush          63
	//   72   95:iand            
	//   73   96:caload          
	//   74   97:castore         
			return;
	//   75   98:return          
		}
		if(i1 > 1)
	//*  76   99:iload_2         
	//*  77  100:iconst_1        
	//*  78  101:icmple          161
		{
			j = ((int) (abyte0[j + 1]));
	//   79  104:aload_0         
	//   80  105:iload_1         
	//   81  106:iconst_1        
	//   82  107:iadd            
	//   83  108:baload          
	//   84  109:istore_1        
			ac[j1 + 1] = a[(byte0 << 4 & 0x30) + (j >>> 4 & 0xf)];
	//   85  110:aload_3         
	//   86  111:iload           4
	//   87  113:iconst_1        
	//   88  114:iadd            
	//   89  115:getstatic       #85  <Field char[] a>
	//   90  118:iload           5
	//   91  120:iconst_4        
	//   92  121:ishl            
	//   93  122:bipush          48
	//   94  124:iand            
	//   95  125:iload_1         
	//   96  126:iconst_4        
	//   97  127:iushr           
	//   98  128:bipush          15
	//   99  130:iand            
	//  100  131:iadd            
	//  101  132:caload          
	//  102  133:castore         
			ac[j1 + 2] = a[(j << 2 & 0x3c) + 0];
	//  103  134:aload_3         
	//  104  135:iload           4
	//  105  137:iconst_2        
	//  106  138:iadd            
	//  107  139:getstatic       #85  <Field char[] a>
	//  108  142:iload_1         
	//  109  143:iconst_2        
	//  110  144:ishl            
	//  111  145:bipush          60
	//  112  147:iand            
	//  113  148:iconst_0        
	//  114  149:iadd            
	//  115  150:caload          
	//  116  151:castore         
			ac[j1 + 3] = '=';
	//  117  152:aload_3         
	//  118  153:iload           4
	//  119  155:iconst_3        
	//  120  156:iadd            
	//  121  157:bipush          61
	//  122  159:castore         
			return;
	//  123  160:return          
		} else
		{
			ac[j1 + 1] = a[(byte0 << 4 & 0x30) + 0];
	//  124  161:aload_3         
	//  125  162:iload           4
	//  126  164:iconst_1        
	//  127  165:iadd            
	//  128  166:getstatic       #85  <Field char[] a>
	//  129  169:iload           5
	//  130  171:iconst_4        
	//  131  172:ishl            
	//  132  173:bipush          48
	//  133  175:iand            
	//  134  176:iconst_0        
	//  135  177:iadd            
	//  136  178:caload          
	//  137  179:castore         
			ac[j1 + 2] = '=';
	//  138  180:aload_3         
	//  139  181:iload           4
	//  140  183:iconst_2        
	//  141  184:iadd            
	//  142  185:bipush          61
	//  143  187:castore         
			ac[j1 + 3] = '=';
	//  144  188:aload_3         
	//  145  189:iload           4
	//  146  191:iconst_3        
	//  147  192:iadd            
	//  148  193:bipush          61
	//  149  195:castore         
			return;
	//  150  196:return          
		}
	}

	public static byte[] d(String s)
	{
		return (new deg()).e(s);
	//    0    0:new             #2   <Class deg>
	//    1    3:dup             
	//    2    4:invokespecial   #225 <Method void deg()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #227 <Method byte[] e(String)>
	//    5   11:areturn         
	}

	public static byte[] e(byte abyte0[], boolean flag, boolean flag1)
	{
		return e(abyte0, flag, flag1, 0x7fffffff);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:ldc1            #228 <Int 0x7fffffff>
	//    4    5:invokestatic    #231 <Method byte[] e(byte[], boolean, boolean, int)>
	//    5    8:areturn         
	}

	public static byte[] e(byte abyte0[], boolean flag, boolean flag1, int j)
	{
		if(abyte0 == null || abyte0.length == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          9
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifne            11
			return abyte0;
	//    5    9:aload_0         
	//    6   10:areturn         
		deg deg1;
		if(flag)
	//*   7   11:iload_1         
	//*   8   12:ifeq            28
			deg1 = new deg(flag1);
	//    9   15:new             #2   <Class deg>
	//   10   18:dup             
	//   11   19:iload_2         
	//   12   20:invokespecial   #233 <Method void deg(boolean)>
	//   13   23:astore          6
		else
	//*  14   25:goto            42
			deg1 = new deg(0, c, flag1);
	//   15   28:new             #2   <Class deg>
	//   16   31:dup             
	//   17   32:iconst_0        
	//   18   33:getstatic       #89  <Field byte[] c>
	//   19   36:iload_2         
	//   20   37:invokespecial   #158 <Method void deg(int, byte[], boolean)>
	//   21   40:astore          6
		long l1 = deg1.b(abyte0);
	//   22   42:aload           6
	//   23   44:aload_0         
	//   24   45:invokevirtual   #236 <Method long b(byte[])>
	//   25   48:lstore          4
		if(l1 > (long)j)
	//*  26   50:lload           4
	//*  27   52:iload_3         
	//*  28   53:i2l             
	//*  29   54:lcmp            
	//*  30   55:ifle            95
			throw new IllegalArgumentException((new StringBuilder()).append("Input array too big, the output array would be bigger (").append(l1).append(") than the specified maximum size of ").append(j).toString());
	//   31   58:new             #174 <Class IllegalArgumentException>
	//   32   61:dup             
	//   33   62:new             #176 <Class StringBuilder>
	//   34   65:dup             
	//   35   66:invokespecial   #178 <Method void StringBuilder()>
	//   36   69:ldc1            #238 <String "Input array too big, the output array would be bigger (">
	//   37   71:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   38   74:lload           4
	//   39   76:invokevirtual   #241 <Method StringBuilder StringBuilder.append(long)>
	//   40   79:ldc1            #243 <String ") than the specified maximum size of ">
	//   41   81:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   42   84:iload_3         
	//   43   85:invokevirtual   #246 <Method StringBuilder StringBuilder.append(int)>
	//   44   88:invokevirtual   #190 <Method String StringBuilder.toString()>
	//   45   91:invokespecial   #193 <Method void IllegalArgumentException(String)>
	//   46   94:athrow          
		else
			return deg1.c(abyte0);
	//   47   95:aload           6
	//   48   97:aload_0         
	//   49   98:invokevirtual   #249 <Method byte[] c(byte[])>
	//   50  101:areturn         
	}

	void b(byte abyte0[], int j, int i1, dek.e e1)
	{
		if(e1.d)
	//*   0    0:aload           4
	//*   1    2:getfield        #255 <Field boolean dek$e.d>
	//*   2    5:ifeq            9
			return;
	//    3    8:return          
		if(i1 < 0)
	//*   4    9:iload_3         
	//*   5   10:ifge            435
		{
			e1.d = true;
	//    6   13:aload           4
	//    7   15:iconst_1        
	//    8   16:putfield        #255 <Field boolean dek$e.d>
			if(e1.f == 0 && e == 0)
	//*   9   19:aload           4
	//*  10   21:getfield        #257 <Field int dek$e.f>
	//*  11   24:ifne            35
	//*  12   27:aload_0         
	//*  13   28:getfield        #259 <Field int e>
	//*  14   31:ifne            35
				return;
	//   15   34:return          
			abyte0 = d(l, e1);
	//   16   35:aload_0         
	//   17   36:aload_0         
	//   18   37:getfield        #195 <Field int l>
	//   19   40:aload           4
	//   20   42:invokevirtual   #262 <Method byte[] d(int, dek$e)>
	//   21   45:astore_1        
			j = e1.e;
	//   22   46:aload           4
	//   23   48:getfield        #263 <Field int dek$e.e>
	//   24   51:istore_2        
			switch(e1.f)
	//*  25   52:aload           4
	//*  26   54:getfield        #257 <Field int dek$e.f>
			{
			case 0: // '\0'
				break;

	//*  27   57:tableswitch     0 2: default 84
	//	               0 87
	//	               1 90
	//	               2 205
	//*  28   84:goto            334
	//*  29   87:goto            366
			case 1: // '\001'
				i1 = e1.e;
	//   30   90:aload           4
	//   31   92:getfield        #263 <Field int dek$e.e>
	//   32   95:istore_3        
				e1.e = i1 + 1;
	//   33   96:aload           4
	//   34   98:iload_3         
	//   35   99:iconst_1        
	//   36  100:iadd            
	//   37  101:putfield        #263 <Field int dek$e.e>
				abyte0[i1] = h[e1.a >> 2 & 0x3f];
	//   38  104:aload_1         
	//   39  105:iload_3         
	//   40  106:aload_0         
	//   41  107:getfield        #207 <Field byte[] h>
	//   42  110:aload           4
	//   43  112:getfield        #265 <Field int dek$e.a>
	//   44  115:iconst_2        
	//   45  116:ishr            
	//   46  117:bipush          63
	//   47  119:iand            
	//   48  120:baload          
	//   49  121:bastore         
				i1 = e1.e;
	//   50  122:aload           4
	//   51  124:getfield        #263 <Field int dek$e.e>
	//   52  127:istore_3        
				e1.e = i1 + 1;
	//   53  128:aload           4
	//   54  130:iload_3         
	//   55  131:iconst_1        
	//   56  132:iadd            
	//   57  133:putfield        #263 <Field int dek$e.e>
				abyte0[i1] = h[e1.a << 4 & 0x3f];
	//   58  136:aload_1         
	//   59  137:iload_3         
	//   60  138:aload_0         
	//   61  139:getfield        #207 <Field byte[] h>
	//   62  142:aload           4
	//   63  144:getfield        #265 <Field int dek$e.a>
	//   64  147:iconst_4        
	//   65  148:ishl            
	//   66  149:bipush          63
	//   67  151:iand            
	//   68  152:baload          
	//   69  153:bastore         
				if(h == b)
	//*  70  154:aload_0         
	//*  71  155:getfield        #207 <Field byte[] h>
	//*  72  158:getstatic       #91  <Field byte[] b>
	//*  73  161:if_acmpne       366
				{
					i1 = e1.e;
	//   74  164:aload           4
	//   75  166:getfield        #263 <Field int dek$e.e>
	//   76  169:istore_3        
					e1.e = i1 + 1;
	//   77  170:aload           4
	//   78  172:iload_3         
	//   79  173:iconst_1        
	//   80  174:iadd            
	//   81  175:putfield        #263 <Field int dek$e.e>
					abyte0[i1] = 61;
	//   82  178:aload_1         
	//   83  179:iload_3         
	//   84  180:bipush          61
	//   85  182:bastore         
					i1 = e1.e;
	//   86  183:aload           4
	//   87  185:getfield        #263 <Field int dek$e.e>
	//   88  188:istore_3        
					e1.e = i1 + 1;
	//   89  189:aload           4
	//   90  191:iload_3         
	//   91  192:iconst_1        
	//   92  193:iadd            
	//   93  194:putfield        #263 <Field int dek$e.e>
					abyte0[i1] = 61;
	//   94  197:aload_1         
	//   95  198:iload_3         
	//   96  199:bipush          61
	//   97  201:bastore         
				}
				break;
	//   98  202:goto            366

			case 2: // '\002'
				i1 = e1.e;
	//   99  205:aload           4
	//  100  207:getfield        #263 <Field int dek$e.e>
	//  101  210:istore_3        
				e1.e = i1 + 1;
	//  102  211:aload           4
	//  103  213:iload_3         
	//  104  214:iconst_1        
	//  105  215:iadd            
	//  106  216:putfield        #263 <Field int dek$e.e>
				abyte0[i1] = h[e1.a >> 10 & 0x3f];
	//  107  219:aload_1         
	//  108  220:iload_3         
	//  109  221:aload_0         
	//  110  222:getfield        #207 <Field byte[] h>
	//  111  225:aload           4
	//  112  227:getfield        #265 <Field int dek$e.a>
	//  113  230:bipush          10
	//  114  232:ishr            
	//  115  233:bipush          63
	//  116  235:iand            
	//  117  236:baload          
	//  118  237:bastore         
				i1 = e1.e;
	//  119  238:aload           4
	//  120  240:getfield        #263 <Field int dek$e.e>
	//  121  243:istore_3        
				e1.e = i1 + 1;
	//  122  244:aload           4
	//  123  246:iload_3         
	//  124  247:iconst_1        
	//  125  248:iadd            
	//  126  249:putfield        #263 <Field int dek$e.e>
				abyte0[i1] = h[e1.a >> 4 & 0x3f];
	//  127  252:aload_1         
	//  128  253:iload_3         
	//  129  254:aload_0         
	//  130  255:getfield        #207 <Field byte[] h>
	//  131  258:aload           4
	//  132  260:getfield        #265 <Field int dek$e.a>
	//  133  263:iconst_4        
	//  134  264:ishr            
	//  135  265:bipush          63
	//  136  267:iand            
	//  137  268:baload          
	//  138  269:bastore         
				i1 = e1.e;
	//  139  270:aload           4
	//  140  272:getfield        #263 <Field int dek$e.e>
	//  141  275:istore_3        
				e1.e = i1 + 1;
	//  142  276:aload           4
	//  143  278:iload_3         
	//  144  279:iconst_1        
	//  145  280:iadd            
	//  146  281:putfield        #263 <Field int dek$e.e>
				abyte0[i1] = h[e1.a << 2 & 0x3f];
	//  147  284:aload_1         
	//  148  285:iload_3         
	//  149  286:aload_0         
	//  150  287:getfield        #207 <Field byte[] h>
	//  151  290:aload           4
	//  152  292:getfield        #265 <Field int dek$e.a>
	//  153  295:iconst_2        
	//  154  296:ishl            
	//  155  297:bipush          63
	//  156  299:iand            
	//  157  300:baload          
	//  158  301:bastore         
				if(h == b)
	//* 159  302:aload_0         
	//* 160  303:getfield        #207 <Field byte[] h>
	//* 161  306:getstatic       #91  <Field byte[] b>
	//* 162  309:if_acmpne       366
				{
					i1 = e1.e;
	//  163  312:aload           4
	//  164  314:getfield        #263 <Field int dek$e.e>
	//  165  317:istore_3        
					e1.e = i1 + 1;
	//  166  318:aload           4
	//  167  320:iload_3         
	//  168  321:iconst_1        
	//  169  322:iadd            
	//  170  323:putfield        #263 <Field int dek$e.e>
					abyte0[i1] = 61;
	//  171  326:aload_1         
	//  172  327:iload_3         
	//  173  328:bipush          61
	//  174  330:bastore         
				}
				break;

	//* 175  331:goto            366
			default:
				throw new IllegalStateException((new StringBuilder()).append("Impossible modulus ").append(e1.f).toString());
	//  176  334:new             #267 <Class IllegalStateException>
	//  177  337:dup             
	//  178  338:new             #176 <Class StringBuilder>
	//  179  341:dup             
	//  180  342:invokespecial   #178 <Method void StringBuilder()>
	//  181  345:ldc2            #269 <String "Impossible modulus ">
	//  182  348:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  183  351:aload           4
	//  184  353:getfield        #257 <Field int dek$e.f>
	//  185  356:invokevirtual   #246 <Method StringBuilder StringBuilder.append(int)>
	//  186  359:invokevirtual   #190 <Method String StringBuilder.toString()>
	//  187  362:invokespecial   #270 <Method void IllegalStateException(String)>
	//  188  365:athrow          
			}
			e1.k = e1.k + (e1.e - j);
	//  189  366:aload           4
	//  190  368:aload           4
	//  191  370:getfield        #272 <Field int dek$e.k>
	//  192  373:aload           4
	//  193  375:getfield        #263 <Field int dek$e.e>
	//  194  378:iload_2         
	//  195  379:isub            
	//  196  380:iadd            
	//  197  381:putfield        #272 <Field int dek$e.k>
			if(e > 0 && e1.k > 0)
	//* 198  384:aload_0         
	//* 199  385:getfield        #259 <Field int e>
	//* 200  388:ifle            434
	//* 201  391:aload           4
	//* 202  393:getfield        #272 <Field int dek$e.k>
	//* 203  396:ifle            434
			{
				System.arraycopy(((Object) (k)), 0, ((Object) (abyte0)), e1.e, k.length);
	//  204  399:aload_0         
	//  205  400:getfield        #197 <Field byte[] k>
	//  206  403:iconst_0        
	//  207  404:aload_1         
	//  208  405:aload           4
	//  209  407:getfield        #263 <Field int dek$e.e>
	//  210  410:aload_0         
	//  211  411:getfield        #197 <Field byte[] k>
	//  212  414:arraylength     
	//  213  415:invokestatic    #203 <Method void System.arraycopy(Object, int, Object, int, int)>
				e1.e = e1.e + k.length;
	//  214  418:aload           4
	//  215  420:aload           4
	//  216  422:getfield        #263 <Field int dek$e.e>
	//  217  425:aload_0         
	//  218  426:getfield        #197 <Field byte[] k>
	//  219  429:arraylength     
	//  220  430:iadd            
	//  221  431:putfield        #263 <Field int dek$e.e>
			}
			return;
	//  222  434:return          
		}
		for(int j1 = 0; j1 < i1;)
	//* 223  435:iconst_0        
	//* 224  436:istore          5
	//* 225  438:iload           5
	//* 226  440:iload_3         
	//* 227  441:icmpge          736
		{
			byte abyte1[] = d(l, e1);
	//  228  444:aload_0         
	//  229  445:aload_0         
	//  230  446:getfield        #195 <Field int l>
	//  231  449:aload           4
	//  232  451:invokevirtual   #262 <Method byte[] d(int, dek$e)>
	//  233  454:astore          8
			e1.f = (e1.f + 1) % 3;
	//  234  456:aload           4
	//  235  458:aload           4
	//  236  460:getfield        #257 <Field int dek$e.f>
	//  237  463:iconst_1        
	//  238  464:iadd            
	//  239  465:iconst_3        
	//  240  466:irem            
	//  241  467:putfield        #257 <Field int dek$e.f>
			int k1 = j + 1;
	//  242  470:iload_2         
	//  243  471:iconst_1        
	//  244  472:iadd            
	//  245  473:istore          6
			byte byte0 = abyte0[j];
	//  246  475:aload_1         
	//  247  476:iload_2         
	//  248  477:baload          
	//  249  478:istore          7
			j = ((int) (byte0));
	//  250  480:iload           7
	//  251  482:istore_2        
			if(byte0 < 0)
	//* 252  483:iload           7
	//* 253  485:ifge            495
				j = byte0 + 256;
	//  254  488:iload           7
	//  255  490:sipush          256
	//  256  493:iadd            
	//  257  494:istore_2        
			e1.a = (e1.a << 8) + j;
	//  258  495:aload           4
	//  259  497:aload           4
	//  260  499:getfield        #265 <Field int dek$e.a>
	//  261  502:bipush          8
	//  262  504:ishl            
	//  263  505:iload_2         
	//  264  506:iadd            
	//  265  507:putfield        #265 <Field int dek$e.a>
			if(e1.f == 0)
	//* 266  510:aload           4
	//* 267  512:getfield        #257 <Field int dek$e.f>
	//* 268  515:ifne            724
			{
				j = e1.e;
	//  269  518:aload           4
	//  270  520:getfield        #263 <Field int dek$e.e>
	//  271  523:istore_2        
				e1.e = j + 1;
	//  272  524:aload           4
	//  273  526:iload_2         
	//  274  527:iconst_1        
	//  275  528:iadd            
	//  276  529:putfield        #263 <Field int dek$e.e>
				abyte1[j] = h[e1.a >> 18 & 0x3f];
	//  277  532:aload           8
	//  278  534:iload_2         
	//  279  535:aload_0         
	//  280  536:getfield        #207 <Field byte[] h>
	//  281  539:aload           4
	//  282  541:getfield        #265 <Field int dek$e.a>
	//  283  544:bipush          18
	//  284  546:ishr            
	//  285  547:bipush          63
	//  286  549:iand            
	//  287  550:baload          
	//  288  551:bastore         
				j = e1.e;
	//  289  552:aload           4
	//  290  554:getfield        #263 <Field int dek$e.e>
	//  291  557:istore_2        
				e1.e = j + 1;
	//  292  558:aload           4
	//  293  560:iload_2         
	//  294  561:iconst_1        
	//  295  562:iadd            
	//  296  563:putfield        #263 <Field int dek$e.e>
				abyte1[j] = h[e1.a >> 12 & 0x3f];
	//  297  566:aload           8
	//  298  568:iload_2         
	//  299  569:aload_0         
	//  300  570:getfield        #207 <Field byte[] h>
	//  301  573:aload           4
	//  302  575:getfield        #265 <Field int dek$e.a>
	//  303  578:bipush          12
	//  304  580:ishr            
	//  305  581:bipush          63
	//  306  583:iand            
	//  307  584:baload          
	//  308  585:bastore         
				j = e1.e;
	//  309  586:aload           4
	//  310  588:getfield        #263 <Field int dek$e.e>
	//  311  591:istore_2        
				e1.e = j + 1;
	//  312  592:aload           4
	//  313  594:iload_2         
	//  314  595:iconst_1        
	//  315  596:iadd            
	//  316  597:putfield        #263 <Field int dek$e.e>
				abyte1[j] = h[e1.a >> 6 & 0x3f];
	//  317  600:aload           8
	//  318  602:iload_2         
	//  319  603:aload_0         
	//  320  604:getfield        #207 <Field byte[] h>
	//  321  607:aload           4
	//  322  609:getfield        #265 <Field int dek$e.a>
	//  323  612:bipush          6
	//  324  614:ishr            
	//  325  615:bipush          63
	//  326  617:iand            
	//  327  618:baload          
	//  328  619:bastore         
				j = e1.e;
	//  329  620:aload           4
	//  330  622:getfield        #263 <Field int dek$e.e>
	//  331  625:istore_2        
				e1.e = j + 1;
	//  332  626:aload           4
	//  333  628:iload_2         
	//  334  629:iconst_1        
	//  335  630:iadd            
	//  336  631:putfield        #263 <Field int dek$e.e>
				abyte1[j] = h[e1.a & 0x3f];
	//  337  634:aload           8
	//  338  636:iload_2         
	//  339  637:aload_0         
	//  340  638:getfield        #207 <Field byte[] h>
	//  341  641:aload           4
	//  342  643:getfield        #265 <Field int dek$e.a>
	//  343  646:bipush          63
	//  344  648:iand            
	//  345  649:baload          
	//  346  650:bastore         
				e1.k = e1.k + 4;
	//  347  651:aload           4
	//  348  653:aload           4
	//  349  655:getfield        #272 <Field int dek$e.k>
	//  350  658:iconst_4        
	//  351  659:iadd            
	//  352  660:putfield        #272 <Field int dek$e.k>
				if(e > 0 && e <= e1.k)
	//* 353  663:aload_0         
	//* 354  664:getfield        #259 <Field int e>
	//* 355  667:ifle            724
	//* 356  670:aload_0         
	//* 357  671:getfield        #259 <Field int e>
	//* 358  674:aload           4
	//* 359  676:getfield        #272 <Field int dek$e.k>
	//* 360  679:icmpgt          724
				{
					System.arraycopy(((Object) (k)), 0, ((Object) (abyte1)), e1.e, k.length);
	//  361  682:aload_0         
	//  362  683:getfield        #197 <Field byte[] k>
	//  363  686:iconst_0        
	//  364  687:aload           8
	//  365  689:aload           4
	//  366  691:getfield        #263 <Field int dek$e.e>
	//  367  694:aload_0         
	//  368  695:getfield        #197 <Field byte[] k>
	//  369  698:arraylength     
	//  370  699:invokestatic    #203 <Method void System.arraycopy(Object, int, Object, int, int)>
					e1.e = e1.e + k.length;
	//  371  702:aload           4
	//  372  704:aload           4
	//  373  706:getfield        #263 <Field int dek$e.e>
	//  374  709:aload_0         
	//  375  710:getfield        #197 <Field byte[] k>
	//  376  713:arraylength     
	//  377  714:iadd            
	//  378  715:putfield        #263 <Field int dek$e.e>
					e1.k = 0;
	//  379  718:aload           4
	//  380  720:iconst_0        
	//  381  721:putfield        #272 <Field int dek$e.k>
				}
			}
			j1++;
	//  382  724:iload           5
	//  383  726:iconst_1        
	//  384  727:iadd            
	//  385  728:istore          5
			j = k1;
	//  386  730:iload           6
	//  387  732:istore_2        
		}

	//* 388  733:goto            438
	//  389  736:return          
	}

	protected boolean b(byte byte0)
	{
		return byte0 >= 0 && byte0 < g.length && g[byte0] != -1;
	//    0    0:iload_1         
	//    1    1:iflt            25
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #163 <Field byte[] g>
	//    5    9:arraylength     
	//    6   10:icmpge          25
	//    7   13:aload_0         
	//    8   14:getfield        #163 <Field byte[] g>
	//    9   17:iload_1         
	//   10   18:baload          
	//   11   19:iconst_m1       
	//   12   20:icmpeq          25
	//   13   23:iconst_1        
	//   14   24:ireturn         
	//   15   25:iconst_0        
	//   16   26:ireturn         
	}

	void d(byte abyte0[], int j, int i1, dek.e e1)
	{
		if(e1.d)
	//*   0    0:aload           4
	//*   1    2:getfield        #255 <Field boolean dek$e.d>
	//*   2    5:ifeq            9
			return;
	//    3    8:return          
		if(i1 < 0)
	//*   4    9:iload_3         
	//*   5   10:ifge            19
			e1.d = true;
	//    6   13:aload           4
	//    7   15:iconst_1        
	//    8   16:putfield        #255 <Field boolean dek$e.d>
		int j1 = 0;
	//    9   19:iconst_0        
	//   10   20:istore          5
		do
		{
			int k1 = j;
	//   11   22:iload_2         
	//   12   23:istore          6
			if(j1 >= i1)
				break;
	//   13   25:iload           5
	//   14   27:iload_3         
	//   15   28:icmpge          243
			byte abyte1[] = d(i, e1);
	//   16   31:aload_0         
	//   17   32:aload_0         
	//   18   33:getfield        #205 <Field int i>
	//   19   36:aload           4
	//   20   38:invokevirtual   #262 <Method byte[] d(int, dek$e)>
	//   21   41:astore          7
			j = k1 + 1;
	//   22   43:iload           6
	//   23   45:iconst_1        
	//   24   46:iadd            
	//   25   47:istore_2        
			k1 = ((int) (abyte0[k1]));
	//   26   48:aload_1         
	//   27   49:iload           6
	//   28   51:baload          
	//   29   52:istore          6
			if(k1 == 61)
	//*  30   54:iload           6
	//*  31   56:bipush          61
	//*  32   58:icmpne          70
			{
				e1.d = true;
	//   33   61:aload           4
	//   34   63:iconst_1        
	//   35   64:putfield        #255 <Field boolean dek$e.d>
				break;
	//   36   67:goto            243
			}
			if(k1 >= 0 && k1 < f.length)
	//*  37   70:iload           6
	//*  38   72:iflt            234
	//*  39   75:iload           6
	//*  40   77:getstatic       #147 <Field byte[] f>
	//*  41   80:arraylength     
	//*  42   81:icmpge          234
			{
				k1 = ((int) (f[k1]));
	//   43   84:getstatic       #147 <Field byte[] f>
	//   44   87:iload           6
	//   45   89:baload          
	//   46   90:istore          6
				if(k1 >= 0)
	//*  47   92:iload           6
	//*  48   94:iflt            234
				{
					e1.f = (e1.f + 1) % 4;
	//   49   97:aload           4
	//   50   99:aload           4
	//   51  101:getfield        #257 <Field int dek$e.f>
	//   52  104:iconst_1        
	//   53  105:iadd            
	//   54  106:iconst_4        
	//   55  107:irem            
	//   56  108:putfield        #257 <Field int dek$e.f>
					e1.a = (e1.a << 6) + k1;
	//   57  111:aload           4
	//   58  113:aload           4
	//   59  115:getfield        #265 <Field int dek$e.a>
	//   60  118:bipush          6
	//   61  120:ishl            
	//   62  121:iload           6
	//   63  123:iadd            
	//   64  124:putfield        #265 <Field int dek$e.a>
					if(e1.f == 0)
	//*  65  127:aload           4
	//*  66  129:getfield        #257 <Field int dek$e.f>
	//*  67  132:ifne            234
					{
						int l1 = e1.e;
	//   68  135:aload           4
	//   69  137:getfield        #263 <Field int dek$e.e>
	//   70  140:istore          6
						e1.e = l1 + 1;
	//   71  142:aload           4
	//   72  144:iload           6
	//   73  146:iconst_1        
	//   74  147:iadd            
	//   75  148:putfield        #263 <Field int dek$e.e>
						abyte1[l1] = (byte)(e1.a >> 16 & 0xff);
	//   76  151:aload           7
	//   77  153:iload           6
	//   78  155:aload           4
	//   79  157:getfield        #265 <Field int dek$e.a>
	//   80  160:bipush          16
	//   81  162:ishr            
	//   82  163:sipush          255
	//   83  166:iand            
	//   84  167:int2byte        
	//   85  168:bastore         
						l1 = e1.e;
	//   86  169:aload           4
	//   87  171:getfield        #263 <Field int dek$e.e>
	//   88  174:istore          6
						e1.e = l1 + 1;
	//   89  176:aload           4
	//   90  178:iload           6
	//   91  180:iconst_1        
	//   92  181:iadd            
	//   93  182:putfield        #263 <Field int dek$e.e>
						abyte1[l1] = (byte)(e1.a >> 8 & 0xff);
	//   94  185:aload           7
	//   95  187:iload           6
	//   96  189:aload           4
	//   97  191:getfield        #265 <Field int dek$e.a>
	//   98  194:bipush          8
	//   99  196:ishr            
	//  100  197:sipush          255
	//  101  200:iand            
	//  102  201:int2byte        
	//  103  202:bastore         
						l1 = e1.e;
	//  104  203:aload           4
	//  105  205:getfield        #263 <Field int dek$e.e>
	//  106  208:istore          6
						e1.e = l1 + 1;
	//  107  210:aload           4
	//  108  212:iload           6
	//  109  214:iconst_1        
	//  110  215:iadd            
	//  111  216:putfield        #263 <Field int dek$e.e>
						abyte1[l1] = (byte)(e1.a & 0xff);
	//  112  219:aload           7
	//  113  221:iload           6
	//  114  223:aload           4
	//  115  225:getfield        #265 <Field int dek$e.a>
	//  116  228:sipush          255
	//  117  231:iand            
	//  118  232:int2byte        
	//  119  233:bastore         
					}
				}
			}
			j1++;
	//  120  234:iload           5
	//  121  236:iconst_1        
	//  122  237:iadd            
	//  123  238:istore          5
		} while(true);
	//  124  240:goto            22
		if(e1.d && e1.f != 0)
	//* 125  243:aload           4
	//* 126  245:getfield        #255 <Field boolean dek$e.d>
	//* 127  248:ifeq            446
	//* 128  251:aload           4
	//* 129  253:getfield        #257 <Field int dek$e.f>
	//* 130  256:ifeq            446
		{
			abyte0 = d(i, e1);
	//  131  259:aload_0         
	//  132  260:aload_0         
	//  133  261:getfield        #205 <Field int i>
	//  134  264:aload           4
	//  135  266:invokevirtual   #262 <Method byte[] d(int, dek$e)>
	//  136  269:astore_1        
			switch(e1.f)
	//* 137  270:aload           4
	//* 138  272:getfield        #257 <Field int dek$e.f>
			{
	//* 139  275:tableswitch     1 3: default 300
	//	               1 303
	//	               2 304
	//	               3 344
	//* 140  300:goto            414
			case 1: // '\001'
				return;
	//  141  303:return          

			case 2: // '\002'
				e1.a = e1.a >> 4;
	//  142  304:aload           4
	//  143  306:aload           4
	//  144  308:getfield        #265 <Field int dek$e.a>
	//  145  311:iconst_4        
	//  146  312:ishr            
	//  147  313:putfield        #265 <Field int dek$e.a>
				j = e1.e;
	//  148  316:aload           4
	//  149  318:getfield        #263 <Field int dek$e.e>
	//  150  321:istore_2        
				e1.e = j + 1;
	//  151  322:aload           4
	//  152  324:iload_2         
	//  153  325:iconst_1        
	//  154  326:iadd            
	//  155  327:putfield        #263 <Field int dek$e.e>
				abyte0[j] = (byte)(e1.a & 0xff);
	//  156  330:aload_1         
	//  157  331:iload_2         
	//  158  332:aload           4
	//  159  334:getfield        #265 <Field int dek$e.a>
	//  160  337:sipush          255
	//  161  340:iand            
	//  162  341:int2byte        
	//  163  342:bastore         
				return;
	//  164  343:return          

			case 3: // '\003'
				e1.a = e1.a >> 2;
	//  165  344:aload           4
	//  166  346:aload           4
	//  167  348:getfield        #265 <Field int dek$e.a>
	//  168  351:iconst_2        
	//  169  352:ishr            
	//  170  353:putfield        #265 <Field int dek$e.a>
				j = e1.e;
	//  171  356:aload           4
	//  172  358:getfield        #263 <Field int dek$e.e>
	//  173  361:istore_2        
				e1.e = j + 1;
	//  174  362:aload           4
	//  175  364:iload_2         
	//  176  365:iconst_1        
	//  177  366:iadd            
	//  178  367:putfield        #263 <Field int dek$e.e>
				abyte0[j] = (byte)(e1.a >> 8 & 0xff);
	//  179  370:aload_1         
	//  180  371:iload_2         
	//  181  372:aload           4
	//  182  374:getfield        #265 <Field int dek$e.a>
	//  183  377:bipush          8
	//  184  379:ishr            
	//  185  380:sipush          255
	//  186  383:iand            
	//  187  384:int2byte        
	//  188  385:bastore         
				j = e1.e;
	//  189  386:aload           4
	//  190  388:getfield        #263 <Field int dek$e.e>
	//  191  391:istore_2        
				e1.e = j + 1;
	//  192  392:aload           4
	//  193  394:iload_2         
	//  194  395:iconst_1        
	//  195  396:iadd            
	//  196  397:putfield        #263 <Field int dek$e.e>
				abyte0[j] = (byte)(e1.a & 0xff);
	//  197  400:aload_1         
	//  198  401:iload_2         
	//  199  402:aload           4
	//  200  404:getfield        #265 <Field int dek$e.a>
	//  201  407:sipush          255
	//  202  410:iand            
	//  203  411:int2byte        
	//  204  412:bastore         
				return;
	//  205  413:return          
			}
			throw new IllegalStateException((new StringBuilder()).append("Impossible modulus ").append(e1.f).toString());
	//  206  414:new             #267 <Class IllegalStateException>
	//  207  417:dup             
	//  208  418:new             #176 <Class StringBuilder>
	//  209  421:dup             
	//  210  422:invokespecial   #178 <Method void StringBuilder()>
	//  211  425:ldc2            #269 <String "Impossible modulus ">
	//  212  428:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  213  431:aload           4
	//  214  433:getfield        #257 <Field int dek$e.f>
	//  215  436:invokevirtual   #246 <Method StringBuilder StringBuilder.append(int)>
	//  216  439:invokevirtual   #190 <Method String StringBuilder.toString()>
	//  217  442:invokespecial   #270 <Method void IllegalStateException(String)>
	//  218  445:athrow          
		} else
		{
			return;
	//  219  446:return          
		}
	}

	private static final char a[] = {
		'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 
		'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
		'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 
		'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 
		'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
		'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', 
		'8', '9', '+', '/'
	};
	private static final byte b[] = {
		65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
		75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
		85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
		101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
		111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
		121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
		56, 57, 43, 47
	};
	static final byte c[] = {
		13, 10
	};
	private static final byte d[] = {
		65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
		75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
		85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
		101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
		111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
		121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
		56, 57, 45, 95
	};
	private static final byte f[] = {
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 
		54, 55, 56, 57, 58, 59, 60, 61, -1, -1, 
		-1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 
		5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
		15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
		25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 
		29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
		39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
		49, 50, 51
	};
	private final byte g[];
	private final byte h[];
	private final int i;
	private final byte k[];
	private final int l;

	static 
	{
	//    0    0:bipush          64
	//    1    2:newarray        char[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #20  <Int 65>
	//    5    8:castore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #21  <Int 66>
	//    9   13:castore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #22  <Int 67>
	//   13   18:castore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #23  <Int 68>
	//   17   23:castore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:ldc1            #24  <Int 69>
	//   21   28:castore         
	//   22   29:dup             
	//   23   30:iconst_5        
	//   24   31:ldc1            #25  <Int 70>
	//   25   33:castore         
	//   26   34:dup             
	//   27   35:bipush          6
	//   28   37:ldc1            #26  <Int 71>
	//   29   39:castore         
	//   30   40:dup             
	//   31   41:bipush          7
	//   32   43:ldc1            #27  <Int 72>
	//   33   45:castore         
	//   34   46:dup             
	//   35   47:bipush          8
	//   36   49:ldc1            #28  <Int 73>
	//   37   51:castore         
	//   38   52:dup             
	//   39   53:bipush          9
	//   40   55:ldc1            #29  <Int 74>
	//   41   57:castore         
	//   42   58:dup             
	//   43   59:bipush          10
	//   44   61:ldc1            #30  <Int 75>
	//   45   63:castore         
	//   46   64:dup             
	//   47   65:bipush          11
	//   48   67:ldc1            #31  <Int 76>
	//   49   69:castore         
	//   50   70:dup             
	//   51   71:bipush          12
	//   52   73:ldc1            #32  <Int 77>
	//   53   75:castore         
	//   54   76:dup             
	//   55   77:bipush          13
	//   56   79:ldc1            #33  <Int 78>
	//   57   81:castore         
	//   58   82:dup             
	//   59   83:bipush          14
	//   60   85:ldc1            #34  <Int 79>
	//   61   87:castore         
	//   62   88:dup             
	//   63   89:bipush          15
	//   64   91:ldc1            #35  <Int 80>
	//   65   93:castore         
	//   66   94:dup             
	//   67   95:bipush          16
	//   68   97:ldc1            #36  <Int 81>
	//   69   99:castore         
	//   70  100:dup             
	//   71  101:bipush          17
	//   72  103:ldc1            #37  <Int 82>
	//   73  105:castore         
	//   74  106:dup             
	//   75  107:bipush          18
	//   76  109:ldc1            #38  <Int 83>
	//   77  111:castore         
	//   78  112:dup             
	//   79  113:bipush          19
	//   80  115:ldc1            #39  <Int 84>
	//   81  117:castore         
	//   82  118:dup             
	//   83  119:bipush          20
	//   84  121:ldc1            #40  <Int 85>
	//   85  123:castore         
	//   86  124:dup             
	//   87  125:bipush          21
	//   88  127:ldc1            #41  <Int 86>
	//   89  129:castore         
	//   90  130:dup             
	//   91  131:bipush          22
	//   92  133:ldc1            #42  <Int 87>
	//   93  135:castore         
	//   94  136:dup             
	//   95  137:bipush          23
	//   96  139:ldc1            #43  <Int 88>
	//   97  141:castore         
	//   98  142:dup             
	//   99  143:bipush          24
	//  100  145:ldc1            #44  <Int 89>
	//  101  147:castore         
	//  102  148:dup             
	//  103  149:bipush          25
	//  104  151:ldc1            #45  <Int 90>
	//  105  153:castore         
	//  106  154:dup             
	//  107  155:bipush          26
	//  108  157:ldc1            #46  <Int 97>
	//  109  159:castore         
	//  110  160:dup             
	//  111  161:bipush          27
	//  112  163:ldc1            #47  <Int 98>
	//  113  165:castore         
	//  114  166:dup             
	//  115  167:bipush          28
	//  116  169:ldc1            #48  <Int 99>
	//  117  171:castore         
	//  118  172:dup             
	//  119  173:bipush          29
	//  120  175:ldc1            #49  <Int 100>
	//  121  177:castore         
	//  122  178:dup             
	//  123  179:bipush          30
	//  124  181:ldc1            #50  <Int 101>
	//  125  183:castore         
	//  126  184:dup             
	//  127  185:bipush          31
	//  128  187:ldc1            #51  <Int 102>
	//  129  189:castore         
	//  130  190:dup             
	//  131  191:bipush          32
	//  132  193:ldc1            #52  <Int 103>
	//  133  195:castore         
	//  134  196:dup             
	//  135  197:bipush          33
	//  136  199:ldc1            #53  <Int 104>
	//  137  201:castore         
	//  138  202:dup             
	//  139  203:bipush          34
	//  140  205:ldc1            #54  <Int 105>
	//  141  207:castore         
	//  142  208:dup             
	//  143  209:bipush          35
	//  144  211:ldc1            #55  <Int 106>
	//  145  213:castore         
	//  146  214:dup             
	//  147  215:bipush          36
	//  148  217:ldc1            #56  <Int 107>
	//  149  219:castore         
	//  150  220:dup             
	//  151  221:bipush          37
	//  152  223:ldc1            #57  <Int 108>
	//  153  225:castore         
	//  154  226:dup             
	//  155  227:bipush          38
	//  156  229:ldc1            #58  <Int 109>
	//  157  231:castore         
	//  158  232:dup             
	//  159  233:bipush          39
	//  160  235:ldc1            #59  <Int 110>
	//  161  237:castore         
	//  162  238:dup             
	//  163  239:bipush          40
	//  164  241:ldc1            #60  <Int 111>
	//  165  243:castore         
	//  166  244:dup             
	//  167  245:bipush          41
	//  168  247:ldc1            #61  <Int 112>
	//  169  249:castore         
	//  170  250:dup             
	//  171  251:bipush          42
	//  172  253:ldc1            #62  <Int 113>
	//  173  255:castore         
	//  174  256:dup             
	//  175  257:bipush          43
	//  176  259:ldc1            #63  <Int 114>
	//  177  261:castore         
	//  178  262:dup             
	//  179  263:bipush          44
	//  180  265:ldc1            #64  <Int 115>
	//  181  267:castore         
	//  182  268:dup             
	//  183  269:bipush          45
	//  184  271:ldc1            #65  <Int 116>
	//  185  273:castore         
	//  186  274:dup             
	//  187  275:bipush          46
	//  188  277:ldc1            #66  <Int 117>
	//  189  279:castore         
	//  190  280:dup             
	//  191  281:bipush          47
	//  192  283:ldc1            #67  <Int 118>
	//  193  285:castore         
	//  194  286:dup             
	//  195  287:bipush          48
	//  196  289:ldc1            #68  <Int 119>
	//  197  291:castore         
	//  198  292:dup             
	//  199  293:bipush          49
	//  200  295:ldc1            #69  <Int 120>
	//  201  297:castore         
	//  202  298:dup             
	//  203  299:bipush          50
	//  204  301:ldc1            #70  <Int 121>
	//  205  303:castore         
	//  206  304:dup             
	//  207  305:bipush          51
	//  208  307:ldc1            #71  <Int 122>
	//  209  309:castore         
	//  210  310:dup             
	//  211  311:bipush          52
	//  212  313:ldc1            #72  <Int 48>
	//  213  315:castore         
	//  214  316:dup             
	//  215  317:bipush          53
	//  216  319:ldc1            #73  <Int 49>
	//  217  321:castore         
	//  218  322:dup             
	//  219  323:bipush          54
	//  220  325:ldc1            #74  <Int 50>
	//  221  327:castore         
	//  222  328:dup             
	//  223  329:bipush          55
	//  224  331:ldc1            #75  <Int 51>
	//  225  333:castore         
	//  226  334:dup             
	//  227  335:bipush          56
	//  228  337:ldc1            #76  <Int 52>
	//  229  339:castore         
	//  230  340:dup             
	//  231  341:bipush          57
	//  232  343:ldc1            #77  <Int 53>
	//  233  345:castore         
	//  234  346:dup             
	//  235  347:bipush          58
	//  236  349:ldc1            #78  <Int 54>
	//  237  351:castore         
	//  238  352:dup             
	//  239  353:bipush          59
	//  240  355:ldc1            #79  <Int 55>
	//  241  357:castore         
	//  242  358:dup             
	//  243  359:bipush          60
	//  244  361:ldc1            #80  <Int 56>
	//  245  363:castore         
	//  246  364:dup             
	//  247  365:bipush          61
	//  248  367:ldc1            #81  <Int 57>
	//  249  369:castore         
	//  250  370:dup             
	//  251  371:bipush          62
	//  252  373:ldc1            #82  <Int 43>
	//  253  375:castore         
	//  254  376:dup             
	//  255  377:bipush          63
	//  256  379:ldc1            #83  <Int 47>
	//  257  381:castore         
	//  258  382:putstatic       #85  <Field char[] a>
	//  259  385:iconst_2        
	//  260  386:newarray        byte[]
	//  261  388:dup             
	//  262  389:iconst_0        
	//  263  390:ldc1            #86  <Int 13>
	//  264  392:bastore         
	//  265  393:dup             
	//  266  394:iconst_1        
	//  267  395:ldc1            #87  <Int 10>
	//  268  397:bastore         
	//  269  398:putstatic       #89  <Field byte[] c>
	//  270  401:bipush          64
	//  271  403:newarray        byte[]
	//  272  405:dup             
	//  273  406:iconst_0        
	//  274  407:ldc1            #20  <Int 65>
	//  275  409:bastore         
	//  276  410:dup             
	//  277  411:iconst_1        
	//  278  412:ldc1            #21  <Int 66>
	//  279  414:bastore         
	//  280  415:dup             
	//  281  416:iconst_2        
	//  282  417:ldc1            #22  <Int 67>
	//  283  419:bastore         
	//  284  420:dup             
	//  285  421:iconst_3        
	//  286  422:ldc1            #23  <Int 68>
	//  287  424:bastore         
	//  288  425:dup             
	//  289  426:iconst_4        
	//  290  427:ldc1            #24  <Int 69>
	//  291  429:bastore         
	//  292  430:dup             
	//  293  431:iconst_5        
	//  294  432:ldc1            #25  <Int 70>
	//  295  434:bastore         
	//  296  435:dup             
	//  297  436:bipush          6
	//  298  438:ldc1            #26  <Int 71>
	//  299  440:bastore         
	//  300  441:dup             
	//  301  442:bipush          7
	//  302  444:ldc1            #27  <Int 72>
	//  303  446:bastore         
	//  304  447:dup             
	//  305  448:bipush          8
	//  306  450:ldc1            #28  <Int 73>
	//  307  452:bastore         
	//  308  453:dup             
	//  309  454:bipush          9
	//  310  456:ldc1            #29  <Int 74>
	//  311  458:bastore         
	//  312  459:dup             
	//  313  460:bipush          10
	//  314  462:ldc1            #30  <Int 75>
	//  315  464:bastore         
	//  316  465:dup             
	//  317  466:bipush          11
	//  318  468:ldc1            #31  <Int 76>
	//  319  470:bastore         
	//  320  471:dup             
	//  321  472:bipush          12
	//  322  474:ldc1            #32  <Int 77>
	//  323  476:bastore         
	//  324  477:dup             
	//  325  478:bipush          13
	//  326  480:ldc1            #33  <Int 78>
	//  327  482:bastore         
	//  328  483:dup             
	//  329  484:bipush          14
	//  330  486:ldc1            #34  <Int 79>
	//  331  488:bastore         
	//  332  489:dup             
	//  333  490:bipush          15
	//  334  492:ldc1            #35  <Int 80>
	//  335  494:bastore         
	//  336  495:dup             
	//  337  496:bipush          16
	//  338  498:ldc1            #36  <Int 81>
	//  339  500:bastore         
	//  340  501:dup             
	//  341  502:bipush          17
	//  342  504:ldc1            #37  <Int 82>
	//  343  506:bastore         
	//  344  507:dup             
	//  345  508:bipush          18
	//  346  510:ldc1            #38  <Int 83>
	//  347  512:bastore         
	//  348  513:dup             
	//  349  514:bipush          19
	//  350  516:ldc1            #39  <Int 84>
	//  351  518:bastore         
	//  352  519:dup             
	//  353  520:bipush          20
	//  354  522:ldc1            #40  <Int 85>
	//  355  524:bastore         
	//  356  525:dup             
	//  357  526:bipush          21
	//  358  528:ldc1            #41  <Int 86>
	//  359  530:bastore         
	//  360  531:dup             
	//  361  532:bipush          22
	//  362  534:ldc1            #42  <Int 87>
	//  363  536:bastore         
	//  364  537:dup             
	//  365  538:bipush          23
	//  366  540:ldc1            #43  <Int 88>
	//  367  542:bastore         
	//  368  543:dup             
	//  369  544:bipush          24
	//  370  546:ldc1            #44  <Int 89>
	//  371  548:bastore         
	//  372  549:dup             
	//  373  550:bipush          25
	//  374  552:ldc1            #45  <Int 90>
	//  375  554:bastore         
	//  376  555:dup             
	//  377  556:bipush          26
	//  378  558:ldc1            #46  <Int 97>
	//  379  560:bastore         
	//  380  561:dup             
	//  381  562:bipush          27
	//  382  564:ldc1            #47  <Int 98>
	//  383  566:bastore         
	//  384  567:dup             
	//  385  568:bipush          28
	//  386  570:ldc1            #48  <Int 99>
	//  387  572:bastore         
	//  388  573:dup             
	//  389  574:bipush          29
	//  390  576:ldc1            #49  <Int 100>
	//  391  578:bastore         
	//  392  579:dup             
	//  393  580:bipush          30
	//  394  582:ldc1            #50  <Int 101>
	//  395  584:bastore         
	//  396  585:dup             
	//  397  586:bipush          31
	//  398  588:ldc1            #51  <Int 102>
	//  399  590:bastore         
	//  400  591:dup             
	//  401  592:bipush          32
	//  402  594:ldc1            #52  <Int 103>
	//  403  596:bastore         
	//  404  597:dup             
	//  405  598:bipush          33
	//  406  600:ldc1            #53  <Int 104>
	//  407  602:bastore         
	//  408  603:dup             
	//  409  604:bipush          34
	//  410  606:ldc1            #54  <Int 105>
	//  411  608:bastore         
	//  412  609:dup             
	//  413  610:bipush          35
	//  414  612:ldc1            #55  <Int 106>
	//  415  614:bastore         
	//  416  615:dup             
	//  417  616:bipush          36
	//  418  618:ldc1            #56  <Int 107>
	//  419  620:bastore         
	//  420  621:dup             
	//  421  622:bipush          37
	//  422  624:ldc1            #57  <Int 108>
	//  423  626:bastore         
	//  424  627:dup             
	//  425  628:bipush          38
	//  426  630:ldc1            #58  <Int 109>
	//  427  632:bastore         
	//  428  633:dup             
	//  429  634:bipush          39
	//  430  636:ldc1            #59  <Int 110>
	//  431  638:bastore         
	//  432  639:dup             
	//  433  640:bipush          40
	//  434  642:ldc1            #60  <Int 111>
	//  435  644:bastore         
	//  436  645:dup             
	//  437  646:bipush          41
	//  438  648:ldc1            #61  <Int 112>
	//  439  650:bastore         
	//  440  651:dup             
	//  441  652:bipush          42
	//  442  654:ldc1            #62  <Int 113>
	//  443  656:bastore         
	//  444  657:dup             
	//  445  658:bipush          43
	//  446  660:ldc1            #63  <Int 114>
	//  447  662:bastore         
	//  448  663:dup             
	//  449  664:bipush          44
	//  450  666:ldc1            #64  <Int 115>
	//  451  668:bastore         
	//  452  669:dup             
	//  453  670:bipush          45
	//  454  672:ldc1            #65  <Int 116>
	//  455  674:bastore         
	//  456  675:dup             
	//  457  676:bipush          46
	//  458  678:ldc1            #66  <Int 117>
	//  459  680:bastore         
	//  460  681:dup             
	//  461  682:bipush          47
	//  462  684:ldc1            #67  <Int 118>
	//  463  686:bastore         
	//  464  687:dup             
	//  465  688:bipush          48
	//  466  690:ldc1            #68  <Int 119>
	//  467  692:bastore         
	//  468  693:dup             
	//  469  694:bipush          49
	//  470  696:ldc1            #69  <Int 120>
	//  471  698:bastore         
	//  472  699:dup             
	//  473  700:bipush          50
	//  474  702:ldc1            #70  <Int 121>
	//  475  704:bastore         
	//  476  705:dup             
	//  477  706:bipush          51
	//  478  708:ldc1            #71  <Int 122>
	//  479  710:bastore         
	//  480  711:dup             
	//  481  712:bipush          52
	//  482  714:ldc1            #72  <Int 48>
	//  483  716:bastore         
	//  484  717:dup             
	//  485  718:bipush          53
	//  486  720:ldc1            #73  <Int 49>
	//  487  722:bastore         
	//  488  723:dup             
	//  489  724:bipush          54
	//  490  726:ldc1            #74  <Int 50>
	//  491  728:bastore         
	//  492  729:dup             
	//  493  730:bipush          55
	//  494  732:ldc1            #75  <Int 51>
	//  495  734:bastore         
	//  496  735:dup             
	//  497  736:bipush          56
	//  498  738:ldc1            #76  <Int 52>
	//  499  740:bastore         
	//  500  741:dup             
	//  501  742:bipush          57
	//  502  744:ldc1            #77  <Int 53>
	//  503  746:bastore         
	//  504  747:dup             
	//  505  748:bipush          58
	//  506  750:ldc1            #78  <Int 54>
	//  507  752:bastore         
	//  508  753:dup             
	//  509  754:bipush          59
	//  510  756:ldc1            #79  <Int 55>
	//  511  758:bastore         
	//  512  759:dup             
	//  513  760:bipush          60
	//  514  762:ldc1            #80  <Int 56>
	//  515  764:bastore         
	//  516  765:dup             
	//  517  766:bipush          61
	//  518  768:ldc1            #81  <Int 57>
	//  519  770:bastore         
	//  520  771:dup             
	//  521  772:bipush          62
	//  522  774:ldc1            #82  <Int 43>
	//  523  776:bastore         
	//  524  777:dup             
	//  525  778:bipush          63
	//  526  780:ldc1            #83  <Int 47>
	//  527  782:bastore         
	//  528  783:putstatic       #91  <Field byte[] b>
	//  529  786:bipush          64
	//  530  788:newarray        byte[]
	//  531  790:dup             
	//  532  791:iconst_0        
	//  533  792:ldc1            #20  <Int 65>
	//  534  794:bastore         
	//  535  795:dup             
	//  536  796:iconst_1        
	//  537  797:ldc1            #21  <Int 66>
	//  538  799:bastore         
	//  539  800:dup             
	//  540  801:iconst_2        
	//  541  802:ldc1            #22  <Int 67>
	//  542  804:bastore         
	//  543  805:dup             
	//  544  806:iconst_3        
	//  545  807:ldc1            #23  <Int 68>
	//  546  809:bastore         
	//  547  810:dup             
	//  548  811:iconst_4        
	//  549  812:ldc1            #24  <Int 69>
	//  550  814:bastore         
	//  551  815:dup             
	//  552  816:iconst_5        
	//  553  817:ldc1            #25  <Int 70>
	//  554  819:bastore         
	//  555  820:dup             
	//  556  821:bipush          6
	//  557  823:ldc1            #26  <Int 71>
	//  558  825:bastore         
	//  559  826:dup             
	//  560  827:bipush          7
	//  561  829:ldc1            #27  <Int 72>
	//  562  831:bastore         
	//  563  832:dup             
	//  564  833:bipush          8
	//  565  835:ldc1            #28  <Int 73>
	//  566  837:bastore         
	//  567  838:dup             
	//  568  839:bipush          9
	//  569  841:ldc1            #29  <Int 74>
	//  570  843:bastore         
	//  571  844:dup             
	//  572  845:bipush          10
	//  573  847:ldc1            #30  <Int 75>
	//  574  849:bastore         
	//  575  850:dup             
	//  576  851:bipush          11
	//  577  853:ldc1            #31  <Int 76>
	//  578  855:bastore         
	//  579  856:dup             
	//  580  857:bipush          12
	//  581  859:ldc1            #32  <Int 77>
	//  582  861:bastore         
	//  583  862:dup             
	//  584  863:bipush          13
	//  585  865:ldc1            #33  <Int 78>
	//  586  867:bastore         
	//  587  868:dup             
	//  588  869:bipush          14
	//  589  871:ldc1            #34  <Int 79>
	//  590  873:bastore         
	//  591  874:dup             
	//  592  875:bipush          15
	//  593  877:ldc1            #35  <Int 80>
	//  594  879:bastore         
	//  595  880:dup             
	//  596  881:bipush          16
	//  597  883:ldc1            #36  <Int 81>
	//  598  885:bastore         
	//  599  886:dup             
	//  600  887:bipush          17
	//  601  889:ldc1            #37  <Int 82>
	//  602  891:bastore         
	//  603  892:dup             
	//  604  893:bipush          18
	//  605  895:ldc1            #38  <Int 83>
	//  606  897:bastore         
	//  607  898:dup             
	//  608  899:bipush          19
	//  609  901:ldc1            #39  <Int 84>
	//  610  903:bastore         
	//  611  904:dup             
	//  612  905:bipush          20
	//  613  907:ldc1            #40  <Int 85>
	//  614  909:bastore         
	//  615  910:dup             
	//  616  911:bipush          21
	//  617  913:ldc1            #41  <Int 86>
	//  618  915:bastore         
	//  619  916:dup             
	//  620  917:bipush          22
	//  621  919:ldc1            #42  <Int 87>
	//  622  921:bastore         
	//  623  922:dup             
	//  624  923:bipush          23
	//  625  925:ldc1            #43  <Int 88>
	//  626  927:bastore         
	//  627  928:dup             
	//  628  929:bipush          24
	//  629  931:ldc1            #44  <Int 89>
	//  630  933:bastore         
	//  631  934:dup             
	//  632  935:bipush          25
	//  633  937:ldc1            #45  <Int 90>
	//  634  939:bastore         
	//  635  940:dup             
	//  636  941:bipush          26
	//  637  943:ldc1            #46  <Int 97>
	//  638  945:bastore         
	//  639  946:dup             
	//  640  947:bipush          27
	//  641  949:ldc1            #47  <Int 98>
	//  642  951:bastore         
	//  643  952:dup             
	//  644  953:bipush          28
	//  645  955:ldc1            #48  <Int 99>
	//  646  957:bastore         
	//  647  958:dup             
	//  648  959:bipush          29
	//  649  961:ldc1            #49  <Int 100>
	//  650  963:bastore         
	//  651  964:dup             
	//  652  965:bipush          30
	//  653  967:ldc1            #50  <Int 101>
	//  654  969:bastore         
	//  655  970:dup             
	//  656  971:bipush          31
	//  657  973:ldc1            #51  <Int 102>
	//  658  975:bastore         
	//  659  976:dup             
	//  660  977:bipush          32
	//  661  979:ldc1            #52  <Int 103>
	//  662  981:bastore         
	//  663  982:dup             
	//  664  983:bipush          33
	//  665  985:ldc1            #53  <Int 104>
	//  666  987:bastore         
	//  667  988:dup             
	//  668  989:bipush          34
	//  669  991:ldc1            #54  <Int 105>
	//  670  993:bastore         
	//  671  994:dup             
	//  672  995:bipush          35
	//  673  997:ldc1            #55  <Int 106>
	//  674  999:bastore         
	//  675 1000:dup             
	//  676 1001:bipush          36
	//  677 1003:ldc1            #56  <Int 107>
	//  678 1005:bastore         
	//  679 1006:dup             
	//  680 1007:bipush          37
	//  681 1009:ldc1            #57  <Int 108>
	//  682 1011:bastore         
	//  683 1012:dup             
	//  684 1013:bipush          38
	//  685 1015:ldc1            #58  <Int 109>
	//  686 1017:bastore         
	//  687 1018:dup             
	//  688 1019:bipush          39
	//  689 1021:ldc1            #59  <Int 110>
	//  690 1023:bastore         
	//  691 1024:dup             
	//  692 1025:bipush          40
	//  693 1027:ldc1            #60  <Int 111>
	//  694 1029:bastore         
	//  695 1030:dup             
	//  696 1031:bipush          41
	//  697 1033:ldc1            #61  <Int 112>
	//  698 1035:bastore         
	//  699 1036:dup             
	//  700 1037:bipush          42
	//  701 1039:ldc1            #62  <Int 113>
	//  702 1041:bastore         
	//  703 1042:dup             
	//  704 1043:bipush          43
	//  705 1045:ldc1            #63  <Int 114>
	//  706 1047:bastore         
	//  707 1048:dup             
	//  708 1049:bipush          44
	//  709 1051:ldc1            #64  <Int 115>
	//  710 1053:bastore         
	//  711 1054:dup             
	//  712 1055:bipush          45
	//  713 1057:ldc1            #65  <Int 116>
	//  714 1059:bastore         
	//  715 1060:dup             
	//  716 1061:bipush          46
	//  717 1063:ldc1            #66  <Int 117>
	//  718 1065:bastore         
	//  719 1066:dup             
	//  720 1067:bipush          47
	//  721 1069:ldc1            #67  <Int 118>
	//  722 1071:bastore         
	//  723 1072:dup             
	//  724 1073:bipush          48
	//  725 1075:ldc1            #68  <Int 119>
	//  726 1077:bastore         
	//  727 1078:dup             
	//  728 1079:bipush          49
	//  729 1081:ldc1            #69  <Int 120>
	//  730 1083:bastore         
	//  731 1084:dup             
	//  732 1085:bipush          50
	//  733 1087:ldc1            #70  <Int 121>
	//  734 1089:bastore         
	//  735 1090:dup             
	//  736 1091:bipush          51
	//  737 1093:ldc1            #71  <Int 122>
	//  738 1095:bastore         
	//  739 1096:dup             
	//  740 1097:bipush          52
	//  741 1099:ldc1            #72  <Int 48>
	//  742 1101:bastore         
	//  743 1102:dup             
	//  744 1103:bipush          53
	//  745 1105:ldc1            #73  <Int 49>
	//  746 1107:bastore         
	//  747 1108:dup             
	//  748 1109:bipush          54
	//  749 1111:ldc1            #74  <Int 50>
	//  750 1113:bastore         
	//  751 1114:dup             
	//  752 1115:bipush          55
	//  753 1117:ldc1            #75  <Int 51>
	//  754 1119:bastore         
	//  755 1120:dup             
	//  756 1121:bipush          56
	//  757 1123:ldc1            #76  <Int 52>
	//  758 1125:bastore         
	//  759 1126:dup             
	//  760 1127:bipush          57
	//  761 1129:ldc1            #77  <Int 53>
	//  762 1131:bastore         
	//  763 1132:dup             
	//  764 1133:bipush          58
	//  765 1135:ldc1            #78  <Int 54>
	//  766 1137:bastore         
	//  767 1138:dup             
	//  768 1139:bipush          59
	//  769 1141:ldc1            #79  <Int 55>
	//  770 1143:bastore         
	//  771 1144:dup             
	//  772 1145:bipush          60
	//  773 1147:ldc1            #80  <Int 56>
	//  774 1149:bastore         
	//  775 1150:dup             
	//  776 1151:bipush          61
	//  777 1153:ldc1            #81  <Int 57>
	//  778 1155:bastore         
	//  779 1156:dup             
	//  780 1157:bipush          62
	//  781 1159:ldc1            #92  <Int 45>
	//  782 1161:bastore         
	//  783 1162:dup             
	//  784 1163:bipush          63
	//  785 1165:ldc1            #93  <Int 95>
	//  786 1167:bastore         
	//  787 1168:putstatic       #95  <Field byte[] d>
	//  788 1171:bipush          123
	//  789 1173:newarray        byte[]
	//  790 1175:dup             
	//  791 1176:iconst_0        
	//  792 1177:ldc1            #96  <Int -1>
	//  793 1179:bastore         
	//  794 1180:dup             
	//  795 1181:iconst_1        
	//  796 1182:ldc1            #96  <Int -1>
	//  797 1184:bastore         
	//  798 1185:dup             
	//  799 1186:iconst_2        
	//  800 1187:ldc1            #96  <Int -1>
	//  801 1189:bastore         
	//  802 1190:dup             
	//  803 1191:iconst_3        
	//  804 1192:ldc1            #96  <Int -1>
	//  805 1194:bastore         
	//  806 1195:dup             
	//  807 1196:iconst_4        
	//  808 1197:ldc1            #96  <Int -1>
	//  809 1199:bastore         
	//  810 1200:dup             
	//  811 1201:iconst_5        
	//  812 1202:ldc1            #96  <Int -1>
	//  813 1204:bastore         
	//  814 1205:dup             
	//  815 1206:bipush          6
	//  816 1208:ldc1            #96  <Int -1>
	//  817 1210:bastore         
	//  818 1211:dup             
	//  819 1212:bipush          7
	//  820 1214:ldc1            #96  <Int -1>
	//  821 1216:bastore         
	//  822 1217:dup             
	//  823 1218:bipush          8
	//  824 1220:ldc1            #96  <Int -1>
	//  825 1222:bastore         
	//  826 1223:dup             
	//  827 1224:bipush          9
	//  828 1226:ldc1            #96  <Int -1>
	//  829 1228:bastore         
	//  830 1229:dup             
	//  831 1230:bipush          10
	//  832 1232:ldc1            #96  <Int -1>
	//  833 1234:bastore         
	//  834 1235:dup             
	//  835 1236:bipush          11
	//  836 1238:ldc1            #96  <Int -1>
	//  837 1240:bastore         
	//  838 1241:dup             
	//  839 1242:bipush          12
	//  840 1244:ldc1            #96  <Int -1>
	//  841 1246:bastore         
	//  842 1247:dup             
	//  843 1248:bipush          13
	//  844 1250:ldc1            #96  <Int -1>
	//  845 1252:bastore         
	//  846 1253:dup             
	//  847 1254:bipush          14
	//  848 1256:ldc1            #96  <Int -1>
	//  849 1258:bastore         
	//  850 1259:dup             
	//  851 1260:bipush          15
	//  852 1262:ldc1            #96  <Int -1>
	//  853 1264:bastore         
	//  854 1265:dup             
	//  855 1266:bipush          16
	//  856 1268:ldc1            #96  <Int -1>
	//  857 1270:bastore         
	//  858 1271:dup             
	//  859 1272:bipush          17
	//  860 1274:ldc1            #96  <Int -1>
	//  861 1276:bastore         
	//  862 1277:dup             
	//  863 1278:bipush          18
	//  864 1280:ldc1            #96  <Int -1>
	//  865 1282:bastore         
	//  866 1283:dup             
	//  867 1284:bipush          19
	//  868 1286:ldc1            #96  <Int -1>
	//  869 1288:bastore         
	//  870 1289:dup             
	//  871 1290:bipush          20
	//  872 1292:ldc1            #96  <Int -1>
	//  873 1294:bastore         
	//  874 1295:dup             
	//  875 1296:bipush          21
	//  876 1298:ldc1            #96  <Int -1>
	//  877 1300:bastore         
	//  878 1301:dup             
	//  879 1302:bipush          22
	//  880 1304:ldc1            #96  <Int -1>
	//  881 1306:bastore         
	//  882 1307:dup             
	//  883 1308:bipush          23
	//  884 1310:ldc1            #96  <Int -1>
	//  885 1312:bastore         
	//  886 1313:dup             
	//  887 1314:bipush          24
	//  888 1316:ldc1            #96  <Int -1>
	//  889 1318:bastore         
	//  890 1319:dup             
	//  891 1320:bipush          25
	//  892 1322:ldc1            #96  <Int -1>
	//  893 1324:bastore         
	//  894 1325:dup             
	//  895 1326:bipush          26
	//  896 1328:ldc1            #96  <Int -1>
	//  897 1330:bastore         
	//  898 1331:dup             
	//  899 1332:bipush          27
	//  900 1334:ldc1            #96  <Int -1>
	//  901 1336:bastore         
	//  902 1337:dup             
	//  903 1338:bipush          28
	//  904 1340:ldc1            #96  <Int -1>
	//  905 1342:bastore         
	//  906 1343:dup             
	//  907 1344:bipush          29
	//  908 1346:ldc1            #96  <Int -1>
	//  909 1348:bastore         
	//  910 1349:dup             
	//  911 1350:bipush          30
	//  912 1352:ldc1            #96  <Int -1>
	//  913 1354:bastore         
	//  914 1355:dup             
	//  915 1356:bipush          31
	//  916 1358:ldc1            #96  <Int -1>
	//  917 1360:bastore         
	//  918 1361:dup             
	//  919 1362:bipush          32
	//  920 1364:ldc1            #96  <Int -1>
	//  921 1366:bastore         
	//  922 1367:dup             
	//  923 1368:bipush          33
	//  924 1370:ldc1            #96  <Int -1>
	//  925 1372:bastore         
	//  926 1373:dup             
	//  927 1374:bipush          34
	//  928 1376:ldc1            #96  <Int -1>
	//  929 1378:bastore         
	//  930 1379:dup             
	//  931 1380:bipush          35
	//  932 1382:ldc1            #96  <Int -1>
	//  933 1384:bastore         
	//  934 1385:dup             
	//  935 1386:bipush          36
	//  936 1388:ldc1            #96  <Int -1>
	//  937 1390:bastore         
	//  938 1391:dup             
	//  939 1392:bipush          37
	//  940 1394:ldc1            #96  <Int -1>
	//  941 1396:bastore         
	//  942 1397:dup             
	//  943 1398:bipush          38
	//  944 1400:ldc1            #96  <Int -1>
	//  945 1402:bastore         
	//  946 1403:dup             
	//  947 1404:bipush          39
	//  948 1406:ldc1            #96  <Int -1>
	//  949 1408:bastore         
	//  950 1409:dup             
	//  951 1410:bipush          40
	//  952 1412:ldc1            #96  <Int -1>
	//  953 1414:bastore         
	//  954 1415:dup             
	//  955 1416:bipush          41
	//  956 1418:ldc1            #96  <Int -1>
	//  957 1420:bastore         
	//  958 1421:dup             
	//  959 1422:bipush          42
	//  960 1424:ldc1            #96  <Int -1>
	//  961 1426:bastore         
	//  962 1427:dup             
	//  963 1428:bipush          43
	//  964 1430:ldc1            #97  <Int 62>
	//  965 1432:bastore         
	//  966 1433:dup             
	//  967 1434:bipush          44
	//  968 1436:ldc1            #96  <Int -1>
	//  969 1438:bastore         
	//  970 1439:dup             
	//  971 1440:bipush          45
	//  972 1442:ldc1            #97  <Int 62>
	//  973 1444:bastore         
	//  974 1445:dup             
	//  975 1446:bipush          46
	//  976 1448:ldc1            #96  <Int -1>
	//  977 1450:bastore         
	//  978 1451:dup             
	//  979 1452:bipush          47
	//  980 1454:ldc1            #98  <Int 63>
	//  981 1456:bastore         
	//  982 1457:dup             
	//  983 1458:bipush          48
	//  984 1460:ldc1            #76  <Int 52>
	//  985 1462:bastore         
	//  986 1463:dup             
	//  987 1464:bipush          49
	//  988 1466:ldc1            #77  <Int 53>
	//  989 1468:bastore         
	//  990 1469:dup             
	//  991 1470:bipush          50
	//  992 1472:ldc1            #78  <Int 54>
	//  993 1474:bastore         
	//  994 1475:dup             
	//  995 1476:bipush          51
	//  996 1478:ldc1            #79  <Int 55>
	//  997 1480:bastore         
	//  998 1481:dup             
	//  999 1482:bipush          52
	// 1000 1484:ldc1            #80  <Int 56>
	// 1001 1486:bastore         
	// 1002 1487:dup             
	// 1003 1488:bipush          53
	// 1004 1490:ldc1            #81  <Int 57>
	// 1005 1492:bastore         
	// 1006 1493:dup             
	// 1007 1494:bipush          54
	// 1008 1496:ldc1            #99  <Int 58>
	// 1009 1498:bastore         
	// 1010 1499:dup             
	// 1011 1500:bipush          55
	// 1012 1502:ldc1            #100 <Int 59>
	// 1013 1504:bastore         
	// 1014 1505:dup             
	// 1015 1506:bipush          56
	// 1016 1508:ldc1            #101 <Int 60>
	// 1017 1510:bastore         
	// 1018 1511:dup             
	// 1019 1512:bipush          57
	// 1020 1514:ldc1            #102 <Int 61>
	// 1021 1516:bastore         
	// 1022 1517:dup             
	// 1023 1518:bipush          58
	// 1024 1520:ldc1            #96  <Int -1>
	// 1025 1522:bastore         
	// 1026 1523:dup             
	// 1027 1524:bipush          59
	// 1028 1526:ldc1            #96  <Int -1>
	// 1029 1528:bastore         
	// 1030 1529:dup             
	// 1031 1530:bipush          60
	// 1032 1532:ldc1            #96  <Int -1>
	// 1033 1534:bastore         
	// 1034 1535:dup             
	// 1035 1536:bipush          61
	// 1036 1538:ldc1            #96  <Int -1>
	// 1037 1540:bastore         
	// 1038 1541:dup             
	// 1039 1542:bipush          62
	// 1040 1544:ldc1            #96  <Int -1>
	// 1041 1546:bastore         
	// 1042 1547:dup             
	// 1043 1548:bipush          63
	// 1044 1550:ldc1            #96  <Int -1>
	// 1045 1552:bastore         
	// 1046 1553:dup             
	// 1047 1554:bipush          64
	// 1048 1556:ldc1            #96  <Int -1>
	// 1049 1558:bastore         
	// 1050 1559:dup             
	// 1051 1560:bipush          65
	// 1052 1562:ldc1            #103 <Int 0>
	// 1053 1564:bastore         
	// 1054 1565:dup             
	// 1055 1566:bipush          66
	// 1056 1568:ldc1            #104 <Int 1>
	// 1057 1570:bastore         
	// 1058 1571:dup             
	// 1059 1572:bipush          67
	// 1060 1574:ldc1            #105 <Int 2>
	// 1061 1576:bastore         
	// 1062 1577:dup             
	// 1063 1578:bipush          68
	// 1064 1580:ldc1            #106 <Int 3>
	// 1065 1582:bastore         
	// 1066 1583:dup             
	// 1067 1584:bipush          69
	// 1068 1586:ldc1            #107 <Int 4>
	// 1069 1588:bastore         
	// 1070 1589:dup             
	// 1071 1590:bipush          70
	// 1072 1592:ldc1            #108 <Int 5>
	// 1073 1594:bastore         
	// 1074 1595:dup             
	// 1075 1596:bipush          71
	// 1076 1598:ldc1            #109 <Int 6>
	// 1077 1600:bastore         
	// 1078 1601:dup             
	// 1079 1602:bipush          72
	// 1080 1604:ldc1            #110 <Int 7>
	// 1081 1606:bastore         
	// 1082 1607:dup             
	// 1083 1608:bipush          73
	// 1084 1610:ldc1            #111 <Int 8>
	// 1085 1612:bastore         
	// 1086 1613:dup             
	// 1087 1614:bipush          74
	// 1088 1616:ldc1            #112 <Int 9>
	// 1089 1618:bastore         
	// 1090 1619:dup             
	// 1091 1620:bipush          75
	// 1092 1622:ldc1            #87  <Int 10>
	// 1093 1624:bastore         
	// 1094 1625:dup             
	// 1095 1626:bipush          76
	// 1096 1628:ldc1            #113 <Int 11>
	// 1097 1630:bastore         
	// 1098 1631:dup             
	// 1099 1632:bipush          77
	// 1100 1634:ldc1            #114 <Int 12>
	// 1101 1636:bastore         
	// 1102 1637:dup             
	// 1103 1638:bipush          78
	// 1104 1640:ldc1            #86  <Int 13>
	// 1105 1642:bastore         
	// 1106 1643:dup             
	// 1107 1644:bipush          79
	// 1108 1646:ldc1            #115 <Int 14>
	// 1109 1648:bastore         
	// 1110 1649:dup             
	// 1111 1650:bipush          80
	// 1112 1652:ldc1            #116 <Int 15>
	// 1113 1654:bastore         
	// 1114 1655:dup             
	// 1115 1656:bipush          81
	// 1116 1658:ldc1            #117 <Int 16>
	// 1117 1660:bastore         
	// 1118 1661:dup             
	// 1119 1662:bipush          82
	// 1120 1664:ldc1            #118 <Int 17>
	// 1121 1666:bastore         
	// 1122 1667:dup             
	// 1123 1668:bipush          83
	// 1124 1670:ldc1            #119 <Int 18>
	// 1125 1672:bastore         
	// 1126 1673:dup             
	// 1127 1674:bipush          84
	// 1128 1676:ldc1            #120 <Int 19>
	// 1129 1678:bastore         
	// 1130 1679:dup             
	// 1131 1680:bipush          85
	// 1132 1682:ldc1            #121 <Int 20>
	// 1133 1684:bastore         
	// 1134 1685:dup             
	// 1135 1686:bipush          86
	// 1136 1688:ldc1            #122 <Int 21>
	// 1137 1690:bastore         
	// 1138 1691:dup             
	// 1139 1692:bipush          87
	// 1140 1694:ldc1            #123 <Int 22>
	// 1141 1696:bastore         
	// 1142 1697:dup             
	// 1143 1698:bipush          88
	// 1144 1700:ldc1            #124 <Int 23>
	// 1145 1702:bastore         
	// 1146 1703:dup             
	// 1147 1704:bipush          89
	// 1148 1706:ldc1            #125 <Int 24>
	// 1149 1708:bastore         
	// 1150 1709:dup             
	// 1151 1710:bipush          90
	// 1152 1712:ldc1            #126 <Int 25>
	// 1153 1714:bastore         
	// 1154 1715:dup             
	// 1155 1716:bipush          91
	// 1156 1718:ldc1            #96  <Int -1>
	// 1157 1720:bastore         
	// 1158 1721:dup             
	// 1159 1722:bipush          92
	// 1160 1724:ldc1            #96  <Int -1>
	// 1161 1726:bastore         
	// 1162 1727:dup             
	// 1163 1728:bipush          93
	// 1164 1730:ldc1            #96  <Int -1>
	// 1165 1732:bastore         
	// 1166 1733:dup             
	// 1167 1734:bipush          94
	// 1168 1736:ldc1            #96  <Int -1>
	// 1169 1738:bastore         
	// 1170 1739:dup             
	// 1171 1740:bipush          95
	// 1172 1742:ldc1            #98  <Int 63>
	// 1173 1744:bastore         
	// 1174 1745:dup             
	// 1175 1746:bipush          96
	// 1176 1748:ldc1            #96  <Int -1>
	// 1177 1750:bastore         
	// 1178 1751:dup             
	// 1179 1752:bipush          97
	// 1180 1754:ldc1            #127 <Int 26>
	// 1181 1756:bastore         
	// 1182 1757:dup             
	// 1183 1758:bipush          98
	// 1184 1760:ldc1            #128 <Int 27>
	// 1185 1762:bastore         
	// 1186 1763:dup             
	// 1187 1764:bipush          99
	// 1188 1766:ldc1            #129 <Int 28>
	// 1189 1768:bastore         
	// 1190 1769:dup             
	// 1191 1770:bipush          100
	// 1192 1772:ldc1            #130 <Int 29>
	// 1193 1774:bastore         
	// 1194 1775:dup             
	// 1195 1776:bipush          101
	// 1196 1778:ldc1            #131 <Int 30>
	// 1197 1780:bastore         
	// 1198 1781:dup             
	// 1199 1782:bipush          102
	// 1200 1784:ldc1            #132 <Int 31>
	// 1201 1786:bastore         
	// 1202 1787:dup             
	// 1203 1788:bipush          103
	// 1204 1790:ldc1            #133 <Int 32>
	// 1205 1792:bastore         
	// 1206 1793:dup             
	// 1207 1794:bipush          104
	// 1208 1796:ldc1            #134 <Int 33>
	// 1209 1798:bastore         
	// 1210 1799:dup             
	// 1211 1800:bipush          105
	// 1212 1802:ldc1            #135 <Int 34>
	// 1213 1804:bastore         
	// 1214 1805:dup             
	// 1215 1806:bipush          106
	// 1216 1808:ldc1            #136 <Int 35>
	// 1217 1810:bastore         
	// 1218 1811:dup             
	// 1219 1812:bipush          107
	// 1220 1814:ldc1            #137 <Int 36>
	// 1221 1816:bastore         
	// 1222 1817:dup             
	// 1223 1818:bipush          108
	// 1224 1820:ldc1            #138 <Int 37>
	// 1225 1822:bastore         
	// 1226 1823:dup             
	// 1227 1824:bipush          109
	// 1228 1826:ldc1            #139 <Int 38>
	// 1229 1828:bastore         
	// 1230 1829:dup             
	// 1231 1830:bipush          110
	// 1232 1832:ldc1            #140 <Int 39>
	// 1233 1834:bastore         
	// 1234 1835:dup             
	// 1235 1836:bipush          111
	// 1236 1838:ldc1            #141 <Int 40>
	// 1237 1840:bastore         
	// 1238 1841:dup             
	// 1239 1842:bipush          112
	// 1240 1844:ldc1            #142 <Int 41>
	// 1241 1846:bastore         
	// 1242 1847:dup             
	// 1243 1848:bipush          113
	// 1244 1850:ldc1            #143 <Int 42>
	// 1245 1852:bastore         
	// 1246 1853:dup             
	// 1247 1854:bipush          114
	// 1248 1856:ldc1            #82  <Int 43>
	// 1249 1858:bastore         
	// 1250 1859:dup             
	// 1251 1860:bipush          115
	// 1252 1862:ldc1            #144 <Int 44>
	// 1253 1864:bastore         
	// 1254 1865:dup             
	// 1255 1866:bipush          116
	// 1256 1868:ldc1            #92  <Int 45>
	// 1257 1870:bastore         
	// 1258 1871:dup             
	// 1259 1872:bipush          117
	// 1260 1874:ldc1            #145 <Int 46>
	// 1261 1876:bastore         
	// 1262 1877:dup             
	// 1263 1878:bipush          118
	// 1264 1880:ldc1            #83  <Int 47>
	// 1265 1882:bastore         
	// 1266 1883:dup             
	// 1267 1884:bipush          119
	// 1268 1886:ldc1            #72  <Int 48>
	// 1269 1888:bastore         
	// 1270 1889:dup             
	// 1271 1890:bipush          120
	// 1272 1892:ldc1            #73  <Int 49>
	// 1273 1894:bastore         
	// 1274 1895:dup             
	// 1275 1896:bipush          121
	// 1276 1898:ldc1            #74  <Int 50>
	// 1277 1900:bastore         
	// 1278 1901:dup             
	// 1279 1902:bipush          122
	// 1280 1904:ldc1            #75  <Int 51>
	// 1281 1906:bastore         
	// 1282 1907:putstatic       #147 <Field byte[] f>
	//*1283 1910:return          
	}
}
