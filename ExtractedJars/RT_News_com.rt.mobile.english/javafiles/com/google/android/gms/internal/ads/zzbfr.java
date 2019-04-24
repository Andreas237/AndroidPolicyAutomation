// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbfo, zzbez, zzbfl, 
//			zzbfs, zzbfa, zzbfi

public final class zzbfr extends zzbfc
{

	public zzbfr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void zzbfc()>
		zzedh = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #21  <Field zzbfs zzedh>
		zzeda = zzbfo.zzagt();
	//    5    9:aload_0         
	//    6   10:invokestatic    #27  <Method zzbfo[] zzbfo.zzagt()>
	//    7   13:putfield        #29  <Field zzbfo[] zzeda>
		zzedb = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #31  <Field byte[] zzedb>
		zzedc = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #33  <Field byte[] zzedc>
		zzedd = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #35  <Field Integer zzedd>
		zzedi = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #37  <Field byte[] zzedi>
		zzebk = null;
	//   20   36:aload_0         
	//   21   37:aconst_null     
	//   22   38:putfield        #41  <Field zzbfe zzebk>
		zzebt = -1;
	//   23   41:aload_0         
	//   24   42:iconst_m1       
	//   25   43:putfield        #45  <Field int zzebt>
	//   26   46:return          
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		do
		{
			int i = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #56  <Method int zzbez.zzabk()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            253
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          224
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          103
				{
					if(i != 26)
	//*  11   21:iload_2         
	//*  12   22:bipush          26
	//*  13   24:icmpeq          92
					{
						if(i != 34)
	//*  14   27:iload_2         
	//*  15   28:bipush          34
	//*  16   30:icmpeq          81
						{
							if(i != 40)
	//*  17   33:iload_2         
	//*  18   34:bipush          40
	//*  19   36:icmpeq          67
							{
								if(i != 50)
	//*  20   39:iload_2         
	//*  21   40:bipush          50
	//*  22   42:icmpeq          56
								{
									if(!super.zza(zzbez1, i))
	//*  23   45:aload_0         
	//*  24   46:aload_1         
	//*  25   47:iload_2         
	//*  26   48:invokespecial   #59  <Method boolean zzbfc.zza(zzbez, int)>
	//*  27   51:ifne            0
										return ((zzbfi) (this));
	//   28   54:aload_0         
	//   29   55:areturn         
								} else
								{
									zzedi = zzbez1.readBytes();
	//   30   56:aload_0         
	//   31   57:aload_1         
	//   32   58:invokevirtual   #63  <Method byte[] zzbez.readBytes()>
	//   33   61:putfield        #37  <Field byte[] zzedi>
								}
							} else
	//*  34   64:goto            0
							{
								zzedd = Integer.valueOf(zzbez1.zzabn());
	//   35   67:aload_0         
	//   36   68:aload_1         
	//   37   69:invokevirtual   #66  <Method int zzbez.zzabn()>
	//   38   72:invokestatic    #72  <Method Integer Integer.valueOf(int)>
	//   39   75:putfield        #35  <Field Integer zzedd>
							}
						} else
	//*  40   78:goto            0
						{
							zzedc = zzbez1.readBytes();
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:invokevirtual   #63  <Method byte[] zzbez.readBytes()>
	//   44   86:putfield        #33  <Field byte[] zzedc>
						}
					} else
	//*  45   89:goto            0
					{
						zzedb = zzbez1.readBytes();
	//   46   92:aload_0         
	//   47   93:aload_1         
	//   48   94:invokevirtual   #63  <Method byte[] zzbez.readBytes()>
	//   49   97:putfield        #31  <Field byte[] zzedb>
					}
				} else
	//*  50  100:goto            0
				{
					int k = zzbfl.zzb(zzbez1, 18);
	//   51  103:aload_1         
	//   52  104:bipush          18
	//   53  106:invokestatic    #78  <Method int zzbfl.zzb(zzbez, int)>
	//   54  109:istore_3        
					int j;
					if(zzeda == null)
	//*  55  110:aload_0         
	//*  56  111:getfield        #29  <Field zzbfo[] zzeda>
	//*  57  114:ifnonnull       122
						j = 0;
	//   58  117:iconst_0        
	//   59  118:istore_2        
					else
	//*  60  119:goto            128
						j = zzeda.length;
	//   61  122:aload_0         
	//   62  123:getfield        #29  <Field zzbfo[] zzeda>
	//   63  126:arraylength     
	//   64  127:istore_2        
					zzbfo azzbfo[] = new zzbfo[k + j];
	//   65  128:iload_3         
	//   66  129:iload_2         
	//   67  130:iadd            
	//   68  131:anewarray       zzbfo[]
	//   69  134:astore          4
					k = j;
	//   70  136:iload_2         
	//   71  137:istore_3        
					if(j != 0)
	//*  72  138:iload_2         
	//*  73  139:ifeq            156
					{
						System.arraycopy(((Object) (zzeda)), 0, ((Object) (azzbfo)), 0, j);
	//   74  142:aload_0         
	//   75  143:getfield        #29  <Field zzbfo[] zzeda>
	//   76  146:iconst_0        
	//   77  147:aload           4
	//   78  149:iconst_0        
	//   79  150:iload_2         
	//   80  151:invokestatic    #84  <Method void System.arraycopy(Object, int, Object, int, int)>
						k = j;
	//   81  154:iload_2         
	//   82  155:istore_3        
					}
					for(; k < azzbfo.length - 1; k++)
	//*  83  156:iload_3         
	//*  84  157:aload           4
	//*  85  159:arraylength     
	//*  86  160:iconst_1        
	//*  87  161:isub            
	//*  88  162:icmpge          196
					{
						azzbfo[k] = new zzbfo();
	//   89  165:aload           4
	//   90  167:iload_3         
	//   91  168:new             #23  <Class zzbfo>
	//   92  171:dup             
	//   93  172:invokespecial   #85  <Method void zzbfo()>
	//   94  175:aastore         
						zzbez1.zza(((zzbfi) (azzbfo[k])));
	//   95  176:aload_1         
	//   96  177:aload           4
	//   97  179:iload_3         
	//   98  180:aaload          
	//   99  181:invokevirtual   #88  <Method void zzbez.zza(zzbfi)>
						zzbez1.zzabk();
	//  100  184:aload_1         
	//  101  185:invokevirtual   #56  <Method int zzbez.zzabk()>
	//  102  188:pop             
					}

	//  103  189:iload_3         
	//  104  190:iconst_1        
	//  105  191:iadd            
	//  106  192:istore_3        
	//* 107  193:goto            156
					azzbfo[k] = new zzbfo();
	//  108  196:aload           4
	//  109  198:iload_3         
	//  110  199:new             #23  <Class zzbfo>
	//  111  202:dup             
	//  112  203:invokespecial   #85  <Method void zzbfo()>
	//  113  206:aastore         
					zzbez1.zza(((zzbfi) (azzbfo[k])));
	//  114  207:aload_1         
	//  115  208:aload           4
	//  116  210:iload_3         
	//  117  211:aaload          
	//  118  212:invokevirtual   #88  <Method void zzbez.zza(zzbfi)>
					zzeda = azzbfo;
	//  119  215:aload_0         
	//  120  216:aload           4
	//  121  218:putfield        #29  <Field zzbfo[] zzeda>
				}
			} else
	//* 122  221:goto            0
			{
				if(zzedh == null)
	//* 123  224:aload_0         
	//* 124  225:getfield        #21  <Field zzbfs zzedh>
	//* 125  228:ifnonnull       242
					zzedh = new zzbfs();
	//  126  231:aload_0         
	//  127  232:new             #90  <Class zzbfs>
	//  128  235:dup             
	//  129  236:invokespecial   #91  <Method void zzbfs()>
	//  130  239:putfield        #21  <Field zzbfs zzedh>
				zzbez1.zza(((zzbfi) (zzedh)));
	//  131  242:aload_1         
	//  132  243:aload_0         
	//  133  244:getfield        #21  <Field zzbfs zzedh>
	//  134  247:invokevirtual   #88  <Method void zzbez.zza(zzbfi)>
			}
		} while(true);
	//  135  250:goto            0
		return ((zzbfi) (this));
	//  136  253:aload_0         
	//  137  254:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzedh != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field zzbfs zzedh>
	//*   2    4:ifnull          16
			zzbfa1.zza(1, ((zzbfi) (zzedh)));
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field zzbfs zzedh>
	//    7   13:invokevirtual   #98  <Method void zzbfa.zza(int, zzbfi)>
		if(zzeda != null && zzeda.length > 0)
	//*   8   16:aload_0         
	//*   9   17:getfield        #29  <Field zzbfo[] zzeda>
	//*  10   20:ifnull          66
	//*  11   23:aload_0         
	//*  12   24:getfield        #29  <Field zzbfo[] zzeda>
	//*  13   27:arraylength     
	//*  14   28:ifle            66
		{
			for(int i = 0; i < zzeda.length; i++)
	//*  15   31:iconst_0        
	//*  16   32:istore_2        
	//*  17   33:iload_2         
	//*  18   34:aload_0         
	//*  19   35:getfield        #29  <Field zzbfo[] zzeda>
	//*  20   38:arraylength     
	//*  21   39:icmpge          66
			{
				zzbfo zzbfo1 = zzeda[i];
	//   22   42:aload_0         
	//   23   43:getfield        #29  <Field zzbfo[] zzeda>
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
	//   32   56:invokevirtual   #98  <Method void zzbfa.zza(int, zzbfi)>
			}

	//   33   59:iload_2         
	//   34   60:iconst_1        
	//   35   61:iadd            
	//   36   62:istore_2        
		}
	//*  37   63:goto            33
		if(zzedb != null)
	//*  38   66:aload_0         
	//*  39   67:getfield        #31  <Field byte[] zzedb>
	//*  40   70:ifnull          82
			zzbfa1.zza(3, zzedb);
	//   41   73:aload_1         
	//   42   74:iconst_3        
	//   43   75:aload_0         
	//   44   76:getfield        #31  <Field byte[] zzedb>
	//   45   79:invokevirtual   #101 <Method void zzbfa.zza(int, byte[])>
		if(zzedc != null)
	//*  46   82:aload_0         
	//*  47   83:getfield        #33  <Field byte[] zzedc>
	//*  48   86:ifnull          98
			zzbfa1.zza(4, zzedc);
	//   49   89:aload_1         
	//   50   90:iconst_4        
	//   51   91:aload_0         
	//   52   92:getfield        #33  <Field byte[] zzedc>
	//   53   95:invokevirtual   #101 <Method void zzbfa.zza(int, byte[])>
		if(zzedd != null)
	//*  54   98:aload_0         
	//*  55   99:getfield        #35  <Field Integer zzedd>
	//*  56  102:ifnull          117
			zzbfa1.zzm(5, zzedd.intValue());
	//   57  105:aload_1         
	//   58  106:iconst_5        
	//   59  107:aload_0         
	//   60  108:getfield        #35  <Field Integer zzedd>
	//   61  111:invokevirtual   #104 <Method int Integer.intValue()>
	//   62  114:invokevirtual   #108 <Method void zzbfa.zzm(int, int)>
		if(zzedi != null)
	//*  63  117:aload_0         
	//*  64  118:getfield        #37  <Field byte[] zzedi>
	//*  65  121:ifnull          134
			zzbfa1.zza(6, zzedi);
	//   66  124:aload_1         
	//   67  125:bipush          6
	//   68  127:aload_0         
	//   69  128:getfield        #37  <Field byte[] zzedi>
	//   70  131:invokevirtual   #101 <Method void zzbfa.zza(int, byte[])>
		super.zza(zzbfa1);
	//   71  134:aload_0         
	//   72  135:aload_1         
	//   73  136:invokespecial   #110 <Method void zzbfc.zza(zzbfa)>
	//   74  139:return          
	}

	protected final int zzr()
	{
		int j = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #113 <Method int zzbfc.zzr()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzedh != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #21  <Field zzbfs zzedh>
	//*   7   11:ifnull          25
			i = j + zzbfa.zzb(1, ((zzbfi) (zzedh)));
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #21  <Field zzbfs zzedh>
	//   12   20:invokestatic    #116 <Method int zzbfa.zzb(int, zzbfi)>
	//   13   23:iadd            
	//   14   24:istore_1        
		j = i;
	//   15   25:iload_1         
	//   16   26:istore_2        
		if(zzeda != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #29  <Field zzbfo[] zzeda>
	//*  19   31:ifnull          90
		{
			j = i;
	//   20   34:iload_1         
	//   21   35:istore_2        
			if(zzeda.length > 0)
	//*  22   36:aload_0         
	//*  23   37:getfield        #29  <Field zzbfo[] zzeda>
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
	//   32   50:getfield        #29  <Field zzbfo[] zzeda>
	//   33   53:arraylength     
	//   34   54:icmpge          90
					zzbfo zzbfo1 = zzeda[k];
	//   35   57:aload_0         
	//   36   58:getfield        #29  <Field zzbfo[] zzeda>
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
	//   47   76:invokestatic    #116 <Method int zzbfa.zzb(int, zzbfi)>
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
	//*  60   93:getfield        #31  <Field byte[] zzedb>
	//*  61   96:ifnull          110
			i = j + zzbfa.zzb(3, zzedb);
	//   62   99:iload_2         
	//   63  100:iconst_3        
	//   64  101:aload_0         
	//   65  102:getfield        #31  <Field byte[] zzedb>
	//   66  105:invokestatic    #119 <Method int zzbfa.zzb(int, byte[])>
	//   67  108:iadd            
	//   68  109:istore_1        
		j = i;
	//   69  110:iload_1         
	//   70  111:istore_2        
		if(zzedc != null)
	//*  71  112:aload_0         
	//*  72  113:getfield        #33  <Field byte[] zzedc>
	//*  73  116:ifnull          130
			j = i + zzbfa.zzb(4, zzedc);
	//   74  119:iload_1         
	//   75  120:iconst_4        
	//   76  121:aload_0         
	//   77  122:getfield        #33  <Field byte[] zzedc>
	//   78  125:invokestatic    #119 <Method int zzbfa.zzb(int, byte[])>
	//   79  128:iadd            
	//   80  129:istore_2        
		i = j;
	//   81  130:iload_2         
	//   82  131:istore_1        
		if(zzedd != null)
	//*  83  132:aload_0         
	//*  84  133:getfield        #35  <Field Integer zzedd>
	//*  85  136:ifnull          153
			i = j + zzbfa.zzq(5, zzedd.intValue());
	//   86  139:iload_2         
	//   87  140:iconst_5        
	//   88  141:aload_0         
	//   89  142:getfield        #35  <Field Integer zzedd>
	//   90  145:invokevirtual   #104 <Method int Integer.intValue()>
	//   91  148:invokestatic    #123 <Method int zzbfa.zzq(int, int)>
	//   92  151:iadd            
	//   93  152:istore_1        
		j = i;
	//   94  153:iload_1         
	//   95  154:istore_2        
		if(zzedi != null)
	//*  96  155:aload_0         
	//*  97  156:getfield        #37  <Field byte[] zzedi>
	//*  98  159:ifnull          174
			j = i + zzbfa.zzb(6, zzedi);
	//   99  162:iload_1         
	//  100  163:bipush          6
	//  101  165:aload_0         
	//  102  166:getfield        #37  <Field byte[] zzedi>
	//  103  169:invokestatic    #119 <Method int zzbfa.zzb(int, byte[])>
	//  104  172:iadd            
	//  105  173:istore_2        
		return j;
	//  106  174:iload_2         
	//  107  175:ireturn         
	}

	private zzbfo zzeda[];
	private byte zzedb[];
	private byte zzedc[];
	private Integer zzedd;
	private zzbfs zzedh;
	private byte zzedi[];
}
