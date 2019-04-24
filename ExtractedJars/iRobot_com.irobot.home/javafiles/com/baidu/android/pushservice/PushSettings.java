// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;

import android.content.Context;
import android.content.Intent;
import android.content.pm.*;
import android.text.TextUtils;
import com.baidu.android.pushservice.config.ModeConfig;
import com.baidu.android.pushservice.e.a;
import com.baidu.android.pushservice.h.b;
import com.baidu.android.pushservice.h.m;
import com.baidu.android.pushservice.h.q;
import com.baidu.android.pushservice.h.r;
import com.baidu.android.pushservice.h.t;
import com.baidu.android.pushservice.h.u;
import java.util.Iterator;
import java.util.List;

public class PushSettings
{

	public PushSettings()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static String a(Context context)
	{
		Object obj;
label0:
		{
			String s = com.baidu.android.pushservice.h.b.a(context, "com.baidu.pushservice.channel_id");
	//    0    0:aload_0         
	//    1    1:ldc1            #18  <String "com.baidu.pushservice.channel_id">
	//    2    3:invokestatic    #23  <Method String b.a(Context, String)>
	//    3    6:astore_2        
			obj = ((Object) (s));
	//    4    7:aload_2         
	//    5    8:astore_1        
			if(!TextUtils.isEmpty(((CharSequence) (s))))
				break label0;
	//    6    9:aload_2         
	//    7   10:invokestatic    #29  <Method boolean TextUtils.isEmpty(CharSequence)>
	//    8   13:ifeq            126
			s = com.baidu.android.pushservice.h.m.a(context, "com.baidu.pushservice.channel_id");
	//    9   16:aload_0         
	//   10   17:ldc1            #18  <String "com.baidu.pushservice.channel_id">
	//   11   19:invokestatic    #32  <Method String m.a(Context, String)>
	//   12   22:astore_2        
			obj = ((Object) (s));
	//   13   23:aload_2         
	//   14   24:astore_1        
			if(!TextUtils.isEmpty(((CharSequence) (s))))
				break label0;
	//   15   25:aload_2         
	//   16   26:invokestatic    #29  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   17   29:ifeq            126
			s = q.d(context);
	//   18   32:aload_0         
	//   19   33:invokestatic    #37  <Method String q.d(Context)>
	//   20   36:astore_2        
			obj = ((Object) (s));
	//   21   37:aload_2         
	//   22   38:astore_1        
			if(!TextUtils.isEmpty(((CharSequence) (s))))
				break label0;
	//   23   39:aload_2         
	//   24   40:invokestatic    #29  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   25   43:ifeq            126
			if(u.I(context))
	//*  26   46:aload_0         
	//*  27   47:invokestatic    #42  <Method boolean u.I(Context)>
	//*  28   50:ifeq            64
				obj = ((Object) (u.r(context.getApplicationContext())));
	//   29   53:aload_0         
	//   30   54:invokevirtual   #48  <Method Context Context.getApplicationContext()>
	//   31   57:invokestatic    #52  <Method List u.r(Context)>
	//   32   60:astore_1        
			else
	//*  33   61:goto            72
				obj = ((Object) (u.q(context.getApplicationContext())));
	//   34   64:aload_0         
	//   35   65:invokevirtual   #48  <Method Context Context.getApplicationContext()>
	//   36   68:invokestatic    #55  <Method List u.q(Context)>
	//   37   71:astore_1        
			Iterator iterator = ((List) (obj)).iterator();
	//   38   72:aload_1         
	//   39   73:invokeinterface #61  <Method Iterator List.iterator()>
	//   40   78:astore_3        
			obj = ((Object) (s));
	//   41   79:aload_2         
	//   42   80:astore_1        
			do
			{
				if(!iterator.hasNext())
					break label0;
	//   43   81:aload_3         
	//   44   82:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   45   87:ifeq            126
				s = r.a(context, ((ResolveInfo)iterator.next()).activityInfo.packageName);
	//   46   90:aload_0         
	//   47   91:aload_3         
	//   48   92:invokeinterface #71  <Method Object Iterator.next()>
	//   49   97:checkcast       #73  <Class ResolveInfo>
	//   50  100:getfield        #77  <Field ActivityInfo ResolveInfo.activityInfo>
	//   51  103:getfield        #83  <Field String ActivityInfo.packageName>
	//   52  106:invokestatic    #86  <Method String r.a(Context, String)>
	//   53  109:astore_2        
				obj = ((Object) (s));
	//   54  110:aload_2         
	//   55  111:astore_1        
			} while(TextUtils.isEmpty(((CharSequence) (s))));
	//   56  112:aload_2         
	//   57  113:invokestatic    #29  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   58  116:ifne            81
			a(context, s);
	//   59  119:aload_0         
	//   60  120:aload_2         
	//   61  121:invokestatic    #89  <Method void a(Context, String)>
			obj = ((Object) (s));
	//   62  124:aload_2         
	//   63  125:astore_1        
		}
		return ((String) (obj));
	//   64  126:aload_1         
	//   65  127:areturn         
	}

