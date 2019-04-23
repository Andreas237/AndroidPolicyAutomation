// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, axx, asj, 
//			axw, aug

public final class axv extends ash
	implements atx
{

	private axv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void ash()>
		zzgan = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #33  <String "">
	//    4    7:putfield        #35  <Field String zzgan>
	//    5   10:return          
	}

	static axv a()
	{
		return zzgaq;
	//    0    0:getstatic       #25  <Field axv zzgaq>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		axx.a[i - 1];
	//    0    0:getstatic       #42  <Field int[] axx.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 158
	//	               2 149
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 158
	//	               2 149
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #44  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #45  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #51  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #53  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/axv;
	//   19   71:ldc1            #2   <Class axv>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #53  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzgaq)))));
	//   27   84:new             #55  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #25  <Field axv zzgaq>
	//   30   91:invokespecial   #58  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #53  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/axv;
	//   34   99:ldc1            #2   <Class axv>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/axv;
	//   39  105:ldc1            #2   <Class axv>
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
		return ((Object) (zzgaq));
	//   45  112:getstatic       #25  <Field axv zzgaq>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzgaq)), "\001\003\000\001\001\003\003\000\000\000\001\b\000\002\002\001\003\007\002", new Object[] {
			"zzccg", "zzgan", "zzgao", "zzgap"
		});
	//   47  116:getstatic       #25  <Field axv zzgaq>
	//   48  119:ldc1            #60  <String "\001\003\000\001\001\003\003\000\000\000\001\b\000\002\002\001\003\007\002">
	//   49  121:iconst_4        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #63  <String "zzccg">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #64  <String "zzgan">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #65  <String "zzgao">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #66  <String "zzgap">
	//   66  144:aastore         
	//   67  145:invokestatic    #69  <Method Object a(atv, String, Object[])>
	//   68  148:areturn         
_L3:
		return ((Object) (new axw(((axx) (null)))));
	//   69  149:new             #71  <Class axw>
	//   70  152:dup             
	//   71  153:aconst_null     
	//   72  154:invokespecial   #74  <Method void axw(axx)>
	//   73  157:areturn         
_L2:
		return ((Object) (new axv()));
	//   74  158:new             #2   <Class axv>
	//   75  161:dup             
	//   76  162:invokespecial   #23  <Method void axv()>
	//   77  165:areturn         
	}

	private static volatile aug zzcas;
	private static final axv zzgaq;
	private int zzccg;
	private String zzgan;
	private long zzgao;
	private boolean zzgap;

	static 
	{
		zzgaq = new axv();
	//    0    0:new             #2   <Class axv>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void axv()>
	//    3    7:putstatic       #25  <Field axv zzgaq>
		ash.a(com/google/android/gms/internal/ads/axv, ((ash) (zzgaq)));
	//    4   10:ldc1            #2   <Class axv>
	//    5   12:getstatic       #25  <Field axv zzgaq>
	//    6   15:invokestatic    #29  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
