// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.offlinemap;

import android.content.Context;
import android.os.Handler;
import com.amap.api.mapcore.util.*;
import com.amap.api.maps.AMap;
import com.amap.api.maps.AMapException;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.amap.api.maps.offlinemap:
//			OfflineMapProvince, OfflineMapCity

public final class OfflineMapManager
{
	public static interface OfflineLoadedListener
	{

		public abstract void onVerifyComplete();
	}

	public static interface OfflineMapDownloadListener
	{

		public abstract void onCheckUpdate(boolean flag, String s);

		public abstract void onDownload(int i, int j, String s);

		public abstract void onRemove(boolean flag, String s, String s1);
	}


	public OfflineMapManager(Context context, OfflineMapDownloadListener offlinemapdownloadlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		d = offlinemapdownloadlistener;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #44  <Field OfflineMapManager$OfflineMapDownloadListener d>
		c = context.getApplicationContext();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #50  <Method Context Context.getApplicationContext()>
	//    8   14:putfield        #52  <Field Context c>
		f = new Handler(c.getMainLooper());
	//    9   17:aload_0         
	//   10   18:new             #54  <Class Handler>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:getfield        #52  <Field Context c>
	//   14   26:invokevirtual   #58  <Method android.os.Looper Context.getMainLooper()>
	//   15   29:invokespecial   #61  <Method void Handler(android.os.Looper)>
	//   16   32:putfield        #63  <Field Handler f>
		g = new Handler(c.getMainLooper());
	//   17   35:aload_0         
	//   18   36:new             #54  <Class Handler>
	//   19   39:dup             
	//   20   40:aload_0         
	//   21   41:getfield        #52  <Field Context c>
	//   22   44:invokevirtual   #58  <Method android.os.Looper Context.getMainLooper()>
	//   23   47:invokespecial   #61  <Method void Handler(android.os.Looper)>
	//   24   50:putfield        #65  <Field Handler g>
		a(context);
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:invokespecial   #68  <Method void a(Context)>
	//   28   58:return          
	}

