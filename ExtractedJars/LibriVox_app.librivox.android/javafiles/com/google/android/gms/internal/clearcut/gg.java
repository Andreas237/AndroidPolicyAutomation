// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			br, dj, ip, bt, 
//			gh, ds, cf, cd, 
//			ce

public final class gg extends br
	implements dj
{

	private gg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void br()>
		zzsh = br.h();
	//    2    4:aload_0         
	//    3    5:invokestatic    #35  <Method cf br.h()>
	//    4    8:putfield        #37  <Field cf zzsh>
		zzsi = br.h();
	//    5   11:aload_0         
	//    6   12:invokestatic    #35  <Method cf br.h()>
	//    7   15:putfield        #39  <Field cf zzsi>
		zzsj = f();
	//    8   18:aload_0         
	//    9   19:invokestatic    #43  <Method cd f()>
	//   10   22:putfield        #45  <Field cd zzsj>
		zzsk = g();
	//   11   25:aload_0         
	//   12   26:invokestatic    #49  <Method ce g()>
	//   13   29:putfield        #51  <Field ce zzsk>
		zzsl = g();
	//   14   32:aload_0         
	//   15   33:invokestatic    #49  <Method ce g()>
	//   16   36:putfield        #53  <Field ce zzsl>
	//   17   39:return          
	}

	static gg a()
	{
		return zzsm;
	//    0    0:getstatic       #25  <Field gg zzsm>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		ip.a[i - 1];
	//    0    0:getstatic       #60  <Field int[] ip.a>
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
	//    6   48:new             #62  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #63  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #69  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #71  <Field ds zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/gg;
	//   19   71:ldc1            #2   <Class gg>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #71  <Field ds zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new bt(((br) (zzsm)))));
	//   27   84:new             #73  <Class bt>
	//   28   87:dup             
	//   29   88:getstatic       #25  <Field gg zzsm>
	//   30   91:invokespecial   #76  <Method void bt(br)>
	//   31   94:astore_2        
		zzbg = ((ds) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #71  <Field ds zzbg>
_L12:
		com/google/android/gms/internal/clearcut/gg;
	//   34   99:ldc1            #2   <Class gg>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/gg;
	//   39  105:ldc1            #2   <Class gg>
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
		return ((Object) (zzsm));
	//   45  112:getstatic       #25  <Field gg zzsm>
	//   46  115:areturn         
_L4:
		return a(((dh) (zzsm)), "\001\005\000\000\001\005\005\006\000\005\000\001\032\002\032\003\026\004\024\005\024", new Object[] {
			"zzsh", "zzsi", "zzsj", "zzsk", "zzsl"
		});
	//   47  116:getstatic       #25  <Field gg zzsm>
	//   48  119:ldc1            #78  <String "\001\005\000\000\001\005\005\006\000\005\000\001\032\002\032\003\026\004\024\005\024">
	//   49  121:iconst_5        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #81  <String "zzsh">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #82  <String "zzsi">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #83  <String "zzsj">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #84  <String "zzsk">
	//   66  144:aastore         
	//   67  145:dup             
	//   68  146:iconst_4        
	//   69  147:ldc1            #85  <String "zzsl">
	//   70  149:aastore         
	//   71  150:invokestatic    #88  <Method Object a(dh, String, Object[])>
	//   72  153:areturn         
_L3:
		return ((Object) (new gh(((ip) (null)))));
	//   73  154:new             #90  <Class gh>
	//   74  157:dup             
	//   75  158:aconst_null     
	//   76  159:invokespecial   #93  <Method void gh(ip)>
	//   77  162:areturn         
_L2:
		return ((Object) (new gg()));
	//   78  163:new             #2   <Class gg>
	//   79  166:dup             
	//   80  167:invokespecial   #23  <Method void gg()>
	//   81  170:areturn         
	}

	private static volatile ds zzbg;
	private static final gg zzsm;
	private cf zzsh;
	private cf zzsi;
	private cd zzsj;
	private ce zzsk;
	private ce zzsl;

	static 
	{
		zzsm = new gg();
	//    0    0:new             #2   <Class gg>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void gg()>
	//    3    7:putstatic       #25  <Field gg zzsm>
		br.a(com/google/android/gms/internal/clearcut/gg, ((br) (zzsm)));
	//    4   10:ldc1            #2   <Class gg>
	//    5   12:getstatic       #25  <Field gg zzsm>
	//    6   15:invokestatic    #29  <Method void br.a(Class, br)>
	//*   7   18:return          
	}
}