	public static void a(Context context, int i1)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
		{
			com.baidu.android.pushservice.e.a.d("PushSettings", "setStatisticSendDisabled mContext == null");
	//    2    4:ldc1            #92  <String "PushSettings">
	//    3    6:ldc1            #94  <String "setStatisticSendDisabled mContext == null">
	//    4    8:invokestatic    #99  <Method void a.d(String, String)>
			return;
	//    5   11:return          
		} else
		{
			com.baidu.android.pushservice.h.m.a(context, "com.baidu.pushservice.sd", i1);
	//    6   12:aload_0         
	//    7   13:ldc1            #101 <String "com.baidu.pushservice.sd">
	//    8   15:iload_1         
	//    9   16:invokestatic    #104 <Method void m.a(Context, String, int)>
			return;
	//   10   19:return          
		}
	}

	public static void a(Context context, long l1)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
		{
			com.baidu.android.pushservice.e.a.d("PushSettings", "setLastSendStatisticTime mContext == null");
	//    2    4:ldc1            #92  <String "PushSettings">
	//    3    6:ldc1            #107 <String "setLastSendStatisticTime mContext == null">
	//    4    8:invokestatic    #99  <Method void a.d(String, String)>
			return;
	//    5   11:return          
		} else
		{
			com.baidu.android.pushservice.h.m.a(context, "com.baidu.pushservice.cst", l1);
	//    6   12:aload_0         
	//    7   13:ldc1            #109 <String "com.baidu.pushservice.cst">
	//    8   15:lload_1         
	//    9   16:invokestatic    #112 <Method void m.a(Context, String, long)>
			return;
	//   10   19:return          
		}
	}

	protected static void a(Context context, String s)
	{
		com.baidu.android.pushservice.h.b.a(context, "com.baidu.pushservice.channel_id", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #18  <String "com.baidu.pushservice.channel_id">
	//    2    3:aload_1         
	//    3    4:invokestatic    #115 <Method void b.a(Context, String, String)>
		com.baidu.android.pushservice.h.m.a(context, "com.baidu.pushservice.channel_id", s);
	//    4    7:aload_0         
	//    5    8:ldc1            #18  <String "com.baidu.pushservice.channel_id">
	//    6   10:aload_1         
	//    7   11:invokestatic    #118 <Method boolean m.a(Context, String, String)>
	//    8   14:pop             
		q.a(context, s);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokestatic    #119 <Method void q.a(Context, String)>
	//   12   20:return          
	}

	public static void a(Context context, boolean flag)
	{
		if(context != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       14
_L1:
		context = "setLbsEnabled mContext == null";
	//    2    4:ldc1            #122 <String "setLbsEnabled mContext == null">
	//    3    6:astore_0        
_L4:
		com.baidu.android.pushservice.e.a.d("PushSettings", ((String) (context)));
	//    4    7:ldc1            #92  <String "PushSettings">
	//    5    9:aload_0         
	//    6   10:invokestatic    #99  <Method void a.d(String, String)>
		return;
	//    7   13:return          
_L2:
		if(!TextUtils.isEmpty(((CharSequence) (context.getPackageName()))))
			break; /* Loop/switch isn't completed */
	//    8   14:aload_0         
	//    9   15:invokevirtual   #126 <Method String Context.getPackageName()>
	//   10   18:invokestatic    #29  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   11   21:ifeq            30
		context = "mContext.getPackageName() == null";
	//   12   24:ldc1            #128 <String "mContext.getPackageName() == null">
	//   13   26:astore_0        
		if(true) goto _L4; else goto _L3
	//   14   27:goto            7
_L3:
label0:
		{
			String s = com.baidu.android.pushservice.h.m.a(context, "com.baidu.pushservice.le");
	//   15   30:aload_0         
	//   16   31:ldc1            #130 <String "com.baidu.pushservice.le">
	//   17   33:invokestatic    #32  <Method String m.a(Context, String)>
	//   18   36:astore          6
			Object obj;
			if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  19   38:aload           6
	//*  20   40:invokestatic    #29  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  21   43:ifne            206
			{
				obj = ((Object) (new StringBuilder()));
	//   22   46:new             #132 <Class StringBuilder>
	//   23   49:dup             
	//   24   50:invokespecial   #133 <Method void StringBuilder()>
	//   25   53:astore          5
				String as[] = s.trim().split(",");
	//   26   55:aload           6
	//   27   57:invokevirtual   #138 <Method String String.trim()>
	//   28   60:ldc1            #140 <String ",">
	//   29   62:invokevirtual   #144 <Method String[] String.split(String)>
	//   30   65:astore          6
				int j1 = as.length;
	//   31   67:aload           6
	//   32   69:arraylength     
	//   33   70:istore          4
				int i1 = 0;
	//   34   72:iconst_0        
	//   35   73:istore_3        
				boolean flag1 = false;
	//   36   74:iconst_0        
	//   37   75:istore_2        
				for(; i1 < j1; i1++)
	//*  38   76:iload_3         
	//*  39   77:iload           4
	//*  40   79:icmpge          154
				{
					String s1 = as[i1];
	//   41   82:aload           6
	//   42   84:iload_3         
	//   43   85:aaload          
	//   44   86:astore          7
					if(s1.equals(((Object) (context.getPackageName()))))
	//*  45   88:aload           7
	//*  46   90:aload_0         
	//*  47   91:invokevirtual   #126 <Method String Context.getPackageName()>
	//*  48   94:invokevirtual   #148 <Method boolean String.equals(Object)>
	//*  49   97:ifeq            111
					{
						if(!flag)
	//*  50  100:iload_1         
	//*  51  101:ifne            109
						{
							flag1 = true;
	//   52  104:iconst_1        
	//   53  105:istore_2        
							continue;
	//   54  106:goto            147
						}
						flag1 = true;
	//   55  109:iconst_1        
	//   56  110:istore_2        
					}
					StringBuilder stringbuilder1 = new StringBuilder();
	//   57  111:new             #132 <Class StringBuilder>
	//   58  114:dup             
	//   59  115:invokespecial   #133 <Method void StringBuilder()>
	//   60  118:astore          8
					stringbuilder1.append(s1);
	//   61  120:aload           8
	//   62  122:aload           7
	//   63  124:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   64  127:pop             
					stringbuilder1.append(",");
	//   65  128:aload           8
	//   66  130:ldc1            #140 <String ",">
	//   67  132:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   68  135:pop             
					((StringBuilder) (obj)).append(stringbuilder1.toString());
	//   69  136:aload           5
	//   70  138:aload           8
	//   71  140:invokevirtual   #155 <Method String StringBuilder.toString()>
	//   72  143:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   73  146:pop             
				}

	//   74  147:iload_3         
	//   75  148:iconst_1        
	//   76  149:iadd            
	//   77  150:istore_3        
	//*  78  151:goto            76
				if(!flag1)
	//*  79  154:iload_2         
	//*  80  155:ifne            196
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   81  158:new             #132 <Class StringBuilder>
	//   82  161:dup             
	//   83  162:invokespecial   #133 <Method void StringBuilder()>
	//   84  165:astore          6
					stringbuilder.append(context.getPackageName());
	//   85  167:aload           6
	//   86  169:aload_0         
	//   87  170:invokevirtual   #126 <Method String Context.getPackageName()>
	//   88  173:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   89  176:pop             
					stringbuilder.append(",");
	//   90  177:aload           6
	//   91  179:ldc1            #140 <String ",">
	//   92  181:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   93  184:pop             
					((StringBuilder) (obj)).append(stringbuilder.toString());
	//   94  185:aload           5
	//   95  187:aload           6
	//   96  189:invokevirtual   #155 <Method String StringBuilder.toString()>
	//   97  192:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   98  195:pop             
				}
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   99  196:aload           5
	//  100  198:invokevirtual   #155 <Method String StringBuilder.toString()>
	//  101  201:astore          5
			} else
	//* 102  203:goto            244
			{
				if(!flag)
					break label0;
	//  103  206:iload_1         
	//  104  207:ifeq            253
				obj = ((Object) (new StringBuilder()));
	//  105  210:new             #132 <Class StringBuilder>
	//  106  213:dup             
	//  107  214:invokespecial   #133 <Method void StringBuilder()>
	//  108  217:astore          5
				((StringBuilder) (obj)).append(context.getPackageName());
	//  109  219:aload           5
	//  110  221:aload_0         
	//  111  222:invokevirtual   #126 <Method String Context.getPackageName()>
	//  112  225:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  113  228:pop             
				((StringBuilder) (obj)).append(",");
	//  114  229:aload           5
	//  115  231:ldc1            #140 <String ",">
	//  116  233:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//  117  236:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  118  237:aload           5
	//  119  239:invokevirtual   #155 <Method String StringBuilder.toString()>
	//  120  242:astore          5
			}
			com.baidu.android.pushservice.h.m.a(context, "com.baidu.pushservice.le", ((String) (obj)));
	//  121  244:aload_0         
	//  122  245:ldc1            #130 <String "com.baidu.pushservice.le">
	//  123  247:aload           5
	//  124  249:invokestatic    #118 <Method boolean m.a(Context, String, String)>
	//  125  252:pop             
		}
		return;
	//  126  253:return          
	}

	public static String b(Context context)
	{
		return com.baidu.android.pushservice.h.m.a(context, "com.baidu.pushservice.app_id");
	//    0    0:aload_0         
	//    1    1:ldc1            #157 <String "com.baidu.pushservice.app_id">
	//    2    3:invokestatic    #32  <Method String m.a(Context, String)>
	//    3    6:areturn         
	}

	public static void b(Context context, int i1)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
		{
			com.baidu.android.pushservice.e.a.d("PushSettings", "setCurPeriod mContext == null");
	//    2    4:ldc1            #92  <String "PushSettings">
	//    3    6:ldc1            #159 <String "setCurPeriod mContext == null">
	//    4    8:invokestatic    #99  <Method void a.d(String, String)>
			return;
	//    5   11:return          
		} else
		{
			com.baidu.android.pushservice.h.m.a(context, "com.baidu.pushservice.lsi", i1 * 1000);
	//    6   12:aload_0         
	//    7   13:ldc1            #161 <String "com.baidu.pushservice.lsi">
	//    8   15:iload_1         
	//    9   16:sipush          1000
	//   10   19:imul            
	//   11   20:invokestatic    #104 <Method void m.a(Context, String, int)>
			return;
	//   12   23:return          
		}
	}

	public static void b(Context context, long l1)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
		{
			com.baidu.android.pushservice.e.a.d("PushSettings", "setLastSendStatisticTime mContext == null");
	//    2    4:ldc1            #92  <String "PushSettings">
	//    3    6:ldc1            #107 <String "setLastSendStatisticTime mContext == null">
	//    4    8:invokestatic    #99  <Method void a.d(String, String)>
			return;
	//    5   11:return          
		} else
		{
			com.baidu.android.pushservice.h.m.a(context, "com.baidu.pushservice.st", l1);
	//    6   12:aload_0         
	//    7   13:ldc1            #163 <String "com.baidu.pushservice.st">
	//    8   15:lload_1         
	//    9   16:invokestatic    #112 <Method void m.a(Context, String, long)>
			return;
	//   10   19:return          
		}
	}

	protected static void b(Context context, String s)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #29  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            15
			com.baidu.android.pushservice.h.m.a(context, "com.baidu.pushservice.app_id", s);
	//    3    7:aload_0         
	//    4    8:ldc1            #157 <String "com.baidu.pushservice.app_id">
	//    5   10:aload_1         
	//    6   11:invokestatic    #118 <Method boolean m.a(Context, String, String)>
	//    7   14:pop             
	//    8   15:return          
	}

	private static void b(Context context, boolean flag)
	{
		String s1;
		String s2;
		s1 = context.getPackageName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #126 <Method String Context.getPackageName()>
	//    2    4:astore_3        
		s2 = u.y(context);
	//    3    5:aload_0         
	//    4    6:invokestatic    #168 <Method String u.y(Context)>
	//    5    9:astore          4
		String s = "com.baidu.android.pushservice.action.OPENDEBUGMODE";
	//    6   11:ldc1            #170 <String "com.baidu.android.pushservice.action.OPENDEBUGMODE">
	//    7   13:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (s2)))) goto _L2; else goto _L1
	//    8   14:aload           4
	//    9   16:invokestatic    #29  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   10   19:ifne            45
_L1:
		if(s1.equals(((Object) (s2))))
	//*  11   22:aload_3         
	//*  12   23:aload           4
	//*  13   25:invokevirtual   #148 <Method boolean String.equals(Object)>
	//*  14   28:ifeq            54
			return;
	//   15   31:return          
		  goto _L3
	//*  16   32:aload_0         
	//*  17   33:new             #172 <Class Intent>
	//*  18   36:dup             
	//*  19   37:aload_2         
	//*  20   38:invokespecial   #175 <Method void Intent(String)>
	//*  21   41:invokestatic    #180 <Method void t.a(Context, Intent)>
	//*  22   44:return          
_L2:
		return;
	//   23   45:return          
_L5:
		try
		{
			t.a(context, new Intent(s));
			return;
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  24   46:astore_0        
		{
			com.baidu.android.pushservice.e.a.a("PushSettings", ((Throwable) (context)));
	//   25   47:ldc1            #92  <String "PushSettings">
	//   26   49:aload_0         
	//   27   50:invokestatic    #183 <Method void a.a(String, Throwable)>
		}
		return;
	//   28   53:return          
_L3:
		if(!flag)
	//*  29   54:iload_1         
	//*  30   55:ifne            32
			s = "com.baidu.android.pushservice.action.CLOSEDEBUGMODE";
	//   31   58:ldc1            #185 <String "com.baidu.android.pushservice.action.CLOSEDEBUGMODE">
	//   32   60:astore_2        
		if(true) goto _L5; else goto _L4
	//   33   61:goto            32
_L4:
	}

	public static void c(Context context, String s)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
		{
			com.baidu.android.pushservice.e.a.d("PushSettings", "removeUninstalledAppLbsSwitch mContext == null");
	//    2    4:ldc1            #92  <String "PushSettings">
	//    3    6:ldc1            #187 <String "removeUninstalledAppLbsSwitch mContext == null">
	//    4    8:invokestatic    #99  <Method void a.d(String, String)>
			return;
	//    5   11:return          
		}
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   6   12:aload_1         
	//*   7   13:invokestatic    #29  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   16:ifne            140
		{
			String s1 = com.baidu.android.pushservice.h.m.a(context, "com.baidu.pushservice.le");
	//    9   19:aload_0         
	//   10   20:ldc1            #130 <String "com.baidu.pushservice.le">
	//   11   22:invokestatic    #32  <Method String m.a(Context, String)>
	//   12   25:astore          5
			if(!TextUtils.isEmpty(((CharSequence) (s1))))
	//*  13   27:aload           5
	//*  14   29:invokestatic    #29  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  15   32:ifne            140
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   16   35:new             #132 <Class StringBuilder>
	//   17   38:dup             
	//   18   39:invokespecial   #133 <Method void StringBuilder()>
	//   19   42:astore          4
				String as[] = s1.trim().split(",");
	//   20   44:aload           5
	//   21   46:invokevirtual   #138 <Method String String.trim()>
	//   22   49:ldc1            #140 <String ",">
	//   23   51:invokevirtual   #144 <Method String[] String.split(String)>
	//   24   54:astore          5
				int j1 = as.length;
	//   25   56:aload           5
	//   26   58:arraylength     
	//   27   59:istore_3        
				for(int i1 = 0; i1 < j1; i1++)
	//*  28   60:iconst_0        
	//*  29   61:istore_2        
	//*  30   62:iload_2         
	//*  31   63:iload_3         
	//*  32   64:icmpge          128
				{
					String s2 = as[i1];
	//   33   67:aload           5
	//   34   69:iload_2         
	//   35   70:aaload          
	//   36   71:astore          6
					if(!s2.equals(((Object) (s))))
	//*  37   73:aload           6
	//*  38   75:aload_1         
	//*  39   76:invokevirtual   #148 <Method boolean String.equals(Object)>
	//*  40   79:ifeq            85
	//*  41   82:goto            121
					{
						StringBuilder stringbuilder1 = new StringBuilder();
	//   42   85:new             #132 <Class StringBuilder>
	//   43   88:dup             
	//   44   89:invokespecial   #133 <Method void StringBuilder()>
	//   45   92:astore          7
						stringbuilder1.append(s2);
	//   46   94:aload           7
	//   47   96:aload           6
	//   48   98:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   49  101:pop             
						stringbuilder1.append(",");
	//   50  102:aload           7
	//   51  104:ldc1            #140 <String ",">
	//   52  106:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   53  109:pop             
						stringbuilder.append(stringbuilder1.toString());
	//   54  110:aload           4
	//   55  112:aload           7
	//   56  114:invokevirtual   #155 <Method String StringBuilder.toString()>
	//   57  117:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   58  120:pop             
					}
				}

	//   59  121:iload_2         
	//   60  122:iconst_1        
	//   61  123:iadd            
	//   62  124:istore_2        
	//*  63  125:goto            62
				com.baidu.android.pushservice.h.m.a(context, "com.baidu.pushservice.le", stringbuilder.toString());
	//   64  128:aload_0         
	//   65  129:ldc1            #130 <String "com.baidu.pushservice.le">
	//   66  131:aload           4
	//   67  133:invokevirtual   #155 <Method String StringBuilder.toString()>
	//   68  136:invokestatic    #118 <Method boolean m.a(Context, String, String)>
	//   69  139:pop             
			}
		}
	//   70  140:return          
	}

	public static boolean c(Context context)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(context == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       8
			return false;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		if(a == -1)
	//*   6    8:getstatic       #189 <Field int a>
	//*   7   11:iconst_m1       
	//*   8   12:icmpne          25
			a = com.baidu.android.pushservice.h.m.d(context, "com.baidu.android.pushservice.PushSettings.debug_mode", -1);
	//    9   15:aload_0         
	//   10   16:ldc1            #191 <String "com.baidu.android.pushservice.PushSettings.debug_mode">
	//   11   18:iconst_m1       
	//   12   19:invokestatic    #194 <Method int m.d(Context, String, int)>
	//   13   22:putstatic       #189 <Field int a>
		if(a == 1)
	//*  14   25:getstatic       #189 <Field int a>
	//*  15   28:iconst_1        
	//*  16   29:icmpne          34
			flag = true;
	//   17   32:iconst_1        
	//   18   33:istore_1        
		return flag;
	//   19   34:iload_1         
	//   20   35:ireturn         
	}

	public static long d(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       13
		{
			com.baidu.android.pushservice.e.a.e("PushSettings", "getLastSendStatisticTime mContext == null");
	//    2    4:ldc1            #92  <String "PushSettings">
	//    3    6:ldc1            #197 <String "getLastSendStatisticTime mContext == null">
	//    4    8:invokestatic    #200 <Method void a.e(String, String)>
			return 0L;
	//    5   11:lconst_0        
	//    6   12:lreturn         
		} else
		{
			return com.baidu.android.pushservice.h.m.c(context, "com.baidu.pushservice.cst");
	//    7   13:aload_0         
	//    8   14:ldc1            #109 <String "com.baidu.pushservice.cst">
	//    9   16:invokestatic    #203 <Method long m.c(Context, String)>
	//   10   19:lreturn         
		}
	}

	public static long e(Context context)
	{
		long l2 = com.baidu.android.pushservice.h.m.c(context, "com.baidu.pushservice.st");
	//    0    0:aload_0         
	//    1    1:ldc1            #163 <String "com.baidu.pushservice.st">
	//    2    3:invokestatic    #203 <Method long m.c(Context, String)>
	//    3    6:lstore_3        
		long l1 = l2;
	//    4    7:lload_3         
	//    5    8:lstore_1        
		if(l2 <= 0L)
	//*   6    9:lload_3         
	//*   7   10:lconst_0        
	//*   8   11:lcmp            
	//*   9   12:ifgt            19
			l1 = 0x2932e00L;
	//   10   15:ldc2w           #204 <Long 0x2932e00L>
	//   11   18:lstore_1        
		return l1;
	//   12   19:lload_1         
	//   13   20:lreturn         
	}

	public static void enableDebugMode(Context context, boolean flag)
	{
		int i1;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			i1 = 1;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:aload_0         
	//*   5    7:ldc1            #191 <String "com.baidu.android.pushservice.PushSettings.debug_mode">
	//*   6    9:iload_2         
	//*   7   10:invokestatic    #208 <Method void m.c(Context, String, int)>
	//*   8   13:goto            21
			i1 = 0;
	//    9   16:iconst_0        
	//   10   17:istore_2        
		com.baidu.android.pushservice.h.m.c(context, "com.baidu.android.pushservice.PushSettings.debug_mode", i1);
	//*  11   18:goto            6
		if(!ModeConfig.isProxyMode(context))
	//*  12   21:aload_0         
	//*  13   22:invokestatic    #213 <Method boolean ModeConfig.isProxyMode(Context)>
	//*  14   25:ifne            33
			b(context, flag);
	//   15   28:aload_0         
	//   16   29:iload_1         
	//   17   30:invokestatic    #215 <Method void b(Context, boolean)>
	//   18   33:return          
	}

	public static boolean f(Context context)
	{
		return com.baidu.android.pushservice.h.m.b(context, "com.baidu.pushservice.sd", 0) == 1;
	//    0    0:aload_0         
	//    1    1:ldc1            #101 <String "com.baidu.pushservice.sd">
	//    2    3:iconst_0        
	//    3    4:invokestatic    #218 <Method int m.b(Context, String, int)>
	//    4    7:iconst_1        
	//    5    8:icmpne          13
	//    6   11:iconst_1        
	//    7   12:ireturn         
	//    8   13:iconst_0        
	//    9   14:ireturn         
	}

	public static int g(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       13
		{
			com.baidu.android.pushservice.e.a.e("PushSettings", "getLbsSendInterval mContext == null");
	//    2    4:ldc1            #92  <String "PushSettings">
	//    3    6:ldc1            #222 <String "getLbsSendInterval mContext == null">
	//    4    8:invokestatic    #200 <Method void a.e(String, String)>
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		}
		int j1 = com.baidu.android.pushservice.h.m.b(context, "com.baidu.pushservice.lsi", -1);
	//    7   13:aload_0         
	//    8   14:ldc1            #161 <String "com.baidu.pushservice.lsi">
	//    9   16:iconst_m1       
	//   10   17:invokestatic    #218 <Method int m.b(Context, String, int)>
	//   11   20:istore_2        
		int i1 = j1;
	//   12   21:iload_2         
	//   13   22:istore_1        
		if(j1 < 0)
	//*  14   23:iload_2         
	//*  15   24:ifge            30
			i1 = 0x1b7740;
	//   16   27:ldc1            #223 <Int 0x1b7740>
	//   17   29:istore_1        
		return i1;
	//   18   30:iload_1         
	//   19   31:ireturn         
	}

	public static boolean h(Context context)
	{
		return !TextUtils.isEmpty(((CharSequence) (com.baidu.android.pushservice.h.m.a(context, "com.baidu.pushservice.le"))));
	//    0    0:aload_0         
	//    1    1:ldc1            #130 <String "com.baidu.pushservice.le">
	//    2    3:invokestatic    #32  <Method String m.a(Context, String)>
	//    3    6:invokestatic    #29  <Method boolean TextUtils.isEmpty(CharSequence)>
	//    4    9:ifne            14
	//    5   12:iconst_1        
	//    6   13:ireturn         
	//    7   14:iconst_0        
	//    8   15:ireturn         
	}

	public static boolean i(Context context)
	{
		return TextUtils.equals(((CharSequence) (com.baidu.android.pushservice.h.m.a(context, "com.baidu.pushservice.lms"))), "off");
	//    0    0:aload_0         
	//    1    1:ldc1            #227 <String "com.baidu.pushservice.lms">
	//    2    3:invokestatic    #32  <Method String m.a(Context, String)>
	//    3    6:ldc1            #229 <String "off">
	//    4    8:invokestatic    #232 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public static void j(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       11
			com.baidu.android.pushservice.e.a.d("PushSettings", "tofms mContext == null");
	//    2    4:ldc1            #92  <String "PushSettings">
	//    3    6:ldc1            #236 <String "tofms mContext == null">
	//    4    8:invokestatic    #99  <Method void a.d(String, String)>
		com.baidu.android.pushservice.h.m.a(context, "com.baidu.pushservice.lms", "off");
	//    5   11:aload_0         
	//    6   12:ldc1            #227 <String "com.baidu.pushservice.lms">
	//    7   14:ldc1            #229 <String "off">
	//    8   16:invokestatic    #118 <Method boolean m.a(Context, String, String)>
	//    9   19:pop             
	//   10   20:return          
	}

	public static void k(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       11
			com.baidu.android.pushservice.e.a.d("PushSettings", "toms mContext == null");
	//    2    4:ldc1            #92  <String "PushSettings">
	//    3    6:ldc1            #239 <String "toms mContext == null">
	//    4    8:invokestatic    #99  <Method void a.d(String, String)>
		com.baidu.android.pushservice.h.m.a(context, "com.baidu.pushservice.lms", "");
	//    5   11:aload_0         
	//    6   12:ldc1            #227 <String "com.baidu.pushservice.lms">
	//    7   14:ldc1            #241 <String "">
	//    8   16:invokestatic    #118 <Method boolean m.a(Context, String, String)>
	//    9   19:pop             
	//   10   20:return          
	}

	public static void l(Context context)
	{
		int i1;
		int j1;
		StringBuilder stringbuilder1;
		String as[];
		PackageManager packagemanager;
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
		{
			com.baidu.android.pushservice.e.a.d("PushSettings", "refreshLbsSwitchInfo mContext == null");
	//    2    4:ldc1            #92  <String "PushSettings">
	//    3    6:ldc1            #246 <String "refreshLbsSwitchInfo mContext == null">
	//    4    8:invokestatic    #99  <Method void a.d(String, String)>
			return;
	//    5   11:return          
		}
		String s = com.baidu.android.pushservice.h.m.a(context, "com.baidu.pushservice.le");
	//    6   12:aload_0         
	//    7   13:ldc1            #130 <String "com.baidu.pushservice.le">
	//    8   15:invokestatic    #32  <Method String m.a(Context, String)>
	//    9   18:astore_3        
		if(TextUtils.isEmpty(((CharSequence) (s))))
			break MISSING_BLOCK_LABEL_157;
	//   10   19:aload_3         
	//   11   20:invokestatic    #29  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   12   23:ifne            157
		stringbuilder1 = new StringBuilder();
	//   13   26:new             #132 <Class StringBuilder>
	//   14   29:dup             
	//   15   30:invokespecial   #133 <Method void StringBuilder()>
	//   16   33:astore          5
		as = s.trim().split(",");
	//   17   35:aload_3         
	//   18   36:invokevirtual   #138 <Method String String.trim()>
	//   19   39:ldc1            #140 <String ",">
	//   20   41:invokevirtual   #144 <Method String[] String.split(String)>
	//   21   44:astore          6
		packagemanager = context.getPackageManager();
	//   22   46:aload_0         
	//   23   47:invokevirtual   #250 <Method PackageManager Context.getPackageManager()>
	//   24   50:astore          7
		j1 = as.length;
	//   25   52:aload           6
	//   26   54:arraylength     
	//   27   55:istore_2        
		i1 = 0;
	//   28   56:iconst_0        
	//   29   57:istore_1        
_L3:
		if(i1 >= j1) goto _L2; else goto _L1
	//   30   58:iload_1         
	//   31   59:iload_2         
	//   32   60:icmpge          145
_L1:
		android.content.pm.PackageInfo packageinfo;
		String s1;
		s1 = as[i1];
	//   33   63:aload           6
	//   34   65:iload_1         
	//   35   66:aaload          
	//   36   67:astore          8
		packageinfo = null;
	//   37   69:aconst_null     
	//   38   70:astore_3        
		android.content.pm.PackageInfo packageinfo1 = packagemanager.getPackageInfo(s1, 0);
	//   39   71:aload           7
	//   40   73:aload           8
	//   41   75:iconst_0        
	//   42   76:invokevirtual   #256 <Method android.content.pm.PackageInfo PackageManager.getPackageInfo(String, int)>
	//   43   79:astore          4
		packageinfo = packageinfo1;
	//   44   81:aload           4
	//   45   83:astore_3        
		break MISSING_BLOCK_LABEL_99;
	//   46   84:goto            99
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
		namenotfoundexception;
	//   47   87:astore          4
		com.baidu.android.pushservice.e.a.d("PushSettings", com.baidu.android.pushservice.e.a.a(((Throwable) (namenotfoundexception))));
	//   48   89:ldc1            #92  <String "PushSettings">
	//   49   91:aload           4
	//   50   93:invokestatic    #259 <Method String a.a(Throwable)>
	//   51   96:invokestatic    #99  <Method void a.d(String, String)>
		if(packageinfo != null)
	//*  52   99:aload_3         
	//*  53  100:ifnonnull       106
	//*  54  103:goto            138
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   55  106:new             #132 <Class StringBuilder>
	//   56  109:dup             
	//   57  110:invokespecial   #133 <Method void StringBuilder()>
	//   58  113:astore_3        
			stringbuilder.append(s1);
	//   59  114:aload_3         
	//   60  115:aload           8
	//   61  117:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   62  120:pop             
			stringbuilder.append(",");
	//   63  121:aload_3         
	//   64  122:ldc1            #140 <String ",">
	//   65  124:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   66  127:pop             
			stringbuilder1.append(stringbuilder.toString());
	//   67  128:aload           5
	//   68  130:aload_3         
	//   69  131:invokevirtual   #155 <Method String StringBuilder.toString()>
	//   70  134:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   71  137:pop             
		}
		i1++;
	//   72  138:iload_1         
	//   73  139:iconst_1        
	//   74  140:iadd            
	//   75  141:istore_1        
		  goto _L3
	//*  76  142:goto            58
