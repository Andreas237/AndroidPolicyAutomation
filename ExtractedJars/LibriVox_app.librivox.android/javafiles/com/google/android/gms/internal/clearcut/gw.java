// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			br, dj, ip, bt, 
//			gx, ds

public final class gw extends br
	implements dj
{

	private gw()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void br()>
	//    2    4:return          
	}

	static gw a()
	{
		return zzvx;
	//    0    0:getstatic       #24  <Field gw zzvx>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		ip.a[i - 1];
	//    0    0:getstatic       #37  <Field int[] ip.a>
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
	//    6   48:new             #39  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #40  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #46  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #48  <Field ds zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/gw;
	//   19   71:ldc1            #2   <Class gw>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #48  <Field ds zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new bt(((br) (zzvx)))));
	//   27   84:new             #50  <Class bt>
	//   28   87:dup             
	//   29   88:getstatic       #24  <Field gw zzvx>
	//   30   91:invokespecial   #53  <Method void bt(br)>
	//   31   94:astore_2        
		zzbg = ((ds) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #48  <Field ds zzbg>
_L12:
		com/google/android/gms/internal/clearcut/gw;
	//   34   99:ldc1            #2   <Class gw>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/gw;
	//   39  105:ldc1            #2   <Class gw>
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
		return ((Object) (zzvx));
	//   45  112:getstatic       #24  <Field gw zzvx>
	//   46  115:areturn         
_L4:
		return a(((dh) (zzvx)), "\001\003\000\001\001\003\003\004\000\000\000\001\002\001\002\007\002\003\002\0", new Object[] {
			"zzbb", "zzvv", "zzvw", "zzvu"
		});
	//   47  116:getstatic       #24  <Field gw zzvx>
	//   48  119:ldc1            #55  <String "\001\003\000\001\001\003\003\004\000\000\000\001\002\001\002\007\002\003\002\0">
	//   49  121:iconst_4        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #58  <String "zzbb">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #59  <String "zzvv">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #60  <String "zzvw">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #61  <String "zzvu">
	//   66  144:aastore         
	//   67  145:invokestatic    #64  <Method Object a(dh, String, Object[])>
	//   68  148:areturn         
_L3:
		return ((Object) (new gx(((ip) (null)))));
	//   69  149:new             #66  <Class gx>
	//   70  152:dup             
	//   71  153:aconst_null     
	//   72  154:invokespecial   #69  <Method void gx(ip)>
	//   73  157:areturn         
_L2:
		return ((Object) (new gw()));
	//   74  158:new             #2   <Class gw>
	//   75  161:dup             
	//   76  162:invokespecial   #22  <Method void gw()>
	//   77  165:areturn         
	}

	private static volatile ds zzbg;
	private static final gw zzvx;
	private int zzbb;
	private long zzvu;
	private long zzvv;
	private boolean zzvw;

	static 
	{
		zzvx = new gw();
	//    0    0:new             #2   <Class gw>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void gw()>
	//    3    7:putstatic       #24  <Field gw zzvx>
		br.a(com/google/android/gms/internal/clearcut/gw, ((br) (zzvx)));
	//    4   10:ldc1            #2   <Class gw>
	//    5   12:getstatic       #24  <Field gw zzvx>
	//    6   15:invokestatic    #28  <Method void br.a(Class, br)>
	//*   7   18:return          
	}
}
