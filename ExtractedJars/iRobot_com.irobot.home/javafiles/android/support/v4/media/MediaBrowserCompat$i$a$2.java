// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.ComponentName;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

class MediaBrowserCompat$i$a$2
	implements Runnable
{

	public void run()
	{
		if(MediaBrowserCompat.a)
	//*   0    0:getstatic       #34  <Field boolean MediaBrowserCompat.a>
	//*   1    3:ifeq            85
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #36  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #37  <Method void StringBuilder()>
	//    5   13:astore_1        
			stringbuilder.append("MediaServiceConnection.onServiceDisconnected name=");
	//    6   14:aload_1         
	//    7   15:ldc1            #39  <String "MediaServiceConnection.onServiceDisconnected name=">
	//    8   17:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
			stringbuilder.append(((Object) (a)));
	//   10   21:aload_1         
	//   11   22:aload_0         
	//   12   23:getfield        #26  <Field ComponentName a>
	//   13   26:invokevirtual   #46  <Method StringBuilder StringBuilder.append(Object)>
	//   14   29:pop             
			stringbuilder.append(" this=");
	//   15   30:aload_1         
	//   16   31:ldc1            #48  <String " this=">
	//   17   33:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			stringbuilder.append(((Object) (this)));
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:invokevirtual   #46  <Method StringBuilder StringBuilder.append(Object)>
	//   22   42:pop             
			stringbuilder.append(" mServiceConnection=");
	//   23   43:aload_1         
	//   24   44:ldc1            #50  <String " mServiceConnection=">
	//   25   46:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
			stringbuilder.append(((Object) (b.a.g)));
	//   27   50:aload_1         
	//   28   51:aload_0         
	//   29   52:getfield        #24  <Field MediaBrowserCompat$i$a b>
	//   30   55:getfield        #53  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
	//   31   58:getfield        #56  <Field MediaBrowserCompat$i$a MediaBrowserCompat$i.g>
	//   32   61:invokevirtual   #46  <Method StringBuilder StringBuilder.append(Object)>
	//   33   64:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
	//   34   65:ldc1            #58  <String "MediaBrowserCompat">
	//   35   67:aload_1         
	//   36   68:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   37   71:invokestatic    #68  <Method int Log.d(String, String)>
	//   38   74:pop             
			b.a.c();
	//   39   75:aload_0         
	//   40   76:getfield        #24  <Field MediaBrowserCompat$i$a b>
	//   41   79:getfield        #53  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
	//   42   82:invokevirtual   #71  <Method void MediaBrowserCompat$i.c()>
		}
		if(!b.a("onServiceDisconnected"))
	//*  43   85:aload_0         
	//*  44   86:getfield        #24  <Field MediaBrowserCompat$i$a b>
	//*  45   89:ldc1            #72  <String "onServiceDisconnected">
	//*  46   91:invokevirtual   #75  <Method boolean MediaBrowserCompat$i$a.a(String)>
	//*  47   94:ifne            98
		{
			return;
	//   48   97:return          
		} else
		{
			b.a.h = null;
	//   49   98:aload_0         
	//   50   99:getfield        #24  <Field MediaBrowserCompat$i$a b>
	//   51  102:getfield        #53  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
	//   52  105:aconst_null     
	//   53  106:putfield        #79  <Field MediaBrowserCompat$l MediaBrowserCompat$i.h>
			b.a.i = null;
	//   54  109:aload_0         
	//   55  110:getfield        #24  <Field MediaBrowserCompat$i$a b>
	//   56  113:getfield        #53  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
	//   57  116:aconst_null     
	//   58  117:putfield        #82  <Field android.os.Messenger MediaBrowserCompat$i.i>
			b.a.e.a(((android.os.Messenger) (null)));
	//   59  120:aload_0         
	//   60  121:getfield        #24  <Field MediaBrowserCompat$i$a b>
	//   61  124:getfield        #53  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
	//   62  127:getfield        #86  <Field MediaBrowserCompat$a MediaBrowserCompat$i.e>
	//   63  130:aconst_null     
	//   64  131:invokevirtual   #91  <Method void MediaBrowserCompat$a.a(android.os.Messenger)>
			b.a.f = 4;
	//   65  134:aload_0         
	//   66  135:getfield        #24  <Field MediaBrowserCompat$i$a b>
	//   67  138:getfield        #53  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
	//   68  141:iconst_4        
	//   69  142:putfield        #95  <Field int MediaBrowserCompat$i.f>
			b.a.c.b();
	//   70  145:aload_0         
	//   71  146:getfield        #24  <Field MediaBrowserCompat$i$a b>
	//   72  149:getfield        #53  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
	//   73  152:getfield        #98  <Field MediaBrowserCompat$b MediaBrowserCompat$i.c>
	//   74  155:invokevirtual   #102 <Method void MediaBrowserCompat$b.b()>
			return;
	//   75  158:return          
		}
	}

	final ComponentName a;
	final MediaBrowserCompat.i.a b;

	MediaBrowserCompat$i$a$2(MediaBrowserCompat.i.a a1, ComponentName componentname)
	{
		b = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field MediaBrowserCompat$i$a b>
		a = componentname;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field ComponentName a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #29  <Method void Object()>
	//    8   14:return          
	}
}
