// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, asm, aug, 
//			bup, asj, buv, buk, 
//			buc

public final class buj extends ash
	implements atx
{

	private buj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void ash()>
		zzcea = 1000;
	//    2    4:aload_0         
	//    3    5:sipush          1000
	//    4    8:putfield        #35  <Field int zzcea>
	//    5   11:return          
	}

	public static aug a()
	{
		return (aug)((ash) (zzcgj)).a(asm.g, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #27  <Field buj zzcgj>
	//    1    3:getstatic       #41  <Field int asm.g>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #44  <Method Object ash.a(int, Object, Object)>
	//    5   11:checkcast       #46  <Class aug>
	//    6   14:areturn         
	}

	static buj b()
	{
		return zzcgj;
	//    0    0:getstatic       #27  <Field buj zzcgj>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		bup.a[i - 1];
	//    0    0:getstatic       #53  <Field int[] bup.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 184
	//	               2 175
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 184
	//	               2 175
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #55  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #56  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #62  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #64  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/buj;
	//   19   71:ldc1            #2   <Class buj>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #64  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzcgj)))));
	//   27   84:new             #66  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #27  <Field buj zzcgj>
	//   30   91:invokespecial   #69  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #64  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/buj;
	//   34   99:ldc1            #2   <Class buj>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/buj;
	//   39  105:ldc1            #2   <Class buj>
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
		return ((Object) (zzcgj));
	//   45  112:getstatic       #27  <Field buj zzcgj>
	//   46  115:areturn         
_L4:
		obj = ((Object) (buv.b()));
	//   47  116:invokestatic    #74  <Method asr buv.b()>
	//   48  119:astore_2        
		return a(((atv) (zzcgj)), "\001\006\000\001\001\006\006\000\000\000\001\f\000\002\t\001\003\004\002\004\004\003\005\004\004\006\003\005", new Object[] {
			"zzccg", "zzcea", obj, "zzcft", "zzcgd", "zzcge", "zzcgf", "zzcgi"
		});
	//   49  120:getstatic       #27  <Field buj zzcgj>
	//   50  123:ldc1            #76  <String "\001\006\000\001\001\006\006\000\000\000\001\f\000\002\t\001\003\004\002\004\004\003\005\004\004\006\003\005">
	//   51  125:bipush          8
	//   52  127:anewarray       Object[]
	//   53  130:dup             
	//   54  131:iconst_0        
	//   55  132:ldc1            #79  <String "zzccg">
	//   56  134:aastore         
	//   57  135:dup             
	//   58  136:iconst_1        
	//   59  137:ldc1            #80  <String "zzcea">
	//   60  139:aastore         
	//   61  140:dup             
	//   62  141:iconst_2        
	//   63  142:aload_2         
	//   64  143:aastore         
	//   65  144:dup             
	//   66  145:iconst_3        
	//   67  146:ldc1            #81  <String "zzcft">
	//   68  148:aastore         
	//   69  149:dup             
	//   70  150:iconst_4        
	//   71  151:ldc1            #82  <String "zzcgd">
	//   72  153:aastore         
	//   73  154:dup             
	//   74  155:iconst_5        
	//   75  156:ldc1            #83  <String "zzcge">
	//   76  158:aastore         
	//   77  159:dup             
	//   78  160:bipush          6
	//   79  162:ldc1            #84  <String "zzcgf">
	//   80  164:aastore         
	//   81  165:dup             
	//   82  166:bipush          7
	//   83  168:ldc1            #85  <String "zzcgi">
	//   84  170:aastore         
	//   85  171:invokestatic    #88  <Method Object a(atv, String, Object[])>
	//   86  174:areturn         
_L3:
		return ((Object) (new buk(((bup) (null)))));
	//   87  175:new             #90  <Class buk>
	//   88  178:dup             
	//   89  179:aconst_null     
	//   90  180:invokespecial   #93  <Method void buk(bup)>
	//   91  183:areturn         
_L2:
		return ((Object) (new buj()));
	//   92  184:new             #2   <Class buj>
	//   93  187:dup             
	//   94  188:invokespecial   #25  <Method void buj()>
	//   95  191:areturn         
	}

	private static volatile aug zzcas;
	private static final buj zzcgj;
	private int zzccg;
	private int zzcea;
	private buc zzcft;
	private int zzcgd;
	private int zzcge;
	private int zzcgf;
	private long zzcgi;

	static 
	{
		zzcgj = new buj();
	//    0    0:new             #2   <Class buj>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void buj()>
	//    3    7:putstatic       #27  <Field buj zzcgj>
		ash.a(com/google/android/gms/internal/ads/buj, ((ash) (zzcgj)));
	//    4   10:ldc1            #2   <Class buj>
	//    5   12:getstatic       #27  <Field buj zzcgj>
	//    6   15:invokestatic    #31  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
