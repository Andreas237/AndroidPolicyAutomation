// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, anq, asj, 
//			ano, ann, ast, aug

public final class anm extends ash
	implements atx
{

	private anm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void ash()>
		zzfhj = n();
	//    2    4:aload_0         
	//    3    5:invokestatic    #32  <Method ast n()>
	//    4    8:putfield        #34  <Field ast zzfhj>
	//    5   11:return          
	}

	public static anm a(byte abyte0[])
	{
		return (anm)ash.a(((ash) (zzfhk)), abyte0);
	//    0    0:getstatic       #22  <Field anm zzfhk>
	//    1    3:aload_0         
	//    2    4:invokestatic    #38  <Method ash ash.a(ash, byte[])>
	//    3    7:checkcast       #2   <Class anm>
	//    4   10:areturn         
	}

	static anm d()
	{
		return zzfhk;
	//    0    0:getstatic       #22  <Field anm zzfhk>
	//    1    3:areturn         
	}

	public final int a()
	{
		return zzfhi;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int zzfhi>
	//    2    4:ireturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		anq.a[i - 1];
	//    0    0:getstatic       #49  <Field int[] anq.a>
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
	//    6   48:new             #51  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #52  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #58  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #60  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/anm;
	//   19   71:ldc1            #2   <Class anm>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #60  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzfhk)))));
	//   27   84:new             #62  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #22  <Field anm zzfhk>
	//   30   91:invokespecial   #65  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #60  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/anm;
	//   34   99:ldc1            #2   <Class anm>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/anm;
	//   39  105:ldc1            #2   <Class anm>
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
		return ((Object) (zzfhk));
	//   45  112:getstatic       #22  <Field anm zzfhk>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzfhk)), "\000\002\000\001\001\002\002\000\001\000\001\013\002\033", new Object[] {
			"zzccg", "zzfhi", "zzfhj", com/google/android/gms/internal/ads/ano
		});
	//   47  116:getstatic       #22  <Field anm zzfhk>
	//   48  119:ldc1            #67  <String "\000\002\000\001\001\002\002\000\001\000\001\013\002\033">
	//   49  121:iconst_4        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #70  <String "zzccg">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #71  <String "zzfhi">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #72  <String "zzfhj">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #74  <Class ano>
	//   66  144:aastore         
	//   67  145:invokestatic    #77  <Method Object a(atv, String, Object[])>
	//   68  148:areturn         
_L3:
		return ((Object) (new ann(((anq) (null)))));
	//   69  149:new             #79  <Class ann>
	//   70  152:dup             
	//   71  153:aconst_null     
	//   72  154:invokespecial   #82  <Method void ann(anq)>
	//   73  157:areturn         
_L2:
		return ((Object) (new anm()));
	//   74  158:new             #2   <Class anm>
	//   75  161:dup             
	//   76  162:invokespecial   #20  <Method void anm()>
	//   77  165:areturn         
	}

	public final List b()
	{
		return ((List) (zzfhj));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ast zzfhj>
	//    2    4:areturn         
	}

	public final int c()
	{
		return zzfhj.size();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ast zzfhj>
	//    2    4:invokeinterface #90  <Method int ast.size()>
	//    3    9:ireturn         
	}

	private static volatile aug zzcas;
	private static final anm zzfhk;
	private int zzccg;
	private int zzfhi;
	private ast zzfhj;

	static 
	{
		zzfhk = new anm();
	//    0    0:new             #2   <Class anm>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void anm()>
	//    3    7:putstatic       #22  <Field anm zzfhk>
		ash.a(com/google/android/gms/internal/ads/anm, ((ash) (zzfhk)));
	//    4   10:ldc1            #2   <Class anm>
	//    5   12:getstatic       #22  <Field anm zzfhk>
	//    6   15:invokestatic    #26  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
