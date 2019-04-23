// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.ads.internal.bs;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aan, ahb, bse, aft, 
//			abn, afn, afw, agv, 
//			bad, zzbbi, abe

final class afu
	implements aan
{

	afu(Context context, bad bad, zzbbi zzbbi, bs bs, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		a = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Context a>
		b = bad;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field bad b>
		c = zzbbi;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field zzbbi c>
		d = bs;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #29  <Field bs d>
		e = s;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #31  <Field String e>
	//   17   31:return          
	}

	public final abe a(Object obj)
	{
		Object obj1 = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Context a>
	//    2    4:astore_2        
		Object obj2 = ((Object) (b));
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field bad b>
	//    5    9:astore_3        
		zzbbi zzbbi = c;
	//    6   10:aload_0         
	//    7   11:getfield        #27  <Field zzbbi c>
	//    8   14:astore          4
		bs bs = d;
	//    9   16:aload_0         
	//   10   17:getfield        #29  <Field bs d>
	//   11   20:astore          5
		obj = ((Object) (e));
	//   12   22:aload_0         
	//   13   23:getfield        #31  <Field String e>
	//   14   26:astore_1        
		aw.f();
	//   15   27:invokestatic    #39  <Method aft aw.f()>
	//   16   30:pop             
		obj1 = ((Object) (aft.a(((Context) (obj1)), ahb.a(), "", false, false, ((bad) (obj2)), zzbbi, ((ad) (null)), ((com.google.android.gms.ads.internal.ap) (null)), bs, bse.a())));
	//   17   31:aload_2         
	//   18   32:invokestatic    #44  <Method ahb ahb.a()>
	//   19   35:ldc1            #46  <String "">
	//   20   37:iconst_0        
	//   21   38:iconst_0        
	//   22   39:aload_3         
	//   23   40:aload           4
	//   24   42:aconst_null     
	//   25   43:aconst_null     
	//   26   44:aload           5
	//   27   46:invokestatic    #51  <Method bse bse.a()>
	//   28   49:invokestatic    #56  <Method afn aft.a(Context, ahb, String, boolean, boolean, bad, zzbbi, ad, com.google.android.gms.ads.internal.ap, bs, bse)>
	//   29   52:astore_2        
		obj2 = ((Object) (abn.a(obj1)));
	//   30   53:aload_2         
	//   31   54:invokestatic    #61  <Method abn abn.a(Object)>
	//   32   57:astore_3        
		((afn) (obj1)).w().a(((agw) (new afw(((abn) (obj2))))));
	//   33   58:aload_2         
	//   34   59:invokeinterface #67  <Method agv afn.w()>
	//   35   64:new             #69  <Class afw>
	//   36   67:dup             
	//   37   68:aload_3         
	//   38   69:invokespecial   #72  <Method void afw(abn)>
	//   39   72:invokeinterface #77  <Method void agv.a(agw)>
		((afn) (obj1)).loadUrl(((String) (obj)));
	//   40   77:aload_2         
	//   41   78:aload_1         
	//   42   79:invokeinterface #81  <Method void afn.loadUrl(String)>
		return ((abe) (obj2));
	//   43   84:aload_3         
	//   44   85:areturn         
	}

	private final Context a;
	private final bad b;
	private final zzbbi c;
	private final bs d;
	private final String e;
}
