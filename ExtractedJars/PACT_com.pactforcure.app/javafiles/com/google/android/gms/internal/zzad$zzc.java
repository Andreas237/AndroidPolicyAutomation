// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbut, zzad, zzbum, zzbul, 
//			zzbuw

public static final class zzad$zzc extends zzbut
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

	public zzad$zzc zzd(zzbul zzbul1)
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
	//	               0: 72
	//	               10: 74
	//	               18: 85
	//	               26: 96
	//	               34: 107
	//	               42: 118
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

	public zzad$zzc zzx()
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

	public zzad$zzc()
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
