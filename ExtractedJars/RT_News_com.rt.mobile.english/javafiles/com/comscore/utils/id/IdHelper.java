// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.utils.id;

import android.content.Context;
import com.comscore.analytics.Core;
import com.comscore.android.id.DeviceId;
import com.comscore.android.id.IdHelperAndroid;
import com.comscore.applications.EventType;
import com.comscore.utils.Storage;
import com.comscore.utils.Utils;
import java.util.HashMap;

// Referenced classes of package com.comscore.utils.id:
//			IdChecker

public class IdHelper
{

	public IdHelper(Context context, Storage storage, Core core)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		i = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #34  <Field boolean i>
		j = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #36  <Field boolean j>
		k = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #38  <Field boolean k>
		e = context;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #40  <Field Context e>
		d = storage;
	//   14   24:aload_0         
	//   15   25:aload_2         
	//   16   26:putfield        #42  <Field Storage d>
		a = core;
	//   17   29:aload_0         
	//   18   30:aload_3         
	//   19   31:putfield        #44  <Field Core a>
		m = new IdChecker(e, storage);
	//   20   34:aload_0         
	//   21   35:new             #46  <Class IdChecker>
	//   22   38:dup             
	//   23   39:aload_0         
	//   24   40:getfield        #40  <Field Context e>
	//   25   43:aload_2         
	//   26   44:invokespecial   #49  <Method void IdChecker(Context, Storage)>
	//   27   47:putfield        #51  <Field IdChecker m>
	//   28   50:return          
	}

	private void a()
	{
		DeviceId deviceid = IdHelperAndroid.getAdvertisingDeviceId(e);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Context e>
	//    2    4:invokestatic    #58  <Method DeviceId IdHelperAndroid.getAdvertisingDeviceId(Context)>
	//    3    7:astore_1        
		if(deviceid == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       24
		{
			i = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #34  <Field boolean i>
			a(((String) (null)), false);
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:iconst_0        
	//   12   20:invokespecial   #61  <Method void a(String, boolean)>
			return;
	//   13   23:return          
		}
		if(deviceid.getCommonness() == 0 && deviceid.getPersistency() == 0)
	//*  14   24:aload_1         
	//*  15   25:invokevirtual   #67  <Method int DeviceId.getCommonness()>
	//*  16   28:ifne            48
	//*  17   31:aload_1         
	//*  18   32:invokevirtual   #70  <Method int DeviceId.getPersistency()>
	//*  19   35:ifne            48
		{
			a(deviceid.getId(), true);
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #74  <Method String DeviceId.getId()>
	//   23   43:iconst_1        
	//   24   44:invokespecial   #61  <Method void a(String, boolean)>
			return;
	//   25   47:return          
		}
		String s = d.get("md5RawCrossPublisherId");
	//   26   48:aload_0         
	//   27   49:getfield        #42  <Field Storage d>
	//   28   52:ldc1            #76  <String "md5RawCrossPublisherId">
	//   29   54:invokevirtual   #82  <Method String Storage.get(String)>
	//   30   57:astore_2        
		if(!m.checkCrossPublisherId(s))
	//*  31   58:aload_0         
	//*  32   59:getfield        #51  <Field IdChecker m>
	//*  33   62:aload_2         
	//*  34   63:invokevirtual   #86  <Method boolean IdChecker.checkCrossPublisherId(String)>
	//*  35   66:ifne            97
		{
			d.remove("md5RawCrossPublisherId");
	//   36   69:aload_0         
	//   37   70:getfield        #42  <Field Storage d>
	//   38   73:ldc1            #76  <String "md5RawCrossPublisherId">
	//   39   75:invokevirtual   #90  <Method void Storage.remove(String)>
			d.remove("crossPublisherId");
	//   40   78:aload_0         
	//   41   79:getfield        #42  <Field Storage d>
	//   42   82:ldc1            #92  <String "crossPublisherId">
	//   43   84:invokevirtual   #90  <Method void Storage.remove(String)>
			b = null;
	//   44   87:aload_0         
	//   45   88:aconst_null     
	//   46   89:putfield        #94  <Field String b>
			h = null;
	//   47   92:aload_0         
	//   48   93:aconst_null     
	//   49   94:putfield        #96  <Field String h>
		}
		a(deviceid.getId(), false);
	//   50   97:aload_0         
	//   51   98:aload_1         
	//   52   99:invokevirtual   #74  <Method String DeviceId.getId()>
	//   53  102:iconst_0        
	//   54  103:invokespecial   #61  <Method void a(String, boolean)>
	//   55  106:return          
	}

	private void a(String s, boolean flag)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          138
		{
			i = flag;
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:putfield        #34  <Field boolean i>
			String s1 = d.get("md5RawCrossPublisherId");
	//    5    9:aload_0         
	//    6   10:getfield        #42  <Field Storage d>
	//    7   13:ldc1            #76  <String "md5RawCrossPublisherId">
	//    8   15:invokevirtual   #82  <Method String Storage.get(String)>
	//    9   18:astore_3        
			if(h == null)
	//*  10   19:aload_0         
	//*  11   20:getfield        #96  <Field String h>
	//*  12   23:ifnonnull       31
				flag = true;
	//   13   26:iconst_1        
	//   14   27:istore_2        
			else
	//*  15   28:goto            33
				flag = false;
	//   16   31:iconst_0        
	//   17   32:istore_2        
			h = Utils.md5(s);
	//   18   33:aload_0         
	//   19   34:aload_1         
	//   20   35:invokestatic    #101 <Method String Utils.md5(String)>
	//   21   38:putfield        #96  <Field String h>
			if(a(h))
	//*  22   41:aload_0         
	//*  23   42:aload_0         
	//*  24   43:getfield        #96  <Field String h>
	//*  25   46:invokespecial   #103 <Method boolean a(String)>
	//*  26   49:ifeq            66
			{
				b = d.get("crossPublisherId");
	//   27   52:aload_0         
	//   28   53:aload_0         
	//   29   54:getfield        #42  <Field Storage d>
	//   30   57:ldc1            #92  <String "crossPublisherId">
	//   31   59:invokevirtual   #82  <Method String Storage.get(String)>
	//   32   62:putfield        #94  <Field String b>
				return;
	//   33   65:return          
			}
			if(i && s1 != null && !s1.isEmpty() && s1 != h)
	//*  34   66:aload_0         
	//*  35   67:getfield        #34  <Field boolean i>
	//*  36   70:ifeq            102
	//*  37   73:aload_3         
	//*  38   74:ifnull          102
	//*  39   77:aload_3         
	//*  40   78:invokevirtual   #109 <Method boolean String.isEmpty()>
	//*  41   81:ifne            102
	//*  42   84:aload_3         
	//*  43   85:aload_0         
	//*  44   86:getfield        #96  <Field String h>
	//*  45   89:if_acmpeq       102
			{
				j = true;
	//   46   92:aload_0         
	//   47   93:iconst_1        
	//   48   94:putfield        #36  <Field boolean j>
				k = flag;
	//   49   97:aload_0         
	//   50   98:iload_2         
	//   51   99:putfield        #38  <Field boolean k>
			}
			b = b(s);
	//   52  102:aload_0         
	//   53  103:aload_0         
	//   54  104:aload_1         
	//   55  105:invokespecial   #111 <Method String b(String)>
	//   56  108:putfield        #94  <Field String b>
			d.set("crossPublisherId", b);
	//   57  111:aload_0         
	//   58  112:getfield        #42  <Field Storage d>
	//   59  115:ldc1            #92  <String "crossPublisherId">
	//   60  117:aload_0         
	//   61  118:getfield        #94  <Field String b>
	//   62  121:invokevirtual   #115 <Method void Storage.set(String, String)>
			d.set("md5RawCrossPublisherId", h);
	//   63  124:aload_0         
	//   64  125:getfield        #42  <Field Storage d>
	//   65  128:ldc1            #76  <String "md5RawCrossPublisherId">
	//   66  130:aload_0         
	//   67  131:getfield        #96  <Field String h>
	//   68  134:invokevirtual   #115 <Method void Storage.set(String, String)>
			return;
	//   69  137:return          
		} else
		{
			b = null;
	//   70  138:aload_0         
	//   71  139:aconst_null     
	//   72  140:putfield        #94  <Field String b>
			h = null;
	//   73  143:aload_0         
	//   74  144:aconst_null     
	//   75  145:putfield        #96  <Field String h>
			return;
	//   76  148:return          
		}
	}

	private boolean a(String s)
	{
		String s1 = d.get("md5RawCrossPublisherId");
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Storage d>
	//    2    4:ldc1            #76  <String "md5RawCrossPublisherId">
	//    3    6:invokevirtual   #82  <Method String Storage.get(String)>
	//    4    9:astore_2        
		return s1 != null && s1.equals(((Object) (s)));
	//    5   10:aload_2         
	//    6   11:ifnull          24
	//    7   14:aload_2         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #119 <Method boolean String.equals(Object)>
	//   10   19:ifeq            24
	//   11   22:iconst_1        
	//   12   23:ireturn         
	//   13   24:iconst_0        
	//   14   25:ireturn         
	}

	private String b(String s)
	{
		if(s == null || s.length() <= 0)
			break MISSING_BLOCK_LABEL_18;
	//    0    0:aload_1         
	//    1    1:ifnull          18
	//    2    4:aload_1         
	//    3    5:invokevirtual   #124 <Method int String.length()>
	//    4    8:ifle            18
		s = Utils.encrypt(s);
	//    5   11:aload_1         
	//    6   12:invokestatic    #127 <Method String Utils.encrypt(String)>
	//    7   15:astore_1        
		return s;
	//    8   16:aload_1         
	//    9   17:areturn         
_L2:
		return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		s;
	//   12   20:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  13   21:goto            18
	}

	private void b()
	{
		if(d.has("vid").booleanValue())
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field Storage d>
	//*   2    4:ldc1            #129 <String "vid">
	//*   3    6:invokevirtual   #133 <Method Boolean Storage.has(String)>
	//*   4    9:invokevirtual   #138 <Method boolean Boolean.booleanValue()>
	//*   5   12:ifeq            92
		{
			c = d.get("vid");
	//    6   15:aload_0         
	//    7   16:aload_0         
	//    8   17:getfield        #42  <Field Storage d>
	//    9   20:ldc1            #129 <String "vid">
	//   10   22:invokevirtual   #82  <Method String Storage.get(String)>
	//   11   25:putfield        #140 <Field String c>
			if(!m.checkVisitorId())
	//*  12   28:aload_0         
	//*  13   29:getfield        #51  <Field IdChecker m>
	//*  14   32:invokevirtual   #143 <Method boolean IdChecker.checkVisitorId()>
	//*  15   35:ifne            91
			{
				HashMap hashmap = new HashMap();
	//   16   38:new             #145 <Class HashMap>
	//   17   41:dup             
	//   18   42:invokespecial   #146 <Method void HashMap()>
	//   19   45:astore_1        
				hashmap.put("cs_c12u", ((Object) (d.get("vid"))));
	//   20   46:aload_1         
	//   21   47:ldc1            #148 <String "cs_c12u">
	//   22   49:aload_0         
	//   23   50:getfield        #42  <Field Storage d>
	//   24   53:ldc1            #129 <String "vid">
	//   25   55:invokevirtual   #82  <Method String Storage.get(String)>
	//   26   58:invokevirtual   #152 <Method Object HashMap.put(Object, Object)>
	//   27   61:pop             
				a.notify(EventType.AGGREGATE, hashmap, true);
	//   28   62:aload_0         
	//   29   63:getfield        #44  <Field Core a>
	//   30   66:getstatic       #158 <Field EventType EventType.AGGREGATE>
	//   31   69:aload_1         
	//   32   70:iconst_1        
	//   33   71:invokevirtual   #164 <Method void Core.notify(EventType, HashMap, boolean)>
				d.remove("vid");
	//   34   74:aload_0         
	//   35   75:getfield        #42  <Field Storage d>
	//   36   78:ldc1            #129 <String "vid">
	//   37   80:invokevirtual   #90  <Method void Storage.remove(String)>
				c = null;
	//   38   83:aload_0         
	//   39   84:aconst_null     
	//   40   85:putfield        #140 <Field String c>
			} else
	//*  41   88:goto            92
			{
				return;
	//   42   91:return          
			}
		}
		Object obj = ((Object) (IdHelperAndroid.getDeviceId(e)));
	//   43   92:aload_0         
	//   44   93:getfield        #40  <Field Context e>
	//   45   96:invokestatic    #167 <Method DeviceId IdHelperAndroid.getDeviceId(Context)>
	//   46   99:astore_2        
		String s = ((DeviceId) (obj)).getId();
	//   47  100:aload_2         
	//   48  101:invokevirtual   #74  <Method String DeviceId.getId()>
	//   49  104:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   50  105:new             #169 <Class StringBuilder>
	//   51  108:dup             
	//   52  109:invokespecial   #170 <Method void StringBuilder()>
	//   53  112:astore_3        
		stringbuilder.append("-cs");
	//   54  113:aload_3         
	//   55  114:ldc1            #172 <String "-cs">
	//   56  116:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   57  119:pop             
		stringbuilder.append(((DeviceId) (obj)).getSuffix());
	//   58  120:aload_3         
	//   59  121:aload_2         
	//   60  122:invokevirtual   #179 <Method String DeviceId.getSuffix()>
	//   61  125:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   62  128:pop             
		obj = ((Object) (stringbuilder.toString()));
	//   63  129:aload_3         
	//   64  130:invokevirtual   #182 <Method String StringBuilder.toString()>
	//   65  133:astore_2        
		if(c == null)
	//*  66  134:aload_0         
	//*  67  135:getfield        #140 <Field String c>
	//*  68  138:ifnonnull       215
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   69  141:new             #169 <Class StringBuilder>
	//   70  144:dup             
	//   71  145:invokespecial   #170 <Method void StringBuilder()>
	//   72  148:astore_3        
			StringBuilder stringbuilder2 = new StringBuilder();
	//   73  149:new             #169 <Class StringBuilder>
	//   74  152:dup             
	//   75  153:invokespecial   #170 <Method void StringBuilder()>
	//   76  156:astore          4
			stringbuilder2.append(s);
	//   77  158:aload           4
	//   78  160:aload_1         
	//   79  161:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   80  164:pop             
			stringbuilder2.append(getPublisherSecret());
	//   81  165:aload           4
	//   82  167:aload_0         
	//   83  168:invokevirtual   #185 <Method String getPublisherSecret()>
	//   84  171:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   85  174:pop             
			stringbuilder1.append(Utils.md5(stringbuilder2.toString()));
	//   86  175:aload_3         
	//   87  176:aload           4
	//   88  178:invokevirtual   #182 <Method String StringBuilder.toString()>
	//   89  181:invokestatic    #101 <Method String Utils.md5(String)>
	//   90  184:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   91  187:pop             
			stringbuilder1.append(((String) (obj)));
	//   92  188:aload_3         
	//   93  189:aload_2         
	//   94  190:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   95  193:pop             
			c = stringbuilder1.toString();
	//   96  194:aload_0         
	//   97  195:aload_3         
	//   98  196:invokevirtual   #182 <Method String StringBuilder.toString()>
	//   99  199:putfield        #140 <Field String c>
			d.set("vid", c);
	//  100  202:aload_0         
	//  101  203:getfield        #42  <Field Storage d>
	//  102  206:ldc1            #129 <String "vid">
	//  103  208:aload_0         
	//  104  209:getfield        #140 <Field String c>
	//  105  212:invokevirtual   #115 <Method void Storage.set(String, String)>
		}
	//  106  215:return          
	}

	private boolean c()
	{
		boolean flag = IdHelperAndroid.isAdvertisingIdEnabled(e);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Context e>
	//    2    4:invokestatic    #189 <Method boolean IdHelperAndroid.isAdvertisingIdEnabled(Context)>
	//    3    7:istore_1        
		if(l == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #191 <Field Boolean l>
	//*   6   12:ifnonnull       25
		{
			l = Boolean.valueOf(flag);
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:invokestatic    #195 <Method Boolean Boolean.valueOf(boolean)>
	//   10   20:putfield        #191 <Field Boolean l>
			return flag;
	//   11   23:iload_1         
	//   12   24:ireturn         
		}
		if(l.booleanValue() != flag)
	//*  13   25:aload_0         
	//*  14   26:getfield        #191 <Field Boolean l>
	//*  15   29:invokevirtual   #138 <Method boolean Boolean.booleanValue()>
	//*  16   32:iload_1         
	//*  17   33:icmpeq          40
			a();
	//   18   36:aload_0         
	//   19   37:invokespecial   #197 <Method void a()>
		return flag;
	//   20   40:iload_1         
	//   21   41:ireturn         
	}

	public void generateIds()
	{
		if(isPublisherSecretEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #201 <Method boolean isPublisherSecretEmpty()>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			g = IdHelperAndroid.getDeviceId(e).getId();
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field Context e>
	//    7   13:invokestatic    #167 <Method DeviceId IdHelperAndroid.getDeviceId(Context)>
	//    8   16:invokevirtual   #74  <Method String DeviceId.getId()>
	//    9   19:putfield        #203 <Field String g>
			b();
	//   10   22:aload_0         
	//   11   23:invokespecial   #205 <Method void b()>
			a();
	//   12   26:aload_0         
	//   13   27:invokespecial   #197 <Method void a()>
			return;
	//   14   30:return          
		}
	}

	public String getAndroidId()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field String g>
	//    2    4:areturn         
	}

	public String getCrossPublisherId()
	{
		if(i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field boolean i>
	//*   2    4:ifeq            43
		{
			if(c())
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #209 <Method boolean c()>
	//*   5   11:ifeq            40
			{
				a();
	//    6   14:aload_0         
	//    7   15:invokespecial   #197 <Method void a()>
				if(j && !k)
	//*   8   18:aload_0         
	//*   9   19:getfield        #36  <Field boolean j>
	//*  10   22:ifeq            35
	//*  11   25:aload_0         
	//*  12   26:getfield        #38  <Field boolean k>
	//*  13   29:ifne            35
					return "none";
	//   14   32:ldc1            #211 <String "none">
	//   15   34:areturn         
				else
					return b;
	//   16   35:aload_0         
	//   17   36:getfield        #94  <Field String b>
	//   18   39:areturn         
			} else
			{
				return "none";
	//   19   40:ldc1            #211 <String "none">
	//   20   42:areturn         
			}
		} else
		{
			return b;
	//   21   43:aload_0         
	//   22   44:getfield        #94  <Field String b>
	//   23   47:areturn         
		}
	}

	public String getMD5AdvertisingId()
	{
		if(i && c())
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field boolean i>
	//*   2    4:ifeq            19
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #209 <Method boolean c()>
	//*   5   11:ifeq            19
			return h;
	//    6   14:aload_0         
	//    7   15:getfield        #96  <Field String h>
	//    8   18:areturn         
		else
			return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
	}

	public String getPublisherSecret()
	{
		if(f == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #214 <Field String f>
	//*   2    4:ifnonnull       13
			f = "";
	//    3    7:aload_0         
	//    4    8:ldc1            #216 <String "">
	//    5   10:putfield        #214 <Field String f>
		return f;
	//    6   13:aload_0         
	//    7   14:getfield        #214 <Field String f>
	//    8   17:areturn         
	}

	public String getVisitorId()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field String c>
	//    2    4:areturn         
	}

	public boolean isIdChanged()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean j>
	//    2    4:ireturn         
	}

	public boolean isPublisherSecretEmpty()
	{
		return f == null || f.length() == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field String f>
	//    2    4:ifnull          22
	//    3    7:aload_0         
	//    4    8:getfield        #214 <Field String f>
	//    5   11:invokevirtual   #124 <Method int String.length()>
	//    6   14:ifne            20
	//    7   17:goto            22
	//    8   20:iconst_0        
	//    9   21:ireturn         
	//   10   22:iconst_1        
	//   11   23:ireturn         
	}

	public void resetVisitorId()
	{
		c = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #140 <Field String c>
		if(!d.has("vid").booleanValue())
	//*   3    5:aload_0         
	//*   4    6:getfield        #42  <Field Storage d>
	//*   5    9:ldc1            #129 <String "vid">
	//*   6   11:invokevirtual   #133 <Method Boolean Storage.has(String)>
	//*   7   14:invokevirtual   #138 <Method boolean Boolean.booleanValue()>
	//*   8   17:ifne            21
		{
			return;
	//    9   20:return          
		} else
		{
			d.remove("vid");
	//   10   21:aload_0         
	//   11   22:getfield        #42  <Field Storage d>
	//   12   25:ldc1            #129 <String "vid">
	//   13   27:invokevirtual   #90  <Method void Storage.remove(String)>
			generateIds();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #221 <Method void generateIds()>
			return;
	//   16   34:return          
		}
	}

	public void setPublisherSecret(String s)
	{
		f = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #214 <Field String f>
	//    3    5:return          
	}

	private Core a;
	private String b;
	private String c;
	private Storage d;
	private Context e;
	private String f;
	private String g;
	private String h;
	private boolean i;
	private boolean j;
	private boolean k;
	private Boolean l;
	private IdChecker m;
}
