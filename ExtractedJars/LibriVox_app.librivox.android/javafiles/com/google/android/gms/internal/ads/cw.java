// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.*;
import com.google.android.gms.ads.o;
import com.google.android.gms.c.a;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ct, cf, ch, ci, 
//			aag, ce

public final class cw extends i
{

	public cw(ct ct1)
	{
		Object obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void i()>
		b = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #24  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void ArrayList()>
	//    6   12:putfield        #27  <Field List b>
		d = new o();
	//    7   15:aload_0         
	//    8   16:new             #29  <Class o>
	//    9   19:dup             
	//   10   20:invokespecial   #30  <Method void o()>
	//   11   23:putfield        #32  <Field o d>
		a = ct1;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #34  <Field ct a>
		obj = null;
	//   15   31:aconst_null     
	//   16   32:astore_2        
		ct1 = ((ct) (a.f()));
	//   17   33:aload_0         
	//   18   34:getfield        #34  <Field ct a>
	//   19   37:invokeinterface #40  <Method List ct.f()>
	//   20   42:astore_1        
		if(ct1 == null) goto _L2; else goto _L1
	//   21   43:aload_1         
	//   22   44:ifnull          157
_L1:
		Iterator iterator = ((List) (ct1)).iterator();
	//   23   47:aload_1         
	//   24   48:invokeinterface #46  <Method Iterator List.iterator()>
	//   25   53:astore_3        
_L8:
		if(!iterator.hasNext()) goto _L2; else goto _L3
	//   26   54:aload_3         
	//   27   55:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//   28   60:ifeq            157
_L3:
		ct1 = ((ct) (iterator.next()));
	//   29   63:aload_3         
	//   30   64:invokeinterface #56  <Method Object Iterator.next()>
	//   31   69:astore_1        
		if(!(ct1 instanceof IBinder))
			break MISSING_BLOCK_LABEL_251;
	//   32   70:aload_1         
	//   33   71:instanceof      #58  <Class IBinder>
	//   34   74:ifeq            251
		ct1 = ((ct) ((IBinder)ct1));
	//   35   77:aload_1         
	//   36   78:checkcast       #58  <Class IBinder>
	//   37   81:astore_1        
		if(ct1 == null)
			break MISSING_BLOCK_LABEL_251;
	//   38   82:aload_1         
	//   39   83:ifnull          251
		android.os.IInterface iinterface = ((IBinder) (ct1)).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
	//   40   86:aload_1         
	//   41   87:ldc1            #60  <String "com.google.android.gms.ads.internal.formats.client.INativeAdImage">
	//   42   89:invokeinterface #64  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   43   94:astore          4
		if(!(iinterface instanceof cf)) goto _L5; else goto _L4
	//   44   96:aload           4
	//   45   98:instanceof      #66  <Class cf>
	//   46  101:ifeq            113
_L4:
		ct1 = ((ct) ((cf)iinterface));
	//   47  104:aload           4
	//   48  106:checkcast       #66  <Class cf>
	//   49  109:astore_1        
		  goto _L6
	//*  50  110:goto            125
_L5:
		ct1 = ((ct) (new ch(((IBinder) (ct1)))));
	//   51  113:new             #68  <Class ch>
	//   52  116:dup             
	//   53  117:aload_1         
	//   54  118:invokespecial   #71  <Method void ch(IBinder)>
	//   55  121:astore_1        
	//*  56  122:goto            125
_L6:
		if(ct1 == null) goto _L8; else goto _L7
	//   57  125:aload_1         
	//   58  126:ifnull          54
_L7:
		b.add(((Object) (new ci(((cf) (ct1))))));
	//   59  129:aload_0         
	//   60  130:getfield        #27  <Field List b>
	//   61  133:new             #73  <Class ci>
	//   62  136:dup             
	//   63  137:aload_1         
	//   64  138:invokespecial   #76  <Method void ci(cf)>
	//   65  141:invokeinterface #80  <Method boolean List.add(Object)>
	//   66  146:pop             
		  goto _L8
	//*  67  147:goto            54
		ct1;
	//   68  150:astore_1        
		aag.b("", ((Throwable) (ct1)));
	//   69  151:ldc1            #82  <String "">
	//   70  153:aload_1         
	//   71  154:invokestatic    #87  <Method void aag.b(String, Throwable)>
_L2:
		ct1 = ((ct) (a.h()));
	//   72  157:aload_0         
	//   73  158:getfield        #34  <Field ct a>
	//   74  161:invokeinterface #91  <Method cf ct.h()>
	//   75  166:astore_1        
		if(ct1 != null)
	//*  76  167:aload_1         
	//*  77  168:ifnull          183
			try
			{
				ct1 = ((ct) (new ci(((cf) (ct1)))));
	//   78  171:new             #73  <Class ci>
	//   79  174:dup             
	//   80  175:aload_1         
	//   81  176:invokespecial   #76  <Method void ci(cf)>
	//   82  179:astore_1        
			}
	//*  83  180:goto            197
	//*  84  183:aconst_null     
	//*  85  184:astore_1        
	//*  86  185:goto            197
			// Misplaced declaration of an exception variable
			catch(ct ct1)
	//*  87  188:astore_1        
			{
				aag.b("", ((Throwable) (ct1)));
	//   88  189:ldc1            #82  <String "">
	//   89  191:aload_1         
	//   90  192:invokestatic    #87  <Method void aag.b(String, Throwable)>
				ct1 = null;
	//   91  195:aconst_null     
	//   92  196:astore_1        
			}
		else
			ct1 = null;
		c = ((ci) (ct1));
	//   93  197:aload_0         
	//   94  198:aload_1         
	//   95  199:putfield        #93  <Field ci c>
		ct1 = ((ct) (obj));
	//   96  202:aload_2         
	//   97  203:astore_1        
		try
		{
			if(a.r() != null)
	//*  98  204:aload_0         
	//*  99  205:getfield        #34  <Field ct a>
	//* 100  208:invokeinterface #97  <Method ca ct.r()>
	//* 101  213:ifnull          245
				ct1 = ((ct) (new ce(a.r())));
	//  102  216:new             #99  <Class ce>
	//  103  219:dup             
	//  104  220:aload_0         
	//  105  221:getfield        #34  <Field ct a>
	//  106  224:invokeinterface #97  <Method ca ct.r()>
	//  107  229:invokespecial   #102 <Method void ce(ca)>
	//  108  232:astore_1        
		}
	//* 109  233:goto            245
		// Misplaced declaration of an exception variable
		catch(ct ct1)
	//* 110  236:astore_1        
		{
			aag.b("", ((Throwable) (ct1)));
	//  111  237:ldc1            #82  <String "">
	//  112  239:aload_1         
	//  113  240:invokestatic    #87  <Method void aag.b(String, Throwable)>
			ct1 = ((ct) (obj));
	//  114  243:aload_2         
	//  115  244:astore_1        
		}
		e = ((c) (ct1));
	//  116  245:aload_0         
	//  117  246:aload_1         
	//  118  247:putfield        #104 <Field c e>
		return;
	//  119  250:return          
		ct1 = null;
	//  120  251:aconst_null     
	//  121  252:astore_1        
		  goto _L6
	//* 122  253:goto            125
	}

