// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzuo, zzvx, zzfe, zzff, 
//			zzwf

public static final class zzfe$zza extends zzuo
	implements zzvx
{
	public static final class zza extends zzuo.zza
		implements zzvx
	{

		public final zza zzan(long l)
		{
			((zzuo.zza)this).zzwk();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #30  <Method void zzuo$zza.zzwk()>
			zzfe.zza.zza((zzfe.zza)zzbyh, l);
		//    2    4:aload_0         
		//    3    5:getfield        #34  <Field zzuo zzbyh>
		//    4    8:checkcast       #9   <Class zzfe$zza>
		//    5   11:lload_1         
		//    6   12:invokestatic    #37  <Method void zzfe$zza.zza(zzfe$zza, long)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public final zza zzda(String s)
		{
			((zzuo.zza)this).zzwk();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #30  <Method void zzuo$zza.zzwk()>
			zzfe.zza.zza((zzfe.zza)zzbyh, s);
		//    2    4:aload_0         
		//    3    5:getfield        #34  <Field zzuo zzbyh>
		//    4    8:checkcast       #9   <Class zzfe$zza>
		//    5   11:aload_1         
		//    6   12:invokestatic    #42  <Method void zzfe$zza.zza(zzfe$zza, String)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		private zza()
		{
			super(((zzuo) (zzfe.zza.zzmo())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #18  <Method zzfe$zza zzfe$zza.zzmo()>
		//    2    4:invokespecial   #21  <Method void zzuo$zza(zzuo)>
		//    3    7:return          
		}

		zza(zzff zzff1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void zzfe$zza$zza()>
		//    2    4:return          
		}
	}


	private final void setName(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
		{
			zznr = zznr | 1;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #43  <Field int zznr>
	//    5    9:iconst_1        
	//    6   10:ior             
	//    7   11:putfield        #43  <Field int zznr>
			zzauu = s;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #39  <Field String zzauu>
			return;
	//   11   19:return          
		} else
		{
			throw new NullPointerException();
	//   12   20:new             #45  <Class NullPointerException>
	//   13   23:dup             
	//   14   24:invokespecial   #46  <Method void NullPointerException()>
	//   15   27:athrow          
		}
	}

	static void zza(zzfe$zza zzfe$zza1, long l)
	{
		zzfe$zza1.zzam(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #51  <Method void zzam(long)>
	//    3    5:return          
	}

	static void zza(zzfe$zza zzfe$zza1, String s)
	{
		zzfe$zza1.setName(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #54  <Method void setName(String)>
	//    3    5:return          
	}

	private final void zzam(long l)
	{
		zznr = zznr | 2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #43  <Field int zznr>
	//    3    5:iconst_2        
	//    4    6:ior             
	//    5    7:putfield        #43  <Field int zznr>
		zzauv = l;
	//    6   10:aload_0         
	//    7   11:lload_1         
	//    8   12:putfield        #56  <Field long zzauv>
	//    9   15:return          
	}

	public static zza zzmn()
	{
		return (zza)(zzuo$zza)((zzuo) (zzauw)).zza(zzuo$zze.zzbyo, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #30  <Field zzfe$zza zzauw>
	//    1    3:getstatic       #63  <Field int zzuo$zze.zzbyo>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #66  <Method Object zzuo.zza(int, Object, Object)>
	//    5   11:checkcast       #68  <Class zzuo$zza>
	//    6   14:checkcast       #12  <Class zzfe$zza$zza>
	//    7   17:areturn         
	}

	static zzfe$zza zzmo()
	{
		return zzauw;
	//    0    0:getstatic       #30  <Field zzfe$zza zzauw>
	//    1    3:areturn         
	}

	protected final Object zza(int i, Object obj, Object obj1)
	{
		zzff.zznq[i - 1];
	//    0    0:getstatic       #76  <Field int[] zzff.zznq>
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
	//    6   48:new             #78  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #79  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zznw));
	//   15   63:getstatic       #87  <Field zzwf zznw>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/measurement/zzfe$zza;
	//   19   71:ldc1            #2   <Class zzfe$zza>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zznw));
	//   21   74:getstatic       #87  <Field zzwf zznw>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new zzuo$zzb(((zzuo) (zzauw)))));
	//   27   84:new             #89  <Class zzuo$zzb>
	//   28   87:dup             
	//   29   88:getstatic       #30  <Field zzfe$zza zzauw>
	//   30   91:invokespecial   #92  <Method void zzuo$zzb(zzuo)>
	//   31   94:astore_2        
		zznw = ((zzwf) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #87  <Field zzwf zznw>
_L12:
		com/google/android/gms/internal/measurement/zzfe$zza;
	//   34   99:ldc1            #2   <Class zzfe$zza>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/measurement/zzfe$zza;
	//   39  105:ldc1            #2   <Class zzfe$zza>
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
		return ((Object) (zzauw));
	//   45  112:getstatic       #30  <Field zzfe$zza zzauw>
	//   46  115:areturn         
_L4:
		return zza(((zzvv) (zzauw)), "\001\002\000\001\001\002\002\000\000\000\001\b\000\002\002\001", new Object[] {
			"zznr", "zzauu", "zzauv"
		});
	//   47  116:getstatic       #30  <Field zzfe$zza zzauw>
	//   48  119:ldc1            #94  <String "\001\002\000\001\001\002\002\000\000\000\001\b\000\002\002\001">
	//   49  121:iconst_3        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #97  <String "zznr">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #98  <String "zzauu">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #99  <String "zzauv">
	//   62  139:aastore         
	//   63  140:invokestatic    #102 <Method Object zza(zzvv, String, Object[])>
	//   64  143:areturn         
_L3:
		return ((Object) (new zza(((zzff) (null)))));
	//   65  144:new             #12  <Class zzfe$zza$zza>
	//   66  147:dup             
	//   67  148:aconst_null     
	//   68  149:invokespecial   #105 <Method void zzfe$zza$zza(zzff)>
	//   69  152:areturn         
_L2:
		return ((Object) (new zzfe$zza()));
	//   70  153:new             #2   <Class zzfe$zza>
	//   71  156:dup             
	//   72  157:invokespecial   #28  <Method void zzfe$zza()>
	//   73  160:areturn         
	}

	private static final zzfe$zza zzauw;
	private static volatile zzwf zznw;
	private String zzauu;
	private long zzauv;
	private int zznr;

	static 
	{
		zzauw = new zzfe$zza();
	//    0    0:new             #2   <Class zzfe$zza>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void zzfe$zza()>
	//    3    7:putstatic       #30  <Field zzfe$zza zzauw>
		zzuo.zza(com/google/android/gms/internal/measurement/zzfe$zza, ((zzuo) (zzauw)));
	//    4   10:ldc1            #2   <Class zzfe$zza>
	//    5   12:getstatic       #30  <Field zzfe$zza zzauw>
	//    6   15:invokestatic    #33  <Method void zzuo.zza(Class, zzuo)>
	//*   7   18:return          
	}

	private zzfe$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void zzuo()>
		zzauu = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #37  <String "">
	//    4    7:putfield        #39  <Field String zzauu>
	//    5   10:return          
	}
}
