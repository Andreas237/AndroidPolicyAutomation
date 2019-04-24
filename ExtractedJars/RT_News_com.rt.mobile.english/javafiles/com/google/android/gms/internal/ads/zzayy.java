// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzazp, zzaza, zzaze, zzazg, 
//			zzazf, zzazb, zzazd, zzazc, 
//			zzayz

public final class zzayy
{

	private zzayy(zzayz zzayz1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #138 <Method void Object()>
		zzdog = zzayz1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #140 <Field zzayz zzdog>
		zzdoh = zzdny;
	//    5    9:aload_0         
	//    6   10:getstatic       #98  <Field List zzdny>
	//    7   13:putfield        #142 <Field List zzdoh>
		zzdoi = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #144 <Field boolean zzdoi>
	//   11   21:return          
	}

	private final boolean zza(String s, Provider provider)
	{
		try
		{
			zzdog.zzb(s, provider);
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field zzayz zzdog>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #156 <Method Object zzayz.zzb(String, Provider)>
	//    5   11:pop             
		}
	//*   6   12:iconst_1        
	//*   7   13:ireturn         
	//*   8   14:iconst_0        
	//*   9   15:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return false;
		}
		return true;
	//*  10   16:astore_1        
	//*  11   17:goto            14
	}

	public final Object zzek(String s)
		throws GeneralSecurityException
	{
		Object obj = ((Object) (zzdoh.iterator()));
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field List zzdoh>
	//    2    4:invokeinterface #164 <Method Iterator List.iterator()>
	//    3    9:astore_2        
_L4:
		if(!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
	//    4   10:aload_2         
	//    5   11:invokeinterface #169 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            52
_L1:
		Provider provider = (Provider)((Iterator) (obj)).next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #173 <Method Object Iterator.next()>
	//    9   25:checkcast       #175 <Class Provider>
	//   10   28:astore_3        
		if(!zza(s, provider)) goto _L4; else goto _L3
	//   11   29:aload_0         
	//   12   30:aload_1         
	//   13   31:aload_3         
	//   14   32:invokespecial   #177 <Method boolean zza(String, Provider)>
	//   15   35:ifeq            10
_L3:
		obj = ((Object) (zzdog));
	//   16   38:aload_0         
	//   17   39:getfield        #140 <Field zzayz zzdog>
	//   18   42:astore_2        
_L6:
		return ((zzayz) (obj)).zzb(s, provider);
	//   19   43:aload_2         
	//   20   44:aload_1         
	//   21   45:aload_3         
	//   22   46:invokeinterface #156 <Method Object zzayz.zzb(String, Provider)>
	//   23   51:areturn         
_L2:
		if(zzdoi)
	//*  24   52:aload_0         
	//*  25   53:getfield        #144 <Field boolean zzdoi>
	//*  26   56:ifeq            69
		{
			obj = ((Object) (zzdog));
	//   27   59:aload_0         
	//   28   60:getfield        #140 <Field zzayz zzdog>
	//   29   63:astore_2        
			provider = null;
	//   30   64:aconst_null     
	//   31   65:astore_3        
		} else
	//*  32   66:goto            43
		{
			throw new GeneralSecurityException("No good Provider found.");
	//   33   69:new             #160 <Class GeneralSecurityException>
	//   34   72:dup             
	//   35   73:ldc1            #179 <String "No good Provider found.">
	//   36   75:invokespecial   #182 <Method void GeneralSecurityException(String)>
	//   37   78:athrow          
		}
		if(true) goto _L6; else goto _L5
_L5:
	}

	private static final Logger logger;
	private static final List zzdny;
	public static final zzayy zzdnz = new zzayy(((zzayz) (new zzaza())));
	public static final zzayy zzdoa = new zzayy(((zzayz) (new zzaze())));
	private static final zzayy zzdob = new zzayy(((zzayz) (new zzazg())));
	private static final zzayy zzdoc = new zzayy(((zzayz) (new zzazf())));
	public static final zzayy zzdod = new zzayy(((zzayz) (new zzazb())));
	public static final zzayy zzdoe = new zzayy(((zzayz) (new zzazd())));
	public static final zzayy zzdof = new zzayy(((zzayz) (new zzazc())));
	private zzayz zzdog;
	private List zzdoh;
	private boolean zzdoi;

	static 
	{
		logger = Logger.getLogger(((Class) (com/google/android/gms/internal/ads/zzayy)).getName());
	//    0    0:ldc1            #2   <Class zzayy>
	//    1    2:invokevirtual   #39  <Method String Class.getName()>
	//    2    5:invokestatic    #45  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #47  <Field Logger logger>
		if(zzazp.zzaat())
	//*   4   11:invokestatic    #53  <Method boolean zzazp.zzaat()>
	//*   5   14:ifeq            109
		{
			ArrayList arraylist = new ArrayList();
	//    6   17:new             #55  <Class ArrayList>
	//    7   20:dup             
	//    8   21:invokespecial   #58  <Method void ArrayList()>
	//    9   24:astore_1        
			for(int i = 0; i < 2; i++)
	//*  10   25:iconst_0        
	//*  11   26:istore_0        
	//*  12   27:iload_0         
	//*  13   28:iconst_2        
	//*  14   29:icmpge          102
			{
				String s = (new String[] {
					"GmsCore_OpenSSL", "AndroidOpenSSL"
				})[i];
	//   15   32:iconst_2        
	//   16   33:anewarray       String[]
	//   17   36:dup             
	//   18   37:iconst_0        
	//   19   38:ldc1            #62  <String "GmsCore_OpenSSL">
	//   20   40:aastore         
	//   21   41:dup             
	//   22   42:iconst_1        
	//   23   43:ldc1            #64  <String "AndroidOpenSSL">
	//   24   45:aastore         
	//   25   46:iload_0         
	//   26   47:aaload          
	//   27   48:astore_2        
				Provider provider = Security.getProvider(s);
	//   28   49:aload_2         
	//   29   50:invokestatic    #70  <Method Provider Security.getProvider(String)>
	//   30   53:astore_3        
				if(provider != null)
	//*  31   54:aload_3         
	//*  32   55:ifnull          69
					((List) (arraylist)).add(((Object) (provider)));
	//   33   58:aload_1         
	//   34   59:aload_3         
	//   35   60:invokeinterface #76  <Method boolean List.add(Object)>
	//   36   65:pop             
				else
	//*  37   66:goto            95
					logger.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[] {
						s
					}));
	//   38   69:getstatic       #47  <Field Logger logger>
	//   39   72:getstatic       #82  <Field Level Level.INFO>
	//   40   75:ldc1            #84  <String "com.google.crypto.tink.subtle.EngineFactory">
	//   41   77:ldc1            #86  <String "toProviderList">
	//   42   79:ldc1            #88  <String "Provider %s not available">
	//   43   81:iconst_1        
	//   44   82:anewarray       Object[]
	//   45   85:dup             
	//   46   86:iconst_0        
	//   47   87:aload_2         
	//   48   88:aastore         
	//   49   89:invokestatic    #92  <Method String String.format(String, Object[])>
	//   50   92:invokevirtual   #96  <Method void Logger.logp(Level, String, String, String)>
			}

	//   51   95:iload_0         
	//   52   96:iconst_1        
	//   53   97:iadd            
	//   54   98:istore_0        
	//*  55   99:goto            27
			zzdny = ((List) (arraylist));
	//   56  102:aload_1         
	//   57  103:putstatic       #98  <Field List zzdny>
		} else
	//*  58  106:goto            119
		{
			zzdny = ((List) (new ArrayList()));
	//   59  109:new             #55  <Class ArrayList>
	//   60  112:dup             
	//   61  113:invokespecial   #58  <Method void ArrayList()>
	//   62  116:putstatic       #98  <Field List zzdny>
		}
	//   63  119:new             #2   <Class zzayy>
	//   64  122:dup             
	//   65  123:new             #100 <Class zzaza>
	//   66  126:dup             
	//   67  127:invokespecial   #101 <Method void zzaza()>
	//   68  130:invokespecial   #104 <Method void zzayy(zzayz)>
	//   69  133:putstatic       #106 <Field zzayy zzdnz>
	//   70  136:new             #2   <Class zzayy>
	//   71  139:dup             
	//   72  140:new             #108 <Class zzaze>
	//   73  143:dup             
	//   74  144:invokespecial   #109 <Method void zzaze()>
	//   75  147:invokespecial   #104 <Method void zzayy(zzayz)>
	//   76  150:putstatic       #111 <Field zzayy zzdoa>
	//   77  153:new             #2   <Class zzayy>
	//   78  156:dup             
	//   79  157:new             #113 <Class zzazg>
	//   80  160:dup             
	//   81  161:invokespecial   #114 <Method void zzazg()>
	//   82  164:invokespecial   #104 <Method void zzayy(zzayz)>
	//   83  167:putstatic       #116 <Field zzayy zzdob>
	//   84  170:new             #2   <Class zzayy>
	//   85  173:dup             
	//   86  174:new             #118 <Class zzazf>
	//   87  177:dup             
	//   88  178:invokespecial   #119 <Method void zzazf()>
	//   89  181:invokespecial   #104 <Method void zzayy(zzayz)>
	//   90  184:putstatic       #121 <Field zzayy zzdoc>
	//   91  187:new             #2   <Class zzayy>
	//   92  190:dup             
	//   93  191:new             #123 <Class zzazb>
	//   94  194:dup             
	//   95  195:invokespecial   #124 <Method void zzazb()>
	//   96  198:invokespecial   #104 <Method void zzayy(zzayz)>
	//   97  201:putstatic       #126 <Field zzayy zzdod>
	//   98  204:new             #2   <Class zzayy>
	//   99  207:dup             
	//  100  208:new             #128 <Class zzazd>
	//  101  211:dup             
	//  102  212:invokespecial   #129 <Method void zzazd()>
	//  103  215:invokespecial   #104 <Method void zzayy(zzayz)>
	//  104  218:putstatic       #131 <Field zzayy zzdoe>
	//  105  221:new             #2   <Class zzayy>
	//  106  224:dup             
	//  107  225:new             #133 <Class zzazc>
	//  108  228:dup             
	//  109  229:invokespecial   #134 <Method void zzazc()>
	//  110  232:invokespecial   #104 <Method void zzayy(zzayz)>
	//  111  235:putstatic       #136 <Field zzayy zzdof>
	//* 112  238:return          
	}
}
