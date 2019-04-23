// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.*;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aql, avo, avn, avp, 
//			avq, avr

final class avm
{

	private avm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #178 <Method void Object()>
	//    2    4:return          
	}

	static byte a(byte abyte0[], long l1)
	{
		return f.a(((Object) (abyte0)), i + l1);
	//    0    0:getstatic       #93  <Field avq f>
	//    1    3:aload_0         
	//    2    4:getstatic       #108 <Field long i>
	//    3    7:lload_1         
	//    4    8:ladd            
	//    5    9:invokevirtual   #182 <Method byte avq.a(Object, long)>
	//    6   12:ireturn         
	}

	private static int a(Class class1)
	{
		if(h)
	//*   0    0:getstatic       #101 <Field boolean h>
	//*   1    3:ifeq            17
			return f.a.arrayBaseOffset(class1);
	//    2    6:getstatic       #93  <Field avq f>
	//    3    9:getfield        #153 <Field Unsafe avq.a>
	//    4   12:aload_0         
	//    5   13:invokevirtual   #185 <Method int Unsafe.arrayBaseOffset(Class)>
	//    6   16:ireturn         
		else
			return -1;
	//    7   17:iconst_m1       
	//    8   18:ireturn         
	}

	static int a(Object obj, long l1)
	{
		return f.e(obj, l1);
	//    0    0:getstatic       #93  <Field avq f>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:invokevirtual   #188 <Method int avq.e(Object, long)>
	//    4    8:ireturn         
	}

	static long a(ByteBuffer bytebuffer)
	{
		return f.f(((Object) (bytebuffer)), v);
	//    0    0:getstatic       #93  <Field avq f>
	//    1    3:aload_0         
	//    2    4:getstatic       #163 <Field long v>
	//    3    7:invokevirtual   #192 <Method long avq.f(Object, long)>
	//    4   10:lreturn         
	}

	private static Field a(Class class1, String s1)
	{
		try
		{
			class1 = ((Class) (class1.getDeclaredField(s1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #199 <Method Field Class.getDeclaredField(String)>
	//    3    5:astore_0        
			((Field) (class1)).setAccessible(true);
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:invokevirtual   #205 <Method void Field.setAccessible(boolean)>
		}
	//*   7   11:aload_0         
	//*   8   12:areturn         
	//*   9   13:aconst_null     
	//*  10   14:areturn         
		// Misplaced declaration of an exception variable
		catch(Class class1)
		{
			return null;
		}
		return ((Field) (class1));
	//*  11   15:astore_0        
	//*  12   16:goto            13
	}

	static void a(long l1, byte byte0)
	{
		f.a(l1, byte0);
	//    0    0:getstatic       #93  <Field avq f>
	//    1    3:lload_0         
	//    2    4:iload_2         
	//    3    5:invokevirtual   #208 <Method void avq.a(long, byte)>
	//    4    8:return          
	}

	static void a(Object obj, long l1, byte byte0)
	{
		c(obj, l1, byte0);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iload_3         
	//    3    3:invokestatic    #211 <Method void c(Object, long, byte)>
	//    4    6:return          
	}

	static void a(Object obj, long l1, double d1)
	{
		f.a(obj, l1, d1);
	//    0    0:getstatic       #93  <Field avq f>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:dload_3         
	//    4    6:invokevirtual   #214 <Method void avq.a(Object, long, double)>
	//    5    9:return          
	}

	static void a(Object obj, long l1, float f1)
	{
		f.a(obj, l1, f1);
	//    0    0:getstatic       #93  <Field avq f>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:fload_3         
	//    4    6:invokevirtual   #217 <Method void avq.a(Object, long, float)>
	//    5    9:return          
	}

	static void a(Object obj, long l1, int i1)
	{
		f.a(obj, l1, i1);
	//    0    0:getstatic       #93  <Field avq f>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:iload_3         
	//    4    6:invokevirtual   #220 <Method void avq.a(Object, long, int)>
	//    5    9:return          
	}

	static void a(Object obj, long l1, long l2)
	{
		f.a(obj, l1, l2);
	//    0    0:getstatic       #93  <Field avq f>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:lload_3         
	//    4    6:invokevirtual   #223 <Method void avq.a(Object, long, long)>
	//    5    9:return          
	}

	static void a(Object obj, long l1, Object obj1)
	{
		f.a.putObject(obj, l1, obj1);
	//    0    0:getstatic       #93  <Field avq f>
	//    1    3:getfield        #153 <Field Unsafe avq.a>
	//    2    6:aload_0         
	//    3    7:lload_1         
	//    4    8:aload_3         
	//    5    9:invokevirtual   #227 <Method void Unsafe.putObject(Object, long, Object)>
	//    6   12:return          
	}

	static void a(Object obj, long l1, boolean flag)
	{
		f.a(obj, l1, flag);
	//    0    0:getstatic       #93  <Field avq f>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:iload_3         
	//    4    6:invokevirtual   #230 <Method void avq.a(Object, long, boolean)>
	//    5    9:return          
	}

	static void a(byte abyte0[], long l1, byte byte0)
	{
		f.a(((Object) (abyte0)), i + l1, byte0);
	//    0    0:getstatic       #93  <Field avq f>
	//    1    3:aload_0         
	//    2    4:getstatic       #108 <Field long i>
	//    3    7:lload_1         
	//    4    8:ladd            
	//    5    9:iload_3         
	//    6   10:invokevirtual   #233 <Method void avq.a(Object, long, byte)>
	//    7   13:return          
	}

	static void a(byte abyte0[], long l1, long l2, long l3)
	{
		f.a(abyte0, l1, l2, l3);
	//    0    0:getstatic       #93  <Field avq f>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:lload_3         
	//    4    6:lload           5
	//    5    8:invokevirtual   #236 <Method void avq.a(byte[], long, long, long)>
	//    6   11:return          
	}

	static boolean a()
	{
		return h;
	//    0    0:getstatic       #101 <Field boolean h>
	//    1    3:ireturn         
	}

	private static int b(Class class1)
	{
		if(h)
	//*   0    0:getstatic       #101 <Field boolean h>
	//*   1    3:ifeq            17
			return f.a.arrayIndexScale(class1);
	//    2    6:getstatic       #93  <Field avq f>
	//    3    9:getfield        #153 <Field Unsafe avq.a>
	//    4   12:aload_0         
	//    5   13:invokevirtual   #239 <Method int Unsafe.arrayIndexScale(Class)>
	//    6   16:ireturn         
		else
			return -1;
	//    7   17:iconst_m1       
	//    8   18:ireturn         
	}

	static long b(Object obj, long l1)
	{
		return f.f(obj, l1);
	//    0    0:getstatic       #93  <Field avq f>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:invokevirtual   #192 <Method long avq.f(Object, long)>
	//    4    8:lreturn         
	}

	static void b(Object obj, long l1, byte byte0)
	{
		d(obj, l1, byte0);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iload_3         
	//    3    3:invokestatic    #241 <Method void d(Object, long, byte)>
	//    4    6:return          
	}

	static void b(Object obj, long l1, boolean flag)
	{
		d(obj, l1, flag);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iload_3         
	//    3    3:invokestatic    #243 <Method void d(Object, long, boolean)>
	//    4    6:return          
	}

	static boolean b()
	{
		return g;
	//    0    0:getstatic       #97  <Field boolean g>
	//    1    3:ireturn         
	}

	static Unsafe c()
	{
		Throwable throwable;
		Unsafe unsafe;
		try
		{
			unsafe = (Unsafe)AccessController.doPrivileged(((java.security.PrivilegedExceptionAction) (new avr())));
	//    0    0:new             #245 <Class avr>
	//    1    3:dup             
	//    2    4:invokespecial   #246 <Method void avr()>
	//    3    7:invokestatic    #252 <Method Object AccessController.doPrivileged(java.security.PrivilegedExceptionAction)>
	//    4   10:checkcast       #155 <Class Unsafe>
	//    5   13:astore_0        
		}
	//*   6   14:aload_0         
	//*   7   15:areturn         
	//*   8   16:aconst_null     
	//*   9   17:areturn         
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			return null;
		}
		return unsafe;
	//*  10   18:astore_0        
	//*  11   19:goto            16
	}

	private static void c(Object obj, long l1, byte byte0)
	{
		long l2 = -4L & l1;
	//    0    0:ldc2w           #253 <Long -4L>
	//    1    3:lload_1         
	//    2    4:land            
	//    3    5:lstore          6
		int i1 = a(obj, l2);
	//    4    7:aload_0         
	//    5    8:lload           6
	//    6   10:invokestatic    #256 <Method int a(Object, long)>
	//    7   13:istore          4
		int j1 = (~(int)l1 & 3) << 3;
	//    8   15:lload_1         
	//    9   16:l2i             
	//   10   17:iconst_m1       
	//   11   18:ixor            
	//   12   19:iconst_3        
	//   13   20:iand            
	//   14   21:iconst_3        
	//   15   22:ishl            
	//   16   23:istore          5
		a(obj, l2, (0xff & byte0) << j1 | i1 & ~(255 << j1));
	//   17   25:aload_0         
	//   18   26:lload           6
	//   19   28:sipush          255
	//   20   31:iload_3         
	//   21   32:iand            
	//   22   33:iload           5
	//   23   35:ishl            
	//   24   36:iload           4
	//   25   38:sipush          255
	//   26   41:iload           5
	//   27   43:ishl            
	//   28   44:iconst_m1       
	//   29   45:ixor            
	//   30   46:iand            
	//   31   47:ior             
	//   32   48:invokestatic    #257 <Method void a(Object, long, int)>
	//   33   51:return          
	}

	static void c(Object obj, long l1, boolean flag)
	{
		e(obj, l1, flag);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iload_3         
	//    3    3:invokestatic    #259 <Method void e(Object, long, boolean)>
	//    4    6:return          
	}

	private static boolean c(Class class1)
	{
		if(!aql.a())
	//*   0    0:invokestatic    #79  <Method boolean aql.a()>
	//*   1    3:ifne            8
			return false;
	//    2    6:iconst_0        
	//    3    7:ireturn         
		try
		{
			Class class2 = c;
	//    4    8:getstatic       #61  <Field Class c>
	//    5   11:astore_1        
			class2.getMethod("peekLong", new Class[] {
				class1, Boolean.TYPE
			});
	//    6   12:aload_1         
	//    7   13:ldc2            #261 <String "peekLong">
	//    8   16:iconst_2        
	//    9   17:anewarray       Class[]
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:aload_0         
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_1        
	//   16   26:getstatic       #264 <Field Class Boolean.TYPE>
	//   17   29:aastore         
	//   18   30:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   19   33:pop             
			class2.getMethod("pokeLong", new Class[] {
				class1, Long.TYPE, Boolean.TYPE
			});
	//   20   34:aload_1         
	//   21   35:ldc2            #270 <String "pokeLong">
	//   22   38:iconst_3        
	//   23   39:anewarray       Class[]
	//   24   42:dup             
	//   25   43:iconst_0        
	//   26   44:aload_0         
	//   27   45:aastore         
	//   28   46:dup             
	//   29   47:iconst_1        
	//   30   48:getstatic       #66  <Field Class Long.TYPE>
	//   31   51:aastore         
	//   32   52:dup             
	//   33   53:iconst_2        
	//   34   54:getstatic       #264 <Field Class Boolean.TYPE>
	//   35   57:aastore         
	//   36   58:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   37   61:pop             
			class2.getMethod("pokeInt", new Class[] {
				class1, Integer.TYPE, Boolean.TYPE
			});
	//   38   62:aload_1         
	//   39   63:ldc2            #272 <String "pokeInt">
	//   40   66:iconst_3        
	//   41   67:anewarray       Class[]
	//   42   70:dup             
	//   43   71:iconst_0        
	//   44   72:aload_0         
	//   45   73:aastore         
	//   46   74:dup             
	//   47   75:iconst_1        
	//   48   76:getstatic       #74  <Field Class Integer.TYPE>
	//   49   79:aastore         
	//   50   80:dup             
	//   51   81:iconst_2        
	//   52   82:getstatic       #264 <Field Class Boolean.TYPE>
	//   53   85:aastore         
	//   54   86:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   55   89:pop             
			class2.getMethod("peekInt", new Class[] {
				class1, Boolean.TYPE
			});
	//   56   90:aload_1         
	//   57   91:ldc2            #274 <String "peekInt">
	//   58   94:iconst_2        
	//   59   95:anewarray       Class[]
	//   60   98:dup             
	//   61   99:iconst_0        
	//   62  100:aload_0         
	//   63  101:aastore         
	//   64  102:dup             
	//   65  103:iconst_1        
	//   66  104:getstatic       #264 <Field Class Boolean.TYPE>
	//   67  107:aastore         
	//   68  108:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   69  111:pop             
			class2.getMethod("pokeByte", new Class[] {
				class1, Byte.TYPE
			});
	//   70  112:aload_1         
	//   71  113:ldc2            #276 <String "pokeByte">
	//   72  116:iconst_2        
	//   73  117:anewarray       Class[]
	//   74  120:dup             
	//   75  121:iconst_0        
	//   76  122:aload_0         
	//   77  123:aastore         
	//   78  124:dup             
	//   79  125:iconst_1        
	//   80  126:getstatic       #279 <Field Class Byte.TYPE>
	//   81  129:aastore         
	//   82  130:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   83  133:pop             
			class2.getMethod("peekByte", new Class[] {
				class1
			});
	//   84  134:aload_1         
	//   85  135:ldc2            #281 <String "peekByte">
	//   86  138:iconst_1        
	//   87  139:anewarray       Class[]
	//   88  142:dup             
	//   89  143:iconst_0        
	//   90  144:aload_0         
	//   91  145:aastore         
	//   92  146:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   93  149:pop             
			class2.getMethod("pokeByteArray", new Class[] {
				class1, [B, Integer.TYPE, Integer.TYPE
			});
	//   94  150:aload_1         
	//   95  151:ldc2            #283 <String "pokeByteArray">
	//   96  154:iconst_4        
	//   97  155:anewarray       Class[]
	//   98  158:dup             
	//   99  159:iconst_0        
	//  100  160:aload_0         
	//  101  161:aastore         
	//  102  162:dup             
	//  103  163:iconst_1        
	//  104  164:ldc1            #103 <Class byte[]>
	//  105  166:aastore         
	//  106  167:dup             
	//  107  168:iconst_2        
	//  108  169:getstatic       #74  <Field Class Integer.TYPE>
	//  109  172:aastore         
	//  110  173:dup             
	//  111  174:iconst_3        
	//  112  175:getstatic       #74  <Field Class Integer.TYPE>
	//  113  178:aastore         
	//  114  179:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  115  182:pop             
			class2.getMethod("peekByteArray", new Class[] {
				class1, [B, Integer.TYPE, Integer.TYPE
			});
	//  116  183:aload_1         
	//  117  184:ldc2            #285 <String "peekByteArray">
	//  118  187:iconst_4        
	//  119  188:anewarray       Class[]
	//  120  191:dup             
	//  121  192:iconst_0        
	//  122  193:aload_0         
	//  123  194:aastore         
	//  124  195:dup             
	//  125  196:iconst_1        
	//  126  197:ldc1            #103 <Class byte[]>
	//  127  199:aastore         
	//  128  200:dup             
	//  129  201:iconst_2        
	//  130  202:getstatic       #74  <Field Class Integer.TYPE>
	//  131  205:aastore         
	//  132  206:dup             
	//  133  207:iconst_3        
	//  134  208:getstatic       #74  <Field Class Integer.TYPE>
	//  135  211:aastore         
	//  136  212:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  137  215:pop             
		}
	//* 138  216:iconst_1        
	//* 139  217:ireturn         
		// Misplaced declaration of an exception variable
		catch(Class class1)
	//* 140  218:astore_0        
		{
			return false;
	//  141  219:iconst_0        
	//  142  220:ireturn         
		}
		return true;
	}

	static boolean c(Object obj, long l1)
	{
		return f.b(obj, l1);
	//    0    0:getstatic       #93  <Field avq f>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:invokevirtual   #288 <Method boolean avq.b(Object, long)>
	//    4    8:ireturn         
	}

	static float d(Object obj, long l1)
	{
		return f.c(obj, l1);
	//    0    0:getstatic       #93  <Field avq f>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:invokevirtual   #291 <Method float avq.c(Object, long)>
	//    4    8:freturn         
	}

	static long d()
	{
		return i;
	//    0    0:getstatic       #108 <Field long i>
	//    1    3:lreturn         
	}

	private static void d(Object obj, long l1, byte byte0)
	{
		long l2 = -4L & l1;
	//    0    0:ldc2w           #253 <Long -4L>
	//    1    3:lload_1         
	//    2    4:land            
	//    3    5:lstore          6
		int i1 = a(obj, l2);
	//    4    7:aload_0         
	//    5    8:lload           6
	//    6   10:invokestatic    #256 <Method int a(Object, long)>
	//    7   13:istore          4
		int j1 = ((int)l1 & 3) << 3;
	//    8   15:lload_1         
	//    9   16:l2i             
	//   10   17:iconst_3        
	//   11   18:iand            
	//   12   19:iconst_3        
	//   13   20:ishl            
	//   14   21:istore          5
		a(obj, l2, (0xff & byte0) << j1 | i1 & ~(255 << j1));
	//   15   23:aload_0         
	//   16   24:lload           6
	//   17   26:sipush          255
	//   18   29:iload_3         
	//   19   30:iand            
	//   20   31:iload           5
	//   21   33:ishl            
	//   22   34:iload           4
	//   23   36:sipush          255
	//   24   39:iload           5
	//   25   41:ishl            
	//   26   42:iconst_m1       
	//   27   43:ixor            
	//   28   44:iand            
	//   29   45:ior             
	//   30   46:invokestatic    #257 <Method void a(Object, long, int)>
	//   31   49:return          
	}

	private static void d(Object obj, long l1, boolean flag)
	{
		c(obj, l1, (byte)flag);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iload_3         
	//    3    3:int2byte        
	//    4    4:invokestatic    #211 <Method void c(Object, long, byte)>
	//    5    7:return          
	}

	static double e(Object obj, long l1)
	{
		return f.d(obj, l1);
	//    0    0:getstatic       #93  <Field avq f>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:invokevirtual   #295 <Method double avq.d(Object, long)>
	//    4    8:dreturn         
	}

	private static void e(Object obj, long l1, boolean flag)
	{
		d(obj, l1, (byte)flag);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iload_3         
	//    3    3:int2byte        
	//    4    4:invokestatic    #241 <Method void d(Object, long, byte)>
	//    5    7:return          
	}

	static boolean e()
	{
		return w;
	//    0    0:getstatic       #175 <Field boolean w>
	//    1    3:ireturn         
	}

	static Object f(Object obj, long l1)
	{
		return f.a.getObject(obj, l1);
	//    0    0:getstatic       #93  <Field avq f>
	//    1    3:getfield        #153 <Field Unsafe avq.a>
	//    2    6:aload_0         
	//    3    7:lload_1         
	//    4    8:invokevirtual   #299 <Method Object Unsafe.getObject(Object, long)>
	//    5   11:areturn         
	}

	private static boolean f()
	{
		Object obj;
		obj = ((Object) (b));
	//    0    0:getstatic       #54  <Field Unsafe b>
	//    1    3:astore_0        
		if(obj == null)
	//*   2    4:aload_0         
	//*   3    5:ifnonnull       10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		obj = ((Object) (obj.getClass()));
	//    6   10:aload_0         
	//    7   11:invokevirtual   #302 <Method Class Object.getClass()>
	//    8   14:astore_0        
		((Class) (obj)).getMethod("objectFieldOffset", new Class[] {
			java/lang/reflect/Field
		});
	//    9   15:aload_0         
	//   10   16:ldc2            #303 <String "objectFieldOffset">
	//   11   19:iconst_1        
	//   12   20:anewarray       Class[]
	//   13   23:dup             
	//   14   24:iconst_0        
	//   15   25:ldc1            #201 <Class Field>
	//   16   27:aastore         
	//   17   28:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   18   31:pop             
		((Class) (obj)).getMethod("arrayBaseOffset", new Class[] {
			java/lang/Class
		});
	//   19   32:aload_0         
	//   20   33:ldc2            #304 <String "arrayBaseOffset">
	//   21   36:iconst_1        
	//   22   37:anewarray       Class[]
	//   23   40:dup             
	//   24   41:iconst_0        
	//   25   42:ldc1            #37  <Class Class>
	//   26   44:aastore         
	//   27   45:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   28   48:pop             
		((Class) (obj)).getMethod("arrayIndexScale", new Class[] {
			java/lang/Class
		});
	//   29   49:aload_0         
	//   30   50:ldc2            #305 <String "arrayIndexScale">
	//   31   53:iconst_1        
	//   32   54:anewarray       Class[]
	//   33   57:dup             
	//   34   58:iconst_0        
	//   35   59:ldc1            #37  <Class Class>
	//   36   61:aastore         
	//   37   62:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   38   65:pop             
		((Class) (obj)).getMethod("getInt", new Class[] {
			java/lang/Object, Long.TYPE
		});
	//   39   66:aload_0         
	//   40   67:ldc2            #307 <String "getInt">
	//   41   70:iconst_2        
	//   42   71:anewarray       Class[]
	//   43   74:dup             
	//   44   75:iconst_0        
	//   45   76:ldc1            #4   <Class Object>
	//   46   78:aastore         
	//   47   79:dup             
	//   48   80:iconst_1        
	//   49   81:getstatic       #66  <Field Class Long.TYPE>
	//   50   84:aastore         
	//   51   85:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   52   88:pop             
		((Class) (obj)).getMethod("putInt", new Class[] {
			java/lang/Object, Long.TYPE, Integer.TYPE
		});
	//   53   89:aload_0         
	//   54   90:ldc2            #309 <String "putInt">
	//   55   93:iconst_3        
	//   56   94:anewarray       Class[]
	//   57   97:dup             
	//   58   98:iconst_0        
	//   59   99:ldc1            #4   <Class Object>
	//   60  101:aastore         
	//   61  102:dup             
	//   62  103:iconst_1        
	//   63  104:getstatic       #66  <Field Class Long.TYPE>
	//   64  107:aastore         
	//   65  108:dup             
	//   66  109:iconst_2        
	//   67  110:getstatic       #74  <Field Class Integer.TYPE>
	//   68  113:aastore         
	//   69  114:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   70  117:pop             
		((Class) (obj)).getMethod("getLong", new Class[] {
			java/lang/Object, Long.TYPE
		});
	//   71  118:aload_0         
	//   72  119:ldc2            #311 <String "getLong">
	//   73  122:iconst_2        
	//   74  123:anewarray       Class[]
	//   75  126:dup             
	//   76  127:iconst_0        
	//   77  128:ldc1            #4   <Class Object>
	//   78  130:aastore         
	//   79  131:dup             
	//   80  132:iconst_1        
	//   81  133:getstatic       #66  <Field Class Long.TYPE>
	//   82  136:aastore         
	//   83  137:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   84  140:pop             
		((Class) (obj)).getMethod("putLong", new Class[] {
			java/lang/Object, Long.TYPE, Long.TYPE
		});
	//   85  141:aload_0         
	//   86  142:ldc2            #313 <String "putLong">
	//   87  145:iconst_3        
	//   88  146:anewarray       Class[]
	//   89  149:dup             
	//   90  150:iconst_0        
	//   91  151:ldc1            #4   <Class Object>
	//   92  153:aastore         
	//   93  154:dup             
	//   94  155:iconst_1        
	//   95  156:getstatic       #66  <Field Class Long.TYPE>
	//   96  159:aastore         
	//   97  160:dup             
	//   98  161:iconst_2        
	//   99  162:getstatic       #66  <Field Class Long.TYPE>
	//  100  165:aastore         
	//  101  166:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  102  169:pop             
		((Class) (obj)).getMethod("getObject", new Class[] {
			java/lang/Object, Long.TYPE
		});
	//  103  170:aload_0         
	//  104  171:ldc2            #314 <String "getObject">
	//  105  174:iconst_2        
	//  106  175:anewarray       Class[]
	//  107  178:dup             
	//  108  179:iconst_0        
	//  109  180:ldc1            #4   <Class Object>
	//  110  182:aastore         
	//  111  183:dup             
	//  112  184:iconst_1        
	//  113  185:getstatic       #66  <Field Class Long.TYPE>
	//  114  188:aastore         
	//  115  189:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  116  192:pop             
		((Class) (obj)).getMethod("putObject", new Class[] {
			java/lang/Object, Long.TYPE, java/lang/Object
		});
	//  117  193:aload_0         
	//  118  194:ldc2            #315 <String "putObject">
	//  119  197:iconst_3        
	//  120  198:anewarray       Class[]
	//  121  201:dup             
	//  122  202:iconst_0        
	//  123  203:ldc1            #4   <Class Object>
	//  124  205:aastore         
	//  125  206:dup             
	//  126  207:iconst_1        
	//  127  208:getstatic       #66  <Field Class Long.TYPE>
	//  128  211:aastore         
	//  129  212:dup             
	//  130  213:iconst_2        
	//  131  214:ldc1            #4   <Class Object>
	//  132  216:aastore         
	//  133  217:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  134  220:pop             
		if(aql.a())
	//* 135  221:invokestatic    #79  <Method boolean aql.a()>
	//* 136  224:ifeq            229
			return true;
	//  137  227:iconst_1        
	//  138  228:ireturn         
		try
		{
			((Class) (obj)).getMethod("getByte", new Class[] {
				java/lang/Object, Long.TYPE
			});
	//  139  229:aload_0         
	//  140  230:ldc2            #317 <String "getByte">
	//  141  233:iconst_2        
	//  142  234:anewarray       Class[]
	//  143  237:dup             
	//  144  238:iconst_0        
	//  145  239:ldc1            #4   <Class Object>
	//  146  241:aastore         
	//  147  242:dup             
	//  148  243:iconst_1        
	//  149  244:getstatic       #66  <Field Class Long.TYPE>
	//  150  247:aastore         
	//  151  248:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  152  251:pop             
			((Class) (obj)).getMethod("putByte", new Class[] {
				java/lang/Object, Long.TYPE, Byte.TYPE
			});
	//  153  252:aload_0         
	//  154  253:ldc2            #319 <String "putByte">
	//  155  256:iconst_3        
	//  156  257:anewarray       Class[]
	//  157  260:dup             
	//  158  261:iconst_0        
	//  159  262:ldc1            #4   <Class Object>
	//  160  264:aastore         
	//  161  265:dup             
	//  162  266:iconst_1        
	//  163  267:getstatic       #66  <Field Class Long.TYPE>
	//  164  270:aastore         
	//  165  271:dup             
	//  166  272:iconst_2        
	//  167  273:getstatic       #279 <Field Class Byte.TYPE>
	//  168  276:aastore         
	//  169  277:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  170  280:pop             
			((Class) (obj)).getMethod("getBoolean", new Class[] {
				java/lang/Object, Long.TYPE
			});
	//  171  281:aload_0         
	//  172  282:ldc2            #321 <String "getBoolean">
	//  173  285:iconst_2        
	//  174  286:anewarray       Class[]
	//  175  289:dup             
	//  176  290:iconst_0        
	//  177  291:ldc1            #4   <Class Object>
	//  178  293:aastore         
	//  179  294:dup             
	//  180  295:iconst_1        
	//  181  296:getstatic       #66  <Field Class Long.TYPE>
	//  182  299:aastore         
	//  183  300:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  184  303:pop             
			((Class) (obj)).getMethod("putBoolean", new Class[] {
				java/lang/Object, Long.TYPE, Boolean.TYPE
			});
	//  185  304:aload_0         
	//  186  305:ldc2            #323 <String "putBoolean">
	//  187  308:iconst_3        
	//  188  309:anewarray       Class[]
	//  189  312:dup             
	//  190  313:iconst_0        
	//  191  314:ldc1            #4   <Class Object>
	//  192  316:aastore         
	//  193  317:dup             
	//  194  318:iconst_1        
	//  195  319:getstatic       #66  <Field Class Long.TYPE>
	//  196  322:aastore         
	//  197  323:dup             
	//  198  324:iconst_2        
	//  199  325:getstatic       #264 <Field Class Boolean.TYPE>
	//  200  328:aastore         
	//  201  329:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  202  332:pop             
			((Class) (obj)).getMethod("getFloat", new Class[] {
				java/lang/Object, Long.TYPE
			});
	//  203  333:aload_0         
	//  204  334:ldc2            #325 <String "getFloat">
	//  205  337:iconst_2        
	//  206  338:anewarray       Class[]
	//  207  341:dup             
	//  208  342:iconst_0        
	//  209  343:ldc1            #4   <Class Object>
	//  210  345:aastore         
	//  211  346:dup             
	//  212  347:iconst_1        
	//  213  348:getstatic       #66  <Field Class Long.TYPE>
	//  214  351:aastore         
	//  215  352:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  216  355:pop             
			((Class) (obj)).getMethod("putFloat", new Class[] {
				java/lang/Object, Long.TYPE, Float.TYPE
			});
	//  217  356:aload_0         
	//  218  357:ldc2            #327 <String "putFloat">
	//  219  360:iconst_3        
	//  220  361:anewarray       Class[]
	//  221  364:dup             
	//  222  365:iconst_0        
	//  223  366:ldc1            #4   <Class Object>
	//  224  368:aastore         
	//  225  369:dup             
	//  226  370:iconst_1        
	//  227  371:getstatic       #66  <Field Class Long.TYPE>
	//  228  374:aastore         
	//  229  375:dup             
	//  230  376:iconst_2        
	//  231  377:getstatic       #330 <Field Class Float.TYPE>
	//  232  380:aastore         
	//  233  381:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  234  384:pop             
			((Class) (obj)).getMethod("getDouble", new Class[] {
				java/lang/Object, Long.TYPE
			});
	//  235  385:aload_0         
	//  236  386:ldc2            #332 <String "getDouble">
	//  237  389:iconst_2        
	//  238  390:anewarray       Class[]
	//  239  393:dup             
	//  240  394:iconst_0        
	//  241  395:ldc1            #4   <Class Object>
	//  242  397:aastore         
	//  243  398:dup             
	//  244  399:iconst_1        
	//  245  400:getstatic       #66  <Field Class Long.TYPE>
	//  246  403:aastore         
	//  247  404:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  248  407:pop             
			((Class) (obj)).getMethod("putDouble", new Class[] {
				java/lang/Object, Long.TYPE, Double.TYPE
			});
	//  249  408:aload_0         
	//  250  409:ldc2            #334 <String "putDouble">
	//  251  412:iconst_3        
	//  252  413:anewarray       Class[]
	//  253  416:dup             
	//  254  417:iconst_0        
	//  255  418:ldc1            #4   <Class Object>
	//  256  420:aastore         
	//  257  421:dup             
	//  258  422:iconst_1        
	//  259  423:getstatic       #66  <Field Class Long.TYPE>
	//  260  426:aastore         
	//  261  427:dup             
	//  262  428:iconst_2        
	//  263  429:getstatic       #337 <Field Class Double.TYPE>
	//  264  432:aastore         
	//  265  433:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  266  436:pop             
		}
	//* 267  437:iconst_1        
	//* 268  438:ireturn         
		catch(Throwable throwable)
	//* 269  439:astore_2        
		{
			Logger logger = a;
	//  270  440:getstatic       #49  <Field Logger a>
	//  271  443:astore_0        
			Level level = Level.WARNING;
	//  272  444:getstatic       #343 <Field Level Level.WARNING>
	//  273  447:astore_1        
			String s1 = String.valueOf(((Object) (throwable)));
	//  274  448:aload_2         
	//  275  449:invokestatic    #349 <Method String String.valueOf(Object)>
	//  276  452:astore_2        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s1))).length() + 71);
	//  277  453:new             #351 <Class StringBuilder>
	//  278  456:dup             
	//  279  457:aload_2         
	//  280  458:invokestatic    #349 <Method String String.valueOf(Object)>
	//  281  461:invokevirtual   #355 <Method int String.length()>
	//  282  464:bipush          71
	//  283  466:iadd            
	//  284  467:invokespecial   #358 <Method void StringBuilder(int)>
	//  285  470:astore_3        
			stringbuilder.append("platform method missing - proto runtime falling back to safer methods: ");
	//  286  471:aload_3         
	//  287  472:ldc2            #360 <String "platform method missing - proto runtime falling back to safer methods: ">
	//  288  475:invokevirtual   #364 <Method StringBuilder StringBuilder.append(String)>
	//  289  478:pop             
			stringbuilder.append(s1);
	//  290  479:aload_3         
	//  291  480:aload_2         
	//  292  481:invokevirtual   #364 <Method StringBuilder StringBuilder.append(String)>
	//  293  484:pop             
			logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", stringbuilder.toString());
	//  294  485:aload_0         
	//  295  486:aload_1         
	//  296  487:ldc2            #366 <String "com.google.protobuf.UnsafeUtil">
	//  297  490:ldc2            #368 <String "supportsUnsafeArrayOperations">
	//  298  493:aload_3         
	//  299  494:invokevirtual   #371 <Method String StringBuilder.toString()>
	//  300  497:invokevirtual   #375 <Method void Logger.logp(Level, String, String, String)>
			return false;
	//  301  500:iconst_0        
	//  302  501:ireturn         
		}
		return true;
	}

	static byte g(Object obj, long l1)
	{
		return k(obj, l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #377 <Method byte k(Object, long)>
	//    3    5:ireturn         
	}

	private static boolean g()
	{
		Object obj;
		obj = ((Object) (b));
	//    0    0:getstatic       #54  <Field Unsafe b>
	//    1    3:astore_0        
		if(obj == null)
	//*   2    4:aload_0         
	//*   3    5:ifnonnull       10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		obj = ((Object) (obj.getClass()));
	//    6   10:aload_0         
	//    7   11:invokevirtual   #302 <Method Class Object.getClass()>
	//    8   14:astore_0        
		((Class) (obj)).getMethod("objectFieldOffset", new Class[] {
			java/lang/reflect/Field
		});
	//    9   15:aload_0         
	//   10   16:ldc2            #303 <String "objectFieldOffset">
	//   11   19:iconst_1        
	//   12   20:anewarray       Class[]
	//   13   23:dup             
	//   14   24:iconst_0        
	//   15   25:ldc1            #201 <Class Field>
	//   16   27:aastore         
	//   17   28:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   18   31:pop             
		((Class) (obj)).getMethod("getLong", new Class[] {
			java/lang/Object, Long.TYPE
		});
	//   19   32:aload_0         
	//   20   33:ldc2            #311 <String "getLong">
	//   21   36:iconst_2        
	//   22   37:anewarray       Class[]
	//   23   40:dup             
	//   24   41:iconst_0        
	//   25   42:ldc1            #4   <Class Object>
	//   26   44:aastore         
	//   27   45:dup             
	//   28   46:iconst_1        
	//   29   47:getstatic       #66  <Field Class Long.TYPE>
	//   30   50:aastore         
	//   31   51:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   32   54:pop             
		if(h() == null)
	//*  33   55:invokestatic    #149 <Method Field h()>
	//*  34   58:ifnonnull       63
			return false;
	//   35   61:iconst_0        
	//   36   62:ireturn         
		if(aql.a())
	//*  37   63:invokestatic    #79  <Method boolean aql.a()>
	//*  38   66:ifeq            71
			return true;
	//   39   69:iconst_1        
	//   40   70:ireturn         
		try
		{
			((Class) (obj)).getMethod("getByte", new Class[] {
				Long.TYPE
			});
	//   41   71:aload_0         
	//   42   72:ldc2            #317 <String "getByte">
	//   43   75:iconst_1        
	//   44   76:anewarray       Class[]
	//   45   79:dup             
	//   46   80:iconst_0        
	//   47   81:getstatic       #66  <Field Class Long.TYPE>
	//   48   84:aastore         
	//   49   85:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   50   88:pop             
			((Class) (obj)).getMethod("putByte", new Class[] {
				Long.TYPE, Byte.TYPE
			});
	//   51   89:aload_0         
	//   52   90:ldc2            #319 <String "putByte">
	//   53   93:iconst_2        
	//   54   94:anewarray       Class[]
	//   55   97:dup             
	//   56   98:iconst_0        
	//   57   99:getstatic       #66  <Field Class Long.TYPE>
	//   58  102:aastore         
	//   59  103:dup             
	//   60  104:iconst_1        
	//   61  105:getstatic       #279 <Field Class Byte.TYPE>
	//   62  108:aastore         
	//   63  109:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   64  112:pop             
			((Class) (obj)).getMethod("getInt", new Class[] {
				Long.TYPE
			});
	//   65  113:aload_0         
	//   66  114:ldc2            #307 <String "getInt">
	//   67  117:iconst_1        
	//   68  118:anewarray       Class[]
	//   69  121:dup             
	//   70  122:iconst_0        
	//   71  123:getstatic       #66  <Field Class Long.TYPE>
	//   72  126:aastore         
	//   73  127:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   74  130:pop             
			((Class) (obj)).getMethod("putInt", new Class[] {
				Long.TYPE, Integer.TYPE
			});
	//   75  131:aload_0         
	//   76  132:ldc2            #309 <String "putInt">
	//   77  135:iconst_2        
	//   78  136:anewarray       Class[]
	//   79  139:dup             
	//   80  140:iconst_0        
	//   81  141:getstatic       #66  <Field Class Long.TYPE>
	//   82  144:aastore         
	//   83  145:dup             
	//   84  146:iconst_1        
	//   85  147:getstatic       #74  <Field Class Integer.TYPE>
	//   86  150:aastore         
	//   87  151:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   88  154:pop             
			((Class) (obj)).getMethod("getLong", new Class[] {
				Long.TYPE
			});
	//   89  155:aload_0         
	//   90  156:ldc2            #311 <String "getLong">
	//   91  159:iconst_1        
	//   92  160:anewarray       Class[]
	//   93  163:dup             
	//   94  164:iconst_0        
	//   95  165:getstatic       #66  <Field Class Long.TYPE>
	//   96  168:aastore         
	//   97  169:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   98  172:pop             
			((Class) (obj)).getMethod("putLong", new Class[] {
				Long.TYPE, Long.TYPE
			});
	//   99  173:aload_0         
	//  100  174:ldc2            #313 <String "putLong">
	//  101  177:iconst_2        
	//  102  178:anewarray       Class[]
	//  103  181:dup             
	//  104  182:iconst_0        
	//  105  183:getstatic       #66  <Field Class Long.TYPE>
	//  106  186:aastore         
	//  107  187:dup             
	//  108  188:iconst_1        
	//  109  189:getstatic       #66  <Field Class Long.TYPE>
	//  110  192:aastore         
	//  111  193:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  112  196:pop             
			((Class) (obj)).getMethod("copyMemory", new Class[] {
				Long.TYPE, Long.TYPE, Long.TYPE
			});
	//  113  197:aload_0         
	//  114  198:ldc2            #379 <String "copyMemory">
	//  115  201:iconst_3        
	//  116  202:anewarray       Class[]
	//  117  205:dup             
	//  118  206:iconst_0        
	//  119  207:getstatic       #66  <Field Class Long.TYPE>
	//  120  210:aastore         
	//  121  211:dup             
	//  122  212:iconst_1        
	//  123  213:getstatic       #66  <Field Class Long.TYPE>
	//  124  216:aastore         
	//  125  217:dup             
	//  126  218:iconst_2        
	//  127  219:getstatic       #66  <Field Class Long.TYPE>
	//  128  222:aastore         
	//  129  223:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  130  226:pop             
			((Class) (obj)).getMethod("copyMemory", new Class[] {
				java/lang/Object, Long.TYPE, java/lang/Object, Long.TYPE, Long.TYPE
			});
	//  131  227:aload_0         
	//  132  228:ldc2            #379 <String "copyMemory">
	//  133  231:iconst_5        
	//  134  232:anewarray       Class[]
	//  135  235:dup             
	//  136  236:iconst_0        
	//  137  237:ldc1            #4   <Class Object>
	//  138  239:aastore         
	//  139  240:dup             
	//  140  241:iconst_1        
	//  141  242:getstatic       #66  <Field Class Long.TYPE>
	//  142  245:aastore         
	//  143  246:dup             
	//  144  247:iconst_2        
	//  145  248:ldc1            #4   <Class Object>
	//  146  250:aastore         
	//  147  251:dup             
	//  148  252:iconst_3        
	//  149  253:getstatic       #66  <Field Class Long.TYPE>
	//  150  256:aastore         
	//  151  257:dup             
	//  152  258:iconst_4        
	//  153  259:getstatic       #66  <Field Class Long.TYPE>
	//  154  262:aastore         
	//  155  263:invokevirtual   #268 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  156  266:pop             
		}
	//* 157  267:iconst_1        
	//* 158  268:ireturn         
		catch(Throwable throwable)
	//* 159  269:astore_2        
		{
			Logger logger = a;
	//  160  270:getstatic       #49  <Field Logger a>
	//  161  273:astore_0        
			Level level = Level.WARNING;
	//  162  274:getstatic       #343 <Field Level Level.WARNING>
	//  163  277:astore_1        
			String s1 = String.valueOf(((Object) (throwable)));
	//  164  278:aload_2         
	//  165  279:invokestatic    #349 <Method String String.valueOf(Object)>
	//  166  282:astore_2        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s1))).length() + 71);
	//  167  283:new             #351 <Class StringBuilder>
	//  168  286:dup             
	//  169  287:aload_2         
	//  170  288:invokestatic    #349 <Method String String.valueOf(Object)>
	//  171  291:invokevirtual   #355 <Method int String.length()>
	//  172  294:bipush          71
	//  173  296:iadd            
	//  174  297:invokespecial   #358 <Method void StringBuilder(int)>
	//  175  300:astore_3        
			stringbuilder.append("platform method missing - proto runtime falling back to safer methods: ");
	//  176  301:aload_3         
	//  177  302:ldc2            #360 <String "platform method missing - proto runtime falling back to safer methods: ">
	//  178  305:invokevirtual   #364 <Method StringBuilder StringBuilder.append(String)>
	//  179  308:pop             
			stringbuilder.append(s1);
	//  180  309:aload_3         
	//  181  310:aload_2         
	//  182  311:invokevirtual   #364 <Method StringBuilder StringBuilder.append(String)>
	//  183  314:pop             
			logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", stringbuilder.toString());
	//  184  315:aload_0         
	//  185  316:aload_1         
	//  186  317:ldc2            #366 <String "com.google.protobuf.UnsafeUtil">
	//  187  320:ldc2            #381 <String "supportsUnsafeByteBufferOperations">
	//  188  323:aload_3         
	//  189  324:invokevirtual   #371 <Method String StringBuilder.toString()>
	//  190  327:invokevirtual   #375 <Method void Logger.logp(Level, String, String, String)>
			return false;
	//  191  330:iconst_0        
	//  192  331:ireturn         
		}
		return true;
	}

	static byte h(Object obj, long l1)
	{
		return l(obj, l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #383 <Method byte l(Object, long)>
	//    3    5:ireturn         
	}

	private static Field h()
	{
		if(aql.a())
	//*   0    0:invokestatic    #79  <Method boolean aql.a()>
	//*   1    3:ifeq            22
		{
			Field field = a(java/nio/Buffer, "effectiveDirectAddress");
	//    2    6:ldc2            #385 <Class Buffer>
	//    3    9:ldc2            #387 <String "effectiveDirectAddress">
	//    4   12:invokestatic    #389 <Method Field a(Class, String)>
	//    5   15:astore_0        
			if(field != null)
	//*   6   16:aload_0         
	//*   7   17:ifnull          22
				return field;
	//    8   20:aload_0         
	//    9   21:areturn         
		}
		Field field1 = a(java/nio/Buffer, "address");
	//   10   22:ldc2            #385 <Class Buffer>
	//   11   25:ldc2            #391 <String "address">
	//   12   28:invokestatic    #389 <Method Field a(Class, String)>
	//   13   31:astore_0        
		if(field1 != null && field1.getType() == Long.TYPE)
	//*  14   32:aload_0         
	//*  15   33:ifnull          48
	//*  16   36:aload_0         
	//*  17   37:invokevirtual   #394 <Method Class Field.getType()>
	//*  18   40:getstatic       #66  <Field Class Long.TYPE>
	//*  19   43:if_acmpne       48
			return field1;
	//   20   46:aload_0         
	//   21   47:areturn         
		else
			return null;
	//   22   48:aconst_null     
	//   23   49:areturn         
	}

	static boolean i(Object obj, long l1)
	{
		return m(obj, l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #396 <Method boolean m(Object, long)>
	//    3    5:ireturn         
	}

	static boolean j(Object obj, long l1)
	{
		return n(obj, l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #398 <Method boolean n(Object, long)>
	//    3    5:ireturn         
	}

	private static byte k(Object obj, long l1)
	{
		return (byte)(a(obj, -4L & l1) >>> (int)((~l1 & 3L) << 3));
	//    0    0:aload_0         
	//    1    1:ldc2w           #253 <Long -4L>
	//    2    4:lload_1         
	//    3    5:land            
	//    4    6:invokestatic    #256 <Method int a(Object, long)>
	//    5    9:lload_1         
	//    6   10:ldc2w           #160 <Long -1L>
	//    7   13:lxor            
	//    8   14:ldc2w           #399 <Long 3L>
	//    9   17:land            
	//   10   18:iconst_3        
	//   11   19:lshl            
	//   12   20:l2i             
	//   13   21:iushr           
	//   14   22:int2byte        
	//   15   23:ireturn         
	}

	private static byte l(Object obj, long l1)
	{
		return (byte)(a(obj, -4L & l1) >>> (int)((l1 & 3L) << 3));
	//    0    0:aload_0         
	//    1    1:ldc2w           #253 <Long -4L>
	//    2    4:lload_1         
	//    3    5:land            
	//    4    6:invokestatic    #256 <Method int a(Object, long)>
	//    5    9:lload_1         
	//    6   10:ldc2w           #399 <Long 3L>
	//    7   13:land            
	//    8   14:iconst_3        
	//    9   15:lshl            
	//   10   16:l2i             
	//   11   17:iushr           
	//   12   18:int2byte        
	//   13   19:ireturn         
	}

	private static boolean m(Object obj, long l1)
	{
		return k(obj, l1) != 0;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #377 <Method byte k(Object, long)>
	//    3    5:ifeq            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	private static boolean n(Object obj, long l1)
	{
		return l(obj, l1) != 0;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #383 <Method byte l(Object, long)>
	//    3    5:ifeq            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	private static final Logger a;
	private static final Unsafe b;
	private static final Class c;
	private static final boolean d;
	private static final boolean e;
	private static final avq f;
	private static final boolean g;
	private static final boolean h;
	private static final long i;
	private static final long j;
	private static final long k;
	private static final long l;
	private static final long m;
	private static final long n;
	private static final long o;
	private static final long p;
	private static final long q;
	private static final long r;
	private static final long s;
	private static final long t;
	private static final long u;
	private static final long v;
	private static final boolean w;

	static 
	{
		long l1;
label0:
		{
			a = Logger.getLogger(((Class) (com/google/android/gms/internal/ads/avm)).getName());
	//    0    0:ldc1            #2   <Class avm>
	//    1    2:invokevirtual   #41  <Method String Class.getName()>
	//    2    5:invokestatic    #47  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #49  <Field Logger a>
			b = c();
	//    4   11:invokestatic    #52  <Method Unsafe c()>
	//    5   14:putstatic       #54  <Field Unsafe b>
			c = aql.b();
	//    6   17:invokestatic    #59  <Method Class aql.b()>
	//    7   20:putstatic       #61  <Field Class c>
			d = c(Long.TYPE);
	//    8   23:getstatic       #66  <Field Class Long.TYPE>
	//    9   26:invokestatic    #69  <Method boolean c(Class)>
	//   10   29:putstatic       #71  <Field boolean d>
			e = c(Integer.TYPE);
	//   11   32:getstatic       #74  <Field Class Integer.TYPE>
	//   12   35:invokestatic    #69  <Method boolean c(Class)>
	//   13   38:putstatic       #76  <Field boolean e>
			Unsafe unsafe = b;
	//   14   41:getstatic       #54  <Field Unsafe b>
	//   15   44:astore          4
			Object obj = null;
	//   16   46:aconst_null     
	//   17   47:astore_3        
			if(unsafe != null)
	//*  18   48:aload           4
	//*  19   50:ifnonnull       56
	//*  20   53:goto            113
				if(aql.a())
	//*  21   56:invokestatic    #79  <Method boolean aql.a()>
	//*  22   59:ifeq            102
				{
					if(d)
	//*  23   62:getstatic       #71  <Field boolean d>
	//*  24   65:ifeq            82
						obj = ((Object) (new avo(b)));
	//   25   68:new             #81  <Class avo>
	//   26   71:dup             
	//   27   72:getstatic       #54  <Field Unsafe b>
	//   28   75:invokespecial   #85  <Method void avo(Unsafe)>
	//   29   78:astore_3        
					else
	//*  30   79:goto            113
					if(e)
	//*  31   82:getstatic       #76  <Field boolean e>
	//*  32   85:ifeq            113
						obj = ((Object) (new avn(b)));
	//   33   88:new             #87  <Class avn>
	//   34   91:dup             
	//   35   92:getstatic       #54  <Field Unsafe b>
	//   36   95:invokespecial   #88  <Method void avn(Unsafe)>
	//   37   98:astore_3        
				} else
	//*  38   99:goto            113
				{
					obj = ((Object) (new avp(b)));
	//   39  102:new             #90  <Class avp>
	//   40  105:dup             
	//   41  106:getstatic       #54  <Field Unsafe b>
	//   42  109:invokespecial   #91  <Method void avp(Unsafe)>
	//   43  112:astore_3        
				}
			f = ((avq) (obj));
	//   44  113:aload_3         
	//   45  114:putstatic       #93  <Field avq f>
			g = g();
	//   46  117:invokestatic    #95  <Method boolean g()>
	//   47  120:putstatic       #97  <Field boolean g>
			h = f();
	//   48  123:invokestatic    #99  <Method boolean f()>
	//   49  126:putstatic       #101 <Field boolean h>
			i = a([B);
	//   50  129:ldc1            #103 <Class byte[]>
	//   51  131:invokestatic    #106 <Method int a(Class)>
	//   52  134:i2l             
	//   53  135:putstatic       #108 <Field long i>
			j = a([Z);
	//   54  138:ldc1            #110 <Class boolean[]>
	//   55  140:invokestatic    #106 <Method int a(Class)>
	//   56  143:i2l             
	//   57  144:putstatic       #112 <Field long j>
			k = b([Z);
	//   58  147:ldc1            #110 <Class boolean[]>
	//   59  149:invokestatic    #114 <Method int b(Class)>
	//   60  152:i2l             
	//   61  153:putstatic       #116 <Field long k>
			l = a([I);
	//   62  156:ldc1            #118 <Class int[]>
	//   63  158:invokestatic    #106 <Method int a(Class)>
	//   64  161:i2l             
	//   65  162:putstatic       #120 <Field long l>
			m = b([I);
	//   66  165:ldc1            #118 <Class int[]>
	//   67  167:invokestatic    #114 <Method int b(Class)>
	//   68  170:i2l             
	//   69  171:putstatic       #122 <Field long m>
			n = a([J);
	//   70  174:ldc1            #124 <Class long[]>
	//   71  176:invokestatic    #106 <Method int a(Class)>
	//   72  179:i2l             
	//   73  180:putstatic       #126 <Field long n>
			o = b([J);
	//   74  183:ldc1            #124 <Class long[]>
	//   75  185:invokestatic    #114 <Method int b(Class)>
	//   76  188:i2l             
	//   77  189:putstatic       #128 <Field long o>
			p = a([F);
	//   78  192:ldc1            #130 <Class float[]>
	//   79  194:invokestatic    #106 <Method int a(Class)>
	//   80  197:i2l             
	//   81  198:putstatic       #132 <Field long p>
			q = b([F);
	//   82  201:ldc1            #130 <Class float[]>
	//   83  203:invokestatic    #114 <Method int b(Class)>
	//   84  206:i2l             
	//   85  207:putstatic       #134 <Field long q>
			r = a([D);
	//   86  210:ldc1            #136 <Class double[]>
	//   87  212:invokestatic    #106 <Method int a(Class)>
	//   88  215:i2l             
	//   89  216:putstatic       #138 <Field long r>
			s = b([D);
	//   90  219:ldc1            #136 <Class double[]>
	//   91  221:invokestatic    #114 <Method int b(Class)>
	//   92  224:i2l             
	//   93  225:putstatic       #140 <Field long s>
			t = a([Ljava/lang/Object;);
	//   94  228:ldc1            #142 <Class Object[]>
	//   95  230:invokestatic    #106 <Method int a(Class)>
	//   96  233:i2l             
	//   97  234:putstatic       #144 <Field long t>
			u = b([Ljava/lang/Object;);
	//   98  237:ldc1            #142 <Class Object[]>
	//   99  239:invokestatic    #114 <Method int b(Class)>
	//  100  242:i2l             
	//  101  243:putstatic       #146 <Field long u>
			obj = ((Object) (h()));
	//  102  246:invokestatic    #149 <Method Field h()>
	//  103  249:astore_3        
			if(obj != null)
	//* 104  250:aload_3         
	//* 105  251:ifnull          280
			{
				avq avq1 = f;
	//  106  254:getstatic       #93  <Field avq f>
	//  107  257:astore          4
				if(avq1 != null)
	//* 108  259:aload           4
	//* 109  261:ifnonnull       267
	//* 110  264:goto            280
				{
					l1 = avq1.a.objectFieldOffset(((Field) (obj)));
	//  111  267:aload           4
	//  112  269:getfield        #153 <Field Unsafe avq.a>
	//  113  272:aload_3         
	//  114  273:invokevirtual   #159 <Method long Unsafe.objectFieldOffset(Field)>
	//  115  276:lstore_0        
					break label0;
	//  116  277:goto            284
				}
			}
			l1 = -1L;
	//  117  280:ldc2w           #160 <Long -1L>
	//  118  283:lstore_0        
		}
		v = l1;
	//  119  284:lload_0         
	//  120  285:putstatic       #163 <Field long v>
		boolean flag;
		if(ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN)
	//* 121  288:invokestatic    #169 <Method ByteOrder ByteOrder.nativeOrder()>
	//* 122  291:getstatic       #173 <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//* 123  294:if_acmpne       302
			flag = true;
	//  124  297:iconst_1        
	//  125  298:istore_2        
		else
	//* 126  299:goto            304
			flag = false;
	//  127  302:iconst_0        
	//  128  303:istore_2        
		w = flag;
	//  129  304:iload_2         
	//  130  305:putstatic       #175 <Field boolean w>
	//* 131  308:return          
	}
}
