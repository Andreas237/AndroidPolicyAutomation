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
//			MediaControllerCompat, c, b, ParcelableVolumeInfo

static class MediaControllerCompat$MediaControllerImplApi21
	implements MediaControllerCompat.b
{
	private static class ExtraBinderRequestResultReceiver extends ResultReceiver
	{

		protected void onReceiveResult(int i, Bundle bundle)
		{
			MediaControllerCompat.MediaControllerImplApi21 mediacontrollerimplapi21 = (MediaControllerCompat.MediaControllerImplApi21)a.get();
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
				MediaControllerCompat.MediaControllerImplApi21.a(mediacontrollerimplapi21, android.support.v4.media.session.b.a.a(BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
		//   10   20:aload_3         
		//   11   21:aload_2         
		//   12   22:ldc1            #34  <String "android.support.v4.media.session.EXTRA_BINDER">
		//   13   24:invokestatic    #40  <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
		//   14   27:invokestatic    #45  <Method b b$a.a(android.os.IBinder)>
		//   15   30:invokestatic    #48  <Method b MediaControllerCompat$MediaControllerImplApi21.a(MediaControllerCompat$MediaControllerImplApi21, b)>
		//   16   33:pop             
				MediaControllerCompat.MediaControllerImplApi21.a(mediacontrollerimplapi21);
		//   17   34:aload_3         
		//   18   35:invokestatic    #51  <Method void MediaControllerCompat$MediaControllerImplApi21.a(MediaControllerCompat$MediaControllerImplApi21)>
			}
		//   19   38:return          
		}

		private WeakReference a;

		public ExtraBinderRequestResultReceiver(MediaControllerCompat.MediaControllerImplApi21 mediacontrollerimplapi21, Handler handler)
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

	private static class a extends MediaControllerCompat.a.c
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

		a(MediaControllerCompat.a a1)
		{
			super(a1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #14  <Method void MediaControllerCompat$a$c(MediaControllerCompat$a)>
		//    3    5:return          
		}
	}


	static b a(MediaControllerCompat$MediaControllerImplApi21 mediacontrollercompat$mediacontrollerimplapi21, b b1)
	{
		mediacontrollercompat$mediacontrollerimplapi21.c = b1;
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

	static void a(MediaControllerCompat$MediaControllerImplApi21 mediacontrollercompat$mediacontrollerimplapi21)
	{
		mediacontrollercompat$mediacontrollerimplapi21.b();
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
		MediaControllerCompat.a a1 = (MediaControllerCompat.a)iterator.next();
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
	private b c;
	private HashMap d;

	public MediaControllerCompat$MediaControllerImplApi21(Context context, MediaSessionCompat.Token token)
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
