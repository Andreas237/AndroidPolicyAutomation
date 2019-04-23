// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, asm, aug, 
//			bup, asj, buv, btu, 
//			bth, btw, btc, ast

public final class btg extends ash
	implements atx
{

	private btg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void ash()>
		zzced = n();
	//    2    4:aload_0         
	//    3    5:invokestatic    #36  <Method ast n()>
	//    4    8:putfield        #38  <Field ast zzced>
	//    5   11:return          
	}

	public static aug a()
	{
		return (aug)((ash) (zzcee)).a(asm.g, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #26  <Field btg zzcee>
	//    1    3:getstatic       #44  <Field int asm.g>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #47  <Method Object ash.a(int, Object, Object)>
	//    5   11:checkcast       #49  <Class aug>
	//    6   14:areturn         
	}

	static btg b()
	{
		return zzcee;
	//    0    0:getstatic       #26  <Field btg zzcee>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		bup.a[i - 1];
	//    0    0:getstatic       #56  <Field int[] bup.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 178
	//	               2 169
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 178
	//	               2 169
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
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #67  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/btg;
	//   19   71:ldc1            #2   <Class btg>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #67  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzcee)))));
	//   27   84:new             #69  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #26  <Field btg zzcee>
	//   30   91:invokespecial   #72  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #67  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/btg;
	//   34   99:ldc1            #2   <Class btg>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/btg;
	//   39  105:ldc1            #2   <Class btg>
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
		return ((Object) (zzcee));
	//   45  112:getstatic       #26  <Field btg zzcee>
	//   46  115:areturn         
_L4:
		obj = ((Object) (buv.b()));
	//   47  116:invokestatic    #77  <Method asr buv.b()>
	//   48  119:astore_2        
		return a(((atv) (zzcee)), "\001\004\000\001\001\004\004\000\001\000\001\t\000\002\033\003\f\001\004\t\002", new Object[] {
			"zzccg", "zzcec", "zzced", com/google/android/gms/internal/ads/btu, "zzcea", obj, "zzcdy"
		});
	//   49  120:getstatic       #26  <Field btg zzcee>
	//   50  123:ldc1            #79  <String "\001\004\000\001\001\004\004\000\001\000\001\t\000\002\033\003\f\001\004\t\002">
	//   51  125:bipush          7
	//   52  127:anewarray       Object[]
	//   53  130:dup             
	//   54  131:iconst_0        
	//   55  132:ldc1            #82  <String "zzccg">
	//   56  134:aastore         
	//   57  135:dup             
	//   58  136:iconst_1        
	//   59  137:ldc1            #83  <String "zzcec">
	//   60  139:aastore         
	//   61  140:dup             
	//   62  141:iconst_2        
	//   63  142:ldc1            #84  <String "zzced">
	//   64  144:aastore         
	//   65  145:dup             
	//   66  146:iconst_3        
	//   67  147:ldc1            #86  <Class btu>
	//   68  149:aastore         
	//   69  150:dup             
	//   70  151:iconst_4        
	//   71  152:ldc1            #87  <String "zzcea">
	//   72  154:aastore         
	//   73  155:dup             
	//   74  156:iconst_5        
	//   75  157:aload_2         
	//   76  158:aastore         
	//   77  159:dup             
	//   78  160:bipush          6
	//   79  162:ldc1            #88  <String "zzcdy">
	//   80  164:aastore         
	//   81  165:invokestatic    #91  <Method Object a(atv, String, Object[])>
	//   82  168:areturn         
_L3:
		return ((Object) (new bth(((bup) (null)))));
	//   83  169:new             #93  <Class bth>
	//   84  172:dup             
	//   85  173:aconst_null     
	//   86  174:invokespecial   #96  <Method void bth(bup)>
	//   87  177:areturn         
_L2:
		return ((Object) (new btg()));
	//   88  178:new             #2   <Class btg>
	//   89  181:dup             
	//   90  182:invokespecial   #24  <Method void btg()>
	//   91  185:areturn         
	}

	private static volatile aug zzcas;
	private static final btg zzcee;
	private int zzccg;
	private btw zzcdy;
	private int zzcea;
	private btc zzcec;
	private ast zzced;

	static 
	{
		zzcee = new btg();
	//    0    0:new             #2   <Class btg>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void btg()>
	//    3    7:putstatic       #26  <Field btg zzcee>
		ash.a(com/google/android/gms/internal/ads/btg, ((ash) (zzcee)));
	//    4   10:ldc1            #2   <Class btg>
	//    5   12:getstatic       #26  <Field btg zzcee>
	//    6   15:invokestatic    #30  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
