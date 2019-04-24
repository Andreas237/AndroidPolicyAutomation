// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.common.metaData;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.startapp.android.publish.adsCommon.BaseRequest;
import com.startapp.android.publish.adsCommon.Utils.*;
import com.startapp.android.publish.adsCommon.*;
import com.startapp.common.a.a;
import com.startapp.common.a.c;

// Referenced classes of package com.startapp.android.publish.common.metaData:
//			MetaData

public class MetaDataRequest extends BaseRequest
{
	public static final class a extends Enum
	{

		public static a valueOf(String s)
		{
			return (a)Enum.valueOf(com/startapp/android/publish/common/metaData/MetaDataRequest$a, s);
		//    0    0:ldc1            #2   <Class MetaDataRequest$a>
		//    1    2:aload_0         
		//    2    3:invokestatic    #63  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class MetaDataRequest$a>
		//    4    9:areturn         
		}

		public static a[] values()
		{
			return (a[])((a []) (g)).clone();
		//    0    0:getstatic       #50  <Field MetaDataRequest$a[] g>
		//    1    3:invokevirtual   #70  <Method Object _5B_Lcom.startapp.android.publish.common.metaData.MetaDataRequest$a_3B_.clone()>
		//    2    6:checkcast       #66  <Class MetaDataRequest$a[]>
		//    3    9:areturn         
		}

		public static final a a;
		public static final a b;
		public static final a c;
		public static final a d;
		public static final a e;
		public static final a f;
		private static final a g[];
		private int index;

		static 
		{
			a = new a("LAUNCH", 0, 1);
		//    0    0:new             #2   <Class MetaDataRequest$a>
		//    1    3:dup             
		//    2    4:ldc1            #22  <String "LAUNCH">
		//    3    6:iconst_0        
		//    4    7:iconst_1        
		//    5    8:invokespecial   #26  <Method void MetaDataRequest$a(String, int, int)>
		//    6   11:putstatic       #28  <Field MetaDataRequest$a a>
			b = new a("APP_IDLE", 1, 2);
		//    7   14:new             #2   <Class MetaDataRequest$a>
		//    8   17:dup             
		//    9   18:ldc1            #30  <String "APP_IDLE">
		//   10   20:iconst_1        
		//   11   21:iconst_2        
		//   12   22:invokespecial   #26  <Method void MetaDataRequest$a(String, int, int)>
		//   13   25:putstatic       #32  <Field MetaDataRequest$a b>
			c = new a("IN_APP_PURCHASE", 2, 3);
		//   14   28:new             #2   <Class MetaDataRequest$a>
		//   15   31:dup             
		//   16   32:ldc1            #34  <String "IN_APP_PURCHASE">
		//   17   34:iconst_2        
		//   18   35:iconst_3        
		//   19   36:invokespecial   #26  <Method void MetaDataRequest$a(String, int, int)>
		//   20   39:putstatic       #36  <Field MetaDataRequest$a c>
			d = new a("CUSTOM", 3, 4);
		//   21   42:new             #2   <Class MetaDataRequest$a>
		//   22   45:dup             
		//   23   46:ldc1            #38  <String "CUSTOM">
		//   24   48:iconst_3        
		//   25   49:iconst_4        
		//   26   50:invokespecial   #26  <Method void MetaDataRequest$a(String, int, int)>
		//   27   53:putstatic       #40  <Field MetaDataRequest$a d>
			e = new a("PERIODIC", 4, 5);
		//   28   56:new             #2   <Class MetaDataRequest$a>
		//   29   59:dup             
		//   30   60:ldc1            #42  <String "PERIODIC">
		//   31   62:iconst_4        
		//   32   63:iconst_5        
		//   33   64:invokespecial   #26  <Method void MetaDataRequest$a(String, int, int)>
		//   34   67:putstatic       #44  <Field MetaDataRequest$a e>
			f = new a("PAS", 5, 6);
		//   35   70:new             #2   <Class MetaDataRequest$a>
		//   36   73:dup             
		//   37   74:ldc1            #46  <String "PAS">
		//   38   76:iconst_5        
		//   39   77:bipush          6
		//   40   79:invokespecial   #26  <Method void MetaDataRequest$a(String, int, int)>
		//   41   82:putstatic       #48  <Field MetaDataRequest$a f>
			g = (new a[] {
				a, b, c, d, e, f
			});
		//   42   85:bipush          6
		//   43   87:anewarray       a[]
		//   44   90:dup             
		//   45   91:iconst_0        
		//   46   92:getstatic       #28  <Field MetaDataRequest$a a>
		//   47   95:aastore         
		//   48   96:dup             
		//   49   97:iconst_1        
		//   50   98:getstatic       #32  <Field MetaDataRequest$a b>
		//   51  101:aastore         
		//   52  102:dup             
		//   53  103:iconst_2        
		//   54  104:getstatic       #36  <Field MetaDataRequest$a c>
		//   55  107:aastore         
		//   56  108:dup             
		//   57  109:iconst_3        
		//   58  110:getstatic       #40  <Field MetaDataRequest$a d>
		//   59  113:aastore         
		//   60  114:dup             
		//   61  115:iconst_4        
		//   62  116:getstatic       #44  <Field MetaDataRequest$a e>
		//   63  119:aastore         
		//   64  120:dup             
		//   65  121:iconst_5        
		//   66  122:getstatic       #48  <Field MetaDataRequest$a f>
		//   67  125:aastore         
		//   68  126:putstatic       #50  <Field MetaDataRequest$a[] g>
		//*  69  129:return          
		}

