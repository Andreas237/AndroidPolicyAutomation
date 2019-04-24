// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.*;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.*;
import com.truenet.android.a.i;
import com.truenet.android.a.j;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

public final class com.truenet.android.b
{
	public static final class a
	{

		public static final boolean a(a a1, String s)
		{
			return a1.a(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #19  <Method boolean a(String)>
		//    3    5:ireturn         
		}

		private final boolean a(String s)
		{
			if(!bb.a(s, "http://play.google.com", false, 2, ((Object) (null))) && !bb.a(s, "https://play.google.com", false, 2, ((Object) (null))) && !bb.a(s, "http://itunes.apple.com", false, 2, ((Object) (null))) && !bb.a(s, "https://itunes.apple.com", false, 2, ((Object) (null))))
		//*   0    0:aload_1         
		//*   1    1:ldc1            #22  <String "http://play.google.com">
		//*   2    3:iconst_0        
		//*   3    4:iconst_2        
		//*   4    5:aconst_null     
		//*   5    6:invokestatic    #27  <Method boolean bb.a(String, String, boolean, int, Object)>
		//*   6    9:ifeq            14
		//*   7   12:iconst_1        
		//*   8   13:ireturn         
		//*   9   14:aload_1         
		//*  10   15:ldc1            #29  <String "https://play.google.com">
		//*  11   17:iconst_0        
		//*  12   18:iconst_2        
		//*  13   19:aconst_null     
		//*  14   20:invokestatic    #27  <Method boolean bb.a(String, String, boolean, int, Object)>
		//*  15   23:ifne            12
		//*  16   26:aload_1         
		//*  17   27:ldc1            #31  <String "http://itunes.apple.com">
		//*  18   29:iconst_0        
		//*  19   30:iconst_2        
		//*  20   31:aconst_null     
		//*  21   32:invokestatic    #27  <Method boolean bb.a(String, String, boolean, int, Object)>
		//*  22   35:ifne            12
		//*  23   38:aload_1         
		//*  24   39:ldc1            #33  <String "https://itunes.apple.com">
		//*  25   41:iconst_0        
		//*  26   42:iconst_2        
		//*  27   43:aconst_null     
		//*  28   44:invokestatic    #27  <Method boolean bb.a(String, String, boolean, int, Object)>
		//*  29   47:ifne            12
			{
				if(bb.a(s, "http://", false, 2, ((Object) (null))))
		//*  30   50:aload_1         
		//*  31   51:ldc1            #35  <String "http://">
		//*  32   53:iconst_0        
		//*  33   54:iconst_2        
		//*  34   55:aconst_null     
		//*  35   56:invokestatic    #27  <Method boolean bb.a(String, String, boolean, int, Object)>
		//*  36   59:ifeq            64
					return false;
		//   37   62:iconst_0        
		//   38   63:ireturn         
				if(bb.a(s, "https://", false, 2, ((Object) (null))))
		//*  39   64:aload_1         
		//*  40   65:ldc1            #37  <String "https://">
		//*  41   67:iconst_0        
		//*  42   68:iconst_2        
		//*  43   69:aconst_null     
		//*  44   70:invokestatic    #27  <Method boolean bb.a(String, String, boolean, int, Object)>
		//*  45   73:ifeq            78
					return false;
		//   46   76:iconst_0        
		//   47   77:ireturn         
				if(!a().a((CharSequence)s))
		//*  48   78:aload_0         
		//*  49   79:checkcast       #2   <Class b$a>
		//*  50   82:invokevirtual   #40  <Method ba a()>
		//*  51   85:aload_1         
		//*  52   86:checkcast       #42  <Class CharSequence>
		//*  53   89:invokevirtual   #47  <Method boolean ba.a(CharSequence)>
		//*  54   92:ifne            12
					return false;
		//   55   95:iconst_0        
		//   56   96:ireturn         
			}
			return true;
		}

		public final ba a()
		{
			return com.truenet.android.b.h();
		//    0    0:invokestatic    #50  <Method ba b.h()>
		//    1    3:areturn         
		}

		private a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}

