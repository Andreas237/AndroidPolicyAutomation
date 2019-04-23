// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.e;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.measurement.internal:
//			bu, ah, ag, aj, 
//			bt, h, ew, s, 
//			u, eo, ai, i, 
//			ax

final class ae extends bu
{

	ae(ax ax)
	{
		super(ax);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #56  <Method void bu(ax)>
	//    3    5:aload_0         
	//    4    6:new             #58  <Class ah>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:ldc1            #60  <String "last_upload">
	//    8   13:lconst_0        
	//    9   14:invokespecial   #63  <Method void ah(ae, String, long)>
	//   10   17:putfield        #65  <Field ah c>
	//   11   20:aload_0         
	//   12   21:new             #58  <Class ah>
	//   13   24:dup             
	//   14   25:aload_0         
	//   15   26:ldc1            #67  <String "last_upload_attempt">
	//   16   28:lconst_0        
	//   17   29:invokespecial   #63  <Method void ah(ae, String, long)>
	//   18   32:putfield        #69  <Field ah d>
	//   19   35:aload_0         
	//   20   36:new             #58  <Class ah>
	//   21   39:dup             
	//   22   40:aload_0         
	//   23   41:ldc1            #71  <String "backoff">
	//   24   43:lconst_0        
	//   25   44:invokespecial   #63  <Method void ah(ae, String, long)>
	//   26   47:putfield        #73  <Field ah e>
	//   27   50:aload_0         
	//   28   51:new             #58  <Class ah>
	//   29   54:dup             
	//   30   55:aload_0         
	//   31   56:ldc1            #75  <String "last_delete_stale">
	//   32   58:lconst_0        
	//   33   59:invokespecial   #63  <Method void ah(ae, String, long)>
	//   34   62:putfield        #77  <Field ah f>
	//   35   65:aload_0         
	//   36   66:new             #58  <Class ah>
	//   37   69:dup             
	//   38   70:aload_0         
	//   39   71:ldc1            #79  <String "time_before_start">
	//   40   73:ldc2w           #80  <Long 10000L>
	//   41   76:invokespecial   #63  <Method void ah(ae, String, long)>
	//   42   79:putfield        #83  <Field ah k>
	//   43   82:aload_0         
	//   44   83:new             #58  <Class ah>
	//   45   86:dup             
	//   46   87:aload_0         
	//   47   88:ldc1            #85  <String "session_timeout">
	//   48   90:ldc2w           #86  <Long 0x1b7740L>
	//   49   93:invokespecial   #63  <Method void ah(ae, String, long)>
	//   50   96:putfield        #89  <Field ah l>
	//   51   99:aload_0         
	//   52  100:new             #91  <Class ag>
	//   53  103:dup             
	//   54  104:aload_0         
	//   55  105:ldc1            #93  <String "start_new_session">
	//   56  107:iconst_1        
	//   57  108:invokespecial   #96  <Method void ag(ae, String, boolean)>
	//   58  111:putfield        #98  <Field ag m>
	//   59  114:aload_0         
	//   60  115:new             #58  <Class ah>
	//   61  118:dup             
	//   62  119:aload_0         
	//   63  120:ldc1            #100 <String "last_pause_time">
	//   64  122:lconst_0        
	//   65  123:invokespecial   #63  <Method void ah(ae, String, long)>
	//   66  126:putfield        #102 <Field ah n>
	//   67  129:aload_0         
	//   68  130:new             #58  <Class ah>
	//   69  133:dup             
	//   70  134:aload_0         
	//   71  135:ldc1            #104 <String "time_active">
	//   72  137:lconst_0        
	//   73  138:invokespecial   #63  <Method void ah(ae, String, long)>
	//   74  141:putfield        #106 <Field ah o>
	//   75  144:aload_0         
	//   76  145:new             #58  <Class ah>
	//   77  148:dup             
	//   78  149:aload_0         
	//   79  150:ldc1            #108 <String "midnight_offset">
	//   80  152:lconst_0        
	//   81  153:invokespecial   #63  <Method void ah(ae, String, long)>
	//   82  156:putfield        #110 <Field ah g>
	//   83  159:aload_0         
	//   84  160:new             #58  <Class ah>
	//   85  163:dup             
	//   86  164:aload_0         
	//   87  165:ldc1            #112 <String "first_open_time">
	//   88  167:lconst_0        
	//   89  168:invokespecial   #63  <Method void ah(ae, String, long)>
	//   90  171:putfield        #114 <Field ah h>
	//   91  174:aload_0         
	//   92  175:new             #58  <Class ah>
	//   93  178:dup             
	//   94  179:aload_0         
	//   95  180:ldc1            #116 <String "app_install_time">
	//   96  182:lconst_0        
	//   97  183:invokespecial   #63  <Method void ah(ae, String, long)>
	//   98  186:putfield        #118 <Field ah i>
	//   99  189:aload_0         
	//  100  190:new             #120 <Class aj>
	//  101  193:dup             
	//  102  194:aload_0         
	//  103  195:ldc1            #122 <String "app_instance_id">
	//  104  197:aconst_null     
	//  105  198:invokespecial   #125 <Method void aj(ae, String, String)>
	//  106  201:putfield        #127 <Field aj j>
		q = new ag(this, "app_backgrounded", false);
	//  107  204:aload_0         
	//  108  205:new             #91  <Class ag>
	//  109  208:dup             
	//  110  209:aload_0         
	//  111  210:ldc1            #129 <String "app_backgrounded">
	//  112  212:iconst_0        
	//  113  213:invokespecial   #96  <Method void ag(ae, String, boolean)>
	//  114  216:putfield        #131 <Field ag q>
	//  115  219:return          
	}

