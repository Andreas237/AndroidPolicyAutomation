// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.SystemClock;
import com.google.ads.interactivemedia.v3.a.a.a;
import com.google.ads.interactivemedia.v3.a.a.b;
import com.google.ads.interactivemedia.v3.a.f.i;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.ads.interactivemedia.v3.a:
//			m, j, t, l, 
//			f, q, p, c, 
//			e, k, aa, ab

public class k extends m
	implements j
{
	public static interface a
		extends com.google.ads.interactivemedia.v3.impl.b.e.a
	{

		public void a()
		{
			com.google.ads.interactivemedia.v3.impl.k.b(a).b(new aa(aa.b.videoDisplay, aa.c.skip, com.google.ads.interactivemedia.v3.impl.k.a(a)));
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field k a>
		//    2    4:invokestatic    #25  <Method ab com.google.ads.interactivemedia.v3.impl.k.b(k)>
		//    3    7:new             #27  <Class aa>
		//    4   10:dup             
		//    5   11:getstatic       #33  <Field aa$b aa$b.videoDisplay>
		//    6   14:getstatic       #39  <Field aa$c aa$c.skip>
		//    7   17:aload_0         
		//    8   18:getfield        #14  <Field k a>
		//    9   21:invokestatic    #42  <Method String com.google.ads.interactivemedia.v3.impl.k.a(k)>
		//   10   24:invokespecial   #45  <Method void aa(aa$b, aa$c, String)>
		//   11   27:invokevirtual   #50  <Method void com.google.ads.interactivemedia.v3.impl.ab.b(aa)>
		//   12   30:return          
		}

		public void b()
		{
			com.google.ads.interactivemedia.v3.impl.k.b(a).b(new aa(aa.b.videoDisplay, aa.c.skipShown, com.google.ads.interactivemedia.v3.impl.k.a(a)));
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field k a>
		//    2    4:invokestatic    #25  <Method ab com.google.ads.interactivemedia.v3.impl.k.b(k)>
		//    3    7:new             #27  <Class aa>
		//    4   10:dup             
		//    5   11:getstatic       #33  <Field aa$b aa$b.videoDisplay>
		//    6   14:getstatic       #53  <Field aa$c aa$c.skipShown>
		//    7   17:aload_0         
		//    8   18:getfield        #14  <Field k a>
		//    9   21:invokestatic    #42  <Method String com.google.ads.interactivemedia.v3.impl.k.a(k)>
		//   10   24:invokespecial   #45  <Method void aa(aa$b, aa$c, String)>
		//   11   27:invokevirtual   #50  <Method void com.google.ads.interactivemedia.v3.impl.ab.b(aa)>
		//   12   30:return          
		}

		public void c()
		{
			com.google.ads.interactivemedia.v3.impl.k.b(a).b(new aa(aa.b.videoDisplay, aa.c.click, com.google.ads.interactivemedia.v3.impl.k.a(a)));
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field k a>
		//    2    4:invokestatic    #25  <Method ab com.google.ads.interactivemedia.v3.impl.k.b(k)>
		//    3    7:new             #27  <Class aa>
		//    4   10:dup             
		//    5   11:getstatic       #33  <Field aa$b aa$b.videoDisplay>
		//    6   14:getstatic       #57  <Field aa$c aa$c.click>
		//    7   17:aload_0         
		//    8   18:getfield        #14  <Field k a>
		//    9   21:invokestatic    #42  <Method String com.google.ads.interactivemedia.v3.impl.k.a(k)>
		//   10   24:invokespecial   #45  <Method void aa(aa$b, aa$c, String)>
		//   11   27:invokevirtual   #50  <Method void com.google.ads.interactivemedia.v3.impl.ab.b(aa)>
		//   12   30:return          
		}

		final k a;

		private a(k k1)
		{
			a = k1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field k a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void Object()>
		//    5    9:return          
		}

		a(k k1, _cls1 _pcls1)
		{
			this(k1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #21  <Method void k$a(k)>
		//    3    5:return          
		}
	}


	public k(t t1, l l1, com.google.ads.interactivemedia.v3.a.b.b b1, boolean flag, Handler handler, a a1, com.google.ads.interactivemedia.v3.a.a.a a2, 
			int i1)
	{
		this(new t[] {
			t1
		}, l1, b1, flag, handler, a1, a2, i1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:anewarray       t[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:aastore         
	//    7    9:aload_2         
	//    8   10:aload_3         
	//    9   11:iload           4
	//   10   13:aload           5
	//   11   15:aload           6
	//   12   17:aload           7
	//   13   19:iload           8
	//   14   21:invokespecial   #41  <Method void k(t[], l, com.google.ads.interactivemedia.v3.a.b.b, boolean, Handler, k$a, a, int)>
	//   15   24:return          
	}

	public k(t at[], l l1, com.google.ads.interactivemedia.v3.a.b.b b1, boolean flag, Handler handler, a a1, com.google.ads.interactivemedia.v3.a.a.a a2, 
			int i1)
	{
		super(at, l1, b1, flag, handler, ((m.b) (a1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:invokespecial   #45  <Method void m(t[], l, com.google.ads.interactivemedia.v3.a.b.b, boolean, Handler, m$b)>
		c = a1;
	//    8   13:aload_0         
	//    9   14:aload           6
	//   10   16:putfield        #47  <Field k$a c>
		h = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #49  <Field int h>
		d = new b(a2, i1);
	//   14   24:aload_0         
	//   15   25:new             #51  <Class b>
	//   16   28:dup             
	//   17   29:aload           7
	//   18   31:iload           8
	//   19   33:invokespecial   #54  <Method void b(a, int)>
	//   20   36:putfield        #56  <Field b d>
	//   21   39:return          
	}

	static a a(k k1)
	{
		return k1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field k$a c>
	//    2    4:areturn         
	}

	private void a(int i1, long l1, long l2)
	{
		if(b != null && c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field Handler b>
	//*   2    4:ifnull          34
	//*   3    7:aload_0         
	//*   4    8:getfield        #47  <Field k$a c>
	//*   5   11:ifnull          34
			b.post(((Runnable) (new k(this, i1, l1, l2) {

				public Object a(Class class1)
					throws Exception
				{
					return a.invoke(((Object) (null)), new Object[] {
						class1, java/lang/Object
					});
				//    0    0:aload_0         
				//    1    1:getfield        #12  <Field Method a>
				//    2    4:aconst_null     
				//    3    5:iconst_2        
				//    4    6:anewarray       Object[]
				//    5    9:dup             
				//    6   10:iconst_0        
				//    7   11:aload_1         
				//    8   12:aastore         
				//    9   13:dup             
				//   10   14:iconst_1        
				//   11   15:ldc1            #21  <Class Object>
				//   12   17:aastore         
				//   13   18:invokevirtual   #27  <Method Object Method.invoke(Object, Object[])>
				//   14   21:areturn         
				}

				final Method a;

			
			{
				a = method;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field Method a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void k()>
			//    5    9:return          
			}
			}
)));
	//    6   14:aload_0         
	//    7   15:getfield        #62  <Field Handler b>
	//    8   18:new             #12  <Class k$3>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:iload_1         
	//   12   24:lload_2         
	//   13   25:lload           4
	//   14   27:invokespecial   #65  <Method void k$3(k, int, long, long)>
	//   15   30:invokevirtual   #71  <Method boolean Handler.post(Runnable)>
	//   16   33:pop             
	//   17   34:return          
	}

	private void a(com.google.ads.interactivemedia.v3.a.a.b.d d1)
	{
		if(b != null && c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field Handler b>
	//*   2    4:ifnull          31
	//*   3    7:aload_0         
	//*   4    8:getfield        #47  <Field k$a c>
	//*   5   11:ifnull          31
			b.post(((Runnable) (new k(this, d1) {

				public Object a(Class class1)
					throws Exception
				{
					return a.invoke(b, new Object[] {
						class1
					});
				//    0    0:aload_0         
				//    1    1:getfield        #14  <Field Method a>
				//    2    4:aload_0         
				//    3    5:getfield        #16  <Field Object b>
				//    4    8:iconst_1        
				//    5    9:anewarray       Object[]
				//    6   12:dup             
				//    7   13:iconst_0        
				//    8   14:aload_1         
				//    9   15:aastore         
				//   10   16:invokevirtual   #31  <Method Object Method.invoke(Object, Object[])>
				//   11   19:areturn         
				}

				final Method a;
				final Object b;

			
			{
				a = method;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field Method a>
				b = obj;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #16  <Field Object b>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #19  <Method void k()>
			//    8   14:return          
			}
			}
)));
	//    6   14:aload_0         
	//    7   15:getfield        #62  <Field Handler b>
	//    8   18:new             #8   <Class k$1>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokespecial   #75  <Method void k$1(k, com.google.ads.interactivemedia.v3.a.a.b$d)>
	//   13   27:invokevirtual   #71  <Method boolean Handler.post(Runnable)>
	//   14   30:pop             
	//   15   31:return          
	}

	private void a(com.google.ads.interactivemedia.v3.a.a.b.f f1)
	{
		if(b != null && c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field Handler b>
	//*   2    4:ifnull          31
	//*   3    7:aload_0         
	//*   4    8:getfield        #47  <Field k$a c>
	//*   5   11:ifnull          31
			b.post(((Runnable) (new k(this, f1) {

				public Object a(Class class1)
					throws Exception
				{
					return a.invoke(((Object) (null)), new Object[] {
						class1, Integer.valueOf(b)
					});
				//    0    0:aload_0         
				//    1    1:getfield        #14  <Field Method a>
				//    2    4:aconst_null     
				//    3    5:iconst_2        
				//    4    6:anewarray       Object[]
				//    5    9:dup             
				//    6   10:iconst_0        
				//    7   11:aload_1         
				//    8   12:aastore         
				//    9   13:dup             
				//   10   14:iconst_1        
				//   11   15:aload_0         
				//   12   16:getfield        #16  <Field int b>
				//   13   19:invokestatic    #31  <Method Integer Integer.valueOf(int)>
				//   14   22:aastore         
				//   15   23:invokevirtual   #37  <Method Object Method.invoke(Object, Object[])>
				//   16   26:areturn         
				}

				final Method a;
				final int b;

			
			{
				a = method;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field Method a>
				b = i1;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #16  <Field int b>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #19  <Method void k()>
			//    8   14:return          
			}
			}
)));
	//    6   14:aload_0         
	//    7   15:getfield        #62  <Field Handler b>
	//    8   18:new             #10  <Class k$2>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokespecial   #79  <Method void k$2(k, com.google.ads.interactivemedia.v3.a.a.b$f)>
	//   13   27:invokevirtual   #71  <Method boolean Handler.post(Runnable)>
	//   14   30:pop             
	//   15   31:return          
	}

	public long a()
	{
		long l1 = d.a(e());
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field b d>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #83  <Method boolean e()>
	//    4    8:invokevirtual   #86  <Method long b.a(boolean)>
	//    5   11:lstore_1        
		if(l1 != 0x0L)
	//*   6   12:lload_1         
	//*   7   13:ldc2w           #87  <Long 0x0L>
	//*   8   16:lcmp            
	//*   9   17:ifeq            49
		{
			if(!j)
	//*  10   20:aload_0         
	//*  11   21:getfield        #90  <Field boolean j>
	//*  12   24:ifeq            30
	//*  13   27:goto            39
				l1 = Math.max(i, l1);
	//   14   30:aload_0         
	//   15   31:getfield        #92  <Field long i>
	//   16   34:lload_1         
	//   17   35:invokestatic    #98  <Method long Math.max(long, long)>
	//   18   38:lstore_1        
			i = l1;
	//   19   39:aload_0         
	//   20   40:lload_1         
	//   21   41:putfield        #92  <Field long i>
			j = false;
	//   22   44:aload_0         
	//   23   45:iconst_0        
	//   24   46:putfield        #90  <Field boolean j>
		}
		return i;
	//   25   49:aload_0         
	//   26   50:getfield        #92  <Field long i>
	//   27   53:lreturn         
	}

	protected e a(l l1, String s, boolean flag)
		throws n.b
	{
		if(a(s))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #104 <Method boolean a(String)>
	//*   3    5:ifeq            29
		{
			e e1 = l1.a();
	//    4    8:aload_1         
	//    5    9:invokeinterface #109 <Method e com.google.ads.interactivemedia.v3.a.l.a()>
	//    6   14:astore          4
			if(e1 != null)
	//*   7   16:aload           4
	//*   8   18:ifnull          29
			{
				e = true;
	//    9   21:aload_0         
	//   10   22:iconst_1        
	//   11   23:putfield        #111 <Field boolean e>
				return e1;
	//   12   26:aload           4
	//   13   28:areturn         
			}
		}
		e = false;
	//   14   29:aload_0         
	//   15   30:iconst_0        
	//   16   31:putfield        #111 <Field boolean e>
		return super.a(l1, s, flag);
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:aload_2         
	//   20   37:iload_3         
	//   21   38:invokespecial   #113 <Method e com.google.ads.interactivemedia.v3.a.m.a(l, String, boolean)>
	//   22   41:areturn         
	}

	protected void a(int i1)
	{
	//    0    0:return          
	}

	public void a(int i1, Object obj)
		throws f
	{
		switch(i1)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 3: default 28
	//	               1 72
	//	               2 60
	//	               3 35
		default:
			super.a(i1, obj);
	//    2   28:aload_0         
	//    3   29:iload_1         
	//    4   30:aload_2         
	//    5   31:invokespecial   #120 <Method void com.google.ads.interactivemedia.v3.a.m.a(int, Object)>
			return;
	//    6   34:return          

		case 3: // '\003'
			i1 = ((Integer)obj).intValue();
	//    7   35:aload_2         
	//    8   36:checkcast       #122 <Class Integer>
	//    9   39:invokevirtual   #126 <Method int Integer.intValue()>
	//   10   42:istore_1        
			if(d.b(i1))
	//*  11   43:aload_0         
	//*  12   44:getfield        #56  <Field b d>
	//*  13   47:iload_1         
	//*  14   48:invokevirtual   #129 <Method boolean b.b(int)>
	//*  15   51:ifeq            86
			{
				h = 0;
	//   16   54:aload_0         
	//   17   55:iconst_0        
	//   18   56:putfield        #49  <Field int h>
				return;
	//   19   59:return          
			}
			break;

		case 2: // '\002'
			d.a((PlaybackParams)obj);
	//   20   60:aload_0         
	//   21   61:getfield        #56  <Field b d>
	//   22   64:aload_2         
	//   23   65:checkcast       #131 <Class PlaybackParams>
	//   24   68:invokevirtual   #134 <Method void b.a(PlaybackParams)>
			return;
	//   25   71:return          

		case 1: // '\001'
			d.a(((Float)obj).floatValue());
	//   26   72:aload_0         
	//   27   73:getfield        #56  <Field b d>
	//   28   76:aload_2         
	//   29   77:checkcast       #136 <Class Float>
	//   30   80:invokevirtual   #140 <Method float Float.floatValue()>
	//   31   83:invokevirtual   #143 <Method void b.a(float)>
			break;
		}
	//   32   86:return          
	}

	protected void a(long l1)
		throws f
	{
		super.a(l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #146 <Method void com.google.ads.interactivemedia.v3.a.m.a(long)>
		d.j();
	//    3    5:aload_0         
	//    4    6:getfield        #56  <Field b d>
	//    5    9:invokevirtual   #149 <Method void b.j()>
		i = l1;
	//    6   12:aload_0         
	//    7   13:lload_1         
	//    8   14:putfield        #92  <Field long i>
		j = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #90  <Field boolean j>
	//   12   22:return          
	}

	protected void a(MediaCodec mediacodec, MediaFormat mediaformat)
	{
		boolean flag;
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field MediaFormat f>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_3        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		if(flag)
	//*   8   14:iload_3         
	//*   9   15:ifeq            31
			mediacodec = ((MediaCodec) (f.getString("mime")));
	//   10   18:aload_0         
	//   11   19:getfield        #152 <Field MediaFormat f>
	//   12   22:ldc1            #154 <String "mime">
	//   13   24:invokevirtual   #160 <Method String MediaFormat.getString(String)>
	//   14   27:astore_1        
		else
	//*  15   28:goto            34
			mediacodec = "audio/raw";
	//   16   31:ldc1            #162 <String "audio/raw">
	//   17   33:astore_1        
		if(flag)
	//*  18   34:iload_3         
	//*  19   35:ifeq            43
			mediaformat = f;
	//   20   38:aload_0         
	//   21   39:getfield        #152 <Field MediaFormat f>
	//   22   42:astore_2        
		int i1 = mediaformat.getInteger("channel-count");
	//   23   43:aload_2         
	//   24   44:ldc1            #164 <String "channel-count">
	//   25   46:invokevirtual   #168 <Method int MediaFormat.getInteger(String)>
	//   26   49:istore_3        
		int j1 = mediaformat.getInteger("sample-rate");
	//   27   50:aload_2         
	//   28   51:ldc1            #170 <String "sample-rate">
	//   29   53:invokevirtual   #168 <Method int MediaFormat.getInteger(String)>
	//   30   56:istore          4
		d.a(((String) (mediacodec)), i1, j1, g);
	//   31   58:aload_0         
	//   32   59:getfield        #56  <Field b d>
	//   33   62:aload_1         
	//   34   63:iload_3         
	//   35   64:iload           4
	//   36   66:aload_0         
	//   37   67:getfield        #172 <Field int g>
	//   38   70:invokevirtual   #175 <Method void b.a(String, int, int, int)>
	//   39   73:return          
	}

	protected void a(MediaCodec mediacodec, boolean flag, MediaFormat mediaformat, MediaCrypto mediacrypto)
	{
		String s = mediaformat.getString("mime");
	//    0    0:aload_3         
	//    1    1:ldc1            #154 <String "mime">
	//    2    3:invokevirtual   #160 <Method String MediaFormat.getString(String)>
	//    3    6:astore          5
		if(e)
	//*   4    8:aload_0         
	//*   5    9:getfield        #111 <Field boolean e>
	//*   6   12:ifeq            46
		{
			mediaformat.setString("mime", "audio/raw");
	//    7   15:aload_3         
	//    8   16:ldc1            #154 <String "mime">
	//    9   18:ldc1            #162 <String "audio/raw">
	//   10   20:invokevirtual   #180 <Method void MediaFormat.setString(String, String)>
			mediacodec.configure(mediaformat, ((android.view.Surface) (null)), mediacrypto, 0);
	//   11   23:aload_1         
	//   12   24:aload_3         
	//   13   25:aconst_null     
	//   14   26:aload           4
	//   15   28:iconst_0        
	//   16   29:invokevirtual   #186 <Method void MediaCodec.configure(MediaFormat, android.view.Surface, MediaCrypto, int)>
			mediaformat.setString("mime", s);
	//   17   32:aload_3         
	//   18   33:ldc1            #154 <String "mime">
	//   19   35:aload           5
	//   20   37:invokevirtual   #180 <Method void MediaFormat.setString(String, String)>
			f = mediaformat;
	//   21   40:aload_0         
	//   22   41:aload_3         
	//   23   42:putfield        #152 <Field MediaFormat f>
			return;
	//   24   45:return          
		} else
		{
			mediacodec.configure(mediaformat, ((android.view.Surface) (null)), mediacrypto, 0);
	//   25   46:aload_1         
	//   26   47:aload_3         
	//   27   48:aconst_null     
	//   28   49:aload           4
	//   29   51:iconst_0        
	//   30   52:invokevirtual   #186 <Method void MediaCodec.configure(MediaFormat, android.view.Surface, MediaCrypto, int)>
			f = null;
	//   31   55:aload_0         
	//   32   56:aconst_null     
	//   33   57:putfield        #152 <Field MediaFormat f>
			return;
	//   34   60:return          
		}
	}

	protected void a(q q1)
		throws f
	{
		super.a(q1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #189 <Method void com.google.ads.interactivemedia.v3.a.m.a(q)>
		int i1;
		if("audio/raw".equals(((Object) (q1.a.b))))
	//*   3    5:ldc1            #162 <String "audio/raw">
	//*   4    7:aload_1         
	//*   5    8:getfield        #194 <Field p com.google.ads.interactivemedia.v3.a.q.a>
	//*   6   11:getfield        #199 <Field String com.google.ads.interactivemedia.v3.a.p.b>
	//*   7   14:invokevirtual   #205 <Method boolean String.equals(Object)>
	//*   8   17:ifeq            31
			i1 = q1.a.r;
	//    9   20:aload_1         
	//   10   21:getfield        #194 <Field p com.google.ads.interactivemedia.v3.a.q.a>
	//   11   24:getfield        #208 <Field int p.r>
	//   12   27:istore_2        
		else
	//*  13   28:goto            33
			i1 = 2;
	//   14   31:iconst_2        
	//   15   32:istore_2        
		g = i1;
	//   16   33:aload_0         
	//   17   34:iload_2         
	//   18   35:putfield        #172 <Field int g>
	//   19   38:return          
	}

	protected boolean a(long l1, long l2, MediaCodec mediacodec, ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo, 
			int i1, boolean flag)
		throws f
	{
label0:
		{
			if(e && (bufferinfo.flags & 2) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #111 <Field boolean e>
	//*   2    4:ifeq            27
	//*   3    7:aload           7
	//*   4    9:getfield        #218 <Field int android.media.MediaCodec$BufferInfo.flags>
	//*   5   12:iconst_2        
	//*   6   13:iand            
	//*   7   14:ifeq            27
			{
				mediacodec.releaseOutputBuffer(i1, false);
	//    8   17:aload           5
	//    9   19:iload           8
	//   10   21:iconst_0        
	//   11   22:invokevirtual   #222 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
				return true;
	//   12   25:iconst_1        
	//   13   26:ireturn         
			}
			if(flag)
	//*  14   27:iload           9
	//*  15   29:ifeq            67
			{
				mediacodec.releaseOutputBuffer(i1, false);
	//   16   32:aload           5
	//   17   34:iload           8
	//   18   36:iconst_0        
	//   19   37:invokevirtual   #222 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
				mediacodec = ((MediaCodec) (a));
	//   20   40:aload_0         
	//   21   41:getfield        #225 <Field c a>
	//   22   44:astore          5
				mediacodec.g = ((c) (mediacodec)).g + 1;
	//   23   46:aload           5
	//   24   48:aload           5
	//   25   50:getfield        #228 <Field int c.g>
	//   26   53:iconst_1        
	//   27   54:iadd            
	//   28   55:putfield        #228 <Field int c.g>
				d.f();
	//   29   58:aload_0         
	//   30   59:getfield        #56  <Field b d>
	//   31   62:invokevirtual   #230 <Method void b.f()>
				return true;
	//   32   65:iconst_1        
	//   33   66:ireturn         
			}
			if(d.a())
				break label0;
	//   34   67:aload_0         
	//   35   68:getfield        #56  <Field b d>
	//   36   71:invokevirtual   #232 <Method boolean b.a()>
	//   37   74:ifne            159
			try
			{
				if(h != 0)
	//*  38   77:aload_0         
	//*  39   78:getfield        #49  <Field int h>
	//*  40   81:ifeq            99
				{
					d.a(h);
	//   41   84:aload_0         
	//   42   85:getfield        #56  <Field b d>
	//   43   88:aload_0         
	//   44   89:getfield        #49  <Field int h>
	//   45   92:invokevirtual   #235 <Method int b.a(int)>
	//   46   95:pop             
					break MISSING_BLOCK_LABEL_118;
	//   47   96:goto            118
				}
			}
	//*  48   99:aload_0         
	//*  49  100:aload_0         
	//*  50  101:getfield        #56  <Field b d>
	//*  51  104:invokevirtual   #237 <Method int b.b()>
	//*  52  107:putfield        #49  <Field int h>
	//*  53  110:aload_0         
	//*  54  111:aload_0         
	//*  55  112:getfield        #49  <Field int h>
	//*  56  115:invokevirtual   #239 <Method void a(int)>
	//*  57  118:aload_0         
	//*  58  119:iconst_0        
	//*  59  120:putfield        #241 <Field boolean k>
	//*  60  123:aload_0         
	//*  61  124:invokevirtual   #244 <Method int v()>
	//*  62  127:iconst_3        
	//*  63  128:icmpne          254
	//*  64  131:aload_0         
	//*  65  132:getfield        #56  <Field b d>
	//*  66  135:invokevirtual   #246 <Method void b.e()>
	//*  67  138:goto            254
			// Misplaced declaration of an exception variable
			catch(MediaCodec mediacodec)
	//*  68  141:astore          5
			{
				a(((com.google.ads.interactivemedia.v3.a.a.b.d) (mediacodec)));
	//   69  143:aload_0         
	//   70  144:aload           5
	//   71  146:invokespecial   #248 <Method void a(com.google.ads.interactivemedia.v3.a.a.b$d)>
				throw new f(((Throwable) (mediacodec)));
	//   72  149:new             #118 <Class f>
	//   73  152:dup             
	//   74  153:aload           5
	//   75  155:invokespecial   #251 <Method void f(Throwable)>
	//   76  158:athrow          
			}
		}
		h = d.b();
		a(h);
		k = false;
		if(v() == 3)
			d.e();
		break MISSING_BLOCK_LABEL_254;
		flag = k;
	//   77  159:aload_0         
	//   78  160:getfield        #241 <Field boolean k>
	//   79  163:istore          9
		k = d.h();
	//   80  165:aload_0         
	//   81  166:aload_0         
	//   82  167:getfield        #56  <Field b d>
	//   83  170:invokevirtual   #253 <Method boolean b.h()>
	//   84  173:putfield        #241 <Field boolean k>
		if(flag && !k && v() == 3)
	//*  85  176:iload           9
	//*  86  178:ifeq            254
	//*  87  181:aload_0         
	//*  88  182:getfield        #241 <Field boolean k>
	//*  89  185:ifne            254
	//*  90  188:aload_0         
	//*  91  189:invokevirtual   #244 <Method int v()>
	//*  92  192:iconst_3        
	//*  93  193:icmpne          254
		{
			l2 = SystemClock.elapsedRealtime();
	//   94  196:invokestatic    #258 <Method long SystemClock.elapsedRealtime()>
	//   95  199:lstore_3        
			long l3 = l;
	//   96  200:aload_0         
	//   97  201:getfield        #260 <Field long l>
	//   98  204:lstore          11
			long l4 = d.d();
	//   99  206:aload_0         
	//  100  207:getfield        #56  <Field b d>
	//  101  210:invokevirtual   #262 <Method long b.d()>
	//  102  213:lstore          13
			l1 = -1L;
	//  103  215:ldc2w           #263 <Long -1L>
	//  104  218:lstore_1        
			if(l4 != -1L)
	//* 105  219:lload           13
	//* 106  221:ldc2w           #263 <Long -1L>
	//* 107  224:lcmp            
	//* 108  225:ifne            231
	//* 109  228:goto            238
				l1 = l4 / 1000L;
	//  110  231:lload           13
	//  111  233:ldc2w           #265 <Long 1000L>
	//  112  236:ldiv            
	//  113  237:lstore_1        
			a(d.c(), l1, l2 - l3);
	//  114  238:aload_0         
	//  115  239:aload_0         
	//  116  240:getfield        #56  <Field b d>
	//  117  243:invokevirtual   #268 <Method int b.c()>
	//  118  246:lload_1         
	//  119  247:lload_3         
	//  120  248:lload           11
	//  121  250:lsub            
	//  122  251:invokespecial   #270 <Method void a(int, long, long)>
		}
		int j1;
		try
		{
			j1 = d.a(bytebuffer, bufferinfo.offset, bufferinfo.size, bufferinfo.presentationTimeUs);
	//  123  254:aload_0         
	//  124  255:getfield        #56  <Field b d>
	//  125  258:aload           6
	//  126  260:aload           7
	//  127  262:getfield        #273 <Field int android.media.MediaCodec$BufferInfo.offset>
	//  128  265:aload           7
	//  129  267:getfield        #276 <Field int android.media.MediaCodec$BufferInfo.size>
	//  130  270:aload           7
	//  131  272:getfield        #279 <Field long android.media.MediaCodec$BufferInfo.presentationTimeUs>
	//  132  275:invokevirtual   #282 <Method int b.a(ByteBuffer, int, int, long)>
	//  133  278:istore          10
			l = SystemClock.elapsedRealtime();
	//  134  280:aload_0         
	//  135  281:invokestatic    #258 <Method long SystemClock.elapsedRealtime()>
	//  136  284:putfield        #260 <Field long l>
		}
	//* 137  287:iload           10
	//* 138  289:iconst_1        
	//* 139  290:iand            
	//* 140  291:ifeq            303
	//* 141  294:aload_0         
	//* 142  295:invokevirtual   #284 <Method void i()>
	//* 143  298:aload_0         
	//* 144  299:iconst_1        
	//* 145  300:putfield        #90  <Field boolean j>
	//* 146  303:iload           10
	//* 147  305:iconst_2        
	//* 148  306:iand            
	//* 149  307:ifeq            338
	//* 150  310:aload           5
	//* 151  312:iload           8
	//* 152  314:iconst_0        
	//* 153  315:invokevirtual   #222 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
	//* 154  318:aload_0         
	//* 155  319:getfield        #225 <Field c a>
	//* 156  322:astore          5
	//* 157  324:aload           5
	//* 158  326:aload           5
	//* 159  328:getfield        #286 <Field int c.f>
	//* 160  331:iconst_1        
	//* 161  332:iadd            
	//* 162  333:putfield        #286 <Field int c.f>
	//* 163  336:iconst_1        
	//* 164  337:ireturn         
	//* 165  338:iconst_0        
	//* 166  339:ireturn         
		// Misplaced declaration of an exception variable
		catch(MediaCodec mediacodec)
	//* 167  340:astore          5
		{
			a(((com.google.ads.interactivemedia.v3.a.a.b.f) (mediacodec)));
	//  168  342:aload_0         
	//  169  343:aload           5
	//  170  345:invokespecial   #288 <Method void a(com.google.ads.interactivemedia.v3.a.a.b$f)>
			throw new f(((Throwable) (mediacodec)));
	//  171  348:new             #118 <Class f>
	//  172  351:dup             
	//  173  352:aload           5
	//  174  354:invokespecial   #251 <Method void f(Throwable)>
	//  175  357:athrow          
		}
		if((j1 & 1) != 0)
		{
			i();
			j = true;
		}
		if((j1 & 2) != 0)
		{
			mediacodec.releaseOutputBuffer(i1, false);
			mediacodec = ((MediaCodec) (a));
			mediacodec.f = ((c) (mediacodec)).f + 1;
			return true;
		} else
		{
			return false;
		}
	}

	protected boolean a(l l1, p p1)
		throws n.b
	{
		boolean flag;
label0:
		{
			p1 = ((p) (p1.b));
	//    0    0:aload_2         
	//    1    1:getfield        #199 <Field String com.google.ads.interactivemedia.v3.a.p.b>
	//    2    4:astore_2        
			boolean flag2 = com.google.ads.interactivemedia.v3.a.f.i.a(((String) (p1)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #292 <Method boolean i.a(String)>
	//    5    9:istore          5
			boolean flag1 = false;
	//    6   11:iconst_0        
	//    7   12:istore          4
			flag = flag1;
	//    8   14:iload           4
	//    9   16:istore_3        
			if(!flag2)
				break label0;
	//   10   17:iload           5
	//   11   19:ifeq            65
			if(!"audio/x-unknown".equals(((Object) (p1))) && (!a(((String) (p1))) || l1.a() == null))
	//*  12   22:ldc2            #294 <String "audio/x-unknown">
	//*  13   25:aload_2         
	//*  14   26:invokevirtual   #205 <Method boolean String.equals(Object)>
	//*  15   29:ifne            63
	//*  16   32:aload_0         
	//*  17   33:aload_2         
	//*  18   34:invokevirtual   #104 <Method boolean a(String)>
	//*  19   37:ifeq            49
	//*  20   40:aload_1         
	//*  21   41:invokeinterface #109 <Method e com.google.ads.interactivemedia.v3.a.l.a()>
	//*  22   46:ifnonnull       63
			{
				flag = flag1;
	//   23   49:iload           4
	//   24   51:istore_3        
				if(l1.a(((String) (p1)), false) == null)
					break label0;
	//   25   52:aload_1         
	//   26   53:aload_2         
	//   27   54:iconst_0        
	//   28   55:invokeinterface #297 <Method e com.google.ads.interactivemedia.v3.a.l.a(String, boolean)>
	//   29   60:ifnull          65
			}
			flag = true;
	//   30   63:iconst_1        
	//   31   64:istore_3        
		}
		return flag;
	//   32   65:iload_3         
	//   33   66:ireturn         
	}

	protected boolean a(String s)
	{
		return d.a(s);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field b d>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #298 <Method boolean b.a(String)>
	//    4    8:ireturn         
	}

	protected j b()
	{
		return ((j) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	protected void c()
	{
		super.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #301 <Method void m.c()>
		d.e();
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field b d>
	//    4    8:invokevirtual   #246 <Method void b.e()>
	//    5   11:return          
	}

	protected void d()
	{
		d.i();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field b d>
	//    2    4:invokevirtual   #302 <Method void b.i()>
		super.d();
	//    3    7:aload_0         
	//    4    8:invokespecial   #304 <Method void m.d()>
	//    5   11:return          
	}

	protected boolean e()
	{
		return super.e() && !d.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #305 <Method boolean m.e()>
	//    2    4:ifeq            19
	//    3    7:aload_0         
	//    4    8:getfield        #56  <Field b d>
	//    5   11:invokevirtual   #253 <Method boolean b.h()>
	//    6   14:ifne            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	protected boolean f()
	{
		return d.h() || super.f();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field b d>
	//    2    4:invokevirtual   #253 <Method boolean b.h()>
	//    3    7:ifne            22
	//    4   10:aload_0         
	//    5   11:invokespecial   #307 <Method boolean m.f()>
	//    6   14:ifeq            20
	//    7   17:goto            22
	//    8   20:iconst_0        
	//    9   21:ireturn         
	//   10   22:iconst_1        
	//   11   23:ireturn         
	}

	protected void g()
		throws f
	{
		h = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #49  <Field int h>
		d.k();
	//    3    5:aload_0         
	//    4    6:getfield        #56  <Field b d>
	//    5    9:invokevirtual   #309 <Method void b.k()>
		super.g();
	//    6   12:aload_0         
	//    7   13:invokespecial   #311 <Method void m.g()>
		return;
	//    8   16:return          
		Exception exception;
		exception;
	//    9   17:astore_1        
		super.g();
	//   10   18:aload_0         
	//   11   19:invokespecial   #311 <Method void m.g()>
		throw exception;
	//   12   22:aload_1         
	//   13   23:athrow          
	}

	protected void h()
	{
		d.g();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field b d>
	//    2    4:invokevirtual   #312 <Method void b.g()>
	//    3    7:return          
	}

	protected void i()
	{
	//    0    0:return          
	}

	private final a c;
	private final b d;
	private boolean e;
	private MediaFormat f;
	private int g;
	private int h;
	private long i;
	private boolean j;
	private boolean k;
	private long l;
}
