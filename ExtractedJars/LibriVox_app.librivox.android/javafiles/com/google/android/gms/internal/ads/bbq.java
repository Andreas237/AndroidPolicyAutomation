// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcg, bav, bbd, akh

public final class bbq extends bcg
{

	public bbq(bav bav1, String s, String s1, akh akh1, int i, int j)
	{
		super(bav1, s, s1, akh1, i, 24);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:bipush          24
	//    7   10:invokespecial   #8   <Method void bcg(bav, String, String, akh, int, int)>
	//    8   13:return          
	}

	private final void c()
	{
		AdvertisingIdClient advertisingidclient = a.m();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field bav a>
	//    2    4:invokevirtual   #23  <Method AdvertisingIdClient bav.m()>
	//    3    7:astore_1        
		if(advertisingidclient == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
		String s;
		try
		{
			info = advertisingidclient.getInfo();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #29  <Method com.google.android.gms.ads.identifier.AdvertisingIdClient$Info AdvertisingIdClient.getInfo()>
	//    9   17:astore_2        
			s = bbd.a(info.getId());
	//   10   18:aload_2         
	//   11   19:invokevirtual   #35  <Method String com.google.android.gms.ads.identifier.AdvertisingIdClient$Info.getId()>
	//   12   22:invokestatic    #40  <Method String bbd.a(String)>
	//   13   25:astore_3        
		}
	//*  14   26:aload_3         
	//*  15   27:ifnull          78
	//*  16   30:aload_0         
	//*  17   31:getfield        #44  <Field akh b>
	//*  18   34:astore_1        
	//*  19   35:aload_1         
	//*  20   36:monitorenter    
	//*  21   37:aload_0         
	//*  22   38:getfield        #44  <Field akh b>
	//*  23   41:aload_3         
	//*  24   42:putfield        #50  <Field String akh.U>
	//*  25   45:aload_0         
	//*  26   46:getfield        #44  <Field akh b>
	//*  27   49:aload_2         
	//*  28   50:invokevirtual   #54  <Method boolean com.google.android.gms.ads.identifier.AdvertisingIdClient$Info.isLimitAdTrackingEnabled()>
	//*  29   53:invokestatic    #60  <Method Boolean Boolean.valueOf(boolean)>
	//*  30   56:putfield        #64  <Field Boolean akh.W>
	//*  31   59:aload_0         
	//*  32   60:getfield        #44  <Field akh b>
	//*  33   63:iconst_5        
	//*  34   64:invokestatic    #69  <Method Integer Integer.valueOf(int)>
	//*  35   67:putfield        #73  <Field Integer akh.V>
	//*  36   70:aload_1         
	//*  37   71:monitorexit     
	//*  38   72:return          
	//*  39   73:astore_2        
	//*  40   74:aload_1         
	//*  41   75:monitorexit     
	//*  42   76:aload_2         
	//*  43   77:athrow          
	//*  44   78:return          
		catch(IOException ioexception)
	//*  45   79:astore_1        
		{
			return;
	//   46   80:return          
		}
		if(s == null)
			break MISSING_BLOCK_LABEL_78;
		synchronized(b)
		{
			b.U = s;
			b.W = Boolean.valueOf(info.isLimitAdTrackingEnabled());
			b.V = Integer.valueOf(5);
		}
		return;
		exception;
		akh1;
		JVM INSTR monitorexit ;
		throw exception;
	}

	protected final void a()
	{
		if(a.g())
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field bav a>
	//*   2    4:invokevirtual   #76  <Method boolean bav.g()>
	//*   3    7:ifeq            15
		{
			c();
	//    4   10:aload_0         
	//    5   11:invokespecial   #78  <Method void c()>
			return;
	//    6   14:return          
		}
		synchronized(b)
	//*   7   15:aload_0         
	//*   8   16:getfield        #44  <Field akh b>
	//*   9   19:astore_1        
	//*  10   20:aload_1         
	//*  11   21:monitorenter    
		{
			b.U = (String)c.invoke(((Object) (null)), new Object[] {
				a.a()
			});
	//   12   22:aload_0         
	//   13   23:getfield        #44  <Field akh b>
	//   14   26:aload_0         
	//   15   27:getfield        #81  <Field Method c>
	//   16   30:aconst_null     
	//   17   31:iconst_1        
	//   18   32:anewarray       Object[]
	//   19   35:dup             
	//   20   36:iconst_0        
	//   21   37:aload_0         
	//   22   38:getfield        #17  <Field bav a>
	//   23   41:invokevirtual   #86  <Method android.content.Context bav.a()>
	//   24   44:aastore         
	//   25   45:invokevirtual   #92  <Method Object Method.invoke(Object, Object[])>
	//   26   48:checkcast       #94  <Class String>
	//   27   51:putfield        #50  <Field String akh.U>
		}
	//   28   54:aload_1         
	//   29   55:monitorexit     
		return;
	//   30   56:return          
		exception;
	//   31   57:astore_2        
		akh1;
	//   32   58:aload_1         
		JVM INSTR monitorexit ;
	//   33   59:monitorexit     
		throw exception;
	//   34   60:aload_2         
	//   35   61:athrow          
	}

	public final Void b()
	{
		if(a.b())
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field bav a>
	//*   2    4:invokevirtual   #97  <Method boolean bav.b()>
	//*   3    7:ifeq            15
			return super.b();
	//    4   10:aload_0         
	//    5   11:invokespecial   #99  <Method Void bcg.b()>
	//    6   14:areturn         
		if(a.g())
	//*   7   15:aload_0         
	//*   8   16:getfield        #17  <Field bav a>
	//*   9   19:invokevirtual   #76  <Method boolean bav.g()>
	//*  10   22:ifeq            29
			c();
	//   11   25:aload_0         
	//   12   26:invokespecial   #78  <Method void c()>
		return null;
	//   13   29:aconst_null     
	//   14   30:areturn         
	}

	public final Object call()
	{
		return ((Object) (((bcg)this).b()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #99  <Method Void bcg.b()>
	//    2    4:areturn         
	}
}
