// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			br, dj, ag, ip, 
//			bt, he, ds, cf

public final class hd extends br
	implements dj
{

	private hd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void br()>
		zzwo = ag.a;
	//    2    4:aload_0         
	//    3    5:getstatic       #37  <Field ag ag.a>
	//    4    8:putfield        #39  <Field ag zzwo>
		zzwp = "";
	//    5   11:aload_0         
	//    6   12:ldc1            #41  <String "">
	//    7   14:putfield        #43  <Field String zzwp>
		zzwq = h();
	//    8   17:aload_0         
	//    9   18:invokestatic    #47  <Method cf h()>
	//   10   21:putfield        #49  <Field cf zzwq>
	//   11   24:return          
	}

	static hd a()
	{
		return zzws;
	//    0    0:getstatic       #27  <Field hd zzws>
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
		com/google/android/gms/internal/clearcut/hd;
	//   19   71:ldc1            #2   <Class hd>
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
		obj = ((Object) (new bt(((br) (zzws)))));
	//   27   84:new             #69  <Class bt>
	//   28   87:dup             
	//   29   88:getstatic       #27  <Field hd zzws>
	//   30   91:invokespecial   #72  <Method void bt(br)>
	//   31   94:astore_2        
		zzbg = ((ds) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #67  <Field ds zzbg>
_L12:
		com/google/android/gms/internal/clearcut/hd;
	//   34   99:ldc1            #2   <Class hd>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/hd;
	//   39  105:ldc1            #2   <Class hd>
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
		return ((Object) (zzws));
	//   45  112:getstatic       #27  <Field hd zzws>
	//   46  115:areturn         
_L4:
		return a(((dh) (zzws)), "\001\004\000\001\001\004\004\005\000\001\000\001\n\000\002\034\003\007\002\004\b\001", new Object[] {
			"zzbb", "zzwo", "zzwq", "zzwr", "zzwp"
		});
	//   47  116:getstatic       #27  <Field hd zzws>
	//   48  119:ldc1            #74  <String "\001\004\000\001\001\004\004\005\000\001\000\001\n\000\002\034\003\007\002\004\b\001">
	//   49  121:iconst_5        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #77  <String "zzbb">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #78  <String "zzwo">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #79  <String "zzwq">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #80  <String "zzwr">
	//   66  144:aastore         
	//   67  145:dup             
	//   68  146:iconst_4        
	//   69  147:ldc1            #81  <String "zzwp">
	//   70  149:aastore         
	//   71  150:invokestatic    #84  <Method Object a(dh, String, Object[])>
	//   72  153:areturn         
_L3:
		return ((Object) (new he(((ip) (null)))));
	//   73  154:new             #86  <Class he>
	//   74  157:dup             
	//   75  158:aconst_null     
	//   76  159:invokespecial   #89  <Method void he(ip)>
	//   77  162:areturn         
_L2:
		return ((Object) (new hd()));
	//   78  163:new             #2   <Class hd>
	//   79  166:dup             
	//   80  167:invokespecial   #25  <Method void hd()>
	//   81  170:areturn         
	}

	private static volatile ds zzbg;
	private static final hd zzws;
	private int zzbb;
	private ag zzwo;
	private String zzwp;
	private cf zzwq;
	private boolean zzwr;

	static 
	{
		zzws = new hd();
	//    0    0:new             #2   <Class hd>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void hd()>
	//    3    7:putstatic       #27  <Field hd zzws>
		br.a(com/google/android/gms/internal/clearcut/hd, ((br) (zzws)));
	//    4   10:ldc1            #2   <Class hd>
	//    5   12:getstatic       #27  <Field hd zzws>
	//    6   15:invokestatic    #31  <Method void br.a(Class, br)>
	//*   7   18:return          
	}
}
