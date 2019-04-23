// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			vx, ade, aef, afg, 
//			abc

final class aek extends vx
{

	aek()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void vx()>
	//    2    4:return          
	}

	public final abc a(String s, byte abyte0[], String s1)
	{
		if("moov".equals(((Object) (s))))
	//*   0    0:ldc1            #19  <String "moov">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #25  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            17
			return ((abc) (new ade()));
	//    4    9:new             #27  <Class ade>
	//    5   12:dup             
	//    6   13:invokespecial   #28  <Method void ade()>
	//    7   16:areturn         
		if("mvhd".equals(((Object) (s))))
	//*   8   17:ldc1            #30  <String "mvhd">
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #25  <Method boolean String.equals(Object)>
	//*  11   23:ifeq            34
			return ((abc) (new aef()));
	//   12   26:new             #32  <Class aef>
	//   13   29:dup             
	//   14   30:invokespecial   #33  <Method void aef()>
	//   15   33:areturn         
		else
			return ((abc) (new afg(s)));
	//   16   34:new             #35  <Class afg>
	//   17   37:dup             
	//   18   38:aload_1         
	//   19   39:invokespecial   #38  <Method void afg(String)>
	//   20   42:areturn         
	}

	static final aek a = new aek();

	static 
	{
	//    0    0:new             #2   <Class aek>
	//    1    3:dup             
	//    2    4:invokespecial   #12  <Method void aek()>
	//    3    7:putstatic       #14  <Field aek a>
	//*   4   10:return          
	}
}
