// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//			zzk

public static final class zzk$zza extends Enum
{

	public static zzk$zza[] values()
	{
		return (zzk$zza[])((zzk$zza []) (zzV)).clone();
	//    0    0:getstatic       #39  <Field zzk$zza[] zzV>
	//    1    3:invokevirtual   #49  <Method Object _5B_Lcom.google.android.gms.internal.zzk$zza_3B_.clone()>
	//    2    6:checkcast       #45  <Class zzk$zza[]>
	//    3    9:areturn         
	}

	public static final zzk$zza zzR;
	public static final zzk$zza zzS;
	public static final zzk$zza zzT;
	public static final zzk$zza zzU;
	private static final zzk$zza zzV[];

	static 
	{
		zzR = new zzk$zza("LOW", 0);
	//    0    0:new             #2   <Class zzk$zza>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "LOW">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void zzk$zza(String, int)>
	//    5   10:putstatic       #25  <Field zzk$zza zzR>
		zzS = new zzk$zza("NORMAL", 1);
	//    6   13:new             #2   <Class zzk$zza>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "NORMAL">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void zzk$zza(String, int)>
	//   11   23:putstatic       #29  <Field zzk$zza zzS>
		zzT = new zzk$zza("HIGH", 2);
	//   12   26:new             #2   <Class zzk$zza>
	//   13   29:dup             
	//   14   30:ldc1            #31  <String "HIGH">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void zzk$zza(String, int)>
	//   17   36:putstatic       #33  <Field zzk$zza zzT>
		zzU = new zzk$zza("IMMEDIATE", 3);
	//   18   39:new             #2   <Class zzk$zza>
	//   19   42:dup             
	//   20   43:ldc1            #35  <String "IMMEDIATE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void zzk$zza(String, int)>
	//   23   49:putstatic       #37  <Field zzk$zza zzU>
		zzV = (new zzk$zza[] {
			zzR, zzS, zzT, zzU
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       zzk$zza[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #25  <Field zzk$zza zzR>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #29  <Field zzk$zza zzS>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #33  <Field zzk$zza zzT>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #37  <Field zzk$zza zzU>
	//   41   79:aastore         
	//   42   80:putstatic       #39  <Field zzk$zza[] zzV>
	//*  43   83:return          
	}

	private zzk$zza(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
