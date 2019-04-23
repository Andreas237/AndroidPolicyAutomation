// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			br, dj, ip, bt, 
//			gn, ds

public final class gm extends br
	implements dj
{

	private gm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void br()>
		zztv = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #31  <String "">
	//    4    7:putfield        #33  <Field String zztv>
		zztw = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #31  <String "">
	//    7   13:putfield        #35  <Field String zztw>
	//    8   16:return          
	}

	static gm a()
	{
		return zztx;
	//    0    0:getstatic       #23  <Field gm zztx>
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
		com/google/android/gms/internal/clearcut/gm;
	//   19   71:ldc1            #2   <Class gm>
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
		obj = ((Object) (new bt(((br) (zztx)))));
	//   27   84:new             #55  <Class bt>
	//   28   87:dup             
	//   29   88:getstatic       #23  <Field gm zztx>
	//   30   91:invokespecial   #58  <Method void bt(br)>
	//   31   94:astore_2        
		zzbg = ((ds) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #53  <Field ds zzbg>
_L12:
		com/google/android/gms/internal/clearcut/gm;
	//   34   99:ldc1            #2   <Class gm>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/gm;
	//   39  105:ldc1            #2   <Class gm>
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
		return ((Object) (zztx));
	//   45  112:getstatic       #23  <Field gm zztx>
	//   46  115:areturn         
_L4:
		return a(((dh) (zztx)), "\001\003\000\001\001\003\003\004\000\000\000\001\004\000\002\b\001\003\b\002", new Object[] {
			"zzbb", "zztu", "zztv", "zztw"
		});
	//   47  116:getstatic       #23  <Field gm zztx>
	//   48  119:ldc1            #60  <String "\001\003\000\001\001\003\003\004\000\000\000\001\004\000\002\b\001\003\b\002">
	//   49  121:iconst_4        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #63  <String "zzbb">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #64  <String "zztu">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #65  <String "zztv">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #66  <String "zztw">
	//   66  144:aastore         
	//   67  145:invokestatic    #69  <Method Object a(dh, String, Object[])>
	//   68  148:areturn         
_L3:
		return ((Object) (new gn(((ip) (null)))));
	//   69  149:new             #71  <Class gn>
	//   70  152:dup             
	//   71  153:aconst_null     
	//   72  154:invokespecial   #74  <Method void gn(ip)>
	//   73  157:areturn         
_L2:
		return ((Object) (new gm()));
	//   74  158:new             #2   <Class gm>
	//   75  161:dup             
	//   76  162:invokespecial   #21  <Method void gm()>
	//   77  165:areturn         
	}

	private static volatile ds zzbg;
	private static final gm zztx;
	private int zzbb;
	private int zztu;
	private String zztv;
	private String zztw;

	static 
	{
		zztx = new gm();
	//    0    0:new             #2   <Class gm>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void gm()>
	//    3    7:putstatic       #23  <Field gm zztx>
		br.a(com/google/android/gms/internal/clearcut/gm, ((br) (zztx)));
	//    4   10:ldc1            #2   <Class gm>
	//    5   12:getstatic       #23  <Field gm zztx>
	//    6   15:invokestatic    #27  <Method void br.a(Class, br)>
	//*   7   18:return          
	}
}
