// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.nio.*;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzen, zziu, zzgm, zzeo, 
//			zzec, zzhw, zzhf, zzja, 
//			zziw, zzga, zzfg, zzff, 
//			zzuo, zzvx, zzfe, zzwf, 
//			zzuu, zzur, zzfh, zzus, 
//			zzut

public abstract class zzfe extends zzen
{
	static class zza extends zzuo
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
				zza.zza((zza)zzbyh, l);
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
				zza.zza((zza)zzbyh, s);
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
				super(((zzuo) (zza.zzmo())));
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

		static void zza(zza zza1, long l)
		{
			zza1.zzam(l);
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:invokespecial   #51  <Method void zzam(long)>
		//    3    5:return          
		}

		static void zza(zza zza1, String s)
		{
			zza1.setName(s);
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
			return (zza)(zzuo.zza)((zzuo) (zzauw)).zza(zzuo.zze.zzbyo, ((Object) (null)), ((Object) (null)));
		//    0    0:getstatic       #30  <Field zzfe$zza zzauw>
		//    1    3:getstatic       #63  <Field int zzuo$zze.zzbyo>
		//    2    6:aconst_null     
		//    3    7:aconst_null     
		//    4    8:invokevirtual   #66  <Method Object zzuo.zza(int, Object, Object)>
		//    5   11:checkcast       #68  <Class zzuo$zza>
		//    6   14:checkcast       #12  <Class zzfe$zza$zza>
		//    7   17:areturn         
		}

