// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			br, dj, ip, bt, 
//			hl, hm, hk, ds

public final class hj extends br
	implements dj
{

	private hj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void br()>
		zzvz = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #35  <String "">
	//    4    7:putfield        #37  <Field String zzvz>
		zzxb = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #35  <String "">
	//    7   13:putfield        #39  <Field String zzxb>
		zzsz = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #35  <String "">
	//   10   19:putfield        #41  <Field String zzsz>
		zzsy = "";
	//   11   22:aload_0         
	//   12   23:ldc1            #35  <String "">
	//   13   25:putfield        #43  <Field String zzsy>
		zztz = "";
	//   14   28:aload_0         
	//   15   29:ldc1            #35  <String "">
	//   16   31:putfield        #45  <Field String zztz>
	//   17   34:return          
	}

	static hj a()
	{
		return zzxe;
	//    0    0:getstatic       #27  <Field hj zzxe>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		ip.a[i - 1];
	//    0    0:getstatic       #52  <Field int[] ip.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 199
	//	               2 190
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 199
	//	               2 190
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #54  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #55  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #61  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #63  <Field ds zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/hj;
	//   19   71:ldc1            #2   <Class hj>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #63  <Field ds zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new bt(((br) (zzxe)))));
	//   27   84:new             #65  <Class bt>
	//   28   87:dup             
	//   29   88:getstatic       #27  <Field hj zzxe>
	//   30   91:invokespecial   #68  <Method void bt(br)>
	//   31   94:astore_2        
		zzbg = ((ds) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #63  <Field ds zzbg>
_L12:
		com/google/android/gms/internal/clearcut/hj;
	//   34   99:ldc1            #2   <Class hj>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/hj;
	//   39  105:ldc1            #2   <Class hj>
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
		return ((Object) (zzxe));
	//   45  112:getstatic       #27  <Field hj zzxe>
	//   46  115:areturn         
_L4:
		obj = ((Object) (hl.b()));
	//   47  116:invokestatic    #74  <Method cc hl.b()>
	//   48  119:astore_2        
		obj1 = ((Object) (hm.b()));
	//   49  120:invokestatic    #77  <Method cc hm.b()>
	//   50  123:astore_3        
		return a(((dh) (zzxe)), "\001\007\000\001\001\007\007\b\000\000\000\001\b\000\002\b\001\003\f\002\004\b\003\005\b\004\006\f\005\007\b\006", new Object[] {
			"zzbb", "zzvz", "zzxb", "zzxc", obj, "zzsz", "zzsy", "zzxd", obj1, "zztz"
		});
	//   51  124:getstatic       #27  <Field hj zzxe>
	//   52  127:ldc1            #79  <String "\001\007\000\001\001\007\007\b\000\000\000\001\b\000\002\b\001\003\f\002\004\b\003\005\b\004\006\f\005\007\b\006">
	//   53  129:bipush          10
	//   54  131:anewarray       Object[]
	//   55  134:dup             
	//   56  135:iconst_0        
	//   57  136:ldc1            #82  <String "zzbb">
	//   58  138:aastore         
	//   59  139:dup             
	//   60  140:iconst_1        
	//   61  141:ldc1            #83  <String "zzvz">
	//   62  143:aastore         
	//   63  144:dup             
	//   64  145:iconst_2        
	//   65  146:ldc1            #84  <String "zzxb">
	//   66  148:aastore         
	//   67  149:dup             
	//   68  150:iconst_3        
	//   69  151:ldc1            #85  <String "zzxc">
	//   70  153:aastore         
	//   71  154:dup             
	//   72  155:iconst_4        
	//   73  156:aload_2         
	//   74  157:aastore         
	//   75  158:dup             
	//   76  159:iconst_5        
	//   77  160:ldc1            #86  <String "zzsz">
	//   78  162:aastore         
	//   79  163:dup             
	//   80  164:bipush          6
	//   81  166:ldc1            #87  <String "zzsy">
	//   82  168:aastore         
	//   83  169:dup             
	//   84  170:bipush          7
	//   85  172:ldc1            #88  <String "zzxd">
	//   86  174:aastore         
	//   87  175:dup             
	//   88  176:bipush          8
	//   89  178:aload_3         
	//   90  179:aastore         
	//   91  180:dup             
	//   92  181:bipush          9
	//   93  183:ldc1            #89  <String "zztz">
	//   94  185:aastore         
	//   95  186:invokestatic    #92  <Method Object a(dh, String, Object[])>
	//   96  189:areturn         
_L3:
		return ((Object) (new hk(((ip) (null)))));
	//   97  190:new             #94  <Class hk>
	//   98  193:dup             
	//   99  194:aconst_null     
	//  100  195:invokespecial   #97  <Method void hk(ip)>
	//  101  198:areturn         
_L2:
		return ((Object) (new hj()));
	//  102  199:new             #2   <Class hj>
	//  103  202:dup             
	//  104  203:invokespecial   #25  <Method void hj()>
	//  105  206:areturn         
	}

	private static volatile ds zzbg;
	private static final hj zzxe;
	private int zzbb;
	private String zzsy;
	private String zzsz;
	private String zztz;
	private String zzvz;
	private String zzxb;
	private int zzxc;
	private int zzxd;

	static 
	{
		zzxe = new hj();
	//    0    0:new             #2   <Class hj>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void hj()>
	//    3    7:putstatic       #27  <Field hj zzxe>
		br.a(com/google/android/gms/internal/clearcut/hj, ((br) (zzxe)));
	//    4   10:ldc1            #2   <Class hj>
	//    5   12:getstatic       #27  <Field hj zzxe>
	//    6   15:invokestatic    #31  <Method void br.a(Class, br)>
	//*   7   18:return          
	}
}
