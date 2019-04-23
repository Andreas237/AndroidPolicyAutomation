// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, aqq, axx, 
//			asj, awz, aww, aug, 
//			awx

public final class awv extends ash
	implements atx
{

	private awv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void ash()>
		zzfxl = 2;
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:putfield        #38  <Field byte zzfxl>
		zzfxh = aqq.a;
	//    5    9:aload_0         
	//    6   10:getstatic       #42  <Field aqq aqq.a>
	//    7   13:putfield        #44  <Field aqq zzfxh>
		zzfxi = aqq.a;
	//    8   16:aload_0         
	//    9   17:getstatic       #42  <Field aqq aqq.a>
	//   10   20:putfield        #46  <Field aqq zzfxi>
	//   11   23:return          
	}

	static awv a()
	{
		return zzfxm;
	//    0    0:getstatic       #30  <Field awv zzfxm>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		int j;
		j = axx.a[i - 1];
	//    0    0:getstatic       #53  <Field int[] axx.a>
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
	//	               1 210
	//	               2 201
	//	               3 142
	//	               4 138
	//	               5 89
	//	               6 81
	//	               7 64;
	//    9   13:tableswitch     1 7: default 56
	//	               1 210
	//	               2 201
	//	               3 142
	//	               4 138
	//	               5 89
	//	               6 81
	//	               7 64
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//   10   56:new             #55  <Class UnsupportedOperationException>
	//   11   59:dup             
	//   12   60:invokespecial   #56  <Method void UnsupportedOperationException()>
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
	//   27   85:invokestatic    #62  <Method Byte Byte.valueOf(byte)>
	//   28   88:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   29   89:getstatic       #64  <Field aug zzcas>
	//   30   92:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   31   93:aload_2         
	//   32   94:ifnonnull       136
_L9:
		com/google/android/gms/internal/ads/awv;
	//   33   97:ldc1            #2   <Class awv>
		JVM INSTR monitorenter ;
	//   34   99:monitorenter    
		obj1 = ((Object) (zzcas));
	//   35  100:getstatic       #64  <Field aug zzcas>
	//   36  103:astore_3        
		obj = obj1;
	//   37  104:aload_3         
	//   38  105:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   39  106:aload_3         
	//   40  107:ifnonnull       125
_L11:
		obj = ((Object) (new asj(((ash) (zzfxm)))));
	//   41  110:new             #66  <Class asj>
	//   42  113:dup             
	//   43  114:getstatic       #30  <Field awv zzfxm>
	//   44  117:invokespecial   #69  <Method void asj(ash)>
	//   45  120:astore_2        
		zzcas = ((aug) (obj));
	//   46  121:aload_2         
	//   47  122:putstatic       #64  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/awv;
	//   48  125:ldc1            #2   <Class awv>
		JVM INSTR monitorexit ;
	//   49  127:monitorexit     
		return obj;
	//   50  128:aload_2         
	//   51  129:areturn         
		obj;
	//   52  130:astore_2        
		com/google/android/gms/internal/ads/awv;
	//   53  131:ldc1            #2   <Class awv>
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
		return ((Object) (zzfxm));
	//   59  138:getstatic       #30  <Field awv zzfxm>
	//   60  141:areturn         
_L4:
		obj = ((Object) (awz.b()));
	//   61  142:invokestatic    #75  <Method asr awz.b()>
	//   62  145:astore_2        
		return a(((atv) (zzfxm)), "\001\006\000\001\001\006\006\000\000\001\001\u050C\000\002\t\001\003\n\002\004\n\003\005\007\004\006\007\005", new Object[] {
			"zzccg", "zzfxf", obj, "zzfxg", "zzfxh", "zzfxi", "zzfxj", "zzfxk"
		});
	//   63  146:getstatic       #30  <Field awv zzfxm>
	//   64  149:ldc1            #77  <String "\001\006\000\001\001\006\006\000\000\001\001\u050C\000\002\t\001\003\n\002\004\n\003\005\007\004\006\007\005">
	//   65  151:bipush          8
	//   66  153:anewarray       Object[]
	//   67  156:dup             
	//   68  157:iconst_0        
	//   69  158:ldc1            #80  <String "zzccg">
	//   70  160:aastore         
	//   71  161:dup             
	//   72  162:iconst_1        
	//   73  163:ldc1            #81  <String "zzfxf">
	//   74  165:aastore         
	//   75  166:dup             
	//   76  167:iconst_2        
	//   77  168:aload_2         
	//   78  169:aastore         
	//   79  170:dup             
	//   80  171:iconst_3        
	//   81  172:ldc1            #82  <String "zzfxg">
	//   82  174:aastore         
	//   83  175:dup             
	//   84  176:iconst_4        
	//   85  177:ldc1            #83  <String "zzfxh">
	//   86  179:aastore         
	//   87  180:dup             
	//   88  181:iconst_5        
	//   89  182:ldc1            #84  <String "zzfxi">
	//   90  184:aastore         
	//   91  185:dup             
	//   92  186:bipush          6
	//   93  188:ldc1            #85  <String "zzfxj">
	//   94  190:aastore         
	//   95  191:dup             
	//   96  192:bipush          7
	//   97  194:ldc1            #86  <String "zzfxk">
	//   98  196:aastore         
	//   99  197:invokestatic    #89  <Method Object a(atv, String, Object[])>
	//  100  200:areturn         
_L3:
		return ((Object) (new aww(((axx) (null)))));
	//  101  201:new             #91  <Class aww>
	//  102  204:dup             
	//  103  205:aconst_null     
	//  104  206:invokespecial   #94  <Method void aww(axx)>
	//  105  209:areturn         
_L2:
		return ((Object) (new awv()));
	//  106  210:new             #2   <Class awv>
	//  107  213:dup             
	//  108  214:invokespecial   #28  <Method void awv()>
	//  109  217:areturn         
	}

	private static volatile aug zzcas;
	private static final awv zzfxm;
	private int zzccg;
	private int zzfxf;
	private awx zzfxg;
	private aqq zzfxh;
	private aqq zzfxi;
	private boolean zzfxj;
	private boolean zzfxk;
	private byte zzfxl;

	static 
	{
		zzfxm = new awv();
	//    0    0:new             #2   <Class awv>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void awv()>
	//    3    7:putstatic       #30  <Field awv zzfxm>
		ash.a(com/google/android/gms/internal/ads/awv, ((ash) (zzfxm)));
	//    4   10:ldc1            #2   <Class awv>
	//    5   12:getstatic       #30  <Field awv zzfxm>
	//    6   15:invokestatic    #34  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
