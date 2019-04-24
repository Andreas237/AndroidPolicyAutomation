// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;

import android.content.*;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.irobot.home.IRobotApplication;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;

// Referenced classes of package com.irobot.home.util:
//			o, j

public final class ConnectivityStateReceiver extends BroadcastReceiver
{
	public static interface a
	{

		public abstract void b(boolean flag);
	}

	private static class b
	{

		static ConnectivityStateReceiver a()
		{
			return a;
		//    0    0:getstatic       #25  <Field ConnectivityStateReceiver a>
		//    1    3:areturn         
		}

		private static ConnectivityStateReceiver a = new ConnectivityStateReceiver((IRobotApplication)j.g());

		static 
		{
		//    0    0:new             #6   <Class ConnectivityStateReceiver>
		//    1    3:dup             
		//    2    4:invokestatic    #17  <Method android.app.Application j.g()>
		//    3    7:checkcast       #19  <Class IRobotApplication>
		//    4   10:aconst_null     
		//    5   11:invokespecial   #23  <Method void ConnectivityStateReceiver(IRobotApplication, ConnectivityStateReceiver$1)>
		//    6   14:putstatic       #25  <Field ConnectivityStateReceiver a>
		//*   7   17:return          
		}
	}


	private ConnectivityStateReceiver(IRobotApplication irobotapplication)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void BroadcastReceiver()>
		b = a;
	//    2    4:aload_0         
	//    3    5:getstatic       #26  <Field int a>
	//    4    8:putfield        #28  <Field int b>
		c = new ConcurrentSkipListSet(new Comparator() {

			public int compare(Object obj, Object obj1)
			{
				return ((int) (obj.equals(obj1) ^ true));
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokevirtual   #24  <Method boolean Object.equals(Object)>
			//    3    5:iconst_1        
			//    4    6:ixor            
			//    5    7:ireturn         
			}

			final ConnectivityStateReceiver a;

			
			{
				a = ConnectivityStateReceiver.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ConnectivityStateReceiver a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    5   11:aload_0         
	//    6   12:new             #30  <Class ConcurrentSkipListSet>
	//    7   15:dup             
	//    8   16:new             #6   <Class ConnectivityStateReceiver$1>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #33  <Method void ConnectivityStateReceiver$1(ConnectivityStateReceiver)>
	//   12   24:invokespecial   #36  <Method void ConcurrentSkipListSet(Comparator)>
	//   13   27:putfield        #38  <Field ConcurrentSkipListSet c>
		if(irobotapplication == null)
	//*  14   30:aload_1         
	//*  15   31:ifnonnull       42
		{
			o.e("ConnectivityState", "Unable to register network state changed intents, null app context");
	//   16   34:ldc1            #40  <String "ConnectivityState">
	//   17   36:ldc1            #42  <String "Unable to register network state changed intents, null app context">
	//   18   38:invokestatic    #48  <Method void o.e(String, String)>
			return;
	//   19   41:return          
		} else
		{
			IntentFilter intentfilter = new IntentFilter();
	//   20   42:new             #50  <Class IntentFilter>
	//   21   45:dup             
	//   22   46:invokespecial   #51  <Method void IntentFilter()>
	//   23   49:astore_2        
			intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
	//   24   50:aload_2         
	//   25   51:ldc1            #53  <String "android.net.conn.CONNECTIVITY_CHANGE">
	//   26   53:invokevirtual   #57  <Method void IntentFilter.addAction(String)>
			irobotapplication.registerReceiver(((BroadcastReceiver) (this)), intentfilter, ((String) (null)), ((android.os.Handler) (null)));
	//   27   56:aload_1         
	//   28   57:aload_0         
	//   29   58:aload_2         
	//   30   59:aconst_null     
	//   31   60:aconst_null     
	//   32   61:invokevirtual   #63  <Method Intent IRobotApplication.registerReceiver(BroadcastReceiver, IntentFilter, String, android.os.Handler)>
	//   33   64:pop             
			return;
	//   34   65:return          
		}
	}


	public static ConnectivityStateReceiver a()
	{
		return b.a();
	//    0    0:invokestatic    #69  <Method ConnectivityStateReceiver ConnectivityStateReceiver$b.a()>
	//    1    3:areturn         
	}

	public boolean a(a a1)
	{
		if(a1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
			return c.add(((Object) (a1)));
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field ConcurrentSkipListSet c>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #74  <Method boolean ConcurrentSkipListSet.add(Object)>
	//    6   12:ireturn         
		else
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public boolean b(a a1)
	{
label0:
		{
			if(a1 == null || !c.contains(((Object) (a1))))
				break label0;
	//    0    0:aload_1         
	//    1    1:ifnull          56
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field ConcurrentSkipListSet c>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #77  <Method boolean ConcurrentSkipListSet.contains(Object)>
	//    6   12:ifeq            56
			Iterator iterator = c.iterator();
	//    7   15:aload_0         
	//    8   16:getfield        #38  <Field ConcurrentSkipListSet c>
	//    9   19:invokevirtual   #81  <Method Iterator ConcurrentSkipListSet.iterator()>
	//   10   22:astore_2        
			do
				if(!iterator.hasNext())
					break label0;
	//   11   23:aload_2         
	//   12   24:invokeinterface #87  <Method boolean Iterator.hasNext()>
	//   13   29:ifeq            56
			while(!((Object) ((a)iterator.next())).equals(((Object) (a1))));
	//   14   32:aload_2         
	//   15   33:invokeinterface #91  <Method Object Iterator.next()>
	//   16   38:checkcast       #8   <Class ConnectivityStateReceiver$a>
	//   17   41:aload_1         
	//   18   42:invokevirtual   #96  <Method boolean Object.equals(Object)>
	//   19   45:ifeq            23
			iterator.remove();
	//   20   48:aload_2         
	//   21   49:invokeinterface #99  <Method void Iterator.remove()>
			return true;
	//   22   54:iconst_1        
	//   23   55:ireturn         
		}
		return false;
	//   24   56:iconst_0        
	//   25   57:ireturn         
	}

	public void onReceive(Context context, Intent intent)
	{
label0:
		{
			boolean flag;
label1:
			{
				if(!intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE"))
					break label0;
	//    0    0:aload_2         
	//    1    1:invokevirtual   #107 <Method String Intent.getAction()>
	//    2    4:ldc1            #53  <String "android.net.conn.CONNECTIVITY_CHANGE">
	//    3    6:invokevirtual   #110 <Method boolean String.equals(Object)>
	//    4    9:ifeq            219
				context = ((Context) (((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo()));
	//    5   12:aload_1         
	//    6   13:ldc1            #112 <String "connectivity">
	//    7   15:invokevirtual   #118 <Method Object Context.getSystemService(String)>
	//    8   18:checkcast       #120 <Class ConnectivityManager>
	//    9   21:invokevirtual   #124 <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//   10   24:astore_1        
				boolean flag1 = true;
	//   11   25:iconst_1        
	//   12   26:istore          4
				if(context != null)
	//*  13   28:aload_1         
	//*  14   29:ifnull          53
				{
					flag = flag1;
	//   15   32:iload           4
	//   16   34:istore_3        
					if(((NetworkInfo) (context)).getType() == 1)
						break label1;
	//   17   35:aload_1         
	//   18   36:invokevirtual   #130 <Method int NetworkInfo.getType()>
	//   19   39:iconst_1        
	//   20   40:icmpeq          55
					flag = flag1;
	//   21   43:iload           4
	//   22   45:istore_3        
					if(((NetworkInfo) (context)).getType() == 0)
						break label1;
	//   23   46:aload_1         
	//   24   47:invokevirtual   #130 <Method int NetworkInfo.getType()>
	//   25   50:ifeq            55
				}
				flag = false;
	//   26   53:iconst_0        
	//   27   54:istore_3        
			}
			if(android.os.Build.VERSION.SDK_INT <= 22 && context != null && flag)
	//*  28   55:getstatic       #135 <Field int android.os.Build$VERSION.SDK_INT>
	//*  29   58:bipush          22
	//*  30   60:icmpgt          159
	//*  31   63:aload_1         
	//*  32   64:ifnull          159
	//*  33   67:iload_3         
	//*  34   68:ifeq            159
			{
				if(b == a)
	//*  35   71:aload_0         
	//*  36   72:getfield        #28  <Field int b>
	//*  37   75:getstatic       #26  <Field int a>
	//*  38   78:icmpne          89
					b = ((NetworkInfo) (context)).getType();
	//   39   81:aload_0         
	//   40   82:aload_1         
	//   41   83:invokevirtual   #130 <Method int NetworkInfo.getType()>
	//   42   86:putfield        #28  <Field int b>
				if(b != ((NetworkInfo) (context)).getType())
	//*  43   89:aload_0         
	//*  44   90:getfield        #28  <Field int b>
	//*  45   93:aload_1         
	//*  46   94:invokevirtual   #130 <Method int NetworkInfo.getType()>
	//*  47   97:icmpeq          159
				{
					o.b("ConnectivityState", " Simulating a Disconnected state");
	//   48  100:ldc1            #40  <String "ConnectivityState">
	//   49  102:ldc1            #137 <String " Simulating a Disconnected state">
	//   50  104:invokestatic    #139 <Method void o.b(String, String)>
					intent = ((Intent) (c.iterator()));
	//   51  107:aload_0         
	//   52  108:getfield        #38  <Field ConcurrentSkipListSet c>
	//   53  111:invokevirtual   #81  <Method Iterator ConcurrentSkipListSet.iterator()>
	//   54  114:astore_2        
					do
					{
						if(!((Iterator) (intent)).hasNext())
							break;
	//   55  115:aload_2         
	//   56  116:invokeinterface #87  <Method boolean Iterator.hasNext()>
	//   57  121:ifeq            151
						a a1 = (a)((Iterator) (intent)).next();
	//   58  124:aload_2         
	//   59  125:invokeinterface #91  <Method Object Iterator.next()>
	//   60  130:checkcast       #8   <Class ConnectivityStateReceiver$a>
	//   61  133:astore          5
						if(a1 != null)
	//*  62  135:aload           5
	//*  63  137:ifnull          115
							a1.b(false);
	//   64  140:aload           5
	//   65  142:iconst_0        
	//   66  143:invokeinterface #142 <Method void ConnectivityStateReceiver$a.b(boolean)>
					} while(true);
	//   67  148:goto            115
					b = ((NetworkInfo) (context)).getType();
	//   68  151:aload_0         
	//   69  152:aload_1         
	//   70  153:invokevirtual   #130 <Method int NetworkInfo.getType()>
	//   71  156:putfield        #28  <Field int b>
				}
			}
			if(flag)
	//*  72  159:iload_3         
	//*  73  160:ifeq            169
				context = " Connected";
	//   74  163:ldc1            #144 <String " Connected">
	//   75  165:astore_1        
			else
	//*  76  166:goto            172
				context = " Disconnected";
	//   77  169:ldc1            #146 <String " Disconnected">
	//   78  171:astore_1        
			o.b("ConnectivityState", ((String) (context)));
	//   79  172:ldc1            #40  <String "ConnectivityState">
	//   80  174:aload_1         
	//   81  175:invokestatic    #139 <Method void o.b(String, String)>
			context = ((Context) (c.iterator()));
	//   82  178:aload_0         
	//   83  179:getfield        #38  <Field ConcurrentSkipListSet c>
	//   84  182:invokevirtual   #81  <Method Iterator ConcurrentSkipListSet.iterator()>
	//   85  185:astore_1        
			do
			{
				if(!((Iterator) (context)).hasNext())
					break;
	//   86  186:aload_1         
	//   87  187:invokeinterface #87  <Method boolean Iterator.hasNext()>
	//   88  192:ifeq            219
				intent = ((Intent) ((a)((Iterator) (context)).next()));
	//   89  195:aload_1         
	//   90  196:invokeinterface #91  <Method Object Iterator.next()>
	//   91  201:checkcast       #8   <Class ConnectivityStateReceiver$a>
	//   92  204:astore_2        
				if(intent != null)
	//*  93  205:aload_2         
	//*  94  206:ifnull          186
					((a) (intent)).b(flag);
	//   95  209:aload_2         
	//   96  210:iload_3         
	//   97  211:invokeinterface #142 <Method void ConnectivityStateReceiver$a.b(boolean)>
			} while(true);
	//   98  216:goto            186
		}
	//   99  219:return          
	}

	private static int a = -1;
	private int b;
	private final ConcurrentSkipListSet c;

	static 
	{
	//    0    0:return          
	}
}
