// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bnw, bei, beh, bep, 
//			bew, bdv, beu, bdk, 
//			bnf, beo, bem, bdw, 
//			bej, bcr, bdu, bel, 
//			bek, bdt, beq, beg

public final class bef
{

	public bef(bdu bdu1, bdv abdv[], bel bel1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #87  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #89  <Field bdu c>
		g = bel1;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #91  <Field bel g>
	//    8   14:aload_0         
	//    9   15:new             #93  <Class ConditionVariable>
	//   10   18:dup             
	//   11   19:iconst_1        
	//   12   20:invokespecial   #96  <Method void ConditionVariable(boolean)>
	//   13   23:putfield        #98  <Field ConditionVariable h>
		if(bnw.a >= 18)
	//*  14   26:getstatic       #102 <Field int bnw.a>
	//*  15   29:bipush          18
	//*  16   31:icmplt          49
			try
			{
				G = ((Class) (android/media/AudioTrack)).getMethod("getLatency", ((Class []) (null)));
	//   17   34:aload_0         
	//   18   35:ldc1            #104 <Class AudioTrack>
	//   19   37:ldc1            #106 <String "getLatency">
	//   20   39:aconst_null     
	//   21   40:invokevirtual   #112 <Method Method Class.getMethod(String, Class[])>
	//   22   43:putfield        #114 <Field Method G>
			}
	//*  23   46:goto            49
	//*  24   49:getstatic       #102 <Field int bnw.a>
	//*  25   52:bipush          19
	//*  26   54:icmplt          71
	//*  27   57:aload_0         
	//*  28   58:new             #116 <Class bei>
	//*  29   61:dup             
	//*  30   62:invokespecial   #117 <Method void bei()>
	//*  31   65:putfield        #119 <Field beh j>
	//*  32   68:goto            83
	//*  33   71:aload_0         
	//*  34   72:new             #121 <Class beh>
	//*  35   75:dup             
	//*  36   76:aconst_null     
	//*  37   77:invokespecial   #124 <Method void beh(beg)>
	//*  38   80:putfield        #119 <Field beh j>
	//*  39   83:aload_0         
	//*  40   84:new             #126 <Class bep>
	//*  41   87:dup             
	//*  42   88:invokespecial   #127 <Method void bep()>
	//*  43   91:putfield        #129 <Field bep d>
	//*  44   94:aload_0         
	//*  45   95:new             #131 <Class bew>
	//*  46   98:dup             
	//*  47   99:invokespecial   #132 <Method void bew()>
	//*  48  102:putfield        #134 <Field bew e>
	//*  49  105:aload_0         
	//*  50  106:aload_2         
	//*  51  107:arraylength     
	//*  52  108:iconst_3        
	//*  53  109:iadd            
	//*  54  110:anewarray       bdv[]
	//*  55  113:putfield        #138 <Field bdv[] f>
	//*  56  116:aload_0         
	//*  57  117:getfield        #138 <Field bdv[] f>
	//*  58  120:iconst_0        
	//*  59  121:new             #140 <Class beu>
	//*  60  124:dup             
	//*  61  125:invokespecial   #141 <Method void beu()>
	//*  62  128:aastore         
	//*  63  129:aload_0         
	//*  64  130:getfield        #138 <Field bdv[] f>
	//*  65  133:astore_1        
	//*  66  134:aload_1         
	//*  67  135:iconst_1        
	//*  68  136:aload_0         
	//*  69  137:getfield        #129 <Field bep d>
	//*  70  140:aastore         
	//*  71  141:aload_2         
	//*  72  142:iconst_0        
	//*  73  143:aload_1         
	//*  74  144:iconst_2        
	//*  75  145:aload_2         
	//*  76  146:arraylength     
	//*  77  147:invokestatic    #147 <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  78  150:aload_0         
	//*  79  151:getfield        #138 <Field bdv[] f>
	//*  80  154:aload_2         
	//*  81  155:arraylength     
	//*  82  156:iconst_2        
	//*  83  157:iadd            
	//*  84  158:aload_0         
	//*  85  159:getfield        #134 <Field bew e>
	//*  86  162:aastore         
	//*  87  163:aload_0         
	//*  88  164:bipush          10
	//*  89  166:newarray        long[]
	//*  90  168:putfield        #149 <Field long[] i>
	//*  91  171:aload_0         
	//*  92  172:fconst_1        
	//*  93  173:putfield        #151 <Field float S>
	//*  94  176:aload_0         
	//*  95  177:iconst_0        
	//*  96  178:putfield        #153 <Field int O>
	//*  97  181:aload_0         
	//*  98  182:iconst_3        
	//*  99  183:putfield        #155 <Field int q>
	//* 100  186:aload_0         
	//* 101  187:iconst_0        
	//* 102  188:putfield        #157 <Field int ac>
	//* 103  191:aload_0         
	//* 104  192:getstatic       #161 <Field bdk bdk.a>
	//* 105  195:putfield        #163 <Field bdk v>
	//* 106  198:aload_0         
	//* 107  199:iconst_m1       
	//* 108  200:putfield        #165 <Field int Z>
	//* 109  203:aload_0         
	//* 110  204:iconst_0        
	//* 111  205:anewarray       bdv[]
	//* 112  208:putfield        #167 <Field bdv[] T>
	//* 113  211:aload_0         
	//* 114  212:iconst_0        
	//* 115  213:anewarray       ByteBuffer[]
	//* 116  216:putfield        #171 <Field ByteBuffer[] U>
	//* 117  219:aload_0         
	//* 118  220:new             #173 <Class LinkedList>
	//* 119  223:dup             
	//* 120  224:invokespecial   #174 <Method void LinkedList()>
	//* 121  227:putfield        #176 <Field LinkedList k>
	//* 122  230:return          
			// Misplaced declaration of an exception variable
			catch(bdu bdu1) { }
	//  123  231:astore_1        
		if(bnw.a >= 19)
			j = ((beh) (new bei()));
		else
			j = new beh(((beg) (null)));
		f = new bdv[abdv.length + 3];
		f[0] = ((bdv) (new beu()));
		bdu1 = ((bdu) (f));
		bdu1[1] = ((/*<invalid signature>*/java.lang.Object) (d));
		System.arraycopy(((Object) (abdv)), 0, ((Object) (bdu1)), 2, abdv.length);
		f[abdv.length + 2] = ((bdv) (e));
		S = 1.0F;
		O = 0;
		q = 3;
		ac = 0;
		v = bdk.a;
		Z = -1;
		T = new bdv[0];
		U = new ByteBuffer[0];
	//* 124  232:goto            49
	}

	static ConditionVariable a(bef bef1)
	{
		return bef1.h;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field ConditionVariable h>
	//    2    4:areturn         
	}

	private final void a(long l1)
	{
		int j1 = T.length;
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field bdv[] T>
	//    2    4:arraylength     
	//    3    5:istore          4
		int i1 = j1;
	//    4    7:iload           4
	//    5    9:istore_3        
		do
		{
			if(i1 < 0)
				break;
	//    6   10:iload_3         
	//    7   11:iflt            132
			ByteBuffer bytebuffer;
			if(i1 > 0)
	//*   8   14:iload_3         
	//*   9   15:ifle            31
			{
				bytebuffer = U[i1 - 1];
	//   10   18:aload_0         
	//   11   19:getfield        #171 <Field ByteBuffer[] U>
	//   12   22:iload_3         
	//   13   23:iconst_1        
	//   14   24:isub            
	//   15   25:aaload          
	//   16   26:astore          5
			} else
	//*  17   28:goto            50
			{
				bytebuffer = V;
	//   18   31:aload_0         
	//   19   32:getfield        #180 <Field ByteBuffer V>
	//   20   35:astore          5
				if(bytebuffer == null)
	//*  21   37:aload           5
	//*  22   39:ifnull          45
	//*  23   42:goto            50
					bytebuffer = bdv.a;
	//   24   45:getstatic       #182 <Field ByteBuffer bdv.a>
	//   25   48:astore          5
			}
			if(i1 == j1)
	//*  26   50:iload_3         
	//*  27   51:iload           4
	//*  28   53:icmpne          67
			{
				b(bytebuffer, l1);
	//   29   56:aload_0         
	//   30   57:aload           5
	//   31   59:lload_1         
	//   32   60:invokespecial   #185 <Method boolean b(ByteBuffer, long)>
	//   33   63:pop             
			} else
	//*  34   64:goto            116
			{
				Object obj = ((Object) (T[i1]));
	//   35   67:aload_0         
	//   36   68:getfield        #167 <Field bdv[] T>
	//   37   71:iload_3         
	//   38   72:aaload          
	//   39   73:astore          6
				((bdv) (obj)).a(bytebuffer);
	//   40   75:aload           6
	//   41   77:aload           5
	//   42   79:invokeinterface #188 <Method void bdv.a(ByteBuffer)>
				obj = ((Object) (((bdv) (obj)).e()));
	//   43   84:aload           6
	//   44   86:invokeinterface #191 <Method ByteBuffer bdv.e()>
	//   45   91:astore          6
				U[i1] = ((ByteBuffer) (obj));
	//   46   93:aload_0         
	//   47   94:getfield        #171 <Field ByteBuffer[] U>
	//   48   97:iload_3         
	//   49   98:aload           6
	//   50  100:aastore         
				if(((ByteBuffer) (obj)).hasRemaining())
	//*  51  101:aload           6
	//*  52  103:invokevirtual   #195 <Method boolean ByteBuffer.hasRemaining()>
	//*  53  106:ifeq            116
				{
					i1++;
	//   54  109:iload_3         
	//   55  110:iconst_1        
	//   56  111:iadd            
	//   57  112:istore_3        
					continue;
	//   58  113:goto            10
				}
			}
			if(bytebuffer.hasRemaining())
	//*  59  116:aload           5
	//*  60  118:invokevirtual   #195 <Method boolean ByteBuffer.hasRemaining()>
	//*  61  121:ifeq            125
				return;
	//   62  124:return          
			i1--;
	//   63  125:iload_3         
	//   64  126:iconst_1        
	//   65  127:isub            
	//   66  128:istore_3        
		} while(true);
	//   67  129:goto            10
	//   68  132:return          
	}

	private static int b(String s1)
	{
		int i1;
label0:
		{
			i1 = s1.hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #202 <Method int String.hashCode()>
	//    2    4:istore_1        
			if(i1 != 0xbebaa468)
	//*   3    5:iload_1         
	//*   4    6:ldc1            #203 <Int 0xbebaa468>
	//*   5    8:icmpeq          74
			{
				if(i1 != 0xb269698)
	//*   6   11:iload_1         
	//*   7   12:ldc1            #204 <Int 0xb269698>
	//*   8   14:icmpeq          60
				{
					if(i1 != 0x59ae0c65)
	//*   9   17:iload_1         
	//*  10   18:ldc1            #205 <Int 0x59ae0c65>
	//*  11   20:icmpeq          46
					{
						if(i1 == 0x59c2dc42 && s1.equals("audio/vnd.dts.hd"))
	//*  12   23:iload_1         
	//*  13   24:ldc1            #206 <Int 0x59c2dc42>
	//*  14   26:icmpeq          32
	//*  15   29:goto            88
	//*  16   32:aload_0         
	//*  17   33:ldc1            #208 <String "audio/vnd.dts.hd">
	//*  18   35:invokevirtual   #212 <Method boolean String.equals(Object)>
	//*  19   38:ifeq            88
						{
							i1 = 3;
	//   20   41:iconst_3        
	//   21   42:istore_1        
							break label0;
	//   22   43:goto            90
						}
					} else
					if(s1.equals("audio/eac3"))
	//*  23   46:aload_0         
	//*  24   47:ldc1            #214 <String "audio/eac3">
	//*  25   49:invokevirtual   #212 <Method boolean String.equals(Object)>
	//*  26   52:ifeq            88
					{
						i1 = 1;
	//   27   55:iconst_1        
	//   28   56:istore_1        
						break label0;
	//   29   57:goto            90
					}
				} else
				if(s1.equals("audio/ac3"))
	//*  30   60:aload_0         
	//*  31   61:ldc1            #216 <String "audio/ac3">
	//*  32   63:invokevirtual   #212 <Method boolean String.equals(Object)>
	//*  33   66:ifeq            88
				{
					i1 = 0;
	//   34   69:iconst_0        
	//   35   70:istore_1        
					break label0;
	//   36   71:goto            90
				}
			} else
			if(s1.equals("audio/vnd.dts"))
	//*  37   74:aload_0         
	//*  38   75:ldc1            #218 <String "audio/vnd.dts">
	//*  39   77:invokevirtual   #212 <Method boolean String.equals(Object)>
	//*  40   80:ifeq            88
			{
				i1 = 2;
	//   41   83:iconst_2        
	//   42   84:istore_1        
				break label0;
	//   43   85:goto            90
			}
			i1 = -1;
	//   44   88:iconst_m1       
	//   45   89:istore_1        
		}
		switch(i1)
	//*  46   90:iload_1         
		{
	//*  47   91:tableswitch     0 3: default 120
	//	               0 131
	//	               1 128
	//	               2 125
	//	               3 122
		default:
			return 0;
	//   48  120:iconst_0        
	//   49  121:ireturn         

		case 3: // '\003'
			return 8;
	//   50  122:bipush          8
	//   51  124:ireturn         

		case 2: // '\002'
			return 7;
	//   52  125:bipush          7
	//   53  127:ireturn         

		case 1: // '\001'
			return 6;
	//   54  128:bipush          6
	//   55  130:ireturn         

		case 0: // '\0'
			return 5;
	//   56  131:iconst_5        
	//   57  132:ireturn         
		}
	}

	private final long b(long l1)
	{
		return (l1 * 0xf4240L) / (long)m;
	//    0    0:lload_1         
	//    1    1:ldc2w           #220 <Long 0xf4240L>
	//    2    4:lmul            
	//    3    5:aload_0         
	//    4    6:getfield        #223 <Field int m>
	//    5    9:i2l             
	//    6   10:ldiv            
	//    7   11:lreturn         
	}

