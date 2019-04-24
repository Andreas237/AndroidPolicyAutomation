// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.support.v7.*;

// Referenced classes of package com.truenet.android:
//			b

public static final class b$a
{

	public static final boolean a(b$a b$a1, String s)
	{
		return b$a1.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method boolean a(String)>
	//    3    5:ireturn         
	}

	private final boolean a(String s)
	{
		if(!bb.a(s, "http://play.google.com", false, 2, ((Object) (null))) && !bb.a(s, "https://play.google.com", false, 2, ((Object) (null))) && !bb.a(s, "http://itunes.apple.com", false, 2, ((Object) (null))) && !bb.a(s, "https://itunes.apple.com", false, 2, ((Object) (null))))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #22  <String "http://play.google.com">
	//*   2    3:iconst_0        
	//*   3    4:iconst_2        
	//*   4    5:aconst_null     
	//*   5    6:invokestatic    #27  <Method boolean bb.a(String, String, boolean, int, Object)>
	//*   6    9:ifeq            14
	//*   7   12:iconst_1        
	//*   8   13:ireturn         
	//*   9   14:aload_1         
	//*  10   15:ldc1            #29  <String "https://play.google.com">
	//*  11   17:iconst_0        
	//*  12   18:iconst_2        
	//*  13   19:aconst_null     
	//*  14   20:invokestatic    #27  <Method boolean bb.a(String, String, boolean, int, Object)>
	//*  15   23:ifne            12
	//*  16   26:aload_1         
	//*  17   27:ldc1            #31  <String "http://itunes.apple.com">
	//*  18   29:iconst_0        
	//*  19   30:iconst_2        
	//*  20   31:aconst_null     
	//*  21   32:invokestatic    #27  <Method boolean bb.a(String, String, boolean, int, Object)>
	//*  22   35:ifne            12
	//*  23   38:aload_1         
	//*  24   39:ldc1            #33  <String "https://itunes.apple.com">
	//*  25   41:iconst_0        
	//*  26   42:iconst_2        
	//*  27   43:aconst_null     
	//*  28   44:invokestatic    #27  <Method boolean bb.a(String, String, boolean, int, Object)>
	//*  29   47:ifne            12
		{
			if(bb.a(s, "http://", false, 2, ((Object) (null))))
	//*  30   50:aload_1         
	//*  31   51:ldc1            #35  <String "http://">
	//*  32   53:iconst_0        
	//*  33   54:iconst_2        
	//*  34   55:aconst_null     
	//*  35   56:invokestatic    #27  <Method boolean bb.a(String, String, boolean, int, Object)>
	//*  36   59:ifeq            64
				return false;
	//   37   62:iconst_0        
	//   38   63:ireturn         
			if(bb.a(s, "https://", false, 2, ((Object) (null))))
	//*  39   64:aload_1         
	//*  40   65:ldc1            #37  <String "https://">
	//*  41   67:iconst_0        
	//*  42   68:iconst_2        
	//*  43   69:aconst_null     
	//*  44   70:invokestatic    #27  <Method boolean bb.a(String, String, boolean, int, Object)>
	//*  45   73:ifeq            78
				return false;
	//   46   76:iconst_0        
	//   47   77:ireturn         
			if(!a().a((CharSequence)s))
	//*  48   78:aload_0         
	//*  49   79:checkcast       #2   <Class b$a>
	//*  50   82:invokevirtual   #40  <Method ba a()>
	//*  51   85:aload_1         
	//*  52   86:checkcast       #42  <Class CharSequence>
	//*  53   89:invokevirtual   #47  <Method boolean ba.a(CharSequence)>
	//*  54   92:ifne            12
				return false;
	//   55   95:iconst_0        
	//   56   96:ireturn         
		}
		return true;
	}

	public final ba a()
	{
		return b.h();
	//    0    0:invokestatic    #50  <Method ba b.h()>
	//    1    3:areturn         
	}

	private b$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public b$a(ab ab)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void b$a()>
	//    2    4:return          
	}
}
