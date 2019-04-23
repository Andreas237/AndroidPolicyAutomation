// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, aqq, ani, 
//			asj, anh, aug

public final class ang extends ash
	implements atx
{

	private ang()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void ash()>
		zzfgk = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #31  <String "">
	//    4    7:putfield        #33  <Field String zzfgk>
		zzfgl = aqq.a;
	//    5   10:aload_0         
	//    6   11:getstatic       #37  <Field aqq aqq.a>
	//    7   14:putfield        #39  <Field aqq zzfgl>
	//    8   17:return          
	}

	public static ang c()
	{
		return zzfhc;
	//    0    0:getstatic       #23  <Field ang zzfhc>
	//    1    3:areturn         
	}

	static ang d()
	{
		return zzfhc;
	//    0    0:getstatic       #23  <Field ang zzfhc>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		ani.a[i - 1];
	//    0    0:getstatic       #48  <Field int[] ani.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 153
	//	               2 144
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 153
	//	               2 144
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
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #59  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/ang;
	//   19   71:ldc1            #2   <Class ang>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #59  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzfhc)))));
	//   27   84:new             #61  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #23  <Field ang zzfhc>
	//   30   91:invokespecial   #64  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #59  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/ang;
	//   34   99:ldc1            #2   <Class ang>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/ang;
	//   39  105:ldc1            #2   <Class ang>
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
		return ((Object) (zzfhc));
	//   45  112:getstatic       #23  <Field ang zzfhc>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzfhc)), "\000\003\000\000\001\003\003\000\000\000\001\u0208\002\n\003\f", new Object[] {
			"zzfgk", "zzfgl", "zzfhb"
		});
	//   47  116:getstatic       #23  <Field ang zzfhc>
	//   48  119:ldc1            #66  <String "\000\003\000\000\001\003\003\000\000\000\001\u0208\002\n\003\f">
	//   49  121:iconst_3        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #69  <String "zzfgk">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #70  <String "zzfgl">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #71  <String "zzfhb">
	//   62  139:aastore         
	//   63  140:invokestatic    #74  <Method Object a(atv, String, Object[])>
	//   64  143:areturn         
_L3:
		return ((Object) (new anh(((ani) (null)))));
	//   65  144:new             #76  <Class anh>
	//   66  147:dup             
	//   67  148:aconst_null     
	//   68  149:invokespecial   #79  <Method void anh(ani)>
	//   69  152:areturn         
_L2:
		return ((Object) (new ang()));
	//   70  153:new             #2   <Class ang>
	//   71  156:dup             
	//   72  157:invokespecial   #21  <Method void ang()>
	//   73  160:areturn         
	}

	public final String a()
	{
		return zzfgk;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String zzfgk>
	//    2    4:areturn         
	}

	public final aqq b()
	{
		return zzfgl;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field aqq zzfgl>
	//    2    4:areturn         
	}

	private static volatile aug zzcas;
	private static final ang zzfhc;
	private String zzfgk;
	private aqq zzfgl;
	private int zzfhb;

	static 
	{
		zzfhc = new ang();
	//    0    0:new             #2   <Class ang>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void ang()>
	//    3    7:putstatic       #23  <Field ang zzfhc>
		ash.a(com/google/android/gms/internal/ads/ang, ((ash) (zzfhc)));
	//    4   10:ldc1            #2   <Class ang>
	//    5   12:getstatic       #23  <Field ang zzfhc>
	//    6   15:invokestatic    #27  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
