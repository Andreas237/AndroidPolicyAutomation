// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbfo, zzbez, zzbfl, 
//			zzbfq, zzbfa, zzbfi

public final class zzbfp extends zzbfc
{

	public zzbfp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void zzbfc()>
		zzecz = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #20  <Field zzbfq zzecz>
		zzeda = zzbfo.zzagt();
	//    5    9:aload_0         
	//    6   10:invokestatic    #26  <Method zzbfo[] zzbfo.zzagt()>
	//    7   13:putfield        #28  <Field zzbfo[] zzeda>
		zzedb = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #30  <Field byte[] zzedb>
		zzedc = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #32  <Field byte[] zzedc>
		zzedd = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #34  <Field Integer zzedd>
		zzebk = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #38  <Field zzbfe zzebk>
		zzebt = -1;
	//   20   36:aload_0         
	//   21   37:iconst_m1       
	//   22   38:putfield        #42  <Field int zzebt>
	//   23   41:return          
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		do
		{
			int i = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #53  <Method int zzbez.zzabk()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            236
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          207
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          86
				{
					if(i != 26)
	//*  11   21:iload_2         
	//*  12   22:bipush          26
	//*  13   24:icmpeq          75
					{
						if(i != 34)
	//*  14   27:iload_2         
	//*  15   28:bipush          34
	//*  16   30:icmpeq          64
						{
							if(i != 40)
	//*  17   33:iload_2         
	//*  18   34:bipush          40
	//*  19   36:icmpeq          50
							{
								if(!super.zza(zzbez1, i))
	//*  20   39:aload_0         
	//*  21   40:aload_1         
	//*  22   41:iload_2         
	//*  23   42:invokespecial   #56  <Method boolean zzbfc.zza(zzbez, int)>
	//*  24   45:ifne            0
									return ((zzbfi) (this));
	//   25   48:aload_0         
	//   26   49:areturn         
							} else
							{
								zzedd = Integer.valueOf(zzbez1.zzabn());
	//   27   50:aload_0         
	//   28   51:aload_1         
	//   29   52:invokevirtual   #59  <Method int zzbez.zzabn()>
	//   30   55:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//   31   58:putfield        #34  <Field Integer zzedd>
							}
						} else
	//*  32   61:goto            0
						{
							zzedc = zzbez1.readBytes();
	//   33   64:aload_0         
	//   34   65:aload_1         
	//   35   66:invokevirtual   #69  <Method byte[] zzbez.readBytes()>
	//   36   69:putfield        #32  <Field byte[] zzedc>
						}
					} else
	//*  37   72:goto            0
					{
						zzedb = zzbez1.readBytes();
	//   38   75:aload_0         
	//   39   76:aload_1         
	//   40   77:invokevirtual   #69  <Method byte[] zzbez.readBytes()>
	//   41   80:putfield        #30  <Field byte[] zzedb>
					}
				} else
	//*  42   83:goto            0
				{
					int k = zzbfl.zzb(zzbez1, 18);
	//   43   86:aload_1         
	//   44   87:bipush          18
	//   45   89:invokestatic    #75  <Method int zzbfl.zzb(zzbez, int)>
	//   46   92:istore_3        
					int j;
					if(zzeda == null)
	//*  47   93:aload_0         
	//*  48   94:getfield        #28  <Field zzbfo[] zzeda>
	//*  49   97:ifnonnull       105
						j = 0;
	//   50  100:iconst_0        
	//   51  101:istore_2        
					else
	//*  52  102:goto            111
						j = zzeda.length;
	//   53  105:aload_0         
	//   54  106:getfield        #28  <Field zzbfo[] zzeda>
	//   55  109:arraylength     
	//   56  110:istore_2        
					zzbfo azzbfo[] = new zzbfo[k + j];
	//   57  111:iload_3         
	//   58  112:iload_2         
	//   59  113:iadd            
	//   60  114:anewarray       zzbfo[]
	//   61  117:astore          4
					k = j;
	//   62  119:iload_2         
	//   63  120:istore_3        
					if(j != 0)
	//*  64  121:iload_2         
	//*  65  122:ifeq            139
					{
						System.arraycopy(((Object) (zzeda)), 0, ((Object) (azzbfo)), 0, j);
	//   66  125:aload_0         
	//   67  126:getfield        #28  <Field zzbfo[] zzeda>
	//   68  129:iconst_0        
	//   69  130:aload           4
	//   70  132:iconst_0        
	//   71  133:iload_2         
	//   72  134:invokestatic    #81  <Method void System.arraycopy(Object, int, Object, int, int)>
						k = j;
	//   73  137:iload_2         
	//   74  138:istore_3        
					}
					for(; k < azzbfo.length - 1; k++)
	//*  75  139:iload_3         
	//*  76  140:aload           4
	//*  77  142:arraylength     
	//*  78  143:iconst_1        
	//*  79  144:isub            
	//*  80  145:icmpge          179
					{
						azzbfo[k] = new zzbfo();
	//   81  148:aload           4
	//   82  150:iload_3         
	//   83  151:new             #22  <Class zzbfo>
	//   84  154:dup             
	//   85  155:invokespecial   #82  <Method void zzbfo()>
	//   86  158:aastore         
						zzbez1.zza(((zzbfi) (azzbfo[k])));
	//   87  159:aload_1         
	//   88  160:aload           4
	//   89  162:iload_3         
	//   90  163:aaload          
	//   91  164:invokevirtual   #85  <Method void zzbez.zza(zzbfi)>
						zzbez1.zzabk();
	//   92  167:aload_1         
	//   93  168:invokevirtual   #53  <Method int zzbez.zzabk()>
	//   94  171:pop             
					}

	//   95  172:iload_3         
	//   96  173:iconst_1        
	//   97  174:iadd            
	//   98  175:istore_3        
	//*  99  176:goto            139
					azzbfo[k] = new zzbfo();
	//  100  179:aload           4
	//  101  181:iload_3         
	//  102  182:new             #22  <Class zzbfo>
	//  103  185:dup             
	//  104  186:invokespecial   #82  <Method void zzbfo()>
	//  105  189:aastore         
					zzbez1.zza(((zzbfi) (azzbfo[k])));
	//  106  190:aload_1         
	//  107  191:aload           4
	//  108  193:iload_3         
	//  109  194:aaload          
	//  110  195:invokevirtual   #85  <Method void zzbez.zza(zzbfi)>
					zzeda = azzbfo;
	//  111  198:aload_0         
	//  112  199:aload           4
	//  113  201:putfield        #28  <Field zzbfo[] zzeda>
				}
			} else
	//* 114  204:goto            0
			{
				if(zzecz == null)
	//* 115  207:aload_0         
	//* 116  208:getfield        #20  <Field zzbfq zzecz>
	//* 117  211:ifnonnull       225
					zzecz = new zzbfq();
	//  118  214:aload_0         
	//  119  215:new             #87  <Class zzbfq>
	//  120  218:dup             
	//  121  219:invokespecial   #88  <Method void zzbfq()>
	//  122  222:putfield        #20  <Field zzbfq zzecz>
				zzbez1.zza(((zzbfi) (zzecz)));
	//  123  225:aload_1         
	//  124  226:aload_0         
	//  125  227:getfield        #20  <Field zzbfq zzecz>
	//  126  230:invokevirtual   #85  <Method void zzbez.zza(zzbfi)>
			}
		} while(true);
	//  127  233:goto            0
		return ((zzbfi) (this));
	//  128  236:aload_0         
	//  129  237:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzecz != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field zzbfq zzecz>
	//*   2    4:ifnull          16
			zzbfa1.zza(1, ((zzbfi) (zzecz)));
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field zzbfq zzecz>
	//    7   13:invokevirtual   #95  <Method void zzbfa.zza(int, zzbfi)>
		if(zzeda != null && zzeda.length > 0)
	//*   8   16:aload_0         
	//*   9   17:getfield        #28  <Field zzbfo[] zzeda>
	//*  10   20:ifnull          66
	//*  11   23:aload_0         
	//*  12   24:getfield        #28  <Field zzbfo[] zzeda>
	//*  13   27:arraylength     
	//*  14   28:ifle            66
		{
			for(int i = 0; i < zzeda.length; i++)
	//*  15   31:iconst_0        
	//*  16   32:istore_2        
	//*  17   33:iload_2         
	//*  18   34:aload_0         
	//*  19   35:getfield        #28  <Field zzbfo[] zzeda>
	//*  20   38:arraylength     
	//*  21   39:icmpge          66
			{
				zzbfo zzbfo1 = zzeda[i];
	//   22   42:aload_0         
	//   23   43:getfield        #28  <Field zzbfo[] zzeda>
	//   24   46:iload_2         
	//   25   47:aaload          
	//   26   48:astore_3        
				if(zzbfo1 != null)
	//*  27   49:aload_3         
	//*  28   50:ifnull          59
					zzbfa1.zza(2, ((zzbfi) (zzbfo1)));
	//   29   53:aload_1         
	//   30   54:iconst_2        
	//   31   55:aload_3         
	//   32   56:invokevirtual   #95  <Method void zzbfa.zza(int, zzbfi)>
			}

	//   33   59:iload_2         
	//   34   60:iconst_1        
	//   35   61:iadd            
	//   36   62:istore_2        
		}
	//*  37   63:goto            33
		if(zzedb != null)
	//*  38   66:aload_0         
	//*  39   67:getfield        #30  <Field byte[] zzedb>
	//*  40   70:ifnull          82
			zzbfa1.zza(3, zzedb);
	//   41   73:aload_1         
	//   42   74:iconst_3        
	//   43   75:aload_0         
	//   44   76:getfield        #30  <Field byte[] zzedb>
	//   45   79:invokevirtual   #98  <Method void zzbfa.zza(int, byte[])>
		if(zzedc != null)
	//*  46   82:aload_0         
	//*  47   83:getfield        #32  <Field byte[] zzedc>
	//*  48   86:ifnull          98
			zzbfa1.zza(4, zzedc);
	//   49   89:aload_1         
	//   50   90:iconst_4        
	//   51   91:aload_0         
	//   52   92:getfield        #32  <Field byte[] zzedc>
	//   53   95:invokevirtual   #98  <Method void zzbfa.zza(int, byte[])>
		if(zzedd != null)
	//*  54   98:aload_0         
	//*  55   99:getfield        #34  <Field Integer zzedd>
	//*  56  102:ifnull          117
			zzbfa1.zzm(5, zzedd.intValue());
	//   57  105:aload_1         
	//   58  106:iconst_5        
	//   59  107:aload_0         
	//   60  108:getfield        #34  <Field Integer zzedd>
	//   61  111:invokevirtual   #101 <Method int Integer.intValue()>
	//   62  114:invokevirtual   #105 <Method void zzbfa.zzm(int, int)>
		super.zza(zzbfa1);
	//   63  117:aload_0         
	//   64  118:aload_1         
	//   65  119:invokespecial   #107 <Method void zzbfc.zza(zzbfa)>
	//   66  122:return          
	}

	protected final int zzr()
	{
		int j = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #110 <Method int zzbfc.zzr()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzecz != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #20  <Field zzbfq zzecz>
	//*   7   11:ifnull          25
			i = j + zzbfa.zzb(1, ((zzbfi) (zzecz)));
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #20  <Field zzbfq zzecz>
	//   12   20:invokestatic    #113 <Method int zzbfa.zzb(int, zzbfi)>
	//   13   23:iadd            
	//   14   24:istore_1        
		j = i;
	//   15   25:iload_1         
	//   16   26:istore_2        
		if(zzeda != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #28  <Field zzbfo[] zzeda>
	//*  19   31:ifnull          90
		{
			j = i;
	//   20   34:iload_1         
	//   21   35:istore_2        
			if(zzeda.length > 0)
	//*  22   36:aload_0         
	//*  23   37:getfield        #28  <Field zzbfo[] zzeda>
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
					if(k >= zzeda.length)
						break;
	//   30   48:iload_3         
	//   31   49:aload_0         
	//   32   50:getfield        #28  <Field zzbfo[] zzeda>
	//   33   53:arraylength     
	//   34   54:icmpge          90
					zzbfo zzbfo1 = zzeda[k];
	//   35   57:aload_0         
	//   36   58:getfield        #28  <Field zzbfo[] zzeda>
	//   37   61:iload_3         
	//   38   62:aaload          
	//   39   63:astore          4
					j = i;
	//   40   65:iload_1         
	//   41   66:istore_2        
					if(zzbfo1 != null)
	//*  42   67:aload           4
	//*  43   69:ifnull          81
						j = i + zzbfa.zzb(2, ((zzbfi) (zzbfo1)));
	//   44   72:iload_1         
	//   45   73:iconst_2        
	//   46   74:aload           4
	//   47   76:invokestatic    #113 <Method int zzbfa.zzb(int, zzbfi)>
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
		if(zzedb != null)
	//*  59   92:aload_0         
	//*  60   93:getfield        #30  <Field byte[] zzedb>
	//*  61   96:ifnull          110
			i = j + zzbfa.zzb(3, zzedb);
	//   62   99:iload_2         
	//   63  100:iconst_3        
	//   64  101:aload_0         
	//   65  102:getfield        #30  <Field byte[] zzedb>
	//   66  105:invokestatic    #116 <Method int zzbfa.zzb(int, byte[])>
	//   67  108:iadd            
	//   68  109:istore_1        
		j = i;
	//   69  110:iload_1         
	//   70  111:istore_2        
		if(zzedc != null)
	//*  71  112:aload_0         
	//*  72  113:getfield        #32  <Field byte[] zzedc>
	//*  73  116:ifnull          130
			j = i + zzbfa.zzb(4, zzedc);
	//   74  119:iload_1         
	//   75  120:iconst_4        
	//   76  121:aload_0         
	//   77  122:getfield        #32  <Field byte[] zzedc>
	//   78  125:invokestatic    #116 <Method int zzbfa.zzb(int, byte[])>
	//   79  128:iadd            
	//   80  129:istore_2        
		i = j;
	//   81  130:iload_2         
	//   82  131:istore_1        
		if(zzedd != null)
	//*  83  132:aload_0         
	//*  84  133:getfield        #34  <Field Integer zzedd>
	//*  85  136:ifnull          153
			i = j + zzbfa.zzq(5, zzedd.intValue());
	//   86  139:iload_2         
	//   87  140:iconst_5        
	//   88  141:aload_0         
	//   89  142:getfield        #34  <Field Integer zzedd>
	//   90  145:invokevirtual   #101 <Method int Integer.intValue()>
	//   91  148:invokestatic    #120 <Method int zzbfa.zzq(int, int)>
	//   92  151:iadd            
	//   93  152:istore_1        
		return i;
	//   94  153:iload_1         
	//   95  154:ireturn         
	}

	private zzbfq zzecz;
	public zzbfo zzeda[];
	private byte zzedb[];
	private byte zzedc[];
	private Integer zzedd;
}
