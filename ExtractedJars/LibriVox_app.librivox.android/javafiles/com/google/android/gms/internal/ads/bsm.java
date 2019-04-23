// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.c.d;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aaj, p, bwk, m, 
//			bso, aah, bcn, aag, 
//			bsn, bsq

public final class bsm
{

	public bsm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public bsm(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		p.a(context);
	//    2    4:aload_1         
	//    3    5:invokestatic    #25  <Method void p.a(Context)>
		e e = p.cu;
	//    4    8:getstatic       #29  <Field e p.cu>
	//    5   11:astore_2        
		if(!((Boolean)bwk.e().a(e)).booleanValue())
			break MISSING_BLOCK_LABEL_75;
	//    6   12:invokestatic    #35  <Method m bwk.e()>
	//    7   15:aload_2         
	//    8   16:invokevirtual   #40  <Method Object m.a(e)>
	//    9   19:checkcast       #42  <Class Boolean>
	//   10   22:invokevirtual   #46  <Method boolean Boolean.booleanValue()>
	//   11   25:ifeq            75
		try
		{
			a = (bcn)aah.a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", bso.a);
	//   12   28:aload_0         
	//   13   29:aload_1         
	//   14   30:ldc1            #48  <String "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger">
	//   15   32:getstatic       #53  <Field aai bso.a>
	//   16   35:invokestatic    #58  <Method Object aah.a(Context, String, aai)>
	//   17   38:checkcast       #60  <Class bcn>
	//   18   41:putfield        #62  <Field bcn a>
			d.a(((Object) (context)));
	//   19   44:aload_1         
	//   20   45:invokestatic    #67  <Method com.google.android.gms.c.a d.a(Object)>
	//   21   48:pop             
			a.a(d.a(((Object) (context))), "GMA_SDK");
	//   22   49:aload_0         
	//   23   50:getfield        #62  <Field bcn a>
	//   24   53:aload_1         
	//   25   54:invokestatic    #67  <Method com.google.android.gms.c.a d.a(Object)>
	//   26   57:ldc1            #69  <String "GMA_SDK">
	//   27   59:invokeinterface #72  <Method void bcn.a(com.google.android.gms.c.a, String)>
			b = true;
	//   28   64:aload_0         
	//   29   65:iconst_1        
	//   30   66:putfield        #74  <Field boolean b>
			return;
	//   31   69:return          
		}
	//*  32   70:ldc1            #76  <String "Cannot dynamite load clearcut">
	//*  33   72:invokestatic    #81  <Method void aag.b(String)>
	//*  34   75:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			aag.b("Cannot dynamite load clearcut");
		}
	//*  35   76:astore_1        
	//*  36   77:goto            70
	}

	public bsm(Context context, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		p.a(context);
	//    2    4:aload_1         
	//    3    5:invokestatic    #25  <Method void p.a(Context)>
		try
		{
			a = (bcn)aah.a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", bsn.a);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:ldc1            #48  <String "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger">
	//    7   12:getstatic       #85  <Field aai bsn.a>
	//    8   15:invokestatic    #58  <Method Object aah.a(Context, String, aai)>
	//    9   18:checkcast       #60  <Class bcn>
	//   10   21:putfield        #62  <Field bcn a>
			d.a(((Object) (context)));
	//   11   24:aload_1         
	//   12   25:invokestatic    #67  <Method com.google.android.gms.c.a d.a(Object)>
	//   13   28:pop             
			a.a(d.a(((Object) (context))), s, ((String) (null)));
	//   14   29:aload_0         
	//   15   30:getfield        #62  <Field bcn a>
	//   16   33:aload_1         
	//   17   34:invokestatic    #67  <Method com.google.android.gms.c.a d.a(Object)>
	//   18   37:aload_2         
	//   19   38:aconst_null     
	//   20   39:invokeinterface #88  <Method void bcn.a(com.google.android.gms.c.a, String, String)>
			b = true;
	//   21   44:aload_0         
	//   22   45:iconst_1        
	//   23   46:putfield        #74  <Field boolean b>
			return;
	//   24   49:return          
		}
	//*  25   50:ldc1            #76  <String "Cannot dynamite load clearcut">
	//*  26   52:invokestatic    #81  <Method void aag.b(String)>
	//*  27   55:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			aag.b("Cannot dynamite load clearcut");
		}
		return;
	//*  28   56:astore_1        
	//*  29   57:goto            50
	}

	public final bsq a(byte abyte0[])
	{
		return new bsq(this, abyte0, ((bsp) (null)));
	//    0    0:new             #91  <Class bsq>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #94  <Method void bsq(bsm, byte[], bsp)>
	//    6   10:areturn         
	}

	bcn a;
	boolean b;
}
