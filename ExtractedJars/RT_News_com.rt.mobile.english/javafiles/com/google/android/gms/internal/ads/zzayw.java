// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class zzayw extends Enum
{

	private zzayw(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #28  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static zzayw[] values()
	{
		return (zzayw[])((zzayw []) (zzdnu)).clone();
	//    0    0:getstatic       #26  <Field zzayw[] zzdnu>
	//    1    3:invokevirtual   #36  <Method Object _5B_Lcom.google.android.gms.internal.ads.zzayw_3B_.clone()>
	//    2    6:checkcast       #32  <Class zzayw[]>
	//    3    9:areturn         
	}

	public static final zzayw zzdns;
	public static final zzayw zzdnt;
	private static final zzayw zzdnu[];

	static 
	{
		zzdns = new zzayw("UNCOMPRESSED", 0);
	//    0    0:new             #2   <Class zzayw>
	//    1    3:dup             
	//    2    4:ldc1            #14  <String "UNCOMPRESSED">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #18  <Method void zzayw(String, int)>
	//    5   10:putstatic       #20  <Field zzayw zzdns>
		zzdnt = new zzayw("COMPRESSED", 1);
	//    6   13:new             #2   <Class zzayw>
	//    7   16:dup             
	//    8   17:ldc1            #22  <String "COMPRESSED">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #18  <Method void zzayw(String, int)>
	//   11   23:putstatic       #24  <Field zzayw zzdnt>
		zzdnu = (new zzayw[] {
			zzdns, zzdnt
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       zzayw[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #20  <Field zzayw zzdns>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #24  <Field zzayw zzdnt>
	//   21   41:aastore         
	//   22   42:putstatic       #26  <Field zzayw[] zzdnu>
	//*  23   45:return          
	}
}
