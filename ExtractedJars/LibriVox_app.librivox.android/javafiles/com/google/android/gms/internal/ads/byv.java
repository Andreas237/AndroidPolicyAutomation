// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.*;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.b.b;
import com.google.android.gms.common.b.c;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aag, jr

public final class byv extends ContentProvider
{

	public byv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void ContentProvider()>
	//    2    4:return          
	}

	private static Bundle a(Context context)
	{
		context = ((Context) (c.a(context).a(context.getPackageName(), 128).metaData));
	//    0    0:aload_0         
	//    1    1:invokestatic    #21  <Method b c.a(Context)>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #27  <Method String Context.getPackageName()>
	//    4    8:sipush          128
	//    5   11:invokevirtual   #32  <Method ApplicationInfo b.a(String, int)>
	//    6   14:getfield        #38  <Field Bundle ApplicationInfo.metaData>
	//    7   17:astore_0        
		return ((Bundle) (context));
	//    8   18:aload_0         
	//    9   19:areturn         
		context;
	//   10   20:astore_0        
		com.google.android.gms.internal.ads.aag.b("Failed to load metadata: Package name not found", ((Throwable) (context)));
	//   11   21:ldc1            #40  <String "Failed to load metadata: Package name not found">
	//   12   23:aload_0         
	//   13   24:invokestatic    #46  <Method void com.google.android.gms.internal.ads.aag.b(String, Throwable)>
		break MISSING_BLOCK_LABEL_37;
	//   14   27:goto            37
		context;
	//   15   30:astore_0        
		com.google.android.gms.internal.ads.aag.b("Failed to load metadata: Null pointer exception", ((Throwable) (context)));
	//   16   31:ldc1            #48  <String "Failed to load metadata: Null pointer exception">
	//   17   33:aload_0         
	//   18   34:invokestatic    #46  <Method void com.google.android.gms.internal.ads.aag.b(String, Throwable)>
		return null;
	//   19   37:aconst_null     
	//   20   38:areturn         
	}

	public final void attachInfo(Context context, ProviderInfo providerinfo)
	{
		Boolean boolean1;
		Object obj1;
		obj1 = ((Object) (a(context)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #54  <Method Bundle a(Context)>
	//    2    4:astore          5
		boolean1 = null;
	//    3    6:aconst_null     
	//    4    7:astore          4
		if(obj1 == null) goto _L2; else goto _L1
	//    5    9:aload           5
	//    6   11:ifnull          62
_L1:
		String s;
		try
		{
			s = (String)((Bundle) (obj1)).get("com.google.android.gms.ads.APPLICATION_ID");
	//    7   14:aload           5
	//    8   16:ldc1            #56  <String "com.google.android.gms.ads.APPLICATION_ID">
	//    9   18:invokevirtual   #62  <Method Object Bundle.get(String)>
	//   10   21:checkcast       #64  <Class String>
	//   11   24:astore_3        
		}
	//*  12   25:goto            35
	//*  13   28:ldc1            #66  <String "The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value">
	//*  14   30:invokestatic    #70  <Method void com.google.android.gms.internal.ads.aag.c(String)>
	//*  15   33:aconst_null     
	//*  16   34:astore_3        
	//*  17   35:aload           5
	//*  18   37:ldc1            #72  <String "com.google.android.gms.ads.AD_MANAGER_APP">
	//*  19   39:invokevirtual   #62  <Method Object Bundle.get(String)>
	//*  20   42:checkcast       #74  <Class Boolean>
	//*  21   45:astore          5
	//*  22   47:aload           5
	//*  23   49:astore          4
	//*  24   51:goto            64
	//*  25   54:ldc1            #76  <String "The com.google.android.gms.ads.AD_MANAGER_APP metadata must have a boolean value">
	//*  26   56:invokestatic    #70  <Method void com.google.android.gms.internal.ads.aag.c(String)>
	//*  27   59:goto            64
	//*  28   62:aconst_null     
	//*  29   63:astore_3        
	//*  30   64:aload           4
	//*  31   66:ifnull          77
	//*  32   69:aload           4
	//*  33   71:invokevirtual   #80  <Method boolean Boolean.booleanValue()>
	//*  34   74:ifne            81
	//*  35   77:aload_3         
	//*  36   78:ifnull          180
	//*  37   81:aload_3         
	//*  38   82:ifnull          173
	//*  39   85:aload_3         
	//*  40   86:ldc1            #82  <String "^ca-app-pub-[0-9]{16}~[0-9]{10}$">
	//*  41   88:invokevirtual   #86  <Method boolean String.matches(String)>
	//*  42   91:ifeq            163
	//*  43   94:aload_3         
	//*  44   95:invokestatic    #90  <Method String String.valueOf(Object)>
	//*  45   98:astore          4
	//*  46  100:aload           4
	//*  47  102:invokevirtual   #94  <Method int String.length()>
	//*  48  105:ifeq            120
	//*  49  108:ldc1            #96  <String "Publisher provided Google AdMob App ID in manifest: ">
	//*  50  110:aload           4
	//*  51  112:invokevirtual   #100 <Method String String.concat(String)>
	//*  52  115:astore          4
	//*  53  117:goto            131
	//*  54  120:new             #64  <Class String>
	//*  55  123:dup             
	//*  56  124:ldc1            #96  <String "Publisher provided Google AdMob App ID in manifest: ">
	//*  57  126:invokespecial   #102 <Method void String(String)>
	//*  58  129:astore          4
	//*  59  131:aload           4
	//*  60  133:invokestatic    #104 <Method void com.google.android.gms.internal.ads.aag.b(String)>
	//*  61  136:new             #58  <Class Bundle>
	//*  62  139:dup             
	//*  63  140:invokespecial   #105 <Method void Bundle()>
	//*  64  143:astore          4
	//*  65  145:aload           4
	//*  66  147:ldc1            #107 <String "measurementEnabled">
	//*  67  149:iconst_0        
	//*  68  150:invokevirtual   #111 <Method void Bundle.putBoolean(String, boolean)>
	//*  69  153:aload_1         
	//*  70  154:aload_3         
	//*  71  155:aload           4
	//*  72  157:invokestatic    #116 <Method void jr.a(Context, String, Bundle)>
	//*  73  160:goto            173
	//*  74  163:new             #118 <Class IllegalStateException>
	//*  75  166:dup             
	//*  76  167:ldc1            #120 <String "\n\n******************************************************************************\n* Invalid application ID. Follow instructions here: https://goo.gl/fQ2neu to *\n* find your app ID.                                                          *\n******************************************************************************\n\n">
	//*  77  169:invokespecial   #121 <Method void IllegalStateException(String)>
	//*  78  172:athrow          
	//*  79  173:aload_0         
	//*  80  174:aload_1         
	//*  81  175:aload_2         
	//*  82  176:invokespecial   #123 <Method void ContentProvider.attachInfo(Context, ProviderInfo)>
	//*  83  179:return          
	//*  84  180:new             #118 <Class IllegalStateException>
	//*  85  183:dup             
	//*  86  184:ldc1            #125 <String "\n\n******************************************************************************\n* The Google Mobile Ads SDK was initialized incorrectly. AdMob publishers    *\n* should follow the instructions here: https://goo.gl/fQ2neu to add a valid  *\n* App ID inside the AndroidManifest. Google Ad Manager publishers should     *\n* follow instructions here: https://goo.gl/h17b6x.                           *\n******************************************************************************\n\n">
	//*  87  186:invokespecial   #121 <Method void IllegalStateException(String)>
	//*  88  189:athrow          
		// Misplaced declaration of an exception variable
		catch(ClassCastException classcastexception)
		{
			com.google.android.gms.internal.ads.aag.c("The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value");
			s = null;
		}
		obj1 = ((Object) ((Boolean)((Bundle) (obj1)).get("com.google.android.gms.ads.AD_MANAGER_APP")));
		boolean1 = ((Boolean) (obj1));
		  goto _L3
_L5:
		com.google.android.gms.internal.ads.aag.c("The com.google.android.gms.ads.AD_MANAGER_APP metadata must have a boolean value");
		  goto _L3
_L2:
		s = null;
_L3:
		ClassCastException classcastexception;
		if(boolean1 != null && boolean1.booleanValue() || s != null)
		{
			if(s != null)
				if(s.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$"))
				{
					Object obj = ((Object) (String.valueOf(((Object) (s)))));
					if(((String) (obj)).length() != 0)
						obj = ((Object) ("Publisher provided Google AdMob App ID in manifest: ".concat(((String) (obj)))));
					else
						obj = ((Object) (new String("Publisher provided Google AdMob App ID in manifest: ")));
					com.google.android.gms.internal.ads.aag.b(((String) (obj)));
					obj = ((Object) (new Bundle()));
					((Bundle) (obj)).putBoolean("measurementEnabled", false);
					jr.a(context, s, ((Bundle) (obj)));
				} else
				{
					throw new IllegalStateException("\n\n******************************************************************************\n* Invalid application ID. Follow instructions here: https://goo.gl/fQ2neu to *\n* find your app ID.                                                          *\n******************************************************************************\n\n");
				}
			super.attachInfo(context, providerinfo);
			return;
		} else
		{
			throw new IllegalStateException("\n\n******************************************************************************\n* The Google Mobile Ads SDK was initialized incorrectly. AdMob publishers    *\n* should follow the instructions here: https://goo.gl/fQ2neu to add a valid  *\n* App ID inside the AndroidManifest. Google Ad Manager publishers should     *\n* follow instructions here: https://goo.gl/h17b6x.                           *\n******************************************************************************\n\n");
		}
	//*  89  190:astore_3        
	//*  90  191:goto            28
		ClassCastException classcastexception1;
		classcastexception1;
	//   91  194:astore          5
		if(true) goto _L5; else goto _L4
	//   92  196:goto            54
_L4:
	}

	public final int delete(Uri uri, String s, String as[])
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final String getType(Uri uri)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final Uri insert(Uri uri, ContentValues contentvalues)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final boolean onCreate()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final Cursor query(Uri uri, String as[], String s, String as1[], String s1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final int update(Uri uri, ContentValues contentvalues, String s, String as[])
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}
}
