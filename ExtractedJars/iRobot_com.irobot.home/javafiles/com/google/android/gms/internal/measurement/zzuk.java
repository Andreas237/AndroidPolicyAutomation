// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


final class zzuk extends Enum
{

	private zzuk(String s, int i, boolean flag)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #42  <Method void Enum(String, int)>
		zzbxz = flag;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #44  <Field boolean zzbxz>
	//    7   11:return          
	}

	public static zzuk[] values()
	{
		return (zzuk[])((zzuk []) (zzbya)).clone();
	//    0    0:getstatic       #38  <Field zzuk[] zzbya>
	//    1    3:invokevirtual   #53  <Method Object _5B_Lcom.google.android.gms.internal.measurement.zzuk_3B_.clone()>
	//    2    6:checkcast       #49  <Class zzuk[]>
	//    3    9:areturn         
	}

	public static final zzuk zzbxv;
	public static final zzuk zzbxw;
	public static final zzuk zzbxx;
	public static final zzuk zzbxy;
	private static final zzuk zzbya[];
	private final boolean zzbxz;

	static 
	{
		zzbxv = new zzuk("SCALAR", 0, false);
	//    0    0:new             #2   <Class zzuk>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "SCALAR">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #22  <Method void zzuk(String, int, boolean)>
	//    6   11:putstatic       #24  <Field zzuk zzbxv>
		zzbxw = new zzuk("VECTOR", 1, true);
	//    7   14:new             #2   <Class zzuk>
	//    8   17:dup             
	//    9   18:ldc1            #26  <String "VECTOR">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #22  <Method void zzuk(String, int, boolean)>
	//   13   25:putstatic       #28  <Field zzuk zzbxw>
		zzbxx = new zzuk("PACKED_VECTOR", 2, true);
	//   14   28:new             #2   <Class zzuk>
	//   15   31:dup             
	//   16   32:ldc1            #30  <String "PACKED_VECTOR">
	//   17   34:iconst_2        
	//   18   35:iconst_1        
	//   19   36:invokespecial   #22  <Method void zzuk(String, int, boolean)>
	//   20   39:putstatic       #32  <Field zzuk zzbxx>
		zzbxy = new zzuk("MAP", 3, false);
	//   21   42:new             #2   <Class zzuk>
	//   22   45:dup             
	//   23   46:ldc1            #34  <String "MAP">
	//   24   48:iconst_3        
	//   25   49:iconst_0        
	//   26   50:invokespecial   #22  <Method void zzuk(String, int, boolean)>
	//   27   53:putstatic       #36  <Field zzuk zzbxy>
		zzbya = (new zzuk[] {
			zzbxv, zzbxw, zzbxx, zzbxy
		});
	//   28   56:iconst_4        
	//   29   57:anewarray       zzuk[]
	//   30   60:dup             
	//   31   61:iconst_0        
	//   32   62:getstatic       #24  <Field zzuk zzbxv>
	//   33   65:aastore         
	//   34   66:dup             
	//   35   67:iconst_1        
	//   36   68:getstatic       #28  <Field zzuk zzbxw>
	//   37   71:aastore         
	//   38   72:dup             
	//   39   73:iconst_2        
	//   40   74:getstatic       #32  <Field zzuk zzbxx>
	//   41   77:aastore         
	//   42   78:dup             
	//   43   79:iconst_3        
	//   44   80:getstatic       #36  <Field zzuk zzbxy>
	//   45   83:aastore         
	//   46   84:putstatic       #38  <Field zzuk[] zzbya>
	//*  47   87:return          
	}
}
