// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.content.Context;
import android.os.*;
import android.support.v4.app.BundleCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package android.support.v4.media.session:
//			c, b, ParcelableVolumeInfo, PlaybackStateCompat

public final class MediaControllerCompat
{
	static class MediaControllerImplApi21
		implements b
	{

		static android.support.v4.media.session.b a(MediaControllerImplApi21 mediacontrollerimplapi21, android.support.v4.media.session.b b1)
		{
			mediacontrollerimplapi21.c = b1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #59  <Field b c>
			return b1;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

		private void a()
		{
			a("android.support.v4.media.session.command.GET_EXTRA_BINDER", ((Bundle) (null)), ((ResultReceiver) (new ExtraBinderRequestResultReceiver(this, new Handler()))));
		//    0    0:aload_0         
		//    1    1:ldc1            #65  <String "android.support.v4.media.session.command.GET_EXTRA_BINDER">
		//    2    3:aconst_null     
		//    3    4:new             #11  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver>
		//    4    7:dup             
		//    5    8:aload_0         
		//    6    9:new             #67  <Class Handler>
		//    7   12:dup             
		//    8   13:invokespecial   #68  <Method void Handler()>
		//    9   16:invokespecial   #71  <Method void MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(MediaControllerCompat$MediaControllerImplApi21, Handler)>
		//   10   19:invokevirtual   #74  <Method void a(String, Bundle, ResultReceiver)>
		//   11   22:return          
		}

		static void a(MediaControllerImplApi21 mediacontrollerimplapi21)
		{
			mediacontrollerimplapi21.b();
		//    0    0:aload_0         
		//    1    1:invokespecial   #77  <Method void b()>
		//    2    4:return          
		}

		private void b()
		{
			if(c == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #59  <Field b c>
		//*   2    4:ifnonnull       8
				return;
		//    3    7:return          
			List list = b;
		//    4    8:aload_0         
		//    5    9:getfield        #34  <Field List b>
		//    6   12:astore_1        
			list;
		//    7   13:aload_1         
			JVM INSTR monitorenter ;
		//    8   14:monitorenter    
			Iterator iterator = b.iterator();
		//    9   15:aload_0         
		//   10   16:getfield        #34  <Field List b>
		//   11   19:invokeinterface #83  <Method Iterator List.iterator()>
		//   12   24:astore_2        
_L1:
			a a2;
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_94;
		//   13   25:aload_2         
		//   14   26:invokeinterface #89  <Method boolean Iterator.hasNext()>
		//   15   31:ifeq            94
			a a1 = (a)iterator.next();
		//   16   34:aload_2         
		//   17   35:invokeinterface #92  <Method Object Iterator.next()>
		//   18   40:checkcast       #94  <Class MediaControllerCompat$a>
		//   19   43:astore_3        
			a2 = new a(a1);
		//   20   44:new             #14  <Class MediaControllerCompat$MediaControllerImplApi21$a>
		//   21   47:dup             
		//   22   48:aload_3         
		//   23   49:invokespecial   #97  <Method void MediaControllerCompat$MediaControllerImplApi21$a(MediaControllerCompat$a)>
		//   24   52:astore          4
			d.put(((Object) (a1)), ((Object) (a2)));
		//   25   54:aload_0         
		//   26   55:getfield        #39  <Field HashMap d>
		//   27   58:aload_3         
		//   28   59:aload           4
		//   29   61:invokevirtual   #101 <Method Object HashMap.put(Object, Object)>
		//   30   64:pop             
			a1.b = true;
		//   31   65:aload_3         
		//   32   66:iconst_1        
		//   33   67:putfield        #104 <Field boolean MediaControllerCompat$a.b>
			c.a(((android.support.v4.media.session.a) (a2)));
		//   34   70:aload_0         
		//   35   71:getfield        #59  <Field b c>
		//   36   74:aload           4
		//   37   76:invokeinterface #109 <Method void b.a(a)>
			  goto _L1
		//*  38   81:goto            25
			Object obj;
			obj;
		//   39   84:astore_2        
			Log.e("MediaControllerCompat", "Dead object in registerCallback.", ((Throwable) (obj)));
		//   40   85:ldc1            #111 <String "MediaControllerCompat">
		//   41   87:ldc1            #113 <String "Dead object in registerCallback.">
		//   42   89:aload_2         
		//   43   90:invokestatic    #119 <Method int Log.e(String, String, Throwable)>
		//   44   93:pop             
			b.clear();
		//   45   94:aload_0         
		//   46   95:getfield        #34  <Field List b>
		//   47   98:invokeinterface #122 <Method void List.clear()>
			list;
		//   48  103:aload_1         
			JVM INSTR monitorexit ;
		//   49  104:monitorexit     
			return;
		//   50  105:return          
			obj;
		//   51  106:astore_2        
			list;
		//   52  107:aload_1         
			JVM INSTR monitorexit ;
		//   53  108:monitorexit     
			throw obj;
		//   54  109:aload_2         
		//   55  110:athrow          
		}

		public void a(String s, Bundle bundle, ResultReceiver resultreceiver)
		{
			android.support.v4.media.session.c.a(a, s, bundle, resultreceiver);
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field Object a>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokestatic    #125 <Method void c.a(Object, String, Bundle, ResultReceiver)>
		//    6   10:return          
		}

		public boolean a(KeyEvent keyevent)
		{
			return android.support.v4.media.session.c.a(a, keyevent);
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field Object a>
		//    2    4:aload_1         
		//    3    5:invokestatic    #129 <Method boolean c.a(Object, KeyEvent)>
		//    4    8:ireturn         
		}

		protected final Object a;
		private final List b = new ArrayList();
		private android.support.v4.media.session.b c;
		private HashMap d;

		public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #29  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #31  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #32  <Method void ArrayList()>
		//    6   12:putfield        #34  <Field List b>
			d = new HashMap();
		//    7   15:aload_0         
		//    8   16:new             #36  <Class HashMap>
		//    9   19:dup             
		//   10   20:invokespecial   #37  <Method void HashMap()>
		//   11   23:putfield        #39  <Field HashMap d>
			a = android.support.v4.media.session.c.a(context, token.a());
		//   12   26:aload_0         
		//   13   27:aload_1         
		//   14   28:aload_2         
		//   15   29:invokevirtual   #44  <Method Object MediaSessionCompat$Token.a()>
		//   16   32:invokestatic    #49  <Method Object c.a(Context, Object)>
		//   17   35:putfield        #51  <Field Object a>
			if(a == null)
		//*  18   38:aload_0         
		//*  19   39:getfield        #51  <Field Object a>
		//*  20   42:ifnonnull       53
				throw new RemoteException();
		//   21   45:new             #53  <Class RemoteException>
		//   22   48:dup             
		//   23   49:invokespecial   #54  <Method void RemoteException()>
		//   24   52:athrow          
			c = token.b();
		//   25   53:aload_0         
		//   26   54:aload_2         
		//   27   55:invokevirtual   #57  <Method b MediaSessionCompat$Token.b()>
		//   28   58:putfield        #59  <Field b c>
			if(c == null)
		//*  29   61:aload_0         
		//*  30   62:getfield        #59  <Field b c>
		//*  31   65:ifnonnull       72
				a();
		//   32   68:aload_0         
		//   33   69:invokespecial   #61  <Method void a()>
		//   34   72:return          
		}
	}

	private static class MediaControllerImplApi21.ExtraBinderRequestResultReceiver extends ResultReceiver
	{

		protected void onReceiveResult(int i, Bundle bundle)
		{
			MediaControllerImplApi21 mediacontrollerimplapi21 = (MediaControllerImplApi21)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field WeakReference a>
		//    2    4:invokevirtual   #32  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$MediaControllerImplApi21>
		//    4   10:astore_3        
			if(mediacontrollerimplapi21 != null)
		//*   5   11:aload_3         
		//*   6   12:ifnull          38
			{
				if(bundle == null)
		//*   7   15:aload_2         
		//*   8   16:ifnonnull       20
					return;
		//    9   19:return          
				MediaControllerImplApi21.a(mediacontrollerimplapi21, android.support.v4.media.session.b.a.a(BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
		//   10   20:aload_3         
		//   11   21:aload_2         
		//   12   22:ldc1            #34  <String "android.support.v4.media.session.EXTRA_BINDER">
		//   13   24:invokestatic    #40  <Method IBinder BundleCompat.getBinder(Bundle, String)>
		//   14   27:invokestatic    #45  <Method b b$a.a(IBinder)>
		//   15   30:invokestatic    #48  <Method b MediaControllerCompat$MediaControllerImplApi21.a(MediaControllerCompat$MediaControllerImplApi21, b)>
		//   16   33:pop             
				MediaControllerImplApi21.a(mediacontrollerimplapi21);
		//   17   34:aload_3         
		//   18   35:invokestatic    #51  <Method void MediaControllerCompat$MediaControllerImplApi21.a(MediaControllerCompat$MediaControllerImplApi21)>
			}
		//   19   38:return          
		}

		private WeakReference a;

		public MediaControllerImplApi21.ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediacontrollerimplapi21, Handler handler)
		{
			super(handler);
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:invokespecial   #18  <Method void ResultReceiver(Handler)>
			a = new WeakReference(((Object) (mediacontrollerimplapi21)));
		//    3    5:aload_0         
		//    4    6:new             #20  <Class WeakReference>
		//    5    9:dup             
		//    6   10:aload_1         
		//    7   11:invokespecial   #23  <Method void WeakReference(Object)>
		//    8   14:putfield        #25  <Field WeakReference a>
		//    9   17:return          
		}
	}

	private static class MediaControllerImplApi21.a extends a.c
	{

		public void a()
		{
			throw new AssertionError();
		//    0    0:new             #18  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void a(Bundle bundle)
		{
			throw new AssertionError();
		//    0    0:new             #18  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void a(MediaMetadataCompat mediametadatacompat)
		{
			throw new AssertionError();
		//    0    0:new             #18  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void a(ParcelableVolumeInfo parcelablevolumeinfo)
		{
			throw new AssertionError();
		//    0    0:new             #18  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void a(CharSequence charsequence)
		{
			throw new AssertionError();
		//    0    0:new             #18  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void a(List list)
		{
			throw new AssertionError();
		//    0    0:new             #18  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void AssertionError()>
		//    3    7:athrow          
		}

		MediaControllerImplApi21.a(a a1)
		{
			super(a1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #14  <Method void MediaControllerCompat$a$c(MediaControllerCompat$a)>
		//    3    5:return          
		}
	}

	public static abstract class a
		implements android.os.IBinder.DeathRecipient
	{

		public void a()
		{
		//    0    0:return          
		}

		public void a(int i)
		{
		//    0    0:return          
		}

		void a(int i, Object obj, Bundle bundle)
		{
			if(a != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #46  <Field MediaControllerCompat$a$a a>
		//*   2    4:ifnull          26
			{
				obj = ((Object) (a.obtainMessage(i, obj)));
		//    3    7:aload_0         
		//    4    8:getfield        #46  <Field MediaControllerCompat$a$a a>
		//    5   11:iload_1         
		//    6   12:aload_2         
		//    7   13:invokevirtual   #50  <Method Message MediaControllerCompat$a$a.obtainMessage(int, Object)>
		//    8   16:astore_2        
				((Message) (obj)).setData(bundle);
		//    9   17:aload_2         
		//   10   18:aload_3         
		//   11   19:invokevirtual   #56  <Method void Message.setData(Bundle)>
				((Message) (obj)).sendToTarget();
		//   12   22:aload_2         
		//   13   23:invokevirtual   #59  <Method void Message.sendToTarget()>
			}
		//   14   26:return          
		}

		public void a(Bundle bundle)
		{
		//    0    0:return          
		}

		public void a(MediaMetadataCompat mediametadatacompat)
		{
		//    0    0:return          
		}

		public void a(f f1)
		{
		//    0    0:return          
		}

		public void a(PlaybackStateCompat playbackstatecompat)
		{
		//    0    0:return          
		}

		public void a(CharSequence charsequence)
		{
		//    0    0:return          
		}

		public void a(String s, Bundle bundle)
		{
		//    0    0:return          
		}

		public void a(List list)
		{
		//    0    0:return          
		}

		public void a(boolean flag)
		{
		//    0    0:return          
		}

		public void b(int i)
		{
		//    0    0:return          
		}

		public void b(boolean flag)
		{
		//    0    0:return          
		}

		a a;
		boolean b;
		private final Object c;

		public a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			Object obj;
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*   2    4:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          21
		//*   4    9:icmplt          30
				obj = android.support.v4.media.session.c.a(((c.a) (new b(this))));
		//    5   12:new             #13  <Class MediaControllerCompat$a$b>
		//    6   15:dup             
		//    7   16:aload_0         
		//    8   17:invokespecial   #33  <Method void MediaControllerCompat$a$b(MediaControllerCompat$a)>
		//    9   20:invokestatic    #38  <Method Object c.a(c$a)>
		//   10   23:astore_1        
			else
		//*  11   24:aload_0         
		//*  12   25:aload_1         
		//*  13   26:putfield        #40  <Field Object c>
		//*  14   29:return          
				obj = ((Object) (new c(this)));
		//   15   30:new             #16  <Class MediaControllerCompat$a$c>
		//   16   33:dup             
		//   17   34:aload_0         
		//   18   35:invokespecial   #41  <Method void MediaControllerCompat$a$c(MediaControllerCompat$a)>
		//   19   38:astore_1        
			c = obj;
		//*  20   39:goto            24
		}
	}

	private class a.a extends Handler
	{

		public void handleMessage(Message message)
		{
			if(!a)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field boolean a>
		//*   2    4:ifne            8
				return;
		//    3    7:return          
			switch(message.what)
		//*   4    8:aload_1         
		//*   5    9:getfield        #22  <Field int Message.what>
			{
		//*   6   12:tableswitch     1 12: default 76
		//		               1 247
		//		               2 232
		//		               3 217
		//		               4 202
		//		               5 187
		//		               6 172
		//		               7 157
		//		               8 149
		//		               9 131
		//		               10 113
		//		               11 95
		//		               12 77
			default:
				return;
		//    7   76:return          

			case 12: // '\f'
				b.b(((Integer)message.obj).intValue());
		//    8   77:aload_0         
		//    9   78:getfield        #24  <Field MediaControllerCompat$a b>
		//   10   81:aload_1         
		//   11   82:getfield        #28  <Field Object Message.obj>
		//   12   85:checkcast       #30  <Class Integer>
		//   13   88:invokevirtual   #34  <Method int Integer.intValue()>
		//   14   91:invokevirtual   #37  <Method void MediaControllerCompat$a.b(int)>
				return;
		//   15   94:return          

			case 11: // '\013'
				b.a(((Boolean)message.obj).booleanValue());
		//   16   95:aload_0         
		//   17   96:getfield        #24  <Field MediaControllerCompat$a b>
		//   18   99:aload_1         
		//   19  100:getfield        #28  <Field Object Message.obj>
		//   20  103:checkcast       #39  <Class Boolean>
		//   21  106:invokevirtual   #43  <Method boolean Boolean.booleanValue()>
		//   22  109:invokevirtual   #46  <Method void MediaControllerCompat$a.a(boolean)>
				return;
		//   23  112:return          

			case 10: // '\n'
				b.b(((Boolean)message.obj).booleanValue());
		//   24  113:aload_0         
		//   25  114:getfield        #24  <Field MediaControllerCompat$a b>
		//   26  117:aload_1         
		//   27  118:getfield        #28  <Field Object Message.obj>
		//   28  121:checkcast       #39  <Class Boolean>
		//   29  124:invokevirtual   #43  <Method boolean Boolean.booleanValue()>
		//   30  127:invokevirtual   #48  <Method void MediaControllerCompat$a.b(boolean)>
				return;
		//   31  130:return          

			case 9: // '\t'
				b.a(((Integer)message.obj).intValue());
		//   32  131:aload_0         
		//   33  132:getfield        #24  <Field MediaControllerCompat$a b>
		//   34  135:aload_1         
		//   35  136:getfield        #28  <Field Object Message.obj>
		//   36  139:checkcast       #30  <Class Integer>
		//   37  142:invokevirtual   #34  <Method int Integer.intValue()>
		//   38  145:invokevirtual   #50  <Method void MediaControllerCompat$a.a(int)>
				return;
		//   39  148:return          

			case 8: // '\b'
				b.a();
		//   40  149:aload_0         
		//   41  150:getfield        #24  <Field MediaControllerCompat$a b>
		//   42  153:invokevirtual   #53  <Method void MediaControllerCompat$a.a()>
				return;
		//   43  156:return          

			case 7: // '\007'
				b.a((Bundle)message.obj);
		//   44  157:aload_0         
		//   45  158:getfield        #24  <Field MediaControllerCompat$a b>
		//   46  161:aload_1         
		//   47  162:getfield        #28  <Field Object Message.obj>
		//   48  165:checkcast       #55  <Class Bundle>
		//   49  168:invokevirtual   #58  <Method void MediaControllerCompat$a.a(Bundle)>
				return;
		//   50  171:return          

			case 6: // '\006'
				b.a((CharSequence)message.obj);
		//   51  172:aload_0         
		//   52  173:getfield        #24  <Field MediaControllerCompat$a b>
		//   53  176:aload_1         
		//   54  177:getfield        #28  <Field Object Message.obj>
		//   55  180:checkcast       #60  <Class CharSequence>
		//   56  183:invokevirtual   #63  <Method void MediaControllerCompat$a.a(CharSequence)>
				return;
		//   57  186:return          

			case 5: // '\005'
				b.a((List)message.obj);
		//   58  187:aload_0         
		//   59  188:getfield        #24  <Field MediaControllerCompat$a b>
		//   60  191:aload_1         
		//   61  192:getfield        #28  <Field Object Message.obj>
		//   62  195:checkcast       #65  <Class List>
		//   63  198:invokevirtual   #68  <Method void MediaControllerCompat$a.a(List)>
				return;
		//   64  201:return          

			case 4: // '\004'
				b.a((f)message.obj);
		//   65  202:aload_0         
		//   66  203:getfield        #24  <Field MediaControllerCompat$a b>
		//   67  206:aload_1         
		//   68  207:getfield        #28  <Field Object Message.obj>
		//   69  210:checkcast       #70  <Class MediaControllerCompat$f>
		//   70  213:invokevirtual   #73  <Method void MediaControllerCompat$a.a(MediaControllerCompat$f)>
				return;
		//   71  216:return          

			case 3: // '\003'
				b.a((MediaMetadataCompat)message.obj);
		//   72  217:aload_0         
		//   73  218:getfield        #24  <Field MediaControllerCompat$a b>
		//   74  221:aload_1         
		//   75  222:getfield        #28  <Field Object Message.obj>
		//   76  225:checkcast       #75  <Class MediaMetadataCompat>
		//   77  228:invokevirtual   #78  <Method void MediaControllerCompat$a.a(MediaMetadataCompat)>
				return;
		//   78  231:return          

			case 2: // '\002'
				b.a((PlaybackStateCompat)message.obj);
		//   79  232:aload_0         
		//   80  233:getfield        #24  <Field MediaControllerCompat$a b>
		//   81  236:aload_1         
		//   82  237:getfield        #28  <Field Object Message.obj>
		//   83  240:checkcast       #80  <Class PlaybackStateCompat>
		//   84  243:invokevirtual   #83  <Method void MediaControllerCompat$a.a(PlaybackStateCompat)>
				return;
		//   85  246:return          

			case 1: // '\001'
				b.a((String)message.obj, message.getData());
		//   86  247:aload_0         
		//   87  248:getfield        #24  <Field MediaControllerCompat$a b>
		//   88  251:aload_1         
		//   89  252:getfield        #28  <Field Object Message.obj>
		//   90  255:checkcast       #85  <Class String>
		//   91  258:aload_1         
		//   92  259:invokevirtual   #89  <Method Bundle Message.getData()>
		//   93  262:invokevirtual   #92  <Method void MediaControllerCompat$a.a(String, Bundle)>
				return;
		//   94  265:return          
			}
		}

		boolean a;
		final a b;
	}

	private static class a.b
		implements c.a
	{

		public void a()
		{
			a a1 = (a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field WeakReference a>
		//    2    4:invokevirtual   #31  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$a>
		//    4   10:astore_1        
			if(a1 != null)
		//*   5   11:aload_1         
		//*   6   12:ifnull          19
				a1.a();
		//    7   15:aload_1         
		//    8   16:invokevirtual   #33  <Method void MediaControllerCompat$a.a()>
		//    9   19:return          
		}

		public void a(int i, int j, int k, int l, int i1)
		{
			a a1 = (a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field WeakReference a>
		//    2    4:invokevirtual   #31  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$a>
		//    4   10:astore          6
			if(a1 != null)
		//*   5   12:aload           6
		//*   6   14:ifnull          36
				a1.a(new f(i, j, k, l, i1));
		//    7   17:aload           6
		//    8   19:new             #36  <Class MediaControllerCompat$f>
		//    9   22:dup             
		//   10   23:iload_1         
		//   11   24:iload_2         
		//   12   25:iload_3         
		//   13   26:iload           4
		//   14   28:iload           5
		//   15   30:invokespecial   #38  <Method void MediaControllerCompat$f(int, int, int, int, int)>
		//   16   33:invokevirtual   #41  <Method void MediaControllerCompat$a.a(MediaControllerCompat$f)>
		//   17   36:return          
		}

		public void a(Bundle bundle)
		{
			a a1 = (a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field WeakReference a>
		//    2    4:invokevirtual   #31  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          20
				a1.a(bundle);
		//    7   15:aload_2         
		//    8   16:aload_1         
		//    9   17:invokevirtual   #44  <Method void MediaControllerCompat$a.a(Bundle)>
		//   10   20:return          
		}

		public void a(CharSequence charsequence)
		{
			a a1 = (a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field WeakReference a>
		//    2    4:invokevirtual   #31  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          20
				a1.a(charsequence);
		//    7   15:aload_2         
		//    8   16:aload_1         
		//    9   17:invokevirtual   #47  <Method void MediaControllerCompat$a.a(CharSequence)>
		//   10   20:return          
		}

		public void a(Object obj)
		{
			a a1 = (a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field WeakReference a>
		//    2    4:invokevirtual   #31  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          31
			{
				if(a1.b)
		//*   7   15:aload_2         
		//*   8   16:getfield        #50  <Field boolean MediaControllerCompat$a.b>
		//*   9   19:ifeq            23
					return;
		//   10   22:return          
				a1.a(PlaybackStateCompat.a(obj));
		//   11   23:aload_2         
		//   12   24:aload_1         
		//   13   25:invokestatic    #55  <Method PlaybackStateCompat PlaybackStateCompat.a(Object)>
		//   14   28:invokevirtual   #58  <Method void MediaControllerCompat$a.a(PlaybackStateCompat)>
			}
		//   15   31:return          
		}

		public void a(String s, Bundle bundle)
		{
			a a1 = (a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field WeakReference a>
		//    2    4:invokevirtual   #31  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$a>
		//    4   10:astore_3        
			if(a1 != null)
		//*   5   11:aload_3         
		//*   6   12:ifnull          37
			{
				if(a1.b && android.os.Build.VERSION.SDK_INT < 23)
		//*   7   15:aload_3         
		//*   8   16:getfield        #50  <Field boolean MediaControllerCompat$a.b>
		//*   9   19:ifeq            31
		//*  10   22:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
		//*  11   25:bipush          23
		//*  12   27:icmpge          31
					return;
		//   13   30:return          
				a1.a(s, bundle);
		//   14   31:aload_3         
		//   15   32:aload_1         
		//   16   33:aload_2         
		//   17   34:invokevirtual   #67  <Method void MediaControllerCompat$a.a(String, Bundle)>
			}
		//   18   37:return          
		}

		public void a(List list)
		{
			a a1 = (a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field WeakReference a>
		//    2    4:invokevirtual   #31  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          23
				a1.a(MediaSessionCompat.QueueItem.a(list));
		//    7   15:aload_2         
		//    8   16:aload_1         
		//    9   17:invokestatic    #73  <Method List MediaSessionCompat$QueueItem.a(List)>
		//   10   20:invokevirtual   #75  <Method void MediaControllerCompat$a.a(List)>
		//   11   23:return          
		}

		public void b(Object obj)
		{
			a a1 = (a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field WeakReference a>
		//    2    4:invokevirtual   #31  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          23
				a1.a(MediaMetadataCompat.a(obj));
		//    7   15:aload_2         
		//    8   16:aload_1         
		//    9   17:invokestatic    #82  <Method MediaMetadataCompat MediaMetadataCompat.a(Object)>
		//   10   20:invokevirtual   #85  <Method void MediaControllerCompat$a.a(MediaMetadataCompat)>
		//   11   23:return          
		}

		private final WeakReference a;

		a.b(a a1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			a = new WeakReference(((Object) (a1)));
		//    2    4:aload_0         
		//    3    5:new             #21  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #24  <Method void WeakReference(Object)>
		//    7   13:putfield        #26  <Field WeakReference a>
		//    8   16:return          
		}
	}

	private static class a.c extends a.a
	{

		public void a()
		{
			a a1 = (a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference a>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
		//    4   10:astore_1        
			if(a1 != null)
		//*   5   11:aload_1         
		//*   6   12:ifnull          23
				a1.a(8, ((Object) (null)), ((Bundle) (null)));
		//    7   15:aload_1         
		//    8   16:bipush          8
		//    9   18:aconst_null     
		//   10   19:aconst_null     
		//   11   20:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
		//   12   23:return          
		}

		public void a(int i)
		{
			a a1 = (a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference a>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          26
				a1.a(9, ((Object) (Integer.valueOf(i))), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:bipush          9
		//    9   18:iload_1         
		//   10   19:invokestatic    #39  <Method Integer Integer.valueOf(int)>
		//   11   22:aconst_null     
		//   12   23:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
		//   13   26:return          
		}

		public void a(Bundle bundle)
		{
			a a1 = (a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference a>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          23
				a1.a(7, ((Object) (bundle)), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:bipush          7
		//    9   18:aload_1         
		//   10   19:aconst_null     
		//   11   20:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
		//   12   23:return          
		}

		public void a(MediaMetadataCompat mediametadatacompat)
		{
			a a1 = (a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference a>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          22
				a1.a(3, ((Object) (mediametadatacompat)), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:iconst_3        
		//    9   17:aload_1         
		//   10   18:aconst_null     
		//   11   19:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
		//   12   22:return          
		}

		public void a(ParcelableVolumeInfo parcelablevolumeinfo)
		{
			a a1 = (a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference a>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          59
			{
				if(parcelablevolumeinfo != null)
		//*   7   15:aload_1         
		//*   8   16:ifnull          50
					parcelablevolumeinfo = ((ParcelableVolumeInfo) (new f(parcelablevolumeinfo.a, parcelablevolumeinfo.b, parcelablevolumeinfo.c, parcelablevolumeinfo.d, parcelablevolumeinfo.e)));
		//    9   19:new             #44  <Class MediaControllerCompat$f>
		//   10   22:dup             
		//   11   23:aload_1         
		//   12   24:getfield        #49  <Field int ParcelableVolumeInfo.a>
		//   13   27:aload_1         
		//   14   28:getfield        #52  <Field int ParcelableVolumeInfo.b>
		//   15   31:aload_1         
		//   16   32:getfield        #54  <Field int ParcelableVolumeInfo.c>
		//   17   35:aload_1         
		//   18   36:getfield        #57  <Field int ParcelableVolumeInfo.d>
		//   19   39:aload_1         
		//   20   40:getfield        #60  <Field int ParcelableVolumeInfo.e>
		//   21   43:invokespecial   #63  <Method void MediaControllerCompat$f(int, int, int, int, int)>
		//   22   46:astore_1        
				else
		//*  23   47:goto            52
					parcelablevolumeinfo = null;
		//   24   50:aconst_null     
		//   25   51:astore_1        
				a1.a(4, ((Object) (parcelablevolumeinfo)), ((Bundle) (null)));
		//   26   52:aload_2         
		//   27   53:iconst_4        
		//   28   54:aload_1         
		//   29   55:aconst_null     
		//   30   56:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
			}
		//   31   59:return          
		}

		public void a(PlaybackStateCompat playbackstatecompat)
		{
			a a1 = (a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference a>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          22
				a1.a(2, ((Object) (playbackstatecompat)), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:iconst_2        
		//    9   17:aload_1         
		//   10   18:aconst_null     
		//   11   19:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
		//   12   22:return          
		}

		public void a(CharSequence charsequence)
		{
			a a1 = (a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference a>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          23
				a1.a(6, ((Object) (charsequence)), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:bipush          6
		//    9   18:aload_1         
		//   10   19:aconst_null     
		//   11   20:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
		//   12   23:return          
		}

		public void a(String s, Bundle bundle)
		{
			a a1 = (a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference a>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
		//    4   10:astore_3        
			if(a1 != null)
		//*   5   11:aload_3         
		//*   6   12:ifnull          22
				a1.a(1, ((Object) (s)), bundle);
		//    7   15:aload_3         
		//    8   16:iconst_1        
		//    9   17:aload_1         
		//   10   18:aload_2         
		//   11   19:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
		//   12   22:return          
		}

		public void a(List list)
		{
			a a1 = (a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference a>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          22
				a1.a(5, ((Object) (list)), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:iconst_5        
		//    9   17:aload_1         
		//   10   18:aconst_null     
		//   11   19:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
		//   12   22:return          
		}

		public void a(boolean flag)
		{
			a a1 = (a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference a>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          26
				a1.a(10, ((Object) (Boolean.valueOf(flag))), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:bipush          10
		//    9   18:iload_1         
		//   10   19:invokestatic    #75  <Method Boolean Boolean.valueOf(boolean)>
		//   11   22:aconst_null     
		//   12   23:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
		//   13   26:return          
		}

		public void b(int i)
		{
			a a1 = (a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference a>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          26
				a1.a(12, ((Object) (Integer.valueOf(i))), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:bipush          12
		//    9   18:iload_1         
		//   10   19:invokestatic    #39  <Method Integer Integer.valueOf(int)>
		//   11   22:aconst_null     
		//   12   23:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
		//   13   26:return          
		}

		public void b(boolean flag)
		{
			a a1 = (a)a.get();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference a>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
		//    4   10:astore_2        
			if(a1 != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          26
				a1.a(11, ((Object) (Boolean.valueOf(flag))), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:bipush          11
		//    9   18:iload_1         
		//   10   19:invokestatic    #75  <Method Boolean Boolean.valueOf(boolean)>
		//   11   22:aconst_null     
		//   12   23:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
		//   13   26:return          
		}

		private final WeakReference a;

		a.c(a a1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void a$a()>
			a = new WeakReference(((Object) (a1)));
		//    2    4:aload_0         
		//    3    5:new             #19  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #22  <Method void WeakReference(Object)>
		//    7   13:putfield        #24  <Field WeakReference a>
		//    8   16:return          
		}
	}

	static interface b
	{

		public abstract boolean a(KeyEvent keyevent);
	}

	static class c extends MediaControllerImplApi21
	{

		public c(Context context, MediaSessionCompat.Token token)
		{
			super(context, token);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #11  <Method void MediaControllerCompat$MediaControllerImplApi21(Context, MediaSessionCompat$Token)>
		//    4    6:return          
		}
	}

	static class d extends c
	{

		public d(Context context, MediaSessionCompat.Token token)
		{
			super(context, token);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #11  <Method void MediaControllerCompat$c(Context, MediaSessionCompat$Token)>
		//    4    6:return          
		}
	}

	static class e
		implements b
	{

		public boolean a(KeyEvent keyevent)
		{
			if(keyevent == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       14
				throw new IllegalArgumentException("event may not be null.");
		//    2    4:new             #36  <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc1            #38  <String "event may not be null.">
		//    5   10:invokespecial   #41  <Method void IllegalArgumentException(String)>
		//    6   13:athrow          
			try
			{
				a.a(keyevent);
		//    7   14:aload_0         
		//    8   15:getfield        #30  <Field b a>
		//    9   18:aload_1         
		//   10   19:invokeinterface #45  <Method boolean b.a(KeyEvent)>
		//   11   24:pop             
			}
		//*  12   25:goto            38
			// Misplaced declaration of an exception variable
			catch(KeyEvent keyevent)
		//*  13   28:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", ((Throwable) (keyevent)));
		//   14   29:ldc1            #47  <String "MediaControllerCompat">
		//   15   31:ldc1            #49  <String "Dead object in dispatchMediaButtonEvent.">
		//   16   33:aload_1         
		//   17   34:invokestatic    #54  <Method int Log.e(String, String, Throwable)>
		//   18   37:pop             
			}
			return false;
		//   19   38:iconst_0        
		//   20   39:ireturn         
		}

		private android.support.v4.media.session.b a;

		public e(MediaSessionCompat.Token token)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			a = android.support.v4.media.session.b.a.a((IBinder)token.a());
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #21  <Method Object MediaSessionCompat$Token.a()>
		//    5    9:checkcast       #23  <Class IBinder>
		//    6   12:invokestatic    #28  <Method b b$a.a(IBinder)>
		//    7   15:putfield        #30  <Field b a>
		//    8   18:return          
		}
	}

	public static final class f
	{

		private final int a;
		private final int b;
		private final int c;
		private final int d;
		private final int e;

		f(int i, int j, int k, int l, int i1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			a = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #20  <Field int a>
			b = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #22  <Field int b>
			c = k;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #24  <Field int c>
			d = l;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #26  <Field int d>
			e = i1;
		//   14   25:aload_0         
		//   15   26:iload           5
		//   16   28:putfield        #28  <Field int e>
		//   17   31:return          
		}
	}


	public MediaControllerCompat(Context context, MediaSessionCompat.Token token)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #47  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #48  <Method void HashSet()>
	//    6   12:putfield        #50  <Field HashSet c>
		if(token == null)
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       29
			throw new IllegalArgumentException("sessionToken must not be null");
	//    9   19:new             #52  <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc1            #54  <String "sessionToken must not be null">
	//   12   25:invokespecial   #57  <Method void IllegalArgumentException(String)>
	//   13   28:athrow          
		b = token;
	//   14   29:aload_0         
	//   15   30:aload_2         
	//   16   31:putfield        #59  <Field MediaSessionCompat$Token b>
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  17   34:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//*  18   37:bipush          24
	//*  19   39:icmplt          58
			context = ((Context) (new d(context, token)));
	//   20   42:new             #29  <Class MediaControllerCompat$d>
	//   21   45:dup             
	//   22   46:aload_1         
	//   23   47:aload_2         
	//   24   48:invokespecial   #67  <Method void MediaControllerCompat$d(Context, MediaSessionCompat$Token)>
	//   25   51:astore_1        
		else
	//*  26   52:aload_0         
	//*  27   53:aload_1         
	//*  28   54:putfield        #69  <Field MediaControllerCompat$b a>
	//*  29   57:return          
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  30   58:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//*  31   61:bipush          23
	//*  32   63:icmplt          79
			context = ((Context) (new c(context, token)));
	//   33   66:new             #27  <Class MediaControllerCompat$c>
	//   34   69:dup             
	//   35   70:aload_1         
	//   36   71:aload_2         
	//   37   72:invokespecial   #70  <Method void MediaControllerCompat$c(Context, MediaSessionCompat$Token)>
	//   38   75:astore_1        
		else
	//*  39   76:goto            52
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  40   79:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//*  41   82:bipush          21
	//*  42   84:icmplt          100
		{
			context = ((Context) (new MediaControllerImplApi21(context, token)));
	//   43   87:new             #6   <Class MediaControllerCompat$MediaControllerImplApi21>
	//   44   90:dup             
	//   45   91:aload_1         
	//   46   92:aload_2         
	//   47   93:invokespecial   #71  <Method void MediaControllerCompat$MediaControllerImplApi21(Context, MediaSessionCompat$Token)>
	//   48   96:astore_1        
		} else
	//*  49   97:goto            52
		{
			a = ((b) (new e(b)));
	//   50  100:aload_0         
	//   51  101:new             #32  <Class MediaControllerCompat$e>
	//   52  104:dup             
	//   53  105:aload_0         
	//   54  106:getfield        #59  <Field MediaSessionCompat$Token b>
	//   55  109:invokespecial   #74  <Method void MediaControllerCompat$e(MediaSessionCompat$Token)>
	//   56  112:putfield        #69  <Field MediaControllerCompat$b a>
			return;
	//   57  115:return          
		}
		a = ((b) (context));
	}

	public boolean a(KeyEvent keyevent)
	{
		if(keyevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("KeyEvent may not be null");
	//    2    4:new             #52  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #78  <String "KeyEvent may not be null">
	//    5   10:invokespecial   #57  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return a.a(keyevent);
	//    7   14:aload_0         
	//    8   15:getfield        #69  <Field MediaControllerCompat$b a>
	//    9   18:aload_1         
	//   10   19:invokeinterface #80  <Method boolean MediaControllerCompat$b.a(KeyEvent)>
	//   11   24:ireturn         
	}

	private final b a;
	private final MediaSessionCompat.Token b;
	private final HashSet c = new HashSet();
}
