// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a.e;

import java.io.IOException;

// Referenced classes of package com.google.ads.interactivemedia.v3.a.e:
//			l

public static final class l$d extends IOException
{

	public l$d(Exception exception)
	{
		String s = String.valueOf(((Object) (((Object) (exception)).getClass().getSimpleName())));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #15  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #21  <Method String Class.getSimpleName()>
	//    3    7:invokestatic    #27  <Method String String.valueOf(Object)>
	//    4   10:astore_2        
		String s1 = String.valueOf(((Object) (exception.getMessage())));
	//    5   11:aload_1         
	//    6   12:invokevirtual   #32  <Method String Exception.getMessage()>
	//    7   15:invokestatic    #27  <Method String String.valueOf(Object)>
	//    8   18:astore_3        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 13 + String.valueOf(((Object) (s1))).length());
	//    9   19:new             #34  <Class StringBuilder>
	//   10   22:dup             
	//   11   23:aload_2         
	//   12   24:invokestatic    #27  <Method String String.valueOf(Object)>
	//   13   27:invokevirtual   #38  <Method int String.length()>
	//   14   30:bipush          13
	//   15   32:iadd            
	//   16   33:aload_3         
	//   17   34:invokestatic    #27  <Method String String.valueOf(Object)>
	//   18   37:invokevirtual   #38  <Method int String.length()>
	//   19   40:iadd            
	//   20   41:invokespecial   #41  <Method void StringBuilder(int)>
	//   21   44:astore          4
		stringbuilder.append("Unexpected ");
	//   22   46:aload           4
	//   23   48:ldc1            #43  <String "Unexpected ">
	//   24   50:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   25   53:pop             
		stringbuilder.append(s);
	//   26   54:aload           4
	//   27   56:aload_2         
	//   28   57:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   29   60:pop             
		stringbuilder.append(": ");
	//   30   61:aload           4
	//   31   63:ldc1            #49  <String ": ">
	//   32   65:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   33   68:pop             
		stringbuilder.append(s1);
	//   34   69:aload           4
	//   35   71:aload_3         
	//   36   72:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   37   75:pop             
		super(stringbuilder.toString(), ((Throwable) (exception)));
	//   38   76:aload_0         
	//   39   77:aload           4
	//   40   79:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   41   82:aload_1         
	//   42   83:invokespecial   #55  <Method void IOException(String, Throwable)>
	//   43   86:return          
	}
}
