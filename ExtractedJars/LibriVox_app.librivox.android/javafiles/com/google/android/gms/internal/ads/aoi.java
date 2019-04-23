// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asp, aoj, asq

public final class aoi extends Enum
	implements asp
{

	private aoi(String s, int j, int k)
	{
		super(s, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #61  <Method void Enum(String, int)>
		h = k;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #63  <Field int h>
	//    7   11:return          
	}

	public static aoi a(int j)
	{
		switch(j)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 4: default 36
	//	               0 54
	//	               1 50
	//	               2 46
	//	               3 42
	//	               4 38
		default:
			return null;
	//    2   36:aconst_null     
	//    3   37:areturn         

		case 4: // '\004'
			return e;
	//    4   38:getstatic       #45  <Field aoi e>
	//    5   41:areturn         

		case 3: // '\003'
			return d;
	//    6   42:getstatic       #41  <Field aoi d>
	//    7   45:areturn         

		case 2: // '\002'
			return c;
	//    8   46:getstatic       #37  <Field aoi c>
	//    9   49:areturn         

		case 1: // '\001'
			return b;
	//   10   50:getstatic       #33  <Field aoi b>
	//   11   53:areturn         

		case 0: // '\0'
			return a;
	//   12   54:getstatic       #29  <Field aoi a>
	//   13   57:areturn         
		}
	}

	public static aoi[] values()
	{
		return (aoi[])((aoi []) (i)).clone();
	//    0    0:getstatic       #51  <Field aoi[] i>
	//    1    3:invokevirtual   #71  <Method Object _5B_Lcom.google.android.gms.internal.ads.aoi_3B_.clone()>
	//    2    6:checkcast       #67  <Class aoi[]>
	//    3    9:areturn         
	}

	public final int a()
	{
		if(this != f)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #49  <Field aoi f>
	//*   2    4:if_acmpeq       12
			return h;
	//    3    7:aload_0         
	//    4    8:getfield        #63  <Field int h>
	//    5   11:ireturn         
		else
			throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
	//    6   12:new             #74  <Class IllegalArgumentException>
	//    7   15:dup             
	//    8   16:ldc1            #76  <String "Can't get the number of an unknown enum value.">
	//    9   18:invokespecial   #79  <Method void IllegalArgumentException(String)>
	//   10   21:athrow          
	}

	public static final aoi a;
	public static final aoi b;
	public static final aoi c;
	public static final aoi d;
	public static final aoi e;
	public static final aoi f;
	private static final asq g = new aoj();
	private static final aoi i[];
	private final int h;

	static 
	{
		a = new aoi("UNKNOWN_PREFIX", 0, 0);
	//    0    0:new             #2   <Class aoi>
	//    1    3:dup             
	//    2    4:ldc1            #23  <String "UNKNOWN_PREFIX">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #27  <Method void aoi(String, int, int)>
	//    6   11:putstatic       #29  <Field aoi a>
		b = new aoi("TINK", 1, 1);
	//    7   14:new             #2   <Class aoi>
	//    8   17:dup             
	//    9   18:ldc1            #31  <String "TINK">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #27  <Method void aoi(String, int, int)>
	//   13   25:putstatic       #33  <Field aoi b>
		c = new aoi("LEGACY", 2, 2);
	//   14   28:new             #2   <Class aoi>
	//   15   31:dup             
	//   16   32:ldc1            #35  <String "LEGACY">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #27  <Method void aoi(String, int, int)>
	//   20   39:putstatic       #37  <Field aoi c>
		d = new aoi("RAW", 3, 3);
	//   21   42:new             #2   <Class aoi>
	//   22   45:dup             
	//   23   46:ldc1            #39  <String "RAW">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #27  <Method void aoi(String, int, int)>
	//   27   53:putstatic       #41  <Field aoi d>
		e = new aoi("CRUNCHY", 4, 4);
	//   28   56:new             #2   <Class aoi>
	//   29   59:dup             
	//   30   60:ldc1            #43  <String "CRUNCHY">
	//   31   62:iconst_4        
	//   32   63:iconst_4        
	//   33   64:invokespecial   #27  <Method void aoi(String, int, int)>
	//   34   67:putstatic       #45  <Field aoi e>
		f = new aoi("UNRECOGNIZED", 5, -1);
	//   35   70:new             #2   <Class aoi>
	//   36   73:dup             
	//   37   74:ldc1            #47  <String "UNRECOGNIZED">
	//   38   76:iconst_5        
	//   39   77:iconst_m1       
	//   40   78:invokespecial   #27  <Method void aoi(String, int, int)>
	//   41   81:putstatic       #49  <Field aoi f>
		i = (new aoi[] {
			a, b, c, d, e, f
		});
	//   42   84:bipush          6
	//   43   86:anewarray       aoi[]
	//   44   89:dup             
	//   45   90:iconst_0        
	//   46   91:getstatic       #29  <Field aoi a>
	//   47   94:aastore         
	//   48   95:dup             
	//   49   96:iconst_1        
	//   50   97:getstatic       #33  <Field aoi b>
	//   51  100:aastore         
	//   52  101:dup             
	//   53  102:iconst_2        
	//   54  103:getstatic       #37  <Field aoi c>
	//   55  106:aastore         
	//   56  107:dup             
	//   57  108:iconst_3        
	//   58  109:getstatic       #41  <Field aoi d>
	//   59  112:aastore         
	//   60  113:dup             
	//   61  114:iconst_4        
	//   62  115:getstatic       #45  <Field aoi e>
	//   63  118:aastore         
	//   64  119:dup             
	//   65  120:iconst_5        
	//   66  121:getstatic       #49  <Field aoi f>
	//   67  124:aastore         
	//   68  125:putstatic       #51  <Field aoi[] i>
	//   69  128:new             #53  <Class aoj>
	//   70  131:dup             
	//   71  132:invokespecial   #55  <Method void aoj()>
	//   72  135:putstatic       #57  <Field asq g>
	//*  73  138:return          
	}
}
