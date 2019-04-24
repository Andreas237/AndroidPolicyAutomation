// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.f.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.firebase.messaging:
//			g, e, f

public final class RemoteMessage extends AbstractSafeParcelable
{
	public static class a
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

		private a(Bundle bundle)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Object()>
			a = com.google.firebase.messaging.e.a(bundle, "gcm.n.title");
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:ldc1            #29  <String "gcm.n.title">
		//    5    8:invokestatic    #34  <Method String com.google.firebase.messaging.e.a(Bundle, String)>
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
		//   20   38:invokestatic    #34  <Method String com.google.firebase.messaging.e.a(Bundle, String)>
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
		//   35   68:invokestatic    #34  <Method String com.google.firebase.messaging.e.a(Bundle, String)>
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
		//   44   86:invokestatic    #34  <Method String com.google.firebase.messaging.e.a(Bundle, String)>
		//   45   89:putfield        #66  <Field String i>
			j = com.google.firebase.messaging.e.a(bundle, "gcm.n.color");
		//   46   92:aload_0         
		//   47   93:aload_1         
		//   48   94:ldc1            #68  <String "gcm.n.color">
		//   49   96:invokestatic    #34  <Method String com.google.firebase.messaging.e.a(Bundle, String)>
		//   50   99:putfield        #70  <Field String j>
			k = com.google.firebase.messaging.e.a(bundle, "gcm.n.click_action");
		//   51  102:aload_0         
		//   52  103:aload_1         
		//   53  104:ldc1            #72  <String "gcm.n.click_action">
		//   54  106:invokestatic    #34  <Method String com.google.firebase.messaging.e.a(Bundle, String)>
		//   55  109:putfield        #74  <Field String k>
			l = com.google.firebase.messaging.e.a(bundle, "gcm.n.android_channel_id");
		//   56  112:aload_0         
		//   57  113:aload_1         
		//   58  114:ldc1            #76  <String "gcm.n.android_channel_id">
		//   59  116:invokestatic    #34  <Method String com.google.firebase.messaging.e.a(Bundle, String)>
		//   60  119:putfield        #78  <Field String l>
			m = com.google.firebase.messaging.e.b(bundle);
		//   61  122:aload_0         
		//   62  123:aload_1         
		//   63  124:invokestatic    #81  <Method Uri e.b(Bundle)>
		//   64  127:putfield        #83  <Field Uri m>
		//   65  130:return          
		}

		a(Bundle bundle, f f1)
		{
			this(bundle);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #87  <Method void RemoteMessage$a(Bundle)>
		//    3    5:return          
		}
	}


	public RemoteMessage(Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void AbstractSafeParcelable()>
		a = bundle;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #41  <Field Bundle a>
	//    5    9:return          
	}

	public final Map a()
	{
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field Map b>
	//*   2    4:ifnonnull       140
		{
			Bundle bundle = a;
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field Bundle a>
	//    5   11:astore_1        
			android.support.v4.f.a a1 = new android.support.v4.f.a();
	//    6   12:new             #48  <Class a>
	//    7   15:dup             
	//    8   16:invokespecial   #49  <Method void a()>
	//    9   19:astore_2        
			Iterator iterator = bundle.keySet().iterator();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #55  <Method Set Bundle.keySet()>
	//   12   24:invokeinterface #61  <Method Iterator Set.iterator()>
	//   13   29:astore_3        
			do
			{
				if(!iterator.hasNext())
					break;
	//   14   30:aload_3         
	//   15   31:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   16   36:ifeq            135
				String s = (String)iterator.next();
	//   17   39:aload_3         
	//   18   40:invokeinterface #71  <Method Object Iterator.next()>
	//   19   45:checkcast       #73  <Class String>
	//   20   48:astore          4
				Object obj = bundle.get(s);
	//   21   50:aload_1         
	//   22   51:aload           4
	//   23   53:invokevirtual   #77  <Method Object Bundle.get(String)>
	//   24   56:astore          5
				if(obj instanceof String)
	//*  25   58:aload           5
	//*  26   60:instanceof      #73  <Class String>
	//*  27   63:ifeq            30
				{
					obj = ((Object) ((String)obj));
	//   28   66:aload           5
	//   29   68:checkcast       #73  <Class String>
	//   30   71:astore          5
					if(!s.startsWith("google.") && !s.startsWith("gcm.") && !s.equals("from") && !s.equals("message_type") && !s.equals("collapse_key"))
	//*  31   73:aload           4
	//*  32   75:ldc1            #79  <String "google.">
	//*  33   77:invokevirtual   #83  <Method boolean String.startsWith(String)>
	//*  34   80:ifne            30
	//*  35   83:aload           4
	//*  36   85:ldc1            #85  <String "gcm.">
	//*  37   87:invokevirtual   #83  <Method boolean String.startsWith(String)>
	//*  38   90:ifne            30
	//*  39   93:aload           4
	//*  40   95:ldc1            #87  <String "from">
	//*  41   97:invokevirtual   #91  <Method boolean String.equals(Object)>
	//*  42  100:ifne            30
	//*  43  103:aload           4
	//*  44  105:ldc1            #93  <String "message_type">
	//*  45  107:invokevirtual   #91  <Method boolean String.equals(Object)>
	//*  46  110:ifne            30
	//*  47  113:aload           4
	//*  48  115:ldc1            #95  <String "collapse_key">
	//*  49  117:invokevirtual   #91  <Method boolean String.equals(Object)>
	//*  50  120:ifne            30
						a1.put(((Object) (s)), obj);
	//   51  123:aload_2         
	//   52  124:aload           4
	//   53  126:aload           5
	//   54  128:invokevirtual   #99  <Method Object a.put(Object, Object)>
	//   55  131:pop             
				}
			} while(true);
	//   56  132:goto            30
			b = ((Map) (a1));
	//   57  135:aload_0         
	//   58  136:aload_2         
	//   59  137:putfield        #46  <Field Map b>
		}
		return b;
	//   60  140:aload_0         
	//   61  141:getfield        #46  <Field Map b>
	//   62  144:areturn         
	}

	public final String b()
	{
		String s1 = a.getString("google.message_id");
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Bundle a>
	//    2    4:ldc1            #104 <String "google.message_id">
	//    3    6:invokevirtual   #108 <Method String Bundle.getString(String)>
	//    4    9:astore_2        
		String s = s1;
	//    5   10:aload_2         
	//    6   11:astore_1        
		if(s1 == null)
	//*   7   12:aload_2         
	//*   8   13:ifnonnull       26
			s = a.getString("message_id");
	//    9   16:aload_0         
	//   10   17:getfield        #41  <Field Bundle a>
	//   11   20:ldc1            #110 <String "message_id">
	//   12   22:invokevirtual   #108 <Method String Bundle.getString(String)>
	//   13   25:astore_1        
		return s;
	//   14   26:aload_1         
	//   15   27:areturn         
	}

	public final a c()
	{
		if(c == null && com.google.firebase.messaging.e.a(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field RemoteMessage$a c>
	//*   2    4:ifnonnull       33
	//*   3    7:aload_0         
	//*   4    8:getfield        #41  <Field Bundle a>
	//*   5   11:invokestatic    #118 <Method boolean com.google.firebase.messaging.e.a(Bundle)>
	//*   6   14:ifeq            33
			c = new a(a, ((f) (null)));
	//    7   17:aload_0         
	//    8   18:new             #6   <Class RemoteMessage$a>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:getfield        #41  <Field Bundle a>
	//   12   26:aconst_null     
	//   13   27:invokespecial   #121 <Method void RemoteMessage$a(Bundle, f)>
	//   14   30:putfield        #113 <Field RemoteMessage$a c>
		return c;
	//   15   33:aload_0         
	//   16   34:getfield        #113 <Field RemoteMessage$a c>
	//   17   37:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #129 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeBundle(parcel, 2, a, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #41  <Field Bundle a>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #133 <Method void SafeParcelWriter.writeBundle(Parcel, int, Bundle, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokestatic    #136 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   12   20:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new g();
	Bundle a;
	private Map b;
	private a c;

	static 
	{
	//    0    0:new             #29  <Class g>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void g()>
	//    3    7:putstatic       #34  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
