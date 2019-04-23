// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.h;
import com.google.ads.mediation.k;
import com.google.ads.mediation.n;
import com.google.android.gms.ads.t;
import com.google.android.gms.c.a;
import com.google.android.gms.c.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			kq, aag, zzwb, bwk, 
//			zv, lq, lt, zzwf, 
//			ux, ks, zzacp, ky, 
//			lb, db, byg, le

public final class lp extends kq
{

	public lp(h h1, n n1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void kq()>
		a = h1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field h a>
		b = n1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #18  <Field n b>
	//    8   14:return          
	}

	private final k a(String s, int i1, String s1)
	{
		if(s == null)
			break MISSING_BLOCK_LABEL_74;
	//    0    0:aload_1         
	//    1    1:ifnull          74
		Object obj;
		Iterator iterator;
		try
		{
			obj = ((Object) (new JSONObject(s)));
	//    2    4:new             #24  <Class JSONObject>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #27  <Method void JSONObject(String)>
	//    6   12:astore          4
			s1 = ((String) (new HashMap(((JSONObject) (obj)).length())));
	//    7   14:new             #29  <Class HashMap>
	//    8   17:dup             
	//    9   18:aload           4
	//   10   20:invokevirtual   #33  <Method int JSONObject.length()>
	//   11   23:invokespecial   #36  <Method void HashMap(int)>
	//   12   26:astore_3        
			iterator = ((JSONObject) (obj)).keys();
	//   13   27:aload           4
	//   14   29:invokevirtual   #40  <Method Iterator JSONObject.keys()>
	//   15   32:astore          5
		}
	//*  16   34:aload_3         
	//*  17   35:astore_1        
	//*  18   36:aload           5
	//*  19   38:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//*  20   43:ifeq            83
	//*  21   46:aload           5
	//*  22   48:invokeinterface #50  <Method Object Iterator.next()>
	//*  23   53:checkcast       #52  <Class String>
	//*  24   56:astore_1        
	//*  25   57:aload_3         
	//*  26   58:aload_1         
	//*  27   59:aload           4
	//*  28   61:aload_1         
	//*  29   62:invokevirtual   #56  <Method String JSONObject.getString(String)>
	//*  30   65:invokeinterface #62  <Method Object Map.put(Object, Object)>
	//*  31   70:pop             
	//*  32   71:goto            34
	//*  33   74:new             #29  <Class HashMap>
	//*  34   77:dup             
	//*  35   78:iconst_0        
	//*  36   79:invokespecial   #36  <Method void HashMap(int)>
	//*  37   82:astore_1        
	//*  38   83:aload_0         
	//*  39   84:getfield        #16  <Field h a>
	//*  40   87:invokeinterface #68  <Method Class h.getServerParametersType()>
	//*  41   92:astore          4
	//*  42   94:aconst_null     
	//*  43   95:astore_3        
	//*  44   96:aload           4
	//*  45   98:ifnull          115
	//*  46  101:aload           4
	//*  47  103:invokevirtual   #73  <Method Object Class.newInstance()>
	//*  48  106:checkcast       #75  <Class k>
	//*  49  109:astore_3        
	//*  50  110:aload_3         
	//*  51  111:aload_1         
	//*  52  112:invokevirtual   #78  <Method void k.a(Map)>
	//*  53  115:aload_3         
	//*  54  116:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  55  117:astore_1        
		{
			aag.b("", ((Throwable) (s)));
	//   56  118:ldc1            #80  <String "">
	//   57  120:aload_1         
	//   58  121:invokestatic    #85  <Method void aag.b(String, Throwable)>
			throw new RemoteException();
	//   59  124:new             #87  <Class RemoteException>
	//   60  127:dup             
	//   61  128:invokespecial   #88  <Method void RemoteException()>
	//   62  131:athrow          
		}
		s = s1;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_83;
		s = (String)iterator.next();
		((Map) (s1)).put(((Object) (s)), ((Object) (((JSONObject) (obj)).getString(s))));
		break MISSING_BLOCK_LABEL_34;
		s = ((String) (new HashMap(0)));
		obj = ((Object) (a.getServerParametersType()));
		s1 = null;
		if(obj == null)
			break MISSING_BLOCK_LABEL_115;
		s1 = ((String) ((k)((Class) (obj)).newInstance()));
		((k) (s1)).a(((Map) (s)));
		return ((k) (s1));
	}

