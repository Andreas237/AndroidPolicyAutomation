// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbw, zzbbl

final class zzbbk
{

	static final int zzdti[];
	static final int zzdtj[];

	static 
	{
		zzdtj = new int[zzbbw.values().length];
	//    0    0:invokestatic    #17  <Method zzbbw[] zzbbw.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #19  <Field int[] zzdtj>
		try
		{
			zzdtj[zzbbw.zzdvb.ordinal()] = 1;
	//    4    9:getstatic       #19  <Field int[] zzdtj>
	//    5   12:getstatic       #23  <Field zzbbw zzbbw.zzdvb>
	//    6   15:invokevirtual   #27  <Method int zzbbw.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #19  <Field int[] zzdtj>
	//*  10   23:getstatic       #30  <Field zzbbw zzbbw.zzdvd>
	//*  11   26:invokevirtual   #27  <Method int zzbbw.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #19  <Field int[] zzdtj>
	//*  15   34:getstatic       #33  <Field zzbbw zzbbw.zzdva>
	//*  16   37:invokevirtual   #27  <Method int zzbbw.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:invokestatic    #38  <Method zzbbl[] zzbbl.values()>
	//*  20   45:arraylength     
	//*  21   46:newarray        int[]
	//*  22   48:putstatic       #40  <Field int[] zzdti>
	//*  23   51:getstatic       #40  <Field int[] zzdti>
	//*  24   54:getstatic       #44  <Field zzbbl zzbbl.zzdtn>
	//*  25   57:invokevirtual   #45  <Method int zzbbl.ordinal()>
	//*  26   60:iconst_1        
	//*  27   61:iastore         
	//*  28   62:getstatic       #40  <Field int[] zzdti>
	//*  29   65:getstatic       #48  <Field zzbbl zzbbl.zzdtl>
	//*  30   68:invokevirtual   #45  <Method int zzbbl.ordinal()>
	//*  31   71:iconst_2        
	//*  32   72:iastore         
	//*  33   73:getstatic       #40  <Field int[] zzdti>
	//*  34   76:getstatic       #51  <Field zzbbl zzbbl.zzdtk>
	//*  35   79:invokevirtual   #45  <Method int zzbbl.ordinal()>
	//*  36   82:iconst_3        
	//*  37   83:iastore         
	//*  38   84:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   39   85:astore_0        
		try
		{
			zzdtj[zzbbw.zzdvd.ordinal()] = 2;
		}
	//*  40   86:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   41   89:astore_0        
		try
		{
			zzdtj[zzbbw.zzdva.ordinal()] = 3;
		}
	//*  42   90:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   43   93:astore_0        
		zzdti = new int[zzbbl.values().length];
		try
		{
			zzdti[zzbbl.zzdtn.ordinal()] = 1;
		}
	//*  44   94:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   45   97:astore_0        
		try
		{
			zzdti[zzbbl.zzdtl.ordinal()] = 2;
		}
	//*  46   98:goto            62
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   47  101:astore_0        
		try
		{
			zzdti[zzbbl.zzdtk.ordinal()] = 3;
		}
	//*  48  102:goto            73
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   49  105:astore_0        
	//*  50  106:return          
	}
}
