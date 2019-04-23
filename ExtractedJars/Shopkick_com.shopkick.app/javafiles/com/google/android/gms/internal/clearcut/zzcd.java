// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


final class zzcd extends Enum
{

	private zzcd(String s, int i, boolean flag)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #42  <Method void Enum(String, int)>
		zzjk = flag;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #44  <Field boolean zzjk>
	//    7   11:return          
	}

	public static zzcd[] values()
	{
		return (zzcd[])((zzcd []) (zzjl)).clone();
	//    0    0:getstatic       #38  <Field zzcd[] zzjl>
	//    1    3:invokevirtual   #53  <Method Object _5B_Lcom.google.android.gms.internal.clearcut.zzcd_3B_.clone()>
	//    2    6:checkcast       #49  <Class zzcd[]>
	//    3    9:areturn         
	}

	public static final zzcd zzjg;
	public static final zzcd zzjh;
	public static final zzcd zzji;
	public static final zzcd zzjj;
	private static final zzcd zzjl[];
	private final boolean zzjk;

	static 
	{
		zzjg = new zzcd("SCALAR", 0, false);
	//    0    0:new             #2   <Class zzcd>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "SCALAR">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #22  <Method void zzcd(String, int, boolean)>
	//    6   11:putstatic       #24  <Field zzcd zzjg>
		zzjh = new zzcd("VECTOR", 1, true);
	//    7   14:new             #2   <Class zzcd>
	//    8   17:dup             
	//    9   18:ldc1            #26  <String "VECTOR">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #22  <Method void zzcd(String, int, boolean)>
	//   13   25:putstatic       #28  <Field zzcd zzjh>
		zzji = new zzcd("PACKED_VECTOR", 2, true);
	//   14   28:new             #2   <Class zzcd>
	//   15   31:dup             
	//   16   32:ldc1            #30  <String "PACKED_VECTOR">
	//   17   34:iconst_2        
	//   18   35:iconst_1        
	//   19   36:invokespecial   #22  <Method void zzcd(String, int, boolean)>
	//   20   39:putstatic       #32  <Field zzcd zzji>
		zzjj = new zzcd("MAP", 3, false);
	//   21   42:new             #2   <Class zzcd>
	//   22   45:dup             
	//   23   46:ldc1            #34  <String "MAP">
	//   24   48:iconst_3        
	//   25   49:iconst_0        
	//   26   50:invokespecial   #22  <Method void zzcd(String, int, boolean)>
	//   27   53:putstatic       #36  <Field zzcd zzjj>
		zzjl = (new zzcd[] {
			zzjg, zzjh, zzji, zzjj
		});
	//   28   56:iconst_4        
	//   29   57:anewarray       zzcd[]
	//   30   60:dup             
	//   31   61:iconst_0        
	//   32   62:getstatic       #24  <Field zzcd zzjg>
	//   33   65:aastore         
	//   34   66:dup             
	//   35   67:iconst_1        
	//   36   68:getstatic       #28  <Field zzcd zzjh>
	//   37   71:aastore         
	//   38   72:dup             
	//   39   73:iconst_2        
	//   40   74:getstatic       #32  <Field zzcd zzji>
	//   41   77:aastore         
	//   42   78:dup             
	//   43   79:iconst_3        
	//   44   80:getstatic       #36  <Field zzcd zzjj>
	//   45   83:aastore         
	//   46   84:putstatic       #38  <Field zzcd[] zzjl>
	//*  47   87:return          
	}
}
