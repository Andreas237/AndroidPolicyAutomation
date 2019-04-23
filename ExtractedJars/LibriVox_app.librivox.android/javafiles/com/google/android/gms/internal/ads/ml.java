// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.n;
import com.google.android.gms.ads.mediation.o;
import com.google.android.gms.ads.r;
import com.google.android.gms.ads.t;
import com.google.android.gms.c.a;
import com.google.android.gms.c.d;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			mg, aag, aic, zzans, 
//			mq, aid, zzwf, mm, 
//			aib, ahy, mn, mp, 
//			mo, mi, lw, ks, 
//			lz, mb, md, byg

public final class ml extends mg
{

	public ml(aic aic1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void mg()>
		a = aic1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field aic a>
	//    5    9:return          
	}

	private static int a(String s)
	{
		int i;
label0:
		{
			i = s.hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method int String.hashCode()>
	//    2    4:istore_1        
			if(i != 0xacc57f2c)
	//*   3    5:iload_1         
	//*   4    6:ldc1            #22  <Int 0xacc57f2c>
	//*   5    8:icmpeq          74
			{
				if(i != 0xc1425017)
	//*   6   11:iload_1         
	//*   7   12:ldc1            #23  <Int 0xc1425017>
	//*   8   14:icmpeq          60
				{
					if(i != 0xf1b84c0e)
	//*   9   17:iload_1         
	//*  10   18:ldc1            #24  <Int 0xf1b84c0e>
	//*  11   20:icmpeq          46
					{
						if(i == 0x240b672c && s.equals("interstitial"))
	//*  12   23:iload_1         
	//*  13   24:ldc1            #25  <Int 0x240b672c>
	//*  14   26:icmpeq          32
	//*  15   29:goto            88
	//*  16   32:aload_0         
	//*  17   33:ldc1            #27  <String "interstitial">
	//*  18   35:invokevirtual   #31  <Method boolean String.equals(Object)>
	//*  19   38:ifeq            88
						{
							i = 1;
	//   20   41:iconst_1        
	//   21   42:istore_1        
							break label0;
	//   22   43:goto            90
						}
					} else
					if(s.equals("rewarded"))
	//*  23   46:aload_0         
	//*  24   47:ldc1            #33  <String "rewarded">
	//*  25   49:invokevirtual   #31  <Method boolean String.equals(Object)>
	//*  26   52:ifeq            88
					{
						i = 2;
	//   27   55:iconst_2        
	//   28   56:istore_1        
						break label0;
	//   29   57:goto            90
					}
				} else
				if(s.equals("native"))
	//*  30   60:aload_0         
	//*  31   61:ldc1            #35  <String "native">
	//*  32   63:invokevirtual   #31  <Method boolean String.equals(Object)>
	//*  33   66:ifeq            88
				{
					i = 3;
	//   34   69:iconst_3        
	//   35   70:istore_1        
					break label0;
	//   36   71:goto            90
				}
			} else
			if(s.equals("banner"))
	//*  37   74:aload_0         
	//*  38   75:ldc1            #37  <String "banner">
	//*  39   77:invokevirtual   #31  <Method boolean String.equals(Object)>
	//*  40   80:ifeq            88
			{
				i = 0;
	//   41   83:iconst_0        
	//   42   84:istore_1        
				break label0;
	//   43   85:goto            90
			}
			i = -1;
	//   44   88:iconst_m1       
	//   45   89:istore_1        
		}
		switch(i)
	//*  46   90:iload_1         
		{
	//*  47   91:tableswitch     0 3: default 120
	//	               0 142
	//	               1 138
	//	               2 134
	//	               3 130
		default:
			throw new IllegalArgumentException("Internal Error");
	//   48  120:new             #39  <Class IllegalArgumentException>
	//   49  123:dup             
	//   50  124:ldc1            #41  <String "Internal Error">
	//   51  126:invokespecial   #44  <Method void IllegalArgumentException(String)>
	//   52  129:athrow          

		case 3: // '\003'
			return r.d;
	//   53  130:getstatic       #50  <Field int r.d>
	//   54  133:ireturn         

		case 2: // '\002'
			return r.c;
	//   55  134:getstatic       #53  <Field int r.c>
	//   56  137:ireturn         

		case 1: // '\001'
			return r.b;
	//   57  138:getstatic       #56  <Field int r.b>
	//   58  141:ireturn         

		case 0: // '\0'
			return r.a;
	//   59  142:getstatic       #58  <Field int r.a>
	//   60  145:ireturn         
		}
	}

