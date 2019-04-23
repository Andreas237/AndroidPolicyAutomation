// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.internal.ads:
//			abc, aza, ayu, acd, 
//			xz

public abstract class ayo
	implements abc
{

	protected ayo(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		i = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #39  <Long -1L>
	//    4    8:putfield        #42  <Field long i>
		k = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #44  <Field ByteBuffer k>
		c = s;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #46  <Field String c>
		e = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #48  <Field boolean e>
		a = true;
	//   14   26:aload_0         
	//   15   27:iconst_1        
	//   16   28:putfield        #50  <Field boolean a>
	//   17   31:return          
	}

	private final void b()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = e;
	//    2    2:aload_0         
	//    3    3:getfield        #48  <Field boolean e>
	//    4    6:istore_1        
		if(flag)
			break MISSING_BLOCK_LABEL_94;
	//    5    7:iload_1         
	//    6    8:ifne            94
		String s;
		aza aza1;
		aza1 = b;
	//    7   11:getstatic       #33  <Field aza b>
	//    8   14:astore_3        
		s = String.valueOf(((Object) (c)));
	//    9   15:aload_0         
	//   10   16:getfield        #46  <Field String c>
	//   11   19:invokestatic    #58  <Method String String.valueOf(Object)>
	//   12   22:astore_2        
		if(s.length() != 0)
	//*  13   23:aload_2         
	//*  14   24:invokevirtual   #62  <Method int String.length()>
	//*  15   27:ifeq            40
		{
			s = "mem mapping ".concat(s);
	//   16   30:ldc1            #64  <String "mem mapping ">
	//   17   32:aload_2         
	//   18   33:invokevirtual   #68  <Method String String.concat(String)>
	//   19   36:astore_2        
			break MISSING_BLOCK_LABEL_50;
	//   20   37:goto            50
		}
		s = new String("mem mapping ");
	//   21   40:new             #54  <Class String>
	//   22   43:dup             
	//   23   44:ldc1            #64  <String "mem mapping ">
	//   24   46:invokespecial   #70  <Method void String(String)>
	//   25   49:astore_2        
		aza1.a(s);
	//   26   50:aload_3         
	//   27   51:aload_2         
	//   28   52:invokevirtual   #72  <Method void aza.a(String)>
		f = j.a(g, i);
	//   29   55:aload_0         
	//   30   56:aload_0         
	//   31   57:getfield        #74  <Field ayu j>
	//   32   60:aload_0         
	//   33   61:getfield        #76  <Field long g>
	//   34   64:aload_0         
	//   35   65:getfield        #42  <Field long i>
	//   36   68:invokeinterface #81  <Method ByteBuffer ayu.a(long, long)>
	//   37   73:putfield        #83  <Field ByteBuffer f>
		e = true;
	//   38   76:aload_0         
	//   39   77:iconst_1        
	//   40   78:putfield        #48  <Field boolean e>
		break MISSING_BLOCK_LABEL_94;
	//   41   81:goto            94
		Object obj;
		obj;
	//   42   84:astore_2        
		throw new RuntimeException(((Throwable) (obj)));
	//   43   85:new             #85  <Class RuntimeException>
	//   44   88:dup             
	//   45   89:aload_2         
	//   46   90:invokespecial   #88  <Method void RuntimeException(Throwable)>
	//   47   93:athrow          
		this;
	//   48   94:aload_0         
		JVM INSTR monitorexit ;
	//   49   95:monitorexit     
		return;
	//   50   96:return          
		obj;
	//   51   97:astore_2        
	//*  52   98:aload_0         
		throw obj;
	//   53   99:monitorexit     
	//   54  100:aload_2         
	//   55  101:athrow          
	}

	public final String a()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String c>
	//    2    4:areturn         
	}

	public final void a(acd acd)
	{
		d = acd;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #92  <Field acd d>
	//    3    5:return          
	}

	public final void a(ayu ayu1, ByteBuffer bytebuffer, long l, xz xz)
	{
		g = ayu1.b();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #96  <Method long ayu.b()>
	//    3    7:putfield        #76  <Field long g>
		h = g - (long)bytebuffer.remaining();
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #76  <Field long g>
	//    7   15:aload_2         
	//    8   16:invokevirtual   #101 <Method int ByteBuffer.remaining()>
	//    9   19:i2l             
	//   10   20:lsub            
	//   11   21:putfield        #103 <Field long h>
		i = l;
	//   12   24:aload_0         
	//   13   25:lload_3         
	//   14   26:putfield        #42  <Field long i>
		j = ayu1;
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:putfield        #74  <Field ayu j>
		ayu1.a(ayu1.b() + l);
	//   18   34:aload_1         
	//   19   35:aload_1         
	//   20   36:invokeinterface #96  <Method long ayu.b()>
	//   21   41:lload_3         
	//   22   42:ladd            
	//   23   43:invokeinterface #106 <Method void ayu.a(long)>
		e = false;
	//   24   48:aload_0         
	//   25   49:iconst_0        
	//   26   50:putfield        #48  <Field boolean e>
		a = false;
	//   27   53:aload_0         
	//   28   54:iconst_0        
	//   29   55:putfield        #50  <Field boolean a>
		d();
	//   30   58:aload_0         
	//   31   59:invokevirtual   #108 <Method void d()>
	//   32   62:return          
	}

	protected abstract void a(ByteBuffer bytebuffer);

	public final void d()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s;
		aza aza1;
		b();
	//    2    2:aload_0         
	//    3    3:invokespecial   #111 <Method void b()>
		aza1 = b;
	//    4    6:getstatic       #33  <Field aza b>
	//    5    9:astore_2        
		s = String.valueOf(((Object) (c)));
	//    6   10:aload_0         
	//    7   11:getfield        #46  <Field String c>
	//    8   14:invokestatic    #58  <Method String String.valueOf(Object)>
	//    9   17:astore_1        
		if(s.length() != 0)
	//*  10   18:aload_1         
	//*  11   19:invokevirtual   #62  <Method int String.length()>
	//*  12   22:ifeq            35
		{
			s = "parsing details of ".concat(s);
	//   13   25:ldc1            #113 <String "parsing details of ">
	//   14   27:aload_1         
	//   15   28:invokevirtual   #68  <Method String String.concat(String)>
	//   16   31:astore_1        
			break MISSING_BLOCK_LABEL_45;
	//   17   32:goto            45
		}
		s = new String("parsing details of ");
	//   18   35:new             #54  <Class String>
	//   19   38:dup             
	//   20   39:ldc1            #113 <String "parsing details of ">
	//   21   41:invokespecial   #70  <Method void String(String)>
	//   22   44:astore_1        
		aza1.a(s);
	//   23   45:aload_2         
	//   24   46:aload_1         
	//   25   47:invokevirtual   #72  <Method void aza.a(String)>
		if(f != null)
	//*  26   50:aload_0         
	//*  27   51:getfield        #83  <Field ByteBuffer f>
	//*  28   54:ifnull          97
		{
			ByteBuffer bytebuffer = f;
	//   29   57:aload_0         
	//   30   58:getfield        #83  <Field ByteBuffer f>
	//   31   61:astore_1        
			a = true;
	//   32   62:aload_0         
	//   33   63:iconst_1        
	//   34   64:putfield        #50  <Field boolean a>
			bytebuffer.rewind();
	//   35   67:aload_1         
	//   36   68:invokevirtual   #117 <Method java.nio.Buffer ByteBuffer.rewind()>
	//   37   71:pop             
			a(bytebuffer);
	//   38   72:aload_0         
	//   39   73:aload_1         
	//   40   74:invokevirtual   #119 <Method void a(ByteBuffer)>
			if(bytebuffer.remaining() > 0)
	//*  41   77:aload_1         
	//*  42   78:invokevirtual   #101 <Method int ByteBuffer.remaining()>
	//*  43   81:ifle            92
				k = bytebuffer.slice();
	//   44   84:aload_0         
	//   45   85:aload_1         
	//   46   86:invokevirtual   #123 <Method ByteBuffer ByteBuffer.slice()>
	//   47   89:putfield        #44  <Field ByteBuffer k>
			f = null;
	//   48   92:aload_0         
	//   49   93:aconst_null     
	//   50   94:putfield        #83  <Field ByteBuffer f>
		}
		this;
	//   51   97:aload_0         
		JVM INSTR monitorexit ;
	//   52   98:monitorexit     
		return;
	//   53   99:return          
		Exception exception;
		exception;
	//   54  100:astore_1        
	//*  55  101:aload_0         
		throw exception;
	//   56  102:monitorexit     
	//   57  103:aload_1         
	//   58  104:athrow          
	}

	private static aza b = aza.a(com/google/android/gms/internal/ads/ayo);
	boolean a;
	private String c;
	private acd d;
	private boolean e;
	private ByteBuffer f;
	private long g;
	private long h;
	private long i;
	private ayu j;
	private ByteBuffer k;

	static 
	{
	//    0    0:ldc1            #2   <Class ayo>
	//    1    2:invokestatic    #31  <Method aza aza.a(Class)>
	//    2    5:putstatic       #33  <Field aza b>
	//*   3    8:return          
	}
}