		static zza zzmo()
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
		//		               1 153
		//		               2 144
		//		               3 116
		//		               4 112
		//		               5 63
		//		               6 58
		//		               7 56;
		//    5    7:tableswitch     1 7: default 48
		//		               1 153
		//		               2 144
		//		               3 116
		//		               4 112
		//		               5 63
		//		               6 58
		//		               7 56
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
			obj = ((Object) (new zzuo.zzb(((zzuo) (zzauw)))));
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
			return ((Object) (new zza()));
		//   70  153:new             #2   <Class zzfe$zza>
		//   71  156:dup             
		//   72  157:invokespecial   #28  <Method void zzfe$zza()>
		//   73  160:areturn         
		}

		private static final zza zzauw;
		private static volatile zzwf zznw;
		private String zzauu;
		private long zzauv;
		private int zznr;

		static 
		{
			zzauw = new zza();
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

		private zza()
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

	static final class zzb extends zzuo
		implements zzvx
	{
		public static final class zza extends zzuo.zza
			implements zzvx
		{

			public final zza zzb(zza zza1)
			{
				((zzuo.zza)this).zzwk();
			//    0    0:aload_0         
			//    1    1:invokevirtual   #30  <Method void zzuo$zza.zzwk()>
				zzb.zza((zzb)zzbyh, zza1);
			//    2    4:aload_0         
			//    3    5:getfield        #34  <Field zzuo zzbyh>
			//    4    8:checkcast       #9   <Class zzfe$zzb>
			//    5   11:aload_1         
			//    6   12:invokestatic    #37  <Method void zzfe$zzb.zza(zzfe$zzb, zzfe$zza)>
				return this;
			//    7   15:aload_0         
			//    8   16:areturn         
			}

			private zza()
			{
				super(((zzuo) (zzb.zzmq())));
			//    0    0:aload_0         
			//    1    1:invokestatic    #19  <Method zzfe$zzb zzfe$zzb.zzmq()>
			//    2    4:invokespecial   #22  <Method void zzuo$zza(zzuo)>
			//    3    7:return          
			}

			zza(zzff zzff1)
			{
				this();
			//    0    0:aload_0         
			//    1    1:invokespecial   #26  <Method void zzfe$zzb$zza()>
			//    2    4:return          
			}
		}

		public static final class zzb extends Enum
			implements zzur
		{

			public static zzb[] values()
			{
				return (zzb[])((zzb []) (zzavc)).clone();
			//    0    0:getstatic       #38  <Field zzfe$zzb$zzb[] zzavc>
			//    1    3:invokevirtual   #59  <Method Object _5B_Lcom.google.android.gms.internal.measurement.zzfe$zzb$zzb_3B_.clone()>
			//    2    6:checkcast       #55  <Class zzfe$zzb$zzb[]>
			//    3    9:areturn         
			}

			public static zzut zzd()
			{
				return zzfh.zzoc;
			//    0    0:getstatic       #67  <Field zzut zzfh.zzoc>
			//    1    3:areturn         
			}

			public static zzb zzt(int i)
			{
				switch(i)
			//*   0    0:iload_0         
				{
			//*   1    1:tableswitch     1 2: default 24
			//			               1 30
			//			               2 26
				default:
					return null;
			//    2   24:aconst_null     
			//    3   25:areturn         

				case 2: // '\002'
					return zzavb;
			//    4   26:getstatic       #36  <Field zzfe$zzb$zzb zzavb>
			//    5   29:areturn         

				case 1: // '\001'
					return zzava;
			//    6   30:getstatic       #32  <Field zzfe$zzb$zzb zzava>
			//    7   33:areturn         
				}
			}

			public final int zzc()
			{
				return value;
			//    0    0:aload_0         
			//    1    1:getfield        #50  <Field int value>
			//    2    4:ireturn         
			}

			private static final zzb zzava;
			private static final zzb zzavb;
			private static final zzb zzavc[];
			private static final zzus zzoa = new zzfg();
			private final int value;

			static 
			{
				zzava = new zzb("RADS", 0, 1);
			//    0    0:new             #2   <Class zzfe$zzb$zzb>
			//    1    3:dup             
			//    2    4:ldc1            #26  <String "RADS">
			//    3    6:iconst_0        
			//    4    7:iconst_1        
			//    5    8:invokespecial   #30  <Method void zzfe$zzb$zzb(String, int, int)>
			//    6   11:putstatic       #32  <Field zzfe$zzb$zzb zzava>
				zzavb = new zzb("PROVISIONING", 1, 2);
			//    7   14:new             #2   <Class zzfe$zzb$zzb>
			//    8   17:dup             
			//    9   18:ldc1            #34  <String "PROVISIONING">
			//   10   20:iconst_1        
			//   11   21:iconst_2        
			//   12   22:invokespecial   #30  <Method void zzfe$zzb$zzb(String, int, int)>
			//   13   25:putstatic       #36  <Field zzfe$zzb$zzb zzavb>
				zzavc = (new zzb[] {
					zzava, zzavb
				});
			//   14   28:iconst_2        
			//   15   29:anewarray       zzb[]
			//   16   32:dup             
			//   17   33:iconst_0        
			//   18   34:getstatic       #32  <Field zzfe$zzb$zzb zzava>
			//   19   37:aastore         
			//   20   38:dup             
			//   21   39:iconst_1        
			//   22   40:getstatic       #36  <Field zzfe$zzb$zzb zzavb>
			//   23   43:aastore         
			//   24   44:putstatic       #38  <Field zzfe$zzb$zzb[] zzavc>
			//   25   47:new             #40  <Class zzfg>
			//   26   50:dup             
			//   27   51:invokespecial   #42  <Method void zzfg()>
			//   28   54:putstatic       #44  <Field zzus zzoa>
			//*  29   57:return          
			}

			private zzb(String s, int i, int j)
			{
				super(s, i);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:invokespecial   #48  <Method void Enum(String, int)>
				value = j;
			//    4    6:aload_0         
			//    5    7:iload_3         
			//    6    8:putfield        #50  <Field int value>
			//    7   11:return          
			}
		}


		public static zzwf zza()
		{
			return (zzwf)((zzuo) (zzauz)).zza(zzuo.zze.zzbyq, ((Object) (null)), ((Object) (null)));
		//    0    0:getstatic       #33  <Field zzfe$zzb zzauz>
		//    1    3:getstatic       #52  <Field int zzuo$zze.zzbyq>
		//    2    6:aconst_null     
		//    3    7:aconst_null     
		//    4    8:invokevirtual   #55  <Method Object zzuo.zza(int, Object, Object)>
		//    5   11:checkcast       #57  <Class zzwf>
		//    6   14:areturn         
		}

		private final void zza(zza zza1)
		{
			if(zza1 != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          65
			{
				if(!zzauy.zztz())
		//*   2    4:aload_0         
		//*   3    5:getfield        #46  <Field zzuu zzauy>
		//*   4    8:invokeinterface #66  <Method boolean zzuu.zztz()>
		//*   5   13:ifne            53
				{
					zzuu zzuu1 = zzauy;
		//    6   16:aload_0         
		//    7   17:getfield        #46  <Field zzuu zzauy>
		//    8   20:astore_3        
					int i = zzuu1.size();
		//    9   21:aload_3         
		//   10   22:invokeinterface #70  <Method int zzuu.size()>
		//   11   27:istore_2        
					if(i == 0)
		//*  12   28:iload_2         
		//*  13   29:ifne            38
						i = 10;
		//   14   32:bipush          10
		//   15   34:istore_2        
					else
		//*  16   35:goto            42
						i <<= 1;
		//   17   38:iload_2         
		//   18   39:iconst_1        
		//   19   40:ishl            
		//   20   41:istore_2        
					zzauy = zzuu1.zzal(i);
		//   21   42:aload_0         
		//   22   43:aload_3         
		//   23   44:iload_2         
		//   24   45:invokeinterface #74  <Method zzuu zzuu.zzal(int)>
		//   25   50:putfield        #46  <Field zzuu zzauy>
				}
				zzauy.add(((Object) (zza1)));
		//   26   53:aload_0         
		//   27   54:getfield        #46  <Field zzuu zzauy>
		//   28   57:aload_1         
		//   29   58:invokeinterface #78  <Method boolean zzuu.add(Object)>
		//   30   63:pop             
				return;
		//   31   64:return          
			} else
			{
				throw new NullPointerException();
		//   32   65:new             #80  <Class NullPointerException>
		//   33   68:dup             
		//   34   69:invokespecial   #81  <Method void NullPointerException()>
		//   35   72:athrow          
			}
		}

		static void zza(zzb zzb1, zza zza1)
		{
			zzb1.zza(zza1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #84  <Method void zza(zzfe$zza)>
		//    3    5:return          
		}

		public static zza zzmp()
		{
			return (zza)(zzuo.zza)((zzuo) (zzauz)).zza(zzuo.zze.zzbyo, ((Object) (null)), ((Object) (null)));
		//    0    0:getstatic       #33  <Field zzfe$zzb zzauz>
		//    1    3:getstatic       #89  <Field int zzuo$zze.zzbyo>
		//    2    6:aconst_null     
		//    3    7:aconst_null     
		//    4    8:invokevirtual   #55  <Method Object zzuo.zza(int, Object, Object)>
		//    5   11:checkcast       #91  <Class zzuo$zza>
		//    6   14:checkcast       #12  <Class zzfe$zzb$zza>
		//    7   17:areturn         
		}

		static zzb zzmq()
		{
			return zzauz;
		//    0    0:getstatic       #33  <Field zzfe$zzb zzauz>
		//    1    3:areturn         
		}

		protected final Object zza(int i, Object obj, Object obj1)
		{
			zzff.zznq[i - 1];
		//    0    0:getstatic       #99  <Field int[] zzff.zznq>
		//    1    3:iload_1         
		//    2    4:iconst_1        
		//    3    5:isub            
		//    4    6:iaload          
			JVM INSTR tableswitch 1 7: default 48
		//		               1 166
		//		               2 157
		//		               3 116
		//		               4 112
		//		               5 63
		//		               6 58
		//		               7 56;
		//    5    7:tableswitch     1 7: default 48
		//		               1 166
		//		               2 157
		//		               3 116
		//		               4 112
		//		               5 63
		//		               6 58
		//		               7 56
			   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
			throw new UnsupportedOperationException();
		//    6   48:new             #101 <Class UnsupportedOperationException>
		//    7   51:dup             
		//    8   52:invokespecial   #102 <Method void UnsupportedOperationException()>
		//    9   55:athrow          
_L8:
			return ((Object) (null));
		//   10   56:aconst_null     
		//   11   57:areturn         
_L7:
			return ((Object) (Byte.valueOf((byte)1)));
		//   12   58:iconst_1        
		//   13   59:invokestatic    #108 <Method Byte Byte.valueOf(byte)>
		//   14   62:areturn         
_L6:
			obj = ((Object) (zznw));
		//   15   63:getstatic       #110 <Field zzwf zznw>
		//   16   66:astore_2        
			if(obj != null) goto _L10; else goto _L9
		//   17   67:aload_2         
		//   18   68:ifnonnull       110
_L9:
			com/google/android/gms/internal/measurement/zzfe$zzb;
		//   19   71:ldc1            #2   <Class zzfe$zzb>
			JVM INSTR monitorenter ;
		//   20   73:monitorenter    
			obj1 = ((Object) (zznw));
		//   21   74:getstatic       #110 <Field zzwf zznw>
		//   22   77:astore_3        
			obj = obj1;
		//   23   78:aload_3         
		//   24   79:astore_2        
			if(obj1 != null) goto _L12; else goto _L11
		//   25   80:aload_3         
		//   26   81:ifnonnull       99
_L11:
			obj = ((Object) (new zzuo.zzb(((zzuo) (zzauz)))));
		//   27   84:new             #112 <Class zzuo$zzb>
		//   28   87:dup             
		//   29   88:getstatic       #33  <Field zzfe$zzb zzauz>
		//   30   91:invokespecial   #115 <Method void zzuo$zzb(zzuo)>
		//   31   94:astore_2        
			zznw = ((zzwf) (obj));
		//   32   95:aload_2         
		//   33   96:putstatic       #110 <Field zzwf zznw>
_L12:
			com/google/android/gms/internal/measurement/zzfe$zzb;
		//   34   99:ldc1            #2   <Class zzfe$zzb>
			JVM INSTR monitorexit ;
		//   35  101:monitorexit     
			return obj;
		//   36  102:aload_2         
		//   37  103:areturn         
			obj;
		//   38  104:astore_2        
			com/google/android/gms/internal/measurement/zzfe$zzb;
		//   39  105:ldc1            #2   <Class zzfe$zzb>
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
			return ((Object) (zzauz));
		//   45  112:getstatic       #33  <Field zzfe$zzb zzauz>
		//   46  115:areturn         
_L4:
			obj = ((Object) (com.google.android.gms.internal.measurement.zzb.zzd()));
		//   47  116:invokestatic    #119 <Method zzut zzfe$zzb$zzb.zzd()>
		//   48  119:astore_2        
			return zza(((zzvv) (zzauz)), "\001\002\000\001\001\002\002\000\001\000\001\f\000\002\033", new Object[] {
				"zznr", "zzaux", obj, "zzauy", com/google/android/gms/internal/measurement/zzfe$zza
			});
		//   49  120:getstatic       #33  <Field zzfe$zzb zzauz>
		//   50  123:ldc1            #121 <String "\001\002\000\001\001\002\002\000\001\000\001\f\000\002\033">
		//   51  125:iconst_5        
		//   52  126:anewarray       Object[]
		//   53  129:dup             
		//   54  130:iconst_0        
		//   55  131:ldc1            #124 <String "zznr">
		//   56  133:aastore         
		//   57  134:dup             
		//   58  135:iconst_1        
		//   59  136:ldc1            #125 <String "zzaux">
		//   60  138:aastore         
		//   61  139:dup             
		//   62  140:iconst_2        
		//   63  141:aload_2         
		//   64  142:aastore         
		//   65  143:dup             
		//   66  144:iconst_3        
		//   67  145:ldc1            #126 <String "zzauy">
		//   68  147:aastore         
		//   69  148:dup             
		//   70  149:iconst_4        
		//   71  150:ldc1            #128 <Class zzfe$zza>
		//   72  152:aastore         
		//   73  153:invokestatic    #131 <Method Object zza(zzvv, String, Object[])>
		//   74  156:areturn         
_L3:
			return ((Object) (new zza(((zzff) (null)))));
		//   75  157:new             #12  <Class zzfe$zzb$zza>
		//   76  160:dup             
		//   77  161:aconst_null     
		//   78  162:invokespecial   #134 <Method void zzfe$zzb$zza(zzff)>
		//   79  165:areturn         
_L2:
			return ((Object) (new zzb()));
		//   80  166:new             #2   <Class zzfe$zzb>
		//   81  169:dup             
		//   82  170:invokespecial   #31  <Method void zzfe$zzb()>
		//   83  173:areturn         
		}

		private static final zzb zzauz;
		private static volatile zzwf zznw;
		private int zzaux;
		private zzuu zzauy;
		private int zznr;

		static 
		{
			zzauz = new zzb();
		//    0    0:new             #2   <Class zzfe$zzb>
		//    1    3:dup             
		//    2    4:invokespecial   #31  <Method void zzfe$zzb()>
		//    3    7:putstatic       #33  <Field zzfe$zzb zzauz>
			zzuo.zza(com/google/android/gms/internal/measurement/zzfe$zzb, ((zzuo) (zzauz)));
		//    4   10:ldc1            #2   <Class zzfe$zzb>
		//    5   12:getstatic       #33  <Field zzfe$zzb zzauz>
		//    6   15:invokestatic    #36  <Method void zzuo.zza(Class, zzuo)>
		//*   7   18:return          
		}

		private zzb()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #38  <Method void zzuo()>
			zzaux = 1;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #40  <Field int zzaux>
			zzauy = zzwg();
		//    5    9:aload_0         
		//    6   10:invokestatic    #44  <Method zzuu zzwg()>
		//    7   13:putfield        #46  <Field zzuu zzauy>
		//    8   16:return          
		}
	}

	public static final class zzc extends IOException
	{

		zzc()
		{
			super("CodedOutputStream was writing to a flat byte array and ran out of space.");
		//    0    0:aload_0         
		//    1    1:ldc1            #11  <String "CodedOutputStream was writing to a flat byte array and ran out of space.">
		//    2    3:invokespecial   #14  <Method void IOException(String)>
		//    3    6:return          
		}

		zzc(String s)
		{
			String s1 = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
		//    0    0:ldc1            #17  <String "CodedOutputStream was writing to a flat byte array and ran out of space.: ">
		//    1    2:invokestatic    #23  <Method String String.valueOf(Object)>
		//    2    5:astore_2        
			s = String.valueOf(((Object) (s)));
		//    3    6:aload_1         
		//    4    7:invokestatic    #23  <Method String String.valueOf(Object)>
		//    5   10:astore_1        
			if(s.length() != 0)
		//*   6   11:aload_1         
		//*   7   12:invokevirtual   #27  <Method int String.length()>
		//*   8   15:ifeq            27
				s = s1.concat(s);
		//    9   18:aload_2         
		//   10   19:aload_1         
		//   11   20:invokevirtual   #31  <Method String String.concat(String)>
		//   12   23:astore_1        
			else
		//*  13   24:goto            36
				s = new String(s1);
		//   14   27:new             #19  <Class String>
		//   15   30:dup             
		//   16   31:aload_2         
		//   17   32:invokespecial   #32  <Method void String(String)>
		//   18   35:astore_1        
			super(s);
		//   19   36:aload_0         
		//   20   37:aload_1         
		//   21   38:invokespecial   #14  <Method void IOException(String)>
		//   22   41:return          
		}

		zzc(String s, Throwable throwable)
		{
			String s1 = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
		//    0    0:ldc1            #17  <String "CodedOutputStream was writing to a flat byte array and ran out of space.: ">
		//    1    2:invokestatic    #23  <Method String String.valueOf(Object)>
		//    2    5:astore_3        
			s = String.valueOf(((Object) (s)));
		//    3    6:aload_1         
		//    4    7:invokestatic    #23  <Method String String.valueOf(Object)>
		//    5   10:astore_1        
			if(s.length() != 0)
		//*   6   11:aload_1         
		//*   7   12:invokevirtual   #27  <Method int String.length()>
		//*   8   15:ifeq            27
				s = s1.concat(s);
		//    9   18:aload_3         
		//   10   19:aload_1         
		//   11   20:invokevirtual   #31  <Method String String.concat(String)>
		//   12   23:astore_1        
			else
		//*  13   24:goto            36
				s = new String(s1);
		//   14   27:new             #19  <Class String>
		//   15   30:dup             
		//   16   31:aload_3         
		//   17   32:invokespecial   #32  <Method void String(String)>
		//   18   35:astore_1        
			super(s, throwable);
		//   19   36:aload_0         
		//   20   37:aload_1         
		//   21   38:aload_2         
		//   22   39:invokespecial   #35  <Method void IOException(String, Throwable)>
		//   23   42:return          
		}

		zzc(Throwable throwable)
		{
			super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable);
		//    0    0:aload_0         
		//    1    1:ldc1            #11  <String "CodedOutputStream was writing to a flat byte array and ran out of space.">
		//    2    3:aload_1         
		//    3    4:invokespecial   #35  <Method void IOException(String, Throwable)>
		//    4    7:return          
		}
	}

	static final class zzd extends zzfe
	{

		private final void zzo(String s)
			throws IOException
		{
			try
			{
				zziw.zza(((CharSequence) (s)), zzsw);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field ByteBuffer zzsw>
		//    3    5:invokestatic    #54  <Method void zziw.zza(CharSequence, ByteBuffer)>
				return;
		//    4    8:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
		//*   5    9:astore_1        
			{
				throw new zzc(((Throwable) (s)));
		//    6   10:new             #56  <Class zzfe$zzc>
		//    7   13:dup             
		//    8   14:aload_1         
		//    9   15:invokespecial   #59  <Method void zzfe$zzc(Throwable)>
		//   10   18:athrow          
			}
		}

		public final void flush()
		{
			zzsv.position(zzsw.position());
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field ByteBuffer zzsv>
		//    2    4:aload_0         
		//    3    5:getfield        #35  <Field ByteBuffer zzsw>
		//    4    8:invokevirtual   #39  <Method int ByteBuffer.position()>
		//    5   11:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.position(int)>
		//    6   14:pop             
		//    7   15:return          
		}

		public final void write(byte abyte0[], int i, int j)
			throws IOException
		{
			try
			{
				zzsw.put(abyte0, i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field ByteBuffer zzsw>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:iload_3         
		//    5    7:invokevirtual   #73  <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
		//    6   10:pop             
				return;
		//    7   11:return          
			}
		//*   8   12:astore_1        
		//*   9   13:new             #56  <Class zzfe$zzc>
		//*  10   16:dup             
		//*  11   17:aload_1         
		//*  12   18:invokespecial   #59  <Method void zzfe$zzc(Throwable)>
		//*  13   21:athrow          
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
		//*  14   22:astore_1        
			{
				throw new zzc(((Throwable) (abyte0)));
		//   15   23:new             #56  <Class zzfe$zzc>
		//   16   26:dup             
		//   17   27:aload_1         
		//   18   28:invokespecial   #59  <Method void zzfe$zzc(Throwable)>
		//   19   31:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
			{
				throw new zzc(((Throwable) (abyte0)));
			}
		}

		public final void zza(int i, long l)
			throws IOException
		{
			((zzfe)this).zzd(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
			((zzfe)this).zze(l);
		//    4    6:aload_0         
		//    5    7:lload_2         
		//    6    8:invokevirtual   #81  <Method void zzfe.zze(long)>
		//    7   11:return          
		}

		public final void zza(int i, zzeo zzeo1)
			throws IOException
		{
			((zzfe)this).zzd(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
			((zzfe)this).zza(zzeo1);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #85  <Method void zzfe.zza(zzeo)>
		//    7   11:return          
		}

		public final void zza(int i, zzhf zzhf1)
			throws IOException
		{
			((zzfe)this).zzd(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
			((zzfe)this).zzb(zzhf1);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #90  <Method void zzfe.zzb(zzhf)>
		//    7   11:return          
		}

		final void zza(int i, zzhf zzhf1, zzhw zzhw1)
			throws IOException
		{
			((zzfe)this).zzd(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
			((zzfe)this).zza(zzhf1, zzhw1);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:aload_3         
		//    7    9:invokevirtual   #94  <Method void zzfe.zza(zzhf, zzhw)>
		//    8   12:return          
		}

		public final void zza(int i, String s)
			throws IOException
		{
			((zzfe)this).zzd(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
			((zzfe)this).zzm(s);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #98  <Method void zzfe.zzm(String)>
		//    7   11:return          
		}

		public final void zza(zzeo zzeo1)
			throws IOException
		{
			((zzfe)this).zzas(zzeo1.size());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #103 <Method int zzeo.size()>
		//    3    5:invokevirtual   #107 <Method void zzfe.zzas(int)>
			zzeo1.zza(((zzen) (this)));
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:invokevirtual   #110 <Method void zzeo.zza(zzen)>
		//    7   13:return          
		}

		final void zza(zzhf zzhf1, zzhw zzhw1)
			throws IOException
		{
			zzec zzec1 = (zzec)zzhf1;
		//    0    0:aload_1         
		//    1    1:checkcast       #112 <Class zzec>
		//    2    4:astore          5
			int j = zzec1.zzcf();
		//    3    6:aload           5
		//    4    8:invokevirtual   #115 <Method int zzec.zzcf()>
		//    5   11:istore          4
			int i = j;
		//    6   13:iload           4
		//    7   15:istore_3        
			if(j == -1)
		//*   8   16:iload           4
		//*   9   18:iconst_m1       
		//*  10   19:icmpne          37
			{
				i = zzhw1.zzp(((Object) (zzec1)));
		//   11   22:aload_2         
		//   12   23:aload           5
		//   13   25:invokeinterface #121 <Method int zzhw.zzp(Object)>
		//   14   30:istore_3        
				zzec1.zzy(i);
		//   15   31:aload           5
		//   16   33:iload_3         
		//   17   34:invokevirtual   #124 <Method void zzec.zzy(int)>
			}
			((zzfe)this).zzas(i);
		//   18   37:aload_0         
		//   19   38:iload_3         
		//   20   39:invokevirtual   #107 <Method void zzfe.zzas(int)>
			zzhw1.zza(((Object) (zzhf1)), ((zzjj) (zzss)));
		//   21   42:aload_2         
		//   22   43:aload_1         
		//   23   44:aload_0         
		//   24   45:getfield        #128 <Field zzfg zzss>
		//   25   48:invokeinterface #131 <Method void zzhw.zza(Object, zzjj)>
		//   26   53:return          
		}

		public final void zza(byte abyte0[], int i, int j)
			throws IOException
		{
			((zzfe)this).write(abyte0, i, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:invokevirtual   #133 <Method void zzfe.write(byte[], int, int)>
		//    5    7:return          
		}

		public final void zzar(int i)
			throws IOException
		{
			if(i >= 0)
		//*   0    0:iload_1         
		//*   1    1:iflt            10
			{
				((zzfe)this).zzas(i);
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:invokevirtual   #107 <Method void zzfe.zzas(int)>
				return;
		//    5    9:return          
			} else
			{
				((zzfe)this).zze(i);
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:i2l             
		//    9   13:invokevirtual   #81  <Method void zzfe.zze(long)>
				return;
		//   10   16:return          
			}
		}

		public final void zzas(int i)
			throws IOException
		{
_L1:
			if((i & 0xffffff80) == 0)
		//*   0    0:iload_1         
		//*   1    1:bipush          -128
		//*   2    3:iand            
		//*   3    4:ifne            18
				try
				{
					zzsw.put((byte)i);
		//    4    7:aload_0         
		//    5    8:getfield        #35  <Field ByteBuffer zzsw>
		//    6   11:iload_1         
		//    7   12:int2byte        
		//    8   13:invokevirtual   #137 <Method ByteBuffer ByteBuffer.put(byte)>
		//    9   16:pop             
					return;
		//   10   17:return          
				}
		//*  11   18:aload_0         
		//*  12   19:getfield        #35  <Field ByteBuffer zzsw>
		//*  13   22:iload_1         
		//*  14   23:bipush          127
		//*  15   25:iand            
		//*  16   26:sipush          128
		//*  17   29:ior             
		//*  18   30:int2byte        
		//*  19   31:invokevirtual   #137 <Method ByteBuffer ByteBuffer.put(byte)>
		//*  20   34:pop             
		//*  21   35:iload_1         
		//*  22   36:bipush          7
		//*  23   38:iushr           
		//*  24   39:istore_1        
		//*  25   40:goto            0
				catch(BufferOverflowException bufferoverflowexception)
		//*  26   43:astore_2        
				{
					throw new zzc(((Throwable) (bufferoverflowexception)));
		//   27   44:new             #56  <Class zzfe$zzc>
		//   28   47:dup             
		//   29   48:aload_2         
		//   30   49:invokespecial   #59  <Method void zzfe$zzc(Throwable)>
		//   31   52:athrow          
				}
			zzsw.put((byte)(i & 0x7f | 0x80));
			i >>>= 7;
			  goto _L1
		}

		public final void zzau(int i)
			throws IOException
		{
			try
			{
				zzsw.putInt(i);
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field ByteBuffer zzsw>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #142 <Method ByteBuffer ByteBuffer.putInt(int)>
		//    4    8:pop             
				return;
		//    5    9:return          
			}
			catch(BufferOverflowException bufferoverflowexception)
		//*   6   10:astore_2        
			{
				throw new zzc(((Throwable) (bufferoverflowexception)));
		//    7   11:new             #56  <Class zzfe$zzc>
		//    8   14:dup             
		//    9   15:aload_2         
		//   10   16:invokespecial   #59  <Method void zzfe$zzc(Throwable)>
		//   11   19:athrow          
			}
		}

		public final void zzb(int i, zzeo zzeo1)
			throws IOException
		{
			((zzfe)this).zzd(1, 3);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iconst_3        
		//    3    3:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
			((zzfe)this).zzf(2, i);
		//    4    6:aload_0         
		//    5    7:iconst_2        
		//    6    8:iload_1         
		//    7    9:invokevirtual   #145 <Method void zzfe.zzf(int, int)>
			((zzfe)this).zza(3, zzeo1);
		//    8   12:aload_0         
		//    9   13:iconst_3        
		//   10   14:aload_2         
		//   11   15:invokevirtual   #147 <Method void zzfe.zza(int, zzeo)>
			((zzfe)this).zzd(1, 4);
		//   12   18:aload_0         
		//   13   19:iconst_1        
		//   14   20:iconst_4        
		//   15   21:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
		//   16   24:return          
		}

		public final void zzb(int i, zzhf zzhf1)
			throws IOException
		{
			((zzfe)this).zzd(1, 3);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iconst_3        
		//    3    3:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
			((zzfe)this).zzf(2, i);
		//    4    6:aload_0         
		//    5    7:iconst_2        
		//    6    8:iload_1         
		//    7    9:invokevirtual   #145 <Method void zzfe.zzf(int, int)>
			((zzfe)this).zza(3, zzhf1);
		//    8   12:aload_0         
		//    9   13:iconst_3        
		//   10   14:aload_2         
		//   11   15:invokevirtual   #149 <Method void zzfe.zza(int, zzhf)>
			((zzfe)this).zzd(1, 4);
		//   12   18:aload_0         
		//   13   19:iconst_1        
		//   14   20:iconst_4        
		//   15   21:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
		//   16   24:return          
		}

		public final void zzb(int i, boolean flag)
			throws IOException
		{
			((zzfe)this).zzd(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
			((zzfe)this).zzc((byte)flag);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:int2byte        
		//    7    9:invokevirtual   #154 <Method void zzfe.zzc(byte)>
		//    8   12:return          
		}

		public final void zzb(zzhf zzhf1)
			throws IOException
		{
			((zzfe)this).zzas(zzhf1.zzeq());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokeinterface #159 <Method int zzhf.zzeq()>
		//    3    7:invokevirtual   #107 <Method void zzfe.zzas(int)>
			zzhf1.zzb(((zzfe) (this)));
		//    4   10:aload_1         
		//    5   11:aload_0         
		//    6   12:invokeinterface #162 <Method void zzhf.zzb(zzfe)>
		//    7   17:return          
		}

		public final void zzc(byte byte0)
			throws IOException
		{
			try
			{
				zzsw.put(byte0);
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field ByteBuffer zzsw>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #137 <Method ByteBuffer ByteBuffer.put(byte)>
		//    4    8:pop             
				return;
		//    5    9:return          
			}
			catch(BufferOverflowException bufferoverflowexception)
		//*   6   10:astore_2        
			{
				throw new zzc(((Throwable) (bufferoverflowexception)));
		//    7   11:new             #56  <Class zzfe$zzc>
		//    8   14:dup             
		//    9   15:aload_2         
		//   10   16:invokespecial   #59  <Method void zzfe$zzc(Throwable)>
		//   11   19:athrow          
			}
		}

		public final void zzc(int i, long l)
			throws IOException
		{
			((zzfe)this).zzd(i, 1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_1        
		//    3    3:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
			((zzfe)this).zzg(l);
		//    4    6:aload_0         
		//    5    7:lload_2         
		//    6    8:invokevirtual   #165 <Method void zzfe.zzg(long)>
		//    7   11:return          
		}

		public final void zzd(int i, int j)
			throws IOException
		{
			((zzfe)this).zzas(i << 3 | j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_3        
		//    3    3:ishl            
		//    4    4:iload_2         
		//    5    5:ior             
		//    6    6:invokevirtual   #107 <Method void zzfe.zzas(int)>
		//    7    9:return          
		}

		public final int zzdz()
		{
			return zzsw.remaining();
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field ByteBuffer zzsw>
		//    2    4:invokevirtual   #169 <Method int ByteBuffer.remaining()>
		//    3    7:ireturn         
		}

		public final void zze(int i, int j)
			throws IOException
		{
			((zzfe)this).zzd(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
			((zzfe)this).zzar(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #171 <Method void zzfe.zzar(int)>
		//    7   11:return          
		}

		public final void zze(long l)
			throws IOException
		{
_L1:
			if((-128L & l) == 0L)
		//*   0    0:ldc2w           #172 <Long -128L>
		//*   1    3:lload_1         
		//*   2    4:land            
		//*   3    5:lconst_0        
		//*   4    6:lcmp            
		//*   5    7:ifne            22
				try
				{
					zzsw.put((byte)(int)l);
		//    6   10:aload_0         
		//    7   11:getfield        #35  <Field ByteBuffer zzsw>
		//    8   14:lload_1         
		//    9   15:l2i             
		//   10   16:int2byte        
		//   11   17:invokevirtual   #137 <Method ByteBuffer ByteBuffer.put(byte)>
		//   12   20:pop             
					return;
		//   13   21:return          
				}
		//*  14   22:aload_0         
		//*  15   23:getfield        #35  <Field ByteBuffer zzsw>
		//*  16   26:lload_1         
		//*  17   27:l2i             
		//*  18   28:bipush          127
		//*  19   30:iand            
		//*  20   31:sipush          128
		//*  21   34:ior             
		//*  22   35:int2byte        
		//*  23   36:invokevirtual   #137 <Method ByteBuffer ByteBuffer.put(byte)>
		//*  24   39:pop             
		//*  25   40:lload_1         
		//*  26   41:bipush          7
		//*  27   43:lushr           
		//*  28   44:lstore_1        
		//*  29   45:goto            0
				catch(BufferOverflowException bufferoverflowexception)
		//*  30   48:astore_3        
				{
					throw new zzc(((Throwable) (bufferoverflowexception)));
		//   31   49:new             #56  <Class zzfe$zzc>
		//   32   52:dup             
		//   33   53:aload_3         
		//   34   54:invokespecial   #59  <Method void zzfe$zzc(Throwable)>
		//   35   57:athrow          
				}
			zzsw.put((byte)((int)l & 0x7f | 0x80));
			l >>>= 7;
			  goto _L1
		}

		public final void zzf(int i, int j)
			throws IOException
		{
			((zzfe)this).zzd(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
			((zzfe)this).zzas(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #107 <Method void zzfe.zzas(int)>
		//    7   11:return          
		}

		public final void zzf(byte abyte0[], int i, int j)
			throws IOException
		{
			((zzfe)this).zzas(j);
		//    0    0:aload_0         
		//    1    1:iload_3         
		//    2    2:invokevirtual   #107 <Method void zzfe.zzas(int)>
			((zzfe)this).write(abyte0, 0, j);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:iconst_0        
		//    6    8:iload_3         
		//    7    9:invokevirtual   #133 <Method void zzfe.write(byte[], int, int)>
		//    8   12:return          
		}

		public final void zzg(long l)
			throws IOException
		{
			try
			{
				zzsw.putLong(l);
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field ByteBuffer zzsw>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #177 <Method ByteBuffer ByteBuffer.putLong(long)>
		//    4    8:pop             
				return;
		//    5    9:return          
			}
			catch(BufferOverflowException bufferoverflowexception)
		//*   6   10:astore_3        
			{
				throw new zzc(((Throwable) (bufferoverflowexception)));
		//    7   11:new             #56  <Class zzfe$zzc>
		//    8   14:dup             
		//    9   15:aload_3         
		//   10   16:invokespecial   #59  <Method void zzfe$zzc(Throwable)>
		//   11   19:athrow          
			}
		}

		public final void zzh(int i, int j)
			throws IOException
		{
			((zzfe)this).zzd(i, 5);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_5        
		//    3    3:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
			((zzfe)this).zzau(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #180 <Method void zzfe.zzau(int)>
		//    7   11:return          
		}

		public final void zzm(String s)
			throws IOException
		{
			int i = zzsw.position();
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field ByteBuffer zzsw>
		//    2    4:invokevirtual   #39  <Method int ByteBuffer.position()>
		//    3    7:istore_2        
			int j;
			int k;
			try
			{
				j = zzax(s.length() * 3);
		//    4    8:aload_1         
		//    5    9:invokevirtual   #189 <Method int String.length()>
		//    6   12:iconst_3        
		//    7   13:imul            
		//    8   14:invokestatic    #193 <Method int zzax(int)>
		//    9   17:istore_3        
				k = zzax(s.length());
		//   10   18:aload_1         
		//   11   19:invokevirtual   #189 <Method int String.length()>
		//   12   22:invokestatic    #193 <Method int zzax(int)>
		//   13   25:istore          4
			}
		//*  14   27:iload           4
		//*  15   29:iload_3         
		//*  16   30:icmpne          95
		//*  17   33:aload_0         
		//*  18   34:getfield        #35  <Field ByteBuffer zzsw>
		//*  19   37:invokevirtual   #39  <Method int ByteBuffer.position()>
		//*  20   40:iload           4
		//*  21   42:iadd            
		//*  22   43:istore_3        
		//*  23   44:aload_0         
		//*  24   45:getfield        #35  <Field ByteBuffer zzsw>
		//*  25   48:iload_3         
		//*  26   49:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.position(int)>
		//*  27   52:pop             
		//*  28   53:aload_0         
		//*  29   54:aload_1         
		//*  30   55:invokespecial   #195 <Method void zzo(String)>
		//*  31   58:aload_0         
		//*  32   59:getfield        #35  <Field ByteBuffer zzsw>
		//*  33   62:invokevirtual   #39  <Method int ByteBuffer.position()>
		//*  34   65:istore          4
		//*  35   67:aload_0         
		//*  36   68:getfield        #35  <Field ByteBuffer zzsw>
		//*  37   71:iload_2         
		//*  38   72:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.position(int)>
		//*  39   75:pop             
		//*  40   76:aload_0         
		//*  41   77:iload           4
		//*  42   79:iload_3         
		//*  43   80:isub            
		//*  44   81:invokevirtual   #107 <Method void zzfe.zzas(int)>
		//*  45   84:aload_0         
		//*  46   85:getfield        #35  <Field ByteBuffer zzsw>
		//*  47   88:iload           4
		//*  48   90:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.position(int)>
		//*  49   93:pop             
		//*  50   94:return          
		//*  51   95:aload_0         
		//*  52   96:aload_1         
		//*  53   97:invokestatic    #198 <Method int zziw.zza(CharSequence)>
		//*  54  100:invokevirtual   #107 <Method void zzfe.zzas(int)>
		//*  55  103:aload_0         
		//*  56  104:aload_1         
		//*  57  105:invokespecial   #195 <Method void zzo(String)>
		//*  58  108:return          
		//*  59  109:astore_1        
		//*  60  110:new             #56  <Class zzfe$zzc>
		//*  61  113:dup             
		//*  62  114:aload_1         
		//*  63  115:invokespecial   #59  <Method void zzfe$zzc(Throwable)>
		//*  64  118:athrow          
			catch(zzja zzja1)
		//*  65  119:astore          5
			{
				zzsw.position(i);
		//   66  121:aload_0         
		//   67  122:getfield        #35  <Field ByteBuffer zzsw>
		//   68  125:iload_2         
		//   69  126:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.position(int)>
		//   70  129:pop             
				((zzfe)this).zza(s, zzja1);
		//   71  130:aload_0         
		//   72  131:aload_1         
		//   73  132:aload           5
		//   74  134:invokevirtual   #201 <Method void zzfe.zza(String, zzja)>
				return;
		//   75  137:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				throw new zzc(((Throwable) (s)));
			}
			if(k != j)
				break MISSING_BLOCK_LABEL_95;
			j = zzsw.position() + k;
			zzsw.position(j);
			zzo(s);
			k = zzsw.position();
			zzsw.position(i);
			((zzfe)this).zzas(k - j);
			zzsw.position(k);
			return;
			((zzfe)this).zzas(zziw.zza(((CharSequence) (s))));
			zzo(s);
			return;
		}

		private final int zzsu;
		private final ByteBuffer zzsv;
		private final ByteBuffer zzsw;

		zzd(ByteBuffer bytebuffer)
		{
			super(((zzff) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #15  <Method void zzfe(zzff)>
			zzsv = bytebuffer;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #17  <Field ByteBuffer zzsv>
			zzsw = bytebuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:invokevirtual   #23  <Method ByteBuffer ByteBuffer.duplicate()>
		//    9   15:getstatic       #29  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
		//   10   18:invokevirtual   #33  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
		//   11   21:putfield        #35  <Field ByteBuffer zzsw>
			zzsu = bytebuffer.position();
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #39  <Method int ByteBuffer.position()>
		//   15   29:putfield        #41  <Field int zzsu>
		//   16   32:return          
		}
	}

	static final class zze extends zzfe
	{

		private final void zzn(long l)
		{
			zzsw.position((int)(l - zzsx));
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field ByteBuffer zzsw>
		//    2    4:lload_1         
		//    3    5:aload_0         
		//    4    6:getfield        #47  <Field long zzsx>
		//    5    9:lsub            
		//    6   10:l2i             
		//    7   11:invokevirtual   #70  <Method java.nio.Buffer ByteBuffer.position(int)>
		//    8   14:pop             
		//    9   15:return          
		}

		public final void flush()
		{
			zzsv.position((int)(zztb - zzsx));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field ByteBuffer zzsv>
		//    2    4:aload_0         
		//    3    5:getfield        #64  <Field long zztb>
		//    4    8:aload_0         
		//    5    9:getfield        #47  <Field long zzsx>
		//    6   12:lsub            
		//    7   13:l2i             
		//    8   14:invokevirtual   #70  <Method java.nio.Buffer ByteBuffer.position(int)>
		//    9   17:pop             
		//   10   18:return          
		}

		public final void write(byte abyte0[], int i, int j)
			throws IOException
		{
			if(abyte0 != null && i >= 0 && j >= 0 && abyte0.length - j >= i)
		//*   0    0:aload_1         
		//*   1    1:ifnull          72
		//*   2    4:iload_2         
		//*   3    5:iflt            72
		//*   4    8:iload_3         
		//*   5    9:iflt            72
		//*   6   12:aload_1         
		//*   7   13:arraylength     
		//*   8   14:iload_3         
		//*   9   15:isub            
		//*  10   16:iload_2         
		//*  11   17:icmplt          72
			{
				long l = zzsz;
		//   12   20:aload_0         
		//   13   21:getfield        #58  <Field long zzsz>
		//   14   24:lstore          4
				long l1 = j;
		//   15   26:iload_3         
		//   16   27:i2l             
		//   17   28:lstore          6
				long l2 = zztb;
		//   18   30:aload_0         
		//   19   31:getfield        #64  <Field long zztb>
		//   20   34:lstore          8
				if(l - l1 >= l2)
		//*  21   36:lload           4
		//*  22   38:lload           6
		//*  23   40:lsub            
		//*  24   41:lload           8
		//*  25   43:lcmp            
		//*  26   44:ifge            50
		//*  27   47:goto            72
				{
					zziu.zza(abyte0, i, l2, l1);
		//   28   50:aload_1         
		//   29   51:iload_2         
		//   30   52:i2l             
		//   31   53:lload           8
		//   32   55:lload           6
		//   33   57:invokestatic    #80  <Method void zziu.zza(byte[], long, long, long)>
					zztb = zztb + l1;
		//   34   60:aload_0         
		//   35   61:aload_0         
		//   36   62:getfield        #64  <Field long zztb>
		//   37   65:lload           6
		//   38   67:ladd            
		//   39   68:putfield        #64  <Field long zztb>
					return;
		//   40   71:return          
				}
			}
			if(abyte0 == null)
		//*  41   72:aload_1         
		//*  42   73:ifnonnull       86
				throw new NullPointerException("value");
		//   43   76:new             #82  <Class NullPointerException>
		//   44   79:dup             
		//   45   80:ldc1            #84  <String "value">
		//   46   82:invokespecial   #87  <Method void NullPointerException(String)>
		//   47   85:athrow          
			else
				throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
					Long.valueOf(zztb), Long.valueOf(zzsz), Integer.valueOf(j)
				}));
		//   48   86:new             #89  <Class zzfe$zzc>
		//   49   89:dup             
		//   50   90:ldc1            #91  <String "Pos: %d, limit: %d, len: %d">
		//   51   92:iconst_3        
		//   52   93:anewarray       Object[]
		//   53   96:dup             
		//   54   97:iconst_0        
		//   55   98:aload_0         
		//   56   99:getfield        #64  <Field long zztb>
		//   57  102:invokestatic    #99  <Method Long Long.valueOf(long)>
		//   58  105:aastore         
		//   59  106:dup             
		//   60  107:iconst_1        
		//   61  108:aload_0         
		//   62  109:getfield        #58  <Field long zzsz>
		//   63  112:invokestatic    #99  <Method Long Long.valueOf(long)>
		//   64  115:aastore         
		//   65  116:dup             
		//   66  117:iconst_2        
		//   67  118:iload_3         
		//   68  119:invokestatic    #104 <Method Integer Integer.valueOf(int)>
		//   69  122:aastore         
		//   70  123:invokestatic    #110 <Method String String.format(String, Object[])>
		//   71  126:invokespecial   #111 <Method void zzfe$zzc(String)>
		//   72  129:athrow          
		}

		public final void zza(int i, long l)
			throws IOException
		{
			((zzfe)this).zzd(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
			((zzfe)this).zze(l);
		//    4    6:aload_0         
		//    5    7:lload_2         
		//    6    8:invokevirtual   #119 <Method void zzfe.zze(long)>
		//    7   11:return          
		}

		public final void zza(int i, zzeo zzeo1)
			throws IOException
		{
			((zzfe)this).zzd(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
			((zzfe)this).zza(zzeo1);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #123 <Method void zzfe.zza(zzeo)>
		//    7   11:return          
		}

		public final void zza(int i, zzhf zzhf1)
			throws IOException
		{
			((zzfe)this).zzd(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
			((zzfe)this).zzb(zzhf1);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #127 <Method void zzfe.zzb(zzhf)>
		//    7   11:return          
		}

		final void zza(int i, zzhf zzhf1, zzhw zzhw1)
			throws IOException
		{
			((zzfe)this).zzd(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
			((zzfe)this).zza(zzhf1, zzhw1);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:aload_3         
		//    7    9:invokevirtual   #131 <Method void zzfe.zza(zzhf, zzhw)>
		//    8   12:return          
		}

		public final void zza(int i, String s)
			throws IOException
		{
			((zzfe)this).zzd(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
			((zzfe)this).zzm(s);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #135 <Method void zzfe.zzm(String)>
		//    7   11:return          
		}

		public final void zza(zzeo zzeo1)
			throws IOException
		{
			((zzfe)this).zzas(zzeo1.size());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #140 <Method int zzeo.size()>
		//    3    5:invokevirtual   #144 <Method void zzfe.zzas(int)>
			zzeo1.zza(((zzen) (this)));
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:invokevirtual   #147 <Method void zzeo.zza(zzen)>
		//    7   13:return          
		}

		final void zza(zzhf zzhf1, zzhw zzhw1)
			throws IOException
		{
			zzec zzec1 = (zzec)zzhf1;
		//    0    0:aload_1         
		//    1    1:checkcast       #149 <Class zzec>
		//    2    4:astore          5
			int j = zzec1.zzcf();
		//    3    6:aload           5
		//    4    8:invokevirtual   #152 <Method int zzec.zzcf()>
		//    5   11:istore          4
			int i = j;
		//    6   13:iload           4
		//    7   15:istore_3        
			if(j == -1)
		//*   8   16:iload           4
		//*   9   18:iconst_m1       
		//*  10   19:icmpne          37
			{
				i = zzhw1.zzp(((Object) (zzec1)));
		//   11   22:aload_2         
		//   12   23:aload           5
		//   13   25:invokeinterface #158 <Method int zzhw.zzp(Object)>
		//   14   30:istore_3        
				zzec1.zzy(i);
		//   15   31:aload           5
		//   16   33:iload_3         
		//   17   34:invokevirtual   #161 <Method void zzec.zzy(int)>
			}
			((zzfe)this).zzas(i);
		//   18   37:aload_0         
		//   19   38:iload_3         
		//   20   39:invokevirtual   #144 <Method void zzfe.zzas(int)>
			zzhw1.zza(((Object) (zzhf1)), ((zzjj) (zzss)));
		//   21   42:aload_2         
		//   22   43:aload_1         
		//   23   44:aload_0         
		//   24   45:getfield        #165 <Field zzfg zzss>
		//   25   48:invokeinterface #168 <Method void zzhw.zza(Object, zzjj)>
		//   26   53:return          
		}

		public final void zza(byte abyte0[], int i, int j)
			throws IOException
		{
			((zzfe)this).write(abyte0, i, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:invokevirtual   #170 <Method void zzfe.write(byte[], int, int)>
		//    5    7:return          
		}

		public final void zzar(int i)
			throws IOException
		{
			if(i >= 0)
		//*   0    0:iload_1         
		//*   1    1:iflt            10
			{
				((zzfe)this).zzas(i);
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:invokevirtual   #144 <Method void zzfe.zzas(int)>
				return;
		//    5    9:return          
			} else
			{
				((zzfe)this).zze(i);
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:i2l             
		//    9   13:invokevirtual   #119 <Method void zzfe.zze(long)>
				return;
		//   10   16:return          
			}
		}

		public final void zzas(int i)
			throws IOException
		{
			int j = i;
		//    0    0:iload_1         
		//    1    1:istore_2        
			if(zztb <= zzta)
		//*   2    2:aload_0         
		//*   3    3:getfield        #64  <Field long zztb>
		//*   4    6:aload_0         
		//*   5    7:getfield        #62  <Field long zzta>
		//*   6   10:lcmp            
		//*   7   11:ifgt            73
				do
				{
					if((i & 0xffffff80) == 0)
		//*   8   14:iload_1         
		//*   9   15:bipush          -128
		//*  10   17:iand            
		//*  11   18:ifne            40
					{
						long l = zztb;
		//   12   21:aload_0         
		//   13   22:getfield        #64  <Field long zztb>
		//   14   25:lstore_3        
						zztb = 1L + l;
		//   15   26:aload_0         
		//   16   27:lconst_1        
		//   17   28:lload_3         
		//   18   29:ladd            
		//   19   30:putfield        #64  <Field long zztb>
						zziu.zza(l, (byte)i);
		//   20   33:lload_3         
		//   21   34:iload_1         
		//   22   35:int2byte        
		//   23   36:invokestatic    #174 <Method void zziu.zza(long, byte)>
						return;
		//   24   39:return          
					}
					long l1 = zztb;
		//   25   40:aload_0         
		//   26   41:getfield        #64  <Field long zztb>
		//   27   44:lstore_3        
					zztb = l1 + 1L;
		//   28   45:aload_0         
		//   29   46:lload_3         
		//   30   47:lconst_1        
		//   31   48:ladd            
		//   32   49:putfield        #64  <Field long zztb>
					zziu.zza(l1, (byte)(i & 0x7f | 0x80));
		//   33   52:lload_3         
		//   34   53:iload_1         
		//   35   54:bipush          127
		//   36   56:iand            
		//   37   57:sipush          128
		//   38   60:ior             
		//   39   61:int2byte        
		//   40   62:invokestatic    #174 <Method void zziu.zza(long, byte)>
					i >>>= 7;
		//   41   65:iload_1         
		//   42   66:bipush          7
		//   43   68:iushr           
		//   44   69:istore_1        
				} while(true);
		//   45   70:goto            14
			do
			{
				long l2 = zztb;
		//   46   73:aload_0         
		//   47   74:getfield        #64  <Field long zztb>
		//   48   77:lstore_3        
				if(l2 < zzsz)
		//*  49   78:lload_3         
		//*  50   79:aload_0         
		//*  51   80:getfield        #58  <Field long zzsz>
		//*  52   83:lcmp            
		//*  53   84:ifge            136
				{
					if((j & 0xffffff80) == 0)
		//*  54   87:iload_2         
		//*  55   88:bipush          -128
		//*  56   90:iand            
		//*  57   91:ifne            108
					{
						zztb = 1L + l2;
		//   58   94:aload_0         
		//   59   95:lconst_1        
		//   60   96:lload_3         
		//   61   97:ladd            
		//   62   98:putfield        #64  <Field long zztb>
						zziu.zza(l2, (byte)j);
		//   63  101:lload_3         
		//   64  102:iload_2         
		//   65  103:int2byte        
		//   66  104:invokestatic    #174 <Method void zziu.zza(long, byte)>
						return;
		//   67  107:return          
					}
					zztb = l2 + 1L;
		//   68  108:aload_0         
		//   69  109:lload_3         
		//   70  110:lconst_1        
		//   71  111:ladd            
		//   72  112:putfield        #64  <Field long zztb>
					zziu.zza(l2, (byte)(j & 0x7f | 0x80));
		//   73  115:lload_3         
		//   74  116:iload_2         
		//   75  117:bipush          127
		//   76  119:iand            
		//   77  120:sipush          128
		//   78  123:ior             
		//   79  124:int2byte        
		//   80  125:invokestatic    #174 <Method void zziu.zza(long, byte)>
					j >>>= 7;
		//   81  128:iload_2         
		//   82  129:bipush          7
		//   83  131:iushr           
		//   84  132:istore_2        
				} else
		//*  85  133:goto            73
				{
					throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
						Long.valueOf(l2), Long.valueOf(zzsz), Integer.valueOf(1)
					}));
		//   86  136:new             #89  <Class zzfe$zzc>
		//   87  139:dup             
		//   88  140:ldc1            #91  <String "Pos: %d, limit: %d, len: %d">
		//   89  142:iconst_3        
		//   90  143:anewarray       Object[]
		//   91  146:dup             
		//   92  147:iconst_0        
		//   93  148:lload_3         
		//   94  149:invokestatic    #99  <Method Long Long.valueOf(long)>
		//   95  152:aastore         
		//   96  153:dup             
		//   97  154:iconst_1        
		//   98  155:aload_0         
		//   99  156:getfield        #58  <Field long zzsz>
		//  100  159:invokestatic    #99  <Method Long Long.valueOf(long)>
		//  101  162:aastore         
		//  102  163:dup             
		//  103  164:iconst_2        
		//  104  165:iconst_1        
		//  105  166:invokestatic    #104 <Method Integer Integer.valueOf(int)>
		//  106  169:aastore         
		//  107  170:invokestatic    #110 <Method String String.format(String, Object[])>
		//  108  173:invokespecial   #111 <Method void zzfe$zzc(String)>
		//  109  176:athrow          
				}
			} while(true);
		}

		public final void zzau(int i)
			throws IOException
		{
			zzsw.putInt((int)(zztb - zzsx), i);
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field ByteBuffer zzsw>
		//    2    4:aload_0         
		//    3    5:getfield        #64  <Field long zztb>
		//    4    8:aload_0         
		//    5    9:getfield        #47  <Field long zzsx>
		//    6   12:lsub            
		//    7   13:l2i             
		//    8   14:iload_1         
		//    9   15:invokevirtual   #179 <Method ByteBuffer ByteBuffer.putInt(int, int)>
		//   10   18:pop             
			zztb = zztb + 4L;
		//   11   19:aload_0         
		//   12   20:aload_0         
		//   13   21:getfield        #64  <Field long zztb>
		//   14   24:ldc2w           #180 <Long 4L>
		//   15   27:ladd            
		//   16   28:putfield        #64  <Field long zztb>
		//   17   31:return          
		}

		public final void zzb(int i, zzeo zzeo1)
			throws IOException
		{
			((zzfe)this).zzd(1, 3);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iconst_3        
		//    3    3:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
			((zzfe)this).zzf(2, i);
		//    4    6:aload_0         
		//    5    7:iconst_2        
		//    6    8:iload_1         
		//    7    9:invokevirtual   #184 <Method void zzfe.zzf(int, int)>
			((zzfe)this).zza(3, zzeo1);
		//    8   12:aload_0         
		//    9   13:iconst_3        
		//   10   14:aload_2         
		//   11   15:invokevirtual   #186 <Method void zzfe.zza(int, zzeo)>
			((zzfe)this).zzd(1, 4);
		//   12   18:aload_0         
		//   13   19:iconst_1        
		//   14   20:iconst_4        
		//   15   21:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
		//   16   24:return          
		}

		public final void zzb(int i, zzhf zzhf1)
			throws IOException
		{
			((zzfe)this).zzd(1, 3);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iconst_3        
		//    3    3:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
			((zzfe)this).zzf(2, i);
		//    4    6:aload_0         
		//    5    7:iconst_2        
		//    6    8:iload_1         
		//    7    9:invokevirtual   #184 <Method void zzfe.zzf(int, int)>
			((zzfe)this).zza(3, zzhf1);
		//    8   12:aload_0         
		//    9   13:iconst_3        
		//   10   14:aload_2         
		//   11   15:invokevirtual   #188 <Method void zzfe.zza(int, zzhf)>
			((zzfe)this).zzd(1, 4);
		//   12   18:aload_0         
		//   13   19:iconst_1        
		//   14   20:iconst_4        
		//   15   21:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
		//   16   24:return          
		}

		public final void zzb(int i, boolean flag)
			throws IOException
		{
			((zzfe)this).zzd(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
			((zzfe)this).zzc((byte)flag);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:int2byte        
		//    7    9:invokevirtual   #193 <Method void zzfe.zzc(byte)>
		//    8   12:return          
		}

		public final void zzb(zzhf zzhf1)
			throws IOException
		{
			((zzfe)this).zzas(zzhf1.zzeq());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokeinterface #198 <Method int zzhf.zzeq()>
		//    3    7:invokevirtual   #144 <Method void zzfe.zzas(int)>
			zzhf1.zzb(((zzfe) (this)));
		//    4   10:aload_1         
		//    5   11:aload_0         
		//    6   12:invokeinterface #201 <Method void zzhf.zzb(zzfe)>
		//    7   17:return          
		}

		public final void zzc(byte byte0)
			throws IOException
		{
			long l = zztb;
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field long zztb>
		//    2    4:lstore_2        
			if(l < zzsz)
		//*   3    5:lload_2         
		//*   4    6:aload_0         
		//*   5    7:getfield        #58  <Field long zzsz>
		//*   6   10:lcmp            
		//*   7   11:ifge            27
			{
				zztb = 1L + l;
		//    8   14:aload_0         
		//    9   15:lconst_1        
		//   10   16:lload_2         
		//   11   17:ladd            
		//   12   18:putfield        #64  <Field long zztb>
				zziu.zza(l, byte0);
		//   13   21:lload_2         
		//   14   22:iload_1         
		//   15   23:invokestatic    #174 <Method void zziu.zza(long, byte)>
				return;
		//   16   26:return          
			} else
			{
				throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
					Long.valueOf(l), Long.valueOf(zzsz), Integer.valueOf(1)
				}));
		//   17   27:new             #89  <Class zzfe$zzc>
		//   18   30:dup             
		//   19   31:ldc1            #91  <String "Pos: %d, limit: %d, len: %d">
		//   20   33:iconst_3        
		//   21   34:anewarray       Object[]
		//   22   37:dup             
		//   23   38:iconst_0        
		//   24   39:lload_2         
		//   25   40:invokestatic    #99  <Method Long Long.valueOf(long)>
		//   26   43:aastore         
		//   27   44:dup             
		//   28   45:iconst_1        
		//   29   46:aload_0         
		//   30   47:getfield        #58  <Field long zzsz>
		//   31   50:invokestatic    #99  <Method Long Long.valueOf(long)>
		//   32   53:aastore         
		//   33   54:dup             
		//   34   55:iconst_2        
		//   35   56:iconst_1        
		//   36   57:invokestatic    #104 <Method Integer Integer.valueOf(int)>
		//   37   60:aastore         
		//   38   61:invokestatic    #110 <Method String String.format(String, Object[])>
		//   39   64:invokespecial   #111 <Method void zzfe$zzc(String)>
		//   40   67:athrow          
			}
		}

		public final void zzc(int i, long l)
			throws IOException
		{
			((zzfe)this).zzd(i, 1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_1        
		//    3    3:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
			((zzfe)this).zzg(l);
		//    4    6:aload_0         
		//    5    7:lload_2         
		//    6    8:invokevirtual   #204 <Method void zzfe.zzg(long)>
		//    7   11:return          
		}

		public final void zzd(int i, int j)
			throws IOException
		{
			((zzfe)this).zzas(i << 3 | j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_3        
		//    3    3:ishl            
		//    4    4:iload_2         
		//    5    5:ior             
		//    6    6:invokevirtual   #144 <Method void zzfe.zzas(int)>
		//    7    9:return          
		}

		public final int zzdz()
		{
			return (int)(zzsz - zztb);
		//    0    0:aload_0         
		//    1    1:getfield        #58  <Field long zzsz>
		//    2    4:aload_0         
		//    3    5:getfield        #64  <Field long zztb>
		//    4    8:lsub            
		//    5    9:l2i             
		//    6   10:ireturn         
		}

		public final void zze(int i, int j)
			throws IOException
		{
			((zzfe)this).zzd(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
			((zzfe)this).zzar(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #207 <Method void zzfe.zzar(int)>
		//    7   11:return          
		}

		public final void zze(long l)
			throws IOException
		{
			long l1 = l;
		//    0    0:lload_1         
		//    1    1:lstore_3        
			if(zztb <= zzta)
		//*   2    2:aload_0         
		//*   3    3:getfield        #64  <Field long zztb>
		//*   4    6:aload_0         
		//*   5    7:getfield        #62  <Field long zzta>
		//*   6   10:lcmp            
		//*   7   11:ifgt            78
				do
				{
					if((l & -128L) == 0L)
		//*   8   14:lload_1         
		//*   9   15:ldc2w           #208 <Long -128L>
		//*  10   18:land            
		//*  11   19:lconst_0        
		//*  12   20:lcmp            
		//*  13   21:ifne            44
					{
						l1 = zztb;
		//   14   24:aload_0         
		//   15   25:getfield        #64  <Field long zztb>
		//   16   28:lstore_3        
						zztb = 1L + l1;
		//   17   29:aload_0         
		//   18   30:lconst_1        
		//   19   31:lload_3         
		//   20   32:ladd            
		//   21   33:putfield        #64  <Field long zztb>
						zziu.zza(l1, (byte)(int)l);
		//   22   36:lload_3         
		//   23   37:lload_1         
		//   24   38:l2i             
		//   25   39:int2byte        
		//   26   40:invokestatic    #174 <Method void zziu.zza(long, byte)>
						return;
		//   27   43:return          
					}
					l1 = zztb;
		//   28   44:aload_0         
		//   29   45:getfield        #64  <Field long zztb>
		//   30   48:lstore_3        
					zztb = l1 + 1L;
		//   31   49:aload_0         
		//   32   50:lload_3         
		//   33   51:lconst_1        
		//   34   52:ladd            
		//   35   53:putfield        #64  <Field long zztb>
					zziu.zza(l1, (byte)((int)l & 0x7f | 0x80));
		//   36   56:lload_3         
		//   37   57:lload_1         
		//   38   58:l2i             
		//   39   59:bipush          127
		//   40   61:iand            
		//   41   62:sipush          128
		//   42   65:ior             
		//   43   66:int2byte        
		//   44   67:invokestatic    #174 <Method void zziu.zza(long, byte)>
					l >>>= 7;
		//   45   70:lload_1         
		//   46   71:bipush          7
		//   47   73:lushr           
		//   48   74:lstore_1        
				} while(true);
		//   49   75:goto            14
			do
			{
				l = zztb;
		//   50   78:aload_0         
		//   51   79:getfield        #64  <Field long zztb>
		//   52   82:lstore_1        
				if(l < zzsz)
		//*  53   83:lload_1         
		//*  54   84:aload_0         
		//*  55   85:getfield        #58  <Field long zzsz>
		//*  56   88:lcmp            
		//*  57   89:ifge            146
				{
					if((l1 & -128L) == 0L)
		//*  58   92:lload_3         
		//*  59   93:ldc2w           #208 <Long -128L>
		//*  60   96:land            
		//*  61   97:lconst_0        
		//*  62   98:lcmp            
		//*  63   99:ifne            117
					{
						zztb = 1L + l;
		//   64  102:aload_0         
		//   65  103:lconst_1        
		//   66  104:lload_1         
		//   67  105:ladd            
		//   68  106:putfield        #64  <Field long zztb>
						zziu.zza(l, (byte)(int)l1);
		//   69  109:lload_1         
		//   70  110:lload_3         
		//   71  111:l2i             
		//   72  112:int2byte        
		//   73  113:invokestatic    #174 <Method void zziu.zza(long, byte)>
						return;
		//   74  116:return          
					}
					zztb = l + 1L;
		//   75  117:aload_0         
		//   76  118:lload_1         
		//   77  119:lconst_1        
		//   78  120:ladd            
		//   79  121:putfield        #64  <Field long zztb>
					zziu.zza(l, (byte)((int)l1 & 0x7f | 0x80));
		//   80  124:lload_1         
		//   81  125:lload_3         
		//   82  126:l2i             
		//   83  127:bipush          127
		//   84  129:iand            
		//   85  130:sipush          128
		//   86  133:ior             
		//   87  134:int2byte        
		//   88  135:invokestatic    #174 <Method void zziu.zza(long, byte)>
					l1 >>>= 7;
		//   89  138:lload_3         
		//   90  139:bipush          7
		//   91  141:lushr           
		//   92  142:lstore_3        
				} else
		//*  93  143:goto            78
				{
					throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
						Long.valueOf(l), Long.valueOf(zzsz), Integer.valueOf(1)
					}));
		//   94  146:new             #89  <Class zzfe$zzc>
		//   95  149:dup             
		//   96  150:ldc1            #91  <String "Pos: %d, limit: %d, len: %d">
		//   97  152:iconst_3        
		//   98  153:anewarray       Object[]
		//   99  156:dup             
		//  100  157:iconst_0        
		//  101  158:lload_1         
		//  102  159:invokestatic    #99  <Method Long Long.valueOf(long)>
		//  103  162:aastore         
		//  104  163:dup             
		//  105  164:iconst_1        
		//  106  165:aload_0         
		//  107  166:getfield        #58  <Field long zzsz>
		//  108  169:invokestatic    #99  <Method Long Long.valueOf(long)>
		//  109  172:aastore         
		//  110  173:dup             
		//  111  174:iconst_2        
		//  112  175:iconst_1        
		//  113  176:invokestatic    #104 <Method Integer Integer.valueOf(int)>
		//  114  179:aastore         
		//  115  180:invokestatic    #110 <Method String String.format(String, Object[])>
		//  116  183:invokespecial   #111 <Method void zzfe$zzc(String)>
		//  117  186:athrow          
				}
			} while(true);
		}

		public final void zzf(int i, int j)
			throws IOException
		{
			((zzfe)this).zzd(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
			((zzfe)this).zzas(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #144 <Method void zzfe.zzas(int)>
		//    7   11:return          
		}

		public final void zzf(byte abyte0[], int i, int j)
			throws IOException
		{
			((zzfe)this).zzas(j);
		//    0    0:aload_0         
		//    1    1:iload_3         
		//    2    2:invokevirtual   #144 <Method void zzfe.zzas(int)>
			((zzfe)this).write(abyte0, 0, j);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:iconst_0        
		//    6    8:iload_3         
		//    7    9:invokevirtual   #170 <Method void zzfe.write(byte[], int, int)>
		//    8   12:return          
		}

		public final void zzg(long l)
			throws IOException
		{
			zzsw.putLong((int)(zztb - zzsx), l);
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field ByteBuffer zzsw>
		//    2    4:aload_0         
		//    3    5:getfield        #64  <Field long zztb>
		//    4    8:aload_0         
		//    5    9:getfield        #47  <Field long zzsx>
		//    6   12:lsub            
		//    7   13:l2i             
		//    8   14:lload_1         
		//    9   15:invokevirtual   #213 <Method ByteBuffer ByteBuffer.putLong(int, long)>
		//   10   18:pop             
			zztb = zztb + 8L;
		//   11   19:aload_0         
		//   12   20:aload_0         
		//   13   21:getfield        #64  <Field long zztb>
		//   14   24:ldc2w           #214 <Long 8L>
		//   15   27:ladd            
		//   16   28:putfield        #64  <Field long zztb>
		//   17   31:return          
		}

		public final void zzh(int i, int j)
			throws IOException
		{
			((zzfe)this).zzd(i, 5);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_5        
		//    3    3:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
			((zzfe)this).zzau(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #218 <Method void zzfe.zzau(int)>
		//    7   11:return          
		}

		public final void zzm(String s)
			throws IOException
		{
			long l = zztb;
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field long zztb>
		//    2    4:lstore          4
			int i;
			int j;
			try
			{
				i = zzax(s.length() * 3);
		//    3    6:aload_1         
		//    4    7:invokevirtual   #227 <Method int String.length()>
		//    5   10:iconst_3        
		//    6   11:imul            
		//    7   12:invokestatic    #231 <Method int zzax(int)>
		//    8   15:istore_2        
				j = zzax(s.length());
		//    9   16:aload_1         
		//   10   17:invokevirtual   #227 <Method int String.length()>
		//   11   20:invokestatic    #231 <Method int zzax(int)>
		//   12   23:istore_3        
			}
		//*  13   24:iload_3         
		//*  14   25:iload_2         
		//*  15   26:icmpne          86
		//*  16   29:aload_0         
		//*  17   30:getfield        #64  <Field long zztb>
		//*  18   33:aload_0         
		//*  19   34:getfield        #47  <Field long zzsx>
		//*  20   37:lsub            
		//*  21   38:l2i             
		//*  22   39:iload_3         
		//*  23   40:iadd            
		//*  24   41:istore_2        
		//*  25   42:aload_0         
		//*  26   43:getfield        #39  <Field ByteBuffer zzsw>
		//*  27   46:iload_2         
		//*  28   47:invokevirtual   #70  <Method java.nio.Buffer ByteBuffer.position(int)>
		//*  29   50:pop             
		//*  30   51:aload_1         
		//*  31   52:aload_0         
		//*  32   53:getfield        #39  <Field ByteBuffer zzsw>
		//*  33   56:invokestatic    #236 <Method void zziw.zza(CharSequence, ByteBuffer)>
		//*  34   59:aload_0         
		//*  35   60:getfield        #39  <Field ByteBuffer zzsw>
		//*  36   63:invokevirtual   #51  <Method int ByteBuffer.position()>
		//*  37   66:iload_2         
		//*  38   67:isub            
		//*  39   68:istore_2        
		//*  40   69:aload_0         
		//*  41   70:iload_2         
		//*  42   71:invokevirtual   #144 <Method void zzfe.zzas(int)>
		//*  43   74:aload_0         
		//*  44   75:aload_0         
		//*  45   76:getfield        #64  <Field long zztb>
		//*  46   79:iload_2         
		//*  47   80:i2l             
		//*  48   81:ladd            
		//*  49   82:putfield        #64  <Field long zztb>
		//*  50   85:return          
		//*  51   86:aload_1         
		//*  52   87:invokestatic    #239 <Method int zziw.zza(CharSequence)>
		//*  53   90:istore_2        
		//*  54   91:aload_0         
		//*  55   92:iload_2         
		//*  56   93:invokevirtual   #144 <Method void zzfe.zzas(int)>
		//*  57   96:aload_0         
		//*  58   97:aload_0         
		//*  59   98:getfield        #64  <Field long zztb>
		//*  60  101:invokespecial   #241 <Method void zzn(long)>
		//*  61  104:aload_1         
		//*  62  105:aload_0         
		//*  63  106:getfield        #39  <Field ByteBuffer zzsw>
		//*  64  109:invokestatic    #236 <Method void zziw.zza(CharSequence, ByteBuffer)>
		//*  65  112:aload_0         
		//*  66  113:aload_0         
		//*  67  114:getfield        #64  <Field long zztb>
		//*  68  117:iload_2         
		//*  69  118:i2l             
		//*  70  119:ladd            
		//*  71  120:putfield        #64  <Field long zztb>
		//*  72  123:return          
		//*  73  124:astore_1        
		//*  74  125:new             #89  <Class zzfe$zzc>
		//*  75  128:dup             
		//*  76  129:aload_1         
		//*  77  130:invokespecial   #244 <Method void zzfe$zzc(Throwable)>
		//*  78  133:athrow          
		//*  79  134:astore_1        
		//*  80  135:new             #89  <Class zzfe$zzc>
		//*  81  138:dup             
		//*  82  139:aload_1         
		//*  83  140:invokespecial   #244 <Method void zzfe$zzc(Throwable)>
		//*  84  143:athrow          
			catch(zzja zzja1)
		//*  85  144:astore          6
			{
				zztb = l;
		//   86  146:aload_0         
		//   87  147:lload           4
		//   88  149:putfield        #64  <Field long zztb>
				zzn(zztb);
		//   89  152:aload_0         
		//   90  153:aload_0         
		//   91  154:getfield        #64  <Field long zztb>
		//   92  157:invokespecial   #241 <Method void zzn(long)>
				((zzfe)this).zza(s, zzja1);
		//   93  160:aload_0         
		//   94  161:aload_1         
		//   95  162:aload           6
		//   96  164:invokevirtual   #247 <Method void zzfe.zza(String, zzja)>
				return;
		//   97  167:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				throw new zzc(((Throwable) (s)));
			}
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				throw new zzc(((Throwable) (s)));
			}
			if(j != i)
				break MISSING_BLOCK_LABEL_86;
			i = (int)(zztb - zzsx) + j;
			zzsw.position(i);
			zziw.zza(((CharSequence) (s)), zzsw);
			i = zzsw.position() - i;
			((zzfe)this).zzas(i);
			zztb = zztb + (long)i;
			return;
			i = zziw.zza(((CharSequence) (s)));
			((zzfe)this).zzas(i);
			zzn(zztb);
			zziw.zza(((CharSequence) (s)), zzsw);
			zztb = zztb + (long)i;
			return;
		}

		private final ByteBuffer zzsv;
		private final ByteBuffer zzsw;
		private final long zzsx;
		private final long zzsy;
		private final long zzsz;
		private final long zzta;
		private long zztb;

		zze(ByteBuffer bytebuffer)
		{
			super(((zzff) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #19  <Method void zzfe(zzff)>
			zzsv = bytebuffer;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #21  <Field ByteBuffer zzsv>
			zzsw = bytebuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:invokevirtual   #27  <Method ByteBuffer ByteBuffer.duplicate()>
		//    9   15:getstatic       #33  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
		//   10   18:invokevirtual   #37  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
		//   11   21:putfield        #39  <Field ByteBuffer zzsw>
			zzsx = zziu.zzb(bytebuffer);
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokestatic    #45  <Method long zziu.zzb(ByteBuffer)>
		//   15   29:putfield        #47  <Field long zzsx>
			zzsy = zzsx + (long)bytebuffer.position();
		//   16   32:aload_0         
		//   17   33:aload_0         
		//   18   34:getfield        #47  <Field long zzsx>
		//   19   37:aload_1         
		//   20   38:invokevirtual   #51  <Method int ByteBuffer.position()>
		//   21   41:i2l             
		//   22   42:ladd            
		//   23   43:putfield        #53  <Field long zzsy>
			zzsz = zzsx + (long)bytebuffer.limit();
		//   24   46:aload_0         
		//   25   47:aload_0         
		//   26   48:getfield        #47  <Field long zzsx>
		//   27   51:aload_1         
		//   28   52:invokevirtual   #56  <Method int ByteBuffer.limit()>
		//   29   55:i2l             
		//   30   56:ladd            
		//   31   57:putfield        #58  <Field long zzsz>
			zzta = zzsz - 10L;
		//   32   60:aload_0         
		//   33   61:aload_0         
		//   34   62:getfield        #58  <Field long zzsz>
		//   35   65:ldc2w           #59  <Long 10L>
		//   36   68:lsub            
		//   37   69:putfield        #62  <Field long zzta>
			zztb = zzsy;
		//   38   72:aload_0         
		//   39   73:aload_0         
		//   40   74:getfield        #53  <Field long zzsy>
		//   41   77:putfield        #64  <Field long zztb>
		//   42   80:return          
		}
	}


	private zzfe()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void zzen()>
	//    2    4:return          
	}

	zzfe(zzff zzff)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void zzfe()>
	//    2    4:return          
	}

	public static int zza(int i, zzgm zzgm1)
	{
		i = zzav(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzav(int)>
	//    2    4:istore_0        
		int j = zzgm1.zzeq();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #66  <Method int zzgm.zzeq()>
	//    5    9:istore_2        
		return i + (zzax(j) + j);
	//    6   10:iload_0         
	//    7   11:iload_2         
	//    8   12:invokestatic    #69  <Method int zzax(int)>
	//    9   15:iload_2         
	//   10   16:iadd            
	//   11   17:iadd            
	//   12   18:ireturn         
	}

	public static int zza(zzgm zzgm1)
	{
		int i = zzgm1.zzeq();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method int zzgm.zzeq()>
	//    2    4:istore_1        
		return zzax(i) + i;
	//    3    5:iload_1         
	//    4    6:invokestatic    #69  <Method int zzax(int)>
	//    5    9:iload_1         
	//    6   10:iadd            
	//    7   11:ireturn         
	}

	public static zzfe zza(ByteBuffer bytebuffer)
	{
		if(bytebuffer.hasArray())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #76  <Method boolean ByteBuffer.hasArray()>
	//*   2    4:ifeq            16
			return ((zzfe) (new zzb(bytebuffer)));
	//    3    7:new             #9   <Class zzfe$zzb>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #79  <Method void zzfe$zzb(ByteBuffer)>
	//    7   15:areturn         
		if(bytebuffer.isDirect() && !bytebuffer.isReadOnly())
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #82  <Method boolean ByteBuffer.isDirect()>
	//*  10   20:ifeq            54
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #85  <Method boolean ByteBuffer.isReadOnly()>
	//*  13   27:ifne            54
		{
			if(zziu.zzhi())
	//*  14   30:invokestatic    #88  <Method boolean zziu.zzhi()>
	//*  15   33:ifeq            45
				return ((zzfe) (new zze(bytebuffer)));
	//   16   36:new             #18  <Class zzfe$zze>
	//   17   39:dup             
	//   18   40:aload_0         
	//   19   41:invokespecial   #89  <Method void zzfe$zze(ByteBuffer)>
	//   20   44:areturn         
			else
				return ((zzfe) (new zzd(bytebuffer)));
	//   21   45:new             #15  <Class zzfe$zzd>
	//   22   48:dup             
	//   23   49:aload_0         
	//   24   50:invokespecial   #90  <Method void zzfe$zzd(ByteBuffer)>
	//   25   53:areturn         
		} else
		{
			throw new IllegalArgumentException("ByteBuffer is read-only");
	//   26   54:new             #92  <Class IllegalArgumentException>
	//   27   57:dup             
	//   28   58:ldc1            #94  <String "ByteBuffer is read-only">
	//   29   60:invokespecial   #97  <Method void IllegalArgumentException(String)>
	//   30   63:athrow          
		}
	}

	public static int zzav(int i)
	{
		return zzax(i << 3);
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:ishl            
	//    3    3:invokestatic    #69  <Method int zzax(int)>
	//    4    6:ireturn         
	}

	public static int zzaw(int i)
	{
		if(i >= 0)
	//*   0    0:iload_0         
	//*   1    1:iflt            9
			return zzax(i);
	//    2    4:iload_0         
	//    3    5:invokestatic    #69  <Method int zzax(int)>
	//    4    8:ireturn         
		else
			return 10;
	//    5    9:bipush          10
	//    6   11:ireturn         
	}

	public static int zzax(int i)
	{
		if((i & 0xffffff80) == 0)
	//*   0    0:iload_0         
	//*   1    1:bipush          -128
	//*   2    3:iand            
	//*   3    4:ifne            9
			return 1;
	//    4    7:iconst_1        
	//    5    8:ireturn         
		if((i & 0xffffc000) == 0)
	//*   6    9:iload_0         
	//*   7   10:sipush          -16384
	//*   8   13:iand            
	//*   9   14:ifne            19
			return 2;
	//   10   17:iconst_2        
	//   11   18:ireturn         
		if((0xffe00000 & i) == 0)
	//*  12   19:ldc1            #99  <Int 0xffe00000>
	//*  13   21:iload_0         
	//*  14   22:iand            
	//*  15   23:ifne            28
			return 3;
	//   16   26:iconst_3        
	//   17   27:ireturn         
		return (i & 0xf0000000) != 0 ? 5 : 4;
	//   18   28:iload_0         
	//   19   29:ldc1            #100 <Int 0xf0000000>
	//   20   31:iand            
	//   21   32:ifne            37
	//   22   35:iconst_4        
	//   23   36:ireturn         
	//   24   37:iconst_5        
	//   25   38:ireturn         
	}

	public static int zzay(int i)
	{
		return zzax(zzbc(i));
	//    0    0:iload_0         
	//    1    1:invokestatic    #104 <Method int zzbc(int)>
	//    2    4:invokestatic    #69  <Method int zzax(int)>
	//    3    7:ireturn         
	}

	public static int zzaz(int i)
	{
		return 4;
	//    0    0:iconst_4        
	//    1    1:ireturn         
	}

	public static int zzb(double d)
	{
		return 8;
	//    0    0:bipush          8
	//    1    2:ireturn         
	}

	public static int zzb(int i, double d)
	{
		return zzav(i) + 8;
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzav(int)>
	//    2    4:bipush          8
	//    3    6:iadd            
	//    4    7:ireturn         
	}

	public static int zzb(int i, float f)
	{
		return zzav(i) + 4;
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzav(int)>
	//    2    4:iconst_4        
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	public static int zzb(int i, zzgm zzgm1)
	{
		return (zzav(1) << 1) + zzj(2, i) + zza(3, zzgm1);
	//    0    0:iconst_1        
	//    1    1:invokestatic    #60  <Method int zzav(int)>
	//    2    4:iconst_1        
	//    3    5:ishl            
	//    4    6:iconst_2        
	//    5    7:iload_0         
	//    6    8:invokestatic    #112 <Method int zzj(int, int)>
	//    7   11:iadd            
	//    8   12:iconst_3        
	//    9   13:aload_1         
	//   10   14:invokestatic    #114 <Method int zza(int, zzgm)>
	//   11   17:iadd            
	//   12   18:ireturn         
	}

	static int zzb(int i, zzhf zzhf1, zzhw zzhw1)
	{
		return zzav(i) + zzb(zzhf1, zzhw1);
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzav(int)>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #118 <Method int zzb(zzhf, zzhw)>
	//    5    9:iadd            
	//    6   10:ireturn         
	}

	public static int zzb(int i, String s)
	{
		return zzav(i) + zzn(s);
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzav(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #123 <Method int zzn(String)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zzb(zzeo zzeo1)
	{
		int i = zzeo1.size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #129 <Method int zzeo.size()>
	//    2    4:istore_1        
		return zzax(i) + i;
	//    3    5:iload_1         
	//    4    6:invokestatic    #69  <Method int zzax(int)>
	//    5    9:iload_1         
	//    6   10:iadd            
	//    7   11:ireturn         
	}

	static int zzb(zzhf zzhf1, zzhw zzhw1)
	{
		zzhf1 = ((zzhf) ((zzec)zzhf1));
	//    0    0:aload_0         
	//    1    1:checkcast       #131 <Class zzec>
	//    2    4:astore_0        
		int j = ((zzec) (zzhf1)).zzcf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #134 <Method int zzec.zzcf()>
	//    5    9:istore_3        
		int i = j;
	//    6   10:iload_3         
	//    7   11:istore_2        
		if(j == -1)
	//*   8   12:iload_3         
	//*   9   13:iconst_m1       
	//*  10   14:icmpne          30
		{
			i = zzhw1.zzp(((Object) (zzhf1)));
	//   11   17:aload_1         
	//   12   18:aload_0         
	//   13   19:invokeinterface #140 <Method int zzhw.zzp(Object)>
	//   14   24:istore_2        
			((zzec) (zzhf1)).zzy(i);
	//   15   25:aload_0         
	//   16   26:iload_2         
	//   17   27:invokevirtual   #144 <Method void zzec.zzy(int)>
		}
		return zzax(i) + i;
	//   18   30:iload_2         
	//   19   31:invokestatic    #69  <Method int zzax(int)>
	//   20   34:iload_2         
	//   21   35:iadd            
	//   22   36:ireturn         
	}

	public static int zzba(int i)
	{
		return 4;
	//    0    0:iconst_4        
	//    1    1:ireturn         
	}

	public static int zzbb(int i)
	{
		return zzaw(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #148 <Method int zzaw(int)>
	//    2    4:ireturn         
	}

	private static int zzbc(int i)
	{
		return i >> 31 ^ i << 1;
	//    0    0:iload_0         
	//    1    1:bipush          31
	//    2    3:ishr            
	//    3    4:iload_0         
	//    4    5:iconst_1        
	//    5    6:ishl            
	//    6    7:ixor            
	//    7    8:ireturn         
	}

	public static int zzbd(int i)
	{
		return zzax(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #69  <Method int zzax(int)>
	//    2    4:ireturn         
	}

	public static int zzc(int i, zzeo zzeo1)
	{
		i = zzav(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzav(int)>
	//    2    4:istore_0        
		int j = zzeo1.size();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #129 <Method int zzeo.size()>
	//    5    9:istore_2        
		return i + (zzax(j) + j);
	//    6   10:iload_0         
	//    7   11:iload_2         
	//    8   12:invokestatic    #69  <Method int zzax(int)>
	//    9   15:iload_2         
	//   10   16:iadd            
	//   11   17:iadd            
	//   12   18:ireturn         
	}

	public static int zzc(int i, zzhf zzhf1)
	{
		return zzav(i) + zzc(zzhf1);
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzav(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #156 <Method int zzc(zzhf)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	static int zzc(int i, zzhf zzhf1, zzhw zzhw1)
	{
		int k = zzav(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzav(int)>
	//    2    4:istore          4
		zzhf1 = ((zzhf) ((zzec)zzhf1));
	//    3    6:aload_1         
	//    4    7:checkcast       #131 <Class zzec>
	//    5   10:astore_1        
		int j = ((zzec) (zzhf1)).zzcf();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #134 <Method int zzec.zzcf()>
	//    8   15:istore_3        
		i = j;
	//    9   16:iload_3         
	//   10   17:istore_0        
		if(j == -1)
	//*  11   18:iload_3         
	//*  12   19:iconst_m1       
	//*  13   20:icmpne          36
		{
			i = zzhw1.zzp(((Object) (zzhf1)));
	//   14   23:aload_2         
	//   15   24:aload_1         
	//   16   25:invokeinterface #140 <Method int zzhw.zzp(Object)>
	//   17   30:istore_0        
			((zzec) (zzhf1)).zzy(i);
	//   18   31:aload_1         
	//   19   32:iload_0         
	//   20   33:invokevirtual   #144 <Method void zzec.zzy(int)>
		}
		return (k << 1) + i;
	//   21   36:iload           4
	//   22   38:iconst_1        
	//   23   39:ishl            
	//   24   40:iload_0         
	//   25   41:iadd            
	//   26   42:ireturn         
	}

	public static int zzc(int i, boolean flag)
	{
		return zzav(i) + 1;
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzav(int)>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	public static int zzc(zzhf zzhf1)
	{
		int i = zzhf1.zzeq();
	//    0    0:aload_0         
	//    1    1:invokeinterface #160 <Method int zzhf.zzeq()>
	//    2    6:istore_1        
		return zzax(i) + i;
	//    3    7:iload_1         
	//    4    8:invokestatic    #69  <Method int zzax(int)>
	//    5   11:iload_1         
	//    6   12:iadd            
	//    7   13:ireturn         
	}

	public static int zzd(int i, long l)
	{
		return zzav(i) + zzi(l);
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzav(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #165 <Method int zzi(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zzd(int i, zzeo zzeo1)
	{
		return (zzav(1) << 1) + zzj(2, i) + zzc(3, zzeo1);
	//    0    0:iconst_1        
	//    1    1:invokestatic    #60  <Method int zzav(int)>
	//    2    4:iconst_1        
	//    3    5:ishl            
	//    4    6:iconst_2        
	//    5    7:iload_0         
	//    6    8:invokestatic    #112 <Method int zzj(int, int)>
	//    7   11:iadd            
	//    8   12:iconst_3        
	//    9   13:aload_1         
	//   10   14:invokestatic    #167 <Method int zzc(int, zzeo)>
	//   11   17:iadd            
	//   12   18:ireturn         
	}

	public static int zzd(int i, zzhf zzhf1)
	{
		return (zzav(1) << 1) + zzj(2, i) + zzc(3, zzhf1);
	//    0    0:iconst_1        
	//    1    1:invokestatic    #60  <Method int zzav(int)>
	//    2    4:iconst_1        
	//    3    5:ishl            
	//    4    6:iconst_2        
	//    5    7:iload_0         
	//    6    8:invokestatic    #112 <Method int zzj(int, int)>
	//    7   11:iadd            
	//    8   12:iconst_3        
	//    9   13:aload_1         
	//   10   14:invokestatic    #169 <Method int zzc(int, zzhf)>
	//   11   17:iadd            
	//   12   18:ireturn         
	}

	public static int zzd(zzhf zzhf1)
	{
		return zzhf1.zzeq();
	//    0    0:aload_0         
	//    1    1:invokeinterface #160 <Method int zzhf.zzeq()>
	//    2    6:ireturn         
	}

	public static int zze(int i, long l)
	{
		return zzav(i) + zzi(l);
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzav(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #165 <Method int zzi(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	static boolean zzeb()
	{
		return zzsr;
	//    0    0:getstatic       #49  <Field boolean zzsr>
	//    1    3:ireturn         
	}

	public static int zzf(int i, long l)
	{
		return zzav(i) + zzi(zzm(l));
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzav(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #175 <Method long zzm(long)>
	//    4    8:invokestatic    #165 <Method int zzi(long)>
	//    5   11:iadd            
	//    6   12:ireturn         
	}

	public static int zzg(float f)
	{
		return 4;
	//    0    0:iconst_4        
	//    1    1:ireturn         
	}

	public static int zzg(int i, long l)
	{
		return zzav(i) + 8;
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzav(int)>
	//    2    4:bipush          8
	//    3    6:iadd            
	//    4    7:ireturn         
	}

	public static zzfe zzg(byte abyte0[])
	{
		return ((zzfe) (new zza(abyte0, 0, abyte0.length)));
	//    0    0:new             #6   <Class zzfe$zza>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:invokespecial   #181 <Method void zzfe$zza(byte[], int, int)>
	//    7   11:areturn         
	}

	public static int zzh(int i, long l)
	{
		return zzav(i) + 8;
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzav(int)>
	//    2    4:bipush          8
	//    3    6:iadd            
	//    4    7:ireturn         
	}

	public static int zzh(long l)
	{
		return zzi(l);
	//    0    0:lload_0         
	//    1    1:invokestatic    #165 <Method int zzi(long)>
	//    2    4:ireturn         
	}

	public static int zzh(byte abyte0[])
	{
		int i = abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_1        
		return zzax(i) + i;
	//    3    3:iload_1         
	//    4    4:invokestatic    #69  <Method int zzax(int)>
	//    5    7:iload_1         
	//    6    8:iadd            
	//    7    9:ireturn         
	}

	public static int zzi(int i, int j)
	{
		return zzav(i) + zzaw(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzav(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #148 <Method int zzaw(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zzi(long l)
	{
		if((-128L & l) == 0L)
	//*   0    0:ldc2w           #184 <Long -128L>
	//*   1    3:lload_0         
	//*   2    4:land            
	//*   3    5:lconst_0        
	//*   4    6:lcmp            
	//*   5    7:ifne            12
			return 1;
	//    6   10:iconst_1        
	//    7   11:ireturn         
		if(l < 0L)
	//*   8   12:lload_0         
	//*   9   13:lconst_0        
	//*  10   14:lcmp            
	//*  11   15:ifge            21
			return 10;
	//   12   18:bipush          10
	//   13   20:ireturn         
		int j;
		if((0x0L & l) != 0L)
	//*  14   21:ldc2w           #186 <Long 0x0L>
	//*  15   24:lload_0         
	//*  16   25:land            
	//*  17   26:lconst_0        
	//*  18   27:lcmp            
	//*  19   28:ifeq            42
		{
			j = 6;
	//   20   31:bipush          6
	//   21   33:istore_3        
			l >>>= 28;
	//   22   34:lload_0         
	//   23   35:bipush          28
	//   24   37:lushr           
	//   25   38:lstore_0        
		} else
	//*  26   39:goto            44
		{
			j = 2;
	//   27   42:iconst_2        
	//   28   43:istore_3        
		}
		int i = j;
	//   29   44:iload_3         
	//   30   45:istore_2        
		long l1 = l;
	//   31   46:lload_0         
	//   32   47:lstore          4
		if((0xffe00000L & l) != 0L)
	//*  33   49:ldc2w           #188 <Long 0xffe00000L>
	//*  34   52:lload_0         
	//*  35   53:land            
	//*  36   54:lconst_0        
	//*  37   55:lcmp            
	//*  38   56:ifeq            69
		{
			i = j + 2;
	//   39   59:iload_3         
	//   40   60:iconst_2        
	//   41   61:iadd            
	//   42   62:istore_2        
			l1 = l >>> 14;
	//   43   63:lload_0         
	//   44   64:bipush          14
	//   45   66:lushr           
	//   46   67:lstore          4
		}
		j = i;
	//   47   69:iload_2         
	//   48   70:istore_3        
		if((l1 & -16384L) != 0L)
	//*  49   71:lload           4
	//*  50   73:ldc2w           #190 <Long -16384L>
	//*  51   76:land            
	//*  52   77:lconst_0        
	//*  53   78:lcmp            
	//*  54   79:ifeq            86
			j = i + 1;
	//   55   82:iload_2         
	//   56   83:iconst_1        
	//   57   84:iadd            
	//   58   85:istore_3        
		return j;
	//   59   86:iload_3         
	//   60   87:ireturn         
	}

	public static int zzi(boolean flag)
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public static int zzj(int i, int j)
	{
		return zzav(i) + zzax(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzav(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #69  <Method int zzax(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zzj(long l)
	{
		return zzi(zzm(l));
	//    0    0:lload_0         
	//    1    1:invokestatic    #175 <Method long zzm(long)>
	//    2    4:invokestatic    #165 <Method int zzi(long)>
	//    3    7:ireturn         
	}

	public static int zzk(int i, int j)
	{
		return zzav(i) + zzax(zzbc(j));
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzav(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #104 <Method int zzbc(int)>
	//    4    8:invokestatic    #69  <Method int zzax(int)>
	//    5   11:iadd            
	//    6   12:ireturn         
	}

	public static int zzk(long l)
	{
		return 8;
	//    0    0:bipush          8
	//    1    2:ireturn         
	}

	public static int zzl(int i, int j)
	{
		return zzav(i) + 4;
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzav(int)>
	//    2    4:iconst_4        
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	public static int zzl(long l)
	{
		return 8;
	//    0    0:bipush          8
	//    1    2:ireturn         
	}

	public static int zzm(int i, int j)
	{
		return zzav(i) + 4;
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzav(int)>
	//    2    4:iconst_4        
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	private static long zzm(long l)
	{
		return l >> 63 ^ l << 1;
	//    0    0:lload_0         
	//    1    1:bipush          63
	//    2    3:lshr            
	//    3    4:lload_0         
	//    4    5:iconst_1        
	//    5    6:lshl            
	//    6    7:lxor            
	//    7    8:lreturn         
	}

	public static int zzn(int i, int j)
	{
		return zzav(i) + zzaw(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzav(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #148 <Method int zzaw(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zzn(String s)
	{
		zzja zzja1;
		int i;
		try
		{
			i = zziw.zza(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #201 <Method int zziw.zza(CharSequence)>
	//    2    4:istore_1        
		}
	//*   3    5:goto            17
	//*   4    8:aload_0         
	//*   5    9:getstatic       #207 <Field java.nio.charset.Charset zzga.UTF_8>
	//*   6   12:invokevirtual   #213 <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//*   7   15:arraylength     
	//*   8   16:istore_1        
	//*   9   17:iload_1         
	//*  10   18:invokestatic    #69  <Method int zzax(int)>
	//*  11   21:iload_1         
	//*  12   22:iadd            
	//*  13   23:ireturn         
		// Misplaced declaration of an exception variable
		catch(zzja zzja1)
		{
			i = s.getBytes(zzga.UTF_8).length;
		}
		return zzax(i) + i;
	//*  14   24:astore_2        
	//*  15   25:goto            8
	}

	public abstract void flush()
		throws IOException;

	public abstract void write(byte abyte0[], int i, int j)
		throws IOException;

	public final void zza(double d)
		throws IOException
	{
		zzg(Double.doubleToRawLongBits(d));
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:invokestatic    #224 <Method long Double.doubleToRawLongBits(double)>
	//    3    5:invokevirtual   #227 <Method void zzg(long)>
	//    4    8:return          
	}

	public final void zza(int i, double d)
		throws IOException
	{
		zzc(i, Double.doubleToRawLongBits(d));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:dload_2         
	//    3    3:invokestatic    #224 <Method long Double.doubleToRawLongBits(double)>
	//    4    6:invokevirtual   #232 <Method void zzc(int, long)>
	//    5    9:return          
	}

	public final void zza(int i, float f)
		throws IOException
	{
		zzh(i, Float.floatToRawIntBits(f));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:fload_2         
	//    3    3:invokestatic    #238 <Method int Float.floatToRawIntBits(float)>
	//    4    6:invokevirtual   #241 <Method void zzh(int, int)>
	//    5    9:return          
	}

	public abstract void zza(int i, long l)
		throws IOException;

	public abstract void zza(int i, zzeo zzeo1)
		throws IOException;

	public abstract void zza(int i, zzhf zzhf1)
		throws IOException;

	abstract void zza(int i, zzhf zzhf1, zzhw zzhw1)
		throws IOException;

	public abstract void zza(int i, String s)
		throws IOException;

	public abstract void zza(zzeo zzeo1)
		throws IOException;

	abstract void zza(zzhf zzhf1, zzhw zzhw1)
		throws IOException;

	final void zza(String s, zzja zzja1)
		throws IOException
	{
		logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", ((Throwable) (zzja1)));
	//    0    0:getstatic       #41  <Field Logger logger>
	//    1    3:getstatic       #256 <Field Level Level.WARNING>
	//    2    6:ldc2            #258 <String "com.google.protobuf.CodedOutputStream">
	//    3    9:ldc2            #260 <String "inefficientWriteStringNoTag">
	//    4   12:ldc2            #262 <String "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!">
	//    5   15:aload_2         
	//    6   16:invokevirtual   #266 <Method void Logger.logp(Level, String, String, String, Throwable)>
		s = ((String) (s.getBytes(zzga.UTF_8)));
	//    7   19:aload_1         
	//    8   20:getstatic       #207 <Field java.nio.charset.Charset zzga.UTF_8>
	//    9   23:invokevirtual   #213 <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//   10   26:astore_1        
		try
		{
			zzas(s.length);
	//   11   27:aload_0         
	//   12   28:aload_1         
	//   13   29:arraylength     
	//   14   30:invokevirtual   #269 <Method void zzas(int)>
			((zzen)this).zza(((byte []) (s)), 0, s.length);
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:iconst_0        
	//   18   36:aload_1         
	//   19   37:arraylength     
	//   20   38:invokevirtual   #271 <Method void zzen.zza(byte[], int, int)>
			return;
	//   21   41:return          
		}
	//*  22   42:astore_1        
	//*  23   43:aload_1         
	//*  24   44:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  25   45:astore_1        
		{
			throw new zzc(((Throwable) (s)));
	//   26   46:new             #12  <Class zzfe$zzc>
	//   27   49:dup             
	//   28   50:aload_1         
	//   29   51:invokespecial   #274 <Method void zzfe$zzc(Throwable)>
	//   30   54:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw s;
		}
	}

	public abstract void zzar(int i)
		throws IOException;

	public abstract void zzas(int i)
		throws IOException;

	public final void zzat(int i)
		throws IOException
	{
		zzas(zzbc(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #104 <Method int zzbc(int)>
	//    3    5:invokevirtual   #269 <Method void zzas(int)>
	//    4    8:return          
	}

	public abstract void zzau(int i)
		throws IOException;

	public final void zzb(int i, long l)
		throws IOException
	{
		zza(i, zzm(l));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:invokestatic    #175 <Method long zzm(long)>
	//    4    6:invokevirtual   #279 <Method void zza(int, long)>
	//    5    9:return          
	}

	public abstract void zzb(int i, zzeo zzeo1)
		throws IOException;

	public abstract void zzb(int i, zzhf zzhf1)
		throws IOException;

	public abstract void zzb(int i, boolean flag)
		throws IOException;

	public abstract void zzb(zzhf zzhf1)
		throws IOException;

	public abstract void zzc(byte byte0)
		throws IOException;

	public abstract void zzc(int i, long l)
		throws IOException;

	public abstract void zzd(int i, int j)
		throws IOException;

	public abstract int zzdz();

	public abstract void zze(int i, int j)
		throws IOException;

	public abstract void zze(long l)
		throws IOException;

	public final void zzea()
	{
		if(zzdz() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #286 <Method int zzdz()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		else
			throw new IllegalStateException("Did not write as much data as expected.");
	//    4    8:new             #288 <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:ldc2            #290 <String "Did not write as much data as expected.">
	//    7   15:invokespecial   #291 <Method void IllegalStateException(String)>
	//    8   18:athrow          
	}

	public final void zzf(float f)
		throws IOException
	{
		zzau(Float.floatToRawIntBits(f));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #238 <Method int Float.floatToRawIntBits(float)>
	//    3    5:invokevirtual   #294 <Method void zzau(int)>
	//    4    8:return          
	}

	public abstract void zzf(int i, int j)
		throws IOException;

	public final void zzf(long l)
		throws IOException
	{
		zze(zzm(l));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #175 <Method long zzm(long)>
	//    3    5:invokevirtual   #296 <Method void zze(long)>
	//    4    8:return          
	}

	abstract void zzf(byte abyte0[], int i, int j)
		throws IOException;

	public final void zzg(int i, int j)
		throws IOException
	{
		zzf(i, zzbc(j));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #104 <Method int zzbc(int)>
	//    4    6:invokevirtual   #298 <Method void zzf(int, int)>
	//    5    9:return          
	}

	public abstract void zzg(long l)
		throws IOException;

	public abstract void zzh(int i, int j)
		throws IOException;

	public final void zzh(boolean flag)
		throws IOException
	{
		zzc((byte)flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:int2byte        
	//    3    3:invokevirtual   #301 <Method void zzc(byte)>
	//    4    6:return          
	}

	public abstract void zzm(String s)
		throws IOException;

	private static final Logger logger = Logger.getLogger(((Class) (com/google/android/gms/internal/vision/zzfe)).getName());
	private static final boolean zzsr = zziu.zzhh();
	zzfg zzss;

	static 
	{
	//    0    0:ldc1            #2   <Class zzfe>
	//    1    2:invokevirtual   #33  <Method String Class.getName()>
	//    2    5:invokestatic    #39  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #41  <Field Logger logger>
	//    4   11:invokestatic    #47  <Method boolean zziu.zzhh()>
	//    5   14:putstatic       #49  <Field boolean zzsr>
	//*   6   17:return          
	}
}
