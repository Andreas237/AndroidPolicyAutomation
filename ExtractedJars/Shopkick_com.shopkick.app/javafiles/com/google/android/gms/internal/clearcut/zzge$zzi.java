// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcg, zzdq, zzge, zzgf, 
//			zzdz

public static final class zzge$zzi extends zzcg
	implements zzdq
{
	public static final class zza extends zzcg.zza
		implements zzdq
	{

		private zza()
		{
			super(((zzcg) (zzge.zzi.zzfb())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #19  <Method zzge$zzi zzge$zzi.zzfb()>
		//    2    4:invokespecial   #22  <Method void zzcg$zza(zzcg)>
		//    3    7:return          
		}

		zza(zzgf zzgf1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void zzge$zzi$zza()>
		//    2    4:return          
		}
	}


	static zzge$zzi zzfb()
	{
		return zzwe;
	//    0    0:getstatic       #37  <Field zzge$zzi zzwe>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzgf.zzba[i - 1];
	//    0    0:getstatic       #67  <Field int[] zzgf.zzba>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 193
	//	               2 184
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 193
	//	               2 184
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #69  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #70  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #76  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #78  <Field zzdz zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/zzge$zzi;
	//   19   71:ldc1            #2   <Class zzge$zzi>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #78  <Field zzdz zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzcg$zzb(((zzcg) (zzwe)))));
	//   27   84:new             #80  <Class zzcg$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #37  <Field zzge$zzi zzwe>
	//   30   91:invokespecial   #83  <Method void zzcg$zzb(zzcg)>
	//   31   94:astore_2        
		zzbg = ((zzdz) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #78  <Field zzdz zzbg>
_L12:
		com/google/android/gms/internal/clearcut/zzge$zzi;
	//   34   99:ldc1            #2   <Class zzge$zzi>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/zzge$zzi;
	//   39  105:ldc1            #2   <Class zzge$zzi>
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
		return ((Object) (zzwe));
	//   45  112:getstatic       #37  <Field zzge$zzi zzwe>
	//   46  115:areturn         
_L4:
		return zza(((zzdo) (zzwe)), "\001\t\000\001\001\t\t\n\000\000\000\001\b\000\002\b\001\003\b\002\004\b\003\005\b\004\006\b\005\007\b\006\b\004\007\t\004\b", new Object[] {
			"zzbb", "zzvy", "zzso", "zzvz", "zzwa", "zzwb", "zzsw", "zzsz", "zzwc", "zzwd"
		});
	//   47  116:getstatic       #37  <Field zzge$zzi zzwe>
	//   48  119:ldc1            #85  <String "\001\t\000\001\001\t\t\n\000\000\000\001\b\000\002\b\001\003\b\002\004\b\003\005\b\004\006\b\005\007\b\006\b\004\007\t\004\b">
	//   49  121:bipush          10
	//   50  123:anewarray       Object[]
	//   51  126:dup             
	//   52  127:iconst_0        
	//   53  128:ldc1            #88  <String "zzbb">
	//   54  130:aastore         
	//   55  131:dup             
	//   56  132:iconst_1        
	//   57  133:ldc1            #89  <String "zzvy">
	//   58  135:aastore         
	//   59  136:dup             
	//   60  137:iconst_2        
	//   61  138:ldc1            #90  <String "zzso">
	//   62  140:aastore         
	//   63  141:dup             
	//   64  142:iconst_3        
	//   65  143:ldc1            #91  <String "zzvz">
	//   66  145:aastore         
	//   67  146:dup             
	//   68  147:iconst_4        
	//   69  148:ldc1            #92  <String "zzwa">
	//   70  150:aastore         
	//   71  151:dup             
	//   72  152:iconst_5        
	//   73  153:ldc1            #93  <String "zzwb">
	//   74  155:aastore         
	//   75  156:dup             
	//   76  157:bipush          6
	//   77  159:ldc1            #94  <String "zzsw">
	//   78  161:aastore         
	//   79  162:dup             
	//   80  163:bipush          7
	//   81  165:ldc1            #95  <String "zzsz">
	//   82  167:aastore         
	//   83  168:dup             
	//   84  169:bipush          8
	//   85  171:ldc1            #96  <String "zzwc">
	//   86  173:aastore         
	//   87  174:dup             
	//   88  175:bipush          9
	//   89  177:ldc1            #97  <String "zzwd">
	//   90  179:aastore         
	//   91  180:invokestatic    #100 <Method Object zza(zzdo, String, Object[])>
	//   92  183:areturn         
_L3:
		return ((Object) (new zza(((zzgf) (null)))));
	//   93  184:new             #12  <Class zzge$zzi$zza>
	//   94  187:dup             
	//   95  188:aconst_null     
	//   96  189:invokespecial   #103 <Method void zzge$zzi$zza(zzgf)>
	//   97  192:areturn         
_L2:
		return ((Object) (new zzge$zzi()));
	//   98  193:new             #2   <Class zzge$zzi>
	//   99  196:dup             
	//  100  197:invokespecial   #35  <Method void zzge$zzi()>
	//  101  200:areturn         
	}

	private static volatile zzdz zzbg;
	private static final zzge$zzi zzwe;
	private int zzbb;
	private String zzso;
	private String zzsw;
	private String zzsz;
	private String zzvy;
	private String zzvz;
	private String zzwa;
	private String zzwb;
	private int zzwc;
	private int zzwd;

	static 
	{
		zzwe = new zzge$zzi();
	//    0    0:new             #2   <Class zzge$zzi>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void zzge$zzi()>
	//    3    7:putstatic       #37  <Field zzge$zzi zzwe>
		zzcg.zza(com/google/android/gms/internal/clearcut/zzge$zzi, ((zzcg) (zzwe)));
	//    4   10:ldc1            #2   <Class zzge$zzi>
	//    5   12:getstatic       #37  <Field zzge$zzi zzwe>
	//    6   15:invokestatic    #40  <Method void zzcg.zza(Class, zzcg)>
	//*   7   18:return          
	}

	private zzge$zzi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void zzcg()>
		zzvy = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #44  <String "">
	//    4    7:putfield        #46  <Field String zzvy>
		zzso = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #44  <String "">
	//    7   13:putfield        #48  <Field String zzso>
		zzvz = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #44  <String "">
	//   10   19:putfield        #50  <Field String zzvz>
		zzwa = "";
	//   11   22:aload_0         
	//   12   23:ldc1            #44  <String "">
	//   13   25:putfield        #52  <Field String zzwa>
		zzwb = "";
	//   14   28:aload_0         
	//   15   29:ldc1            #44  <String "">
	//   16   31:putfield        #54  <Field String zzwb>
		zzsw = "";
	//   17   34:aload_0         
	//   18   35:ldc1            #44  <String "">
	//   19   37:putfield        #56  <Field String zzsw>
		zzsz = "";
	//   20   40:aload_0         
	//   21   41:ldc1            #44  <String "">
	//   22   43:putfield        #58  <Field String zzsz>
	//   23   46:return          
	}
}
