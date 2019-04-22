// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.a.a;

import android.content.Context;
import android.util.Pair;
import com.google.ads.interactivemedia.v3.a.c.g;
import com.google.ads.interactivemedia.v3.a.f.i;
import com.google.ads.interactivemedia.v3.a.f.k;
import com.google.ads.interactivemedia.v3.a.f.m;
import com.google.ads.interactivemedia.v3.a.f.q;
import com.google.ads.interactivemedia.v3.a.p;
import com.google.ads.interactivemedia.v3.a.r;
import com.google.ads.interactivemedia.v3.b.d.c;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.a.a:
//			e, a, l, i, 
//			j, w, f

public class f extends e
{
	class a extends w
	{

		public void a(w w1)
		{
			if(a == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field w a>
		//*   2    4:ifnonnull       13
			{
				a = w1;
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:putfield        #18  <Field w a>
				return;
		//    6   12:return          
			} else
			{
				throw new AssertionError();
		//    7   13:new             #20  <Class AssertionError>
		//    8   16:dup             
		//    9   17:invokespecial   #21  <Method void AssertionError()>
		//   10   20:athrow          
			}
		}

		public Object read(com.google.ads.interactivemedia.v3.b.d.a a1)
			throws IOException
		{
			w w1 = a;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field w a>
		//    2    4:astore_2        
			if(w1 != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          15
				return w1.read(a1);
		//    5    9:aload_2         
		//    6   10:aload_1         
		//    7   11:invokevirtual   #29  <Method Object w.read(com.google.ads.interactivemedia.v3.b.d.a)>
		//    8   14:areturn         
			else
				throw new IllegalStateException();
		//    9   15:new             #31  <Class IllegalStateException>
		//   10   18:dup             
		//   11   19:invokespecial   #32  <Method void IllegalStateException()>
		//   12   22:athrow          
		}

		public void write(c c, Object obj)
			throws IOException
		{
			w w1 = a;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field w a>
		//    2    4:astore_3        
			if(w1 != null)
		//*   3    5:aload_3         
		//*   4    6:ifnull          16
			{
				w1.write(c, obj);
		//    5    9:aload_3         
		//    6   10:aload_1         
		//    7   11:aload_2         
		//    8   12:invokevirtual   #38  <Method void w.write(c, Object)>
				return;
		//    9   15:return          
			} else
			{
				throw new IllegalStateException();
		//   10   16:new             #31  <Class IllegalStateException>
		//   11   19:dup             
		//   12   20:invokespecial   #32  <Method void IllegalStateException()>
		//   13   23:athrow          
			}
		}

		private w a;

		a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void w()>
		//    2    4:return          
		}
	}

	private static final class b
	{

