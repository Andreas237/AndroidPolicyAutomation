// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, aqq, axx, 
//			asj, axe, axl, aug, 
//			ast, axm

public final class axk extends ash
	implements atx
{

	private axk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void ash()>
		zzfxl = 2;
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:putfield        #38  <Field byte zzfxl>
		zzfyt = n();
	//    5    9:aload_0         
	//    6   10:invokestatic    #42  <Method ast n()>
	//    7   13:putfield        #44  <Field ast zzfyt>
		zzfyu = aqq.a;
	//    8   16:aload_0         
	//    9   17:getstatic       #48  <Field aqq aqq.a>
	//   10   20:putfield        #50  <Field aqq zzfyu>
		zzfyv = aqq.a;
	//   11   23:aload_0         
	//   12   24:getstatic       #48  <Field aqq aqq.a>
	//   13   27:putfield        #52  <Field aqq zzfyv>
		zzfzd = aqq.a;
	//   14   30:aload_0         
	//   15   31:getstatic       #48  <Field aqq aqq.a>
	//   16   34:putfield        #54  <Field aqq zzfzd>
	//   17   37:return          
	}

	static axk a()
	{
		return zzfze;
	//    0    0:getstatic       #30  <Field axk zzfze>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		int j;
		j = axx.a[i - 1];
	//    0    0:getstatic       #61  <Field int[] axx.a>
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
	//	               1 207
	//	               2 198
	//	               3 142
	//	               4 138
	//	               5 89
	//	               6 81
	//	               7 64;
	//    9   13:tableswitch     1 7: default 56
	//	               1 207
	//	               2 198
	//	               3 142
	//	               4 138
	//	               5 89
	//	               6 81
	//	               7 64
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//   10   56:new             #63  <Class UnsupportedOperationException>
	//   11   59:dup             
	//   12   60:invokespecial   #64  <Method void UnsupportedOperationException()>
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
	//   22   76:putfield        #38  <Field byte zzfxl>
		return ((Object) (null));
	//   23   79:aconst_null     
	//   24   80:areturn         
_L7:
		return ((Object) (Byte.valueOf(zzfxl)));
	//   25   81:aload_0         
	//   26   82:getfield        #38  <Field byte zzfxl>
	//   27   85:invokestatic    #70  <Method Byte Byte.valueOf(byte)>
	//   28   88:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   29   89:getstatic       #72  <Field aug zzcas>
	//   30   92:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   31   93:aload_2         
	//   32   94:ifnonnull       136
_L9:
		com/google/android/gms/internal/ads/axk;
	//   33   97:ldc1            #2   <Class axk>
		JVM INSTR monitorenter ;
	//   34   99:monitorenter    
		obj1 = ((Object) (zzcas));
	//   35  100:getstatic       #72  <Field aug zzcas>
	//   36  103:astore_3        
		obj = obj1;
	//   37  104:aload_3         
	//   38  105:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   39  106:aload_3         
	//   40  107:ifnonnull       125
_L11:
		obj = ((Object) (new asj(((ash) (zzfze)))));
	//   41  110:new             #74  <Class asj>
	//   42  113:dup             
	//   43  114:getstatic       #30  <Field axk zzfze>
	//   44  117:invokespecial   #77  <Method void asj(ash)>
	//   45  120:astore_2        
		zzcas = ((aug) (obj));
	//   46  121:aload_2         
	//   47  122:putstatic       #72  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/axk;
	//   48  125:ldc1            #2   <Class axk>
		JVM INSTR monitorexit ;
	//   49  127:monitorexit     
		return obj;
	//   50  128:aload_2         
	//   51  129:areturn         
		obj;
	//   52  130:astore_2        
		com/google/android/gms/internal/ads/axk;
	//   53  131:ldc1            #2   <Class axk>
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
		return ((Object) (zzfze));
	//   59  138:getstatic       #30  <Field axk zzfze>
	//   60  141:areturn         
_L4:
		return a(((atv) (zzfze)), "\001\006\000\001\001\006\006\000\001\001\001\t\000\002\u041B\003\n\001\004\n\002\005\004\003\006\n\004", new Object[] {
			"zzccg", "zzfzc", "zzfyt", com/google/android/gms/internal/ads/axe, "zzfyu", "zzfyv", "zzfyw", "zzfzd"
		});
	//   61  142:getstatic       #30  <Field axk zzfze>
	//   62  145:ldc1            #79  <String "\001\006\000\001\001\006\006\000\001\001\001\t\000\002\u041B\003\n\001\004\n\002\005\004\003\006\n\004">
	//   63  147:bipush          8
	//   64  149:anewarray       Object[]
	//   65  152:dup             
	//   66  153:iconst_0        
	//   67  154:ldc1            #82  <String "zzccg">
	//   68  156:aastore         
	//   69  157:dup             
	//   70  158:iconst_1        
	//   71  159:ldc1            #83  <String "zzfzc">
	//   72  161:aastore         
	//   73  162:dup             
	//   74  163:iconst_2        
	//   75  164:ldc1            #84  <String "zzfyt">
	//   76  166:aastore         
	//   77  167:dup             
	//   78  168:iconst_3        
	//   79  169:ldc1            #86  <Class axe>
	//   80  171:aastore         
	//   81  172:dup             
	//   82  173:iconst_4        
	//   83  174:ldc1            #87  <String "zzfyu">
	//   84  176:aastore         
	//   85  177:dup             
	//   86  178:iconst_5        
	//   87  179:ldc1            #88  <String "zzfyv">
	//   88  181:aastore         
	//   89  182:dup             
	//   90  183:bipush          6
	//   91  185:ldc1            #89  <String "zzfyw">
	//   92  187:aastore         
	//   93  188:dup             
	//   94  189:bipush          7
	//   95  191:ldc1            #90  <String "zzfzd">
	//   96  193:aastore         
	//   97  194:invokestatic    #93  <Method Object a(atv, String, Object[])>
	//   98  197:areturn         
_L3:
		return ((Object) (new axl(((axx) (null)))));
	//   99  198:new             #95  <Class axl>
	//  100  201:dup             
	//  101  202:aconst_null     
	//  102  203:invokespecial   #98  <Method void axl(axx)>
	//  103  206:areturn         
_L2:
		return ((Object) (new axk()));
	//  104  207:new             #2   <Class axk>
	//  105  210:dup             
	//  106  211:invokespecial   #28  <Method void axk()>
	//  107  214:areturn         
	}

	private static volatile aug zzcas;
	private static final axk zzfze;
	private int zzccg;
	private byte zzfxl;
	private ast zzfyt;
	private aqq zzfyu;
	private aqq zzfyv;
	private int zzfyw;
	private axm zzfzc;
	private aqq zzfzd;

	static 
	{
		zzfze = new axk();
	//    0    0:new             #2   <Class axk>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void axk()>
	//    3    7:putstatic       #30  <Field axk zzfze>
		ash.a(com/google/android/gms/internal/ads/axk, ((ash) (zzfze)));
	//    4   10:ldc1            #2   <Class axk>
	//    5   12:getstatic       #30  <Field axk zzfze>
	//    6   15:invokestatic    #34  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
