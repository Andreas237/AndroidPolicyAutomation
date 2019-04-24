// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.math.BigInteger;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakk

public final class zzajw
{

	public static String zzc(Context context, String s, String s1)
	{
		Object obj = sLock;
	//    0    0:getstatic       #18  <Field Object sLock>
	//    1    3:astore          5
		obj;
	//    2    5:aload           5
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		if(zzcqq != null) goto _L2; else goto _L1
	//    4    8:getstatic       #25  <Field String zzcqq>
	//    5   11:ifnonnull       124
_L1:
		boolean flag = TextUtils.isEmpty(((CharSequence) (s)));
	//    6   14:aload_1         
	//    7   15:invokestatic    #31  <Method boolean TextUtils.isEmpty(CharSequence)>
	//    8   18:istore          4
		if(flag) goto _L2; else goto _L3
	//    9   20:iload           4
	//   10   22:ifne            124
_L3:
		int i;
		Class class1;
		String as[];
		try
		{
			s1 = ((String) (context.createPackageContext(s1, 3).getClassLoader()));
	//   11   25:aload_0         
	//   12   26:aload_2         
	//   13   27:iconst_3        
	//   14   28:invokevirtual   #37  <Method Context Context.createPackageContext(String, int)>
	//   15   31:invokevirtual   #41  <Method ClassLoader Context.getClassLoader()>
	//   16   34:astore_2        
			class1 = Class.forName("com.google.ads.mediation.MediationAdapter", false, ((ClassLoader) (s1)));
	//   17   35:ldc1            #43  <String "com.google.ads.mediation.MediationAdapter">
	//   18   37:iconst_0        
	//   19   38:aload_2         
	//   20   39:invokestatic    #49  <Method Class Class.forName(String, boolean, ClassLoader)>
	//   21   42:astore          6
		}
	//*  22   44:new             #51  <Class BigInteger>
	//*  23   47:dup             
	//*  24   48:iconst_1        
	//*  25   49:newarray        byte[]
	//*  26   51:invokespecial   #54  <Method void BigInteger(byte[])>
	//*  27   54:astore_0        
	//*  28   55:aload_1         
	//*  29   56:ldc1            #56  <String ",">
	//*  30   58:invokevirtual   #62  <Method String[] String.split(String)>
	//*  31   61:astore          7
	//*  32   63:iconst_0        
	//*  33   64:istore_3        
	//*  34   65:iload_3         
	//*  35   66:aload           7
	//*  36   68:arraylength     
	//*  37   69:icmpge          100
	//*  38   72:invokestatic    #68  <Method zzakk zzbv.zzek()>
	//*  39   75:pop             
	//*  40   76:aload_0         
	//*  41   77:astore_1        
	//*  42   78:aload_2         
	//*  43   79:aload           6
	//*  44   81:aload           7
	//*  45   83:iload_3         
	//*  46   84:aaload          
	//*  47   85:invokestatic    #74  <Method boolean zzakk.zza(ClassLoader, Class, String)>
	//*  48   88:ifeq            143
	//*  49   91:aload_0         
	//*  50   92:iload_3         
	//*  51   93:invokevirtual   #78  <Method BigInteger BigInteger.setBit(int)>
	//*  52   96:astore_1        
	//*  53   97:goto            143
	//*  54  100:getstatic       #84  <Field Locale Locale.US>
	//*  55  103:ldc1            #86  <String "%X">
	//*  56  105:iconst_1        
	//*  57  106:anewarray       Object[]
	//*  58  109:dup             
	//*  59  110:iconst_0        
	//*  60  111:aload_0         
	//*  61  112:aastore         
	//*  62  113:invokestatic    #90  <Method String String.format(Locale, String, Object[])>
	//*  63  116:astore_0        
	//*  64  117:aload_0         
	//*  65  118:putstatic       #25  <Field String zzcqq>
	//*  66  121:goto            124
	//*  67  124:getstatic       #25  <Field String zzcqq>
	//*  68  127:astore_0        
	//*  69  128:aload           5
	//*  70  130:monitorexit     
	//*  71  131:aload_0         
	//*  72  132:areturn         
	//*  73  133:astore_0        
	//*  74  134:aload           5
	//*  75  136:monitorexit     
	//*  76  137:aload_0         
	//*  77  138:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  78  139:astore_0        
		{
			break MISSING_BLOCK_LABEL_152;
	//   79  140:goto            152
		}
		context = ((Context) (new BigInteger(new byte[1])));
		as = s.split(",");
		i = 0;
_L7:
		if(i >= as.length) goto _L5; else goto _L4
_L4:
		zzbv.zzek();
		s = ((String) (context));
		if(zzakk.zza(((ClassLoader) (s1)), class1, as[i]))
			s = ((String) (((BigInteger) (context)).setBit(i)));
		  goto _L6
_L5:
		context = ((Context) (String.format(Locale.US, "%X", new Object[] {
			context
		})));
_L8:
		zzcqq = ((String) (context));
_L2:
		context = ((Context) (zzcqq));
		obj;
		JVM INSTR monitorexit ;
		return ((String) (context));
		context;
		obj;
		JVM INSTR monitorexit ;
		throw context;
_L6:
		i++;
	//   80  143:iload_3         
	//   81  144:iconst_1        
	//   82  145:iadd            
	//   83  146:istore_3        
		context = ((Context) (s));
	//   84  147:aload_1         
	//   85  148:astore_0        
		  goto _L7
	//*  86  149:goto            65
		context = "err";
	//   87  152:ldc1            #92  <String "err">
	//   88  154:astore_0        
		  goto _L8
	//*  89  155:goto            117
	}

	public static String zzqn()
	{
		String s;
		synchronized(sLock)
	//*   0    0:getstatic       #18  <Field Object sLock>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			s = zzcqq;
	//    4    6:getstatic       #25  <Field String zzcqq>
	//    5    9:astore_1        
		}
	//    6   10:aload_0         
	//    7   11:monitorexit     
		return s;
	//    8   12:aload_1         
	//    9   13:areturn         
		exception;
	//   10   14:astore_1        
		obj;
	//   11   15:aload_0         
		JVM INSTR monitorexit ;
	//   12   16:monitorexit     
		throw exception;
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	private static final Object sLock = new Object();
	private static String zzcqq;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void Object()>
	//    3    7:putstatic       #18  <Field Object sLock>
	//*   4   10:return          
	}
}
