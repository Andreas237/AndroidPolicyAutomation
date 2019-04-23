// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, aqq, axx, 
//			asj, axq, axp, aug

public final class axo extends ash
	implements atx
{

	private axo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void ash()>
		zzfzi = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #32  <String "">
	//    4    7:putfield        #34  <Field String zzfzi>
		zzfzj = aqq.a;
	//    5   10:aload_0         
	//    6   11:getstatic       #38  <Field aqq aqq.a>
	//    7   14:putfield        #40  <Field aqq zzfzj>
	//    8   17:return          
	}

	static axo a()
	{
		return zzfzk;
	//    0    0:getstatic       #24  <Field axo zzfzk>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		axx.a[i - 1];
	//    0    0:getstatic       #47  <Field int[] axx.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 166
	//	               2 157
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 166
	//	               2 157
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #49  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #50  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #56  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #58  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/axo;
	//   19   71:ldc1            #2   <Class axo>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #58  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzfzk)))));
	//   27   84:new             #60  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #24  <Field axo zzfzk>
	//   30   91:invokespecial   #63  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #58  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/axo;
	//   34   99:ldc1            #2   <Class axo>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/axo;
	//   39  105:ldc1            #2   <Class axo>
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
		return ((Object) (zzfzk));
	//   45  112:getstatic       #24  <Field axo zzfzk>
	//   46  115:areturn         
_L4:
		obj = ((Object) (axq.b()));
	//   47  116:invokestatic    #69  <Method asr axq.b()>
	//   48  119:astore_2        
		return a(((atv) (zzfzk)), "\001\003\000\001\001\003\003\000\000\000\001\f\000\002\b\001\003\n\002", new Object[] {
			"zzccg", "zzcch", obj, "zzfzi", "zzfzj"
		});
	//   49  120:getstatic       #24  <Field axo zzfzk>
	//   50  123:ldc1            #71  <String "\001\003\000\001\001\003\003\000\000\000\001\f\000\002\b\001\003\n\002">
	//   51  125:iconst_5        
	//   52  126:anewarray       Object[]
	//   53  129:dup             
	//   54  130:iconst_0        
	//   55  131:ldc1            #74  <String "zzccg">
	//   56  133:aastore         
	//   57  134:dup             
	//   58  135:iconst_1        
	//   59  136:ldc1            #75  <String "zzcch">
	//   60  138:aastore         
	//   61  139:dup             
	//   62  140:iconst_2        
	//   63  141:aload_2         
	//   64  142:aastore         
	//   65  143:dup             
	//   66  144:iconst_3        
	//   67  145:ldc1            #76  <String "zzfzi">
	//   68  147:aastore         
	//   69  148:dup             
	//   70  149:iconst_4        
	//   71  150:ldc1            #77  <String "zzfzj">
	//   72  152:aastore         
	//   73  153:invokestatic    #80  <Method Object a(atv, String, Object[])>
	//   74  156:areturn         
_L3:
		return ((Object) (new axp(((axx) (null)))));
	//   75  157:new             #82  <Class axp>
	//   76  160:dup             
	//   77  161:aconst_null     
	//   78  162:invokespecial   #85  <Method void axp(axx)>
	//   79  165:areturn         
_L2:
		return ((Object) (new axo()));
	//   80  166:new             #2   <Class axo>
	//   81  169:dup             
	//   82  170:invokespecial   #22  <Method void axo()>
	//   83  173:areturn         
	}

	private static volatile aug zzcas;
	private static final axo zzfzk;
	private int zzccg;
	private int zzcch;
	private String zzfzi;
	private aqq zzfzj;

	static 
	{
		zzfzk = new axo();
	//    0    0:new             #2   <Class axo>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void axo()>
	//    3    7:putstatic       #24  <Field axo zzfzk>
		ash.a(com/google/android/gms/internal/ads/axo, ((ash) (zzfzk)));
	//    4   10:ldc1            #2   <Class axo>
	//    5   12:getstatic       #24  <Field axo zzfzk>
	//    6   15:invokestatic    #28  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
