// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			br, dj, ip, bt, 
//			ib, ia, hz, ds

public final class hy extends br
	implements dj
{

	private hy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void br()>
		zzbfa = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #29  <Field int zzbfa>
	//    5    9:return          
	}

	static hy a()
	{
		return zzbfc;
	//    0    0:getstatic       #21  <Field hy zzbfc>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		ip.a[i - 1];
	//    0    0:getstatic       #36  <Field int[] ip.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 169
	//	               2 160
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 169
	//	               2 160
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #38  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #39  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #45  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #47  <Field ds zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/hy;
	//   19   71:ldc1            #2   <Class hy>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #47  <Field ds zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new bt(((br) (zzbfc)))));
	//   27   84:new             #49  <Class bt>
	//   28   87:dup             
	//   29   88:getstatic       #21  <Field hy zzbfc>
	//   30   91:invokespecial   #52  <Method void bt(br)>
	//   31   94:astore_2        
		zzbg = ((ds) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #47  <Field ds zzbg>
_L12:
		com/google/android/gms/internal/clearcut/hy;
	//   34   99:ldc1            #2   <Class hy>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/hy;
	//   39  105:ldc1            #2   <Class hy>
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
		return ((Object) (zzbfc));
	//   45  112:getstatic       #21  <Field hy zzbfc>
	//   46  115:areturn         
_L4:
		obj = ((Object) (ib.b()));
	//   47  116:invokestatic    #58  <Method cc ib.b()>
	//   48  119:astore_2        
		obj1 = ((Object) (ia.b()));
	//   49  120:invokestatic    #61  <Method cc ia.b()>
	//   50  123:astore_3        
		return a(((dh) (zzbfc)), "\001\002\000\001\001\002\002\003\000\000\000\001\f\000\002\f\001", new Object[] {
			"zzbb", "zzbfa", obj, "zzbfb", obj1
		});
	//   51  124:getstatic       #21  <Field hy zzbfc>
	//   52  127:ldc1            #63  <String "\001\002\000\001\001\002\002\003\000\000\000\001\f\000\002\f\001">
	//   53  129:iconst_5        
	//   54  130:anewarray       Object[]
	//   55  133:dup             
	//   56  134:iconst_0        
	//   57  135:ldc1            #66  <String "zzbb">
	//   58  137:aastore         
	//   59  138:dup             
	//   60  139:iconst_1        
	//   61  140:ldc1            #67  <String "zzbfa">
	//   62  142:aastore         
	//   63  143:dup             
	//   64  144:iconst_2        
	//   65  145:aload_2         
	//   66  146:aastore         
	//   67  147:dup             
	//   68  148:iconst_3        
	//   69  149:ldc1            #68  <String "zzbfb">
	//   70  151:aastore         
	//   71  152:dup             
	//   72  153:iconst_4        
	//   73  154:aload_3         
	//   74  155:aastore         
	//   75  156:invokestatic    #71  <Method Object a(dh, String, Object[])>
	//   76  159:areturn         
_L3:
		return ((Object) (new hz(((ip) (null)))));
	//   77  160:new             #73  <Class hz>
	//   78  163:dup             
	//   79  164:aconst_null     
	//   80  165:invokespecial   #76  <Method void hz(ip)>
	//   81  168:areturn         
_L2:
		return ((Object) (new hy()));
	//   82  169:new             #2   <Class hy>
	//   83  172:dup             
	//   84  173:invokespecial   #19  <Method void hy()>
	//   85  176:areturn         
	}

	private static final hy zzbfc;
	private static volatile ds zzbg;
	private int zzbb;
	private int zzbfa;
	private int zzbfb;

	static 
	{
		zzbfc = new hy();
	//    0    0:new             #2   <Class hy>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void hy()>
	//    3    7:putstatic       #21  <Field hy zzbfc>
		br.a(com/google/android/gms/internal/clearcut/hy, ((br) (zzbfc)));
	//    4   10:ldc1            #2   <Class hy>
	//    5   12:getstatic       #21  <Field hy zzbfc>
	//    6   15:invokestatic    #25  <Method void br.a(Class, br)>
	//*   7   18:return          
	}
}
