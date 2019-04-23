// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.HashSet;

// Referenced classes of package android.support.v4.media.session:
//			p, o, q, MediaSessionCompat, 
//			m, i, s, PlaybackStateCompat

public final class MediaControllerCompat
{

	public MediaControllerCompat(Context context, MediaSessionCompat.Token token)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		c = new HashSet();
	//    2    4:aload_0         
	//    3    5:new             #17  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void HashSet()>
	//    6   12:putfield        #20  <Field HashSet c>
		if(token != null)
	//*   7   15:aload_2         
	//*   8   16:ifnull          103
		{
			b = token;
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:putfield        #22  <Field MediaSessionCompat$Token b>
			if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  12   24:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*  13   27:bipush          24
	//*  14   29:icmplt          46
			{
				a = ((m) (new p(context, token)));
	//   15   32:aload_0         
	//   16   33:new             #30  <Class p>
	//   17   36:dup             
	//   18   37:aload_1         
	//   19   38:aload_2         
	//   20   39:invokespecial   #32  <Method void p(Context, MediaSessionCompat$Token)>
	//   21   42:putfield        #34  <Field m a>
				return;
	//   22   45:return          
			}
			if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  23   46:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*  24   49:bipush          23
	//*  25   51:icmplt          68
			{
				a = ((m) (new o(context, token)));
	//   26   54:aload_0         
	//   27   55:new             #36  <Class o>
	//   28   58:dup             
	//   29   59:aload_1         
	//   30   60:aload_2         
	//   31   61:invokespecial   #37  <Method void o(Context, MediaSessionCompat$Token)>
	//   32   64:putfield        #34  <Field m a>
				return;
	//   33   67:return          
			}
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  34   68:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*  35   71:bipush          21
	//*  36   73:icmplt          90
			{
				a = ((m) (new MediaControllerImplApi21(context, token)));
	//   37   76:aload_0         
	//   38   77:new             #39  <Class MediaControllerCompat$MediaControllerImplApi21>
	//   39   80:dup             
	//   40   81:aload_1         
	//   41   82:aload_2         
	//   42   83:invokespecial   #40  <Method void MediaControllerCompat$MediaControllerImplApi21(Context, MediaSessionCompat$Token)>
	//   43   86:putfield        #34  <Field m a>
				return;
	//   44   89:return          
			} else
			{
				a = ((m) (new q(token)));
	//   45   90:aload_0         
	//   46   91:new             #42  <Class q>
	//   47   94:dup             
	//   48   95:aload_2         
	//   49   96:invokespecial   #45  <Method void q(MediaSessionCompat$Token)>
	//   50   99:putfield        #34  <Field m a>
				return;
	//   51  102:return          
			}
		} else
		{
			throw new IllegalArgumentException("sessionToken must not be null");
	//   52  103:new             #47  <Class IllegalArgumentException>
	//   53  106:dup             
	//   54  107:ldc1            #49  <String "sessionToken must not be null">
	//   55  109:invokespecial   #52  <Method void IllegalArgumentException(String)>
	//   56  112:athrow          
		}
	}

	public MediaControllerCompat(Context context, MediaSessionCompat mediasessioncompat)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		c = new HashSet();
	//    2    4:aload_0         
	//    3    5:new             #17  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void HashSet()>
	//    6   12:putfield        #20  <Field HashSet c>
		if(mediasessioncompat == null)
			break MISSING_BLOCK_LABEL_134;
	//    7   15:aload_2         
	//    8   16:ifnull          134
		b = mediasessioncompat.c();
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #61  <Method MediaSessionCompat$Token MediaSessionCompat.c()>
	//   12   24:putfield        #22  <Field MediaSessionCompat$Token b>
		mediasessioncompat = null;
	//   13   27:aconst_null     
	//   14   28:astore_2        
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  15   29:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   32:bipush          24
	//*  17   34:icmplt          53
		{
			context = ((Context) (new p(context, b)));
	//   18   37:new             #30  <Class p>
	//   19   40:dup             
	//   20   41:aload_1         
	//   21   42:aload_0         
	//   22   43:getfield        #22  <Field MediaSessionCompat$Token b>
	//   23   46:invokespecial   #32  <Method void p(Context, MediaSessionCompat$Token)>
	//   24   49:astore_1        
			break MISSING_BLOCK_LABEL_128;
	//   25   50:goto            128
		}
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  26   53:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*  27   56:bipush          23
	//*  28   58:icmplt          77
		{
			context = ((Context) (new o(context, b)));
	//   29   61:new             #36  <Class o>
	//   30   64:dup             
	//   31   65:aload_1         
	//   32   66:aload_0         
	//   33   67:getfield        #22  <Field MediaSessionCompat$Token b>
	//   34   70:invokespecial   #37  <Method void o(Context, MediaSessionCompat$Token)>
	//   35   73:astore_1        
			break MISSING_BLOCK_LABEL_128;
	//   36   74:goto            128
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  37   77:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*  38   80:bipush          21
	//*  39   82:icmplt          101
		{
			context = ((Context) (new MediaControllerImplApi21(context, b)));
	//   40   85:new             #39  <Class MediaControllerCompat$MediaControllerImplApi21>
	//   41   88:dup             
	//   42   89:aload_1         
	//   43   90:aload_0         
	//   44   91:getfield        #22  <Field MediaSessionCompat$Token b>
	//   45   94:invokespecial   #40  <Method void MediaControllerCompat$MediaControllerImplApi21(Context, MediaSessionCompat$Token)>
	//   46   97:astore_1        
			break MISSING_BLOCK_LABEL_128;
	//   47   98:goto            128
		}
		try
		{
			context = ((Context) (new q(b)));
	//   48  101:new             #42  <Class q>
	//   49  104:dup             
	//   50  105:aload_0         
	//   51  106:getfield        #22  <Field MediaSessionCompat$Token b>
	//   52  109:invokespecial   #45  <Method void q(MediaSessionCompat$Token)>
	//   53  112:astore_1        
		}
	//*  54  113:goto            128
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  55  116:astore_1        
		{
			Log.w("MediaControllerCompat", "Failed to create MediaControllerImpl.", ((Throwable) (context)));
	//   56  117:ldc1            #63  <String "MediaControllerCompat">
	//   57  119:ldc1            #65  <String "Failed to create MediaControllerImpl.">
	//   58  121:aload_1         
	//   59  122:invokestatic    #71  <Method int Log.w(String, String, Throwable)>
	//   60  125:pop             
			context = ((Context) (mediasessioncompat));
	//   61  126:aload_2         
	//   62  127:astore_1        
		}
		a = ((m) (context));
	//   63  128:aload_0         
	//   64  129:aload_1         
	//   65  130:putfield        #34  <Field m a>
		return;
	//   66  133:return          
		throw new IllegalArgumentException("session must not be null");
	//   67  134:new             #47  <Class IllegalArgumentException>
	//   68  137:dup             
	//   69  138:ldc1            #73  <String "session must not be null">
	//   70  140:invokespecial   #52  <Method void IllegalArgumentException(String)>
	//   71  143:athrow          
	}

	public s a()
	{
		return a.a();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field m a>
	//    2    4:invokeinterface #78  <Method s m.a()>
	//    3    9:areturn         
	}

	public void a(i j)
	{
		a(j, ((Handler) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #82  <Method void a(i, Handler)>
	//    4    6:return          
	}

	public void a(i j, Handler handler)
	{
		if(j != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          44
		{
			Handler handler1 = handler;
	//    2    4:aload_2         
	//    3    5:astore_3        
			if(handler == null)
	//*   4    6:aload_2         
	//*   5    7:ifnonnull       18
				handler1 = new Handler();
	//    6   10:new             #84  <Class Handler>
	//    7   13:dup             
	//    8   14:invokespecial   #85  <Method void Handler()>
	//    9   17:astore_3        
			j.setHandler(handler1);
	//   10   18:aload_1         
	//   11   19:aload_3         
	//   12   20:invokevirtual   #91  <Method void i.setHandler(Handler)>
			a.a(j, handler1);
	//   13   23:aload_0         
	//   14   24:getfield        #34  <Field m a>
	//   15   27:aload_1         
	//   16   28:aload_3         
	//   17   29:invokeinterface #92  <Method void m.a(i, Handler)>
			c.add(((Object) (j)));
	//   18   34:aload_0         
	//   19   35:getfield        #20  <Field HashSet c>
	//   20   38:aload_1         
	//   21   39:invokevirtual   #96  <Method boolean HashSet.add(Object)>
	//   22   42:pop             
			return;
	//   23   43:return          
		} else
		{
			throw new IllegalArgumentException("callback must not be null");
	//   24   44:new             #47  <Class IllegalArgumentException>
	//   25   47:dup             
	//   26   48:ldc1            #98  <String "callback must not be null">
	//   27   50:invokespecial   #52  <Method void IllegalArgumentException(String)>
	//   28   53:athrow          
		}
	}

	public boolean a(KeyEvent keyevent)
	{
		if(keyevent != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
			return a.a(keyevent);
	//    2    4:aload_0         
	//    3    5:getfield        #34  <Field m a>
	//    4    8:aload_1         
	//    5    9:invokeinterface #101 <Method boolean m.a(KeyEvent)>
	//    6   14:ireturn         
		else
			throw new IllegalArgumentException("KeyEvent may not be null");
	//    7   15:new             #47  <Class IllegalArgumentException>
	//    8   18:dup             
	//    9   19:ldc1            #103 <String "KeyEvent may not be null">
	//   10   21:invokespecial   #52  <Method void IllegalArgumentException(String)>
	//   11   24:athrow          
	}

	public PlaybackStateCompat b()
	{
		return a.b();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field m a>
	//    2    4:invokeinterface #106 <Method PlaybackStateCompat m.b()>
	//    3    9:areturn         
	}

	public void b(i j)
	{
		if(j == null)
			break MISSING_BLOCK_LABEL_37;
	//    0    0:aload_1         
	//    1    1:ifnull          37
		c.remove(((Object) (j)));
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field HashSet c>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #109 <Method boolean HashSet.remove(Object)>
	//    6   12:pop             
		a.a(j);
	//    7   13:aload_0         
	//    8   14:getfield        #34  <Field m a>
	//    9   17:aload_1         
	//   10   18:invokeinterface #111 <Method void m.a(i)>
		j.setHandler(((Handler) (null)));
	//   11   23:aload_1         
	//   12   24:aconst_null     
	//   13   25:invokevirtual   #91  <Method void i.setHandler(Handler)>
		return;
	//   14   28:return          
		Exception exception;
		exception;
	//   15   29:astore_2        
		j.setHandler(((Handler) (null)));
	//   16   30:aload_1         
	//   17   31:aconst_null     
	//   18   32:invokevirtual   #91  <Method void i.setHandler(Handler)>
		throw exception;
	//   19   35:aload_2         
	//   20   36:athrow          
		throw new IllegalArgumentException("callback must not be null");
	//   21   37:new             #47  <Class IllegalArgumentException>
	//   22   40:dup             
	//   23   41:ldc1            #98  <String "callback must not be null">
	//   24   43:invokespecial   #52  <Method void IllegalArgumentException(String)>
	//   25   46:athrow          
	}

	public MediaMetadataCompat c()
	{
		return a.c();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field m a>
	//    2    4:invokeinterface #114 <Method MediaMetadataCompat m.c()>
	//    3    9:areturn         
	}

	public PendingIntent d()
	{
		return a.d();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field m a>
	//    2    4:invokeinterface #118 <Method PendingIntent m.d()>
	//    3    9:areturn         
	}

	public MediaSessionCompat.Token e()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MediaSessionCompat$Token b>
	//    2    4:areturn         
	}

	private final m a;
	private final MediaSessionCompat.Token b;
	private final HashSet c;

	private class MediaControllerImplApi21
		implements m
	{

		private void f()
		{
			class ExtraBinderRequestResultReceiver extends ResultReceiver
			{

				protected void onReceiveResult(int j, Bundle bundle)
				{
					MediaControllerImplApi21 mediacontrollerimplapi21 = (MediaControllerImplApi21)a.get();
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field WeakReference a>
				//    2    4:invokevirtual   #25  <Method Object WeakReference.get()>
				//    3    7:checkcast       #27  <Class MediaControllerCompat$MediaControllerImplApi21>
				//    4   10:astore          4
					if(mediacontrollerimplapi21 != null)
				//*   5   12:aload           4
				//*   6   14:ifnull          74
					{
						if(bundle == null)
				//*   7   17:aload_2         
				//*   8   18:ifnonnull       22
							return;
				//    9   21:return          
						synchronized(mediacontrollerimplapi21.b)
				//*  10   22:aload           4
				//*  11   24:getfield        #31  <Field Object MediaControllerCompat$MediaControllerImplApi21.b>
				//*  12   27:astore_3        
				//*  13   28:aload_3         
				//*  14   29:monitorenter    
						{
							mediacontrollerimplapi21.c.a(android.support.v4.media.session.e.a(m.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
				//   15   30:aload           4
				//   16   32:getfield        #35  <Field MediaSessionCompat$Token MediaControllerCompat$MediaControllerImplApi21.c>
				//   17   35:aload_2         
				//   18   36:ldc1            #37  <String "android.support.v4.media.session.EXTRA_BINDER">
				//   19   38:invokestatic    #42  <Method android.os.IBinder m.a(Bundle, String)>
				//   20   41:invokestatic    #47  <Method d e.a(android.os.IBinder)>
				//   21   44:invokevirtual   #52  <Method void MediaSessionCompat$Token.a(d)>
							mediacontrollerimplapi21.c.a(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
				//   22   47:aload           4
				//   23   49:getfield        #35  <Field MediaSessionCompat$Token MediaControllerCompat$MediaControllerImplApi21.c>
				//   24   52:aload_2         
				//   25   53:ldc1            #54  <String "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE">
				//   26   55:invokevirtual   #60  <Method Bundle Bundle.getBundle(String)>
				//   27   58:invokevirtual   #63  <Method void MediaSessionCompat$Token.a(Bundle)>
							mediacontrollerimplapi21.e();
				//   28   61:aload           4
				//   29   63:invokevirtual   #67  <Method void MediaControllerCompat$MediaControllerImplApi21.e()>
						}
				//   30   66:aload_3         
				//   31   67:monitorexit     
						return;
				//   32   68:return          
					} else
				//*  33   69:astore_2        
				//*  34   70:aload_3         
				//*  35   71:monitorexit     
				//*  36   72:aload_2         
				//*  37   73:athrow          
					{
						return;
				//   38   74:return          
					}
					bundle;
					obj;
					JVM INSTR monitorexit ;
					throw bundle;
				}

				private WeakReference a;

				ExtraBinderRequestResultReceiver()
				{
					super(((Handler) (null)));
				//    0    0:aload_0         
				//    1    1:aconst_null     
				//    2    2:invokespecial   #11  <Method void ResultReceiver(Handler)>
					a = new WeakReference(((Object) (MediaControllerImplApi21.this)));
				//    3    5:aload_0         
				//    4    6:new             #13  <Class WeakReference>
				//    5    9:dup             
				//    6   10:aload_1         
				//    7   11:invokespecial   #16  <Method void WeakReference(Object)>
				//    8   14:putfield        #18  <Field WeakReference a>
				//    9   17:return          
				}
			}

			a("android.support.v4.media.session.command.GET_EXTRA_BINDER", ((Bundle) (null)), ((ResultReceiver) (new ExtraBinderRequestResultReceiver())));
		//    0    0:aload_0         
		//    1    1:ldc1            #58  <String "android.support.v4.media.session.command.GET_EXTRA_BINDER">
		//    2    3:aconst_null     
		//    3    4:new             #60  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver>
		//    4    7:dup             
		//    5    8:aload_0         
		//    6    9:invokespecial   #63  <Method void MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(MediaControllerCompat$MediaControllerImplApi21)>
		//    7   12:invokevirtual   #66  <Method void a(String, Bundle, ResultReceiver)>
		//    8   15:return          
		}

		public s a()
		{
			Object obj = x.a(a);
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field Object a>
		//    2    4:invokestatic    #70  <Method Object x.a(Object)>
		//    3    7:astore_1        
			if(obj != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          21
				return ((s) (new t(obj)));
		//    6   12:new             #72  <Class t>
		//    7   15:dup             
		//    8   16:aload_1         
		//    9   17:invokespecial   #75  <Method void t(Object)>
		//   10   20:areturn         
			else
				return null;
		//   11   21:aconst_null     
		//   12   22:areturn         
		}

		public final void a(i j)
		{
			x.a(a, j.mCallbackObj);
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field Object a>
		//    2    4:aload_1         
		//    3    5:getfield        #81  <Field Object i.mCallbackObj>
		//    4    8:invokestatic    #84  <Method void x.a(Object, Object)>
			Object obj = b;
		//    5   11:aload_0         
		//    6   12:getfield        #22  <Field Object b>
		//    7   15:astore_2        
			obj;
		//    8   16:aload_2         
			JVM INSTR monitorenter ;
		//    9   17:monitorenter    
			Object obj1 = ((Object) (c.b()));
		//   10   18:aload_0         
		//   11   19:getfield        #34  <Field MediaSessionCompat$Token c>
		//   12   22:invokevirtual   #49  <Method d MediaSessionCompat$Token.b()>
		//   13   25:astore_3        
			if(obj1 == null)
				break MISSING_BLOCK_LABEL_80;
		//   14   26:aload_3         
		//   15   27:ifnull          80
			obj1 = ((Object) ((n)e.remove(((Object) (j)))));
		//   16   30:aload_0         
		//   17   31:getfield        #32  <Field HashMap e>
		//   18   34:aload_1         
		//   19   35:invokevirtual   #87  <Method Object HashMap.remove(Object)>
		//   20   38:checkcast       #89  <Class n>
		//   21   41:astore_3        
			if(obj1 == null)
				break MISSING_BLOCK_LABEL_91;
		//   22   42:aload_3         
		//   23   43:ifnull          91
			try
			{
				j.mIControllerCallback = null;
		//   24   46:aload_1         
		//   25   47:aconst_null     
		//   26   48:putfield        #93  <Field a i.mIControllerCallback>
				c.b().b(((a) (obj1)));
		//   27   51:aload_0         
		//   28   52:getfield        #34  <Field MediaSessionCompat$Token c>
		//   29   55:invokevirtual   #49  <Method d MediaSessionCompat$Token.b()>
		//   30   58:aload_3         
		//   31   59:invokeinterface #98  <Method void d.b(a)>
				break MISSING_BLOCK_LABEL_91;
		//   32   64:goto            91
			}
			// Misplaced declaration of an exception variable
			catch(i j) { }
		//   33   67:astore_1        
			Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", ((Throwable) (j)));
		//   34   68:ldc1            #100 <String "MediaControllerCompat">
		//   35   70:ldc1            #102 <String "Dead object in unregisterCallback.">
		//   36   72:aload_1         
		//   37   73:invokestatic    #107 <Method int Log.e(String, String, Throwable)>
		//   38   76:pop             
			break MISSING_BLOCK_LABEL_91;
		//   39   77:goto            91
			d.remove(((Object) (j)));
		//   40   80:aload_0         
		//   41   81:getfield        #27  <Field List d>
		//   42   84:aload_1         
		//   43   85:invokeinterface #112 <Method boolean List.remove(Object)>
		//   44   90:pop             
			obj;
		//   45   91:aload_2         
			JVM INSTR monitorexit ;
		//   46   92:monitorexit     
			return;
		//   47   93:return          
			j;
		//   48   94:astore_1        
			obj;
		//   49   95:aload_2         
			JVM INSTR monitorexit ;
		//   50   96:monitorexit     
			throw j;
		//   51   97:aload_1         
		//   52   98:athrow          
		}

		public final void a(i j, Handler handler)
		{
			x.a(a, j.mCallbackObj, handler);
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field Object a>
		//    2    4:aload_1         
		//    3    5:getfield        #81  <Field Object i.mCallbackObj>
		//    4    8:aload_2         
		//    5    9:invokestatic    #116 <Method void x.a(Object, Object, Handler)>
			handler = ((Handler) (b));
		//    6   12:aload_0         
		//    7   13:getfield        #22  <Field Object b>
		//    8   16:astore_2        
			handler;
		//    9   17:aload_2         
			JVM INSTR monitorenter ;
		//   10   18:monitorenter    
			n n1;
			if(c.b() == null)
				break MISSING_BLOCK_LABEL_90;
		//   11   19:aload_0         
		//   12   20:getfield        #34  <Field MediaSessionCompat$Token c>
		//   13   23:invokevirtual   #49  <Method d MediaSessionCompat$Token.b()>
		//   14   26:ifnull          90
			n1 = new n(j);
		//   15   29:new             #89  <Class n>
		//   16   32:dup             
		//   17   33:aload_1         
		//   18   34:invokespecial   #118 <Method void n(i)>
		//   19   37:astore_3        
			e.put(((Object) (j)), ((Object) (n1)));
		//   20   38:aload_0         
		//   21   39:getfield        #32  <Field HashMap e>
		//   22   42:aload_1         
		//   23   43:aload_3         
		//   24   44:invokevirtual   #122 <Method Object HashMap.put(Object, Object)>
		//   25   47:pop             
			j.mIControllerCallback = ((a) (n1));
		//   26   48:aload_1         
		//   27   49:aload_3         
		//   28   50:putfield        #93  <Field a i.mIControllerCallback>
			try
			{
				c.b().a(((a) (n1)));
		//   29   53:aload_0         
		//   30   54:getfield        #34  <Field MediaSessionCompat$Token c>
		//   31   57:invokevirtual   #49  <Method d MediaSessionCompat$Token.b()>
		//   32   60:aload_3         
		//   33   61:invokeinterface #124 <Method void d.a(a)>
				j.postToHandler(13, ((Object) (null)), ((Bundle) (null)));
		//   34   66:aload_1         
		//   35   67:bipush          13
		//   36   69:aconst_null     
		//   37   70:aconst_null     
		//   38   71:invokevirtual   #128 <Method void i.postToHandler(int, Object, Bundle)>
				break MISSING_BLOCK_LABEL_106;
		//   39   74:goto            106
			}
			// Misplaced declaration of an exception variable
			catch(i j) { }
		//   40   77:astore_1        
			Log.e("MediaControllerCompat", "Dead object in registerCallback.", ((Throwable) (j)));
		//   41   78:ldc1            #100 <String "MediaControllerCompat">
		//   42   80:ldc1            #130 <String "Dead object in registerCallback.">
		//   43   82:aload_1         
		//   44   83:invokestatic    #107 <Method int Log.e(String, String, Throwable)>
		//   45   86:pop             
			break MISSING_BLOCK_LABEL_106;
		//   46   87:goto            106
			j.mIControllerCallback = null;
		//   47   90:aload_1         
		//   48   91:aconst_null     
		//   49   92:putfield        #93  <Field a i.mIControllerCallback>
			d.add(((Object) (j)));
		//   50   95:aload_0         
		//   51   96:getfield        #27  <Field List d>
		//   52   99:aload_1         
		//   53  100:invokeinterface #133 <Method boolean List.add(Object)>
		//   54  105:pop             
			handler;
		//   55  106:aload_2         
			JVM INSTR monitorexit ;
		//   56  107:monitorexit     
			return;
		//   57  108:return          
			j;
		//   58  109:astore_1        
			handler;
		//   59  110:aload_2         
			JVM INSTR monitorexit ;
		//   60  111:monitorexit     
			throw j;
		//   61  112:aload_1         
		//   62  113:athrow          
		}

		public void a(String s, Bundle bundle, ResultReceiver resultreceiver)
		{
			x.a(a, s, bundle, resultreceiver);
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field Object a>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokestatic    #136 <Method void x.a(Object, String, Bundle, ResultReceiver)>
		//    6   10:return          
		}

		public boolean a(KeyEvent keyevent)
		{
			return x.a(a, keyevent);
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field Object a>
		//    2    4:aload_1         
		//    3    5:invokestatic    #140 <Method boolean x.a(Object, KeyEvent)>
		//    4    8:ireturn         
		}

		public PlaybackStateCompat b()
		{
			if(c.b() == null)
				break MISSING_BLOCK_LABEL_35;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field MediaSessionCompat$Token c>
		//    2    4:invokevirtual   #49  <Method d MediaSessionCompat$Token.b()>
		//    3    7:ifnull          35
			PlaybackStateCompat playbackstatecompat = c.b().h();
		//    4   10:aload_0         
		//    5   11:getfield        #34  <Field MediaSessionCompat$Token c>
		//    6   14:invokevirtual   #49  <Method d MediaSessionCompat$Token.b()>
		//    7   17:invokeinterface #144 <Method PlaybackStateCompat d.h()>
		//    8   22:astore_1        
			return playbackstatecompat;
		//    9   23:aload_1         
		//   10   24:areturn         
			RemoteException remoteexception;
			remoteexception;
		//   11   25:astore_1        
			Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", ((Throwable) (remoteexception)));
		//   12   26:ldc1            #100 <String "MediaControllerCompat">
		//   13   28:ldc1            #146 <String "Dead object in getPlaybackState.">
		//   14   30:aload_1         
		//   15   31:invokestatic    #107 <Method int Log.e(String, String, Throwable)>
		//   16   34:pop             
			Object obj = x.b(a);
		//   17   35:aload_0         
		//   18   36:getfield        #46  <Field Object a>
		//   19   39:invokestatic    #148 <Method Object x.b(Object)>
		//   20   42:astore_1        
			if(obj != null)
		//*  21   43:aload_1         
		//*  22   44:ifnull          52
				return PlaybackStateCompat.a(obj);
		//   23   47:aload_1         
		//   24   48:invokestatic    #153 <Method PlaybackStateCompat PlaybackStateCompat.a(Object)>
		//   25   51:areturn         
			else
				return null;
		//   26   52:aconst_null     
		//   27   53:areturn         
		}

		public MediaMetadataCompat c()
		{
			Object obj = x.c(a);
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field Object a>
		//    2    4:invokestatic    #156 <Method Object x.c(Object)>
		//    3    7:astore_1        
			if(obj != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          17
				return MediaMetadataCompat.a(obj);
		//    6   12:aload_1         
		//    7   13:invokestatic    #161 <Method MediaMetadataCompat MediaMetadataCompat.a(Object)>
		//    8   16:areturn         
			else
				return null;
		//    9   17:aconst_null     
		//   10   18:areturn         
		}

		public PendingIntent d()
		{
			return x.d(a);
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field Object a>
		//    2    4:invokestatic    #165 <Method PendingIntent x.d(Object)>
		//    3    7:areturn         
		}

		void e()
		{
			Iterator iterator;
			if(c.b() == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #34  <Field MediaSessionCompat$Token c>
		//*   2    4:invokevirtual   #49  <Method d MediaSessionCompat$Token.b()>
		//*   3    7:ifnonnull       11
				return;
		//    4   10:return          
			iterator = d.iterator();
		//    5   11:aload_0         
		//    6   12:getfield        #27  <Field List d>
		//    7   15:invokeinterface #169 <Method Iterator List.iterator()>
		//    8   20:astore_1        
_L2:
			i j;
			n n1;
			if(!iterator.hasNext())
				break; /* Loop/switch isn't completed */
		//    9   21:aload_1         
		//   10   22:invokeinterface #175 <Method boolean Iterator.hasNext()>
		//   11   27:ifeq            98
			j = (i)iterator.next();
		//   12   30:aload_1         
		//   13   31:invokeinterface #178 <Method Object Iterator.next()>
		//   14   36:checkcast       #78  <Class i>
		//   15   39:astore_2        
			n1 = new n(j);
		//   16   40:new             #89  <Class n>
		//   17   43:dup             
		//   18   44:aload_2         
		//   19   45:invokespecial   #118 <Method void n(i)>
		//   20   48:astore_3        
			e.put(((Object) (j)), ((Object) (n1)));
		//   21   49:aload_0         
		//   22   50:getfield        #32  <Field HashMap e>
		//   23   53:aload_2         
		//   24   54:aload_3         
		//   25   55:invokevirtual   #122 <Method Object HashMap.put(Object, Object)>
		//   26   58:pop             
			j.mIControllerCallback = ((a) (n1));
		//   27   59:aload_2         
		//   28   60:aload_3         
		//   29   61:putfield        #93  <Field a i.mIControllerCallback>
			c.b().a(((a) (n1)));
		//   30   64:aload_0         
		//   31   65:getfield        #34  <Field MediaSessionCompat$Token c>
		//   32   68:invokevirtual   #49  <Method d MediaSessionCompat$Token.b()>
		//   33   71:aload_3         
		//   34   72:invokeinterface #124 <Method void d.a(a)>
			j.postToHandler(13, ((Object) (null)), ((Bundle) (null)));
		//   35   77:aload_2         
		//   36   78:bipush          13
		//   37   80:aconst_null     
		//   38   81:aconst_null     
		//   39   82:invokevirtual   #128 <Method void i.postToHandler(int, Object, Bundle)>
			if(true) goto _L2; else goto _L1
		//   40   85:goto            21
			RemoteException remoteexception;
			remoteexception;
		//   41   88:astore_1        
			Log.e("MediaControllerCompat", "Dead object in registerCallback.", ((Throwable) (remoteexception)));
		//   42   89:ldc1            #100 <String "MediaControllerCompat">
		//   43   91:ldc1            #130 <String "Dead object in registerCallback.">
		//   44   93:aload_1         
		//   45   94:invokestatic    #107 <Method int Log.e(String, String, Throwable)>
		//   46   97:pop             
_L1:
			d.clear();
		//   47   98:aload_0         
		//   48   99:getfield        #27  <Field List d>
		//   49  102:invokeinterface #181 <Method void List.clear()>
			return;
		//   50  107:return          
		}

		protected final Object a;
		final Object b = new Object();
		final MediaSessionCompat.Token c;
		private final List d = new ArrayList();
		private HashMap e;

		public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #4   <Class Object>
		//    4    8:dup             
		//    5    9:invokespecial   #20  <Method void Object()>
		//    6   12:putfield        #22  <Field Object b>
		//    7   15:aload_0         
		//    8   16:new             #24  <Class ArrayList>
		//    9   19:dup             
		//   10   20:invokespecial   #25  <Method void ArrayList()>
		//   11   23:putfield        #27  <Field List d>
			e = new HashMap();
		//   12   26:aload_0         
		//   13   27:new             #29  <Class HashMap>
		//   14   30:dup             
		//   15   31:invokespecial   #30  <Method void HashMap()>
		//   16   34:putfield        #32  <Field HashMap e>
			c = token;
		//   17   37:aload_0         
		//   18   38:aload_2         
		//   19   39:putfield        #34  <Field MediaSessionCompat$Token c>
			a = x.a(context, c.a());
		//   20   42:aload_0         
		//   21   43:aload_1         
		//   22   44:aload_0         
		//   23   45:getfield        #34  <Field MediaSessionCompat$Token c>
		//   24   48:invokevirtual   #39  <Method Object MediaSessionCompat$Token.a()>
		//   25   51:invokestatic    #44  <Method Object x.a(Context, Object)>
		//   26   54:putfield        #46  <Field Object a>
			if(a != null)
		//*  27   57:aload_0         
		//*  28   58:getfield        #46  <Field Object a>
		//*  29   61:ifnull          79
			{
				if(c.b() == null)
		//*  30   64:aload_0         
		//*  31   65:getfield        #34  <Field MediaSessionCompat$Token c>
		//*  32   68:invokevirtual   #49  <Method d MediaSessionCompat$Token.b()>
		//*  33   71:ifnonnull       78
					f();
		//   34   74:aload_0         
		//   35   75:invokespecial   #52  <Method void f()>
				return;
		//   36   78:return          
			} else
			{
				throw new RemoteException();
		//   37   79:new             #54  <Class RemoteException>
		//   38   82:dup             
		//   39   83:invokespecial   #55  <Method void RemoteException()>
		//   40   86:athrow          
			}
		}
	}

}
