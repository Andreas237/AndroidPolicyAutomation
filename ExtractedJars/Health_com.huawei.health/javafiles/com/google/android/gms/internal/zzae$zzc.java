// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbxn, zzae, zzbxm, zzbxl, 
//			zzbxt

public static final class zzae$zzc extends zzbxn
{

	public void zza(zzbxm zzbxm1)
		throws IOException
	{
		if(zzaN != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field String zzaN>
	//*   2    4:ifnull          16
			zzbxm1.zzq(1, zzaN);
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field String zzaN>
	//    7   13:invokevirtual   #43  <Method void zzbxm.zzq(int, String)>
		if(zzaO != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #22  <Field String zzaO>
	//*  10   20:ifnull          32
			zzbxm1.zzq(2, zzaO);
	//   11   23:aload_1         
	//   12   24:iconst_2        
	//   13   25:aload_0         
	//   14   26:getfield        #22  <Field String zzaO>
	//   15   29:invokevirtual   #43  <Method void zzbxm.zzq(int, String)>
		if(zzaP != null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #24  <Field String zzaP>
	//*  18   36:ifnull          48
			zzbxm1.zzq(3, zzaP);
	//   19   39:aload_1         
	//   20   40:iconst_3        
	//   21   41:aload_0         
	//   22   42:getfield        #24  <Field String zzaP>
	//   23   45:invokevirtual   #43  <Method void zzbxm.zzq(int, String)>
		if(zzaQ != null)
	//*  24   48:aload_0         
	//*  25   49:getfield        #26  <Field String zzaQ>
	//*  26   52:ifnull          64
			zzbxm1.zzq(4, zzaQ);
	//   27   55:aload_1         
	//   28   56:iconst_4        
	//   29   57:aload_0         
	//   30   58:getfield        #26  <Field String zzaQ>
	//   31   61:invokevirtual   #43  <Method void zzbxm.zzq(int, String)>
		if(zzaR != null)
	//*  32   64:aload_0         
	//*  33   65:getfield        #28  <Field String zzaR>
	//*  34   68:ifnull          80
			zzbxm1.zzq(5, zzaR);
	//   35   71:aload_1         
	//   36   72:iconst_5        
	//   37   73:aload_0         
	//   38   74:getfield        #28  <Field String zzaR>
	//   39   77:invokevirtual   #43  <Method void zzbxm.zzq(int, String)>
		super.zza(zzbxm1);
	//   40   80:aload_0         
	//   41   81:aload_1         
	//   42   82:invokespecial   #45  <Method void zzbxn.zza(zzbxm)>
	//   43   85:return          
	}

	public zzbxt zzb(zzbxl zzbxl1)
		throws IOException
	{
		return ((zzbxt) (zzd(zzbxl1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #52  <Method zzae$zzc zzd(zzbxl)>
	//    3    5:areturn         
	}

	public zzae$zzc zzd(zzbxl zzbxl1)
		throws IOException
	{
		do
		{
			int i = zzbxl1.zzaeo();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #58  <Method int zzbxl.zzaeo()>
	//    2    4:istore_2        
			switch(i)
	//*   3    5:iload_2         
			{
	//*   4    6:lookupswitch    6: default 64
	//	               0: 67
	//	               10: 80
	//	               18: 91
	//	               26: 102
	//	               34: 113
	//	               42: 124
	//*   5   64:goto            69
			case 0: // '\0'
				return this;
	//    6   67:aload_0         
	//    7   68:areturn         

			default:
				if(!super.zza(zzbxl1, i))
	//*   8   69:aload_0         
	//*   9   70:aload_1         
	//*  10   71:iload_2         
	//*  11   72:invokespecial   #61  <Method boolean zzbxn.zza(zzbxl, int)>
	//*  12   75:ifne            132
					return this;
	//   13   78:aload_0         
	//   14   79:areturn         
				break;

			case 10: // '\n'
				zzaN = zzbxl1.readString();
	//   15   80:aload_0         
	//   16   81:aload_1         
	//   17   82:invokevirtual   #65  <Method String zzbxl.readString()>
	//   18   85:putfield        #20  <Field String zzaN>
				break;

	//*  19   88:goto            132
			case 18: // '\022'
				zzaO = zzbxl1.readString();
	//   20   91:aload_0         
	//   21   92:aload_1         
	//   22   93:invokevirtual   #65  <Method String zzbxl.readString()>
	//   23   96:putfield        #22  <Field String zzaO>
				break;

	//*  24   99:goto            132
			case 26: // '\032'
				zzaP = zzbxl1.readString();
	//   25  102:aload_0         
	//   26  103:aload_1         
	//   27  104:invokevirtual   #65  <Method String zzbxl.readString()>
	//   28  107:putfield        #24  <Field String zzaP>
				break;

	//*  29  110:goto            132
			case 34: // '"'
				zzaQ = zzbxl1.readString();
	//   30  113:aload_0         
	//   31  114:aload_1         
	//   32  115:invokevirtual   #65  <Method String zzbxl.readString()>
	//   33  118:putfield        #26  <Field String zzaQ>
				break;

	//*  34  121:goto            132
			case 42: // '*'
				zzaR = zzbxl1.readString();
	//   35  124:aload_0         
	//   36  125:aload_1         
	//   37  126:invokevirtual   #65  <Method String zzbxl.readString()>
	//   38  129:putfield        #28  <Field String zzaR>
				break;
			}
		} while(true);
	//   39  132:goto            0
	}

	protected int zzu()
	{
		int j = super.zzu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method int zzbxn.zzu()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzaN != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #20  <Field String zzaN>
	//*   7   11:ifnull          25
			i = j + zzbxm.zzr(1, zzaN);
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #20  <Field String zzaN>
	//   12   20:invokestatic    #72  <Method int zzbxm.zzr(int, String)>
	//   13   23:iadd            
	//   14   24:istore_1        
		j = i;
	//   15   25:iload_1         
	//   16   26:istore_2        
		if(zzaO != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #22  <Field String zzaO>
	//*  19   31:ifnull          45
			j = i + zzbxm.zzr(2, zzaO);
	//   20   34:iload_1         
	//   21   35:iconst_2        
	//   22   36:aload_0         
	//   23   37:getfield        #22  <Field String zzaO>
	//   24   40:invokestatic    #72  <Method int zzbxm.zzr(int, String)>
	//   25   43:iadd            
	//   26   44:istore_2        
		i = j;
	//   27   45:iload_2         
	//   28   46:istore_1        
		if(zzaP != null)
	//*  29   47:aload_0         
	//*  30   48:getfield        #24  <Field String zzaP>
	//*  31   51:ifnull          65
			i = j + zzbxm.zzr(3, zzaP);
	//   32   54:iload_2         
	//   33   55:iconst_3        
	//   34   56:aload_0         
	//   35   57:getfield        #24  <Field String zzaP>
	//   36   60:invokestatic    #72  <Method int zzbxm.zzr(int, String)>
	//   37   63:iadd            
	//   38   64:istore_1        
		j = i;
	//   39   65:iload_1         
	//   40   66:istore_2        
		if(zzaQ != null)
	//*  41   67:aload_0         
	//*  42   68:getfield        #26  <Field String zzaQ>
	//*  43   71:ifnull          85
			j = i + zzbxm.zzr(4, zzaQ);
	//   44   74:iload_1         
	//   45   75:iconst_4        
	//   46   76:aload_0         
	//   47   77:getfield        #26  <Field String zzaQ>
	//   48   80:invokestatic    #72  <Method int zzbxm.zzr(int, String)>
	//   49   83:iadd            
	//   50   84:istore_2        
		i = j;
	//   51   85:iload_2         
	//   52   86:istore_1        
		if(zzaR != null)
	//*  53   87:aload_0         
	//*  54   88:getfield        #28  <Field String zzaR>
	//*  55   91:ifnull          105
			i = j + zzbxm.zzr(5, zzaR);
	//   56   94:iload_2         
	//   57   95:iconst_5        
	//   58   96:aload_0         
	//   59   97:getfield        #28  <Field String zzaR>
	//   60  100:invokestatic    #72  <Method int zzbxm.zzr(int, String)>
	//   61  103:iadd            
	//   62  104:istore_1        
		return i;
	//   63  105:iload_1         
	//   64  106:ireturn         
	}

	public String zzaN;
	public String zzaO;
	public String zzaP;
	public String zzaQ;
	public String zzaR;

	public zzae$zzc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void zzbxn()>
		zzaN = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #20  <Field String zzaN>
		zzaO = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #22  <Field String zzaO>
		zzaP = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #24  <Field String zzaP>
		zzaQ = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #26  <Field String zzaQ>
		zzaR = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #28  <Field String zzaR>
		zzcuR = -1;
	//   17   29:aload_0         
	//   18   30:iconst_m1       
	//   19   31:putfield        #32  <Field int zzcuR>
	//   20   34:return          
	}
}
