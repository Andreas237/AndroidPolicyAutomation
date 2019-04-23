// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import dalvik.system.DexClassLoader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bav, bcf, baf, bag

public class bce
{

	public transient bce(bav bav1, String s, String s1, Class aclass[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:putfield        #29  <Field int e>
		f = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #31  <Field Method f>
		h = new CountDownLatch(1);
	//    8   14:aload_0         
	//    9   15:new             #33  <Class CountDownLatch>
	//   10   18:dup             
	//   11   19:iconst_1        
	//   12   20:invokespecial   #36  <Method void CountDownLatch(int)>
	//   13   23:putfield        #38  <Field CountDownLatch h>
		b = bav1;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:putfield        #40  <Field bav b>
		c = s;
	//   17   31:aload_0         
	//   18   32:aload_2         
	//   19   33:putfield        #42  <Field String c>
		d = s1;
	//   20   36:aload_0         
	//   21   37:aload_3         
	//   22   38:putfield        #44  <Field String d>
		g = aclass;
	//   23   41:aload_0         
	//   24   42:aload           4
	//   25   44:putfield        #46  <Field Class[] g>
		b.c().submit(((Runnable) (new bcf(this))));
	//   26   47:aload_0         
	//   27   48:getfield        #40  <Field bav b>
	//   28   51:invokevirtual   #51  <Method ExecutorService bav.c()>
	//   29   54:new             #53  <Class bcf>
	//   30   57:dup             
	//   31   58:aload_0         
	//   32   59:invokespecial   #56  <Method void bcf(bce)>
	//   33   62:invokeinterface #62  <Method java.util.concurrent.Future ExecutorService.submit(Runnable)>
	//   34   67:pop             
	//   35   68:return          
	}

	private final String a(byte abyte0[], String s)
	{
		return new String(b.e().a(abyte0, s), "UTF-8");
	//    0    0:new             #65  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #40  <Field bav b>
	//    4    8:invokevirtual   #68  <Method baf bav.e()>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #73  <Method byte[] baf.a(byte[], String)>
	//    8   16:ldc1            #75  <String "UTF-8">
	//    9   18:invokespecial   #78  <Method void String(byte[], String)>
	//   10   21:areturn         
	}

	static void a(bce bce1)
	{
		bce1.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method void b()>
	//    2    4:return          
	}

	private final void b()
	{
		Object obj;
		Exception exception;
		try
		{
			obj = ((Object) (b.d().loadClass(a(b.f(), c))));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field bav b>
	//    2    4:invokevirtual   #93  <Method DexClassLoader bav.d()>
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #40  <Field bav b>
	//    6   12:invokevirtual   #96  <Method byte[] bav.f()>
	//    7   15:aload_0         
	//    8   16:getfield        #42  <Field String c>
	//    9   19:invokespecial   #98  <Method String a(byte[], String)>
	//   10   22:invokevirtual   #104 <Method Class DexClassLoader.loadClass(String)>
	//   11   25:astore_1        
		}
	//*  12   26:aload_1         
	//*  13   27:ifnonnull       38
	//*  14   30:aload_0         
	//*  15   31:getfield        #38  <Field CountDownLatch h>
	//*  16   34:invokevirtual   #107 <Method void CountDownLatch.countDown()>
	//*  17   37:return          
	//*  18   38:aload_0         
	//*  19   39:aload_1         
	//*  20   40:aload_0         
	//*  21   41:aload_0         
	//*  22   42:getfield        #40  <Field bav b>
	//*  23   45:invokevirtual   #96  <Method byte[] bav.f()>
	//*  24   48:aload_0         
	//*  25   49:getfield        #44  <Field String d>
	//*  26   52:invokespecial   #98  <Method String a(byte[], String)>
	//*  27   55:aload_0         
	//*  28   56:getfield        #46  <Field Class[] g>
	//*  29   59:invokevirtual   #113 <Method Method Class.getMethod(String, Class[])>
	//*  30   62:putfield        #31  <Field Method f>
	//*  31   65:aload_0         
	//*  32   66:getfield        #31  <Field Method f>
	//*  33   69:astore_1        
	//*  34   70:aload_1         
	//*  35   71:ifnonnull       82
	//*  36   74:aload_0         
	//*  37   75:getfield        #38  <Field CountDownLatch h>
	//*  38   78:invokevirtual   #107 <Method void CountDownLatch.countDown()>
	//*  39   81:return          
	//*  40   82:aload_0         
	//*  41   83:getfield        #38  <Field CountDownLatch h>
	//*  42   86:invokevirtual   #107 <Method void CountDownLatch.countDown()>
	//*  43   89:return          
	//*  44   90:astore_1        
	//*  45   91:aload_0         
	//*  46   92:getfield        #38  <Field CountDownLatch h>
	//*  47   95:invokevirtual   #107 <Method void CountDownLatch.countDown()>
	//*  48   98:aload_1         
	//*  49   99:athrow          
	//*  50  100:aload_0         
	//*  51  101:getfield        #38  <Field CountDownLatch h>
	//*  52  104:invokevirtual   #107 <Method void CountDownLatch.countDown()>
	//*  53  107:return          
	//*  54  108:aload_0         
	//*  55  109:getfield        #38  <Field CountDownLatch h>
	//*  56  112:invokevirtual   #107 <Method void CountDownLatch.countDown()>
	//*  57  115:return          
	//*  58  116:aload_0         
	//*  59  117:getfield        #38  <Field CountDownLatch h>
	//*  60  120:invokevirtual   #107 <Method void CountDownLatch.countDown()>
	//*  61  123:return          
	//*  62  124:aload_0         
	//*  63  125:getfield        #38  <Field CountDownLatch h>
	//*  64  128:invokevirtual   #107 <Method void CountDownLatch.countDown()>
	//*  65  131:return          
	//*  66  132:aload_0         
	//*  67  133:getfield        #38  <Field CountDownLatch h>
	//*  68  136:invokevirtual   #107 <Method void CountDownLatch.countDown()>
	//*  69  139:return          
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			h.countDown();
			return;
		}
	//*  70  140:astore_1        
	//*  71  141:goto            132
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			h.countDown();
			return;
		}
	//*  72  144:astore_1        
	//*  73  145:goto            124
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			h.countDown();
			return;
		}
	//*  74  148:astore_1        
	//*  75  149:goto            116
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			h.countDown();
			return;
		}
	//*  76  152:astore_1        
	//*  77  153:goto            108
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			h.countDown();
			return;
		}
		if(obj == null)
		{
			h.countDown();
			return;
		}
		f = ((Class) (obj)).getMethod(a(b.f(), d), g);
		obj = ((Object) (f));
		if(obj == null)
		{
			h.countDown();
			return;
		} else
		{
			h.countDown();
			return;
		}
		exception;
		Object obj1;
		h.countDown();
		throw exception;
	//*  78  156:astore_1        
	//*  79  157:goto            100
	}

	public final Method a()
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Method f>
	//*   2    4:ifnull          12
			return f;
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field Method f>
	//    5   11:areturn         
		if(!h.await(2L, TimeUnit.SECONDS))
	//*   6   12:aload_0         
	//*   7   13:getfield        #38  <Field CountDownLatch h>
	//*   8   16:ldc2w           #117 <Long 2L>
	//*   9   19:getstatic       #124 <Field TimeUnit TimeUnit.SECONDS>
	//*  10   22:invokevirtual   #128 <Method boolean CountDownLatch.await(long, TimeUnit)>
	//*  11   25:ifne            30
			return null;
	//   12   28:aconst_null     
	//   13   29:areturn         
		Method method;
		try
		{
			method = f;
	//   14   30:aload_0         
	//   15   31:getfield        #31  <Field Method f>
	//   16   34:astore_1        
		}
	//*  17   35:aload_1         
	//*  18   36:areturn         
		catch(InterruptedException interruptedexception)
	//*  19   37:astore_1        
		{
			return null;
	//   20   38:aconst_null     
	//   21   39:areturn         
		}
		return method;
	}

	private static final String a = "bce";
	private final bav b;
	private final String c;
	private final String d;
	private final int e = 2;
	private volatile Method f;
	private final Class g[];
	private CountDownLatch h;

	static 
	{
	//    0    0:return          
	}
}
