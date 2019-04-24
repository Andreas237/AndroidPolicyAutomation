// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzauh, zzaup, zzaum, zzaxr, 
//			zzaxl, zzaxi, zzaxn, zzaug, 
//			zzbah, zzaua, zzbcu

public final class zzauo
{

	public zzauo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
	//    2    4:return          
	}

	public static zzaum zza(zzauh zzauh1, zzaug zzaug1)
		throws GeneralSecurityException
	{
		zzaup.zzc(zzauh1.zzwg());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method zzaxr zzauh.zzwg()>
	//    2    4:invokestatic    #58  <Method void zzaup.zzc(zzaxr)>
		zzaug1 = ((zzaug) (new zzaum()));
	//    3    7:new             #60  <Class zzaum>
	//    4   10:dup             
	//    5   11:invokespecial   #61  <Method void zzaum()>
	//    6   14:astore_1        
		Iterator iterator = zzauh1.zzwg().zzzl().iterator();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #52  <Method zzaxr zzauh.zzwg()>
	//    9   19:invokevirtual   #67  <Method List zzaxr.zzzl()>
	//   10   22:invokeinterface #73  <Method Iterator List.iterator()>
	//   11   27:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   12   28:aload_2         
	//   13   29:invokeinterface #79  <Method boolean Iterator.hasNext()>
	//   14   34:ifeq            104
			zzaxr.zzb zzb1 = (zzaxr.zzb)iterator.next();
	//   15   37:aload_2         
	//   16   38:invokeinterface #83  <Method Object Iterator.next()>
	//   17   43:checkcast       #85  <Class zzaxr$zzb>
	//   18   46:astore_3        
			if(zzb1.zzzq() == zzaxl.zzdle)
	//*  19   47:aload_3         
	//*  20   48:invokevirtual   #89  <Method zzaxl zzaxr$zzb.zzzq()>
	//*  21   51:getstatic       #95  <Field zzaxl zzaxl.zzdle>
	//*  22   54:if_acmpne       28
			{
				zzaun zzaun = ((zzaum) (zzaug1)).zza(zza(zzb1.zzzp().zzyw(), zzb1.zzzp().zzyx()), zzb1);
	//   23   57:aload_1         
	//   24   58:aload_3         
	//   25   59:invokevirtual   #99  <Method zzaxi zzaxr$zzb.zzzp()>
	//   26   62:invokevirtual   #104 <Method String zzaxi.zzyw()>
	//   27   65:aload_3         
	//   28   66:invokevirtual   #99  <Method zzaxi zzaxr$zzb.zzzp()>
	//   29   69:invokevirtual   #108 <Method zzbah zzaxi.zzyx()>
	//   30   72:invokestatic    #111 <Method Object zza(String, zzbah)>
	//   31   75:aload_3         
	//   32   76:invokevirtual   #114 <Method zzaun zzaum.zza(Object, zzaxr$zzb)>
	//   33   79:astore          4
				if(zzb1.zzzr() == zzauh1.zzwg().zzzk())
	//*  34   81:aload_3         
	//*  35   82:invokevirtual   #118 <Method int zzaxr$zzb.zzzr()>
	//*  36   85:aload_0         
	//*  37   86:invokevirtual   #52  <Method zzaxr zzauh.zzwg()>
	//*  38   89:invokevirtual   #121 <Method int zzaxr.zzzk()>
	//*  39   92:icmpne          28
					((zzaum) (zzaug1)).zza(zzaun);
	//   40   95:aload_1         
	//   41   96:aload           4
	//   42   98:invokevirtual   #124 <Method void zzaum.zza(zzaun)>
			}
		} while(true);
	//   43  101:goto            28
		return ((zzaum) (zzaug1));
	//   44  104:aload_1         
	//   45  105:areturn         
	}

	public static zzaxi zza(zzaxn zzaxn1)
		throws GeneralSecurityException
	{
		zzaug zzaug1 = zzdz(zzaxn1.zzyw());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #131 <Method String zzaxn.zzyw()>
	//    2    4:invokestatic    #135 <Method zzaug zzdz(String)>
	//    3    7:astore_1        
		if(((Boolean)zzdhr.get(((Object) (zzaxn1.zzyw())))).booleanValue())
	//*   4    8:getstatic       #38  <Field ConcurrentMap zzdhr>
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #131 <Method String zzaxn.zzyw()>
	//*   7   15:invokeinterface #141 <Method Object ConcurrentMap.get(Object)>
	//*   8   20:checkcast       #143 <Class Boolean>
	//*   9   23:invokevirtual   #146 <Method boolean Boolean.booleanValue()>
	//*  10   26:ifeq            40
			return zzaug1.zzc(zzaxn1.zzyx());
	//   11   29:aload_1         
	//   12   30:aload_0         
	//   13   31:invokevirtual   #147 <Method zzbah zzaxn.zzyx()>
	//   14   34:invokeinterface #152 <Method zzaxi zzaug.zzc(zzbah)>
	//   15   39:areturn         
		zzaxn1 = ((zzaxn) (String.valueOf(((Object) (zzaxn1.zzyw())))));
	//   16   40:aload_0         
	//   17   41:invokevirtual   #131 <Method String zzaxn.zzyw()>
	//   18   44:invokestatic    #158 <Method String String.valueOf(Object)>
	//   19   47:astore_0        
		if(((String) (zzaxn1)).length() != 0)
	//*  20   48:aload_0         
	//*  21   49:invokevirtual   #161 <Method int String.length()>
	//*  22   52:ifeq            65
			zzaxn1 = ((zzaxn) ("newKey-operation not permitted for key type ".concat(((String) (zzaxn1)))));
	//   23   55:ldc1            #163 <String "newKey-operation not permitted for key type ">
	//   24   57:aload_0         
	//   25   58:invokevirtual   #167 <Method String String.concat(String)>
	//   26   61:astore_0        
		else
	//*  27   62:goto            75
			zzaxn1 = ((zzaxn) (new String("newKey-operation not permitted for key type ")));
	//   28   65:new             #154 <Class String>
	//   29   68:dup             
	//   30   69:ldc1            #163 <String "newKey-operation not permitted for key type ">
	//   31   71:invokespecial   #170 <Method void String(String)>
	//   32   74:astore_0        
		throw new GeneralSecurityException(((String) (zzaxn1)));
	//   33   75:new             #46  <Class GeneralSecurityException>
	//   34   78:dup             
	//   35   79:aload_0         
	//   36   80:invokespecial   #171 <Method void GeneralSecurityException(String)>
	//   37   83:athrow          
	}

	public static zzbcu zza(String s, zzbcu zzbcu)
		throws GeneralSecurityException
	{
		zzaug zzaug1 = zzdz(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #135 <Method zzaug zzdz(String)>
	//    2    4:astore_2        
		if(((Boolean)zzdhr.get(((Object) (s)))).booleanValue())
	//*   3    5:getstatic       #38  <Field ConcurrentMap zzdhr>
	//*   4    8:aload_0         
	//*   5    9:invokeinterface #141 <Method Object ConcurrentMap.get(Object)>
	//*   6   14:checkcast       #143 <Class Boolean>
	//*   7   17:invokevirtual   #146 <Method boolean Boolean.booleanValue()>
	//*   8   20:ifeq            31
			return zzaug1.zzb(zzbcu);
	//    9   23:aload_2         
	//   10   24:aload_1         
	//   11   25:invokeinterface #177 <Method zzbcu zzaug.zzb(zzbcu)>
	//   12   30:areturn         
		s = String.valueOf(((Object) (s)));
	//   13   31:aload_0         
	//   14   32:invokestatic    #158 <Method String String.valueOf(Object)>
	//   15   35:astore_0        
		if(s.length() != 0)
	//*  16   36:aload_0         
	//*  17   37:invokevirtual   #161 <Method int String.length()>
	//*  18   40:ifeq            53
			s = "newKey-operation not permitted for key type ".concat(s);
	//   19   43:ldc1            #163 <String "newKey-operation not permitted for key type ">
	//   20   45:aload_0         
	//   21   46:invokevirtual   #167 <Method String String.concat(String)>
	//   22   49:astore_0        
		else
	//*  23   50:goto            63
			s = new String("newKey-operation not permitted for key type ");
	//   24   53:new             #154 <Class String>
	//   25   56:dup             
	//   26   57:ldc1            #163 <String "newKey-operation not permitted for key type ">
	//   27   59:invokespecial   #170 <Method void String(String)>
	//   28   62:astore_0        
		throw new GeneralSecurityException(s);
	//   29   63:new             #46  <Class GeneralSecurityException>
	//   30   66:dup             
	//   31   67:aload_0         
	//   32   68:invokespecial   #171 <Method void GeneralSecurityException(String)>
	//   33   71:athrow          
	}

	private static Object zza(String s, zzbah zzbah1)
		throws GeneralSecurityException
	{
		return zzdz(s).zza(zzbah1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #135 <Method zzaug zzdz(String)>
	//    2    4:aload_1         
	//    3    5:invokeinterface #181 <Method Object zzaug.zza(zzbah)>
	//    4   10:areturn         
	}

	public static Object zza(String s, byte abyte0[])
		throws GeneralSecurityException
	{
		return zza(s, zzbah.zzo(abyte0));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #189 <Method zzbah zzbah.zzo(byte[])>
	//    3    5:invokestatic    #111 <Method Object zza(String, zzbah)>
	//    4    8:areturn         
	}

	public static void zza(String s, zzaua zzaua1)
		throws GeneralSecurityException
	{
		com/google/android/gms/internal/ads/zzauo;
	//    0    0:ldc1            #2   <Class zzauo>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Object obj;
		Level level;
		if(!zzdhs.containsKey(((Object) (s.toLowerCase()))))
			break MISSING_BLOCK_LABEL_148;
	//    2    3:getstatic       #40  <Field ConcurrentMap zzdhs>
	//    3    6:aload_0         
	//    4    7:invokevirtual   #194 <Method String String.toLowerCase()>
	//    5   10:invokeinterface #198 <Method boolean ConcurrentMap.containsKey(Object)>
	//    6   15:ifeq            148
		obj = ((Object) ((zzaua)zzdhs.get(((Object) (s.toLowerCase())))));
	//    7   18:getstatic       #40  <Field ConcurrentMap zzdhs>
	//    8   21:aload_0         
	//    9   22:invokevirtual   #194 <Method String String.toLowerCase()>
	//   10   25:invokeinterface #141 <Method Object ConcurrentMap.get(Object)>
	//   11   30:checkcast       #200 <Class zzaua>
	//   12   33:astore_2        
		if(((Object) (((Object) (zzaua1)).getClass())).equals(((Object) (obj.getClass()))))
			break MISSING_BLOCK_LABEL_148;
	//   13   34:aload_1         
	//   14   35:invokevirtual   #204 <Method Class Object.getClass()>
	//   15   38:aload_2         
	//   16   39:invokevirtual   #204 <Method Class Object.getClass()>
	//   17   42:invokevirtual   #207 <Method boolean Object.equals(Object)>
	//   18   45:ifne            148
		obj = ((Object) (logger));
	//   19   48:getstatic       #29  <Field Logger logger>
	//   20   51:astore_2        
		level = Level.WARNING;
	//   21   52:getstatic       #213 <Field Level Level.WARNING>
	//   22   55:astore_3        
		zzaua1 = ((zzaua) (String.valueOf(((Object) (s)))));
	//   23   56:aload_0         
	//   24   57:invokestatic    #158 <Method String String.valueOf(Object)>
	//   25   60:astore_1        
		if(((String) (zzaua1)).length() != 0)
	//*  26   61:aload_1         
	//*  27   62:invokevirtual   #161 <Method int String.length()>
	//*  28   65:ifeq            78
		{
			zzaua1 = ((zzaua) ("Attempted overwrite of a catalogueName catalogue for name ".concat(((String) (zzaua1)))));
	//   29   68:ldc1            #215 <String "Attempted overwrite of a catalogueName catalogue for name ">
	//   30   70:aload_1         
	//   31   71:invokevirtual   #167 <Method String String.concat(String)>
	//   32   74:astore_1        
			break MISSING_BLOCK_LABEL_88;
	//   33   75:goto            88
		}
		zzaua1 = ((zzaua) (new String("Attempted overwrite of a catalogueName catalogue for name ")));
	//   34   78:new             #154 <Class String>
	//   35   81:dup             
	//   36   82:ldc1            #215 <String "Attempted overwrite of a catalogueName catalogue for name ">
	//   37   84:invokespecial   #170 <Method void String(String)>
	//   38   87:astore_1        
		((Logger) (obj)).logp(level, "com.google.crypto.tink.Registry", "addCatalogue", ((String) (zzaua1)));
	//   39   88:aload_2         
	//   40   89:aload_3         
	//   41   90:ldc1            #217 <String "com.google.crypto.tink.Registry">
	//   42   92:ldc1            #219 <String "addCatalogue">
	//   43   94:aload_1         
	//   44   95:invokevirtual   #223 <Method void Logger.logp(Level, String, String, String)>
		zzaua1 = ((zzaua) (new StringBuilder(47 + String.valueOf(((Object) (s))).length())));
	//   45   98:new             #225 <Class StringBuilder>
	//   46  101:dup             
	//   47  102:bipush          47
	//   48  104:aload_0         
	//   49  105:invokestatic    #158 <Method String String.valueOf(Object)>
	//   50  108:invokevirtual   #161 <Method int String.length()>
	//   51  111:iadd            
	//   52  112:invokespecial   #228 <Method void StringBuilder(int)>
	//   53  115:astore_1        
		((StringBuilder) (zzaua1)).append("catalogue for name ");
	//   54  116:aload_1         
	//   55  117:ldc1            #230 <String "catalogue for name ">
	//   56  119:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   57  122:pop             
		((StringBuilder) (zzaua1)).append(s);
	//   58  123:aload_1         
	//   59  124:aload_0         
	//   60  125:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   61  128:pop             
		((StringBuilder) (zzaua1)).append(" has been already registered");
	//   62  129:aload_1         
	//   63  130:ldc1            #236 <String " has been already registered">
	//   64  132:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   65  135:pop             
		throw new GeneralSecurityException(((StringBuilder) (zzaua1)).toString());
	//   66  136:new             #46  <Class GeneralSecurityException>
	//   67  139:dup             
	//   68  140:aload_1         
	//   69  141:invokevirtual   #239 <Method String StringBuilder.toString()>
	//   70  144:invokespecial   #171 <Method void GeneralSecurityException(String)>
	//   71  147:athrow          
		zzdhs.put(((Object) (s.toLowerCase())), ((Object) (zzaua1)));
	//   72  148:getstatic       #40  <Field ConcurrentMap zzdhs>
	//   73  151:aload_0         
	//   74  152:invokevirtual   #194 <Method String String.toLowerCase()>
	//   75  155:aload_1         
	//   76  156:invokeinterface #243 <Method Object ConcurrentMap.put(Object, Object)>
	//   77  161:pop             
		com/google/android/gms/internal/ads/zzauo;
	//   78  162:ldc1            #2   <Class zzauo>
		JVM INSTR monitorexit ;
	//   79  164:monitorexit     
		return;
	//   80  165:return          
		s;
	//   81  166:astore_0        
	//*  82  167:ldc1            #2   <Class zzauo>
		throw s;
	//   83  169:monitorexit     
	//   84  170:aload_0         
	//   85  171:athrow          
	}

	public static void zza(String s, zzaug zzaug1)
		throws GeneralSecurityException
	{
		zza(s, zzaug1, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokestatic    #248 <Method void zza(String, zzaug, boolean)>
	//    4    6:return          
	}

	public static void zza(String s, zzaug zzaug1, boolean flag)
		throws GeneralSecurityException
	{
		com/google/android/gms/internal/ads/zzauo;
	//    0    0:ldc1            #2   <Class zzauo>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(zzaug1 != null)
			break MISSING_BLOCK_LABEL_17;
	//    2    3:aload_1         
	//    3    4:ifnonnull       17
		throw new IllegalArgumentException("key manager must be non-null.");
	//    4    7:new             #251 <Class IllegalArgumentException>
	//    5   10:dup             
	//    6   11:ldc1            #253 <String "key manager must be non-null.">
	//    7   13:invokespecial   #254 <Method void IllegalArgumentException(String)>
	//    8   16:athrow          
		boolean flag1;
		zzaug zzaug2;
		if(!zzdhq.containsKey(((Object) (s))))
			break MISSING_BLOCK_LABEL_180;
	//    9   17:getstatic       #36  <Field ConcurrentMap zzdhq>
	//   10   20:aload_0         
	//   11   21:invokeinterface #198 <Method boolean ConcurrentMap.containsKey(Object)>
	//   12   26:ifeq            180
		zzaug2 = zzdz(s);
	//   13   29:aload_0         
	//   14   30:invokestatic    #135 <Method zzaug zzdz(String)>
	//   15   33:astore          5
		flag1 = ((Boolean)zzdhr.get(((Object) (s)))).booleanValue();
	//   16   35:getstatic       #38  <Field ConcurrentMap zzdhr>
	//   17   38:aload_0         
	//   18   39:invokeinterface #141 <Method Object ConcurrentMap.get(Object)>
	//   19   44:checkcast       #143 <Class Boolean>
	//   20   47:invokevirtual   #146 <Method boolean Boolean.booleanValue()>
	//   21   50:istore_3        
		if(((Object) (((Object) (zzaug1)).getClass())).equals(((Object) (((Object) (zzaug2)).getClass()))) && (flag1 || !flag))
			break MISSING_BLOCK_LABEL_180;
	//   22   51:aload_1         
	//   23   52:invokevirtual   #204 <Method Class Object.getClass()>
	//   24   55:aload           5
	//   25   57:invokevirtual   #204 <Method Class Object.getClass()>
	//   26   60:invokevirtual   #207 <Method boolean Object.equals(Object)>
	//   27   63:ifeq            74
	//   28   66:iload_3         
	//   29   67:ifne            180
	//   30   70:iload_2         
	//   31   71:ifeq            180
		String s1;
		Logger logger1;
		Level level;
		logger1 = logger;
	//   32   74:getstatic       #29  <Field Logger logger>
	//   33   77:astore          6
		level = Level.WARNING;
	//   34   79:getstatic       #213 <Field Level Level.WARNING>
	//   35   82:astore          7
		s1 = String.valueOf(((Object) (s)));
	//   36   84:aload_0         
	//   37   85:invokestatic    #158 <Method String String.valueOf(Object)>
	//   38   88:astore          4
		if(s1.length() != 0)
	//*  39   90:aload           4
	//*  40   92:invokevirtual   #161 <Method int String.length()>
	//*  41   95:ifeq            111
		{
			s1 = "Attempted overwrite of a registered key manager for key type ".concat(s1);
	//   42   98:ldc2            #256 <String "Attempted overwrite of a registered key manager for key type ">
	//   43  101:aload           4
	//   44  103:invokevirtual   #167 <Method String String.concat(String)>
	//   45  106:astore          4
			break MISSING_BLOCK_LABEL_123;
	//   46  108:goto            123
		}
		s1 = new String("Attempted overwrite of a registered key manager for key type ");
	//   47  111:new             #154 <Class String>
	//   48  114:dup             
	//   49  115:ldc2            #256 <String "Attempted overwrite of a registered key manager for key type ">
	//   50  118:invokespecial   #170 <Method void String(String)>
	//   51  121:astore          4
		logger1.logp(level, "com.google.crypto.tink.Registry", "registerKeyManager", s1);
	//   52  123:aload           6
	//   53  125:aload           7
	//   54  127:ldc1            #217 <String "com.google.crypto.tink.Registry">
	//   55  129:ldc2            #258 <String "registerKeyManager">
	//   56  132:aload           4
	//   57  134:invokevirtual   #223 <Method void Logger.logp(Level, String, String, String)>
		throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[] {
			s, ((Object) (zzaug2)).getClass().getName(), ((Object) (zzaug1)).getClass().getName()
		}));
	//   58  137:new             #46  <Class GeneralSecurityException>
	//   59  140:dup             
	//   60  141:ldc2            #260 <String "typeUrl (%s) is already registered with %s, cannot be re-registered with %s">
	//   61  144:iconst_3        
	//   62  145:anewarray       Object[]
	//   63  148:dup             
	//   64  149:iconst_0        
	//   65  150:aload_0         
	//   66  151:aastore         
	//   67  152:dup             
	//   68  153:iconst_1        
	//   69  154:aload           5
	//   70  156:invokevirtual   #204 <Method Class Object.getClass()>
	//   71  159:invokevirtual   #21  <Method String Class.getName()>
	//   72  162:aastore         
	//   73  163:dup             
	//   74  164:iconst_2        
	//   75  165:aload_1         
	//   76  166:invokevirtual   #204 <Method Class Object.getClass()>
	//   77  169:invokevirtual   #21  <Method String Class.getName()>
	//   78  172:aastore         
	//   79  173:invokestatic    #264 <Method String String.format(String, Object[])>
	//   80  176:invokespecial   #171 <Method void GeneralSecurityException(String)>
	//   81  179:athrow          
		zzdhq.put(((Object) (s)), ((Object) (zzaug1)));
	//   82  180:getstatic       #36  <Field ConcurrentMap zzdhq>
	//   83  183:aload_0         
	//   84  184:aload_1         
	//   85  185:invokeinterface #243 <Method Object ConcurrentMap.put(Object, Object)>
	//   86  190:pop             
		zzdhr.put(((Object) (s)), ((Object) (Boolean.valueOf(flag))));
	//   87  191:getstatic       #38  <Field ConcurrentMap zzdhr>
	//   88  194:aload_0         
	//   89  195:iload_2         
	//   90  196:invokestatic    #267 <Method Boolean Boolean.valueOf(boolean)>
	//   91  199:invokeinterface #243 <Method Object ConcurrentMap.put(Object, Object)>
	//   92  204:pop             
		com/google/android/gms/internal/ads/zzauo;
	//   93  205:ldc1            #2   <Class zzauo>
		JVM INSTR monitorexit ;
	//   94  207:monitorexit     
		return;
	//   95  208:return          
	//*  96  209:ldc1            #2   <Class zzauo>
_L2:
		throw s;
	//   97  211:monitorexit     
	//   98  212:aload_0         
	//   99  213:athrow          
		s;
	//  100  214:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//* 101  215:goto            209
	}

	public static zzbcu zzb(zzaxn zzaxn1)
		throws GeneralSecurityException
	{
		zzaug zzaug1 = zzdz(zzaxn1.zzyw());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #131 <Method String zzaxn.zzyw()>
	//    2    4:invokestatic    #135 <Method zzaug zzdz(String)>
	//    3    7:astore_1        
		if(((Boolean)zzdhr.get(((Object) (zzaxn1.zzyw())))).booleanValue())
	//*   4    8:getstatic       #38  <Field ConcurrentMap zzdhr>
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #131 <Method String zzaxn.zzyw()>
	//*   7   15:invokeinterface #141 <Method Object ConcurrentMap.get(Object)>
	//*   8   20:checkcast       #143 <Class Boolean>
	//*   9   23:invokevirtual   #146 <Method boolean Boolean.booleanValue()>
	//*  10   26:ifeq            40
			return zzaug1.zzb(zzaxn1.zzyx());
	//   11   29:aload_1         
	//   12   30:aload_0         
	//   13   31:invokevirtual   #147 <Method zzbah zzaxn.zzyx()>
	//   14   34:invokeinterface #272 <Method zzbcu zzaug.zzb(zzbah)>
	//   15   39:areturn         
		zzaxn1 = ((zzaxn) (String.valueOf(((Object) (zzaxn1.zzyw())))));
	//   16   40:aload_0         
	//   17   41:invokevirtual   #131 <Method String zzaxn.zzyw()>
	//   18   44:invokestatic    #158 <Method String String.valueOf(Object)>
	//   19   47:astore_0        
		if(((String) (zzaxn1)).length() != 0)
	//*  20   48:aload_0         
	//*  21   49:invokevirtual   #161 <Method int String.length()>
	//*  22   52:ifeq            65
			zzaxn1 = ((zzaxn) ("newKey-operation not permitted for key type ".concat(((String) (zzaxn1)))));
	//   23   55:ldc1            #163 <String "newKey-operation not permitted for key type ">
	//   24   57:aload_0         
	//   25   58:invokevirtual   #167 <Method String String.concat(String)>
	//   26   61:astore_0        
		else
	//*  27   62:goto            75
			zzaxn1 = ((zzaxn) (new String("newKey-operation not permitted for key type ")));
	//   28   65:new             #154 <Class String>
	//   29   68:dup             
	//   30   69:ldc1            #163 <String "newKey-operation not permitted for key type ">
	//   31   71:invokespecial   #170 <Method void String(String)>
	//   32   74:astore_0        
		throw new GeneralSecurityException(((String) (zzaxn1)));
	//   33   75:new             #46  <Class GeneralSecurityException>
	//   34   78:dup             
	//   35   79:aload_0         
	//   36   80:invokespecial   #171 <Method void GeneralSecurityException(String)>
	//   37   83:athrow          
	}

	public static Object zzb(String s, zzbcu zzbcu)
		throws GeneralSecurityException
	{
		return zzdz(s).zza(zzbcu);
	//    0    0:aload_0         
	//    1    1:invokestatic    #135 <Method zzaug zzdz(String)>
	//    2    4:aload_1         
	//    3    5:invokeinterface #277 <Method Object zzaug.zza(zzbcu)>
	//    4   10:areturn         
	}

	public static zzaua zzdy(String s)
		throws GeneralSecurityException
	{
		Object obj;
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("catalogueName must be non-null.");
	//    2    4:new             #251 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #282 <String "catalogueName must be non-null.">
	//    5   11:invokespecial   #254 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		obj = ((Object) ((zzaua)zzdhs.get(((Object) (s.toLowerCase())))));
	//    7   15:getstatic       #40  <Field ConcurrentMap zzdhs>
	//    8   18:aload_0         
	//    9   19:invokevirtual   #194 <Method String String.toLowerCase()>
	//   10   22:invokeinterface #141 <Method Object ConcurrentMap.get(Object)>
	//   11   27:checkcast       #200 <Class zzaua>
	//   12   30:astore_1        
		if(obj != null)
			break MISSING_BLOCK_LABEL_275;
	//   13   31:aload_1         
	//   14   32:ifnonnull       275
		String s1 = String.format("no catalogue found for %s. ", new Object[] {
			s
		});
	//   15   35:ldc2            #284 <String "no catalogue found for %s. ">
	//   16   38:iconst_1        
	//   17   39:anewarray       Object[]
	//   18   42:dup             
	//   19   43:iconst_0        
	//   20   44:aload_0         
	//   21   45:aastore         
	//   22   46:invokestatic    #264 <Method String String.format(String, Object[])>
	//   23   49:astore_2        
		obj = ((Object) (s1));
	//   24   50:aload_2         
	//   25   51:astore_1        
		if(s.toLowerCase().startsWith("tinkaead"))
	//*  26   52:aload_0         
	//*  27   53:invokevirtual   #194 <Method String String.toLowerCase()>
	//*  28   56:ldc2            #286 <String "tinkaead">
	//*  29   59:invokevirtual   #290 <Method boolean String.startsWith(String)>
	//*  30   62:ifeq            76
			obj = ((Object) (String.valueOf(((Object) (s1))).concat("Maybe call AeadConfig.init().")));
	//   31   65:aload_2         
	//   32   66:invokestatic    #158 <Method String String.valueOf(Object)>
	//   33   69:ldc2            #292 <String "Maybe call AeadConfig.init().">
	//   34   72:invokevirtual   #167 <Method String String.concat(String)>
	//   35   75:astore_1        
		if(!s.toLowerCase().startsWith("tinkdeterministicaead")) goto _L2; else goto _L1
	//   36   76:aload_0         
	//   37   77:invokevirtual   #194 <Method String String.toLowerCase()>
	//   38   80:ldc2            #294 <String "tinkdeterministicaead">
	//   39   83:invokevirtual   #290 <Method boolean String.startsWith(String)>
	//   40   86:ifeq            107
_L1:
		obj = ((Object) (String.valueOf(obj)));
	//   41   89:aload_1         
	//   42   90:invokestatic    #158 <Method String String.valueOf(Object)>
	//   43   93:astore_1        
		s = "Maybe call DeterministicAeadConfig.init().";
	//   44   94:ldc2            #296 <String "Maybe call DeterministicAeadConfig.init().">
	//   45   97:astore_0        
_L4:
		Object obj1;
		obj1 = ((Object) (((String) (obj)).concat(s)));
	//   46   98:aload_1         
	//   47   99:aload_0         
	//   48  100:invokevirtual   #167 <Method String String.concat(String)>
	//   49  103:astore_2        
		break; /* Loop/switch isn't completed */
	//   50  104:goto            266
_L2:
		if(s.toLowerCase().startsWith("tinkstreamingaead"))
	//*  51  107:aload_0         
	//*  52  108:invokevirtual   #194 <Method String String.toLowerCase()>
	//*  53  111:ldc2            #298 <String "tinkstreamingaead">
	//*  54  114:invokevirtual   #290 <Method boolean String.startsWith(String)>
	//*  55  117:ifeq            132
		{
			obj = ((Object) (String.valueOf(obj)));
	//   56  120:aload_1         
	//   57  121:invokestatic    #158 <Method String String.valueOf(Object)>
	//   58  124:astore_1        
			s = "Maybe call StreamingAeadConfig.init().";
	//   59  125:ldc2            #300 <String "Maybe call StreamingAeadConfig.init().">
	//   60  128:astore_0        
			continue; /* Loop/switch isn't completed */
	//   61  129:goto            98
		}
		if(!s.toLowerCase().startsWith("tinkhybriddecrypt") && !s.toLowerCase().startsWith("tinkhybridencrypt"))
	//*  62  132:aload_0         
	//*  63  133:invokevirtual   #194 <Method String String.toLowerCase()>
	//*  64  136:ldc2            #302 <String "tinkhybriddecrypt">
	//*  65  139:invokevirtual   #290 <Method boolean String.startsWith(String)>
	//*  66  142:ifne            254
	//*  67  145:aload_0         
	//*  68  146:invokevirtual   #194 <Method String String.toLowerCase()>
	//*  69  149:ldc2            #304 <String "tinkhybridencrypt">
	//*  70  152:invokevirtual   #290 <Method boolean String.startsWith(String)>
	//*  71  155:ifeq            161
	//*  72  158:goto            254
		{
			if(s.toLowerCase().startsWith("tinkmac"))
	//*  73  161:aload_0         
	//*  74  162:invokevirtual   #194 <Method String String.toLowerCase()>
	//*  75  165:ldc2            #306 <String "tinkmac">
	//*  76  168:invokevirtual   #290 <Method boolean String.startsWith(String)>
	//*  77  171:ifeq            186
			{
				obj = ((Object) (String.valueOf(obj)));
	//   78  174:aload_1         
	//   79  175:invokestatic    #158 <Method String String.valueOf(Object)>
	//   80  178:astore_1        
				s = "Maybe call MacConfig.init().";
	//   81  179:ldc2            #308 <String "Maybe call MacConfig.init().">
	//   82  182:astore_0        
				continue; /* Loop/switch isn't completed */
	//   83  183:goto            98
			}
			if(!s.toLowerCase().startsWith("tinkpublickeysign") && !s.toLowerCase().startsWith("tinkpublickeyverify"))
	//*  84  186:aload_0         
	//*  85  187:invokevirtual   #194 <Method String String.toLowerCase()>
	//*  86  190:ldc2            #310 <String "tinkpublickeysign">
	//*  87  193:invokevirtual   #290 <Method boolean String.startsWith(String)>
	//*  88  196:ifne            242
	//*  89  199:aload_0         
	//*  90  200:invokevirtual   #194 <Method String String.toLowerCase()>
	//*  91  203:ldc2            #312 <String "tinkpublickeyverify">
	//*  92  206:invokevirtual   #290 <Method boolean String.startsWith(String)>
	//*  93  209:ifeq            215
	//*  94  212:goto            242
			{
				obj1 = obj;
	//   95  215:aload_1         
	//   96  216:astore_2        
				if(!s.toLowerCase().startsWith("tink"))
					break; /* Loop/switch isn't completed */
	//   97  217:aload_0         
	//   98  218:invokevirtual   #194 <Method String String.toLowerCase()>
	//   99  221:ldc2            #314 <String "tink">
	//  100  224:invokevirtual   #290 <Method boolean String.startsWith(String)>
	//  101  227:ifeq            266
				obj = ((Object) (String.valueOf(obj)));
	//  102  230:aload_1         
	//  103  231:invokestatic    #158 <Method String String.valueOf(Object)>
	//  104  234:astore_1        
				s = "Maybe call TinkConfig.init().";
	//  105  235:ldc2            #316 <String "Maybe call TinkConfig.init().">
	//  106  238:astore_0        
			} else
	//* 107  239:goto            98
			{
				obj = ((Object) (String.valueOf(obj)));
	//  108  242:aload_1         
	//  109  243:invokestatic    #158 <Method String String.valueOf(Object)>
	//  110  246:astore_1        
				s = "Maybe call SignatureConfig.init().";
	//  111  247:ldc2            #318 <String "Maybe call SignatureConfig.init().">
	//  112  250:astore_0        
			}
		} else
	//* 113  251:goto            98
		{
			obj = ((Object) (String.valueOf(obj)));
	//  114  254:aload_1         
	//  115  255:invokestatic    #158 <Method String String.valueOf(Object)>
	//  116  258:astore_1        
			s = "Maybe call HybridConfig.init().";
	//  117  259:ldc2            #320 <String "Maybe call HybridConfig.init().">
	//  118  262:astore_0        
		}
		if(true) goto _L4; else goto _L3
	//  119  263:goto            98
_L3:
		throw new GeneralSecurityException(((String) (obj1)));
	//  120  266:new             #46  <Class GeneralSecurityException>
	//  121  269:dup             
	//  122  270:aload_2         
	//  123  271:invokespecial   #171 <Method void GeneralSecurityException(String)>
	//  124  274:athrow          
		return ((zzaua) (obj));
	//  125  275:aload_1         
	//  126  276:areturn         
	}

	private static zzaug zzdz(String s)
		throws GeneralSecurityException
	{
		Object obj = ((Object) ((zzaug)zzdhq.get(((Object) (s)))));
	//    0    0:getstatic       #36  <Field ConcurrentMap zzdhq>
	//    1    3:aload_0         
	//    2    4:invokeinterface #141 <Method Object ConcurrentMap.get(Object)>
	//    3    9:checkcast       #149 <Class zzaug>
	//    4   12:astore_1        
		if(obj == null)
	//*   5   13:aload_1         
	//*   6   14:ifnonnull       69
		{
			obj = ((Object) (new StringBuilder(78 + String.valueOf(((Object) (s))).length())));
	//    7   17:new             #225 <Class StringBuilder>
	//    8   20:dup             
	//    9   21:bipush          78
	//   10   23:aload_0         
	//   11   24:invokestatic    #158 <Method String String.valueOf(Object)>
	//   12   27:invokevirtual   #161 <Method int String.length()>
	//   13   30:iadd            
	//   14   31:invokespecial   #228 <Method void StringBuilder(int)>
	//   15   34:astore_1        
			((StringBuilder) (obj)).append("No key manager found for key type: ");
	//   16   35:aload_1         
	//   17   36:ldc2            #323 <String "No key manager found for key type: ">
	//   18   39:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   19   42:pop             
			((StringBuilder) (obj)).append(s);
	//   20   43:aload_1         
	//   21   44:aload_0         
	//   22   45:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   23   48:pop             
			((StringBuilder) (obj)).append(".  Check the configuration of the registry.");
	//   24   49:aload_1         
	//   25   50:ldc2            #325 <String ".  Check the configuration of the registry.">
	//   26   53:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   27   56:pop             
			throw new GeneralSecurityException(((StringBuilder) (obj)).toString());
	//   28   57:new             #46  <Class GeneralSecurityException>
	//   29   60:dup             
	//   30   61:aload_1         
	//   31   62:invokevirtual   #239 <Method String StringBuilder.toString()>
	//   32   65:invokespecial   #171 <Method void GeneralSecurityException(String)>
	//   33   68:athrow          
		} else
		{
			return ((zzaug) (obj));
	//   34   69:aload_1         
	//   35   70:areturn         
		}
	}

	private static final Logger logger = Logger.getLogger(((Class) (com/google/android/gms/internal/ads/zzauo)).getName());
	private static final ConcurrentMap zzdhq = new ConcurrentHashMap();
	private static final ConcurrentMap zzdhr = new ConcurrentHashMap();
	private static final ConcurrentMap zzdhs = new ConcurrentHashMap();

	static 
	{
	//    0    0:ldc1            #2   <Class zzauo>
	//    1    2:invokevirtual   #21  <Method String Class.getName()>
	//    2    5:invokestatic    #27  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #29  <Field Logger logger>
	//    4   11:new             #31  <Class ConcurrentHashMap>
	//    5   14:dup             
	//    6   15:invokespecial   #34  <Method void ConcurrentHashMap()>
	//    7   18:putstatic       #36  <Field ConcurrentMap zzdhq>
	//    8   21:new             #31  <Class ConcurrentHashMap>
	//    9   24:dup             
	//   10   25:invokespecial   #34  <Method void ConcurrentHashMap()>
	//   11   28:putstatic       #38  <Field ConcurrentMap zzdhr>
	//   12   31:new             #31  <Class ConcurrentHashMap>
	//   13   34:dup             
	//   14   35:invokespecial   #34  <Method void ConcurrentHashMap()>
	//   15   38:putstatic       #40  <Field ConcurrentMap zzdhs>
	//*  16   41:return          
	}
}