		private a(String s, int j, int i1)
		{
			super(s, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #54  <Method void Enum(String, int)>
			index = i1;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #56  <Field int index>
		//    7   11:return          
		}
	}


	public MetaDataRequest(Context context, a a1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void BaseRequest()>
		totalSessions = k.a(context, "totalSessions", Integer.valueOf(0)).intValue();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #32  <String "totalSessions">
	//    5    8:iconst_0        
	//    6    9:invokestatic    #38  <Method Integer Integer.valueOf(int)>
	//    7   12:invokestatic    #43  <Method Integer k.a(Context, String, Integer)>
	//    8   15:invokevirtual   #47  <Method int Integer.intValue()>
	//    9   18:putfield        #49  <Field int totalSessions>
		daysSinceFirstSession = calcDaysSinceFirstSession(context);
	//   10   21:aload_0         
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokespecial   #53  <Method int calcDaysSinceFirstSession(Context)>
	//   14   27:putfield        #55  <Field int daysSinceFirstSession>
		paidAmount = k.a(context, "inAppPurchaseAmount", Float.valueOf(0.0F)).floatValue();
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:ldc1            #57  <String "inAppPurchaseAmount">
	//   18   34:fconst_0        
	//   19   35:invokestatic    #62  <Method Float Float.valueOf(float)>
	//   20   38:invokestatic    #65  <Method Float k.a(Context, String, Float)>
	//   21   41:invokevirtual   #69  <Method float Float.floatValue()>
	//   22   44:putfield        #71  <Field float paidAmount>
		payingUser = k.a(context, "payingUser", Boolean.valueOf(false)).booleanValue();
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:ldc1            #72  <String "payingUser">
	//   26   51:iconst_0        
	//   27   52:invokestatic    #77  <Method Boolean Boolean.valueOf(boolean)>
	//   28   55:invokestatic    #80  <Method Boolean k.a(Context, String, Boolean)>
	//   29   58:invokevirtual   #84  <Method boolean Boolean.booleanValue()>
	//   30   61:putfield        #86  <Field boolean payingUser>
		profileId = MetaData.getInstance().getProfileId();
	//   31   64:aload_0         
	//   32   65:invokestatic    #92  <Method MetaData MetaData.getInstance()>
	//   33   68:invokevirtual   #96  <Method String MetaData.getProfileId()>
	//   34   71:putfield        #98  <Field String profileId>
		reason = a1;
	//   35   74:aload_0         
	//   36   75:aload_2         
	//   37   76:putfield        #100 <Field MetaDataRequest$a reason>
		apkHash = calcApkHash(context, k.a(context), m.a().e(), new i());
	//   38   79:aload_0         
	//   39   80:aload_1         
	//   40   81:aload_1         
	//   41   82:invokestatic    #103 <Method SharedPreferences k.a(Context)>
	//   42   85:invokestatic    #108 <Method m m.a()>
	//   43   88:invokevirtual   #111 <Method boolean m.e()>
	//   44   91:new             #113 <Class i>
	//   45   94:dup             
	//   46   95:invokespecial   #114 <Method void i()>
	//   47   98:invokestatic    #118 <Method String calcApkHash(Context, SharedPreferences, boolean, i)>
	//   48  101:putfield        #120 <Field String apkHash>
		setIan(context);
	//   49  104:aload_0         
	//   50  105:aload_1         
	//   51  106:invokevirtual   #124 <Method void setIan(Context)>
		simpleToken = l.c();
	//   52  109:aload_0         
	//   53  110:invokestatic    #130 <Method Pair l.c()>
	//   54  113:putfield        #132 <Field Pair simpleToken>
		firstInstalledAppTS = l.a();
	//   55  116:aload_0         
	//   56  117:invokestatic    #135 <Method long l.a()>
	//   57  120:putfield        #137 <Field long firstInstalledAppTS>
	//   58  123:return          
	}