_L2:
		com.baidu.android.pushservice.h.m.a(context, "com.baidu.pushservice.le", stringbuilder1.toString());
	//   77  145:aload_0         
	//   78  146:ldc1            #130 <String "com.baidu.pushservice.le">
	//   79  148:aload           5
	//   80  150:invokevirtual   #155 <Method String StringBuilder.toString()>
	//   81  153:invokestatic    #118 <Method boolean m.a(Context, String, String)>
	//   82  156:pop             
	//   83  157:return          
	}

	public static boolean m(Context context)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(context == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       8
			return false;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		if(b == -1)
	//*   6    8:getstatic       #262 <Field int b>
	//*   7   11:iconst_m1       
	//*   8   12:icmpne          26
			b = com.baidu.android.pushservice.h.m.b(context, "com.baidu.android.pushservice.PushSettings.xm_proxy_mode", -1);
	//    9   15:aload_0         
	//   10   16:ldc2            #264 <String "com.baidu.android.pushservice.PushSettings.xm_proxy_mode">
	//   11   19:iconst_m1       
	//   12   20:invokestatic    #218 <Method int m.b(Context, String, int)>
	//   13   23:putstatic       #262 <Field int b>
		if(b == 1)
	//*  14   26:getstatic       #262 <Field int b>
	//*  15   29:iconst_1        
	//*  16   30:icmpne          35
			flag = true;
	//   17   33:iconst_1        
	//   18   34:istore_1        
		return flag;
	//   19   35:iload_1         
	//   20   36:ireturn         
	}

	public static boolean n(Context context)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(context == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       8
			return false;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		if(c == -1)
	//*   6    8:getstatic       #267 <Field int c>
	//*   7   11:iconst_m1       
	//*   8   12:icmpne          26
			c = com.baidu.android.pushservice.h.m.b(context, "com.baidu.android.pushservice.PushSettings.hw_proxy_mode", -1);
	//    9   15:aload_0         
	//   10   16:ldc2            #269 <String "com.baidu.android.pushservice.PushSettings.hw_proxy_mode">
	//   11   19:iconst_m1       
	//   12   20:invokestatic    #218 <Method int m.b(Context, String, int)>
	//   13   23:putstatic       #267 <Field int c>
		if(c == 1)
	//*  14   26:getstatic       #267 <Field int c>
	//*  15   29:iconst_1        
	//*  16   30:icmpne          35
			flag = true;
	//   17   33:iconst_1        
	//   18   34:istore_1        
		return flag;
	//   19   35:iload_1         
	//   20   36:ireturn         
	}

	private static int a = -1;
	private static int b = -1;
	private static int c = -1;

	static 
	{
	//    0    0:return          
	}
}
