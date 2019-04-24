// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzte

public final class zzxx extends Enum
{

	private zzxx(String s, int i, Object obj)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #101 <Method void Enum(String, int)>
		zzbzs = obj;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #103 <Field Object zzbzs>
	//    7   11:return          
	}

	public static zzxx[] values()
	{
		return (zzxx[])((zzxx []) (zzcen)).clone();
	//    0    0:getstatic       #97  <Field zzxx[] zzcen>
	//    1    3:invokevirtual   #112 <Method Object _5B_Lcom.google.android.gms.internal.measurement.zzxx_3B_.clone()>
	//    2    6:checkcast       #108 <Class zzxx[]>
	//    3    9:areturn         
	}

	public static final zzxx zzcee;
	public static final zzxx zzcef;
	public static final zzxx zzceg;
	public static final zzxx zzceh;
	public static final zzxx zzcei;
	public static final zzxx zzcej;
	public static final zzxx zzcek;
	public static final zzxx zzcel;
	public static final zzxx zzcem;
	private static final zzxx zzcen[];
	private final Object zzbzs;

	static 
	{
		zzcee = new zzxx("INT", 0, ((Object) (Integer.valueOf(0))));
	//    0    0:new             #2   <Class zzxx>
	//    1    3:dup             
	//    2    4:ldc1            #23  <String "INT">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokestatic    #29  <Method Integer Integer.valueOf(int)>
	//    6   11:invokespecial   #33  <Method void zzxx(String, int, Object)>
	//    7   14:putstatic       #35  <Field zzxx zzcee>
		zzcef = new zzxx("LONG", 1, ((Object) (Long.valueOf(0L))));
	//    8   17:new             #2   <Class zzxx>
	//    9   20:dup             
	//   10   21:ldc1            #37  <String "LONG">
	//   11   23:iconst_1        
	//   12   24:lconst_0        
	//   13   25:invokestatic    #42  <Method Long Long.valueOf(long)>
	//   14   28:invokespecial   #33  <Method void zzxx(String, int, Object)>
	//   15   31:putstatic       #44  <Field zzxx zzcef>
		zzceg = new zzxx("FLOAT", 2, ((Object) (Float.valueOf(0.0F))));
	//   16   34:new             #2   <Class zzxx>
	//   17   37:dup             
	//   18   38:ldc1            #46  <String "FLOAT">
	//   19   40:iconst_2        
	//   20   41:fconst_0        
	//   21   42:invokestatic    #51  <Method Float Float.valueOf(float)>
	//   22   45:invokespecial   #33  <Method void zzxx(String, int, Object)>
	//   23   48:putstatic       #53  <Field zzxx zzceg>
		zzceh = new zzxx("DOUBLE", 3, ((Object) (Double.valueOf(0.0D))));
	//   24   51:new             #2   <Class zzxx>
	//   25   54:dup             
	//   26   55:ldc1            #55  <String "DOUBLE">
	//   27   57:iconst_3        
	//   28   58:dconst_0        
	//   29   59:invokestatic    #60  <Method Double Double.valueOf(double)>
	//   30   62:invokespecial   #33  <Method void zzxx(String, int, Object)>
	//   31   65:putstatic       #62  <Field zzxx zzceh>
		zzcei = new zzxx("BOOLEAN", 4, ((Object) (Boolean.valueOf(false))));
	//   32   68:new             #2   <Class zzxx>
	//   33   71:dup             
	//   34   72:ldc1            #64  <String "BOOLEAN">
	//   35   74:iconst_4        
	//   36   75:iconst_0        
	//   37   76:invokestatic    #69  <Method Boolean Boolean.valueOf(boolean)>
	//   38   79:invokespecial   #33  <Method void zzxx(String, int, Object)>
	//   39   82:putstatic       #71  <Field zzxx zzcei>
		zzcej = new zzxx("STRING", 5, "");
	//   40   85:new             #2   <Class zzxx>
	//   41   88:dup             
	//   42   89:ldc1            #73  <String "STRING">
	//   43   91:iconst_5        
	//   44   92:ldc1            #75  <String "">
	//   45   94:invokespecial   #33  <Method void zzxx(String, int, Object)>
	//   46   97:putstatic       #77  <Field zzxx zzcej>
		zzcek = new zzxx("BYTE_STRING", 6, ((Object) (zzte.zzbts)));
	//   47  100:new             #2   <Class zzxx>
	//   48  103:dup             
	//   49  104:ldc1            #79  <String "BYTE_STRING">
	//   50  106:bipush          6
	//   51  108:getstatic       #85  <Field zzte zzte.zzbts>
	//   52  111:invokespecial   #33  <Method void zzxx(String, int, Object)>
	//   53  114:putstatic       #87  <Field zzxx zzcek>
		zzcel = new zzxx("ENUM", 7, ((Object) (null)));
	//   54  117:new             #2   <Class zzxx>
	//   55  120:dup             
	//   56  121:ldc1            #89  <String "ENUM">
	//   57  123:bipush          7
	//   58  125:aconst_null     
	//   59  126:invokespecial   #33  <Method void zzxx(String, int, Object)>
	//   60  129:putstatic       #91  <Field zzxx zzcel>
		zzcem = new zzxx("MESSAGE", 8, ((Object) (null)));
	//   61  132:new             #2   <Class zzxx>
	//   62  135:dup             
	//   63  136:ldc1            #93  <String "MESSAGE">
	//   64  138:bipush          8
	//   65  140:aconst_null     
	//   66  141:invokespecial   #33  <Method void zzxx(String, int, Object)>
	//   67  144:putstatic       #95  <Field zzxx zzcem>
		zzcen = (new zzxx[] {
			zzcee, zzcef, zzceg, zzceh, zzcei, zzcej, zzcek, zzcel, zzcem
		});
	//   68  147:bipush          9
	//   69  149:anewarray       zzxx[]
	//   70  152:dup             
	//   71  153:iconst_0        
	//   72  154:getstatic       #35  <Field zzxx zzcee>
	//   73  157:aastore         
	//   74  158:dup             
	//   75  159:iconst_1        
	//   76  160:getstatic       #44  <Field zzxx zzcef>
	//   77  163:aastore         
	//   78  164:dup             
	//   79  165:iconst_2        
	//   80  166:getstatic       #53  <Field zzxx zzceg>
	//   81  169:aastore         
	//   82  170:dup             
	//   83  171:iconst_3        
	//   84  172:getstatic       #62  <Field zzxx zzceh>
	//   85  175:aastore         
	//   86  176:dup             
	//   87  177:iconst_4        
	//   88  178:getstatic       #71  <Field zzxx zzcei>
	//   89  181:aastore         
	//   90  182:dup             
	//   91  183:iconst_5        
	//   92  184:getstatic       #77  <Field zzxx zzcej>
	//   93  187:aastore         
	//   94  188:dup             
	//   95  189:bipush          6
	//   96  191:getstatic       #87  <Field zzxx zzcek>
	//   97  194:aastore         
	//   98  195:dup             
	//   99  196:bipush          7
	//  100  198:getstatic       #91  <Field zzxx zzcel>
	//  101  201:aastore         
	//  102  202:dup             
	//  103  203:bipush          8
	//  104  205:getstatic       #95  <Field zzxx zzcem>
	//  105  208:aastore         
	//  106  209:putstatic       #97  <Field zzxx[] zzcen>
	//* 107  212:return          
	}
}
