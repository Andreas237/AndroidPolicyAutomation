// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.ap;
import com.google.android.gms.ads.internal.bs;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ahc, ahk, aha, afy, 
//			afe, ahb, bad, zzbbi, 
//			ad

final class ahj
	implements Callable
{

	ahj(Context context, ahb ahb, String s, boolean flag, boolean flag1, bad bad, zzbbi zzbbi, 
			ad ad, ap ap, bs bs)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		a = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field Context a>
		b = ahb;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #34  <Field ahb b>
		c = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #36  <Field String c>
		d = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #38  <Field boolean d>
		e = flag1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #40  <Field boolean e>
		f = bad;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #42  <Field bad f>
		g = zzbbi;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #44  <Field zzbbi g>
		h = ad;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #46  <Field ad h>
		i = ap;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #48  <Field ap i>
		j = bs;
	//   29   55:aload_0         
	//   30   56:aload           10
	//   31   58:putfield        #50  <Field bs j>
	//   32   61:return          
	}

	public final Object call()
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Context a>
	//    2    4:astore          4
		Object obj1 = ((Object) (b));
	//    3    6:aload_0         
	//    4    7:getfield        #34  <Field ahb b>
	//    5   10:astore          5
		String s = c;
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field String c>
	//    8   16:astore          6
		boolean flag = d;
	//    9   18:aload_0         
	//   10   19:getfield        #38  <Field boolean d>
	//   11   22:istore_1        
		boolean flag1 = e;
	//   12   23:aload_0         
	//   13   24:getfield        #40  <Field boolean e>
	//   14   27:istore_2        
		bad bad = f;
	//   15   28:aload_0         
	//   16   29:getfield        #42  <Field bad f>
	//   17   32:astore          7
		zzbbi zzbbi = g;
	//   18   34:aload_0         
	//   19   35:getfield        #44  <Field zzbbi g>
	//   20   38:astore          8
		ad ad = h;
	//   21   40:aload_0         
	//   22   41:getfield        #46  <Field ad h>
	//   23   44:astore          9
		ap ap = i;
	//   24   46:aload_0         
	//   25   47:getfield        #48  <Field ap i>
	//   26   50:astore          10
		bs bs = j;
	//   27   52:aload_0         
	//   28   53:getfield        #50  <Field bs j>
	//   29   56:astore          11
		ahc ahc1 = new ahc();
	//   30   58:new             #55  <Class ahc>
	//   31   61:dup             
	//   32   62:invokespecial   #56  <Method void ahc()>
	//   33   65:astore_3        
		obj = ((Object) (new ahk(new aha(((Context) (obj))), ahc1, ((ahb) (obj1)), s, flag, flag1, bad, zzbbi, ad, ap, bs)));
	//   34   66:new             #58  <Class ahk>
	//   35   69:dup             
	//   36   70:new             #60  <Class aha>
	//   37   73:dup             
	//   38   74:aload           4
	//   39   76:invokespecial   #63  <Method void aha(Context)>
	//   40   79:aload_3         
	//   41   80:aload           5
	//   42   82:aload           6
	//   43   84:iload_1         
	//   44   85:iload_2         
	//   45   86:aload           7
	//   46   88:aload           8
	//   47   90:aload           9
	//   48   92:aload           10
	//   49   94:aload           11
	//   50   96:invokespecial   #66  <Method void ahk(aha, ahc, ahb, String, boolean, boolean, bad, zzbbi, ad, ap, bs)>
	//   51   99:astore          4
		obj1 = ((Object) (new afy(((afn) (obj)))));
	//   52  101:new             #68  <Class afy>
	//   53  104:dup             
	//   54  105:aload           4
	//   55  107:invokespecial   #71  <Method void afy(afn)>
	//   56  110:astore          5
		((ahk) (obj)).setWebChromeClient(((android.webkit.WebChromeClient) (new afe(((afn) (obj1))))));
	//   57  112:aload           4
	//   58  114:new             #73  <Class afe>
	//   59  117:dup             
	//   60  118:aload           5
	//   61  120:invokespecial   #74  <Method void afe(afn)>
	//   62  123:invokevirtual   #78  <Method void ahk.setWebChromeClient(android.webkit.WebChromeClient)>
		ahc1.a(((afn) (obj1)), flag1);
	//   63  126:aload_3         
	//   64  127:aload           5
	//   65  129:iload_2         
	//   66  130:invokevirtual   #81  <Method void ahc.a(afn, boolean)>
		return obj1;
	//   67  133:aload           5
	//   68  135:areturn         
	}

	private final Context a;
	private final ahb b;
	private final String c;
	private final boolean d;
	private final boolean e;
	private final bad f;
	private final zzbbi g;
	private final ad h;
	private final ap i;
	private final bs j;
}
