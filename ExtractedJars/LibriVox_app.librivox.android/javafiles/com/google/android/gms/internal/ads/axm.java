// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, aqq, asm, 
//			aug, axx, asj, axn

public final class axm extends ash
	implements atx
{

	private axm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void ash()>
		zzfzg = aqq.a;
	//    2    4:aload_0         
	//    3    5:getstatic       #33  <Field aqq aqq.a>
	//    4    8:putfield        #35  <Field aqq zzfzg>
		zzfza = aqq.a;
	//    5   11:aload_0         
	//    6   12:getstatic       #33  <Field aqq aqq.a>
	//    7   15:putfield        #37  <Field aqq zzfza>
	//    8   18:return          
	}

	public static aug a()
	{
		return (aug)((ash) (zzfzh)).a(asm.g, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #23  <Field axm zzfzh>
	//    1    3:getstatic       #43  <Field int asm.g>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #46  <Method Object ash.a(int, Object, Object)>
	//    5   11:checkcast       #48  <Class aug>
	//    6   14:areturn         
	}

	static axm b()
	{
		return zzfzh;
	//    0    0:getstatic       #23  <Field axm zzfzh>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		axx.a[i - 1];
	//    0    0:getstatic       #55  <Field int[] axx.a>
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
	//    6   48:new             #57  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #58  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #64  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #66  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/axm;
	//   19   71:ldc1            #2   <Class axm>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #66  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzfzh)))));
	//   27   84:new             #68  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #23  <Field axm zzfzh>
	//   30   91:invokespecial   #71  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #66  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/axm;
	//   34   99:ldc1            #2   <Class axm>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/axm;
	//   39  105:ldc1            #2   <Class axm>
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
		return ((Object) (zzfzh));
	//   45  112:getstatic       #23  <Field axm zzfzh>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzfzh)), "\001\003\000\001\001\003\003\000\000\000\001\004\000\002\n\001\003\n\002", new Object[] {
			"zzccg", "zzfzf", "zzfzg", "zzfza"
		});
	//   47  116:getstatic       #23  <Field axm zzfzh>
	//   48  119:ldc1            #73  <String "\001\003\000\001\001\003\003\000\000\000\001\004\000\002\n\001\003\n\002">
	//   49  121:iconst_4        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #76  <String "zzccg">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #77  <String "zzfzf">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #78  <String "zzfzg">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #79  <String "zzfza">
	//   66  144:aastore         
	//   67  145:invokestatic    #82  <Method Object a(atv, String, Object[])>
	//   68  148:areturn         
_L3:
		return ((Object) (new axn(((axx) (null)))));
	//   69  149:new             #84  <Class axn>
	//   70  152:dup             
	//   71  153:aconst_null     
	//   72  154:invokespecial   #87  <Method void axn(axx)>
	//   73  157:areturn         
_L2:
		return ((Object) (new axm()));
	//   74  158:new             #2   <Class axm>
	//   75  161:dup             
	//   76  162:invokespecial   #21  <Method void axm()>
	//   77  165:areturn         
	}

	private static volatile aug zzcas;
	private static final axm zzfzh;
	private int zzccg;
	private aqq zzfza;
	private int zzfzf;
	private aqq zzfzg;

	static 
	{
		zzfzh = new axm();
	//    0    0:new             #2   <Class axm>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void axm()>
	//    3    7:putstatic       #23  <Field axm zzfzh>
		ash.a(com/google/android/gms/internal/ads/axm, ((ash) (zzfzh)));
	//    4   10:ldc1            #2   <Class axm>
	//    5   12:getstatic       #23  <Field axm zzfzh>
	//    6   15:invokestatic    #27  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
