// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzyi, zzxz, zzya, zzyk, 
//			zzuo

public final class zzyd
{

	private zzyd(int i, Class class1, int j, boolean flag)
	{
		this(11, class1, ((zzuo) (null)), 810, false);
	//    0    0:aload_0         
	//    1    1:bipush          11
	//    2    3:aload_2         
	//    3    4:aconst_null     
	//    4    5:sipush          810
	//    5    8:iconst_0        
	//    6    9:invokespecial   #21  <Method void zzyd(int, Class, zzuo, int, boolean)>
	//    7   12:return          
	}

	private zzyd(int i, Class class1, zzuo zzuo, int j, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		type = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #29  <Field int type>
		zzcew = class1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field Class zzcew>
		tag = j;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #33  <Field int tag>
		zzcex = false;
	//   11   20:aload_0         
	//   12   21:iconst_0        
	//   13   22:putfield        #35  <Field boolean zzcex>
		zzbyi = null;
	//   14   25:aload_0         
	//   15   26:aconst_null     
	//   16   27:putfield        #37  <Field zzuo zzbyi>
	//   17   30:return          
	}

	public static zzyd zza(int i, Class class1, long l)
	{
		return new zzyd(11, class1, 810, false);
	//    0    0:new             #2   <Class zzyd>
	//    1    3:dup             
	//    2    4:bipush          11
	//    3    6:aload_1         
	//    4    7:sipush          810
	//    5   10:iconst_0        
	//    6   11:invokespecial   #42  <Method void zzyd(int, Class, int, boolean)>
	//    7   14:areturn         
	}

