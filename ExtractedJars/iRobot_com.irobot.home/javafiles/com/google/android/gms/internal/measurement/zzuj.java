// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzux, zzuk

final class zzuj
{

	static final int zzbxt[];
	static final int zzbxu[];

	static 
	{
		zzbxu = new int[zzux.values().length];
	//    0    0:invokestatic    #17  <Method zzux[] zzux.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #19  <Field int[] zzbxu>
		try
		{
			zzbxu[zzux.zzbzn.ordinal()] = 1;
	//    4    9:getstatic       #19  <Field int[] zzbxu>
	//    5   12:getstatic       #23  <Field zzux zzux.zzbzn>
	//    6   15:invokevirtual   #27  <Method int zzux.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #19  <Field int[] zzbxu>
	//*  10   23:getstatic       #30  <Field zzux zzux.zzbzp>
	//*  11   26:invokevirtual   #27  <Method int zzux.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #19  <Field int[] zzbxu>
	//*  15   34:getstatic       #33  <Field zzux zzux.zzbzm>
	//*  16   37:invokevirtual   #27  <Method int zzux.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:invokestatic    #38  <Method zzuk[] zzuk.values()>
	//*  20   45:arraylength     
	//*  21   46:newarray        int[]
	//*  22   48:putstatic       #40  <Field int[] zzbxt>
	//*  23   51:getstatic       #40  <Field int[] zzbxt>
	//*  24   54:getstatic       #44  <Field zzuk zzuk.zzbxy>
	//*  25   57:invokevirtual   #45  <Method int zzuk.ordinal()>
	//*  26   60:iconst_1        
	//*  27   61:iastore         
	//*  28   62:getstatic       #40  <Field int[] zzbxt>
	//*  29   65:getstatic       #48  <Field zzuk zzuk.zzbxw>
	//*  30   68:invokevirtual   #45  <Method int zzuk.ordinal()>
	//*  31   71:iconst_2        
	//*  32   72:iastore         
	//*  33   73:getstatic       #40  <Field int[] zzbxt>
	//*  34   76:getstatic       #51  <Field zzuk zzuk.zzbxv>
	//*  35   79:invokevirtual   #45  <Method int zzuk.ordinal()>
	//*  36   82:iconst_3        
	//*  37   83:iastore         
	//*  38   84:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   39   85:astore_0        
		try
		{
			zzbxu[zzux.zzbzp.ordinal()] = 2;
		}
	//*  40   86:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   41   89:astore_0        
		try
		{
			zzbxu[zzux.zzbzm.ordinal()] = 3;
		}
	//*  42   90:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   43   93:astore_0        
		zzbxt = new int[zzuk.values().length];
		try
		{
			zzbxt[zzuk.zzbxy.ordinal()] = 1;
		}
	//*  44   94:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   45   97:astore_0        
		try
		{
			zzbxt[zzuk.zzbxw.ordinal()] = 2;
		}
	//*  46   98:goto            62
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   47  101:astore_0        
		try
		{
			zzbxt[zzuk.zzbxv.ordinal()] = 3;
		}
	//*  48  102:goto            73
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   49  105:astore_0        
	//*  50  106:return          
	}
}
