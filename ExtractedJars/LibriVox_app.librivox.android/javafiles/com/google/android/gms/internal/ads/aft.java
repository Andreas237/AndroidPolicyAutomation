// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.ap;
import com.google.android.gms.ads.internal.bs;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aas, afu, abj, p, 
//			bwk, m, ahh, afv, 
//			zm, afn, afx, zzbbi, 
//			bad, abe, ahb, ad, 
//			bse

public final class aft
{

	public aft()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static abe a(Context context, zzbbi zzbbi, String s, bad bad, bs bs)
	{
		return aas.a(((abe) (aas.a(((Object) (null))))), ((aan) (new afu(context, bad, zzbbi, bs, s))), abj.a);
	//    0    0:aconst_null     
	//    1    1:invokestatic    #18  <Method abd aas.a(Object)>
	//    2    4:new             #20  <Class afu>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload           4
	//    8   13:aload_2         
	//    9   14:invokespecial   #23  <Method void afu(Context, bad, zzbbi, bs, String)>
	//   10   17:getstatic       #28  <Field java.util.concurrent.Executor abj.a>
	//   11   20:invokestatic    #31  <Method abe aas.a(abe, aan, java.util.concurrent.Executor)>
	//   12   23:areturn         
	}

	public static afn a(Context context, ahb ahb, String s, boolean flag, boolean flag1, bad bad, zzbbi zzbbi, ad ad, 
			ap ap, bs bs, bse bse)
	{
		p.a(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #39  <Method void p.a(Context)>
		e e = p.am;
	//    2    4:getstatic       #43  <Field e p.am>
	//    3    7:astore          11
		if(((Boolean)bwk.e().a(e)).booleanValue())
	//*   4    9:invokestatic    #49  <Method m bwk.e()>
	//*   5   12:aload           11
	//*   6   14:invokevirtual   #54  <Method Object m.a(e)>
	//*   7   17:checkcast       #56  <Class Boolean>
	//*   8   20:invokevirtual   #60  <Method boolean Boolean.booleanValue()>
	//*   9   23:ifeq            48
			return ahh.a(context, ahb, s, flag, flag1, bad, zzbbi, ad, ap, bs, bse);
	//   10   26:aload_0         
	//   11   27:aload_1         
	//   12   28:aload_2         
	//   13   29:iload_3         
	//   14   30:iload           4
	//   15   32:aload           5
	//   16   34:aload           6
	//   17   36:aload           7
	//   18   38:aload           8
	//   19   40:aload           9
	//   20   42:aload           10
	//   21   44:invokestatic    #64  <Method afn ahh.a(Context, ahb, String, boolean, boolean, bad, zzbbi, ad, ap, bs, bse)>
	//   22   47:areturn         
		try
		{
			context = ((Context) ((afn)zm.a(((java.util.concurrent.Callable) (new afv(context, ahb, s, flag, flag1, bad, zzbbi, ad, ap, bs, bse))))));
	//   23   48:new             #66  <Class afv>
	//   24   51:dup             
	//   25   52:aload_0         
	//   26   53:aload_1         
	//   27   54:aload_2         
	//   28   55:iload_3         
	//   29   56:iload           4
	//   30   58:aload           5
	//   31   60:aload           6
	//   32   62:aload           7
	//   33   64:aload           8
	//   34   66:aload           9
	//   35   68:aload           10
	//   36   70:invokespecial   #69  <Method void afv(Context, ahb, String, boolean, boolean, bad, zzbbi, ad, ap, bs, bse)>
	//   37   73:invokestatic    #74  <Method Object zm.a(java.util.concurrent.Callable)>
	//   38   76:checkcast       #76  <Class afn>
	//   39   79:astore_0        
		}
	//*  40   80:aload_0         
	//*  41   81:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  42   82:astore_0        
		{
			throw new afx("Webview initialization failed.", ((Throwable) (context)));
	//   43   83:new             #78  <Class afx>
	//   44   86:dup             
	//   45   87:ldc1            #80  <String "Webview initialization failed.">
	//   46   89:aload_0         
	//   47   90:invokespecial   #83  <Method void afx(String, Throwable)>
	//   48   93:athrow          
		}
		return ((afn) (context));
	}
}
