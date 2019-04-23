// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aac

public final class azb
{

	private azb(double d1, double d2, double d3, double d4, double d5, double d6, double d7, 
			double d8, double d9)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		b = d5;
	//    2    4:aload_0         
	//    3    5:dload           9
	//    4    7:putfield        #40  <Field double b>
		c = d6;
	//    5   10:aload_0         
	//    6   11:dload           11
	//    7   13:putfield        #42  <Field double c>
		d = d7;
	//    8   16:aload_0         
	//    9   17:dload           13
	//   10   19:putfield        #44  <Field double d>
		e = d1;
	//   11   22:aload_0         
	//   12   23:dload_1         
	//   13   24:putfield        #46  <Field double e>
		f = d2;
	//   14   27:aload_0         
	//   15   28:dload_3         
	//   16   29:putfield        #48  <Field double f>
		g = d3;
	//   17   32:aload_0         
	//   18   33:dload           5
	//   19   35:putfield        #50  <Field double g>
		h = d4;
	//   20   38:aload_0         
	//   21   39:dload           7
	//   22   41:putfield        #52  <Field double h>
		i = d8;
	//   23   44:aload_0         
	//   24   45:dload           15
	//   25   47:putfield        #54  <Field double i>
		j = d9;
	//   26   50:aload_0         
	//   27   51:dload           17
	//   28   53:putfield        #56  <Field double j>
	//   29   56:return          
	}

	public static azb a(ByteBuffer bytebuffer)
	{
		double d1 = aac.d(bytebuffer);
	//    0    0:aload_0         
	//    1    1:invokestatic    #62  <Method double aac.d(ByteBuffer)>
	//    2    4:dstore_1        
		double d2 = aac.d(bytebuffer);
	//    3    5:aload_0         
	//    4    6:invokestatic    #62  <Method double aac.d(ByteBuffer)>
	//    5    9:dstore_3        
		double d3 = aac.e(bytebuffer);
	//    6   10:aload_0         
	//    7   11:invokestatic    #64  <Method double aac.e(ByteBuffer)>
	//    8   14:dstore          5
		double d4 = aac.d(bytebuffer);
	//    9   16:aload_0         
	//   10   17:invokestatic    #62  <Method double aac.d(ByteBuffer)>
	//   11   20:dstore          7
		double d5 = aac.d(bytebuffer);
	//   12   22:aload_0         
	//   13   23:invokestatic    #62  <Method double aac.d(ByteBuffer)>
	//   14   26:dstore          9
		double d6 = aac.e(bytebuffer);
	//   15   28:aload_0         
	//   16   29:invokestatic    #64  <Method double aac.e(ByteBuffer)>
	//   17   32:dstore          11
		double d7 = aac.d(bytebuffer);
	//   18   34:aload_0         
	//   19   35:invokestatic    #62  <Method double aac.d(ByteBuffer)>
	//   20   38:dstore          13
		double d8 = aac.d(bytebuffer);
	//   21   40:aload_0         
	//   22   41:invokestatic    #62  <Method double aac.d(ByteBuffer)>
	//   23   44:dstore          15
		return new azb(d1, d2, d4, d5, d3, d6, aac.e(bytebuffer), d7, d8);
	//   24   46:new             #2   <Class azb>
	//   25   49:dup             
	//   26   50:dload_1         
	//   27   51:dload_3         
	//   28   52:dload           7
	//   29   54:dload           9
	//   30   56:dload           5
	//   31   58:dload           11
	//   32   60:aload_0         
	//   33   61:invokestatic    #64  <Method double aac.e(ByteBuffer)>
	//   34   64:dload           13
	//   35   66:dload           15
	//   36   68:invokespecial   #25  <Method void azb(double, double, double, double, double, double, double, double, double)>
	//   37   71:areturn         
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          175
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #70  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #70  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((azb)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class azb>
	//   16   28:astore_1        
			if(Double.compare(((azb) (obj)).e, e) != 0)
	//*  17   29:aload_1         
	//*  18   30:getfield        #46  <Field double e>
	//*  19   33:aload_0         
	//*  20   34:getfield        #46  <Field double e>
	//*  21   37:invokestatic    #76  <Method int Double.compare(double, double)>
	//*  22   40:ifeq            45
				return false;
	//   23   43:iconst_0        
	//   24   44:ireturn         
			if(Double.compare(((azb) (obj)).f, f) != 0)
	//*  25   45:aload_1         
	//*  26   46:getfield        #48  <Field double f>
	//*  27   49:aload_0         
	//*  28   50:getfield        #48  <Field double f>
	//*  29   53:invokestatic    #76  <Method int Double.compare(double, double)>
	//*  30   56:ifeq            61
				return false;
	//   31   59:iconst_0        
	//   32   60:ireturn         
			if(Double.compare(((azb) (obj)).g, g) != 0)
	//*  33   61:aload_1         
	//*  34   62:getfield        #50  <Field double g>
	//*  35   65:aload_0         
	//*  36   66:getfield        #50  <Field double g>
	//*  37   69:invokestatic    #76  <Method int Double.compare(double, double)>
	//*  38   72:ifeq            77
				return false;
	//   39   75:iconst_0        
	//   40   76:ireturn         
			if(Double.compare(((azb) (obj)).h, h) != 0)
	//*  41   77:aload_1         
	//*  42   78:getfield        #52  <Field double h>
	//*  43   81:aload_0         
	//*  44   82:getfield        #52  <Field double h>
	//*  45   85:invokestatic    #76  <Method int Double.compare(double, double)>
	//*  46   88:ifeq            93
				return false;
	//   47   91:iconst_0        
	//   48   92:ireturn         
			if(Double.compare(((azb) (obj)).i, i) != 0)
	//*  49   93:aload_1         
	//*  50   94:getfield        #54  <Field double i>
	//*  51   97:aload_0         
	//*  52   98:getfield        #54  <Field double i>
	//*  53  101:invokestatic    #76  <Method int Double.compare(double, double)>
	//*  54  104:ifeq            109
				return false;
	//   55  107:iconst_0        
	//   56  108:ireturn         
			if(Double.compare(((azb) (obj)).j, j) != 0)
	//*  57  109:aload_1         
	//*  58  110:getfield        #56  <Field double j>
	//*  59  113:aload_0         
	//*  60  114:getfield        #56  <Field double j>
	//*  61  117:invokestatic    #76  <Method int Double.compare(double, double)>
	//*  62  120:ifeq            125
				return false;
	//   63  123:iconst_0        
	//   64  124:ireturn         
			if(Double.compare(((azb) (obj)).b, b) != 0)
	//*  65  125:aload_1         
	//*  66  126:getfield        #40  <Field double b>
	//*  67  129:aload_0         
	//*  68  130:getfield        #40  <Field double b>
	//*  69  133:invokestatic    #76  <Method int Double.compare(double, double)>
	//*  70  136:ifeq            141
				return false;
	//   71  139:iconst_0        
	//   72  140:ireturn         
			if(Double.compare(((azb) (obj)).c, c) != 0)
	//*  73  141:aload_1         
	//*  74  142:getfield        #42  <Field double c>
	//*  75  145:aload_0         
	//*  76  146:getfield        #42  <Field double c>
	//*  77  149:invokestatic    #76  <Method int Double.compare(double, double)>
	//*  78  152:ifeq            157
				return false;
	//   79  155:iconst_0        
	//   80  156:ireturn         
			return Double.compare(((azb) (obj)).d, d) == 0;
	//   81  157:aload_1         
	//   82  158:getfield        #44  <Field double d>
	//   83  161:aload_0         
	//   84  162:getfield        #44  <Field double d>
	//   85  165:invokestatic    #76  <Method int Double.compare(double, double)>
	//   86  168:ifeq            173
	//   87  171:iconst_0        
	//   88  172:ireturn         
	//   89  173:iconst_1        
	//   90  174:ireturn         
		} else
		{
			return false;
	//   91  175:iconst_0        
	//   92  176:ireturn         
		}
	}

	public final int hashCode()
	{
		long l3 = Double.doubleToLongBits(b);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field double b>
	//    2    4:invokestatic    #82  <Method long Double.doubleToLongBits(double)>
	//    3    7:lstore          9
		int i1 = (int)(l3 ^ l3 >>> 32);
	//    4    9:lload           9
	//    5   11:lload           9
	//    6   13:bipush          32
	//    7   15:lushr           
	//    8   16:lxor            
	//    9   17:l2i             
	//   10   18:istore_1        
		l3 = Double.doubleToLongBits(c);
	//   11   19:aload_0         
	//   12   20:getfield        #42  <Field double c>
	//   13   23:invokestatic    #82  <Method long Double.doubleToLongBits(double)>
	//   14   26:lstore          9
		int j1 = (int)(l3 ^ l3 >>> 32);
	//   15   28:lload           9
	//   16   30:lload           9
	//   17   32:bipush          32
	//   18   34:lushr           
	//   19   35:lxor            
	//   20   36:l2i             
	//   21   37:istore_2        
		l3 = Double.doubleToLongBits(d);
	//   22   38:aload_0         
	//   23   39:getfield        #44  <Field double d>
	//   24   42:invokestatic    #82  <Method long Double.doubleToLongBits(double)>
	//   25   45:lstore          9
		int k1 = (int)(l3 ^ l3 >>> 32);
	//   26   47:lload           9
	//   27   49:lload           9
	//   28   51:bipush          32
	//   29   53:lushr           
	//   30   54:lxor            
	//   31   55:l2i             
	//   32   56:istore_3        
		l3 = Double.doubleToLongBits(e);
	//   33   57:aload_0         
	//   34   58:getfield        #46  <Field double e>
	//   35   61:invokestatic    #82  <Method long Double.doubleToLongBits(double)>
	//   36   64:lstore          9
		int l1 = (int)(l3 ^ l3 >>> 32);
	//   37   66:lload           9
	//   38   68:lload           9
	//   39   70:bipush          32
	//   40   72:lushr           
	//   41   73:lxor            
	//   42   74:l2i             
	//   43   75:istore          4
		l3 = Double.doubleToLongBits(f);
	//   44   77:aload_0         
	//   45   78:getfield        #48  <Field double f>
	//   46   81:invokestatic    #82  <Method long Double.doubleToLongBits(double)>
	//   47   84:lstore          9
		int i2 = (int)(l3 ^ l3 >>> 32);
	//   48   86:lload           9
	//   49   88:lload           9
	//   50   90:bipush          32
	//   51   92:lushr           
	//   52   93:lxor            
	//   53   94:l2i             
	//   54   95:istore          5
		l3 = Double.doubleToLongBits(g);
	//   55   97:aload_0         
	//   56   98:getfield        #50  <Field double g>
	//   57  101:invokestatic    #82  <Method long Double.doubleToLongBits(double)>
	//   58  104:lstore          9
		int j2 = (int)(l3 ^ l3 >>> 32);
	//   59  106:lload           9
	//   60  108:lload           9
	//   61  110:bipush          32
	//   62  112:lushr           
	//   63  113:lxor            
	//   64  114:l2i             
	//   65  115:istore          6
		l3 = Double.doubleToLongBits(h);
	//   66  117:aload_0         
	//   67  118:getfield        #52  <Field double h>
	//   68  121:invokestatic    #82  <Method long Double.doubleToLongBits(double)>
	//   69  124:lstore          9
		int k2 = (int)(l3 ^ l3 >>> 32);
	//   70  126:lload           9
	//   71  128:lload           9
	//   72  130:bipush          32
	//   73  132:lushr           
	//   74  133:lxor            
	//   75  134:l2i             
	//   76  135:istore          7
		l3 = Double.doubleToLongBits(i);
	//   77  137:aload_0         
	//   78  138:getfield        #54  <Field double i>
	//   79  141:invokestatic    #82  <Method long Double.doubleToLongBits(double)>
	//   80  144:lstore          9
		int l2 = (int)(l3 ^ l3 >>> 32);
	//   81  146:lload           9
	//   82  148:lload           9
	//   83  150:bipush          32
	//   84  152:lushr           
	//   85  153:lxor            
	//   86  154:l2i             
	//   87  155:istore          8
		l3 = Double.doubleToLongBits(j);
	//   88  157:aload_0         
	//   89  158:getfield        #56  <Field double j>
	//   90  161:invokestatic    #82  <Method long Double.doubleToLongBits(double)>
	//   91  164:lstore          9
		return (((((((i1 * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + (int)(l3 ^ l3 >>> 32);
	//   92  166:iload_1         
	//   93  167:bipush          31
	//   94  169:imul            
	//   95  170:iload_2         
	//   96  171:iadd            
	//   97  172:bipush          31
	//   98  174:imul            
	//   99  175:iload_3         
	//  100  176:iadd            
	//  101  177:bipush          31
	//  102  179:imul            
	//  103  180:iload           4
	//  104  182:iadd            
	//  105  183:bipush          31
	//  106  185:imul            
	//  107  186:iload           5
	//  108  188:iadd            
	//  109  189:bipush          31
	//  110  191:imul            
	//  111  192:iload           6
	//  112  194:iadd            
	//  113  195:bipush          31
	//  114  197:imul            
	//  115  198:iload           7
	//  116  200:iadd            
	//  117  201:bipush          31
	//  118  203:imul            
	//  119  204:iload           8
	//  120  206:iadd            
	//  121  207:bipush          31
	//  122  209:imul            
	//  123  210:lload           9
	//  124  212:lload           9
	//  125  214:bipush          32
	//  126  216:lushr           
	//  127  217:lxor            
	//  128  218:l2i             
	//  129  219:iadd            
	//  130  220:ireturn         
	}

	public final String toString()
	{
		if(equals(((Object) (a))))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #27  <Field azb a>
	//*   2    4:invokevirtual   #86  <Method boolean equals(Object)>
	//*   3    7:ifeq            13
			return "Rotate 0\260";
	//    4   10:ldc1            #88  <String "Rotate 0\260">
	//    5   12:areturn         
		if(equals(((Object) (k))))
	//*   6   13:aload_0         
	//*   7   14:getstatic       #31  <Field azb k>
	//*   8   17:invokevirtual   #86  <Method boolean equals(Object)>
	//*   9   20:ifeq            26
			return "Rotate 90\260";
	//   10   23:ldc1            #90  <String "Rotate 90\260">
	//   11   25:areturn         
		if(equals(((Object) (l))))
	//*  12   26:aload_0         
	//*  13   27:getstatic       #33  <Field azb l>
	//*  14   30:invokevirtual   #86  <Method boolean equals(Object)>
	//*  15   33:ifeq            39
			return "Rotate 180\260";
	//   16   36:ldc1            #92  <String "Rotate 180\260">
	//   17   38:areturn         
		if(equals(((Object) (m))))
	//*  18   39:aload_0         
	//*  19   40:getstatic       #35  <Field azb m>
	//*  20   43:invokevirtual   #86  <Method boolean equals(Object)>
	//*  21   46:ifeq            52
		{
			return "Rotate 270\260";
	//   22   49:ldc1            #94  <String "Rotate 270\260">
	//   23   51:areturn         
		} else
		{
			double d1 = b;
	//   24   52:aload_0         
	//   25   53:getfield        #40  <Field double b>
	//   26   56:dstore_1        
			double d2 = c;
	//   27   57:aload_0         
	//   28   58:getfield        #42  <Field double c>
	//   29   61:dstore_3        
			double d3 = d;
	//   30   62:aload_0         
	//   31   63:getfield        #44  <Field double d>
	//   32   66:dstore          5
			double d4 = e;
	//   33   68:aload_0         
	//   34   69:getfield        #46  <Field double e>
	//   35   72:dstore          7
			double d5 = f;
	//   36   74:aload_0         
	//   37   75:getfield        #48  <Field double f>
	//   38   78:dstore          9
			double d6 = g;
	//   39   80:aload_0         
	//   40   81:getfield        #50  <Field double g>
	//   41   84:dstore          11
			double d7 = h;
	//   42   86:aload_0         
	//   43   87:getfield        #52  <Field double h>
	//   44   90:dstore          13
			double d8 = i;
	//   45   92:aload_0         
	//   46   93:getfield        #54  <Field double i>
	//   47   96:dstore          15
			double d9 = j;
	//   48   98:aload_0         
	//   49   99:getfield        #56  <Field double j>
	//   50  102:dstore          17
			StringBuilder stringbuilder = new StringBuilder(260);
	//   51  104:new             #96  <Class StringBuilder>
	//   52  107:dup             
	//   53  108:sipush          260
	//   54  111:invokespecial   #99  <Method void StringBuilder(int)>
	//   55  114:astore          19
			stringbuilder.append("Matrix{u=");
	//   56  116:aload           19
	//   57  118:ldc1            #101 <String "Matrix{u=">
	//   58  120:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   59  123:pop             
			stringbuilder.append(d1);
	//   60  124:aload           19
	//   61  126:dload_1         
	//   62  127:invokevirtual   #108 <Method StringBuilder StringBuilder.append(double)>
	//   63  130:pop             
			stringbuilder.append(", v=");
	//   64  131:aload           19
	//   65  133:ldc1            #110 <String ", v=">
	//   66  135:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   67  138:pop             
			stringbuilder.append(d2);
	//   68  139:aload           19
	//   69  141:dload_3         
	//   70  142:invokevirtual   #108 <Method StringBuilder StringBuilder.append(double)>
	//   71  145:pop             
			stringbuilder.append(", w=");
	//   72  146:aload           19
	//   73  148:ldc1            #112 <String ", w=">
	//   74  150:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   75  153:pop             
			stringbuilder.append(d3);
	//   76  154:aload           19
	//   77  156:dload           5
	//   78  158:invokevirtual   #108 <Method StringBuilder StringBuilder.append(double)>
	//   79  161:pop             
			stringbuilder.append(", a=");
	//   80  162:aload           19
	//   81  164:ldc1            #114 <String ", a=">
	//   82  166:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   83  169:pop             
			stringbuilder.append(d4);
	//   84  170:aload           19
	//   85  172:dload           7
	//   86  174:invokevirtual   #108 <Method StringBuilder StringBuilder.append(double)>
	//   87  177:pop             
			stringbuilder.append(", b=");
	//   88  178:aload           19
	//   89  180:ldc1            #116 <String ", b=">
	//   90  182:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   91  185:pop             
			stringbuilder.append(d5);
	//   92  186:aload           19
	//   93  188:dload           9
	//   94  190:invokevirtual   #108 <Method StringBuilder StringBuilder.append(double)>
	//   95  193:pop             
			stringbuilder.append(", c=");
	//   96  194:aload           19
	//   97  196:ldc1            #118 <String ", c=">
	//   98  198:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   99  201:pop             
			stringbuilder.append(d6);
	//  100  202:aload           19
	//  101  204:dload           11
	//  102  206:invokevirtual   #108 <Method StringBuilder StringBuilder.append(double)>
	//  103  209:pop             
			stringbuilder.append(", d=");
	//  104  210:aload           19
	//  105  212:ldc1            #120 <String ", d=">
	//  106  214:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  107  217:pop             
			stringbuilder.append(d7);
	//  108  218:aload           19
	//  109  220:dload           13
	//  110  222:invokevirtual   #108 <Method StringBuilder StringBuilder.append(double)>
	//  111  225:pop             
			stringbuilder.append(", tx=");
	//  112  226:aload           19
	//  113  228:ldc1            #122 <String ", tx=">
	//  114  230:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  115  233:pop             
			stringbuilder.append(d8);
	//  116  234:aload           19
	//  117  236:dload           15
	//  118  238:invokevirtual   #108 <Method StringBuilder StringBuilder.append(double)>
	//  119  241:pop             
			stringbuilder.append(", ty=");
	//  120  242:aload           19
	//  121  244:ldc1            #124 <String ", ty=">
	//  122  246:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  123  249:pop             
			stringbuilder.append(d9);
	//  124  250:aload           19
	//  125  252:dload           17
	//  126  254:invokevirtual   #108 <Method StringBuilder StringBuilder.append(double)>
	//  127  257:pop             
			stringbuilder.append("}");
	//  128  258:aload           19
	//  129  260:ldc1            #126 <String "}">
	//  130  262:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  131  265:pop             
			return stringbuilder.toString();
	//  132  266:aload           19
	//  133  268:invokevirtual   #128 <Method String StringBuilder.toString()>
	//  134  271:areturn         
		}
	}

	public static final azb a = new azb(1.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D);
	private static final azb k = new azb(0.0D, 1.0D, -1D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D);
	private static final azb l = new azb(-1D, 0.0D, 0.0D, -1D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D);
	private static final azb m = new azb(0.0D, -1D, 1.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D);
	private final double b;
	private final double c;
	private final double d;
	private final double e;
	private final double f;
	private final double g;
	private final double h;
	private final double i;
	private final double j;

	static 
	{
	//    0    0:new             #2   <Class azb>
	//    1    3:dup             
	//    2    4:dconst_1        
	//    3    5:dconst_0        
	//    4    6:dconst_0        
	//    5    7:dconst_1        
	//    6    8:dconst_0        
	//    7    9:dconst_0        
	//    8   10:dconst_1        
	//    9   11:dconst_0        
	//   10   12:dconst_0        
	//   11   13:invokespecial   #25  <Method void azb(double, double, double, double, double, double, double, double, double)>
	//   12   16:putstatic       #27  <Field azb a>
	//   13   19:new             #2   <Class azb>
	//   14   22:dup             
	//   15   23:dconst_0        
	//   16   24:dconst_1        
	//   17   25:ldc2w           #28  <Double -1D>
	//   18   28:dconst_0        
	//   19   29:dconst_0        
	//   20   30:dconst_0        
	//   21   31:dconst_1        
	//   22   32:dconst_0        
	//   23   33:dconst_0        
	//   24   34:invokespecial   #25  <Method void azb(double, double, double, double, double, double, double, double, double)>
	//   25   37:putstatic       #31  <Field azb k>
	//   26   40:new             #2   <Class azb>
	//   27   43:dup             
	//   28   44:ldc2w           #28  <Double -1D>
	//   29   47:dconst_0        
	//   30   48:dconst_0        
	//   31   49:ldc2w           #28  <Double -1D>
	//   32   52:dconst_0        
	//   33   53:dconst_0        
	//   34   54:dconst_1        
	//   35   55:dconst_0        
	//   36   56:dconst_0        
	//   37   57:invokespecial   #25  <Method void azb(double, double, double, double, double, double, double, double, double)>
	//   38   60:putstatic       #33  <Field azb l>
	//   39   63:new             #2   <Class azb>
	//   40   66:dup             
	//   41   67:dconst_0        
	//   42   68:ldc2w           #28  <Double -1D>
	//   43   71:dconst_1        
	//   44   72:dconst_0        
	//   45   73:dconst_0        
	//   46   74:dconst_0        
	//   47   75:dconst_1        
	//   48   76:dconst_0        
	//   49   77:dconst_0        
	//   50   78:invokespecial   #25  <Method void azb(double, double, double, double, double, double, double, double, double)>
	//   51   81:putstatic       #35  <Field azb m>
	//*  52   84:return          
	}
}
