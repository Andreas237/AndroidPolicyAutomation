// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.*;
import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal.ads:
//			akh, awp, p, bwk, 
//			m, bbb, aiy, atj, 
//			avl, azg, azh, azk, 
//			aqg

final class ayt
{

	private static akh a(long l)
	{
		akh akh1 = new akh();
	//    0    0:new             #34  <Class akh>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void akh()>
	//    3    7:astore_2        
		akh1.k = Long.valueOf(4096L);
	//    4    8:aload_2         
	//    5    9:ldc2w           #36  <Long 4096L>
	//    6   12:invokestatic    #43  <Method Long Long.valueOf(long)>
	//    7   15:putfield        #47  <Field Long akh.k>
		return akh1;
	//    8   18:aload_2         
	//    9   19:areturn         
	}

	static String a(akh akh1, String s)
	{
		byte abyte0[] = awp.a(((awp) (akh1)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #53  <Method byte[] awp.a(awp)>
	//    2    4:astore_3        
		akh1 = ((akh) (p.bn));
	//    3    5:getstatic       #59  <Field e p.bn>
	//    4    8:astore_0        
		if(!((Boolean)bwk.e().a(((e) (akh1)))).booleanValue())
	//*   5    9:invokestatic    #64  <Method m bwk.e()>
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #69  <Method Object m.a(e)>
	//*   8   16:checkcast       #71  <Class Boolean>
	//*   9   19:invokevirtual   #75  <Method boolean Boolean.booleanValue()>
	//*  10   22:ifne            102
		{
			if(bbb.a != null)
	//*  11   25:getstatic       #80  <Field aiy bbb.a>
	//*  12   28:ifnull          94
			{
				if(s != null)
	//*  13   31:aload_1         
	//*  14   32:ifnull          43
					akh1 = ((akh) (s.getBytes()));
	//   15   35:aload_1         
	//   16   36:invokevirtual   #86  <Method byte[] String.getBytes()>
	//   17   39:astore_0        
				else
	//*  18   40:goto            47
					akh1 = ((akh) (new byte[0]));
	//   19   43:iconst_0        
	//   20   44:newarray        byte[]
	//   21   46:astore_0        
				akh1 = ((akh) (bbb.a.a(abyte0, ((byte []) (akh1)))));
	//   22   47:getstatic       #80  <Field aiy bbb.a>
	//   23   50:aload_3         
	//   24   51:aload_0         
	//   25   52:invokeinterface #91  <Method byte[] aiy.a(byte[], byte[])>
	//   26   57:astore_0        
				s = ((String) (new atj()));
	//   27   58:new             #93  <Class atj>
	//   28   61:dup             
	//   29   62:invokespecial   #94  <Method void atj()>
	//   30   65:astore_1        
				s.a = (new byte[][] {
					akh1
				});
	//   31   66:aload_1         
	//   32   67:iconst_1        
	//   33   68:anewarray       byte[][]
	//   34   71:dup             
	//   35   72:iconst_0        
	//   36   73:aload_0         
	//   37   74:aastore         
	//   38   75:putfield        #99  <Field byte[][] atj.a>
				s.c = Integer.valueOf(2);
	//   39   78:aload_1         
	//   40   79:iconst_2        
	//   41   80:invokestatic    #104 <Method Integer Integer.valueOf(int)>
	//   42   83:putfield        #107 <Field Integer atj.c>
				akh1 = ((akh) (awp.a(((awp) (s)))));
	//   43   86:aload_1         
	//   44   87:invokestatic    #53  <Method byte[] awp.a(awp)>
	//   45   90:astore_0        
			} else
	//*  46   91:goto            229
			{
				throw new GeneralSecurityException();
	//   47   94:new             #109 <Class GeneralSecurityException>
	//   48   97:dup             
	//   49   98:invokespecial   #110 <Method void GeneralSecurityException()>
	//   50  101:athrow          
			}
		} else
		{
			Object obj = ((Object) (a(abyte0, 255)));
	//   51  102:aload_3         
	//   52  103:sipush          255
	//   53  106:invokestatic    #113 <Method Vector a(byte[], int)>
	//   54  109:astore          4
			if(obj != null && ((Vector) (obj)).size() != 0)
	//*  55  111:aload           4
	//*  56  113:ifnull          214
	//*  57  116:aload           4
	//*  58  118:invokevirtual   #119 <Method int Vector.size()>
	//*  59  121:ifne            127
	//*  60  124:goto            214
			{
				akh1 = ((akh) (new atj()));
	//   61  127:new             #93  <Class atj>
	//   62  130:dup             
	//   63  131:invokespecial   #94  <Method void atj()>
	//   64  134:astore_0        
				akh1.a = new byte[((Vector) (obj)).size()][];
	//   65  135:aload_0         
	//   66  136:aload           4
	//   67  138:invokevirtual   #119 <Method int Vector.size()>
	//   68  141:anewarray       byte[][]
	//   69  144:putfield        #99  <Field byte[][] atj.a>
				obj = ((Object) (((Vector) (obj)).iterator()));
	//   70  147:aload           4
	//   71  149:invokevirtual   #123 <Method Iterator Vector.iterator()>
	//   72  152:astore          4
				for(int i = 0; ((Iterator) (obj)).hasNext(); i++)
	//*  73  154:iconst_0        
	//*  74  155:istore_2        
	//*  75  156:aload           4
	//*  76  158:invokeinterface #128 <Method boolean Iterator.hasNext()>
	//*  77  163:ifeq            198
				{
					byte abyte1[] = a((byte[])((Iterator) (obj)).next(), s, false);
	//   78  166:aload           4
	//   79  168:invokeinterface #132 <Method Object Iterator.next()>
	//   80  173:checkcast       #96  <Class byte[]>
	//   81  176:aload_1         
	//   82  177:iconst_0        
	//   83  178:invokestatic    #135 <Method byte[] a(byte[], String, boolean)>
	//   84  181:astore          5
					((atj) (akh1)).a[i] = abyte1;
	//   85  183:aload_0         
	//   86  184:getfield        #99  <Field byte[][] atj.a>
	//   87  187:iload_2         
	//   88  188:aload           5
	//   89  190:aastore         
				}

	//   90  191:iload_2         
	//   91  192:iconst_1        
	//   92  193:iadd            
	//   93  194:istore_2        
	//*  94  195:goto            156
				akh1.b = a(abyte0);
	//   95  198:aload_0         
	//   96  199:aload_3         
	//   97  200:invokestatic    #138 <Method byte[] a(byte[])>
	//   98  203:putfield        #140 <Field byte[] atj.b>
				akh1 = ((akh) (awp.a(((awp) (akh1)))));
	//   99  206:aload_0         
	//  100  207:invokestatic    #53  <Method byte[] awp.a(awp)>
	//  101  210:astore_0        
			} else
	//* 102  211:goto            229
			{
				akh1 = ((akh) (a(awp.a(((awp) (a(4096L)))), s, true)));
	//  103  214:ldc2w           #36  <Long 4096L>
	//  104  217:invokestatic    #142 <Method akh a(long)>
	//  105  220:invokestatic    #53  <Method byte[] awp.a(awp)>
	//  106  223:aload_1         
	//  107  224:iconst_1        
	//  108  225:invokestatic    #135 <Method byte[] a(byte[], String, boolean)>
	//  109  228:astore_0        
			}
		}
		return avl.a(((byte []) (akh1)), true);
	//  110  229:aload_0         
	//  111  230:iconst_1        
	//  112  231:invokestatic    #147 <Method String avl.a(byte[], boolean)>
	//  113  234:areturn         
	}

	static MessageDigest a(MessageDigest messagedigest)
	{
		c = messagedigest;
	//    0    0:aload_0         
	//    1    1:putstatic       #150 <Field MessageDigest c>
		return messagedigest;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

	private static Vector a(byte abyte0[], int i)
	{
		int k;
		Vector vector;
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_94;
	//    0    0:aload_0         
	//    1    1:ifnull          94
		if(abyte0.length <= 0)
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifgt            11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		k = ((abyte0.length + 255) - 1) / 255;
	//    7   11:aload_0         
	//    8   12:arraylength     
	//    9   13:sipush          255
	//   10   16:iadd            
	//   11   17:iconst_1        
	//   12   18:isub            
	//   13   19:sipush          255
	//   14   22:idiv            
	//   15   23:istore_3        
		vector = new Vector();
	//   16   24:new             #115 <Class Vector>
	//   17   27:dup             
	//   18   28:invokespecial   #153 <Method void Vector()>
	//   19   31:astore          5
		i = 0;
	//   20   33:iconst_0        
	//   21   34:istore_1        
_L2:
		int l;
		if(i >= k)
			break; /* Loop/switch isn't completed */
	//   22   35:iload_1         
	//   23   36:iload_3         
	//   24   37:icmpge          91
		l = i * 255;
	//   25   40:iload_1         
	//   26   41:sipush          255
	//   27   44:imul            
	//   28   45:istore          4
		int j;
		if(abyte0.length - l > 255)
	//*  29   47:aload_0         
	//*  30   48:arraylength     
	//*  31   49:iload           4
	//*  32   51:isub            
	//*  33   52:sipush          255
	//*  34   55:icmple          68
		{
			j = l + 255;
	//   35   58:iload           4
	//   36   60:sipush          255
	//   37   63:iadd            
	//   38   64:istore_2        
			break MISSING_BLOCK_LABEL_71;
	//   39   65:goto            71
		}
		j = abyte0.length;
	//   40   68:aload_0         
	//   41   69:arraylength     
	//   42   70:istore_2        
		vector.add(((Object) (Arrays.copyOfRange(abyte0, l, j))));
	//   43   71:aload           5
	//   44   73:aload_0         
	//   45   74:iload           4
	//   46   76:iload_2         
	//   47   77:invokestatic    #159 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   48   80:invokevirtual   #163 <Method boolean Vector.add(Object)>
	//   49   83:pop             
		i++;
	//   50   84:iload_1         
	//   51   85:iconst_1        
	//   52   86:iadd            
	//   53   87:istore_1        
		if(true) goto _L2; else goto _L1
	//   54   88:goto            35
_L1:
		return vector;
	//   55   91:aload           5
	//   56   93:areturn         
		return null;
	//   57   94:aconst_null     
	//   58   95:areturn         
		abyte0;
	//   59   96:astore_0        
		return null;
	//   60   97:aconst_null     
	//   61   98:areturn         
	}

	static void a()
	{
		synchronized(e)
	//*   0    0:getstatic       #23  <Field Object e>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			if(!b)
	//*   4    6:getstatic       #165 <Field boolean b>
	//*   5    9:ifne            34
			{
				b = true;
	//    6   12:iconst_1        
	//    7   13:putstatic       #165 <Field boolean b>
				(new Thread(((Runnable) (new azg(((azf) (null))))))).start();
	//    8   16:new             #167 <Class Thread>
	//    9   19:dup             
	//   10   20:new             #169 <Class azg>
	//   11   23:dup             
	//   12   24:aconst_null     
	//   13   25:invokespecial   #172 <Method void azg(azf)>
	//   14   28:invokespecial   #175 <Method void Thread(Runnable)>
	//   15   31:invokevirtual   #178 <Method void Thread.start()>
			}
		}
	//   16   34:aload_0         
	//   17   35:monitorexit     
		return;
	//   18   36:return          
		exception;
	//   19   37:astore_1        
		obj;
	//   20   38:aload_0         
		JVM INSTR monitorexit ;
	//   21   39:monitorexit     
		throw exception;
	//   22   40:aload_1         
	//   23   41:athrow          
	}

	public static byte[] a(byte abyte0[])
	{
		Object obj = d;
	//    0    0:getstatic       #21  <Field Object d>
	//    1    3:astore_1        
		obj;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		MessageDigest messagedigest = b();
	//    4    6:invokestatic    #181 <Method MessageDigest b()>
	//    5    9:astore_2        
		if(messagedigest == null)
			break MISSING_BLOCK_LABEL_34;
	//    6   10:aload_2         
	//    7   11:ifnull          34
		messagedigest.reset();
	//    8   14:aload_2         
	//    9   15:invokevirtual   #186 <Method void MessageDigest.reset()>
		messagedigest.update(abyte0);
	//   10   18:aload_2         
	//   11   19:aload_0         
	//   12   20:invokevirtual   #190 <Method void MessageDigest.update(byte[])>
		abyte0 = c.digest();
	//   13   23:getstatic       #150 <Field MessageDigest c>
	//   14   26:invokevirtual   #193 <Method byte[] MessageDigest.digest()>
	//   15   29:astore_0        
		obj;
	//   16   30:aload_1         
		JVM INSTR monitorexit ;
	//   17   31:monitorexit     
		return abyte0;
	//   18   32:aload_0         
	//   19   33:areturn         
		throw new NoSuchAlgorithmException("Cannot compute hash");
	//   20   34:new             #195 <Class NoSuchAlgorithmException>
	//   21   37:dup             
	//   22   38:ldc1            #197 <String "Cannot compute hash">
	//   23   40:invokespecial   #200 <Method void NoSuchAlgorithmException(String)>
	//   24   43:athrow          
		abyte0;
	//   25   44:astore_0        
		obj;
	//   26   45:aload_1         
		JVM INSTR monitorexit ;
	//   27   46:monitorexit     
		throw abyte0;
	//   28   47:aload_0         
	//   29   48:athrow          
	}

	private static byte[] a(byte abyte0[], String s, boolean flag)
	{
		char c1;
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            11
			c1 = '\357';
	//    2    4:sipush          239
	//    3    7:istore_3        
		else
	//*   4    8:goto            15
			c1 = '\377';
	//    5   11:sipush          255
	//    6   14:istore_3        
		byte abyte1[] = abyte0;
	//    7   15:aload_0         
	//    8   16:astore          5
		if(abyte0.length > c1)
	//*   9   18:aload_0         
	//*  10   19:arraylength     
	//*  11   20:iload_3         
	//*  12   21:icmple          35
			abyte1 = awp.a(((awp) (a(4096L))));
	//   13   24:ldc2w           #36  <Long 4096L>
	//   14   27:invokestatic    #142 <Method akh a(long)>
	//   15   30:invokestatic    #53  <Method byte[] awp.a(awp)>
	//   16   33:astore          5
		if(abyte1.length < c1)
	//*  17   35:aload           5
	//*  18   37:arraylength     
	//*  19   38:iload_3         
	//*  20   39:icmpge          90
		{
			abyte0 = new byte[c1 - abyte1.length];
	//   21   42:iload_3         
	//   22   43:aload           5
	//   23   45:arraylength     
	//   24   46:isub            
	//   25   47:newarray        byte[]
	//   26   49:astore_0        
			(new SecureRandom()).nextBytes(abyte0);
	//   27   50:new             #202 <Class SecureRandom>
	//   28   53:dup             
	//   29   54:invokespecial   #203 <Method void SecureRandom()>
	//   30   57:aload_0         
	//   31   58:invokevirtual   #206 <Method void SecureRandom.nextBytes(byte[])>
			abyte0 = ByteBuffer.allocate(c1 + 1).put((byte)abyte1.length).put(abyte1).put(abyte0).array();
	//   32   61:iload_3         
	//   33   62:iconst_1        
	//   34   63:iadd            
	//   35   64:invokestatic    #212 <Method ByteBuffer ByteBuffer.allocate(int)>
	//   36   67:aload           5
	//   37   69:arraylength     
	//   38   70:int2byte        
	//   39   71:invokevirtual   #216 <Method ByteBuffer ByteBuffer.put(byte)>
	//   40   74:aload           5
	//   41   76:invokevirtual   #219 <Method ByteBuffer ByteBuffer.put(byte[])>
	//   42   79:aload_0         
	//   43   80:invokevirtual   #219 <Method ByteBuffer ByteBuffer.put(byte[])>
	//   44   83:invokevirtual   #222 <Method byte[] ByteBuffer.array()>
	//   45   86:astore_0        
		} else
	//*  46   87:goto            112
		{
			abyte0 = ByteBuffer.allocate(c1 + 1).put((byte)abyte1.length).put(abyte1).array();
	//   47   90:iload_3         
	//   48   91:iconst_1        
	//   49   92:iadd            
	//   50   93:invokestatic    #212 <Method ByteBuffer ByteBuffer.allocate(int)>
	//   51   96:aload           5
	//   52   98:arraylength     
	//   53   99:int2byte        
	//   54  100:invokevirtual   #216 <Method ByteBuffer ByteBuffer.put(byte)>
	//   55  103:aload           5
	//   56  105:invokevirtual   #219 <Method ByteBuffer ByteBuffer.put(byte[])>
	//   57  108:invokevirtual   #222 <Method byte[] ByteBuffer.array()>
	//   58  111:astore_0        
		}
		abyte1 = abyte0;
	//   59  112:aload_0         
	//   60  113:astore          5
		if(flag)
	//*  61  115:iload_2         
	//*  62  116:ifeq            145
		{
			abyte1 = a(abyte0);
	//   63  119:aload_0         
	//   64  120:invokestatic    #138 <Method byte[] a(byte[])>
	//   65  123:astore          5
			abyte1 = ByteBuffer.allocate(256).put(abyte1).put(abyte0).array();
	//   66  125:sipush          256
	//   67  128:invokestatic    #212 <Method ByteBuffer ByteBuffer.allocate(int)>
	//   68  131:aload           5
	//   69  133:invokevirtual   #219 <Method ByteBuffer ByteBuffer.put(byte[])>
	//   70  136:aload_0         
	//   71  137:invokevirtual   #219 <Method ByteBuffer ByteBuffer.put(byte[])>
	//   72  140:invokevirtual   #222 <Method byte[] ByteBuffer.array()>
	//   73  143:astore          5
		}
		byte abyte2[] = new byte[256];
	//   74  145:sipush          256
	//   75  148:newarray        byte[]
	//   76  150:astore          6
		abyte0 = ((byte []) ((new azh()).cN));
	//   77  152:new             #224 <Class azh>
	//   78  155:dup             
	//   79  156:invokespecial   #225 <Method void azh()>
	//   80  159:getfield        #229 <Field azk[] azh.cN>
	//   81  162:astore_0        
		int j = abyte0.length;
	//   82  163:aload_0         
	//   83  164:arraylength     
	//   84  165:istore          4
		for(int i = 0; i < j; i++)
	//*  85  167:iconst_0        
	//*  86  168:istore_3        
	//*  87  169:iload_3         
	//*  88  170:iload           4
	//*  89  172:icmpge          194
			((azk) (abyte0[i])).a(abyte1, abyte2);
	//   90  175:aload_0         
	//   91  176:iload_3         
	//   92  177:aaload          
	//   93  178:aload           5
	//   94  180:aload           6
	//   95  182:invokeinterface #234 <Method void azk.a(byte[], byte[])>

	//   96  187:iload_3         
	//   97  188:iconst_1        
	//   98  189:iadd            
	//   99  190:istore_3        
	//* 100  191:goto            169
		if(s != null && s.length() > 0)
	//* 101  194:aload_1         
	//* 102  195:ifnull          242
	//* 103  198:aload_1         
	//* 104  199:invokevirtual   #237 <Method int String.length()>
	//* 105  202:ifle            242
		{
			abyte0 = ((byte []) (s));
	//  106  205:aload_1         
	//  107  206:astore_0        
			if(s.length() > 32)
	//* 108  207:aload_1         
	//* 109  208:invokevirtual   #237 <Method int String.length()>
	//* 110  211:bipush          32
	//* 111  213:icmple          224
				abyte0 = ((byte []) (s.substring(0, 32)));
	//  112  216:aload_1         
	//  113  217:iconst_0        
	//  114  218:bipush          32
	//  115  220:invokevirtual   #241 <Method String String.substring(int, int)>
	//  116  223:astore_0        
			(new aqg(((String) (abyte0)).getBytes("UTF-8"))).a(abyte2);
	//  117  224:new             #243 <Class aqg>
	//  118  227:dup             
	//  119  228:aload_0         
	//  120  229:ldc1            #245 <String "UTF-8">
	//  121  231:invokevirtual   #248 <Method byte[] String.getBytes(String)>
	//  122  234:invokespecial   #250 <Method void aqg(byte[])>
	//  123  237:aload           6
	//  124  239:invokevirtual   #252 <Method void aqg.a(byte[])>
		}
		return abyte2;
	//  125  242:aload           6
	//  126  244:areturn         
	}

	private static MessageDigest b()
	{
		InterruptedException interruptedexception;
		a();
	//    0    0:invokestatic    #256 <Method void a()>
		boolean flag;
		try
		{
			flag = a.await(2L, TimeUnit.SECONDS);
	//    1    3:getstatic       #30  <Field CountDownLatch a>
	//    2    6:ldc2w           #257 <Long 2L>
	//    3    9:getstatic       #264 <Field TimeUnit TimeUnit.SECONDS>
	//    4   12:invokevirtual   #268 <Method boolean CountDownLatch.await(long, TimeUnit)>
	//    5   15:istore_0        
		}
	//*   6   16:goto            21
	//*   7   19:iconst_0        
	//*   8   20:istore_0        
	//*   9   21:iload_0         
	//*  10   22:ifne            27
	//*  11   25:aconst_null     
	//*  12   26:areturn         
	//*  13   27:getstatic       #150 <Field MessageDigest c>
	//*  14   30:astore_1        
	//*  15   31:aload_1         
	//*  16   32:ifnonnull       37
	//*  17   35:aconst_null     
	//*  18   36:areturn         
	//*  19   37:aload_1         
	//*  20   38:areturn         
		// Misplaced declaration of an exception variable
		catch(InterruptedException interruptedexception)
		{
			flag = false;
		}
		if(!flag)
			return null;
		MessageDigest messagedigest = c;
		if(messagedigest == null)
			return null;
		else
			return messagedigest;
	//*  21   39:astore_1        
	//*  22   40:goto            19
	}

	static CountDownLatch a = new CountDownLatch(1);
	private static boolean b = false;
	private static MessageDigest c;
	private static final Object d = new Object();
	private static final Object e = new Object();

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void Object()>
	//    3    7:putstatic       #21  <Field Object d>
	//    4   10:new             #4   <Class Object>
	//    5   13:dup             
	//    6   14:invokespecial   #19  <Method void Object()>
	//    7   17:putstatic       #23  <Field Object e>
	//    8   20:new             #25  <Class CountDownLatch>
	//    9   23:dup             
	//   10   24:iconst_1        
	//   11   25:invokespecial   #28  <Method void CountDownLatch(int)>
	//   12   28:putstatic       #30  <Field CountDownLatch a>
	//*  13   31:return          
	}
}
