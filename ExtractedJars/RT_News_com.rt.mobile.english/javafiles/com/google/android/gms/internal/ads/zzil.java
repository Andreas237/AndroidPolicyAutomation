// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzir, zzbez, zzis, 
//			zzia, zzbfl, zzij, zzbfa, 
//			zzbfi

public final class zzil extends zzbfc
{

	public zzil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void zzbfc()>
		zzanv = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field zzij zzanv>
		zzanw = zzir.zzhs();
	//    5    9:aload_0         
	//    6   10:invokestatic    #25  <Method zzir[] zzir.zzhs()>
	//    7   13:putfield        #27  <Field zzir[] zzanw>
		zzanu = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #29  <Field Integer zzanu>
		zzant = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #31  <Field zzis zzant>
		zzebk = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #35  <Field zzbfe zzebk>
		zzebt = -1;
	//   17   31:aload_0         
	//   18   32:iconst_m1       
	//   19   33:putfield        #39  <Field int zzebt>
	//   20   36:return          
	}

	private final zzil zzn(zzbez zzbez1)
		throws IOException
	{
		IllegalArgumentException illegalargumentexception;
		do
		{
			int i = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #52  <Method int zzbez.zzabk()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            262
			Object obj;
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          229
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          108
				{
					if(i != 24)
	//*  11   21:iload_2         
	//*  12   22:bipush          24
	//*  13   24:icmpeq          71
					{
						if(i != 34)
	//*  14   27:iload_2         
	//*  15   28:bipush          34
	//*  16   30:icmpeq          44
						{
							if(!super.zza(zzbez1, i))
	//*  17   33:aload_0         
	//*  18   34:aload_1         
	//*  19   35:iload_2         
	//*  20   36:invokespecial   #56  <Method boolean zzbfc.zza(zzbez, int)>
	//*  21   39:ifne            0
								return this;
	//   22   42:aload_0         
	//   23   43:areturn         
							continue;
						}
						if(zzant == null)
	//*  24   44:aload_0         
	//*  25   45:getfield        #31  <Field zzis zzant>
	//*  26   48:ifnonnull       62
							zzant = new zzis();
	//   27   51:aload_0         
	//   28   52:new             #58  <Class zzis>
	//   29   55:dup             
	//   30   56:invokespecial   #59  <Method void zzis()>
	//   31   59:putfield        #31  <Field zzis zzant>
						obj = ((Object) (zzant));
	//   32   62:aload_0         
	//   33   63:getfield        #31  <Field zzis zzant>
	//   34   66:astore          4
					} else
	//*  35   68:goto            253
					{
						int k = zzbez1.getPosition();
	//   36   71:aload_1         
	//   37   72:invokevirtual   #62  <Method int zzbez.getPosition()>
	//   38   75:istore_3        
						try
						{
							zzanu = Integer.valueOf(zzia.zzd(zzbez1.zzacc()));
	//   39   76:aload_0         
	//   40   77:aload_1         
	//   41   78:invokevirtual   #65  <Method int zzbez.zzacc()>
	//   42   81:invokestatic    #71  <Method int zzia.zzd(int)>
	//   43   84:invokestatic    #77  <Method Integer Integer.valueOf(int)>
	//   44   87:putfield        #29  <Field Integer zzanu>
						}
	//*  45   90:goto            0
	//*  46   93:aload_1         
	//*  47   94:iload_3         
	//*  48   95:invokevirtual   #81  <Method void zzbez.zzdc(int)>
	//*  49   98:aload_0         
	//*  50   99:aload_1         
	//*  51  100:iload_2         
	//*  52  101:invokevirtual   #56  <Method boolean zzbfc.zza(zzbez, int)>
	//*  53  104:pop             
	//*  54  105:goto            0
	//*  55  108:aload_1         
	//*  56  109:bipush          18
	//*  57  111:invokestatic    #87  <Method int zzbfl.zzb(zzbez, int)>
	//*  58  114:istore_3        
	//*  59  115:aload_0         
	//*  60  116:getfield        #27  <Field zzir[] zzanw>
	//*  61  119:ifnonnull       127
	//*  62  122:iconst_0        
	//*  63  123:istore_2        
	//*  64  124:goto            133
	//*  65  127:aload_0         
	//*  66  128:getfield        #27  <Field zzir[] zzanw>
	//*  67  131:arraylength     
	//*  68  132:istore_2        
	//*  69  133:iload_3         
	//*  70  134:iload_2         
	//*  71  135:iadd            
	//*  72  136:anewarray       zzir[]
	//*  73  139:astore          4
	//*  74  141:iload_2         
	//*  75  142:istore_3        
	//*  76  143:iload_2         
	//*  77  144:ifeq            161
	//*  78  147:aload_0         
	//*  79  148:getfield        #27  <Field zzir[] zzanw>
	//*  80  151:iconst_0        
	//*  81  152:aload           4
	//*  82  154:iconst_0        
	//*  83  155:iload_2         
	//*  84  156:invokestatic    #93  <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  85  159:iload_2         
	//*  86  160:istore_3        
	//*  87  161:iload_3         
	//*  88  162:aload           4
	//*  89  164:arraylength     
	//*  90  165:iconst_1        
	//*  91  166:isub            
	//*  92  167:icmpge          201
	//*  93  170:aload           4
	//*  94  172:iload_3         
	//*  95  173:new             #21  <Class zzir>
	//*  96  176:dup             
	//*  97  177:invokespecial   #94  <Method void zzir()>
	//*  98  180:aastore         
	//*  99  181:aload_1         
	//* 100  182:aload           4
	//* 101  184:iload_3         
	//* 102  185:aaload          
	//* 103  186:invokevirtual   #97  <Method void zzbez.zza(zzbfi)>
	//* 104  189:aload_1         
	//* 105  190:invokevirtual   #52  <Method int zzbez.zzabk()>
	//* 106  193:pop             
	//* 107  194:iload_3         
	//* 108  195:iconst_1        
	//* 109  196:iadd            
	//* 110  197:istore_3        
	//* 111  198:goto            161
	//* 112  201:aload           4
	//* 113  203:iload_3         
	//* 114  204:new             #21  <Class zzir>
	//* 115  207:dup             
	//* 116  208:invokespecial   #94  <Method void zzir()>
	//* 117  211:aastore         
	//* 118  212:aload_1         
	//* 119  213:aload           4
	//* 120  215:iload_3         
	//* 121  216:aaload          
	//* 122  217:invokevirtual   #97  <Method void zzbez.zza(zzbfi)>
	//* 123  220:aload_0         
	//* 124  221:aload           4
	//* 125  223:putfield        #27  <Field zzir[] zzanw>
	//* 126  226:goto            0
	//* 127  229:aload_0         
	//* 128  230:getfield        #19  <Field zzij zzanv>
	//* 129  233:ifnonnull       247
	//* 130  236:aload_0         
	//* 131  237:new             #99  <Class zzij>
	//* 132  240:dup             
	//* 133  241:invokespecial   #100 <Method void zzij()>
	//* 134  244:putfield        #19  <Field zzij zzanv>
	//* 135  247:aload_0         
	//* 136  248:getfield        #19  <Field zzij zzanv>
	//* 137  251:astore          4
	//* 138  253:aload_1         
	//* 139  254:aload           4
	//* 140  256:invokevirtual   #97  <Method void zzbez.zza(zzbfi)>
	//* 141  259:goto            0
	//* 142  262:aload_0         
	//* 143  263:areturn         
						// Misplaced declaration of an exception variable
						catch(IllegalArgumentException illegalargumentexception)
						{
							zzbez1.zzdc(k);
							((zzbfc)this).zza(zzbez1, i);
						}
						continue;
					}
				} else
				{
					int l = zzbfl.zzb(zzbez1, 18);
					int j;
					if(zzanw == null)
						j = 0;
					else
						j = zzanw.length;
					obj = ((Object) (new zzir[l + j]));
					l = j;
					if(j != 0)
					{
						System.arraycopy(((Object) (zzanw)), 0, obj, 0, j);
						l = j;
					}
					for(; l < obj.length - 1; l++)
					{
						obj[l] = ((/*<invalid signature>*/java.lang.Object) (new zzir()));
						zzbez1.zza(((zzbfi) (obj[l])));
						zzbez1.zzabk();
					}

					obj[l] = ((/*<invalid signature>*/java.lang.Object) (new zzir()));
					zzbez1.zza(((zzbfi) (obj[l])));
					zzanw = ((zzir []) (obj));
					continue;
				}
			} else
			{
				if(zzanv == null)
					zzanv = new zzij();
				obj = ((Object) (zzanv));
			}
			zzbez1.zza(((zzbfi) (obj)));
		} while(true);
		return this;
	//* 144  264:astore          4
	//* 145  266:goto            93
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		return ((zzbfi) (zzn(zzbez1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #104 <Method zzil zzn(zzbez)>
	//    3    5:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzanv != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field zzij zzanv>
	//*   2    4:ifnull          16
			zzbfa1.zza(1, ((zzbfi) (zzanv)));
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field zzij zzanv>
	//    7   13:invokevirtual   #110 <Method void zzbfa.zza(int, zzbfi)>
		if(zzanw != null && zzanw.length > 0)
	//*   8   16:aload_0         
	//*   9   17:getfield        #27  <Field zzir[] zzanw>
	//*  10   20:ifnull          66
	//*  11   23:aload_0         
	//*  12   24:getfield        #27  <Field zzir[] zzanw>
	//*  13   27:arraylength     
	//*  14   28:ifle            66
		{
			for(int i = 0; i < zzanw.length; i++)
	//*  15   31:iconst_0        
	//*  16   32:istore_2        
	//*  17   33:iload_2         
	//*  18   34:aload_0         
	//*  19   35:getfield        #27  <Field zzir[] zzanw>
	//*  20   38:arraylength     
	//*  21   39:icmpge          66
			{
				zzir zzir1 = zzanw[i];
	//   22   42:aload_0         
	//   23   43:getfield        #27  <Field zzir[] zzanw>
	//   24   46:iload_2         
	//   25   47:aaload          
	//   26   48:astore_3        
				if(zzir1 != null)
	//*  27   49:aload_3         
	//*  28   50:ifnull          59
					zzbfa1.zza(2, ((zzbfi) (zzir1)));
	//   29   53:aload_1         
	//   30   54:iconst_2        
	//   31   55:aload_3         
	//   32   56:invokevirtual   #110 <Method void zzbfa.zza(int, zzbfi)>
			}

	//   33   59:iload_2         
	//   34   60:iconst_1        
	//   35   61:iadd            
	//   36   62:istore_2        
		}
	//*  37   63:goto            33
		if(zzanu != null)
	//*  38   66:aload_0         
	//*  39   67:getfield        #29  <Field Integer zzanu>
	//*  40   70:ifnull          85
			zzbfa1.zzm(3, zzanu.intValue());
	//   41   73:aload_1         
	//   42   74:iconst_3        
	//   43   75:aload_0         
	//   44   76:getfield        #29  <Field Integer zzanu>
	//   45   79:invokevirtual   #113 <Method int Integer.intValue()>
	//   46   82:invokevirtual   #117 <Method void zzbfa.zzm(int, int)>
		if(zzant != null)
	//*  47   85:aload_0         
	//*  48   86:getfield        #31  <Field zzis zzant>
	//*  49   89:ifnull          101
			zzbfa1.zza(4, ((zzbfi) (zzant)));
	//   50   92:aload_1         
	//   51   93:iconst_4        
	//   52   94:aload_0         
	//   53   95:getfield        #31  <Field zzis zzant>
	//   54   98:invokevirtual   #110 <Method void zzbfa.zza(int, zzbfi)>
		super.zza(zzbfa1);
	//   55  101:aload_0         
	//   56  102:aload_1         
	//   57  103:invokespecial   #119 <Method void zzbfc.zza(zzbfa)>
	//   58  106:return          
	}

	protected final int zzr()
	{
		int j = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #122 <Method int zzbfc.zzr()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzanv != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #19  <Field zzij zzanv>
	//*   7   11:ifnull          25
			i = j + zzbfa.zzb(1, ((zzbfi) (zzanv)));
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #19  <Field zzij zzanv>
	//   12   20:invokestatic    #125 <Method int zzbfa.zzb(int, zzbfi)>
	//   13   23:iadd            
	//   14   24:istore_1        
		j = i;
	//   15   25:iload_1         
	//   16   26:istore_2        
		if(zzanw != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #27  <Field zzir[] zzanw>
	//*  19   31:ifnull          90
		{
			j = i;
	//   20   34:iload_1         
	//   21   35:istore_2        
			if(zzanw.length > 0)
	//*  22   36:aload_0         
	//*  23   37:getfield        #27  <Field zzir[] zzanw>
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
					if(k >= zzanw.length)
						break;
	//   30   48:iload_3         
	//   31   49:aload_0         
	//   32   50:getfield        #27  <Field zzir[] zzanw>
	//   33   53:arraylength     
	//   34   54:icmpge          90
					zzir zzir1 = zzanw[k];
	//   35   57:aload_0         
	//   36   58:getfield        #27  <Field zzir[] zzanw>
	//   37   61:iload_3         
	//   38   62:aaload          
	//   39   63:astore          4
					j = i;
	//   40   65:iload_1         
	//   41   66:istore_2        
					if(zzir1 != null)
	//*  42   67:aload           4
	//*  43   69:ifnull          81
						j = i + zzbfa.zzb(2, ((zzbfi) (zzir1)));
	//   44   72:iload_1         
	//   45   73:iconst_2        
	//   46   74:aload           4
	//   47   76:invokestatic    #125 <Method int zzbfa.zzb(int, zzbfi)>
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
		if(zzanu != null)
	//*  59   92:aload_0         
	//*  60   93:getfield        #29  <Field Integer zzanu>
	//*  61   96:ifnull          113
			i = j + zzbfa.zzq(3, zzanu.intValue());
	//   62   99:iload_2         
	//   63  100:iconst_3        
	//   64  101:aload_0         
	//   65  102:getfield        #29  <Field Integer zzanu>
	//   66  105:invokevirtual   #113 <Method int Integer.intValue()>
	//   67  108:invokestatic    #129 <Method int zzbfa.zzq(int, int)>
	//   68  111:iadd            
	//   69  112:istore_1        
		j = i;
	//   70  113:iload_1         
	//   71  114:istore_2        
		if(zzant != null)
	//*  72  115:aload_0         
	//*  73  116:getfield        #31  <Field zzis zzant>
	//*  74  119:ifnull          133
			j = i + zzbfa.zzb(4, ((zzbfi) (zzant)));
	//   75  122:iload_1         
	//   76  123:iconst_4        
	//   77  124:aload_0         
	//   78  125:getfield        #31  <Field zzis zzant>
	//   79  128:invokestatic    #125 <Method int zzbfa.zzb(int, zzbfi)>
	//   80  131:iadd            
	//   81  132:istore_2        
		return j;
	//   82  133:iload_2         
	//   83  134:ireturn         
	}

	private zzis zzant;
	private Integer zzanu;
	private zzij zzanv;
	private zzir zzanw[];
}
