// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzic, zzbez, zzia, 
//			zzbfl, zzbfa, zzbfi

public final class zzid extends zzbfc
{

	public zzid()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void zzbfc()>
		zzacp = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #17  <Field String zzacp>
		zzamh = zzic.zzhr();
	//    5    9:aload_0         
	//    6   10:invokestatic    #23  <Method zzic[] zzic.zzhr()>
	//    7   13:putfield        #25  <Field zzic[] zzamh>
		zzami = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #27  <Field Integer zzami>
		zzebk = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #31  <Field zzbfe zzebk>
		zzebt = -1;
	//   14   26:aload_0         
	//   15   27:iconst_m1       
	//   16   28:putfield        #35  <Field int zzebt>
	//   17   31:return          
	}

	private final zzid zzg(zzbez zzbez1)
		throws IOException
	{
		IllegalArgumentException illegalargumentexception;
		do
		{
			int i = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #48  <Method int zzbez.zzabk()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            207
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          196
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          75
				{
					if(i != 24)
	//*  11   21:iload_2         
	//*  12   22:bipush          24
	//*  13   24:icmpeq          38
					{
						if(!super.zza(zzbez1, i))
	//*  14   27:aload_0         
	//*  15   28:aload_1         
	//*  16   29:iload_2         
	//*  17   30:invokespecial   #52  <Method boolean zzbfc.zza(zzbez, int)>
	//*  18   33:ifne            0
							return this;
	//   19   36:aload_0         
	//   20   37:areturn         
					} else
					{
						int k = zzbez1.getPosition();
	//   21   38:aload_1         
	//   22   39:invokevirtual   #55  <Method int zzbez.getPosition()>
	//   23   42:istore_3        
						try
						{
							zzami = Integer.valueOf(zzia.zzd(zzbez1.zzacc()));
	//   24   43:aload_0         
	//   25   44:aload_1         
	//   26   45:invokevirtual   #58  <Method int zzbez.zzacc()>
	//   27   48:invokestatic    #64  <Method int zzia.zzd(int)>
	//   28   51:invokestatic    #70  <Method Integer Integer.valueOf(int)>
	//   29   54:putfield        #27  <Field Integer zzami>
						}
	//*  30   57:goto            0
	//*  31   60:aload_1         
	//*  32   61:iload_3         
	//*  33   62:invokevirtual   #74  <Method void zzbez.zzdc(int)>
	//*  34   65:aload_0         
	//*  35   66:aload_1         
	//*  36   67:iload_2         
	//*  37   68:invokevirtual   #52  <Method boolean zzbfc.zza(zzbez, int)>
	//*  38   71:pop             
	//*  39   72:goto            0
	//*  40   75:aload_1         
	//*  41   76:bipush          18
	//*  42   78:invokestatic    #80  <Method int zzbfl.zzb(zzbez, int)>
	//*  43   81:istore_3        
	//*  44   82:aload_0         
	//*  45   83:getfield        #25  <Field zzic[] zzamh>
	//*  46   86:ifnonnull       94
	//*  47   89:iconst_0        
	//*  48   90:istore_2        
	//*  49   91:goto            100
	//*  50   94:aload_0         
	//*  51   95:getfield        #25  <Field zzic[] zzamh>
	//*  52   98:arraylength     
	//*  53   99:istore_2        
	//*  54  100:iload_3         
	//*  55  101:iload_2         
	//*  56  102:iadd            
	//*  57  103:anewarray       zzic[]
	//*  58  106:astore          4
	//*  59  108:iload_2         
	//*  60  109:istore_3        
	//*  61  110:iload_2         
	//*  62  111:ifeq            128
	//*  63  114:aload_0         
	//*  64  115:getfield        #25  <Field zzic[] zzamh>
	//*  65  118:iconst_0        
	//*  66  119:aload           4
	//*  67  121:iconst_0        
	//*  68  122:iload_2         
	//*  69  123:invokestatic    #86  <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  70  126:iload_2         
	//*  71  127:istore_3        
	//*  72  128:iload_3         
	//*  73  129:aload           4
	//*  74  131:arraylength     
	//*  75  132:iconst_1        
	//*  76  133:isub            
	//*  77  134:icmpge          168
	//*  78  137:aload           4
	//*  79  139:iload_3         
	//*  80  140:new             #19  <Class zzic>
	//*  81  143:dup             
	//*  82  144:invokespecial   #87  <Method void zzic()>
	//*  83  147:aastore         
	//*  84  148:aload_1         
	//*  85  149:aload           4
	//*  86  151:iload_3         
	//*  87  152:aaload          
	//*  88  153:invokevirtual   #90  <Method void zzbez.zza(zzbfi)>
	//*  89  156:aload_1         
	//*  90  157:invokevirtual   #48  <Method int zzbez.zzabk()>
	//*  91  160:pop             
	//*  92  161:iload_3         
	//*  93  162:iconst_1        
	//*  94  163:iadd            
	//*  95  164:istore_3        
	//*  96  165:goto            128
	//*  97  168:aload           4
	//*  98  170:iload_3         
	//*  99  171:new             #19  <Class zzic>
	//* 100  174:dup             
	//* 101  175:invokespecial   #87  <Method void zzic()>
	//* 102  178:aastore         
	//* 103  179:aload_1         
	//* 104  180:aload           4
	//* 105  182:iload_3         
	//* 106  183:aaload          
	//* 107  184:invokevirtual   #90  <Method void zzbez.zza(zzbfi)>
	//* 108  187:aload_0         
	//* 109  188:aload           4
	//* 110  190:putfield        #25  <Field zzic[] zzamh>
	//* 111  193:goto            0
	//* 112  196:aload_0         
	//* 113  197:aload_1         
	//* 114  198:invokevirtual   #94  <Method String zzbez.readString()>
	//* 115  201:putfield        #17  <Field String zzacp>
	//* 116  204:goto            0
	//* 117  207:aload_0         
	//* 118  208:areturn         
						// Misplaced declaration of an exception variable
						catch(IllegalArgumentException illegalargumentexception)
						{
							zzbez1.zzdc(k);
							((zzbfc)this).zza(zzbez1, i);
						}
					}
				} else
				{
					int l = zzbfl.zzb(zzbez1, 18);
					int j;
					if(zzamh == null)
						j = 0;
					else
						j = zzamh.length;
					zzic azzic[] = new zzic[l + j];
					l = j;
					if(j != 0)
					{
						System.arraycopy(((Object) (zzamh)), 0, ((Object) (azzic)), 0, j);
						l = j;
					}
					for(; l < azzic.length - 1; l++)
					{
						azzic[l] = new zzic();
						zzbez1.zza(((zzbfi) (azzic[l])));
						zzbez1.zzabk();
					}

					azzic[l] = new zzic();
					zzbez1.zza(((zzbfi) (azzic[l])));
					zzamh = azzic;
				}
			} else
			{
				zzacp = zzbez1.readString();
			}
		} while(true);
		return this;
	//* 119  209:astore          4
	//* 120  211:goto            60
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		return ((zzbfi) (zzg(zzbez1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #98  <Method zzid zzg(zzbez)>
	//    3    5:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzacp != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field String zzacp>
	//*   2    4:ifnull          16
			zzbfa1.zzf(1, zzacp);
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field String zzacp>
	//    7   13:invokevirtual   #105 <Method void zzbfa.zzf(int, String)>
		if(zzamh != null && zzamh.length > 0)
	//*   8   16:aload_0         
	//*   9   17:getfield        #25  <Field zzic[] zzamh>
	//*  10   20:ifnull          66
	//*  11   23:aload_0         
	//*  12   24:getfield        #25  <Field zzic[] zzamh>
	//*  13   27:arraylength     
	//*  14   28:ifle            66
		{
			for(int i = 0; i < zzamh.length; i++)
	//*  15   31:iconst_0        
	//*  16   32:istore_2        
	//*  17   33:iload_2         
	//*  18   34:aload_0         
	//*  19   35:getfield        #25  <Field zzic[] zzamh>
	//*  20   38:arraylength     
	//*  21   39:icmpge          66
			{
				zzic zzic1 = zzamh[i];
	//   22   42:aload_0         
	//   23   43:getfield        #25  <Field zzic[] zzamh>
	//   24   46:iload_2         
	//   25   47:aaload          
	//   26   48:astore_3        
				if(zzic1 != null)
	//*  27   49:aload_3         
	//*  28   50:ifnull          59
					zzbfa1.zza(2, ((zzbfi) (zzic1)));
	//   29   53:aload_1         
	//   30   54:iconst_2        
	//   31   55:aload_3         
	//   32   56:invokevirtual   #108 <Method void zzbfa.zza(int, zzbfi)>
			}

	//   33   59:iload_2         
	//   34   60:iconst_1        
	//   35   61:iadd            
	//   36   62:istore_2        
		}
	//*  37   63:goto            33
		if(zzami != null)
	//*  38   66:aload_0         
	//*  39   67:getfield        #27  <Field Integer zzami>
	//*  40   70:ifnull          85
			zzbfa1.zzm(3, zzami.intValue());
	//   41   73:aload_1         
	//   42   74:iconst_3        
	//   43   75:aload_0         
	//   44   76:getfield        #27  <Field Integer zzami>
	//   45   79:invokevirtual   #111 <Method int Integer.intValue()>
	//   46   82:invokevirtual   #115 <Method void zzbfa.zzm(int, int)>
		super.zza(zzbfa1);
	//   47   85:aload_0         
	//   48   86:aload_1         
	//   49   87:invokespecial   #117 <Method void zzbfc.zza(zzbfa)>
	//   50   90:return          
	}

	protected final int zzr()
	{
		int j = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #120 <Method int zzbfc.zzr()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzacp != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #17  <Field String zzacp>
	//*   7   11:ifnull          25
			i = j + zzbfa.zzg(1, zzacp);
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #17  <Field String zzacp>
	//   12   20:invokestatic    #123 <Method int zzbfa.zzg(int, String)>
	//   13   23:iadd            
	//   14   24:istore_1        
		j = i;
	//   15   25:iload_1         
	//   16   26:istore_2        
		if(zzamh != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #25  <Field zzic[] zzamh>
	//*  19   31:ifnull          90
		{
			j = i;
	//   20   34:iload_1         
	//   21   35:istore_2        
			if(zzamh.length > 0)
	//*  22   36:aload_0         
	//*  23   37:getfield        #25  <Field zzic[] zzamh>
	//*  24   40:arraylength     
	//*  25   41:ifle            90
			{
				int k = 0;
	//   26   44:iconst_0        
	//   27   45:istore_3        
				do
				{
					j = i;
	//   28   46:iload_1         
	//   29   47:istore_2        
					if(k >= zzamh.length)
						break;
	//   30   48:iload_3         
	//   31   49:aload_0         
	//   32   50:getfield        #25  <Field zzic[] zzamh>
	//   33   53:arraylength     
	//   34   54:icmpge          90
					zzic zzic1 = zzamh[k];
	//   35   57:aload_0         
	//   36   58:getfield        #25  <Field zzic[] zzamh>
	//   37   61:iload_3         
	//   38   62:aaload          
	//   39   63:astore          4
					j = i;
	//   40   65:iload_1         
	//   41   66:istore_2        
					if(zzic1 != null)
	//*  42   67:aload           4
	//*  43   69:ifnull          81
						j = i + zzbfa.zzb(2, ((zzbfi) (zzic1)));
	//   44   72:iload_1         
	//   45   73:iconst_2        
	//   46   74:aload           4
	//   47   76:invokestatic    #126 <Method int zzbfa.zzb(int, zzbfi)>
	//   48   79:iadd            
	//   49   80:istore_2        
					k++;
	//   50   81:iload_3         
	//   51   82:iconst_1        
	//   52   83:iadd            
	//   53   84:istore_3        
					i = j;
	//   54   85:iload_2         
	//   55   86:istore_1        
				} while(true);
	//   56   87:goto            46
			}
		}
		i = j;
	//   57   90:iload_2         
	//   58   91:istore_1        
		if(zzami != null)
	//*  59   92:aload_0         
	//*  60   93:getfield        #27  <Field Integer zzami>
	//*  61   96:ifnull          113
			i = j + zzbfa.zzq(3, zzami.intValue());
	//   62   99:iload_2         
	//   63  100:iconst_3        
	//   64  101:aload_0         
	//   65  102:getfield        #27  <Field Integer zzami>
	//   66  105:invokevirtual   #111 <Method int Integer.intValue()>
	//   67  108:invokestatic    #130 <Method int zzbfa.zzq(int, int)>
	//   68  111:iadd            
	//   69  112:istore_1        
		return i;
	//   70  113:iload_1         
	//   71  114:ireturn         
	}

	private String zzacp;
	private zzic zzamh[];
	private Integer zzami;
}