	private static boolean a(zzwb zzwb1)
	{
		if(!zzwb1.f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field boolean zzwb.f>
	//*   2    4:ifne            22
		{
			com.google.android.gms.internal.ads.bwk.a();
	//    3    7:invokestatic    #100 <Method zv com.google.android.gms.internal.ads.bwk.a()>
	//    4   10:pop             
			if(!com.google.android.gms.internal.ads.zv.a())
	//*   5   11:invokestatic    #104 <Method boolean com.google.android.gms.internal.ads.zv.a()>
	//*   6   14:ifeq            20
	//*   7   17:goto            22
				return false;
	//    8   20:iconst_0        
	//    9   21:ireturn         
		}
		return true;
	//   10   22:iconst_1        
	//   11   23:ireturn         
	}

	public final a a()
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field h a>
	//    2    4:astore_1        
		if(!(obj instanceof MediationBannerAdapter))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #107 <Class MediationBannerAdapter>
	//*   5    9:ifne            62
		{
			obj = ((Object) (String.valueOf(((Object) (obj.getClass().getCanonicalName())))));
	//    6   12:aload_1         
	//    7   13:invokevirtual   #112 <Method Class Object.getClass()>
	//    8   16:invokevirtual   #116 <Method String Class.getCanonicalName()>
	//    9   19:invokestatic    #120 <Method String String.valueOf(Object)>
	//   10   22:astore_1        
			if(((String) (obj)).length() != 0)
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #121 <Method int String.length()>
	//*  13   27:ifeq            40
				obj = ((Object) ("Not a MediationBannerAdapter: ".concat(((String) (obj)))));
	//   14   30:ldc1            #123 <String "Not a MediationBannerAdapter: ">
	//   15   32:aload_1         
	//   16   33:invokevirtual   #126 <Method String String.concat(String)>
	//   17   36:astore_1        
			else
	//*  18   37:goto            50
				obj = ((Object) (new String("Not a MediationBannerAdapter: ")));
	//   19   40:new             #52  <Class String>
	//   20   43:dup             
	//   21   44:ldc1            #123 <String "Not a MediationBannerAdapter: ">
	//   22   46:invokespecial   #127 <Method void String(String)>
	//   23   49:astore_1        
			aag.e(((String) (obj)));
	//   24   50:aload_1         
	//   25   51:invokestatic    #130 <Method void aag.e(String)>
			throw new RemoteException();
	//   26   54:new             #87  <Class RemoteException>
	//   27   57:dup             
	//   28   58:invokespecial   #88  <Method void RemoteException()>
	//   29   61:athrow          
		}
		try
		{
			obj = ((Object) (com.google.android.gms.c.d.a(((Object) (((MediationBannerAdapter)obj).getBannerView())))));
	//   30   62:aload_1         
	//   31   63:checkcast       #107 <Class MediationBannerAdapter>
	//   32   66:invokeinterface #134 <Method android.view.View MediationBannerAdapter.getBannerView()>
	//   33   71:invokestatic    #139 <Method a d.a(Object)>
	//   34   74:astore_1        
		}
	//*  35   75:aload_1         
	//*  36   76:areturn         
		catch(Throwable throwable)
	//*  37   77:astore_1        
		{
			aag.b("", throwable);
	//   38   78:ldc1            #80  <String "">
	//   39   80:aload_1         
	//   40   81:invokestatic    #85  <Method void aag.b(String, Throwable)>
			throw new RemoteException();
	//   41   84:new             #87  <Class RemoteException>
	//   42   87:dup             
	//   43   88:invokespecial   #88  <Method void RemoteException()>
	//   44   91:athrow          
		}
		return ((a) (obj));
	}

	public final void a(a a1)
	{
	//    0    0:return          
	}

