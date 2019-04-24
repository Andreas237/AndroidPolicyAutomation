// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;

import android.content.*;
import android.os.Bundle;
import com.mixpanel.android.a.f;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.irobot.home.util:
//			j

class j$2$1
	implements android.content.Interface.OnDismissListener
{

	public void onDismiss(DialogInterface dialoginterface)
	{
		j.a(a.a);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field j$2 a>
	//    2    4:getfield        #25  <Field android.app.Activity j$2.a>
	//    3    7:invokestatic    #30  <Method void j.a(android.app.Activity)>
	//    4   10:return          
	}

	final j._cls2 a;

	j$2$1(j._cls2 _pcls2)
	{
		a = _pcls2;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field j$2 a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/mixpanel/android/mpmetrics/j$2

/* anonymous class */
	static final class j._cls2 extends BroadcastReceiver
	{

		public void onReceive(Context context, Intent intent)
		{
			context = ((Context) (new JSONObject()));
		//    0    0:new             #24  <Class JSONObject>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void JSONObject()>
		//    3    7:astore_1        
			Object obj = ((Object) (intent.getBundleExtra("event_args")));
		//    4    8:aload_2         
		//    5    9:ldc1            #27  <String "event_args">
		//    6   11:invokevirtual   #33  <Method Bundle Intent.getBundleExtra(String)>
		//    7   14:astore_3        
			if(obj != null)
		//*   8   15:aload_3         
		//*   9   16:ifnull          118
			{
				for(Iterator iterator = ((Bundle) (obj)).keySet().iterator(); iterator.hasNext();)
		//*  10   19:aload_3         
		//*  11   20:invokevirtual   #39  <Method Set Bundle.keySet()>
		//*  12   23:invokeinterface #45  <Method Iterator Set.iterator()>
		//*  13   28:astore          4
		//*  14   30:aload           4
		//*  15   32:invokeinterface #51  <Method boolean Iterator.hasNext()>
		//*  16   37:ifeq            118
				{
					String s = (String)iterator.next();
		//   17   40:aload           4
		//   18   42:invokeinterface #55  <Method Object Iterator.next()>
		//   19   47:checkcast       #57  <Class String>
		//   20   50:astore          5
					try
					{
						((JSONObject) (context)).put(s, ((Bundle) (obj)).get(s));
		//   21   52:aload_1         
		//   22   53:aload           5
		//   23   55:aload_3         
		//   24   56:aload           5
		//   25   58:invokevirtual   #61  <Method Object Bundle.get(String)>
		//   26   61:invokevirtual   #65  <Method JSONObject JSONObject.put(String, Object)>
		//   27   64:pop             
					}
		//*  28   65:goto            30
					catch(JSONException jsonexception)
		//*  29   68:astore          6
					{
						StringBuilder stringbuilder1 = new StringBuilder();
		//   30   70:new             #67  <Class StringBuilder>
		//   31   73:dup             
		//   32   74:invokespecial   #68  <Method void StringBuilder()>
		//   33   77:astore          7
						stringbuilder1.append("failed to add key \"");
		//   34   79:aload           7
		//   35   81:ldc1            #70  <String "failed to add key \"">
		//   36   83:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//   37   86:pop             
						stringbuilder1.append(s);
		//   38   87:aload           7
		//   39   89:aload           5
		//   40   91:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//   41   94:pop             
						stringbuilder1.append("\" to properties for tracking bolts event");
		//   42   95:aload           7
		//   43   97:ldc1            #76  <String "\" to properties for tracking bolts event">
		//   44   99:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//   45  102:pop             
						f.e("MixpanelAPI.AL", stringbuilder1.toString(), ((Throwable) (jsonexception)));
		//   46  103:ldc1            #78  <String "MixpanelAPI.AL">
		//   47  105:aload           7
		//   48  107:invokevirtual   #82  <Method String StringBuilder.toString()>
		//   49  110:aload           6
		//   50  112:invokestatic    #88  <Method void f.e(String, String, Throwable)>
					}
				}

			}
		//*  51  115:goto            30
			obj = ((Object) (a));
		//   52  118:aload_0         
		//   53  119:getfield        #14  <Field j a>
		//   54  122:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
		//   55  123:new             #67  <Class StringBuilder>
		//   56  126:dup             
		//   57  127:invokespecial   #68  <Method void StringBuilder()>
		//   58  130:astore          4
			stringbuilder.append("$");
		//   59  132:aload           4
		//   60  134:ldc1            #90  <String "$">
		//   61  136:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//   62  139:pop             
			stringbuilder.append(intent.getStringExtra("event_name"));
		//   63  140:aload           4
		//   64  142:aload_2         
		//   65  143:ldc1            #92  <String "event_name">
		//   66  145:invokevirtual   #96  <Method String Intent.getStringExtra(String)>
		//   67  148:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//   68  151:pop             
			((j) (obj)).a(stringbuilder.toString(), ((JSONObject) (context)));
		//   69  152:aload_3         
		//   70  153:aload           4
		//   71  155:invokevirtual   #82  <Method String StringBuilder.toString()>
		//   72  158:aload_1         
		//   73  159:invokevirtual   #99  <Method void j.a(String, JSONObject)>
		//   74  162:return          
		}

		final j a;

			
			{
				a = j1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field j a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
	}

}