	private static Bundle b(String s)
	{
		Object obj = ((Object) (String.valueOf(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #65  <Method String String.valueOf(Object)>
	//    2    4:astore_1        
		if(((String) (obj)).length() != 0)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #68  <Method int String.length()>
	//*   5    9:ifeq            22
			obj = ((Object) ("Server parameters: ".concat(((String) (obj)))));
	//    6   12:ldc1            #70  <String "Server parameters: ">
	//    7   14:aload_1         
	//    8   15:invokevirtual   #74  <Method String String.concat(String)>
	//    9   18:astore_1        
		else
	//*  10   19:goto            32
			obj = ((Object) (new String("Server parameters: ")));
	//   11   22:new             #17  <Class String>
	//   12   25:dup             
	//   13   26:ldc1            #70  <String "Server parameters: ">
	//   14   28:invokespecial   #75  <Method void String(String)>
	//   15   31:astore_1        
		aag.e(((String) (obj)));
	//   16   32:aload_1         
	//   17   33:invokestatic    #80  <Method void aag.e(String)>
		JSONObject jsonobject;
		Iterator iterator;
		try
		{
			obj = ((Object) (new Bundle()));
	//   18   36:new             #82  <Class Bundle>
	//   19   39:dup             
	//   20   40:invokespecial   #83  <Method void Bundle()>
	//   21   43:astore_1        
		}
	//*  22   44:aload_0         
	//*  23   45:ifnull          104
	//*  24   48:new             #85  <Class JSONObject>
	//*  25   51:dup             
	//*  26   52:aload_0         
	//*  27   53:invokespecial   #86  <Method void JSONObject(String)>
	//*  28   56:astore_2        
	//*  29   57:new             #82  <Class Bundle>
	//*  30   60:dup             
	//*  31   61:invokespecial   #83  <Method void Bundle()>
	//*  32   64:astore_1        
	//*  33   65:aload_2         
	//*  34   66:invokevirtual   #90  <Method Iterator JSONObject.keys()>
	//*  35   69:astore_3        
	//*  36   70:aload_1         
	//*  37   71:astore_0        
	//*  38   72:aload_3         
	//*  39   73:invokeinterface #96  <Method boolean Iterator.hasNext()>
	//*  40   78:ifeq            106
	//*  41   81:aload_3         
	//*  42   82:invokeinterface #100 <Method Object Iterator.next()>
	//*  43   87:checkcast       #17  <Class String>
	//*  44   90:astore_0        
	//*  45   91:aload_1         
	//*  46   92:aload_0         
	//*  47   93:aload_2         
	//*  48   94:aload_0         
	//*  49   95:invokevirtual   #103 <Method String JSONObject.getString(String)>
	//*  50   98:invokevirtual   #107 <Method void Bundle.putString(String, String)>
	//*  51  101:goto            70
	//*  52  104:aload_1         
	//*  53  105:astore_0        
	//*  54  106:aload_0         
	//*  55  107:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  56  108:astore_0        
		{
			aag.b("", ((Throwable) (s)));
	//   57  109:ldc1            #109 <String "">
	//   58  111:aload_0         
	//   59  112:invokestatic    #112 <Method void aag.b(String, Throwable)>
			throw new RemoteException();
	//   60  115:new             #114 <Class RemoteException>
	//   61  118:dup             
	//   62  119:invokespecial   #115 <Method void RemoteException()>
	//   63  122:athrow          
		}
		if(s == null) goto _L2; else goto _L1
_L1:
		jsonobject = new JSONObject(s);
		obj = ((Object) (new Bundle()));
		iterator = jsonobject.keys();
_L4:
		s = ((String) (obj));
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
		s = (String)iterator.next();
		((Bundle) (obj)).putString(s, jsonobject.getString(s));
		if(true) goto _L4; else goto _L3
_L2:
		s = ((String) (obj));
_L3:
		return ((Bundle) (s));
	}

	public final zzans a()
	{
		return com.google.android.gms.internal.ads.zzans.a(a.b());
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field aic a>
	//    2    4:invokevirtual   #121 <Method aif aic.b()>
	//    3    7:invokestatic    #126 <Method zzans com.google.android.gms.internal.ads.zzans.a(aif)>
	//    4   10:areturn         
	}

	public final void a(a a1)
	{
		a.a((Context)com.google.android.gms.c.d.a(a1));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field aic a>
	//    2    4:aload_1         
	//    3    5:invokestatic    #132 <Method Object d.a(a)>
	//    4    8:checkcast       #134 <Class Context>
	//    5   11:invokevirtual   #137 <Method void com.google.android.gms.internal.ads.aic.a(Context)>
	//    6   14:return          
	}

	public final void a(a a1, String s, Bundle bundle, Bundle bundle1, zzwf zzwf1, mi mi)
	{
		try
		{
			mi = ((mi) (new mq(this, mi)));
	//    0    0:new             #142 <Class mq>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload           6
	//    4    7:invokespecial   #145 <Method void mq(ml, mi)>
	//    5   10:astore          6
			aic aic1 = a;
	//    6   12:aload_0         
	//    7   13:getfield        #13  <Field aic a>
	//    8   16:astore          7
			s = ((String) (new n(a(s), bundle1)));
	//    9   18:new             #147 <Class n>
	//   10   21:dup             
	//   11   22:aload_2         
	//   12   23:invokestatic    #149 <Method int a(String)>
	//   13   26:aload           4
	//   14   28:invokespecial   #152 <Method void n(int, Bundle)>
	//   15   31:astore_2        
			aic1.a(new aid((Context)com.google.android.gms.c.d.a(a1), ((n) (s)), bundle, t.a(zzwf1.e, zzwf1.b, zzwf1.a)), ((aie) (mi)));
	//   16   32:aload           7
	//   17   34:new             #154 <Class aid>
	//   18   37:dup             
	//   19   38:aload_1         
	//   20   39:invokestatic    #132 <Method Object d.a(a)>
	//   21   42:checkcast       #134 <Class Context>
	//   22   45:aload_2         
	//   23   46:aload_3         
	//   24   47:aload           5
	//   25   49:getfield        #158 <Field int zzwf.e>
	//   26   52:aload           5
	//   27   54:getfield        #159 <Field int zzwf.b>
	//   28   57:aload           5
	//   29   59:getfield        #162 <Field String com.google.android.gms.internal.ads.zzwf.a>
	//   30   62:invokestatic    #167 <Method com.google.android.gms.ads.f t.a(int, int, String)>
	//   31   65:invokespecial   #170 <Method void aid(Context, n, Bundle, com.google.android.gms.ads.f)>
	//   32   68:aload           6
	//   33   70:invokevirtual   #173 <Method void com.google.android.gms.internal.ads.aic.a(aid, aie)>
			return;
	//   34   73:return          
		}
		// Misplaced declaration of an exception variable
		catch(a a1)
	//*  35   74:astore_1        
		{
			aag.b("Error generating signals for RTB", ((Throwable) (a1)));
	//   36   75:ldc1            #175 <String "Error generating signals for RTB">
	//   37   77:aload_1         
	//   38   78:invokestatic    #112 <Method void aag.b(String, Throwable)>
		}
		throw new RemoteException();
	//   39   81:new             #114 <Class RemoteException>
	//   40   84:dup             
	//   41   85:invokespecial   #115 <Method void RemoteException()>
	//   42   88:athrow          
	}

	public final void a(String s, String s1, Bundle bundle, a a1, lw lw, ks ks, zzwf zzwf1)
	{
		try
		{
			lw = ((lw) (new mm(this, lw, ks)));
	//    0    0:new             #178 <Class mm>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload           5
	//    4    7:aload           6
	//    5    9:invokespecial   #181 <Method void mm(ml, lw, ks)>
	//    6   12:astore          5
			ks = ((ks) (a));
	//    7   14:aload_0         
	//    8   15:getfield        #13  <Field aic a>
	//    9   18:astore          6
			new aib((Context)com.google.android.gms.c.d.a(a1), s, b(s1), bundle);
	//   10   20:new             #183 <Class aib>
	//   11   23:dup             
	//   12   24:aload           4
	//   13   26:invokestatic    #132 <Method Object d.a(a)>
	//   14   29:checkcast       #134 <Class Context>
	//   15   32:aload_1         
	//   16   33:aload_2         
	//   17   34:invokestatic    #185 <Method Bundle b(String)>
	//   18   37:aload_3         
	//   19   38:invokespecial   #188 <Method void aib(Context, String, Bundle, Bundle)>
	//   20   41:pop             
			t.a(zzwf1.e, zzwf1.b, zzwf1.a);
	//   21   42:aload           7
	//   22   44:getfield        #158 <Field int zzwf.e>
	//   23   47:aload           7
	//   24   49:getfield        #159 <Field int zzwf.b>
	//   25   52:aload           7
	//   26   54:getfield        #162 <Field String com.google.android.gms.internal.ads.zzwf.a>
	//   27   57:invokestatic    #167 <Method com.google.android.gms.ads.f t.a(int, int, String)>
	//   28   60:pop             
			((ahy) (lw)).a(String.valueOf(((Object) (((Object) (ks)).getClass().getSimpleName()))).concat(" does not support banner ads."));
	//   29   61:aload           5
	//   30   63:aload           6
	//   31   65:invokevirtual   #194 <Method Class Object.getClass()>
	//   32   68:invokevirtual   #200 <Method String Class.getSimpleName()>
	//   33   71:invokestatic    #65  <Method String String.valueOf(Object)>
	//   34   74:ldc1            #202 <String " does not support banner ads.">
	//   35   76:invokevirtual   #74  <Method String String.concat(String)>
	//   36   79:invokeinterface #206 <Method void com.google.android.gms.internal.ads.ahy.a(String)>
			return;
	//   37   84:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  38   85:astore_1        
		{
			aag.b("Adapter failed to render banner ad.", ((Throwable) (s)));
	//   39   86:ldc1            #208 <String "Adapter failed to render banner ad.">
	//   40   88:aload_1         
	//   41   89:invokestatic    #112 <Method void aag.b(String, Throwable)>
		}
		throw new RemoteException();
	//   42   92:new             #114 <Class RemoteException>
	//   43   95:dup             
	//   44   96:invokespecial   #115 <Method void RemoteException()>
	//   45   99:athrow          
	}

	public final void a(String s, String s1, Bundle bundle, a a1, lz lz, ks ks)
	{
		try
		{
			lz = ((lz) (new mn(this, lz, ks)));
	//    0    0:new             #211 <Class mn>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload           5
	//    4    7:aload           6
	//    5    9:invokespecial   #214 <Method void mn(ml, lz, ks)>
	//    6   12:astore          5
			ks = ((ks) (a));
	//    7   14:aload_0         
	//    8   15:getfield        #13  <Field aic a>
	//    9   18:astore          6
			new aib((Context)com.google.android.gms.c.d.a(a1), s, b(s1), bundle);
	//   10   20:new             #183 <Class aib>
	//   11   23:dup             
	//   12   24:aload           4
	//   13   26:invokestatic    #132 <Method Object d.a(a)>
	//   14   29:checkcast       #134 <Class Context>
	//   15   32:aload_1         
	//   16   33:aload_2         
	//   17   34:invokestatic    #185 <Method Bundle b(String)>
	//   18   37:aload_3         
	//   19   38:invokespecial   #188 <Method void aib(Context, String, Bundle, Bundle)>
	//   20   41:pop             
			((ahy) (lz)).a(String.valueOf(((Object) (((Object) (ks)).getClass().getSimpleName()))).concat(" does not support interstitial ads."));
	//   21   42:aload           5
	//   22   44:aload           6
	//   23   46:invokevirtual   #194 <Method Class Object.getClass()>
	//   24   49:invokevirtual   #200 <Method String Class.getSimpleName()>
	//   25   52:invokestatic    #65  <Method String String.valueOf(Object)>
	//   26   55:ldc1            #216 <String " does not support interstitial ads.">
	//   27   57:invokevirtual   #74  <Method String String.concat(String)>
	//   28   60:invokeinterface #206 <Method void com.google.android.gms.internal.ads.ahy.a(String)>
			return;
	//   29   65:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  30   66:astore_1        
		{
			aag.b("Adapter failed to render interstitial ad.", ((Throwable) (s)));
	//   31   67:ldc1            #218 <String "Adapter failed to render interstitial ad.">
	//   32   69:aload_1         
	//   33   70:invokestatic    #112 <Method void aag.b(String, Throwable)>
		}
		throw new RemoteException();
	//   34   73:new             #114 <Class RemoteException>
	//   35   76:dup             
	//   36   77:invokespecial   #115 <Method void RemoteException()>
	//   37   80:athrow          
	}

	public final void a(String s, String s1, Bundle bundle, a a1, mb mb, ks ks)
	{
		try
		{
			mb = ((mb) (new mp(this, mb, ks)));
	//    0    0:new             #221 <Class mp>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload           5
	//    4    7:aload           6
	//    5    9:invokespecial   #224 <Method void mp(ml, mb, ks)>
	//    6   12:astore          5
			ks = ((ks) (a));
	//    7   14:aload_0         
	//    8   15:getfield        #13  <Field aic a>
	//    9   18:astore          6
			new aib((Context)com.google.android.gms.c.d.a(a1), s, b(s1), bundle);
	//   10   20:new             #183 <Class aib>
	//   11   23:dup             
	//   12   24:aload           4
	//   13   26:invokestatic    #132 <Method Object d.a(a)>
	//   14   29:checkcast       #134 <Class Context>
	//   15   32:aload_1         
	//   16   33:aload_2         
	//   17   34:invokestatic    #185 <Method Bundle b(String)>
	//   18   37:aload_3         
	//   19   38:invokespecial   #188 <Method void aib(Context, String, Bundle, Bundle)>
	//   20   41:pop             
			((ahy) (mb)).a(String.valueOf(((Object) (((Object) (ks)).getClass().getSimpleName()))).concat(" does not support native ads."));
	//   21   42:aload           5
	//   22   44:aload           6
	//   23   46:invokevirtual   #194 <Method Class Object.getClass()>
	//   24   49:invokevirtual   #200 <Method String Class.getSimpleName()>
	//   25   52:invokestatic    #65  <Method String String.valueOf(Object)>
	//   26   55:ldc1            #226 <String " does not support native ads.">
	//   27   57:invokevirtual   #74  <Method String String.concat(String)>
	//   28   60:invokeinterface #206 <Method void com.google.android.gms.internal.ads.ahy.a(String)>
			return;
	//   29   65:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  30   66:astore_1        
		{
			aag.b("Adapter failed to render rewarded ad.", ((Throwable) (s)));
	//   31   67:ldc1            #228 <String "Adapter failed to render rewarded ad.">
	//   32   69:aload_1         
	//   33   70:invokestatic    #112 <Method void aag.b(String, Throwable)>
		}
		throw new RemoteException();
	//   34   73:new             #114 <Class RemoteException>
	//   35   76:dup             
	//   36   77:invokespecial   #115 <Method void RemoteException()>
	//   37   80:athrow          
	}

	public final void a(String s, String s1, Bundle bundle, a a1, md md, ks ks)
	{
		try
		{
			md = ((md) (new mo(this, md, ks)));
	//    0    0:new             #231 <Class mo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload           5
	//    4    7:aload           6
	//    5    9:invokespecial   #234 <Method void mo(ml, md, ks)>
	//    6   12:astore          5
			ks = ((ks) (a));
	//    7   14:aload_0         
	//    8   15:getfield        #13  <Field aic a>
	//    9   18:astore          6
			new aib((Context)com.google.android.gms.c.d.a(a1), s, b(s1), bundle);
	//   10   20:new             #183 <Class aib>
	//   11   23:dup             
	//   12   24:aload           4
	//   13   26:invokestatic    #132 <Method Object d.a(a)>
	//   14   29:checkcast       #134 <Class Context>
	//   15   32:aload_1         
	//   16   33:aload_2         
	//   17   34:invokestatic    #185 <Method Bundle b(String)>
	//   18   37:aload_3         
	//   19   38:invokespecial   #188 <Method void aib(Context, String, Bundle, Bundle)>
	//   20   41:pop             
			((ahy) (md)).a(String.valueOf(((Object) (((Object) (ks)).getClass().getSimpleName()))).concat(" does not support rewarded ads."));
	//   21   42:aload           5
	//   22   44:aload           6
	//   23   46:invokevirtual   #194 <Method Class Object.getClass()>
	//   24   49:invokevirtual   #200 <Method String Class.getSimpleName()>
	//   25   52:invokestatic    #65  <Method String String.valueOf(Object)>
	//   26   55:ldc1            #236 <String " does not support rewarded ads.">
	//   27   57:invokevirtual   #74  <Method String String.concat(String)>
	//   28   60:invokeinterface #206 <Method void com.google.android.gms.internal.ads.ahy.a(String)>
			return;
	//   29   65:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  30   66:astore_1        
		{
			aag.b("Adapter failed to render rewarded ad.", ((Throwable) (s)));
	//   31   67:ldc1            #228 <String "Adapter failed to render rewarded ad.">
	//   32   69:aload_1         
	//   33   70:invokestatic    #112 <Method void aag.b(String, Throwable)>
		}
		throw new RemoteException();
	//   34   73:new             #114 <Class RemoteException>
	//   35   76:dup             
	//   36   77:invokespecial   #115 <Method void RemoteException()>
	//   37   80:athrow          
	}

	public final void a(String as[], Bundle abundle[])
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #241 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #242 <Method void ArrayList()>
	//    3    7:astore          4
		int i = 0;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		do
		{
			try
			{
				if(i >= as.length)
					break;
	//    6   11:iload_3         
	//    7   12:aload_1         
	//    8   13:arraylength     
	//    9   14:icmpge          48
				((List) (arraylist)).add(((Object) (new n(a(as[i]), abundle[i]))));
	//   10   17:aload           4
	//   11   19:new             #147 <Class n>
	//   12   22:dup             
	//   13   23:aload_1         
	//   14   24:iload_3         
	//   15   25:aaload          
	//   16   26:invokestatic    #149 <Method int a(String)>
	//   17   29:aload_2         
	//   18   30:iload_3         
	//   19   31:aaload          
	//   20   32:invokespecial   #152 <Method void n(int, Bundle)>
	//   21   35:invokeinterface #247 <Method boolean List.add(Object)>
	//   22   40:pop             
			}
	//*  23   41:iload_3         
	//*  24   42:iconst_1        
	//*  25   43:iadd            
	//*  26   44:istore_3        
	//*  27   45:goto            11
	//*  28   48:return          
	//*  29   49:new             #114 <Class RemoteException>
	//*  30   52:dup             
	//*  31   53:invokespecial   #115 <Method void RemoteException()>
	//*  32   56:athrow          
			// Misplaced declaration of an exception variable
			catch(String as[])
			{
				throw new RemoteException();
			}
			i++;
		} while(true);
	//*  33   57:astore_1        
	//*  34   58:goto            49
	}

	public final zzans b()
	{
		return com.google.android.gms.internal.ads.zzans.a(a.a());
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field aic a>
	//    2    4:invokevirtual   #249 <Method aif com.google.android.gms.internal.ads.aic.a()>
	//    3    7:invokestatic    #126 <Method zzans com.google.android.gms.internal.ads.zzans.a(aif)>
	//    4   10:areturn         
	}

	public final byg c()
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field aic a>
	//    2    4:astore_1        
		if(!(obj instanceof o))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #252 <Class o>
	//*   5    9:ifne            14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		try
		{
			obj = ((Object) (((o)obj).getVideoController()));
	//    8   14:aload_1         
	//    9   15:checkcast       #252 <Class o>
	//   10   18:invokeinterface #255 <Method byg o.getVideoController()>
	//   11   23:astore_1        
		}
	//*  12   24:aload_1         
	//*  13   25:areturn         
		catch(Throwable throwable)
	//*  14   26:astore_1        
		{
			aag.b("", throwable);
	//   15   27:ldc1            #109 <String "">
	//   16   29:aload_1         
	//   17   30:invokestatic    #112 <Method void aag.b(String, Throwable)>
			return null;
	//   18   33:aconst_null     
	//   19   34:areturn         
		}
		return ((byg) (obj));
	}

	public final void d()
	{
		try
		{
			throw new NullPointerException();
	//    0    0:new             #257 <Class NullPointerException>
	//    1    3:dup             
	//    2    4:invokespecial   #258 <Method void NullPointerException()>
	//    3    7:athrow          
		}
		catch(Throwable throwable)
	//*   4    8:astore_1        
		{
			aag.b("", throwable);
	//    5    9:ldc1            #109 <String "">
	//    6   11:aload_1         
	//    7   12:invokestatic    #112 <Method void aag.b(String, Throwable)>
		}
		throw new RemoteException();
	//    8   15:new             #114 <Class RemoteException>
	//    9   18:dup             
	//   10   19:invokespecial   #115 <Method void RemoteException()>
	//   11   22:athrow          
	}

	public final void e()
	{
		try
		{
			throw new NullPointerException();
	//    0    0:new             #257 <Class NullPointerException>
	//    1    3:dup             
	//    2    4:invokespecial   #258 <Method void NullPointerException()>
	//    3    7:athrow          
		}
		catch(Throwable throwable)
	//*   4    8:astore_1        
		{
			aag.b("", throwable);
	//    5    9:ldc1            #109 <String "">
	//    6   11:aload_1         
	//    7   12:invokestatic    #112 <Method void aag.b(String, Throwable)>
		}
		throw new RemoteException();
	//    8   15:new             #114 <Class RemoteException>
	//    9   18:dup             
	//   10   19:invokespecial   #115 <Method void RemoteException()>
	//   11   22:athrow          
	}

	private final aic a;
}
