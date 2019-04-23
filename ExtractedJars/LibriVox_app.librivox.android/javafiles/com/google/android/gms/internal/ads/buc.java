// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, asm, aug, 
//			bup, asj, bue, bud

public final class buc extends ash
	implements atx
{

	private buc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void ash()>
	//    2    4:return          
	}

	public static aug a()
	{
		return (aug)((ash) (zzcfx)).a(asm.g, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #20  <Field buc zzcfx>
	//    1    3:getstatic       #32  <Field int asm.g>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #35  <Method Object ash.a(int, Object, Object)>
	//    5   11:checkcast       #37  <Class aug>
	//    6   14:areturn         
	}

	static buc b()
	{
		return zzcfx;
	//    0    0:getstatic       #20  <Field buc zzcfx>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		bup.a[i - 1];
	//    0    0:getstatic       #44  <Field int[] bup.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 156
	//	               2 147
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 156
	//	               2 147
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
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #55  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/buc;
	//   19   71:ldc1            #2   <Class buc>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #55  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzcfx)))));
	//   27   84:new             #57  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #20  <Field buc zzcfx>
	//   30   91:invokespecial   #60  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #55  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/buc;
	//   34   99:ldc1            #2   <Class buc>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/buc;
	//   39  105:ldc1            #2   <Class buc>
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
		return ((Object) (zzcfx));
	//   45  112:getstatic       #20  <Field buc zzcfx>
	//   46  115:areturn         
_L4:
		obj = ((Object) (bue.b()));
	//   47  116:invokestatic    #65  <Method asr bue.b()>
	//   48  119:astore_2        
		return a(((atv) (zzcfx)), "\001\001\000\001\001\001\001\000\000\000\001\f\0", new Object[] {
			"zzccg", "zzcfw", obj
		});
	//   49  120:getstatic       #20  <Field buc zzcfx>
	//   50  123:ldc1            #67  <String "\001\001\000\001\001\001\001\000\000\000\001\f\0">
	//   51  125:iconst_3        
	//   52  126:anewarray       Object[]
	//   53  129:dup             
	//   54  130:iconst_0        
	//   55  131:ldc1            #70  <String "zzccg">
	//   56  133:aastore         
	//   57  134:dup             
	//   58  135:iconst_1        
	//   59  136:ldc1            #71  <String "zzcfw">
	//   60  138:aastore         
	//   61  139:dup             
	//   62  140:iconst_2        
	//   63  141:aload_2         
	//   64  142:aastore         
	//   65  143:invokestatic    #74  <Method Object a(atv, String, Object[])>
	//   66  146:areturn         
_L3:
		return ((Object) (new bud(((bup) (null)))));
	//   67  147:new             #76  <Class bud>
	//   68  150:dup             
	//   69  151:aconst_null     
	//   70  152:invokespecial   #79  <Method void bud(bup)>
	//   71  155:areturn         
_L2:
		return ((Object) (new buc()));
	//   72  156:new             #2   <Class buc>
	//   73  159:dup             
	//   74  160:invokespecial   #18  <Method void buc()>
	//   75  163:areturn         
	}

	private static volatile aug zzcas;
	private static final buc zzcfx;
	private int zzccg;
	private int zzcfw;

	static 
	{
		zzcfx = new buc();
	//    0    0:new             #2   <Class buc>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void buc()>
	//    3    7:putstatic       #20  <Field buc zzcfx>
		ash.a(com/google/android/gms/internal/ads/buc, ((ash) (zzcfx)));
	//    4   10:ldc1            #2   <Class buc>
	//    5   12:getstatic       #20  <Field buc zzcfx>
	//    6   15:invokestatic    #24  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