		static String a(b b1, String s1)
		{
			b1.w = s1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #67  <Field String w>
			return s1;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

		private static List a(m m1)
			throws r
		{
			int i1;
			long l1;
			try
			{
				m1.d(16);
		//    0    0:aload_0         
		//    1    1:bipush          16
		//    2    3:invokevirtual   #81  <Method void m.d(int)>
				l1 = m1.l();
		//    3    6:aload_0         
		//    4    7:invokevirtual   #84  <Method long m.l()>
		//    5   10:lstore_2        
			}
		//*   6   11:lload_2         
		//*   7   12:ldc2w           #85  <Long 0x31435657L>
		//*   8   15:lcmp            
		//*   9   16:ifne            94
		//*  10   19:aload_0         
		//*  11   20:invokevirtual   #89  <Method int m.d()>
		//*  12   23:bipush          20
		//*  13   25:iadd            
		//*  14   26:istore_1        
		//*  15   27:aload_0         
		//*  16   28:getfield        #91  <Field byte[] m.a>
		//*  17   31:astore_0        
		//*  18   32:iload_1         
		//*  19   33:aload_0         
		//*  20   34:arraylength     
		//*  21   35:iconst_4        
		//*  22   36:isub            
		//*  23   37:icmpge          84
		//*  24   40:aload_0         
		//*  25   41:iload_1         
		//*  26   42:baload          
		//*  27   43:ifne            143
		//*  28   46:aload_0         
		//*  29   47:iload_1         
		//*  30   48:iconst_1        
		//*  31   49:iadd            
		//*  32   50:baload          
		//*  33   51:ifne            143
		//*  34   54:aload_0         
		//*  35   55:iload_1         
		//*  36   56:iconst_2        
		//*  37   57:iadd            
		//*  38   58:baload          
		//*  39   59:iconst_1        
		//*  40   60:icmpne          143
		//*  41   63:aload_0         
		//*  42   64:iload_1         
		//*  43   65:iconst_3        
		//*  44   66:iadd            
		//*  45   67:baload          
		//*  46   68:bipush          15
		//*  47   70:icmpne          143
		//*  48   73:aload_0         
		//*  49   74:iload_1         
		//*  50   75:aload_0         
		//*  51   76:arraylength     
		//*  52   77:invokestatic    #97  <Method byte[] Arrays.copyOfRange(byte[], int, int)>
		//*  53   80:invokestatic    #103 <Method List Collections.singletonList(Object)>
		//*  54   83:areturn         
		//*  55   84:new             #74  <Class r>
		//*  56   87:dup             
		//*  57   88:ldc1            #105 <String "Failed to find FourCC VC1 initialization data">
		//*  58   90:invokespecial   #108 <Method void r(String)>
		//*  59   93:athrow          
		//*  60   94:new             #110 <Class StringBuilder>
		//*  61   97:dup             
		//*  62   98:bipush          57
		//*  63  100:invokespecial   #112 <Method void StringBuilder(int)>
		//*  64  103:astore_0        
		//*  65  104:aload_0         
		//*  66  105:ldc1            #114 <String "Unsupported FourCC compression type: ">
		//*  67  107:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
		//*  68  110:pop             
		//*  69  111:aload_0         
		//*  70  112:lload_2         
		//*  71  113:invokevirtual   #121 <Method StringBuilder StringBuilder.append(long)>
		//*  72  116:pop             
		//*  73  117:new             #74  <Class r>
		//*  74  120:dup             
		//*  75  121:aload_0         
		//*  76  122:invokevirtual   #125 <Method String StringBuilder.toString()>
		//*  77  125:invokespecial   #108 <Method void r(String)>
		//*  78  128:athrow          
		//*  79  129:new             #74  <Class r>
		//*  80  132:dup             
		//*  81  133:ldc1            #127 <String "Error parsing FourCC VC1 codec private">
		//*  82  135:invokespecial   #108 <Method void r(String)>
		//*  83  138:athrow          
			// Misplaced declaration of an exception variable
			catch(m m1)
			{
				throw new r("Error parsing FourCC VC1 codec private");
			}
			if(l1 != 0x31435657L) goto _L2; else goto _L1
_L1:
			i1 = m1.d() + 20;
			m1 = ((m) (m1.a));
_L5:
			if(i1 >= m1.length - 4) goto _L4; else goto _L3
_L3:
			if(m1[i1] != 0 || m1[i1 + 1] != 0 || m1[i1 + 2] != 1 || m1[i1 + 3] != 15)
				break MISSING_BLOCK_LABEL_143;
			return Collections.singletonList(((Object) (Arrays.copyOfRange(((byte []) (m1)), i1, m1.length))));
_L4:
			throw new r("Failed to find FourCC VC1 initialization data");
_L2:
			m1 = ((m) (new StringBuilder(57)));
			((StringBuilder) (m1)).append("Unsupported FourCC compression type: ");
			((StringBuilder) (m1)).append(l1);
			throw new r(((StringBuilder) (m1)).toString());
		//*  84  139:astore_0        
		//*  85  140:goto            129
			i1++;
		//   86  143:iload_1         
		//   87  144:iconst_1        
		//   88  145:iadd            
		//   89  146:istore_1        
			  goto _L5
		//*  90  147:goto            32
		}

		private static List a(byte abyte0[])
			throws r
		{
			if(abyte0[0] != 2) goto _L2; else goto _L1
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:baload          
		//    3    3:iconst_2        
		//    4    4:icmpne          149
_L1:
			int i1 = 1;
		//    5    7:iconst_1        
		//    6    8:istore_1        
			int k1;
			int l1;
			byte abyte1[];
			byte abyte2[];
			int j1 = 0;
		//    7    9:iconst_0        
		//    8   10:istore_2        
		//*   9   11:goto            173
		//*  10   14:iload_2         
		//*  11   15:iconst_1        
		//*  12   16:iadd            
		//*  13   17:istore_3        
		//*  14   18:aload_0         
		//*  15   19:iload_2         
		//*  16   20:baload          
		//*  17   21:istore_2        
		//*  18   22:aload_0         
		//*  19   23:iload_3         
		//*  20   24:baload          
		//*  21   25:iconst_1        
		//*  22   26:icmpne          139
		//*  23   29:iload           4
		//*  24   31:newarray        byte[]
		//*  25   33:astore          5
		//*  26   35:aload_0         
		//*  27   36:iload_3         
		//*  28   37:aload           5
		//*  29   39:iconst_0        
		//*  30   40:iload           4
		//*  31   42:invokestatic    #137 <Method void System.arraycopy(Object, int, Object, int, int)>
		//*  32   45:iload_3         
		//*  33   46:iload           4
		//*  34   48:iadd            
		//*  35   49:istore_3        
		//*  36   50:aload_0         
		//*  37   51:iload_3         
		//*  38   52:baload          
		//*  39   53:iconst_3        
		//*  40   54:icmpne          129
		//*  41   57:iload_3         
		//*  42   58:iload_1         
		//*  43   59:iload_2         
		//*  44   60:iadd            
		//*  45   61:iadd            
		//*  46   62:istore_1        
		//*  47   63:aload_0         
		//*  48   64:iload_1         
		//*  49   65:baload          
		//*  50   66:iconst_5        
		//*  51   67:icmpne          119
		//*  52   70:aload_0         
		//*  53   71:arraylength     
		//*  54   72:iload_1         
		//*  55   73:isub            
		//*  56   74:newarray        byte[]
		//*  57   76:astore          6
		//*  58   78:aload_0         
		//*  59   79:iload_1         
		//*  60   80:aload           6
		//*  61   82:iconst_0        
		//*  62   83:aload_0         
		//*  63   84:arraylength     
		//*  64   85:iload_1         
		//*  65   86:isub            
		//*  66   87:invokestatic    #137 <Method void System.arraycopy(Object, int, Object, int, int)>
		//*  67   90:new             #139 <Class ArrayList>
		//*  68   93:dup             
		//*  69   94:iconst_2        
		//*  70   95:invokespecial   #140 <Method void ArrayList(int)>
		//*  71   98:astore_0        
		//*  72   99:aload_0         
		//*  73  100:aload           5
		//*  74  102:invokeinterface #146 <Method boolean List.add(Object)>
		//*  75  107:pop             
		//*  76  108:aload_0         
		//*  77  109:aload           6
		//*  78  111:invokeinterface #146 <Method boolean List.add(Object)>
		//*  79  116:pop             
		//*  80  117:aload_0         
		//*  81  118:areturn         
		//*  82  119:new             #74  <Class r>
		//*  83  122:dup             
		//*  84  123:ldc1            #148 <String "Error parsing vorbis codec private">
		//*  85  125:invokespecial   #108 <Method void r(String)>
		//*  86  128:athrow          
		//*  87  129:new             #74  <Class r>
		//*  88  132:dup             
		//*  89  133:ldc1            #148 <String "Error parsing vorbis codec private">
		//*  90  135:invokespecial   #108 <Method void r(String)>
		//*  91  138:athrow          
		//*  92  139:new             #74  <Class r>
		//*  93  142:dup             
		//*  94  143:ldc1            #148 <String "Error parsing vorbis codec private">
		//*  95  145:invokespecial   #108 <Method void r(String)>
		//*  96  148:athrow          
		//*  97  149:new             #74  <Class r>
		//*  98  152:dup             
		//*  99  153:ldc1            #148 <String "Error parsing vorbis codec private">
		//* 100  155:invokespecial   #108 <Method void r(String)>
		//* 101  158:athrow          
		//* 102  159:new             #74  <Class r>
		//* 103  162:dup             
		//* 104  163:ldc1            #148 <String "Error parsing vorbis codec private">
		//* 105  165:invokespecial   #108 <Method void r(String)>
		//* 106  168:athrow          
		//* 107  169:astore_0        
		//* 108  170:goto            159
			for(; abyte0[i1] == -1; i1++)
		//* 109  173:aload_0         
		//* 110  174:iload_1         
		//* 111  175:baload          
		//* 112  176:iconst_m1       
		//* 113  177:icmpne          193
				j1 += 255;
		//  114  180:iload_2         
		//  115  181:sipush          255
		//  116  184:iadd            
		//  117  185:istore_2        

		//  118  186:iload_1         
		//  119  187:iconst_1        
		//  120  188:iadd            
		//  121  189:istore_1        
		//* 122  190:goto            173
			k1 = i1 + 1;
		//  123  193:iload_1         
		//  124  194:iconst_1        
		//  125  195:iadd            
		//  126  196:istore_3        
			l1 = j1 + abyte0[i1];
		//  127  197:iload_2         
		//  128  198:aload_0         
		//  129  199:iload_1         
		//  130  200:baload          
		//  131  201:iadd            
		//  132  202:istore          4
			i1 = 0;
		//  133  204:iconst_0        
		//  134  205:istore_1        
			j1 = k1;
		//  135  206:iload_3         
		//  136  207:istore_2        
			while(abyte0[j1] == -1) 
		//* 137  208:aload_0         
		//* 138  209:iload_2         
		//* 139  210:baload          
		//* 140  211:iconst_m1       
		//* 141  212:icmpne          14
			{
				i1 += 255;
		//  142  215:iload_1         
		//  143  216:sipush          255
		//  144  219:iadd            
		//  145  220:istore_1        
				j1++;
		//  146  221:iload_2         
		//  147  222:iconst_1        
		//  148  223:iadd            
		//  149  224:istore_2        
			}
			  goto _L3
_L5:
			k1 = j1 + 1;
			j1 = ((int) (abyte0[j1]));
			if(abyte0[k1] != 1)
				break MISSING_BLOCK_LABEL_139;
			try
			{
				abyte1 = new byte[l1];
				System.arraycopy(((Object) (abyte0)), k1, ((Object) (abyte1)), 0, l1);
			}
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
			{
				throw new r("Error parsing vorbis codec private");
			}
			k1 += l1;
			if(abyte0[k1] != 3)
				break MISSING_BLOCK_LABEL_129;
			i1 = k1 + (i1 + j1);
			if(abyte0[i1] != 5)
				break MISSING_BLOCK_LABEL_119;
			abyte2 = new byte[abyte0.length - i1];
			System.arraycopy(((Object) (abyte0)), i1, ((Object) (abyte2)), 0, abyte0.length - i1);
			abyte0 = ((byte []) (new ArrayList(2)));
			((List) (abyte0)).add(((Object) (abyte1)));
			((List) (abyte0)).add(((Object) (abyte2)));
			return ((List) (abyte0));
			throw new r("Error parsing vorbis codec private");
			throw new r("Error parsing vorbis codec private");
			throw new r("Error parsing vorbis codec private");
_L2:
			throw new r("Error parsing vorbis codec private");
_L3:
			if(true) goto _L5; else goto _L4
		//  150  225:goto            208
_L4:
		}

		private static Pair b(m m1)
			throws r
		{
			int i1;
			boolean flag;
			int j1;
			int k1;
			ArrayList arraylist;
			try
			{
				m1.c(4);
		//    0    0:aload_0         
		//    1    1:iconst_4        
		//    2    2:invokevirtual   #152 <Method void m.c(int)>
				j1 = (m1.f() & 3) + 1;
		//    3    5:aload_0         
		//    4    6:invokevirtual   #154 <Method int m.f()>
		//    5    9:iconst_3        
		//    6   10:iand            
		//    7   11:iconst_1        
		//    8   12:iadd            
		//    9   13:istore_3        
			}
		//*  10   14:iload_3         
		//*  11   15:iconst_3        
		//*  12   16:icmpeq          109
		//*  13   19:new             #139 <Class ArrayList>
		//*  14   22:dup             
		//*  15   23:invokespecial   #155 <Method void ArrayList()>
		//*  16   26:astore          5
		//*  17   28:aload_0         
		//*  18   29:invokevirtual   #154 <Method int m.f()>
		//*  19   32:istore          4
		//*  20   34:iconst_0        
		//*  21   35:istore_2        
		//*  22   36:iconst_0        
		//*  23   37:istore_1        
		//*  24   38:iload_1         
		//*  25   39:iload           4
		//*  26   41:bipush          31
		//*  27   43:iand            
		//*  28   44:icmpge          66
		//*  29   47:aload           5
		//*  30   49:aload_0         
		//*  31   50:invokestatic    #160 <Method byte[] k.a(m)>
		//*  32   53:invokeinterface #146 <Method boolean List.add(Object)>
		//*  33   58:pop             
		//*  34   59:iload_1         
		//*  35   60:iconst_1        
		//*  36   61:iadd            
		//*  37   62:istore_1        
		//*  38   63:goto            38
		//*  39   66:aload_0         
		//*  40   67:invokevirtual   #154 <Method int m.f()>
		//*  41   70:istore          4
		//*  42   72:iload_2         
		//*  43   73:istore_1        
		//*  44   74:iload_1         
		//*  45   75:iload           4
		//*  46   77:icmpge          99
		//*  47   80:aload           5
		//*  48   82:aload_0         
		//*  49   83:invokestatic    #160 <Method byte[] k.a(m)>
		//*  50   86:invokeinterface #146 <Method boolean List.add(Object)>
		//*  51   91:pop             
		//*  52   92:iload_1         
		//*  53   93:iconst_1        
		//*  54   94:iadd            
		//*  55   95:istore_1        
		//*  56   96:goto            74
		//*  57   99:aload           5
		//*  58  101:iload_3         
		//*  59  102:invokestatic    #166 <Method Integer Integer.valueOf(int)>
		//*  60  105:invokestatic    #172 <Method Pair Pair.create(Object, Object)>
		//*  61  108:areturn         
		//*  62  109:new             #74  <Class r>
		//*  63  112:dup             
		//*  64  113:invokespecial   #173 <Method void r()>
		//*  65  116:athrow          
		//*  66  117:new             #74  <Class r>
		//*  67  120:dup             
		//*  68  121:ldc1            #175 <String "Error parsing AVC codec private">
		//*  69  123:invokespecial   #108 <Method void r(String)>
		//*  70  126:athrow          
			// Misplaced declaration of an exception variable
			catch(m m1)
			{
				throw new r("Error parsing AVC codec private");
			}
			if(j1 == 3)
				break MISSING_BLOCK_LABEL_109;
			arraylist = new ArrayList();
			k1 = m1.f();
			flag = false;
			i1 = 0;
_L2:
			if(i1 >= (k1 & 0x1f))
				break; /* Loop/switch isn't completed */
			((List) (arraylist)).add(((Object) (com.google.ads.interactivemedia.v3.a.f.k.a(m1))));
			i1++;
			if(true) goto _L2; else goto _L1
_L1:
			k1 = m1.f();
			i1 = ((int) (flag));
_L4:
			if(i1 >= k1)
				break; /* Loop/switch isn't completed */
			((List) (arraylist)).add(((Object) (com.google.ads.interactivemedia.v3.a.f.k.a(m1))));
			i1++;
			if(true) goto _L4; else goto _L3
_L3:
			return Pair.create(((Object) (arraylist)), ((Object) (Integer.valueOf(j1))));
			throw new r();
		//*  71  127:astore_0        
		//*  72  128:goto            117
		}

		private static Pair c(m m1)
			throws r
		{
			int i1;
			int j1;
			int k1;
			int l1;
			int i2;
			int j2;
			int k2;
			int l2;
			byte abyte0[];
			try
			{
				m1.c(21);
		//    0    0:aload_0         
		//    1    1:bipush          21
		//    2    3:invokevirtual   #152 <Method void m.c(int)>
				i2 = m1.f();
		//    3    6:aload_0         
		//    4    7:invokevirtual   #154 <Method int m.f()>
		//    5   10:istore          5
				j2 = m1.f();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #154 <Method int m.f()>
		//    8   16:istore          6
				l1 = m1.d();
		//    9   18:aload_0         
		//   10   19:invokevirtual   #89  <Method int m.d()>
		//   11   22:istore          4
			}
		//*  12   24:iconst_0        
		//*  13   25:istore_2        
		//*  14   26:iconst_0        
		//*  15   27:istore_1        
		//*  16   28:iload_2         
		//*  17   29:iload           6
		//*  18   31:icmpge          79
		//*  19   34:aload_0         
		//*  20   35:iconst_1        
		//*  21   36:invokevirtual   #81  <Method void m.d(int)>
		//*  22   39:aload_0         
		//*  23   40:invokevirtual   #178 <Method int m.g()>
		//*  24   43:istore          7
		//*  25   45:iconst_0        
		//*  26   46:istore_3        
		//*  27   47:iload_3         
		//*  28   48:iload           7
		//*  29   50:icmpge          220
		//*  30   53:aload_0         
		//*  31   54:invokevirtual   #178 <Method int m.g()>
		//*  32   57:istore          8
		//*  33   59:iload_1         
		//*  34   60:iload           8
		//*  35   62:iconst_4        
		//*  36   63:iadd            
		//*  37   64:iadd            
		//*  38   65:istore_1        
		//*  39   66:aload_0         
		//*  40   67:iload           8
		//*  41   69:invokevirtual   #81  <Method void m.d(int)>
		//*  42   72:iload_3         
		//*  43   73:iconst_1        
		//*  44   74:iadd            
		//*  45   75:istore_3        
		//*  46   76:goto            47
		//*  47   79:aload_0         
		//*  48   80:iload           4
		//*  49   82:invokevirtual   #152 <Method void m.c(int)>
		//*  50   85:iload_1         
		//*  51   86:newarray        byte[]
		//*  52   88:astore          9
		//*  53   90:iconst_0        
		//*  54   91:istore_3        
		//*  55   92:iconst_0        
		//*  56   93:istore_2        
		//*  57   94:iload_3         
		//*  58   95:iload           6
		//*  59   97:icmpge          234
		//*  60  100:aload_0         
		//*  61  101:iconst_1        
		//*  62  102:invokevirtual   #81  <Method void m.d(int)>
		//*  63  105:aload_0         
		//*  64  106:invokevirtual   #178 <Method int m.g()>
		//*  65  109:istore          7
		//*  66  111:iconst_0        
		//*  67  112:istore          4
		//*  68  114:iload           4
		//*  69  116:iload           7
		//*  70  118:icmpge          227
		//*  71  121:aload_0         
		//*  72  122:invokevirtual   #178 <Method int m.g()>
		//*  73  125:istore          8
		//*  74  127:getstatic       #179 <Field byte[] k.a>
		//*  75  130:iconst_0        
		//*  76  131:aload           9
		//*  77  133:iload_2         
		//*  78  134:getstatic       #179 <Field byte[] k.a>
		//*  79  137:arraylength     
		//*  80  138:invokestatic    #137 <Method void System.arraycopy(Object, int, Object, int, int)>
		//*  81  141:iload_2         
		//*  82  142:getstatic       #179 <Field byte[] k.a>
		//*  83  145:arraylength     
		//*  84  146:iadd            
		//*  85  147:istore_2        
		//*  86  148:aload_0         
		//*  87  149:getfield        #91  <Field byte[] m.a>
		//*  88  152:aload_0         
		//*  89  153:invokevirtual   #89  <Method int m.d()>
		//*  90  156:aload           9
		//*  91  158:iload_2         
		//*  92  159:iload           8
		//*  93  161:invokestatic    #137 <Method void System.arraycopy(Object, int, Object, int, int)>
		//*  94  164:iload_2         
		//*  95  165:iload           8
		//*  96  167:iadd            
		//*  97  168:istore_2        
		//*  98  169:aload_0         
		//*  99  170:iload           8
		//* 100  172:invokevirtual   #81  <Method void m.d(int)>
		//* 101  175:iload           4
		//* 102  177:iconst_1        
		//* 103  178:iadd            
		//* 104  179:istore          4
		//* 105  181:goto            114
		//* 106  184:aload           9
		//* 107  186:invokestatic    #103 <Method List Collections.singletonList(Object)>
		//* 108  189:astore_0        
		//* 109  190:aload_0         
		//* 110  191:iload           5
		//* 111  193:iconst_3        
		//* 112  194:iand            
		//* 113  195:iconst_1        
		//* 114  196:iadd            
		//* 115  197:invokestatic    #166 <Method Integer Integer.valueOf(int)>
		//* 116  200:invokestatic    #172 <Method Pair Pair.create(Object, Object)>
		//* 117  203:astore_0        
		//* 118  204:aload_0         
		//* 119  205:areturn         
		//* 120  206:new             #74  <Class r>
		//* 121  209:dup             
		//* 122  210:ldc1            #181 <String "Error parsing HEVC codec private">
		//* 123  212:invokespecial   #108 <Method void r(String)>
		//* 124  215:athrow          
			// Misplaced declaration of an exception variable
			catch(m m1)
			{
				throw new r("Error parsing HEVC codec private");
			}
			j1 = 0;
			i1 = 0;
_L9:
			if(j1 >= j2) goto _L2; else goto _L1
_L1:
			m1.d(1);
			k2 = m1.g();
			k1 = 0;
_L4:
			if(k1 >= k2)
				break; /* Loop/switch isn't completed */
			l2 = m1.g();
			i1 += l2 + 4;
			m1.d(l2);
			k1++;
			if(true) goto _L4; else goto _L3
_L2:
			m1.c(l1);
			abyte0 = new byte[i1];
			k1 = 0;
			j1 = 0;
_L10:
			if(k1 >= j2) goto _L6; else goto _L5
_L5:
			m1.d(1);
			k2 = m1.g();
			l1 = 0;
_L8:
			if(l1 >= k2)
				continue; /* Loop/switch isn't completed */
			l2 = m1.g();
			System.arraycopy(((Object) (k.a)), 0, ((Object) (abyte0)), j1, k.a.length);
			j1 += k.a.length;
			System.arraycopy(((Object) (m1.a)), m1.d(), ((Object) (abyte0)), j1, l2);
			j1 += l2;
			m1.d(l2);
			l1++;
			if(true) goto _L8; else goto _L7
_L7:
			continue; /* Loop/switch isn't completed */
_L12:
			m1 = ((m) (Collections.singletonList(((Object) (abyte0)))));
_L13:
			m1 = ((m) (Pair.create(((Object) (m1)), ((Object) (Integer.valueOf((i2 & 3) + 1))))));
			return ((Pair) (m1));
		//* 125  216:astore_0        
		//* 126  217:goto            206
_L3:
			j1++;
		//  127  220:iload_2         
		//  128  221:iconst_1        
		//  129  222:iadd            
		//  130  223:istore_2        
			  goto _L9
		//* 131  224:goto            28
			k1++;
		//  132  227:iload_3         
		//  133  228:iconst_1        
		//  134  229:iadd            
		//  135  230:istore_3        
			  goto _L10
		//* 136  231:goto            94
_L6:
			if(i1 != 0) goto _L12; else goto _L11
		//  137  234:iload_1         
		//  138  235:ifne            184
_L11:
			m1 = null;
		//  139  238:aconst_null     
		//  140  239:astore_0        
			  goto _L13
		//* 141  240:goto            190
		}

		private static boolean d(m m1)
			throws r
		{
			int i1;
			long l1;
			long l2;
			try
			{
				i1 = m1.h();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #184 <Method int m.h()>
		//    2    4:istore_1        
			}
		//*   3    5:iload_1         
		//*   4    6:iconst_1        
		//*   5    7:icmpne          12
		//*   6   10:iconst_1        
		//*   7   11:ireturn         
		//*   8   12:iload_1         
		//*   9   13:ldc1            #185 <Int 65534>
		//*  10   15:icmpne          62
		//*  11   18:aload_0         
		//*  12   19:bipush          24
		//*  13   21:invokevirtual   #152 <Method void m.c(int)>
		//*  14   24:aload_0         
		//*  15   25:invokevirtual   #187 <Method long m.o()>
		//*  16   28:invokestatic    #190 <Method UUID f.a()>
		//*  17   31:invokevirtual   #195 <Method long UUID.getMostSignificantBits()>
		//*  18   34:lcmp            
		//*  19   35:ifne            60
		//*  20   38:aload_0         
		//*  21   39:invokevirtual   #187 <Method long m.o()>
		//*  22   42:lstore_2        
		//*  23   43:invokestatic    #190 <Method UUID f.a()>
		//*  24   46:invokevirtual   #198 <Method long UUID.getLeastSignificantBits()>
		//*  25   49:lstore          4
		//*  26   51:lload_2         
		//*  27   52:lload           4
		//*  28   54:lcmp            
		//*  29   55:ifne            60
		//*  30   58:iconst_1        
		//*  31   59:ireturn         
		//*  32   60:iconst_0        
		//*  33   61:ireturn         
		//*  34   62:iconst_0        
		//*  35   63:ireturn         
		//*  36   64:new             #74  <Class r>
		//*  37   67:dup             
		//*  38   68:ldc1            #200 <String "Error parsing MS/ACM codec private">
		//*  39   70:invokespecial   #108 <Method void r(String)>
		//*  40   73:athrow          
			// Misplaced declaration of an exception variable
			catch(m m1)
			{
				throw new r("Error parsing MS/ACM codec private");
			}
			if(i1 == 1)
				return true;
			if(i1 != 65534)
				break MISSING_BLOCK_LABEL_62;
			m1.c(24);
			if(m1.o() != com.google.ads.interactivemedia.v3.a.c.g.f.a().getMostSignificantBits())
				break MISSING_BLOCK_LABEL_60;
			l1 = m1.o();
			l2 = com.google.ads.interactivemedia.v3.a.c.g.f.a().getLeastSignificantBits();
			if(l1 == l2)
				return true;
			return false;
			return false;
		//*  41   74:astore_0        
		//*  42   75:goto            64
		}

		public void a(g g1, int i1, long l1)
			throws r
		{
			Object obj;
label0:
			{
				Object obj1;
label1:
				{
					float f1;
					char c1;
label2:
					{
label3:
						{
							String s1 = a;
		//    0    0:aload_0         
		//    1    1:getfield        #203 <Field String a>
		//    2    4:astore          9
							switch(s1.hashCode())
		//*   3    6:aload           9
		//*   4    8:invokevirtual   #208 <Method int String.hashCode()>
							{
							default:
								break;

		//*   5   11:lookupswitch    25: default 220
		//		               -2095576542: 628
		//		               -2095575984: 611
		//		               -1985379776: 593
		//		               -1784763192: 576
		//		               -1730367663: 559
		//		               -1482641357: 542
		//		               -1373388978: 525
		//		               -538363189: 509
		//		               -538363109: 492
		//		               -425012669: 475
		//		               -356037306: 458
		//		               62923557: 441
		//		               62923603: 424
		//		               62927045: 407
		//		               82338133: 391
		//		               82338134: 375
		//		               99146302: 358
		//		               542569478: 341
		//		               725957860: 324
		//		               855502857: 307
		//		               1422270023: 290
		//		               1809237540: 274
		//		               1950749482: 257
		//		               1950789798: 240
		//		               1951062397: 223
		//*   6  220:goto            645
							case 1951062397: 
								if(s1.equals("A_OPUS"))
		//*   7  223:aload           9
		//*   8  225:ldc1            #210 <String "A_OPUS">
		//*   9  227:invokevirtual   #213 <Method boolean String.equals(Object)>
		//*  10  230:ifeq            645
								{
									c1 = '\n';
		//   11  233:bipush          10
		//   12  235:istore          6
									break label3;
		//   13  237:goto            648
								}
								break;

							case 1950789798: 
								if(!s1.equals("A_FLAC"))
									break;
		//   14  240:aload           9
		//   15  242:ldc1            #215 <String "A_FLAC">
		//   16  244:invokevirtual   #213 <Method boolean String.equals(Object)>
		//   17  247:ifeq            645
								c1 = '\023';
		//   18  250:bipush          19
		//   19  252:istore          6
								break label3;
		//   20  254:goto            648

							case 1950749482: 
								if(!s1.equals("A_EAC3"))
									break;
		//   21  257:aload           9
		//   22  259:ldc1            #217 <String "A_EAC3">
		//   23  261:invokevirtual   #213 <Method boolean String.equals(Object)>
		//   24  264:ifeq            645
								c1 = '\016';
		//   25  267:bipush          14
		//   26  269:istore          6
								break label3;
		//   27  271:goto            648

							case 1809237540: 
								if(!s1.equals("V_MPEG2"))
									break;
		//   28  274:aload           9
		//   29  276:ldc1            #219 <String "V_MPEG2">
		//   30  278:invokevirtual   #213 <Method boolean String.equals(Object)>
		//   31  281:ifeq            645
								c1 = '\002';
		//   32  284:iconst_2        
		//   33  285:istore          6
								break label3;
		//   34  287:goto            648

							case 1422270023: 
								if(!s1.equals("S_TEXT/UTF8"))
									break;
		//   35  290:aload           9
		//   36  292:ldc1            #221 <String "S_TEXT/UTF8">
		//   37  294:invokevirtual   #213 <Method boolean String.equals(Object)>
		//   38  297:ifeq            645
								c1 = '\026';
		//   39  300:bipush          22
		//   40  302:istore          6
								break label3;
		//   41  304:goto            648

							case 855502857: 
								if(!s1.equals("V_MPEGH/ISO/HEVC"))
									break;
		//   42  307:aload           9
		//   43  309:ldc1            #223 <String "V_MPEGH/ISO/HEVC">
		//   44  311:invokevirtual   #213 <Method boolean String.equals(Object)>
		//   45  314:ifeq            645
								c1 = '\007';
		//   46  317:bipush          7
		//   47  319:istore          6
								break label3;
		//   48  321:goto            648

							case 725957860: 
								if(!s1.equals("A_PCM/INT/LIT"))
									break;
		//   49  324:aload           9
		//   50  326:ldc1            #225 <String "A_PCM/INT/LIT">
		//   51  328:invokevirtual   #213 <Method boolean String.equals(Object)>
		//   52  331:ifeq            645
								c1 = '\025';
		//   53  334:bipush          21
		//   54  336:istore          6
								break label3;
		//   55  338:goto            648

							case 542569478: 
								if(!s1.equals("A_DTS/EXPRESS"))
									break;
		//   56  341:aload           9
		//   57  343:ldc1            #227 <String "A_DTS/EXPRESS">
		//   58  345:invokevirtual   #213 <Method boolean String.equals(Object)>
		//   59  348:ifeq            645
								c1 = '\021';
		//   60  351:bipush          17
		//   61  353:istore          6
								break label3;
		//   62  355:goto            648

							case 99146302: 
								if(!s1.equals("S_HDMV/PGS"))
									break;
		//   63  358:aload           9
		//   64  360:ldc1            #229 <String "S_HDMV/PGS">
		//   65  362:invokevirtual   #213 <Method boolean String.equals(Object)>
		//   66  365:ifeq            645
								c1 = '\030';
		//   67  368:bipush          24
		//   68  370:istore          6
								break label3;
		//   69  372:goto            648

							case 82338134: 
								if(!s1.equals("V_VP9"))
									break;
		//   70  375:aload           9
		//   71  377:ldc1            #231 <String "V_VP9">
		//   72  379:invokevirtual   #213 <Method boolean String.equals(Object)>
		//   73  382:ifeq            645
								c1 = '\001';
		//   74  385:iconst_1        
		//   75  386:istore          6
								break label3;
		//   76  388:goto            648

							case 82338133: 
								if(!s1.equals("V_VP8"))
									break;
		//   77  391:aload           9
		//   78  393:ldc1            #233 <String "V_VP8">
		//   79  395:invokevirtual   #213 <Method boolean String.equals(Object)>
		//   80  398:ifeq            645
								c1 = '\0';
		//   81  401:iconst_0        
		//   82  402:istore          6
								break label3;
		//   83  404:goto            648

							case 62927045: 
								if(!s1.equals("A_DTS"))
									break;
		//   84  407:aload           9
		//   85  409:ldc1            #235 <String "A_DTS">
		//   86  411:invokevirtual   #213 <Method boolean String.equals(Object)>
		//   87  414:ifeq            645
								c1 = '\020';
		//   88  417:bipush          16
		//   89  419:istore          6
								break label3;
		//   90  421:goto            648

							case 62923603: 
								if(!s1.equals("A_AC3"))
									break;
		//   91  424:aload           9
		//   92  426:ldc1            #237 <String "A_AC3">
		//   93  428:invokevirtual   #213 <Method boolean String.equals(Object)>
		//   94  431:ifeq            645
								c1 = '\r';
		//   95  434:bipush          13
		//   96  436:istore          6
								break label3;
		//   97  438:goto            648

							case 62923557: 
								if(!s1.equals("A_AAC"))
									break;
		//   98  441:aload           9
		//   99  443:ldc1            #239 <String "A_AAC">
		//  100  445:invokevirtual   #213 <Method boolean String.equals(Object)>
		//  101  448:ifeq            645
								c1 = '\013';
		//  102  451:bipush          11
		//  103  453:istore          6
								break label3;
		//  104  455:goto            648

							case -356037306: 
								if(!s1.equals("A_DTS/LOSSLESS"))
									break;
		//  105  458:aload           9
		//  106  460:ldc1            #241 <String "A_DTS/LOSSLESS">
		//  107  462:invokevirtual   #213 <Method boolean String.equals(Object)>
		//  108  465:ifeq            645
								c1 = '\022';
		//  109  468:bipush          18
		//  110  470:istore          6
								break label3;
		//  111  472:goto            648

							case -425012669: 
								if(!s1.equals("S_VOBSUB"))
									break;
		//  112  475:aload           9
		//  113  477:ldc1            #243 <String "S_VOBSUB">
		//  114  479:invokevirtual   #213 <Method boolean String.equals(Object)>
		//  115  482:ifeq            645
								c1 = '\027';
		//  116  485:bipush          23
		//  117  487:istore          6
								break label3;
		//  118  489:goto            648

							case -538363109: 
								if(!s1.equals("V_MPEG4/ISO/AVC"))
									break;
		//  119  492:aload           9
		//  120  494:ldc1            #245 <String "V_MPEG4/ISO/AVC">
		//  121  496:invokevirtual   #213 <Method boolean String.equals(Object)>
		//  122  499:ifeq            645
								c1 = '\006';
		//  123  502:bipush          6
		//  124  504:istore          6
								break label3;
		//  125  506:goto            648

							case -538363189: 
								if(!s1.equals("V_MPEG4/ISO/ASP"))
									break;
		//  126  509:aload           9
		//  127  511:ldc1            #247 <String "V_MPEG4/ISO/ASP">
		//  128  513:invokevirtual   #213 <Method boolean String.equals(Object)>
		//  129  516:ifeq            645
								c1 = '\004';
		//  130  519:iconst_4        
		//  131  520:istore          6
								break label3;
		//  132  522:goto            648

							case -1373388978: 
								if(!s1.equals("V_MS/VFW/FOURCC"))
									break;
		//  133  525:aload           9
		//  134  527:ldc1            #249 <String "V_MS/VFW/FOURCC">
		//  135  529:invokevirtual   #213 <Method boolean String.equals(Object)>
		//  136  532:ifeq            645
								c1 = '\b';
		//  137  535:bipush          8
		//  138  537:istore          6
								break label3;
		//  139  539:goto            648

							case -1482641357: 
								if(!s1.equals("A_MPEG/L3"))
									break;
		//  140  542:aload           9
		//  141  544:ldc1            #251 <String "A_MPEG/L3">
		//  142  546:invokevirtual   #213 <Method boolean String.equals(Object)>
		//  143  549:ifeq            645
								c1 = '\f';
		//  144  552:bipush          12
		//  145  554:istore          6
								break label3;
		//  146  556:goto            648

							case -1730367663: 
								if(!s1.equals("A_VORBIS"))
									break;
		//  147  559:aload           9
		//  148  561:ldc1            #253 <String "A_VORBIS">
		//  149  563:invokevirtual   #213 <Method boolean String.equals(Object)>
		//  150  566:ifeq            645
								c1 = '\t';
		//  151  569:bipush          9
		//  152  571:istore          6
								break label3;
		//  153  573:goto            648

							case -1784763192: 
								if(!s1.equals("A_TRUEHD"))
									break;
		//  154  576:aload           9
		//  155  578:ldc1            #255 <String "A_TRUEHD">
		//  156  580:invokevirtual   #213 <Method boolean String.equals(Object)>
		//  157  583:ifeq            645
								c1 = '\017';
		//  158  586:bipush          15
		//  159  588:istore          6
								break label3;
		//  160  590:goto            648

							case -1985379776: 
								if(!s1.equals("A_MS/ACM"))
									break;
		//  161  593:aload           9
		//  162  595:ldc2            #257 <String "A_MS/ACM">
		//  163  598:invokevirtual   #213 <Method boolean String.equals(Object)>
		//  164  601:ifeq            645
								c1 = '\024';
		//  165  604:bipush          20
		//  166  606:istore          6
								break label3;
		//  167  608:goto            648

							case -2095575984: 
								if(!s1.equals("V_MPEG4/ISO/SP"))
									break;
		//  168  611:aload           9
		//  169  613:ldc2            #259 <String "V_MPEG4/ISO/SP">
		//  170  616:invokevirtual   #213 <Method boolean String.equals(Object)>
		//  171  619:ifeq            645
								c1 = '\003';
		//  172  622:iconst_3        
		//  173  623:istore          6
								break label3;
		//  174  625:goto            648

							case -2095576542: 
								if(!s1.equals("V_MPEG4/ISO/AP"))
									break;
		//  175  628:aload           9
		//  176  630:ldc2            #261 <String "V_MPEG4/ISO/AP">
		//  177  633:invokevirtual   #213 <Method boolean String.equals(Object)>
		//  178  636:ifeq            645
								c1 = '\005';
		//  179  639:iconst_5        
		//  180  640:istore          6
								break label3;
		//  181  642:goto            648
							}
							c1 = '\uFFFF';
		//  182  645:iconst_m1       
		//  183  646:istore          6
						}
						obj1 = null;
		//  184  648:aconst_null     
		//  185  649:astore          10
						obj = null;
		//  186  651:aconst_null     
		//  187  652:astore          9
						int j1;
						switch(c1)
		//* 188  654:iload           6
						{
		//* 189  656:tableswitch     0 24: default 772
		//		               0 1454
		//		               1 1440
		//		               2 1426
		//		               3 1387
		//		               4 1387
		//		               5 1387
		//		               6 1332
		//		               7 1277
		//		               8 1247
		//		               9 1222
		//		               10 1126
		//		               11 1103
		//		               12 1087
		//		               13 1073
		//		               14 1059
		//		               15 1045
		//		               16 1031
		//		               17 1031
		//		               18 1017
		//		               19 994
		//		               20 900
		//		               21 834
		//		               22 820
		//		               23 797
		//		               24 783
						default:
							throw new r("Unrecognized codec identifier.");
		//  190  772:new             #74  <Class r>
		//  191  775:dup             
		//  192  776:ldc2            #263 <String "Unrecognized codec identifier.">
		//  193  779:invokespecial   #108 <Method void r(String)>
		//  194  782:athrow          

						case 24: // '\030'
							obj = "application/pgs";
		//  195  783:ldc2            #265 <String "application/pgs">
		//  196  786:astore          9
							c1 = '\uFFFF';
		//  197  788:iconst_m1       
		//  198  789:istore          6
							j1 = -1;
		//  199  791:iconst_m1       
		//  200  792:istore          7
							break;

		//* 201  794:goto            1465
						case 23: // '\027'
							obj1 = ((Object) (Collections.singletonList(((Object) (h)))));
		//  202  797:aload_0         
		//  203  798:getfield        #267 <Field byte[] h>
		//  204  801:invokestatic    #103 <Method List Collections.singletonList(Object)>
		//  205  804:astore          10
							obj = "application/vobsub";
		//  206  806:ldc2            #269 <String "application/vobsub">
		//  207  809:astore          9
							c1 = '\uFFFF';
		//  208  811:iconst_m1       
		//  209  812:istore          6
							j1 = -1;
		//  210  814:iconst_m1       
		//  211  815:istore          7
							break;

		//* 212  817:goto            1465
						case 22: // '\026'
							obj = "application/x-subrip";
		//  213  820:ldc2            #271 <String "application/x-subrip">
		//  214  823:astore          9
							c1 = '\uFFFF';
		//  215  825:iconst_m1       
		//  216  826:istore          6
							j1 = -1;
		//  217  828:iconst_m1       
		//  218  829:istore          7
							break;

		//* 219  831:goto            1465
						case 21: // '\025'
							j1 = com.google.ads.interactivemedia.v3.a.f.q.a(q);
		//  220  834:aload_0         
		//  221  835:getfield        #57  <Field int q>
		//  222  838:invokestatic    #276 <Method int q.a(int)>
		//  223  841:istore          7
							if(j1 != 0)
		//* 224  843:iload           7
		//* 225  845:ifeq            859
							{
								obj = "audio/raw";
		//  226  848:ldc2            #278 <String "audio/raw">
		//  227  851:astore          9
								c1 = '\uFFFF';
		//  228  853:iconst_m1       
		//  229  854:istore          6
							} else
		//* 230  856:goto            1465
							{
								i1 = q;
		//  231  859:aload_0         
		//  232  860:getfield        #57  <Field int q>
		//  233  863:istore_2        
								g1 = ((g) (new StringBuilder(38)));
		//  234  864:new             #110 <Class StringBuilder>
		//  235  867:dup             
		//  236  868:bipush          38
		//  237  870:invokespecial   #112 <Method void StringBuilder(int)>
		//  238  873:astore_1        
								((StringBuilder) (g1)).append("Unsupported PCM bit depth: ");
		//  239  874:aload_1         
		//  240  875:ldc2            #280 <String "Unsupported PCM bit depth: ">
		//  241  878:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
		//  242  881:pop             
								((StringBuilder) (g1)).append(i1);
		//  243  882:aload_1         
		//  244  883:iload_2         
		//  245  884:invokevirtual   #283 <Method StringBuilder StringBuilder.append(int)>
		//  246  887:pop             
								throw new r(((StringBuilder) (g1)).toString());
		//  247  888:new             #74  <Class r>
		//  248  891:dup             
		//  249  892:aload_1         
		//  250  893:invokevirtual   #125 <Method String StringBuilder.toString()>
		//  251  896:invokespecial   #108 <Method void r(String)>
		//  252  899:athrow          
							}
							break;

						case 20: // '\024'
							if(d(new m(h)))
		//* 253  900:new             #78  <Class m>
		//* 254  903:dup             
		//* 255  904:aload_0         
		//* 256  905:getfield        #267 <Field byte[] h>
		//* 257  908:invokespecial   #286 <Method void m(byte[])>
		//* 258  911:invokestatic    #288 <Method boolean d(m)>
		//* 259  914:ifeq            983
							{
								j1 = com.google.ads.interactivemedia.v3.a.f.q.a(q);
		//  260  917:aload_0         
		//  261  918:getfield        #57  <Field int q>
		//  262  921:invokestatic    #276 <Method int q.a(int)>
		//  263  924:istore          7
								if(j1 != 0)
		//* 264  926:iload           7
		//* 265  928:ifeq            942
								{
									obj = "audio/raw";
		//  266  931:ldc2            #278 <String "audio/raw">
		//  267  934:astore          9
									c1 = '\uFFFF';
		//  268  936:iconst_m1       
		//  269  937:istore          6
								} else
		//* 270  939:goto            1465
								{
									i1 = q;
		//  271  942:aload_0         
		//  272  943:getfield        #57  <Field int q>
		//  273  946:istore_2        
									g1 = ((g) (new StringBuilder(38)));
		//  274  947:new             #110 <Class StringBuilder>
		//  275  950:dup             
		//  276  951:bipush          38
		//  277  953:invokespecial   #112 <Method void StringBuilder(int)>
		//  278  956:astore_1        
									((StringBuilder) (g1)).append("Unsupported PCM bit depth: ");
		//  279  957:aload_1         
		//  280  958:ldc2            #280 <String "Unsupported PCM bit depth: ">
		//  281  961:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
		//  282  964:pop             
									((StringBuilder) (g1)).append(i1);
		//  283  965:aload_1         
		//  284  966:iload_2         
		//  285  967:invokevirtual   #283 <Method StringBuilder StringBuilder.append(int)>
		//  286  970:pop             
									throw new r(((StringBuilder) (g1)).toString());
		//  287  971:new             #74  <Class r>
		//  288  974:dup             
		//  289  975:aload_1         
		//  290  976:invokevirtual   #125 <Method String StringBuilder.toString()>
		//  291  979:invokespecial   #108 <Method void r(String)>
		//  292  982:athrow          
								}
							} else
							{
								throw new r("Non-PCM MS/ACM is unsupported");
		//  293  983:new             #74  <Class r>
		//  294  986:dup             
		//  295  987:ldc2            #290 <String "Non-PCM MS/ACM is unsupported">
		//  296  990:invokespecial   #108 <Method void r(String)>
		//  297  993:athrow          
							}
							break;

						case 19: // '\023'
							obj1 = ((Object) (Collections.singletonList(((Object) (h)))));
		//  298  994:aload_0         
		//  299  995:getfield        #267 <Field byte[] h>
		//  300  998:invokestatic    #103 <Method List Collections.singletonList(Object)>
		//  301 1001:astore          10
							obj = "audio/x-flac";
		//  302 1003:ldc2            #292 <String "audio/x-flac">
		//  303 1006:astore          9
							c1 = '\uFFFF';
		//  304 1008:iconst_m1       
		//  305 1009:istore          6
							j1 = -1;
		//  306 1011:iconst_m1       
		//  307 1012:istore          7
							break;

		//* 308 1014:goto            1465
						case 18: // '\022'
							obj = "audio/vnd.dts.hd";
		//  309 1017:ldc2            #294 <String "audio/vnd.dts.hd">
		//  310 1020:astore          9
							c1 = '\uFFFF';
		//  311 1022:iconst_m1       
		//  312 1023:istore          6
							j1 = -1;
		//  313 1025:iconst_m1       
		//  314 1026:istore          7
							break;

		//* 315 1028:goto            1465
						case 16: // '\020'
						case 17: // '\021'
							obj = "audio/vnd.dts";
		//  316 1031:ldc2            #296 <String "audio/vnd.dts">
		//  317 1034:astore          9
							c1 = '\uFFFF';
		//  318 1036:iconst_m1       
		//  319 1037:istore          6
							j1 = -1;
		//  320 1039:iconst_m1       
		//  321 1040:istore          7
							break;

		//* 322 1042:goto            1465
						case 15: // '\017'
							obj = "audio/true-hd";
		//  323 1045:ldc2            #298 <String "audio/true-hd">
		//  324 1048:astore          9
							c1 = '\uFFFF';
		//  325 1050:iconst_m1       
		//  326 1051:istore          6
							j1 = -1;
		//  327 1053:iconst_m1       
		//  328 1054:istore          7
							break;

		//* 329 1056:goto            1465
						case 14: // '\016'
							obj = "audio/eac3";
		//  330 1059:ldc2            #300 <String "audio/eac3">
		//  331 1062:astore          9
							c1 = '\uFFFF';
		//  332 1064:iconst_m1       
		//  333 1065:istore          6
							j1 = -1;
		//  334 1067:iconst_m1       
		//  335 1068:istore          7
							break;

		//* 336 1070:goto            1465
						case 13: // '\r'
							obj = "audio/ac3";
		//  337 1073:ldc2            #302 <String "audio/ac3">
		//  338 1076:astore          9
							c1 = '\uFFFF';
		//  339 1078:iconst_m1       
		//  340 1079:istore          6
							j1 = -1;
		//  341 1081:iconst_m1       
		//  342 1082:istore          7
							break;

		//* 343 1084:goto            1465
						case 12: // '\f'
							obj = "audio/mpeg";
		//  344 1087:ldc2            #304 <String "audio/mpeg">
		//  345 1090:astore          9
							c1 = '\u1000';
		//  346 1092:sipush          4096
		//  347 1095:istore          6
							j1 = -1;
		//  348 1097:iconst_m1       
		//  349 1098:istore          7
							break;

		//* 350 1100:goto            1465
						case 11: // '\013'
							obj1 = ((Object) (Collections.singletonList(((Object) (h)))));
		//  351 1103:aload_0         
		//  352 1104:getfield        #267 <Field byte[] h>
		//  353 1107:invokestatic    #103 <Method List Collections.singletonList(Object)>
		//  354 1110:astore          10
							obj = "audio/mp4a-latm";
		//  355 1112:ldc2            #306 <String "audio/mp4a-latm">
		//  356 1115:astore          9
							c1 = '\uFFFF';
		//  357 1117:iconst_m1       
		//  358 1118:istore          6
							j1 = -1;
		//  359 1120:iconst_m1       
		//  360 1121:istore          7
							break;

		//* 361 1123:goto            1465
						case 10: // '\n'
							obj1 = ((Object) (new ArrayList(3)));
		//  362 1126:new             #139 <Class ArrayList>
		//  363 1129:dup             
		//  364 1130:iconst_3        
		//  365 1131:invokespecial   #140 <Method void ArrayList(int)>
		//  366 1134:astore          10
							((List) (obj1)).add(((Object) (h)));
		//  367 1136:aload           10
		//  368 1138:aload_0         
		//  369 1139:getfield        #267 <Field byte[] h>
		//  370 1142:invokeinterface #146 <Method boolean List.add(Object)>
		//  371 1147:pop             
							((List) (obj1)).add(((Object) (ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(s).array())));
		//  372 1148:aload           10
		//  373 1150:bipush          8
		//  374 1152:invokestatic    #312 <Method ByteBuffer ByteBuffer.allocate(int)>
		//  375 1155:invokestatic    #318 <Method ByteOrder ByteOrder.nativeOrder()>
		//  376 1158:invokevirtual   #322 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
		//  377 1161:aload_0         
		//  378 1162:getfield        #61  <Field long s>
		//  379 1165:invokevirtual   #326 <Method ByteBuffer ByteBuffer.putLong(long)>
		//  380 1168:invokevirtual   #330 <Method byte[] ByteBuffer.array()>
		//  381 1171:invokeinterface #146 <Method boolean List.add(Object)>
		//  382 1176:pop             
							((List) (obj1)).add(((Object) (ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(t).array())));
		//  383 1177:aload           10
		//  384 1179:bipush          8
		//  385 1181:invokestatic    #312 <Method ByteBuffer ByteBuffer.allocate(int)>
		//  386 1184:invokestatic    #318 <Method ByteOrder ByteOrder.nativeOrder()>
		//  387 1187:invokevirtual   #322 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
		//  388 1190:aload_0         
		//  389 1191:getfield        #63  <Field long t>
		//  390 1194:invokevirtual   #326 <Method ByteBuffer ByteBuffer.putLong(long)>
		//  391 1197:invokevirtual   #330 <Method byte[] ByteBuffer.array()>
		//  392 1200:invokeinterface #146 <Method boolean List.add(Object)>
		//  393 1205:pop             
							obj = "audio/opus";
		//  394 1206:ldc2            #332 <String "audio/opus">
		//  395 1209:astore          9
							c1 = '\u1680';
		//  396 1211:sipush          5760
		//  397 1214:istore          6
							j1 = -1;
		//  398 1216:iconst_m1       
		//  399 1217:istore          7
							break;

		//* 400 1219:goto            1465
						case 9: // '\t'
							obj1 = ((Object) (a(h)));
		//  401 1222:aload_0         
		//  402 1223:getfield        #267 <Field byte[] h>
		//  403 1226:invokestatic    #334 <Method List a(byte[])>
		//  404 1229:astore          10
							obj = "audio/vorbis";
		//  405 1231:ldc2            #336 <String "audio/vorbis">
		//  406 1234:astore          9
							c1 = '\u2000';
		//  407 1236:sipush          8192
		//  408 1239:istore          6
							j1 = -1;
		//  409 1241:iconst_m1       
		//  410 1242:istore          7
							break;

		//* 411 1244:goto            1465
						case 8: // '\b'
							obj1 = ((Object) (a(new m(h))));
		//  412 1247:new             #78  <Class m>
		//  413 1250:dup             
		//  414 1251:aload_0         
		//  415 1252:getfield        #267 <Field byte[] h>
		//  416 1255:invokespecial   #286 <Method void m(byte[])>
		//  417 1258:invokestatic    #338 <Method List a(m)>
		//  418 1261:astore          10
							obj = "video/wvc1";
		//  419 1263:ldc2            #340 <String "video/wvc1">
		//  420 1266:astore          9
							c1 = '\uFFFF';
		//  421 1268:iconst_m1       
		//  422 1269:istore          6
							j1 = -1;
		//  423 1271:iconst_m1       
		//  424 1272:istore          7
							break;

		//* 425 1274:goto            1465
						case 7: // '\007'
							obj = ((Object) (c(new m(h))));
		//  426 1277:new             #78  <Class m>
		//  427 1280:dup             
		//  428 1281:aload_0         
		//  429 1282:getfield        #267 <Field byte[] h>
		//  430 1285:invokespecial   #286 <Method void m(byte[])>
		//  431 1288:invokestatic    #342 <Method Pair c(m)>
		//  432 1291:astore          9
							obj1 = ((Object) ((List)((Pair) (obj)).first));
		//  433 1293:aload           9
		//  434 1295:getfield        #346 <Field Object Pair.first>
		//  435 1298:checkcast       #142 <Class List>
		//  436 1301:astore          10
							v = ((Integer)((Pair) (obj)).second).intValue();
		//  437 1303:aload_0         
		//  438 1304:aload           9
		//  439 1306:getfield        #349 <Field Object Pair.second>
		//  440 1309:checkcast       #162 <Class Integer>
		//  441 1312:invokevirtual   #352 <Method int Integer.intValue()>
		//  442 1315:putfield        #354 <Field int v>
							obj = "video/hevc";
		//  443 1318:ldc2            #356 <String "video/hevc">
		//  444 1321:astore          9
							c1 = '\uFFFF';
		//  445 1323:iconst_m1       
		//  446 1324:istore          6
							j1 = -1;
		//  447 1326:iconst_m1       
		//  448 1327:istore          7
							break;

		//* 449 1329:goto            1465
						case 6: // '\006'
							obj = ((Object) (b(new m(h))));
		//  450 1332:new             #78  <Class m>
		//  451 1335:dup             
		//  452 1336:aload_0         
		//  453 1337:getfield        #267 <Field byte[] h>
		//  454 1340:invokespecial   #286 <Method void m(byte[])>
		//  455 1343:invokestatic    #358 <Method Pair b(m)>
		//  456 1346:astore          9
							obj1 = ((Object) ((List)((Pair) (obj)).first));
		//  457 1348:aload           9
		//  458 1350:getfield        #346 <Field Object Pair.first>
		//  459 1353:checkcast       #142 <Class List>
		//  460 1356:astore          10
							v = ((Integer)((Pair) (obj)).second).intValue();
		//  461 1358:aload_0         
		//  462 1359:aload           9
		//  463 1361:getfield        #349 <Field Object Pair.second>
		//  464 1364:checkcast       #162 <Class Integer>
		//  465 1367:invokevirtual   #352 <Method int Integer.intValue()>
		//  466 1370:putfield        #354 <Field int v>
							obj = "video/avc";
		//  467 1373:ldc2            #360 <String "video/avc">
		//  468 1376:astore          9
							c1 = '\uFFFF';
		//  469 1378:iconst_m1       
		//  470 1379:istore          6
							j1 = -1;
		//  471 1381:iconst_m1       
		//  472 1382:istore          7
							break;

		//* 473 1384:goto            1465
						case 3: // '\003'
						case 4: // '\004'
						case 5: // '\005'
							obj1 = ((Object) (h));
		//  474 1387:aload_0         
		//  475 1388:getfield        #267 <Field byte[] h>
		//  476 1391:astore          10
							if(obj1 == null)
		//* 477 1393:aload           10
		//* 478 1395:ifnonnull       1405
								obj1 = obj;
		//  479 1398:aload           9
		//  480 1400:astore          10
							else
		//* 481 1402:goto            1412
								obj1 = ((Object) (Collections.singletonList(obj1)));
		//  482 1405:aload           10
		//  483 1407:invokestatic    #103 <Method List Collections.singletonList(Object)>
		//  484 1410:astore          10
							obj = "video/mp4v-es";
		//  485 1412:ldc2            #362 <String "video/mp4v-es">
		//  486 1415:astore          9
							c1 = '\uFFFF';
		//  487 1417:iconst_m1       
		//  488 1418:istore          6
							j1 = -1;
		//  489 1420:iconst_m1       
		//  490 1421:istore          7
							break;

		//* 491 1423:goto            1465
						case 2: // '\002'
							obj = "video/mpeg2";
		//  492 1426:ldc2            #364 <String "video/mpeg2">
		//  493 1429:astore          9
							c1 = '\uFFFF';
		//  494 1431:iconst_m1       
		//  495 1432:istore          6
							j1 = -1;
		//  496 1434:iconst_m1       
		//  497 1435:istore          7
							break;

		//* 498 1437:goto            1465
						case 1: // '\001'
							obj = "video/x-vnd.on2.vp9";
		//  499 1440:ldc2            #366 <String "video/x-vnd.on2.vp9">
		//  500 1443:astore          9
							c1 = '\uFFFF';
		//  501 1445:iconst_m1       
		//  502 1446:istore          6
							j1 = -1;
		//  503 1448:iconst_m1       
		//  504 1449:istore          7
							break;

		//* 505 1451:goto            1465
						case 0: // '\0'
							obj = "video/x-vnd.on2.vp8";
		//  506 1454:ldc2            #368 <String "video/x-vnd.on2.vp8">
		//  507 1457:astore          9
							c1 = '\uFFFF';
		//  508 1459:iconst_m1       
		//  509 1460:istore          6
							j1 = -1;
		//  510 1462:iconst_m1       
		//  511 1463:istore          7
							break;
						}
						if(com.google.ads.interactivemedia.v3.a.f.i.a(((String) (obj))))
		//* 512 1465:aload           9
		//* 513 1467:invokestatic    #373 <Method boolean i.a(String)>
		//* 514 1470:ifeq            1507
						{
							obj = ((Object) (com.google.ads.interactivemedia.v3.a.p.a(Integer.toString(i1), ((String) (obj)), -1, ((int) (c1)), l1, p, r, ((List) (obj1)), w, j1)));
		//  515 1473:iload_2         
		//  516 1474:invokestatic    #376 <Method String Integer.toString(int)>
		//  517 1477:aload           9
		//  518 1479:iconst_m1       
		//  519 1480:iload           6
		//  520 1482:lload_3         
		//  521 1483:aload_0         
		//  522 1484:getfield        #55  <Field int p>
		//  523 1487:aload_0         
		//  524 1488:getfield        #59  <Field int r>
		//  525 1491:aload           10
		//  526 1493:aload_0         
		//  527 1494:getfield        #67  <Field String w>
		//  528 1497:iload           7
		//  529 1499:invokestatic    #381 <Method p p.a(String, String, int, int, long, int, int, List, String, int)>
		//  530 1502:astore          9
							break label0;
		//  531 1504:goto            1754
						}
						if(!com.google.ads.interactivemedia.v3.a.f.i.b(((String) (obj))))
							break label1;
		//  532 1507:aload           9
		//  533 1509:invokestatic    #383 <Method boolean i.b(String)>
		//  534 1512:ifeq            1668
						if(m == 0)
		//* 535 1515:aload_0         
		//* 536 1516:getfield        #49  <Field int m>
		//* 537 1519:ifne            1578
						{
							int k1 = k;
		//  538 1522:aload_0         
		//  539 1523:getfield        #45  <Field int k>
		//  540 1526:istore          8
							j1 = k1;
		//  541 1528:iload           8
		//  542 1530:istore          7
							if(k1 == -1)
		//* 543 1532:iload           8
		//* 544 1534:iconst_m1       
		//* 545 1535:icmpne          1544
								j1 = i;
		//  546 1538:aload_0         
		//  547 1539:getfield        #41  <Field int i>
		//  548 1542:istore          7
							k = j1;
		//  549 1544:aload_0         
		//  550 1545:iload           7
		//  551 1547:putfield        #45  <Field int k>
							k1 = l;
		//  552 1550:aload_0         
		//  553 1551:getfield        #47  <Field int l>
		//  554 1554:istore          8
							j1 = k1;
		//  555 1556:iload           8
		//  556 1558:istore          7
							if(k1 == -1)
		//* 557 1560:iload           8
		//* 558 1562:iconst_m1       
		//* 559 1563:icmpne          1572
								j1 = j;
		//  560 1566:aload_0         
		//  561 1567:getfield        #43  <Field int j>
		//  562 1570:istore          7
							l = j1;
		//  563 1572:aload_0         
		//  564 1573:iload           7
		//  565 1575:putfield        #47  <Field int l>
						}
						j1 = k;
		//  566 1578:aload_0         
		//  567 1579:getfield        #45  <Field int k>
		//  568 1582:istore          7
						if(j1 != -1)
		//* 569 1584:iload           7
		//* 570 1586:iconst_m1       
		//* 571 1587:icmpeq          1624
						{
							int i2 = l;
		//  572 1590:aload_0         
		//  573 1591:getfield        #47  <Field int l>
		//  574 1594:istore          8
							if(i2 != -1)
		//* 575 1596:iload           8
		//* 576 1598:iconst_m1       
		//* 577 1599:icmpeq          1624
							{
								f1 = (float)(j * j1) / (float)(i * i2);
		//  578 1602:aload_0         
		//  579 1603:getfield        #43  <Field int j>
		//  580 1606:iload           7
		//  581 1608:imul            
		//  582 1609:i2f             
		//  583 1610:aload_0         
		//  584 1611:getfield        #41  <Field int i>
		//  585 1614:iload           8
		//  586 1616:imul            
		//  587 1617:i2f             
		//  588 1618:fdiv            
		//  589 1619:fstore          5
								break label2;
		//  590 1621:goto            1629
							}
						}
						f1 = -1F;
		//  591 1624:ldc2            #384 <Float -1F>
		//  592 1627:fstore          5
					}
					obj = ((Object) (com.google.ads.interactivemedia.v3.a.p.a(Integer.toString(i1), ((String) (obj)), -1, ((int) (c1)), l1, i, j, ((List) (obj1)), -1, f1, n, o)));
		//  593 1629:iload_2         
		//  594 1630:invokestatic    #376 <Method String Integer.toString(int)>
		//  595 1633:aload           9
		//  596 1635:iconst_m1       
		//  597 1636:iload           6
		//  598 1638:lload_3         
		//  599 1639:aload_0         
		//  600 1640:getfield        #41  <Field int i>
		//  601 1643:aload_0         
		//  602 1644:getfield        #43  <Field int j>
		//  603 1647:aload           10
		//  604 1649:iconst_m1       
		//  605 1650:fload           5
		//  606 1652:aload_0         
		//  607 1653:getfield        #51  <Field byte[] n>
		//  608 1656:aload_0         
		//  609 1657:getfield        #53  <Field int o>
		//  610 1660:invokestatic    #387 <Method p p.a(String, String, int, int, long, int, int, List, int, float, byte[], int)>
		//  611 1663:astore          9
					break label0;
		//  612 1665:goto            1754
				}
				if("application/x-subrip".equals(obj))
		//* 613 1668:ldc2            #271 <String "application/x-subrip">
		//* 614 1671:aload           9
		//* 615 1673:invokevirtual   #213 <Method boolean String.equals(Object)>
		//* 616 1676:ifeq            1699
				{
					obj = ((Object) (com.google.ads.interactivemedia.v3.a.p.a(Integer.toString(i1), ((String) (obj)), -1, l1, w)));
		//  617 1679:iload_2         
		//  618 1680:invokestatic    #376 <Method String Integer.toString(int)>
		//  619 1683:aload           9
		//  620 1685:iconst_m1       
		//  621 1686:lload_3         
		//  622 1687:aload_0         
		//  623 1688:getfield        #67  <Field String w>
		//  624 1691:invokestatic    #390 <Method p p.a(String, String, int, long, String)>
		//  625 1694:astore          9
				} else
		//* 626 1696:goto            1754
				{
					if(!"application/vobsub".equals(obj) && !"application/pgs".equals(obj))
		//* 627 1699:ldc2            #269 <String "application/vobsub">
		//* 628 1702:aload           9
		//* 629 1704:invokevirtual   #213 <Method boolean String.equals(Object)>
		//* 630 1707:ifne            1735
		//* 631 1710:ldc2            #265 <String "application/pgs">
		//* 632 1713:aload           9
		//* 633 1715:invokevirtual   #213 <Method boolean String.equals(Object)>
		//* 634 1718:ifeq            1724
		//* 635 1721:goto            1735
						throw new r("Unexpected MIME type.");
		//  636 1724:new             #74  <Class r>
		//  637 1727:dup             
		//  638 1728:ldc2            #392 <String "Unexpected MIME type.">
		//  639 1731:invokespecial   #108 <Method void r(String)>
		//  640 1734:athrow          
					obj = ((Object) (com.google.ads.interactivemedia.v3.a.p.a(Integer.toString(i1), ((String) (obj)), -1, l1, ((List) (obj1)), w)));
		//  641 1735:iload_2         
		//  642 1736:invokestatic    #376 <Method String Integer.toString(int)>
		//  643 1739:aload           9
		//  644 1741:iconst_m1       
		//  645 1742:lload_3         
		//  646 1743:aload           10
		//  647 1745:aload_0         
		//  648 1746:getfield        #67  <Field String w>
		//  649 1749:invokestatic    #395 <Method p p.a(String, String, int, long, List, String)>
		//  650 1752:astore          9
				}
			}
			u = g1.d(b);
		//  651 1754:aload_0         
		//  652 1755:aload_1         
		//  653 1756:aload_0         
		//  654 1757:getfield        #397 <Field int b>
		//  655 1760:invokeinterface #402 <Method com.google.ads.interactivemedia.v3.a.c.m g.d(int)>
		//  656 1765:putfield        #404 <Field com.google.ads.interactivemedia.v3.a.c.m u>
			u.a(((p) (obj)));
		//  657 1768:aload_0         
		//  658 1769:getfield        #404 <Field com.google.ads.interactivemedia.v3.a.c.m u>
		//  659 1772:aload           9
		//  660 1774:invokeinterface #409 <Method void com.google.ads.interactivemedia.v3.a.c.m.a(p)>
		//  661 1779:return          
		}

		public String a;
		public int b;
		public int c;
		public int d;
		public boolean e;
		public byte f[];
		public byte g[];
		public byte h[];
		public int i;
		public int j;
		public int k;
		public int l;
		public int m;
		public byte n[];
		public int o;
		public int p;
		public int q;
		public int r;
		public long s;
		public long t;
		public com.google.ads.interactivemedia.v3.a.c.m u;
		public int v;
		private String w;

		private b()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #39  <Method void Object()>
			i = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #41  <Field int i>
			j = -1;
		//    5    9:aload_0         
		//    6   10:iconst_m1       
		//    7   11:putfield        #43  <Field int j>
			k = -1;
		//    8   14:aload_0         
		//    9   15:iconst_m1       
		//   10   16:putfield        #45  <Field int k>
			l = -1;
		//   11   19:aload_0         
		//   12   20:iconst_m1       
		//   13   21:putfield        #47  <Field int l>
			m = 0;
		//   14   24:aload_0         
		//   15   25:iconst_0        
		//   16   26:putfield        #49  <Field int m>
			n = null;
		//   17   29:aload_0         
		//   18   30:aconst_null     
		//   19   31:putfield        #51  <Field byte[] n>
			o = -1;
		//   20   34:aload_0         
		//   21   35:iconst_m1       
		//   22   36:putfield        #53  <Field int o>
			p = 1;
		//   23   39:aload_0         
		//   24   40:iconst_1        
		//   25   41:putfield        #55  <Field int p>
			q = -1;
		//   26   44:aload_0         
		//   27   45:iconst_m1       
		//   28   46:putfield        #57  <Field int q>
			r = 8000;
		//   29   49:aload_0         
		//   30   50:sipush          8000
		//   31   53:putfield        #59  <Field int r>
			s = 0L;
		//   32   56:aload_0         
		//   33   57:lconst_0        
		//   34   58:putfield        #61  <Field long s>
			t = 0L;
		//   35   61:aload_0         
		//   36   62:lconst_0        
		//   37   63:putfield        #63  <Field long t>
			w = "eng";
		//   38   66:aload_0         
		//   39   67:ldc1            #65  <String "eng">
		//   40   69:putfield        #67  <Field String w>
		//   41   72:return          
		}

