// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class bna extends IOException
{

	public bna(Throwable throwable)
	{
		String s = ((Object) (throwable)).getClass().getSimpleName();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #12  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #18  <Method String Class.getSimpleName()>
	//    3    7:astore_2        
		String s1 = throwable.getMessage();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #23  <Method String Throwable.getMessage()>
	//    6   12:astore_3        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 13 + String.valueOf(((Object) (s1))).length());
	//    7   13:new             #25  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokestatic    #31  <Method String String.valueOf(Object)>
	//   11   21:invokevirtual   #35  <Method int String.length()>
	//   12   24:bipush          13
	//   13   26:iadd            
	//   14   27:aload_3         
	//   15   28:invokestatic    #31  <Method String String.valueOf(Object)>
	//   16   31:invokevirtual   #35  <Method int String.length()>
	//   17   34:iadd            
	//   18   35:invokespecial   #38  <Method void StringBuilder(int)>
	//   19   38:astore          4
		stringbuilder.append("Unexpected ");
	//   20   40:aload           4
	//   21   42:ldc1            #40  <String "Unexpected ">
	//   22   44:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
		stringbuilder.append(s);
	//   24   48:aload           4
	//   25   50:aload_2         
	//   26   51:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   27   54:pop             
		stringbuilder.append(": ");
	//   28   55:aload           4
	//   29   57:ldc1            #46  <String ": ">
	//   30   59:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   31   62:pop             
		stringbuilder.append(s1);
	//   32   63:aload           4
	//   33   65:aload_3         
	//   34   66:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   35   69:pop             
		super(stringbuilder.toString(), throwable);
	//   36   70:aload_0         
	//   37   71:aload           4
	//   38   73:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   39   76:aload_1         
	//   40   77:invokespecial   #52  <Method void IOException(String, Throwable)>
	//   41   80:return          
	}
}
