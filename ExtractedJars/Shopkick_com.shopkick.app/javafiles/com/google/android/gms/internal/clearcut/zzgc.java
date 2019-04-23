// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzdq, zzcg, zzgd, zzdz

public final class zzgc extends zzcg.zzd
	implements zzdq
{
	public static final class zza extends zzcg.zzc
		implements zzdq
	{

		private zza()
		{
			super(((zzcg.zzd) (zzgc.zzes())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #16  <Method zzgc zzgc.zzes()>
		//    2    4:invokespecial   #19  <Method void zzcg$zzc(zzcg$zzd)>
		//    3    7:return          
		}

		zza(zzgd zzgd1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void zzgc$zza()>
		//    2    4:return          
		}
	}


	private zzgc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void zzcg$zzd()>
		zzsf = 2;
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:putfield        #33  <Field byte zzsf>
	//    5    9:return          
	}

	public static zzgc zzer()
	{
		return zzsg;
	//    0    0:getstatic       #24  <Field zzgc zzsg>
	//    1    3:areturn         
	}

	static zzgc zzes()
	{
		return zzsg;
	//    0    0:getstatic       #24  <Field zzgc zzsg>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		boolean flag;
		obj1 = ((Object) (zzgd.zzba));
	//    0    0:getstatic       #43  <Field int[] zzgd.zzba>
	//    1    3:astore_3        
		flag = true;
	//    2    4:iconst_1        
	//    3    5:istore          4
		obj1[i - 1];
	//    4    7:aload_3         
	//    5    8:iload_1         
	//    6    9:iconst_1        
	//    7   10:isub            
	//    8   11:iaload          
		JVM INSTR tableswitch 1 7: default 56
	//	               1 161
	//	               2 152
	//	               3 142
	//	               4 138
	//	               5 89
	//	               6 81
	//	               7 64;
	//    9   12:tableswitch     1 7: default 56
	//	               1 161
	//	               2 152
	//	               3 142
	//	               4 138
	//	               5 89
	//	               6 81
	//	               7 64
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//   10   56:new             #45  <Class UnsupportedOperationException>
	//   11   59:dup             
	//   12   60:invokespecial   #46  <Method void UnsupportedOperationException()>
	//   13   63:athrow          
_L8:
		i = ((int) (flag));
	//   14   64:iload           4
	//   15   66:istore_1        
		if(obj == null)
	//*  16   67:aload_2         
	//*  17   68:ifnonnull       73
			i = 0;
	//   18   71:iconst_0        
	//   19   72:istore_1        
		zzsf = (byte)i;
	//   20   73:aload_0         
	//   21   74:iload_1         
	//   22   75:int2byte        
	//   23   76:putfield        #33  <Field byte zzsf>
		return ((Object) (null));
	//   24   79:aconst_null     
	//   25   80:areturn         
_L7:
		return ((Object) (Byte.valueOf(zzsf)));
	//   26   81:aload_0         
	//   27   82:getfield        #33  <Field byte zzsf>
	//   28   85:invokestatic    #52  <Method Byte Byte.valueOf(byte)>
	//   29   88:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   30   89:getstatic       #54  <Field zzdz zzbg>
	//   31   92:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   32   93:aload_2         
	//   33   94:ifnonnull       136
_L9:
		com/google/android/gms/internal/clearcut/zzgc;
	//   34   97:ldc1            #2   <Class zzgc>
		JVM INSTR monitorenter ;
	//   35   99:monitorenter    
		obj1 = ((Object) (zzbg));
	//   36  100:getstatic       #54  <Field zzdz zzbg>
	//   37  103:astore_3        
		obj = obj1;
	//   38  104:aload_3         
	//   39  105:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   40  106:aload_3         
	//   41  107:ifnonnull       125
_L11:
		obj = ((Object) (new zzcg.zzb(((zzcg) (zzsg)))));
	//   42  110:new             #56  <Class zzcg$zzb>
	//   43  113:dup             
	//   44  114:getstatic       #24  <Field zzgc zzsg>
	//   45  117:invokespecial   #59  <Method void zzcg$zzb(zzcg)>
	//   46  120:astore_2        
		zzbg = ((zzdz) (obj));
	//   47  121:aload_2         
	//   48  122:putstatic       #54  <Field zzdz zzbg>
_L12:
		com/google/android/gms/internal/clearcut/zzgc;
	//   49  125:ldc1            #2   <Class zzgc>
		JVM INSTR monitorexit ;
	//   50  127:monitorexit     
		return obj;
	//   51  128:aload_2         
	//   52  129:areturn         
		obj;
	//   53  130:astore_2        
		com/google/android/gms/internal/clearcut/zzgc;
	//   54  131:ldc1            #2   <Class zzgc>
		JVM INSTR monitorexit ;
	//   55  133:monitorexit     
		throw obj;
	//   56  134:aload_2         
	//   57  135:athrow          
_L10:
		return obj;
	//   58  136:aload_2         
	//   59  137:areturn         
_L5:
		return ((Object) (zzsg));
	//   60  138:getstatic       #24  <Field zzgc zzsg>
	//   61  141:areturn         
_L4:
		return zza(((zzdo) (zzsg)), "\003\0", ((Object []) (null)));
	//   62  142:getstatic       #24  <Field zzgc zzsg>
	//   63  145:ldc1            #61  <String "\003\0">
	//   64  147:aconst_null     
	//   65  148:invokestatic    #64  <Method Object zza(zzdo, String, Object[])>
	//   66  151:areturn         
_L3:
		return ((Object) (new zza(((zzgd) (null)))));
	//   67  152:new             #9   <Class zzgc$zza>
	//   68  155:dup             
	//   69  156:aconst_null     
	//   70  157:invokespecial   #67  <Method void zzgc$zza(zzgd)>
	//   71  160:areturn         
_L2:
		return ((Object) (new zzgc()));
	//   72  161:new             #2   <Class zzgc>
	//   73  164:dup             
	//   74  165:invokespecial   #22  <Method void zzgc()>
	//   75  168:areturn         
	}

	private static volatile zzdz zzbg;
	private static final zzgc zzsg;
	private byte zzsf;

	static 
	{
		zzsg = new zzgc();
	//    0    0:new             #2   <Class zzgc>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void zzgc()>
	//    3    7:putstatic       #24  <Field zzgc zzsg>
		zzcg.zza(com/google/android/gms/internal/clearcut/zzgc, ((zzcg) (zzsg)));
	//    4   10:ldc1            #2   <Class zzgc>
	//    5   12:getstatic       #24  <Field zzgc zzsg>
	//    6   15:invokestatic    #29  <Method void zzcg.zza(Class, zzcg)>
	//*   7   18:return          
	}
}
