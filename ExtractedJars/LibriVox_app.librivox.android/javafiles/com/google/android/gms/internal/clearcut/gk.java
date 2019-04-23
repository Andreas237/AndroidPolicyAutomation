// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			br, dj, ip, bt, 
//			gl, ds

public final class gk extends br
	implements dj
{

	private gk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void br()>
	//    2    4:return          
	}

	static gk a()
	{
		return zztt;
	//    0    0:getstatic       #22  <Field gk zztt>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		ip.a[i - 1];
	//    0    0:getstatic       #35  <Field int[] ip.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 153
	//	               2 144
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 153
	//	               2 144
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #37  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #38  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #44  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #46  <Field ds zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/gk;
	//   19   71:ldc1            #2   <Class gk>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #46  <Field ds zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new bt(((br) (zztt)))));
	//   27   84:new             #48  <Class bt>
	//   28   87:dup             
	//   29   88:getstatic       #22  <Field gk zztt>
	//   30   91:invokespecial   #51  <Method void bt(br)>
	//   31   94:astore_2        
		zzbg = ((ds) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #46  <Field ds zzbg>
_L12:
		com/google/android/gms/internal/clearcut/gk;
	//   34   99:ldc1            #2   <Class gk>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/gk;
	//   39  105:ldc1            #2   <Class gk>
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
		return ((Object) (zztt));
	//   45  112:getstatic       #22  <Field gk zztt>
	//   46  115:areturn         
_L4:
		return a(((dh) (zztt)), "\001\002\000\001\001\002\002\003\000\000\000\001\007\000\002\007\001", new Object[] {
			"zzbb", "zztr", "zzts"
		});
	//   47  116:getstatic       #22  <Field gk zztt>
	//   48  119:ldc1            #53  <String "\001\002\000\001\001\002\002\003\000\000\000\001\007\000\002\007\001">
	//   49  121:iconst_3        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #56  <String "zzbb">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #57  <String "zztr">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #58  <String "zzts">
	//   62  139:aastore         
	//   63  140:invokestatic    #61  <Method Object a(dh, String, Object[])>
	//   64  143:areturn         
_L3:
		return ((Object) (new gl(((ip) (null)))));
	//   65  144:new             #63  <Class gl>
	//   66  147:dup             
	//   67  148:aconst_null     
	//   68  149:invokespecial   #66  <Method void gl(ip)>
	//   69  152:areturn         
_L2:
		return ((Object) (new gk()));
	//   70  153:new             #2   <Class gk>
	//   71  156:dup             
	//   72  157:invokespecial   #20  <Method void gk()>
	//   73  160:areturn         
	}

	private static volatile ds zzbg;
	private static final gk zztt;
	private int zzbb;
	private boolean zztr;
	private boolean zzts;

	static 
	{
		zztt = new gk();
	//    0    0:new             #2   <Class gk>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void gk()>
	//    3    7:putstatic       #22  <Field gk zztt>
		br.a(com/google/android/gms/internal/clearcut/gk, ((br) (zztt)));
	//    4   10:ldc1            #2   <Class gk>
	//    5   12:getstatic       #22  <Field gk zztt>
	//    6   15:invokestatic    #26  <Method void br.a(Class, br)>
	//*   7   18:return          
	}
}
