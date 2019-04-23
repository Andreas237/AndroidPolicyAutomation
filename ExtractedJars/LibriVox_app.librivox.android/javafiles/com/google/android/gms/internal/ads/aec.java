// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bfq, bfm, bhc, bgd

final class aec
	implements bfq
{

	private aec()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public final bfm[] a()
	{
		return (new bfm[] {
			new bhc(), new bgd()
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       bfm[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:new             #22  <Class bhc>
	//    5    9:dup             
	//    6   10:invokespecial   #23  <Method void bhc()>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:new             #25  <Class bgd>
	//   11   19:dup             
	//   12   20:invokespecial   #26  <Method void bgd()>
	//   13   23:aastore         
	//   14   24:areturn         
	}

	static final bfq a = new aec();

	static 
	{
	//    0    0:new             #2   <Class aec>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void aec()>
	//    3    7:putstatic       #15  <Field bfq a>
	//*   4   10:return          
	}
}
