// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			byn, zzzs, bwk, zv, 
//			zzwb

public final class bvw
{

	protected bvw()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static zzwb a(Context context, byn byn1)
	{
		Object obj = ((Object) (byn1.a()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method Date byn.a()>
	//    2    4:astore          10
		long l;
		if(obj != null)
	//*   3    6:aload           10
	//*   4    8:ifnull          21
			l = ((Date) (obj)).getTime();
	//    5   11:aload           10
	//    6   13:invokevirtual   #28  <Method long Date.getTime()>
	//    7   16:lstore          5
		else
	//*   8   18:goto            26
			l = -1L;
	//    9   21:ldc2w           #29  <Long -1L>
	//   10   24:lstore          5
		String s = byn1.b();
	//   11   26:aload_1         
	//   12   27:invokevirtual   #34  <Method String byn.b()>
	//   13   30:astore          12
		int i = byn1.c();
	//   14   32:aload_1         
	//   15   33:invokevirtual   #38  <Method int byn.c()>
	//   16   36:istore_2        
		obj = ((Object) (byn1.d()));
	//   17   37:aload_1         
	//   18   38:invokevirtual   #42  <Method Set byn.d()>
	//   19   41:astore          10
		if(!((Set) (obj)).isEmpty())
	//*  20   43:aload           10
	//*  21   45:invokeinterface #48  <Method boolean Set.isEmpty()>
	//*  22   50:ifne            70
			obj = ((Object) (Collections.unmodifiableList(((java.util.List) (new ArrayList(((java.util.Collection) (obj))))))));
	//   23   53:new             #50  <Class ArrayList>
	//   24   56:dup             
	//   25   57:aload           10
	//   26   59:invokespecial   #53  <Method void ArrayList(java.util.Collection)>
	//   27   62:invokestatic    #59  <Method java.util.List Collections.unmodifiableList(java.util.List)>
	//   28   65:astore          10
		else
	//*  29   67:goto            73
			obj = null;
	//   30   70:aconst_null     
	//   31   71:astore          10
		boolean flag = byn1.a(context);
	//   32   73:aload_1         
	//   33   74:aload_0         
	//   34   75:invokevirtual   #62  <Method boolean byn.a(Context)>
	//   35   78:istore          7
		int j = byn1.l();
	//   36   80:aload_1         
	//   37   81:invokevirtual   #65  <Method int byn.l()>
	//   38   84:istore_3        
		android.location.Location location = byn1.e();
	//   39   85:aload_1         
	//   40   86:invokevirtual   #69  <Method android.location.Location byn.e()>
	//   41   89:astore          13
		android.os.Bundle bundle = byn1.a(com/google/ads/mediation/admob/AdMobAdapter);
	//   42   91:aload_1         
	//   43   92:ldc1            #71  <Class AdMobAdapter>
	//   44   94:invokevirtual   #74  <Method android.os.Bundle byn.a(Class)>
	//   45   97:astore          14
		boolean flag1 = byn1.f();
	//   46   99:aload_1         
	//   47  100:invokevirtual   #77  <Method boolean byn.f()>
	//   48  103:istore          8
		String s1 = byn1.g();
	//   49  105:aload_1         
	//   50  106:invokevirtual   #80  <Method String byn.g()>
	//   51  109:astore          15
		Object obj1 = ((Object) (byn1.i()));
	//   52  111:aload_1         
	//   53  112:invokevirtual   #84  <Method com.google.android.gms.ads.c.a byn.i()>
	//   54  115:astore          11
		if(obj1 != null)
	//*  55  117:aload           11
	//*  56  119:ifnull          136
			obj1 = ((Object) (new zzzs(((com.google.android.gms.ads.c.a) (obj1)))));
	//   57  122:new             #86  <Class zzzs>
	//   58  125:dup             
	//   59  126:aload           11
	//   60  128:invokespecial   #89  <Method void zzzs(com.google.android.gms.ads.c.a)>
	//   61  131:astore          11
		else
	//*  62  133:goto            139
			obj1 = null;
	//   63  136:aconst_null     
	//   64  137:astore          11
		context = context.getApplicationContext();
	//   65  139:aload_0         
	//   66  140:invokevirtual   #95  <Method Context Context.getApplicationContext()>
	//   67  143:astore_0        
		if(context != null)
	//*  68  144:aload_0         
	//*  69  145:ifnull          171
		{
			context = ((Context) (context.getPackageName()));
	//   70  148:aload_0         
	//   71  149:invokevirtual   #98  <Method String Context.getPackageName()>
	//   72  152:astore_0        
			bwk.a();
	//   73  153:invokestatic    #103 <Method zv bwk.a()>
	//   74  156:pop             
			context = ((Context) (zv.a(Thread.currentThread().getStackTrace(), ((String) (context)))));
	//   75  157:invokestatic    #109 <Method Thread Thread.currentThread()>
	//   76  160:invokevirtual   #113 <Method StackTraceElement[] Thread.getStackTrace()>
	//   77  163:aload_0         
	//   78  164:invokestatic    #118 <Method String zv.a(StackTraceElement[], String)>
	//   79  167:astore_0        
		} else
	//*  80  168:goto            173
		{
			context = null;
	//   81  171:aconst_null     
	//   82  172:astore_0        
		}
		boolean flag2 = byn1.o();
	//   83  173:aload_1         
	//   84  174:invokevirtual   #121 <Method boolean byn.o()>
	//   85  177:istore          9
		int k = byn1.p();
	//   86  179:aload_1         
	//   87  180:invokevirtual   #124 <Method int byn.p()>
	//   88  183:istore          4
		String s2 = byn1.q();
	//   89  185:aload_1         
	//   90  186:invokevirtual   #127 <Method String byn.q()>
	//   91  189:astore          16
		return new zzwb(8, l, bundle, i, ((java.util.List) (obj)), flag, j, flag1, s1, ((zzzs) (obj1)), location, s, byn1.k(), byn1.m(), Collections.unmodifiableList(((java.util.List) (new ArrayList(((java.util.Collection) (byn1.n())))))), byn1.h(), ((String) (context)), flag2, ((zzvv) (null)), k, s2);
	//   92  191:new             #129 <Class zzwb>
	//   93  194:dup             
	//   94  195:bipush          8
	//   95  197:lload           5
	//   96  199:aload           14
	//   97  201:iload_2         
	//   98  202:aload           10
	//   99  204:iload           7
	//  100  206:iload_3         
	//  101  207:iload           8
	//  102  209:aload           15
	//  103  211:aload           11
	//  104  213:aload           13
	//  105  215:aload           12
	//  106  217:aload_1         
	//  107  218:invokevirtual   #133 <Method android.os.Bundle byn.k()>
	//  108  221:aload_1         
	//  109  222:invokevirtual   #136 <Method android.os.Bundle byn.m()>
	//  110  225:new             #50  <Class ArrayList>
	//  111  228:dup             
	//  112  229:aload_1         
	//  113  230:invokevirtual   #139 <Method Set byn.n()>
	//  114  233:invokespecial   #53  <Method void ArrayList(java.util.Collection)>
	//  115  236:invokestatic    #59  <Method java.util.List Collections.unmodifiableList(java.util.List)>
	//  116  239:aload_1         
	//  117  240:invokevirtual   #142 <Method String byn.h()>
	//  118  243:aload_0         
	//  119  244:iload           9
	//  120  246:aconst_null     
	//  121  247:iload           4
	//  122  249:aload           16
	//  123  251:invokespecial   #145 <Method void zzwb(int, long, android.os.Bundle, int, java.util.List, boolean, int, boolean, String, zzzs, android.location.Location, String, android.os.Bundle, android.os.Bundle, java.util.List, String, String, boolean, zzvv, int, String)>
	//  124  254:areturn         
	}

	public static final bvw a = new bvw();

	static 
	{
	//    0    0:new             #2   <Class bvw>
	//    1    3:dup             
	//    2    4:invokespecial   #12  <Method void bvw()>
	//    3    7:putstatic       #14  <Field bvw a>
	//*   4   10:return          
	}
}
