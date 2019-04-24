// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbut, zzbus, zzbul, zzbuw, 
//			zzbum

public interface zzad
{
	public static final class zza extends zzbut
	{

		public static zza zzc(byte abyte0[])
			throws zzbus
		{
			return (zza)zzbut.zza(((zzbut) (new zza())), abyte0);
		//    0    0:new             #2   <Class zzad$zza>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void zzad$zza()>
		//    3    7:aload_0         
		//    4    8:invokestatic    #28  <Method zzbut zzbut.zza(zzbut, byte[])>
		//    5   11:checkcast       #2   <Class zzad$zza>
		//    6   14:areturn         
		}

		public zza zza(zzbul zzbul1)
			throws IOException
		{
			do
			{
				int i = zzbul1.zzacu();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #38  <Method int zzbul.zzacu()>
		//    2    4:istore_2        
				switch(i)
		//*   3    5:iload_2         
				{
		//*   4    6:lookupswitch    3: default 40
		//		               0: 48
		//		               10: 50
		//		               18: 79
				default:
					if(zzbuw.zzb(zzbul1, i))
						continue;
		//    5   40:aload_1         
		//    6   41:iload_2         
		//    7   42:invokestatic    #44  <Method boolean zzbuw.zzb(zzbul, int)>
		//    8   45:ifne            0
					// fall through

				case 0: // '\0'
					return this;
		//    9   48:aload_0         
		//   10   49:areturn         

				case 10: // '\n'
					if(zzaJ == null)
		//*  11   50:aload_0         
		//*  12   51:getfield        #46  <Field zzad$zzb zzaJ>
		//*  13   54:ifnonnull       68
						zzaJ = new zzb();
		//   14   57:aload_0         
		//   15   58:new             #48  <Class zzad$zzb>
		//   16   61:dup             
		//   17   62:invokespecial   #49  <Method void zzad$zzb()>
		//   18   65:putfield        #46  <Field zzad$zzb zzaJ>
					zzbul1.zza(((zzbut) (zzaJ)));
		//   19   68:aload_1         
		//   20   69:aload_0         
		//   21   70:getfield        #46  <Field zzad$zzb zzaJ>
		//   22   73:invokevirtual   #52  <Method void zzbul.zza(zzbut)>
					break;

		//*  23   76:goto            0
				case 18: // '\022'
					if(zzaK == null)
		//*  24   79:aload_0         
		//*  25   80:getfield        #54  <Field zzad$zzc zzaK>
		//*  26   83:ifnonnull       97
						zzaK = new zzc();
		//   27   86:aload_0         
		//   28   87:new             #56  <Class zzad$zzc>
		//   29   90:dup             
		//   30   91:invokespecial   #57  <Method void zzad$zzc()>
		//   31   94:putfield        #54  <Field zzad$zzc zzaK>
					zzbul1.zza(((zzbut) (zzaK)));
		//   32   97:aload_1         
		//   33   98:aload_0         
		//   34   99:getfield        #54  <Field zzad$zzc zzaK>
		//   35  102:invokevirtual   #52  <Method void zzbul.zza(zzbut)>
					break;
				}
			} while(true);
		//   36  105:goto            0
		}

