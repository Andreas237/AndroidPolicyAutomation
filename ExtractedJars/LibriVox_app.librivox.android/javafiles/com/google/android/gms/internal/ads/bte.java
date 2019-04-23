// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, asm, aug, 
//			bup, asj, buv, btf, 
//			ass

public final class bte extends ash
	implements atx
{

	private bte()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void ash()>
		zzcdx = m();
	//    2    4:aload_0         
	//    3    5:invokestatic    #32  <Method ass m()>
	//    4    8:putfield        #34  <Field ass zzcdx>
	//    5   11:return          
	}

	public static aug a()
	{
		return (aug)((ash) (zzceb)).a(asm.g, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #22  <Field bte zzceb>
	//    1    3:getstatic       #40  <Field int asm.g>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #43  <Method Object ash.a(int, Object, Object)>
	//    5   11:checkcast       #45  <Class aug>
	//    6   14:areturn         
	}

	static bte b()
	{
		return zzceb;
	//    0    0:getstatic       #22  <Field bte zzceb>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		bup.a[i - 1];
	//    0    0:getstatic       #52  <Field int[] bup.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 161
	//	               2 152
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 161
	//	               2 152
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
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #63  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/bte;
	//   19   71:ldc1            #2   <Class bte>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #63  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzceb)))));
	//   27   84:new             #65  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #22  <Field bte zzceb>
	//   30   91:invokespecial   #68  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #63  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/bte;
	//   34   99:ldc1            #2   <Class bte>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/bte;
	//   39  105:ldc1            #2   <Class bte>
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
		return ((Object) (zzceb));
	//   45  112:getstatic       #22  <Field bte zzceb>
	//   46  115:areturn         
_L4:
		obj = ((Object) (buv.b()));
	//   47  116:invokestatic    #73  <Method asr buv.b()>
	//   48  119:astore_2        
		return a(((atv) (zzceb)), "\001\002\000\001\001\002\002\000\001\000\001\f\000\002\026", new Object[] {
			"zzccg", "zzcea", obj, "zzcdx"
		});
	//   49  120:getstatic       #22  <Field bte zzceb>
	//   50  123:ldc1            #75  <String "\001\002\000\001\001\002\002\000\001\000\001\f\000\002\026">
	//   51  125:iconst_4        
	//   52  126:anewarray       Object[]
	//   53  129:dup             
	//   54  130:iconst_0        
	//   55  131:ldc1            #78  <String "zzccg">
	//   56  133:aastore         
	//   57  134:dup             
	//   58  135:iconst_1        
	//   59  136:ldc1            #79  <String "zzcea">
	//   60  138:aastore         
	//   61  139:dup             
	//   62  140:iconst_2        
	//   63  141:aload_2         
	//   64  142:aastore         
	//   65  143:dup             
	//   66  144:iconst_3        
	//   67  145:ldc1            #80  <String "zzcdx">
	//   68  147:aastore         
	//   69  148:invokestatic    #83  <Method Object a(atv, String, Object[])>
	//   70  151:areturn         
_L3:
		return ((Object) (new btf(((bup) (null)))));
	//   71  152:new             #85  <Class btf>
	//   72  155:dup             
	//   73  156:aconst_null     
	//   74  157:invokespecial   #88  <Method void btf(bup)>
	//   75  160:areturn         
_L2:
		return ((Object) (new bte()));
	//   76  161:new             #2   <Class bte>
	//   77  164:dup             
	//   78  165:invokespecial   #20  <Method void bte()>
	//   79  168:areturn         
	}

	private static volatile aug zzcas;
	private static final bte zzceb;
	private int zzccg;
	private ass zzcdx;
	private int zzcea;

	static 
	{
		zzceb = new bte();
	//    0    0:new             #2   <Class bte>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void bte()>
	//    3    7:putstatic       #22  <Field bte zzceb>
		ash.a(com/google/android/gms/internal/ads/bte, ((ash) (zzceb)));
	//    4   10:ldc1            #2   <Class bte>
	//    5   12:getstatic       #22  <Field bte zzceb>
	//    6   15:invokestatic    #26  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
