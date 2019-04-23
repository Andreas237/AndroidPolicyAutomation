// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, axx, asj, 
//			awy, aug

public final class awx extends ash
	implements atx
{

	private awx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void ash()>
		zzfxn = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #32  <String "">
	//    4    7:putfield        #34  <Field String zzfxn>
		zzfxo = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #32  <String "">
	//    7   13:putfield        #36  <Field String zzfxo>
		zzfxp = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #32  <String "">
	//   10   19:putfield        #38  <Field String zzfxp>
	//   11   22:return          
	}

	static awx a()
	{
		return zzfxr;
	//    0    0:getstatic       #24  <Field awx zzfxr>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		axx.a[i - 1];
	//    0    0:getstatic       #45  <Field int[] axx.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 163
	//	               2 154
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 163
	//	               2 154
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #47  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #48  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #54  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #56  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/awx;
	//   19   71:ldc1            #2   <Class awx>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #56  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzfxr)))));
	//   27   84:new             #58  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #24  <Field awx zzfxr>
	//   30   91:invokespecial   #61  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #56  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/awx;
	//   34   99:ldc1            #2   <Class awx>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/awx;
	//   39  105:ldc1            #2   <Class awx>
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
		return ((Object) (zzfxr));
	//   45  112:getstatic       #24  <Field awx zzfxr>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzfxr)), "\001\004\000\001\001\004\004\000\000\000\001\b\000\002\b\001\003\b\002\004\004\003", new Object[] {
			"zzccg", "zzfxn", "zzfxo", "zzfxp", "zzfxq"
		});
	//   47  116:getstatic       #24  <Field awx zzfxr>
	//   48  119:ldc1            #63  <String "\001\004\000\001\001\004\004\000\000\000\001\b\000\002\b\001\003\b\002\004\004\003">
	//   49  121:iconst_5        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #66  <String "zzccg">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #67  <String "zzfxn">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #68  <String "zzfxo">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #69  <String "zzfxp">
	//   66  144:aastore         
	//   67  145:dup             
	//   68  146:iconst_4        
	//   69  147:ldc1            #70  <String "zzfxq">
	//   70  149:aastore         
	//   71  150:invokestatic    #73  <Method Object a(atv, String, Object[])>
	//   72  153:areturn         
_L3:
		return ((Object) (new awy(((axx) (null)))));
	//   73  154:new             #75  <Class awy>
	//   74  157:dup             
	//   75  158:aconst_null     
	//   76  159:invokespecial   #78  <Method void awy(axx)>
	//   77  162:areturn         
_L2:
		return ((Object) (new awx()));
	//   78  163:new             #2   <Class awx>
	//   79  166:dup             
	//   80  167:invokespecial   #22  <Method void awx()>
	//   81  170:areturn         
	}

	private static volatile aug zzcas;
	private static final awx zzfxr;
	private int zzccg;
	private String zzfxn;
	private String zzfxo;
	private String zzfxp;
	private int zzfxq;

	static 
	{
		zzfxr = new awx();
	//    0    0:new             #2   <Class awx>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void awx()>
	//    3    7:putstatic       #24  <Field awx zzfxr>
		ash.a(com/google/android/gms/internal/ads/awx, ((ash) (zzfxr)));
	//    4   10:ldc1            #2   <Class awx>
	//    5   12:getstatic       #24  <Field awx zzfxr>
	//    6   15:invokestatic    #28  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
