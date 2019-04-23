// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ayq, azb, aac, ayw

public final class aef extends ayq
{

	public aef()
	{
		super("mvhd");
	//    0    0:aload_0         
	//    1    1:ldc1            #28  <String "mvhd">
	//    2    3:invokespecial   #31  <Method void ayq(String)>
		f = 1.0D;
	//    3    6:aload_0         
	//    4    7:dconst_1        
	//    5    8:putfield        #33  <Field double f>
		g = 1.0F;
	//    6   11:aload_0         
	//    7   12:fconst_1        
	//    8   13:putfield        #35  <Field float g>
		h = azb.a;
	//    9   16:aload_0         
	//   10   17:getstatic       #40  <Field azb azb.a>
	//   11   20:putfield        #42  <Field azb h>
	//   12   23:return          
	}

	public final void a(ByteBuffer bytebuffer)
	{
		((ayq)this).b(bytebuffer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #47  <Method long ayq.b(ByteBuffer)>
	//    3    5:pop2            
		if(((ayq)this).e() == 1)
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #50  <Method int ayq.e()>
	//*   6   10:iconst_1        
	//*   7   11:icmpne          55
		{
			b = ayw.a(aac.c(bytebuffer));
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokestatic    #54  <Method long aac.c(ByteBuffer)>
	//   11   19:invokestatic    #59  <Method Date ayw.a(long)>
	//   12   22:putfield        #61  <Field Date b>
			c = ayw.a(aac.c(bytebuffer));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokestatic    #54  <Method long aac.c(ByteBuffer)>
	//   16   30:invokestatic    #59  <Method Date ayw.a(long)>
	//   17   33:putfield        #63  <Field Date c>
			d = aac.a(bytebuffer);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokestatic    #65  <Method long aac.a(ByteBuffer)>
	//   21   41:putfield        #67  <Field long d>
			e = aac.c(bytebuffer);
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokestatic    #54  <Method long aac.c(ByteBuffer)>
	//   25   49:putfield        #69  <Field long e>
		} else
	//*  26   52:goto            93
		{
			b = ayw.a(aac.a(bytebuffer));
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:invokestatic    #65  <Method long aac.a(ByteBuffer)>
	//   30   60:invokestatic    #59  <Method Date ayw.a(long)>
	//   31   63:putfield        #61  <Field Date b>
			c = ayw.a(aac.a(bytebuffer));
	//   32   66:aload_0         
	//   33   67:aload_1         
	//   34   68:invokestatic    #65  <Method long aac.a(ByteBuffer)>
	//   35   71:invokestatic    #59  <Method Date ayw.a(long)>
	//   36   74:putfield        #63  <Field Date c>
			d = aac.a(bytebuffer);
	//   37   77:aload_0         
	//   38   78:aload_1         
	//   39   79:invokestatic    #65  <Method long aac.a(ByteBuffer)>
	//   40   82:putfield        #67  <Field long d>
			e = aac.a(bytebuffer);
	//   41   85:aload_0         
	//   42   86:aload_1         
	//   43   87:invokestatic    #65  <Method long aac.a(ByteBuffer)>
	//   44   90:putfield        #69  <Field long e>
		}
		f = aac.d(bytebuffer);
	//   45   93:aload_0         
	//   46   94:aload_1         
	//   47   95:invokestatic    #72  <Method double aac.d(ByteBuffer)>
	//   48   98:putfield        #33  <Field double f>
		byte abyte0[] = new byte[2];
	//   49  101:iconst_2        
	//   50  102:newarray        byte[]
	//   51  104:astore_3        
		bytebuffer.get(abyte0);
	//   52  105:aload_1         
	//   53  106:aload_3         
	//   54  107:invokevirtual   #78  <Method ByteBuffer ByteBuffer.get(byte[])>
	//   55  110:pop             
		short word0 = (short)(0 | abyte0[0] << 8 & 0xff00);
	//   56  111:iconst_0        
	//   57  112:aload_3         
	//   58  113:iconst_0        
	//   59  114:baload          
	//   60  115:bipush          8
	//   61  117:ishl            
	//   62  118:ldc1            #79  <Int 65280>
	//   63  120:iand            
	//   64  121:ior             
	//   65  122:int2short       
	//   66  123:istore_2        
		g = (float)(short)(abyte0[1] & 0xff | word0) / 256F;
	//   67  124:aload_0         
	//   68  125:aload_3         
	//   69  126:iconst_1        
	//   70  127:baload          
	//   71  128:sipush          255
	//   72  131:iand            
	//   73  132:iload_2         
	//   74  133:ior             
	//   75  134:int2short       
	//   76  135:i2f             
	//   77  136:ldc1            #80  <Float 256F>
	//   78  138:fdiv            
	//   79  139:putfield        #35  <Field float g>
		aac.b(bytebuffer);
	//   80  142:aload_1         
	//   81  143:invokestatic    #83  <Method int aac.b(ByteBuffer)>
	//   82  146:pop             
		aac.a(bytebuffer);
	//   83  147:aload_1         
	//   84  148:invokestatic    #65  <Method long aac.a(ByteBuffer)>
	//   85  151:pop2            
		aac.a(bytebuffer);
	//   86  152:aload_1         
	//   87  153:invokestatic    #65  <Method long aac.a(ByteBuffer)>
	//   88  156:pop2            
		h = azb.a(bytebuffer);
	//   89  157:aload_0         
	//   90  158:aload_1         
	//   91  159:invokestatic    #86  <Method azb azb.a(ByteBuffer)>
	//   92  162:putfield        #42  <Field azb h>
		j = bytebuffer.getInt();
	//   93  165:aload_0         
	//   94  166:aload_1         
	//   95  167:invokevirtual   #89  <Method int ByteBuffer.getInt()>
	//   96  170:putfield        #91  <Field int j>
		k = bytebuffer.getInt();
	//   97  173:aload_0         
	//   98  174:aload_1         
	//   99  175:invokevirtual   #89  <Method int ByteBuffer.getInt()>
	//  100  178:putfield        #93  <Field int k>
		l = bytebuffer.getInt();
	//  101  181:aload_0         
	//  102  182:aload_1         
	//  103  183:invokevirtual   #89  <Method int ByteBuffer.getInt()>
	//  104  186:putfield        #95  <Field int l>
		m = bytebuffer.getInt();
	//  105  189:aload_0         
	//  106  190:aload_1         
	//  107  191:invokevirtual   #89  <Method int ByteBuffer.getInt()>
	//  108  194:putfield        #97  <Field int m>
		n = bytebuffer.getInt();
	//  109  197:aload_0         
	//  110  198:aload_1         
	//  111  199:invokevirtual   #89  <Method int ByteBuffer.getInt()>
	//  112  202:putfield        #99  <Field int n>
		o = bytebuffer.getInt();
	//  113  205:aload_0         
	//  114  206:aload_1         
	//  115  207:invokevirtual   #89  <Method int ByteBuffer.getInt()>
	//  116  210:putfield        #101 <Field int o>
		i = aac.a(bytebuffer);
	//  117  213:aload_0         
	//  118  214:aload_1         
	//  119  215:invokestatic    #65  <Method long aac.a(ByteBuffer)>
	//  120  218:putfield        #103 <Field long i>
	//  121  221:return          
	}

	public final long b()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field long d>
	//    2    4:lreturn         
	}

