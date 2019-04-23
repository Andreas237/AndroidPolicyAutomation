// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzso, zzsm, zzsk, zzsj, 
//			zzsn, zzsl, zzrx, zzsp, 
//			zzse, zzru, zzsb

public abstract class zzsi
{

	private zzsi(zzso zzso1, String s, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		zzbrr = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #45  <Field int zzbrr>
		if(zzso.zza(zzso1) != null)
	//*   5    9:aload_1         
	//*   6   10:invokestatic    #51  <Method android.net.Uri zzso.zza(zzso)>
	//*   7   13:ifnull          32
		{
			zzbro = zzso1;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #53  <Field zzso zzbro>
			name = s;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #55  <Field String name>
			zzbrp = obj;
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:putfield        #57  <Field Object zzbrp>
			return;
	//   17   31:return          
		} else
		{
			throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
	//   18   32:new             #59  <Class IllegalArgumentException>
	//   19   35:dup             
	//   20   36:ldc1            #61  <String "Must pass a valid SharedPreferences file name or ContentProvider URI">
	//   21   38:invokespecial   #64  <Method void IllegalArgumentException(String)>
	//   22   41:athrow          
		}
	}

	zzsi(zzso zzso1, String s, Object obj, zzsj zzsj1)
	{
		this(zzso1, s, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #69  <Method void zzsi(zzso, String, Object)>
	//    5    7:return          
	}

	private static zzsi zza(zzso zzso1, String s, double d)
	{
		return ((zzsi) (new zzsm(zzso1, s, Double.valueOf(d))));
	//    0    0:new             #72  <Class zzsm>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:dload_2         
	//    5    7:invokestatic    #78  <Method Double Double.valueOf(double)>
	//    6   10:invokespecial   #81  <Method void zzsm(zzso, String, Double)>
	//    7   13:areturn         
	}

	private static zzsi zza(zzso zzso1, String s, int i)
	{
		return ((zzsi) (new zzsk(zzso1, s, Integer.valueOf(i))));
	//    0    0:new             #85  <Class zzsk>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokestatic    #90  <Method Integer Integer.valueOf(int)>
	//    6   10:invokespecial   #93  <Method void zzsk(zzso, String, Integer)>
	//    7   13:areturn         
	}

	private static zzsi zza(zzso zzso1, String s, long l)
	{
		return ((zzsi) (new zzsj(zzso1, s, Long.valueOf(l))));
	//    0    0:new             #97  <Class zzsj>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:lload_2         
	//    5    7:invokestatic    #102 <Method Long Long.valueOf(long)>
	//    6   10:invokespecial   #105 <Method void zzsj(zzso, String, Long)>
	//    7   13:areturn         
	}

	private static zzsi zza(zzso zzso1, String s, String s1)
	{
		return ((zzsi) (new zzsn(zzso1, s, s1)));
	//    0    0:new             #109 <Class zzsn>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #112 <Method void zzsn(zzso, String, String)>
	//    6   10:areturn         
	}

	private static zzsi zza(zzso zzso1, String s, boolean flag)
	{
		return ((zzsi) (new zzsl(zzso1, s, Boolean.valueOf(flag))));
	//    0    0:new             #116 <Class zzsl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokestatic    #121 <Method Boolean Boolean.valueOf(boolean)>
	//    6   10:invokespecial   #124 <Method void zzsl(zzso, String, Boolean)>
	//    7   13:areturn         
	}

	public static void zzae(Context context)
	{
		Object obj = zzbrm;
	//    0    0:getstatic       #32  <Field Object zzbrm>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		Context context1 = context.getApplicationContext();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #133 <Method Context Context.getApplicationContext()>
	//    6   10:astore_1        
		if(context1 != null)
	//*   7   11:aload_1         
	//*   8   12:ifnonnull       103
	//*   9   15:goto            18
	//*  10   18:getstatic       #34  <Field Context zzri>
	//*  11   21:aload_0         
	//*  12   22:if_acmpeq       95
	//*  13   25:ldc1            #135 <Class zzrx>
	//*  14   27:monitorenter    
	//*  15   28:getstatic       #139 <Field Map zzrx.zzbrb>
	//*  16   31:invokeinterface #144 <Method void Map.clear()>
	//*  17   36:ldc1            #135 <Class zzrx>
	//*  18   38:monitorexit     
	//*  19   39:ldc1            #146 <Class zzsp>
	//*  20   41:monitorenter    
	//*  21   42:getstatic       #149 <Field Map zzsp.zzbrz>
	//*  22   45:invokeinterface #144 <Method void Map.clear()>
	//*  23   50:ldc1            #146 <Class zzsp>
	//*  24   52:monitorexit     
	//*  25   53:ldc1            #151 <Class zzse>
	//*  26   55:monitorenter    
	//*  27   56:aconst_null     
	//*  28   57:putstatic       #155 <Field zzse zzse.zzbrj>
	//*  29   60:ldc1            #151 <Class zzse>
	//*  30   62:monitorexit     
	//*  31   63:getstatic       #41  <Field AtomicInteger zzbrq>
	//*  32   66:invokevirtual   #159 <Method int AtomicInteger.incrementAndGet()>
	//*  33   69:pop             
	//*  34   70:aload_0         
	//*  35   71:putstatic       #34  <Field Context zzri>
	//*  36   74:goto            95
	//*  37   77:astore_0        
	//*  38   78:ldc1            #151 <Class zzse>
	//*  39   80:monitorexit     
	//*  40   81:aload_0         
	//*  41   82:athrow          
	//*  42   83:astore_0        
	//*  43   84:ldc1            #146 <Class zzsp>
	//*  44   86:monitorexit     
	//*  45   87:aload_0         
	//*  46   88:athrow          
	//*  47   89:astore_0        
	//*  48   90:ldc1            #135 <Class zzrx>
	//*  49   92:monitorexit     
	//*  50   93:aload_0         
	//*  51   94:athrow          
	//*  52   95:aload_2         
	//*  53   96:monitorexit     
	//*  54   97:return          
	//*  55   98:astore_0        
	//*  56   99:aload_2         
	//*  57  100:monitorexit     
	//*  58  101:aload_0         
	//*  59  102:athrow          
			context = context1;
	//   60  103:aload_1         
	//   61  104:astore_0        
		if(zzri == context)
			break MISSING_BLOCK_LABEL_95;
		com/google/android/gms/internal/measurement/zzrx;
		JVM INSTR monitorenter ;
		zzrx.zzbrb.clear();
		com/google/android/gms/internal/measurement/zzrx;
		JVM INSTR monitorexit ;
		com/google/android/gms/internal/measurement/zzsp;
		JVM INSTR monitorenter ;
		zzsp.zzbrz.clear();
		com/google/android/gms/internal/measurement/zzsp;
		JVM INSTR monitorexit ;
		com/google/android/gms/internal/measurement/zzse;
		JVM INSTR monitorenter ;
		zzse.zzbrj = null;
		com/google/android/gms/internal/measurement/zzse;
		JVM INSTR monitorexit ;
		zzbrq.incrementAndGet();
		zzri = context;
		break MISSING_BLOCK_LABEL_95;
		context;
		com/google/android/gms/internal/measurement/zzse;
		JVM INSTR monitorexit ;
		throw context;
		context;
		com/google/android/gms/internal/measurement/zzsp;
		JVM INSTR monitorexit ;
		throw context;
		context;
		com/google/android/gms/internal/measurement/zzrx;
		JVM INSTR monitorexit ;
		throw context;
		obj;
		JVM INSTR monitorexit ;
		return;
		context;
		obj;
		JVM INSTR monitorexit ;
		throw context;
	//*  62  105:goto            18
	}

	static zzsi zzb(zzso zzso1, String s, double d)
	{
		return zza(zzso1, s, d);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dload_2         
	//    3    3:invokestatic    #162 <Method zzsi zza(zzso, String, double)>
	//    4    6:areturn         
	}

	static zzsi zzb(zzso zzso1, String s, int i)
	{
		return zza(zzso1, s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #164 <Method zzsi zza(zzso, String, int)>
	//    4    6:areturn         
	}

	static zzsi zzb(zzso zzso1, String s, long l)
	{
		return zza(zzso1, s, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokestatic    #166 <Method zzsi zza(zzso, String, long)>
	//    4    6:areturn         
	}

	static zzsi zzb(zzso zzso1, String s, String s1)
	{
		return zza(zzso1, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #168 <Method zzsi zza(zzso, String, String)>
	//    4    6:areturn         
	}

	static zzsi zzb(zzso zzso1, String s, boolean flag)
	{
		return zza(zzso1, s, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #170 <Method zzsi zza(zzso, String, boolean)>
	//    4    6:areturn         
	}

	private final String zzfr(String s)
	{
		if(s != null && s.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          16
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #178 <Method boolean String.isEmpty()>
	//*   4    8:ifeq            16
			return name;
	//    5   11:aload_0         
	//    6   12:getfield        #55  <Field String name>
	//    7   15:areturn         
		s = String.valueOf(((Object) (s)));
	//    8   16:aload_1         
	//    9   17:invokestatic    #181 <Method String String.valueOf(Object)>
	//   10   20:astore_1        
		String s1 = String.valueOf(((Object) (name)));
	//   11   21:aload_0         
	//   12   22:getfield        #55  <Field String name>
	//   13   25:invokestatic    #181 <Method String String.valueOf(Object)>
	//   14   28:astore_2        
		if(s1.length() != 0)
	//*  15   29:aload_2         
	//*  16   30:invokevirtual   #184 <Method int String.length()>
	//*  17   33:ifeq            42
			return s.concat(s1);
	//   18   36:aload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #187 <Method String String.concat(String)>
	//   21   41:areturn         
		else
			return new String(s);
	//   22   42:new             #174 <Class String>
	//   23   45:dup             
	//   24   46:aload_1         
	//   25   47:invokespecial   #188 <Method void String(String)>
	//   26   50:areturn         
	}

	static void zztq()
	{
		zzbrq.incrementAndGet();
	//    0    0:getstatic       #41  <Field AtomicInteger zzbrq>
	//    1    3:invokevirtual   #159 <Method int AtomicInteger.incrementAndGet()>
	//    2    6:pop             
	//    3    7:return          
	}

	private final Object zzts()
	{
		Object obj = ((Object) (zzbro));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzso zzbro>
	//    2    4:astore_2        
		obj = ((Object) ((String)zzse.zzad(zzri).zzfn("gms:phenotype:phenotype_flag:debug_bypass_phenotype")));
	//    3    5:getstatic       #34  <Field Context zzri>
	//    4    8:invokestatic    #196 <Method zzse zzse.zzad(Context)>
	//    5   11:ldc1            #198 <String "gms:phenotype:phenotype_flag:debug_bypass_phenotype">
	//    6   13:invokevirtual   #202 <Method Object zzse.zzfn(String)>
	//    7   16:checkcast       #174 <Class String>
	//    8   19:astore_2        
		boolean flag;
		if(obj != null && zzru.zzbqo.matcher(((CharSequence) (obj))).matches())
	//*   9   20:aload_2         
	//*  10   21:ifnull          42
	//*  11   24:getstatic       #208 <Field Pattern zzru.zzbqo>
	//*  12   27:aload_2         
	//*  13   28:invokevirtual   #214 <Method Matcher Pattern.matcher(CharSequence)>
	//*  14   31:invokevirtual   #219 <Method boolean Matcher.matches()>
	//*  15   34:ifeq            42
			flag = true;
	//   16   37:iconst_1        
	//   17   38:istore_1        
		else
	//*  18   39:goto            44
			flag = false;
	//   19   42:iconst_0        
	//   20   43:istore_1        
		if(!flag)
	//*  21   44:iload_1         
	//*  22   45:ifne            118
		{
			Object obj1;
			if(zzso.zza(zzbro) != null)
	//*  23   48:aload_0         
	//*  24   49:getfield        #53  <Field zzso zzbro>
	//*  25   52:invokestatic    #51  <Method android.net.Uri zzso.zza(zzso)>
	//*  26   55:ifnull          78
			{
				obj1 = ((Object) (zzrx.zza(zzri.getContentResolver(), zzso.zza(zzbro))));
	//   27   58:getstatic       #34  <Field Context zzri>
	//   28   61:invokevirtual   #223 <Method android.content.ContentResolver Context.getContentResolver()>
	//   29   64:aload_0         
	//   30   65:getfield        #53  <Field zzso zzbro>
	//   31   68:invokestatic    #51  <Method android.net.Uri zzso.zza(zzso)>
	//   32   71:invokestatic    #226 <Method zzrx zzrx.zza(android.content.ContentResolver, android.net.Uri)>
	//   33   74:astore_2        
			} else
	//*  34   75:goto            93
			{
				obj1 = ((Object) (zzri));
	//   35   78:getstatic       #34  <Field Context zzri>
	//   36   81:astore_2        
				zzso zzso1 = zzbro;
	//   37   82:aload_0         
	//   38   83:getfield        #53  <Field zzso zzbro>
	//   39   86:astore_3        
				obj1 = ((Object) (zzsp.zzi(((Context) (obj1)), ((String) (null)))));
	//   40   87:aload_2         
	//   41   88:aconst_null     
	//   42   89:invokestatic    #230 <Method zzsp zzsp.zzi(Context, String)>
	//   43   92:astore_2        
			}
			if(obj1 != null)
	//*  44   93:aload_2         
	//*  45   94:ifnull          160
			{
				obj1 = ((zzsb) (obj1)).zzfn(zztr());
	//   46   97:aload_2         
	//   47   98:aload_0         
	//   48   99:invokevirtual   #234 <Method String zztr()>
	//   49  102:invokeinterface #237 <Method Object zzsb.zzfn(String)>
	//   50  107:astore_2        
				if(obj1 != null)
	//*  51  108:aload_2         
	//*  52  109:ifnull          160
					return zzs(obj1);
	//   53  112:aload_0         
	//   54  113:aload_2         
	//   55  114:invokevirtual   #241 <Method Object zzs(Object)>
	//   56  117:areturn         
			}
		} else
		{
			String s = String.valueOf(((Object) (zztr())));
	//   57  118:aload_0         
	//   58  119:invokevirtual   #234 <Method String zztr()>
	//   59  122:invokestatic    #181 <Method String String.valueOf(Object)>
	//   60  125:astore_2        
			if(s.length() != 0)
	//*  61  126:aload_2         
	//*  62  127:invokevirtual   #184 <Method int String.length()>
	//*  63  130:ifeq            143
				s = "Bypass reading Phenotype values for flag: ".concat(s);
	//   64  133:ldc1            #243 <String "Bypass reading Phenotype values for flag: ">
	//   65  135:aload_2         
	//   66  136:invokevirtual   #187 <Method String String.concat(String)>
	//   67  139:astore_2        
			else
	//*  68  140:goto            153
				s = new String("Bypass reading Phenotype values for flag: ");
	//   69  143:new             #174 <Class String>
	//   70  146:dup             
	//   71  147:ldc1            #243 <String "Bypass reading Phenotype values for flag: ">
	//   72  149:invokespecial   #188 <Method void String(String)>
	//   73  152:astore_2        
			Log.w("PhenotypeFlag", s);
	//   74  153:ldc1            #245 <String "PhenotypeFlag">
	//   75  155:aload_2         
	//   76  156:invokestatic    #251 <Method int Log.w(String, String)>
	//   77  159:pop             
		}
		return ((Object) (null));
	//   78  160:aconst_null     
	//   79  161:areturn         
	}

	private final Object zztt()
	{
		Object obj = ((Object) (zzbro));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzso zzbro>
	//    2    4:astore_1        
		obj = ((zzsb) (zzse.zzad(zzri))).zzfn(zzfr(zzso.zzc(zzbro)));
	//    3    5:getstatic       #34  <Field Context zzri>
	//    4    8:invokestatic    #196 <Method zzse zzse.zzad(Context)>
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #53  <Field zzso zzbro>
	//    8   16:invokestatic    #258 <Method String zzso.zzc(zzso)>
	//    9   19:invokespecial   #260 <Method String zzfr(String)>
	//   10   22:invokeinterface #237 <Method Object zzsb.zzfn(String)>
	//   11   27:astore_1        
		if(obj != null)
	//*  12   28:aload_1         
	//*  13   29:ifnull          38
			return zzs(obj);
	//   14   32:aload_0         
	//   15   33:aload_1         
	//   16   34:invokevirtual   #241 <Method Object zzs(Object)>
	//   17   37:areturn         
		else
			return ((Object) (null));
	//   18   38:aconst_null     
	//   19   39:areturn         
	}

	public final Object get()
	{
		int i;
		i = zzbrq.get();
	//    0    0:getstatic       #41  <Field AtomicInteger zzbrq>
	//    1    3:invokevirtual   #263 <Method int AtomicInteger.get()>
	//    2    6:istore_1        
		if(zzbrr >= i)
			break MISSING_BLOCK_LABEL_99;
	//    3    7:aload_0         
	//    4    8:getfield        #45  <Field int zzbrr>
	//    5   11:iload_1         
	//    6   12:icmpge          99
		this;
	//    7   15:aload_0         
		JVM INSTR monitorenter ;
	//    8   16:monitorenter    
		Object obj;
		if(zzbrr >= i)
			break MISSING_BLOCK_LABEL_89;
	//    9   17:aload_0         
	//   10   18:getfield        #45  <Field int zzbrr>
	//   11   21:iload_1         
	//   12   22:icmpge          89
		if(zzri == null)
			break MISSING_BLOCK_LABEL_78;
	//   13   25:getstatic       #34  <Field Context zzri>
	//   14   28:ifnull          78
		obj = ((Object) (zzbro));
	//   15   31:aload_0         
	//   16   32:getfield        #53  <Field zzso zzbro>
	//   17   35:astore_2        
		obj = zzts();
	//   18   36:aload_0         
	//   19   37:invokespecial   #265 <Method Object zzts()>
	//   20   40:astore_2        
		if(obj != null)
	//*  21   41:aload_2         
	//*  22   42:ifnull          48
			break MISSING_BLOCK_LABEL_65;
	//   23   45:goto            65
		obj = zztt();
	//   24   48:aload_0         
	//   25   49:invokespecial   #267 <Method Object zztt()>
	//   26   52:astore_2        
		if(obj != null)
	//*  27   53:aload_2         
	//*  28   54:ifnull          60
			break MISSING_BLOCK_LABEL_65;
	//   29   57:goto            65
		obj = zzbrp;
	//   30   60:aload_0         
	//   31   61:getfield        #57  <Field Object zzbrp>
	//   32   64:astore_2        
		zzalj = obj;
	//   33   65:aload_0         
	//   34   66:aload_2         
	//   35   67:putfield        #269 <Field Object zzalj>
		zzbrr = i;
	//   36   70:aload_0         
	//   37   71:iload_1         
	//   38   72:putfield        #45  <Field int zzbrr>
		break MISSING_BLOCK_LABEL_89;
	//   39   75:goto            89
		throw new IllegalStateException("Must call PhenotypeFlag.init() first");
	//   40   78:new             #271 <Class IllegalStateException>
	//   41   81:dup             
	//   42   82:ldc2            #273 <String "Must call PhenotypeFlag.init() first">
	//   43   85:invokespecial   #274 <Method void IllegalStateException(String)>
	//   44   88:athrow          
		this;
	//   45   89:aload_0         
		JVM INSTR monitorexit ;
	//   46   90:monitorexit     
		break MISSING_BLOCK_LABEL_99;
	//   47   91:goto            99
		Exception exception;
		exception;
	//   48   94:astore_2        
		this;
	//   49   95:aload_0         
		JVM INSTR monitorexit ;
	//   50   96:monitorexit     
		throw exception;
	//   51   97:aload_2         
	//   52   98:athrow          
		return zzalj;
	//   53   99:aload_0         
	//   54  100:getfield        #269 <Field Object zzalj>
	//   55  103:areturn         
	}

	public final Object getDefaultValue()
	{
		return zzbrp;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Object zzbrp>
	//    2    4:areturn         
	}

	abstract Object zzs(Object obj);

	public final String zztr()
	{
		return zzfr(zzso.zzb(zzbro));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #53  <Field zzso zzbro>
	//    3    5:invokestatic    #277 <Method String zzso.zzb(zzso)>
	//    4    8:invokespecial   #260 <Method String zzfr(String)>
	//    5   11:areturn         
	}

	private static final Object zzbrm = new Object();
	private static boolean zzbrn = false;
	private static final AtomicInteger zzbrq = new AtomicInteger();
	private static Context zzri = null;
	private final String name;
	private volatile Object zzalj;
	private final zzso zzbro;
	private final Object zzbrp;
	private volatile int zzbrr;

	static 
	{
	//    0    0:new             #5   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void Object()>
	//    3    7:putstatic       #32  <Field Object zzbrm>
	//    4   10:aconst_null     
	//    5   11:putstatic       #34  <Field Context zzri>
	//    6   14:iconst_0        
	//    7   15:putstatic       #36  <Field boolean zzbrn>
	//    8   18:new             #38  <Class AtomicInteger>
	//    9   21:dup             
	//   10   22:invokespecial   #39  <Method void AtomicInteger()>
	//   11   25:putstatic       #41  <Field AtomicInteger zzbrq>
	//*  12   28:return          
	}
}