	private final boolean b(ByteBuffer bytebuffer, long l1)
	{
		int j1;
		int k2;
label0:
		{
			if(!bytebuffer.hasRemaining())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #195 <Method boolean ByteBuffer.hasRemaining()>
	//*   2    4:ifne            9
				return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
			ByteBuffer bytebuffer1 = W;
	//    5    9:aload_0         
	//    6   10:getfield        #225 <Field ByteBuffer W>
	//    7   13:astore          8
			if(bytebuffer1 != null)
	//*   8   15:aload           8
	//*   9   17:ifnull          43
			{
				boolean flag;
				if(bytebuffer1 == bytebuffer)
	//*  10   20:aload           8
	//*  11   22:aload_1         
	//*  12   23:if_acmpne       32
					flag = true;
	//   13   26:iconst_1        
	//   14   27:istore          7
				else
	//*  15   29:goto            35
					flag = false;
	//   16   32:iconst_0        
	//   17   33:istore          7
				bnf.a(flag);
	//   18   35:iload           7
	//   19   37:invokestatic    #229 <Method void bnf.a(boolean)>
			} else
	//*  20   40:goto            119
			{
				W = bytebuffer;
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:putfield        #225 <Field ByteBuffer W>
				if(bnw.a < 21)
	//*  24   48:getstatic       #102 <Field int bnw.a>
	//*  25   51:bipush          21
	//*  26   53:icmpge          119
				{
					int i1 = bytebuffer.remaining();
	//   27   56:aload_1         
	//   28   57:invokevirtual   #232 <Method int ByteBuffer.remaining()>
	//   29   60:istore          4
					byte abyte0[] = X;
	//   30   62:aload_0         
	//   31   63:getfield        #234 <Field byte[] X>
	//   32   66:astore          8
					if(abyte0 == null || abyte0.length < i1)
	//*  33   68:aload           8
	//*  34   70:ifnull          81
	//*  35   73:aload           8
	//*  36   75:arraylength     
	//*  37   76:iload           4
	//*  38   78:icmpge          89
						X = new byte[i1];
	//   39   81:aload_0         
	//   40   82:iload           4
	//   41   84:newarray        byte[]
	//   42   86:putfield        #234 <Field byte[] X>
					int k1 = bytebuffer.position();
	//   43   89:aload_1         
	//   44   90:invokevirtual   #237 <Method int ByteBuffer.position()>
	//   45   93:istore          5
					bytebuffer.get(X, 0, i1);
	//   46   95:aload_1         
	//   47   96:aload_0         
	//   48   97:getfield        #234 <Field byte[] X>
	//   49  100:iconst_0        
	//   50  101:iload           4
	//   51  103:invokevirtual   #241 <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
	//   52  106:pop             
					bytebuffer.position(k1);
	//   53  107:aload_1         
	//   54  108:iload           5
	//   55  110:invokevirtual   #244 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   56  113:pop             
					Y = 0;
	//   57  114:aload_0         
	//   58  115:iconst_0        
	//   59  116:putfield        #246 <Field int Y>
				}
			}
			k2 = bytebuffer.remaining();
	//   60  119:aload_1         
	//   61  120:invokevirtual   #232 <Method int ByteBuffer.remaining()>
	//   62  123:istore          6
			if(bnw.a < 21)
	//*  63  125:getstatic       #102 <Field int bnw.a>
	//*  64  128:bipush          21
	//*  65  130:icmpge          241
			{
				j1 = (int)(L - j.b() * (long)K);
	//   66  133:aload_0         
	//   67  134:getfield        #248 <Field long L>
	//   68  137:aload_0         
	//   69  138:getfield        #119 <Field beh j>
	//   70  141:invokevirtual   #251 <Method long beh.b()>
	//   71  144:aload_0         
	//   72  145:getfield        #253 <Field int K>
	//   73  148:i2l             
	//   74  149:lmul            
	//   75  150:lsub            
	//   76  151:l2i             
	//   77  152:istore          4
				j1 = s - j1;
	//   78  154:aload_0         
	//   79  155:getfield        #255 <Field int s>
	//   80  158:iload           4
	//   81  160:isub            
	//   82  161:istore          4
				if(j1 > 0)
	//*  83  163:iload           4
	//*  84  165:ifle            235
				{
					j1 = Math.min(k2, j1);
	//   85  168:iload           6
	//   86  170:iload           4
	//   87  172:invokestatic    #261 <Method int Math.min(int, int)>
	//   88  175:istore          4
					int i2 = l.write(X, Y, j1);
	//   89  177:aload_0         
	//   90  178:getfield        #263 <Field AudioTrack l>
	//   91  181:aload_0         
	//   92  182:getfield        #234 <Field byte[] X>
	//   93  185:aload_0         
	//   94  186:getfield        #246 <Field int Y>
	//   95  189:iload           4
	//   96  191:invokevirtual   #267 <Method int AudioTrack.write(byte[], int, int)>
	//   97  194:istore          5
					j1 = i2;
	//   98  196:iload           5
	//   99  198:istore          4
					if(i2 > 0)
	//* 100  200:iload           5
	//* 101  202:ifle            467
					{
						Y = Y + i2;
	//  102  205:aload_0         
	//  103  206:aload_0         
	//  104  207:getfield        #246 <Field int Y>
	//  105  210:iload           5
	//  106  212:iadd            
	//  107  213:putfield        #246 <Field int Y>
						bytebuffer.position(bytebuffer.position() + i2);
	//  108  216:aload_1         
	//  109  217:aload_1         
	//  110  218:invokevirtual   #237 <Method int ByteBuffer.position()>
	//  111  221:iload           5
	//  112  223:iadd            
	//  113  224:invokevirtual   #244 <Method java.nio.Buffer ByteBuffer.position(int)>
	//  114  227:pop             
						j1 = i2;
	//  115  228:iload           5
	//  116  230:istore          4
					}
				} else
	//* 117  232:goto            467
				{
					j1 = 0;
	//  118  235:iconst_0        
	//  119  236:istore          4
				}
				break label0;
	//  120  238:goto            467
			}
			if(ad)
	//* 121  241:aload_0         
	//* 122  242:getfield        #269 <Field boolean ad>
	//* 123  245:ifeq            454
			{
				boolean flag1;
				if(l1 != 0x1L)
	//* 124  248:lload_2         
	//* 125  249:ldc2w           #270 <Long 0x1L>
	//* 126  252:lcmp            
	//* 127  253:ifeq            262
					flag1 = true;
	//  128  256:iconst_1        
	//  129  257:istore          7
				else
	//* 130  259:goto            265
					flag1 = false;
	//  131  262:iconst_0        
	//  132  263:istore          7
				bnf.b(flag1);
	//  133  265:iload           7
	//  134  267:invokestatic    #273 <Method void bnf.b(boolean)>
				AudioTrack audiotrack = l;
	//  135  270:aload_0         
	//  136  271:getfield        #263 <Field AudioTrack l>
	//  137  274:astore          8
				if(y == null)
	//* 138  276:aload_0         
	//* 139  277:getfield        #275 <Field ByteBuffer y>
	//* 140  280:ifnonnull       314
				{
					y = ByteBuffer.allocate(16);
	//  141  283:aload_0         
	//  142  284:bipush          16
	//  143  286:invokestatic    #279 <Method ByteBuffer ByteBuffer.allocate(int)>
	//  144  289:putfield        #275 <Field ByteBuffer y>
					y.order(ByteOrder.BIG_ENDIAN);
	//  145  292:aload_0         
	//  146  293:getfield        #275 <Field ByteBuffer y>
	//  147  296:getstatic       #285 <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//  148  299:invokevirtual   #289 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//  149  302:pop             
					y.putInt(0x55550001);
	//  150  303:aload_0         
	//  151  304:getfield        #275 <Field ByteBuffer y>
	//  152  307:ldc2            #290 <Int 0x55550001>
	//  153  310:invokevirtual   #293 <Method ByteBuffer ByteBuffer.putInt(int)>
	//  154  313:pop             
				}
				if(z == 0)
	//* 155  314:aload_0         
	//* 156  315:getfield        #295 <Field int z>
	//* 157  318:ifne            362
				{
					y.putInt(4, k2);
	//  158  321:aload_0         
	//  159  322:getfield        #275 <Field ByteBuffer y>
	//  160  325:iconst_4        
	//  161  326:iload           6
	//  162  328:invokevirtual   #298 <Method ByteBuffer ByteBuffer.putInt(int, int)>
	//  163  331:pop             
					y.putLong(8, l1 * 1000L);
	//  164  332:aload_0         
	//  165  333:getfield        #275 <Field ByteBuffer y>
	//  166  336:bipush          8
	//  167  338:lload_2         
	//  168  339:ldc2w           #299 <Long 1000L>
	//  169  342:lmul            
	//  170  343:invokevirtual   #304 <Method ByteBuffer ByteBuffer.putLong(int, long)>
	//  171  346:pop             
					y.position(0);
	//  172  347:aload_0         
	//  173  348:getfield        #275 <Field ByteBuffer y>
	//  174  351:iconst_0        
	//  175  352:invokevirtual   #244 <Method java.nio.Buffer ByteBuffer.position(int)>
	//  176  355:pop             
					z = k2;
	//  177  356:aload_0         
	//  178  357:iload           6
	//  179  359:putfield        #295 <Field int z>
				}
				int j2 = y.remaining();
	//  180  362:aload_0         
	//  181  363:getfield        #275 <Field ByteBuffer y>
	//  182  366:invokevirtual   #232 <Method int ByteBuffer.remaining()>
	//  183  369:istore          5
				if(j2 > 0)
	//* 184  371:iload           5
	//* 185  373:ifle            416
				{
					j1 = audiotrack.write(y, j2, 1);
	//  186  376:aload           8
	//  187  378:aload_0         
	//  188  379:getfield        #275 <Field ByteBuffer y>
	//  189  382:iload           5
	//  190  384:iconst_1        
	//  191  385:invokevirtual   #307 <Method int AudioTrack.write(ByteBuffer, int, int)>
	//  192  388:istore          4
					if(j1 < 0)
	//* 193  390:iload           4
	//* 194  392:ifge            403
					{
						z = 0;
	//  195  395:aload_0         
	//  196  396:iconst_0        
	//  197  397:putfield        #295 <Field int z>
						break label0;
	//  198  400:goto            467
					}
					if(j1 < j2)
	//* 199  403:iload           4
	//* 200  405:iload           5
	//* 201  407:icmpge          416
					{
						j1 = 0;
	//  202  410:iconst_0        
	//  203  411:istore          4
						break label0;
	//  204  413:goto            467
					}
				}
				j1 = audiotrack.write(bytebuffer, k2, 1);
	//  205  416:aload           8
	//  206  418:aload_1         
	//  207  419:iload           6
	//  208  421:iconst_1        
	//  209  422:invokevirtual   #307 <Method int AudioTrack.write(ByteBuffer, int, int)>
	//  210  425:istore          4
				if(j1 < 0)
	//* 211  427:iload           4
	//* 212  429:ifge            440
					z = 0;
	//  213  432:aload_0         
	//  214  433:iconst_0        
	//  215  434:putfield        #295 <Field int z>
				else
	//* 216  437:goto            451
					z = z - j1;
	//  217  440:aload_0         
	//  218  441:aload_0         
	//  219  442:getfield        #295 <Field int z>
	//  220  445:iload           4
	//  221  447:isub            
	//  222  448:putfield        #295 <Field int z>
			} else
	//* 223  451:goto            467
			{
				j1 = l.write(bytebuffer, k2, 1);
	//  224  454:aload_0         
	//  225  455:getfield        #263 <Field AudioTrack l>
	//  226  458:aload_1         
	//  227  459:iload           6
	//  228  461:iconst_1        
	//  229  462:invokevirtual   #307 <Method int AudioTrack.write(ByteBuffer, int, int)>
	//  230  465:istore          4
			}
		}
		af = SystemClock.elapsedRealtime();
	//  231  467:aload_0         
	//  232  468:invokestatic    #312 <Method long SystemClock.elapsedRealtime()>
	//  233  471:putfield        #314 <Field long af>
		if(j1 >= 0)
	//* 234  474:iload           4
	//* 235  476:iflt            535
		{
			if(!r)
	//* 236  479:aload_0         
	//* 237  480:getfield        #316 <Field boolean r>
	//* 238  483:ifne            498
				L = L + (long)j1;
	//  239  486:aload_0         
	//  240  487:aload_0         
	//  241  488:getfield        #248 <Field long L>
	//  242  491:iload           4
	//  243  493:i2l             
	//  244  494:ladd            
	//  245  495:putfield        #248 <Field long L>
			if(j1 == k2)
	//* 246  498:iload           4
	//* 247  500:iload           6
	//* 248  502:icmpne          533
			{
				if(r)
	//* 249  505:aload_0         
	//* 250  506:getfield        #316 <Field boolean r>
	//* 251  509:ifeq            526
					M = M + (long)N;
	//  252  512:aload_0         
	//  253  513:aload_0         
	//  254  514:getfield        #318 <Field long M>
	//  255  517:aload_0         
	//  256  518:getfield        #320 <Field int N>
	//  257  521:i2l             
	//  258  522:ladd            
	//  259  523:putfield        #318 <Field long M>
				W = null;
	//  260  526:aload_0         
	//  261  527:aconst_null     
	//  262  528:putfield        #225 <Field ByteBuffer W>
				return true;
	//  263  531:iconst_1        
	//  264  532:ireturn         
			} else
			{
				return false;
	//  265  533:iconst_0        
	//  266  534:ireturn         
			}
		} else
		{
			throw new beo(j1);
	//  267  535:new             #322 <Class beo>
	//  268  538:dup             
	//  269  539:iload           4
	//  270  541:invokespecial   #325 <Method void beo(int)>
	//  271  544:athrow          
		}
	}

	private final long c(long l1)
	{
		return (l1 * (long)m) / 0xf4240L;
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #223 <Field int m>
	//    3    5:i2l             
	//    4    6:lmul            
	//    5    7:ldc2w           #220 <Long 0xf4240L>
	//    6   10:ldiv            
	//    7   11:lreturn         
	}

	private final void k()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #327 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #328 <Method void ArrayList()>
	//    3    7:astore          4
		bdv abdv[] = f;
	//    4    9:aload_0         
	//    5   10:getfield        #138 <Field bdv[] f>
	//    6   13:astore          5
		int k1 = abdv.length;
	//    7   15:aload           5
	//    8   17:arraylength     
	//    9   18:istore_3        
		boolean flag = false;
	//   10   19:iconst_0        
	//   11   20:istore_2        
		for(int i1 = 0; i1 < k1; i1++)
	//*  12   21:iconst_0        
	//*  13   22:istore_1        
	//*  14   23:iload_1         
	//*  15   24:iload_3         
	//*  16   25:icmpge          69
		{
			bdv bdv2 = abdv[i1];
	//   17   28:aload           5
	//   18   30:iload_1         
	//   19   31:aaload          
	//   20   32:astore          6
			if(bdv2.a())
	//*  21   34:aload           6
	//*  22   36:invokeinterface #330 <Method boolean bdv.a()>
	//*  23   41:ifeq            55
				arraylist.add(((Object) (bdv2)));
	//   24   44:aload           4
	//   25   46:aload           6
	//   26   48:invokevirtual   #333 <Method boolean ArrayList.add(Object)>
	//   27   51:pop             
			else
	//*  28   52:goto            62
				bdv2.g();
	//   29   55:aload           6
	//   30   57:invokeinterface #335 <Method void bdv.g()>
		}

	//   31   62:iload_1         
	//   32   63:iconst_1        
	//   33   64:iadd            
	//   34   65:istore_1        
	//*  35   66:goto            23
		k1 = arraylist.size();
	//   36   69:aload           4
	//   37   71:invokevirtual   #338 <Method int ArrayList.size()>
	//   38   74:istore_3        
		T = (bdv[])arraylist.toArray(((Object []) (new bdv[k1])));
	//   39   75:aload_0         
	//   40   76:aload           4
	//   41   78:iload_3         
	//   42   79:anewarray       bdv[]
	//   43   82:invokevirtual   #342 <Method Object[] ArrayList.toArray(Object[])>
	//   44   85:checkcast       #343 <Class bdv[]>
	//   45   88:putfield        #167 <Field bdv[] T>
		U = new ByteBuffer[k1];
	//   46   91:aload_0         
	//   47   92:iload_3         
	//   48   93:anewarray       ByteBuffer[]
	//   49   96:putfield        #171 <Field ByteBuffer[] U>
		for(int j1 = ((int) (flag)); j1 < k1; j1++)
	//*  50   99:iload_2         
	//*  51  100:istore_1        
	//*  52  101:iload_1         
	//*  53  102:iload_3         
	//*  54  103:icmpge          141
		{
			bdv bdv1 = T[j1];
	//   55  106:aload_0         
	//   56  107:getfield        #167 <Field bdv[] T>
	//   57  110:iload_1         
	//   58  111:aaload          
	//   59  112:astore          4
			bdv1.g();
	//   60  114:aload           4
	//   61  116:invokeinterface #335 <Method void bdv.g()>
			U[j1] = bdv1.e();
	//   62  121:aload_0         
	//   63  122:getfield        #171 <Field ByteBuffer[] U>
	//   64  125:iload_1         
	//   65  126:aload           4
	//   66  128:invokeinterface #191 <Method ByteBuffer bdv.e()>
	//   67  133:aastore         
		}

