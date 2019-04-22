// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a.e;


// Referenced classes of package com.google.ads.interactivemedia.v3.a.e:
//			k, f

public static final class k$b extends k$a
{

	public final String c;

	public k$b(String s, f f)
	{
		String s1 = String.valueOf(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #17  <Method String String.valueOf(Object)>
	//    2    4:astore_3        
		if(s1.length() != 0)
	//*   3    5:aload_3         
	//*   4    6:invokevirtual   #21  <Method int String.length()>
	//*   5    9:ifeq            22
			s1 = "Invalid content type: ".concat(s1);
	//    6   12:ldc1            #23  <String "Invalid content type: ">
	//    7   14:aload_3         
	//    8   15:invokevirtual   #27  <Method String String.concat(String)>
	//    9   18:astore_3        
		else
	//*  10   19:goto            32
			s1 = new String("Invalid content type: ");
	//   11   22:new             #13  <Class String>
	//   12   25:dup             
	//   13   26:ldc1            #23  <String "Invalid content type: ">
	//   14   28:invokespecial   #30  <Method void String(String)>
	//   15   31:astore_3        
		super(s1, f, 1);
	//   16   32:aload_0         
	//   17   33:aload_3         
	//   18   34:aload_2         
	//   19   35:iconst_1        
	//   20   36:invokespecial   #33  <Method void k$a(String, f, int)>
		c = s;
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:putfield        #35  <Field String c>
	//   24   44:return          
	}
}
