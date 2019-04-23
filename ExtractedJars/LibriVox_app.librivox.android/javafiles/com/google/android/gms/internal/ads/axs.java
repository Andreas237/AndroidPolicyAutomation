// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, axx, asj, 
//			axt, axu, aug, axg, 
//			axk, ass, ast

public final class axs extends ash
	implements atx
{

	private axs()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void ash()>
		zzfxl = 2;
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:putfield        #43  <Field byte zzfxl>
		zzfxo = "";
	//    5    9:aload_0         
	//    6   10:ldc1            #45  <String "">
	//    7   12:putfield        #47  <Field String zzfxo>
		zzgad = m();
	//    8   15:aload_0         
	//    9   16:invokestatic    #51  <Method ass m()>
	//   10   19:putfield        #53  <Field ass zzgad>
		zzgae = "";
	//   11   22:aload_0         
	//   12   23:ldc1            #45  <String "">
	//   13   25:putfield        #55  <Field String zzgae>
		zzgag = ash.n();
	//   14   28:aload_0         
	//   15   29:invokestatic    #59  <Method ast ash.n()>
	//   16   32:putfield        #61  <Field ast zzgag>
	//   17   35:return          
	}

	static axs a()
	{
		return zzgah;
	//    0    0:getstatic       #35  <Field axs zzgah>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		int j;
		j = axx.a[i - 1];
	//    0    0:getstatic       #68  <Field int[] axx.a>
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
	//	               1 228
	//	               2 219
	//	               3 142
	//	               4 138
	//	               5 89
	//	               6 81
	//	               7 64;
	//    9   13:tableswitch     1 7: default 56
	//	               1 228
	//	               2 219
	//	               3 142
	//	               4 138
	//	               5 89
	//	               6 81
	//	               7 64
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//   10   56:new             #70  <Class UnsupportedOperationException>
	//   11   59:dup             
	//   12   60:invokespecial   #71  <Method void UnsupportedOperationException()>
	//   13   63:athrow          
_L8:
		if(obj != null)
	//*  14   64:aload_2         
	//*  15   65:ifnonnull       71
	//*  16   68:goto            73
			i = 1;
	//   17   71:iconst_1        
	//   18   72:istore_1        
		zzfxl = (byte)i;
	//   19   73:aload_0         
	//   20   74:iload_1         
	//   21   75:int2byte        
	//   22   76:putfield        #43  <Field byte zzfxl>
		return ((Object) (null));
	//   23   79:aconst_null     
	//   24   80:areturn         
_L7:
		return ((Object) (Byte.valueOf(zzfxl)));
	//   25   81:aload_0         
	//   26   82:getfield        #43  <Field byte zzfxl>
	//   27   85:invokestatic    #77  <Method Byte Byte.valueOf(byte)>
	//   28   88:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   29   89:getstatic       #79  <Field aug zzcas>
	//   30   92:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   31   93:aload_2         
	//   32   94:ifnonnull       136
_L9:
		com/google/android/gms/internal/ads/axs;
	//   33   97:ldc1            #2   <Class axs>
		JVM INSTR monitorenter ;
	//   34   99:monitorenter    
		obj1 = ((Object) (zzcas));
	//   35  100:getstatic       #79  <Field aug zzcas>
	//   36  103:astore_3        
		obj = obj1;
	//   37  104:aload_3         
	//   38  105:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   39  106:aload_3         
	//   40  107:ifnonnull       125
_L11:
		obj = ((Object) (new asj(((ash) (zzgah)))));
	//   41  110:new             #81  <Class asj>
	//   42  113:dup             
	//   43  114:getstatic       #35  <Field axs zzgah>
	//   44  117:invokespecial   #84  <Method void asj(ash)>
	//   45  120:astore_2        
		zzcas = ((aug) (obj));
	//   46  121:aload_2         
	//   47  122:putstatic       #79  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/axs;
	//   48  125:ldc1            #2   <Class axs>
		JVM INSTR monitorexit ;
	//   49  127:monitorexit     
		return obj;
	//   50  128:aload_2         
	//   51  129:areturn         
		obj;
	//   52  130:astore_2        
		com/google/android/gms/internal/ads/axs;
	//   53  131:ldc1            #2   <Class axs>
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
		return ((Object) (zzgah));
	//   59  138:getstatic       #35  <Field axs zzgah>
	//   60  141:areturn         
_L4:
		obj = ((Object) (axt.b()));
	//   61  142:invokestatic    #90  <Method asr axt.b()>
	//   62  145:astore_2        
		return a(((atv) (zzgah)), "\001\t\000\001\001\t\t\000\002\003\001\u0504\000\002\b\001\003\u0409\002\004\u0409\003\005\004\004\006\026\007\b\005\b\f\006\t\032", new Object[] {
			"zzccg", "zzfzz", "zzfxo", "zzgaa", "zzgab", "zzgac", "zzgad", "zzgae", "zzgaf", obj, 
			"zzgag"
		});
	//   63  146:getstatic       #35  <Field axs zzgah>
	//   64  149:ldc1            #92  <String "\001\t\000\001\001\t\t\000\002\003\001\u0504\000\002\b\001\003\u0409\002\004\u0409\003\005\004\004\006\026\007\b\005\b\f\006\t\032">
	//   65  151:bipush          11
	//   66  153:anewarray       Object[]
	//   67  156:dup             
	//   68  157:iconst_0        
	//   69  158:ldc1            #95  <String "zzccg">
	//   70  160:aastore         
	//   71  161:dup             
	//   72  162:iconst_1        
	//   73  163:ldc1            #96  <String "zzfzz">
	//   74  165:aastore         
	//   75  166:dup             
	//   76  167:iconst_2        
	//   77  168:ldc1            #97  <String "zzfxo">
	//   78  170:aastore         
	//   79  171:dup             
	//   80  172:iconst_3        
	//   81  173:ldc1            #98  <String "zzgaa">
	//   82  175:aastore         
	//   83  176:dup             
	//   84  177:iconst_4        
	//   85  178:ldc1            #99  <String "zzgab">
	//   86  180:aastore         
	//   87  181:dup             
	//   88  182:iconst_5        
	//   89  183:ldc1            #100 <String "zzgac">
	//   90  185:aastore         
	//   91  186:dup             
	//   92  187:bipush          6
	//   93  189:ldc1            #101 <String "zzgad">
	//   94  191:aastore         
	//   95  192:dup             
	//   96  193:bipush          7
	//   97  195:ldc1            #102 <String "zzgae">
	//   98  197:aastore         
	//   99  198:dup             
	//  100  199:bipush          8
	//  101  201:ldc1            #103 <String "zzgaf">
	//  102  203:aastore         
	//  103  204:dup             
	//  104  205:bipush          9
	//  105  207:aload_2         
	//  106  208:aastore         
	//  107  209:dup             
	//  108  210:bipush          10
	//  109  212:ldc1            #104 <String "zzgag">
	//  110  214:aastore         
	//  111  215:invokestatic    #107 <Method Object a(atv, String, Object[])>
	//  112  218:areturn         
_L3:
		return ((Object) (new axu(((axx) (null)))));
	//  113  219:new             #109 <Class axu>
	//  114  222:dup             
	//  115  223:aconst_null     
	//  116  224:invokespecial   #112 <Method void axu(axx)>
	//  117  227:areturn         
_L2:
		return ((Object) (new axs()));
	//  118  228:new             #2   <Class axs>
	//  119  231:dup             
	//  120  232:invokespecial   #33  <Method void axs()>
	//  121  235:areturn         
	}

	private static volatile aug zzcas;
	private static final axs zzgah;
	private int zzccg;
	private byte zzfxl;
	private String zzfxo;
	private int zzfzz;
	private axg zzgaa;
	private axk zzgab;
	private int zzgac;
	private ass zzgad;
	private String zzgae;
	private int zzgaf;
	private ast zzgag;

	static 
	{
		zzgah = new axs();
	//    0    0:new             #2   <Class axs>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void axs()>
	//    3    7:putstatic       #35  <Field axs zzgah>
		ash.a(com/google/android/gms/internal/ads/axs, ((ash) (zzgah)));
	//    4   10:ldc1            #2   <Class axs>
	//    5   12:getstatic       #35  <Field axs zzgah>
	//    6   15:invokestatic    #39  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