	public final void a(a a1, ux ux, List list)
	{
	//    0    0:return          
	}

	public final void a(a a1, zzwb zzwb1, String s, ks ks)
	{
		a(a1, zzwb1, s, ((String) (null)), ks);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:aload           4
	//    6    7:invokevirtual   #145 <Method void a(a, zzwb, String, String, ks)>
	//    7   10:return          
	}

	public final void a(a a1, zzwb zzwb1, String s, ux ux, String s1)
	{
	//    0    0:return          
	}

	public final void a(a a1, zzwb zzwb1, String s, String s1, ks ks)
	{
		h h1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field h a>
	//    2    4:astore          6
		if(!(h1 instanceof MediationInterstitialAdapter))
	//*   3    6:aload           6
	//*   4    8:instanceof      #148 <Class MediationInterstitialAdapter>
	//*   5   11:ifne            65
		{
			a1 = ((a) (String.valueOf(((Object) (((Object) (h1)).getClass().getCanonicalName())))));
	//    6   14:aload           6
	//    7   16:invokevirtual   #112 <Method Class Object.getClass()>
	//    8   19:invokevirtual   #116 <Method String Class.getCanonicalName()>
	//    9   22:invokestatic    #120 <Method String String.valueOf(Object)>
	//   10   25:astore_1        
			if(((String) (a1)).length() != 0)
	//*  11   26:aload_1         
	//*  12   27:invokevirtual   #121 <Method int String.length()>
	//*  13   30:ifeq            43
				a1 = ((a) ("Not a MediationInterstitialAdapter: ".concat(((String) (a1)))));
	//   14   33:ldc1            #150 <String "Not a MediationInterstitialAdapter: ">
	//   15   35:aload_1         
	//   16   36:invokevirtual   #126 <Method String String.concat(String)>
	//   17   39:astore_1        
			else
	//*  18   40:goto            53
				a1 = ((a) (new String("Not a MediationInterstitialAdapter: ")));
	//   19   43:new             #52  <Class String>
	//   20   46:dup             
	//   21   47:ldc1            #150 <String "Not a MediationInterstitialAdapter: ">
	//   22   49:invokespecial   #127 <Method void String(String)>
	//   23   52:astore_1        
			aag.e(((String) (a1)));
	//   24   53:aload_1         
	//   25   54:invokestatic    #130 <Method void aag.e(String)>
			throw new RemoteException();
	//   26   57:new             #87  <Class RemoteException>
	//   27   60:dup             
	//   28   61:invokespecial   #88  <Method void RemoteException()>
	//   29   64:athrow          
		}
		aag.b("Requesting interstitial ad from adapter.");
	//   30   65:ldc1            #152 <String "Requesting interstitial ad from adapter.">
	//   31   67:invokestatic    #154 <Method void aag.b(String)>
		try
		{
			((MediationInterstitialAdapter)a).requestInterstitialAd(((com.google.ads.mediation.j) (new lq(ks))), (Activity)com.google.android.gms.c.d.a(a1), a(s, zzwb1.g, s1), com.google.android.gms.internal.ads.lt.a(zzwb1, a(zzwb1)), b);
	//   32   70:aload_0         
	//   33   71:getfield        #16  <Field h a>
	//   34   74:checkcast       #148 <Class MediationInterstitialAdapter>
	//   35   77:new             #156 <Class lq>
	//   36   80:dup             
	//   37   81:aload           5
	//   38   83:invokespecial   #159 <Method void lq(ks)>
	//   39   86:aload_1         
	//   40   87:invokestatic    #162 <Method Object d.a(a)>
	//   41   90:checkcast       #164 <Class Activity>
	//   42   93:aload_0         
	//   43   94:aload_3         
	//   44   95:aload_2         
	//   45   96:getfield        #168 <Field int zzwb.g>
	//   46   99:aload           4
	//   47  101:invokespecial   #170 <Method k a(String, int, String)>
	//   48  104:aload_2         
	//   49  105:aload_2         
	//   50  106:invokestatic    #172 <Method boolean a(zzwb)>
	//   51  109:invokestatic    #177 <Method com.google.ads.mediation.g com.google.android.gms.internal.ads.lt.a(zzwb, boolean)>
	//   52  112:aload_0         
	//   53  113:getfield        #18  <Field n b>
	//   54  116:invokeinterface #181 <Method void MediationInterstitialAdapter.requestInterstitialAd(com.google.ads.mediation.j, Activity, k, com.google.ads.mediation.g, n)>
			return;
	//   55  121:return          
		}
		// Misplaced declaration of an exception variable
		catch(a a1)
	//*  56  122:astore_1        
		{
			aag.b("", ((Throwable) (a1)));
	//   57  123:ldc1            #80  <String "">
	//   58  125:aload_1         
	//   59  126:invokestatic    #85  <Method void aag.b(String, Throwable)>
		}
		throw new RemoteException();
	//   60  129:new             #87  <Class RemoteException>
	//   61  132:dup             
	//   62  133:invokespecial   #88  <Method void RemoteException()>
	//   63  136:athrow          
	}

