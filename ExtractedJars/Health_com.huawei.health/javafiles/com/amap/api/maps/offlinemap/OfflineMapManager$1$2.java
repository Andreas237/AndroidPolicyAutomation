// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.offlinemap;

import android.os.Handler;
import com.amap.api.mapcore.util.bd;
import com.amap.api.mapcore.util.ch;

// Referenced classes of package com.amap.api.maps.offlinemap:
//			OfflineMapManager

class OfflineMapManager$1$2
	implements Runnable
{

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
	final OfflineMapManager._cls1 b;

	OfflineMapManager$1$2(OfflineMapManager._cls1 _pcls1, bd bd1)
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

	// Unreferenced inner class com/amap/api/maps/offlinemap/OfflineMapManager$1

/* anonymous class */
	class OfflineMapManager._cls1
		implements com.amap.api.mapcore.util.be.a
	{

		public void a()
		{
			if(OfflineMapManager.c(a) != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #24  <Field OfflineMapManager a>
		//*   2    4:invokestatic    #32  <Method OfflineMapManager$OfflineLoadedListener OfflineMapManager.c(OfflineMapManager)>
		//*   3    7:ifnull          29
				OfflineMapManager.b(a).post(new OfflineMapManager._cls1._cls4());
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

		public void a(bd bd1)
		{
			if(OfflineMapManager.a(a) != null && bd1 != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #24  <Field OfflineMapManager a>
		//*   2    4:invokestatic    #49  <Method OfflineMapManager$OfflineMapDownloadListener OfflineMapManager.a(OfflineMapManager)>
		//*   3    7:ifnull          34
		//*   4   10:aload_1         
		//*   5   11:ifnull          34
				OfflineMapManager.b(a).post(new OfflineMapManager._cls1._cls1(bd1));
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

		public void b(bd bd1)
		{
			if(OfflineMapManager.a(a) != null && bd1 != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #24  <Field OfflineMapManager a>
		//*   2    4:invokestatic    #49  <Method OfflineMapManager$OfflineMapDownloadListener OfflineMapManager.a(OfflineMapManager)>
		//*   3    7:ifnull          34
		//*   4   10:aload_1         
		//*   5   11:ifnull          34
				OfflineMapManager.b(a).post(((Runnable) (new OfflineMapManager._cls1._cls2(this, bd1))));
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

		public void c(bd bd1)
		{
			if(OfflineMapManager.a(a) != null && bd1 != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #24  <Field OfflineMapManager a>
		//*   2    4:invokestatic    #49  <Method OfflineMapManager$OfflineMapDownloadListener OfflineMapManager.a(OfflineMapManager)>
		//*   3    7:ifnull          34
		//*   4   10:aload_1         
		//*   5   11:ifnull          34
				OfflineMapManager.b(a).post(new OfflineMapManager._cls1._cls3(bd1));
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
				a = offlinemapmanager;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field OfflineMapManager a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #27  <Method void Object()>
			//    5    9:return          
			}

		// Unreferenced inner class com/amap/api/maps/offlinemap/OfflineMapManager$1$1

/* anonymous class */
		class OfflineMapManager._cls1._cls1
			implements Runnable
		{

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
			final OfflineMapManager._cls1 b;

					
					{
						b = OfflineMapManager._cls1.this;
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


		// Unreferenced inner class com/amap/api/maps/offlinemap/OfflineMapManager$1$3

/* anonymous class */
		class OfflineMapManager._cls1._cls3
			implements Runnable
		{

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
			final OfflineMapManager._cls1 b;

					
					{
						b = OfflineMapManager._cls1.this;
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


		// Unreferenced inner class com/amap/api/maps/offlinemap/OfflineMapManager$1$4

/* anonymous class */
		class OfflineMapManager._cls1._cls4
			implements Runnable
		{

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

			final OfflineMapManager._cls1 a;

					
					{
						a = OfflineMapManager._cls1.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #16  <Field OfflineMapManager$1 a>
						super();
					//    3    5:aload_0         
					//    4    6:invokespecial   #18  <Method void Object()>
					//    5    9:return          
					}
		}

	}

}
