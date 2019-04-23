// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, asm, aug, 
//			bup, asj, btx

public final class btw extends ash
	implements atx
{

	private btw()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void ash()>
	//    2    4:return          
	}

	public static aug a()
	{
		return (aug)((ash) (zzcfo)).a(asm.g, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #21  <Field btw zzcfo>
	//    1    3:getstatic       #33  <Field int asm.g>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #36  <Method Object ash.a(int, Object, Object)>
	//    5   11:checkcast       #38  <Class aug>
	//    6   14:areturn         
	}

	static btw b()
	{
		return zzcfo;
	//    0    0:getstatic       #21  <Field btw zzcfo>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		bup.a[i - 1];
	//    0    0:getstatic       #45  <Field int[] bup.a>
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
	//    6   48:new             #47  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #48  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #54  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #56  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/btw;
	//   19   71:ldc1            #2   <Class btw>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #56  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzcfo)))));
	//   27   84:new             #58  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #21  <Field btw zzcfo>
	//   30   91:invokespecial   #61  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #56  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/btw;
	//   34   99:ldc1            #2   <Class btw>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/btw;
	//   39  105:ldc1            #2   <Class btw>
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
		return ((Object) (zzcfo));
	//   45  112:getstatic       #21  <Field btw zzcfo>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzcfo)), "\001\002\000\001\001\002\002\000\000\000\001\004\000\002\004\001", new Object[] {
			"zzccg", "zzcfm", "zzcfn"
		});
	//   47  116:getstatic       #21  <Field btw zzcfo>
	//   48  119:ldc1            #63  <String "\001\002\000\001\001\002\002\000\000\000\001\004\000\002\004\001">
	//   49  121:iconst_3        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #66  <String "zzccg">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #67  <String "zzcfm">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #68  <String "zzcfn">
	//   62  139:aastore         
	//   63  140:invokestatic    #71  <Method Object a(atv, String, Object[])>
	//   64  143:areturn         
_L3:
		return ((Object) (new btx(((bup) (null)))));
	//   65  144:new             #73  <Class btx>
	//   66  147:dup             
	//   67  148:aconst_null     
	//   68  149:invokespecial   #76  <Method void btx(bup)>
	//   69  152:areturn         
_L2:
		return ((Object) (new btw()));
	//   70  153:new             #2   <Class btw>
	//   71  156:dup             
	//   72  157:invokespecial   #19  <Method void btw()>
	//   73  160:areturn         
	}

	private static volatile aug zzcas;
	private static final btw zzcfo;
	private int zzccg;
	private int zzcfm;
	private int zzcfn;

	static 
	{
		zzcfo = new btw();
	//    0    0:new             #2   <Class btw>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void btw()>
	//    3    7:putstatic       #21  <Field btw zzcfo>
		ash.a(com/google/android/gms/internal/ads/btw, ((ash) (zzcfo)));
	//    4   10:ldc1            #2   <Class btw>
	//    5   12:getstatic       #21  <Field btw zzcfo>
	//    6   15:invokestatic    #25  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