	private void addParams(e e1)
	{
		e1.a(com.startapp.common.a.a.a(), ((Object) (com.startapp.common.a.a.d())), true);
	//    0    0:aload_1         
	//    1    1:invokestatic    #144 <Method String a.a()>
	//    2    4:invokestatic    #147 <Method String a.d()>
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #152 <Method void e.a(String, Object, boolean)>
		e1.a("totalSessions", ((Object) (Integer.valueOf(totalSessions))), true);
	//    5   11:aload_1         
	//    6   12:ldc1            #32  <String "totalSessions">
	//    7   14:aload_0         
	//    8   15:getfield        #49  <Field int totalSessions>
	//    9   18:invokestatic    #38  <Method Integer Integer.valueOf(int)>
	//   10   21:iconst_1        
	//   11   22:invokevirtual   #152 <Method void e.a(String, Object, boolean)>
		e1.a("daysSinceFirstSession", ((Object) (Integer.valueOf(daysSinceFirstSession))), true);
	//   12   25:aload_1         
	//   13   26:ldc1            #153 <String "daysSinceFirstSession">
	//   14   28:aload_0         
	//   15   29:getfield        #55  <Field int daysSinceFirstSession>
	//   16   32:invokestatic    #38  <Method Integer Integer.valueOf(int)>
	//   17   35:iconst_1        
	//   18   36:invokevirtual   #152 <Method void e.a(String, Object, boolean)>
		e1.a("payingUser", ((Object) (Boolean.valueOf(payingUser))), true);
	//   19   39:aload_1         
	//   20   40:ldc1            #72  <String "payingUser">
	//   21   42:aload_0         
	//   22   43:getfield        #86  <Field boolean payingUser>
	//   23   46:invokestatic    #77  <Method Boolean Boolean.valueOf(boolean)>
	//   24   49:iconst_1        
	//   25   50:invokevirtual   #152 <Method void e.a(String, Object, boolean)>
		e1.a("profileId", ((Object) (profileId)), false);
	//   26   53:aload_1         
	//   27   54:ldc1            #154 <String "profileId">
	//   28   56:aload_0         
	//   29   57:getfield        #98  <Field String profileId>
	//   30   60:iconst_0        
	//   31   61:invokevirtual   #152 <Method void e.a(String, Object, boolean)>
		e1.a("paidAmount", ((Object) (Float.valueOf(paidAmount))), true);
	//   32   64:aload_1         
	//   33   65:ldc1            #155 <String "paidAmount">
	//   34   67:aload_0         
	//   35   68:getfield        #71  <Field float paidAmount>
	//   36   71:invokestatic    #62  <Method Float Float.valueOf(float)>
	//   37   74:iconst_1        
	//   38   75:invokevirtual   #152 <Method void e.a(String, Object, boolean)>
		e1.a("reason", ((Object) (reason)), true);
	//   39   78:aload_1         
	//   40   79:ldc1            #156 <String "reason">
	//   41   81:aload_0         
	//   42   82:getfield        #100 <Field MetaDataRequest$a reason>
	//   43   85:iconst_1        
	//   44   86:invokevirtual   #152 <Method void e.a(String, Object, boolean)>
		if(apkHash != null)
	//*  45   89:aload_0         
	//*  46   90:getfield        #120 <Field String apkHash>
	//*  47   93:ifnull          107
			e1.a("apkHash", ((Object) (apkHash)), false);
	//   48   96:aload_1         
	//   49   97:ldc1            #157 <String "apkHash">
	//   50   99:aload_0         
	//   51  100:getfield        #120 <Field String apkHash>
	//   52  103:iconst_0        
	//   53  104:invokevirtual   #152 <Method void e.a(String, Object, boolean)>
		e1.a("ian", ((Object) (ian)), false);
	//   54  107:aload_1         
	//   55  108:ldc1            #158 <String "ian">
	//   56  110:aload_0         
	//   57  111:getfield        #160 <Field Integer ian>
	//   58  114:iconst_0        
	//   59  115:invokevirtual   #152 <Method void e.a(String, Object, boolean)>
		e1.a((String)simpleToken.first, simpleToken.second, false);
	//   60  118:aload_1         
	//   61  119:aload_0         
	//   62  120:getfield        #132 <Field Pair simpleToken>
	//   63  123:getfield        #166 <Field Object Pair.first>
	//   64  126:checkcast       #168 <Class String>
	//   65  129:aload_0         
	//   66  130:getfield        #132 <Field Pair simpleToken>
	//   67  133:getfield        #171 <Field Object Pair.second>
	//   68  136:iconst_0        
	//   69  137:invokevirtual   #152 <Method void e.a(String, Object, boolean)>
		if(firstInstalledAppTS > 0L && firstInstalledAppTS < 0xffffffffL)
	//*  70  140:aload_0         
	//*  71  141:getfield        #137 <Field long firstInstalledAppTS>
	//*  72  144:lconst_0        
	//*  73  145:lcmp            
	//*  74  146:ifle            174
	//*  75  149:aload_0         
	//*  76  150:getfield        #137 <Field long firstInstalledAppTS>
	//*  77  153:ldc2w           #172 <Long 0xffffffffL>
	//*  78  156:lcmp            
	//*  79  157:ifge            174
			e1.a("firstInstalledAppTS", ((Object) (Long.valueOf(firstInstalledAppTS))), false);
	//   80  160:aload_1         
	//   81  161:ldc1            #174 <String "firstInstalledAppTS">
	//   82  163:aload_0         
	//   83  164:getfield        #137 <Field long firstInstalledAppTS>
	//   84  167:invokestatic    #179 <Method Long Long.valueOf(long)>
	//   85  170:iconst_0        
	//   86  171:invokevirtual   #152 <Method void e.a(String, Object, boolean)>
	//   87  174:return          
	}