	private final a k()
	{
		a a1;
		try
		{
			a1 = a.n();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ct a>
	//    2    4:invokeinterface #110 <Method a ct.n()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			aag.b("", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #82  <String "">
	//    8   15:aload_1         
	//    9   16:invokestatic    #87  <Method void aag.b(String, Throwable)>
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		}
		return a1;
	}

	protected final Object a()
	{
		return ((Object) (k()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #112 <Method a k()>
	//    2    4:areturn         
	}

	public final CharSequence b()
	{
		String s;
		try
		{
			s = a.e();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ct a>
	//    2    4:invokeinterface #116 <Method String ct.e()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			aag.b("", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #82  <String "">
	//    8   15:aload_1         
	//    9   16:invokestatic    #87  <Method void aag.b(String, Throwable)>
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		}
		return ((CharSequence) (s));
	}

	public final List c()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field List b>
	//    2    4:areturn         
	}

	public final CharSequence d()
	{
		String s;
		try
		{
			s = a.g();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ct a>
	//    2    4:invokeinterface #119 <Method String ct.g()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			aag.b("", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #82  <String "">
	//    8   15:aload_1         
	//    9   16:invokestatic    #87  <Method void aag.b(String, Throwable)>
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		}
		return ((CharSequence) (s));
	}

	public final d e()
	{
		return ((d) (c));
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field ci c>
	//    2    4:areturn         
	}

	public final CharSequence f()
	{
		String s;
		try
		{
			s = a.i();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ct a>
	//    2    4:invokeinterface #123 <Method String com.google.android.gms.internal.ads.ct.i()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			aag.b("", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #82  <String "">
	//    8   15:aload_1         
	//    9   16:invokestatic    #87  <Method void aag.b(String, Throwable)>
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		}
		return ((CharSequence) (s));
	}

	public final Double g()
	{
		double d1;
		try
		{
			d1 = a.j();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ct a>
	//    2    4:invokeinterface #128 <Method double ct.j()>
	//    3    9:dstore_1        
		}
	//*   4   10:dload_1         
	//*   5   11:ldc2w           #129 <Double -1D>
	//*   6   14:dcmpl           
	//*   7   15:ifne            20
	//*   8   18:aconst_null     
	//*   9   19:areturn         
	//*  10   20:dload_1         
	//*  11   21:invokestatic    #136 <Method Double Double.valueOf(double)>
	//*  12   24:areturn         
		catch(RemoteException remoteexception)
	//*  13   25:astore_3        
		{
			aag.b("", ((Throwable) (remoteexception)));
	//   14   26:ldc1            #82  <String "">
	//   15   28:aload_3         
	//   16   29:invokestatic    #87  <Method void aag.b(String, Throwable)>
			return null;
	//   17   32:aconst_null     
	//   18   33:areturn         
		}
		if(d1 == -1D)
			return null;
		else
			return Double.valueOf(d1);
	}

	public final CharSequence h()
	{
		String s;
		try
		{
			s = a.k();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ct a>
	//    2    4:invokeinterface #138 <Method String ct.k()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			aag.b("", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #82  <String "">
	//    8   15:aload_1         
	//    9   16:invokestatic    #87  <Method void aag.b(String, Throwable)>
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		}
		return ((CharSequence) (s));
	}

	public final CharSequence i()
	{
		String s;
		try
		{
			s = a.l();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ct a>
	//    2    4:invokeinterface #141 <Method String ct.l()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			aag.b("", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #82  <String "">
	//    8   15:aload_1         
	//    9   16:invokestatic    #87  <Method void aag.b(String, Throwable)>
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		}
		return ((CharSequence) (s));
	}

	public final o j()
	{
		try
		{
			if(a.m() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field ct a>
	//*   2    4:invokeinterface #146 <Method byg ct.m()>
	//*   3    9:ifnull          38
				d.a(a.m());
	//    4   12:aload_0         
	//    5   13:getfield        #32  <Field o d>
	//    6   16:aload_0         
	//    7   17:getfield        #34  <Field ct a>
	//    8   20:invokeinterface #146 <Method byg ct.m()>
	//    9   25:invokevirtual   #149 <Method void o.a(byg)>
		}
	//*  10   28:goto            38
		catch(RemoteException remoteexception)
	//*  11   31:astore_1        
		{
			aag.b("Exception occurred while getting video controller", ((Throwable) (remoteexception)));
	//   12   32:ldc1            #151 <String "Exception occurred while getting video controller">
	//   13   34:aload_1         
	//   14   35:invokestatic    #87  <Method void aag.b(String, Throwable)>
		}
		return d;
	//   15   38:aload_0         
	//   16   39:getfield        #32  <Field o d>
	//   17   42:areturn         
	}

	private final ct a;
	private final List b;
	private final ci c;
	private final o d;
	private final c e;
}
