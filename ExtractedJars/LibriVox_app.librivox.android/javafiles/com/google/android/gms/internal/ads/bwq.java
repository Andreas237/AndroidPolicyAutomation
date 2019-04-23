// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			azi, de

public final class bwq
{

	private bwq(de de)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		d = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #19  <Field boolean d>
		a = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #21  <Field Object a>
		b = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #23  <Field azi b>
		c = de;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #25  <Field de c>
	//   14   24:return          
	}

	private bwq(Object obj, azi azi)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		d = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #19  <Field boolean d>
		a = obj;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #21  <Field Object a>
		b = azi;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #23  <Field azi b>
		c = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #25  <Field de c>
	//   14   24:return          
	}

	public static bwq a(de de)
	{
		return new bwq(de);
	//    0    0:new             #2   <Class bwq>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #30  <Method void bwq(de)>
	//    4    8:areturn         
	}

	public static bwq a(Object obj, azi azi)
	{
		return new bwq(obj, azi);
	//    0    0:new             #2   <Class bwq>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #33  <Method void bwq(Object, azi)>
	//    5    9:areturn         
	}

	public final Object a;
	public final azi b;
	public final de c;
	public boolean d;
}
