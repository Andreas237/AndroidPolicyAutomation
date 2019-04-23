// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bav, azx, akh

public abstract class bcg
	implements Callable
{

	public bcg(bav bav1, String s, String s1, akh akh, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #28  <Method Class Object.getClass()>
	//    5    9:invokevirtual   #34  <Method String Class.getSimpleName()>
	//    6   12:putfield        #36  <Field String d>
		a = bav1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #38  <Field bav a>
		e = s;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #40  <Field String e>
		f = s1;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #42  <Field String f>
		b = akh;
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:putfield        #44  <Field akh b>
		g = i;
	//   19   36:aload_0         
	//   20   37:iload           5
	//   21   39:putfield        #46  <Field int g>
		h = j;
	//   22   42:aload_0         
	//   23   43:iload           6
	//   24   45:putfield        #48  <Field int h>
	//   25   48:return          
	}

	protected abstract void a();

	public Void b()
	{
		long l;
		l = System.nanoTime();
	//    0    0:invokestatic    #60  <Method long System.nanoTime()>
	//    1    3:lstore_1        
		c = a.a(e, f);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #38  <Field bav a>
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field String e>
	//    7   13:aload_0         
	//    8   14:getfield        #42  <Field String f>
	//    9   17:invokevirtual   #65  <Method Method bav.a(String, String)>
	//   10   20:putfield        #67  <Field Method c>
		if(c == null)
	//*  11   23:aload_0         
	//*  12   24:getfield        #67  <Field Method c>
	//*  13   27:ifnonnull       32
			return null;
	//   14   30:aconst_null     
	//   15   31:areturn         
		azx azx1;
		try
		{
			a();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #69  <Method void a()>
			azx1 = a.h();
	//   18   36:aload_0         
	//   19   37:getfield        #38  <Field bav a>
	//   20   40:invokevirtual   #72  <Method azx bav.h()>
	//   21   43:astore_3        
		}
	//*  22   44:aload_3         
	//*  23   45:ifnull          78
	//*  24   48:aload_0         
	//*  25   49:getfield        #46  <Field int g>
	//*  26   52:ldc1            #73  <Int 0x80000000>
	//*  27   54:icmpeq          78
	//*  28   57:aload_3         
	//*  29   58:aload_0         
	//*  30   59:getfield        #48  <Field int h>
	//*  31   62:aload_0         
	//*  32   63:getfield        #46  <Field int g>
	//*  33   66:invokestatic    #60  <Method long System.nanoTime()>
	//*  34   69:lload_1         
	//*  35   70:lsub            
	//*  36   71:ldc2w           #74  <Long 1000L>
	//*  37   74:ldiv            
	//*  38   75:invokevirtual   #80  <Method void azx.a(int, int, long)>
	//*  39   78:aconst_null     
	//*  40   79:areturn         
		catch(Object obj)
	//*  41   80:astore_3        
		{
			return null;
	//   42   81:aconst_null     
	//   43   82:areturn         
		}
		if(azx1 == null)
			break MISSING_BLOCK_LABEL_78;
		if(g != 0x80000000)
			azx1.a(h, g, (System.nanoTime() - l) / 1000L);
		return null;
	}

	public Object call()
	{
		return ((Object) (b()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #84  <Method Void b()>
	//    2    4:areturn         
	}

	protected final bav a;
	protected final akh b;
	protected Method c;
	private final String d = ((Object)this).getClass().getSimpleName();
	private final String e;
	private final String f;
	private final int g;
	private final int h;
}
