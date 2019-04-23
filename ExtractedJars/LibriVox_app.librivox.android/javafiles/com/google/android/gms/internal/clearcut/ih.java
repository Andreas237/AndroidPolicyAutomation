// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			br, dj, ip, bt, 
//			ij, hu, ii, ds

public final class ih extends br
	implements dj
{

	private ih()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void br()>
		zzzh = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #31  <String "">
	//    4    7:putfield        #33  <Field String zzzh>
		zzzg = -1;
	//    5   10:aload_0         
	//    6   11:iconst_m1       
	//    7   12:putfield        #35  <Field int zzzg>
	//    8   15:return          
	}

	static ih a()
	{
		return zzbhj;
	//    0    0:getstatic       #23  <Field ih zzbhj>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		ip.a[i - 1];
	//    0    0:getstatic       #42  <Field int[] ip.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 175
	//	               2 166
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 175
	//	               2 166
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
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #53  <Field ds zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/ih;
	//   19   71:ldc1            #2   <Class ih>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #53  <Field ds zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new bt(((br) (zzbhj)))));
	//   27   84:new             #55  <Class bt>
	//   28   87:dup             
	//   29   88:getstatic       #23  <Field ih zzbhj>
	//   30   91:invokespecial   #58  <Method void bt(br)>
	//   31   94:astore_2        
		zzbg = ((ds) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #53  <Field ds zzbg>
_L12:
		com/google/android/gms/internal/clearcut/ih;
	//   34   99:ldc1            #2   <Class ih>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/ih;
	//   39  105:ldc1            #2   <Class ih>
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
		return ((Object) (zzbhj));
	//   45  112:getstatic       #23  <Field ih zzbhj>
	//   46  115:areturn         
_L4:
		obj = ((Object) (ij.b()));
	//   47  116:invokestatic    #64  <Method cc ij.b()>
	//   48  119:astore_2        
		obj1 = ((Object) (hu.b()));
	//   49  120:invokestatic    #67  <Method cc hu.b()>
	//   50  123:astore_3        
		return a(((dh) (zzbhj)), "\001\003\000\001\001\003\003\004\000\000\000\001\b\000\002\f\001\003\f\002", new Object[] {
			"zzbb", "zzzh", "zzzm", obj, "zzzg", obj1
		});
	//   51  124:getstatic       #23  <Field ih zzbhj>
	//   52  127:ldc1            #69  <String "\001\003\000\001\001\003\003\004\000\000\000\001\b\000\002\f\001\003\f\002">
	//   53  129:bipush          6
	//   54  131:anewarray       Object[]
	//   55  134:dup             
	//   56  135:iconst_0        
	//   57  136:ldc1            #72  <String "zzbb">
	//   58  138:aastore         
	//   59  139:dup             
	//   60  140:iconst_1        
	//   61  141:ldc1            #73  <String "zzzh">
	//   62  143:aastore         
	//   63  144:dup             
	//   64  145:iconst_2        
	//   65  146:ldc1            #74  <String "zzzm">
	//   66  148:aastore         
	//   67  149:dup             
	//   68  150:iconst_3        
	//   69  151:aload_2         
	//   70  152:aastore         
	//   71  153:dup             
	//   72  154:iconst_4        
	//   73  155:ldc1            #75  <String "zzzg">
	//   74  157:aastore         
	//   75  158:dup             
	//   76  159:iconst_5        
	//   77  160:aload_3         
	//   78  161:aastore         
	//   79  162:invokestatic    #78  <Method Object a(dh, String, Object[])>
	//   80  165:areturn         
_L3:
		return ((Object) (new ii(((ip) (null)))));
	//   81  166:new             #80  <Class ii>
	//   82  169:dup             
	//   83  170:aconst_null     
	//   84  171:invokespecial   #83  <Method void ii(ip)>
	//   85  174:areturn         
_L2:
		return ((Object) (new ih()));
	//   86  175:new             #2   <Class ih>
	//   87  178:dup             
	//   88  179:invokespecial   #21  <Method void ih()>
	//   89  182:areturn         
	}

	private static volatile ds zzbg;
	private static final ih zzbhj;
	private int zzbb;
	private int zzzg;
	private String zzzh;
	private int zzzm;

	static 
	{
		zzbhj = new ih();
	//    0    0:new             #2   <Class ih>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void ih()>
	//    3    7:putstatic       #23  <Field ih zzbhj>
		br.a(com/google/android/gms/internal/clearcut/ih, ((br) (zzbhj)));
	//    4   10:ldc1            #2   <Class ih>
	//    5   12:getstatic       #23  <Field ih zzbhj>
	//    6   15:invokestatic    #27  <Method void br.a(Class, br)>
	//*   7   18:return          
	}
}
