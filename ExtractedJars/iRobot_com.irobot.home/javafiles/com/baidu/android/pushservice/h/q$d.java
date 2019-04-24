// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.h;


// Referenced classes of package com.baidu.android.pushservice.h:
//			q

static final class q$d extends Enum
{

	public static q$d valueOf(String s)
	{
		return (q$d)Enum.valueOf(com/baidu/android/pushservice/h/q$d, s);
	//    0    0:ldc1            #2   <Class q$d>
	//    1    2:aload_0         
	//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class q$d>
	//    4    9:areturn         
	}

	public static q$d[] values()
	{
		return (q$d[])((q$d []) (f)).clone();
	//    0    0:getstatic       #43  <Field q$d[] f>
	//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.baidu.android.pushservice.h.q$d_3B_.clone()>
	//    2    6:checkcast       #54  <Class q$d[]>
	//    3    9:areturn         
	}

	public static final q$d a;
	public static final q$d b;
	public static final q$d c;
	public static final q$d d;
	public static final q$d e;
	private static final q$d f[];

	static 
	{
		a = new q$d("verifId", 0);
	//    0    0:new             #2   <Class q$d>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "verifId">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void q$d(String, int)>
	//    5   10:putstatic       #25  <Field q$d a>
		b = new q$d("msgId", 1);
	//    6   13:new             #2   <Class q$d>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "msgId">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void q$d(String, int)>
	//   11   23:putstatic       #29  <Field q$d b>
		c = new q$d("md5Infos", 2);
	//   12   26:new             #2   <Class q$d>
	//   13   29:dup             
	//   14   30:ldc1            #31  <String "md5Infos">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void q$d(String, int)>
	//   17   36:putstatic       #33  <Field q$d c>
		d = new q$d("appId", 3);
	//   18   39:new             #2   <Class q$d>
	//   19   42:dup             
	//   20   43:ldc1            #35  <String "appId">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void q$d(String, int)>
	//   23   49:putstatic       #37  <Field q$d d>
		e = new q$d("time", 4);
	//   24   52:new             #2   <Class q$d>
	//   25   55:dup             
	//   26   56:ldc1            #39  <String "time">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void q$d(String, int)>
	//   29   62:putstatic       #41  <Field q$d e>
		f = (new q$d[] {
			a, b, c, d, e
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       q$d[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #25  <Field q$d a>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #29  <Field q$d b>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #33  <Field q$d c>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #37  <Field q$d d>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #41  <Field q$d e>
	//   51   98:aastore         
	//   52   99:putstatic       #43  <Field q$d[] f>
	//*  53  102:return          
	}

	private q$d(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #45  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