		public a(ab ab)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void b$a()>
		//    2    4:return          
		}
	}

	public static final class b
	{

		public static volatile b a(b b1, String s, long l1, int i1, List list, String s1, int j1, 
				Object obj)
		{
			if((j1 & 1) != 0)
		//*   0    0:iload           7
		//*   1    2:iconst_1        
		//*   2    3:iand            
		//*   3    4:ifeq            90
				s = b1.a;
		//    4    7:aload_0         
		//    5    8:getfield        #32  <Field String a>
		//    6   11:astore_1        
			if((j1 & 2) != 0)
		//*   7   12:iload           7
		//*   8   14:iconst_2        
		//*   9   15:iand            
		//*  10   16:ifeq            87
				l1 = b1.b;
		//   11   19:aload_0         
		//   12   20:getfield        #34  <Field long b>
		//   13   23:lstore_2        
			if((j1 & 4) != 0)
		//*  14   24:iload           7
		//*  15   26:iconst_4        
		//*  16   27:iand            
		//*  17   28:ifeq            84
				i1 = b1.c;
		//   18   31:aload_0         
		//   19   32:getfield        #36  <Field int c>
		//   20   35:istore          4
			if((j1 & 8) != 0)
		//*  21   37:iload           7
		//*  22   39:bipush          8
		//*  23   41:iand            
		//*  24   42:ifeq            81
				list = b1.d;
		//   25   45:aload_0         
		//   26   46:getfield        #38  <Field List d>
		//   27   49:astore          5
			if((j1 & 0x10) != 0)
		//*  28   51:iload           7
		//*  29   53:bipush          16
		//*  30   55:iand            
		//*  31   56:ifeq            78
				s1 = b1.e;
		//   32   59:aload_0         
		//   33   60:getfield        #40  <Field String e>
		//   34   63:astore          6
			return b1.a(s, l1, i1, list, s1);
		//   35   65:aload_0         
		//   36   66:aload_1         
		//   37   67:lload_2         
		//   38   68:iload           4
		//   39   70:aload           5
		//   40   72:aload           6
		//   41   74:invokevirtual   #48  <Method b$b a(String, long, int, List, String)>
		//   42   77:areturn         
		//*  43   78:goto            65
		//*  44   81:goto            51
		//*  45   84:goto            37
		//*  46   87:goto            24
		//*  47   90:goto            12
		}

		public final b a(String s, long l1, int i1, List list, String s1)
		{
			ae.b(((Object) (s)), "url");
		//    0    0:aload_1         
		//    1    1:ldc1            #22  <String "url">
		//    2    3:invokestatic    #27  <Method void ae.b(Object, String)>
			return new b(s, l1, i1, list, s1);
		//    3    6:new             #2   <Class b$b>
		//    4    9:dup             
		//    5   10:aload_1         
		//    6   11:lload_2         
		//    7   12:iload           4
		//    8   14:aload           5
		//    9   16:aload           6
		//   10   18:invokespecial   #51  <Method void b$b(String, long, int, List, String)>
		//   11   21:areturn         
		}

		public final String a()
		{
			return a;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field String a>
		//    2    4:areturn         
		}

		public final long b()
		{
			return b;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field long b>
		//    2    4:lreturn         
		}

		public final int c()
		{
			return c;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field int c>
		//    2    4:ireturn         
		}

		public final List d()
		{
			return d;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field List d>
		//    2    4:areturn         
		}

		public final String e()
		{
			return e;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field String e>
		//    2    4:areturn         
		}

		public boolean equals(Object obj)
		{
label0:
			{
				boolean flag2 = false;
		//    0    0:iconst_0        
		//    1    1:istore          4
				if(this != obj)
		//*   2    3:aload_0         
		//*   3    4:aload_1         
		//*   4    5:if_acmpeq       115
				{
					boolean flag1 = flag2;
		//    5    8:iload           4
		//    6   10:istore_3        
					if(!(obj instanceof b))
						break label0;
		//    7   11:aload_1         
		//    8   12:instanceof      #2   <Class b$b>
		//    9   15:ifeq            117
					obj = ((Object) ((b)obj));
		//   10   18:aload_1         
		//   11   19:checkcast       #2   <Class b$b>
		//   12   22:astore_1        
					flag1 = flag2;
		//   13   23:iload           4
		//   14   25:istore_3        
					if(!ae.a(((Object) (a)), ((Object) (((b) (obj)).a))))
						break label0;
		//   15   26:aload_0         
		//   16   27:getfield        #32  <Field String a>
		//   17   30:aload_1         
		//   18   31:getfield        #32  <Field String a>
		//   19   34:invokestatic    #62  <Method boolean ae.a(Object, Object)>
		//   20   37:ifeq            117
					boolean flag;
					if(b == ((b) (obj)).b)
		//*  21   40:aload_0         
		//*  22   41:getfield        #34  <Field long b>
		//*  23   44:aload_1         
		//*  24   45:getfield        #34  <Field long b>
		//*  25   48:lcmp            
		//*  26   49:ifne            119
						flag = true;
		//   27   52:iconst_1        
		//   28   53:istore_2        
					else
		//*  29   54:iload           4
		//*  30   56:istore_3        
		//*  31   57:iload_2         
		//*  32   58:ifeq            117
		//*  33   61:aload_0         
		//*  34   62:getfield        #36  <Field int c>
		//*  35   65:aload_1         
		//*  36   66:getfield        #36  <Field int c>
		//*  37   69:icmpne          124
		//*  38   72:iconst_1        
		//*  39   73:istore_2        
		//*  40   74:iload           4
		//*  41   76:istore_3        
		//*  42   77:iload_2         
		//*  43   78:ifeq            117
		//*  44   81:iload           4
		//*  45   83:istore_3        
		//*  46   84:aload_0         
		//*  47   85:getfield        #38  <Field List d>
		//*  48   88:aload_1         
		//*  49   89:getfield        #38  <Field List d>
		//*  50   92:invokestatic    #62  <Method boolean ae.a(Object, Object)>
		//*  51   95:ifeq            117
		//*  52   98:iload           4
		//*  53  100:istore_3        
		//*  54  101:aload_0         
		//*  55  102:getfield        #40  <Field String e>
		//*  56  105:aload_1         
		//*  57  106:getfield        #40  <Field String e>
		//*  58  109:invokestatic    #62  <Method boolean ae.a(Object, Object)>
		//*  59  112:ifeq            117
		//*  60  115:iconst_1        
		//*  61  116:istore_3        
		//*  62  117:iload_3         
		//*  63  118:ireturn         
						flag = false;
		//   64  119:iconst_0        
		//   65  120:istore_2        
					flag1 = flag2;
					if(!flag)
						break label0;
					if(c == ((b) (obj)).c)
						flag = true;
					else
		//*  66  121:goto            54
						flag = false;
		//   67  124:iconst_0        
		//   68  125:istore_2        
					flag1 = flag2;
					if(!flag)
						break label0;
					flag1 = flag2;
					if(!ae.a(((Object) (d)), ((Object) (((b) (obj)).d))))
						break label0;
					flag1 = flag2;
					if(!ae.a(((Object) (e)), ((Object) (((b) (obj)).e))))
						break label0;
				}
				flag1 = true;
			}
			return flag1;
		//*  69  126:goto            74
		}

		public int hashCode()
		{
			int k1 = 0;
		//    0    0:iconst_0        
		//    1    1:istore_3        
			Object obj = ((Object) (a));
		//    2    2:aload_0         
		//    3    3:getfield        #32  <Field String a>
		//    4    6:astore          8
			int i1;
			int j1;
			int l1;
			int i2;
			long l2;
			if(obj != null)
		//*   5    8:aload           8
		//*   6   10:ifnull          100
				i1 = obj.hashCode();
		//    7   13:aload           8
		//    8   15:invokevirtual   #65  <Method int Object.hashCode()>
		//    9   18:istore_1        
			else
		//*  10   19:aload_0         
		//*  11   20:getfield        #34  <Field long b>
		//*  12   23:lstore          6
		//*  13   25:lload           6
		//*  14   27:lload           6
		//*  15   29:bipush          32
		//*  16   31:lushr           
		//*  17   32:lxor            
		//*  18   33:l2i             
		//*  19   34:istore          4
		//*  20   36:aload_0         
		//*  21   37:getfield        #36  <Field int c>
		//*  22   40:istore          5
		//*  23   42:aload_0         
		//*  24   43:getfield        #38  <Field List d>
		//*  25   46:astore          8
		//*  26   48:aload           8
		//*  27   50:ifnull          105
		//*  28   53:aload           8
		//*  29   55:invokevirtual   #65  <Method int Object.hashCode()>
		//*  30   58:istore_2        
		//*  31   59:aload_0         
		//*  32   60:getfield        #40  <Field String e>
		//*  33   63:astore          8
		//*  34   65:aload           8
		//*  35   67:ifnull          76
		//*  36   70:aload           8
		//*  37   72:invokevirtual   #65  <Method int Object.hashCode()>
		//*  38   75:istore_3        
		//*  39   76:iload_2         
		//*  40   77:iload_1         
		//*  41   78:bipush          31
		//*  42   80:imul            
		//*  43   81:iload           4
		//*  44   83:iadd            
		//*  45   84:bipush          31
		//*  46   86:imul            
		//*  47   87:iload           5
		//*  48   89:iadd            
		//*  49   90:bipush          31
		//*  50   92:imul            
		//*  51   93:iadd            
		//*  52   94:bipush          31
		//*  53   96:imul            
		//*  54   97:iload_3         
		//*  55   98:iadd            
		//*  56   99:ireturn         
				i1 = 0;
		//   57  100:iconst_0        
		//   58  101:istore_1        
			l2 = b;
			l1 = (int)(l2 ^ l2 >>> 32);
			i2 = c;
			obj = ((Object) (d));
			if(obj != null)
				j1 = obj.hashCode();
			else
		//*  59  102:goto            19
				j1 = 0;
		//   60  105:iconst_0        
		//   61  106:istore_2        
			obj = ((Object) (e));
			if(obj != null)
				k1 = obj.hashCode();
			return (j1 + ((i1 * 31 + l1) * 31 + i2) * 31) * 31 + k1;
		//*  62  107:goto            59
		}

		public String toString()
		{
			return (new StringBuilder()).append("ConnectionInfo(url=").append(a).append(", loadTime=").append(b).append(", httpCode=").append(c).append(", cookie=").append(((Object) (d))).append(", redirectUrl=").append(e).append(")").toString();
		//    0    0:new             #68  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #69  <Method void StringBuilder()>
		//    3    7:ldc1            #71  <String "ConnectionInfo(url=">
		//    4    9:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//    5   12:aload_0         
		//    6   13:getfield        #32  <Field String a>
		//    7   16:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//    8   19:ldc1            #77  <String ", loadTime=">
		//    9   21:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   10   24:aload_0         
		//   11   25:getfield        #34  <Field long b>
		//   12   28:invokevirtual   #80  <Method StringBuilder StringBuilder.append(long)>
		//   13   31:ldc1            #82  <String ", httpCode=">
		//   14   33:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   15   36:aload_0         
		//   16   37:getfield        #36  <Field int c>
		//   17   40:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
		//   18   43:ldc1            #87  <String ", cookie=">
		//   19   45:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   20   48:aload_0         
		//   21   49:getfield        #38  <Field List d>
		//   22   52:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
		//   23   55:ldc1            #92  <String ", redirectUrl=">
		//   24   57:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   25   60:aload_0         
		//   26   61:getfield        #40  <Field String e>
		//   27   64:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   28   67:ldc1            #94  <String ")">
		//   29   69:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   30   72:invokevirtual   #96  <Method String StringBuilder.toString()>
		//   31   75:areturn         
		}

		private final String a;
		private final long b;
		private final int c;
		private final List d;
		private final String e;

		public b(String s, long l1, int i1, List list, String s1)
		{
			ae.b(((Object) (s)), "url");
		//    0    0:aload_1         
		//    1    1:ldc1            #22  <String "url">
		//    2    3:invokestatic    #27  <Method void ae.b(Object, String)>
			super();
		//    3    6:aload_0         
		//    4    7:invokespecial   #30  <Method void Object()>
			a = s;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #32  <Field String a>
			b = l1;
		//    8   15:aload_0         
		//    9   16:lload_2         
		//   10   17:putfield        #34  <Field long b>
			c = i1;
		//   11   20:aload_0         
		//   12   21:iload           4
		//   13   23:putfield        #36  <Field int c>
			d = list;
		//   14   26:aload_0         
		//   15   27:aload           5
		//   16   29:putfield        #38  <Field List d>
			e = s1;
		//   17   32:aload_0         
		//   18   33:aload           6
		//   19   35:putfield        #40  <Field String e>
		//   20   38:return          
		}
	}

	public final class c extends WebViewClient
	{

		private final void a()
		{
			ScheduledFuture scheduledfuture = c;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field ScheduledFuture c>
		//    2    4:astore_1        
			if(scheduledfuture != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          17
				scheduledfuture.cancel(false);
		//    5    9:aload_1         
		//    6   10:iconst_0        
		//    7   11:invokeinterface #40  <Method boolean ScheduledFuture.cancel(boolean)>
		//    8   16:pop             
			c = (ScheduledFuture)null;
		//    9   17:aload_0         
		//   10   18:aconst_null     
		//   11   19:checkcast       #36  <Class ScheduledFuture>
		//   12   22:putfield        #34  <Field ScheduledFuture c>
		//   13   25:return          
		}

		private final void a(WebView webview, String s)
		{
			a();
		//    0    0:aload_0         
		//    1    1:invokespecial   #43  <Method void a()>
			if(s != null)
		//*   2    4:aload_2         
		//*   3    5:ifnull          28
			{
				if(webview != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          16
					webview.stopLoading();
		//    6   12:aload_1         
		//    7   13:invokevirtual   #48  <Method void WebView.stopLoading()>
				com.truenet.android.b.a(a).offer(((Object) (s)));
		//    8   16:aload_0         
		//    9   17:getfield        #19  <Field b a>
		//   10   20:invokestatic    #51  <Method SynchronousQueue b.a(b)>
		//   11   23:aload_2         
		//   12   24:invokevirtual   #57  <Method boolean SynchronousQueue.offer(Object)>
		//   13   27:pop             
			}
		//   14   28:return          
		}

		public void onPageFinished(WebView webview, String s)
		{
			a();
		//    0    0:aload_0         
		//    1    1:invokespecial   #43  <Method void a()>
			static final class c.a
				implements Runnable
			{

				public final void run()
				{
					com.truenet.android.b.a(a.a).offer("");
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field b$c a>
				//    2    4:getfield        #28  <Field b b$c.a>
				//    3    7:invokestatic    #31  <Method SynchronousQueue b.a(b)>
				//    4   10:ldc1            #33  <String "">
				//    5   12:invokevirtual   #39  <Method boolean SynchronousQueue.offer(Object)>
				//    6   15:pop             
				//    7   16:return          
				}

				final c a;

			c.a(c c1)
			{
				a = c1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field b$c a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
			}

			c = b.schedule((Runnable)new a(this), 1L, TimeUnit.SECONDS);
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:getfield        #30  <Field ScheduledExecutorService b>
		//    5    9:new             #9   <Class b$c$a>
		//    6   12:dup             
		//    7   13:aload_0         
		//    8   14:invokespecial   #62  <Method void b$c$a(b$c)>
		//    9   17:checkcast       #64  <Class Runnable>
		//   10   20:lconst_1        
		//   11   21:getstatic       #70  <Field TimeUnit TimeUnit.SECONDS>
		//   12   24:invokeinterface #76  <Method ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
		//   13   29:putfield        #34  <Field ScheduledFuture c>
			super.onPageFinished(webview, s);
		//   14   32:aload_0         
		//   15   33:aload_1         
		//   16   34:aload_2         
		//   17   35:invokespecial   #78  <Method void WebViewClient.onPageFinished(WebView, String)>
		//   18   38:return          
		}

		public void onReceivedError(WebView webview, WebResourceRequest webresourcerequest, WebResourceError webresourceerror)
		{
			a();
		//    0    0:aload_0         
		//    1    1:invokespecial   #43  <Method void a()>
			if(webview != null)
		//*   2    4:aload_1         
		//*   3    5:ifnull          12
				webview.stopLoading();
		//    4    8:aload_1         
		//    5    9:invokevirtual   #48  <Method void WebView.stopLoading()>
			com.truenet.android.b.a(a).offer("");
		//    6   12:aload_0         
		//    7   13:getfield        #19  <Field b a>
		//    8   16:invokestatic    #51  <Method SynchronousQueue b.a(b)>
		//    9   19:ldc1            #83  <String "">
		//   10   21:invokevirtual   #57  <Method boolean SynchronousQueue.offer(Object)>
		//   11   24:pop             
			super.onReceivedError(webview, webresourcerequest, webresourceerror);
		//   12   25:aload_0         
		//   13   26:aload_1         
		//   14   27:aload_2         
		//   15   28:aload_3         
		//   16   29:invokespecial   #85  <Method void WebViewClient.onReceivedError(WebView, WebResourceRequest, WebResourceError)>
		//   17   32:return          
		}

		public boolean shouldOverrideUrlLoading(WebView webview, WebResourceRequest webresourcerequest)
		{
			if(webresourcerequest != null)
		//*   0    0:aload_2         
		//*   1    1:ifnull          22
				webresourcerequest = ((WebResourceRequest) (webresourcerequest.getUrl()));
		//    2    4:aload_2         
		//    3    5:invokeinterface #96  <Method android.net.Uri WebResourceRequest.getUrl()>
		//    4   10:astore_2        
			else
		//*   5   11:aload_0         
		//*   6   12:aload_1         
		//*   7   13:aload_2         
		//*   8   14:invokestatic    #102 <Method String String.valueOf(Object)>
		//*   9   17:invokespecial   #104 <Method void a(WebView, String)>
		//*  10   20:iconst_1        
		//*  11   21:ireturn         
				webresourcerequest = null;
		//   12   22:aconst_null     
		//   13   23:astore_2        
			a(webview, String.valueOf(((Object) (webresourcerequest))));
			return true;
		//*  14   24:goto            11
		}

		public boolean shouldOverrideUrlLoading(WebView webview, String s)
		{
			a(webview, s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #104 <Method void a(WebView, String)>
			return true;
		//    4    6:iconst_1        
		//    5    7:ireturn         
		}

		final com.truenet.android.b a;
		private ScheduledExecutorService b;
		private ScheduledFuture c;

		public c()
		{
			a = com.truenet.android.b.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field b a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void WebViewClient()>
			b = Executors.newScheduledThreadPool(1);
		//    5    9:aload_0         
		//    6   10:iconst_1        
		//    7   11:invokestatic    #28  <Method ScheduledExecutorService Executors.newScheduledThreadPool(int)>
		//    8   14:putfield        #30  <Field ScheduledExecutorService b>
		//    9   17:return          
		}
	}


	public com.truenet.android.b(Context context, String s, int i1, long l1)
	{
		ae.b(((Object) (context)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #93  <String "context">
	//    2    3:invokestatic    #98  <Method void ae.b(Object, String)>
		ae.b(((Object) (s)), "url");
	//    3    6:aload_2         
	//    4    7:ldc1            #100 <String "url">
	//    5    9:invokestatic    #98  <Method void ae.b(Object, String)>
		super();
	//    6   12:aload_0         
	//    7   13:invokespecial   #102 <Method void Object()>
		j = context;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #104 <Field Context j>
		k = s;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #106 <Field String k>
		l = i1;
	//   14   26:aload_0         
	//   15   27:iload_3         
	//   16   28:putfield        #108 <Field int l>
		m = l1;
	//   17   31:aload_0         
	//   18   32:lload           4
	//   19   34:putfield        #110 <Field long m>
		e = k;
	//   20   37:aload_0         
	//   21   38:aload_0         
	//   22   39:getfield        #106 <Field String k>
	//   23   42:putfield        #112 <Field String e>
	//   24   45:aload_0         
	//   25   46:new             #114 <Class ArrayList>
	//   26   49:dup             
	//   27   50:invokespecial   #115 <Method void ArrayList()>
	//   28   53:checkcast       #117 <Class List>
	//   29   56:putfield        #119 <Field List g>
		static final class f extends af
			implements v
		{

			public Object a()
			{
				return ((Object) (b()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #29  <Method SynchronousQueue b()>
			//    2    4:areturn         
			}

			public final SynchronousQueue b()
			{
				return new SynchronousQueue();
			//    0    0:new             #32  <Class SynchronousQueue>
			//    1    3:dup             
			//    2    4:invokespecial   #33  <Method void SynchronousQueue()>
			//    3    7:areturn         
			}

			public static final f a = new f();

			static 
			{
			//    0    0:new             #2   <Class b$f>
			//    1    3:dup             
			//    2    4:invokespecial   #18  <Method void b$f()>
			//    3    7:putstatic       #20  <Field b$f a>
			//*   4   10:return          
			}

			f()
			{
				super(0);
			//    0    0:aload_0         
			//    1    1:iconst_0        
			//    2    2:invokespecial   #24  <Method void af(int)>
			//    3    5:return          
			}
		}

		h = ar.a((v)f.a);
	//   30   59:aload_0         
	//   31   60:getstatic       #122 <Field b$f b$f.a>
	//   32   63:checkcast       #124 <Class v>
	//   33   66:invokestatic    #129 <Method am ar.a(v)>
	//   34   69:putfield        #131 <Field am h>
		static final class g extends af
			implements v
		{

			public Object a()
			{
				return ((Object) (b()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #27  <Method WebView b()>
			//    2    4:areturn         
			}

			public final WebView b()
			{
				WebView webview = new WebView(com.truenet.android.b.c(com.truenet.android.b.this));
			//    0    0:new             #30  <Class WebView>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:getfield        #17  <Field b this$0>
			//    4    8:invokestatic    #34  <Method Context b.c(b)>
			//    5   11:invokespecial   #37  <Method void WebView(Context)>
			//    6   14:astore_1        
				if(android.os.Build.VERSION.SDK_INT >= 11)
			//*   7   15:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
			//*   8   18:bipush          11
			//*   9   20:icmplt          29
					webview.setLayerType(1, ((android.graphics.Paint) (null)));
			//   10   23:aload_1         
			//   11   24:iconst_1        
			//   12   25:aconst_null     
			//   13   26:invokevirtual   #47  <Method void WebView.setLayerType(int, android.graphics.Paint)>
				WebSettings websettings = webview.getSettings();
			//   14   29:aload_1         
			//   15   30:invokevirtual   #51  <Method WebSettings WebView.getSettings()>
			//   16   33:astore_2        
				ae.a(((Object) (websettings)), "settings");
			//   17   34:aload_2         
			//   18   35:ldc1            #53  <String "settings">
			//   19   37:invokestatic    #58  <Method void ae.a(Object, String)>
				websettings.setJavaScriptEnabled(true);
			//   20   40:aload_2         
			//   21   41:iconst_1        
			//   22   42:invokevirtual   #64  <Method void WebSettings.setJavaScriptEnabled(boolean)>
				webview.setWebChromeClient(new WebChromeClient());
			//   23   45:aload_1         
			//   24   46:new             #66  <Class WebChromeClient>
			//   25   49:dup             
			//   26   50:invokespecial   #69  <Method void WebChromeClient()>
			//   27   53:invokevirtual   #73  <Method void WebView.setWebChromeClient(WebChromeClient)>
				webview.setWebViewClient((WebViewClient)new c());
			//   28   56:aload_1         
			//   29   57:new             #75  <Class b$c>
			//   30   60:dup             
			//   31   61:aload_0         
			//   32   62:getfield        #17  <Field b this$0>
			//   33   65:invokespecial   #77  <Method void b$c(b)>
			//   34   68:checkcast       #79  <Class WebViewClient>
			//   35   71:invokevirtual   #83  <Method void WebView.setWebViewClient(WebViewClient)>
				return webview;
			//   36   74:aload_1         
			//   37   75:areturn         
			}

			final com.truenet.android.b this$0;

			g(com.truenet.android.b b1)
			{
				this$0 = b1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field b this$0>
				super(0);
			//    3    5:aload_0         
			//    4    6:iconst_0        
			//    5    7:invokespecial   #20  <Method void af(int)>
			//    6   10:return          
			}
		}

	//   35   72:aload_0         
	//   36   73:new             #23  <Class b$g>
	//   37   76:dup             
	//   38   77:aload_0         
	//   39   78:invokespecial   #134 <Method void b$g(b)>
	//   40   81:checkcast       #124 <Class v>
	//   41   84:invokestatic    #129 <Method am ar.a(v)>
	//   42   87:putfield        #136 <Field am i>
	//   43   90:return          
	}

	static volatile b a(com.truenet.android.b b1, String s, List list, int i1, Object obj)
	{
		if((i1 & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            18
			list = (List)null;
	//    4    6:aconst_null     
	//    5    7:checkcast       #117 <Class List>
	//    6   10:astore_2        
		return b1.a(s, list);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:invokespecial   #141 <Method b$b a(String, List)>
	//   11   17:areturn         
	//*  12   18:goto            11
	}

	private final b a(String s, List list)
	{
		f = (String)null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:checkcast       #145 <Class String>
	//    3    5:putfield        #147 <Field String f>
		if(a.a(b, s))
	//*   4    8:getstatic       #80  <Field b$a b>
	//*   5   11:aload_1         
	//*   6   12:invokestatic    #150 <Method boolean b$a.a(b$a, String)>
	//*   7   15:ifeq            33
			return new b(s, 0L, 200, ((List) (null)), ((String) (null)));
	//    8   18:new             #9   <Class b$b>
	//    9   21:dup             
	//   10   22:aload_1         
	//   11   23:lconst_0        
	//   12   24:sipush          200
	//   13   27:aconst_null     
	//   14   28:aconst_null     
	//   15   29:invokespecial   #153 <Method void b$b(String, long, int, List, String)>
	//   16   32:areturn         
		HttpURLConnection httpurlconnection = (HttpURLConnection)null;
	//   17   33:aconst_null     
	//   18   34:checkcast       #155 <Class HttpURLConnection>
	//   19   37:astore          8
		int i1;
		Object obj;
		static final class e
			implements Runnable
		{

			public final void run()
			{
				com.truenet.android.b.b(b).loadDataWithBaseURL(e, b.f(), a.getContentType(), a.getContentEncoding(), ((String) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #26  <Field b b>
			//    2    4:invokestatic    #40  <Method WebView b.b(b)>
			//    3    7:aload_0         
			//    4    8:getfield        #32  <Field String e>
			//    5   11:aload_0         
			//    6   12:getfield        #26  <Field b b>
			//    7   15:invokevirtual   #44  <Method String b.f()>
			//    8   18:aload_0         
			//    9   19:getfield        #24  <Field HttpURLConnection a>
			//   10   22:invokevirtual   #49  <Method String HttpURLConnection.getContentType()>
			//   11   25:aload_0         
			//   12   26:getfield        #24  <Field HttpURLConnection a>
			//   13   29:invokevirtual   #52  <Method String HttpURLConnection.getContentEncoding()>
			//   14   32:aconst_null     
			//   15   33:invokevirtual   #58  <Method void WebView.loadDataWithBaseURL(String, String, String, String, String)>
			//   16   36:return          
			}

			final HttpURLConnection a;
			final com.truenet.android.b b;
			final List c;
			final URL d;
			final String e;

			e(HttpURLConnection httpurlconnection, com.truenet.android.b b1, List list, URL url, String s)
			{
				a = httpurlconnection;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field HttpURLConnection a>
				b = b1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field b b>
				c = list;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field List c>
				d = url;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #30  <Field URL d>
				e = s;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #32  <Field String e>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #35  <Method void Object()>
			//   17   31:return          
			}
		}

		long l1;
		long l2;
		URL url;
		HttpURLConnection httpurlconnection1;
		Object obj1;
		Object obj2;
		List list1;
		try
		{
			url = new URL(s);
	//   20   39:new             #157 <Class URL>
	//   21   42:dup             
	//   22   43:aload_1         
	//   23   44:invokespecial   #158 <Method void URL(String)>
	//   24   47:astore          9
			obj = ((Object) (url.openConnection()));
	//   25   49:aload           9
	//   26   51:invokevirtual   #162 <Method java.net.URLConnection URL.openConnection()>
	//   27   54:astore          8
		}
	//*  28   56:aload           8
	//*  29   58:ifnonnull       71
	//*  30   61:new             #164 <Class bp>
	//*  31   64:dup             
	//*  32   65:ldc1            #166 <String "null cannot be cast to non-null type java.net.HttpURLConnection">
	//*  33   67:invokespecial   #167 <Method void bp(String)>
	//*  34   70:athrow          
	//*  35   71:aload           8
	//*  36   73:checkcast       #155 <Class HttpURLConnection>
	//*  37   76:astore          10
	//*  38   78:aload           10
	//*  39   80:iconst_0        
	//*  40   81:invokevirtual   #171 <Method void HttpURLConnection.setInstanceFollowRedirects(boolean)>
	//*  41   84:aload           10
	//*  42   86:aload_0         
	//*  43   87:getfield        #110 <Field long m>
	//*  44   90:l2i             
	//*  45   91:sipush          1000
	//*  46   94:imul            
	//*  47   95:invokevirtual   #175 <Method void HttpURLConnection.setConnectTimeout(int)>
	//*  48   98:aload           10
	//*  49  100:aload_0         
	//*  50  101:getfield        #110 <Field long m>
	//*  51  104:l2i             
	//*  52  105:sipush          1000
	//*  53  108:imul            
	//*  54  109:invokevirtual   #178 <Method void HttpURLConnection.setReadTimeout(int)>
	//*  55  112:aload           10
	//*  56  114:ldc1            #180 <String "User-Agent">
	//*  57  116:getstatic       #185 <Field com.truenet.android.a.i$a i.a>
	//*  58  119:aload_0         
	//*  59  120:getfield        #104 <Field Context j>
	//*  60  123:invokevirtual   #190 <Method String com.truenet.android.a.i$a.a(Context)>
	//*  61  126:invokevirtual   #194 <Method void HttpURLConnection.addRequestProperty(String, String)>
	//*  62  129:aload_2         
	//*  63  130:ifnull          248
	//*  64  133:ldc1            #196 <String ";">
	//*  65  135:checkcast       #198 <Class CharSequence>
	//*  66  138:astore          8
	//*  67  140:aload_2         
	//*  68  141:checkcast       #200 <Class Iterable>
	//*  69  144:astore          12
	//*  70  146:new             #114 <Class ArrayList>
	//*  71  149:dup             
	//*  72  150:aload           12
	//*  73  152:bipush          10
	//*  74  154:invokestatic    #205 <Method int g.a(Iterable, int)>
	//*  75  157:invokespecial   #207 <Method void ArrayList(int)>
	//*  76  160:checkcast       #209 <Class Collection>
	//*  77  163:astore          11
	//*  78  165:aload           12
	//*  79  167:invokeinterface #213 <Method Iterator Iterable.iterator()>
	//*  80  172:astore          12
	//*  81  174:aload           12
	//*  82  176:invokeinterface #219 <Method boolean Iterator.hasNext()>
	//*  83  181:ifeq            228
	//*  84  184:aload           12
	//*  85  186:invokeinterface #223 <Method Object Iterator.next()>
	//*  86  191:checkcast       #145 <Class String>
	//*  87  194:invokestatic    #229 <Method List HttpCookie.parse(String)>
	//*  88  197:astore          13
	//*  89  199:aload           13
	//*  90  201:ldc1            #231 <String "HttpCookie.parse(it)">
	//*  91  203:invokestatic    #233 <Method void ae.a(Object, String)>
	//*  92  206:aload           11
	//*  93  208:aload           13
	//*  94  210:invokestatic    #236 <Method Object g.c(List)>
	//*  95  213:checkcast       #225 <Class HttpCookie>
	//*  96  216:invokeinterface #240 <Method boolean Collection.add(Object)>
	//*  97  221:pop             
	//*  98  222:goto            174
	//*  99  225:astore_1        
	//* 100  226:aload_1         
	//* 101  227:athrow          
	//* 102  228:aload           10
	//* 103  230:ldc1            #242 <String "Cookie">
	//* 104  232:aload           8
	//* 105  234:aload           11
	//* 106  236:checkcast       #117 <Class List>
	//* 107  239:checkcast       #200 <Class Iterable>
	//* 108  242:invokestatic    #248 <Method String TextUtils.join(CharSequence, Iterable)>
	//* 109  245:invokevirtual   #251 <Method void HttpURLConnection.setRequestProperty(String, String)>
	//* 110  248:invokestatic    #257 <Method long System.currentTimeMillis()>
	//* 111  251:lstore          4
	//* 112  253:aload           10
	//* 113  255:invokevirtual   #260 <Method void HttpURLConnection.connect()>
	//* 114  258:invokestatic    #257 <Method long System.currentTimeMillis()>
	//* 115  261:lstore          6
	//* 116  263:aload           10
	//* 117  265:ldc2            #262 <String "Location">
	//* 118  268:invokevirtual   #266 <Method String HttpURLConnection.getHeaderField(String)>
	//* 119  271:astore          8
	//* 120  273:aload           8
	//* 121  275:ifnull          637
	//* 122  278:getstatic       #89  <Field ba n>
	//* 123  281:astore          11
	//* 124  283:aload           8
	//* 125  285:ldc2            #268 <String "nextUrl">
	//* 126  288:invokestatic    #233 <Method void ae.a(Object, String)>
	//* 127  291:aload           11
	//* 128  293:aload           8
	//* 129  295:checkcast       #198 <Class CharSequence>
	//* 130  298:invokevirtual   #271 <Method boolean ba.a(CharSequence)>
	//* 131  301:ifeq            379
	//* 132  304:goto            624
	//* 133  307:aload           10
	//* 134  309:invokevirtual   #275 <Method Map HttpURLConnection.getHeaderFields()>
	//* 135  312:ldc2            #277 <String "Set-Cookie">
	//* 136  315:invokeinterface #283 <Method Object Map.get(Object)>
	//* 137  320:checkcast       #117 <Class List>
	//* 138  323:astore          11
	//* 139  325:new             #9   <Class b$b>
	//* 140  328:dup             
	//* 141  329:aload_1         
	//* 142  330:lload           6
	//* 143  332:lload           4
	//* 144  334:lsub            
	//* 145  335:aload           10
	//* 146  337:invokevirtual   #287 <Method int HttpURLConnection.getResponseCode()>
	//* 147  340:aload           11
	//* 148  342:aload           8
	//* 149  344:invokespecial   #153 <Method void b$b(String, long, int, List, String)>
	//* 150  347:astore          8
	//* 151  349:aload           10
	//* 152  351:invokevirtual   #287 <Method int HttpURLConnection.getResponseCode()>
	//* 153  354:istore_3        
	//* 154  355:sipush          200
	//* 155  358:iload_3         
	//* 156  359:icmple          472
	//* 157  362:goto            627
	//* 158  365:aload           8
	//* 159  367:aconst_null     
	//* 160  368:lconst_0        
	//* 161  369:iconst_0        
	//* 162  370:aconst_null     
	//* 163  371:aconst_null     
	//* 164  372:bipush          15
	//* 165  374:aconst_null     
	//* 166  375:invokestatic    #290 <Method b$b b$b.a(b$b, String, long, int, List, String, int, Object)>
	//* 167  378:areturn         
	//* 168  379:new             #292 <Class StringBuilder>
	//* 169  382:dup             
	//* 170  383:invokespecial   #293 <Method void StringBuilder()>
	//* 171  386:aload           9
	//* 172  388:invokevirtual   #297 <Method String URL.getProtocol()>
	//* 173  391:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//* 174  394:ldc2            #303 <String "://">
	//* 175  397:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//* 176  400:aload           9
	//* 177  402:invokevirtual   #306 <Method String URL.getHost()>
	//* 178  405:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//* 179  408:astore          11
	//* 180  410:aload           8
	//* 181  412:ldc2            #268 <String "nextUrl">
	//* 182  415:invokestatic    #233 <Method void ae.a(Object, String)>
	//* 183  418:aload           8
	//* 184  420:ldc2            #308 <String "/">
	//* 185  423:iconst_0        
	//* 186  424:iconst_2        
	//* 187  425:aconst_null     
	//* 188  426:invokestatic    #313 <Method boolean bb.a(String, String, boolean, int, Object)>
	//* 189  429:ifeq            447
	//* 190  432:aload           11
	//* 191  434:aload           8
	//* 192  436:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//* 193  439:invokevirtual   #316 <Method String StringBuilder.toString()>
	//* 194  442:astore          8
	//* 195  444:goto            624
	//* 196  447:new             #292 <Class StringBuilder>
	//* 197  450:dup             
	//* 198  451:invokespecial   #293 <Method void StringBuilder()>
	//* 199  454:bipush          47
	//* 200  456:invokevirtual   #319 <Method StringBuilder StringBuilder.append(char)>
	//* 201  459:aload           8
	//* 202  461:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//* 203  464:invokevirtual   #316 <Method String StringBuilder.toString()>
	//* 204  467:astore          8
	//* 205  469:goto            432
	//* 206  472:sipush          299
	//* 207  475:iload_3         
	//* 208  476:icmplt          627
	//* 209  479:aload           10
	//* 210  481:invokevirtual   #323 <Method InputStream HttpURLConnection.getInputStream()>
	//* 211  484:astore          11
	//* 212  486:aload           11
	//* 213  488:ldc2            #325 <String "inputStream">
	//* 214  491:invokestatic    #233 <Method void ae.a(Object, String)>
	//* 215  494:aload_0         
	//* 216  495:aload_0         
	//* 217  496:aload           11
	//* 218  498:invokespecial   #328 <Method String a(InputStream)>
	//* 219  501:putfield        #147 <Field String f>
	//* 220  504:invokestatic    #257 <Method long System.currentTimeMillis()>
	//* 221  507:lload           4
	//* 222  509:lsub            
	//* 223  510:lstore          4
	//* 224  512:new             #330 <Class Handler>
	//* 225  515:dup             
	//* 226  516:invokestatic    #336 <Method Looper Looper.getMainLooper()>
	//* 227  519:invokespecial   #339 <Method void Handler(Looper)>
	//* 228  522:new             #19  <Class b$e>
	//* 229  525:dup             
	//* 230  526:aload           10
	//* 231  528:aload_0         
	//* 232  529:aload_2         
	//* 233  530:aload           9
	//* 234  532:aload_1         
	//* 235  533:invokespecial   #342 <Method void b$e(HttpURLConnection, b, List, URL, String)>
	//* 236  536:checkcast       #344 <Class Runnable>
	//* 237  539:invokevirtual   #348 <Method boolean Handler.post(Runnable)>
	//* 238  542:pop             
	//* 239  543:aload_0         
	//* 240  544:invokespecial   #351 <Method SynchronousQueue i()>
	//* 241  547:invokevirtual   #356 <Method Object SynchronousQueue.take()>
	//* 242  550:checkcast       #145 <Class String>
	//* 243  553:astore_1        
	//* 244  554:aload_1         
	//* 245  555:ldc2            #358 <String "jsRedirectUrl">
	//* 246  558:invokestatic    #233 <Method void ae.a(Object, String)>
	//* 247  561:aload_1         
	//* 248  562:checkcast       #198 <Class CharSequence>
	//* 249  565:invokeinterface #361 <Method int CharSequence.length()>
	//* 250  570:ifne            643
	//* 251  573:iconst_1        
	//* 252  574:istore_3        
	//* 253  575:iload_3         
	//* 254  576:ifeq            594
	//* 255  579:aload           8
	//* 256  581:aconst_null     
	//* 257  582:lload           4
	//* 258  584:iconst_0        
	//* 259  585:aconst_null     
	//* 260  586:aconst_null     
	//* 261  587:bipush          29
	//* 262  589:aconst_null     
	//* 263  590:invokestatic    #290 <Method b$b b$b.a(b$b, String, long, int, List, String, int, Object)>
	//* 264  593:areturn         
	//* 265  594:aload           8
	//* 266  596:aconst_null     
	//* 267  597:lload           4
	//* 268  599:iconst_0        
	//* 269  600:aconst_null     
	//* 270  601:aload_1         
	//* 271  602:bipush          13
	//* 272  604:aconst_null     
	//* 273  605:invokestatic    #290 <Method b$b b$b.a(b$b, String, long, int, List, String, int, Object)>
	//* 274  608:astore_1        
	//* 275  609:aload_1         
	//* 276  610:areturn         
	//* 277  611:sipush          399
	//* 278  614:iload_3         
	//* 279  615:icmplt          365
	//* 280  618:aload           8
	//* 281  620:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 282  621:astore_1        
		{
			return null;
	//  283  622:aconst_null     
	//  284  623:areturn         
		}
		if(obj != null)
			break MISSING_BLOCK_LABEL_71;
		throw new bp("null cannot be cast to non-null type java.net.HttpURLConnection");
		httpurlconnection1 = (HttpURLConnection)obj;
		httpurlconnection1.setInstanceFollowRedirects(false);
		httpurlconnection1.setConnectTimeout((int)m * 1000);
		httpurlconnection1.setReadTimeout((int)m * 1000);
		httpurlconnection1.addRequestProperty("User-Agent", i.a.a(j));
		if(list == null)
			break MISSING_BLOCK_LABEL_248;
		obj = ((Object) ((CharSequence)";"));
		obj2 = ((Object) ((Iterable)list));
		obj1 = ((Object) ((Collection)new ArrayList(android.support.v7.g.a(((Iterable) (obj2)), 10))));
		for(obj2 = ((Object) (((Iterable) (obj2)).iterator())); ((Iterator) (obj2)).hasNext(); ((Collection) (obj1)).add(((Object) ((HttpCookie)android.support.v7.g.c(list1)))))
		{
			list1 = HttpCookie.parse((String)((Iterator) (obj2)).next());
			ae.a(((Object) (list1)), "HttpCookie.parse(it)");
		}

		break MISSING_BLOCK_LABEL_228;
		s;
		throw s;
		httpurlconnection1.setRequestProperty("Cookie", TextUtils.join(((CharSequence) (obj)), (Iterable)(List)obj1));
		l1 = System.currentTimeMillis();
		httpurlconnection1.connect();
		l2 = System.currentTimeMillis();
		obj = ((Object) (httpurlconnection1.getHeaderField("Location")));
		if(obj == null) goto _L2; else goto _L1
_L1:
		obj1 = ((Object) (n));
		ae.a(obj, "nextUrl");
		if(!((ba) (obj1)).a((CharSequence)obj)) goto _L4; else goto _L3
_L3:
		obj1 = ((Object) ((List)httpurlconnection1.getHeaderFields().get("Set-Cookie")));
		obj = ((Object) (new b(s, l2 - l1, httpurlconnection1.getResponseCode(), ((List) (obj1)), ((String) (obj)))));
		i1 = httpurlconnection1.getResponseCode();
		  goto _L5
_L10:
		return b.a(((b) (obj)), ((String) (null)), 0L, 0, ((List) (null)), ((String) (null)), 15, ((Object) (null)));
_L4:
		obj1 = ((Object) ((new StringBuilder()).append(url.getProtocol()).append("://").append(url.getHost())));
		ae.a(obj, "nextUrl");
		if(!bb.a(((String) (obj)), "/", false, 2, ((Object) (null)))) goto _L7; else goto _L6
_L6:
		obj = ((Object) (((StringBuilder) (obj1)).append(((String) (obj))).toString()));
		continue; /* Loop/switch isn't completed */
_L7:
		obj = ((Object) ((new StringBuilder()).append('/').append(((String) (obj))).toString()));
		  goto _L6
_L5:
		if(200 > i1 || 299 < i1) goto _L9; else goto _L8
_L8:
		obj1 = ((Object) (httpurlconnection1.getInputStream()));
		ae.a(obj1, "inputStream");
		f = a(((InputStream) (obj1)));
		l1 = System.currentTimeMillis() - l1;
		(new Handler(Looper.getMainLooper())).post((Runnable)new e(httpurlconnection1, this, list, url, s));
		s = (String)i().take();
		ae.a(((Object) (s)), "jsRedirectUrl");
		if(((CharSequence)s).length() == 0)
			i1 = 1;
		else
	//* 285  624:goto            307
	//* 286  627:sipush          300
	//* 287  630:iload_3         
	//* 288  631:icmple          611
	//* 289  634:goto            365
	//* 290  637:aconst_null     
	//* 291  638:astore          8
	//* 292  640:goto            307
			i1 = 0;
	//  293  643:iconst_0        
	//  294  644:istore_3        
		if(i1 == 0)
			break MISSING_BLOCK_LABEL_594;
		return b.a(((b) (obj)), ((String) (null)), l1, 0, ((List) (null)), ((String) (null)), 29, ((Object) (null)));
		s = ((String) (b.a(((b) (obj)), ((String) (null)), l1, 0, ((List) (null)), s, 13, ((Object) (null)))));
		return ((b) (s));
_L9:
		while(300 <= i1) 
			if(399 >= i1)
				return ((b) (obj));
			else
				break;
		if(true) goto _L10; else goto _L2
_L2:
		obj = null;
		if(true) goto _L3; else goto _L11
_L11:
	//* 295  645:goto            575
	}

	private final String a(InputStream inputstream)
	{
		Object obj1;
		android.support.v7.aj.a a1;
		obj1 = ((Object) ((BufferedInputStream)null));
	//    0    0:aconst_null     
	//    1    1:checkcast       #365 <Class BufferedInputStream>
	//    2    4:astore_3        
		a1 = new android.support.v7.aj.a();
	//    3    5:new             #367 <Class android.support.v7.aj$a>
	//    4    8:dup             
	//    5    9:invokespecial   #368 <Method void android.support.v7.aj$a()>
	//    6   12:astore          4
		a1.a = ((Object) ((BufferedReader)null));
	//    7   14:aload           4
	//    8   16:aconst_null     
	//    9   17:checkcast       #370 <Class BufferedReader>
	//   10   20:putfield        #373 <Field Object android.support.v7.aj$a.a>
		Object obj;
		StringBuilder stringbuilder;
		stringbuilder = new StringBuilder();
	//   11   23:new             #292 <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #293 <Method void StringBuilder()>
	//   14   30:astore          5
		obj = ((Object) (new BufferedInputStream(inputstream)));
	//   15   32:new             #365 <Class BufferedInputStream>
	//   16   35:dup             
	//   17   36:aload_1         
	//   18   37:invokespecial   #376 <Method void BufferedInputStream(InputStream)>
	//   19   40:astore_2        
		a1.a = ((Object) (new BufferedReader((Reader)new InputStreamReader((InputStream)obj))));
	//   20   41:aload           4
	//   21   43:new             #370 <Class BufferedReader>
	//   22   46:dup             
	//   23   47:new             #378 <Class InputStreamReader>
	//   24   50:dup             
	//   25   51:aload_2         
	//   26   52:checkcast       #380 <Class InputStream>
	//   27   55:invokespecial   #381 <Method void InputStreamReader(InputStream)>
	//   28   58:checkcast       #383 <Class Reader>
	//   29   61:invokespecial   #386 <Method void BufferedReader(Reader)>
	//   30   64:putfield        #373 <Field Object android.support.v7.aj$a.a>
		inputstream = ((InputStream) (new android.support.v7.aj.a()));
	//   31   67:new             #367 <Class android.support.v7.aj$a>
	//   32   70:dup             
	//   33   71:invokespecial   #368 <Method void android.support.v7.aj$a()>
	//   34   74:astore_1        
		inputstream.a = ((Object) ((String)null));
	//   35   75:aload_1         
	//   36   76:aconst_null     
	//   37   77:checkcast       #145 <Class String>
	//   38   80:putfield        #373 <Field Object android.support.v7.aj$a.a>
		static final class d extends af
			implements v
		{

			public Object a()
			{
				return ((Object) (b()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #30  <Method String b()>
			//    2    4:areturn         
			}

			public final String b()
			{
				$line.a = ((Object) (((BufferedReader)$reader.a).readLine()));
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field android.support.v7.aj$a $line>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field android.support.v7.aj$a $reader>
			//    4    8:getfield        #36  <Field Object android.support.v7.aj$a.a>
			//    5   11:checkcast       #38  <Class BufferedReader>
			//    6   14:invokevirtual   #41  <Method String BufferedReader.readLine()>
			//    7   17:putfield        #36  <Field Object android.support.v7.aj$a.a>
				return (String)$line.a;
			//    8   20:aload_0         
			//    9   21:getfield        #19  <Field android.support.v7.aj$a $line>
			//   10   24:getfield        #36  <Field Object android.support.v7.aj$a.a>
			//   11   27:checkcast       #43  <Class String>
			//   12   30:areturn         
			}

			final android.support.v7.aj.a $line;
			final android.support.v7.aj.a $reader;

			d(android.support.v7.aj.a a1, android.support.v7.aj.a a2)
			{
				$line = a1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field android.support.v7.aj$a $line>
				$reader = a2;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field android.support.v7.aj$a $reader>
				super(0);
			//    6   10:aload_0         
			//    7   11:iconst_0        
			//    8   12:invokespecial   #24  <Method void af(int)>
			//    9   15:return          
			}
		}

		for(; ((v)new d(((android.support.v7.aj.a) (inputstream)), a1)).a() != null; stringbuilder.append((String)((android.support.v7.aj.a) (inputstream)).a));
	//   39   83:new             #17  <Class b$d>
	//   40   86:dup             
	//   41   87:aload_1         
	//   42   88:aload           4
	//   43   90:invokespecial   #389 <Method void b$d(android.support.v7.aj$a, android.support.v7.aj$a)>
	//   44   93:checkcast       #124 <Class v>
	//   45   96:invokeinterface #391 <Method Object v.a()>
	//   46  101:ifnull          148
	//   47  104:aload           5
	//   48  106:aload_1         
	//   49  107:getfield        #373 <Field Object android.support.v7.aj$a.a>
	//   50  110:checkcast       #145 <Class String>
	//   51  113:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//   52  116:pop             
		  goto _L1
	//*  53  117:goto            83
		inputstream;
	//   54  120:astore_1        
_L3:
		obj1 = ((Object) ((BufferedReader)a1.a));
	//   55  121:aload           4
	//   56  123:getfield        #373 <Field Object android.support.v7.aj$a.a>
	//   57  126:checkcast       #370 <Class BufferedReader>
	//   58  129:astore_3        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_138;
	//   59  130:aload_3         
	//   60  131:ifnull          138
		((BufferedReader) (obj1)).close();
	//   61  134:aload_3         
	//   62  135:invokevirtual   #394 <Method void BufferedReader.close()>
		if(obj != null)
	//*  63  138:aload_2         
	//*  64  139:ifnull          146
			try
			{
				((BufferedInputStream) (obj)).close();
	//   65  142:aload_2         
	//   66  143:invokevirtual   #395 <Method void BufferedInputStream.close()>
			}
	//*  67  146:aload_1         
	//*  68  147:athrow          
	//*  69  148:aload           5
	//*  70  150:invokevirtual   #316 <Method String StringBuilder.toString()>
	//*  71  153:astore_1        
	//*  72  154:aload_1         
	//*  73  155:ldc2            #397 <String "result.toString()">
	//*  74  158:invokestatic    #233 <Method void ae.a(Object, String)>
	//*  75  161:aload           4
	//*  76  163:getfield        #373 <Field Object android.support.v7.aj$a.a>
	//*  77  166:checkcast       #370 <Class BufferedReader>
	//*  78  169:astore_3        
	//*  79  170:aload_3         
	//*  80  171:ifnull          178
	//*  81  174:aload_3         
	//*  82  175:invokevirtual   #394 <Method void BufferedReader.close()>
	//*  83  178:aload_2         
	//*  84  179:invokevirtual   #395 <Method void BufferedInputStream.close()>
	//*  85  182:aload_1         
	//*  86  183:areturn         
	//*  87  184:astore_2        
	//*  88  185:aload_0         
	//*  89  186:invokevirtual   #401 <Method Class Object.getClass()>
	//*  90  189:invokevirtual   #406 <Method String Class.getCanonicalName()>
	//*  91  192:ldc2            #408 <String "stream closed with error!">
	//*  92  195:aload_2         
	//*  93  196:invokestatic    #413 <Method int Log.e(String, String, Throwable)>
	//*  94  199:pop             
	//*  95  200:aload_1         
	//*  96  201:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  97  202:astore_2        
			{
				Log.e(((Object)this).getClass().getCanonicalName(), "stream closed with error!", ((Throwable) (obj)));
	//   98  203:aload_0         
	//   99  204:invokevirtual   #401 <Method Class Object.getClass()>
	//  100  207:invokevirtual   #406 <Method String Class.getCanonicalName()>
	//  101  210:ldc2            #408 <String "stream closed with error!">
	//  102  213:aload_2         
	//  103  214:invokestatic    #413 <Method int Log.e(String, String, Throwable)>
	//  104  217:pop             
			}
		throw inputstream;
_L1:
		inputstream = ((InputStream) (stringbuilder.toString()));
		ae.a(((Object) (inputstream)), "result.toString()");
		try
		{
			obj1 = ((Object) ((BufferedReader)a1.a));
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			Log.e(((Object)this).getClass().getCanonicalName(), "stream closed with error!", ((Throwable) (obj)));
			return ((String) (inputstream));
		}
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_178;
		((BufferedReader) (obj1)).close();
		((BufferedInputStream) (obj)).close();
		return ((String) (inputstream));
	//* 105  218:goto            146
		inputstream;
	//  106  221:astore_1        
		obj = obj1;
	//  107  222:aload_3         
	//  108  223:astore_2        
		if(true) goto _L3; else goto _L2
	//  109  224:goto            121
_L2:
	}

	public static final SynchronousQueue a(com.truenet.android.b b1)
	{
		return b1.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #351 <Method SynchronousQueue i()>
	//    2    4:areturn         
	}

	private final boolean a(long l1)
	{
		return (g.size() < l || l == -1) && System.currentTimeMillis() - l1 < m * (long)1000;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field List g>
	//    2    4:invokeinterface #419 <Method int List.size()>
	//    3    9:aload_0         
	//    4   10:getfield        #108 <Field int l>
	//    5   13:icmplt          24
	//    6   16:aload_0         
	//    7   17:getfield        #108 <Field int l>
	//    8   20:iconst_m1       
	//    9   21:icmpne          44
	//   10   24:invokestatic    #257 <Method long System.currentTimeMillis()>
	//   11   27:lload_1         
	//   12   28:lsub            
	//   13   29:aload_0         
	//   14   30:getfield        #110 <Field long m>
	//   15   33:sipush          1000
	//   16   36:i2l             
	//   17   37:lmul            
	//   18   38:lcmp            
	//   19   39:ifge            44
	//   20   42:iconst_1        
	//   21   43:ireturn         
	//   22   44:iconst_0        
	//   23   45:ireturn         
	}

	public static final WebView b(com.truenet.android.b b1)
	{
		return b1.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #423 <Method WebView j()>
	//    2    4:areturn         
	}

	public static final Context c(com.truenet.android.b b1)
	{
		return b1.j;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Context j>
	//    2    4:areturn         
	}

	public static final ba h()
	{
		return n;
	//    0    0:getstatic       #89  <Field ba n>
	//    1    3:areturn         
	}

	private final SynchronousQueue i()
	{
		am am1 = h;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field am h>
	//    2    4:astore_1        
		aw aw1 = a[0];
	//    3    5:getstatic       #75  <Field aw[] a>
	//    4    8:iconst_0        
	//    5    9:aaload          
	//    6   10:astore_2        
		return (SynchronousQueue)am1.a();
	//    7   11:aload_1         
	//    8   12:invokeinterface #428 <Method Object am.a()>
	//    9   17:checkcast       #353 <Class SynchronousQueue>
	//   10   20:areturn         
	}

	private final WebView j()
	{
		am am1 = i;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field am i>
	//    2    4:astore_1        
		aw aw1 = a[1];
	//    3    5:getstatic       #75  <Field aw[] a>
	//    4    8:iconst_1        
	//    5    9:aaload          
	//    6   10:astore_2        
		return (WebView)am1.a();
	//    7   11:aload_1         
	//    8   12:invokeinterface #428 <Method Object am.a()>
	//    9   17:checkcast       #431 <Class WebView>
	//   10   20:areturn         
	}

	public final Bitmap a()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #434 <Field Bitmap c>
	//    2    4:areturn         
	}

	public final int b()
	{
		return g.size();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field List g>
	//    2    4:invokeinterface #419 <Method int List.size()>
	//    3    9:ireturn         
	}

	public final long c()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #436 <Field long d>
	//    2    4:lreturn         
	}

	public final List d()
	{
		return android.support.v7.g.a((Iterable)g);
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field List g>
	//    2    4:checkcast       #200 <Class Iterable>
	//    3    7:invokestatic    #440 <Method List g.a(Iterable)>
	//    4   10:areturn         
	}

	public final String e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field String e>
	//    2    4:areturn         
	}

	public final String f()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field String f>
	//    2    4:areturn         
	}

	public final void g()
	{
		long l2;
		b b1;
		l2 = System.currentTimeMillis();
	//    0    0:invokestatic    #257 <Method long System.currentTimeMillis()>
	//    1    3:lstore          4
		b1 = a(this, k, ((List) (null)), 2, ((Object) (null)));
	//    2    5:aload_0         
	//    3    6:aload_0         
	//    4    7:getfield        #106 <Field String k>
	//    5   10:aconst_null     
	//    6   11:iconst_2        
	//    7   12:aconst_null     
	//    8   13:invokestatic    #443 <Method b$b a(b, String, List, int, Object)>
	//    9   16:astore          6
		if(b1 == null)
			break MISSING_BLOCK_LABEL_232;
	//   10   18:aload           6
	//   11   20:ifnull          232
		g.add(((Object) (b1)));
	//   12   23:aload_0         
	//   13   24:getfield        #119 <Field List g>
	//   14   27:aload           6
	//   15   29:invokeinterface #444 <Method boolean List.add(Object)>
	//   16   34:pop             
		do
		{
label0:
			{
				String s;
				if(b1 != null)
	//*  17   35:aload           6
	//*  18   37:ifnull          109
					s = b1.e();
	//   19   40:aload           6
	//   20   42:invokevirtual   #446 <Method String b$b.e()>
	//   21   45:astore          7
				else
	//*  22   47:aload           7
	//*  23   49:ifnull          115
	//*  24   52:aload_0         
	//*  25   53:lload           4
	//*  26   55:invokespecial   #448 <Method boolean a(long)>
	//*  27   58:ifeq            115
	//*  28   61:aload           6
	//*  29   63:invokevirtual   #446 <Method String b$b.e()>
	//*  30   66:astore          7
	//*  31   68:aload           7
	//*  32   70:ifnonnull       76
	//*  33   73:invokestatic    #450 <Method void ae.a()>
	//*  34   76:aload_0         
	//*  35   77:aload           7
	//*  36   79:aload           6
	//*  37   81:invokevirtual   #452 <Method List b$b.d()>
	//*  38   84:invokespecial   #141 <Method b$b a(String, List)>
	//*  39   87:astore          6
	//*  40   89:aload           6
	//*  41   91:ifnull          106
	//*  42   94:aload_0         
	//*  43   95:getfield        #119 <Field List g>
	//*  44   98:aload           6
	//*  45  100:invokeinterface #444 <Method boolean List.add(Object)>
	//*  46  105:pop             
	//*  47  106:goto            35
					s = null;
	//   48  109:aconst_null     
	//   49  110:astore          7
				if(s == null || !a(l2))
					break label0;
				s = b1.e();
				if(s == null)
					ae.a();
				b1 = a(s, b1.d());
				if(b1 != null)
					g.add(((Object) (b1)));
			}
		} while(true);
	//   50  112:goto            47
		int i1;
		if(b1 != null)
	//*  51  115:aload           6
	//*  52  117:ifnull          133
		{
			i1 = b1.c();
	//   53  120:aload           6
	//   54  122:invokevirtual   #454 <Method int b$b.c()>
	//   55  125:istore_1        
			break MISSING_BLOCK_LABEL_126;
		}
	//*  56  126:sipush          200
	//*  57  129:iload_1         
	//*  58  130:icmple          182
_L1:
		long l1;
		Object obj = ((Object) ((Iterable)g));
	//   59  133:aload_0         
	//   60  134:getfield        #119 <Field List g>
	//   61  137:checkcast       #200 <Class Iterable>
	//   62  140:astore          6
		l1 = 0L;
	//   63  142:lconst_0        
	//   64  143:lstore_2        
		for(obj = ((Object) (((Iterable) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*  65  144:aload           6
	//*  66  146:invokeinterface #213 <Method Iterator Iterable.iterator()>
	//*  67  151:astore          6
	//*  68  153:aload           6
	//*  69  155:invokeinterface #219 <Method boolean Iterator.hasNext()>
	//*  70  160:ifeq            210
			l1 = ((b)((Iterator) (obj)).next()).b() + l1;
	//   71  163:aload           6
	//   72  165:invokeinterface #223 <Method Object Iterator.next()>
	//   73  170:checkcast       #9   <Class b$b>
	//   74  173:invokevirtual   #456 <Method long b$b.b()>
	//   75  176:lload_2         
	//   76  177:ladd            
	//   77  178:lstore_2        

		break MISSING_BLOCK_LABEL_210;
	//   78  179:goto            153
		if(200 <= i1 && 299 >= i1 && f != null)
	//*  79  182:sipush          299
	//*  80  185:iload_1         
	//*  81  186:icmplt          133
	//*  82  189:aload_0         
	//*  83  190:getfield        #147 <Field String f>
	//*  84  193:ifnull          133
			c = com.truenet.android.a.j.a(j());
	//   85  196:aload_0         
	//   86  197:aload_0         
	//   87  198:invokespecial   #423 <Method WebView j()>
	//   88  201:invokestatic    #461 <Method Bitmap j.a(WebView)>
	//   89  204:putfield        #434 <Field Bitmap c>
		  goto _L1
	//*  90  207:goto            133
		d = l1;
	//   91  210:aload_0         
	//   92  211:lload_2         
	//   93  212:putfield        #436 <Field long d>
		e = ((b)android.support.v7.g.e(g)).a();
	//   94  215:aload_0         
	//   95  216:aload_0         
	//   96  217:getfield        #119 <Field List g>
	//   97  220:invokestatic    #463 <Method Object g.e(List)>
	//   98  223:checkcast       #9   <Class b$b>
	//   99  226:invokevirtual   #465 <Method String b$b.a()>
	//  100  229:putfield        #112 <Field String e>
		if(g.isEmpty())
	//* 101  232:aload_0         
	//* 102  233:getfield        #119 <Field List g>
	//* 103  236:invokeinterface #468 <Method boolean List.isEmpty()>
	//* 104  241:ifeq            254
			d = System.currentTimeMillis() - l2;
	//  105  244:aload_0         
	//  106  245:invokestatic    #257 <Method long System.currentTimeMillis()>
	//  107  248:lload           4
	//  108  250:lsub            
	//  109  251:putfield        #436 <Field long d>
		return;
	//  110  254:return          
	}

	static final aw a[] = {
		(aw)ak.a(((android.support.v7.ah) (new ai(((android.support.v7.au) (ak.a(com/truenet/android/b))), "queue", "getQueue()Ljava/util/concurrent/SynchronousQueue;")))), (aw)ak.a(((android.support.v7.ah) (new ai(((android.support.v7.au) (ak.a(com/truenet/android/b))), "webView", "getWebView()Landroid/webkit/WebView;"))))
	};
	public static final a b = new a(((ab) (null)));
	private static final ba n = new ba("^\\w+(://){1}.+$");
	private Bitmap c;
	private long d;
	private String e;
	private String f;
	private final List g = (List)new ArrayList();
	private final am h;
	private final am i = ar.a((v)new g(this));
	private final Context j;
	private final String k;
	private final int l;
	private final long m;

	static 
	{
	//    0    0:iconst_2        
	//    1    1:anewarray       aw[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:new             #53  <Class ai>
	//    5    9:dup             
	//    6   10:ldc1            #2   <Class b>
	//    7   12:invokestatic    #58  <Method android.support.v7.at ak.a(Class)>
	//    8   15:ldc1            #60  <String "queue">
	//    9   17:ldc1            #62  <String "getQueue()Ljava/util/concurrent/SynchronousQueue;">
	//   10   19:invokespecial   #66  <Method void ai(android.support.v7.au, String, String)>
	//   11   22:invokestatic    #69  <Method android.support.v7.ax ak.a(android.support.v7.ah)>
	//   12   25:checkcast       #51  <Class aw>
	//   13   28:aastore         
	//   14   29:dup             
	//   15   30:iconst_1        
	//   16   31:new             #53  <Class ai>
	//   17   34:dup             
	//   18   35:ldc1            #2   <Class b>
	//   19   37:invokestatic    #58  <Method android.support.v7.at ak.a(Class)>
	//   20   40:ldc1            #71  <String "webView">
	//   21   42:ldc1            #73  <String "getWebView()Landroid/webkit/WebView;">
	//   22   44:invokespecial   #66  <Method void ai(android.support.v7.au, String, String)>
	//   23   47:invokestatic    #69  <Method android.support.v7.ax ak.a(android.support.v7.ah)>
	//   24   50:checkcast       #51  <Class aw>
	//   25   53:aastore         
	//   26   54:putstatic       #75  <Field aw[] a>
	//   27   57:new             #6   <Class b$a>
	//   28   60:dup             
	//   29   61:aconst_null     
	//   30   62:invokespecial   #78  <Method void b$a(ab)>
	//   31   65:putstatic       #80  <Field b$a b>
	//   32   68:new             #82  <Class ba>
	//   33   71:dup             
	//   34   72:ldc1            #84  <String "^\\w+(://){1}.+$">
	//   35   74:invokespecial   #87  <Method void ba(String)>
	//   36   77:putstatic       #89  <Field ba n>
	//*  37   80:return          
	}
}
