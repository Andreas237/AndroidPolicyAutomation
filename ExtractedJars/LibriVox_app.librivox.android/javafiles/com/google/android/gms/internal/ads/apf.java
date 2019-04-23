// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.gms.internal.ads:
//			apx, aph, apl, apn, 
//			apm, api, apk, apj, 
//			apg, apz

public final class apf
{

	private apf(apg apg1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #127 <Method void Object()>
		j = apg1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #129 <Field apg j>
		k = g;
	//    5    9:aload_0         
	//    6   10:getstatic       #87  <Field List g>
	//    7   13:putfield        #131 <Field List k>
		l = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #133 <Field boolean l>
	//   11   21:return          
	}

	private final boolean a(String s, Provider provider)
	{
		try
		{
			j.a(s, provider);
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field apg j>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #141 <Method Object apg.a(String, Provider)>
	//    5   11:pop             
		}
	//*   6   12:iconst_1        
	//*   7   13:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   8   14:astore_1        
		{
			apz.a(((Throwable) (s)));
	//    9   15:aload_1         
	//   10   16:invokestatic    #146 <Method void apz.a(Throwable)>
			return false;
	//   11   19:iconst_0        
	//   12   20:ireturn         
		}
		return true;
	}

	public final Object a(String s)
	{
		for(Iterator iterator = k.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field List k>
	//*   2    4:invokeinterface #151 <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #156 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            50
		{
			Provider provider = (Provider)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #160 <Method Object Iterator.next()>
	//    9   25:checkcast       #162 <Class Provider>
	//   10   28:astore_3        
			if(a(s, provider))
	//*  11   29:aload_0         
	//*  12   30:aload_1         
	//*  13   31:aload_3         
	//*  14   32:invokespecial   #164 <Method boolean a(String, Provider)>
	//*  15   35:ifeq            10
				return j.a(s, provider);
	//   16   38:aload_0         
	//   17   39:getfield        #129 <Field apg j>
	//   18   42:aload_1         
	//   19   43:aload_3         
	//   20   44:invokeinterface #141 <Method Object apg.a(String, Provider)>
	//   21   49:areturn         
		}

		if(l)
	//*  22   50:aload_0         
	//*  23   51:getfield        #133 <Field boolean l>
	//*  24   54:ifeq            69
			return j.a(s, ((Provider) (null)));
	//   25   57:aload_0         
	//   26   58:getfield        #129 <Field apg j>
	//   27   61:aload_1         
	//   28   62:aconst_null     
	//   29   63:invokeinterface #141 <Method Object apg.a(String, Provider)>
	//   30   68:areturn         
		else
			throw new GeneralSecurityException("No good Provider found.");
	//   31   69:new             #166 <Class GeneralSecurityException>
	//   32   72:dup             
	//   33   73:ldc1            #168 <String "No good Provider found.">
	//   34   75:invokespecial   #171 <Method void GeneralSecurityException(String)>
	//   35   78:athrow          
	}

	public static final apf a = new apf(((apg) (new aph())));
	public static final apf b = new apf(((apg) (new apl())));
	public static final apf c = new apf(((apg) (new api())));
	public static final apf d = new apf(((apg) (new apk())));
	public static final apf e = new apf(((apg) (new apj())));
	private static final Logger f;
	private static final List g;
	private static final apf h = new apf(((apg) (new apn())));
	private static final apf i = new apf(((apg) (new apm())));
	private apg j;
	private List k;
	private boolean l;

	static 
	{
		f = Logger.getLogger(((Class) (com/google/android/gms/internal/ads/apf)).getName());
	//    0    0:ldc1            #2   <Class apf>
	//    1    2:invokevirtual   #29  <Method String Class.getName()>
	//    2    5:invokestatic    #35  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #37  <Field Logger f>
		if(apx.a())
	//*   4   11:invokestatic    #42  <Method boolean apx.a()>
	//*   5   14:ifeq            109
		{
			ArrayList arraylist = new ArrayList();
	//    6   17:new             #44  <Class ArrayList>
	//    7   20:dup             
	//    8   21:invokespecial   #47  <Method void ArrayList()>
	//    9   24:astore_1        
			for(int i1 = 0; i1 < 2; i1++)
	//*  10   25:iconst_0        
	//*  11   26:istore_0        
	//*  12   27:iload_0         
	//*  13   28:iconst_2        
	//*  14   29:icmpge          102
			{
				String s = (new String[] {
					"GmsCore_OpenSSL", "AndroidOpenSSL"
				})[i1];
	//   15   32:iconst_2        
	//   16   33:anewarray       String[]
	//   17   36:dup             
	//   18   37:iconst_0        
	//   19   38:ldc1            #51  <String "GmsCore_OpenSSL">
	//   20   40:aastore         
	//   21   41:dup             
	//   22   42:iconst_1        
	//   23   43:ldc1            #53  <String "AndroidOpenSSL">
	//   24   45:aastore         
	//   25   46:iload_0         
	//   26   47:aaload          
	//   27   48:astore_2        
				Provider provider = Security.getProvider(s);
	//   28   49:aload_2         
	//   29   50:invokestatic    #59  <Method Provider Security.getProvider(String)>
	//   30   53:astore_3        
				if(provider != null)
	//*  31   54:aload_3         
	//*  32   55:ifnull          69
					((List) (arraylist)).add(((Object) (provider)));
	//   33   58:aload_1         
	//   34   59:aload_3         
	//   35   60:invokeinterface #65  <Method boolean List.add(Object)>
	//   36   65:pop             
				else
	//*  37   66:goto            95
					f.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[] {
						s
					}));
	//   38   69:getstatic       #37  <Field Logger f>
	//   39   72:getstatic       #71  <Field Level Level.INFO>
	//   40   75:ldc1            #73  <String "com.google.crypto.tink.subtle.EngineFactory">
	//   41   77:ldc1            #75  <String "toProviderList">
	//   42   79:ldc1            #77  <String "Provider %s not available">
	//   43   81:iconst_1        
	//   44   82:anewarray       Object[]
	//   45   85:dup             
	//   46   86:iconst_0        
	//   47   87:aload_2         
	//   48   88:aastore         
	//   49   89:invokestatic    #81  <Method String String.format(String, Object[])>
	//   50   92:invokevirtual   #85  <Method void Logger.logp(Level, String, String, String)>
			}

	//   51   95:iload_0         
	//   52   96:iconst_1        
	//   53   97:iadd            
	//   54   98:istore_0        
	//*  55   99:goto            27
			g = ((List) (arraylist));
	//   56  102:aload_1         
	//   57  103:putstatic       #87  <Field List g>
		} else
	//*  58  106:goto            119
		{
			g = ((List) (new ArrayList()));
	//   59  109:new             #44  <Class ArrayList>
	//   60  112:dup             
	//   61  113:invokespecial   #47  <Method void ArrayList()>
	//   62  116:putstatic       #87  <Field List g>
		}
	//   63  119:new             #2   <Class apf>
	//   64  122:dup             
	//   65  123:new             #89  <Class aph>
	//   66  126:dup             
	//   67  127:invokespecial   #90  <Method void aph()>
	//   68  130:invokespecial   #93  <Method void apf(apg)>
	//   69  133:putstatic       #95  <Field apf a>
	//   70  136:new             #2   <Class apf>
	//   71  139:dup             
	//   72  140:new             #97  <Class apl>
	//   73  143:dup             
	//   74  144:invokespecial   #98  <Method void apl()>
	//   75  147:invokespecial   #93  <Method void apf(apg)>
	//   76  150:putstatic       #100 <Field apf b>
	//   77  153:new             #2   <Class apf>
	//   78  156:dup             
	//   79  157:new             #102 <Class apn>
	//   80  160:dup             
	//   81  161:invokespecial   #103 <Method void apn()>
	//   82  164:invokespecial   #93  <Method void apf(apg)>
	//   83  167:putstatic       #105 <Field apf h>
	//   84  170:new             #2   <Class apf>
	//   85  173:dup             
	//   86  174:new             #107 <Class apm>
	//   87  177:dup             
	//   88  178:invokespecial   #108 <Method void apm()>
	//   89  181:invokespecial   #93  <Method void apf(apg)>
	//   90  184:putstatic       #110 <Field apf i>
	//   91  187:new             #2   <Class apf>
	//   92  190:dup             
	//   93  191:new             #112 <Class api>
	//   94  194:dup             
	//   95  195:invokespecial   #113 <Method void api()>
	//   96  198:invokespecial   #93  <Method void apf(apg)>
	//   97  201:putstatic       #115 <Field apf c>
	//   98  204:new             #2   <Class apf>
	//   99  207:dup             
	//  100  208:new             #117 <Class apk>
	//  101  211:dup             
	//  102  212:invokespecial   #118 <Method void apk()>
	//  103  215:invokespecial   #93  <Method void apf(apg)>
	//  104  218:putstatic       #120 <Field apf d>
	//  105  221:new             #2   <Class apf>
	//  106  224:dup             
	//  107  225:new             #122 <Class apj>
	//  108  228:dup             
	//  109  229:invokespecial   #123 <Method void apj()>
	//  110  232:invokespecial   #93  <Method void apf(apg)>
	//  111  235:putstatic       #125 <Field apf e>
	//* 112  238:return          
	}
}