	private final Object zze(zzxz zzxz1)
	{
		Object obj;
		if(zzcex)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field boolean zzcex>
	//*   2    4:ifeq            18
			obj = ((Object) (zzcew.getComponentType()));
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field Class zzcew>
	//    5   11:invokevirtual   #57  <Method Class Class.getComponentType()>
	//    6   14:astore_3        
		else
	//*   7   15:goto            23
			obj = ((Object) (zzcew));
	//    8   18:aload_0         
	//    9   19:getfield        #31  <Field Class zzcew>
	//   10   22:astore_3        
		type;
	//   11   23:aload_0         
	//   12   24:getfield        #29  <Field int type>
		JVM INSTR tableswitch 10 11: default 253
	//	               10 69
	//	               11 51;
	//   13   27:tableswitch     10 11: default 253
	//	               10 69
	//	               11 51
		   goto _L1 _L2 _L3
	//*  14   48:goto            93
_L3:
		zzyi zzyi1;
		zzyi1 = (zzyi)((Class) (obj)).newInstance();
	//   15   51:aload_3         
	//   16   52:invokevirtual   #61  <Method Object Class.newInstance()>
	//   17   55:checkcast       #63  <Class zzyi>
	//   18   58:astore          4
		zzxz1.zza(zzyi1);
	//   19   60:aload_1         
	//   20   61:aload           4
	//   21   63:invokevirtual   #68  <Method void zzxz.zza(zzyi)>
		return ((Object) (zzyi1));
	//   22   66:aload           4
	//   23   68:areturn         
_L2:
		zzyi1 = (zzyi)((Class) (obj)).newInstance();
	//   24   69:aload_3         
	//   25   70:invokevirtual   #61  <Method Object Class.newInstance()>
	//   26   73:checkcast       #63  <Class zzyi>
	//   27   76:astore          4
		zzxz1.zza(zzyi1, tag >>> 3);
	//   28   78:aload_1         
	//   29   79:aload           4
	//   30   81:aload_0         
	//   31   82:getfield        #33  <Field int tag>
	//   32   85:iconst_3        
	//   33   86:iushr           
	//   34   87:invokevirtual   #71  <Method void zzxz.zza(zzyi, int)>
		return ((Object) (zzyi1));
	//   35   90:aload           4
	//   36   92:areturn         
_L1:
		try
		{
			int i = type;
	//   37   93:aload_0         
	//   38   94:getfield        #29  <Field int type>
	//   39   97:istore_2        
			zzxz1 = ((zzxz) (new StringBuilder(24)));
	//   40   98:new             #73  <Class StringBuilder>
	//   41  101:dup             
	//   42  102:bipush          24
	//   43  104:invokespecial   #76  <Method void StringBuilder(int)>
	//   44  107:astore_1        
			((StringBuilder) (zzxz1)).append("Unknown type ");
	//   45  108:aload_1         
	//   46  109:ldc1            #78  <String "Unknown type ">
	//   47  111:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   48  114:pop             
			((StringBuilder) (zzxz1)).append(i);
	//   49  115:aload_1         
	//   50  116:iload_2         
	//   51  117:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//   52  120:pop             
			throw new IllegalArgumentException(((StringBuilder) (zzxz1)).toString());
	//   53  121:new             #87  <Class IllegalArgumentException>
	//   54  124:dup             
	//   55  125:aload_1         
	//   56  126:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   57  129:invokespecial   #94  <Method void IllegalArgumentException(String)>
	//   58  132:athrow          
		}
	//*  59  133:astore_1        
	//*  60  134:new             #87  <Class IllegalArgumentException>
	//*  61  137:dup             
	//*  62  138:ldc1            #96  <String "Error reading extension field">
	//*  63  140:aload_1         
	//*  64  141:invokespecial   #99  <Method void IllegalArgumentException(String, Throwable)>
	//*  65  144:athrow          
	//*  66  145:astore_1        
	//*  67  146:aload_3         
	//*  68  147:invokestatic    #105 <Method String String.valueOf(Object)>
	//*  69  150:astore_3        
	//*  70  151:new             #73  <Class StringBuilder>
	//*  71  154:dup             
	//*  72  155:aload_3         
	//*  73  156:invokestatic    #105 <Method String String.valueOf(Object)>
	//*  74  159:invokevirtual   #109 <Method int String.length()>
	//*  75  162:bipush          33
	//*  76  164:iadd            
	//*  77  165:invokespecial   #76  <Method void StringBuilder(int)>
	//*  78  168:astore          4
	//*  79  170:aload           4
	//*  80  172:ldc1            #111 <String "Error creating instance of class ">
	//*  81  174:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//*  82  177:pop             
	//*  83  178:aload           4
	//*  84  180:aload_3         
	//*  85  181:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//*  86  184:pop             
	//*  87  185:new             #87  <Class IllegalArgumentException>
	//*  88  188:dup             
	//*  89  189:aload           4
	//*  90  191:invokevirtual   #91  <Method String StringBuilder.toString()>
	//*  91  194:aload_1         
	//*  92  195:invokespecial   #99  <Method void IllegalArgumentException(String, Throwable)>
	//*  93  198:athrow          
		// Misplaced declaration of an exception variable
		catch(zzxz zzxz1)
	//*  94  199:astore_1        
		{
			obj = ((Object) (String.valueOf(obj)));
	//   95  200:aload_3         
	//   96  201:invokestatic    #105 <Method String String.valueOf(Object)>
	//   97  204:astore_3        
		}
		// Misplaced declaration of an exception variable
		catch(zzxz zzxz1)
		{
			obj = ((Object) (String.valueOf(obj)));
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(obj).length() + 33);
			stringbuilder.append("Error creating instance of class ");
			stringbuilder.append(((String) (obj)));
			throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (zzxz1)));
		}
		// Misplaced declaration of an exception variable
		catch(zzxz zzxz1)
		{
			throw new IllegalArgumentException("Error reading extension field", ((Throwable) (zzxz1)));
		}
		StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(obj).length() + 33);
	//   98  205:new             #73  <Class StringBuilder>
	//   99  208:dup             
	//  100  209:aload_3         
	//  101  210:invokestatic    #105 <Method String String.valueOf(Object)>
	//  102  213:invokevirtual   #109 <Method int String.length()>
	//  103  216:bipush          33
	//  104  218:iadd            
	//  105  219:invokespecial   #76  <Method void StringBuilder(int)>
	//  106  222:astore          4
		stringbuilder1.append("Error creating instance of class ");
	//  107  224:aload           4
	//  108  226:ldc1            #111 <String "Error creating instance of class ">
	//  109  228:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//  110  231:pop             
		stringbuilder1.append(((String) (obj)));
	//  111  232:aload           4
	//  112  234:aload_3         
	//  113  235:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//  114  238:pop             
		throw new IllegalArgumentException(stringbuilder1.toString(), ((Throwable) (zzxz1)));
	//  115  239:new             #87  <Class IllegalArgumentException>
	//  116  242:dup             
	//  117  243:aload           4
	//  118  245:invokevirtual   #91  <Method String StringBuilder.toString()>
	//  119  248:aload_1         
	//  120  249:invokespecial   #99  <Method void IllegalArgumentException(String, Throwable)>
	//  121  252:athrow          
	//* 122  253:goto            48
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof zzyd))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzyd>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzyd)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzyd>
	//   12   20:astore_1        
		return type == ((zzyd) (obj)).type && zzcew == ((zzyd) (obj)).zzcew && tag == ((zzyd) (obj)).tag && zzcex == ((zzyd) (obj)).zzcex;
	//   13   21:aload_0         
	//   14   22:getfield        #29  <Field int type>
	//   15   25:aload_1         
	//   16   26:getfield        #29  <Field int type>
	//   17   29:icmpne          67
	//   18   32:aload_0         
	//   19   33:getfield        #31  <Field Class zzcew>
	//   20   36:aload_1         
	//   21   37:getfield        #31  <Field Class zzcew>
	//   22   40:if_acmpne       67
	//   23   43:aload_0         
	//   24   44:getfield        #33  <Field int tag>
	//   25   47:aload_1         
	//   26   48:getfield        #33  <Field int tag>
	//   27   51:icmpne          67
	//   28   54:aload_0         
	//   29   55:getfield        #35  <Field boolean zzcex>
	//   30   58:aload_1         
	//   31   59:getfield        #35  <Field boolean zzcex>
	//   32   62:icmpne          67
	//   33   65:iconst_1        
	//   34   66:ireturn         
	//   35   67:iconst_0        
	//   36   68:ireturn         
	}

	public final int hashCode()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #116 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #118 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #121 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	protected final void zza(Object obj, zzya zzya1)
	{
		zzya1.zzcd(tag);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #33  <Field int tag>
	//    3    5:invokevirtual   #127 <Method void zzya.zzcd(int)>
		type;
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field int type>
		JVM INSTR tableswitch 10 11: default 120
	//	               10 48
	//	               11 39;
	//    6   12:tableswitch     10 11: default 120
	//	               10 48
	//	               11 39
		   goto _L1 _L2 _L3
	//*   7   36:goto            70
_L3:
		int i;
		try
		{
			zzya1.zzb((zzyi)obj);
	//    8   39:aload_2         
	//    9   40:aload_1         
	//   10   41:checkcast       #63  <Class zzyi>
	//   11   44:invokevirtual   #130 <Method void zzya.zzb(zzyi)>
			return;
	//   12   47:return          
		}
	//*  13   48:aload_0         
	//*  14   49:getfield        #33  <Field int tag>
	//*  15   52:istore_3        
	//*  16   53:aload_1         
	//*  17   54:checkcast       #63  <Class zzyi>
	//*  18   57:aload_2         
	//*  19   58:invokevirtual   #133 <Method void zzyi.zza(zzya)>
	//*  20   61:aload_2         
	//*  21   62:iload_3         
	//*  22   63:iconst_3        
	//*  23   64:iushr           
	//*  24   65:iconst_4        
	//*  25   66:invokevirtual   #137 <Method void zzya.zzc(int, int)>
	//*  26   69:return          
	//*  27   70:aload_0         
	//*  28   71:getfield        #29  <Field int type>
	//*  29   74:istore_3        
	//*  30   75:new             #73  <Class StringBuilder>
	//*  31   78:dup             
	//*  32   79:bipush          24
	//*  33   81:invokespecial   #76  <Method void StringBuilder(int)>
	//*  34   84:astore_1        
	//*  35   85:aload_1         
	//*  36   86:ldc1            #78  <String "Unknown type ">
	//*  37   88:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//*  38   91:pop             
	//*  39   92:aload_1         
	//*  40   93:iload_3         
	//*  41   94:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//*  42   97:pop             
	//*  43   98:new             #87  <Class IllegalArgumentException>
	//*  44  101:dup             
	//*  45  102:aload_1         
	//*  46  103:invokevirtual   #91  <Method String StringBuilder.toString()>
	//*  47  106:invokespecial   #94  <Method void IllegalArgumentException(String)>
	//*  48  109:athrow          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  49  110:astore_1        
		{
			throw new IllegalStateException(((Throwable) (obj)));
	//   50  111:new             #139 <Class IllegalStateException>
	//   51  114:dup             
	//   52  115:aload_1         
	//   53  116:invokespecial   #142 <Method void IllegalStateException(Throwable)>
	//   54  119:athrow          
		}
_L2:
		i = tag;
		((zzyi)obj).zza(zzya1);
		zzya1.zzc(i >>> 3, 4);
		return;
_L1:
		int j = type;
		obj = ((Object) (new StringBuilder(24)));
		((StringBuilder) (obj)).append("Unknown type ");
		((StringBuilder) (obj)).append(j);
		throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//*  55  120:goto            36
	}

	final Object zzai(List list)
	{
		if(list == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(zzcex)
	//*   4    6:aload_0         
	//*   5    7:getfield        #35  <Field boolean zzcex>
	//*   6   10:ifeq            150
		{
			ArrayList arraylist = new ArrayList();
	//    7   13:new             #146 <Class ArrayList>
	//    8   16:dup             
	//    9   17:invokespecial   #147 <Method void ArrayList()>
	//   10   20:astore          5
			boolean flag = false;
	//   11   22:iconst_0        
	//   12   23:istore_3        
			for(int i = 0; i < list.size(); i++)
	//*  13   24:iconst_0        
	//*  14   25:istore_2        
	//*  15   26:iload_2         
	//*  16   27:aload_1         
	//*  17   28:invokeinterface #152 <Method int List.size()>
	//*  18   33:icmpge          84
			{
				zzyk zzyk1 = (zzyk)list.get(i);
	//   19   36:aload_1         
	//   20   37:iload_2         
	//   21   38:invokeinterface #156 <Method Object List.get(int)>
	//   22   43:checkcast       #158 <Class zzyk>
	//   23   46:astore          6
				if(zzyk1.zzbtz.length != 0)
	//*  24   48:aload           6
	//*  25   50:getfield        #162 <Field byte[] zzyk.zzbtz>
	//*  26   53:arraylength     
	//*  27   54:ifeq            77
					((List) (arraylist)).add(zze(zzxz.zzn(zzyk1.zzbtz)));
	//   28   57:aload           5
	//   29   59:aload_0         
	//   30   60:aload           6
	//   31   62:getfield        #162 <Field byte[] zzyk.zzbtz>
	//   32   65:invokestatic    #166 <Method zzxz zzxz.zzn(byte[])>
	//   33   68:invokespecial   #168 <Method Object zze(zzxz)>
	//   34   71:invokeinterface #171 <Method boolean List.add(Object)>
	//   35   76:pop             
			}

	//   36   77:iload_2         
	//   37   78:iconst_1        
	//   38   79:iadd            
	//   39   80:istore_2        
	//*  40   81:goto            26
			int k = ((List) (arraylist)).size();
	//   41   84:aload           5
	//   42   86:invokeinterface #152 <Method int List.size()>
	//   43   91:istore          4
			if(k == 0)
	//*  44   93:iload           4
	//*  45   95:ifne            100
				return ((Object) (null));
	//   46   98:aconst_null     
	//   47   99:areturn         
			list = ((List) (zzcew.cast(Array.newInstance(zzcew.getComponentType(), k))));
	//   48  100:aload_0         
	//   49  101:getfield        #31  <Field Class zzcew>
	//   50  104:aload_0         
	//   51  105:getfield        #31  <Field Class zzcew>
	//   52  108:invokevirtual   #57  <Method Class Class.getComponentType()>
	//   53  111:iload           4
	//   54  113:invokestatic    #176 <Method Object Array.newInstance(Class, int)>
	//   55  116:invokevirtual   #180 <Method Object Class.cast(Object)>
	//   56  119:astore_1        
			for(int j = ((int) (flag)); j < k; j++)
	//*  57  120:iload_3         
	//*  58  121:istore_2        
	//*  59  122:iload_2         
	//*  60  123:iload           4
	//*  61  125:icmpge          148
				Array.set(((Object) (list)), j, ((List) (arraylist)).get(j));
	//   62  128:aload_1         
	//   63  129:iload_2         
	//   64  130:aload           5
	//   65  132:iload_2         
	//   66  133:invokeinterface #156 <Method Object List.get(int)>
	//   67  138:invokestatic    #184 <Method void Array.set(Object, int, Object)>

	//   68  141:iload_2         
	//   69  142:iconst_1        
	//   70  143:iadd            
	//   71  144:istore_2        
	//*  72  145:goto            122
			return ((Object) (list));
	//   73  148:aload_1         
	//   74  149:areturn         
		}
		if(list.isEmpty())
	//*  75  150:aload_1         
	//*  76  151:invokeinterface #188 <Method boolean List.isEmpty()>
	//*  77  156:ifeq            161
		{
			return ((Object) (null));
	//   78  159:aconst_null     
	//   79  160:areturn         
		} else
		{
			list = ((List) ((zzyk)list.get(list.size() - 1)));
	//   80  161:aload_1         
	//   81  162:aload_1         
	//   82  163:invokeinterface #152 <Method int List.size()>
	//   83  168:iconst_1        
	//   84  169:isub            
	//   85  170:invokeinterface #156 <Method Object List.get(int)>
	//   86  175:checkcast       #158 <Class zzyk>
	//   87  178:astore_1        
			return zzcew.cast(zze(zzxz.zzn(((zzyk) (list)).zzbtz)));
	//   88  179:aload_0         
	//   89  180:getfield        #31  <Field Class zzcew>
	//   90  183:aload_0         
	//   91  184:aload_1         
	//   92  185:getfield        #162 <Field byte[] zzyk.zzbtz>
	//   93  188:invokestatic    #166 <Method zzxz zzxz.zzn(byte[])>
	//   94  191:invokespecial   #168 <Method Object zze(zzxz)>
	//   95  194:invokevirtual   #180 <Method Object Class.cast(Object)>
	//   96  197:areturn         
		}
	}

	protected final int zzao(Object obj)
	{
		int i = tag >>> 3;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int tag>
	//    2    4:iconst_3        
	//    3    5:iushr           
	//    4    6:istore_2        
		switch(type)
	//*   5    7:aload_0         
	//*   6    8:getfield        #29  <Field int type>
		{
	//*   7   11:tableswitch     10 11: default 32
	//	               10 81
	//	               11 72
		default:
			i = type;
	//    8   32:aload_0         
	//    9   33:getfield        #29  <Field int type>
	//   10   36:istore_2        
			obj = ((Object) (new StringBuilder(24)));
	//   11   37:new             #73  <Class StringBuilder>
	//   12   40:dup             
	//   13   41:bipush          24
	//   14   43:invokespecial   #76  <Method void StringBuilder(int)>
	//   15   46:astore_1        
			((StringBuilder) (obj)).append("Unknown type ");
	//   16   47:aload_1         
	//   17   48:ldc1            #78  <String "Unknown type ">
	//   18   50:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   19   53:pop             
			((StringBuilder) (obj)).append(i);
	//   20   54:aload_1         
	//   21   55:iload_2         
	//   22   56:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//   23   59:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   24   60:new             #87  <Class IllegalArgumentException>
	//   25   63:dup             
	//   26   64:aload_1         
	//   27   65:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   28   68:invokespecial   #94  <Method void IllegalArgumentException(String)>
	//   29   71:athrow          

		case 11: // '\013'
			return zzya.zzb(i, (zzyi)obj);
	//   30   72:iload_2         
	//   31   73:aload_1         
	//   32   74:checkcast       #63  <Class zzyi>
	//   33   77:invokestatic    #194 <Method int zzya.zzb(int, zzyi)>
	//   34   80:ireturn         

		case 10: // '\n'
			obj = ((Object) ((zzyi)obj));
	//   35   81:aload_1         
	//   36   82:checkcast       #63  <Class zzyi>
	//   37   85:astore_1        
			break;
		}
		return (zzya.zzbd(i) << 1) + ((zzyi) (obj)).zzvx();
	//   38   86:iload_2         
	//   39   87:invokestatic    #198 <Method int zzya.zzbd(int)>
	//   40   90:iconst_1        
	//   41   91:ishl            
	//   42   92:aload_1         
	//   43   93:invokevirtual   #201 <Method int zzyi.zzvx()>
	//   44   96:iadd            
	//   45   97:ireturn         
	}

	public final int tag;
	private final int type;
	private final zzuo zzbyi;
	protected final Class zzcew;
	protected final boolean zzcex;
}
