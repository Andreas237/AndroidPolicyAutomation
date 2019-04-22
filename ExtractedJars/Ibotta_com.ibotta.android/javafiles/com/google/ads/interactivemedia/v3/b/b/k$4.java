// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b;


// Referenced classes of package com.google.ads.interactivemedia.v3.b.b:
//			k

static final class k$4 extends k
{

	public Object a(Class class1)
	{
		class1 = ((Class) (String.valueOf(((Object) (class1)))));
	//    0    0:aload_1         
	//    1    1:invokestatic    #19  <Method String String.valueOf(Object)>
	//    2    4:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (class1))).length() + 16);
	//    3    5:new             #21  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokestatic    #19  <Method String String.valueOf(Object)>
	//    7   13:invokevirtual   #25  <Method int String.length()>
	//    8   16:bipush          16
	//    9   18:iadd            
	//   10   19:invokespecial   #28  <Method void StringBuilder(int)>
	//   11   22:astore_2        
		stringbuilder.append("Cannot allocate ");
	//   12   23:aload_2         
	//   13   24:ldc1            #30  <String "Cannot allocate ">
	//   14   26:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		stringbuilder.append(((String) (class1)));
	//   16   30:aload_2         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
		throw new UnsupportedOperationException(stringbuilder.toString());
	//   20   36:new             #36  <Class UnsupportedOperationException>
	//   21   39:dup             
	//   22   40:aload_2         
	//   23   41:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   24   44:invokespecial   #43  <Method void UnsupportedOperationException(String)>
	//   25   47:athrow          
	}

	k$4()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void k()>
	//    2    4:return          
	}
}
