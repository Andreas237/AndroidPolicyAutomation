// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Pair;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.metaData.h;
import com.startapp.common.Constants;
import com.startapp.common.a.c;
import com.startapp.common.a.g;
import com.startapp.common.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.startapp.android.publish.adsCommon:
//			k

public class l
{

	public static long a()
	{
		return g;
	//    0    0:getstatic       #51  <Field long g>
	//    1    3:lreturn         
	}

	private static List a(List list)
	{
		com.startapp.common.a.g.a("SimpleToken", 3, "getPackagesNames entered");
	//    0    0:ldc1            #54  <String "SimpleToken">
	//    1    2:iconst_3        
	//    2    3:ldc1            #56  <String "getPackagesNames entered">
	//    3    5:invokestatic    #61  <Method void g.a(String, int, String)>
		ArrayList arraylist = new ArrayList();
	//    4    8:new             #63  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #64  <Method void ArrayList()>
	//    7   15:astore_1        
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) (((PackageInfo)((Iterator) (list)).next()).packageName))));
	//    8   16:aload_0         
	//    9   17:invokeinterface #70  <Method Iterator List.iterator()>
	//   10   22:astore_0        
	//   11   23:aload_0         
	//   12   24:invokeinterface #76  <Method boolean Iterator.hasNext()>
	//   13   29:ifeq            54
	//   14   32:aload_1         
	//   15   33:aload_0         
	//   16   34:invokeinterface #80  <Method Object Iterator.next()>
	//   17   39:checkcast       #82  <Class PackageInfo>
	//   18   42:getfield        #85  <Field String PackageInfo.packageName>
	//   19   45:invokeinterface #89  <Method boolean List.add(Object)>
	//   20   50:pop             
	//*  21   51:goto            23
		return ((List) (arraylist));
	//   22   54:aload_1         
	//   23   55:areturn         
	}

	public static void a(Context context)
	{
		c(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #94  <Method void c(Context)>
		i = true;
	//    2    4:iconst_1        
	//    3    5:putstatic       #96  <Field boolean i>
		j = true;
	//    4    8:iconst_1        
	//    5    9:putstatic       #98  <Field boolean j>
		h = "token";
	//    6   12:ldc1            #45  <String "token">
	//    7   14:putstatic       #47  <Field String h>
		IntentFilter intentfilter = new IntentFilter();
	//    8   17:new             #100 <Class IntentFilter>
	//    9   20:dup             
	//   10   21:invokespecial   #101 <Method void IntentFilter()>
	//   11   24:astore_1        
		intentfilter.addAction("android.intent.action.PACKAGE_ADDED");
	//   12   25:aload_1         
	//   13   26:ldc1            #103 <String "android.intent.action.PACKAGE_ADDED">
	//   14   28:invokevirtual   #107 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("android.intent.action.PACKAGE_REMOVED");
	//   15   31:aload_1         
	//   16   32:ldc1            #109 <String "android.intent.action.PACKAGE_REMOVED">
	//   17   34:invokevirtual   #107 <Method void IntentFilter.addAction(String)>
		context.getApplicationContext().registerReceiver(((BroadcastReceiver) (new BroadcastReceiver() {

			public void onReceive(Context context1, Intent intent)
			{
				l.a(false);
			//    0    0:iconst_0        
			//    1    1:invokestatic    #19  <Method boolean l.a(boolean)>
			//    2    4:pop             
				com.startapp.android.publish.adsCommon.l.c(context1);
			//    3    5:aload_1         
			//    4    6:invokestatic    #22  <Method void com.startapp.android.publish.adsCommon.l.c(Context)>
			//    5    9:return          
			}

		}
)), intentfilter);
	//   18   37:aload_0         
	//   19   38:invokevirtual   #115 <Method Context Context.getApplicationContext()>
	//   20   41:new             #6   <Class l$1>
	//   21   44:dup             
	//   22   45:invokespecial   #116 <Method void l$1()>
	//   23   48:aload_1         
	//   24   49:invokevirtual   #120 <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   25   52:pop             
		MetaData.getInstance().addMetaDataListener(new com.startapp.android.publish.common.metaData.d(context) {

			public void a()
			{
				l.a(false);
			//    0    0:iconst_0        
			//    1    1:invokestatic    #22  <Method boolean l.a(boolean)>
			//    2    4:pop             
				com.startapp.android.publish.adsCommon.l.c(a);
			//    3    5:aload_0         
			//    4    6:getfield        #15  <Field Context a>
			//    5    9:invokestatic    #25  <Method void com.startapp.android.publish.adsCommon.l.c(Context)>
			//    6   12:return          
			}

			public void b()
			{
			//    0    0:return          
			}

			final Context a;

			
			{
				a = context;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field Context a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   26   53:invokestatic    #126 <Method MetaData MetaData.getInstance()>
	//   27   56:new             #8   <Class l$2>
	//   28   59:dup             
	//   29   60:aload_0         
	//   30   61:invokespecial   #128 <Method void l$2(Context)>
	//   31   64:invokevirtual   #132 <Method void MetaData.addMetaDataListener(com.startapp.android.publish.common.metaData.d)>
	//   32   67:return          
	}

	public static void a(Context context, boolean flag)
	{
		com.startapp.common.a.g.a("SimpleToken", 3, "initSimpleToken entered");
	//    0    0:ldc1            #54  <String "SimpleToken">
	//    1    2:iconst_3        
	//    2    3:ldc1            #138 <String "initSimpleToken entered">
	//    3    5:invokestatic    #61  <Method void g.a(String, int, String)>
		if(f || !flag)
			break MISSING_BLOCK_LABEL_132;
	//    4    8:getstatic       #43  <Field boolean f>
	//    5   11:ifne            132
	//    6   14:iload_1         
	//    7   15:ifeq            132
		f = true;
	//    8   18:iconst_1        
	//    9   19:putstatic       #43  <Field boolean f>
		i(context);
	//   10   22:aload_0         
	//   11   23:invokestatic    #140 <Method void i(Context)>
		b = new Pair("token", ((Object) (com.startapp.common.f.a(a(d)))));
	//   12   26:new             #142 <Class Pair>
	//   13   29:dup             
	//   14   30:ldc1            #45  <String "token">
	//   15   32:getstatic       #144 <Field List d>
	//   16   35:invokestatic    #146 <Method List a(List)>
	//   17   38:invokestatic    #151 <Method String f.a(List)>
	//   18   41:invokespecial   #154 <Method void Pair(Object, Object)>
	//   19   44:putstatic       #39  <Field Pair b>
		c = new Pair("token2", ((Object) (com.startapp.common.f.a(a(e)))));
	//   20   47:new             #142 <Class Pair>
	//   21   50:dup             
	//   22   51:ldc1            #156 <String "token2">
	//   23   53:getstatic       #158 <Field List e>
	//   24   56:invokestatic    #146 <Method List a(List)>
	//   25   59:invokestatic    #151 <Method String f.a(List)>
	//   26   62:invokespecial   #154 <Method void Pair(Object, Object)>
	//   27   65:putstatic       #41  <Field Pair c>
		com.startapp.common.a.g.a("SimpleToken", 3, (new StringBuilder()).append("simpleToken : [").append(((Object) (b))).append("]").toString());
	//   28   68:ldc1            #54  <String "SimpleToken">
	//   29   70:iconst_3        
	//   30   71:new             #160 <Class StringBuilder>
	//   31   74:dup             
	//   32   75:invokespecial   #161 <Method void StringBuilder()>
	//   33   78:ldc1            #163 <String "simpleToken : [">
	//   34   80:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   35   83:getstatic       #39  <Field Pair b>
	//   36   86:invokevirtual   #170 <Method StringBuilder StringBuilder.append(Object)>
	//   37   89:ldc1            #172 <String "]">
	//   38   91:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   39   94:invokevirtual   #176 <Method String StringBuilder.toString()>
	//   40   97:invokestatic    #61  <Method void g.a(String, int, String)>
		com.startapp.common.a.g.a("SimpleToken", 3, (new StringBuilder()).append("simpleToken2 : [").append(((Object) (c))).append("]").toString());
	//   41  100:ldc1            #54  <String "SimpleToken">
	//   42  102:iconst_3        
	//   43  103:new             #160 <Class StringBuilder>
	//   44  106:dup             
	//   45  107:invokespecial   #161 <Method void StringBuilder()>
	//   46  110:ldc1            #178 <String "simpleToken2 : [">
	//   47  112:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   48  115:getstatic       #41  <Field Pair c>
	//   49  118:invokevirtual   #170 <Method StringBuilder StringBuilder.append(Object)>
	//   50  121:ldc1            #172 <String "]">
	//   51  123:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   52  126:invokevirtual   #176 <Method String StringBuilder.toString()>
	//   53  129:invokestatic    #61  <Method void g.a(String, int, String)>
		return;
	//   54  132:return          
		Exception exception;
		exception;
	//   55  133:astore_2        
		com.startapp.common.a.g.a("SimpleToken", 6, "initSimpleToken failed", ((Throwable) (exception)));
	//   56  134:ldc1            #54  <String "SimpleToken">
	//   57  136:bipush          6
	//   58  138:ldc1            #180 <String "initSimpleToken failed">
	//   59  140:aload_2         
	//   60  141:invokestatic    #183 <Method void g.a(String, int, String, Throwable)>
		com.startapp.android.publish.adsCommon.e.f.a(context, d.b, "initSimpleToken", exception.getMessage(), "");
	//   61  144:aload_0         
	//   62  145:getstatic       #188 <Field d d.b>
	//   63  148:ldc1            #190 <String "initSimpleToken">
	//   64  150:aload_2         
	//   65  151:invokevirtual   #193 <Method String Exception.getMessage()>
	//   66  154:ldc1            #195 <String "">
	//   67  156:invokestatic    #200 <Method void com.startapp.android.publish.adsCommon.e.f.a(Context, d, String, String, String)>
		return;
	//   68  159:return          
	}

	private static void a(PackageInfo packageinfo, PackageManager packagemanager, Set set)
	{
		try
		{
			packagemanager = ((PackageManager) (packagemanager.getInstallerPackageName(packageinfo.packageName)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #85  <Field String PackageInfo.packageName>
	//    3    5:invokevirtual   #208 <Method String PackageManager.getInstallerPackageName(String)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_2         
	//*   6   10:ifnull          33
	//*   7   13:aload_2         
	//*   8   14:aload_1         
	//*   9   15:invokeinterface #213 <Method boolean Set.contains(Object)>
	//*  10   20:ifeq            33
	//*  11   23:getstatic       #158 <Field List e>
	//*  12   26:aload_0         
	//*  13   27:invokeinterface #89  <Method boolean List.add(Object)>
	//*  14   32:pop             
	//*  15   33:return          
		// Misplaced declaration of an exception variable
		catch(PackageInfo packageinfo)
	//*  16   34:astore_0        
		{
			com.startapp.common.a.g.a("SimpleToken", 6, (new StringBuilder()).append("addToPackagesFromInstallers - can't add app to list ").append(((Exception) (packageinfo)).getMessage()).toString());
	//   17   35:ldc1            #54  <String "SimpleToken">
	//   18   37:bipush          6
	//   19   39:new             #160 <Class StringBuilder>
	//   20   42:dup             
	//   21   43:invokespecial   #161 <Method void StringBuilder()>
	//   22   46:ldc1            #215 <String "addToPackagesFromInstallers - can't add app to list ">
	//   23   48:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   24   51:aload_0         
	//   25   52:invokevirtual   #193 <Method String Exception.getMessage()>
	//   26   55:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   27   58:invokevirtual   #176 <Method String StringBuilder.toString()>
	//   28   61:invokestatic    #61  <Method void g.a(String, int, String)>
			return;
	//   29   64:return          
		}
		if(set == null)
			break MISSING_BLOCK_LABEL_33;
		if(set.contains(((Object) (packagemanager))))
			e.add(((Object) (packageinfo)));
	}

	public static void a(Pair pair)
	{
		com.startapp.common.a.g.a("SimpleToken", 3, "errorSendingToken entered");
	//    0    0:ldc1            #54  <String "SimpleToken">
	//    1    2:iconst_3        
	//    2    3:ldc1            #219 <String "errorSendingToken entered">
	//    3    5:invokestatic    #61  <Method void g.a(String, int, String)>
		if(((String)pair.first).equals("token"))
	//*   4    8:aload_0         
	//*   5    9:getfield        #222 <Field Object Pair.first>
	//*   6   12:checkcast       #224 <Class String>
	//*   7   15:ldc1            #45  <String "token">
	//*   8   17:invokevirtual   #227 <Method boolean String.equals(Object)>
	//*   9   20:ifeq            33
		{
			h = "token";
	//   10   23:ldc1            #45  <String "token">
	//   11   25:putstatic       #47  <Field String h>
			i = true;
	//   12   28:iconst_1        
	//   13   29:putstatic       #96  <Field boolean i>
			return;
	//   14   32:return          
		} else
		{
			h = "token2";
	//   15   33:ldc1            #156 <String "token2">
	//   16   35:putstatic       #47  <Field String h>
			j = true;
	//   17   38:iconst_1        
	//   18   39:putstatic       #98  <Field boolean j>
			return;
	//   19   42:return          
		}
	}

	static boolean a(boolean flag)
	{
		f = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #43  <Field boolean f>
		return flag;
	//    2    4:iload_0         
	//    3    5:ireturn         
	}

	private static List b(List list)
	{
		if(list.size() <= 100)
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #233 <Method int List.size()>
	//*   2    6:bipush          100
	//*   3    8:icmpgt          13
		{
			return list;
	//    4   11:aload_0         
	//    5   12:areturn         
		} else
		{
			list = ((List) (new ArrayList(((java.util.Collection) (list)))));
	//    6   13:new             #63  <Class ArrayList>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokespecial   #236 <Method void ArrayList(java.util.Collection)>
	//   10   21:astore_0        
			c(list);
	//   11   22:aload_0         
	//   12   23:invokestatic    #239 <Method void c(List)>
			return list.subList(0, 100);
	//   13   26:aload_0         
	//   14   27:iconst_0        
	//   15   28:bipush          100
	//   16   30:invokeinterface #243 <Method List List.subList(int, int)>
	//   17   35:areturn         
		}
	}

	public static void b()
	{
		b = null;
	//    0    0:aconst_null     
	//    1    1:putstatic       #39  <Field Pair b>
		c = null;
	//    2    4:aconst_null     
	//    3    5:putstatic       #41  <Field Pair c>
		f = false;
	//    4    8:iconst_0        
	//    5    9:putstatic       #43  <Field boolean f>
	//    6   12:return          
	}

	public static void b(Context context)
	{
		a(context, MetaData.getInstance().getSimpleTokenConfig().b(context));
	//    0    0:aload_0         
	//    1    1:invokestatic    #126 <Method MetaData MetaData.getInstance()>
	//    2    4:invokevirtual   #248 <Method h MetaData.getSimpleTokenConfig()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #253 <Method boolean h.b(Context)>
	//    5   11:invokestatic    #255 <Method void a(Context, boolean)>
	//    6   14:return          
	}

	public static Pair c()
	{
		if(b != null)
	//*   0    0:getstatic       #39  <Field Pair b>
	//*   1    3:ifnull          10
			return b;
	//    2    6:getstatic       #39  <Field Pair b>
	//    3    9:areturn         
		else
			return new Pair("token", "");
	//    4   10:new             #142 <Class Pair>
	//    5   13:dup             
	//    6   14:ldc1            #45  <String "token">
	//    7   16:ldc1            #195 <String "">
	//    8   18:invokespecial   #154 <Method void Pair(Object, Object)>
	//    9   21:areturn         
	}

	public static void c(Context context)
	{
		com.startapp.common.a.g.a("SimpleToken", 3, "initSimpleTokenAsync entered");
	//    0    0:ldc1            #54  <String "SimpleToken">
	//    1    2:iconst_3        
	//    2    3:ldc2            #259 <String "initSimpleTokenAsync entered">
	//    3    6:invokestatic    #61  <Method void g.a(String, int, String)>
		try
		{
			if(!f && MetaData.getInstance().getSimpleTokenConfig().b(context))
	//*   4    9:getstatic       #43  <Field boolean f>
	//*   5   12:ifne            42
	//*   6   15:invokestatic    #126 <Method MetaData MetaData.getInstance()>
	//*   7   18:invokevirtual   #248 <Method h MetaData.getSimpleTokenConfig()>
	//*   8   21:aload_0         
	//*   9   22:invokevirtual   #253 <Method boolean h.b(Context)>
	//*  10   25:ifeq            42
				com.startapp.common.g.a(com.startapp.common.g.a.b, new Runnable(context) {

					public void run()
					{
						l.b(a);
					//    0    0:aload_0         
					//    1    1:getfield        #16  <Field Context a>
					//    2    4:invokestatic    #24  <Method void l.b(Context)>
					//    3    7:return          
					}

					final Context a;

			
			{
				a = context;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field Context a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
);
	//   11   28:getstatic       #264 <Field com.startapp.common.g$a com.startapp.common.g$a.b>
	//   12   31:new             #10  <Class l$3>
	//   13   34:dup             
	//   14   35:aload_0         
	//   15   36:invokespecial   #265 <Method void l$3(Context)>
	//   16   39:invokestatic    #270 <Method void com.startapp.common.g.a(com.startapp.common.g$a, Runnable)>
			return;
	//   17   42:return          
		}
		catch(Exception exception)
	//*  18   43:astore_1        
		{
			com.startapp.common.a.g.a("SimpleToken", 6, "initSimpleTokenAsync failed", ((Throwable) (exception)));
	//   19   44:ldc1            #54  <String "SimpleToken">
	//   20   46:bipush          6
	//   21   48:ldc2            #272 <String "initSimpleTokenAsync failed">
	//   22   51:aload_1         
	//   23   52:invokestatic    #183 <Method void g.a(String, int, String, Throwable)>
			com.startapp.android.publish.adsCommon.e.f.a(context, d.b, "initSimpleTokenAsync", exception.getMessage(), "");
	//   24   55:aload_0         
	//   25   56:getstatic       #188 <Field d d.b>
	//   26   59:ldc2            #274 <String "initSimpleTokenAsync">
	//   27   62:aload_1         
	//   28   63:invokevirtual   #193 <Method String Exception.getMessage()>
	//   29   66:ldc1            #195 <String "">
	//   30   68:invokestatic    #200 <Method void com.startapp.android.publish.adsCommon.e.f.a(Context, d, String, String, String)>
			return;
	//   31   71:return          
		}
	}

	private static void c(List list)
	{
		if(android.os.Build.VERSION.SDK_INT >= 9)
	//*   0    0:getstatic       #280 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          9
	//*   2    5:icmplt          19
			Collections.sort(list, new Comparator() {

				public int a(PackageInfo packageinfo, PackageInfo packageinfo1)
				{
					long l1 = packageinfo.firstInstallTime;
				//    0    0:aload_1         
				//    1    1:getfield        #28  <Field long PackageInfo.firstInstallTime>
				//    2    4:lstore_3        
					long l2 = packageinfo1.firstInstallTime;
				//    3    5:aload_2         
				//    4    6:getfield        #28  <Field long PackageInfo.firstInstallTime>
				//    5    9:lstore          5
					if(l1 > l2)
				//*   6   11:lload_3         
				//*   7   12:lload           5
				//*   8   14:lcmp            
				//*   9   15:ifle            20
						return -1;
				//   10   18:iconst_m1       
				//   11   19:ireturn         
					return l1 != l2 ? 1 : 0;
				//   12   20:lload_3         
				//   13   21:lload           5
				//   14   23:lcmp            
				//   15   24:ifne            29
				//   16   27:iconst_0        
				//   17   28:ireturn         
				//   18   29:iconst_1        
				//   19   30:ireturn         
				}

				public int compare(Object obj, Object obj1)
				{
					return a((PackageInfo)obj, (PackageInfo)obj1);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #24  <Class PackageInfo>
				//    3    5:aload_2         
				//    4    6:checkcast       #24  <Class PackageInfo>
				//    5    9:invokevirtual   #33  <Method int a(PackageInfo, PackageInfo)>
				//    6   12:ireturn         
				}

			}
);
	//    3    8:aload_0         
	//    4    9:new             #12  <Class l$4>
	//    5   12:dup             
	//    6   13:invokespecial   #281 <Method void l$4()>
	//    7   16:invokestatic    #287 <Method void Collections.sort(List, Comparator)>
	//    8   19:return          
	}

	public static Pair d()
	{
		if(c != null)
	//*   0    0:getstatic       #41  <Field Pair c>
	//*   1    3:ifnull          10
			return c;
	//    2    6:getstatic       #41  <Field Pair c>
	//    3    9:areturn         
		else
			return new Pair("token2", "");
	//    4   10:new             #142 <Class Pair>
	//    5   13:dup             
	//    6   14:ldc1            #156 <String "token2">
	//    7   16:ldc1            #195 <String "">
	//    8   18:invokespecial   #154 <Method void Pair(Object, Object)>
	//    9   21:areturn         
	}

	public static Pair d(Context context)
	{
		Pair pair;
		com.startapp.common.a.g.a("SimpleToken", 3, "getSimpleToken entered");
	//    0    0:ldc1            #54  <String "SimpleToken">
	//    1    2:iconst_3        
	//    2    3:ldc2            #291 <String "getSimpleToken entered">
	//    3    6:invokestatic    #61  <Method void g.a(String, int, String)>
		pair = new Pair("token", "");
	//    4    9:new             #142 <Class Pair>
	//    5   12:dup             
	//    6   13:ldc1            #45  <String "token">
	//    7   15:ldc1            #195 <String "">
	//    8   17:invokespecial   #154 <Method void Pair(Object, Object)>
	//    9   20:astore_3        
		boolean flag;
		boolean flag1;
		if(!com.startapp.android.publish.adsCommon.Utils.i.a() && MetaData.getInstance().getSimpleTokenConfig().a(context))
			break MISSING_BLOCK_LABEL_113;
	//   10   21:invokestatic    #295 <Method boolean i.a()>
	//   11   24:ifne            40
	//   12   27:invokestatic    #126 <Method MetaData MetaData.getInstance()>
	//   13   30:invokevirtual   #248 <Method h MetaData.getSimpleTokenConfig()>
	//   14   33:aload_0         
	//   15   34:invokevirtual   #297 <Method boolean h.a(Context)>
	//   16   37:ifne            113
		flag = g(context);
	//   17   40:aload_0         
	//   18   41:invokestatic    #299 <Method boolean g(Context)>
	//   19   44:istore_1        
		flag1 = h(context);
	//   20   45:aload_0         
	//   21   46:invokestatic    #301 <Method boolean h(Context)>
	//   22   49:istore_2        
		if(!flag && !flag1)
	//*  23   50:iload_1         
	//*  24   51:ifne            60
	//*  25   54:iload_2         
	//*  26   55:ifne            60
			return pair;
	//   27   58:aload_3         
	//   28   59:areturn         
		if(!h.equals("token"))
			break MISSING_BLOCK_LABEL_85;
	//   29   60:getstatic       #47  <Field String h>
	//   30   63:ldc1            #45  <String "token">
	//   31   65:invokevirtual   #227 <Method boolean String.equals(Object)>
	//   32   68:ifeq            85
		if(!flag)
			break MISSING_BLOCK_LABEL_80;
	//   33   71:iload_1         
	//   34   72:ifeq            80
		return e(context);
	//   35   75:aload_0         
	//   36   76:invokestatic    #303 <Method Pair e(Context)>
	//   37   79:areturn         
		return f(context);
	//   38   80:aload_0         
	//   39   81:invokestatic    #305 <Method Pair f(Context)>
	//   40   84:areturn         
		if(!flag1)
			break MISSING_BLOCK_LABEL_94;
	//   41   85:iload_2         
	//   42   86:ifeq            94
		return f(context);
	//   43   89:aload_0         
	//   44   90:invokestatic    #305 <Method Pair f(Context)>
	//   45   93:areturn         
		context = ((Context) (e(context)));
	//   46   94:aload_0         
	//   47   95:invokestatic    #303 <Method Pair e(Context)>
	//   48   98:astore_0        
		return ((Pair) (context));
	//   49   99:aload_0         
	//   50  100:areturn         
		context;
	//   51  101:astore_0        
		com.startapp.common.a.g.a("SimpleToken", 6, "failed to get simpleToken ", ((Throwable) (context)));
	//   52  102:ldc1            #54  <String "SimpleToken">
	//   53  104:bipush          6
	//   54  106:ldc2            #307 <String "failed to get simpleToken ">
	//   55  109:aload_0         
	//   56  110:invokestatic    #183 <Method void g.a(String, int, String, Throwable)>
		return pair;
	//   57  113:aload_3         
	//   58  114:areturn         
	}

	private static Pair e(Context context)
	{
		k.b(context, "shared_prefs_simple_token", (String)b.second);
	//    0    0:aload_0         
	//    1    1:ldc2            #310 <String "shared_prefs_simple_token">
	//    2    4:getstatic       #39  <Field Pair b>
	//    3    7:getfield        #313 <Field Object Pair.second>
	//    4   10:checkcast       #224 <Class String>
	//    5   13:invokestatic    #318 <Method void k.b(Context, String, String)>
		h = "token2";
	//    6   16:ldc1            #156 <String "token2">
	//    7   18:putstatic       #47  <Field String h>
		i = false;
	//    8   21:iconst_0        
	//    9   22:putstatic       #96  <Field boolean i>
		return new Pair("token", b.second);
	//   10   25:new             #142 <Class Pair>
	//   11   28:dup             
	//   12   29:ldc1            #45  <String "token">
	//   13   31:getstatic       #39  <Field Pair b>
	//   14   34:getfield        #313 <Field Object Pair.second>
	//   15   37:invokespecial   #154 <Method void Pair(Object, Object)>
	//   16   40:areturn         
	}

	private static Pair f(Context context)
	{
		k.b(context, "shared_prefs_simple_token2", (String)c.second);
	//    0    0:aload_0         
	//    1    1:ldc2            #320 <String "shared_prefs_simple_token2">
	//    2    4:getstatic       #41  <Field Pair c>
	//    3    7:getfield        #313 <Field Object Pair.second>
	//    4   10:checkcast       #224 <Class String>
	//    5   13:invokestatic    #318 <Method void k.b(Context, String, String)>
		h = "token";
	//    6   16:ldc1            #45  <String "token">
	//    7   18:putstatic       #47  <Field String h>
		j = false;
	//    8   21:iconst_0        
	//    9   22:putstatic       #98  <Field boolean j>
		return new Pair("token2", c.second);
	//   10   25:new             #142 <Class Pair>
	//   11   28:dup             
	//   12   29:ldc1            #156 <String "token2">
	//   13   31:getstatic       #41  <Field Pair c>
	//   14   34:getfield        #313 <Field Object Pair.second>
	//   15   37:invokespecial   #154 <Method void Pair(Object, Object)>
	//   16   40:areturn         
	}

	private static boolean g(Context context)
	{
		if(com.startapp.android.publish.adsCommon.Utils.i.a() || MetaData.getInstance().getSimpleTokenConfig().b(context))
	//*   0    0:invokestatic    #295 <Method boolean i.a()>
	//*   1    3:ifne            19
	//*   2    6:invokestatic    #126 <Method MetaData MetaData.getInstance()>
	//*   3    9:invokevirtual   #248 <Method h MetaData.getSimpleTokenConfig()>
	//*   4   12:aload_0         
	//*   5   13:invokevirtual   #253 <Method boolean h.b(Context)>
	//*   6   16:ifeq            65
		{
			while(MetaData.getInstance().isAlwaysSendToken() || i || !(new Pair("token", ((Object) (k.a(context, "shared_prefs_simple_token", ""))))).equals(((Object) (b)))) 
	//*   7   19:invokestatic    #126 <Method MetaData MetaData.getInstance()>
	//*   8   22:invokevirtual   #323 <Method boolean MetaData.isAlwaysSendToken()>
	//*   9   25:ifne            34
	//*  10   28:getstatic       #96  <Field boolean i>
	//*  11   31:ifeq            36
				return true;
	//   12   34:iconst_1        
	//   13   35:ireturn         
	//   14   36:new             #142 <Class Pair>
	//   15   39:dup             
	//   16   40:ldc1            #45  <String "token">
	//   17   42:aload_0         
	//   18   43:ldc2            #310 <String "shared_prefs_simple_token">
	//   19   46:ldc1            #195 <String "">
	//   20   48:invokestatic    #326 <Method String k.a(Context, String, String)>
	//   21   51:invokespecial   #154 <Method void Pair(Object, Object)>
	//   22   54:getstatic       #39  <Field Pair b>
	//   23   57:invokevirtual   #327 <Method boolean Pair.equals(Object)>
	//   24   60:ifeq            34
			return false;
	//   25   63:iconst_0        
	//   26   64:ireturn         
		} else
		{
			return false;
	//   27   65:iconst_0        
	//   28   66:ireturn         
		}
	}

	private static boolean h(Context context)
	{
		if(MetaData.getInstance().isSimpleToken2())
	//*   0    0:invokestatic    #126 <Method MetaData MetaData.getInstance()>
	//*   1    3:invokevirtual   #330 <Method boolean MetaData.isSimpleToken2()>
	//*   2    6:ifeq            55
		{
			while(MetaData.getInstance().isAlwaysSendToken() || j || !(new Pair("token2", ((Object) (k.a(context, "shared_prefs_simple_token2", ""))))).equals(((Object) (c)))) 
	//*   3    9:invokestatic    #126 <Method MetaData MetaData.getInstance()>
	//*   4   12:invokevirtual   #323 <Method boolean MetaData.isAlwaysSendToken()>
	//*   5   15:ifne            24
	//*   6   18:getstatic       #98  <Field boolean j>
	//*   7   21:ifeq            26
				return true;
	//    8   24:iconst_1        
	//    9   25:ireturn         
	//   10   26:new             #142 <Class Pair>
	//   11   29:dup             
	//   12   30:ldc1            #156 <String "token2">
	//   13   32:aload_0         
	//   14   33:ldc2            #320 <String "shared_prefs_simple_token2">
	//   15   36:ldc1            #195 <String "">
	//   16   38:invokestatic    #326 <Method String k.a(Context, String, String)>
	//   17   41:invokespecial   #154 <Method void Pair(Object, Object)>
	//   18   44:getstatic       #41  <Field Pair c>
	//   19   47:invokevirtual   #327 <Method boolean Pair.equals(Object)>
	//   20   50:ifeq            24
			return false;
	//   21   53:iconst_0        
	//   22   54:ireturn         
		} else
		{
			return false;
	//   23   55:iconst_0        
	//   24   56:ireturn         
		}
	}

	private static void i(Context context)
	{
		com.startapp.common.a.g.a("SimpleToken", 3, "getPackages entered");
	//    0    0:ldc1            #54  <String "SimpleToken">
	//    1    2:iconst_3        
	//    2    3:ldc2            #332 <String "getPackages entered">
	//    3    6:invokestatic    #61  <Method void g.a(String, int, String)>
		Object obj1 = a;
	//    4    9:getstatic       #37  <Field Object a>
	//    5   12:astore          5
		obj1;
	//    6   14:aload           5
		JVM INSTR monitorenter ;
	//    7   16:monitorenter    
		PackageManager packagemanager;
		Set set;
		Set set1;
		packagemanager = context.getPackageManager();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #336 <Method PackageManager Context.getPackageManager()>
	//   10   21:astore          6
		set = MetaData.getInstance().getInstallersList();
	//   11   23:invokestatic    #126 <Method MetaData MetaData.getInstance()>
	//   12   26:invokevirtual   #340 <Method Set MetaData.getInstallersList()>
	//   13   29:astore          7
		set1 = MetaData.getInstance().getPreInstalledPackages();
	//   14   31:invokestatic    #126 <Method MetaData MetaData.getInstance()>
	//   15   34:invokevirtual   #343 <Method Set MetaData.getPreInstalledPackages()>
	//   16   37:astore          8
		d = ((List) (new CopyOnWriteArrayList()));
	//   17   39:new             #345 <Class CopyOnWriteArrayList>
	//   18   42:dup             
	//   19   43:invokespecial   #346 <Method void CopyOnWriteArrayList()>
	//   20   46:putstatic       #144 <Field List d>
		e = ((List) (new CopyOnWriteArrayList()));
	//   21   49:new             #345 <Class CopyOnWriteArrayList>
	//   22   52:dup             
	//   23   53:invokespecial   #346 <Method void CopyOnWriteArrayList()>
	//   24   56:putstatic       #158 <Field List e>
		Object obj = ((Object) (com.startapp.common.a.c.a(packagemanager)));
	//   25   59:aload           6
	//   26   61:invokestatic    #351 <Method List c.a(PackageManager)>
	//   27   64:astore_3        
		long l1;
		PackageInfo packageinfo;
		Iterator iterator;
		if(android.os.Build.VERSION.SDK_INT >= 9)
	//*  28   65:getstatic       #280 <Field int android.os.Build$VERSION.SDK_INT>
	//*  29   68:bipush          9
	//*  30   70:icmplt          290
			l1 = 0xffffffffL;
	//   31   73:ldc2w           #352 <Long 0xffffffffL>
	//   32   76:lstore_1        
		else
	//*  33   77:lload_1         
	//*  34   78:putstatic       #51  <Field long g>
	//*  35   81:aconst_null     
	//*  36   82:astore_0        
	//*  37   83:aload_3         
	//*  38   84:invokeinterface #70  <Method Iterator List.iterator()>
	//*  39   89:astore          9
	//*  40   91:aload           9
	//*  41   93:invokeinterface #76  <Method boolean Iterator.hasNext()>
	//*  42   98:ifeq            243
	//*  43  101:aload           9
	//*  44  103:invokeinterface #80  <Method Object Iterator.next()>
	//*  45  108:checkcast       #82  <Class PackageInfo>
	//*  46  111:astore          4
	//*  47  113:getstatic       #280 <Field int android.os.Build$VERSION.SDK_INT>
	//*  48  116:bipush          9
	//*  49  118:icmplt          141
	//*  50  121:getstatic       #51  <Field long g>
	//*  51  124:aload           4
	//*  52  126:getfield        #356 <Field long PackageInfo.firstInstallTime>
	//*  53  129:lcmp            
	//*  54  130:ifle            141
	//*  55  133:aload           4
	//*  56  135:getfield        #356 <Field long PackageInfo.firstInstallTime>
	//*  57  138:putstatic       #51  <Field long g>
	//*  58  141:aload           4
	//*  59  143:invokestatic    #359 <Method boolean c.a(PackageInfo)>
	//*  60  146:ifne            190
	//*  61  149:getstatic       #144 <Field List d>
	//*  62  152:aload           4
	//*  63  154:invokeinterface #89  <Method boolean List.add(Object)>
	//*  64  159:pop             
	//*  65  160:aload           4
	//*  66  162:aload           6
	//*  67  164:aload           7
	//*  68  166:invokestatic    #361 <Method void a(PackageInfo, PackageManager, Set)>
	//*  69  169:aload_0         
	//*  70  170:astore_3        
	//*  71  171:goto            285
	//*  72  174:astore_0        
	//*  73  175:ldc1            #54  <String "SimpleToken">
	//*  74  177:bipush          6
	//*  75  179:ldc2            #363 <String "Could not complete getInstalledPackages">
	//*  76  182:aload_0         
	//*  77  183:invokestatic    #183 <Method void g.a(String, int, String, Throwable)>
	//*  78  186:aload           5
	//*  79  188:monitorexit     
	//*  80  189:return          
	//*  81  190:aload           8
	//*  82  192:aload           4
	//*  83  194:getfield        #85  <Field String PackageInfo.packageName>
	//*  84  197:invokeinterface #213 <Method boolean Set.contains(Object)>
	//*  85  202:ifeq            221
	//*  86  205:getstatic       #144 <Field List d>
	//*  87  208:aload           4
	//*  88  210:invokeinterface #89  <Method boolean List.add(Object)>
	//*  89  215:pop             
	//*  90  216:aload_0         
	//*  91  217:astore_3        
	//*  92  218:goto            285
	//*  93  221:aload           4
	//*  94  223:astore_3        
	//*  95  224:aload           4
	//*  96  226:getfield        #85  <Field String PackageInfo.packageName>
	//*  97  229:getstatic       #367 <Field String Constants.a>
	//*  98  232:invokevirtual   #227 <Method boolean String.equals(Object)>
	//*  99  235:ifne            285
	//* 100  238:aload_0         
	//* 101  239:astore_3        
	//* 102  240:goto            285
	//* 103  243:getstatic       #144 <Field List d>
	//* 104  246:invokestatic    #369 <Method List b(List)>
	//* 105  249:putstatic       #144 <Field List d>
	//* 106  252:getstatic       #158 <Field List e>
	//* 107  255:invokestatic    #369 <Method List b(List)>
	//* 108  258:putstatic       #158 <Field List e>
	//* 109  261:aload_0         
	//* 110  262:ifnull          275
	//* 111  265:getstatic       #144 <Field List d>
	//* 112  268:iconst_0        
	//* 113  269:aload_0         
	//* 114  270:invokeinterface #372 <Method void List.add(int, Object)>
	//* 115  275:aload           5
	//* 116  277:monitorexit     
	//* 117  278:return          
	//* 118  279:astore_0        
	//* 119  280:aload           5
	//* 120  282:monitorexit     
	//* 121  283:aload_0         
	//* 122  284:athrow          
	//* 123  285:aload_3         
	//* 124  286:astore_0        
	//* 125  287:goto            91
			l1 = 0L;
	//  126  290:lconst_0        
	//  127  291:lstore_1        
		g = l1;
		context = null;
		iterator = ((List) (obj)).iterator();
_L5:
		if(!iterator.hasNext()) goto _L2; else goto _L1
_L1:
		packageinfo = (PackageInfo)iterator.next();
		if(android.os.Build.VERSION.SDK_INT >= 9 && g > packageinfo.firstInstallTime)
			g = packageinfo.firstInstallTime;
		if(com.startapp.common.a.c.a(packageinfo)) goto _L4; else goto _L3
_L3:
		d.add(((Object) (packageinfo)));
		a(packageinfo, packagemanager, set);
		obj = ((Object) (context));
		break MISSING_BLOCK_LABEL_285;
		context;
		com.startapp.common.a.g.a("SimpleToken", 6, "Could not complete getInstalledPackages", ((Throwable) (context)));
		obj1;
		JVM INSTR monitorexit ;
		return;
_L4:
		if(!set1.contains(((Object) (packageinfo.packageName))))
			break MISSING_BLOCK_LABEL_221;
		d.add(((Object) (packageinfo)));
		obj = ((Object) (context));
		break MISSING_BLOCK_LABEL_285;
		obj = ((Object) (packageinfo));
		if(!packageinfo.packageName.equals(((Object) (Constants.a))))
			obj = ((Object) (context));
		break MISSING_BLOCK_LABEL_285;
_L2:
		d = b(d);
		e = b(e);
		if(context == null)
			break MISSING_BLOCK_LABEL_275;
		d.add(0, ((Object) (context)));
		obj1;
		JVM INSTR monitorexit ;
		return;
		context;
		obj1;
		JVM INSTR monitorexit ;
		throw context;
		context = ((Context) (obj));
		  goto _L5
	//* 128  292:goto            77
	}

	private static final Object a = new Object();
	private static Pair b = null;
	private static Pair c = null;
	private static List d;
	private static List e;
	private static boolean f = false;
	private static long g;
	private static String h = "token";
	private static boolean i;
	private static boolean j;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void Object()>
	//    3    7:putstatic       #37  <Field Object a>
	//    4   10:aconst_null     
	//    5   11:putstatic       #39  <Field Pair b>
	//    6   14:aconst_null     
	//    7   15:putstatic       #41  <Field Pair c>
	//    8   18:iconst_0        
	//    9   19:putstatic       #43  <Field boolean f>
	//   10   22:ldc1            #45  <String "token">
	//   11   24:putstatic       #47  <Field String h>
	//*  12   27:return          
	}
}