	//   68  134:iload_1         
	//   69  135:iconst_1        
	//   70  136:iadd            
	//   71  137:istore_1        
	//*  72  138:goto            101
	//   73  141:return          
	}

	private final boolean l()
	{
		boolean flag;
		if(Z == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #165 <Field int Z>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          36
		{
			int i1;
			if(r)
	//*   4    8:aload_0         
	//*   5    9:getfield        #316 <Field boolean r>
	//*   6   12:ifeq            24
				i1 = T.length;
	//    7   15:aload_0         
	//    8   16:getfield        #167 <Field bdv[] T>
	//    9   19:arraylength     
	//   10   20:istore_1        
			else
	//*  11   21:goto            26
				i1 = 0;
	//   12   24:iconst_0        
	//   13   25:istore_1        
			Z = i1;
	//   14   26:aload_0         
	//   15   27:iload_1         
	//   16   28:putfield        #165 <Field int Z>
			flag = true;
	//   17   31:iconst_1        
	//   18   32:istore_1        
		} else
	//*  19   33:goto            38
		{
			flag = false;
	//   20   36:iconst_0        
	//   21   37:istore_1        
		}
		do
		{
			int j1 = Z;
	//   22   38:aload_0         
	//   23   39:getfield        #165 <Field int Z>
	//   24   42:istore_2        
			bdv abdv[] = T;
	//   25   43:aload_0         
	//   26   44:getfield        #167 <Field bdv[] T>
	//   27   47:astore_3        
			if(j1 >= abdv.length)
				break;
	//   28   48:iload_2         
	//   29   49:aload_3         
	//   30   50:arraylength     
	//   31   51:icmpge          101
			bdv bdv1 = abdv[j1];
	//   32   54:aload_3         
	//   33   55:iload_2         
	//   34   56:aaload          
	//   35   57:astore_3        
			if(flag)
	//*  36   58:iload_1         
	//*  37   59:ifeq            68
				bdv1.d();
	//   38   62:aload_3         
	//   39   63:invokeinterface #345 <Method void bdv.d()>
			a(0x1L);
	//   40   68:aload_0         
	//   41   69:ldc2w           #270 <Long 0x1L>
	//   42   72:invokespecial   #347 <Method void a(long)>
			if(!bdv1.f())
	//*  43   75:aload_3         
	//*  44   76:invokeinterface #349 <Method boolean bdv.f()>
	//*  45   81:ifne            86
				return false;
	//   46   84:iconst_0        
	//   47   85:ireturn         
			Z = Z + 1;
	//   48   86:aload_0         
	//   49   87:aload_0         
	//   50   88:getfield        #165 <Field int Z>
	//   51   91:iconst_1        
	//   52   92:iadd            
	//   53   93:putfield        #165 <Field int Z>
			flag = true;
	//   54   96:iconst_1        
	//   55   97:istore_1        
		} while(true);
	//   56   98:goto            38
		ByteBuffer bytebuffer = W;
	//   57  101:aload_0         
	//   58  102:getfield        #225 <Field ByteBuffer W>
	//   59  105:astore_3        
		if(bytebuffer != null)
	//*  60  106:aload_3         
	//*  61  107:ifnull          128
		{
			b(bytebuffer, 0x1L);
	//   62  110:aload_0         
	//   63  111:aload_3         
	//   64  112:ldc2w           #270 <Long 0x1L>
	//   65  115:invokespecial   #185 <Method boolean b(ByteBuffer, long)>
	//   66  118:pop             
			if(W != null)
	//*  67  119:aload_0         
	//*  68  120:getfield        #225 <Field ByteBuffer W>
	//*  69  123:ifnull          128
				return false;
	//   70  126:iconst_0        
	//   71  127:ireturn         
		}
		Z = -1;
	//   72  128:aload_0         
	//   73  129:iconst_m1       
	//   74  130:putfield        #165 <Field int Z>
		return true;
	//   75  133:iconst_1        
	//   76  134:ireturn         
	}

	private final void m()
	{
		if(n())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #351 <Method boolean n()>
	//*   2    4:ifeq            45
		{
			if(bnw.a >= 21)
	//*   3    7:getstatic       #102 <Field int bnw.a>
	//*   4   10:bipush          21
	//*   5   12:icmplt          28
			{
				l.setVolume(S);
	//    6   15:aload_0         
	//    7   16:getfield        #263 <Field AudioTrack l>
	//    8   19:aload_0         
	//    9   20:getfield        #151 <Field float S>
	//   10   23:invokevirtual   #355 <Method int AudioTrack.setVolume(float)>
	//   11   26:pop             
				return;
	//   12   27:return          
			}
			AudioTrack audiotrack = l;
	//   13   28:aload_0         
	//   14   29:getfield        #263 <Field AudioTrack l>
	//   15   32:astore_2        
			float f1 = S;
	//   16   33:aload_0         
	//   17   34:getfield        #151 <Field float S>
	//   18   37:fstore_1        
			audiotrack.setStereoVolume(f1, f1);
	//   19   38:aload_2         
	//   20   39:fload_1         
	//   21   40:fload_1         
	//   22   41:invokevirtual   #359 <Method int AudioTrack.setStereoVolume(float, float)>
	//   23   44:pop             
		}
	//   24   45:return          
	}

	private final boolean n()
	{
		return l != null;
	//    0    0:aload_0         
	//    1    1:getfield        #263 <Field AudioTrack l>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	private final long o()
	{
		if(r)
	//*   0    0:aload_0         
	//*   1    1:getfield        #316 <Field boolean r>
	//*   2    4:ifeq            12
			return M;
	//    3    7:aload_0         
	//    4    8:getfield        #318 <Field long M>
	//    5   11:lreturn         
		else
			return L / (long)K;
	//    6   12:aload_0         
	//    7   13:getfield        #248 <Field long L>
	//    8   16:aload_0         
	//    9   17:getfield        #253 <Field int K>
	//   10   20:i2l             
	//   11   21:ldiv            
	//   12   22:lreturn         
	}

	private final void p()
	{
		C = 0L;
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:putfield        #361 <Field long C>
		B = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #363 <Field int B>
		A = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #365 <Field int A>
		D = 0L;
	//    9   15:aload_0         
	//   10   16:lconst_0        
	//   11   17:putfield        #367 <Field long D>
		E = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #369 <Field boolean E>
		F = 0L;
	//   15   25:aload_0         
	//   16   26:lconst_0        
	//   17   27:putfield        #371 <Field long F>
	//   18   30:return          
	}

	private final boolean q()
	{
		if(bnw.a < 23)
	//*   0    0:getstatic       #102 <Field int bnw.a>
	//*   1    3:bipush          23
	//*   2    5:icmpge          26
		{
			int i1 = p;
	//    3    8:aload_0         
	//    4    9:getfield        #373 <Field int p>
	//    5   12:istore_1        
			if(i1 == 5 || i1 == 6)
	//*   6   13:iload_1         
	//*   7   14:iconst_5        
	//*   8   15:icmpeq          24
	//*   9   18:iload_1         
	//*  10   19:bipush          6
	//*  11   21:icmpne          26
				return true;
	//   12   24:iconst_1        
	//   13   25:ireturn         
		}
		return false;
	//   14   26:iconst_0        
	//   15   27:ireturn         
	}

	public final long a(boolean flag)
	{
		Exception exception;
		boolean flag1;
		if(n() && O != 0)
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #351 <Method boolean n()>
	//*   2    4:ifeq            20
	//*   3    7:aload_0         
	//*   4    8:getfield        #153 <Field int O>
	//*   5   11:ifeq            20
			flag1 = true;
	//    6   14:iconst_1        
	//    7   15:istore          6
		else
	//*   8   17:goto            23
			flag1 = false;
	//    9   20:iconst_0        
	//   10   21:istore          6
		if(!flag1)
	//*  11   23:iload           6
	//*  12   25:ifne            32
			return 0x0L;
	//   13   28:ldc2w           #377 <Long 0x0L>
	//   14   31:lreturn         
		if(l.getPlayState() == 3)
	//*  15   32:aload_0         
	//*  16   33:getfield        #263 <Field AudioTrack l>
	//*  17   36:invokevirtual   #381 <Method int AudioTrack.getPlayState()>
	//*  18   39:iconst_3        
	//*  19   40:icmpne          638
		{
			long l3 = j.c();
	//   20   43:aload_0         
	//   21   44:getfield        #119 <Field beh j>
	//   22   47:invokevirtual   #383 <Method long beh.c()>
	//   23   50:lstore          10
			if(l3 != 0L)
	//*  24   52:lload           10
	//*  25   54:lconst_0        
	//*  26   55:lcmp            
	//*  27   56:ifeq            638
			{
				long l1 = System.nanoTime() / 1000L;
	//   28   59:invokestatic    #386 <Method long System.nanoTime()>
	//   29   62:ldc2w           #299 <Long 1000L>
	//   30   65:ldiv            
	//   31   66:lstore          8
				if(l1 - D >= 30000L)
	//*  32   68:lload           8
	//*  33   70:aload_0         
	//*  34   71:getfield        #367 <Field long D>
	//*  35   74:lsub            
	//*  36   75:ldc2w           #387 <Long 30000L>
	//*  37   78:lcmp            
	//*  38   79:iflt            192
				{
					long al[] = i;
	//   39   82:aload_0         
	//   40   83:getfield        #149 <Field long[] i>
	//   41   86:astore          16
					int i1 = A;
	//   42   88:aload_0         
	//   43   89:getfield        #365 <Field int A>
	//   44   92:istore          6
					al[i1] = l3 - l1;
	//   45   94:aload           16
	//   46   96:iload           6
	//   47   98:lload           10
	//   48  100:lload           8
	//   49  102:lsub            
	//   50  103:lastore         
					A = (i1 + 1) % 10;
	//   51  104:aload_0         
	//   52  105:iload           6
	//   53  107:iconst_1        
	//   54  108:iadd            
	//   55  109:bipush          10
	//   56  111:irem            
	//   57  112:putfield        #365 <Field int A>
					i1 = B;
	//   58  115:aload_0         
	//   59  116:getfield        #363 <Field int B>
	//   60  119:istore          6
					if(i1 < 10)
	//*  61  121:iload           6
	//*  62  123:bipush          10
	//*  63  125:icmpge          136
						B = i1 + 1;
	//   64  128:aload_0         
	//   65  129:iload           6
	//   66  131:iconst_1        
	//   67  132:iadd            
	//   68  133:putfield        #363 <Field int B>
					D = l1;
	//   69  136:aload_0         
	//   70  137:lload           8
	//   71  139:putfield        #367 <Field long D>
					C = 0L;
	//   72  142:aload_0         
	//   73  143:lconst_0        
	//   74  144:putfield        #361 <Field long C>
					i1 = 0;
	//   75  147:iconst_0        
	//   76  148:istore          6
					do
					{
						int j1 = B;
	//   77  150:aload_0         
	//   78  151:getfield        #363 <Field int B>
	//   79  154:istore          7
						if(i1 >= j1)
							break;
	//   80  156:iload           6
	//   81  158:iload           7
	//   82  160:icmpge          192
						C = C + i[i1] / (long)j1;
	//   83  163:aload_0         
	//   84  164:aload_0         
	//   85  165:getfield        #361 <Field long C>
	//   86  168:aload_0         
	//   87  169:getfield        #149 <Field long[] i>
	//   88  172:iload           6
	//   89  174:laload          
	//   90  175:iload           7
	//   91  177:i2l             
	//   92  178:ldiv            
	//   93  179:ladd            
	//   94  180:putfield        #361 <Field long C>
						i1++;
	//   95  183:iload           6
	//   96  185:iconst_1        
	//   97  186:iadd            
	//   98  187:istore          6
					} while(true);
	//   99  189:goto            150
				}
				if(!q() && l1 - F >= 0x7a120L)
	//* 100  192:aload_0         
	//* 101  193:invokespecial   #390 <Method boolean q()>
	//* 102  196:ifne            638
	//* 103  199:lload           8
	//* 104  201:aload_0         
	//* 105  202:getfield        #371 <Field long F>
	//* 106  205:lsub            
	//* 107  206:ldc2w           #391 <Long 0x7a120L>
	//* 108  209:lcmp            
	//* 109  210:iflt            638
				{
					E = j.d();
	//  110  213:aload_0         
	//  111  214:aload_0         
	//  112  215:getfield        #119 <Field beh j>
	//  113  218:invokevirtual   #394 <Method boolean beh.d()>
	//  114  221:putfield        #369 <Field boolean E>
					if(E)
	//* 115  224:aload_0         
	//* 116  225:getfield        #369 <Field boolean E>
	//* 117  228:ifeq            502
					{
						long l7 = j.e() / 1000L;
	//  118  231:aload_0         
	//  119  232:getfield        #119 <Field beh j>
	//  120  235:invokevirtual   #396 <Method long beh.e()>
	//  121  238:ldc2w           #299 <Long 1000L>
	//  122  241:ldiv            
	//  123  242:lstore          12
						long l10 = j.f();
	//  124  244:aload_0         
	//  125  245:getfield        #119 <Field beh j>
	//  126  248:invokevirtual   #398 <Method long beh.f()>
	//  127  251:lstore          14
						if(l7 < Q)
	//* 128  253:lload           12
	//* 129  255:aload_0         
	//* 130  256:getfield        #400 <Field long Q>
	//* 131  259:lcmp            
	//* 132  260:ifge            271
							E = false;
	//  133  263:aload_0         
	//  134  264:iconst_0        
	//  135  265:putfield        #369 <Field boolean E>
						else
	//* 136  268:goto            502
						if(Math.abs(l7 - l1) > 0x4c4b40L)
	//* 137  271:lload           12
	//* 138  273:lload           8
	//* 139  275:lsub            
	//* 140  276:invokestatic    #403 <Method long Math.abs(long)>
	//* 141  279:ldc2w           #404 <Long 0x4c4b40L>
	//* 142  282:lcmp            
	//* 143  283:ifle            386
						{
							StringBuilder stringbuilder = new StringBuilder(136);
	//  144  286:new             #407 <Class StringBuilder>
	//  145  289:dup             
	//  146  290:sipush          136
	//  147  293:invokespecial   #408 <Method void StringBuilder(int)>
	//  148  296:astore          16
							stringbuilder.append("Spurious audio timestamp (system clock mismatch): ");
	//  149  298:aload           16
	//  150  300:ldc2            #410 <String "Spurious audio timestamp (system clock mismatch): ">
	//  151  303:invokevirtual   #414 <Method StringBuilder StringBuilder.append(String)>
	//  152  306:pop             
							stringbuilder.append(l10);
	//  153  307:aload           16
	//  154  309:lload           14
	//  155  311:invokevirtual   #417 <Method StringBuilder StringBuilder.append(long)>
	//  156  314:pop             
							stringbuilder.append(", ");
	//  157  315:aload           16
	//  158  317:ldc2            #419 <String ", ">
	//  159  320:invokevirtual   #414 <Method StringBuilder StringBuilder.append(String)>
	//  160  323:pop             
							stringbuilder.append(l7);
	//  161  324:aload           16
	//  162  326:lload           12
	//  163  328:invokevirtual   #417 <Method StringBuilder StringBuilder.append(long)>
	//  164  331:pop             
							stringbuilder.append(", ");
	//  165  332:aload           16
	//  166  334:ldc2            #419 <String ", ">
	//  167  337:invokevirtual   #414 <Method StringBuilder StringBuilder.append(String)>
	//  168  340:pop             
							stringbuilder.append(l1);
	//  169  341:aload           16
	//  170  343:lload           8
	//  171  345:invokevirtual   #417 <Method StringBuilder StringBuilder.append(long)>
	//  172  348:pop             
							stringbuilder.append(", ");
	//  173  349:aload           16
	//  174  351:ldc2            #419 <String ", ">
	//  175  354:invokevirtual   #414 <Method StringBuilder StringBuilder.append(String)>
	//  176  357:pop             
							stringbuilder.append(l3);
	//  177  358:aload           16
	//  178  360:lload           10
	//  179  362:invokevirtual   #417 <Method StringBuilder StringBuilder.append(long)>
	//  180  365:pop             
							Log.w("AudioTrack", stringbuilder.toString());
	//  181  366:ldc2            #421 <String "AudioTrack">
	//  182  369:aload           16
	//  183  371:invokevirtual   #425 <Method String StringBuilder.toString()>
	//  184  374:invokestatic    #430 <Method int Log.w(String, String)>
	//  185  377:pop             
							E = false;
	//  186  378:aload_0         
	//  187  379:iconst_0        
	//  188  380:putfield        #369 <Field boolean E>
						} else
	//* 189  383:goto            502
						if(Math.abs(b(l10) - l3) > 0x4c4b40L)
	//* 190  386:aload_0         
	//* 191  387:lload           14
	//* 192  389:invokespecial   #432 <Method long b(long)>
	//* 193  392:lload           10
	//* 194  394:lsub            
	//* 195  395:invokestatic    #403 <Method long Math.abs(long)>
	//* 196  398:ldc2w           #404 <Long 0x4c4b40L>
	//* 197  401:lcmp            
	//* 198  402:ifle            502
						{
							StringBuilder stringbuilder1 = new StringBuilder(138);
	//  199  405:new             #407 <Class StringBuilder>
	//  200  408:dup             
	//  201  409:sipush          138
	//  202  412:invokespecial   #408 <Method void StringBuilder(int)>
	//  203  415:astore          16
							stringbuilder1.append("Spurious audio timestamp (frame position mismatch): ");
	//  204  417:aload           16
	//  205  419:ldc2            #434 <String "Spurious audio timestamp (frame position mismatch): ">
	//  206  422:invokevirtual   #414 <Method StringBuilder StringBuilder.append(String)>
	//  207  425:pop             
							stringbuilder1.append(l10);
	//  208  426:aload           16
	//  209  428:lload           14
	//  210  430:invokevirtual   #417 <Method StringBuilder StringBuilder.append(long)>
	//  211  433:pop             
							stringbuilder1.append(", ");
	//  212  434:aload           16
	//  213  436:ldc2            #419 <String ", ">
	//  214  439:invokevirtual   #414 <Method StringBuilder StringBuilder.append(String)>
	//  215  442:pop             
							stringbuilder1.append(l7);
	//  216  443:aload           16
	//  217  445:lload           12
	//  218  447:invokevirtual   #417 <Method StringBuilder StringBuilder.append(long)>
	//  219  450:pop             
							stringbuilder1.append(", ");
	//  220  451:aload           16
	//  221  453:ldc2            #419 <String ", ">
	//  222  456:invokevirtual   #414 <Method StringBuilder StringBuilder.append(String)>
	//  223  459:pop             
							stringbuilder1.append(l1);
	//  224  460:aload           16
	//  225  462:lload           8
	//  226  464:invokevirtual   #417 <Method StringBuilder StringBuilder.append(long)>
	//  227  467:pop             
							stringbuilder1.append(", ");
	//  228  468:aload           16
	//  229  470:ldc2            #419 <String ", ">
	//  230  473:invokevirtual   #414 <Method StringBuilder StringBuilder.append(String)>
	//  231  476:pop             
							stringbuilder1.append(l3);
	//  232  477:aload           16
	//  233  479:lload           10
	//  234  481:invokevirtual   #417 <Method StringBuilder StringBuilder.append(long)>
	//  235  484:pop             
							Log.w("AudioTrack", stringbuilder1.toString());
	//  236  485:ldc2            #421 <String "AudioTrack">
	//  237  488:aload           16
	//  238  490:invokevirtual   #425 <Method String StringBuilder.toString()>
	//  239  493:invokestatic    #430 <Method int Log.w(String, String)>
	//  240  496:pop             
							E = false;
	//  241  497:aload_0         
	//  242  498:iconst_0        
	//  243  499:putfield        #369 <Field boolean E>
						}
					}
					Method method = G;
	//  244  502:aload_0         
	//  245  503:getfield        #114 <Field Method G>
	//  246  506:astore          16
					if(method != null && !r)
	//* 247  508:aload           16
	//* 248  510:ifnull          632
	//* 249  513:aload_0         
	//* 250  514:getfield        #316 <Field boolean r>
	//* 251  517:ifne            632
						try
						{
							R = (long)((Integer)method.invoke(((Object) (l)), ((Object []) (null)))).intValue() * 1000L - t;
	//  252  520:aload_0         
	//  253  521:aload           16
	//  254  523:aload_0         
	//  255  524:getfield        #263 <Field AudioTrack l>
	//  256  527:aconst_null     
	//  257  528:invokevirtual   #440 <Method Object Method.invoke(Object, Object[])>
	//  258  531:checkcast       #442 <Class Integer>
	//  259  534:invokevirtual   #445 <Method int Integer.intValue()>
	//  260  537:i2l             
	//  261  538:ldc2w           #299 <Long 1000L>
	//  262  541:lmul            
	//  263  542:aload_0         
	//  264  543:getfield        #447 <Field long t>
	//  265  546:lsub            
	//  266  547:putfield        #449 <Field long R>
							R = Math.max(R, 0L);
	//  267  550:aload_0         
	//  268  551:aload_0         
	//  269  552:getfield        #449 <Field long R>
	//  270  555:lconst_0        
	//  271  556:invokestatic    #453 <Method long Math.max(long, long)>
	//  272  559:putfield        #449 <Field long R>
							if(R > 0x4c4b40L)
	//* 273  562:aload_0         
	//* 274  563:getfield        #449 <Field long R>
	//* 275  566:ldc2w           #404 <Long 0x4c4b40L>
	//* 276  569:lcmp            
	//* 277  570:ifle            632
							{
								long l4 = R;
	//  278  573:aload_0         
	//  279  574:getfield        #449 <Field long R>
	//  280  577:lstore          10
								StringBuilder stringbuilder2 = new StringBuilder(61);
	//  281  579:new             #407 <Class StringBuilder>
	//  282  582:dup             
	//  283  583:bipush          61
	//  284  585:invokespecial   #408 <Method void StringBuilder(int)>
	//  285  588:astore          16
								stringbuilder2.append("Ignoring impossibly large audio latency: ");
	//  286  590:aload           16
	//  287  592:ldc2            #455 <String "Ignoring impossibly large audio latency: ">
	//  288  595:invokevirtual   #414 <Method StringBuilder StringBuilder.append(String)>
	//  289  598:pop             
								stringbuilder2.append(l4);
	//  290  599:aload           16
	//  291  601:lload           10
	//  292  603:invokevirtual   #417 <Method StringBuilder StringBuilder.append(long)>
	//  293  606:pop             
								Log.w("AudioTrack", stringbuilder2.toString());
	//  294  607:ldc2            #421 <String "AudioTrack">
	//  295  610:aload           16
	//  296  612:invokevirtual   #425 <Method String StringBuilder.toString()>
	//  297  615:invokestatic    #430 <Method int Log.w(String, String)>
	//  298  618:pop             
								R = 0L;
	//  299  619:aload_0         
	//  300  620:lconst_0        
	//  301  621:putfield        #449 <Field long R>
							}
						}
	//* 302  624:goto            632
	//* 303  627:aload_0         
	//* 304  628:aconst_null     
	//* 305  629:putfield        #114 <Field Method G>
	//* 306  632:aload_0         
	//* 307  633:lload           8
	//* 308  635:putfield        #371 <Field long F>
	//* 309  638:invokestatic    #386 <Method long System.nanoTime()>
	//* 310  641:ldc2w           #299 <Long 1000L>
	//* 311  644:ldiv            
	//* 312  645:lstore          8
	//* 313  647:aload_0         
	//* 314  648:getfield        #369 <Field boolean E>
	//* 315  651:ifeq            693
	//* 316  654:aload_0         
	//* 317  655:lload           8
	//* 318  657:aload_0         
	//* 319  658:getfield        #119 <Field beh j>
	//* 320  661:invokevirtual   #396 <Method long beh.e()>
	//* 321  664:ldc2w           #299 <Long 1000L>
	//* 322  667:ldiv            
	//* 323  668:lsub            
	//* 324  669:invokespecial   #457 <Method long c(long)>
	//* 325  672:lstore          8
	//* 326  674:aload_0         
	//* 327  675:aload_0         
	//* 328  676:getfield        #119 <Field beh j>
	//* 329  679:invokevirtual   #398 <Method long beh.f()>
	//* 330  682:lload           8
	//* 331  684:ladd            
	//* 332  685:invokespecial   #432 <Method long b(long)>
	//* 333  688:lstore          8
	//* 334  690:goto            738
	//* 335  693:aload_0         
	//* 336  694:getfield        #363 <Field int B>
	//* 337  697:ifne            712
	//* 338  700:aload_0         
	//* 339  701:getfield        #119 <Field beh j>
	//* 340  704:invokevirtual   #383 <Method long beh.c()>
	//* 341  707:lstore          10
	//* 342  709:goto            721
	//* 343  712:lload           8
	//* 344  714:aload_0         
	//* 345  715:getfield        #361 <Field long C>
	//* 346  718:ladd            
	//* 347  719:lstore          10
	//* 348  721:lload           10
	//* 349  723:lstore          8
	//* 350  725:iload_1         
	//* 351  726:ifne            738
	//* 352  729:lload           10
	//* 353  731:aload_0         
	//* 354  732:getfield        #449 <Field long R>
	//* 355  735:lsub            
	//* 356  736:lstore          8
	//* 357  738:aload_0         
	//* 358  739:getfield        #459 <Field long P>
	//* 359  742:lstore          10
	//* 360  744:aload_0         
	//* 361  745:getfield        #176 <Field LinkedList k>
	//* 362  748:invokevirtual   #462 <Method boolean LinkedList.isEmpty()>
	//* 363  751:ifne            820
	//* 364  754:lload           8
	//* 365  756:aload_0         
	//* 366  757:getfield        #176 <Field LinkedList k>
	//* 367  760:invokevirtual   #466 <Method Object LinkedList.getFirst()>
	//* 368  763:checkcast       #468 <Class bem>
	//* 369  766:invokestatic    #471 <Method long bem.b(bem)>
	//* 370  769:lcmp            
	//* 371  770:iflt            820
	//* 372  773:aload_0         
	//* 373  774:getfield        #176 <Field LinkedList k>
	//* 374  777:invokevirtual   #474 <Method Object LinkedList.remove()>
	//* 375  780:checkcast       #468 <Class bem>
	//* 376  783:astore          16
	//* 377  785:aload_0         
	//* 378  786:aload           16
	//* 379  788:invokestatic    #477 <Method bdk bem.a(bem)>
	//* 380  791:putfield        #163 <Field bdk v>
	//* 381  794:aload_0         
	//* 382  795:aload           16
	//* 383  797:invokestatic    #471 <Method long bem.b(bem)>
	//* 384  800:putfield        #479 <Field long x>
	//* 385  803:aload_0         
	//* 386  804:aload           16
	//* 387  806:invokestatic    #481 <Method long bem.c(bem)>
	//* 388  809:aload_0         
	//* 389  810:getfield        #459 <Field long P>
	//* 390  813:lsub            
	//* 391  814:putfield        #483 <Field long w>
	//* 392  817:goto            744
	//* 393  820:aload_0         
	//* 394  821:getfield        #163 <Field bdk v>
	//* 395  824:getfield        #485 <Field float bdk.b>
	//* 396  827:fconst_1        
	//* 397  828:fcmpl           
	//* 398  829:ifne            849
	//* 399  832:lload           8
	//* 400  834:aload_0         
	//* 401  835:getfield        #483 <Field long w>
	//* 402  838:ladd            
	//* 403  839:aload_0         
	//* 404  840:getfield        #479 <Field long x>
	//* 405  843:lsub            
	//* 406  844:lstore          8
	//* 407  846:goto            957
	//* 408  849:aload_0         
	//* 409  850:getfield        #176 <Field LinkedList k>
	//* 410  853:invokevirtual   #462 <Method boolean LinkedList.isEmpty()>
	//* 411  856:ifeq            911
	//* 412  859:aload_0         
	//* 413  860:getfield        #134 <Field bew e>
	//* 414  863:invokevirtual   #487 <Method long bew.j()>
	//* 415  866:ldc2w           #488 <Long 1024L>
	//* 416  869:lcmp            
	//* 417  870:iflt            911
	//* 418  873:aload_0         
	//* 419  874:getfield        #483 <Field long w>
	//* 420  877:lstore          12
	//* 421  879:lload           8
	//* 422  881:aload_0         
	//* 423  882:getfield        #479 <Field long x>
	//* 424  885:lsub            
	//* 425  886:aload_0         
	//* 426  887:getfield        #134 <Field bew e>
	//* 427  890:invokevirtual   #491 <Method long bew.i()>
	//* 428  893:aload_0         
	//* 429  894:getfield        #134 <Field bew e>
	//* 430  897:invokevirtual   #487 <Method long bew.j()>
	//* 431  900:invokestatic    #494 <Method long bnw.a(long, long, long)>
	//* 432  903:lload           12
	//* 433  905:ladd            
	//* 434  906:lstore          8
	//* 435  908:goto            957
	//* 436  911:aload_0         
	//* 437  912:getfield        #483 <Field long w>
	//* 438  915:lstore          12
	//* 439  917:aload_0         
	//* 440  918:getfield        #163 <Field bdk v>
	//* 441  921:getfield        #485 <Field float bdk.b>
	//* 442  924:f2d             
	//* 443  925:dstore_2        
	//* 444  926:lload           8
	//* 445  928:aload_0         
	//* 446  929:getfield        #479 <Field long x>
	//* 447  932:lsub            
	//* 448  933:l2d             
	//* 449  934:dstore          4
	//* 450  936:dload_2         
	//* 451  937:invokestatic    #500 <Method boolean Double.isNaN(double)>
	//* 452  940:pop             
	//* 453  941:dload           4
	//* 454  943:invokestatic    #500 <Method boolean Double.isNaN(double)>
	//* 455  946:pop             
	//* 456  947:dload_2         
	//* 457  948:dload           4
	//* 458  950:dmul            
	//* 459  951:d2l             
	//* 460  952:lload           12
	//* 461  954:ladd            
	//* 462  955:lstore          8
	//* 463  957:lload           10
	//* 464  959:lload           8
	//* 465  961:ladd            
	//* 466  962:lreturn         
						// Misplaced declaration of an exception variable
						catch(Exception exception)
						{
							G = null;
						}
					F = l1;
				}
			}
		}
		long l2 = System.nanoTime() / 1000L;
		if(E)
		{
			l2 = c(l2 - j.e() / 1000L);
			l2 = b(j.f() + l2);
		} else
		{
			long l5;
			if(B == 0)
				l5 = j.c();
			else
				l5 = l2 + C;
			l2 = l5;
			if(!flag)
				l2 = l5 - R;
		}
		long l6 = P;
		while(!k.isEmpty() && l2 >= bem.b((bem)k.getFirst())) 
		{
			bem bem1 = (bem)k.remove();
			v = bem.a(bem1);
			x = bem.b(bem1);
			w = bem.c(bem1) - P;
		}
		if(v.b == 1.0F)
			l2 = (l2 + w) - x;
		else
		if(k.isEmpty() && e.j() >= 1024L)
		{
			long l8 = w;
			l2 = bnw.a(l2 - x, e.i(), e.j()) + l8;
		} else
		{
			long l9 = w;
			double d1 = v.b;
			double d2 = l2 - x;
			Double.isNaN(d1);
			Double.isNaN(d2);
			l2 = (long)(d1 * d2) + l9;
		}
		return l6 + l2;
	//* 467  963:astore          16
	//* 468  965:goto            627
	}

	public final bdk a(bdk bdk1)
	{
		if(r)
	//*   0    0:aload_0         
	//*   1    1:getfield        #316 <Field boolean r>
	//*   2    4:ifeq            19
		{
			v = bdk.a;
	//    3    7:aload_0         
	//    4    8:getstatic       #161 <Field bdk bdk.a>
	//    5   11:putfield        #163 <Field bdk v>
			return v;
	//    6   14:aload_0         
	//    7   15:getfield        #163 <Field bdk v>
	//    8   18:areturn         
		}
		bdk bdk2 = new bdk(e.a(bdk1.b), e.b(bdk1.c));
	//    9   19:new             #159 <Class bdk>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:getfield        #134 <Field bew e>
	//   13   27:aload_1         
	//   14   28:getfield        #485 <Field float bdk.b>
	//   15   31:invokevirtual   #504 <Method float bew.a(float)>
	//   16   34:aload_0         
	//   17   35:getfield        #134 <Field bew e>
	//   18   38:aload_1         
	//   19   39:getfield        #506 <Field float bdk.c>
	//   20   42:invokevirtual   #508 <Method float bew.b(float)>
	//   21   45:invokespecial   #511 <Method void bdk(float, float)>
	//   22   48:astore_2        
		bdk1 = u;
	//   23   49:aload_0         
	//   24   50:getfield        #513 <Field bdk u>
	//   25   53:astore_1        
		if(bdk1 == null)
	//*  26   54:aload_1         
	//*  27   55:ifnull          61
	//*  28   58:goto            93
			if(!k.isEmpty())
	//*  29   61:aload_0         
	//*  30   62:getfield        #176 <Field LinkedList k>
	//*  31   65:invokevirtual   #462 <Method boolean LinkedList.isEmpty()>
	//*  32   68:ifne            88
				bdk1 = bem.a((bem)k.getLast());
	//   33   71:aload_0         
	//   34   72:getfield        #176 <Field LinkedList k>
	//   35   75:invokevirtual   #516 <Method Object LinkedList.getLast()>
	//   36   78:checkcast       #468 <Class bem>
	//   37   81:invokestatic    #477 <Method bdk bem.a(bem)>
	//   38   84:astore_1        
			else
	//*  39   85:goto            93
				bdk1 = v;
	//   40   88:aload_0         
	//   41   89:getfield        #163 <Field bdk v>
	//   42   92:astore_1        
		if(!bdk2.equals(((Object) (bdk1))))
	//*  43   93:aload_2         
	//*  44   94:aload_1         
	//*  45   95:invokevirtual   #517 <Method boolean bdk.equals(Object)>
	//*  46   98:ifne            121
			if(n())
	//*  47  101:aload_0         
	//*  48  102:invokespecial   #351 <Method boolean n()>
	//*  49  105:ifeq            116
				u = bdk2;
	//   50  108:aload_0         
	//   51  109:aload_2         
	//   52  110:putfield        #513 <Field bdk u>
			else
	//*  53  113:goto            121
				v = bdk2;
	//   54  116:aload_0         
	//   55  117:aload_2         
	//   56  118:putfield        #163 <Field bdk v>
		return v;
	//   57  121:aload_0         
	//   58  122:getfield        #163 <Field bdk v>
	//   59  125:areturn         
	}

	public final void a()
	{
		ab = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #519 <Field boolean ab>
		if(n())
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #351 <Method boolean n()>
	//*   5    9:ifeq            30
		{
			Q = System.nanoTime() / 1000L;
	//    6   12:aload_0         
	//    7   13:invokestatic    #386 <Method long System.nanoTime()>
	//    8   16:ldc2w           #299 <Long 1000L>
	//    9   19:ldiv            
	//   10   20:putfield        #400 <Field long Q>
			l.play();
	//   11   23:aload_0         
	//   12   24:getfield        #263 <Field AudioTrack l>
	//   13   27:invokevirtual   #522 <Method void AudioTrack.play()>
		}
	//   14   30:return          
	}

	public final void a(float f1)
	{
		if(S != f1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #151 <Field float S>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			S = f1;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #151 <Field float S>
			m();
	//    8   14:aload_0         
	//    9   15:invokespecial   #525 <Method void m()>
		}
	//   10   18:return          
	}

	public final void a(int i1)
	{
		if(q == i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #155 <Field int q>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		q = i1;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #155 <Field int q>
		if(ad)
	//*   8   14:aload_0         
	//*   9   15:getfield        #269 <Field boolean ad>
	//*  10   18:ifeq            22
		{
			return;
	//   11   21:return          
		} else
		{
			i();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #527 <Method void i()>
			ac = 0;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #157 <Field int ac>
			return;
	//   17   31:return          
		}
	}

	public final void a(String s1, int i1, int j1, int k1, int l1, int ai[])
	{
		int i2;
		int j2;
		boolean flag;
		boolean flag1;
label0:
		{
			flag1 = "audio/raw".equals(((Object) (s1)));
	//    0    0:ldc2            #532 <String "audio/raw">
	//    1    3:aload_1         
	//    2    4:invokevirtual   #212 <Method boolean String.equals(Object)>
	//    3    7:istore          11
			flag = true;
	//    4    9:iconst_1        
	//    5   10:istore          10
			flag1 ^= true;
	//    6   12:iload           11
	//    7   14:iconst_1        
	//    8   15:ixor            
	//    9   16:istore          11
			if(flag1)
	//*  10   18:iload           11
	//*  11   20:ifeq            32
				l1 = b(s1);
	//   12   23:aload_1         
	//   13   24:invokestatic    #534 <Method int b(String)>
	//   14   27:istore          5
			else
	//*  15   29:goto            36
				l1 = k1;
	//   16   32:iload           4
	//   17   34:istore          5
			if(!flag1)
	//*  18   36:iload           11
	//*  19   38:ifne            191
			{
				H = bnw.b(k1, i1);
	//   20   41:aload_0         
	//   21   42:iload           4
	//   22   44:iload_2         
	//   23   45:invokestatic    #536 <Method int bnw.b(int, int)>
	//   24   48:putfield        #538 <Field int H>
				d.a(ai);
	//   25   51:aload_0         
	//   26   52:getfield        #129 <Field bep d>
	//   27   55:aload           6
	//   28   57:invokevirtual   #541 <Method void bep.a(int[])>
				s1 = ((String) (f));
	//   29   60:aload_0         
	//   30   61:getfield        #138 <Field bdv[] f>
	//   31   64:astore_1        
				int k2 = s1.length;
	//   32   65:aload_1         
	//   33   66:arraylength     
	//   34   67:istore          9
				k1 = l1;
	//   35   69:iload           5
	//   36   71:istore          4
				j2 = i1;
	//   37   73:iload_2         
	//   38   74:istore          8
				i2 = 0;
	//   39   76:iconst_0        
	//   40   77:istore          7
				l1 = 0;
	//   41   79:iconst_0        
	//   42   80:istore          5
				i1 = k1;
	//   43   82:iload           4
	//   44   84:istore_2        
				k1 = j2;
	//   45   85:iload           8
	//   46   87:istore          4
				while(i2 < k2) 
	//*  47   89:iload           7
	//*  48   91:iload           9
	//*  49   93:icmpge          168
				{
					ai = ((int []) (s1[i2]));
	//   50   96:aload_1         
	//   51   97:iload           7
	//   52   99:aaload          
	//   53  100:astore          6
					boolean flag2;
					try
					{
						flag2 = ((bdv) (ai)).a(j1, k1, i1);
	//   54  102:aload           6
	//   55  104:iload_3         
	//   56  105:iload           4
	//   57  107:iload_2         
	//   58  108:invokeinterface #544 <Method boolean bdv.a(int, int, int)>
	//   59  113:istore          12
					}
	//*  60  115:iload           5
	//*  61  117:iload           12
	//*  62  119:ior             
	//*  63  120:istore          5
	//*  64  122:aload           6
	//*  65  124:invokeinterface #330 <Method boolean bdv.a()>
	//*  66  129:ifeq            149
	//*  67  132:aload           6
	//*  68  134:invokeinterface #546 <Method int bdv.b()>
	//*  69  139:istore          4
	//*  70  141:aload           6
	//*  71  143:invokeinterface #548 <Method int bdv.c()>
	//*  72  148:istore_2        
	//*  73  149:iload           7
	//*  74  151:iconst_1        
	//*  75  152:iadd            
	//*  76  153:istore          7
	//*  77  155:goto            89
					// Misplaced declaration of an exception variable
					catch(String s1)
	//*  78  158:astore_1        
					{
						throw new bej(((Throwable) (s1)));
	//   79  159:new             #550 <Class bej>
	//   80  162:dup             
	//   81  163:aload_1         
	//   82  164:invokespecial   #553 <Method void bej(Throwable)>
	//   83  167:athrow          
					}
					l1 |= ((int) (flag2));
					if(((bdv) (ai)).a())
					{
						k1 = ((bdv) (ai)).b();
						i1 = ((bdv) (ai)).c();
					}
					i2++;
				}
				if(l1 != 0)
	//*  84  168:iload           5
	//*  85  170:ifeq            177
					k();
	//   86  173:aload_0         
	//   87  174:invokespecial   #555 <Method void k()>
				j2 = l1;
	//   88  177:iload           5
	//   89  179:istore          8
				l1 = i1;
	//   90  181:iload_2         
	//   91  182:istore          5
				i2 = k1;
	//   92  184:iload           4
	//   93  186:istore          7
			} else
	//*  94  188:goto            197
			{
				j2 = 0;
	//   95  191:iconst_0        
	//   96  192:istore          8
				i2 = i1;
	//   97  194:iload_2         
	//   98  195:istore          7
			}
			char c1 = '\374';
	//   99  197:sipush          252
	//  100  200:istore          9
			switch(i2)
	//* 101  202:iload           7
			{
	//* 102  204:tableswitch     1 8: default 252
	//	               1 336
	//	               2 330
	//	               3 324
	//	               4 317
	//	               5 310
	//	               6 303
	//	               7 296
	//	               8 289
			default:
				s1 = ((String) (new StringBuilder(38)));
	//  103  252:new             #407 <Class StringBuilder>
	//  104  255:dup             
	//  105  256:bipush          38
	//  106  258:invokespecial   #408 <Method void StringBuilder(int)>
	//  107  261:astore_1        
				((StringBuilder) (s1)).append("Unsupported channel count: ");
	//  108  262:aload_1         
	//  109  263:ldc2            #557 <String "Unsupported channel count: ">
	//  110  266:invokevirtual   #414 <Method StringBuilder StringBuilder.append(String)>
	//  111  269:pop             
				((StringBuilder) (s1)).append(i2);
	//  112  270:aload_1         
	//  113  271:iload           7
	//  114  273:invokevirtual   #560 <Method StringBuilder StringBuilder.append(int)>
	//  115  276:pop             
				throw new bej(((StringBuilder) (s1)).toString());
	//  116  277:new             #550 <Class bej>
	//  117  280:dup             
	//  118  281:aload_1         
	//  119  282:invokevirtual   #425 <Method String StringBuilder.toString()>
	//  120  285:invokespecial   #563 <Method void bej(String)>
	//  121  288:athrow          

			case 8: // '\b'
				i1 = bcr.a;
	//  122  289:getstatic       #566 <Field int bcr.a>
	//  123  292:istore_2        
				break;

	//* 124  293:goto            338
			case 7: // '\007'
				i1 = 1276;
	//  125  296:sipush          1276
	//  126  299:istore_2        
				break;

	//* 127  300:goto            338
			case 6: // '\006'
				i1 = 252;
	//  128  303:sipush          252
	//  129  306:istore_2        
				break;

	//* 130  307:goto            338
			case 5: // '\005'
				i1 = 220;
	//  131  310:sipush          220
	//  132  313:istore_2        
				break;

	//* 133  314:goto            338
			case 4: // '\004'
				i1 = 204;
	//  134  317:sipush          204
	//  135  320:istore_2        
				break;

	//* 136  321:goto            338
			case 3: // '\003'
				i1 = 28;
	//  137  324:bipush          28
	//  138  326:istore_2        
				break;

	//* 139  327:goto            338
			case 2: // '\002'
				i1 = 12;
	//  140  330:bipush          12
	//  141  332:istore_2        
				break;

	//* 142  333:goto            338
			case 1: // '\001'
				i1 = 4;
	//  143  336:iconst_4        
	//  144  337:istore_2        
				break;
			}
			if(bnw.a <= 23 && "foster".equals(((Object) (bnw.b))) && "NVIDIA".equals(((Object) (bnw.c))))
	//* 145  338:getstatic       #102 <Field int bnw.a>
	//* 146  341:bipush          23
	//* 147  343:icmpgt          408
	//* 148  346:ldc2            #568 <String "foster">
	//* 149  349:getstatic       #571 <Field String bnw.b>
	//* 150  352:invokevirtual   #212 <Method boolean String.equals(Object)>
	//* 151  355:ifeq            408
	//* 152  358:ldc2            #573 <String "NVIDIA">
	//* 153  361:getstatic       #575 <Field String bnw.c>
	//* 154  364:invokevirtual   #212 <Method boolean String.equals(Object)>
	//* 155  367:ifeq            408
			{
				k1 = ((int) (c1));
	//  156  370:iload           9
	//  157  372:istore          4
				if(i2 == 3)
					break label0;
	//  158  374:iload           7
	//  159  376:iconst_3        
	//  160  377:icmpeq          411
				k1 = ((int) (c1));
	//  161  380:iload           9
	//  162  382:istore          4
				if(i2 == 5)
					break label0;
	//  163  384:iload           7
	//  164  386:iconst_5        
	//  165  387:icmpeq          411
				if(i2 == 7)
	//* 166  390:iload           7
	//* 167  392:bipush          7
	//* 168  394:icmpeq          400
	//* 169  397:goto            408
				{
					k1 = bcr.a;
	//  170  400:getstatic       #566 <Field int bcr.a>
	//  171  403:istore          4
					break label0;
	//  172  405:goto            411
				}
			}
			k1 = i1;
	//  173  408:iload_2         
	//  174  409:istore          4
		}
		i1 = k1;
	//  175  411:iload           4
	//  176  413:istore_2        
		if(bnw.a <= 25)
	//* 177  414:getstatic       #102 <Field int bnw.a>
	//* 178  417:bipush          25
	//* 179  419:icmpgt          457
		{
			i1 = k1;
	//  180  422:iload           4
	//  181  424:istore_2        
			if("fugu".equals(((Object) (bnw.b))))
	//* 182  425:ldc2            #577 <String "fugu">
	//* 183  428:getstatic       #571 <Field String bnw.b>
	//* 184  431:invokevirtual   #212 <Method boolean String.equals(Object)>
	//* 185  434:ifeq            457
			{
				i1 = k1;
	//  186  437:iload           4
	//  187  439:istore_2        
				if(flag1)
	//* 188  440:iload           11
	//* 189  442:ifeq            457
				{
					i1 = k1;
	//  190  445:iload           4
	//  191  447:istore_2        
					if(i2 == 1)
	//* 192  448:iload           7
	//* 193  450:iconst_1        
	//* 194  451:icmpne          457
						i1 = 12;
	//  195  454:bipush          12
	//  196  456:istore_2        
				}
			}
		}
		if(j2 == 0 && n() && o == l1 && m == j1 && n == i1)
	//* 197  457:iload           8
	//* 198  459:ifne            495
	//* 199  462:aload_0         
	//* 200  463:invokespecial   #351 <Method boolean n()>
	//* 201  466:ifeq            495
	//* 202  469:aload_0         
	//* 203  470:getfield        #579 <Field int o>
	//* 204  473:iload           5
	//* 205  475:icmpne          495
	//* 206  478:aload_0         
	//* 207  479:getfield        #223 <Field int m>
	//* 208  482:iload_3         
	//* 209  483:icmpne          495
	//* 210  486:aload_0         
	//* 211  487:getfield        #581 <Field int n>
	//* 212  490:iload_2         
	//* 213  491:icmpne          495
			return;
	//  214  494:return          
		i();
	//  215  495:aload_0         
	//  216  496:invokevirtual   #527 <Method void i()>
		o = l1;
	//  217  499:aload_0         
	//  218  500:iload           5
	//  219  502:putfield        #579 <Field int o>
		r = flag1;
	//  220  505:aload_0         
	//  221  506:iload           11
	//  222  508:putfield        #316 <Field boolean r>
		m = j1;
	//  223  511:aload_0         
	//  224  512:iload_3         
	//  225  513:putfield        #223 <Field int m>
		n = i1;
	//  226  516:aload_0         
	//  227  517:iload_2         
	//  228  518:putfield        #581 <Field int n>
		if(!flag1)
	//* 229  521:iload           11
	//* 230  523:ifeq            529
	//* 231  526:goto            532
			l1 = 2;
	//  232  529:iconst_2        
	//  233  530:istore          5
		p = l1;
	//  234  532:aload_0         
	//  235  533:iload           5
	//  236  535:putfield        #373 <Field int p>
		K = bnw.b(2, i2);
	//  237  538:aload_0         
	//  238  539:iconst_2        
	//  239  540:iload           7
	//  240  542:invokestatic    #536 <Method int bnw.b(int, int)>
	//  241  545:putfield        #253 <Field int K>
		if(flag1)
	//* 242  548:iload           11
	//* 243  550:ifeq            586
		{
			i1 = p;
	//  244  553:aload_0         
	//  245  554:getfield        #373 <Field int p>
	//  246  557:istore_2        
			if(i1 != 5 && i1 != 6)
	//* 247  558:iload_2         
	//* 248  559:iconst_5        
	//* 249  560:icmpeq          579
	//* 250  563:iload_2         
	//* 251  564:bipush          6
	//* 252  566:icmpne          572
	//* 253  569:goto            579
				i1 = 49152;
	//  254  572:ldc2            #582 <Int 49152>
	//  255  575:istore_2        
			else
	//* 256  576:goto            680
				i1 = 20480;
	//  257  579:sipush          20480
	//  258  582:istore_2        
		} else
	//* 259  583:goto            680
		{
			k1 = AudioTrack.getMinBufferSize(j1, i1, p);
	//  260  586:iload_3         
	//  261  587:iload_2         
	//  262  588:aload_0         
	//  263  589:getfield        #373 <Field int p>
	//  264  592:invokestatic    #586 <Method int AudioTrack.getMinBufferSize(int, int, int)>
	//  265  595:istore          4
			if(k1 == -2)
	//* 266  597:iload           4
	//* 267  599:bipush          -2
	//* 268  601:icmpeq          607
	//* 269  604:goto            610
				flag = false;
	//  270  607:iconst_0        
	//  271  608:istore          10
			bnf.b(flag);
	//  272  610:iload           10
	//  273  612:invokestatic    #273 <Method void bnf.b(boolean)>
			i1 = k1 << 2;
	//  274  615:iload           4
	//  275  617:iconst_2        
	//  276  618:ishl            
	//  277  619:istore_2        
			j1 = (int)c(0x3d090L);
	//  278  620:aload_0         
	//  279  621:ldc2w           #587 <Long 0x3d090L>
	//  280  624:invokespecial   #457 <Method long c(long)>
	//  281  627:l2i             
	//  282  628:istore_3        
			j1 = K * j1;
	//  283  629:aload_0         
	//  284  630:getfield        #253 <Field int K>
	//  285  633:iload_3         
	//  286  634:imul            
	//  287  635:istore_3        
			k1 = (int)Math.max(k1, c(0xb71b0L) * (long)K);
	//  288  636:iload           4
	//  289  638:i2l             
	//  290  639:aload_0         
	//  291  640:ldc2w           #589 <Long 0xb71b0L>
	//  292  643:invokespecial   #457 <Method long c(long)>
	//  293  646:aload_0         
	//  294  647:getfield        #253 <Field int K>
	//  295  650:i2l             
	//  296  651:lmul            
	//  297  652:invokestatic    #453 <Method long Math.max(long, long)>
	//  298  655:l2i             
	//  299  656:istore          4
			if(i1 < j1)
	//* 300  658:iload_2         
	//* 301  659:iload_3         
	//* 302  660:icmpge          668
				i1 = j1;
	//  303  663:iload_3         
	//  304  664:istore_2        
			else
	//* 305  665:goto            680
			if(i1 > k1)
	//* 306  668:iload_2         
	//* 307  669:iload           4
	//* 308  671:icmple          680
				i1 = k1;
	//  309  674:iload           4
	//  310  676:istore_2        
		}
	//* 311  677:goto            680
		s = i1;
	//  312  680:aload_0         
	//  313  681:iload_2         
	//  314  682:putfield        #255 <Field int s>
		long l2;
		if(flag1)
	//* 315  685:iload           11
	//* 316  687:ifeq            698
			l2 = 0x1L;
	//  317  690:ldc2w           #270 <Long 0x1L>
	//  318  693:lstore          13
		else
	//* 319  695:goto            714
			l2 = b(s / K);
	//  320  698:aload_0         
	//  321  699:aload_0         
	//  322  700:getfield        #255 <Field int s>
	//  323  703:aload_0         
	//  324  704:getfield        #253 <Field int K>
	//  325  707:idiv            
	//  326  708:i2l             
	//  327  709:invokespecial   #432 <Method long b(long)>
	//  328  712:lstore          13
		t = l2;
	//  329  714:aload_0         
	//  330  715:lload           13
	//  331  717:putfield        #447 <Field long t>
		a(v);
	//  332  720:aload_0         
	//  333  721:aload_0         
	//  334  722:getfield        #163 <Field bdk v>
	//  335  725:invokevirtual   #592 <Method bdk a(bdk)>
	//  336  728:pop             
	//  337  729:return          
	}

	public final boolean a(String s1)
	{
		bdu bdu1 = c;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field bdu c>
	//    2    4:astore_2        
		return bdu1 != null && bdu1.a(b(s1));
	//    3    5:aload_2         
	//    4    6:ifnull          22
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokestatic    #534 <Method int b(String)>
	//    8   14:invokevirtual   #598 <Method boolean bdu.a(int)>
	//    9   17:ifeq            22
	//   10   20:iconst_1        
	//   11   21:ireturn         
	//   12   22:iconst_0        
	//   13   23:ireturn         
	}

	public final boolean a(ByteBuffer bytebuffer, long l1)
	{
		ByteBuffer bytebuffer1 = V;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field ByteBuffer V>
	//    2    4:astore          14
		boolean flag;
		if(bytebuffer1 != null && bytebuffer != bytebuffer1)
	//*   3    6:aload           14
	//*   4    8:ifnull          26
	//*   5   11:aload_1         
	//*   6   12:aload           14
	//*   7   14:if_acmpne       20
	//*   8   17:goto            26
			flag = false;
	//    9   20:iconst_0        
	//   10   21:istore          13
		else
	//*  11   23:goto            29
			flag = true;
	//   12   26:iconst_1        
	//   13   27:istore          13
		bnf.a(flag);
	//   14   29:iload           13
	//   15   31:invokestatic    #229 <Method void bnf.a(boolean)>
		if(n()) goto _L2; else goto _L1
	//   16   34:aload_0         
	//   17   35:invokespecial   #351 <Method boolean n()>
	//   18   38:ifne            370
_L1:
		int k1;
		h.block();
	//   19   41:aload_0         
	//   20   42:getfield        #98  <Field ConditionVariable h>
	//   21   45:invokevirtual   #601 <Method void ConditionVariable.block()>
		if(ad)
	//*  22   48:aload_0         
	//*  23   49:getfield        #269 <Field boolean ad>
	//*  24   52:ifeq            152
		{
			int i1 = m;
	//   25   55:aload_0         
	//   26   56:getfield        #223 <Field int m>
	//   27   59:istore          4
			int j2 = n;
	//   28   61:aload_0         
	//   29   62:getfield        #581 <Field int n>
	//   30   65:istore          5
			int k2 = p;
	//   31   67:aload_0         
	//   32   68:getfield        #373 <Field int p>
	//   33   71:istore          6
			int l2 = s;
	//   34   73:aload_0         
	//   35   74:getfield        #255 <Field int s>
	//   36   77:istore          7
			int i3 = ac;
	//   37   79:aload_0         
	//   38   80:getfield        #157 <Field int ac>
	//   39   83:istore          8
			l = new AudioTrack((new android.media.AudioAttributes.Builder()).setUsage(1).setContentType(3).setFlags(16).build(), (new android.media.AudioFormat.Builder()).setChannelMask(j2).setEncoding(k2).setSampleRate(i1).build(), l2, 1, i3);
	//   40   85:aload_0         
	//   41   86:new             #104 <Class AudioTrack>
	//   42   89:dup             
	//   43   90:new             #603 <Class android.media.AudioAttributes$Builder>
	//   44   93:dup             
	//   45   94:invokespecial   #604 <Method void android.media.AudioAttributes$Builder()>
	//   46   97:iconst_1        
	//   47   98:invokevirtual   #608 <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setUsage(int)>
	//   48  101:iconst_3        
	//   49  102:invokevirtual   #611 <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setContentType(int)>
	//   50  105:bipush          16
	//   51  107:invokevirtual   #614 <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setFlags(int)>
	//   52  110:invokevirtual   #618 <Method android.media.AudioAttributes android.media.AudioAttributes$Builder.build()>
	//   53  113:new             #620 <Class android.media.AudioFormat$Builder>
	//   54  116:dup             
	//   55  117:invokespecial   #621 <Method void android.media.AudioFormat$Builder()>
	//   56  120:iload           5
	//   57  122:invokevirtual   #625 <Method android.media.AudioFormat$Builder android.media.AudioFormat$Builder.setChannelMask(int)>
	//   58  125:iload           6
	//   59  127:invokevirtual   #628 <Method android.media.AudioFormat$Builder android.media.AudioFormat$Builder.setEncoding(int)>
	//   60  130:iload           4
	//   61  132:invokevirtual   #631 <Method android.media.AudioFormat$Builder android.media.AudioFormat$Builder.setSampleRate(int)>
	//   62  135:invokevirtual   #634 <Method android.media.AudioFormat android.media.AudioFormat$Builder.build()>
	//   63  138:iload           7
	//   64  140:iconst_1        
	//   65  141:iload           8
	//   66  143:invokespecial   #637 <Method void AudioTrack(android.media.AudioAttributes, android.media.AudioFormat, int, int, int)>
	//   67  146:putfield        #263 <Field AudioTrack l>
		} else
	//*  68  149:goto            232
		{
			int j1 = ac;
	//   69  152:aload_0         
	//   70  153:getfield        #157 <Field int ac>
	//   71  156:istore          4
			if(j1 == 0)
	//*  72  158:iload           4
	//*  73  160:ifne            198
				l = new AudioTrack(q, m, n, p, s, 1);
	//   74  163:aload_0         
	//   75  164:new             #104 <Class AudioTrack>
	//   76  167:dup             
	//   77  168:aload_0         
	//   78  169:getfield        #155 <Field int q>
	//   79  172:aload_0         
	//   80  173:getfield        #223 <Field int m>
	//   81  176:aload_0         
	//   82  177:getfield        #581 <Field int n>
	//   83  180:aload_0         
	//   84  181:getfield        #373 <Field int p>
	//   85  184:aload_0         
	//   86  185:getfield        #255 <Field int s>
	//   87  188:iconst_1        
	//   88  189:invokespecial   #640 <Method void AudioTrack(int, int, int, int, int, int)>
	//   89  192:putfield        #263 <Field AudioTrack l>
			else
	//*  90  195:goto            232
				l = new AudioTrack(q, m, n, p, s, 1, j1);
	//   91  198:aload_0         
	//   92  199:new             #104 <Class AudioTrack>
	//   93  202:dup             
	//   94  203:aload_0         
	//   95  204:getfield        #155 <Field int q>
	//   96  207:aload_0         
	//   97  208:getfield        #223 <Field int m>
	//   98  211:aload_0         
	//   99  212:getfield        #581 <Field int n>
	//  100  215:aload_0         
	//  101  216:getfield        #373 <Field int p>
	//  102  219:aload_0         
	//  103  220:getfield        #255 <Field int s>
	//  104  223:iconst_1        
	//  105  224:iload           4
	//  106  226:invokespecial   #643 <Method void AudioTrack(int, int, int, int, int, int, int)>
	//  107  229:putfield        #263 <Field AudioTrack l>
		}
		k1 = l.getState();
	//  108  232:aload_0         
	//  109  233:getfield        #263 <Field AudioTrack l>
	//  110  236:invokevirtual   #646 <Method int AudioTrack.getState()>
	//  111  239:istore          4
		if(k1 != 1) goto _L4; else goto _L3
	//  112  241:iload           4
	//  113  243:iconst_1        
	//  114  244:icmpne          320
_L3:
		k1 = l.getAudioSessionId();
	//  115  247:aload_0         
	//  116  248:getfield        #263 <Field AudioTrack l>
	//  117  251:invokevirtual   #649 <Method int AudioTrack.getAudioSessionId()>
	//  118  254:istore          4
		if(ac != k1)
	//* 119  256:aload_0         
	//* 120  257:getfield        #157 <Field int ac>
	//* 121  260:iload           4
	//* 122  262:icmpeq          282
		{
			ac = k1;
	//  123  265:aload_0         
	//  124  266:iload           4
	//  125  268:putfield        #157 <Field int ac>
			g.a(k1);
	//  126  271:aload_0         
	//  127  272:getfield        #91  <Field bel g>
	//  128  275:iload           4
	//  129  277:invokeinterface #653 <Method void bel.a(int)>
		}
		j.a(l, q());
	//  130  282:aload_0         
	//  131  283:getfield        #119 <Field beh j>
	//  132  286:aload_0         
	//  133  287:getfield        #263 <Field AudioTrack l>
	//  134  290:aload_0         
	//  135  291:invokespecial   #390 <Method boolean q()>
	//  136  294:invokevirtual   #656 <Method void beh.a(AudioTrack, boolean)>
		m();
	//  137  297:aload_0         
	//  138  298:invokespecial   #525 <Method void m()>
		ae = false;
	//  139  301:aload_0         
	//  140  302:iconst_0        
	//  141  303:putfield        #658 <Field boolean ae>
		if(ab)
	//* 142  306:aload_0         
	//* 143  307:getfield        #519 <Field boolean ab>
	//* 144  310:ifeq            370
			a();
	//  145  313:aload_0         
	//  146  314:invokevirtual   #660 <Method void a()>
		  goto _L2
	//* 147  317:goto            370
_L4:
		l.release();
	//  148  320:aload_0         
	//  149  321:getfield        #263 <Field AudioTrack l>
	//  150  324:invokevirtual   #663 <Method void AudioTrack.release()>
		l = null;
	//  151  327:aload_0         
	//  152  328:aconst_null     
	//  153  329:putfield        #263 <Field AudioTrack l>
		  goto _L5
	//* 154  332:goto            348
		bytebuffer;
	//  155  335:astore_1        
		l = null;
	//  156  336:aload_0         
	//  157  337:aconst_null     
	//  158  338:putfield        #263 <Field AudioTrack l>
		throw bytebuffer;
	//  159  341:aload_1         
	//  160  342:athrow          
_L7:
		l = null;
	//  161  343:aload_0         
	//  162  344:aconst_null     
	//  163  345:putfield        #263 <Field AudioTrack l>
_L5:
		throw new bek(k1, m, n, s);
	//  164  348:new             #665 <Class bek>
	//  165  351:dup             
	//  166  352:iload           4
	//  167  354:aload_0         
	//  168  355:getfield        #223 <Field int m>
	//  169  358:aload_0         
	//  170  359:getfield        #581 <Field int n>
	//  171  362:aload_0         
	//  172  363:getfield        #255 <Field int s>
	//  173  366:invokespecial   #668 <Method void bek(int, int, int, int)>
	//  174  369:athrow          
_L2:
		if(q())
	//* 175  370:aload_0         
	//* 176  371:invokespecial   #390 <Method boolean q()>
	//* 177  374:ifeq            420
		{
			if(l.getPlayState() == 2)
	//* 178  377:aload_0         
	//* 179  378:getfield        #263 <Field AudioTrack l>
	//* 180  381:invokevirtual   #381 <Method int AudioTrack.getPlayState()>
	//* 181  384:iconst_2        
	//* 182  385:icmpne          395
			{
				ae = false;
	//  183  388:aload_0         
	//  184  389:iconst_0        
	//  185  390:putfield        #658 <Field boolean ae>
				return false;
	//  186  393:iconst_0        
	//  187  394:ireturn         
			}
			if(l.getPlayState() == 1 && j.b() != 0L)
	//* 188  395:aload_0         
	//* 189  396:getfield        #263 <Field AudioTrack l>
	//* 190  399:invokevirtual   #381 <Method int AudioTrack.getPlayState()>
	//* 191  402:iconst_1        
	//* 192  403:icmpne          420
	//* 193  406:aload_0         
	//* 194  407:getfield        #119 <Field beh j>
	//* 195  410:invokevirtual   #251 <Method long beh.b()>
	//* 196  413:lconst_0        
	//* 197  414:lcmp            
	//* 198  415:ifeq            420
				return false;
	//  199  418:iconst_0        
	//  200  419:ireturn         
		}
		boolean flag1 = ae;
	//  201  420:aload_0         
	//  202  421:getfield        #658 <Field boolean ae>
	//  203  424:istore          13
		ae = e();
	//  204  426:aload_0         
	//  205  427:aload_0         
	//  206  428:invokevirtual   #670 <Method boolean e()>
	//  207  431:putfield        #658 <Field boolean ae>
		if(flag1 && !ae && l.getPlayState() != 1)
	//* 208  434:iload           13
	//* 209  436:ifeq            493
	//* 210  439:aload_0         
	//* 211  440:getfield        #658 <Field boolean ae>
	//* 212  443:ifne            493
	//* 213  446:aload_0         
	//* 214  447:getfield        #263 <Field AudioTrack l>
	//* 215  450:invokevirtual   #381 <Method int AudioTrack.getPlayState()>
	//* 216  453:iconst_1        
	//* 217  454:icmpeq          493
		{
			long l3 = SystemClock.elapsedRealtime();
	//  218  457:invokestatic    #312 <Method long SystemClock.elapsedRealtime()>
	//  219  460:lstore          9
			long l5 = af;
	//  220  462:aload_0         
	//  221  463:getfield        #314 <Field long af>
	//  222  466:lstore          11
			g.a(s, bcr.a(t), l3 - l5);
	//  223  468:aload_0         
	//  224  469:getfield        #91  <Field bel g>
	//  225  472:aload_0         
	//  226  473:getfield        #255 <Field int s>
	//  227  476:aload_0         
	//  228  477:getfield        #447 <Field long t>
	//  229  480:invokestatic    #672 <Method long bcr.a(long)>
	//  230  483:lload           9
	//  231  485:lload           11
	//  232  487:lsub            
	//  233  488:invokeinterface #675 <Method void bel.a(int, long, long)>
		}
		if(V == null)
	//* 234  493:aload_0         
	//* 235  494:getfield        #180 <Field ByteBuffer V>
	//* 236  497:ifnonnull       928
		{
			if(!bytebuffer.hasRemaining())
	//* 237  500:aload_1         
	//* 238  501:invokevirtual   #195 <Method boolean ByteBuffer.hasRemaining()>
	//* 239  504:ifne            509
				return true;
	//  240  507:iconst_1        
	//  241  508:ireturn         
			if(r && N == 0)
	//* 242  509:aload_0         
	//* 243  510:getfield        #316 <Field boolean r>
	//* 244  513:ifeq            625
	//* 245  516:aload_0         
	//* 246  517:getfield        #320 <Field int N>
	//* 247  520:ifne            625
			{
				int i2 = p;
	//  248  523:aload_0         
	//  249  524:getfield        #373 <Field int p>
	//  250  527:istore          4
				if(i2 != 7 && i2 != 8)
	//* 251  529:iload           4
	//* 252  531:bipush          7
	//* 253  533:icmpeq          613
	//* 254  536:iload           4
	//* 255  538:bipush          8
	//* 256  540:icmpne          546
	//* 257  543:goto            613
				{
					if(i2 == 5)
	//* 258  546:iload           4
	//* 259  548:iconst_5        
	//* 260  549:icmpne          560
						i2 = bdt.a();
	//  261  552:invokestatic    #679 <Method int bdt.a()>
	//  262  555:istore          4
					else
	//* 263  557:goto            619
					if(i2 == 6)
	//* 264  560:iload           4
	//* 265  562:bipush          6
	//* 266  564:icmpne          576
					{
						i2 = bdt.a(bytebuffer);
	//  267  567:aload_1         
	//  268  568:invokestatic    #682 <Method int bdt.a(ByteBuffer)>
	//  269  571:istore          4
					} else
	//* 270  573:goto            619
					{
						bytebuffer = ((ByteBuffer) (new StringBuilder(38)));
	//  271  576:new             #407 <Class StringBuilder>
	//  272  579:dup             
	//  273  580:bipush          38
	//  274  582:invokespecial   #408 <Method void StringBuilder(int)>
	//  275  585:astore_1        
						((StringBuilder) (bytebuffer)).append("Unexpected audio encoding: ");
	//  276  586:aload_1         
	//  277  587:ldc2            #684 <String "Unexpected audio encoding: ">
	//  278  590:invokevirtual   #414 <Method StringBuilder StringBuilder.append(String)>
	//  279  593:pop             
						((StringBuilder) (bytebuffer)).append(i2);
	//  280  594:aload_1         
	//  281  595:iload           4
	//  282  597:invokevirtual   #560 <Method StringBuilder StringBuilder.append(int)>
	//  283  600:pop             
						throw new IllegalStateException(((StringBuilder) (bytebuffer)).toString());
	//  284  601:new             #686 <Class IllegalStateException>
	//  285  604:dup             
	//  286  605:aload_1         
	//  287  606:invokevirtual   #425 <Method String StringBuilder.toString()>
	//  288  609:invokespecial   #687 <Method void IllegalStateException(String)>
	//  289  612:athrow          
					}
				} else
				{
					i2 = beq.a(bytebuffer);
	//  290  613:aload_1         
	//  291  614:invokestatic    #690 <Method int beq.a(ByteBuffer)>
	//  292  617:istore          4
				}
				N = i2;
	//  293  619:aload_0         
	//  294  620:iload           4
	//  295  622:putfield        #320 <Field int N>
			}
			if(u != null)
	//* 296  625:aload_0         
	//* 297  626:getfield        #513 <Field bdk u>
	//* 298  629:ifnull          683
			{
				if(!l())
	//* 299  632:aload_0         
	//* 300  633:invokespecial   #692 <Method boolean l()>
	//* 301  636:ifne            641
					return false;
	//  302  639:iconst_0        
	//  303  640:ireturn         
				k.add(((Object) (new bem(u, Math.max(0L, l1), b(o()), ((beg) (null))))));
	//  304  641:aload_0         
	//  305  642:getfield        #176 <Field LinkedList k>
	//  306  645:new             #468 <Class bem>
	//  307  648:dup             
	//  308  649:aload_0         
	//  309  650:getfield        #513 <Field bdk u>
	//  310  653:lconst_0        
	//  311  654:lload_2         
	//  312  655:invokestatic    #453 <Method long Math.max(long, long)>
	//  313  658:aload_0         
	//  314  659:aload_0         
	//  315  660:invokespecial   #694 <Method long o()>
	//  316  663:invokespecial   #432 <Method long b(long)>
	//  317  666:aconst_null     
	//  318  667:invokespecial   #697 <Method void bem(bdk, long, long, beg)>
	//  319  670:invokevirtual   #698 <Method boolean LinkedList.add(Object)>
	//  320  673:pop             
				u = null;
	//  321  674:aload_0         
	//  322  675:aconst_null     
	//  323  676:putfield        #513 <Field bdk u>
				k();
	//  324  679:aload_0         
	//  325  680:invokespecial   #555 <Method void k()>
			}
			if(O == 0)
	//* 326  683:aload_0         
	//* 327  684:getfield        #153 <Field int O>
	//* 328  687:ifne            707
			{
				P = Math.max(0L, l1);
	//  329  690:aload_0         
	//  330  691:lconst_0        
	//  331  692:lload_2         
	//  332  693:invokestatic    #453 <Method long Math.max(long, long)>
	//  333  696:putfield        #459 <Field long P>
				O = 1;
	//  334  699:aload_0         
	//  335  700:iconst_1        
	//  336  701:putfield        #153 <Field int O>
			} else
	//* 337  704:goto            885
			{
				long l6 = P;
	//  338  707:aload_0         
	//  339  708:getfield        #459 <Field long P>
	//  340  711:lstore          11
				long l4;
				if(r)
	//* 341  713:aload_0         
	//* 342  714:getfield        #316 <Field boolean r>
	//* 343  717:ifeq            729
					l4 = J;
	//  344  720:aload_0         
	//  345  721:getfield        #700 <Field long J>
	//  346  724:lstore          9
				else
	//* 347  726:goto            741
					l4 = I / (long)H;
	//  348  729:aload_0         
	//  349  730:getfield        #702 <Field long I>
	//  350  733:aload_0         
	//  351  734:getfield        #538 <Field int H>
	//  352  737:i2l             
	//  353  738:ldiv            
	//  354  739:lstore          9
				l4 = l6 + b(l4);
	//  355  741:lload           11
	//  356  743:aload_0         
	//  357  744:lload           9
	//  358  746:invokespecial   #432 <Method long b(long)>
	//  359  749:ladd            
	//  360  750:lstore          9
				if(O == 1 && Math.abs(l4 - l1) > 0x30d40L)
	//* 361  752:aload_0         
	//* 362  753:getfield        #153 <Field int O>
	//* 363  756:iconst_1        
	//* 364  757:icmpne          850
	//* 365  760:lload           9
	//* 366  762:lload_2         
	//* 367  763:lsub            
	//* 368  764:invokestatic    #403 <Method long Math.abs(long)>
	//* 369  767:ldc2w           #703 <Long 0x30d40L>
	//* 370  770:lcmp            
	//* 371  771:ifle            847
				{
					StringBuilder stringbuilder = new StringBuilder(80);
	//  372  774:new             #407 <Class StringBuilder>
	//  373  777:dup             
	//  374  778:bipush          80
	//  375  780:invokespecial   #408 <Method void StringBuilder(int)>
	//  376  783:astore          14
					stringbuilder.append("Discontinuity detected [expected ");
	//  377  785:aload           14
	//  378  787:ldc2            #706 <String "Discontinuity detected [expected ">
	//  379  790:invokevirtual   #414 <Method StringBuilder StringBuilder.append(String)>
	//  380  793:pop             
					stringbuilder.append(l4);
	//  381  794:aload           14
	//  382  796:lload           9
	//  383  798:invokevirtual   #417 <Method StringBuilder StringBuilder.append(long)>
	//  384  801:pop             
					stringbuilder.append(", got ");
	//  385  802:aload           14
	//  386  804:ldc2            #708 <String ", got ">
	//  387  807:invokevirtual   #414 <Method StringBuilder StringBuilder.append(String)>
	//  388  810:pop             
					stringbuilder.append(l1);
	//  389  811:aload           14
	//  390  813:lload_2         
	//  391  814:invokevirtual   #417 <Method StringBuilder StringBuilder.append(long)>
	//  392  817:pop             
					stringbuilder.append("]");
	//  393  818:aload           14
	//  394  820:ldc2            #710 <String "]">
	//  395  823:invokevirtual   #414 <Method StringBuilder StringBuilder.append(String)>
	//  396  826:pop             
					Log.e("AudioTrack", stringbuilder.toString());
	//  397  827:ldc2            #421 <String "AudioTrack">
	//  398  830:aload           14
	//  399  832:invokevirtual   #425 <Method String StringBuilder.toString()>
	//  400  835:invokestatic    #712 <Method int Log.e(String, String)>
	//  401  838:pop             
					O = 2;
	//  402  839:aload_0         
	//  403  840:iconst_2        
	//  404  841:putfield        #153 <Field int O>
				}
	//* 405  844:goto            850
	//* 406  847:goto            850
				if(O == 2)
	//* 407  850:aload_0         
	//* 408  851:getfield        #153 <Field int O>
	//* 409  854:iconst_2        
	//* 410  855:icmpne          885
				{
					P = P + (l1 - l4);
	//  411  858:aload_0         
	//  412  859:aload_0         
	//  413  860:getfield        #459 <Field long P>
	//  414  863:lload_2         
	//  415  864:lload           9
	//  416  866:lsub            
	//  417  867:ladd            
	//  418  868:putfield        #459 <Field long P>
					O = 1;
	//  419  871:aload_0         
	//  420  872:iconst_1        
	//  421  873:putfield        #153 <Field int O>
					g.a();
	//  422  876:aload_0         
	//  423  877:getfield        #91  <Field bel g>
	//  424  880:invokeinterface #713 <Method void bel.a()>
				}
			}
			if(r)
	//* 425  885:aload_0         
	//* 426  886:getfield        #316 <Field boolean r>
	//* 427  889:ifeq            909
				J = J + (long)N;
	//  428  892:aload_0         
	//  429  893:aload_0         
	//  430  894:getfield        #700 <Field long J>
	//  431  897:aload_0         
	//  432  898:getfield        #320 <Field int N>
	//  433  901:i2l             
	//  434  902:ladd            
	//  435  903:putfield        #700 <Field long J>
			else
	//* 436  906:goto            923
				I = I + (long)bytebuffer.remaining();
	//  437  909:aload_0         
	//  438  910:aload_0         
	//  439  911:getfield        #702 <Field long I>
	//  440  914:aload_1         
	//  441  915:invokevirtual   #232 <Method int ByteBuffer.remaining()>
	//  442  918:i2l             
	//  443  919:ladd            
	//  444  920:putfield        #702 <Field long I>
			V = bytebuffer;
	//  445  923:aload_0         
	//  446  924:aload_1         
	//  447  925:putfield        #180 <Field ByteBuffer V>
		}
		if(r)
	//* 448  928:aload_0         
	//* 449  929:getfield        #316 <Field boolean r>
	//* 450  932:ifeq            948
			b(V, l1);
	//  451  935:aload_0         
	//  452  936:aload_0         
	//  453  937:getfield        #180 <Field ByteBuffer V>
	//  454  940:lload_2         
	//  455  941:invokespecial   #185 <Method boolean b(ByteBuffer, long)>
	//  456  944:pop             
		else
	//* 457  945:goto            953
			a(l1);
	//  458  948:aload_0         
	//  459  949:lload_2         
	//  460  950:invokespecial   #347 <Method void a(long)>
		if(!V.hasRemaining())
	//* 461  953:aload_0         
	//* 462  954:getfield        #180 <Field ByteBuffer V>
	//* 463  957:invokevirtual   #195 <Method boolean ByteBuffer.hasRemaining()>
	//* 464  960:ifne            970
		{
			V = null;
	//  465  963:aload_0         
	//  466  964:aconst_null     
	//  467  965:putfield        #180 <Field ByteBuffer V>
			return true;
	//  468  968:iconst_1        
	//  469  969:ireturn         
		} else
		{
			return false;
	//  470  970:iconst_0        
	//  471  971:ireturn         
		}
		bytebuffer;
	//  472  972:astore_1        
		if(true) goto _L7; else goto _L6
_L6:
	//* 473  973:goto            343
	}

	public final void b()
	{
		if(O == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field int O>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			O = 2;
	//    4    8:aload_0         
	//    5    9:iconst_2        
	//    6   10:putfield        #153 <Field int O>
	//    7   13:return          
	}

	public final void b(int i1)
	{
		boolean flag;
		if(bnw.a >= 21)
	//*   0    0:getstatic       #102 <Field int bnw.a>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_2        
		else
	//*   5   10:goto            15
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore_2        
		bnf.b(flag);
	//    8   15:iload_2         
	//    9   16:invokestatic    #273 <Method void bnf.b(boolean)>
		if(!ad || ac != i1)
	//*  10   19:aload_0         
	//*  11   20:getfield        #269 <Field boolean ad>
	//*  12   23:ifeq            34
	//*  13   26:aload_0         
	//*  14   27:getfield        #157 <Field int ac>
	//*  15   30:iload_1         
	//*  16   31:icmpeq          48
		{
			ad = true;
	//   17   34:aload_0         
	//   18   35:iconst_1        
	//   19   36:putfield        #269 <Field boolean ad>
			ac = i1;
	//   20   39:aload_0         
	//   21   40:iload_1         
	//   22   41:putfield        #157 <Field int ac>
			i();
	//   23   44:aload_0         
	//   24   45:invokevirtual   #527 <Method void i()>
		}
	//   25   48:return          
	}

	public final void c()
	{
		if(!aa)
	//*   0    0:aload_0         
	//*   1    1:getfield        #715 <Field boolean aa>
	//*   2    4:ifne            44
		{
			if(!n())
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #351 <Method boolean n()>
	//*   5   11:ifne            15
				return;
	//    6   14:return          
			if(l())
	//*   7   15:aload_0         
	//*   8   16:invokespecial   #692 <Method boolean l()>
	//*   9   19:ifeq            43
			{
				j.a(o());
	//   10   22:aload_0         
	//   11   23:getfield        #119 <Field beh j>
	//   12   26:aload_0         
	//   13   27:invokespecial   #694 <Method long o()>
	//   14   30:invokevirtual   #716 <Method void beh.a(long)>
				z = 0;
	//   15   33:aload_0         
	//   16   34:iconst_0        
	//   17   35:putfield        #295 <Field int z>
				aa = true;
	//   18   38:aload_0         
	//   19   39:iconst_1        
	//   20   40:putfield        #715 <Field boolean aa>
			}
			return;
	//   21   43:return          
		} else
		{
			return;
	//   22   44:return          
		}
	}

	public final boolean d()
	{
		return !n() || aa && !e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #351 <Method boolean n()>
	//    2    4:ifeq            26
	//    3    7:aload_0         
	//    4    8:getfield        #715 <Field boolean aa>
	//    5   11:ifeq            24
	//    6   14:aload_0         
	//    7   15:invokevirtual   #670 <Method boolean e()>
	//    8   18:ifne            24
	//    9   21:goto            26
	//   10   24:iconst_0        
	//   11   25:ireturn         
	//   12   26:iconst_1        
	//   13   27:ireturn         
	}

	public final boolean e()
	{
label0:
		{
			if(!n())
				break label0;
	//    0    0:aload_0         
	//    1    1:invokespecial   #351 <Method boolean n()>
	//    2    4:ifeq            63
			if(o() <= j.b())
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #694 <Method long o()>
	//*   5   11:aload_0         
	//*   6   12:getfield        #119 <Field beh j>
	//*   7   15:invokevirtual   #251 <Method long beh.b()>
	//*   8   18:lcmp            
	//*   9   19:ifgt            61
			{
				boolean flag;
				if(q() && l.getPlayState() == 2 && l.getPlaybackHeadPosition() == 0)
	//*  10   22:aload_0         
	//*  11   23:invokespecial   #390 <Method boolean q()>
	//*  12   26:ifeq            55
	//*  13   29:aload_0         
	//*  14   30:getfield        #263 <Field AudioTrack l>
	//*  15   33:invokevirtual   #381 <Method int AudioTrack.getPlayState()>
	//*  16   36:iconst_2        
	//*  17   37:icmpne          55
	//*  18   40:aload_0         
	//*  19   41:getfield        #263 <Field AudioTrack l>
	//*  20   44:invokevirtual   #719 <Method int AudioTrack.getPlaybackHeadPosition()>
	//*  21   47:ifne            55
					flag = true;
	//   22   50:iconst_1        
	//   23   51:istore_1        
				else
	//*  24   52:goto            57
					flag = false;
	//   25   55:iconst_0        
	//   26   56:istore_1        
				if(!flag)
					break label0;
	//   27   57:iload_1         
	//   28   58:ifeq            63
			}
			return true;
	//   29   61:iconst_1        
	//   30   62:ireturn         
		}
		return false;
	//   31   63:iconst_0        
	//   32   64:ireturn         
	}

	public final bdk f()
	{
		return v;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field bdk v>
	//    2    4:areturn         
	}

	public final void g()
	{
		if(ad)
	//*   0    0:aload_0         
	//*   1    1:getfield        #269 <Field boolean ad>
	//*   2    4:ifeq            21
		{
			ad = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #269 <Field boolean ad>
			ac = 0;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #157 <Field int ac>
			i();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #527 <Method void i()>
		}
	//   11   21:return          
	}

	public final void h()
	{
		ab = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #519 <Field boolean ab>
		if(n())
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #351 <Method boolean n()>
	//*   5    9:ifeq            23
		{
			p();
	//    6   12:aload_0         
	//    7   13:invokespecial   #722 <Method void p()>
			j.a();
	//    8   16:aload_0         
	//    9   17:getfield        #119 <Field beh j>
	//   10   20:invokevirtual   #723 <Method void beh.a()>
		}
	//   11   23:return          
	}

	public final void i()
	{
		if(n())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #351 <Method boolean n()>
	//*   2    4:ifeq            240
		{
			I = 0L;
	//    3    7:aload_0         
	//    4    8:lconst_0        
	//    5    9:putfield        #702 <Field long I>
			J = 0L;
	//    6   12:aload_0         
	//    7   13:lconst_0        
	//    8   14:putfield        #700 <Field long J>
			L = 0L;
	//    9   17:aload_0         
	//   10   18:lconst_0        
	//   11   19:putfield        #248 <Field long L>
			M = 0L;
	//   12   22:aload_0         
	//   13   23:lconst_0        
	//   14   24:putfield        #318 <Field long M>
			N = 0;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #320 <Field int N>
			Object obj = ((Object) (u));
	//   18   32:aload_0         
	//   19   33:getfield        #513 <Field bdk u>
	//   20   36:astore_2        
			if(obj != null)
	//*  21   37:aload_2         
	//*  22   38:ifnull          54
			{
				v = ((bdk) (obj));
	//   23   41:aload_0         
	//   24   42:aload_2         
	//   25   43:putfield        #163 <Field bdk v>
				u = null;
	//   26   46:aload_0         
	//   27   47:aconst_null     
	//   28   48:putfield        #513 <Field bdk u>
			} else
	//*  29   51:goto            81
			if(!k.isEmpty())
	//*  30   54:aload_0         
	//*  31   55:getfield        #176 <Field LinkedList k>
	//*  32   58:invokevirtual   #462 <Method boolean LinkedList.isEmpty()>
	//*  33   61:ifne            81
				v = bem.a((bem)k.getLast());
	//   34   64:aload_0         
	//   35   65:aload_0         
	//   36   66:getfield        #176 <Field LinkedList k>
	//   37   69:invokevirtual   #516 <Method Object LinkedList.getLast()>
	//   38   72:checkcast       #468 <Class bem>
	//   39   75:invokestatic    #477 <Method bdk bem.a(bem)>
	//   40   78:putfield        #163 <Field bdk v>
			k.clear();
	//   41   81:aload_0         
	//   42   82:getfield        #176 <Field LinkedList k>
	//   43   85:invokevirtual   #726 <Method void LinkedList.clear()>
			w = 0L;
	//   44   88:aload_0         
	//   45   89:lconst_0        
	//   46   90:putfield        #483 <Field long w>
			x = 0L;
	//   47   93:aload_0         
	//   48   94:lconst_0        
	//   49   95:putfield        #479 <Field long x>
			V = null;
	//   50   98:aload_0         
	//   51   99:aconst_null     
	//   52  100:putfield        #180 <Field ByteBuffer V>
			W = null;
	//   53  103:aload_0         
	//   54  104:aconst_null     
	//   55  105:putfield        #225 <Field ByteBuffer W>
			int i1 = 0;
	//   56  108:iconst_0        
	//   57  109:istore_1        
			do
			{
				bdv abdv[] = T;
	//   58  110:aload_0         
	//   59  111:getfield        #167 <Field bdv[] T>
	//   60  114:astore_2        
				if(i1 >= abdv.length)
					break;
	//   61  115:iload_1         
	//   62  116:aload_2         
	//   63  117:arraylength     
	//   64  118:icmpge          150
				abdv = ((bdv []) (abdv[i1]));
	//   65  121:aload_2         
	//   66  122:iload_1         
	//   67  123:aaload          
	//   68  124:astore_2        
				((bdv) (abdv)).g();
	//   69  125:aload_2         
	//   70  126:invokeinterface #335 <Method void bdv.g()>
				U[i1] = ((bdv) (abdv)).e();
	//   71  131:aload_0         
	//   72  132:getfield        #171 <Field ByteBuffer[] U>
	//   73  135:iload_1         
	//   74  136:aload_2         
	//   75  137:invokeinterface #191 <Method ByteBuffer bdv.e()>
	//   76  142:aastore         
				i1++;
	//   77  143:iload_1         
	//   78  144:iconst_1        
	//   79  145:iadd            
	//   80  146:istore_1        
			} while(true);
	//   81  147:goto            110
			aa = false;
	//   82  150:aload_0         
	//   83  151:iconst_0        
	//   84  152:putfield        #715 <Field boolean aa>
			Z = -1;
	//   85  155:aload_0         
	//   86  156:iconst_m1       
	//   87  157:putfield        #165 <Field int Z>
			y = null;
	//   88  160:aload_0         
	//   89  161:aconst_null     
	//   90  162:putfield        #275 <Field ByteBuffer y>
			z = 0;
	//   91  165:aload_0         
	//   92  166:iconst_0        
	//   93  167:putfield        #295 <Field int z>
			O = 0;
	//   94  170:aload_0         
	//   95  171:iconst_0        
	//   96  172:putfield        #153 <Field int O>
			R = 0L;
	//   97  175:aload_0         
	//   98  176:lconst_0        
	//   99  177:putfield        #449 <Field long R>
			p();
	//  100  180:aload_0         
	//  101  181:invokespecial   #722 <Method void p()>
			if(l.getPlayState() == 3)
	//* 102  184:aload_0         
	//* 103  185:getfield        #263 <Field AudioTrack l>
	//* 104  188:invokevirtual   #381 <Method int AudioTrack.getPlayState()>
	//* 105  191:iconst_3        
	//* 106  192:icmpne          202
				l.pause();
	//  107  195:aload_0         
	//  108  196:getfield        #263 <Field AudioTrack l>
	//  109  199:invokevirtual   #729 <Method void AudioTrack.pause()>
			abdv = ((bdv []) (l));
	//  110  202:aload_0         
	//  111  203:getfield        #263 <Field AudioTrack l>
	//  112  206:astore_2        
			l = null;
	//  113  207:aload_0         
	//  114  208:aconst_null     
	//  115  209:putfield        #263 <Field AudioTrack l>
			j.a(((AudioTrack) (null)), false);
	//  116  212:aload_0         
	//  117  213:getfield        #119 <Field beh j>
	//  118  216:aconst_null     
	//  119  217:iconst_0        
	//  120  218:invokevirtual   #656 <Method void beh.a(AudioTrack, boolean)>
			h.close();
	//  121  221:aload_0         
	//  122  222:getfield        #98  <Field ConditionVariable h>
	//  123  225:invokevirtual   #732 <Method void ConditionVariable.close()>
			(new beg(this, ((AudioTrack) (abdv)))).start();
	//  124  228:new             #734 <Class beg>
	//  125  231:dup             
	//  126  232:aload_0         
	//  127  233:aload_2         
	//  128  234:invokespecial   #737 <Method void beg(bef, AudioTrack)>
	//  129  237:invokevirtual   #740 <Method void beg.start()>
		}
	//  130  240:return          
	}

	public final void j()
	{
		i();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #527 <Method void i()>
		bdv abdv[] = f;
	//    2    4:aload_0         
	//    3    5:getfield        #138 <Field bdv[] f>
	//    4    8:astore_3        
		int j1 = abdv.length;
	//    5    9:aload_3         
	//    6   10:arraylength     
	//    7   11:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   8   12:iconst_0        
	//*   9   13:istore_1        
	//*  10   14:iload_1         
	//*  11   15:iload_2         
	//*  12   16:icmpge          34
			abdv[i1].h();
	//   13   19:aload_3         
	//   14   20:iload_1         
	//   15   21:aaload          
	//   16   22:invokeinterface #742 <Method void bdv.h()>

	//   17   27:iload_1         
	//   18   28:iconst_1        
	//   19   29:iadd            
	//   20   30:istore_1        
	//*  21   31:goto            14
		ac = 0;
	//   22   34:aload_0         
	//   23   35:iconst_0        
	//   24   36:putfield        #157 <Field int ac>
		ab = false;
	//   25   39:aload_0         
	//   26   40:iconst_0        
	//   27   41:putfield        #519 <Field boolean ab>
	//   28   44:return          
	}

	private static boolean a = false;
	private static boolean b = false;
	private int A;
	private int B;
	private long C;
	private long D;
	private boolean E;
	private long F;
	private Method G;
	private int H;
	private long I;
	private long J;
	private int K;
	private long L;
	private long M;
	private int N;
	private int O;
	private long P;
	private long Q;
	private long R;
	private float S;
	private bdv T[];
	private ByteBuffer U[];
	private ByteBuffer V;
	private ByteBuffer W;
	private byte X[];
	private int Y;
	private int Z;
	private boolean aa;
	private boolean ab;
	private int ac;
	private boolean ad;
	private boolean ae;
	private long af;
	private final bdu c = null;
	private final bep d = new bep();
	private final bew e = new bew();
	private final bdv f[];
	private final bel g;
	private final ConditionVariable h = new ConditionVariable(true);
	private final long i[] = new long[10];
	private final beh j;
	private final LinkedList k = new LinkedList();
	private AudioTrack l;
	private int m;
	private int n;
	private int o;
	private int p;
	private int q;
	private boolean r;
	private int s;
	private long t;
	private bdk u;
	private bdk v;
	private long w;
	private long x;
	private ByteBuffer y;
	private int z;

	static 
	{
	//    0    0:return          
	}
}
