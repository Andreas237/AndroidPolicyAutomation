// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk;


// Referenced classes of package com.paypal.android.sdk:
//			by, cg, cj, ca, 
//			ab

public abstract class ef extends by
{

	public ef(cj cj, ca ca, ab ab, String s)
	{
		cj = ((cj) (new cg(cj)));
	//    0    0:new             #8   <Class cg>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #11  <Method void cg(cj)>
	//    4    8:astore_1        
		StringBuilder stringbuilder = new StringBuilder("Bearer ");
	//    5    9:new             #13  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:ldc1            #15  <String "Bearer ">
	//    8   15:invokespecial   #18  <Method void StringBuilder(String)>
	//    9   18:astore          5
		stringbuilder.append(s);
	//   10   20:aload           5
	//   11   22:aload           4
	//   12   24:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		super(((bx) (cj)), ca, ab, stringbuilder.toString());
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:aload_3         
	//   18   32:aload           5
	//   19   34:invokevirtual   #26  <Method String StringBuilder.toString()>
	//   20   37:invokespecial   #29  <Method void by(bx, ca, ab, String)>
		a("Content-Type", "application/json");
	//   21   40:aload_0         
	//   22   41:ldc1            #31  <String "Content-Type">
	//   23   43:ldc1            #33  <String "application/json">
	//   24   45:invokevirtual   #37  <Method void a(String, String)>
		a("Accept", "application/json");
	//   25   48:aload_0         
	//   26   49:ldc1            #39  <String "Accept">
	//   27   51:ldc1            #33  <String "application/json">
	//   28   53:invokevirtual   #37  <Method void a(String, String)>
	//   29   56:return          
	}
}
