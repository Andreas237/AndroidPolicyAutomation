// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbav

public static final class zzbav$zzb extends IOException
{

	zzbav$zzb()
	{
		super("CodedOutputStream was writing to a flat byte array and ran out of space.");
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "CodedOutputStream was writing to a flat byte array and ran out of space.">
	//    2    3:invokespecial   #14  <Method void IOException(String)>
	//    3    6:return          
	}

	zzbav$zzb(String s, Throwable throwable)
	{
		String s1 = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
	//    0    0:ldc1            #18  <String "CodedOutputStream was writing to a flat byte array and ran out of space.: ">
	//    1    2:invokestatic    #24  <Method String String.valueOf(Object)>
	//    2    5:astore_3        
		s = String.valueOf(((Object) (s)));
	//    3    6:aload_1         
	//    4    7:invokestatic    #24  <Method String String.valueOf(Object)>
	//    5   10:astore_1        
		if(s.length() != 0)
	//*   6   11:aload_1         
	//*   7   12:invokevirtual   #28  <Method int String.length()>
	//*   8   15:ifeq            27
			s = s1.concat(s);
	//    9   18:aload_3         
	//   10   19:aload_1         
	//   11   20:invokevirtual   #32  <Method String String.concat(String)>
	//   12   23:astore_1        
		else
	//*  13   24:goto            36
			s = new String(s1);
	//   14   27:new             #20  <Class String>
	//   15   30:dup             
	//   16   31:aload_3         
	//   17   32:invokespecial   #33  <Method void String(String)>
	//   18   35:astore_1        
		super(s, throwable);
	//   19   36:aload_0         
	//   20   37:aload_1         
	//   21   38:aload_2         
	//   22   39:invokespecial   #35  <Method void IOException(String, Throwable)>
	//   23   42:return          
	}

	zzbav$zzb(Throwable throwable)
	{
		super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable);
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "CodedOutputStream was writing to a flat byte array and ran out of space.">
	//    2    3:aload_1         
	//    3    4:invokespecial   #35  <Method void IOException(String, Throwable)>
	//    4    7:return          
	}
}
