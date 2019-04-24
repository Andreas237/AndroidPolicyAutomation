// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Build;

// Referenced classes of package com.amap.api.mapcore.util:
//			hn, ju, jn, jy, 
//			jx, kc, hc, he, 
//			hg, go, gt, jo, 
//			hm, kh

static final class hn$1
	implements Runnable
{

	public void run()
	{
		com/amap/api/mapcore/util/hn;
	//    0    0:ldc1            #8   <Class hn>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		jn jn1 = ju.a(hn.a());
	//    2    3:invokestatic    #34  <Method java.lang.ref.WeakReference hn.a()>
	//    3    6:invokestatic    #39  <Method jn ju.a(java.lang.ref.WeakReference)>
	//    4    9:astore_1        
		ju.a(a, jn1, b, 1000, 20480, "1");
	//    5   10:aload_0         
	//    6   11:getfield        #20  <Field Context a>
	//    7   14:aload_1         
	//    8   15:aload_0         
	//    9   16:getfield        #22  <Field String b>
	//   10   19:sipush          1000
	//   11   22:sipush          20480
	//   12   25:ldc1            #41  <String "1">
	//   13   27:invokestatic    #44  <Method void ju.a(Context, jn, String, int, int, String)>
		jn1.f = c;
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #24  <Field kh c>
	//   17   35:putfield        #49  <Field kh jn.f>
		if(jn1.g == null)
	//*  18   38:aload_1         
	//*  19   39:getfield        #53  <Field kb jn.g>
	//*  20   42:ifnonnull       165
			jn1.g = ((kb) (new jy(((kb) (new jx(a, ((kb) (new kc())), ((hd) (new hc(((hd) (new he(((hd) (new hg())))))))), "EImtleSI6IiVzIiwicGxhdGZvcm0iOiJhbmRyb2lkIiwiZGl1IjoiJXMiLCJwa2ciOiIlcyIsIm1vZGVsIjoiJXMiLCJhcHBuYW1lIjoiJXMiLCJhcHB2ZXJzaW9uIjoiJXMiLCJzeXN2ZXJzaW9uIjoiJXMiLA=", new Object[] {
				go.f(a), gt.t(a), go.c(a), Build.MODEL, go.b(a), go.d(a), android.os..VERSION.RELEASE
			}))))));
	//   21   45:aload_1         
	//   22   46:new             #55  <Class jy>
	//   23   49:dup             
	//   24   50:new             #57  <Class jx>
	//   25   53:dup             
	//   26   54:aload_0         
	//   27   55:getfield        #20  <Field Context a>
	//   28   58:new             #59  <Class kc>
	//   29   61:dup             
	//   30   62:invokespecial   #60  <Method void kc()>
	//   31   65:new             #62  <Class hc>
	//   32   68:dup             
	//   33   69:new             #64  <Class he>
	//   34   72:dup             
	//   35   73:new             #66  <Class hg>
	//   36   76:dup             
	//   37   77:invokespecial   #67  <Method void hg()>
	//   38   80:invokespecial   #70  <Method void he(hd)>
	//   39   83:invokespecial   #71  <Method void hc(hd)>
	//   40   86:ldc1            #73  <String "EImtleSI6IiVzIiwicGxhdGZvcm0iOiJhbmRyb2lkIiwiZGl1IjoiJXMiLCJwa2ciOiIlcyIsIm1vZGVsIjoiJXMiLCJhcHBuYW1lIjoiJXMiLCJhcHB2ZXJzaW9uIjoiJXMiLCJzeXN2ZXJzaW9uIjoiJXMiLA=">
	//   41   88:bipush          7
	//   42   90:anewarray       Object[]
	//   43   93:dup             
	//   44   94:iconst_0        
	//   45   95:aload_0         
	//   46   96:getfield        #20  <Field Context a>
	//   47   99:invokestatic    #78  <Method String go.f(Context)>
	//   48  102:aastore         
	//   49  103:dup             
	//   50  104:iconst_1        
	//   51  105:aload_0         
	//   52  106:getfield        #20  <Field Context a>
	//   53  109:invokestatic    #83  <Method String gt.t(Context)>
	//   54  112:aastore         
	//   55  113:dup             
	//   56  114:iconst_2        
	//   57  115:aload_0         
	//   58  116:getfield        #20  <Field Context a>
	//   59  119:invokestatic    #85  <Method String go.c(Context)>
	//   60  122:aastore         
	//   61  123:dup             
	//   62  124:iconst_3        
	//   63  125:getstatic       #90  <Field String Build.MODEL>
	//   64  128:aastore         
	//   65  129:dup             
	//   66  130:iconst_4        
	//   67  131:aload_0         
	//   68  132:getfield        #20  <Field Context a>
	//   69  135:invokestatic    #92  <Method String go.b(Context)>
	//   70  138:aastore         
	//   71  139:dup             
	//   72  140:iconst_5        
	//   73  141:aload_0         
	//   74  142:getfield        #20  <Field Context a>
	//   75  145:invokestatic    #95  <Method String go.d(Context)>
	//   76  148:aastore         
	//   77  149:dup             
	//   78  150:bipush          6
	//   79  152:getstatic       #100 <Field String android.os.Build$VERSION.RELEASE>
	//   80  155:aastore         
	//   81  156:invokespecial   #103 <Method void jx(Context, kb, hd, String, Object[])>
	//   82  159:invokespecial   #106 <Method void jy(kb)>
	//   83  162:putfield        #53  <Field kb jn.g>
		jn1.h = 0x36ee80;
	//   84  165:aload_1         
	//   85  166:ldc1            #107 <Int 0x36ee80>
	//   86  168:putfield        #111 <Field int jn.h>
		jo.a(jn1);
	//   87  171:aload_1         
	//   88  172:invokestatic    #116 <Method void jo.a(jn)>
		com/amap/api/mapcore/util/hn;
	//   89  175:ldc1            #8   <Class hn>
		JVM INSTR monitorexit ;
	//   90  177:monitorexit     
		  goto _L1
	//*  91  178:goto            187
		Object obj;
		obj;
	//   92  181:astore_1        
	//*  93  182:ldc1            #8   <Class hn>
		throw obj;
	//   94  184:monitorexit     
	//   95  185:aload_1         
	//   96  186:athrow          
_L1:
		return;
	//   97  187:return          
		obj;
	//   98  188:astore_1        
		hm.c(((Throwable) (obj)), "lg", "pul");
	//   99  189:aload_1         
	//  100  190:ldc1            #118 <String "lg">
	//  101  192:ldc1            #120 <String "pul">
	//  102  194:invokestatic    #125 <Method void hm.c(Throwable, String, String)>
		return;
	//  103  197:return          
	}

	final Context a;
	final String b;
	final kh c;

	hn$1(Context context, String s, kh kh)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Context a>
		b = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field String b>
		c = kh;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field kh c>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