		b(_cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #70  <Method void f$b()>
		//    2    4:return          
		}
	}


	protected f(Context context, com.google.a.a.i i, j j, boolean flag)
	{
		super(context, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #32  <Method void e(Context, com.google.a.a.i, j)>
		h = flag;
	//    5    7:aload_0         
	//    6    8:iload           4
	//    7   10:putfield        #34  <Field boolean h>
	//    8   13:return          
	}

	public static f a(String s, Context context)
	{
		return a(s, context, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokestatic    #38  <Method f a(String, Context, boolean)>
	//    4    6:areturn         
	}

	public static f a(String s, Context context, boolean flag)
	{
		com.google.a.a.a a1;
		a1 = new com.google.a.a.a();
	//    0    0:new             #40  <Class a>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void a()>
	//    3    7:astore_3        
		a(s, context, ((com.google.a.a.i) (a1)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_3         
	//    7   11:invokestatic    #45  <Method void a(String, Context, com.google.a.a.i)>
		if(!flag)
			break MISSING_BLOCK_LABEL_57;
	//    8   14:iload_2         
	//    9   15:ifeq            57
		com/google/a/a/f;
	//   10   18:ldc1            #2   <Class f>
		JVM INSTR monitorenter ;
	//   11   20:monitorenter    
		if(e == null)
	//*  12   21:getstatic       #47  <Field AdvertisingIdClient e>
	//*  13   24:ifnonnull       45
			(new Thread(((Runnable) (new b(context))))).start();
	//   14   27:new             #49  <Class Thread>
	//   15   30:dup             
	//   16   31:new             #9   <Class f$b>
	//   17   34:dup             
	//   18   35:aload_1         
	//   19   36:invokespecial   #52  <Method void f$b(Context)>
	//   20   39:invokespecial   #55  <Method void Thread(Runnable)>
	//   21   42:invokevirtual   #58  <Method void Thread.start()>
		com/google/a/a/f;
	//   22   45:ldc1            #2   <Class f>
		JVM INSTR monitorexit ;
	//   23   47:monitorexit     
		break MISSING_BLOCK_LABEL_57;
	//   24   48:goto            57
		s;
	//   25   51:astore_0        
		com/google/a/a/f;
	//   26   52:ldc1            #2   <Class f>
		JVM INSTR monitorexit ;
	//   27   54:monitorexit     
		throw s;
	//   28   55:aload_0         
	//   29   56:athrow          
		return new f(context, ((com.google.a.a.i) (a1)), ((j) (new l(239))), flag);
	//   30   57:new             #2   <Class f>
	//   31   60:dup             
	//   32   61:aload_1         
	//   33   62:aload_3         
	//   34   63:new             #60  <Class l>
	//   35   66:dup             
	//   36   67:sipush          239
	//   37   70:invokespecial   #61  <Method void l(int)>
	//   38   73:iload_2         
	//   39   74:invokespecial   #63  <Method void f(Context, com.google.a.a.i, j, boolean)>
	//   40   77:areturn         
	}

	static AdvertisingIdClient a(AdvertisingIdClient advertisingidclient)
	{
		e = advertisingidclient;
	//    0    0:aload_0         
	//    1    1:putstatic       #47  <Field AdvertisingIdClient e>
		return advertisingidclient;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

	static boolean a(boolean flag)
	{
		g = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #67  <Field boolean g>
		return flag;
	//    2    4:iload_0         
	//    3    5:ireturn         
	}

	static AdvertisingIdClient f()
	{
		return e;
	//    0    0:getstatic       #47  <Field AdvertisingIdClient e>
	//    1    3:areturn         
	}

	static CountDownLatch g()
	{
		return f;
	//    0    0:getstatic       #27  <Field CountDownLatch f>
	//    1    3:areturn         
	}

	protected void b(Context context)
	{
		super.b(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #75  <Method void e.b(Context)>
		long l1;
		if(g || !h)
	//*   3    5:getstatic       #67  <Field boolean g>
	//*   4    8:ifne            74
	//*   5   11:aload_0         
	//*   6   12:getfield        #34  <Field boolean h>
	//*   7   15:ifne            21
			break MISSING_BLOCK_LABEL_74;
	//    8   18:goto            74
		String s;
		try
		{
			context = ((Context) (e()));
	//    9   21:aload_0         
	//   10   22:invokevirtual   #78  <Method f$a e()>
	//   11   25:astore_1        
			s = ((a) (context)).a();
	//   12   26:aload_1         
	//   13   27:invokevirtual   #81  <Method String f$a.a()>
	//   14   30:astore          4
		}
	//*  15   32:aload           4
	//*  16   34:ifnull          84
	//*  17   37:aload_1         
	//*  18   38:invokevirtual   #84  <Method boolean f$a.b()>
	//*  19   41:ifeq            89
	//*  20   44:lconst_1        
	//*  21   45:lstore_2        
	//*  22   46:goto            49
	//*  23   49:aload_0         
	//*  24   50:bipush          28
	//*  25   52:lload_2         
	//*  26   53:invokevirtual   #87  <Method void a(int, long)>
	//*  27   56:aload_0         
	//*  28   57:bipush          26
	//*  29   59:ldc2w           #88  <Long 5L>
	//*  30   62:invokevirtual   #87  <Method void a(int, long)>
	//*  31   65:aload_0         
	//*  32   66:bipush          24
	//*  33   68:aload           4
	//*  34   70:invokevirtual   #92  <Method void a(int, String)>
	//*  35   73:return          
	//*  36   74:aload_0         
	//*  37   75:bipush          24
	//*  38   77:aload_1         
	//*  39   78:invokestatic    #96  <Method String d(Context)>
	//*  40   81:invokevirtual   #92  <Method void a(int, String)>
	//*  41   84:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  42   85:astore_1        
		{
			return;
	//   43   86:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  44   87:astore_1        
		{
			return;
	//   45   88:return          
		}
		if(s == null)
			break MISSING_BLOCK_LABEL_84;
		if(((a) (context)).b())
			l1 = 1L;
		else
			l1 = 0L;
	//   46   89:lconst_0        
	//   47   90:lstore_2        
		a(28, l1);
		a(26, 5L);
		a(24, s);
		return;
		a(24, d(context));
	//*  48   91:goto            49
	}

	a e()
		throws IOException
	{
label0:
		{
			Object obj;
			Exception exception;
			try
			{
				if(f.await(2L, TimeUnit.SECONDS))
					break label0;
	//    0    0:getstatic       #27  <Field CountDownLatch f>
	//    1    3:ldc2w           #99  <Long 2L>
	//    2    6:getstatic       #106 <Field TimeUnit TimeUnit.SECONDS>
	//    3    9:invokevirtual   #110 <Method boolean CountDownLatch.await(long, TimeUnit)>
	//    4   12:ifne            28
				obj = ((Object) (new a(this, ((String) (null)), false)));
	//    5   15:new             #6   <Class f$a>
	//    6   18:dup             
	//    7   19:aload_0         
	//    8   20:aconst_null     
	//    9   21:iconst_0        
	//   10   22:invokespecial   #113 <Method void f$a(f, String, boolean)>
	//   11   25:astore_1        
			}
	//*  12   26:aload_1         
	//*  13   27:areturn         
	//*  14   28:ldc1            #2   <Class f>
	//*  15   30:monitorenter    
	//*  16   31:getstatic       #47  <Field AdvertisingIdClient e>
	//*  17   34:ifnonnull       53
	//*  18   37:new             #6   <Class f$a>
	//*  19   40:dup             
	//*  20   41:aload_0         
	//*  21   42:aconst_null     
	//*  22   43:iconst_0        
	//*  23   44:invokespecial   #113 <Method void f$a(f, String, boolean)>
	//*  24   47:astore_1        
	//*  25   48:ldc1            #2   <Class f>
	//*  26   50:monitorexit     
	//*  27   51:aload_1         
	//*  28   52:areturn         
	//*  29   53:getstatic       #47  <Field AdvertisingIdClient e>
	//*  30   56:invokevirtual   #119 <Method com.google.android.gms.ads.identifier.AdvertisingIdClient$Info AdvertisingIdClient.getInfo()>
	//*  31   59:astore_1        
	//*  32   60:ldc1            #2   <Class f>
	//*  33   62:monitorexit     
	//*  34   63:new             #6   <Class f$a>
	//*  35   66:dup             
	//*  36   67:aload_0         
	//*  37   68:aload_0         
	//*  38   69:aload_1         
	//*  39   70:invokevirtual   #124 <Method String com.google.android.gms.ads.identifier.AdvertisingIdClient$Info.getId()>
	//*  40   73:invokevirtual   #127 <Method String a(String)>
	//*  41   76:aload_1         
	//*  42   77:invokevirtual   #130 <Method boolean com.google.android.gms.ads.identifier.AdvertisingIdClient$Info.isLimitAdTrackingEnabled()>
	//*  43   80:invokespecial   #113 <Method void f$a(f, String, boolean)>
	//*  44   83:areturn         
	//*  45   84:astore_1        
	//*  46   85:ldc1            #2   <Class f>
	//*  47   87:monitorexit     
	//*  48   88:aload_1         
	//*  49   89:athrow          
	//*  50   90:new             #6   <Class f$a>
	//*  51   93:dup             
	//*  52   94:aload_0         
	//*  53   95:aconst_null     
	//*  54   96:iconst_0        
	//*  55   97:invokespecial   #113 <Method void f$a(f, String, boolean)>
	//*  56  100:areturn         
			// Misplaced declaration of an exception variable
			catch(InterruptedException interruptedexception)
			{
				return new a(this, ((String) (null)), false);
			}
			return ((a) (obj));
		}
		com/google/a/a/f;
		JVM INSTR monitorenter ;
		if(e != null)
			break MISSING_BLOCK_LABEL_53;
		obj = ((Object) (new a(this, ((String) (null)), false)));
		com/google/a/a/f;
		JVM INSTR monitorexit ;
		return ((a) (obj));
		obj = ((Object) (e.getInfo()));
		com/google/a/a/f;
		JVM INSTR monitorexit ;
		return new a(this, a(((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) (obj)).getId()), ((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) (obj)).isLimitAdTrackingEnabled());
		exception;
		com/google/a/a/f;
		JVM INSTR monitorexit ;
		InterruptedException interruptedexception;
		throw exception;
	//*  57  101:astore_1        
	//*  58  102:goto            90
	}

	private static AdvertisingIdClient e;
	private static CountDownLatch f = new CountDownLatch(1);
	private static volatile boolean g;
	private boolean h;

	static 
	{
	//    0    0:new             #21  <Class CountDownLatch>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #25  <Method void CountDownLatch(int)>
	//    4    8:putstatic       #27  <Field CountDownLatch f>
	//*   5   11:return          
	}
}
