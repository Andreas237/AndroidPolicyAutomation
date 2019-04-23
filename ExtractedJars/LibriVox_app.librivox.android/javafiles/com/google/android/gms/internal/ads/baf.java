// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.google.android.gms.internal.ads:
//			avl, bag

public final class baf
{

	public baf(SecureRandom securerandom)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #24  <Field SecureRandom a>
	//    5    9:return          
	}

	private static Cipher a()
	{
		Cipher cipher;
		synchronized(d)
	//*   0    0:getstatic       #20  <Field Object d>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			if(b == null)
	//*   4    6:getstatic       #27  <Field Cipher b>
	//*   5    9:ifnonnull       20
				b = Cipher.getInstance("AES/CBC/PKCS5Padding");
	//    6   12:ldc1            #29  <String "AES/CBC/PKCS5Padding">
	//    7   14:invokestatic    #35  <Method Cipher Cipher.getInstance(String)>
	//    8   17:putstatic       #27  <Field Cipher b>
			cipher = b;
	//    9   20:getstatic       #27  <Field Cipher b>
	//   10   23:astore_1        
		}
	//   11   24:aload_0         
	//   12   25:monitorexit     
		return cipher;
	//   13   26:aload_1         
	//   14   27:areturn         
		exception;
	//   15   28:astore_1        
		obj;
	//   16   29:aload_0         
		JVM INSTR monitorexit ;
	//   17   30:monitorexit     
		throw exception;
	//   18   31:aload_1         
	//   19   32:athrow          
	}

	public final String a(byte abyte0[], byte abyte1[])
	{
		if(abyte0.length != 16)
			break MISSING_BLOCK_LABEL_159;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:bipush          16
	//    3    4:icmpne          159
		SecretKeySpec secretkeyspec = new SecretKeySpec(abyte0, "AES");
	//    4    7:new             #48  <Class SecretKeySpec>
	//    5   10:dup             
	//    6   11:aload_1         
	//    7   12:ldc1            #50  <String "AES">
	//    8   14:invokespecial   #53  <Method void SecretKeySpec(byte[], String)>
	//    9   17:astore          4
		byte abyte2[];
		synchronized(c)
	//*  10   19:getstatic       #18  <Field Object c>
	//*  11   22:astore_1        
	//*  12   23:aload_1         
	//*  13   24:monitorenter    
		{
			a().init(1, ((java.security.Key) (secretkeyspec)), ((SecureRandom) (null)));
	//   14   25:invokestatic    #55  <Method Cipher a()>
	//   15   28:iconst_1        
	//   16   29:aload           4
	//   17   31:aconst_null     
	//   18   32:invokevirtual   #59  <Method void Cipher.init(int, java.security.Key, SecureRandom)>
			abyte1 = a().doFinal(abyte1);
	//   19   35:invokestatic    #55  <Method Cipher a()>
	//   20   38:aload_2         
	//   21   39:invokevirtual   #63  <Method byte[] Cipher.doFinal(byte[])>
	//   22   42:astore_2        
			abyte2 = a().getIV();
	//   23   43:invokestatic    #55  <Method Cipher a()>
	//   24   46:invokevirtual   #67  <Method byte[] Cipher.getIV()>
	//   25   49:astore          4
		}
	//   26   51:aload_1         
	//   27   52:monitorexit     
		try
		{
			int i = abyte1.length + abyte2.length;
	//   28   53:aload_2         
	//   29   54:arraylength     
	//   30   55:aload           4
	//   31   57:arraylength     
	//   32   58:iadd            
	//   33   59:istore_3        
			abyte0 = ((byte []) (ByteBuffer.allocate(i)));
	//   34   60:iload_3         
	//   35   61:invokestatic    #73  <Method ByteBuffer ByteBuffer.allocate(int)>
	//   36   64:astore_1        
			((ByteBuffer) (abyte0)).put(abyte2).put(abyte1);
	//   37   65:aload_1         
	//   38   66:aload           4
	//   39   68:invokevirtual   #77  <Method ByteBuffer ByteBuffer.put(byte[])>
	//   40   71:aload_2         
	//   41   72:invokevirtual   #77  <Method ByteBuffer ByteBuffer.put(byte[])>
	//   42   75:pop             
			((ByteBuffer) (abyte0)).flip();
	//   43   76:aload_1         
	//   44   77:invokevirtual   #81  <Method java.nio.Buffer ByteBuffer.flip()>
	//   45   80:pop             
			abyte1 = new byte[i];
	//   46   81:iload_3         
	//   47   82:newarray        byte[]
	//   48   84:astore_2        
			((ByteBuffer) (abyte0)).get(abyte1);
	//   49   85:aload_1         
	//   50   86:aload_2         
	//   51   87:invokevirtual   #84  <Method ByteBuffer ByteBuffer.get(byte[])>
	//   52   90:pop             
			abyte0 = ((byte []) (avl.a(abyte1, false)));
	//   53   91:aload_2         
	//   54   92:iconst_0        
	//   55   93:invokestatic    #89  <Method String avl.a(byte[], boolean)>
	//   56   96:astore_1        
		}
	//*  57   97:aload_1         
	//*  58   98:areturn         
	//*  59   99:astore_2        
	//*  60  100:aload_1         
	//*  61  101:monitorexit     
	//*  62  102:aload_2         
	//*  63  103:athrow          
	//*  64  104:astore_1        
	//*  65  105:new             #91  <Class bag>
	//*  66  108:dup             
	//*  67  109:aload_0         
	//*  68  110:aload_1         
	//*  69  111:invokespecial   #94  <Method void bag(baf, Throwable)>
	//*  70  114:athrow          
	//*  71  115:astore_1        
	//*  72  116:new             #91  <Class bag>
	//*  73  119:dup             
	//*  74  120:aload_0         
	//*  75  121:aload_1         
	//*  76  122:invokespecial   #94  <Method void bag(baf, Throwable)>
	//*  77  125:athrow          
	//*  78  126:astore_1        
	//*  79  127:new             #91  <Class bag>
	//*  80  130:dup             
	//*  81  131:aload_0         
	//*  82  132:aload_1         
	//*  83  133:invokespecial   #94  <Method void bag(baf, Throwable)>
	//*  84  136:athrow          
	//*  85  137:astore_1        
	//*  86  138:new             #91  <Class bag>
	//*  87  141:dup             
	//*  88  142:aload_0         
	//*  89  143:aload_1         
	//*  90  144:invokespecial   #94  <Method void bag(baf, Throwable)>
	//*  91  147:athrow          
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  92  148:astore_1        
		{
			throw new bag(this, ((Throwable) (abyte0)));
	//   93  149:new             #91  <Class bag>
	//   94  152:dup             
	//   95  153:aload_0         
	//   96  154:aload_1         
	//   97  155:invokespecial   #94  <Method void bag(baf, Throwable)>
	//   98  158:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			throw new bag(this, ((Throwable) (abyte0)));
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			throw new bag(this, ((Throwable) (abyte0)));
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			throw new bag(this, ((Throwable) (abyte0)));
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			throw new bag(this, ((Throwable) (abyte0)));
		}
		return ((String) (abyte0));
		abyte1;
		abyte0;
		JVM INSTR monitorexit ;
		throw abyte1;
		throw new bag(this);
	//   99  159:new             #91  <Class bag>
	//  100  162:dup             
	//  101  163:aload_0         
	//  102  164:invokespecial   #97  <Method void bag(baf)>
	//  103  167:athrow          
	}

	public final byte[] a(String s)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		s = ((String) (avl.a(s, false)));
	//    2    2:aload_1         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #103 <Method byte[] avl.a(String, boolean)>
	//    5    7:astore_1        
		byte abyte0[];
		if(s.length == 32)
	//*   6    8:aload_1         
	//*   7    9:arraylength     
	//*   8   10:bipush          32
	//*   9   12:icmpne          37
		{
			s = ((String) (ByteBuffer.wrap(((byte []) (s)), 4, 16)));
	//   10   15:aload_1         
	//   11   16:iconst_4        
	//   12   17:bipush          16
	//   13   19:invokestatic    #107 <Method ByteBuffer ByteBuffer.wrap(byte[], int, int)>
	//   14   22:astore_1        
			abyte0 = new byte[16];
	//   15   23:bipush          16
	//   16   25:newarray        byte[]
	//   17   27:astore_3        
			((ByteBuffer) (s)).get(abyte0);
	//   18   28:aload_1         
	//   19   29:aload_3         
	//   20   30:invokevirtual   #84  <Method ByteBuffer ByteBuffer.get(byte[])>
	//   21   33:pop             
			break MISSING_BLOCK_LABEL_57;
	//   22   34:goto            57
		} else
		{
			try
			{
				throw new bag(this);
	//   23   37:new             #91  <Class bag>
	//   24   40:dup             
	//   25   41:aload_0         
	//   26   42:invokespecial   #97  <Method void bag(baf)>
	//   27   45:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  28   46:astore_1        
			{
				throw new bag(this, ((Throwable) (s)));
	//   29   47:new             #91  <Class bag>
	//   30   50:dup             
	//   31   51:aload_0         
	//   32   52:aload_1         
	//   33   53:invokespecial   #94  <Method void bag(baf, Throwable)>
	//   34   56:athrow          
			}
		}
		for(; i < 16; i++)
	//*  35   57:iload_2         
	//*  36   58:bipush          16
	//*  37   60:icmpge          80
			abyte0[i] = (byte)(abyte0[i] ^ 0x44);
	//   38   63:aload_3         
	//   39   64:iload_2         
	//   40   65:aload_3         
	//   41   66:iload_2         
	//   42   67:baload          
	//   43   68:bipush          68
	//   44   70:ixor            
	//   45   71:int2byte        
	//   46   72:bastore         

	//   47   73:iload_2         
	//   48   74:iconst_1        
	//   49   75:iadd            
	//   50   76:istore_2        
	//*  51   77:goto            57
		return abyte0;
	//   52   80:aload_3         
	//   53   81:areturn         
	}

	public final byte[] a(byte abyte0[], String s)
	{
		if(abyte0.length != 16)
			break MISSING_BLOCK_LABEL_205;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:bipush          16
	//    3    4:icmpne          205
		byte abyte1[];
		Object obj;
		abyte1 = avl.a(s, false);
	//    4    7:aload_2         
	//    5    8:iconst_0        
	//    6    9:invokestatic    #103 <Method byte[] avl.a(String, boolean)>
	//    7   12:astore_3        
		if(abyte1.length <= 16)
			break MISSING_BLOCK_LABEL_119;
	//    8   13:aload_3         
	//    9   14:arraylength     
	//   10   15:bipush          16
	//   11   17:icmple          119
		obj = ((Object) (ByteBuffer.allocate(abyte1.length)));
	//   12   20:aload_3         
	//   13   21:arraylength     
	//   14   22:invokestatic    #73  <Method ByteBuffer ByteBuffer.allocate(int)>
	//   15   25:astore          4
		((ByteBuffer) (obj)).put(abyte1);
	//   16   27:aload           4
	//   17   29:aload_3         
	//   18   30:invokevirtual   #77  <Method ByteBuffer ByteBuffer.put(byte[])>
	//   19   33:pop             
		((ByteBuffer) (obj)).flip();
	//   20   34:aload           4
	//   21   36:invokevirtual   #81  <Method java.nio.Buffer ByteBuffer.flip()>
	//   22   39:pop             
		s = ((String) (new byte[16]));
	//   23   40:bipush          16
	//   24   42:newarray        byte[]
	//   25   44:astore_2        
		abyte1 = new byte[abyte1.length - 16];
	//   26   45:aload_3         
	//   27   46:arraylength     
	//   28   47:bipush          16
	//   29   49:isub            
	//   30   50:newarray        byte[]
	//   31   52:astore_3        
		((ByteBuffer) (obj)).get(((byte []) (s)));
	//   32   53:aload           4
	//   33   55:aload_2         
	//   34   56:invokevirtual   #84  <Method ByteBuffer ByteBuffer.get(byte[])>
	//   35   59:pop             
		((ByteBuffer) (obj)).get(abyte1);
	//   36   60:aload           4
	//   37   62:aload_3         
	//   38   63:invokevirtual   #84  <Method ByteBuffer ByteBuffer.get(byte[])>
	//   39   66:pop             
		obj = ((Object) (new SecretKeySpec(abyte0, "AES")));
	//   40   67:new             #48  <Class SecretKeySpec>
	//   41   70:dup             
	//   42   71:aload_1         
	//   43   72:ldc1            #50  <String "AES">
	//   44   74:invokespecial   #53  <Method void SecretKeySpec(byte[], String)>
	//   45   77:astore          4
		synchronized(c)
	//*  46   79:getstatic       #18  <Field Object c>
	//*  47   82:astore_1        
	//*  48   83:aload_1         
	//*  49   84:monitorenter    
		{
			a().init(2, ((java.security.Key) (obj)), ((java.security.spec.AlgorithmParameterSpec) (new IvParameterSpec(((byte []) (s))))));
	//   50   85:invokestatic    #55  <Method Cipher a()>
	//   51   88:iconst_2        
	//   52   89:aload           4
	//   53   91:new             #112 <Class IvParameterSpec>
	//   54   94:dup             
	//   55   95:aload_2         
	//   56   96:invokespecial   #115 <Method void IvParameterSpec(byte[])>
	//   57   99:invokevirtual   #118 <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
			s = ((String) (a().doFinal(abyte1)));
	//   58  102:invokestatic    #55  <Method Cipher a()>
	//   59  105:aload_3         
	//   60  106:invokevirtual   #63  <Method byte[] Cipher.doFinal(byte[])>
	//   61  109:astore_2        
		}
	//   62  110:aload_1         
	//   63  111:monitorexit     
		return ((byte []) (s));
	//   64  112:aload_2         
	//   65  113:areturn         
		s;
	//   66  114:astore_2        
		abyte0;
	//   67  115:aload_1         
		JVM INSTR monitorexit ;
	//   68  116:monitorexit     
		throw s;
	//   69  117:aload_2         
	//   70  118:athrow          
		throw new bag(this);
	//   71  119:new             #91  <Class bag>
	//   72  122:dup             
	//   73  123:aload_0         
	//   74  124:invokespecial   #97  <Method void bag(baf)>
	//   75  127:athrow          
		abyte0;
	//   76  128:astore_1        
		throw new bag(this, ((Throwable) (abyte0)));
	//   77  129:new             #91  <Class bag>
	//   78  132:dup             
	//   79  133:aload_0         
	//   80  134:aload_1         
	//   81  135:invokespecial   #94  <Method void bag(baf, Throwable)>
	//   82  138:athrow          
		abyte0;
	//   83  139:astore_1        
		throw new bag(this, ((Throwable) (abyte0)));
	//   84  140:new             #91  <Class bag>
	//   85  143:dup             
	//   86  144:aload_0         
	//   87  145:aload_1         
	//   88  146:invokespecial   #94  <Method void bag(baf, Throwable)>
	//   89  149:athrow          
		abyte0;
	//   90  150:astore_1        
		throw new bag(this, ((Throwable) (abyte0)));
	//   91  151:new             #91  <Class bag>
	//   92  154:dup             
	//   93  155:aload_0         
	//   94  156:aload_1         
	//   95  157:invokespecial   #94  <Method void bag(baf, Throwable)>
	//   96  160:athrow          
		abyte0;
	//   97  161:astore_1        
		throw new bag(this, ((Throwable) (abyte0)));
	//   98  162:new             #91  <Class bag>
	//   99  165:dup             
	//  100  166:aload_0         
	//  101  167:aload_1         
	//  102  168:invokespecial   #94  <Method void bag(baf, Throwable)>
	//  103  171:athrow          
		abyte0;
	//  104  172:astore_1        
		throw new bag(this, ((Throwable) (abyte0)));
	//  105  173:new             #91  <Class bag>
	//  106  176:dup             
	//  107  177:aload_0         
	//  108  178:aload_1         
	//  109  179:invokespecial   #94  <Method void bag(baf, Throwable)>
	//  110  182:athrow          
		abyte0;
	//  111  183:astore_1        
		throw new bag(this, ((Throwable) (abyte0)));
	//  112  184:new             #91  <Class bag>
	//  113  187:dup             
	//  114  188:aload_0         
	//  115  189:aload_1         
	//  116  190:invokespecial   #94  <Method void bag(baf, Throwable)>
	//  117  193:athrow          
		abyte0;
	//  118  194:astore_1        
		throw new bag(this, ((Throwable) (abyte0)));
	//  119  195:new             #91  <Class bag>
	//  120  198:dup             
	//  121  199:aload_0         
	//  122  200:aload_1         
	//  123  201:invokespecial   #94  <Method void bag(baf, Throwable)>
	//  124  204:athrow          
		throw new bag(this);
	//  125  205:new             #91  <Class bag>
	//  126  208:dup             
	//  127  209:aload_0         
	//  128  210:invokespecial   #97  <Method void bag(baf)>
	//  129  213:athrow          
	}

	private static Cipher b;
	private static final Object c = new Object();
	private static final Object d = new Object();
	private final SecureRandom a = null;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void Object()>
	//    3    7:putstatic       #18  <Field Object c>
	//    4   10:new             #4   <Class Object>
	//    5   13:dup             
	//    6   14:invokespecial   #16  <Method void Object()>
	//    7   17:putstatic       #20  <Field Object d>
	//*   8   20:return          
	}
}
