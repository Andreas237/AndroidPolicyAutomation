// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class blr
{

	public blr(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field String a>
		b = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #16  <Field String b>
	//    8   14:return          
	}

	public final String toString()
	{
		String s = a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field String a>
	//    2    4:astore_1        
		String s1 = b;
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field String b>
	//    5    9:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 2 + String.valueOf(((Object) (s1))).length());
	//    6   10:new             #21  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokestatic    #27  <Method String String.valueOf(Object)>
	//   10   18:invokevirtual   #31  <Method int String.length()>
	//   11   21:iconst_2        
	//   12   22:iadd            
	//   13   23:aload_2         
	//   14   24:invokestatic    #27  <Method String String.valueOf(Object)>
	//   15   27:invokevirtual   #31  <Method int String.length()>
	//   16   30:iadd            
	//   17   31:invokespecial   #34  <Method void StringBuilder(int)>
	//   18   34:astore_3        
		stringbuilder.append(s);
	//   19   35:aload_3         
	//   20   36:aload_1         
	//   21   37:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
		stringbuilder.append(", ");
	//   23   41:aload_3         
	//   24   42:ldc1            #40  <String ", ">
	//   25   44:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   26   47:pop             
		stringbuilder.append(s1);
	//   27   48:aload_3         
	//   28   49:aload_2         
	//   29   50:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   30   53:pop             
		return stringbuilder.toString();
	//   31   54:aload_3         
	//   32   55:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   33   58:areturn         
	}

	public final String a;
	public final String b;
}
