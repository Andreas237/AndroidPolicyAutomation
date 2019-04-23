// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			br, dj, ip, bt, 
//			hx, ds

public final class hw extends br
	implements dj
{

	private hw()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void br()>
		zzwa = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #35  <String "">
	//    4    7:putfield        #37  <Field String zzwa>
		zzwb = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #35  <String "">
	//    7   13:putfield        #39  <Field String zzwb>
		zzsw = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #35  <String "">
	//   10   19:putfield        #41  <Field String zzsw>
		zzsz = "";
	//   11   22:aload_0         
	//   12   23:ldc1            #35  <String "">
	//   13   25:putfield        #43  <Field String zzsz>
		zzwz = "";
	//   14   28:aload_0         
	//   15   29:ldc1            #35  <String "">
	//   16   31:putfield        #45  <Field String zzwz>
	//   17   34:return          
	}

	static hw a()
	{
		return zzbez;
	//    0    0:getstatic       #27  <Field hw zzbez>
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
	//	               1 181
	//	               2 172
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 181
	//	               2 172
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
		com/google/android/gms/internal/clearcut/hw;
	//   19   71:ldc1            #2   <Class hw>
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
		obj = ((Object) (new bt(((br) (zzbez)))));
	//   27   84:new             #65  <Class bt>
	//   28   87:dup             
	//   29   88:getstatic       #27  <Field hw zzbez>
	//   30   91:invokespecial   #68  <Method void bt(br)>
	//   31   94:astore_2        
		zzbg = ((ds) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #63  <Field ds zzbg>
_L12:
		com/google/android/gms/internal/clearcut/hw;
	//   34   99:ldc1            #2   <Class hw>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/hw;
	//   39  105:ldc1            #2   <Class hw>
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
		return ((Object) (zzbez));
	//   45  112:getstatic       #27  <Field hw zzbez>
	//   46  115:areturn         
_L4:
		return a(((dh) (zzbez)), "\001\007\000\001\001\007\007\b\000\000\000\001\b\000\002\b\001\003\b\002\004\b\003\005\004\004\006\004\005\007\b\006", new Object[] {
			"zzbb", "zzwa", "zzwb", "zzsw", "zzsz", "zzwc", "zzwd", "zzwz"
		});
	//   47  116:getstatic       #27  <Field hw zzbez>
	//   48  119:ldc1            #70  <String "\001\007\000\001\001\007\007\b\000\000\000\001\b\000\002\b\001\003\b\002\004\b\003\005\004\004\006\004\005\007\b\006">
	//   49  121:bipush          8
	//   50  123:anewarray       Object[]
	//   51  126:dup             
	//   52  127:iconst_0        
	//   53  128:ldc1            #73  <String "zzbb">
	//   54  130:aastore         
	//   55  131:dup             
	//   56  132:iconst_1        
	//   57  133:ldc1            #74  <String "zzwa">
	//   58  135:aastore         
	//   59  136:dup             
	//   60  137:iconst_2        
	//   61  138:ldc1            #75  <String "zzwb">
	//   62  140:aastore         
	//   63  141:dup             
	//   64  142:iconst_3        
	//   65  143:ldc1            #76  <String "zzsw">
	//   66  145:aastore         
	//   67  146:dup             
	//   68  147:iconst_4        
	//   69  148:ldc1            #77  <String "zzsz">
	//   70  150:aastore         
	//   71  151:dup             
	//   72  152:iconst_5        
	//   73  153:ldc1            #78  <String "zzwc">
	//   74  155:aastore         
	//   75  156:dup             
	//   76  157:bipush          6
	//   77  159:ldc1            #79  <String "zzwd">
	//   78  161:aastore         
	//   79  162:dup             
	//   80  163:bipush          7
	//   81  165:ldc1            #80  <String "zzwz">
	//   82  167:aastore         
	//   83  168:invokestatic    #83  <Method Object a(dh, String, Object[])>
	//   84  171:areturn         
_L3:
		return ((Object) (new hx(((ip) (null)))));
	//   85  172:new             #85  <Class hx>
	//   86  175:dup             
	//   87  176:aconst_null     
	//   88  177:invokespecial   #88  <Method void hx(ip)>
	//   89  180:areturn         
_L2:
		return ((Object) (new hw()));
	//   90  181:new             #2   <Class hw>
	//   91  184:dup             
	//   92  185:invokespecial   #25  <Method void hw()>
	//   93  188:areturn         
	}

	private static final hw zzbez;
	private static volatile ds zzbg;
	private int zzbb;
	private String zzsw;
	private String zzsz;
	private String zzwa;
	private String zzwb;
	private int zzwc;
	private int zzwd;
	private String zzwz;

	static 
	{
		zzbez = new hw();
	//    0    0:new             #2   <Class hw>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void hw()>
	//    3    7:putstatic       #27  <Field hw zzbez>
		br.a(com/google/android/gms/internal/clearcut/hw, ((br) (zzbez)));
	//    4   10:ldc1            #2   <Class hw>
	//    5   12:getstatic       #27  <Field hw zzbez>
	//    6   15:invokestatic    #31  <Method void br.a(Class, br)>
	//*   7   18:return          
	}
}
