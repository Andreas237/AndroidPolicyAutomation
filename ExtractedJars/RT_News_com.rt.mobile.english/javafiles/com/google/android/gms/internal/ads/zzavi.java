// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzawk, zzawy, zzaxa

final class zzavi
{

	static final int zzdhz[];
	static final int zzdia[];
	static final int zzdib[];

	static 
	{
		zzdib = new int[zzawk.values().length];
	//    0    0:invokestatic    #18  <Method zzawk[] zzawk.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] zzdib>
		try
		{
			zzdib[zzawk.zzdjd.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] zzdib>
	//    5   12:getstatic       #24  <Field zzawk zzawk.zzdjd>
	//    6   15:invokevirtual   #28  <Method int zzawk.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] zzdib>
	//*  10   23:getstatic       #31  <Field zzawk zzawk.zzdje>
	//*  11   26:invokevirtual   #28  <Method int zzawk.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:invokestatic    #36  <Method zzawy[] zzawy.values()>
	//*  15   34:arraylength     
	//*  16   35:newarray        int[]
	//*  17   37:putstatic       #38  <Field int[] zzdia>
	//*  18   40:getstatic       #38  <Field int[] zzdia>
	//*  19   43:getstatic       #42  <Field zzawy zzawy.zzdka>
	//*  20   46:invokevirtual   #43  <Method int zzawy.ordinal()>
	//*  21   49:iconst_1        
	//*  22   50:iastore         
	//*  23   51:getstatic       #38  <Field int[] zzdia>
	//*  24   54:getstatic       #46  <Field zzawy zzawy.zzdkb>
	//*  25   57:invokevirtual   #43  <Method int zzawy.ordinal()>
	//*  26   60:iconst_2        
	//*  27   61:iastore         
	//*  28   62:getstatic       #38  <Field int[] zzdia>
	//*  29   65:getstatic       #49  <Field zzawy zzawy.zzdkc>
	//*  30   68:invokevirtual   #43  <Method int zzawy.ordinal()>
	//*  31   71:iconst_3        
	//*  32   72:iastore         
	//*  33   73:invokestatic    #54  <Method zzaxa[] zzaxa.values()>
	//*  34   76:arraylength     
	//*  35   77:newarray        int[]
	//*  36   79:putstatic       #56  <Field int[] zzdhz>
	//*  37   82:getstatic       #56  <Field int[] zzdhz>
	//*  38   85:getstatic       #60  <Field zzaxa zzaxa.zzdkg>
	//*  39   88:invokevirtual   #61  <Method int zzaxa.ordinal()>
	//*  40   91:iconst_1        
	//*  41   92:iastore         
	//*  42   93:getstatic       #56  <Field int[] zzdhz>
	//*  43   96:getstatic       #64  <Field zzaxa zzaxa.zzdki>
	//*  44   99:invokevirtual   #61  <Method int zzaxa.ordinal()>
	//*  45  102:iconst_2        
	//*  46  103:iastore         
	//*  47  104:getstatic       #56  <Field int[] zzdhz>
	//*  48  107:getstatic       #67  <Field zzaxa zzaxa.zzdkj>
	//*  49  110:invokevirtual   #61  <Method int zzaxa.ordinal()>
	//*  50  113:iconst_3        
	//*  51  114:iastore         
	//*  52  115:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   53  116:astore_0        
		try
		{
			zzdib[zzawk.zzdje.ordinal()] = 2;
		}
	//*  54  117:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   55  120:astore_0        
		zzdia = new int[zzawy.values().length];
		try
		{
			zzdia[zzawy.zzdka.ordinal()] = 1;
		}
	//*  56  121:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   57  124:astore_0        
		try
		{
			zzdia[zzawy.zzdkb.ordinal()] = 2;
		}
	//*  58  125:goto            51
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   59  128:astore_0        
		try
		{
			zzdia[zzawy.zzdkc.ordinal()] = 3;
		}
	//*  60  129:goto            62
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   61  132:astore_0        
		zzdhz = new int[zzaxa.values().length];
		try
		{
			zzdhz[zzaxa.zzdkg.ordinal()] = 1;
		}
	//*  62  133:goto            73
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   63  136:astore_0        
		try
		{
			zzdhz[zzaxa.zzdki.ordinal()] = 2;
		}
	//*  64  137:goto            93
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   65  140:astore_0        
		try
		{
			zzdhz[zzaxa.zzdkj.ordinal()] = 3;
		}
	//*  66  141:goto            104
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   67  144:astore_0        
	//*  68  145:return          
	}
}
