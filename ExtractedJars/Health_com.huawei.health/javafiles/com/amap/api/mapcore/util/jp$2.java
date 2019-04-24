// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;

// Referenced classes of package com.amap.api.mapcore.util:
//			jp, ju, hk, jn, 
//			jy, jx, kc, hc, 
//			hg, he, go, kg, 
//			kd, ki, jo

static final class jp$2
	implements Runnable
{

	public void run()
	{
		com/amap/api/mapcore/util/jp;
	//    0    0:ldc1            #8   <Class jp>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		jn jn1 = ju.a(jp.a);
	//    2    3:getstatic       #23  <Field java.lang.ref.WeakReference jp.a>
	//    3    6:invokestatic    #28  <Method jn ju.a(java.lang.ref.WeakReference)>
	//    4    9:astore_1        
		ju.a(a, jn1, hk.j, 50, 0x19000, "10");
	//    5   10:aload_0         
	//    6   11:getfield        #15  <Field Context a>
	//    7   14:aload_1         
	//    8   15:getstatic       #34  <Field String hk.j>
	//    9   18:bipush          50
	//   10   20:ldc1            #35  <Int 0x19000>
	//   11   22:ldc1            #37  <String "10">
	//   12   24:invokestatic    #40  <Method void ju.a(Context, jn, String, int, int, String)>
		if(jn1.g == null)
	//*  13   27:aload_1         
	//*  14   28:getfield        #46  <Field kb jn.g>
	//*  15   31:ifnonnull       122
		{
			String s = jp.b(a);
	//   16   34:aload_0         
	//   17   35:getfield        #15  <Field Context a>
	//   18   38:invokestatic    #50  <Method String jp.b(Context)>
	//   19   41:astore_2        
			jn1.g = ((kb) (new jy(((kb) (new jx(a, ((kb) (new kc())), ((hd) (new hc(((hd) (new hg(((hd) (new he())))))))), "WImFwcG5hbWUiOiIlcyIsInBrZyI6IiVzIiwiZGl1IjoiJXMi", new Object[] {
				go.b(a), go.c(a), s
			}))))));
	//   20   42:aload_1         
	//   21   43:new             #52  <Class jy>
	//   22   46:dup             
	//   23   47:new             #54  <Class jx>
	//   24   50:dup             
	//   25   51:aload_0         
	//   26   52:getfield        #15  <Field Context a>
	//   27   55:new             #56  <Class kc>
	//   28   58:dup             
	//   29   59:invokespecial   #57  <Method void kc()>
	//   30   62:new             #59  <Class hc>
	//   31   65:dup             
	//   32   66:new             #61  <Class hg>
	//   33   69:dup             
	//   34   70:new             #63  <Class he>
	//   35   73:dup             
	//   36   74:invokespecial   #64  <Method void he()>
	//   37   77:invokespecial   #67  <Method void hg(hd)>
	//   38   80:invokespecial   #68  <Method void hc(hd)>
	//   39   83:ldc1            #70  <String "WImFwcG5hbWUiOiIlcyIsInBrZyI6IiVzIiwiZGl1IjoiJXMi">
	//   40   85:iconst_3        
	//   41   86:anewarray       Object[]
	//   42   89:dup             
	//   43   90:iconst_0        
	//   44   91:aload_0         
	//   45   92:getfield        #15  <Field Context a>
	//   46   95:invokestatic    #73  <Method String go.b(Context)>
	//   47   98:aastore         
	//   48   99:dup             
	//   49  100:iconst_1        
	//   50  101:aload_0         
	//   51  102:getfield        #15  <Field Context a>
	//   52  105:invokestatic    #76  <Method String go.c(Context)>
	//   53  108:aastore         
	//   54  109:dup             
	//   55  110:iconst_2        
	//   56  111:aload_2         
	//   57  112:aastore         
	//   58  113:invokespecial   #79  <Method void jx(Context, kb, hd, String, Object[])>
	//   59  116:invokespecial   #82  <Method void jy(kb)>
	//   60  119:putfield        #46  <Field kb jn.g>
		}
		jn1.h = 0xdbba00;
	//   61  122:aload_1         
	//   62  123:ldc1            #83  <Int 0xdbba00>
	//   63  125:putfield        #87  <Field int jn.h>
		if(TextUtils.isEmpty(((CharSequence) (jn1.i))))
	//*  64  128:aload_1         
	//*  65  129:getfield        #90  <Field String jn.i>
	//*  66  132:invokestatic    #96  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  67  135:ifeq            144
			jn1.i = "eKey";
	//   68  138:aload_1         
	//   69  139:ldc1            #98  <String "eKey">
	//   70  141:putfield        #90  <Field String jn.i>
		if(jn1.f == null)
	//*  71  144:aload_1         
	//*  72  145:getfield        #102 <Field kh jn.f>
	//*  73  148:ifnonnull       198
			jn1.f = ((kh) (new kg(a, jn1.h, jn1.i, ((kh) (new kd(5, jn1.a, ((kh) (new ki(a, false)))))))));
	//   74  151:aload_1         
	//   75  152:new             #104 <Class kg>
	//   76  155:dup             
	//   77  156:aload_0         
	//   78  157:getfield        #15  <Field Context a>
	//   79  160:aload_1         
	//   80  161:getfield        #87  <Field int jn.h>
	//   81  164:aload_1         
	//   82  165:getfield        #90  <Field String jn.i>
	//   83  168:new             #106 <Class kd>
	//   84  171:dup             
	//   85  172:iconst_5        
	//   86  173:aload_1         
	//   87  174:getfield        #108 <Field String jn.a>
	//   88  177:new             #110 <Class ki>
	//   89  180:dup             
	//   90  181:aload_0         
	//   91  182:getfield        #15  <Field Context a>
	//   92  185:iconst_0        
	//   93  186:invokespecial   #113 <Method void ki(Context, boolean)>
	//   94  189:invokespecial   #116 <Method void kd(int, String, kh)>
	//   95  192:invokespecial   #119 <Method void kg(Context, int, String, kh)>
	//   96  195:putfield        #102 <Field kh jn.f>
		jo.a(jn1);
	//   97  198:aload_1         
	//   98  199:invokestatic    #124 <Method void jo.a(jn)>
		com/amap/api/mapcore/util/jp;
	//   99  202:ldc1            #8   <Class jp>
		JVM INSTR monitorexit ;
	//  100  204:monitorexit     
		return;
	//  101  205:return          
		Exception exception;
		exception;
	//  102  206:astore_1        
	//* 103  207:ldc1            #8   <Class jp>
		throw exception;
	//  104  209:monitorexit     
	//  105  210:aload_1         
	//  106  211:athrow          
	}

	final Context a;

	jp$2(Context context)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field Context a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