	public final void a(a a1, zzwb zzwb1, String s, String s1, ks ks, zzacp zzacp, List list)
	{
	//    0    0:return          
	}

	public final void a(a a1, zzwf zzwf1, zzwb zzwb1, String s, ks ks)
	{
		a(a1, zzwf1, zzwb1, s, ((String) (null)), ks);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:aload           5
	//    7    9:invokevirtual   #186 <Method void a(a, zzwf, zzwb, String, String, ks)>
	//    8   12:return          
	}

	public final void a(a a1, zzwf zzwf1, zzwb zzwb1, String s, String s1, ks ks)
	{
		int i1;
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field h a>
	//    2    4:astore          8
		if(!(obj instanceof MediationBannerAdapter))
	//*   3    6:aload           8
	//*   4    8:instanceof      #107 <Class MediationBannerAdapter>
	//*   5   11:ifne            65
		{
			a1 = ((a) (String.valueOf(((Object) (obj.getClass().getCanonicalName())))));
	//    6   14:aload           8
	//    7   16:invokevirtual   #112 <Method Class Object.getClass()>
	//    8   19:invokevirtual   #116 <Method String Class.getCanonicalName()>
	//    9   22:invokestatic    #120 <Method String String.valueOf(Object)>
	//   10   25:astore_1        
			if(((String) (a1)).length() != 0)
	//*  11   26:aload_1         
	//*  12   27:invokevirtual   #121 <Method int String.length()>
	//*  13   30:ifeq            43
				a1 = ((a) ("Not a MediationBannerAdapter: ".concat(((String) (a1)))));
	//   14   33:ldc1            #123 <String "Not a MediationBannerAdapter: ">
	//   15   35:aload_1         
	//   16   36:invokevirtual   #126 <Method String String.concat(String)>
	//   17   39:astore_1        
			else
	//*  18   40:goto            53
				a1 = ((a) (new String("Not a MediationBannerAdapter: ")));
	//   19   43:new             #52  <Class String>
	//   20   46:dup             
	//   21   47:ldc1            #123 <String "Not a MediationBannerAdapter: ">
	//   22   49:invokespecial   #127 <Method void String(String)>
	//   23   52:astore_1        
			aag.e(((String) (a1)));
	//   24   53:aload_1         
	//   25   54:invokestatic    #130 <Method void aag.e(String)>
			throw new RemoteException();
	//   26   57:new             #87  <Class RemoteException>
	//   27   60:dup             
	//   28   61:invokespecial   #88  <Method void RemoteException()>
	//   29   64:athrow          
		}
		aag.b("Requesting banner ad from adapter.");
	//   30   65:ldc1            #188 <String "Requesting banner ad from adapter.">
	//   31   67:invokestatic    #154 <Method void aag.b(String)>
		Activity activity;
		try
		{
			obj = ((Object) ((MediationBannerAdapter)a));
	//   32   70:aload_0         
	//   33   71:getfield        #16  <Field h a>
	//   34   74:checkcast       #107 <Class MediationBannerAdapter>
	//   35   77:astore          8
			ks = ((ks) (new lq(ks)));
	//   36   79:new             #156 <Class lq>
	//   37   82:dup             
	//   38   83:aload           6
	//   39   85:invokespecial   #159 <Method void lq(ks)>
	//   40   88:astore          6
			activity = (Activity)com.google.android.gms.c.d.a(a1);
	//   41   90:aload_1         
	//   42   91:invokestatic    #162 <Method Object d.a(a)>
	//   43   94:checkcast       #164 <Class Activity>
	//   44   97:astore          9
			s = ((String) (a(s, zzwb1.g, s1)));
	//   45   99:aload_0         
	//   46  100:aload           4
	//   47  102:aload_3         
	//   48  103:getfield        #168 <Field int zzwb.g>
	//   49  106:aload           5
	//   50  108:invokespecial   #170 <Method k a(String, int, String)>
	//   51  111:astore          4
			a1 = ((a) (new com.google.ads.d[6]));
	//   52  113:bipush          6
	//   53  115:anewarray       com.google.ads.d[]
	//   54  118:astore_1        
			s1 = ((String) (com.google.ads.d.a));
	//   55  119:getstatic       #193 <Field com.google.ads.d com.google.ads.d.a>
	//   56  122:astore          5
		}
	//*  57  124:iconst_0        
	//*  58  125:istore          7
	//*  59  127:aload_1         
	//*  60  128:iconst_0        
	//*  61  129:aload           5
	//*  62  131:aastore         
	//*  63  132:aload_1         
	//*  64  133:iconst_1        
	//*  65  134:getstatic       #195 <Field com.google.ads.d com.google.ads.d.b>
	//*  66  137:aastore         
	//*  67  138:aload_1         
	//*  68  139:iconst_2        
	//*  69  140:getstatic       #198 <Field com.google.ads.d com.google.ads.d.c>
	//*  70  143:aastore         
	//*  71  144:aload_1         
	//*  72  145:iconst_3        
	//*  73  146:getstatic       #201 <Field com.google.ads.d com.google.ads.d.d>
	//*  74  149:aastore         
	//*  75  150:aload_1         
	//*  76  151:iconst_4        
	//*  77  152:getstatic       #203 <Field com.google.ads.d com.google.ads.d.e>
	//*  78  155:aastore         
	//*  79  156:aload_1         
	//*  80  157:iconst_5        
	//*  81  158:getstatic       #205 <Field com.google.ads.d com.google.ads.d.f>
	//*  82  161:aastore         
	//*  83  162:iload           7
	//*  84  164:bipush          6
	//*  85  166:icmpge          205
	//*  86  169:aload_1         
	//*  87  170:iload           7
	//*  88  172:aaload          
	//*  89  173:invokevirtual   #207 <Method int com.google.ads.d.a()>
	//*  90  176:aload_2         
	//*  91  177:getfield        #211 <Field int zzwf.e>
	//*  92  180:icmpne          270
	//*  93  183:aload_1         
	//*  94  184:iload           7
	//*  95  186:aaload          
	//*  96  187:invokevirtual   #213 <Method int com.google.ads.d.b()>
	//*  97  190:aload_2         
	//*  98  191:getfield        #215 <Field int zzwf.b>
	//*  99  194:icmpne          270
	//* 100  197:aload_1         
	//* 101  198:iload           7
	//* 102  200:aaload          
	//* 103  201:astore_1        
	//* 104  202:goto            228
	//* 105  205:new             #190 <Class com.google.ads.d>
	//* 106  208:dup             
	//* 107  209:aload_2         
	//* 108  210:getfield        #211 <Field int zzwf.e>
	//* 109  213:aload_2         
	//* 110  214:getfield        #215 <Field int zzwf.b>
	//* 111  217:aload_2         
	//* 112  218:getfield        #218 <Field String com.google.android.gms.internal.ads.zzwf.a>
	//* 113  221:invokestatic    #223 <Method com.google.android.gms.ads.f t.a(int, int, String)>
	//* 114  224:invokespecial   #226 <Method void com.google.ads.d(com.google.android.gms.ads.f)>
	//* 115  227:astore_1        
	//* 116  228:aload           8
	//* 117  230:aload           6
	//* 118  232:aload           9
	//* 119  234:aload           4
	//* 120  236:aload_1         
	//* 121  237:aload_3         
	//* 122  238:aload_3         
	//* 123  239:invokestatic    #172 <Method boolean a(zzwb)>
	//* 124  242:invokestatic    #177 <Method com.google.ads.mediation.g com.google.android.gms.internal.ads.lt.a(zzwb, boolean)>
	//* 125  245:aload_0         
	//* 126  246:getfield        #18  <Field n b>
	//* 127  249:invokeinterface #230 <Method void MediationBannerAdapter.requestBannerAd(com.google.ads.mediation.i, Activity, k, com.google.ads.d, com.google.ads.mediation.g, n)>
	//* 128  254:return          
		// Misplaced declaration of an exception variable
		catch(a a1)
	//* 129  255:astore_1        
		{
			aag.b("", ((Throwable) (a1)));
	//  130  256:ldc1            #80  <String "">
	//  131  258:aload_1         
	//  132  259:invokestatic    #85  <Method void aag.b(String, Throwable)>
			throw new RemoteException();
	//  133  262:new             #87  <Class RemoteException>
	//  134  265:dup             
	//  135  266:invokespecial   #88  <Method void RemoteException()>
	//  136  269:athrow          
		}
		i1 = 0;
		a1[0] = ((/*<invalid signature>*/java.lang.Object) (s1));
		a1[1] = ((/*<invalid signature>*/java.lang.Object) (com.google.ads.d.b));
		a1[2] = ((/*<invalid signature>*/java.lang.Object) (com.google.ads.d.c));
		a1[3] = ((/*<invalid signature>*/java.lang.Object) (com.google.ads.d.d));
		a1[4] = ((/*<invalid signature>*/java.lang.Object) (com.google.ads.d.e));
		a1[5] = ((/*<invalid signature>*/java.lang.Object) (com.google.ads.d.f));
_L2:
		if(i1 >= 6)
			break MISSING_BLOCK_LABEL_205;
		if(((com.google.ads.d) (a1[i1])).a() != zzwf1.e || ((com.google.ads.d) (a1[i1])).b() != zzwf1.b)
			break MISSING_BLOCK_LABEL_270;
		a1 = ((a) (a1[i1]));
		break MISSING_BLOCK_LABEL_228;
		a1 = ((a) (new com.google.ads.d(t.a(zzwf1.e, zzwf1.b, zzwf1.a))));
		((MediationBannerAdapter) (obj)).requestBannerAd(((com.google.ads.mediation.i) (ks)), activity, ((k) (s)), ((com.google.ads.d) (a1)), com.google.android.gms.internal.ads.lt.a(zzwb1, a(zzwb1)), b);
		return;
		i1++;
	//  137  270:iload           7
	//  138  272:iconst_1        
	//  139  273:iadd            
	//  140  274:istore          7
		if(true) goto _L2; else goto _L1
	//  141  276:goto            162
_L1:
	}

