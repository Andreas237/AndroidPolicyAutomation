// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, bsk, asj, 
//			bsi, aug

public final class bsh extends ash
	implements atx
{

	private bsh()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void ash()>
	//    2    4:return          
	}

	static bsh a()
	{
		return zzcar;
	//    0    0:getstatic       #17  <Field bsh zzcar>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		bsk.a[i - 1];
	//    0    0:getstatic       #30  <Field int[] bsk.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 135
	//	               2 126
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 135
	//	               2 126
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #32  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #33  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #39  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #41  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/bsh;
	//   19   71:ldc1            #2   <Class bsh>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #41  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzcar)))));
	//   27   84:new             #43  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #17  <Field bsh zzcar>
	//   30   91:invokespecial   #46  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #41  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/bsh;
	//   34   99:ldc1            #2   <Class bsh>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/bsh;
	//   39  105:ldc1            #2   <Class bsh>
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
		return ((Object) (zzcar));
	//   45  112:getstatic       #17  <Field bsh zzcar>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzcar)), "\001\0", ((Object []) (null)));
	//   47  116:getstatic       #17  <Field bsh zzcar>
	//   48  119:ldc1            #48  <String "\001\0">
	//   49  121:aconst_null     
	//   50  122:invokestatic    #51  <Method Object a(atv, String, Object[])>
	//   51  125:areturn         
_L3:
		return ((Object) (new bsi(((bsk) (null)))));
	//   52  126:new             #53  <Class bsi>
	//   53  129:dup             
	//   54  130:aconst_null     
	//   55  131:invokespecial   #56  <Method void bsi(bsk)>
	//   56  134:areturn         
_L2:
		return ((Object) (new bsh()));
	//   57  135:new             #2   <Class bsh>
	//   58  138:dup             
	//   59  139:invokespecial   #15  <Method void bsh()>
	//   60  142:areturn         
	}

	private static final bsh zzcar;
	private static volatile aug zzcas;

	static 
	{
		zzcar = new bsh();
	//    0    0:new             #2   <Class bsh>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void bsh()>
	//    3    7:putstatic       #17  <Field bsh zzcar>
		ash.a(com/google/android/gms/internal/ads/bsh, ((ash) (zzcar)));
	//    4   10:ldc1            #2   <Class bsh>
	//    5   12:getstatic       #17  <Field bsh zzcar>
	//    6   15:invokestatic    #21  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
