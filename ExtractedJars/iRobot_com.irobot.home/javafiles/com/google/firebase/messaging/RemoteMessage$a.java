// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package com.google.firebase.messaging:
//			RemoteMessage, e, f

public static class RemoteMessage$a
{

	private static String[] a(Bundle bundle, String s)
	{
		bundle = ((Bundle) (com.google.firebase.messaging.e.c(bundle, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #90  <Method Object[] e.c(Bundle, String)>
	//    3    5:astore_0        
		if(bundle == null)
	//*   4    6:aload_0         
	//*   5    7:ifnonnull       12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		s = ((String) (new String[bundle.length]));
	//    8   12:aload_0         
	//    9   13:arraylength     
	//   10   14:anewarray       String[]
	//   11   17:astore_1        
		for(int i1 = 0; i1 < bundle.length; i1++)
	//*  12   18:iconst_0        
	//*  13   19:istore_2        
	//*  14   20:iload_2         
	//*  15   21:aload_0         
	//*  16   22:arraylength     
	//*  17   23:icmpge          42
			s[i1] = ((/*<invalid signature>*/java.lang.Object) (String.valueOf(((Object) (bundle[i1])))));
	//   18   26:aload_1         
	//   19   27:iload_2         
	//   20   28:aload_0         
	//   21   29:iload_2         
	//   22   30:aaload          
	//   23   31:invokestatic    #96  <Method String String.valueOf(Object)>
	//   24   34:aastore         

	//   25   35:iload_2         
	//   26   36:iconst_1        
	//   27   37:iadd            
	//   28   38:istore_2        
	//*  29   39:goto            20
		return ((String []) (s));
	//   30   42:aload_1         
	//   31   43:areturn         
	}

	private final String a;
	private final String b;
	private final String c[];
	private final String d;
	private final String e;
	private final String f[];
	private final String g;
	private final String h;
	private final String i;
	private final String j;
	private final String k;
	private final String l;
	private final Uri m;

	private RemoteMessage$a(Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		a = com.google.firebase.messaging.e.a(bundle, "gcm.n.title");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #29  <String "gcm.n.title">
	//    5    8:invokestatic    #34  <Method String e.a(Bundle, String)>
	//    6   11:putfield        #36  <Field String a>
		b = com.google.firebase.messaging.e.b(bundle, "gcm.n.title");
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:ldc1            #29  <String "gcm.n.title">
	//   10   18:invokestatic    #38  <Method String e.b(Bundle, String)>
	//   11   21:putfield        #40  <Field String b>
		c = a(bundle, "gcm.n.title");
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:ldc1            #29  <String "gcm.n.title">
	//   15   28:invokestatic    #43  <Method String[] a(Bundle, String)>
	//   16   31:putfield        #45  <Field String[] c>
		d = com.google.firebase.messaging.e.a(bundle, "gcm.n.body");
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:ldc1            #47  <String "gcm.n.body">
	//   20   38:invokestatic    #34  <Method String e.a(Bundle, String)>
	//   21   41:putfield        #49  <Field String d>
		e = com.google.firebase.messaging.e.b(bundle, "gcm.n.body");
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:ldc1            #47  <String "gcm.n.body">
	//   25   48:invokestatic    #38  <Method String e.b(Bundle, String)>
	//   26   51:putfield        #51  <Field String e>
		f = a(bundle, "gcm.n.body");
	//   27   54:aload_0         
	//   28   55:aload_1         
	//   29   56:ldc1            #47  <String "gcm.n.body">
	//   30   58:invokestatic    #43  <Method String[] a(Bundle, String)>
	//   31   61:putfield        #53  <Field String[] f>
		g = com.google.firebase.messaging.e.a(bundle, "gcm.n.icon");
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:ldc1            #55  <String "gcm.n.icon">
	//   35   68:invokestatic    #34  <Method String e.a(Bundle, String)>
	//   36   71:putfield        #57  <Field String g>
		h = com.google.firebase.messaging.e.d(bundle);
	//   37   74:aload_0         
	//   38   75:aload_1         
	//   39   76:invokestatic    #60  <Method String e.d(Bundle)>
	//   40   79:putfield        #62  <Field String h>
		i = com.google.firebase.messaging.e.a(bundle, "gcm.n.tag");
	//   41   82:aload_0         
	//   42   83:aload_1         
	//   43   84:ldc1            #64  <String "gcm.n.tag">
	//   44   86:invokestatic    #34  <Method String e.a(Bundle, String)>
	//   45   89:putfield        #66  <Field String i>
		j = com.google.firebase.messaging.e.a(bundle, "gcm.n.color");
	//   46   92:aload_0         
	//   47   93:aload_1         
	//   48   94:ldc1            #68  <String "gcm.n.color">
	//   49   96:invokestatic    #34  <Method String e.a(Bundle, String)>
	//   50   99:putfield        #70  <Field String j>
		k = com.google.firebase.messaging.e.a(bundle, "gcm.n.click_action");
	//   51  102:aload_0         
	//   52  103:aload_1         
	//   53  104:ldc1            #72  <String "gcm.n.click_action">
	//   54  106:invokestatic    #34  <Method String e.a(Bundle, String)>
	//   55  109:putfield        #74  <Field String k>
		l = com.google.firebase.messaging.e.a(bundle, "gcm.n.android_channel_id");
	//   56  112:aload_0         
	//   57  113:aload_1         
	//   58  114:ldc1            #76  <String "gcm.n.android_channel_id">
	//   59  116:invokestatic    #34  <Method String e.a(Bundle, String)>
	//   60  119:putfield        #78  <Field String l>
		m = com.google.firebase.messaging.e.b(bundle);
	//   61  122:aload_0         
	//   62  123:aload_1         
	//   63  124:invokestatic    #81  <Method Uri e.b(Bundle)>
	//   64  127:putfield        #83  <Field Uri m>
	//   65  130:return          
	}

	RemoteMessage$a(Bundle bundle, f f1)
	{
		this(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #87  <Method void RemoteMessage$a(Bundle)>
	//    3    5:return          
	}
}
