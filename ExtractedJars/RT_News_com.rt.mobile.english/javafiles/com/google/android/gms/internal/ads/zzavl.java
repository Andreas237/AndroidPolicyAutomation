// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaxa

final class zzavl
{

	static final int zzdhz[];

	static 
	{
		zzdhz = new int[zzaxa.values().length];
	//    0    0:invokestatic    #16  <Method zzaxa[] zzaxa.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #18  <Field int[] zzdhz>
		try
		{
			zzdhz[zzaxa.zzdkg.ordinal()] = 1;
	//    4    9:getstatic       #18  <Field int[] zzdhz>
	//    5   12:getstatic       #22  <Field zzaxa zzaxa.zzdkg>
	//    6   15:invokevirtual   #26  <Method int zzaxa.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #18  <Field int[] zzdhz>
	//*  10   23:getstatic       #29  <Field zzaxa zzaxa.zzdki>
	//*  11   26:invokevirtual   #26  <Method int zzaxa.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #18  <Field int[] zzdhz>
	//*  15   34:getstatic       #32  <Field zzaxa zzaxa.zzdkj>
	//*  16   37:invokevirtual   #26  <Method int zzaxa.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   20   43:astore_0        
		try
		{
			zzdhz[zzaxa.zzdki.ordinal()] = 2;
		}
	//*  21   44:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   22   47:astore_0        
		try
		{
			zzdhz[zzaxa.zzdkj.ordinal()] = 3;
		}
	//*  23   48:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   51:astore_0        
	//*  25   52:return          
	}
}