	public final void a(zzwb zzwb1, String s)
	{
	//    0    0:return          
	}

	public final void a(zzwb zzwb1, String s, String s1)
	{
	//    0    0:return          
	}

	public final void a(boolean flag)
	{
	//    0    0:return          
	}

	public final void b()
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field h a>
	//    2    4:astore_1        
		if(!(obj instanceof MediationInterstitialAdapter))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #148 <Class MediationInterstitialAdapter>
	//*   5    9:ifne            62
		{
			obj = ((Object) (String.valueOf(((Object) (obj.getClass().getCanonicalName())))));
	//    6   12:aload_1         
	//    7   13:invokevirtual   #112 <Method Class Object.getClass()>
	//    8   16:invokevirtual   #116 <Method String Class.getCanonicalName()>
	//    9   19:invokestatic    #120 <Method String String.valueOf(Object)>
	//   10   22:astore_1        
			if(((String) (obj)).length() != 0)
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #121 <Method int String.length()>
	//*  13   27:ifeq            40
				obj = ((Object) ("Not a MediationInterstitialAdapter: ".concat(((String) (obj)))));
	//   14   30:ldc1            #150 <String "Not a MediationInterstitialAdapter: ">
	//   15   32:aload_1         
	//   16   33:invokevirtual   #126 <Method String String.concat(String)>
	//   17   36:astore_1        
			else
	//*  18   37:goto            50
				obj = ((Object) (new String("Not a MediationInterstitialAdapter: ")));
	//   19   40:new             #52  <Class String>
	//   20   43:dup             
	//   21   44:ldc1            #150 <String "Not a MediationInterstitialAdapter: ">
	//   22   46:invokespecial   #127 <Method void String(String)>
	//   23   49:astore_1        
			aag.e(((String) (obj)));
	//   24   50:aload_1         
	//   25   51:invokestatic    #130 <Method void aag.e(String)>
			throw new RemoteException();
	//   26   54:new             #87  <Class RemoteException>
	//   27   57:dup             
	//   28   58:invokespecial   #88  <Method void RemoteException()>
	//   29   61:athrow          
		}
		aag.b("Showing interstitial from adapter.");
	//   30   62:ldc1            #235 <String "Showing interstitial from adapter.">
	//   31   64:invokestatic    #154 <Method void aag.b(String)>
		try
		{
			((MediationInterstitialAdapter)a).showInterstitial();
	//   32   67:aload_0         
	//   33   68:getfield        #16  <Field h a>
	//   34   71:checkcast       #148 <Class MediationInterstitialAdapter>
	//   35   74:invokeinterface #238 <Method void MediationInterstitialAdapter.showInterstitial()>
			return;
	//   36   79:return          
		}
		catch(Throwable throwable)
	//*  37   80:astore_1        
		{
			aag.b("", throwable);
	//   38   81:ldc1            #80  <String "">
	//   39   83:aload_1         
	//   40   84:invokestatic    #85  <Method void aag.b(String, Throwable)>
		}
		throw new RemoteException();
	//   41   87:new             #87  <Class RemoteException>
	//   42   90:dup             
	//   43   91:invokespecial   #88  <Method void RemoteException()>
	//   44   94:athrow          
	}

	public final void c()
	{
		try
		{
			a.destroy();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field h a>
	//    2    4:invokeinterface #241 <Method void h.destroy()>
			return;
	//    3    9:return          
		}
		catch(Throwable throwable)
	//*   4   10:astore_1        
		{
			aag.b("", throwable);
	//    5   11:ldc1            #80  <String "">
	//    6   13:aload_1         
	//    7   14:invokestatic    #85  <Method void aag.b(String, Throwable)>
		}
		throw new RemoteException();
	//    8   17:new             #87  <Class RemoteException>
	//    9   20:dup             
	//   10   21:invokespecial   #88  <Method void RemoteException()>
	//   11   24:athrow          
	}

	public final void d()
	{
		throw new RemoteException();
	//    0    0:new             #87  <Class RemoteException>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void RemoteException()>
	//    3    7:athrow          
	}

	public final void e()
	{
		throw new RemoteException();
	//    0    0:new             #87  <Class RemoteException>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void RemoteException()>
	//    3    7:athrow          
	}

	public final void f()
	{
	//    0    0:return          
	}

	public final boolean g()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final ky h()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final lb i()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final Bundle j()
	{
		return new Bundle();
	//    0    0:new             #249 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #250 <Method void Bundle()>
	//    3    7:areturn         
	}

	public final Bundle k()
	{
		return new Bundle();
	//    0    0:new             #249 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #250 <Method void Bundle()>
	//    3    7:areturn         
	}

	public final Bundle l()
	{
		return new Bundle();
	//    0    0:new             #249 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #250 <Method void Bundle()>
	//    3    7:areturn         
	}

	public final boolean m()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final db n()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final byg o()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final le p()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	private final h a;
	private final n b;
}
