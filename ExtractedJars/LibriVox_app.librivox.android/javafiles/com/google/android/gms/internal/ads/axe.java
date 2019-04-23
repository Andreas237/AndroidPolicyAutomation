// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, aqq, axx, 
//			asj, axf, aug

public final class axe extends ash
	implements atx
{

	private axe()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void ash()>
		zzfxl = 2;
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:putfield        #32  <Field byte zzfxl>
		zzfyq = aqq.a;
	//    5    9:aload_0         
	//    6   10:getstatic       #36  <Field aqq aqq.a>
	//    7   13:putfield        #38  <Field aqq zzfyq>
		zzfgl = aqq.a;
	//    8   16:aload_0         
	//    9   17:getstatic       #36  <Field aqq aqq.a>
	//   10   20:putfield        #40  <Field aqq zzfgl>
	//   11   23:return          
	}

	static axe a()
	{
		return zzfyr;
	//    0    0:getstatic       #24  <Field axe zzfyr>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		int j;
		j = axx.a[i - 1];
	//    0    0:getstatic       #47  <Field int[] axx.a>
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
	//	               1 179
	//	               2 170
	//	               3 142
	//	               4 138
	//	               5 89
	//	               6 81
	//	               7 64;
	//    9   13:tableswitch     1 7: default 56
	//	               1 179
	//	               2 170
	//	               3 142
	//	               4 138
	//	               5 89
	//	               6 81
	//	               7 64
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//   10   56:new             #49  <Class UnsupportedOperationException>
	//   11   59:dup             
	//   12   60:invokespecial   #50  <Method void UnsupportedOperationException()>
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
	//   22   76:putfield        #32  <Field byte zzfxl>
		return ((Object) (null));
	//   23   79:aconst_null     
	//   24   80:areturn         
_L7:
		return ((Object) (Byte.valueOf(zzfxl)));
	//   25   81:aload_0         
	//   26   82:getfield        #32  <Field byte zzfxl>
	//   27   85:invokestatic    #56  <Method Byte Byte.valueOf(byte)>
	//   28   88:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   29   89:getstatic       #58  <Field aug zzcas>
	//   30   92:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   31   93:aload_2         
	//   32   94:ifnonnull       136
_L9:
		com/google/android/gms/internal/ads/axe;
	//   33   97:ldc1            #2   <Class axe>
		JVM INSTR monitorenter ;
	//   34   99:monitorenter    
		obj1 = ((Object) (zzcas));
	//   35  100:getstatic       #58  <Field aug zzcas>
	//   36  103:astore_3        
		obj = obj1;
	//   37  104:aload_3         
	//   38  105:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   39  106:aload_3         
	//   40  107:ifnonnull       125
_L11:
		obj = ((Object) (new asj(((ash) (zzfyr)))));
	//   41  110:new             #60  <Class asj>
	//   42  113:dup             
	//   43  114:getstatic       #24  <Field axe zzfyr>
	//   44  117:invokespecial   #63  <Method void asj(ash)>
	//   45  120:astore_2        
		zzcas = ((aug) (obj));
	//   46  121:aload_2         
	//   47  122:putstatic       #58  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/axe;
	//   48  125:ldc1            #2   <Class axe>
		JVM INSTR monitorexit ;
	//   49  127:monitorexit     
		return obj;
	//   50  128:aload_2         
	//   51  129:areturn         
		obj;
	//   52  130:astore_2        
		com/google/android/gms/internal/ads/axe;
	//   53  131:ldc1            #2   <Class axe>
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
		return ((Object) (zzfyr));
	//   59  138:getstatic       #24  <Field axe zzfyr>
	//   60  141:areturn         
_L4:
		return a(((atv) (zzfyr)), "\001\002\000\001\001\002\002\000\000\001\001\u050A\000\002\n\001", new Object[] {
			"zzccg", "zzfyq", "zzfgl"
		});
	//   61  142:getstatic       #24  <Field axe zzfyr>
	//   62  145:ldc1            #65  <String "\001\002\000\001\001\002\002\000\000\001\001\u050A\000\002\n\001">
	//   63  147:iconst_3        
	//   64  148:anewarray       Object[]
	//   65  151:dup             
	//   66  152:iconst_0        
	//   67  153:ldc1            #68  <String "zzccg">
	//   68  155:aastore         
	//   69  156:dup             
	//   70  157:iconst_1        
	//   71  158:ldc1            #69  <String "zzfyq">
	//   72  160:aastore         
	//   73  161:dup             
	//   74  162:iconst_2        
	//   75  163:ldc1            #70  <String "zzfgl">
	//   76  165:aastore         
	//   77  166:invokestatic    #73  <Method Object a(atv, String, Object[])>
	//   78  169:areturn         
_L3:
		return ((Object) (new axf(((axx) (null)))));
	//   79  170:new             #75  <Class axf>
	//   80  173:dup             
	//   81  174:aconst_null     
	//   82  175:invokespecial   #78  <Method void axf(axx)>
	//   83  178:areturn         
_L2:
		return ((Object) (new axe()));
	//   84  179:new             #2   <Class axe>
	//   85  182:dup             
	//   86  183:invokespecial   #22  <Method void axe()>
	//   87  186:areturn         
	}

	private static volatile aug zzcas;
	private static final axe zzfyr;
	private int zzccg;
	private aqq zzfgl;
	private byte zzfxl;
	private aqq zzfyq;

	static 
	{
		zzfyr = new axe();
	//    0    0:new             #2   <Class axe>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void axe()>
	//    3    7:putstatic       #24  <Field axe zzfyr>
		ash.a(com/google/android/gms/internal/ads/axe, ((ash) (zzfyr)));
	//    4   10:ldc1            #2   <Class axe>
	//    5   12:getstatic       #24  <Field axe zzfyr>
	//    6   15:invokestatic    #28  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