	static SharedPreferences a(ae ae1)
	{
		return ae1.y();
	//    0    0:aload_0         
	//    1    1:invokespecial   #136 <Method SharedPreferences y()>
	//    2    4:areturn         
	}

	private final SharedPreferences y()
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method void bt.d()>
		((bu)this).A();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #143 <Method void bu.A()>
		return s;
	//    4    8:aload_0         
	//    5    9:getfield        #145 <Field SharedPreferences s>
	//    6   12:areturn         
	}

	final Pair a(String s1)
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method void bt.d()>
		long l1 = ((bt)this).m().b();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #151 <Method e bt.m()>
	//    4    8:invokeinterface #156 <Method long e.b()>
	//    5   13:lstore_2        
		String s2 = t;
	//    6   14:aload_0         
	//    7   15:getfield        #158 <Field String t>
	//    8   18:astore          4
		if(s2 != null && l1 < v)
	//*   9   20:aload           4
	//*  10   22:ifnull          51
	//*  11   25:lload_2         
	//*  12   26:aload_0         
	//*  13   27:getfield        #160 <Field long v>
	//*  14   30:lcmp            
	//*  15   31:ifge            51
			return new Pair(((Object) (s2)), ((Object) (Boolean.valueOf(u))));
	//   16   34:new             #38  <Class Pair>
	//   17   37:dup             
	//   18   38:aload           4
	//   19   40:aload_0         
	//   20   41:getfield        #162 <Field boolean u>
	//   21   44:invokestatic    #167 <Method Boolean Boolean.valueOf(boolean)>
	//   22   47:invokespecial   #50  <Method void Pair(Object, Object)>
	//   23   50:areturn         
		v = l1 + ((bt)this).t().a(s1, h.j);
	//   24   51:aload_0         
	//   25   52:lload_2         
	//   26   53:aload_0         
	//   27   54:invokevirtual   #170 <Method ew bt.t()>
	//   28   57:aload_1         
	//   29   58:getstatic       #175 <Field i h.j>
	//   30   61:invokevirtual   #180 <Method long ew.a(String, i)>
	//   31   64:ladd            
	//   32   65:putfield        #160 <Field long v>
		AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
	//   33   68:iconst_1        
	//   34   69:invokestatic    #186 <Method void AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(boolean)>
		s1 = ((String) (AdvertisingIdClient.getAdvertisingIdInfo(((bt)this).n())));
	//   35   72:aload_0         
	//   36   73:invokevirtual   #189 <Method Context bt.n()>
	//   37   76:invokestatic    #193 <Method com.google.android.gms.ads.identifier.AdvertisingIdClient$Info AdvertisingIdClient.getAdvertisingIdInfo(Context)>
	//   38   79:astore_1        
		if(s1 == null)
			break MISSING_BLOCK_LABEL_100;
	//   39   80:aload_1         
	//   40   81:ifnull          100
		t = ((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) (s1)).getId();
	//   41   84:aload_0         
	//   42   85:aload_1         
	//   43   86:invokevirtual   #199 <Method String com.google.android.gms.ads.identifier.AdvertisingIdClient$Info.getId()>
	//   44   89:putfield        #158 <Field String t>
		u = ((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) (s1)).isLimitAdTrackingEnabled();
	//   45   92:aload_0         
	//   46   93:aload_1         
	//   47   94:invokevirtual   #203 <Method boolean com.google.android.gms.ads.identifier.AdvertisingIdClient$Info.isLimitAdTrackingEnabled()>
	//   48   97:putfield        #162 <Field boolean u>
		if(t == null)
	//*  49  100:aload_0         
	//*  50  101:getfield        #158 <Field String t>
	//*  51  104:ifnonnull       136
			t = "";
	//   52  107:aload_0         
	//   53  108:ldc1            #40  <String "">
	//   54  110:putfield        #158 <Field String t>
		break MISSING_BLOCK_LABEL_136;
	//   55  113:goto            136
		s1;
	//   56  116:astore_1        
		((bt)this).r().w().a("Unable to get advertising id", ((Object) (s1)));
	//   57  117:aload_0         
	//   58  118:invokevirtual   #207 <Method s bt.r()>
	//   59  121:invokevirtual   #213 <Method u s.w()>
	//   60  124:ldc1            #215 <String "Unable to get advertising id">
	//   61  126:aload_1         
	//   62  127:invokevirtual   #220 <Method void u.a(String, Object)>
		t = "";
	//   63  130:aload_0         
	//   64  131:ldc1            #40  <String "">
	//   65  133:putfield        #158 <Field String t>
		AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
	//   66  136:iconst_0        
	//   67  137:invokestatic    #186 <Method void AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(boolean)>
		return new Pair(((Object) (t)), ((Object) (Boolean.valueOf(u))));
	//   68  140:new             #38  <Class Pair>
	//   69  143:dup             
	//   70  144:aload_0         
	//   71  145:getfield        #158 <Field String t>
	//   72  148:aload_0         
	//   73  149:getfield        #162 <Field boolean u>
	//   74  152:invokestatic    #167 <Method Boolean Boolean.valueOf(boolean)>
	//   75  155:invokespecial   #50  <Method void Pair(Object, Object)>
	//   76  158:areturn         
	}

	final void a(boolean flag)
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method void bt.d()>
		((bt)this).r().x().a("Setting useService", ((Object) (Boolean.valueOf(flag))));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #207 <Method s bt.r()>
	//    4    8:invokevirtual   #223 <Method u s.x()>
	//    5   11:ldc1            #225 <String "Setting useService">
	//    6   13:iload_1         
	//    7   14:invokestatic    #167 <Method Boolean Boolean.valueOf(boolean)>
	//    8   17:invokevirtual   #220 <Method void u.a(String, Object)>
		android.content.SharedPreferences.Editor editor = y().edit();
	//    9   20:aload_0         
	//   10   21:invokespecial   #136 <Method SharedPreferences y()>
	//   11   24:invokeinterface #231 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   12   29:astore_2        
		editor.putBoolean("use_service", flag);
	//   13   30:aload_2         
	//   14   31:ldc1            #233 <String "use_service">
	//   15   33:iload_1         
	//   16   34:invokeinterface #239 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   17   39:pop             
		editor.apply();
	//   18   40:aload_2         
	//   19   41:invokeinterface #242 <Method void android.content.SharedPreferences$Editor.apply()>
	//   20   46:return          
	}

	final boolean a(long l1)
	{
		return l1 - l.a() > n.a();
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #89  <Field ah l>
	//    3    5:invokevirtual   #245 <Method long ah.a()>
	//    4    8:lsub            
	//    5    9:aload_0         
	//    6   10:getfield        #102 <Field ah n>
	//    7   13:invokevirtual   #245 <Method long ah.a()>
	//    8   16:lcmp            
	//    9   17:ifle            22
	//   10   20:iconst_1        
	//   11   21:ireturn         
	//   12   22:iconst_0        
	//   13   23:ireturn         
	}

	final String b(String s1)
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method void bt.d()>
		s1 = (String)a(s1).first;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #248 <Method Pair a(String)>
	//    5    9:getfield        #252 <Field Object Pair.first>
	//    6   12:checkcast       #254 <Class String>
	//    7   15:astore_1        
		MessageDigest messagedigest = eo.i();
	//    8   16:invokestatic    #259 <Method MessageDigest eo.i()>
	//    9   19:astore_2        
		if(messagedigest == null)
	//*  10   20:aload_2         
	//*  11   21:ifnonnull       26
			return null;
	//   12   24:aconst_null     
	//   13   25:areturn         
		else
			return String.format(Locale.US, "%032X", new Object[] {
				new BigInteger(1, messagedigest.digest(s1.getBytes()))
			});
	//   14   26:getstatic       #265 <Field Locale Locale.US>
	//   15   29:ldc2            #267 <String "%032X">
	//   16   32:iconst_1        
	//   17   33:anewarray       Object[]
	//   18   36:dup             
	//   19   37:iconst_0        
	//   20   38:new             #271 <Class BigInteger>
	//   21   41:dup             
	//   22   42:iconst_1        
	//   23   43:aload_2         
	//   24   44:aload_1         
	//   25   45:invokevirtual   #275 <Method byte[] String.getBytes()>
	//   26   48:invokevirtual   #281 <Method byte[] MessageDigest.digest(byte[])>
	//   27   51:invokespecial   #284 <Method void BigInteger(int, byte[])>
	//   28   54:aastore         
	//   29   55:invokestatic    #288 <Method String String.format(Locale, String, Object[])>
	//   30   58:areturn         
	}

	final void b(boolean flag)
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method void bt.d()>
		((bt)this).r().x().a("Setting measurementEnabled", ((Object) (Boolean.valueOf(flag))));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #207 <Method s bt.r()>
	//    4    8:invokevirtual   #223 <Method u s.x()>
	//    5   11:ldc2            #290 <String "Setting measurementEnabled">
	//    6   14:iload_1         
	//    7   15:invokestatic    #167 <Method Boolean Boolean.valueOf(boolean)>
	//    8   18:invokevirtual   #220 <Method void u.a(String, Object)>
		android.content.SharedPreferences.Editor editor = y().edit();
	//    9   21:aload_0         
	//   10   22:invokespecial   #136 <Method SharedPreferences y()>
	//   11   25:invokeinterface #231 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   12   30:astore_2        
		editor.putBoolean("measurement_enabled", flag);
	//   13   31:aload_2         
	//   14   32:ldc2            #292 <String "measurement_enabled">
	//   15   35:iload_1         
	//   16   36:invokeinterface #239 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   17   41:pop             
		editor.apply();
	//   18   42:aload_2         
	//   19   43:invokeinterface #242 <Method void android.content.SharedPreferences$Editor.apply()>
	//   20   48:return          
	}

	final void c(String s1)
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method void bt.d()>
		android.content.SharedPreferences.Editor editor = y().edit();
	//    2    4:aload_0         
	//    3    5:invokespecial   #136 <Method SharedPreferences y()>
	//    4    8:invokeinterface #231 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   13:astore_2        
		editor.putString("gmp_app_id", s1);
	//    6   14:aload_2         
	//    7   15:ldc2            #295 <String "gmp_app_id">
	//    8   18:aload_1         
	//    9   19:invokeinterface #299 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   10   24:pop             
		editor.apply();
	//   11   25:aload_2         
	//   12   26:invokeinterface #242 <Method void android.content.SharedPreferences$Editor.apply()>
	//   13   31:return          
	}

	final boolean c(boolean flag)
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method void bt.d()>
		return y().getBoolean("measurement_enabled", flag);
	//    2    4:aload_0         
	//    3    5:invokespecial   #136 <Method SharedPreferences y()>
	//    4    8:ldc2            #292 <String "measurement_enabled">
	//    5   11:iload_1         
	//    6   12:invokeinterface #304 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    7   17:ireturn         
	}

	final void d(String s1)
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method void bt.d()>
		android.content.SharedPreferences.Editor editor = y().edit();
	//    2    4:aload_0         
	//    3    5:invokespecial   #136 <Method SharedPreferences y()>
	//    4    8:invokeinterface #231 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   13:astore_2        
		editor.putString("admob_app_id", s1);
	//    6   14:aload_2         
	//    7   15:ldc2            #306 <String "admob_app_id">
	//    8   18:aload_1         
	//    9   19:invokeinterface #299 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   10   24:pop             
		editor.apply();
	//   11   25:aload_2         
	//   12   26:invokeinterface #242 <Method void android.content.SharedPreferences$Editor.apply()>
	//   13   31:return          
	}

	final void d(boolean flag)
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method void bt.d()>
		((bt)this).r().x().a("Updating deferred analytics collection", ((Object) (Boolean.valueOf(flag))));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #207 <Method s bt.r()>
	//    4    8:invokevirtual   #223 <Method u s.x()>
	//    5   11:ldc2            #308 <String "Updating deferred analytics collection">
	//    6   14:iload_1         
	//    7   15:invokestatic    #167 <Method Boolean Boolean.valueOf(boolean)>
	//    8   18:invokevirtual   #220 <Method void u.a(String, Object)>
		android.content.SharedPreferences.Editor editor = y().edit();
	//    9   21:aload_0         
	//   10   22:invokespecial   #136 <Method SharedPreferences y()>
	//   11   25:invokeinterface #231 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   12   30:astore_2        
		editor.putBoolean("deferred_analytics_collection", flag);
	//   13   31:aload_2         
	//   14   32:ldc2            #310 <String "deferred_analytics_collection">
	//   15   35:iload_1         
	//   16   36:invokeinterface #239 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   17   41:pop             
		editor.apply();
	//   18   42:aload_2         
	//   19   43:invokeinterface #242 <Method void android.content.SharedPreferences$Editor.apply()>
	//   20   48:return          
	}

	protected final boolean e()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	protected final void f()
	{
		s = ((bt)this).n().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #189 <Method Context bt.n()>
	//    3    5:ldc2            #312 <String "com.google.android.gms.measurement.prefs">
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #318 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    6   12:putfield        #145 <Field SharedPreferences s>
		p = s.getBoolean("has_been_opened", false);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #145 <Field SharedPreferences s>
	//   10   20:ldc2            #320 <String "has_been_opened">
	//   11   23:iconst_0        
	//   12   24:invokeinterface #304 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   13   29:putfield        #322 <Field boolean p>
		if(!p)
	//*  14   32:aload_0         
	//*  15   33:getfield        #322 <Field boolean p>
	//*  16   36:ifne            66
		{
			android.content.SharedPreferences.Editor editor = s.edit();
	//   17   39:aload_0         
	//   18   40:getfield        #145 <Field SharedPreferences s>
	//   19   43:invokeinterface #231 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   20   48:astore_1        
			editor.putBoolean("has_been_opened", true);
	//   21   49:aload_1         
	//   22   50:ldc2            #320 <String "has_been_opened">
	//   23   53:iconst_1        
	//   24   54:invokeinterface #239 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   25   59:pop             
			editor.apply();
	//   26   60:aload_1         
	//   27   61:invokeinterface #242 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		b = new ai(this, "health_monitor", Math.max(0L, ((Long)h.k.b()).longValue()), ((af) (null)));
	//   28   66:aload_0         
	//   29   67:new             #324 <Class ai>
	//   30   70:dup             
	//   31   71:aload_0         
	//   32   72:ldc2            #326 <String "health_monitor">
	//   33   75:lconst_0        
	//   34   76:getstatic       #328 <Field i h.k>
	//   35   79:invokevirtual   #333 <Method Object i.b()>
	//   36   82:checkcast       #42  <Class Long>
	//   37   85:invokevirtual   #336 <Method long Long.longValue()>
	//   38   88:invokestatic    #342 <Method long Math.max(long, long)>
	//   39   91:aconst_null     
	//   40   92:invokespecial   #345 <Method void ai(ae, String, long, af)>
	//   41   95:putfield        #347 <Field ai b>
	//   42   98:return          
	}

	final String g()
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method void bt.d()>
		return y().getString("gmp_app_id", ((String) (null)));
	//    2    4:aload_0         
	//    3    5:invokespecial   #136 <Method SharedPreferences y()>
	//    4    8:ldc2            #295 <String "gmp_app_id">
	//    5   11:aconst_null     
	//    6   12:invokeinterface #351 <Method String SharedPreferences.getString(String, String)>
	//    7   17:areturn         
	}

	final String h()
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method void bt.d()>
		return y().getString("admob_app_id", ((String) (null)));
	//    2    4:aload_0         
	//    3    5:invokespecial   #136 <Method SharedPreferences y()>
	//    4    8:ldc2            #306 <String "admob_app_id">
	//    5   11:aconst_null     
	//    6   12:invokeinterface #351 <Method String SharedPreferences.getString(String, String)>
	//    7   17:areturn         
	}

	final Boolean i()
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method void bt.d()>
		if(!y().contains("use_service"))
	//*   2    4:aload_0         
	//*   3    5:invokespecial   #136 <Method SharedPreferences y()>
	//*   4    8:ldc1            #233 <String "use_service">
	//*   5   10:invokeinterface #356 <Method boolean SharedPreferences.contains(String)>
	//*   6   15:ifne            20
			return null;
	//    7   18:aconst_null     
	//    8   19:areturn         
		else
			return Boolean.valueOf(y().getBoolean("use_service", false));
	//    9   20:aload_0         
	//   10   21:invokespecial   #136 <Method SharedPreferences y()>
	//   11   24:ldc1            #233 <String "use_service">
	//   12   26:iconst_0        
	//   13   27:invokeinterface #304 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   14   32:invokestatic    #167 <Method Boolean Boolean.valueOf(boolean)>
	//   15   35:areturn         
	}

	final void j()
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method void bt.d()>
		((bt)this).r().x().a("Clearing collection preferences.");
	//    2    4:aload_0         
	//    3    5:invokevirtual   #207 <Method s bt.r()>
	//    4    8:invokevirtual   #223 <Method u s.x()>
	//    5   11:ldc2            #358 <String "Clearing collection preferences.">
	//    6   14:invokevirtual   #360 <Method void u.a(String)>
		if(((bt)this).t().a(h.ar))
	//*   7   17:aload_0         
	//*   8   18:invokevirtual   #170 <Method ew bt.t()>
	//*   9   21:getstatic       #363 <Field i h.ar>
	//*  10   24:invokevirtual   #366 <Method boolean ew.a(i)>
	//*  11   27:ifeq            74
		{
			Boolean boolean1 = k();
	//   12   30:aload_0         
	//   13   31:invokevirtual   #368 <Method Boolean k()>
	//   14   34:astore_3        
			android.content.SharedPreferences.Editor editor1 = y().edit();
	//   15   35:aload_0         
	//   16   36:invokespecial   #136 <Method SharedPreferences y()>
	//   17   39:invokeinterface #231 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   18   44:astore          4
			editor1.clear();
	//   19   46:aload           4
	//   20   48:invokeinterface #371 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//   21   53:pop             
			editor1.apply();
	//   22   54:aload           4
	//   23   56:invokeinterface #242 <Method void android.content.SharedPreferences$Editor.apply()>
			if(boolean1 != null)
	//*  24   61:aload_3         
	//*  25   62:ifnull          73
				b(boolean1.booleanValue());
	//   26   65:aload_0         
	//   27   66:aload_3         
	//   28   67:invokevirtual   #374 <Method boolean Boolean.booleanValue()>
	//   29   70:invokevirtual   #376 <Method void b(boolean)>
			return;
	//   30   73:return          
		}
		boolean flag1 = y().contains("measurement_enabled");
	//   31   74:aload_0         
	//   32   75:invokespecial   #136 <Method SharedPreferences y()>
	//   33   78:ldc2            #292 <String "measurement_enabled">
	//   34   81:invokeinterface #356 <Method boolean SharedPreferences.contains(String)>
	//   35   86:istore_2        
		boolean flag = true;
	//   36   87:iconst_1        
	//   37   88:istore_1        
		if(flag1)
	//*  38   89:iload_2         
	//*  39   90:ifeq            99
			flag = c(true);
	//   40   93:aload_0         
	//   41   94:iconst_1        
	//   42   95:invokevirtual   #378 <Method boolean c(boolean)>
	//   43   98:istore_1        
		android.content.SharedPreferences.Editor editor = y().edit();
	//   44   99:aload_0         
	//   45  100:invokespecial   #136 <Method SharedPreferences y()>
	//   46  103:invokeinterface #231 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   47  108:astore_3        
		editor.clear();
	//   48  109:aload_3         
	//   49  110:invokeinterface #371 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//   50  115:pop             
		editor.apply();
	//   51  116:aload_3         
	//   52  117:invokeinterface #242 <Method void android.content.SharedPreferences$Editor.apply()>
		if(flag1)
	//*  53  122:iload_2         
	//*  54  123:ifeq            131
			b(flag);
	//   55  126:aload_0         
	//   56  127:iload_1         
	//   57  128:invokevirtual   #376 <Method void b(boolean)>
	//   58  131:return          
	}

	final Boolean k()
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method void bt.d()>
		if(y().contains("measurement_enabled"))
	//*   2    4:aload_0         
	//*   3    5:invokespecial   #136 <Method SharedPreferences y()>
	//*   4    8:ldc2            #292 <String "measurement_enabled">
	//*   5   11:invokeinterface #356 <Method boolean SharedPreferences.contains(String)>
	//*   6   16:ifeq            36
			return Boolean.valueOf(y().getBoolean("measurement_enabled", true));
	//    7   19:aload_0         
	//    8   20:invokespecial   #136 <Method SharedPreferences y()>
	//    9   23:ldc2            #292 <String "measurement_enabled">
	//   10   26:iconst_1        
	//   11   27:invokeinterface #304 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   12   32:invokestatic    #167 <Method Boolean Boolean.valueOf(boolean)>
	//   13   35:areturn         
		else
			return null;
	//   14   36:aconst_null     
	//   15   37:areturn         
	}

	protected final String v()
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method void bt.d()>
		String s1 = y().getString("previous_os_version", ((String) (null)));
	//    2    4:aload_0         
	//    3    5:invokespecial   #136 <Method SharedPreferences y()>
	//    4    8:ldc2            #380 <String "previous_os_version">
	//    5   11:aconst_null     
	//    6   12:invokeinterface #351 <Method String SharedPreferences.getString(String, String)>
	//    7   17:astore_1        
		((bu) (((bt)this).l())).A();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #383 <Method b bt.l()>
	//   10   22:invokevirtual   #143 <Method void bu.A()>
		String s2 = android.os.Build.VERSION.RELEASE;
	//   11   25:getstatic       #388 <Field String android.os.Build$VERSION.RELEASE>
	//   12   28:astore_2        
		if(!TextUtils.isEmpty(((CharSequence) (s2))) && !s2.equals(((Object) (s1))))
	//*  13   29:aload_2         
	//*  14   30:invokestatic    #394 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  15   33:ifne            71
	//*  16   36:aload_2         
	//*  17   37:aload_1         
	//*  18   38:invokevirtual   #398 <Method boolean String.equals(Object)>
	//*  19   41:ifne            71
		{
			android.content.SharedPreferences.Editor editor = y().edit();
	//   20   44:aload_0         
	//   21   45:invokespecial   #136 <Method SharedPreferences y()>
	//   22   48:invokeinterface #231 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   23   53:astore_3        
			editor.putString("previous_os_version", s2);
	//   24   54:aload_3         
	//   25   55:ldc2            #380 <String "previous_os_version">
	//   26   58:aload_2         
	//   27   59:invokeinterface #299 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   28   64:pop             
			editor.apply();
	//   29   65:aload_3         
	//   30   66:invokeinterface #242 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		return s1;
	//   31   71:aload_1         
	//   32   72:areturn         
	}

	final boolean w()
	{
		((bt)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method void bt.d()>
		return y().getBoolean("deferred_analytics_collection", false);
	//    2    4:aload_0         
	//    3    5:invokespecial   #136 <Method SharedPreferences y()>
	//    4    8:ldc2            #310 <String "deferred_analytics_collection">
	//    5   11:iconst_0        
	//    6   12:invokeinterface #304 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    7   17:ireturn         
	}

	final boolean x()
	{
		return s.contains("deferred_analytics_collection");
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field SharedPreferences s>
	//    2    4:ldc2            #310 <String "deferred_analytics_collection">
	//    3    7:invokeinterface #356 <Method boolean SharedPreferences.contains(String)>
	//    4   12:ireturn         
	}

	static final Pair a = new Pair("", ((Object) (Long.valueOf(0L))));
	public ai b;
	public final ah c = new ah(this, "last_upload", 0L);
	public final ah d = new ah(this, "last_upload_attempt", 0L);
	public final ah e = new ah(this, "backoff", 0L);
	public final ah f = new ah(this, "last_delete_stale", 0L);
	public final ah g = new ah(this, "midnight_offset", 0L);
	public final ah h = new ah(this, "first_open_time", 0L);
	public final ah i = new ah(this, "app_install_time", 0L);
	public final aj j = new aj(this, "app_instance_id", ((String) (null)));
	public final ah k = new ah(this, "time_before_start", 10000L);
	public final ah l = new ah(this, "session_timeout", 0x1b7740L);
	public final ag m = new ag(this, "start_new_session", true);
	public final ah n = new ah(this, "last_pause_time", 0L);
	public final ah o = new ah(this, "time_active", 0L);
	public boolean p;
	public ag q;
	private SharedPreferences s;
	private String t;
	private boolean u;
	private long v;

	static 
	{
	//    0    0:new             #38  <Class Pair>
	//    1    3:dup             
	//    2    4:ldc1            #40  <String "">
	//    3    6:lconst_0        
	//    4    7:invokestatic    #46  <Method Long Long.valueOf(long)>
	//    5   10:invokespecial   #50  <Method void Pair(Object, Object)>
	//    6   13:putstatic       #52  <Field Pair a>
	//*   7   16:return          
	}
}
