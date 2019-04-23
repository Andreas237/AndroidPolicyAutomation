// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			br, dj, ip, bt, 
//			ig, ds

public final class if extends br
	implements dj
{

	private if()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void br()>
		zzvy = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #35  <String "">
	//    4    7:putfield        #37  <Field String zzvy>
		zzso = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #35  <String "">
	//    7   13:putfield        #39  <Field String zzso>
		zzbhg = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #35  <String "">
	//   10   19:putfield        #41  <Field String zzbhg>
		zzsr = "";
	//   11   22:aload_0         
	//   12   23:ldc1            #35  <String "">
	//   13   25:putfield        #43  <Field String zzsr>
		zzsw = "";
	//   14   28:aload_0         
	//   15   29:ldc1            #35  <String "">
	//   16   31:putfield        #45  <Field String zzsw>
		zzbhh = "";
	//   17   34:aload_0         
	//   18   35:ldc1            #35  <String "">
	//   19   37:putfield        #47  <Field String zzbhh>
		zzsz = "";
	//   20   40:aload_0         
	//   21   41:ldc1            #35  <String "">
	//   22   43:putfield        #49  <Field String zzsz>
	//   23   46:return          
	}

	static if a()
	{
		return zzbhi;
	//    0    0:getstatic       #27  <Field if zzbhi>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		ip.a[i - 1];
	//    0    0:getstatic       #56  <Field int[] ip.a>
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
	//    6   48:new             #58  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #59  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #65  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #67  <Field ds zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/if;
	//   19   71:ldc1            #2   <Class if>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #67  <Field ds zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new bt(((br) (zzbhi)))));
	//   27   84:new             #69  <Class bt>
	//   28   87:dup             
	//   29   88:getstatic       #27  <Field if zzbhi>
	//   30   91:invokespecial   #72  <Method void bt(br)>
	//   31   94:astore_2        
		zzbg = ((ds) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #67  <Field ds zzbg>
_L12:
		com/google/android/gms/internal/clearcut/if;
	//   34   99:ldc1            #2   <Class if>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/if;
	//   39  105:ldc1            #2   <Class if>
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
		return ((Object) (zzbhi));
	//   45  112:getstatic       #27  <Field if zzbhi>
	//   46  115:areturn         
_L4:
		return a(((dh) (zzbhi)), "\001\007\000\001\001\b\b\t\000\000\000\001\b\000\003\b\002\004\b\003\005\b\004\006\b\005\007\b\001\b\b\006", new Object[] {
			"zzbb", "zzvy", "zzbhg", "zzsr", "zzsw", "zzbhh", "zzso", "zzsz"
		});
	//   47  116:getstatic       #27  <Field if zzbhi>
	//   48  119:ldc1            #74  <String "\001\007\000\001\001\b\b\t\000\000\000\001\b\000\003\b\002\004\b\003\005\b\004\006\b\005\007\b\001\b\b\006">
	//   49  121:bipush          8
	//   50  123:anewarray       Object[]
	//   51  126:dup             
	//   52  127:iconst_0        
	//   53  128:ldc1            #77  <String "zzbb">
	//   54  130:aastore         
	//   55  131:dup             
	//   56  132:iconst_1        
	//   57  133:ldc1            #78  <String "zzvy">
	//   58  135:aastore         
	//   59  136:dup             
	//   60  137:iconst_2        
	//   61  138:ldc1            #79  <String "zzbhg">
	//   62  140:aastore         
	//   63  141:dup             
	//   64  142:iconst_3        
	//   65  143:ldc1            #80  <String "zzsr">
	//   66  145:aastore         
	//   67  146:dup             
	//   68  147:iconst_4        
	//   69  148:ldc1            #81  <String "zzsw">
	//   70  150:aastore         
	//   71  151:dup             
	//   72  152:iconst_5        
	//   73  153:ldc1            #82  <String "zzbhh">
	//   74  155:aastore         
	//   75  156:dup             
	//   76  157:bipush          6
	//   77  159:ldc1            #83  <String "zzso">
	//   78  161:aastore         
	//   79  162:dup             
	//   80  163:bipush          7
	//   81  165:ldc1            #84  <String "zzsz">
	//   82  167:aastore         
	//   83  168:invokestatic    #87  <Method Object a(dh, String, Object[])>
	//   84  171:areturn         
_L3:
		return ((Object) (new ig(((ip) (null)))));
	//   85  172:new             #89  <Class ig>
	//   86  175:dup             
	//   87  176:aconst_null     
	//   88  177:invokespecial   #92  <Method void ig(ip)>
	//   89  180:areturn         
_L2:
		return ((Object) (new if()));
	//   90  181:new             #2   <Class if>
	//   91  184:dup             
	//   92  185:invokespecial   #25  <Method void if()>
	//   93  188:areturn         
	}

	private static volatile ds zzbg;
	private static final if zzbhi;
	private int zzbb;
	private String zzbhg;
	private String zzbhh;
	private String zzso;
	private String zzsr;
	private String zzsw;
	private String zzsz;
	private String zzvy;

	static 
	{
		zzbhi = new if();
	//    0    0:new             #2   <Class if>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void if()>
	//    3    7:putstatic       #27  <Field if zzbhi>
		br.a(com/google/android/gms/internal/clearcut/if, ((br) (zzbhi)));
	//    4   10:ldc1            #2   <Class if>
	//    5   12:getstatic       #27  <Field if zzbhi>
	//    6   15:invokestatic    #31  <Method void br.a(Class, br)>
	//*   7   18:return          
	}
}
