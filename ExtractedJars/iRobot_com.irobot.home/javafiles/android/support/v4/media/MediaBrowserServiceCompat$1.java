// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.f.a;
import android.util.Log;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$1 extends MediaBrowserServiceCompat$c
{

	volatile void a(Object obj)
	{
		a((List)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #33  <Class List>
	//    3    5:invokevirtual   #36  <Method void a(List)>
	//    4    8:return          
	}

	void a(List list)
	{
		if(d.b.get(((Object) (a.c.a()))) != a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field MediaBrowserServiceCompat d>
	//*   2    4:getfield        #41  <Field a MediaBrowserServiceCompat.b>
	//*   3    7:aload_0         
	//*   4    8:getfield        #23  <Field MediaBrowserServiceCompat$b a>
	//*   5   11:getfield        #46  <Field MediaBrowserServiceCompat$e MediaBrowserServiceCompat$b.c>
	//*   6   14:invokeinterface #51  <Method android.os.IBinder android.support.v4.media.MediaBrowserServiceCompat$e.a()>
	//*   7   19:invokevirtual   #57  <Method Object a.get(Object)>
	//*   8   22:aload_0         
	//*   9   23:getfield        #23  <Field MediaBrowserServiceCompat$b a>
	//*  10   26:if_acmpeq       89
		{
			if(android.support.v4.media.MediaBrowserServiceCompat.a)
	//*  11   29:getstatic       #60  <Field boolean android.support.v4.media.MediaBrowserServiceCompat.a>
	//*  12   32:ifeq            88
			{
				list = ((List) (new StringBuilder()));
	//   13   35:new             #62  <Class StringBuilder>
	//   14   38:dup             
	//   15   39:invokespecial   #65  <Method void StringBuilder()>
	//   16   42:astore_1        
				((StringBuilder) (list)).append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
	//   17   43:aload_1         
	//   18   44:ldc1            #67  <String "Not sending onLoadChildren result for connection that has been disconnected. pkg=">
	//   19   46:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   20   49:pop             
				((StringBuilder) (list)).append(a.a);
	//   21   50:aload_1         
	//   22   51:aload_0         
	//   23   52:getfield        #23  <Field MediaBrowserServiceCompat$b a>
	//   24   55:getfield        #73  <Field String android.support.v4.media.MediaBrowserServiceCompat$b.a>
	//   25   58:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   26   61:pop             
				((StringBuilder) (list)).append(" id=");
	//   27   62:aload_1         
	//   28   63:ldc1            #75  <String " id=">
	//   29   65:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   30   68:pop             
				((StringBuilder) (list)).append(b);
	//   31   69:aload_1         
	//   32   70:aload_0         
	//   33   71:getfield        #25  <Field String b>
	//   34   74:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   35   77:pop             
				Log.d("MBServiceCompat", ((StringBuilder) (list)).toString());
	//   36   78:ldc1            #77  <String "MBServiceCompat">
	//   37   80:aload_1         
	//   38   81:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   39   84:invokestatic    #86  <Method int Log.d(String, String)>
	//   40   87:pop             
			}
			return;
	//   41   88:return          
		}
		List list1 = list;
	//   42   89:aload_1         
	//   43   90:astore_2        
		if((b() & 1) != 0)
	//*  44   91:aload_0         
	//*  45   92:invokevirtual   #89  <Method int b()>
	//*  46   95:iconst_1        
	//*  47   96:iand            
	//*  48   97:ifeq            113
			list1 = d.a(list, c);
	//   49  100:aload_0         
	//   50  101:getfield        #21  <Field MediaBrowserServiceCompat d>
	//   51  104:aload_1         
	//   52  105:aload_0         
	//   53  106:getfield        #27  <Field Bundle c>
	//   54  109:invokevirtual   #92  <Method List android.support.v4.media.MediaBrowserServiceCompat.a(List, Bundle)>
	//   55  112:astore_2        
		try
		{
			a.c.a(b, list1, c);
	//   56  113:aload_0         
	//   57  114:getfield        #23  <Field MediaBrowserServiceCompat$b a>
	//   58  117:getfield        #46  <Field MediaBrowserServiceCompat$e MediaBrowserServiceCompat$b.c>
	//   59  120:aload_0         
	//   60  121:getfield        #25  <Field String b>
	//   61  124:aload_2         
	//   62  125:aload_0         
	//   63  126:getfield        #27  <Field Bundle c>
	//   64  129:invokeinterface #95  <Method void android.support.v4.media.MediaBrowserServiceCompat$e.a(String, List, Bundle)>
			return;
	//   65  134:return          
		}
	//*  66  135:new             #62  <Class StringBuilder>
	//*  67  138:dup             
	//*  68  139:invokespecial   #65  <Method void StringBuilder()>
	//*  69  142:astore_1        
	//*  70  143:aload_1         
	//*  71  144:ldc1            #97  <String "Calling onLoadChildren() failed for id=">
	//*  72  146:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//*  73  149:pop             
	//*  74  150:aload_1         
	//*  75  151:aload_0         
	//*  76  152:getfield        #25  <Field String b>
	//*  77  155:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//*  78  158:pop             
	//*  79  159:aload_1         
	//*  80  160:ldc1            #99  <String " package=">
	//*  81  162:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//*  82  165:pop             
	//*  83  166:aload_1         
	//*  84  167:aload_0         
	//*  85  168:getfield        #23  <Field MediaBrowserServiceCompat$b a>
	//*  86  171:getfield        #73  <Field String android.support.v4.media.MediaBrowserServiceCompat$b.a>
	//*  87  174:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//*  88  177:pop             
	//*  89  178:ldc1            #77  <String "MBServiceCompat">
	//*  90  180:aload_1         
	//*  91  181:invokevirtual   #81  <Method String StringBuilder.toString()>
	//*  92  184:invokestatic    #102 <Method int Log.w(String, String)>
	//*  93  187:pop             
	//*  94  188:return          
		// Misplaced declaration of an exception variable
		catch(List list)
		{
			list = ((List) (new StringBuilder()));
		}
		((StringBuilder) (list)).append("Calling onLoadChildren() failed for id=");
		((StringBuilder) (list)).append(b);
		((StringBuilder) (list)).append(" package=");
		((StringBuilder) (list)).append(a.a);
		Log.w("MBServiceCompat", ((StringBuilder) (list)).toString());
	//*  95  189:astore_1        
	//*  96  190:goto            135
	}

	final MediaBrowserServiceCompat$b a;
	final String b;
	final Bundle c;
	final MediaBrowserServiceCompat d;

	MediaBrowserServiceCompat$1(MediaBrowserServiceCompat mediabrowserservicecompat, Object obj, MediaBrowserServiceCompat$b mediabrowserservicecompat$b, String s, Bundle bundle)
	{
		d = mediabrowserservicecompat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field MediaBrowserServiceCompat d>
		a = mediabrowserservicecompat$b;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #23  <Field MediaBrowserServiceCompat$b a>
		b = s;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #25  <Field String b>
		c = bundle;
	//    9   16:aload_0         
	//   10   17:aload           5
	//   11   19:putfield        #27  <Field Bundle c>
		super(obj);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:invokespecial   #30  <Method void MediaBrowserServiceCompat$c(Object)>
	//   15   27:return          
	}
}
