// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class ark extends IOException
{

	ark()
	{
		super("CodedOutputStream was writing to a flat byte array and ran out of space.");
	//    0    0:aload_0         
	//    1    1:ldc1            #8   <String "CodedOutputStream was writing to a flat byte array and ran out of space.">
	//    2    3:invokespecial   #11  <Method void IOException(String)>
	//    3    6:return          
	}

	ark(String s)
	{
		String s1 = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
	//    0    0:ldc1            #14  <String "CodedOutputStream was writing to a flat byte array and ran out of space.: ">
	//    1    2:invokestatic    #20  <Method String String.valueOf(Object)>
	//    2    5:astore_2        
		s = String.valueOf(((Object) (s)));
	//    3    6:aload_1         
	//    4    7:invokestatic    #20  <Method String String.valueOf(Object)>
	//    5   10:astore_1        
		if(s.length() != 0)
	//*   6   11:aload_1         
	//*   7   12:invokevirtual   #24  <Method int String.length()>
	//*   8   15:ifeq            27
			s = s1.concat(s);
	//    9   18:aload_2         
	//   10   19:aload_1         
	//   11   20:invokevirtual   #28  <Method String String.concat(String)>
	//   12   23:astore_1        
		else
	//*  13   24:goto            36
			s = new String(s1);
	//   14   27:new             #16  <Class String>
	//   15   30:dup             
	//   16   31:aload_2         
	//   17   32:invokespecial   #29  <Method void String(String)>
	//   18   35:astore_1        
		super(s);
	//   19   36:aload_0         
	//   20   37:aload_1         
	//   21   38:invokespecial   #11  <Method void IOException(String)>
	//   22   41:return          
	}

	ark(String s, Throwable throwable)
	{
		String s1 = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
	//    0    0:ldc1            #14  <String "CodedOutputStream was writing to a flat byte array and ran out of space.: ">
	//    1    2:invokestatic    #20  <Method String String.valueOf(Object)>
	//    2    5:astore_3        
		s = String.valueOf(((Object) (s)));
	//    3    6:aload_1         
	//    4    7:invokestatic    #20  <Method String String.valueOf(Object)>
	//    5   10:astore_1        
		if(s.length() != 0)
	//*   6   11:aload_1         
	//*   7   12:invokevirtual   #24  <Method int String.length()>
	//*   8   15:ifeq            27
			s = s1.concat(s);
	//    9   18:aload_3         
	//   10   19:aload_1         
	//   11   20:invokevirtual   #28  <Method String String.concat(String)>
	//   12   23:astore_1        
		else
	//*  13   24:goto            36
			s = new String(s1);
	//   14   27:new             #16  <Class String>
	//   15   30:dup             
	//   16   31:aload_3         
	//   17   32:invokespecial   #29  <Method void String(String)>
	//   18   35:astore_1        
		super(s, throwable);
	//   19   36:aload_0         
	//   20   37:aload_1         
	//   21   38:aload_2         
	//   22   39:invokespecial   #32  <Method void IOException(String, Throwable)>
	//   23   42:return          
	}

	ark(Throwable throwable)
	{
		super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable);
	//    0    0:aload_0         
	//    1    1:ldc1            #8   <String "CodedOutputStream was writing to a flat byte array and ran out of space.">
	//    2    3:aload_1         
	//    3    4:invokespecial   #32  <Method void IOException(String, Throwable)>
	//    4    7:return          
	}
}
