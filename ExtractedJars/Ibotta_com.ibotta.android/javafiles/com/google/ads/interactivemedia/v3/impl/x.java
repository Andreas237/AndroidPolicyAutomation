// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.ads.interactivemedia.v3.a.a;
import com.google.ads.interactivemedia.v3.a.f.q;
import com.google.ads.interactivemedia.v3.a.g;
import com.google.ads.interactivemedia.v3.a.w;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			ag

public class x
	implements ag
{
	class a
		implements com.google.ads.interactivemedia.v3.a.g.c
	{

		public void a()
		{
		//    0    0:return          
		}

		public void a(com.google.ads.interactivemedia.v3.a.f f1)
		{
			x.b(a);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field x a>
		//    2    4:invokestatic    #22  <Method void x.b(x)>
			f1 = ((com.google.ads.interactivemedia.v3.a.f) (String.valueOf(((Object) (f1)))));
		//    3    7:aload_1         
		//    4    8:invokestatic    #28  <Method String String.valueOf(Object)>
		//    5   11:astore_1        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (f1))).length() + 13);
		//    6   12:new             #30  <Class StringBuilder>
		//    7   15:dup             
		//    8   16:aload_1         
		//    9   17:invokestatic    #28  <Method String String.valueOf(Object)>
		//   10   20:invokevirtual   #34  <Method int String.length()>
		//   11   23:bipush          13
		//   12   25:iadd            
		//   13   26:invokespecial   #37  <Method void StringBuilder(int)>
		//   14   29:astore_2        
			stringbuilder.append("Player Error:");
		//   15   30:aload_2         
		//   16   31:ldc1            #39  <String "Player Error:">
		//   17   33:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//   18   36:pop             
			stringbuilder.append(((String) (f1)));
		//   19   37:aload_2         
		//   20   38:aload_1         
		//   21   39:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//   22   42:pop             
			Log.e("IMA SDK", stringbuilder.toString());
		//   23   43:ldc1            #45  <String "IMA SDK">
		//   24   45:aload_2         
		//   25   46:invokevirtual   #49  <Method String StringBuilder.toString()>
		//   26   49:invokestatic    #55  <Method int Log.e(String, String)>
		//   27   52:pop             
		//   28   53:return          
		}

		public void a(boolean flag, int i1)
		{
			if(i1 == 5)
		//*   0    0:iload_2         
		//*   1    1:iconst_5        
		//*   2    2:icmpne          44
			{
				for(Iterator iterator = x.d(a).iterator(); iterator.hasNext(); ((com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback)iterator.next()).onEnded());
		//    3    5:aload_0         
		//    4    6:getfield        #14  <Field x a>
		//    5    9:invokestatic    #60  <Method List x.d(x)>
		//    6   12:invokeinterface #66  <Method Iterator List.iterator()>
		//    7   17:astore_3        
		//    8   18:aload_3         
		//    9   19:invokeinterface #72  <Method boolean Iterator.hasNext()>
		//   10   24:ifeq            44
		//   11   27:aload_3         
		//   12   28:invokeinterface #76  <Method Object Iterator.next()>
		//   13   33:checkcast       #78  <Class com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer$VideoAdPlayerCallback>
		//   14   36:invokeinterface #81  <Method void com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer$VideoAdPlayerCallback.onEnded()>
			}
		//*  15   41:goto            18
		//   16   44:return          
		}

		final x a;

		a()
		{
			a = x.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field x a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void Object()>
		//    5    9:return          
		}
	}

	class b
		implements com.google.ads.interactivemedia.v3.a.c.h.a
	{

		public void a(int i1, IOException ioexception)
		{
			x.b(a);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field x a>
		//    2    4:invokestatic    #22  <Method void x.b(x)>
			ioexception = ((IOException) (String.valueOf(((Object) (ioexception)))));
		//    3    7:aload_2         
		//    4    8:invokestatic    #28  <Method String String.valueOf(Object)>
		//    5   11:astore_2        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (ioexception))).length() + 41);
		//    6   12:new             #30  <Class StringBuilder>
		//    7   15:dup             
		//    8   16:aload_2         
		//    9   17:invokestatic    #28  <Method String String.valueOf(Object)>
		//   10   20:invokevirtual   #34  <Method int String.length()>
		//   11   23:bipush          41
		//   12   25:iadd            
		//   13   26:invokespecial   #37  <Method void StringBuilder(int)>
		//   14   29:astore_3        
			stringbuilder.append("Load Error from SampleSource:");
		//   15   30:aload_3         
		//   16   31:ldc1            #39  <String "Load Error from SampleSource:">
		//   17   33:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//   18   36:pop             
			stringbuilder.append(i1);
		//   19   37:aload_3         
		//   20   38:iload_1         
		//   21   39:invokevirtual   #46  <Method StringBuilder StringBuilder.append(int)>
		//   22   42:pop             
			stringbuilder.append(":");
		//   23   43:aload_3         
		//   24   44:ldc1            #48  <String ":">
		//   25   46:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//   26   49:pop             
			stringbuilder.append(((String) (ioexception)));
		//   27   50:aload_3         
		//   28   51:aload_2         
		//   29   52:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//   30   55:pop             
			Log.e("IMA SDK", stringbuilder.toString());
		//   31   56:ldc1            #50  <String "IMA SDK">
		//   32   58:aload_3         
		//   33   59:invokevirtual   #54  <Method String StringBuilder.toString()>
		//   34   62:invokestatic    #60  <Method int Log.e(String, String)>
		//   35   65:pop             
		//   36   66:return          
		}

		final x a;

		b()
		{
			a = x.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field x a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	class c extends d
		implements com.google.ads.interactivemedia.v3.a.k.a
	{

		public void a(int i1, long l1, long l2)
		{
		//    0    0:return          
		}

		public void a(com.google.ads.interactivemedia.v3.a.a.b.d d1)
		{
		//    0    0:return          
		}

		public void a(com.google.ads.interactivemedia.v3.a.a.b.f f1)
		{
		//    0    0:return          
		}

		c()
		{
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #13  <Method void x$d(x)>
		//    3    5:return          
		}
	}

	class d
		implements com.google.ads.interactivemedia.v3.a.m.b
	{

		public void a(android.media.MediaCodec.CryptoException cryptoexception)
		{
			x.b(a);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field x a>
		//    2    4:invokestatic    #23  <Method void x.b(x)>
		//    3    7:return          
		}

		public void a(com.google.ads.interactivemedia.v3.a.m.a a1)
		{
			x.b(a);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field x a>
		//    2    4:invokestatic    #23  <Method void x.b(x)>
		//    3    7:return          
		}

		public void a(String s, long l1, long l2)
		{
		//    0    0:return          
		}

		final x a;

		d()
		{
			a = x.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field x a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	class e extends d
		implements com.google.ads.interactivemedia.v3.a.o.a
	{

		public void a(int i1, int j1, int k1, float f1)
		{
			com.google.ads.interactivemedia.v3.a.a a1 = x.c(b);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field x b>
		//    2    4:invokestatic    #24  <Method a x.c(x)>
		//    3    7:astore          5
			if(j1 == 0)
		//*   4    9:iload_2         
		//*   5   10:ifne            19
				f1 = 1.0F;
		//    6   13:fconst_1        
		//    7   14:fstore          4
			else
		//*   8   16:goto            29
				f1 = ((float)i1 * f1) / (float)j1;
		//    9   19:iload_1         
		//   10   20:i2f             
		//   11   21:fload           4
		//   12   23:fmul            
		//   13   24:iload_2         
		//   14   25:i2f             
		//   15   26:fdiv            
		//   16   27:fstore          4
			a1.a(f1);
		//   17   29:aload           5
		//   18   31:fload           4
		//   19   33:invokevirtual   #29  <Method void a.a(float)>
		//   20   36:return          
		}

		public void a(int i1, long l1)
		{
		//    0    0:return          
		}

		public void a(Surface surface)
		{
		//    0    0:return          
		}

		final x b;

		e()
		{
			b = x.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field x b>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #17  <Method void x$d(x)>
		//    6   10:return          
		}
	}

	static final class f extends Enum
	{

		public static f valueOf(String s)
		{
			return (f)Enum.valueOf(com/google/ads/interactivemedia/v3/impl/x$f, s);
		//    0    0:ldc1            #2   <Class x$f>
		//    1    2:aload_0         
		//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class x$f>
		//    4    9:areturn         
		}

		public static f[] values()
		{
			return (f[])((f []) (e)).clone();
		//    0    0:getstatic       #39  <Field x$f[] e>
		//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.google.ads.interactivemedia.v3.impl.x$f_3B_.clone()>
		//    2    6:checkcast       #50  <Class x$f[]>
		//    3    9:areturn         
		}

		public static final f a;
		public static final f b;
		public static final f c;
		public static final f d;
		private static final f e[];

		static 
		{
			a = new f("IDLE", 0);
		//    0    0:new             #2   <Class x$f>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "IDLE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void x$f(String, int)>
		//    5   10:putstatic       #25  <Field x$f a>
			b = new f("LOADED", 1);
		//    6   13:new             #2   <Class x$f>
		//    7   16:dup             
		//    8   17:ldc1            #27  <String "LOADED">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void x$f(String, int)>
		//   11   23:putstatic       #29  <Field x$f b>
			c = new f("PLAYING", 2);
		//   12   26:new             #2   <Class x$f>
		//   13   29:dup             
		//   14   30:ldc1            #31  <String "PLAYING">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void x$f(String, int)>
		//   17   36:putstatic       #33  <Field x$f c>
			d = new f("PAUSED", 3);
		//   18   39:new             #2   <Class x$f>
		//   19   42:dup             
		//   20   43:ldc1            #35  <String "PAUSED">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void x$f(String, int)>
		//   23   49:putstatic       #37  <Field x$f d>
			e = (new f[] {
				a, b, c, d
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       f[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #25  <Field x$f a>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #29  <Field x$f b>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #33  <Field x$f c>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #37  <Field x$f d>
		//   41   79:aastore         
		//   42   80:putstatic       #39  <Field x$f[] e>
		//*  43   83:return          
		}

		private f(String s, int i1)
		{
			super(s, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class g extends Enum
	{

		public static g valueOf(String s)
		{
			return (g)Enum.valueOf(com/google/ads/interactivemedia/v3/impl/x$g, s);
		//    0    0:ldc1            #2   <Class x$g>
		//    1    2:aload_0         
		//    2    3:invokestatic    #44  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class x$g>
		//    4    9:areturn         
		}

		public static g[] values()
		{
			return (g[])((g []) (d)).clone();
		//    0    0:getstatic       #31  <Field x$g[] d>
		//    1    3:invokevirtual   #51  <Method Object _5B_Lcom.google.ads.interactivemedia.v3.impl.x$g_3B_.clone()>
		//    2    6:checkcast       #47  <Class x$g[]>
		//    3    9:areturn         
		}

		public int a()
		{
			return c;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field int c>
		//    2    4:ireturn         
		}

		public static final g a;
		public static final g b;
		private static final g d[];
		private final int c;

		static 
		{
			a = new g("TYPE_VIDEO", 0, 0);
		//    0    0:new             #2   <Class x$g>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "TYPE_VIDEO">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokespecial   #23  <Method void x$g(String, int, int)>
		//    6   11:putstatic       #25  <Field x$g a>
			b = new g("TYPE_AUDIO", 1, 1);
		//    7   14:new             #2   <Class x$g>
		//    8   17:dup             
		//    9   18:ldc1            #27  <String "TYPE_AUDIO">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #23  <Method void x$g(String, int, int)>
		//   13   25:putstatic       #29  <Field x$g b>
			d = (new g[] {
				a, b
			});
		//   14   28:iconst_2        
		//   15   29:anewarray       g[]
		//   16   32:dup             
		//   17   33:iconst_0        
		//   18   34:getstatic       #25  <Field x$g a>
		//   19   37:aastore         
		//   20   38:dup             
		//   21   39:iconst_1        
		//   22   40:getstatic       #29  <Field x$g b>
		//   23   43:aastore         
		//   24   44:putstatic       #31  <Field x$g[] d>
		//*  25   47:return          
		}

		private g(String s, int i1, int j1)
		{
			super(s, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #35  <Method void Enum(String, int)>
			c = j1;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #37  <Field int c>
		//    7   11:return          
		}
	}


	public x(Context context, ViewGroup viewgroup)
	{
		this(context, viewgroup, com.google.ads.interactivemedia.v3.a.g.b.a(2));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_2        
	//    4    4:invokestatic    #62  <Method g com.google.ads.interactivemedia.v3.a.g$b.a(int)>
	//    5    7:invokespecial   #65  <Method void x(Context, ViewGroup, g)>
	//    6   10:return          
	}

	x(Context context, ViewGroup viewgroup, com.google.ads.interactivemedia.v3.a.g g1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void Object()>
		f = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #71  <Field Context f>
		e = viewgroup;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #73  <Field ViewGroup e>
		a = g1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #75  <Field g a>
		i = new b();
	//   11   19:aload_0         
	//   12   20:new             #15  <Class x$b>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:invokespecial   #78  <Method void x$b(x)>
	//   16   28:putfield        #80  <Field x$b i>
		k = new c();
	//   17   31:aload_0         
	//   18   32:new             #18  <Class x$c>
	//   19   35:dup             
	//   20   36:aload_0         
	//   21   37:invokespecial   #81  <Method void x$c(x)>
	//   22   40:putfield        #83  <Field x$c k>
		j = new e();
	//   23   43:aload_0         
	//   24   44:new             #24  <Class x$e>
	//   25   47:dup             
	//   26   48:aload_0         
	//   27   49:invokespecial   #84  <Method void x$e(x)>
	//   28   52:putfield        #86  <Field x$e j>
		l = new a();
	//   29   55:aload_0         
	//   30   56:new             #12  <Class x$a>
	//   31   59:dup             
	//   32   60:aload_0         
	//   33   61:invokespecial   #87  <Method void x$a(x)>
	//   34   64:putfield        #89  <Field x$a l>
		g1.a(((com.google.ads.interactivemedia.v3.a.g.c) (l)));
	//   35   67:aload_3         
	//   36   68:aload_0         
	//   37   69:getfield        #89  <Field x$a l>
	//   38   72:invokeinterface #94  <Method void g.a(com.google.ads.interactivemedia.v3.a.g$c)>
		g = new Handler();
	//   39   77:aload_0         
	//   40   78:new             #96  <Class Handler>
	//   41   81:dup             
	//   42   82:invokespecial   #97  <Method void Handler()>
	//   43   85:putfield        #99  <Field Handler g>
		h = ((List) (new ArrayList(1)));
	//   44   88:aload_0         
	//   45   89:new             #101 <Class ArrayList>
	//   46   92:dup             
	//   47   93:iconst_1        
	//   48   94:invokespecial   #104 <Method void ArrayList(int)>
	//   49   97:putfield        #106 <Field List h>
		d = new FrameLayout(context);
	//   50  100:aload_0         
	//   51  101:new             #108 <Class FrameLayout>
	//   52  104:dup             
	//   53  105:aload_1         
	//   54  106:invokespecial   #111 <Method void FrameLayout(Context)>
	//   55  109:putfield        #113 <Field FrameLayout d>
		d.setBackgroundColor(0xff000000);
	//   56  112:aload_0         
	//   57  113:getfield        #113 <Field FrameLayout d>
	//   58  116:ldc1            #114 <Int 0xff000000>
	//   59  118:invokevirtual   #117 <Method void FrameLayout.setBackgroundColor(int)>
		c = new com.google.ads.interactivemedia.v3.a.a(context);
	//   60  121:aload_0         
	//   61  122:new             #119 <Class a>
	//   62  125:dup             
	//   63  126:aload_1         
	//   64  127:invokespecial   #120 <Method void a(Context)>
	//   65  130:putfield        #122 <Field a c>
		viewgroup = ((ViewGroup) (new android.widget.FrameLayout.LayoutParams(-1, -1)));
	//   66  133:new             #124 <Class android.widget.FrameLayout$LayoutParams>
	//   67  136:dup             
	//   68  137:iconst_m1       
	//   69  138:iconst_m1       
	//   70  139:invokespecial   #127 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   71  142:astore_2        
		viewgroup.gravity = 17;
	//   72  143:aload_2         
	//   73  144:bipush          17
	//   74  146:putfield        #131 <Field int android.widget.FrameLayout$LayoutParams.gravity>
		c.setLayoutParams(((android.view.ViewGroup.LayoutParams) (viewgroup)));
	//   75  149:aload_0         
	//   76  150:getfield        #122 <Field a c>
	//   77  153:aload_2         
	//   78  154:invokevirtual   #135 <Method void a.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		m = com.google.ads.interactivemedia.v3.impl.f.a;
	//   79  157:aload_0         
	//   80  158:getstatic       #137 <Field x$f com.google.ads.interactivemedia.v3.impl.x$f.a>
	//   81  161:putfield        #139 <Field x$f m>
		b = new SurfaceView(context);
	//   82  164:aload_0         
	//   83  165:new             #141 <Class SurfaceView>
	//   84  168:dup             
	//   85  169:aload_1         
	//   86  170:invokespecial   #142 <Method void SurfaceView(Context)>
	//   87  173:putfield        #144 <Field SurfaceView b>
		b.setZOrderMediaOverlay(true);
	//   88  176:aload_0         
	//   89  177:getfield        #144 <Field SurfaceView b>
	//   90  180:iconst_1        
	//   91  181:invokevirtual   #148 <Method void SurfaceView.setZOrderMediaOverlay(boolean)>
		b.getHolder().addCallback(new android.view.SurfaceHolder.Callback(g1) {

			public void surfaceChanged(SurfaceHolder surfaceholder, int i1, int j1, int k1)
			{
			//    0    0:return          
			}

			public void surfaceCreated(SurfaceHolder surfaceholder)
			{
				com.google.ads.interactivemedia.v3.impl.x.a(b, true);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field x b>
			//    2    4:iconst_1        
			//    3    5:invokestatic    #31  <Method boolean com.google.ads.interactivemedia.v3.impl.x.a(x, boolean)>
			//    4    8:pop             
				if(com.google.ads.interactivemedia.v3.impl.x.a(b) == f.c || com.google.ads.interactivemedia.v3.impl.x.a(b) == f.d)
			//*   5    9:aload_0         
			//*   6   10:getfield        #18  <Field x b>
			//*   7   13:invokestatic    #34  <Method x$f com.google.ads.interactivemedia.v3.impl.x.a(x)>
			//*   8   16:getstatic       #40  <Field x$f x$f.c>
			//*   9   19:if_acmpeq       35
			//*  10   22:aload_0         
			//*  11   23:getfield        #18  <Field x b>
			//*  12   26:invokestatic    #34  <Method x$f com.google.ads.interactivemedia.v3.impl.x.a(x)>
			//*  13   29:getstatic       #43  <Field x$f x$f.d>
			//*  14   32:if_acmpne       49
					com.google.ads.interactivemedia.v3.impl.x.a(b, surfaceholder.getSurface(), false);
			//   15   35:aload_0         
			//   16   36:getfield        #18  <Field x b>
			//   17   39:aload_1         
			//   18   40:invokeinterface #49  <Method Surface SurfaceHolder.getSurface()>
			//   19   45:iconst_0        
			//   20   46:invokestatic    #52  <Method void com.google.ads.interactivemedia.v3.impl.x.a(x, Surface, boolean)>
				if(com.google.ads.interactivemedia.v3.impl.x.a(b) == f.c)
			//*  21   49:aload_0         
			//*  22   50:getfield        #18  <Field x b>
			//*  23   53:invokestatic    #34  <Method x$f com.google.ads.interactivemedia.v3.impl.x.a(x)>
			//*  24   56:getstatic       #40  <Field x$f x$f.c>
			//*  25   59:if_acmpne       72
					a.a(true);
			//   26   62:aload_0         
			//   27   63:getfield        #20  <Field g a>
			//   28   66:iconst_1        
			//   29   67:invokeinterface #57  <Method void g.a(boolean)>
			//   30   72:return          
			}

			public void surfaceDestroyed(SurfaceHolder surfaceholder)
			{
				com.google.ads.interactivemedia.v3.impl.x.a(b, ((Surface) (null)), true);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field x b>
			//    2    4:aconst_null     
			//    3    5:iconst_1        
			//    4    6:invokestatic    #52  <Method void com.google.ads.interactivemedia.v3.impl.x.a(x, Surface, boolean)>
				a.a(false);
			//    5    9:aload_0         
			//    6   10:getfield        #20  <Field g a>
			//    7   13:iconst_0        
			//    8   14:invokeinterface #57  <Method void g.a(boolean)>
				com.google.ads.interactivemedia.v3.impl.x.a(b, false);
			//    9   19:aload_0         
			//   10   20:getfield        #18  <Field x b>
			//   11   23:iconst_0        
			//   12   24:invokestatic    #31  <Method boolean com.google.ads.interactivemedia.v3.impl.x.a(x, boolean)>
			//   13   27:pop             
			//   14   28:return          
			}

			final com.google.ads.interactivemedia.v3.a.g a;
			final x b;

			
			{
				b = x.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field x b>
				a = g1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field g a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   92  184:aload_0         
	//   93  185:getfield        #144 <Field SurfaceView b>
	//   94  188:invokevirtual   #152 <Method SurfaceHolder SurfaceView.getHolder()>
	//   95  191:new             #8   <Class x$1>
	//   96  194:dup             
	//   97  195:aload_0         
	//   98  196:aload_3         
	//   99  197:invokespecial   #155 <Method void x$1(x, g)>
	//  100  200:invokeinterface #161 <Method void SurfaceHolder.addCallback(android.view.SurfaceHolder$Callback)>
		c.addView(((android.view.View) (b)));
	//  101  205:aload_0         
	//  102  206:getfield        #122 <Field a c>
	//  103  209:aload_0         
	//  104  210:getfield        #144 <Field SurfaceView b>
	//  105  213:invokevirtual   #165 <Method void a.addView(android.view.View)>
		d.addView(((android.view.View) (c)));
	//  106  216:aload_0         
	//  107  217:getfield        #113 <Field FrameLayout d>
	//  108  220:aload_0         
	//  109  221:getfield        #122 <Field a c>
	//  110  224:invokevirtual   #166 <Method void FrameLayout.addView(android.view.View)>
		e.addView(((android.view.View) (d)), new android.view.ViewGroup.LayoutParams(-1, -1));
	//  111  227:aload_0         
	//  112  228:getfield        #73  <Field ViewGroup e>
	//  113  231:aload_0         
	//  114  232:getfield        #113 <Field FrameLayout d>
	//  115  235:new             #168 <Class android.view.ViewGroup$LayoutParams>
	//  116  238:dup             
	//  117  239:iconst_m1       
	//  118  240:iconst_m1       
	//  119  241:invokespecial   #169 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//  120  244:invokevirtual   #174 <Method void ViewGroup.addView(android.view.View, android.view.ViewGroup$LayoutParams)>
	//  121  247:return          
	}

	static f a(x x1)
	{
		return x1.m;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field x$f m>
	//    2    4:areturn         
	}

	private void a(Surface surface, boolean flag)
	{
		com.google.ads.interactivemedia.v3.a.g g1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field g a>
	//    2    4:astore_3        
		if(g1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          47
		{
			w w = o;
	//    5    9:aload_0         
	//    6   10:getfield        #178 <Field w o>
	//    7   13:astore          4
			if(w == null)
	//*   8   15:aload           4
	//*   9   17:ifnonnull       21
				return;
	//   10   20:return          
			if(flag)
	//*  11   21:iload_2         
	//*  12   22:ifeq            36
			{
				g1.b(((com.google.ads.interactivemedia.v3.a.g.a) (w)), 1, ((Object) (surface)));
	//   13   25:aload_3         
	//   14   26:aload           4
	//   15   28:iconst_1        
	//   16   29:aload_1         
	//   17   30:invokeinterface #181 <Method void g.b(com.google.ads.interactivemedia.v3.a.g$a, int, Object)>
				return;
	//   18   35:return          
			} else
			{
				g1.a(((com.google.ads.interactivemedia.v3.a.g.a) (w)), 1, ((Object) (surface)));
	//   19   36:aload_3         
	//   20   37:aload           4
	//   21   39:iconst_1        
	//   22   40:aload_1         
	//   23   41:invokeinterface #183 <Method void g.a(com.google.ads.interactivemedia.v3.a.g$a, int, Object)>
				return;
	//   24   46:return          
			}
		} else
		{
			return;
	//   25   47:return          
		}
	}

	static void a(x x1, Surface surface, boolean flag)
	{
		x1.a(surface, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #186 <Method void a(Surface, boolean)>
	//    4    6:return          
	}

	static boolean a(x x1, boolean flag)
	{
		x1.n = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #189 <Field boolean n>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static void b(x x1)
	{
		x1.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #191 <Method void g()>
	//    2    4:return          
	}

	static com.google.ads.interactivemedia.v3.a.a c(x x1)
	{
		return x1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field a c>
	//    2    4:areturn         
	}

	static List d(x x1)
	{
		return x1.h;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field List h>
	//    2    4:areturn         
	}

	private void g()
	{
		for(Iterator iterator = h.iterator(); iterator.hasNext(); ((com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback)iterator.next()).onError());
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field List h>
	//    2    4:invokeinterface #199 <Method Iterator List.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #205 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            36
	//    7   19:aload_1         
	//    8   20:invokeinterface #209 <Method Object Iterator.next()>
	//    9   25:checkcast       #211 <Class com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer$VideoAdPlayerCallback>
	//   10   28:invokeinterface #214 <Method void com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer$VideoAdPlayerCallback.onError()>
	//*  11   33:goto            10
	//   12   36:return          
	}

	public void a()
	{
		d.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field FrameLayout d>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #217 <Method void FrameLayout.setVisibility(int)>
		b.setVisibility(0);
	//    4    8:aload_0         
	//    5    9:getfield        #144 <Field SurfaceView b>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #218 <Method void SurfaceView.setVisibility(int)>
	//    8   16:return          
	}

	public void addCallback(com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback videoadplayercallback)
	{
		h.add(((Object) (videoadplayercallback)));
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field List h>
	//    2    4:aload_1         
	//    3    5:invokeinterface #223 <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void b()
	{
		d.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field FrameLayout d>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #217 <Method void FrameLayout.setVisibility(int)>
		b.setVisibility(4);
	//    4    9:aload_0         
	//    5   10:getfield        #144 <Field SurfaceView b>
	//    6   13:iconst_4        
	//    7   14:invokevirtual   #218 <Method void SurfaceView.setVisibility(int)>
	//    8   17:return          
	}

	public void c()
	{
		a.b(((com.google.ads.interactivemedia.v3.a.g.c) (l)));
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field g a>
	//    2    4:aload_0         
	//    3    5:getfield        #89  <Field x$a l>
	//    4    8:invokeinterface #225 <Method void g.b(com.google.ads.interactivemedia.v3.a.g$c)>
		a.c();
	//    5   13:aload_0         
	//    6   14:getfield        #75  <Field g a>
	//    7   17:invokeinterface #227 <Method void g.c()>
		e.removeView(((android.view.View) (d)));
	//    8   22:aload_0         
	//    9   23:getfield        #73  <Field ViewGroup e>
	//   10   26:aload_0         
	//   11   27:getfield        #113 <Field FrameLayout d>
	//   12   30:invokevirtual   #230 <Method void ViewGroup.removeView(android.view.View)>
	//   13   33:return          
	}

	public b d()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field x$b i>
	//    2    4:areturn         
	}

	public e e()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field x$e j>
	//    2    4:areturn         
	}

	public c f()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field x$c k>
	//    2    4:areturn         
	}

	public VideoProgressUpdate getAdProgress()
	{
		if(a.a() != 3 && a.a() != 4 || a.d() <= 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field g a>
	//*   2    4:invokeinterface #238 <Method int g.a()>
	//*   3    9:iconst_3        
	//*   4   10:icmpeq          26
	//*   5   13:aload_0         
	//*   6   14:getfield        #75  <Field g a>
	//*   7   17:invokeinterface #238 <Method int g.a()>
	//*   8   22:iconst_4        
	//*   9   23:icmpne          40
	//*  10   26:aload_0         
	//*  11   27:getfield        #75  <Field g a>
	//*  12   30:invokeinterface #241 <Method long g.d()>
	//*  13   35:lconst_0        
	//*  14   36:lcmp            
	//*  15   37:ifgt            44
			return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
	//   16   40:getstatic       #247 <Field VideoProgressUpdate VideoProgressUpdate.VIDEO_TIME_NOT_READY>
	//   17   43:areturn         
		else
			return new VideoProgressUpdate(a.e(), a.d());
	//   18   44:new             #243 <Class VideoProgressUpdate>
	//   19   47:dup             
	//   20   48:aload_0         
	//   21   49:getfield        #75  <Field g a>
	//   22   52:invokeinterface #249 <Method long g.e()>
	//   23   57:aload_0         
	//   24   58:getfield        #75  <Field g a>
	//   25   61:invokeinterface #241 <Method long g.d()>
	//   26   66:invokespecial   #252 <Method void VideoProgressUpdate(long, long)>
	//   27   69:areturn         
	}

	public void loadAd(String s)
	{
		a.b();
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field g a>
	//    2    4:invokeinterface #256 <Method void g.b()>
		a.a(0L);
	//    3    9:aload_0         
	//    4   10:getfield        #75  <Field g a>
	//    5   13:lconst_0        
	//    6   14:invokeinterface #259 <Method void g.a(long)>
		Context context = f;
	//    7   19:aload_0         
	//    8   20:getfield        #71  <Field Context f>
	//    9   23:astore_2        
		s = ((String) ((new com.google.ads.interactivemedia.v3.impl.a.a(context, q.a(context, "IMA SDK ExoPlayer"), Uri.parse(s))).a(this, g)));
	//   10   24:new             #261 <Class com.google.ads.interactivemedia.v3.impl.a.a>
	//   11   27:dup             
	//   12   28:aload_2         
	//   13   29:aload_2         
	//   14   30:ldc2            #263 <String "IMA SDK ExoPlayer">
	//   15   33:invokestatic    #268 <Method String q.a(Context, String)>
	//   16   36:aload_1         
	//   17   37:invokestatic    #274 <Method Uri Uri.parse(String)>
	//   18   40:invokespecial   #277 <Method void com.google.ads.interactivemedia.v3.impl.a.a(Context, String, Uri)>
	//   19   43:aload_0         
	//   20   44:aload_0         
	//   21   45:getfield        #99  <Field Handler g>
	//   22   48:invokevirtual   #280 <Method w[] com.google.ads.interactivemedia.v3.impl.a.a.a(x, Handler)>
	//   23   51:astore_1        
		o = ((w) (s[com.google.ads.interactivemedia.v3.impl.g.a.a()]));
	//   24   52:aload_0         
	//   25   53:aload_1         
	//   26   54:getstatic       #283 <Field x$g com.google.ads.interactivemedia.v3.impl.x$g.a>
	//   27   57:invokevirtual   #284 <Method int com.google.ads.interactivemedia.v3.impl.x$g.a()>
	//   28   60:aaload          
	//   29   61:putfield        #178 <Field w o>
		a.a(((w []) (s)));
	//   30   64:aload_0         
	//   31   65:getfield        #75  <Field g a>
	//   32   68:aload_1         
	//   33   69:invokeinterface #287 <Method void g.a(w[])>
		m = f.b;
	//   34   74:aload_0         
	//   35   75:getstatic       #289 <Field x$f x$f.b>
	//   36   78:putfield        #139 <Field x$f m>
	//   37   81:return          
	}

	public void pauseAd()
	{
		m = f.d;
	//    0    0:aload_0         
	//    1    1:getstatic       #292 <Field x$f x$f.d>
	//    2    4:putfield        #139 <Field x$f m>
		a.a(false);
	//    3    7:aload_0         
	//    4    8:getfield        #75  <Field g a>
	//    5   11:iconst_0        
	//    6   12:invokeinterface #294 <Method void g.a(boolean)>
		for(Iterator iterator = h.iterator(); iterator.hasNext(); ((com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback)iterator.next()).onPause());
	//    7   17:aload_0         
	//    8   18:getfield        #106 <Field List h>
	//    9   21:invokeinterface #199 <Method Iterator List.iterator()>
	//   10   26:astore_1        
	//   11   27:aload_1         
	//   12   28:invokeinterface #205 <Method boolean Iterator.hasNext()>
	//   13   33:ifeq            53
	//   14   36:aload_1         
	//   15   37:invokeinterface #209 <Method Object Iterator.next()>
	//   16   42:checkcast       #211 <Class com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer$VideoAdPlayerCallback>
	//   17   45:invokeinterface #297 <Method void com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer$VideoAdPlayerCallback.onPause()>
	//*  18   50:goto            27
	//   19   53:return          
	}

	public void playAd()
	{
		static class _cls2
		{

			static final int a[];

			static 
			{
				a = new int[f.values().length];
			//    0    0:invokestatic    #18  <Method x$f[] x$f.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] a>
				try
				{
					a[f.b.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] a>
			//    5   12:getstatic       #24  <Field x$f x$f.b>
			//    6   15:invokevirtual   #28  <Method int x$f.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] a>
			//*  10   23:getstatic       #31  <Field x$f x$f.d>
			//*  11   26:invokevirtual   #28  <Method int x$f.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] a>
			//*  15   34:getstatic       #34  <Field x$f x$f.c>
			//*  16   37:invokevirtual   #28  <Method int x$f.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   20   43:astore_0        
				try
				{
					a[f.d.ordinal()] = 2;
				}
			//*  21   44:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   22   47:astore_0        
				try
				{
					a[f.c.ordinal()] = 3;
				}
			//*  23   48:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   51:astore_0        
			//*  25   52:return          
			}
		}

		switch(com.google.ads.interactivemedia.v3.impl._cls2.a[m.ordinal()])
	//*   0    0:getstatic       #301 <Field int[] com.google.ads.interactivemedia.v3.impl.x$2.a>
	//*   1    3:aload_0         
	//*   2    4:getfield        #139 <Field x$f m>
	//*   3    7:invokevirtual   #304 <Method int x$f.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 3: default 36
	//	               1 125
	//	               2 89
	//	               3 88
		default:
			String s = String.valueOf(((Object) (m)));
	//    6   36:aload_0         
	//    7   37:getfield        #139 <Field x$f m>
	//    8   40:invokestatic    #310 <Method String String.valueOf(Object)>
	//    9   43:astore_1        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 53);
	//   10   44:new             #312 <Class StringBuilder>
	//   11   47:dup             
	//   12   48:aload_1         
	//   13   49:invokestatic    #310 <Method String String.valueOf(Object)>
	//   14   52:invokevirtual   #315 <Method int String.length()>
	//   15   55:bipush          53
	//   16   57:iadd            
	//   17   58:invokespecial   #316 <Method void StringBuilder(int)>
	//   18   61:astore_2        
			stringbuilder.append("Ignoring call to playAd during invalid player state: ");
	//   19   62:aload_2         
	//   20   63:ldc2            #318 <String "Ignoring call to playAd during invalid player state: ">
	//   21   66:invokevirtual   #322 <Method StringBuilder StringBuilder.append(String)>
	//   22   69:pop             
			stringbuilder.append(s);
	//   23   70:aload_2         
	//   24   71:aload_1         
	//   25   72:invokevirtual   #322 <Method StringBuilder StringBuilder.append(String)>
	//   26   75:pop             
			Log.w("IMA SDK", stringbuilder.toString());
	//   27   76:ldc2            #324 <String "IMA SDK">
	//   28   79:aload_2         
	//   29   80:invokevirtual   #328 <Method String StringBuilder.toString()>
	//   30   83:invokestatic    #334 <Method int Log.w(String, String)>
	//   31   86:pop             
			return;
	//   32   87:return          

		case 3: // '\003'
			return;
	//   33   88:return          

		case 2: // '\002'
			for(Iterator iterator = h.iterator(); iterator.hasNext(); ((com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback)iterator.next()).onResume());
	//   34   89:aload_0         
	//   35   90:getfield        #106 <Field List h>
	//   36   93:invokeinterface #199 <Method Iterator List.iterator()>
	//   37   98:astore_1        
	//   38   99:aload_1         
	//   39  100:invokeinterface #205 <Method boolean Iterator.hasNext()>
	//   40  105:ifeq            178
	//   41  108:aload_1         
	//   42  109:invokeinterface #209 <Method Object Iterator.next()>
	//   43  114:checkcast       #211 <Class com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer$VideoAdPlayerCallback>
	//   44  117:invokeinterface #337 <Method void com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer$VideoAdPlayerCallback.onResume()>
			break;
	//   45  122:goto            99

		case 1: // '\001'
			for(Iterator iterator1 = h.iterator(); iterator1.hasNext(); ((com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback)iterator1.next()).onPlay());
	//   46  125:aload_0         
	//   47  126:getfield        #106 <Field List h>
	//   48  129:invokeinterface #199 <Method Iterator List.iterator()>
	//   49  134:astore_1        
	//   50  135:aload_1         
	//   51  136:invokeinterface #205 <Method boolean Iterator.hasNext()>
	//   52  141:ifeq            161
	//   53  144:aload_1         
	//   54  145:invokeinterface #209 <Method Object Iterator.next()>
	//   55  150:checkcast       #211 <Class com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer$VideoAdPlayerCallback>
	//   56  153:invokeinterface #340 <Method void com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer$VideoAdPlayerCallback.onPlay()>
	//*  57  158:goto            135
			a(b.getHolder().getSurface(), false);
	//   58  161:aload_0         
	//   59  162:aload_0         
	//   60  163:getfield        #144 <Field SurfaceView b>
	//   61  166:invokevirtual   #152 <Method SurfaceHolder SurfaceView.getHolder()>
	//   62  169:invokeinterface #344 <Method Surface SurfaceHolder.getSurface()>
	//   63  174:iconst_0        
	//   64  175:invokespecial   #186 <Method void a(Surface, boolean)>
			break;
		}
		m = f.c;
	//   65  178:aload_0         
	//   66  179:getstatic       #346 <Field x$f x$f.c>
	//   67  182:putfield        #139 <Field x$f m>
		if(n)
	//*  68  185:aload_0         
	//*  69  186:getfield        #189 <Field boolean n>
	//*  70  189:ifeq            202
			a.a(true);
	//   71  192:aload_0         
	//   72  193:getfield        #75  <Field g a>
	//   73  196:iconst_1        
	//   74  197:invokeinterface #294 <Method void g.a(boolean)>
	//   75  202:return          
	}

	public void removeCallback(com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback videoadplayercallback)
	{
		h.remove(((Object) (videoadplayercallback)));
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field List h>
	//    2    4:aload_1         
	//    3    5:invokeinterface #350 <Method boolean List.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void resumeAd()
	{
		playAd();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #353 <Method void playAd()>
	//    2    4:return          
	}

	public void stopAd()
	{
		m = com.google.ads.interactivemedia.v3.impl.f.a;
	//    0    0:aload_0         
	//    1    1:getstatic       #137 <Field x$f com.google.ads.interactivemedia.v3.impl.x$f.a>
	//    2    4:putfield        #139 <Field x$f m>
		a.b();
	//    3    7:aload_0         
	//    4    8:getfield        #75  <Field g a>
	//    5   11:invokeinterface #256 <Method void g.b()>
		a(((Surface) (null)), false);
	//    6   16:aload_0         
	//    7   17:aconst_null     
	//    8   18:iconst_0        
	//    9   19:invokespecial   #186 <Method void a(Surface, boolean)>
	//   10   22:return          
	}

	private final com.google.ads.interactivemedia.v3.a.g a;
	private final SurfaceView b;
	private final com.google.ads.interactivemedia.v3.a.a c;
	private final FrameLayout d;
	private final ViewGroup e;
	private final Context f;
	private final Handler g;
	private final List h;
	private final b i;
	private final e j;
	private final c k;
	private final a l;
	private f m;
	private boolean n;
	private w o;
}
