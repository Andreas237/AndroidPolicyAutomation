// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal.ads:
//			p, bwk, m, xg

final class xi
	implements Callable
{

	xi(xg xg, Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = xg;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field xg a>
		b = context;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field Context b>
	//    8   14:return          
	}

	public final Object call()
	{
		Object obj = ((Object) (b));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context b>
	//    2    4:astore_3        
		Object obj1 = ((Object) (p.cP));
	//    3    5:getstatic       #28  <Field e p.cP>
	//    4    8:astore          4
		if(!((Boolean)bwk.e().a(((e) (obj1)))).booleanValue())
	//*   5   10:invokestatic    #34  <Method m bwk.e()>
	//*   6   13:aload           4
	//*   7   15:invokevirtual   #39  <Method Object m.a(e)>
	//*   8   18:checkcast       #41  <Class Boolean>
	//*   9   21:invokevirtual   #45  <Method boolean Boolean.booleanValue()>
	//*  10   24:ifne            29
			return ((Object) (null));
	//   11   27:aconst_null     
	//   12   28:areturn         
		obj = ((Object) (PreferenceManager.getDefaultSharedPreferences(((Context) (obj)))));
	//   13   29:aload_3         
	//   14   30:invokestatic    #51  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//   15   33:astore_3        
		obj1 = ((Object) (new Bundle()));
	//   16   34:new             #53  <Class Bundle>
	//   17   37:dup             
	//   18   38:invokespecial   #54  <Method void Bundle()>
	//   19   41:astore          4
		boolean flag = ((SharedPreferences) (obj)).contains("IABConsent_CMPPresent");
	//   20   43:aload_3         
	//   21   44:ldc1            #56  <String "IABConsent_CMPPresent">
	//   22   46:invokeinterface #62  <Method boolean SharedPreferences.contains(String)>
	//   23   51:istore_2        
		int i = 0;
	//   24   52:iconst_0        
	//   25   53:istore_1        
		if(flag)
	//*  26   54:iload_2         
	//*  27   55:ifeq            74
			((Bundle) (obj1)).putBoolean("IABConsent_CMPPresent", ((SharedPreferences) (obj)).getBoolean("IABConsent_CMPPresent", false));
	//   28   58:aload           4
	//   29   60:ldc1            #56  <String "IABConsent_CMPPresent">
	//   30   62:aload_3         
	//   31   63:ldc1            #56  <String "IABConsent_CMPPresent">
	//   32   65:iconst_0        
	//   33   66:invokeinterface #66  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   34   71:invokevirtual   #70  <Method void Bundle.putBoolean(String, boolean)>
		for(; i < 4; i++)
	//*  35   74:iload_1         
	//*  36   75:iconst_4        
	//*  37   76:icmpge          141
		{
			String s = (new String[] {
				"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"
			})[i];
	//   38   79:iconst_4        
	//   39   80:anewarray       String[]
	//   40   83:dup             
	//   41   84:iconst_0        
	//   42   85:ldc1            #74  <String "IABConsent_SubjectToGDPR">
	//   43   87:aastore         
	//   44   88:dup             
	//   45   89:iconst_1        
	//   46   90:ldc1            #76  <String "IABConsent_ConsentString">
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_2        
	//   50   95:ldc1            #78  <String "IABConsent_ParsedPurposeConsents">
	//   51   97:aastore         
	//   52   98:dup             
	//   53   99:iconst_3        
	//   54  100:ldc1            #80  <String "IABConsent_ParsedVendorConsents">
	//   55  102:aastore         
	//   56  103:iload_1         
	//   57  104:aaload          
	//   58  105:astore          5
			if(((SharedPreferences) (obj)).contains(s))
	//*  59  107:aload_3         
	//*  60  108:aload           5
	//*  61  110:invokeinterface #62  <Method boolean SharedPreferences.contains(String)>
	//*  62  115:ifeq            134
				((Bundle) (obj1)).putString(s, ((SharedPreferences) (obj)).getString(s, ((String) (null))));
	//   63  118:aload           4
	//   64  120:aload           5
	//   65  122:aload_3         
	//   66  123:aload           5
	//   67  125:aconst_null     
	//   68  126:invokeinterface #84  <Method String SharedPreferences.getString(String, String)>
	//   69  131:invokevirtual   #88  <Method void Bundle.putString(String, String)>
		}

	//   70  134:iload_1         
	//   71  135:iconst_1        
	//   72  136:iadd            
	//   73  137:istore_1        
	//*  74  138:goto            74
		return obj1;
	//   75  141:aload           4
	//   76  143:areturn         
	}

	private final xg a;
	private final Context b;
}