	public final long c()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field long e>
	//    2    4:lreturn         
	}

	public final String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #108 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #110 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("MovieHeaderBox[");
	//    4    8:aload_1         
	//    5    9:ldc1            #112 <String "MovieHeaderBox[">
	//    6   11:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("creationTime=");
	//    8   15:aload_1         
	//    9   16:ldc1            #118 <String "creationTime=">
	//   10   18:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(((Object) (b)));
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #61  <Field Date b>
	//   15   27:invokevirtual   #121 <Method StringBuilder StringBuilder.append(Object)>
	//   16   30:pop             
		stringbuilder.append(";");
	//   17   31:aload_1         
	//   18   32:ldc1            #123 <String ";">
	//   19   34:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append("modificationTime=");
	//   21   38:aload_1         
	//   22   39:ldc1            #125 <String "modificationTime=">
	//   23   41:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   24   44:pop             
		stringbuilder.append(((Object) (c)));
	//   25   45:aload_1         
	//   26   46:aload_0         
	//   27   47:getfield        #63  <Field Date c>
	//   28   50:invokevirtual   #121 <Method StringBuilder StringBuilder.append(Object)>
	//   29   53:pop             
		stringbuilder.append(";");
	//   30   54:aload_1         
	//   31   55:ldc1            #123 <String ";">
	//   32   57:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   33   60:pop             
		stringbuilder.append("timescale=");
	//   34   61:aload_1         
	//   35   62:ldc1            #127 <String "timescale=">
	//   36   64:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   37   67:pop             
		stringbuilder.append(d);
	//   38   68:aload_1         
	//   39   69:aload_0         
	//   40   70:getfield        #67  <Field long d>
	//   41   73:invokevirtual   #130 <Method StringBuilder StringBuilder.append(long)>
	//   42   76:pop             
		stringbuilder.append(";");
	//   43   77:aload_1         
	//   44   78:ldc1            #123 <String ";">
	//   45   80:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   46   83:pop             
		stringbuilder.append("duration=");
	//   47   84:aload_1         
	//   48   85:ldc1            #132 <String "duration=">
	//   49   87:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   50   90:pop             
		stringbuilder.append(e);
	//   51   91:aload_1         
	//   52   92:aload_0         
	//   53   93:getfield        #69  <Field long e>
	//   54   96:invokevirtual   #130 <Method StringBuilder StringBuilder.append(long)>
	//   55   99:pop             
		stringbuilder.append(";");
	//   56  100:aload_1         
	//   57  101:ldc1            #123 <String ";">
	//   58  103:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   59  106:pop             
		stringbuilder.append("rate=");
	//   60  107:aload_1         
	//   61  108:ldc1            #134 <String "rate=">
	//   62  110:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   63  113:pop             
		stringbuilder.append(f);
	//   64  114:aload_1         
	//   65  115:aload_0         
	//   66  116:getfield        #33  <Field double f>
	//   67  119:invokevirtual   #137 <Method StringBuilder StringBuilder.append(double)>
	//   68  122:pop             
		stringbuilder.append(";");
	//   69  123:aload_1         
	//   70  124:ldc1            #123 <String ";">
	//   71  126:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   72  129:pop             
		stringbuilder.append("volume=");
	//   73  130:aload_1         
	//   74  131:ldc1            #139 <String "volume=">
	//   75  133:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   76  136:pop             
		stringbuilder.append(g);
	//   77  137:aload_1         
	//   78  138:aload_0         
	//   79  139:getfield        #35  <Field float g>
	//   80  142:invokevirtual   #142 <Method StringBuilder StringBuilder.append(float)>
	//   81  145:pop             
		stringbuilder.append(";");
	//   82  146:aload_1         
	//   83  147:ldc1            #123 <String ";">
	//   84  149:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   85  152:pop             
		stringbuilder.append("matrix=");
	//   86  153:aload_1         
	//   87  154:ldc1            #144 <String "matrix=">
	//   88  156:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   89  159:pop             
		stringbuilder.append(((Object) (h)));
	//   90  160:aload_1         
	//   91  161:aload_0         
	//   92  162:getfield        #42  <Field azb h>
	//   93  165:invokevirtual   #121 <Method StringBuilder StringBuilder.append(Object)>
	//   94  168:pop             
		stringbuilder.append(";");
	//   95  169:aload_1         
	//   96  170:ldc1            #123 <String ";">
	//   97  172:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   98  175:pop             
		stringbuilder.append("nextTrackId=");
	//   99  176:aload_1         
	//  100  177:ldc1            #146 <String "nextTrackId=">
	//  101  179:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//  102  182:pop             
		stringbuilder.append(i);
	//  103  183:aload_1         
	//  104  184:aload_0         
	//  105  185:getfield        #103 <Field long i>
	//  106  188:invokevirtual   #130 <Method StringBuilder StringBuilder.append(long)>
	//  107  191:pop             
		stringbuilder.append("]");
	//  108  192:aload_1         
	//  109  193:ldc1            #148 <String "]">
	//  110  195:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//  111  198:pop             
		return stringbuilder.toString();
	//  112  199:aload_1         
	//  113  200:invokevirtual   #150 <Method String StringBuilder.toString()>
	//  114  203:areturn         
	}

	private Date b;
	private Date c;
	private long d;
	private long e;
	private double f;
	private float g;
	private azb h;
	private long i;
	private int j;
	private int k;
	private int l;
	private int m;
	private int n;
	private int o;
}
