// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzayv, zzayw

final class zzayu
{

	static final int zzdnm[];
	static final int zzdnn[];

	static 
	{
		zzdnn = new int[zzayv.values().length];
	//    0    0:invokestatic    #17  <Method zzayv[] zzayv.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #19  <Field int[] zzdnn>
		try
		{
			zzdnn[zzayv.zzdno.ordinal()] = 1;
	//    4    9:getstatic       #19  <Field int[] zzdnn>
	//    5   12:getstatic       #23  <Field zzayv zzayv.zzdno>
	//    6   15:invokevirtual   #27  <Method int zzayv.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #19  <Field int[] zzdnn>
	//*  10   23:getstatic       #30  <Field zzayv zzayv.zzdnp>
	//*  11   26:invokevirtual   #27  <Method int zzayv.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #19  <Field int[] zzdnn>
	//*  15   34:getstatic       #33  <Field zzayv zzayv.zzdnq>
	//*  16   37:invokevirtual   #27  <Method int zzayv.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:invokestatic    #38  <Method zzayw[] zzayw.values()>
	//*  20   45:arraylength     
	//*  21   46:newarray        int[]
	//*  22   48:putstatic       #40  <Field int[] zzdnm>
	//*  23   51:getstatic       #40  <Field int[] zzdnm>
	//*  24   54:getstatic       #44  <Field zzayw zzayw.zzdns>
	//*  25   57:invokevirtual   #45  <Method int zzayw.ordinal()>
	//*  26   60:iconst_1        
	//*  27   61:iastore         
	//*  28   62:getstatic       #40  <Field int[] zzdnm>
	//*  29   65:getstatic       #48  <Field zzayw zzayw.zzdnt>
	//*  30   68:invokevirtual   #45  <Method int zzayw.ordinal()>
	//*  31   71:iconst_2        
	//*  32   72:iastore         
	//*  33   73:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   34   74:astore_0        
		try
		{
			zzdnn[zzayv.zzdnp.ordinal()] = 2;
		}
	//*  35   75:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   36   78:astore_0        
		try
		{
			zzdnn[zzayv.zzdnq.ordinal()] = 3;
		}
	//*  37   79:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   38   82:astore_0        
		zzdnm = new int[zzayw.values().length];
		try
		{
			zzdnm[zzayw.zzdns.ordinal()] = 1;
		}
	//*  39   83:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   40   86:astore_0        
		try
		{
			zzdnm[zzayw.zzdnt.ordinal()] = 2;
		}
	//*  41   87:goto            62
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   42   90:astore_0        
	//*  43   91:return          
	}
}
