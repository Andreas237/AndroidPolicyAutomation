// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.*;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal.ads:
//			afy, aga, xo, afn, 
//			afe, ahb, bad, zzbbi, 
//			ad, bse

final class afv
	implements Callable
{

	afv(Context context, ahb ahb, String s, boolean flag, boolean flag1, bad bad, zzbbi zzbbi, 
			ad ad, ap ap, bs bs, bse bse)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		a = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field Context a>
		b = ahb;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #36  <Field ahb b>
		c = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #38  <Field String c>
		d = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #40  <Field boolean d>
		e = flag1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #42  <Field boolean e>
		f = bad;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #44  <Field bad f>
		g = zzbbi;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #46  <Field zzbbi g>
		h = ad;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #48  <Field ad h>
		i = ap;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #50  <Field ap i>
		j = bs;
	//   29   55:aload_0         
	//   30   56:aload           10
	//   31   58:putfield        #52  <Field bs j>
		k = bse;
	//   32   61:aload_0         
	//   33   62:aload           11
	//   34   64:putfield        #54  <Field bse k>
	//   35   67:return          
	}

	public final Object call()
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Context a>
	//    2    4:astore          4
		ahb ahb = b;
	//    3    6:aload_0         
	//    4    7:getfield        #36  <Field ahb b>
	//    5   10:astore          5
		String s = c;
	//    6   12:aload_0         
	//    7   13:getfield        #38  <Field String c>
	//    8   16:astore          6
		boolean flag = d;
	//    9   18:aload_0         
	//   10   19:getfield        #40  <Field boolean d>
	//   11   22:istore_1        
		boolean flag1 = e;
	//   12   23:aload_0         
	//   13   24:getfield        #42  <Field boolean e>
	//   14   27:istore_2        
		bad bad = f;
	//   15   28:aload_0         
	//   16   29:getfield        #44  <Field bad f>
	//   17   32:astore          7
		zzbbi zzbbi = g;
	//   18   34:aload_0         
	//   19   35:getfield        #46  <Field zzbbi g>
	//   20   38:astore          8
		ad ad = h;
	//   21   40:aload_0         
	//   22   41:getfield        #48  <Field ad h>
	//   23   44:astore          9
		ap ap = i;
	//   24   46:aload_0         
	//   25   47:getfield        #50  <Field ap i>
	//   26   50:astore          10
		bs bs = j;
	//   27   52:aload_0         
	//   28   53:getfield        #52  <Field bs j>
	//   29   56:astore          11
		bse bse = k;
	//   30   58:aload_0         
	//   31   59:getfield        #54  <Field bse k>
	//   32   62:astore_3        
		obj = ((Object) (new afy(((afn) (aga.a(((Context) (obj)), ahb, s, flag, flag1, bad, zzbbi, ad, ap, bs, bse))))));
	//   33   63:new             #59  <Class afy>
	//   34   66:dup             
	//   35   67:aload           4
	//   36   69:aload           5
	//   37   71:aload           6
	//   38   73:iload_1         
	//   39   74:iload_2         
	//   40   75:aload           7
	//   41   77:aload           8
	//   42   79:aload           9
	//   43   81:aload           10
	//   44   83:aload           11
	//   45   85:aload_3         
	//   46   86:invokestatic    #64  <Method aga aga.a(Context, ahb, String, boolean, boolean, bad, zzbbi, ad, ap, bs, bse)>
	//   47   89:invokespecial   #67  <Method void afy(afn)>
	//   48   92:astore          4
		((afn) (obj)).setWebViewClient(((android.webkit.WebViewClient) (aw.g().a(((afn) (obj)), bse, flag1))));
	//   49   94:aload           4
	//   50   96:invokestatic    #72  <Method xo aw.g()>
	//   51   99:aload           4
	//   52  101:aload_3         
	//   53  102:iload_2         
	//   54  103:invokevirtual   #77  <Method afo xo.a(afn, bse, boolean)>
	//   55  106:invokeinterface #83  <Method void afn.setWebViewClient(android.webkit.WebViewClient)>
		((afn) (obj)).setWebChromeClient(((android.webkit.WebChromeClient) (new afe(((afn) (obj))))));
	//   56  111:aload           4
	//   57  113:new             #85  <Class afe>
	//   58  116:dup             
	//   59  117:aload           4
	//   60  119:invokespecial   #86  <Method void afe(afn)>
	//   61  122:invokeinterface #90  <Method void afn.setWebChromeClient(android.webkit.WebChromeClient)>
		return obj;
	//   62  127:aload           4
	//   63  129:areturn         
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
	private final bse k;
}
