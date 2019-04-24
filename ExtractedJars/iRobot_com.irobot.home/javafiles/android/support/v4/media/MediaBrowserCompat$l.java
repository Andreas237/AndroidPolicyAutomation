// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.Context;
import android.os.*;
import android.support.v4.app.BundleCompat;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

private static class MediaBrowserCompat$l
{

	private void a(int i, Bundle bundle, Messenger messenger)
	{
		Message message = Message.obtain();
	//    0    0:invokestatic    #33  <Method Message Message.obtain()>
	//    1    3:astore          4
		message.what = i;
	//    2    5:aload           4
	//    3    7:iload_1         
	//    4    8:putfield        #37  <Field int Message.what>
		message.arg1 = 1;
	//    5   11:aload           4
	//    6   13:iconst_1        
	//    7   14:putfield        #40  <Field int Message.arg1>
		message.setData(bundle);
	//    8   17:aload           4
	//    9   19:aload_2         
	//   10   20:invokevirtual   #44  <Method void Message.setData(Bundle)>
		message.replyTo = messenger;
	//   11   23:aload           4
	//   12   25:aload_3         
	//   13   26:putfield        #47  <Field Messenger Message.replyTo>
		a.send(message);
	//   14   29:aload_0         
	//   15   30:getfield        #23  <Field Messenger a>
	//   16   33:aload           4
	//   17   35:invokevirtual   #51  <Method void Messenger.send(Message)>
	//   18   38:return          
	}

	void a(Context context, Messenger messenger)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #54  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void Bundle()>
	//    3    7:astore_3        
		bundle.putString("data_package_name", context.getPackageName());
	//    4    8:aload_3         
	//    5    9:ldc1            #57  <String "data_package_name">
	//    6   11:aload_1         
	//    7   12:invokevirtual   #63  <Method String Context.getPackageName()>
	//    8   15:invokevirtual   #67  <Method void Bundle.putString(String, String)>
		bundle.putBundle("data_root_hints", b);
	//    9   18:aload_3         
	//   10   19:ldc1            #69  <String "data_root_hints">
	//   11   21:aload_0         
	//   12   22:getfield        #25  <Field Bundle b>
	//   13   25:invokevirtual   #73  <Method void Bundle.putBundle(String, Bundle)>
		a(1, bundle, messenger);
	//   14   28:aload_0         
	//   15   29:iconst_1        
	//   16   30:aload_3         
	//   17   31:aload_2         
	//   18   32:invokespecial   #75  <Method void a(int, Bundle, Messenger)>
	//   19   35:return          
	}

	void a(Messenger messenger)
	{
		a(2, ((Bundle) (null)), messenger);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aconst_null     
	//    3    3:aload_1         
	//    4    4:invokespecial   #75  <Method void a(int, Bundle, Messenger)>
	//    5    7:return          
	}

	void a(String s, IBinder ibinder, Bundle bundle, Messenger messenger)
	{
		Bundle bundle1 = new Bundle();
	//    0    0:new             #54  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void Bundle()>
	//    3    7:astore          5
		bundle1.putString("data_media_item_id", s);
	//    4    9:aload           5
	//    5   11:ldc1            #79  <String "data_media_item_id">
	//    6   13:aload_1         
	//    7   14:invokevirtual   #67  <Method void Bundle.putString(String, String)>
		BundleCompat.putBinder(bundle1, "data_callback_token", ibinder);
	//    8   17:aload           5
	//    9   19:ldc1            #81  <String "data_callback_token">
	//   10   21:aload_2         
	//   11   22:invokestatic    #87  <Method void BundleCompat.putBinder(Bundle, String, IBinder)>
		bundle1.putBundle("data_options", bundle);
	//   12   25:aload           5
	//   13   27:ldc1            #89  <String "data_options">
	//   14   29:aload_3         
	//   15   30:invokevirtual   #73  <Method void Bundle.putBundle(String, Bundle)>
		a(3, bundle1, messenger);
	//   16   33:aload_0         
	//   17   34:iconst_3        
	//   18   35:aload           5
	//   19   37:aload           4
	//   20   39:invokespecial   #75  <Method void a(int, Bundle, Messenger)>
	//   21   42:return          
	}

	void b(Messenger messenger)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #54  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void Bundle()>
	//    3    7:astore_2        
		bundle.putBundle("data_root_hints", b);
	//    4    8:aload_2         
	//    5    9:ldc1            #69  <String "data_root_hints">
	//    6   11:aload_0         
	//    7   12:getfield        #25  <Field Bundle b>
	//    8   15:invokevirtual   #73  <Method void Bundle.putBundle(String, Bundle)>
		a(6, bundle, messenger);
	//    9   18:aload_0         
	//   10   19:bipush          6
	//   11   21:aload_2         
	//   12   22:aload_1         
	//   13   23:invokespecial   #75  <Method void a(int, Bundle, Messenger)>
	//   14   26:return          
	}

	void c(Messenger messenger)
	{
		a(7, ((Bundle) (null)), messenger);
	//    0    0:aload_0         
	//    1    1:bipush          7
	//    2    3:aconst_null     
	//    3    4:aload_1         
	//    4    5:invokespecial   #75  <Method void a(int, Bundle, Messenger)>
	//    5    8:return          
	}

	private Messenger a;
	private Bundle b;

	public MediaBrowserCompat$l(IBinder ibinder, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = new Messenger(ibinder);
	//    2    4:aload_0         
	//    3    5:new             #18  <Class Messenger>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #21  <Method void Messenger(IBinder)>
	//    7   13:putfield        #23  <Field Messenger a>
		b = bundle;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #25  <Field Bundle b>
	//   11   21:return          
	}
}
