// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, axx, asj, 
//			axd, aug

public final class axc extends ash
	implements atx
{

	private axc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void ash()>
		zzfyo = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #29  <String "">
	//    4    7:putfield        #31  <Field String zzfyo>
	//    5   10:return          
	}

	static axc a()
	{
		return zzfyp;
	//    0    0:getstatic       #21  <Field axc zzfyp>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		axx.a[i - 1];
	//    0    0:getstatic       #38  <Field int[] axx.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 148
	//	               2 139
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 148
	//	               2 139
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #40  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #41  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #47  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #49  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/axc;
	//   19   71:ldc1            #2   <Class axc>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #49  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzfyp)))));
	//   27   84:new             #51  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #21  <Field axc zzfyp>
	//   30   91:invokespecial   #54  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #49  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/axc;
	//   34   99:ldc1            #2   <Class axc>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/axc;
	//   39  105:ldc1            #2   <Class axc>
		JVM INSTR monitorexit ;
	//   40  107:monitorexit     
		throw obj;
	//   41  108:aload_2         
	//   42  109:athrow          
_L10:
		return obj;
	//   43  110:aload_2         
	//   44  111:areturn         
_L5:
		return ((Object) (zzfyp));
	//   45  112:getstatic       #21  <Field axc zzfyp>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzfyp)), "\001\001\000\001\001\001\001\000\000\000\001\b\0", new Object[] {
			"zzccg", "zzfyo"
		});
	//   47  116:getstatic       #21  <Field axc zzfyp>
	//   48  119:ldc1            #56  <String "\001\001\000\001\001\001\001\000\000\000\001\b\0">
	//   49  121:iconst_2        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #59  <String "zzccg">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #60  <String "zzfyo">
	//   58  134:aastore         
	//   59  135:invokestatic    #63  <Method Object a(atv, String, Object[])>
	//   60  138:areturn         
_L3:
		return ((Object) (new axd(((axx) (null)))));
	//   61  139:new             #65  <Class axd>
	//   62  142:dup             
	//   63  143:aconst_null     
	//   64  144:invokespecial   #68  <Method void axd(axx)>
	//   65  147:areturn         
_L2:
		return ((Object) (new axc()));
	//   66  148:new             #2   <Class axc>
	//   67  151:dup             
	//   68  152:invokespecial   #19  <Method void axc()>
	//   69  155:areturn         
	}

	private static volatile aug zzcas;
	private static final axc zzfyp;
	private int zzccg;
	private String zzfyo;

	static 
	{
		zzfyp = new axc();
	//    0    0:new             #2   <Class axc>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void axc()>
	//    3    7:putstatic       #21  <Field axc zzfyp>
		ash.a(com/google/android/gms/internal/ads/axc, ((ash) (zzfyp)));
	//    4   10:ldc1            #2   <Class axc>
	//    5   12:getstatic       #21  <Field axc zzfyp>
	//    6   15:invokestatic    #25  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
