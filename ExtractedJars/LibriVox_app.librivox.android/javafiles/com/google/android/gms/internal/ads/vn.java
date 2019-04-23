// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			p, bwk, m, wx

public final class vn
{

	public static void a(String s)
	{
		e e = p.bU;
	//    0    0:getstatic       #13  <Field e p.bU>
	//    1    3:astore_1        
		if(((Boolean)bwk.e().a(e)).booleanValue())
	//*   2    4:invokestatic    #19  <Method m bwk.e()>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #24  <Method Object m.a(e)>
	//*   5   11:checkcast       #26  <Class Boolean>
	//*   6   14:invokevirtual   #30  <Method boolean Boolean.booleanValue()>
	//*   7   17:ifeq            24
			wx.b(s);
	//    8   20:aload_0         
	//    9   21:invokestatic    #35  <Method void wx.b(String)>
	//   10   24:return          
	}

	public static boolean a()
	{
		e e = p.bU;
	//    0    0:getstatic       #13  <Field e p.bU>
	//    1    3:astore_0        
		return ((Boolean)bwk.e().a(e)).booleanValue();
	//    2    4:invokestatic    #19  <Method m bwk.e()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #24  <Method Object m.a(e)>
	//    5   11:checkcast       #26  <Class Boolean>
	//    6   14:invokevirtual   #30  <Method boolean Boolean.booleanValue()>
	//    7   17:ireturn         
	}
}
