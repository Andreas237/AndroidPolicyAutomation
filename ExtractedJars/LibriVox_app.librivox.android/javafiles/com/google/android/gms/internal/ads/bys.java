// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.a.c;
import com.google.android.gms.ads.a.e;
import com.google.android.gms.ads.i;
import com.google.android.gms.ads.reward.d;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bvw, kl, bxc, aag, 
//			bvp, bvt, uf, bvn, 
//			zzwf, bwk, bwe, bwj, 
//			bvy, am, byn, bvm

public final class bys
{

	public bys(Context context)
	{
		this(context, com.google.android.gms.internal.ads.bvw.a, ((e) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #38  <Field bvw com.google.android.gms.internal.ads.bvw.a>
	//    3    5:aconst_null     
	//    4    6:invokespecial   #41  <Method void bys(Context, bvw, e)>
	//    5    9:return          
	}

	private bys(Context context, bvw bvw1, e e1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		a = new kl();
	//    2    4:aload_0         
	//    3    5:new             #47  <Class kl>
	//    4    8:dup             
	//    5    9:invokespecial   #48  <Method void kl()>
	//    6   12:putfield        #50  <Field kl a>
		b = context;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #52  <Field Context b>
		c = bvw1;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #54  <Field bvw c>
	//   13   25:return          
	}

	private final void b(String s)
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field bxc f>
	//*   2    4:ifnull          8
		{
			return;
	//    3    7:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 63);
	//    4    8:new             #59  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokestatic    #65  <Method String String.valueOf(Object)>
	//    8   16:invokevirtual   #69  <Method int String.length()>
	//    9   19:bipush          63
	//   10   21:iadd            
	//   11   22:invokespecial   #72  <Method void StringBuilder(int)>
	//   12   25:astore_2        
			stringbuilder.append("The ad unit ID must be set on InterstitialAd before ");
	//   13   26:aload_2         
	//   14   27:ldc1            #74  <String "The ad unit ID must be set on InterstitialAd before ">
	//   15   29:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			stringbuilder.append(s);
	//   17   33:aload_2         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
			stringbuilder.append(" is called.");
	//   21   39:aload_2         
	//   22   40:ldc1            #80  <String " is called.">
	//   23   42:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   25   46:new             #82  <Class IllegalStateException>
	//   26   49:dup             
	//   27   50:aload_2         
	//   28   51:invokevirtual   #86  <Method String StringBuilder.toString()>
	//   29   54:invokespecial   #88  <Method void IllegalStateException(String)>
	//   30   57:athrow          
		}
	}

	public final Bundle a()
	{
		Bundle bundle;
		if(f == null)
			break MISSING_BLOCK_LABEL_26;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field bxc f>
	//    2    4:ifnull          26
		bundle = f.q();
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field bxc f>
	//    5   11:invokeinterface #96  <Method Bundle bxc.q()>
	//    6   16:astore_1        
		return bundle;
	//    7   17:aload_1         
	//    8   18:areturn         
		RemoteException remoteexception;
		remoteexception;
	//    9   19:astore_1        
		com.google.android.gms.internal.ads.aag.d("#008 Must be called on the main UI thread.", ((Throwable) (remoteexception)));
	//   10   20:ldc1            #98  <String "#008 Must be called on the main UI thread.">
	//   11   22:aload_1         
	//   12   23:invokestatic    #103 <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		return new Bundle();
	//   13   26:new             #105 <Class Bundle>
	//   14   29:dup             
	//   15   30:invokespecial   #106 <Method void Bundle()>
	//   16   33:areturn         
	}

	public final void a(a a1)
	{
		bxc bxc1;
		d = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #109 <Field a d>
		if(f == null)
			break MISSING_BLOCK_LABEL_40;
	//    3    5:aload_0         
	//    4    6:getfield        #57  <Field bxc f>
	//    5    9:ifnull          40
		bxc1 = f;
	//    6   12:aload_0         
	//    7   13:getfield        #57  <Field bxc f>
	//    8   16:astore_2        
		if(a1 != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          49
			try
			{
				a1 = ((a) (new bvp(a1)));
	//   11   21:new             #111 <Class bvp>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #113 <Method void bvp(a)>
	//   15   29:astore_1        
			}
	//*  16   30:goto            33
	//*  17   33:aload_2         
	//*  18   34:aload_1         
	//*  19   35:invokeinterface #116 <Method void com.google.android.gms.internal.ads.bxc.a(bwr)>
	//*  20   40:return          
			// Misplaced declaration of an exception variable
			catch(a a1)
	//*  21   41:astore_1        
			{
				com.google.android.gms.internal.ads.aag.d("#008 Must be called on the main UI thread.", ((Throwable) (a1)));
	//   22   42:ldc1            #98  <String "#008 Must be called on the main UI thread.">
	//   23   44:aload_1         
	//   24   45:invokestatic    #103 <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
				return;
	//   25   48:return          
			}
		else
			a1 = null;
	//   26   49:aconst_null     
	//   27   50:astore_1        
		bxc1.a(((bwr) (a1)));
	//*  28   51:goto            33
	}

	public final void a(com.google.android.gms.ads.reward.a a1)
	{
		bxc bxc1;
		h = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #119 <Field com.google.android.gms.ads.reward.a h>
		if(f == null)
			break MISSING_BLOCK_LABEL_40;
	//    3    5:aload_0         
	//    4    6:getfield        #57  <Field bxc f>
	//    5    9:ifnull          40
		bxc1 = f;
	//    6   12:aload_0         
	//    7   13:getfield        #57  <Field bxc f>
	//    8   16:astore_2        
		if(a1 != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          49
			try
			{
				a1 = ((com.google.android.gms.ads.reward.a) (new bvt(a1)));
	//   11   21:new             #121 <Class bvt>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #123 <Method void bvt(com.google.android.gms.ads.reward.a)>
	//   15   29:astore_1        
			}
	//*  16   30:goto            33
	//*  17   33:aload_2         
	//*  18   34:aload_1         
	//*  19   35:invokeinterface #126 <Method void com.google.android.gms.internal.ads.bxc.a(bxh)>
	//*  20   40:return          
			// Misplaced declaration of an exception variable
			catch(com.google.android.gms.ads.reward.a a1)
	//*  21   41:astore_1        
			{
				com.google.android.gms.internal.ads.aag.d("#008 Must be called on the main UI thread.", ((Throwable) (a1)));
	//   22   42:ldc1            #98  <String "#008 Must be called on the main UI thread.">
	//   23   44:aload_1         
	//   24   45:invokestatic    #103 <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
				return;
	//   25   48:return          
			}
		else
			a1 = null;
	//   26   49:aconst_null     
	//   27   50:astore_1        
		bxc1.a(((bxh) (a1)));
	//*  28   51:goto            33
	}

	public final void a(d d1)
	{
		bxc bxc1;
		l = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #129 <Field d l>
		if(f == null)
			break MISSING_BLOCK_LABEL_40;
	//    3    5:aload_0         
	//    4    6:getfield        #57  <Field bxc f>
	//    5    9:ifnull          40
		bxc1 = f;
	//    6   12:aload_0         
	//    7   13:getfield        #57  <Field bxc f>
	//    8   16:astore_2        
		if(d1 != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          49
			try
			{
				d1 = ((d) (new uf(d1)));
	//   11   21:new             #131 <Class uf>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #133 <Method void uf(d)>
	//   15   29:astore_1        
			}
	//*  16   30:goto            33
	//*  17   33:aload_2         
	//*  18   34:aload_1         
	//*  19   35:invokeinterface #136 <Method void com.google.android.gms.internal.ads.bxc.a(ua)>
	//*  20   40:return          
			// Misplaced declaration of an exception variable
			catch(d d1)
	//*  21   41:astore_1        
			{
				com.google.android.gms.internal.ads.aag.d("#008 Must be called on the main UI thread.", ((Throwable) (d1)));
	//   22   42:ldc1            #98  <String "#008 Must be called on the main UI thread.">
	//   23   44:aload_1         
	//   24   45:invokestatic    #103 <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
				return;
	//   25   48:return          
			}
		else
			d1 = null;
	//   26   49:aconst_null     
	//   27   50:astore_1        
		bxc1.a(((ua) (d1)));
	//*  28   51:goto            33
	}

	public final void a(bvm bvm)
	{
		bxc bxc1;
		e = bvm;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #139 <Field bvm e>
		if(f == null)
			break MISSING_BLOCK_LABEL_40;
	//    3    5:aload_0         
	//    4    6:getfield        #57  <Field bxc f>
	//    5    9:ifnull          40
		bxc1 = f;
	//    6   12:aload_0         
	//    7   13:getfield        #57  <Field bxc f>
	//    8   16:astore_2        
		if(bvm != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          49
			try
			{
				bvm = ((bvm) (new bvn(bvm)));
	//   11   21:new             #141 <Class bvn>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #143 <Method void bvn(bvm)>
	//   15   29:astore_1        
			}
	//*  16   30:goto            33
	//*  17   33:aload_2         
	//*  18   34:aload_1         
	//*  19   35:invokeinterface #146 <Method void com.google.android.gms.internal.ads.bxc.a(bwn)>
	//*  20   40:return          
			// Misplaced declaration of an exception variable
			catch(bvm bvm)
	//*  21   41:astore_1        
			{
				com.google.android.gms.internal.ads.aag.d("#008 Must be called on the main UI thread.", ((Throwable) (bvm)));
	//   22   42:ldc1            #98  <String "#008 Must be called on the main UI thread.">
	//   23   44:aload_1         
	//   24   45:invokestatic    #103 <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
				return;
	//   25   48:return          
			}
		else
			bvm = null;
	//   26   49:aconst_null     
	//   27   50:astore_1        
		bxc1.a(((bwn) (bvm)));
	//*  28   51:goto            33
	}

	public final void a(byn byn1)
	{
		zzwf zzwf1;
		try
		{
			if(f != null)
				break MISSING_BLOCK_LABEL_282;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field bxc f>
	//    2    4:ifnonnull       282
			if(g == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #149 <Field String g>
	//*   5   11:ifnonnull       20
				b("loadAd");
	//    6   14:aload_0         
	//    7   15:ldc1            #151 <String "loadAd">
	//    8   17:invokespecial   #153 <Method void b(String)>
			if(m)
	//*   9   20:aload_0         
	//*  10   21:getfield        #155 <Field boolean m>
	//*  11   24:ifeq            34
			{
				zzwf1 = com.google.android.gms.internal.ads.zzwf.a();
	//   12   27:invokestatic    #160 <Method zzwf com.google.android.gms.internal.ads.zzwf.a()>
	//   13   30:astore_2        
				break MISSING_BLOCK_LABEL_42;
	//   14   31:goto            42
			}
		}
	//*  15   34:new             #157 <Class zzwf>
	//*  16   37:dup             
	//*  17   38:invokespecial   #161 <Method void zzwf()>
	//*  18   41:astore_2        
	//*  19   42:invokestatic    #166 <Method bwa bwk.b()>
	//*  20   45:astore_3        
	//*  21   46:aload_0         
	//*  22   47:getfield        #52  <Field Context b>
	//*  23   50:astore          4
	//*  24   52:aload_0         
	//*  25   53:new             #168 <Class bwe>
	//*  26   56:dup             
	//*  27   57:aload_3         
	//*  28   58:aload           4
	//*  29   60:aload_2         
	//*  30   61:aload_0         
	//*  31   62:getfield        #149 <Field String g>
	//*  32   65:aload_0         
	//*  33   66:getfield        #50  <Field kl a>
	//*  34   69:invokespecial   #171 <Method void bwe(bwa, Context, zzwf, String, km)>
	//*  35   72:aload           4
	//*  36   74:iconst_0        
	//*  37   75:invokevirtual   #176 <Method Object com.google.android.gms.internal.ads.bwj.a(Context, boolean)>
	//*  38   78:checkcast       #93  <Class bxc>
	//*  39   81:putfield        #57  <Field bxc f>
	//*  40   84:aload_0         
	//*  41   85:getfield        #109 <Field a d>
	//*  42   88:ifnull          111
	//*  43   91:aload_0         
	//*  44   92:getfield        #57  <Field bxc f>
	//*  45   95:new             #111 <Class bvp>
	//*  46   98:dup             
	//*  47   99:aload_0         
	//*  48  100:getfield        #109 <Field a d>
	//*  49  103:invokespecial   #113 <Method void bvp(a)>
	//*  50  106:invokeinterface #116 <Method void com.google.android.gms.internal.ads.bxc.a(bwr)>
	//*  51  111:aload_0         
	//*  52  112:getfield        #139 <Field bvm e>
	//*  53  115:ifnull          138
	//*  54  118:aload_0         
	//*  55  119:getfield        #57  <Field bxc f>
	//*  56  122:new             #141 <Class bvn>
	//*  57  125:dup             
	//*  58  126:aload_0         
	//*  59  127:getfield        #139 <Field bvm e>
	//*  60  130:invokespecial   #143 <Method void bvn(bvm)>
	//*  61  133:invokeinterface #146 <Method void com.google.android.gms.internal.ads.bxc.a(bwn)>
	//*  62  138:aload_0         
	//*  63  139:getfield        #119 <Field com.google.android.gms.ads.reward.a h>
	//*  64  142:ifnull          165
	//*  65  145:aload_0         
	//*  66  146:getfield        #57  <Field bxc f>
	//*  67  149:new             #121 <Class bvt>
	//*  68  152:dup             
	//*  69  153:aload_0         
	//*  70  154:getfield        #119 <Field com.google.android.gms.ads.reward.a h>
	//*  71  157:invokespecial   #123 <Method void bvt(com.google.android.gms.ads.reward.a)>
	//*  72  160:invokeinterface #126 <Method void com.google.android.gms.internal.ads.bxc.a(bxh)>
	//*  73  165:aload_0         
	//*  74  166:getfield        #178 <Field com.google.android.gms.ads.a.a i>
	//*  75  169:ifnull          192
	//*  76  172:aload_0         
	//*  77  173:getfield        #57  <Field bxc f>
	//*  78  176:new             #180 <Class bvy>
	//*  79  179:dup             
	//*  80  180:aload_0         
	//*  81  181:getfield        #178 <Field com.google.android.gms.ads.a.a i>
	//*  82  184:invokespecial   #183 <Method void bvy(com.google.android.gms.ads.a.a)>
	//*  83  187:invokeinterface #186 <Method void com.google.android.gms.internal.ads.bxc.a(bxk)>
	//*  84  192:aload_0         
	//*  85  193:getfield        #188 <Field c j>
	//*  86  196:ifnull          219
	//*  87  199:aload_0         
	//*  88  200:getfield        #57  <Field bxc f>
	//*  89  203:new             #190 <Class am>
	//*  90  206:dup             
	//*  91  207:aload_0         
	//*  92  208:getfield        #188 <Field c j>
	//*  93  211:invokespecial   #193 <Method void am(c)>
	//*  94  214:invokeinterface #196 <Method void com.google.android.gms.internal.ads.bxc.a(aj)>
	//*  95  219:aload_0         
	//*  96  220:getfield        #198 <Field i k>
	//*  97  223:ifnull          242
	//*  98  226:aload_0         
	//*  99  227:getfield        #57  <Field bxc f>
	//* 100  230:aload_0         
	//* 101  231:getfield        #198 <Field i k>
	//* 102  234:invokevirtual   #203 <Method bwl i.a()>
	//* 103  237:invokeinterface #206 <Method void com.google.android.gms.internal.ads.bxc.a(bxq)>
	//* 104  242:aload_0         
	//* 105  243:getfield        #129 <Field d l>
	//* 106  246:ifnull          269
	//* 107  249:aload_0         
	//* 108  250:getfield        #57  <Field bxc f>
	//* 109  253:new             #131 <Class uf>
	//* 110  256:dup             
	//* 111  257:aload_0         
	//* 112  258:getfield        #129 <Field d l>
	//* 113  261:invokespecial   #133 <Method void uf(d)>
	//* 114  264:invokeinterface #136 <Method void com.google.android.gms.internal.ads.bxc.a(ua)>
	//* 115  269:aload_0         
	//* 116  270:getfield        #57  <Field bxc f>
	//* 117  273:aload_0         
	//* 118  274:getfield        #208 <Field boolean n>
	//* 119  277:invokeinterface #211 <Method void com.google.android.gms.internal.ads.bxc.c(boolean)>
	//* 120  282:aload_0         
	//* 121  283:getfield        #57  <Field bxc f>
	//* 122  286:aload_0         
	//* 123  287:getfield        #52  <Field Context b>
	//* 124  290:aload_1         
	//* 125  291:invokestatic    #214 <Method zzwb com.google.android.gms.internal.ads.bvw.a(Context, byn)>
	//* 126  294:invokeinterface #217 <Method boolean bxc.b(zzwb)>
	//* 127  299:ifeq            313
	//* 128  302:aload_0         
	//* 129  303:getfield        #50  <Field kl a>
	//* 130  306:aload_1         
	//* 131  307:invokevirtual   #222 <Method java.util.Map byn.j()>
	//* 132  310:invokevirtual   #225 <Method void com.google.android.gms.internal.ads.kl.a(java.util.Map)>
	//* 133  313:return          
		// Misplaced declaration of an exception variable
		catch(byn byn1)
	//* 134  314:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#008 Must be called on the main UI thread.", ((Throwable) (byn1)));
	//  135  315:ldc1            #98  <String "#008 Must be called on the main UI thread.">
	//  136  317:aload_1         
	//  137  318:invokestatic    #103 <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
			return;
	//  138  321:return          
		}
		zzwf1 = new zzwf();
		bwa bwa = bwk.b();
		Context context = b;
		f = (bxc)((bwj) (new bwe(bwa, context, zzwf1, g, ((km) (a))))).a(context, false);
		if(d != null)
			f.a(((bwr) (new bvp(d))));
		if(e != null)
			f.a(((bwn) (new bvn(e))));
		if(h != null)
			f.a(((bxh) (new bvt(h))));
		if(i != null)
			f.a(((bxk) (new bvy(i))));
		if(j != null)
			f.a(((aj) (new am(j))));
		if(k != null)
			f.a(((bxq) (k.a())));
		if(l != null)
			f.a(((ua) (new uf(l))));
		f.c(n);
		if(f.b(com.google.android.gms.internal.ads.bvw.a(b, byn1)))
			a.a(byn1.j());
		return;
	}

	public final void a(String s)
	{
		if(g == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field String g>
	//*   2    4:ifnonnull       13
		{
			g = s;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #149 <Field String g>
			return;
	//    6   12:return          
		} else
		{
			throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
	//    7   13:new             #82  <Class IllegalStateException>
	//    8   16:dup             
	//    9   17:ldc1            #227 <String "The ad unit ID can only be set once on InterstitialAd.">
	//   10   19:invokespecial   #88  <Method void IllegalStateException(String)>
	//   11   22:athrow          
		}
	}

	public final void a(boolean flag)
	{
		m = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #155 <Field boolean m>
	//    3    5:return          
	}

	public final void b()
	{
		try
		{
			b("show");
	//    0    0:aload_0         
	//    1    1:ldc1            #229 <String "show">
	//    2    3:invokespecial   #153 <Method void b(String)>
			f.H();
	//    3    6:aload_0         
	//    4    7:getfield        #57  <Field bxc f>
	//    5   10:invokeinterface #232 <Method void bxc.H()>
			return;
	//    6   15:return          
		}
		catch(RemoteException remoteexception)
	//*   7   16:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#008 Must be called on the main UI thread.", ((Throwable) (remoteexception)));
	//    8   17:ldc1            #98  <String "#008 Must be called on the main UI thread.">
	//    9   19:aload_1         
	//   10   20:invokestatic    #103 <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   11   23:return          
	}

	public final void b(boolean flag)
	{
		try
		{
			n = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #208 <Field boolean n>
			if(f != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #57  <Field bxc f>
	//*   5    9:ifnull          22
				f.c(flag);
	//    6   12:aload_0         
	//    7   13:getfield        #57  <Field bxc f>
	//    8   16:iload_1         
	//    9   17:invokeinterface #211 <Method void com.google.android.gms.internal.ads.bxc.c(boolean)>
			return;
	//   10   22:return          
		}
		catch(RemoteException remoteexception)
	//*  11   23:astore_2        
		{
			com.google.android.gms.internal.ads.aag.d("#008 Must be called on the main UI thread.", ((Throwable) (remoteexception)));
	//   12   24:ldc1            #98  <String "#008 Must be called on the main UI thread.">
	//   13   26:aload_2         
	//   14   27:invokestatic    #103 <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   15   30:return          
	}

	private final kl a;
	private final Context b;
	private final bvw c;
	private a d;
	private bvm e;
	private bxc f;
	private String g;
	private com.google.android.gms.ads.reward.a h;
	private com.google.android.gms.ads.a.a i;
	private c j;
	private i k;
	private d l;
	private boolean m;
	private boolean n;
}
