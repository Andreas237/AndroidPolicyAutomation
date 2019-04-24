// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;

// Referenced classes of package com.amap.api.mapcore.util:
//			jt, ju, hk, jn, 
//			jv, jz, jw, ka, 
//			kc, kg, kd, ki, 
//			jo, hm

static final class jt$2
	implements Runnable
{

	public void run()
	{
		try
		{
			jn jn1 = ju.a(jt.a());
	//    0    0:invokestatic    #25  <Method java.lang.ref.WeakReference jt.a()>
	//    1    3:invokestatic    #30  <Method jn ju.a(java.lang.ref.WeakReference)>
	//    2    6:astore_1        
			ju.a(a, jn1, hk.h, 1000, 0x4b000, "2");
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field Context a>
	//    5   11:aload_1         
	//    6   12:getstatic       #36  <Field String hk.h>
	//    7   15:sipush          1000
	//    8   18:ldc1            #37  <Int 0x4b000>
	//    9   20:ldc1            #39  <String "2">
	//   10   22:invokestatic    #42  <Method void ju.a(Context, jn, String, int, int, String)>
			if(jn1.g == null)
	//*  11   25:aload_1         
	//*  12   26:getfield        #48  <Field kb jn.g>
	//*  13   29:ifnonnull       75
				jn1.g = ((kb) (new jv(((kb) (new jz(a, ((kb) (new jw(((kb) (new ka(((kb) (new kc()))))))))))))));
	//   14   32:aload_1         
	//   15   33:new             #50  <Class jv>
	//   16   36:dup             
	//   17   37:new             #52  <Class jz>
	//   18   40:dup             
	//   19   41:aload_0         
	//   20   42:getfield        #15  <Field Context a>
	//   21   45:new             #54  <Class jw>
	//   22   48:dup             
	//   23   49:new             #56  <Class ka>
	//   24   52:dup             
	//   25   53:new             #58  <Class kc>
	//   26   56:dup             
	//   27   57:invokespecial   #59  <Method void kc()>
	//   28   60:invokespecial   #62  <Method void ka(kb)>
	//   29   63:invokespecial   #63  <Method void jw(kb)>
	//   30   66:invokespecial   #66  <Method void jz(Context, kb)>
	//   31   69:invokespecial   #67  <Method void jv(kb)>
	//   32   72:putfield        #48  <Field kb jn.g>
			jn1.h = 0x36ee80;
	//   33   75:aload_1         
	//   34   76:ldc1            #68  <Int 0x36ee80>
	//   35   78:putfield        #71  <Field int jn.h>
			if(TextUtils.isEmpty(((CharSequence) (jn1.i))))
	//*  36   81:aload_1         
	//*  37   82:getfield        #74  <Field String jn.i>
	//*  38   85:invokestatic    #80  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  39   88:ifeq            97
				jn1.i = "cKey";
	//   40   91:aload_1         
	//   41   92:ldc1            #82  <String "cKey">
	//   42   94:putfield        #74  <Field String jn.i>
			if(jn1.f == null)
	//*  43   97:aload_1         
	//*  44   98:getfield        #86  <Field kh jn.f>
	//*  45  101:ifnonnull       152
				jn1.f = ((kh) (new kg(a, jn1.h, jn1.i, ((kh) (new kd(30, jn1.a, ((kh) (new ki(a, false)))))))));
	//   46  104:aload_1         
	//   47  105:new             #88  <Class kg>
	//   48  108:dup             
	//   49  109:aload_0         
	//   50  110:getfield        #15  <Field Context a>
	//   51  113:aload_1         
	//   52  114:getfield        #71  <Field int jn.h>
	//   53  117:aload_1         
	//   54  118:getfield        #74  <Field String jn.i>
	//   55  121:new             #90  <Class kd>
	//   56  124:dup             
	//   57  125:bipush          30
	//   58  127:aload_1         
	//   59  128:getfield        #92  <Field String jn.a>
	//   60  131:new             #94  <Class ki>
	//   61  134:dup             
	//   62  135:aload_0         
	//   63  136:getfield        #15  <Field Context a>
	//   64  139:iconst_0        
	//   65  140:invokespecial   #97  <Method void ki(Context, boolean)>
	//   66  143:invokespecial   #100 <Method void kd(int, String, kh)>
	//   67  146:invokespecial   #103 <Method void kg(Context, int, String, kh)>
	//   68  149:putfield        #86  <Field kh jn.f>
			jo.a(jn1);
	//   69  152:aload_1         
	//   70  153:invokestatic    #108 <Method void jo.a(jn)>
			return;
	//   71  156:return          
		}
		catch(Throwable throwable)
	//*  72  157:astore_1        
		{
			hm.c(throwable, "stm", "usd");
	//   73  158:aload_1         
	//   74  159:ldc1            #110 <String "stm">
	//   75  161:ldc1            #112 <String "usd">
	//   76  163:invokestatic    #118 <Method void hm.c(Throwable, String, String)>
		}
	//   77  166:return          
	}

	final Context a;

	jt$2(Context context)
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
