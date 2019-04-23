// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.util.e;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wx, xa, p, bwk, 
//			m, zzwb

public final class wn
{

	public wn(String s, xa xa1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		b = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #29  <Long -1L>
	//    4    8:putfield        #32  <Field long b>
		c = -1L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #29  <Long -1L>
	//    7   15:putfield        #34  <Field long c>
		d = -1;
	//    8   18:aload_0         
	//    9   19:iconst_m1       
	//   10   20:putfield        #36  <Field int d>
		a = -1;
	//   11   23:aload_0         
	//   12   24:iconst_m1       
	//   13   25:putfield        #38  <Field int a>
		e = 0L;
	//   14   28:aload_0         
	//   15   29:lconst_0        
	//   16   30:putfield        #40  <Field long e>
	//   17   33:aload_0         
	//   18   34:new             #4   <Class Object>
	//   19   37:dup             
	//   20   38:invokespecial   #28  <Method void Object()>
	//   21   41:putfield        #42  <Field Object f>
		i = 0;
	//   22   44:aload_0         
	//   23   45:iconst_0        
	//   24   46:putfield        #44  <Field int i>
		j = 0;
	//   25   49:aload_0         
	//   26   50:iconst_0        
	//   27   51:putfield        #46  <Field int j>
		g = s;
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:putfield        #48  <Field String g>
		h = xa1;
	//   31   59:aload_0         
	//   32   60:aload_2         
	//   33   61:putfield        #50  <Field xa h>
	//   34   64:return          
	}