	public static String calcApkHash(Context context, SharedPreferences sharedpreferences, boolean flag, i j)
	{
		String s = sharedpreferences.getString("shared_prefs_app_apk_hash", ((String) (null)));
	//    0    0:aload_1         
	//    1    1:ldc1            #182 <String "shared_prefs_app_apk_hash">
	//    2    3:aconst_null     
	//    3    4:invokeinterface #188 <Method String SharedPreferences.getString(String, String)>
	//    4    9:astore          4
		if(TextUtils.isEmpty(((CharSequence) (s))) || flag)
	//*   5   11:aload           4
	//*   6   13:invokestatic    #194 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   16:ifne            23
	//*   8   19:iload_2         
	//*   9   20:ifeq            53
		{
			s = j.a("SHA-256", context);
	//   10   23:aload_3         
	//   11   24:ldc1            #196 <String "SHA-256">
	//   12   26:aload_0         
	//   13   27:invokevirtual   #199 <Method String i.a(String, Context)>
	//   14   30:astore          4
			sharedpreferences.edit().putString("shared_prefs_app_apk_hash", s).commit();
	//   15   32:aload_1         
	//   16   33:invokeinterface #203 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   17   38:ldc1            #182 <String "shared_prefs_app_apk_hash">
	//   18   40:aload           4
	//   19   42:invokeinterface #209 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   20   47:invokeinterface #212 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   21   52:pop             
		}
		return s;
	//   22   53:aload           4
	//   23   55:areturn         
	}

