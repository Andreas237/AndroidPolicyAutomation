// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			br, dj, ip, bt, 
//			hb, hc, ds

public final class ha extends br
	implements dj
{

	private ha()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void br()>
	//    2    4:return          
	}

	static ha a()
	{
		return zzwj;
	//    0    0:getstatic       #24  <Field ha zzwj>
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
	//	               1 172
	//	               2 163
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 172
	//	               2 163
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
		com/google/android/gms/internal/clearcut/ha;
	//   19   71:ldc1            #2   <Class ha>
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
		obj = ((Object) (new bt(((br) (zzwj)))));
	//   27   84:new             #50  <Class bt>
	//   28   87:dup             
	//   29   88:getstatic       #24  <Field ha zzwj>
	//   30   91:invokespecial   #53  <Method void bt(br)>
	//   31   94:astore_2        
		zzbg = ((ds) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #48  <Field ds zzbg>
_L12:
		com/google/android/gms/internal/clearcut/ha;
	//   34   99:ldc1            #2   <Class ha>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/ha;
	//   39  105:ldc1            #2   <Class ha>
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
		return ((Object) (zzwj));
	//   45  112:getstatic       #24  <Field ha zzwj>
	//   46  115:areturn         
_L4:
		obj = ((Object) (hb.b()));
	//   47  116:invokestatic    #59  <Method cc hb.b()>
	//   48  119:astore_2        
		return a(((dh) (zzwj)), "\001\004\000\001\001\004\004\005\000\000\000\001\007\000\002\007\001\003\f\002\004\007\003", new Object[] {
			"zzbb", "zzwf", "zzwg", "zzwh", obj, "zzwi"
		});
	//   49  120:getstatic       #24  <Field ha zzwj>
	//   50  123:ldc1            #61  <String "\001\004\000\001\001\004\004\005\000\000\000\001\007\000\002\007\001\003\f\002\004\007\003">
	//   51  125:bipush          6
	//   52  127:anewarray       Object[]
	//   53  130:dup             
	//   54  131:iconst_0        
	//   55  132:ldc1            #64  <String "zzbb">
	//   56  134:aastore         
	//   57  135:dup             
	//   58  136:iconst_1        
	//   59  137:ldc1            #65  <String "zzwf">
	//   60  139:aastore         
	//   61  140:dup             
	//   62  141:iconst_2        
	//   63  142:ldc1            #66  <String "zzwg">
	//   64  144:aastore         
	//   65  145:dup             
	//   66  146:iconst_3        
	//   67  147:ldc1            #67  <String "zzwh">
	//   68  149:aastore         
	//   69  150:dup             
	//   70  151:iconst_4        
	//   71  152:aload_2         
	//   72  153:aastore         
	//   73  154:dup             
	//   74  155:iconst_5        
	//   75  156:ldc1            #68  <String "zzwi">
	//   76  158:aastore         
	//   77  159:invokestatic    #71  <Method Object a(dh, String, Object[])>
	//   78  162:areturn         
_L3:
		return ((Object) (new hc(((ip) (null)))));
	//   79  163:new             #73  <Class hc>
	//   80  166:dup             
	//   81  167:aconst_null     
	//   82  168:invokespecial   #76  <Method void hc(ip)>
	//   83  171:areturn         
_L2:
		return ((Object) (new ha()));
	//   84  172:new             #2   <Class ha>
	//   85  175:dup             
	//   86  176:invokespecial   #22  <Method void ha()>
	//   87  179:areturn         
	}

	private static volatile ds zzbg;
	private static final ha zzwj;
	private int zzbb;
	private boolean zzwf;
	private boolean zzwg;
	private int zzwh;
	private boolean zzwi;

	static 
	{
		zzwj = new ha();
	//    0    0:new             #2   <Class ha>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void ha()>
	//    3    7:putstatic       #24  <Field ha zzwj>
		br.a(com/google/android/gms/internal/clearcut/ha, ((br) (zzwj)));
	//    4   10:ldc1            #2   <Class ha>
	//    5   12:getstatic       #24  <Field ha zzwj>
	//    6   15:invokestatic    #28  <Method void br.a(Class, br)>
	//*   7   18:return          
	}
}
