// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzua, zznk, zzkb, zzni

final class zzud
{

	private static int zzb(long l, int i)
	{
		return (int)(l >>> 4 * (i % 16) & 15L);
	//    0    0:lload_0         
	//    1    1:iconst_4        
	//    2    2:iload_2         
	//    3    3:bipush          16
	//    4    5:irem            
	//    5    6:imul            
	//    6    7:lushr           
	//    7    8:ldc2w           #75  <Long 15L>
	//    8   11:land            
	//    9   12:l2i             
	//   10   13:ireturn         
	}

	static boolean zzlv()
	{
		int j1 = zzbpe.zzlr();
	//    0    0:getstatic       #23  <Field zzua zzbpe>
	//    1    3:invokevirtual   #83  <Method int zzua.zzlr()>
	//    2    6:istore          4
		int k1 = zzbpe.zzls();
	//    3    8:getstatic       #23  <Field zzua zzbpe>
	//    4   11:invokevirtual   #86  <Method int zzua.zzls()>
	//    5   14:istore          5
		int l = zzbpe.zzlq();
	//    6   16:getstatic       #23  <Field zzua zzbpe>
	//    7   19:invokevirtual   #89  <Method int zzua.zzlq()>
	//    8   22:istore_2        
		int i1 = zzbpe.zzlp();
	//    9   23:getstatic       #23  <Field zzua zzbpe>
	//   10   26:invokevirtual   #92  <Method int zzua.zzlp()>
	//   11   29:istore_3        
		int k = 0x7fffffff;
	//   12   30:ldc1            #93  <Int 0x7fffffff>
	//   13   32:istore_1        
		int i;
		if(j1 < 16 && zzbpi != 0L)
	//*  14   33:iload           4
	//*  15   35:bipush          16
	//*  16   37:icmpge          60
	//*  17   40:getstatic       #70  <Field long zzbpi>
	//*  18   43:lconst_0        
	//*  19   44:lcmp            
	//*  20   45:ifeq            60
			i = zzb(zzbpi, j1);
	//   21   48:getstatic       #70  <Field long zzbpi>
	//   22   51:iload           4
	//   23   53:invokestatic    #95  <Method int zzb(long, int)>
	//   24   56:istore_0        
		else
	//*  25   57:goto            85
		if(zzbph != 0.0F)
	//*  26   60:getstatic       #65  <Field float zzbph>
	//*  27   63:fconst_0        
	//*  28   64:fcmpl           
	//*  29   65:ifeq            82
			i = (int)(zzbph * (float)j1) + 1;
	//   30   68:getstatic       #65  <Field float zzbph>
	//   31   71:iload           4
	//   32   73:i2f             
	//   33   74:fmul            
	//   34   75:f2i             
	//   35   76:iconst_1        
	//   36   77:iadd            
	//   37   78:istore_0        
		else
	//*  38   79:goto            85
			i = 0x7fffffff;
	//   39   82:ldc1            #93  <Int 0x7fffffff>
	//   40   84:istore_0        
		if(k1 <= i)
	//*  41   85:iload           5
	//*  42   87:iload_0         
	//*  43   88:icmpgt          146
		{
			int j;
			if(j1 < 16 && zzbpg != 0L)
	//*  44   91:iload           4
	//*  45   93:bipush          16
	//*  46   95:icmpge          118
	//*  47   98:getstatic       #60  <Field long zzbpg>
	//*  48  101:lconst_0        
	//*  49  102:lcmp            
	//*  50  103:ifeq            118
			{
				j = zzb(zzbpg, j1);
	//   51  106:getstatic       #60  <Field long zzbpg>
	//   52  109:iload           4
	//   53  111:invokestatic    #95  <Method int zzb(long, int)>
	//   54  114:istore_0        
			} else
	//*  55  115:goto            137
			{
				j = k;
	//   56  118:iload_1         
	//   57  119:istore_0        
				if(zzbpf != 0.0F)
	//*  58  120:getstatic       #49  <Field float zzbpf>
	//*  59  123:fconst_0        
	//*  60  124:fcmpl           
	//*  61  125:ifeq            137
					j = (int)(zzbpf * (float)j1);
	//   62  128:getstatic       #49  <Field float zzbpf>
	//   63  131:iload           4
	//   64  133:i2f             
	//   65  134:fmul            
	//   66  135:f2i             
	//   67  136:istore_0        
			}
			if(l + i1 <= j)
	//*  68  137:iload_2         
	//*  69  138:iload_3         
	//*  70  139:iadd            
	//*  71  140:iload_0         
	//*  72  141:icmpgt          146
				return true;
	//   73  144:iconst_1        
	//   74  145:ireturn         
		}
		return false;
	//   75  146:iconst_0        
	//   76  147:ireturn         
	}

	private static final zzua zzbpe = zzua.zzlk();
	private static final float zzbpf;
	private static final long zzbpg;
	private static final float zzbph;
	private static final long zzbpi;

	static 
	{
	//    0    0:invokestatic    #21  <Method zzua zzua.zzlk()>
	//    1    3:putstatic       #23  <Field zzua zzbpe>
		zzna zzna = zznk.zzazk;
	//    2    6:getstatic       #29  <Field zzna zznk.zzazk>
	//    3    9:astore_0        
		zzbpf = ((Float)zzkb.zzik().zzd(zzna)).floatValue();
	//    4   10:invokestatic    #35  <Method zzni zzkb.zzik()>
	//    5   13:aload_0         
	//    6   14:invokevirtual   #41  <Method Object zzni.zzd(zzna)>
	//    7   17:checkcast       #43  <Class Float>
	//    8   20:invokevirtual   #47  <Method float Float.floatValue()>
	//    9   23:putstatic       #49  <Field float zzbpf>
		zzna = zznk.zzazi;
	//   10   26:getstatic       #52  <Field zzna zznk.zzazi>
	//   11   29:astore_0        
		zzbpg = ((Long)zzkb.zzik().zzd(zzna)).longValue();
	//   12   30:invokestatic    #35  <Method zzni zzkb.zzik()>
	//   13   33:aload_0         
	//   14   34:invokevirtual   #41  <Method Object zzni.zzd(zzna)>
	//   15   37:checkcast       #54  <Class Long>
	//   16   40:invokevirtual   #58  <Method long Long.longValue()>
	//   17   43:putstatic       #60  <Field long zzbpg>
		zzna = zznk.zzazl;
	//   18   46:getstatic       #63  <Field zzna zznk.zzazl>
	//   19   49:astore_0        
		zzbph = ((Float)zzkb.zzik().zzd(zzna)).floatValue();
	//   20   50:invokestatic    #35  <Method zzni zzkb.zzik()>
	//   21   53:aload_0         
	//   22   54:invokevirtual   #41  <Method Object zzni.zzd(zzna)>
	//   23   57:checkcast       #43  <Class Float>
	//   24   60:invokevirtual   #47  <Method float Float.floatValue()>
	//   25   63:putstatic       #65  <Field float zzbph>
		zzna = zznk.zzazj;
	//   26   66:getstatic       #68  <Field zzna zznk.zzazj>
	//   27   69:astore_0        
		zzbpi = ((Long)zzkb.zzik().zzd(zzna)).longValue();
	//   28   70:invokestatic    #35  <Method zzni zzkb.zzik()>
	//   29   73:aload_0         
	//   30   74:invokevirtual   #41  <Method Object zzni.zzd(zzna)>
	//   31   77:checkcast       #54  <Class Long>
	//   32   80:invokevirtual   #58  <Method long Long.longValue()>
	//   33   83:putstatic       #70  <Field long zzbpi>
	//*  34   86:return          
	}
}
