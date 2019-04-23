// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			br, dj, ip, bt, 
//			ie, id, ds

public final class ic extends br
	implements dj
{

	private ic()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void br()>
		zzbgt = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #33  <String "">
	//    4    7:putfield        #35  <Field String zzbgt>
		zzbgv = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #33  <String "">
	//    7   13:putfield        #37  <Field String zzbgv>
		zzbgw = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #33  <String "">
	//   10   19:putfield        #39  <Field String zzbgw>
		zzsx = "";
	//   11   22:aload_0         
	//   12   23:ldc1            #33  <String "">
	//   13   25:putfield        #41  <Field String zzsx>
	//   14   28:return          
	}

	static ic a()
	{
		return zzbgx;
	//    0    0:getstatic       #25  <Field ic zzbgx>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		ip.a[i - 1];
	//    0    0:getstatic       #48  <Field int[] ip.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 178
	//	               2 169
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 178
	//	               2 169
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #50  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #51  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #57  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #59  <Field ds zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/ic;
	//   19   71:ldc1            #2   <Class ic>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #59  <Field ds zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new bt(((br) (zzbgx)))));
	//   27   84:new             #61  <Class bt>
	//   28   87:dup             
	//   29   88:getstatic       #25  <Field ic zzbgx>
	//   30   91:invokespecial   #64  <Method void bt(br)>
	//   31   94:astore_2        
		zzbg = ((ds) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #59  <Field ds zzbg>
_L12:
		com/google/android/gms/internal/clearcut/ic;
	//   34   99:ldc1            #2   <Class ic>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/ic;
	//   39  105:ldc1            #2   <Class ic>
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
		return ((Object) (zzbgx));
	//   45  112:getstatic       #25  <Field ic zzbgx>
	//   46  115:areturn         
_L4:
		obj = ((Object) (ie.b()));
	//   47  116:invokestatic    #70  <Method cc ie.b()>
	//   48  119:astore_2        
		return a(((dh) (zzbgx)), "\001\005\000\001\001\005\005\006\000\000\000\001\b\000\002\f\001\003\b\002\004\b\003\005\b\004", new Object[] {
			"zzbb", "zzbgt", "zzbgu", obj, "zzbgv", "zzbgw", "zzsx"
		});
	//   49  120:getstatic       #25  <Field ic zzbgx>
	//   50  123:ldc1            #72  <String "\001\005\000\001\001\005\005\006\000\000\000\001\b\000\002\f\001\003\b\002\004\b\003\005\b\004">
	//   51  125:bipush          7
	//   52  127:anewarray       Object[]
	//   53  130:dup             
	//   54  131:iconst_0        
	//   55  132:ldc1            #75  <String "zzbb">
	//   56  134:aastore         
	//   57  135:dup             
	//   58  136:iconst_1        
	//   59  137:ldc1            #76  <String "zzbgt">
	//   60  139:aastore         
	//   61  140:dup             
	//   62  141:iconst_2        
	//   63  142:ldc1            #77  <String "zzbgu">
	//   64  144:aastore         
	//   65  145:dup             
	//   66  146:iconst_3        
	//   67  147:aload_2         
	//   68  148:aastore         
	//   69  149:dup             
	//   70  150:iconst_4        
	//   71  151:ldc1            #78  <String "zzbgv">
	//   72  153:aastore         
	//   73  154:dup             
	//   74  155:iconst_5        
	//   75  156:ldc1            #79  <String "zzbgw">
	//   76  158:aastore         
	//   77  159:dup             
	//   78  160:bipush          6
	//   79  162:ldc1            #80  <String "zzsx">
	//   80  164:aastore         
	//   81  165:invokestatic    #83  <Method Object a(dh, String, Object[])>
	//   82  168:areturn         
_L3:
		return ((Object) (new id(((ip) (null)))));
	//   83  169:new             #85  <Class id>
	//   84  172:dup             
	//   85  173:aconst_null     
	//   86  174:invokespecial   #88  <Method void id(ip)>
	//   87  177:areturn         
_L2:
		return ((Object) (new ic()));
	//   88  178:new             #2   <Class ic>
	//   89  181:dup             
	//   90  182:invokespecial   #23  <Method void ic()>
	//   91  185:areturn         
	}

	private static volatile ds zzbg;
	private static final ic zzbgx;
	private int zzbb;
	private String zzbgt;
	private int zzbgu;
	private String zzbgv;
	private String zzbgw;
	private String zzsx;

	static 
	{
		zzbgx = new ic();
	//    0    0:new             #2   <Class ic>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void ic()>
	//    3    7:putstatic       #25  <Field ic zzbgx>
		br.a(com/google/android/gms/internal/clearcut/ic, ((br) (zzbgx)));
	//    4   10:ldc1            #2   <Class ic>
	//    5   12:getstatic       #25  <Field ic zzbgx>
	//    6   15:invokestatic    #29  <Method void br.a(Class, br)>
	//*   7   18:return          
	}
}