	public OfflineMapManager(Context context, OfflineMapDownloadListener offlinemapdownloadlistener, AMap amap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		d = offlinemapdownloadlistener;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #44  <Field OfflineMapManager$OfflineMapDownloadListener d>
		c = context.getApplicationContext();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #50  <Method Context Context.getApplicationContext()>
	//    8   14:putfield        #52  <Field Context c>
		f = new Handler(c.getMainLooper());
	//    9   17:aload_0         
	//   10   18:new             #54  <Class Handler>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:getfield        #52  <Field Context c>
	//   14   26:invokevirtual   #58  <Method android.os.Looper Context.getMainLooper()>
	//   15   29:invokespecial   #61  <Method void Handler(android.os.Looper)>
	//   16   32:putfield        #63  <Field Handler f>
		g = new Handler(c.getMainLooper());
	//   17   35:aload_0         
	//   18   36:new             #54  <Class Handler>
	//   19   39:dup             
	//   20   40:aload_0         
	//   21   41:getfield        #52  <Field Context c>
	//   22   44:invokevirtual   #58  <Method android.os.Looper Context.getMainLooper()>
	//   23   47:invokespecial   #61  <Method void Handler(android.os.Looper)>
	//   24   50:putfield        #65  <Field Handler g>
		try
		{
			a(context);
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:invokespecial   #68  <Method void a(Context)>
			return;
	//   28   58:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  29   59:astore_1        
		{
			((Throwable) (context)).printStackTrace();
	//   30   60:aload_1         
	//   31   61:invokevirtual   #75  <Method void Throwable.printStackTrace()>
		}
	//   32   64:return          
	}

	static OfflineMapDownloadListener a(OfflineMapManager offlinemapmanager)
	{
		return offlinemapmanager.d;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field OfflineMapManager$OfflineMapDownloadListener d>
	//    2    4:areturn         
	}

	private void a()
		throws AMapException
	{
		if(!fd.d(c))
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field Context c>
	//*   2    4:invokestatic    #83  <Method boolean fd.d(Context)>
	//*   3    7:ifne            20
			throw new AMapException("http\u8FDE\u63A5\u5931\u8D25 - ConnectionException");
	//    4   10:new             #78  <Class AMapException>
	//    5   13:dup             
	//    6   14:ldc1            #85  <String "http\u8FDE\u63A5\u5931\u8D25 - ConnectionException">
	//    7   16:invokespecial   #88  <Method void AMapException(String)>
	//    8   19:athrow          
		else
			return;
	//    9   20:return          
	}

	private void a(Context context)
	{
		c = context.getApplicationContext();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #50  <Method Context Context.getApplicationContext()>
	//    3    5:putfield        #52  <Field Context c>
		be.b = false;
	//    4    8:iconst_0        
	//    5    9:putstatic       #94  <Field boolean be.b>
		b = be.a(c);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #52  <Field Context c>
	//    9   17:invokestatic    #97  <Method be be.a(Context)>
	//   10   20:putfield        #99  <Field be b>
		b.a(new com.amap.api.mapcore.util.be.a() {

			public void a()
			{
				if(OfflineMapManager.c(a) != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #24  <Field OfflineMapManager a>
			//*   2    4:invokestatic    #32  <Method OfflineMapManager$OfflineLoadedListener OfflineMapManager.c(OfflineMapManager)>
			//*   3    7:ifnull          29
					OfflineMapManager.b(a).post(new Runnable(this) {

						public void run()
						{
							try
							{
								OfflineMapManager.c(a.a).onVerifyComplete();
						//    0    0:aload_0         
						//    1    1:getfield        #16  <Field OfflineMapManager$1 a>
						//    2    4:getfield        #25  <Field OfflineMapManager OfflineMapManager$1.a>
						//    3    7:invokestatic    #31  <Method OfflineMapManager$OfflineLoadedListener OfflineMapManager.c(OfflineMapManager)>
						//    4   10:invokeinterface #36  <Method void OfflineMapManager$OfflineLoadedListener.onVerifyComplete()>
								return;
						//    5   15:return          
							}
							catch(Throwable throwable)
						//*   6   16:astore_1        
							{
								throwable.printStackTrace();
						//    7   17:aload_1         
						//    8   18:invokevirtual   #39  <Method void Throwable.printStackTrace()>
							}
						//    9   21:return          
						}

						final _cls1 a;

			
			{
				a = _pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field OfflineMapManager$1 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
					}
);
			//    4   10:aload_0         
			//    5   11:getfield        #24  <Field OfflineMapManager a>
			//    6   14:invokestatic    #36  <Method Handler OfflineMapManager.b(OfflineMapManager)>
			//    7   17:new             #19  <Class OfflineMapManager$1$4>
			//    8   20:dup             
			//    9   21:aload_0         
			//   10   22:invokespecial   #39  <Method void OfflineMapManager$1$4(OfflineMapManager$1)>
			//   11   25:invokevirtual   #45  <Method boolean Handler.post(Runnable)>
			//   12   28:pop             
			//   13   29:return          
			}

			public void a(bd bd)
			{
				if(OfflineMapManager.a(a) != null && bd != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #24  <Field OfflineMapManager a>
			//*   2    4:invokestatic    #49  <Method OfflineMapManager$OfflineMapDownloadListener OfflineMapManager.a(OfflineMapManager)>
			//*   3    7:ifnull          34
			//*   4   10:aload_1         
			//*   5   11:ifnull          34
					OfflineMapManager.b(a).post(new Runnable(this, bd) {

						public void run()
						{
							try
							{
								OfflineMapManager.a(b.a).onDownload(a.c().b(), a.getcompleteCode(), a.getCity());
						//    0    0:aload_0         
						//    1    1:getfield        #18  <Field OfflineMapManager$1 b>
						//    2    4:getfield        #30  <Field OfflineMapManager OfflineMapManager$1.a>
						//    3    7:invokestatic    #35  <Method OfflineMapManager$OfflineMapDownloadListener OfflineMapManager.a(OfflineMapManager)>
						//    4   10:aload_0         
						//    5   11:getfield        #20  <Field bd a>
						//    6   14:invokevirtual   #41  <Method ch bd.c()>
						//    7   17:invokevirtual   #46  <Method int ch.b()>
						//    8   20:aload_0         
						//    9   21:getfield        #20  <Field bd a>
						//   10   24:invokevirtual   #49  <Method int bd.getcompleteCode()>
						//   11   27:aload_0         
						//   12   28:getfield        #20  <Field bd a>
						//   13   31:invokevirtual   #53  <Method String bd.getCity()>
						//   14   34:invokeinterface #59  <Method void OfflineMapManager$OfflineMapDownloadListener.onDownload(int, int, String)>
								return;
						//   15   39:return          
							}
							catch(Throwable throwable)
						//*  16   40:astore_1        
							{
								throwable.printStackTrace();
						//   17   41:aload_1         
						//   18   42:invokevirtual   #62  <Method void Throwable.printStackTrace()>
							}
						//   19   45:return          
						}

						final bd a;
						final _cls1 b;

			
			{
				b = _pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field OfflineMapManager$1 b>
				a = bd1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field bd a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
					}
);
			//    6   14:aload_0         
			//    7   15:getfield        #24  <Field OfflineMapManager a>
			//    8   18:invokestatic    #36  <Method Handler OfflineMapManager.b(OfflineMapManager)>
			//    9   21:new             #13  <Class OfflineMapManager$1$1>
			//   10   24:dup             
			//   11   25:aload_0         
			//   12   26:aload_1         
			//   13   27:invokespecial   #52  <Method void OfflineMapManager$1$1(OfflineMapManager$1, bd)>
			//   14   30:invokevirtual   #45  <Method boolean Handler.post(Runnable)>
			//   15   33:pop             
			//   16   34:return          
			}

			public void b(bd bd)
			{
				if(OfflineMapManager.a(a) != null && bd != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #24  <Field OfflineMapManager a>
			//*   2    4:invokestatic    #49  <Method OfflineMapManager$OfflineMapDownloadListener OfflineMapManager.a(OfflineMapManager)>
			//*   3    7:ifnull          34
			//*   4   10:aload_1         
			//*   5   11:ifnull          34
					OfflineMapManager.b(a).post(new Runnable(this, bd) {

						public void run()
						{
							try
							{
								if(((Object) (a.c())).equals(((Object) (a.g))) || ((Object) (a.c())).equals(((Object) (a.a))))
						//*   0    0:aload_0         
						//*   1    1:getfield        #20  <Field bd a>
						//*   2    4:invokevirtual   #33  <Method ch bd.c()>
						//*   3    7:aload_0         
						//*   4    8:getfield        #20  <Field bd a>
						//*   5   11:getfield        #37  <Field ch bd.g>
						//*   6   14:invokevirtual   #41  <Method boolean Object.equals(Object)>
						//*   7   17:ifne            40
						//*   8   20:aload_0         
						//*   9   21:getfield        #20  <Field bd a>
						//*  10   24:invokevirtual   #33  <Method ch bd.c()>
						//*  11   27:aload_0         
						//*  12   28:getfield        #20  <Field bd a>
						//*  13   31:getfield        #43  <Field ch bd.a>
						//*  14   34:invokevirtual   #41  <Method boolean Object.equals(Object)>
						//*  15   37:ifeq            66
								{
									OfflineMapManager.a(b.a).onCheckUpdate(true, a.getCity());
						//   16   40:aload_0         
						//   17   41:getfield        #18  <Field OfflineMapManager$1 b>
						//   18   44:getfield        #46  <Field OfflineMapManager OfflineMapManager$1.a>
						//   19   47:invokestatic    #51  <Method OfflineMapManager$OfflineMapDownloadListener OfflineMapManager.a(OfflineMapManager)>
						//   20   50:iconst_1        
						//   21   51:aload_0         
						//   22   52:getfield        #20  <Field bd a>
						//   23   55:invokevirtual   #55  <Method String bd.getCity()>
						//   24   58:invokeinterface #61  <Method void OfflineMapManager$OfflineMapDownloadListener.onCheckUpdate(boolean, String)>
									break MISSING_BLOCK_LABEL_89;
						//   25   63:goto            89
								}
							}
						//*  26   66:aload_0         
						//*  27   67:getfield        #18  <Field OfflineMapManager$1 b>
						//*  28   70:getfield        #46  <Field OfflineMapManager OfflineMapManager$1.a>
						//*  29   73:invokestatic    #51  <Method OfflineMapManager$OfflineMapDownloadListener OfflineMapManager.a(OfflineMapManager)>
						//*  30   76:iconst_0        
						//*  31   77:aload_0         
						//*  32   78:getfield        #20  <Field bd a>
						//*  33   81:invokevirtual   #55  <Method String bd.getCity()>
						//*  34   84:invokeinterface #61  <Method void OfflineMapManager$OfflineMapDownloadListener.onCheckUpdate(boolean, String)>
						//*  35   89:return          
							catch(Throwable throwable)
						//*  36   90:astore_1        
							{
								throwable.printStackTrace();
						//   37   91:aload_1         
						//   38   92:invokevirtual   #64  <Method void Throwable.printStackTrace()>
								return;
						//   39   95:return          
							}
							OfflineMapManager.a(b.a).onCheckUpdate(false, a.getCity());
						}

						final bd a;
						final _cls1 b;

			
			{
				b = _pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field OfflineMapManager$1 b>
				a = bd1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field bd a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
					}
);
			//    6   14:aload_0         
			//    7   15:getfield        #24  <Field OfflineMapManager a>
			//    8   18:invokestatic    #36  <Method Handler OfflineMapManager.b(OfflineMapManager)>
			//    9   21:new             #15  <Class OfflineMapManager$1$2>
			//   10   24:dup             
			//   11   25:aload_0         
			//   12   26:aload_1         
			//   13   27:invokespecial   #53  <Method void OfflineMapManager$1$2(OfflineMapManager$1, bd)>
			//   14   30:invokevirtual   #45  <Method boolean Handler.post(Runnable)>
			//   15   33:pop             
			//   16   34:return          
			}

			public void c(bd bd)
			{
				if(OfflineMapManager.a(a) != null && bd != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #24  <Field OfflineMapManager a>
			//*   2    4:invokestatic    #49  <Method OfflineMapManager$OfflineMapDownloadListener OfflineMapManager.a(OfflineMapManager)>
			//*   3    7:ifnull          34
			//*   4   10:aload_1         
			//*   5   11:ifnull          34
					OfflineMapManager.b(a).post(new Runnable(this, bd) {

						public void run()
						{
							try
							{
								if(((Object) (a.c())).equals(((Object) (a.a))))
						//*   0    0:aload_0         
						//*   1    1:getfield        #21  <Field bd a>
						//*   2    4:invokevirtual   #33  <Method ch bd.c()>
						//*   3    7:aload_0         
						//*   4    8:getfield        #21  <Field bd a>
						//*   5   11:getfield        #36  <Field ch bd.a>
						//*   6   14:invokevirtual   #40  <Method boolean Object.equals(Object)>
						//*   7   17:ifeq            48
								{
									OfflineMapManager.a(b.a).onRemove(true, a.getCity(), "");
						//    8   20:aload_0         
						//    9   21:getfield        #19  <Field OfflineMapManager$1 b>
						//   10   24:getfield        #43  <Field OfflineMapManager OfflineMapManager$1.a>
						//   11   27:invokestatic    #48  <Method OfflineMapManager$OfflineMapDownloadListener OfflineMapManager.a(OfflineMapManager)>
						//   12   30:iconst_1        
						//   13   31:aload_0         
						//   14   32:getfield        #21  <Field bd a>
						//   15   35:invokevirtual   #52  <Method String bd.getCity()>
						//   16   38:ldc1            #54  <String "">
						//   17   40:invokeinterface #60  <Method void OfflineMapManager$OfflineMapDownloadListener.onRemove(boolean, String, String)>
									break MISSING_BLOCK_LABEL_73;
						//   18   45:goto            73
								}
							}
						//*  19   48:aload_0         
						//*  20   49:getfield        #19  <Field OfflineMapManager$1 b>
						//*  21   52:getfield        #43  <Field OfflineMapManager OfflineMapManager$1.a>
						//*  22   55:invokestatic    #48  <Method OfflineMapManager$OfflineMapDownloadListener OfflineMapManager.a(OfflineMapManager)>
						//*  23   58:iconst_0        
						//*  24   59:aload_0         
						//*  25   60:getfield        #21  <Field bd a>
						//*  26   63:invokevirtual   #52  <Method String bd.getCity()>
						//*  27   66:ldc1            #54  <String "">
						//*  28   68:invokeinterface #60  <Method void OfflineMapManager$OfflineMapDownloadListener.onRemove(boolean, String, String)>
						//*  29   73:return          
							catch(Throwable throwable)
						//*  30   74:astore_1        
							{
								throwable.printStackTrace();
						//   31   75:aload_1         
						//   32   76:invokevirtual   #63  <Method void Throwable.printStackTrace()>
								return;
						//   33   79:return          
							}
							OfflineMapManager.a(b.a).onRemove(false, a.getCity(), "");
						}

						final bd a;
						final _cls1 b;

			
			{
				b = _pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field OfflineMapManager$1 b>
				a = bd1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field bd a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
					}
);
			//    6   14:aload_0         
			//    7   15:getfield        #24  <Field OfflineMapManager a>
			//    8   18:invokestatic    #36  <Method Handler OfflineMapManager.b(OfflineMapManager)>
			//    9   21:new             #17  <Class OfflineMapManager$1$3>
			//   10   24:dup             
			//   11   25:aload_0         
			//   12   26:aload_1         
			//   13   27:invokespecial   #54  <Method void OfflineMapManager$1$3(OfflineMapManager$1, bd)>
			//   14   30:invokevirtual   #45  <Method boolean Handler.post(Runnable)>
			//   15   33:pop             
			//   16   34:return          
			}

			final OfflineMapManager a;

			
			{
				a = OfflineMapManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field OfflineMapManager a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #27  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   11   23:aload_0         
	//   12   24:getfield        #99  <Field be b>
	//   13   27:new             #6   <Class OfflineMapManager$1>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:invokespecial   #102 <Method void OfflineMapManager$1(OfflineMapManager)>
	//   17   35:invokevirtual   #105 <Method void be.a(com.amap.api.mapcore.util.be$a)>
		try
		{
			b.a();
	//   18   38:aload_0         
	//   19   39:getfield        #99  <Field be b>
	//   20   42:invokevirtual   #107 <Method void be.a()>
			a = b.f;
	//   21   45:aload_0         
	//   22   46:aload_0         
	//   23   47:getfield        #99  <Field be b>
	//   24   50:getfield        #109 <Field bi be.f>
	//   25   53:putfield        #111 <Field bi a>
			return;
	//   26   56:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  27   57:astore_1        
		{
			((Throwable) (context)).printStackTrace();
	//   28   58:aload_1         
	//   29   59:invokevirtual   #75  <Method void Throwable.printStackTrace()>
		}
	//   30   62:return          
	}

	private void a(String s, String s1)
		throws AMapException
	{
		b.a(s);
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field be b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #114 <Method void be.a(String)>
	//    4    8:return          
	}

	static Handler b(OfflineMapManager offlinemapmanager)
	{
		return offlinemapmanager.f;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field Handler f>
	//    2    4:areturn         
	}

	private void b()
	{
		d = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #44  <Field OfflineMapManager$OfflineMapDownloadListener d>
	//    3    5:return          
	}

	static OfflineLoadedListener c(OfflineMapManager offlinemapmanager)
	{
		return offlinemapmanager.e;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field OfflineMapManager$OfflineLoadedListener e>
	//    2    4:areturn         
	}

	public void destroy()
	{
		try
		{
			if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field be b>
	//*   2    4:ifnull          14
				b.e();
	//    3    7:aload_0         
	//    4    8:getfield        #99  <Field be b>
	//    5   11:invokevirtual   #121 <Method void be.e()>
			b();
	//    6   14:aload_0         
	//    7   15:invokespecial   #123 <Method void b()>
			if(f != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #63  <Field Handler f>
	//*  10   22:ifnull          33
				f.removeCallbacksAndMessages(((Object) (null)));
	//   11   25:aload_0         
	//   12   26:getfield        #63  <Field Handler f>
	//   13   29:aconst_null     
	//   14   30:invokevirtual   #127 <Method void Handler.removeCallbacksAndMessages(Object)>
			f = null;
	//   15   33:aload_0         
	//   16   34:aconst_null     
	//   17   35:putfield        #63  <Field Handler f>
			if(g != null)
	//*  18   38:aload_0         
	//*  19   39:getfield        #65  <Field Handler g>
	//*  20   42:ifnull          53
				g.removeCallbacksAndMessages(((Object) (null)));
	//   21   45:aload_0         
	//   22   46:getfield        #65  <Field Handler g>
	//   23   49:aconst_null     
	//   24   50:invokevirtual   #127 <Method void Handler.removeCallbacksAndMessages(Object)>
			g = null;
	//   25   53:aload_0         
	//   26   54:aconst_null     
	//   27   55:putfield        #65  <Field Handler g>
			return;
	//   28   58:return          
		}
		catch(Throwable throwable)
	//*  29   59:astore_1        
		{
			throwable.printStackTrace();
	//   30   60:aload_1         
	//   31   61:invokevirtual   #75  <Method void Throwable.printStackTrace()>
		}
	//   32   64:return          
	}

	public void downloadByCityCode(String s)
		throws AMapException
	{
		try
		{
			b.e(s);
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field be b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #130 <Method void be.e(String)>
			return;
	//    4    8:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5    9:astore_1        
		{
			((Throwable) (s)).printStackTrace();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #75  <Method void Throwable.printStackTrace()>
		}
	//    8   14:return          
	}

	public void downloadByCityName(String s)
		throws AMapException
	{
		try
		{
			b.d(s);
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field be b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #133 <Method void be.d(String)>
			return;
	//    4    8:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5    9:astore_1        
		{
			((Throwable) (s)).printStackTrace();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #75  <Method void Throwable.printStackTrace()>
		}
	//    8   14:return          
	}

	public void downloadByProvinceName(String s)
		throws AMapException
	{
		String s1;
		try
		{
			a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #135 <Method void a()>
			s = ((String) (getItemByProvinceName(s)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #139 <Method OfflineMapProvince getItemByProvinceName(String)>
	//    5    9:astore_1        
		}
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       24
	//*   8   14:new             #78  <Class AMapException>
	//*   9   17:dup             
	//*  10   18:ldc1            #141 <String "\u65E0\u6548\u7684\u53C2\u6570 - IllegalArgumentException">
	//*  11   20:invokespecial   #88  <Method void AMapException(String)>
	//*  12   23:athrow          
	//*  13   24:aload_1         
	//*  14   25:invokevirtual   #147 <Method ArrayList OfflineMapProvince.getCityList()>
	//*  15   28:invokevirtual   #153 <Method Iterator ArrayList.iterator()>
	//*  16   31:astore_1        
	//*  17   32:aload_1         
	//*  18   33:invokeinterface #159 <Method boolean Iterator.hasNext()>
	//*  19   38:ifeq            74
	//*  20   41:aload_1         
	//*  21   42:invokeinterface #163 <Method Object Iterator.next()>
	//*  22   47:checkcast       #165 <Class OfflineMapCity>
	//*  23   50:invokevirtual   #169 <Method String OfflineMapCity.getCity()>
	//*  24   53:astore_2        
	//*  25   54:aload_0         
	//*  26   55:getfield        #65  <Field Handler g>
	//*  27   58:new             #16  <Class OfflineMapManager$2>
	//*  28   61:dup             
	//*  29   62:aload_0         
	//*  30   63:aload_2         
	//*  31   64:invokespecial   #172 <Method void OfflineMapManager$2(OfflineMapManager, String)>
	//*  32   67:invokevirtual   #176 <Method boolean Handler.post(Runnable)>
	//*  33   70:pop             
	//*  34   71:goto            32
	//*  35   74:return          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  36   75:astore_1        
		{
			if(s instanceof AMapException)
	//*  37   76:aload_1         
	//*  38   77:instanceof      #78  <Class AMapException>
	//*  39   80:ifeq            88
			{
				throw (AMapException)s;
	//   40   83:aload_1         
	//   41   84:checkcast       #78  <Class AMapException>
	//   42   87:athrow          
			} else
			{
				hm.c(((Throwable) (s)), "OfflineMapManager", "downloadByProvinceName");
	//   43   88:aload_1         
	//   44   89:ldc1            #178 <String "OfflineMapManager">
	//   45   91:ldc1            #179 <String "downloadByProvinceName">
	//   46   93:invokestatic    #184 <Method void hm.c(Throwable, String, String)>
				return;
	//   47   96:return          
			}
		}
		if(s != null)
			break MISSING_BLOCK_LABEL_24;
		throw new AMapException("\u65E0\u6548\u7684\u53C2\u6570 - IllegalArgumentException");
		for(s = ((String) (((OfflineMapProvince) (s)).getCityList().iterator())); ((Iterator) (s)).hasNext(); g.post(new Runnable(s1) {

		public void run()
		{
			try
			{
				b.b.d(a);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field OfflineMapManager b>
		//    2    4:getfield        #31  <Field be OfflineMapManager.b>
		//    3    7:aload_0         
		//    4    8:getfield        #21  <Field String a>
		//    5   11:invokevirtual   #36  <Method void be.d(String)>
				return;
		//    6   14:return          
			}
			catch(AMapException amapexception)
		//*   7   15:astore_1        
			{
				hm.c(((Throwable) (amapexception)), "OfflineMapManager", "downloadByProvinceName");
		//    8   16:aload_1         
		//    9   17:ldc1            #38  <String "OfflineMapManager">
		//   10   19:ldc1            #39  <String "downloadByProvinceName">
		//   11   21:invokestatic    #45  <Method void hm.c(Throwable, String, String)>
			}
		//   12   24:return          
		}

		final String a;
		final OfflineMapManager b;

			
			{
				b = OfflineMapManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field OfflineMapManager b>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
	}
))
			s1 = ((OfflineMapCity)((Iterator) (s)).next()).getCity();

	}

	public ArrayList getDownloadOfflineMapCityList()
	{
		return a.c();
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field bi a>
	//    2    4:invokevirtual   #189 <Method ArrayList bi.c()>
	//    3    7:areturn         
	}

	public ArrayList getDownloadOfflineMapProvinceList()
	{
		return a.d();
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field bi a>
	//    2    4:invokevirtual   #194 <Method ArrayList bi.d()>
	//    3    7:areturn         
	}

	public ArrayList getDownloadingCityList()
	{
		return a.e();
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field bi a>
	//    2    4:invokevirtual   #198 <Method ArrayList bi.e()>
	//    3    7:areturn         
	}

	public ArrayList getDownloadingProvinceList()
	{
		return a.f();
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field bi a>
	//    2    4:invokevirtual   #201 <Method ArrayList bi.f()>
	//    3    7:areturn         
	}

	public OfflineMapCity getItemByCityCode(String s)
	{
		return a.a(s);
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field bi a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #205 <Method OfflineMapCity bi.a(String)>
	//    4    8:areturn         
	}

	public OfflineMapCity getItemByCityName(String s)
	{
		return a.b(s);
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field bi a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #208 <Method OfflineMapCity bi.b(String)>
	//    4    8:areturn         
	}

	public OfflineMapProvince getItemByProvinceName(String s)
	{
		return a.c(s);
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field bi a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #210 <Method OfflineMapProvince bi.c(String)>
	//    4    8:areturn         
	}

	public ArrayList getOfflineMapCityList()
	{
		return a.b();
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field bi a>
	//    2    4:invokevirtual   #213 <Method ArrayList bi.b()>
	//    3    7:areturn         
	}

	public ArrayList getOfflineMapProvinceList()
	{
		return a.a();
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field bi a>
	//    2    4:invokevirtual   #216 <Method ArrayList bi.a()>
	//    3    7:areturn         
	}

	public void pause()
	{
		b.d();
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field be b>
	//    2    4:invokevirtual   #219 <Method void be.d()>
	//    3    7:return          
	}

	public void remove(String s)
	{
		if(b.b(s))
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field be b>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #223 <Method boolean be.b(String)>
	//*   4    8:ifeq            22
		{
			b.c(s);
	//    5   11:aload_0         
	//    6   12:getfield        #99  <Field be b>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #225 <Method void be.c(String)>
			break MISSING_BLOCK_LABEL_113;
	//    9   19:goto            113
		}
		Object obj;
		try
		{
			obj = ((Object) (a.c(s)));
	//   10   22:aload_0         
	//   11   23:getfield        #111 <Field bi a>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #210 <Method OfflineMapProvince bi.c(String)>
	//   14   30:astore_2        
		}
	//*  15   31:aload_2         
	//*  16   32:ifnull          42
	//*  17   35:aload_2         
	//*  18   36:invokevirtual   #147 <Method ArrayList OfflineMapProvince.getCityList()>
	//*  19   39:ifnonnull       63
	//*  20   42:aload_0         
	//*  21   43:getfield        #44  <Field OfflineMapManager$OfflineMapDownloadListener d>
	//*  22   46:ifnull          62
	//*  23   49:aload_0         
	//*  24   50:getfield        #44  <Field OfflineMapManager$OfflineMapDownloadListener d>
	//*  25   53:iconst_0        
	//*  26   54:aload_1         
	//*  27   55:ldc1            #227 <String "\u6CA1\u6709\u8BE5\u57CE\u5E02">
	//*  28   57:invokeinterface #231 <Method void OfflineMapManager$OfflineMapDownloadListener.onRemove(boolean, String, String)>
	//*  29   62:return          
	//*  30   63:aload_2         
	//*  31   64:invokevirtual   #147 <Method ArrayList OfflineMapProvince.getCityList()>
	//*  32   67:invokevirtual   #153 <Method Iterator ArrayList.iterator()>
	//*  33   70:astore_1        
	//*  34   71:aload_1         
	//*  35   72:invokeinterface #159 <Method boolean Iterator.hasNext()>
	//*  36   77:ifeq            113
	//*  37   80:aload_1         
	//*  38   81:invokeinterface #163 <Method Object Iterator.next()>
	//*  39   86:checkcast       #165 <Class OfflineMapCity>
	//*  40   89:invokevirtual   #169 <Method String OfflineMapCity.getCity()>
	//*  41   92:astore_2        
	//*  42   93:aload_0         
	//*  43   94:getfield        #65  <Field Handler g>
	//*  44   97:new             #18  <Class OfflineMapManager$3>
	//*  45  100:dup             
	//*  46  101:aload_0         
	//*  47  102:aload_2         
	//*  48  103:invokespecial   #232 <Method void OfflineMapManager$3(OfflineMapManager, String)>
	//*  49  106:invokevirtual   #176 <Method boolean Handler.post(Runnable)>
	//*  50  109:pop             
	//*  51  110:goto            71
	//*  52  113:return          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  53  114:astore_1        
		{
			((Throwable) (s)).printStackTrace();
	//   54  115:aload_1         
	//   55  116:invokevirtual   #75  <Method void Throwable.printStackTrace()>
			return;
	//   56  119:return          
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_42;
		if(((OfflineMapProvince) (obj)).getCityList() != null)
			break MISSING_BLOCK_LABEL_63;
		if(d != null)
			d.onRemove(false, s, "\u6CA1\u6709\u8BE5\u57CE\u5E02");
		return;
		for(s = ((String) (((OfflineMapProvince) (obj)).getCityList().iterator())); ((Iterator) (s)).hasNext(); g.post(new Runnable(((String) (obj))) {

		public void run()
		{
			b.b.c(a);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field OfflineMapManager b>
		//    2    4:getfield        #29  <Field be OfflineMapManager.b>
		//    3    7:aload_0         
		//    4    8:getfield        #21  <Field String a>
		//    5   11:invokevirtual   #34  <Method void be.c(String)>
		//    6   14:return          
		}

		final String a;
		final OfflineMapManager b;

			
			{
				b = OfflineMapManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field OfflineMapManager b>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
	}
))
			obj = ((Object) (((OfflineMapCity)((Iterator) (s)).next()).getCity()));

	}

	public void restart()
	{
	//    0    0:return          
	}

	public void setOnOfflineLoadedListener(OfflineLoadedListener offlineloadedlistener)
	{
		e = offlineloadedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #118 <Field OfflineMapManager$OfflineLoadedListener e>
	//    3    5:return          
	}

	public void stop()
	{
		b.c();
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field be b>
	//    2    4:invokevirtual   #238 <Method void be.c()>
	//    3    7:return          
	}

	public void updateOfflineCityByCode(String s)
		throws AMapException
	{
		s = ((String) (getItemByCityCode(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #241 <Method OfflineMapCity getItemByCityCode(String)>
	//    3    5:astore_1        
		if(s == null || ((OfflineMapCity) (s)).getCity() == null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          17
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #169 <Method String OfflineMapCity.getCity()>
	//*   8   14:ifnonnull       27
		{
			throw new AMapException("\u65E0\u6548\u7684\u53C2\u6570 - IllegalArgumentException");
	//    9   17:new             #78  <Class AMapException>
	//   10   20:dup             
	//   11   21:ldc1            #141 <String "\u65E0\u6548\u7684\u53C2\u6570 - IllegalArgumentException">
	//   12   23:invokespecial   #88  <Method void AMapException(String)>
	//   13   26:athrow          
		} else
		{
			a(((OfflineMapCity) (s)).getCity(), "cityname");
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #169 <Method String OfflineMapCity.getCity()>
	//   17   32:ldc1            #243 <String "cityname">
	//   18   34:invokespecial   #245 <Method void a(String, String)>
			return;
	//   19   37:return          
		}
	}

	public void updateOfflineCityByName(String s)
		throws AMapException
	{
		a(s, "cityname");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #243 <String "cityname">
	//    3    4:invokespecial   #245 <Method void a(String, String)>
	//    4    7:return          
	}

	public void updateOfflineMapProvinceByName(String s)
		throws AMapException
	{
		a(s, "cityname");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #243 <String "cityname">
	//    3    4:invokespecial   #245 <Method void a(String, String)>
	//    4    7:return          
	}

	bi a;
	be b;
	private Context c;
	private OfflineMapDownloadListener d;
	private OfflineLoadedListener e;
	private Handler f;
	private Handler g;
}