	private int calcDaysSinceFirstSession(Context context)
	{
		return millisToDays(System.currentTimeMillis() - k.a(context, "firstSessionTime", Long.valueOf(System.currentTimeMillis())).longValue());
	//    0    0:aload_0         
	//    1    1:invokestatic    #218 <Method long System.currentTimeMillis()>
	//    2    4:aload_1         
	//    3    5:ldc1            #220 <String "firstSessionTime">
	//    4    7:invokestatic    #218 <Method long System.currentTimeMillis()>
	//    5   10:invokestatic    #179 <Method Long Long.valueOf(long)>
	//    6   13:invokestatic    #223 <Method Long k.a(Context, String, Long)>
	//    7   16:invokevirtual   #226 <Method long Long.longValue()>
	//    8   19:lsub            
	//    9   20:invokespecial   #230 <Method int millisToDays(long)>
	//   10   23:ireturn         
	}

	private int millisToDays(long l1)
	{
		return (int)(l1 / 0x5265c00L);
	//    0    0:lload_1         
	//    1    1:ldc2w           #231 <Long 0x5265c00L>
	//    2    4:ldiv            
	//    3    5:l2i             
	//    4    6:ireturn         
	}

	public String getApkHash()
	{
		return apkHash;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field String apkHash>
	//    2    4:areturn         
	}

	public int getDaysSinceFirstSession()
	{
		return daysSinceFirstSession;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int daysSinceFirstSession>
	//    2    4:ireturn         
	}

	public int getIan()
	{
		return ian.intValue();
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field Integer ian>
	//    2    4:invokevirtual   #47  <Method int Integer.intValue()>
	//    3    7:ireturn         
	}

