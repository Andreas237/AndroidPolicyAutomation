// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			br, dj, gc, fk, 
//			ip, bt, gv, gu, 
//			ds, bx, gi, gy, 
//			hh, if, ik, ic, 
//			hw, in, gr, hj, 
//			go

public final class gt extends br
	implements dj
{

	private gt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method void br()>
		zzsf = 2;
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:putfield        #76  <Field byte zzsf>
		zzum = "";
	//    5    9:aload_0         
	//    6   10:ldc1            #78  <String "">
	//    7   12:putfield        #80  <Field String zzum>
		zzun = "";
	//    8   15:aload_0         
	//    9   16:ldc1            #78  <String "">
	//   10   18:putfield        #82  <Field String zzun>
	//   11   21:return          
	}

	static gt a()
	{
		return zzva;
	//    0    0:getstatic       #51  <Field gt zzva>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		int j;
		j = ip.a[i - 1];
	//    0    0:getstatic       #89  <Field int[] ip.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
	//    5    7:istore          4
		i = 0;
	//    6    9:iconst_0        
	//    7   10:istore_1        
		j;
	//    8   11:iload           4
		JVM INSTR tableswitch 1 7: default 56
	//	               1 264
	//	               2 255
	//	               3 142
	//	               4 138
	//	               5 89
	//	               6 81
	//	               7 64;
	//    9   13:tableswitch     1 7: default 56
	//	               1 264
	//	               2 255
	//	               3 142
	//	               4 138
	//	               5 89
	//	               6 81
	//	               7 64
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//   10   56:new             #91  <Class UnsupportedOperationException>
	//   11   59:dup             
	//   12   60:invokespecial   #92  <Method void UnsupportedOperationException()>
	//   13   63:athrow          
_L8:
		if(obj != null)
	//*  14   64:aload_2         
	//*  15   65:ifnonnull       71
	//*  16   68:goto            73
			i = 1;
	//   17   71:iconst_1        
	//   18   72:istore_1        
		zzsf = (byte)i;
	//   19   73:aload_0         
	//   20   74:iload_1         
	//   21   75:int2byte        
	//   22   76:putfield        #76  <Field byte zzsf>
		return ((Object) (null));
	//   23   79:aconst_null     
	//   24   80:areturn         
_L7:
		return ((Object) (Byte.valueOf(zzsf)));
	//   25   81:aload_0         
	//   26   82:getfield        #76  <Field byte zzsf>
	//   27   85:invokestatic    #98  <Method Byte Byte.valueOf(byte)>
	//   28   88:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   29   89:getstatic       #100 <Field ds zzbg>
	//   30   92:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   31   93:aload_2         
	//   32   94:ifnonnull       136
_L9:
		com/google/android/gms/internal/clearcut/gt;
	//   33   97:ldc1            #2   <Class gt>
		JVM INSTR monitorenter ;
	//   34   99:monitorenter    
		obj1 = ((Object) (zzbg));
	//   35  100:getstatic       #100 <Field ds zzbg>
	//   36  103:astore_3        
		obj = obj1;
	//   37  104:aload_3         
	//   38  105:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   39  106:aload_3         
	//   40  107:ifnonnull       125
_L11:
		obj = ((Object) (new bt(((br) (zzva)))));
	//   41  110:new             #102 <Class bt>
	//   42  113:dup             
	//   43  114:getstatic       #51  <Field gt zzva>
	//   44  117:invokespecial   #105 <Method void bt(br)>
	//   45  120:astore_2        
		zzbg = ((ds) (obj));
	//   46  121:aload_2         
	//   47  122:putstatic       #100 <Field ds zzbg>
_L12:
		com/google/android/gms/internal/clearcut/gt;
	//   48  125:ldc1            #2   <Class gt>
		JVM INSTR monitorexit ;
	//   49  127:monitorexit     
		return obj;
	//   50  128:aload_2         
	//   51  129:areturn         
		obj;
	//   52  130:astore_2        
		com/google/android/gms/internal/clearcut/gt;
	//   53  131:ldc1            #2   <Class gt>
		JVM INSTR monitorexit ;
	//   54  133:monitorexit     
		throw obj;
	//   55  134:aload_2         
	//   56  135:athrow          
_L10:
		return obj;
	//   57  136:aload_2         
	//   58  137:areturn         
_L5:
		return ((Object) (zzva));
	//   59  138:getstatic       #51  <Field gt zzva>
	//   60  141:areturn         
_L4:
		obj = ((Object) (gv.b()));
	//   61  142:invokestatic    #111 <Method cc gv.b()>
	//   62  145:astore_2        
		return a(((dh) (zzva)), "\001\017\000\001\001\017\017\020\000\000\001\001\f\000\002\u0409\003\003\t\004\004\t\005\005\t\006\006\b\001\007\b\002\b\t\007\t\t\013\n\t\b\013\t\f\f\002\016\r\t\t\016\t\r\017\t\n", new Object[] {
			"zzbb", "zzty", obj, "zzuo", "zzup", "zzuq", "zzur", "zzum", "zzun", "zzus", 
			"zzuw", "zzut", "zzux", "zzuz", "zzuu", "zzuy", "zzuv"
		});
	//   63  146:getstatic       #51  <Field gt zzva>
	//   64  149:ldc1            #113 <String "\001\017\000\001\001\017\017\020\000\000\001\001\f\000\002\u0409\003\003\t\004\004\t\005\005\t\006\006\b\001\007\b\002\b\t\007\t\t\013\n\t\b\013\t\f\f\002\016\r\t\t\016\t\r\017\t\n">
	//   65  151:bipush          17
	//   66  153:anewarray       Object[]
	//   67  156:dup             
	//   68  157:iconst_0        
	//   69  158:ldc1            #116 <String "zzbb">
	//   70  160:aastore         
	//   71  161:dup             
	//   72  162:iconst_1        
	//   73  163:ldc1            #117 <String "zzty">
	//   74  165:aastore         
	//   75  166:dup             
	//   76  167:iconst_2        
	//   77  168:aload_2         
	//   78  169:aastore         
	//   79  170:dup             
	//   80  171:iconst_3        
	//   81  172:ldc1            #118 <String "zzuo">
	//   82  174:aastore         
	//   83  175:dup             
	//   84  176:iconst_4        
	//   85  177:ldc1            #119 <String "zzup">
	//   86  179:aastore         
	//   87  180:dup             
	//   88  181:iconst_5        
	//   89  182:ldc1            #120 <String "zzuq">
	//   90  184:aastore         
	//   91  185:dup             
	//   92  186:bipush          6
	//   93  188:ldc1            #121 <String "zzur">
	//   94  190:aastore         
	//   95  191:dup             
	//   96  192:bipush          7
	//   97  194:ldc1            #122 <String "zzum">
	//   98  196:aastore         
	//   99  197:dup             
	//  100  198:bipush          8
	//  101  200:ldc1            #123 <String "zzun">
	//  102  202:aastore         
	//  103  203:dup             
	//  104  204:bipush          9
	//  105  206:ldc1            #124 <String "zzus">
	//  106  208:aastore         
	//  107  209:dup             
	//  108  210:bipush          10
	//  109  212:ldc1            #125 <String "zzuw">
	//  110  214:aastore         
	//  111  215:dup             
	//  112  216:bipush          11
	//  113  218:ldc1            #126 <String "zzut">
	//  114  220:aastore         
	//  115  221:dup             
	//  116  222:bipush          12
	//  117  224:ldc1            #127 <String "zzux">
	//  118  226:aastore         
	//  119  227:dup             
	//  120  228:bipush          13
	//  121  230:ldc1            #128 <String "zzuz">
	//  122  232:aastore         
	//  123  233:dup             
	//  124  234:bipush          14
	//  125  236:ldc1            #129 <String "zzuu">
	//  126  238:aastore         
	//  127  239:dup             
	//  128  240:bipush          15
	//  129  242:ldc1            #130 <String "zzuy">
	//  130  244:aastore         
	//  131  245:dup             
	//  132  246:bipush          16
	//  133  248:ldc1            #131 <String "zzuv">
	//  134  250:aastore         
	//  135  251:invokestatic    #134 <Method Object a(dh, String, Object[])>
	//  136  254:areturn         
_L3:
		return ((Object) (new gu(((ip) (null)))));
	//  137  255:new             #136 <Class gu>
	//  138  258:dup             
	//  139  259:aconst_null     
	//  140  260:invokespecial   #139 <Method void gu(ip)>
	//  141  263:areturn         
_L2:
		return ((Object) (new gt()));
	//  142  264:new             #2   <Class gt>
	//  143  267:dup             
	//  144  268:invokespecial   #49  <Method void gt()>
	//  145  271:areturn         
	}

	private static volatile ds zzbg;
	private static final gt zzva;
	private static final bx zzvb;
	private int zzbb;
	private byte zzsf;
	private int zzty;
	private String zzum;
	private String zzun;
	private gi zzuo;
	private gy zzup;
	private hh zzuq;
	private if zzur;
	private ik zzus;
	private ic zzut;
	private hw zzuu;
	private in zzuv;
	private gr zzuw;
	private hj zzux;
	private go zzuy;
	private long zzuz;

	static 
	{
		zzva = new gt();
	//    0    0:new             #2   <Class gt>
	//    1    3:dup             
	//    2    4:invokespecial   #49  <Method void gt()>
	//    3    7:putstatic       #51  <Field gt zzva>
		br.a(com/google/android/gms/internal/clearcut/gt, ((br) (zzva)));
	//    4   10:ldc1            #2   <Class gt>
	//    5   12:getstatic       #51  <Field gt zzva>
	//    6   15:invokestatic    #55  <Method void br.a(Class, br)>
		gc gc1 = gc.a();
	//    7   18:invokestatic    #60  <Method gc gc.a()>
	//    8   21:astore_0        
		gt gt1 = zzva;
	//    9   22:getstatic       #51  <Field gt zzva>
	//   10   25:astore_1        
		zzvb = br.a(((dh) (gc1)), ((Object) (gt1)), ((dh) (gt1)), ((cc) (null)), 0x3f3fd17, fk.k, com/google/android/gms/internal/clearcut/gt);
	//   11   26:aload_0         
	//   12   27:aload_1         
	//   13   28:aload_1         
	//   14   29:aconst_null     
	//   15   30:ldc1            #61  <Int 0x3f3fd17>
	//   16   32:getstatic       #67  <Field fk fk.k>
	//   17   35:ldc1            #2   <Class gt>
	//   18   37:invokestatic    #70  <Method bx br.a(dh, Object, dh, cc, int, fk, Class)>
	//   19   40:putstatic       #72  <Field bx zzvb>
	//*  20   43:return          
	}
}
