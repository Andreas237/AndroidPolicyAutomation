// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, asm, aug, 
//			bup, asj, buv, bub, 
//			buc, btw

public final class bua extends ash
	implements atx
{

	private bua()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void ash()>
		zzcea = 1000;
	//    2    4:aload_0         
	//    3    5:sipush          1000
	//    4    8:putfield        #32  <Field int zzcea>
	//    5   11:return          
	}

	public static aug a()
	{
		return (aug)((ash) (zzcfv)).a(asm.g, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #24  <Field bua zzcfv>
	//    1    3:getstatic       #38  <Field int asm.g>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #41  <Method Object ash.a(int, Object, Object)>
	//    5   11:checkcast       #43  <Class aug>
	//    6   14:areturn         
	}

	static bua b()
	{
		return zzcfv;
	//    0    0:getstatic       #24  <Field bua zzcfv>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		bup.a[i - 1];
	//    0    0:getstatic       #50  <Field int[] bup.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 166
	//	               2 157
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 166
	//	               2 157
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #52  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #53  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #59  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #61  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/bua;
	//   19   71:ldc1            #2   <Class bua>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #61  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzcfv)))));
	//   27   84:new             #63  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #24  <Field bua zzcfv>
	//   30   91:invokespecial   #66  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #61  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/bua;
	//   34   99:ldc1            #2   <Class bua>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/bua;
	//   39  105:ldc1            #2   <Class bua>
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
		return ((Object) (zzcfv));
	//   45  112:getstatic       #24  <Field bua zzcfv>
	//   46  115:areturn         
_L4:
		obj = ((Object) (buv.b()));
	//   47  116:invokestatic    #71  <Method asr buv.b()>
	//   48  119:astore_2        
		return a(((atv) (zzcfv)), "\001\003\000\001\001\003\003\000\000\000\001\f\000\002\t\001\003\t\002", new Object[] {
			"zzccg", "zzcea", obj, "zzcft", "zzcfu"
		});
	//   49  120:getstatic       #24  <Field bua zzcfv>
	//   50  123:ldc1            #73  <String "\001\003\000\001\001\003\003\000\000\000\001\f\000\002\t\001\003\t\002">
	//   51  125:iconst_5        
	//   52  126:anewarray       Object[]
	//   53  129:dup             
	//   54  130:iconst_0        
	//   55  131:ldc1            #76  <String "zzccg">
	//   56  133:aastore         
	//   57  134:dup             
	//   58  135:iconst_1        
	//   59  136:ldc1            #77  <String "zzcea">
	//   60  138:aastore         
	//   61  139:dup             
	//   62  140:iconst_2        
	//   63  141:aload_2         
	//   64  142:aastore         
	//   65  143:dup             
	//   66  144:iconst_3        
	//   67  145:ldc1            #78  <String "zzcft">
	//   68  147:aastore         
	//   69  148:dup             
	//   70  149:iconst_4        
	//   71  150:ldc1            #79  <String "zzcfu">
	//   72  152:aastore         
	//   73  153:invokestatic    #82  <Method Object a(atv, String, Object[])>
	//   74  156:areturn         
_L3:
		return ((Object) (new bub(((bup) (null)))));
	//   75  157:new             #84  <Class bub>
	//   76  160:dup             
	//   77  161:aconst_null     
	//   78  162:invokespecial   #87  <Method void bub(bup)>
	//   79  165:areturn         
_L2:
		return ((Object) (new bua()));
	//   80  166:new             #2   <Class bua>
	//   81  169:dup             
	//   82  170:invokespecial   #22  <Method void bua()>
	//   83  173:areturn         
	}

	private static volatile aug zzcas;
	private static final bua zzcfv;
	private int zzccg;
	private int zzcea;
	private buc zzcft;
	private btw zzcfu;

	static 
	{
		zzcfv = new bua();
	//    0    0:new             #2   <Class bua>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void bua()>
	//    3    7:putstatic       #24  <Field bua zzcfv>
		ash.a(com/google/android/gms/internal/ads/bua, ((ash) (zzcfv)));
	//    4   10:ldc1            #2   <Class bua>
	//    5   12:getstatic       #24  <Field bua zzcfv>
	//    6   15:invokestatic    #28  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
