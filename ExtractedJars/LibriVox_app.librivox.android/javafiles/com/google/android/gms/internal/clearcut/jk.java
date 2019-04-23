// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal.clearcut:
//			br, dj, jo, bt, 
//			jm, jl, ds, cf

public final class jk extends br
	implements dj
{

	private jk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void br()>
		zzbiq = h();
	//    2    4:aload_0         
	//    3    5:invokestatic    #29  <Method cf h()>
	//    4    8:putfield        #31  <Field cf zzbiq>
	//    5   11:return          
	}

	public static jk a(byte abyte0[])
	{
		return (jk)br.a(((br) (zzbir)), abyte0);
	//    0    0:getstatic       #19  <Field jk zzbir>
	//    1    3:aload_0         
	//    2    4:invokestatic    #35  <Method br br.a(br, byte[])>
	//    3    7:checkcast       #2   <Class jk>
	//    4   10:areturn         
	}

	public static jk l()
	{
		return zzbir;
	//    0    0:getstatic       #19  <Field jk zzbir>
	//    1    3:areturn         
	}

	static jk m()
	{
		return zzbir;
	//    0    0:getstatic       #19  <Field jk zzbir>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		jo.a[i - 1];
	//    0    0:getstatic       #44  <Field int[] jo.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 148
	//	               2 139
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 148
	//	               2 139
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #46  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #47  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #53  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #55  <Field ds zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/jk;
	//   19   71:ldc1            #2   <Class jk>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #55  <Field ds zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new bt(((br) (zzbir)))));
	//   27   84:new             #57  <Class bt>
	//   28   87:dup             
	//   29   88:getstatic       #19  <Field jk zzbir>
	//   30   91:invokespecial   #60  <Method void bt(br)>
	//   31   94:astore_2        
		zzbg = ((ds) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #55  <Field ds zzbg>
_L12:
		com/google/android/gms/internal/clearcut/jk;
	//   34   99:ldc1            #2   <Class jk>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/jk;
	//   39  105:ldc1            #2   <Class jk>
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
		return ((Object) (zzbir));
	//   45  112:getstatic       #19  <Field jk zzbir>
	//   46  115:areturn         
_L4:
		return a(((dh) (zzbir)), "\001\001\000\000\001\001\001\002\000\001\000\001\033", new Object[] {
			"zzbiq", com/google/android/gms/internal/clearcut/jm
		});
	//   47  116:getstatic       #19  <Field jk zzbir>
	//   48  119:ldc1            #62  <String "\001\001\000\000\001\001\001\002\000\001\000\001\033">
	//   49  121:iconst_2        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #65  <String "zzbiq">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #67  <Class jm>
	//   58  134:aastore         
	//   59  135:invokestatic    #70  <Method Object a(dh, String, Object[])>
	//   60  138:areturn         
_L3:
		return ((Object) (new jl(((jo) (null)))));
	//   61  139:new             #72  <Class jl>
	//   62  142:dup             
	//   63  143:aconst_null     
	//   64  144:invokespecial   #75  <Method void jl(jo)>
	//   65  147:areturn         
_L2:
		return ((Object) (new jk()));
	//   66  148:new             #2   <Class jk>
	//   67  151:dup             
	//   68  152:invokespecial   #17  <Method void jk()>
	//   69  155:areturn         
	}

	public final List a()
	{
		return ((List) (zzbiq));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field cf zzbiq>
	//    2    4:areturn         
	}

	private static volatile ds zzbg;
	private static final jk zzbir;
	private cf zzbiq;

	static 
	{
		zzbir = new jk();
	//    0    0:new             #2   <Class jk>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void jk()>
	//    3    7:putstatic       #19  <Field jk zzbir>
		br.a(com/google/android/gms/internal/clearcut/jk, ((br) (zzbir)));
	//    4   10:ldc1            #2   <Class jk>
	//    5   12:getstatic       #19  <Field jk zzbir>
	//    6   15:invokestatic    #23  <Method void br.a(Class, br)>
	//*   7   18:return          
	}
}