	public e getNameValueMap()
	{
		e e1 = super.getNameValueMap();
	//    0    0:aload_0         
	//    1    1:invokespecial   #239 <Method e BaseRequest.getNameValueMap()>
	//    2    4:astore_2        
		Object obj = ((Object) (e1));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(e1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       19
			obj = ((Object) (new d()));
	//    7   11:new             #241 <Class d>
	//    8   14:dup             
	//    9   15:invokespecial   #242 <Method void d()>
	//   10   18:astore_1        
		addParams(((e) (obj)));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokespecial   #244 <Method void addParams(e)>
		return ((e) (obj));
	//   14   24:aload_1         
	//   15   25:areturn         
	}

	public float getPaidAmount()
	{
		return paidAmount;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field float paidAmount>
	//    2    4:freturn         
	}

	public String getProfileId()
	{
		return profileId;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field String profileId>
	//    2    4:areturn         
	}

	public a getReason()
	{
		return reason;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field MetaDataRequest$a reason>
	//    2    4:areturn         
	}

	public int getTotalSessions()
	{
		return totalSessions;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int totalSessions>
	//    2    4:ireturn         
	}

	public boolean isPayingUser()
	{
		return payingUser;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field boolean payingUser>
	//    2    4:ireturn         
	}

	public void setApkHash(String s)
	{
		apkHash = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #120 <Field String apkHash>
	//    3    5:return          
	}

	public void setDaysSinceFirstSession(int j)
	{
		daysSinceFirstSession = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #55  <Field int daysSinceFirstSession>
	//    3    5:return          
	}

	public void setIan(Context context)
	{
		int j = c.f(context);
	//    0    0:aload_1         
	//    1    1:invokestatic    #258 <Method int c.f(Context)>
	//    2    4:istore_2        
		if(j > 0)
	//*   3    5:iload_2         
	//*   4    6:ifle            17
			ian = Integer.valueOf(j);
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:invokestatic    #38  <Method Integer Integer.valueOf(int)>
	//    8   14:putfield        #160 <Field Integer ian>
	//    9   17:return          
	}

	public void setPaidAmount(float f)
	{
		paidAmount = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #71  <Field float paidAmount>
	//    3    5:return          
	}

	public void setPayingUser(boolean flag)
	{
		payingUser = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #86  <Field boolean payingUser>
	//    3    5:return          
	}

	public void setProfileId(String s)
	{
		profileId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #98  <Field String profileId>
	//    3    5:return          
	}

	public void setReason(a a1)
	{
		reason = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #100 <Field MetaDataRequest$a reason>
	//    3    5:return          
	}

	public void setTotalSessions(int j)
	{
		totalSessions = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #49  <Field int totalSessions>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append("MetaDataRequest [totalSessions=").append(totalSessions).append(", daysSinceFirstSession=").append(daysSinceFirstSession).append(", payingUser=").append(payingUser).append(", paidAmount=").append(paidAmount).append(", reason=").append(((Object) (reason))).append(", profileId=").append(profileId).append("]").toString();
	//    0    0:new             #269 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #270 <Method void StringBuilder()>
	//    3    7:ldc2            #272 <String "MetaDataRequest [totalSessions=">
	//    4   10:invokevirtual   #276 <Method StringBuilder StringBuilder.append(String)>
	//    5   13:aload_0         
	//    6   14:getfield        #49  <Field int totalSessions>
	//    7   17:invokevirtual   #279 <Method StringBuilder StringBuilder.append(int)>
	//    8   20:ldc2            #281 <String ", daysSinceFirstSession=">
	//    9   23:invokevirtual   #276 <Method StringBuilder StringBuilder.append(String)>
	//   10   26:aload_0         
	//   11   27:getfield        #55  <Field int daysSinceFirstSession>
	//   12   30:invokevirtual   #279 <Method StringBuilder StringBuilder.append(int)>
	//   13   33:ldc2            #283 <String ", payingUser=">
	//   14   36:invokevirtual   #276 <Method StringBuilder StringBuilder.append(String)>
	//   15   39:aload_0         
	//   16   40:getfield        #86  <Field boolean payingUser>
	//   17   43:invokevirtual   #286 <Method StringBuilder StringBuilder.append(boolean)>
	//   18   46:ldc2            #288 <String ", paidAmount=">
	//   19   49:invokevirtual   #276 <Method StringBuilder StringBuilder.append(String)>
	//   20   52:aload_0         
	//   21   53:getfield        #71  <Field float paidAmount>
	//   22   56:invokevirtual   #291 <Method StringBuilder StringBuilder.append(float)>
	//   23   59:ldc2            #293 <String ", reason=">
	//   24   62:invokevirtual   #276 <Method StringBuilder StringBuilder.append(String)>
	//   25   65:aload_0         
	//   26   66:getfield        #100 <Field MetaDataRequest$a reason>
	//   27   69:invokevirtual   #296 <Method StringBuilder StringBuilder.append(Object)>
	//   28   72:ldc2            #298 <String ", profileId=">
	//   29   75:invokevirtual   #276 <Method StringBuilder StringBuilder.append(String)>
	//   30   78:aload_0         
	//   31   79:getfield        #98  <Field String profileId>
	//   32   82:invokevirtual   #276 <Method StringBuilder StringBuilder.append(String)>
	//   33   85:ldc2            #300 <String "]">
	//   34   88:invokevirtual   #276 <Method StringBuilder StringBuilder.append(String)>
	//   35   91:invokevirtual   #302 <Method String StringBuilder.toString()>
	//   36   94:areturn         
	}

	private String apkHash;
	private int daysSinceFirstSession;
	private long firstInstalledAppTS;
	private Integer ian;
	private float paidAmount;
	private boolean payingUser;
	private String profileId;
	private a reason;
	private Pair simpleToken;
	private int totalSessions;
}
