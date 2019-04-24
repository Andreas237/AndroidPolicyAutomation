// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;

// Referenced classes of package com.amap.api.mapcore.util:
//			jr, ju, hk, jn, 
//			hc, he, hg, jq, 
//			jo, hm

static final class jr$1
	implements Runnable
{

	public void run()
	{
		com/amap/api/mapcore/util/jr;
	//    0    0:ldc1            #8   <Class jr>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		String s = Long.toString(System.currentTimeMillis());
	//    2    3:invokestatic    #33  <Method long System.currentTimeMillis()>
	//    3    6:invokestatic    #39  <Method String Long.toString(long)>
	//    4    9:astore_1        
		jn jn1 = ju.a(jr.a());
	//    5   10:invokestatic    #42  <Method java.lang.ref.WeakReference jr.a()>
	//    6   13:invokestatic    #47  <Method jn ju.a(java.lang.ref.WeakReference)>
	//    7   16:astore_2        
		ju.a(a, jn1, hk.i, jr.a, 0x200000, "6");
	//    8   17:aload_0         
	//    9   18:getfield        #18  <Field Context a>
	//   10   21:aload_2         
	//   11   22:getstatic       #53  <Field String hk.i>
	//   12   25:getstatic       #56  <Field int jr.a>
	//   13   28:ldc1            #57  <Int 0x200000>
	//   14   30:ldc1            #59  <String "6">
	//   15   32:invokestatic    #62  <Method void ju.a(Context, jn, String, int, int, String)>
		if(jn1.e == null)
	//*  16   35:aload_2         
	//*  17   36:getfield        #68  <Field hd jn.e>
	//*  18   39:ifnonnull       74
			jn1.e = ((hd) (new hc(((hd) (new he(((hd) (new hg(((hd) (new he())))))))))));
	//   19   42:aload_2         
	//   20   43:new             #70  <Class hc>
	//   21   46:dup             
	//   22   47:new             #72  <Class he>
	//   23   50:dup             
	//   24   51:new             #74  <Class hg>
	//   25   54:dup             
	//   26   55:new             #72  <Class he>
	//   27   58:dup             
	//   28   59:invokespecial   #75  <Method void he()>
	//   29   62:invokespecial   #78  <Method void hg(hd)>
	//   30   65:invokespecial   #79  <Method void he(hd)>
	//   31   68:invokespecial   #80  <Method void hc(hd)>
	//   32   71:putfield        #68  <Field hd jn.e>
		jo.a(s, b.a(), jn1);
	//   33   74:aload_1         
	//   34   75:aload_0         
	//   35   76:getfield        #20  <Field jq b>
	//   36   79:invokevirtual   #85  <Method byte[] jq.a()>
	//   37   82:aload_2         
	//   38   83:invokestatic    #90  <Method void jo.a(String, byte[], jn)>
		com/amap/api/mapcore/util/jr;
	//   39   86:ldc1            #8   <Class jr>
		JVM INSTR monitorexit ;
	//   40   88:monitorexit     
		  goto _L1
	//*  41   89:goto            98
		Object obj;
		obj;
	//   42   92:astore_1        
	//*  43   93:ldc1            #8   <Class jr>
		throw obj;
	//   44   95:monitorexit     
	//   45   96:aload_1         
	//   46   97:athrow          
_L1:
		return;
	//   47   98:return          
		obj;
	//   48   99:astore_1        
		hm.c(((Throwable) (obj)), "ofm", "aple");
	//   49  100:aload_1         
	//   50  101:ldc1            #92  <String "ofm">
	//   51  103:ldc1            #94  <String "aple">
	//   52  105:invokestatic    #100 <Method void hm.c(Throwable, String, String)>
		return;
	//   53  108:return          
	}

	final Context a;
	final jq b;

	jr$1(Context context, jq jq1)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Context a>
		b = jq1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field jq b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
