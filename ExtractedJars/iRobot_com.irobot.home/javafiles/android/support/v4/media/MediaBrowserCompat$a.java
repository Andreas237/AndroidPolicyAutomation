// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.*;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

private static class MediaBrowserCompat$a extends Handler
{

	void a(Messenger messenger)
	{
		b = new WeakReference(((Object) (messenger)));
	//    0    0:aload_0         
	//    1    1:new             #18  <Class WeakReference>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #21  <Method void WeakReference(Object)>
	//    5    9:putfield        #27  <Field WeakReference b>
	//    6   12:return          
	}

	public void handleMessage(Message message)
	{
		if(b == null || b.get() == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field WeakReference b>
	//    2    4:ifnull          257
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field WeakReference b>
	//    5   11:invokevirtual   #35  <Method Object WeakReference.get()>
	//    6   14:ifnull          257
_L1:
		MediaBrowserCompat$j mediabrowsercompat$j;
		Messenger messenger;
		Bundle bundle;
		if(a.get() == null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #23  <Field WeakReference a>
	//*   9   21:invokevirtual   #35  <Method Object WeakReference.get()>
	//*  10   24:ifnonnull       28
			return;
	//   11   27:return          
		bundle = message.getData();
	//   12   28:aload_1         
	//   13   29:invokevirtual   #41  <Method Bundle Message.getData()>
	//   14   32:astore          4
		bundle.setClassLoader(((Class) (android/support/v4/media/session/MediaSessionCompat)).getClassLoader());
	//   15   34:aload           4
	//   16   36:ldc1            #43  <Class MediaSessionCompat>
	//   17   38:invokevirtual   #49  <Method ClassLoader Class.getClassLoader()>
	//   18   41:invokevirtual   #55  <Method void Bundle.setClassLoader(ClassLoader)>
		mediabrowsercompat$j = (MediaBrowserCompat$j)a.get();
	//   19   44:aload_0         
	//   20   45:getfield        #23  <Field WeakReference a>
	//   21   48:invokevirtual   #35  <Method Object WeakReference.get()>
	//   22   51:checkcast       #57  <Class MediaBrowserCompat$j>
	//   23   54:astore_2        
		messenger = (Messenger)b.get();
	//   24   55:aload_0         
	//   25   56:getfield        #27  <Field WeakReference b>
	//   26   59:invokevirtual   #35  <Method Object WeakReference.get()>
	//   27   62:checkcast       #59  <Class Messenger>
	//   28   65:astore_3        
		message.what;
	//   29   66:aload_1         
	//   30   67:getfield        #63  <Field int Message.what>
		JVM INSTR tableswitch 1 3: default 263
	//	               1 133
	//	               2 125
	//	               3 96;
	//   31   70:tableswitch     1 3: default 263
	//	               1 133
	//	               2 125
	//	               3 96
		   goto _L3 _L4 _L5 _L6
_L6:
		mediabrowsercompat$j.a(messenger, bundle.getString("data_media_item_id"), ((java.util.List) (bundle.getParcelableArrayList("data_media_item_list"))), bundle.getBundle("data_options"));
	//   32   96:aload_2         
	//   33   97:aload_3         
	//   34   98:aload           4
	//   35  100:ldc1            #65  <String "data_media_item_id">
	//   36  102:invokevirtual   #69  <Method String Bundle.getString(String)>
	//   37  105:aload           4
	//   38  107:ldc1            #71  <String "data_media_item_list">
	//   39  109:invokevirtual   #75  <Method java.util.ArrayList Bundle.getParcelableArrayList(String)>
	//   40  112:aload           4
	//   41  114:ldc1            #77  <String "data_options">
	//   42  116:invokevirtual   #81  <Method Bundle Bundle.getBundle(String)>
	//   43  119:invokeinterface #84  <Method void MediaBrowserCompat$j.a(Messenger, String, java.util.List, Bundle)>
		return;
	//   44  124:return          
	//*  45  125:aload_2         
	//*  46  126:aload_3         
	//*  47  127:invokeinterface #86  <Method void MediaBrowserCompat$j.a(Messenger)>
	//*  48  132:return          
_L4:
		mediabrowsercompat$j.a(messenger, bundle.getString("data_media_item_id"), (android.support.v4.media.session.ken)bundle.getParcelable("data_media_session_token"), bundle.getBundle("data_root_hints"));
	//   49  133:aload_2         
	//   50  134:aload_3         
	//   51  135:aload           4
	//   52  137:ldc1            #65  <String "data_media_item_id">
	//   53  139:invokevirtual   #69  <Method String Bundle.getString(String)>
	//   54  142:aload           4
	//   55  144:ldc1            #88  <String "data_media_session_token">
	//   56  146:invokevirtual   #92  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   57  149:checkcast       #94  <Class android.support.v4.media.session.MediaSessionCompat$Token>
	//   58  152:aload           4
	//   59  154:ldc1            #96  <String "data_root_hints">
	//   60  156:invokevirtual   #81  <Method Bundle Bundle.getBundle(String)>
	//   61  159:invokeinterface #99  <Method void MediaBrowserCompat$j.a(Messenger, String, android.support.v4.media.session.MediaSessionCompat$Token, Bundle)>
		return;
	//   62  164:return          
_L3:
		StringBuilder stringbuilder = new StringBuilder();
	//   63  165:new             #101 <Class StringBuilder>
	//   64  168:dup             
	//   65  169:invokespecial   #102 <Method void StringBuilder()>
	//   66  172:astore          4
		stringbuilder.append("Unhandled message: ");
	//   67  174:aload           4
	//   68  176:ldc1            #104 <String "Unhandled message: ">
	//   69  178:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   70  181:pop             
		stringbuilder.append(((Object) (message)));
	//   71  182:aload           4
	//   72  184:aload_1         
	//   73  185:invokevirtual   #111 <Method StringBuilder StringBuilder.append(Object)>
	//   74  188:pop             
		stringbuilder.append("\n  Client version: ");
	//   75  189:aload           4
	//   76  191:ldc1            #113 <String "\n  Client version: ">
	//   77  193:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   78  196:pop             
		stringbuilder.append(1);
	//   79  197:aload           4
	//   80  199:iconst_1        
	//   81  200:invokevirtual   #116 <Method StringBuilder StringBuilder.append(int)>
	//   82  203:pop             
		stringbuilder.append("\n  Service version: ");
	//   83  204:aload           4
	//   84  206:ldc1            #118 <String "\n  Service version: ">
	//   85  208:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   86  211:pop             
		stringbuilder.append(message.arg1);
	//   87  212:aload           4
	//   88  214:aload_1         
	//   89  215:getfield        #121 <Field int Message.arg1>
	//   90  218:invokevirtual   #116 <Method StringBuilder StringBuilder.append(int)>
	//   91  221:pop             
		Log.w("MediaBrowserCompat", stringbuilder.toString());
	//   92  222:ldc1            #123 <String "MediaBrowserCompat">
	//   93  224:aload           4
	//   94  226:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   95  229:invokestatic    #133 <Method int Log.w(String, String)>
	//   96  232:pop             
		return;
	//   97  233:return          
_L5:
		try
		{
			mediabrowsercompat$j.a(messenger);
			return;
		}
	//*  98  234:ldc1            #123 <String "MediaBrowserCompat">
	//*  99  236:ldc1            #135 <String "Could not unparcel the data.">
	//* 100  238:invokestatic    #138 <Method int Log.e(String, String)>
	//* 101  241:pop             
	//* 102  242:aload_1         
	//* 103  243:getfield        #63  <Field int Message.what>
	//* 104  246:iconst_1        
	//* 105  247:icmpne          257
	//* 106  250:aload_2         
	//* 107  251:aload_3         
	//* 108  252:invokeinterface #86  <Method void MediaBrowserCompat$j.a(Messenger)>
	//* 109  257:return          
		// Misplaced declaration of an exception variable
		catch(BadParcelableException badparcelableexception)
		{
			Log.e("MediaBrowserCompat", "Could not unparcel the data.");
		}
		if(message.what == 1)
			mediabrowsercompat$j.a(messenger);
_L2:
		BadParcelableException badparcelableexception;
	//* 110  258:astore          4
	//* 111  260:goto            234
	//* 112  263:goto            165
	}

	private final WeakReference a;
	private WeakReference b;

	MediaBrowserCompat$a(MediaBrowserCompat$j mediabrowsercompat$j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Handler()>
		a = new WeakReference(((Object) (mediabrowsercompat$j)));
	//    2    4:aload_0         
	//    3    5:new             #18  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #21  <Method void WeakReference(Object)>
	//    7   13:putfield        #23  <Field WeakReference a>
	//    8   16:return          
	}
}
