// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzjn, zzjk, zzjl, zzjt

public final class zzdo extends zzjn
{

	public zzdo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void zzjn()>
		zzpc = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #18  <Field Float zzpc>
		zzpd = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #20  <Field Float zzpd>
		zzpe = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #22  <Field Float zzpe>
		zzpf = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #24  <Field Float zzpf>
		zzpg = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #26  <Field Float zzpg>
		zzph = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #28  <Field Float zzph>
		zzadp = -1;
	//   20   34:aload_0         
	//   21   35:iconst_m1       
	//   22   36:putfield        #32  <Field int zzadp>
	//   23   39:return          
	}

	public final zzjt zza(zzjk zzjk1)
		throws IOException
	{
		do
		{
			int i = zzjk1.zzdq();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #43  <Method int zzjk.zzdq()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            158
			if(i != 13)
	//*   5    9:iload_2         
	//*   6   10:bipush          13
	//*   7   12:icmpeq          141
			{
				if(i != 21)
	//*   8   15:iload_2         
	//*   9   16:bipush          21
	//*  10   18:icmpeq          124
				{
					if(i != 29)
	//*  11   21:iload_2         
	//*  12   22:bipush          29
	//*  13   24:icmpeq          107
					{
						if(i != 37)
	//*  14   27:iload_2         
	//*  15   28:bipush          37
	//*  16   30:icmpeq          90
						{
							if(i != 45)
	//*  17   33:iload_2         
	//*  18   34:bipush          45
	//*  19   36:icmpeq          73
							{
								if(i != 53)
	//*  20   39:iload_2         
	//*  21   40:bipush          53
	//*  22   42:icmpeq          56
								{
									if(!super.zza(zzjk1, i))
	//*  23   45:aload_0         
	//*  24   46:aload_1         
	//*  25   47:iload_2         
	//*  26   48:invokespecial   #46  <Method boolean zzjn.zza(zzjk, int)>
	//*  27   51:ifne            0
										return ((zzjt) (this));
	//   28   54:aload_0         
	//   29   55:areturn         
								} else
								{
									zzph = Float.valueOf(Float.intBitsToFloat(zzjk1.zzdv()));
	//   30   56:aload_0         
	//   31   57:aload_1         
	//   32   58:invokevirtual   #49  <Method int zzjk.zzdv()>
	//   33   61:invokestatic    #55  <Method float Float.intBitsToFloat(int)>
	//   34   64:invokestatic    #59  <Method Float Float.valueOf(float)>
	//   35   67:putfield        #28  <Field Float zzph>
								}
							} else
	//*  36   70:goto            0
							{
								zzpg = Float.valueOf(Float.intBitsToFloat(zzjk1.zzdv()));
	//   37   73:aload_0         
	//   38   74:aload_1         
	//   39   75:invokevirtual   #49  <Method int zzjk.zzdv()>
	//   40   78:invokestatic    #55  <Method float Float.intBitsToFloat(int)>
	//   41   81:invokestatic    #59  <Method Float Float.valueOf(float)>
	//   42   84:putfield        #26  <Field Float zzpg>
							}
						} else
	//*  43   87:goto            0
						{
							zzpf = Float.valueOf(Float.intBitsToFloat(zzjk1.zzdv()));
	//   44   90:aload_0         
	//   45   91:aload_1         
	//   46   92:invokevirtual   #49  <Method int zzjk.zzdv()>
	//   47   95:invokestatic    #55  <Method float Float.intBitsToFloat(int)>
	//   48   98:invokestatic    #59  <Method Float Float.valueOf(float)>
	//   49  101:putfield        #24  <Field Float zzpf>
						}
					} else
	//*  50  104:goto            0
					{
						zzpe = Float.valueOf(Float.intBitsToFloat(zzjk1.zzdv()));
	//   51  107:aload_0         
	//   52  108:aload_1         
	//   53  109:invokevirtual   #49  <Method int zzjk.zzdv()>
	//   54  112:invokestatic    #55  <Method float Float.intBitsToFloat(int)>
	//   55  115:invokestatic    #59  <Method Float Float.valueOf(float)>
	//   56  118:putfield        #22  <Field Float zzpe>
					}
				} else
	//*  57  121:goto            0
				{
					zzpd = Float.valueOf(Float.intBitsToFloat(zzjk1.zzdv()));
	//   58  124:aload_0         
	//   59  125:aload_1         
	//   60  126:invokevirtual   #49  <Method int zzjk.zzdv()>
	//   61  129:invokestatic    #55  <Method float Float.intBitsToFloat(int)>
	//   62  132:invokestatic    #59  <Method Float Float.valueOf(float)>
	//   63  135:putfield        #20  <Field Float zzpd>
				}
			} else
	//*  64  138:goto            0
			{
				zzpc = Float.valueOf(Float.intBitsToFloat(zzjk1.zzdv()));
	//   65  141:aload_0         
	//   66  142:aload_1         
	//   67  143:invokevirtual   #49  <Method int zzjk.zzdv()>
	//   68  146:invokestatic    #55  <Method float Float.intBitsToFloat(int)>
	//   69  149:invokestatic    #59  <Method Float Float.valueOf(float)>
	//   70  152:putfield        #18  <Field Float zzpc>
			}
		} while(true);
	//   71  155:goto            0
		return ((zzjt) (this));
	//   72  158:aload_0         
	//   73  159:areturn         
	}

	public final void zza(zzjl zzjl1)
		throws IOException
	{
		Float float1 = zzpc;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Float zzpc>
	//    2    4:astore_2        
		if(float1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          18
			zzjl1.zza(1, float1.floatValue());
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #65  <Method float Float.floatValue()>
	//    9   15:invokevirtual   #70  <Method void zzjl.zza(int, float)>
		float1 = zzpd;
	//   10   18:aload_0         
	//   11   19:getfield        #20  <Field Float zzpd>
	//   12   22:astore_2        
		if(float1 != null)
	//*  13   23:aload_2         
	//*  14   24:ifnull          36
			zzjl1.zza(2, float1.floatValue());
	//   15   27:aload_1         
	//   16   28:iconst_2        
	//   17   29:aload_2         
	//   18   30:invokevirtual   #65  <Method float Float.floatValue()>
	//   19   33:invokevirtual   #70  <Method void zzjl.zza(int, float)>
		float1 = zzpe;
	//   20   36:aload_0         
	//   21   37:getfield        #22  <Field Float zzpe>
	//   22   40:astore_2        
		if(float1 != null)
	//*  23   41:aload_2         
	//*  24   42:ifnull          54
			zzjl1.zza(3, float1.floatValue());
	//   25   45:aload_1         
	//   26   46:iconst_3        
	//   27   47:aload_2         
	//   28   48:invokevirtual   #65  <Method float Float.floatValue()>
	//   29   51:invokevirtual   #70  <Method void zzjl.zza(int, float)>
		float1 = zzpf;
	//   30   54:aload_0         
	//   31   55:getfield        #24  <Field Float zzpf>
	//   32   58:astore_2        
		if(float1 != null)
	//*  33   59:aload_2         
	//*  34   60:ifnull          72
			zzjl1.zza(4, float1.floatValue());
	//   35   63:aload_1         
	//   36   64:iconst_4        
	//   37   65:aload_2         
	//   38   66:invokevirtual   #65  <Method float Float.floatValue()>
	//   39   69:invokevirtual   #70  <Method void zzjl.zza(int, float)>
		float1 = zzpg;
	//   40   72:aload_0         
	//   41   73:getfield        #26  <Field Float zzpg>
	//   42   76:astore_2        
		if(float1 != null)
	//*  43   77:aload_2         
	//*  44   78:ifnull          90
			zzjl1.zza(5, float1.floatValue());
	//   45   81:aload_1         
	//   46   82:iconst_5        
	//   47   83:aload_2         
	//   48   84:invokevirtual   #65  <Method float Float.floatValue()>
	//   49   87:invokevirtual   #70  <Method void zzjl.zza(int, float)>
		float1 = zzph;
	//   50   90:aload_0         
	//   51   91:getfield        #28  <Field Float zzph>
	//   52   94:astore_2        
		if(float1 != null)
	//*  53   95:aload_2         
	//*  54   96:ifnull          109
			zzjl1.zza(6, float1.floatValue());
	//   55   99:aload_1         
	//   56  100:bipush          6
	//   57  102:aload_2         
	//   58  103:invokevirtual   #65  <Method float Float.floatValue()>
	//   59  106:invokevirtual   #70  <Method void zzjl.zza(int, float)>
		super.zza(zzjl1);
	//   60  109:aload_0         
	//   61  110:aload_1         
	//   62  111:invokespecial   #72  <Method void zzjn.zza(zzjl)>
	//   63  114:return          
	}

	protected final int zzt()
	{
		int j = super.zzt();
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method int zzjn.zzt()>
	//    2    4:istore_2        
		Float float1 = zzpc;
	//    3    5:aload_0         
	//    4    6:getfield        #18  <Field Float zzpc>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(float1 != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          30
		{
			float1.floatValue();
	//   10   16:aload_3         
	//   11   17:invokevirtual   #65  <Method float Float.floatValue()>
	//   12   20:pop             
			i = j + (zzjl.zzav(1) + 4);
	//   13   21:iload_2         
	//   14   22:iconst_1        
	//   15   23:invokestatic    #79  <Method int zzjl.zzav(int)>
	//   16   26:iconst_4        
	//   17   27:iadd            
	//   18   28:iadd            
	//   19   29:istore_1        
		}
		float1 = zzpd;
	//   20   30:aload_0         
	//   21   31:getfield        #20  <Field Float zzpd>
	//   22   34:astore_3        
		j = i;
	//   23   35:iload_1         
	//   24   36:istore_2        
		if(float1 != null)
	//*  25   37:aload_3         
	//*  26   38:ifnull          55
		{
			float1.floatValue();
	//   27   41:aload_3         
	//   28   42:invokevirtual   #65  <Method float Float.floatValue()>
	//   29   45:pop             
			j = i + (zzjl.zzav(2) + 4);
	//   30   46:iload_1         
	//   31   47:iconst_2        
	//   32   48:invokestatic    #79  <Method int zzjl.zzav(int)>
	//   33   51:iconst_4        
	//   34   52:iadd            
	//   35   53:iadd            
	//   36   54:istore_2        
		}
		float1 = zzpe;
	//   37   55:aload_0         
	//   38   56:getfield        #22  <Field Float zzpe>
	//   39   59:astore_3        
		i = j;
	//   40   60:iload_2         
	//   41   61:istore_1        
		if(float1 != null)
	//*  42   62:aload_3         
	//*  43   63:ifnull          80
		{
			float1.floatValue();
	//   44   66:aload_3         
	//   45   67:invokevirtual   #65  <Method float Float.floatValue()>
	//   46   70:pop             
			i = j + (zzjl.zzav(3) + 4);
	//   47   71:iload_2         
	//   48   72:iconst_3        
	//   49   73:invokestatic    #79  <Method int zzjl.zzav(int)>
	//   50   76:iconst_4        
	//   51   77:iadd            
	//   52   78:iadd            
	//   53   79:istore_1        
		}
		float1 = zzpf;
	//   54   80:aload_0         
	//   55   81:getfield        #24  <Field Float zzpf>
	//   56   84:astore_3        
		j = i;
	//   57   85:iload_1         
	//   58   86:istore_2        
		if(float1 != null)
	//*  59   87:aload_3         
	//*  60   88:ifnull          105
		{
			float1.floatValue();
	//   61   91:aload_3         
	//   62   92:invokevirtual   #65  <Method float Float.floatValue()>
	//   63   95:pop             
			j = i + (zzjl.zzav(4) + 4);
	//   64   96:iload_1         
	//   65   97:iconst_4        
	//   66   98:invokestatic    #79  <Method int zzjl.zzav(int)>
	//   67  101:iconst_4        
	//   68  102:iadd            
	//   69  103:iadd            
	//   70  104:istore_2        
		}
		float1 = zzpg;
	//   71  105:aload_0         
	//   72  106:getfield        #26  <Field Float zzpg>
	//   73  109:astore_3        
		i = j;
	//   74  110:iload_2         
	//   75  111:istore_1        
		if(float1 != null)
	//*  76  112:aload_3         
	//*  77  113:ifnull          130
		{
			float1.floatValue();
	//   78  116:aload_3         
	//   79  117:invokevirtual   #65  <Method float Float.floatValue()>
	//   80  120:pop             
			i = j + (zzjl.zzav(5) + 4);
	//   81  121:iload_2         
	//   82  122:iconst_5        
	//   83  123:invokestatic    #79  <Method int zzjl.zzav(int)>
	//   84  126:iconst_4        
	//   85  127:iadd            
	//   86  128:iadd            
	//   87  129:istore_1        
		}
		float1 = zzph;
	//   88  130:aload_0         
	//   89  131:getfield        #28  <Field Float zzph>
	//   90  134:astore_3        
		j = i;
	//   91  135:iload_1         
	//   92  136:istore_2        
		if(float1 != null)
	//*  93  137:aload_3         
	//*  94  138:ifnull          156
		{
			float1.floatValue();
	//   95  141:aload_3         
	//   96  142:invokevirtual   #65  <Method float Float.floatValue()>
	//   97  145:pop             
			j = i + (zzjl.zzav(6) + 4);
	//   98  146:iload_1         
	//   99  147:bipush          6
	//  100  149:invokestatic    #79  <Method int zzjl.zzav(int)>
	//  101  152:iconst_4        
	//  102  153:iadd            
	//  103  154:iadd            
	//  104  155:istore_2        
		}
		return j;
	//  105  156:iload_2         
	//  106  157:ireturn         
	}

	public Float zzpc;
	public Float zzpd;
	public Float zzpe;
	public Float zzpf;
	public Float zzpg;
	public Float zzph;
}
