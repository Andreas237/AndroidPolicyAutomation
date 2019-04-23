// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			br, dj, ip, bt, 
//			gs, ds

public final class gr extends br
	implements dj
{

	private gr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void br()>
		zzsy = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #32  <String "">
	//    4    7:putfield        #34  <Field String zzsy>
		zzui = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #32  <String "">
	//    7   13:putfield        #36  <Field String zzui>
		zzuj = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #32  <String "">
	//   10   19:putfield        #38  <Field String zzuj>
		zzuk = "";
	//   11   22:aload_0         
	//   12   23:ldc1            #32  <String "">
	//   13   25:putfield        #40  <Field String zzuk>
	//   14   28:return          
	}

	static gr a()
	{
		return zzul;
	//    0    0:getstatic       #24  <Field gr zzul>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		ip.a[i - 1];
	//    0    0:getstatic       #47  <Field int[] ip.a>
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
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #58  <Field ds zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/gr;
	//   19   71:ldc1            #2   <Class gr>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #58  <Field ds zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new bt(((br) (zzul)))));
	//   27   84:new             #60  <Class bt>
	//   28   87:dup             
	//   29   88:getstatic       #24  <Field gr zzul>
	//   30   91:invokespecial   #63  <Method void bt(br)>
	//   31   94:astore_2        
		zzbg = ((ds) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #58  <Field ds zzbg>
_L12:
		com/google/android/gms/internal/clearcut/gr;
	//   34   99:ldc1            #2   <Class gr>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/gr;
	//   39  105:ldc1            #2   <Class gr>
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
		return ((Object) (zzul));
	//   45  112:getstatic       #24  <Field gr zzul>
	//   46  115:areturn         
_L4:
		return a(((dh) (zzul)), "\001\004\000\001\001\004\004\005\000\000\000\001\b\000\002\b\001\003\b\002\004\b\003", new Object[] {
			"zzbb", "zzsy", "zzui", "zzuj", "zzuk"
		});
	//   47  116:getstatic       #24  <Field gr zzul>
	//   48  119:ldc1            #65  <String "\001\004\000\001\001\004\004\005\000\000\000\001\b\000\002\b\001\003\b\002\004\b\003">
	//   49  121:iconst_5        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #68  <String "zzbb">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #69  <String "zzsy">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #70  <String "zzui">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #71  <String "zzuj">
	//   66  144:aastore         
	//   67  145:dup             
	//   68  146:iconst_4        
	//   69  147:ldc1            #72  <String "zzuk">
	//   70  149:aastore         
	//   71  150:invokestatic    #75  <Method Object a(dh, String, Object[])>
	//   72  153:areturn         
_L3:
		return ((Object) (new gs(((ip) (null)))));
	//   73  154:new             #77  <Class gs>
	//   74  157:dup             
	//   75  158:aconst_null     
	//   76  159:invokespecial   #80  <Method void gs(ip)>
	//   77  162:areturn         
_L2:
		return ((Object) (new gr()));
	//   78  163:new             #2   <Class gr>
	//   79  166:dup             
	//   80  167:invokespecial   #22  <Method void gr()>
	//   81  170:areturn         
	}

	private static volatile ds zzbg;
	private static final gr zzul;
	private int zzbb;
	private String zzsy;
	private String zzui;
	private String zzuj;
	private String zzuk;

	static 
	{
		zzul = new gr();
	//    0    0:new             #2   <Class gr>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void gr()>
	//    3    7:putstatic       #24  <Field gr zzul>
		br.a(com/google/android/gms/internal/clearcut/gr, ((br) (zzul)));
	//    4   10:ldc1            #2   <Class gr>
	//    5   12:getstatic       #24  <Field gr zzul>
	//    6   15:invokestatic    #28  <Method void br.a(Class, br)>
	//*   7   18:return          
	}
}
