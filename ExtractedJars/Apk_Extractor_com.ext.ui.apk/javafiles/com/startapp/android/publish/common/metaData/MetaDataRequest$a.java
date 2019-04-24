// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.common.metaData;


// Referenced classes of package com.startapp.android.publish.common.metaData:
//			MetaDataRequest

public static final class MetaDataRequest$a extends Enum
{

	public static MetaDataRequest$a valueOf(String s)
	{
		return (MetaDataRequest$a)Enum.valueOf(com/startapp/android/publish/common/metaData/MetaDataRequest$a, s);
	//    0    0:ldc1            #2   <Class MetaDataRequest$a>
	//    1    2:aload_0         
	//    2    3:invokestatic    #63  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class MetaDataRequest$a>
	//    4    9:areturn         
	}

	public static MetaDataRequest$a[] values()
	{
		return (MetaDataRequest$a[])((MetaDataRequest$a []) (g)).clone();
	//    0    0:getstatic       #50  <Field MetaDataRequest$a[] g>
	//    1    3:invokevirtual   #70  <Method Object _5B_Lcom.startapp.android.publish.common.metaData.MetaDataRequest$a_3B_.clone()>
	//    2    6:checkcast       #66  <Class MetaDataRequest$a[]>
	//    3    9:areturn         
	}

	public static final MetaDataRequest$a a;
	public static final MetaDataRequest$a b;
	public static final MetaDataRequest$a c;
	public static final MetaDataRequest$a d;
	public static final MetaDataRequest$a e;
	public static final MetaDataRequest$a f;
	private static final MetaDataRequest$a g[];
	private int index;

	static 
	{
		a = new MetaDataRequest$a("LAUNCH", 0, 1);
	//    0    0:new             #2   <Class MetaDataRequest$a>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "LAUNCH">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:invokespecial   #26  <Method void MetaDataRequest$a(String, int, int)>
	//    6   11:putstatic       #28  <Field MetaDataRequest$a a>
		b = new MetaDataRequest$a("APP_IDLE", 1, 2);
	//    7   14:new             #2   <Class MetaDataRequest$a>
	//    8   17:dup             
	//    9   18:ldc1            #30  <String "APP_IDLE">
	//   10   20:iconst_1        
	//   11   21:iconst_2        
	//   12   22:invokespecial   #26  <Method void MetaDataRequest$a(String, int, int)>
	//   13   25:putstatic       #32  <Field MetaDataRequest$a b>
		c = new MetaDataRequest$a("IN_APP_PURCHASE", 2, 3);
	//   14   28:new             #2   <Class MetaDataRequest$a>
	//   15   31:dup             
	//   16   32:ldc1            #34  <String "IN_APP_PURCHASE">
	//   17   34:iconst_2        
	//   18   35:iconst_3        
	//   19   36:invokespecial   #26  <Method void MetaDataRequest$a(String, int, int)>
	//   20   39:putstatic       #36  <Field MetaDataRequest$a c>
		d = new MetaDataRequest$a("CUSTOM", 3, 4);
	//   21   42:new             #2   <Class MetaDataRequest$a>
	//   22   45:dup             
	//   23   46:ldc1            #38  <String "CUSTOM">
	//   24   48:iconst_3        
	//   25   49:iconst_4        
	//   26   50:invokespecial   #26  <Method void MetaDataRequest$a(String, int, int)>
	//   27   53:putstatic       #40  <Field MetaDataRequest$a d>
		e = new MetaDataRequest$a("PERIODIC", 4, 5);
	//   28   56:new             #2   <Class MetaDataRequest$a>
	//   29   59:dup             
	//   30   60:ldc1            #42  <String "PERIODIC">
	//   31   62:iconst_4        
	//   32   63:iconst_5        
	//   33   64:invokespecial   #26  <Method void MetaDataRequest$a(String, int, int)>
	//   34   67:putstatic       #44  <Field MetaDataRequest$a e>
		f = new MetaDataRequest$a("PAS", 5, 6);
	//   35   70:new             #2   <Class MetaDataRequest$a>
	//   36   73:dup             
	//   37   74:ldc1            #46  <String "PAS">
	//   38   76:iconst_5        
	//   39   77:bipush          6
	//   40   79:invokespecial   #26  <Method void MetaDataRequest$a(String, int, int)>
	//   41   82:putstatic       #48  <Field MetaDataRequest$a f>
		g = (new MetaDataRequest$a[] {
			a, b, c, d, e, f
		});
	//   42   85:bipush          6
	//   43   87:anewarray       MetaDataRequest$a[]
	//   44   90:dup             
	//   45   91:iconst_0        
	//   46   92:getstatic       #28  <Field MetaDataRequest$a a>
	//   47   95:aastore         
	//   48   96:dup             
	//   49   97:iconst_1        
	//   50   98:getstatic       #32  <Field MetaDataRequest$a b>
	//   51  101:aastore         
	//   52  102:dup             
	//   53  103:iconst_2        
	//   54  104:getstatic       #36  <Field MetaDataRequest$a c>
	//   55  107:aastore         
	//   56  108:dup             
	//   57  109:iconst_3        
	//   58  110:getstatic       #40  <Field MetaDataRequest$a d>
	//   59  113:aastore         
	//   60  114:dup             
	//   61  115:iconst_4        
	//   62  116:getstatic       #44  <Field MetaDataRequest$a e>
	//   63  119:aastore         
	//   64  120:dup             
	//   65  121:iconst_5        
	//   66  122:getstatic       #48  <Field MetaDataRequest$a f>
	//   67  125:aastore         
	//   68  126:putstatic       #50  <Field MetaDataRequest$a[] g>
	//*  69  129:return          
	}

	private MetaDataRequest$a(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #54  <Method void Enum(String, int)>
		index = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #56  <Field int index>
	//    7   11:return          
	}
}
