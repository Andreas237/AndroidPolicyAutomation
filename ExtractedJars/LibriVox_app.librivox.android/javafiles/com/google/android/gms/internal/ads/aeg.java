// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bml, bmp

final class aeg
	implements bml
{

	aeg(bml bml1, int i, bml bml2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		a = bml1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field bml a>
		b = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:i2l             
	//    8   12:putfield        #24  <Field long b>
		c = bml2;
	//    9   15:aload_0         
	//   10   16:aload_3         
	//   11   17:putfield        #26  <Field bml c>
	//   12   20:return          
	}

	public final int a(byte abyte0[], int i, int j)
	{
		long l1 = d;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field long d>
	//    2    4:lstore          6
		long l2 = b;
	//    3    6:aload_0         
	//    4    7:getfield        #24  <Field long b>
	//    5   10:lstore          8
		int k;
		if(l1 < l2)
	//*   6   12:lload           6
	//*   7   14:lload           8
	//*   8   16:lcmp            
	//*   9   17:ifge            63
		{
			k = (int)Math.min(j, l2 - l1);
	//   10   20:iload_3         
	//   11   21:i2l             
	//   12   22:lload           8
	//   13   24:lload           6
	//   14   26:lsub            
	//   15   27:invokestatic    #36  <Method long Math.min(long, long)>
	//   16   30:l2i             
	//   17   31:istore          4
			k = a.a(abyte0, i, k);
	//   18   33:aload_0         
	//   19   34:getfield        #22  <Field bml a>
	//   20   37:aload_1         
	//   21   38:iload_2         
	//   22   39:iload           4
	//   23   41:invokeinterface #38  <Method int bml.a(byte[], int, int)>
	//   24   46:istore          4
			d = d + (long)k;
	//   25   48:aload_0         
	//   26   49:aload_0         
	//   27   50:getfield        #30  <Field long d>
	//   28   53:iload           4
	//   29   55:i2l             
	//   30   56:ladd            
	//   31   57:putfield        #30  <Field long d>
		} else
	//*  32   60:goto            66
		{
			k = 0;
	//   33   63:iconst_0        
	//   34   64:istore          4
		}
		int l = k;
	//   35   66:iload           4
	//   36   68:istore          5
		if(d >= b)
	//*  37   70:aload_0         
	//*  38   71:getfield        #30  <Field long d>
	//*  39   74:aload_0         
	//*  40   75:getfield        #24  <Field long b>
	//*  41   78:lcmp            
	//*  42   79:iflt            118
		{
			i = c.a(abyte0, i + k, j - k);
	//   43   82:aload_0         
	//   44   83:getfield        #26  <Field bml c>
	//   45   86:aload_1         
	//   46   87:iload_2         
	//   47   88:iload           4
	//   48   90:iadd            
	//   49   91:iload_3         
	//   50   92:iload           4
	//   51   94:isub            
	//   52   95:invokeinterface #38  <Method int bml.a(byte[], int, int)>
	//   53  100:istore_2        
			l = k + i;
	//   54  101:iload           4
	//   55  103:iload_2         
	//   56  104:iadd            
	//   57  105:istore          5
			d = d + (long)i;
	//   58  107:aload_0         
	//   59  108:aload_0         
	//   60  109:getfield        #30  <Field long d>
	//   61  112:iload_2         
	//   62  113:i2l             
	//   63  114:ladd            
	//   64  115:putfield        #30  <Field long d>
		}
		return l;
	//   65  118:iload           5
	//   66  120:ireturn         
	}

	public final long a(bmp bmp1)
	{
		e = bmp1.a;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #43  <Field Uri bmp.a>
	//    3    5:putfield        #45  <Field Uri e>
		bmp bmp2;
		if(bmp1.d >= b)
	//*   4    8:aload_1         
	//*   5    9:getfield        #46  <Field long bmp.d>
	//*   6   12:aload_0         
	//*   7   13:getfield        #24  <Field long b>
	//*   8   16:lcmp            
	//*   9   17:iflt            26
		{
			bmp2 = null;
	//   10   20:aconst_null     
	//   11   21:astore          6
		} else
	//*  12   23:goto            86
		{
			long l3 = bmp1.d;
	//   13   26:aload_1         
	//   14   27:getfield        #46  <Field long bmp.d>
	//   15   30:lstore          4
			long l;
			if(bmp1.e != -1L)
	//*  16   32:aload_1         
	//*  17   33:getfield        #48  <Field long bmp.e>
	//*  18   36:ldc2w           #49  <Long -1L>
	//*  19   39:lcmp            
	//*  20   40:ifeq            61
				l = Math.min(bmp1.e, b - l3);
	//   21   43:aload_1         
	//   22   44:getfield        #48  <Field long bmp.e>
	//   23   47:aload_0         
	//   24   48:getfield        #24  <Field long b>
	//   25   51:lload           4
	//   26   53:lsub            
	//   27   54:invokestatic    #36  <Method long Math.min(long, long)>
	//   28   57:lstore_2        
			else
	//*  29   58:goto            69
				l = b - l3;
	//   30   61:aload_0         
	//   31   62:getfield        #24  <Field long b>
	//   32   65:lload           4
	//   33   67:lsub            
	//   34   68:lstore_2        
			bmp2 = new bmp(bmp1.a, l3, l, ((String) (null)));
	//   35   69:new             #41  <Class bmp>
	//   36   72:dup             
	//   37   73:aload_1         
	//   38   74:getfield        #43  <Field Uri bmp.a>
	//   39   77:lload           4
	//   40   79:lload_2         
	//   41   80:aconst_null     
	//   42   81:invokespecial   #53  <Method void bmp(Uri, long, long, String)>
	//   43   84:astore          6
		}
		bmp bmp3;
		if(bmp1.e != -1L && bmp1.d + bmp1.e <= b)
	//*  44   86:aload_1         
	//*  45   87:getfield        #48  <Field long bmp.e>
	//*  46   90:ldc2w           #49  <Long -1L>
	//*  47   93:lcmp            
	//*  48   94:ifeq            120
	//*  49   97:aload_1         
	//*  50   98:getfield        #46  <Field long bmp.d>
	//*  51  101:aload_1         
	//*  52  102:getfield        #48  <Field long bmp.e>
	//*  53  105:ladd            
	//*  54  106:aload_0         
	//*  55  107:getfield        #24  <Field long b>
	//*  56  110:lcmp            
	//*  57  111:ifgt            120
		{
			bmp3 = null;
	//   58  114:aconst_null     
	//   59  115:astore          7
		} else
	//*  60  117:goto            190
		{
			long l4 = Math.max(b, bmp1.d);
	//   61  120:aload_0         
	//   62  121:getfield        #24  <Field long b>
	//   63  124:aload_1         
	//   64  125:getfield        #46  <Field long bmp.d>
	//   65  128:invokestatic    #56  <Method long Math.max(long, long)>
	//   66  131:lstore          4
			long l1;
			if(bmp1.e != -1L)
	//*  67  133:aload_1         
	//*  68  134:getfield        #48  <Field long bmp.e>
	//*  69  137:ldc2w           #49  <Long -1L>
	//*  70  140:lcmp            
	//*  71  141:ifeq            169
				l1 = Math.min(bmp1.e, (bmp1.d + bmp1.e) - b);
	//   72  144:aload_1         
	//   73  145:getfield        #48  <Field long bmp.e>
	//   74  148:aload_1         
	//   75  149:getfield        #46  <Field long bmp.d>
	//   76  152:aload_1         
	//   77  153:getfield        #48  <Field long bmp.e>
	//   78  156:ladd            
	//   79  157:aload_0         
	//   80  158:getfield        #24  <Field long b>
	//   81  161:lsub            
	//   82  162:invokestatic    #36  <Method long Math.min(long, long)>
	//   83  165:lstore_2        
			else
	//*  84  166:goto            173
				l1 = -1L;
	//   85  169:ldc2w           #49  <Long -1L>
	//   86  172:lstore_2        
			bmp3 = new bmp(bmp1.a, l4, l1, ((String) (null)));
	//   87  173:new             #41  <Class bmp>
	//   88  176:dup             
	//   89  177:aload_1         
	//   90  178:getfield        #43  <Field Uri bmp.a>
	//   91  181:lload           4
	//   92  183:lload_2         
	//   93  184:aconst_null     
	//   94  185:invokespecial   #53  <Method void bmp(Uri, long, long, String)>
	//   95  188:astore          7
		}
		long l5 = 0L;
	//   96  190:lconst_0        
	//   97  191:lstore          4
		long l2;
		if(bmp2 != null)
	//*  98  193:aload           6
	//*  99  195:ifnull          213
			l2 = a.a(bmp2);
	//  100  198:aload_0         
	//  101  199:getfield        #22  <Field bml a>
	//  102  202:aload           6
	//  103  204:invokeinterface #58  <Method long bml.a(bmp)>
	//  104  209:lstore_2        
		else
	//* 105  210:goto            215
			l2 = 0L;
	//  106  213:lconst_0        
	//  107  214:lstore_2        
		if(bmp3 != null)
	//* 108  215:aload           7
	//* 109  217:ifnull          233
			l5 = c.a(bmp3);
	//  110  220:aload_0         
	//  111  221:getfield        #26  <Field bml c>
	//  112  224:aload           7
	//  113  226:invokeinterface #58  <Method long bml.a(bmp)>
	//  114  231:lstore          4
		d = bmp1.d;
	//  115  233:aload_0         
	//  116  234:aload_1         
	//  117  235:getfield        #46  <Field long bmp.d>
	//  118  238:putfield        #30  <Field long d>
		if(l2 != -1L)
	//* 119  241:lload_2         
	//* 120  242:ldc2w           #49  <Long -1L>
	//* 121  245:lcmp            
	//* 122  246:ifeq            267
		{
			if(l5 == -1L)
	//* 123  249:lload           4
	//* 124  251:ldc2w           #49  <Long -1L>
	//* 125  254:lcmp            
	//* 126  255:ifne            262
				return -1L;
	//  127  258:ldc2w           #49  <Long -1L>
	//  128  261:lreturn         
			else
				return l2 + l5;
	//  129  262:lload_2         
	//  130  263:lload           4
	//  131  265:ladd            
	//  132  266:lreturn         
		} else
		{
			return -1L;
	//  133  267:ldc2w           #49  <Long -1L>
	//  134  270:lreturn         
		}
	}

	public final void a()
	{
		a.a();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field bml a>
	//    2    4:invokeinterface #60  <Method void bml.a()>
		c.a();
	//    3    9:aload_0         
	//    4   10:getfield        #26  <Field bml c>
	//    5   13:invokeinterface #60  <Method void bml.a()>
	//    6   18:return          
	}

	public final Uri b()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Uri e>
	//    2    4:areturn         
	}

	private final bml a;
	private final long b;
	private final bml c;
	private long d;
	private Uri e;
}
