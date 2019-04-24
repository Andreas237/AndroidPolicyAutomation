// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;


// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat, a

public static class MediaBrowserCompat$b
{
	static interface a
	{

		public abstract void a();

		public abstract void b();

		public abstract void c();
	}

	private class b
		implements a.a
	{

		public void a()
		{
			if(a.b != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field MediaBrowserCompat$b a>
		//*   2    4:getfield        #24  <Field MediaBrowserCompat$b$a MediaBrowserCompat$b.b>
		//*   3    7:ifnull          22
				a.b.a();
		//    4   10:aload_0         
		//    5   11:getfield        #17  <Field MediaBrowserCompat$b a>
		//    6   14:getfield        #24  <Field MediaBrowserCompat$b$a MediaBrowserCompat$b.b>
		//    7   17:invokeinterface #28  <Method void MediaBrowserCompat$b$a.a()>
			a.a();
		//    8   22:aload_0         
		//    9   23:getfield        #17  <Field MediaBrowserCompat$b a>
		//   10   26:invokevirtual   #29  <Method void MediaBrowserCompat$b.a()>
		//   11   29:return          
		}

		public void b()
		{
			if(a.b != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field MediaBrowserCompat$b a>
		//*   2    4:getfield        #24  <Field MediaBrowserCompat$b$a MediaBrowserCompat$b.b>
		//*   3    7:ifnull          22
				a.b.b();
		//    4   10:aload_0         
		//    5   11:getfield        #17  <Field MediaBrowserCompat$b a>
		//    6   14:getfield        #24  <Field MediaBrowserCompat$b$a MediaBrowserCompat$b.b>
		//    7   17:invokeinterface #31  <Method void MediaBrowserCompat$b$a.b()>
			a.b();
		//    8   22:aload_0         
		//    9   23:getfield        #17  <Field MediaBrowserCompat$b a>
		//   10   26:invokevirtual   #32  <Method void MediaBrowserCompat$b.b()>
		//   11   29:return          
		}

		public void c()
		{
			if(a.b != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field MediaBrowserCompat$b a>
		//*   2    4:getfield        #24  <Field MediaBrowserCompat$b$a MediaBrowserCompat$b.b>
		//*   3    7:ifnull          22
				a.b.c();
		//    4   10:aload_0         
		//    5   11:getfield        #17  <Field MediaBrowserCompat$b a>
		//    6   14:getfield        #24  <Field MediaBrowserCompat$b$a MediaBrowserCompat$b.b>
		//    7   17:invokeinterface #35  <Method void MediaBrowserCompat$b$a.c()>
			a.c();
		//    8   22:aload_0         
		//    9   23:getfield        #17  <Field MediaBrowserCompat$b a>
		//   10   26:invokevirtual   #36  <Method void MediaBrowserCompat$b.c()>
		//   11   29:return          
		}

		final MediaBrowserCompat.b a;

		b()
		{
			a = MediaBrowserCompat.b.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field MediaBrowserCompat$b a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
		//    5    9:return          
		}
	}


	public void a()
	{
	//    0    0:return          
	}

	void a(a a1)
	{
		b = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field MediaBrowserCompat$b$a b>
	//    3    5:return          
	}

	public void b()
	{
	//    0    0:return          
	}

	public void c()
	{
	//    0    0:return          
	}

	final Object a;
	a b;

	public MediaBrowserCompat$b()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		Object obj;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   2    4:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmplt          30
			obj = android.support.v4.media.a.a(((a.a) (new b())));
	//    5   12:new             #12  <Class MediaBrowserCompat$b$b>
	//    6   15:dup             
	//    7   16:aload_0         
	//    8   17:invokespecial   #27  <Method void MediaBrowserCompat$b$b(MediaBrowserCompat$b)>
	//    9   20:invokestatic    #32  <Method Object a.a(a$a)>
	//   10   23:astore_1        
		else
	//*  11   24:aload_0         
	//*  12   25:aload_1         
	//*  13   26:putfield        #34  <Field Object a>
	//*  14   29:return          
			obj = null;
	//   15   30:aconst_null     
	//   16   31:astore_1        
		a = obj;
	//*  17   32:goto            24
	}
}
