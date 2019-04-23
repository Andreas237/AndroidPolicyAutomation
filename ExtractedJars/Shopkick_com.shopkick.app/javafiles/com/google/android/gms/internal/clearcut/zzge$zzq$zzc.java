// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcj, zzge, zzgn, zzck

public static final class zzge$zzq$zzc extends Enum
	implements zzcj
{

	public static zzge$zzq$zzc[] values()
	{
		return (zzge$zzq$zzc[])((zzge$zzq$zzc []) (zzbey)).clone();
	//    0    0:getstatic       #59  <Field zzge$zzq$zzc[] zzbey>
	//    1    3:invokevirtual   #80  <Method Object _5B_Lcom.google.android.gms.internal.clearcut.zzge$zzq$zzc_3B_.clone()>
	//    2    6:checkcast       #76  <Class zzge$zzq$zzc[]>
	//    3    9:areturn         
	}

	public static zzge$zzq$zzc zzay(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 5: default 40
	//	               0 62
	//	               1 58
	//	               2 54
	//	               3 50
	//	               4 46
	//	               5 42
		default:
			return null;
	//    2   40:aconst_null     
	//    3   41:areturn         

		case 5: // '\005'
			return zzbex;
	//    4   42:getstatic       #57  <Field zzge$zzq$zzc zzbex>
	//    5   45:areturn         

		case 4: // '\004'
			return zzbew;
	//    6   46:getstatic       #53  <Field zzge$zzq$zzc zzbew>
	//    7   49:areturn         

		case 3: // '\003'
			return zzbev;
	//    8   50:getstatic       #49  <Field zzge$zzq$zzc zzbev>
	//    9   53:areturn         

		case 2: // '\002'
			return zzbeu;
	//   10   54:getstatic       #45  <Field zzge$zzq$zzc zzbeu>
	//   11   57:areturn         

		case 1: // '\001'
			return zzbet;
	//   12   58:getstatic       #41  <Field zzge$zzq$zzc zzbet>
	//   13   61:areturn         

		case 0: // '\0'
			return zzbes;
	//   14   62:getstatic       #37  <Field zzge$zzq$zzc zzbes>
	//   15   65:areturn         
		}
	}

	public static zzck zzd()
	{
		return zzbq;
	//    0    0:getstatic       #65  <Field zzck zzbq>
	//    1    3:areturn         
	}

	public final int zzc()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int value>
	//    2    4:ireturn         
	}

	private static final zzge$zzq$zzc zzbes;
	private static final zzge$zzq$zzc zzbet;
	private static final zzge$zzq$zzc zzbeu;
	private static final zzge$zzq$zzc zzbev;
	private static final zzge$zzq$zzc zzbew;
	private static final zzge$zzq$zzc zzbex;
	private static final zzge$zzq$zzc zzbey[];
	private static final zzck zzbq = new zzgn();
	private final int value;

	static 
	{
		zzbes = new zzge$zzq$zzc("UNKNOWN_SCHEDULER", 0, 0);
	//    0    0:new             #2   <Class zzge$zzq$zzc>
	//    1    3:dup             
	//    2    4:ldc1            #31  <String "UNKNOWN_SCHEDULER">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #35  <Method void zzge$zzq$zzc(String, int, int)>
	//    6   11:putstatic       #37  <Field zzge$zzq$zzc zzbes>
		zzbet = new zzge$zzq$zzc("ASAP", 1, 1);
	//    7   14:new             #2   <Class zzge$zzq$zzc>
	//    8   17:dup             
	//    9   18:ldc1            #39  <String "ASAP">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #35  <Method void zzge$zzq$zzc(String, int, int)>
	//   13   25:putstatic       #41  <Field zzge$zzq$zzc zzbet>
		zzbeu = new zzge$zzq$zzc("DEFAULT_PERIODIC", 2, 2);
	//   14   28:new             #2   <Class zzge$zzq$zzc>
	//   15   31:dup             
	//   16   32:ldc1            #43  <String "DEFAULT_PERIODIC">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #35  <Method void zzge$zzq$zzc(String, int, int)>
	//   20   39:putstatic       #45  <Field zzge$zzq$zzc zzbeu>
		zzbev = new zzge$zzq$zzc("QOS_FAST_ONEOFF", 3, 3);
	//   21   42:new             #2   <Class zzge$zzq$zzc>
	//   22   45:dup             
	//   23   46:ldc1            #47  <String "QOS_FAST_ONEOFF">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #35  <Method void zzge$zzq$zzc(String, int, int)>
	//   27   53:putstatic       #49  <Field zzge$zzq$zzc zzbev>
		zzbew = new zzge$zzq$zzc("QOS_DEFAULT_PERIODIC", 4, 4);
	//   28   56:new             #2   <Class zzge$zzq$zzc>
	//   29   59:dup             
	//   30   60:ldc1            #51  <String "QOS_DEFAULT_PERIODIC">
	//   31   62:iconst_4        
	//   32   63:iconst_4        
	//   33   64:invokespecial   #35  <Method void zzge$zzq$zzc(String, int, int)>
	//   34   67:putstatic       #53  <Field zzge$zzq$zzc zzbew>
		zzbex = new zzge$zzq$zzc("QOS_UNMETERED_PERIODIC", 5, 5);
	//   35   70:new             #2   <Class zzge$zzq$zzc>
	//   36   73:dup             
	//   37   74:ldc1            #55  <String "QOS_UNMETERED_PERIODIC">
	//   38   76:iconst_5        
	//   39   77:iconst_5        
	//   40   78:invokespecial   #35  <Method void zzge$zzq$zzc(String, int, int)>
	//   41   81:putstatic       #57  <Field zzge$zzq$zzc zzbex>
		zzbey = (new zzge$zzq$zzc[] {
			zzbes, zzbet, zzbeu, zzbev, zzbew, zzbex
		});
	//   42   84:bipush          6
	//   43   86:anewarray       zzge$zzq$zzc[]
	//   44   89:dup             
	//   45   90:iconst_0        
	//   46   91:getstatic       #37  <Field zzge$zzq$zzc zzbes>
	//   47   94:aastore         
	//   48   95:dup             
	//   49   96:iconst_1        
	//   50   97:getstatic       #41  <Field zzge$zzq$zzc zzbet>
	//   51  100:aastore         
	//   52  101:dup             
	//   53  102:iconst_2        
	//   54  103:getstatic       #45  <Field zzge$zzq$zzc zzbeu>
	//   55  106:aastore         
	//   56  107:dup             
	//   57  108:iconst_3        
	//   58  109:getstatic       #49  <Field zzge$zzq$zzc zzbev>
	//   59  112:aastore         
	//   60  113:dup             
	//   61  114:iconst_4        
	//   62  115:getstatic       #53  <Field zzge$zzq$zzc zzbew>
	//   63  118:aastore         
	//   64  119:dup             
	//   65  120:iconst_5        
	//   66  121:getstatic       #57  <Field zzge$zzq$zzc zzbex>
	//   67  124:aastore         
	//   68  125:putstatic       #59  <Field zzge$zzq$zzc[] zzbey>
	//   69  128:new             #61  <Class zzgn>
	//   70  131:dup             
	//   71  132:invokespecial   #63  <Method void zzgn()>
	//   72  135:putstatic       #65  <Field zzck zzbq>
	//*  73  138:return          
	}

	private zzge$zzq$zzc(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #69  <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #71  <Field int value>
	//    7   11:return          
	}
}