		public void zza(zzbum zzbum1)
			throws IOException
		{
			if(zzaJ != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #46  <Field zzad$zzb zzaJ>
		//*   2    4:ifnull          16
				zzbum1.zza(1, ((zzbut) (zzaJ)));
		//    3    7:aload_1         
		//    4    8:iconst_1        
		//    5    9:aload_0         
		//    6   10:getfield        #46  <Field zzad$zzb zzaJ>
		//    7   13:invokevirtual   #63  <Method void zzbum.zza(int, zzbut)>
			if(zzaK != null)
		//*   8   16:aload_0         
		//*   9   17:getfield        #54  <Field zzad$zzc zzaK>
		//*  10   20:ifnull          32
				zzbum1.zza(2, ((zzbut) (zzaK)));
		//   11   23:aload_1         
		//   12   24:iconst_2        
		//   13   25:aload_0         
		//   14   26:getfield        #54  <Field zzad$zzc zzaK>
		//   15   29:invokevirtual   #63  <Method void zzbum.zza(int, zzbut)>
			super.zza(zzbum1);
		//   16   32:aload_0         
		//   17   33:aload_1         
		//   18   34:invokespecial   #65  <Method void zzbut.zza(zzbum)>
		//   19   37:return          
		}

		public zzbut zzb(zzbul zzbul1)
			throws IOException
		{
			return ((zzbut) (zza(zzbul1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #68  <Method zzad$zza zza(zzbul)>
		//    3    5:areturn         
		}

		public zza zzu()
		{
			zzaJ = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #46  <Field zzad$zzb zzaJ>
			zzaK = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #54  <Field zzad$zzc zzaK>
			zzcsg = -1;
		//    6   10:aload_0         
		//    7   11:iconst_m1       
		//    8   12:putfield        #72  <Field int zzcsg>
			return this;
		//    9   15:aload_0         
		//   10   16:areturn         
		}

		protected int zzv()
		{
			int j = super.zzv();
		//    0    0:aload_0         
		//    1    1:invokespecial   #75  <Method int zzbut.zzv()>
		//    2    4:istore_2        
			int i = j;
		//    3    5:iload_2         
		//    4    6:istore_1        
			if(zzaJ != null)
		//*   5    7:aload_0         
		//*   6    8:getfield        #46  <Field zzad$zzb zzaJ>
		//*   7   11:ifnull          25
				i = j + zzbum.zzc(1, ((zzbut) (zzaJ)));
		//    8   14:iload_2         
		//    9   15:iconst_1        
		//   10   16:aload_0         
		//   11   17:getfield        #46  <Field zzad$zzb zzaJ>
		//   12   20:invokestatic    #78  <Method int zzbum.zzc(int, zzbut)>
		//   13   23:iadd            
		//   14   24:istore_1        
			j = i;
		//   15   25:iload_1         
		//   16   26:istore_2        
			if(zzaK != null)
		//*  17   27:aload_0         
		//*  18   28:getfield        #54  <Field zzad$zzc zzaK>
		//*  19   31:ifnull          45
				j = i + zzbum.zzc(2, ((zzbut) (zzaK)));
		//   20   34:iload_1         
		//   21   35:iconst_2        
		//   22   36:aload_0         
		//   23   37:getfield        #54  <Field zzad$zzc zzaK>
		//   24   40:invokestatic    #78  <Method int zzbum.zzc(int, zzbut)>
		//   25   43:iadd            
		//   26   44:istore_2        
			return j;
		//   27   45:iload_2         
		//   28   46:ireturn         
		}

		public zzb zzaJ;
		public zzc zzaK;

		public zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void zzbut()>
			zzu();
		//    2    4:aload_0         
		//    3    5:invokevirtual   #19  <Method zzad$zza zzu()>
		//    4    8:pop             
		//    5    9:return          
		}
	}

	public static final class zzb extends zzbut
	{

		public void zza(zzbum zzbum1)
			throws IOException
		{
			if(zzaL != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #24  <Field Integer zzaL>
		//*   2    4:ifnull          20
				zzbum1.zzF(27, zzaL.intValue());
		//    3    7:aload_1         
		//    4    8:bipush          27
		//    5   10:aload_0         
		//    6   11:getfield        #24  <Field Integer zzaL>
		//    7   14:invokevirtual   #30  <Method int Integer.intValue()>
		//    8   17:invokevirtual   #36  <Method void zzbum.zzF(int, int)>
			super.zza(zzbum1);
		//    9   20:aload_0         
		//   10   21:aload_1         
		//   11   22:invokespecial   #38  <Method void zzbut.zza(zzbum)>
		//   12   25:return          
		}

		public zzbut zzb(zzbul zzbul1)
			throws IOException
		{
			return ((zzbut) (zzc(zzbul1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #44  <Method zzad$zzb zzc(zzbul)>
		//    3    5:areturn         
		}

		public zzb zzc(zzbul zzbul1)
			throws IOException
		{
_L4:
			int i = zzbul1.zzacu();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #49  <Method int zzbul.zzacu()>
		//    2    4:istore_2        
			i;
		//    3    5:iload_2         
			JVM INSTR lookupswitch 2: default 32
		//		               0: 40
		//		               216: 42;
		//    4    6:lookupswitch    2: default 32
		//		               0: 40
		//		               216: 42
			   goto _L1 _L2 _L3
_L1:
			if(zzbuw.zzb(zzbul1, i)) goto _L4; else goto _L2
		//    5   32:aload_1         
		//    6   33:iload_2         
		//    7   34:invokestatic    #54  <Method boolean zzbuw.zzb(zzbul, int)>
		//    8   37:ifne            0
_L2:
			return this;
		//    9   40:aload_0         
		//   10   41:areturn         
_L3:
			int j = zzbul1.zzacy();
		//   11   42:aload_1         
		//   12   43:invokevirtual   #57  <Method int zzbul.zzacy()>
		//   13   46:istore_2        
			switch(j)
		//*  14   47:iload_2         
			{
		//*  15   48:tableswitch     0 4: default 84
		//		               0 87
		//		               1 87
		//		               2 87
		//		               3 87
		//		               4 87
		//*  16   84:goto            0
			case 0: // '\0'
			case 1: // '\001'
			case 2: // '\002'
			case 3: // '\003'
			case 4: // '\004'
				zzaL = Integer.valueOf(j);
		//   17   87:aload_0         
		//   18   88:iload_2         
		//   19   89:invokestatic    #61  <Method Integer Integer.valueOf(int)>
		//   20   92:putfield        #24  <Field Integer zzaL>
				break;
			}
			if(true) goto _L4; else goto _L5
_L5:
		//*  21   95:goto            0
		}

		protected int zzv()
		{
			int j = super.zzv();
		//    0    0:aload_0         
		//    1    1:invokespecial   #64  <Method int zzbut.zzv()>
		//    2    4:istore_2        
			int i = j;
		//    3    5:iload_2         
		//    4    6:istore_1        
			if(zzaL != null)
		//*   5    7:aload_0         
		//*   6    8:getfield        #24  <Field Integer zzaL>
		//*   7   11:ifnull          29
				i = j + zzbum.zzH(27, zzaL.intValue());
		//    8   14:iload_2         
		//    9   15:bipush          27
		//   10   17:aload_0         
		//   11   18:getfield        #24  <Field Integer zzaL>
		//   12   21:invokevirtual   #30  <Method int Integer.intValue()>
		//   13   24:invokestatic    #68  <Method int zzbum.zzH(int, int)>
		//   14   27:iadd            
		//   15   28:istore_1        
			return i;
		//   16   29:iload_1         
		//   17   30:ireturn         
		}

		public zzb zzw()
		{
			zzcsg = -1;
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:putfield        #72  <Field int zzcsg>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Integer zzaL;

		public zzb()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void zzbut()>
			zzw();
		//    2    4:aload_0         
		//    3    5:invokevirtual   #17  <Method zzad$zzb zzw()>
		//    4    8:pop             
		//    5    9:return          
		}
	}

	public static final class zzc extends zzbut
	{

		public void zza(zzbum zzbum1)
			throws IOException
		{
			if(zzaM != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field String zzaM>
		//*   2    4:ifnull          16
				zzbum1.zzq(1, zzaM);
		//    3    7:aload_1         
		//    4    8:iconst_1        
		//    5    9:aload_0         
		//    6   10:getfield        #28  <Field String zzaM>
		//    7   13:invokevirtual   #34  <Method void zzbum.zzq(int, String)>
			if(zzaN != null)
		//*   8   16:aload_0         
		//*   9   17:getfield        #36  <Field String zzaN>
		//*  10   20:ifnull          32
				zzbum1.zzq(2, zzaN);
		//   11   23:aload_1         
		//   12   24:iconst_2        
		//   13   25:aload_0         
		//   14   26:getfield        #36  <Field String zzaN>
		//   15   29:invokevirtual   #34  <Method void zzbum.zzq(int, String)>
			if(zzaO != null)
		//*  16   32:aload_0         
		//*  17   33:getfield        #38  <Field String zzaO>
		//*  18   36:ifnull          48
				zzbum1.zzq(3, zzaO);
		//   19   39:aload_1         
		//   20   40:iconst_3        
		//   21   41:aload_0         
		//   22   42:getfield        #38  <Field String zzaO>
		//   23   45:invokevirtual   #34  <Method void zzbum.zzq(int, String)>
			if(zzaP != null)
		//*  24   48:aload_0         
		//*  25   49:getfield        #40  <Field String zzaP>
		//*  26   52:ifnull          64
				zzbum1.zzq(4, zzaP);
		//   27   55:aload_1         
		//   28   56:iconst_4        
		//   29   57:aload_0         
		//   30   58:getfield        #40  <Field String zzaP>
		//   31   61:invokevirtual   #34  <Method void zzbum.zzq(int, String)>
			if(zzaQ != null)
		//*  32   64:aload_0         
		//*  33   65:getfield        #42  <Field String zzaQ>
		//*  34   68:ifnull          80
				zzbum1.zzq(5, zzaQ);
		//   35   71:aload_1         
		//   36   72:iconst_5        
		//   37   73:aload_0         
		//   38   74:getfield        #42  <Field String zzaQ>
		//   39   77:invokevirtual   #34  <Method void zzbum.zzq(int, String)>
			super.zza(zzbum1);
		//   40   80:aload_0         
		//   41   81:aload_1         
		//   42   82:invokespecial   #44  <Method void zzbut.zza(zzbum)>
		//   43   85:return          
		}

		public zzbut zzb(zzbul zzbul1)
			throws IOException
		{
			return ((zzbut) (zzd(zzbul1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #51  <Method zzad$zzc zzd(zzbul)>
		//    3    5:areturn         
		}

		public zzc zzd(zzbul zzbul1)
			throws IOException
		{
			do
			{
				int i = zzbul1.zzacu();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #57  <Method int zzbul.zzacu()>
		//    2    4:istore_2        
				switch(i)
		//*   3    5:iload_2         
				{
		//*   4    6:lookupswitch    6: default 64
		//		               0: 72
		//		               10: 74
		//		               18: 85
		//		               26: 96
		//		               34: 107
		//		               42: 118
				default:
					if(zzbuw.zzb(zzbul1, i))
						continue;
		//    5   64:aload_1         
		//    6   65:iload_2         
		//    7   66:invokestatic    #62  <Method boolean zzbuw.zzb(zzbul, int)>
		//    8   69:ifne            0
					// fall through

				case 0: // '\0'
					return this;
		//    9   72:aload_0         
		//   10   73:areturn         

				case 10: // '\n'
					zzaM = zzbul1.readString();
		//   11   74:aload_0         
		//   12   75:aload_1         
		//   13   76:invokevirtual   #66  <Method String zzbul.readString()>
		//   14   79:putfield        #28  <Field String zzaM>
					break;

		//*  15   82:goto            0
				case 18: // '\022'
					zzaN = zzbul1.readString();
		//   16   85:aload_0         
		//   17   86:aload_1         
		//   18   87:invokevirtual   #66  <Method String zzbul.readString()>
		//   19   90:putfield        #36  <Field String zzaN>
					break;

		//*  20   93:goto            0
				case 26: // '\032'
					zzaO = zzbul1.readString();
		//   21   96:aload_0         
		//   22   97:aload_1         
		//   23   98:invokevirtual   #66  <Method String zzbul.readString()>
		//   24  101:putfield        #38  <Field String zzaO>
					break;

		//*  25  104:goto            0
				case 34: // '"'
					zzaP = zzbul1.readString();
		//   26  107:aload_0         
		//   27  108:aload_1         
		//   28  109:invokevirtual   #66  <Method String zzbul.readString()>
		//   29  112:putfield        #40  <Field String zzaP>
					break;

		//*  30  115:goto            0
				case 42: // '*'
					zzaQ = zzbul1.readString();
		//   31  118:aload_0         
		//   32  119:aload_1         
		//   33  120:invokevirtual   #66  <Method String zzbul.readString()>
		//   34  123:putfield        #42  <Field String zzaQ>
					break;
				}
			} while(true);
		//   35  126:goto            0
		}

		protected int zzv()
		{
			int j = super.zzv();
		//    0    0:aload_0         
		//    1    1:invokespecial   #69  <Method int zzbut.zzv()>
		//    2    4:istore_2        
			int i = j;
		//    3    5:iload_2         
		//    4    6:istore_1        
			if(zzaM != null)
		//*   5    7:aload_0         
		//*   6    8:getfield        #28  <Field String zzaM>
		//*   7   11:ifnull          25
				i = j + zzbum.zzr(1, zzaM);
		//    8   14:iload_2         
		//    9   15:iconst_1        
		//   10   16:aload_0         
		//   11   17:getfield        #28  <Field String zzaM>
		//   12   20:invokestatic    #73  <Method int zzbum.zzr(int, String)>
		//   13   23:iadd            
		//   14   24:istore_1        
			j = i;
		//   15   25:iload_1         
		//   16   26:istore_2        
			if(zzaN != null)
		//*  17   27:aload_0         
		//*  18   28:getfield        #36  <Field String zzaN>
		//*  19   31:ifnull          45
				j = i + zzbum.zzr(2, zzaN);
		//   20   34:iload_1         
		//   21   35:iconst_2        
		//   22   36:aload_0         
		//   23   37:getfield        #36  <Field String zzaN>
		//   24   40:invokestatic    #73  <Method int zzbum.zzr(int, String)>
		//   25   43:iadd            
		//   26   44:istore_2        
			i = j;
		//   27   45:iload_2         
		//   28   46:istore_1        
			if(zzaO != null)
		//*  29   47:aload_0         
		//*  30   48:getfield        #38  <Field String zzaO>
		//*  31   51:ifnull          65
				i = j + zzbum.zzr(3, zzaO);
		//   32   54:iload_2         
		//   33   55:iconst_3        
		//   34   56:aload_0         
		//   35   57:getfield        #38  <Field String zzaO>
		//   36   60:invokestatic    #73  <Method int zzbum.zzr(int, String)>
		//   37   63:iadd            
		//   38   64:istore_1        
			j = i;
		//   39   65:iload_1         
		//   40   66:istore_2        
			if(zzaP != null)
		//*  41   67:aload_0         
		//*  42   68:getfield        #40  <Field String zzaP>
		//*  43   71:ifnull          85
				j = i + zzbum.zzr(4, zzaP);
		//   44   74:iload_1         
		//   45   75:iconst_4        
		//   46   76:aload_0         
		//   47   77:getfield        #40  <Field String zzaP>
		//   48   80:invokestatic    #73  <Method int zzbum.zzr(int, String)>
		//   49   83:iadd            
		//   50   84:istore_2        
			i = j;
		//   51   85:iload_2         
		//   52   86:istore_1        
			if(zzaQ != null)
		//*  53   87:aload_0         
		//*  54   88:getfield        #42  <Field String zzaQ>
		//*  55   91:ifnull          105
				i = j + zzbum.zzr(5, zzaQ);
		//   56   94:iload_2         
		//   57   95:iconst_5        
		//   58   96:aload_0         
		//   59   97:getfield        #42  <Field String zzaQ>
		//   60  100:invokestatic    #73  <Method int zzbum.zzr(int, String)>
		//   61  103:iadd            
		//   62  104:istore_1        
			return i;
		//   63  105:iload_1         
		//   64  106:ireturn         
		}

		public zzc zzx()
		{
			zzaM = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #28  <Field String zzaM>
			zzaN = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #36  <Field String zzaN>
			zzaO = null;
		//    6   10:aload_0         
		//    7   11:aconst_null     
		//    8   12:putfield        #38  <Field String zzaO>
			zzaP = null;
		//    9   15:aload_0         
		//   10   16:aconst_null     
		//   11   17:putfield        #40  <Field String zzaP>
			zzaQ = null;
		//   12   20:aload_0         
		//   13   21:aconst_null     
		//   14   22:putfield        #42  <Field String zzaQ>
			zzcsg = -1;
		//   15   25:aload_0         
		//   16   26:iconst_m1       
		//   17   27:putfield        #77  <Field int zzcsg>
			return this;
		//   18   30:aload_0         
		//   19   31:areturn         
		}

		public String zzaM;
		public String zzaN;
		public String zzaO;
		public String zzaP;
		public String zzaQ;

		public zzc()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void zzbut()>
			zzx();
		//    2    4:aload_0         
		//    3    5:invokevirtual   #21  <Method zzad$zzc zzx()>
		//    4    8:pop             
		//    5    9:return          
		}
	}

}
