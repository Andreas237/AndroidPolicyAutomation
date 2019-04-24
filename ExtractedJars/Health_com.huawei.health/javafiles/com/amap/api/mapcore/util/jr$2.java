// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

// Referenced classes of package com.amap.api.mapcore.util:
//			jr, ju, hk, jn, 
//			hc, he, hg, jy, 
//			jx, kc, hh, go, 
//			gt, kg, ke, jo, 
//			hm

static final class jr$2
	implements Runnable
{

	public void run()
	{
		try
		{
			jn jn1 = ju.a(jr.a());
	//    0    0:invokestatic    #25  <Method java.lang.ref.WeakReference jr.a()>
	//    1    3:invokestatic    #30  <Method jn ju.a(java.lang.ref.WeakReference)>
	//    2    6:astore_1        
			ju.a(a, jn1, hk.i, jr.a, 0x200000, "6");
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field Context a>
	//    5   11:aload_1         
	//    6   12:getstatic       #36  <Field String hk.i>
	//    7   15:getstatic       #39  <Field int jr.a>
	//    8   18:ldc1            #40  <Int 0x200000>
	//    9   20:ldc1            #42  <String "6">
	//   10   22:invokestatic    #45  <Method void ju.a(Context, jn, String, int, int, String)>
			jn1.h = 0xdbba00;
	//   11   25:aload_1         
	//   12   26:ldc1            #46  <Int 0xdbba00>
	//   13   28:putfield        #51  <Field int jn.h>
			if(jn1.g == null)
	//*  14   31:aload_1         
	//*  15   32:getfield        #55  <Field kb jn.g>
	//*  16   35:ifnonnull       217
			{
				hc hc1 = new hc(((hd) (new he(((hd) (new hg()))))));
	//   17   38:new             #57  <Class hc>
	//   18   41:dup             
	//   19   42:new             #59  <Class he>
	//   20   45:dup             
	//   21   46:new             #61  <Class hg>
	//   22   49:dup             
	//   23   50:invokespecial   #62  <Method void hg()>
	//   24   53:invokespecial   #65  <Method void he(hd)>
	//   25   56:invokespecial   #66  <Method void hc(hd)>
	//   26   59:astore_2        
				jn1.g = ((kb) (new jy(((kb) (new jx(a, ((kb) (new kc())), ((hd) (hc1)), new String(hh.a(10)), new Object[] {
					go.f(a), gt.t(a), gt.l(a), gt.h(a), gt.a(), Build.MANUFACTURER, Build.DEVICE, gt.u(a), go.c(a), Build.MODEL, 
					go.d(a), go.b(a)
				}))))));
	//   27   60:aload_1         
	//   28   61:new             #68  <Class jy>
	//   29   64:dup             
	//   30   65:new             #70  <Class jx>
	//   31   68:dup             
	//   32   69:aload_0         
	//   33   70:getfield        #15  <Field Context a>
	//   34   73:new             #72  <Class kc>
	//   35   76:dup             
	//   36   77:invokespecial   #73  <Method void kc()>
	//   37   80:aload_2         
	//   38   81:new             #75  <Class String>
	//   39   84:dup             
	//   40   85:bipush          10
	//   41   87:invokestatic    #80  <Method byte[] hh.a(int)>
	//   42   90:invokespecial   #83  <Method void String(byte[])>
	//   43   93:bipush          12
	//   44   95:anewarray       Object[]
	//   45   98:dup             
	//   46   99:iconst_0        
	//   47  100:aload_0         
	//   48  101:getfield        #15  <Field Context a>
	//   49  104:invokestatic    #89  <Method String go.f(Context)>
	//   50  107:aastore         
	//   51  108:dup             
	//   52  109:iconst_1        
	//   53  110:aload_0         
	//   54  111:getfield        #15  <Field Context a>
	//   55  114:invokestatic    #94  <Method String gt.t(Context)>
	//   56  117:aastore         
	//   57  118:dup             
	//   58  119:iconst_2        
	//   59  120:aload_0         
	//   60  121:getfield        #15  <Field Context a>
	//   61  124:invokestatic    #97  <Method String gt.l(Context)>
	//   62  127:aastore         
	//   63  128:dup             
	//   64  129:iconst_3        
	//   65  130:aload_0         
	//   66  131:getfield        #15  <Field Context a>
	//   67  134:invokestatic    #99  <Method String gt.h(Context)>
	//   68  137:aastore         
	//   69  138:dup             
	//   70  139:iconst_4        
	//   71  140:invokestatic    #102 <Method String gt.a()>
	//   72  143:aastore         
	//   73  144:dup             
	//   74  145:iconst_5        
	//   75  146:getstatic       #107 <Field String Build.MANUFACTURER>
	//   76  149:aastore         
	//   77  150:dup             
	//   78  151:bipush          6
	//   79  153:getstatic       #110 <Field String Build.DEVICE>
	//   80  156:aastore         
	//   81  157:dup             
	//   82  158:bipush          7
	//   83  160:aload_0         
	//   84  161:getfield        #15  <Field Context a>
	//   85  164:invokestatic    #113 <Method String gt.u(Context)>
	//   86  167:aastore         
	//   87  168:dup             
	//   88  169:bipush          8
	//   89  171:aload_0         
	//   90  172:getfield        #15  <Field Context a>
	//   91  175:invokestatic    #116 <Method String go.c(Context)>
	//   92  178:aastore         
	//   93  179:dup             
	//   94  180:bipush          9
	//   95  182:getstatic       #119 <Field String Build.MODEL>
	//   96  185:aastore         
	//   97  186:dup             
	//   98  187:bipush          10
	//   99  189:aload_0         
	//  100  190:getfield        #15  <Field Context a>
	//  101  193:invokestatic    #122 <Method String go.d(Context)>
	//  102  196:aastore         
	//  103  197:dup             
	//  104  198:bipush          11
	//  105  200:aload_0         
	//  106  201:getfield        #15  <Field Context a>
	//  107  204:invokestatic    #125 <Method String go.b(Context)>
	//  108  207:aastore         
	//  109  208:invokespecial   #128 <Method void jx(Context, kb, hd, String, Object[])>
	//  110  211:invokespecial   #131 <Method void jy(kb)>
	//  111  214:putfield        #55  <Field kb jn.g>
			}
			if(TextUtils.isEmpty(((CharSequence) (jn1.i))))
	//* 112  217:aload_1         
	//* 113  218:getfield        #132 <Field String jn.i>
	//* 114  221:invokestatic    #138 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 115  224:ifeq            233
				jn1.i = "fKey";
	//  116  227:aload_1         
	//  117  228:ldc1            #140 <String "fKey">
	//  118  230:putfield        #132 <Field String jn.i>
			jn1.f = ((kh) (new kg(a, jn1.h, jn1.i, ((kh) (new ke(a, jr.b, jr.b() * 1024, jr.c * 1024))))));
	//  119  233:aload_1         
	//  120  234:new             #142 <Class kg>
	//  121  237:dup             
	//  122  238:aload_0         
	//  123  239:getfield        #15  <Field Context a>
	//  124  242:aload_1         
	//  125  243:getfield        #51  <Field int jn.h>
	//  126  246:aload_1         
	//  127  247:getfield        #132 <Field String jn.i>
	//  128  250:new             #144 <Class ke>
	//  129  253:dup             
	//  130  254:aload_0         
	//  131  255:getfield        #15  <Field Context a>
	//  132  258:getstatic       #147 <Field boolean jr.b>
	//  133  261:invokestatic    #150 <Method int jr.b()>
	//  134  264:sipush          1024
	//  135  267:imul            
	//  136  268:getstatic       #152 <Field int jr.c>
	//  137  271:sipush          1024
	//  138  274:imul            
	//  139  275:invokespecial   #155 <Method void ke(Context, boolean, int, int)>
	//  140  278:invokespecial   #158 <Method void kg(Context, int, String, kh)>
	//  141  281:putfield        #161 <Field kh jn.f>
			jo.a(jn1);
	//  142  284:aload_1         
	//  143  285:invokestatic    #166 <Method void jo.a(jn)>
			return;
	//  144  288:return          
		}
		catch(Throwable throwable)
	//* 145  289:astore_1        
		{
			hm.c(throwable, "ofm", "uold");
	//  146  290:aload_1         
	//  147  291:ldc1            #168 <String "ofm">
	//  148  293:ldc1            #170 <String "uold">
	//  149  295:invokestatic    #175 <Method void hm.c(Throwable, String, String)>
		}
	//  150  298:return          
	}

	final Context a;

	jr$2(Context context)
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