	private static boolean a(Context context)
	{
		int k;
		ComponentName componentname;
		k = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method Resources Context.getResources()>
	//    2    4:ldc1            #62  <String "Theme.Translucent">
	//    3    6:ldc1            #64  <String "style">
	//    4    8:ldc1            #66  <String "android">
	//    5   10:invokevirtual   #72  <Method int Resources.getIdentifier(String, String, String)>
	//    6   13:istore_1        
		if(k == 0)
	//*   7   14:iload_1         
	//*   8   15:ifne            25
		{
			wx.d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
	//    9   18:ldc1            #74  <String "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.">
	//   10   20:invokestatic    #79  <Method void wx.d(String)>
			return false;
	//   11   23:iconst_0        
	//   12   24:ireturn         
		}
		componentname = new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity");
	//   13   25:new             #81  <Class ComponentName>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:invokevirtual   #85  <Method String Context.getPackageName()>
	//   17   33:ldc1            #87  <String "com.google.android.gms.ads.AdActivity">
	//   18   35:invokespecial   #90  <Method void ComponentName(String, String)>
	//   19   38:astore_2        
		if(k == context.getPackageManager().getActivityInfo(componentname, 0).theme)
	//*  20   39:iload_1         
	//*  21   40:aload_0         
	//*  22   41:invokevirtual   #94  <Method PackageManager Context.getPackageManager()>
	//*  23   44:aload_2         
	//*  24   45:iconst_0        
	//*  25   46:invokevirtual   #100 <Method ActivityInfo PackageManager.getActivityInfo(ComponentName, int)>
	//*  26   49:getfield        #105 <Field int ActivityInfo.theme>
	//*  27   52:icmpne          57
			return true;
	//   28   55:iconst_1        
	//   29   56:ireturn         
		try
		{
			wx.d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
	//   30   57:ldc1            #74  <String "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.">
	//   31   59:invokestatic    #79  <Method void wx.d(String)>
		}
	//*  32   62:iconst_0        
	//*  33   63:ireturn         
	//*  34   64:ldc1            #107 <String "Fail to fetch AdActivity theme">
	//*  35   66:invokestatic    #109 <Method void com.google.android.gms.internal.ads.wx.e(String)>
	//*  36   69:ldc1            #74  <String "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.">
	//*  37   71:invokestatic    #79  <Method void wx.d(String)>
	//*  38   74:iconst_0        
	//*  39   75:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			com.google.android.gms.internal.ads.wx.e("Fail to fetch AdActivity theme");
			wx.d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
			return false;
		}
		return false;
	//*  40   76:astore_0        
	//*  41   77:goto            64
	}

	public final Bundle a(Context context, String s)
	{
		Bundle bundle;
		synchronized(f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field Object f>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			bundle = new Bundle();
	//    5    7:new             #112 <Class Bundle>
	//    6   10:dup             
	//    7   11:invokespecial   #113 <Method void Bundle()>
	//    8   14:astore          4
			bundle.putString("session_id", g);
	//    9   16:aload           4
	//   10   18:ldc1            #115 <String "session_id">
	//   11   20:aload_0         
	//   12   21:getfield        #48  <Field String g>
	//   13   24:invokevirtual   #118 <Method void Bundle.putString(String, String)>
			bundle.putLong("basets", c);
	//   14   27:aload           4
	//   15   29:ldc1            #120 <String "basets">
	//   16   31:aload_0         
	//   17   32:getfield        #34  <Field long c>
	//   18   35:invokevirtual   #124 <Method void Bundle.putLong(String, long)>
			bundle.putLong("currts", b);
	//   19   38:aload           4
	//   20   40:ldc1            #126 <String "currts">
	//   21   42:aload_0         
	//   22   43:getfield        #32  <Field long b>
	//   23   46:invokevirtual   #124 <Method void Bundle.putLong(String, long)>
			bundle.putString("seq_num", s);
	//   24   49:aload           4
	//   25   51:ldc1            #128 <String "seq_num">
	//   26   53:aload_2         
	//   27   54:invokevirtual   #118 <Method void Bundle.putString(String, String)>
			bundle.putInt("preqs", d);
	//   28   57:aload           4
	//   29   59:ldc1            #130 <String "preqs">
	//   30   61:aload_0         
	//   31   62:getfield        #36  <Field int d>
	//   32   65:invokevirtual   #134 <Method void Bundle.putInt(String, int)>
			bundle.putInt("preqs_in_session", a);
	//   33   68:aload           4
	//   34   70:ldc1            #136 <String "preqs_in_session">
	//   35   72:aload_0         
	//   36   73:getfield        #38  <Field int a>
	//   37   76:invokevirtual   #134 <Method void Bundle.putInt(String, int)>
			bundle.putLong("time_in_session", e);
	//   38   79:aload           4
	//   39   81:ldc1            #138 <String "time_in_session">
	//   40   83:aload_0         
	//   41   84:getfield        #40  <Field long e>
	//   42   87:invokevirtual   #124 <Method void Bundle.putLong(String, long)>
			bundle.putInt("pclick", i);
	//   43   90:aload           4
	//   44   92:ldc1            #140 <String "pclick">
	//   45   94:aload_0         
	//   46   95:getfield        #44  <Field int i>
	//   47   98:invokevirtual   #134 <Method void Bundle.putInt(String, int)>
			bundle.putInt("pimp", j);
	//   48  101:aload           4
	//   49  103:ldc1            #142 <String "pimp">
	//   50  105:aload_0         
	//   51  106:getfield        #46  <Field int j>
	//   52  109:invokevirtual   #134 <Method void Bundle.putInt(String, int)>
			bundle.putBoolean("support_transparent_background", a(context));
	//   53  112:aload           4
	//   54  114:ldc1            #144 <String "support_transparent_background">
	//   55  116:aload_1         
	//   56  117:invokestatic    #146 <Method boolean a(Context)>
	//   57  120:invokevirtual   #150 <Method void Bundle.putBoolean(String, boolean)>
		}
	//   58  123:aload_3         
	//   59  124:monitorexit     
		return bundle;
	//   60  125:aload           4
	//   61  127:areturn         
		context;
	//   62  128:astore_1        
		obj;
	//   63  129:aload_3         
		JVM INSTR monitorexit ;
	//   64  130:monitorexit     
		throw context;
	//   65  131:aload_1         
	//   66  132:athrow          
	}

	public final void a()
	{
		synchronized(f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field Object f>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			i = i + 1;
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #44  <Field int i>
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #44  <Field int i>
		}
	//   11   17:aload_1         
	//   12   18:monitorexit     
		return;
	//   13   19:return          
		exception;
	//   14   20:astore_2        
		obj;
	//   15   21:aload_1         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_2         
	//   18   24:athrow          
	}

	public final void a(zzwb zzwb1, long l)
	{
		Object obj = f;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Object f>
	//    2    4:astore          8
		obj;
	//    3    6:aload           8
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		long l2;
		long l1 = h.i();
	//    5    9:aload_0         
	//    6   10:getfield        #50  <Field xa h>
	//    7   13:invokeinterface #156 <Method long xa.i()>
	//    8   18:lstore          4
		l2 = aw.l().a();
	//    9   20:invokestatic    #162 <Method e aw.l()>
	//   10   23:invokeinterface #166 <Method long e.a()>
	//   11   28:lstore          6
		if(c != -1L)
			break MISSING_BLOCK_LABEL_106;
	//   12   30:aload_0         
	//   13   31:getfield        #34  <Field long c>
	//   14   34:ldc2w           #29  <Long -1L>
	//   15   37:lcmp            
	//   16   38:ifne            106
		com.google.android.gms.internal.ads.e e1 = p.av;
	//   17   41:getstatic       #172 <Field com.google.android.gms.internal.ads.e p.av>
	//   18   44:astore          9
		if(l2 - l1 > ((Long)com.google.android.gms.internal.ads.bwk.e().a(e1)).longValue())
	//*  19   46:lload           6
	//*  20   48:lload           4
	//*  21   50:lsub            
	//*  22   51:invokestatic    #177 <Method m com.google.android.gms.internal.ads.bwk.e()>
	//*  23   54:aload           9
	//*  24   56:invokevirtual   #182 <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//*  25   59:checkcast       #184 <Class Long>
	//*  26   62:invokevirtual   #187 <Method long Long.longValue()>
	//*  27   65:lcmp            
	//*  28   66:ifle            77
		{
			a = -1;
	//   29   69:aload_0         
	//   30   70:iconst_m1       
	//   31   71:putfield        #38  <Field int a>
			break MISSING_BLOCK_LABEL_90;
	//   32   74:goto            90
		}
		a = h.j();
	//   33   77:aload_0         
	//   34   78:aload_0         
	//   35   79:getfield        #50  <Field xa h>
	//   36   82:invokeinterface #190 <Method int xa.j()>
	//   37   87:putfield        #38  <Field int a>
		c = l;
	//   38   90:aload_0         
	//   39   91:lload_2         
	//   40   92:putfield        #34  <Field long c>
		b = c;
	//   41   95:aload_0         
	//   42   96:aload_0         
	//   43   97:getfield        #34  <Field long c>
	//   44  100:putfield        #32  <Field long b>
		break MISSING_BLOCK_LABEL_111;
	//   45  103:goto            111
		b = l;
	//   46  106:aload_0         
	//   47  107:lload_2         
	//   48  108:putfield        #32  <Field long b>
		if(zzwb1 == null)
			break MISSING_BLOCK_LABEL_140;
	//   49  111:aload_1         
	//   50  112:ifnull          140
		if(zzwb1.c == null || zzwb1.c.getInt("gw", 2) != 1)
			break MISSING_BLOCK_LABEL_140;
	//   51  115:aload_1         
	//   52  116:getfield        #195 <Field Bundle zzwb.c>
	//   53  119:ifnull          140
	//   54  122:aload_1         
	//   55  123:getfield        #195 <Field Bundle zzwb.c>
	//   56  126:ldc1            #197 <String "gw">
	//   57  128:iconst_2        
	//   58  129:invokevirtual   #201 <Method int Bundle.getInt(String, int)>
	//   59  132:iconst_1        
	//   60  133:icmpne          140
		obj;
	//   61  136:aload           8
		JVM INSTR monitorexit ;
	//   62  138:monitorexit     
		return;
	//   63  139:return          
		d = d + 1;
	//   64  140:aload_0         
	//   65  141:aload_0         
	//   66  142:getfield        #36  <Field int d>
	//   67  145:iconst_1        
	//   68  146:iadd            
	//   69  147:putfield        #36  <Field int d>
		a = a + 1;
	//   70  150:aload_0         
	//   71  151:aload_0         
	//   72  152:getfield        #38  <Field int a>
	//   73  155:iconst_1        
	//   74  156:iadd            
	//   75  157:putfield        #38  <Field int a>
		if(a == 0)
	//*  76  160:aload_0         
	//*  77  161:getfield        #38  <Field int a>
	//*  78  164:ifne            186
		{
			e = 0L;
	//   79  167:aload_0         
	//   80  168:lconst_0        
	//   81  169:putfield        #40  <Field long e>
			h.b(l2);
	//   82  172:aload_0         
	//   83  173:getfield        #50  <Field xa h>
	//   84  176:lload           6
	//   85  178:invokeinterface #204 <Method void xa.b(long)>
			break MISSING_BLOCK_LABEL_202;
	//   86  183:goto            202
		}
		e = l2 - h.k();
	//   87  186:aload_0         
	//   88  187:lload           6
	//   89  189:aload_0         
	//   90  190:getfield        #50  <Field xa h>
	//   91  193:invokeinterface #207 <Method long xa.k()>
	//   92  198:lsub            
	//   93  199:putfield        #40  <Field long e>
		obj;
	//   94  202:aload           8
		JVM INSTR monitorexit ;
	//   95  204:monitorexit     
		return;
	//   96  205:return          
		zzwb1;
	//   97  206:astore_1        
		obj;
	//   98  207:aload           8
		JVM INSTR monitorexit ;
	//   99  209:monitorexit     
		throw zzwb1;
	//  100  210:aload_1         
	//  101  211:athrow          
	}

	public final void b()
	{
		synchronized(f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field Object f>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			j = j + 1;
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #46  <Field int j>
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #46  <Field int j>
		}
	//   11   17:aload_1         
	//   12   18:monitorexit     
		return;
	//   13   19:return          
		exception;
	//   14   20:astore_2        
		obj;
	//   15   21:aload_1         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_2         
	//   18   24:athrow          
	}

	int a;
	private long b;
	private long c;
	private int d;
	private long e;
	private final Object f = new Object();
	private final String g;
	private final xa h;
	private int i;
	private int j;
}
