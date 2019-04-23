// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ato, arx, arh

public final class atn
{

	static int a(ato ato1, Object obj, Object obj1)
	{
		return arx.a(ato1.a, 1, obj) + arx.a(ato1.c, 2, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #11  <Field avz ato.a>
	//    2    4:iconst_1        
	//    3    5:aload_1         
	//    4    6:invokestatic    #16  <Method int arx.a(avz, int, Object)>
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field avz ato.c>
	//    7   13:iconst_2        
	//    8   14:aload_2         
	//    9   15:invokestatic    #16  <Method int arx.a(avz, int, Object)>
	//   10   18:iadd            
	//   11   19:ireturn         
	}

	static void a(arh arh, ato ato1, Object obj, Object obj1)
	{
		arx.a(arh, ato1.a, 1, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #11  <Field avz ato.a>
	//    3    5:iconst_1        
	//    4    6:aload_2         
	//    5    7:invokestatic    #24  <Method void arx.a(arh, avz, int, Object)>
		arx.a(arh, ato1.c, 2, obj1);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getfield        #19  <Field avz ato.c>
	//    9   15:iconst_2        
	//   10   16:aload_3         
	//   11   17:invokestatic    #24  <Method void arx.a(arh, avz, int, Object)>
	//   12   20:return          
	}
}
