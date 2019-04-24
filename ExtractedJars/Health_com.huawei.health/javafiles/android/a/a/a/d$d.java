// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.a.a.a;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

// Referenced classes of package android.a.a.a:
//			d

public static class d$d
{

	private void a(int i1, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            20
		{
			Notification notification = B;
	//    2    4:aload_0         
	//    3    5:getfield        #74  <Field Notification B>
	//    4    8:astore_3        
			notification.flags = notification.flags | i1;
	//    5    9:aload_3         
	//    6   10:aload_3         
	//    7   11:getfield        #98  <Field int Notification.flags>
	//    8   14:iload_1         
	//    9   15:ior             
	//   10   16:putfield        #98  <Field int Notification.flags>
			return;
	//   11   19:return          
		} else
		{
			Notification notification1 = B;
	//   12   20:aload_0         
	//   13   21:getfield        #74  <Field Notification B>
	//   14   24:astore_3        
			notification1.flags = notification1.flags & ~i1;
	//   15   25:aload_3         
	//   16   26:aload_3         
	//   17   27:getfield        #98  <Field int Notification.flags>
	//   18   30:iload_1         
	//   19   31:iconst_m1       
	//   20   32:ixor            
	//   21   33:iand            
	//   22   34:putfield        #98  <Field int Notification.flags>
			return;
	//   23   37:return          
		}
	}

	protected static CharSequence f(CharSequence charsequence)
	{
		if(charsequence == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return charsequence;
	//    2    4:aload_0         
	//    3    5:areturn         
		CharSequence charsequence1 = charsequence;
	//    4    6:aload_0         
	//    5    7:astore_1        
		if(charsequence.length() > 5120)
	//*   6    8:aload_0         
	//*   7    9:invokeinterface #105 <Method int CharSequence.length()>
	//*   8   14:sipush          5120
	//*   9   17:icmple          31
			charsequence1 = charsequence.subSequence(0, 5120);
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:sipush          5120
	//   13   25:invokeinterface #109 <Method CharSequence CharSequence.subSequence(int, int)>
	//   14   30:astore_1        
		return charsequence1;
	//   15   31:aload_1         
	//   16   32:areturn         
	}

	public d$d a(int i1)
	{
		B.icon = i1;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Notification B>
	//    2    4:iload_1         
	//    3    5:putfield        #113 <Field int Notification.icon>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public d$d a(int i1, int j1)
	{
		B.icon = i1;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Notification B>
	//    2    4:iload_1         
	//    3    5:putfield        #113 <Field int Notification.icon>
		B.iconLevel = j1;
	//    4    8:aload_0         
	//    5    9:getfield        #74  <Field Notification B>
	//    6   12:iload_2         
	//    7   13:putfield        #117 <Field int Notification.iconLevel>
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public d$d a(int i1, int j1, int k1)
	{
		B.ledARGB = i1;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Notification B>
	//    2    4:iload_1         
	//    3    5:putfield        #121 <Field int Notification.ledARGB>
		B.ledOnMS = j1;
	//    4    8:aload_0         
	//    5    9:getfield        #74  <Field Notification B>
	//    6   12:iload_2         
	//    7   13:putfield        #124 <Field int Notification.ledOnMS>
		B.ledOffMS = k1;
	//    8   16:aload_0         
	//    9   17:getfield        #74  <Field Notification B>
	//   10   20:iload_3         
	//   11   21:putfield        #127 <Field int Notification.ledOffMS>
		if(B.ledOnMS != 0 && B.ledOffMS != 0)
	//*  12   24:aload_0         
	//*  13   25:getfield        #74  <Field Notification B>
	//*  14   28:getfield        #124 <Field int Notification.ledOnMS>
	//*  15   31:ifeq            49
	//*  16   34:aload_0         
	//*  17   35:getfield        #74  <Field Notification B>
	//*  18   38:getfield        #127 <Field int Notification.ledOffMS>
	//*  19   41:ifeq            49
			i1 = 1;
	//   20   44:iconst_1        
	//   21   45:istore_1        
		else
	//*  22   46:goto            51
			i1 = 0;
	//   23   49:iconst_0        
	//   24   50:istore_1        
		Notification notification = B;
	//   25   51:aload_0         
	//   26   52:getfield        #74  <Field Notification B>
	//   27   55:astore          4
		j1 = B.flags;
	//   28   57:aload_0         
	//   29   58:getfield        #74  <Field Notification B>
	//   30   61:getfield        #98  <Field int Notification.flags>
	//   31   64:istore_2        
		if(i1 != 0)
	//*  32   65:iload_1         
	//*  33   66:ifeq            74
			i1 = 1;
	//   34   69:iconst_1        
	//   35   70:istore_1        
		else
	//*  36   71:goto            76
			i1 = 0;
	//   37   74:iconst_0        
	//   38   75:istore_1        
		notification.flags = j1 & -2 | i1;
	//   39   76:aload           4
	//   40   78:iload_2         
	//   41   79:bipush          -2
	//   42   81:iand            
	//   43   82:iload_1         
	//   44   83:ior             
	//   45   84:putfield        #98  <Field int Notification.flags>
		return this;
	//   46   87:aload_0         
	//   47   88:areturn         
	}

	public d$d a(int i1, int j1, boolean flag)
	{
		o = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #130 <Field int o>
		p = j1;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #132 <Field int p>
		q = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #134 <Field boolean q>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public d$d a(int i1, CharSequence charsequence, PendingIntent pendingintent)
	{
		u.add(((Object) (new d$a(i1, charsequence, pendingintent))));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field ArrayList u>
	//    2    4:new             #137 <Class d$a>
	//    3    7:dup             
	//    4    8:iload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokespecial   #140 <Method void d$a(int, CharSequence, PendingIntent)>
	//    8   14:invokevirtual   #144 <Method boolean ArrayList.add(Object)>
	//    9   17:pop             
		return this;
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	public d$d a(long l1)
	{
		B.when = l1;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Notification B>
	//    2    4:lload_1         
	//    3    5:putfield        #86  <Field long Notification.when>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public d$d a(d$a d$a1)
	{
		u.add(((Object) (d$a1)));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field ArrayList u>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #144 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public d$d a(d$g d$g1)
	{
		d$g1.a(this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #152 <Method d$d d$g.a(d$d)>
	//    3    7:pop             
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public d$d a(d$r d$r1)
	{
		if(m != d$r1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #155 <Field d$r m>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       28
		{
			m = d$r1;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #155 <Field d$r m>
			if(m != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #155 <Field d$r m>
	//*   9   17:ifnull          28
				m.a(this);
	//   10   20:aload_0         
	//   11   21:getfield        #155 <Field d$r m>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #160 <Method void d$r.a(d$d)>
		}
		return this;
	//   14   28:aload_0         
	//   15   29:areturn         
	}

	public d$d a(Notification notification)
	{
		A = notification;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #163 <Field Notification A>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public d$d a(PendingIntent pendingintent)
	{
		d = pendingintent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #166 <Field PendingIntent d>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public d$d a(PendingIntent pendingintent, boolean flag)
	{
		e = pendingintent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #169 <Field PendingIntent e>
		a(128, flag);
	//    3    5:aload_0         
	//    4    6:sipush          128
	//    5    9:iload_2         
	//    6   10:invokespecial   #171 <Method void a(int, boolean)>
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public d$d a(Bitmap bitmap)
	{
		g = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #174 <Field Bitmap g>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public d$d a(Uri uri)
	{
		B.sound = uri;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Notification B>
	//    2    4:aload_1         
	//    3    5:putfield        #179 <Field Uri Notification.sound>
		B.audioStreamType = -1;
	//    4    8:aload_0         
	//    5    9:getfield        #74  <Field Notification B>
	//    6   12:iconst_m1       
	//    7   13:putfield        #89  <Field int Notification.audioStreamType>
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public d$d a(Uri uri, int i1)
	{
		B.sound = uri;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Notification B>
	//    2    4:aload_1         
	//    3    5:putfield        #179 <Field Uri Notification.sound>
		B.audioStreamType = i1;
	//    4    8:aload_0         
	//    5    9:getfield        #74  <Field Notification B>
	//    6   12:iload_2         
	//    7   13:putfield        #89  <Field int Notification.audioStreamType>
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public d$d a(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
		{
			if(x == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #183 <Field Bundle x>
	//*   4    8:ifnonnull       25
			{
				x = new Bundle(bundle);
	//    5   11:aload_0         
	//    6   12:new             #185 <Class Bundle>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #188 <Method void Bundle(Bundle)>
	//   10   20:putfield        #183 <Field Bundle x>
				return this;
	//   11   23:aload_0         
	//   12   24:areturn         
			}
			x.putAll(bundle);
	//   13   25:aload_0         
	//   14   26:getfield        #183 <Field Bundle x>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #191 <Method void Bundle.putAll(Bundle)>
		}
		return this;
	//   17   33:aload_0         
	//   18   34:areturn         
	}

	public d$d a(RemoteViews remoteviews)
	{
		B.contentView = remoteviews;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Notification B>
	//    2    4:aload_1         
	//    3    5:putfield        #195 <Field RemoteViews Notification.contentView>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public d$d a(CharSequence charsequence)
	{
		b = f(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #198 <Method CharSequence f(CharSequence)>
	//    3    5:putfield        #200 <Field CharSequence b>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public d$d a(CharSequence charsequence, RemoteViews remoteviews)
	{
		B.tickerText = f(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Notification B>
	//    2    4:aload_1         
	//    3    5:invokestatic    #198 <Method CharSequence f(CharSequence)>
	//    4    8:putfield        #204 <Field CharSequence Notification.tickerText>
		f = remoteviews;
	//    5   11:aload_0         
	//    6   12:aload_2         
	//    7   13:putfield        #206 <Field RemoteViews f>
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public d$d a(String s1)
	{
		w = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #209 <Field String w>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public d$d a(boolean flag)
	{
		k = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #58  <Field boolean k>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public d$d a(long al[])
	{
		B.vibrate = al;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Notification B>
	//    2    4:aload_1         
	//    3    5:putfield        #215 <Field long[] Notification.vibrate>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public Bundle a()
	{
		if(x == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #183 <Field Bundle x>
	//*   2    4:ifnonnull       18
			x = new Bundle();
	//    3    7:aload_0         
	//    4    8:new             #185 <Class Bundle>
	//    5   11:dup             
	//    6   12:invokespecial   #217 <Method void Bundle()>
	//    7   15:putfield        #183 <Field Bundle x>
		return x;
	//    8   18:aload_0         
	//    9   19:getfield        #183 <Field Bundle x>
	//   10   22:areturn         
	}

	public d$d b(int i1)
	{
		i = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #219 <Field int i>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public d$d b(PendingIntent pendingintent)
	{
		B.deleteIntent = pendingintent;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Notification B>
	//    2    4:aload_1         
	//    3    5:putfield        #222 <Field PendingIntent Notification.deleteIntent>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public d$d b(Bundle bundle)
	{
		x = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #183 <Field Bundle x>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public d$d b(CharSequence charsequence)
	{
		c = f(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #198 <Method CharSequence f(CharSequence)>
	//    3    5:putfield        #224 <Field CharSequence c>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public d$d b(String s1)
	{
		C.add(((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field ArrayList C>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #144 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public d$d b(boolean flag)
	{
		l = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #226 <Field boolean l>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Notification b()
	{
		return c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #229 <Method Notification c()>
	//    2    4:areturn         
	}

	public d$d c(int i1)
	{
		B.defaults = i1;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Notification B>
	//    2    4:iload_1         
	//    3    5:putfield        #232 <Field int Notification.defaults>
		if((i1 & 4) != 0)
	//*   4    8:iload_1         
	//*   5    9:iconst_4        
	//*   6   10:iand            
	//*   7   11:ifeq            29
		{
			Notification notification = B;
	//    8   14:aload_0         
	//    9   15:getfield        #74  <Field Notification B>
	//   10   18:astore_2        
			notification.flags = notification.flags | 1;
	//   11   19:aload_2         
	//   12   20:aload_2         
	//   13   21:getfield        #98  <Field int Notification.flags>
	//   14   24:iconst_1        
	//   15   25:ior             
	//   16   26:putfield        #98  <Field int Notification.flags>
		}
		return this;
	//   17   29:aload_0         
	//   18   30:areturn         
	}

	public d$d c(CharSequence charsequence)
	{
		n = f(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #198 <Method CharSequence f(CharSequence)>
	//    3    5:putfield        #234 <Field CharSequence n>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public d$d c(String s1)
	{
		r = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #236 <Field String r>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public d$d c(boolean flag)
	{
		a(2, flag);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:iload_1         
	//    3    3:invokespecial   #171 <Method void a(int, boolean)>
		return this;
	//    4    6:aload_0         
	//    5    7:areturn         
	}

	public Notification c()
	{
		return android.a.a.a.d.a().b(this, d());
	//    0    0:invokestatic    #239 <Method d$k d.a()>
	//    1    3:aload_0         
	//    2    4:aload_0         
	//    3    5:invokevirtual   #242 <Method d$e d()>
	//    4    8:invokeinterface #247 <Method Notification d$k.b(d$d, d$e)>
	//    5   13:areturn         
	}

	public d$d d(int i1)
	{
		j = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #91  <Field int j>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public d$d d(CharSequence charsequence)
	{
		h = f(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #198 <Method CharSequence f(CharSequence)>
	//    3    5:putfield        #249 <Field CharSequence h>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public d$d d(String s1)
	{
		t = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #251 <Field String t>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public d$d d(boolean flag)
	{
		a(8, flag);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:iload_1         
	//    3    4:invokespecial   #171 <Method void a(int, boolean)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	protected d$e d()
	{
		return new d$e();
	//    0    0:new             #253 <Class d$e>
	//    1    3:dup             
	//    2    4:invokespecial   #254 <Method void d$e()>
	//    3    7:areturn         
	}

	public d$d e(int i1)
	{
		y = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #67  <Field int y>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public d$d e(CharSequence charsequence)
	{
		B.tickerText = f(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Notification B>
	//    2    4:aload_1         
	//    3    5:invokestatic    #198 <Method CharSequence f(CharSequence)>
	//    4    8:putfield        #204 <Field CharSequence Notification.tickerText>
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public d$d e(boolean flag)
	{
		a(16, flag);
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:iload_1         
	//    3    4:invokespecial   #171 <Method void a(int, boolean)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public d$d f(int i1)
	{
		z = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #69  <Field int z>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public d$d f(boolean flag)
	{
		v = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #65  <Field boolean v>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public d$d g(boolean flag)
	{
		s = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #256 <Field boolean s>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private static final int D = 5120;
	Notification A;
	public Notification B;
	public ArrayList C;
	public Context a;
	public CharSequence b;
	public CharSequence c;
	PendingIntent d;
	PendingIntent e;
	RemoteViews f;
	public Bitmap g;
	public CharSequence h;
	public int i;
	int j;
	boolean k;
	public boolean l;
	public d$r m;
	public CharSequence n;
	int o;
	int p;
	boolean q;
	String r;
	boolean s;
	String t;
	public ArrayList u;
	boolean v;
	String w;
	Bundle x;
	int y;
	int z;

	public d$d(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
		k = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #58  <Field boolean k>
		u = new ArrayList();
	//    5    9:aload_0         
	//    6   10:new             #60  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #61  <Method void ArrayList()>
	//    9   17:putfield        #63  <Field ArrayList u>
		v = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #65  <Field boolean v>
		y = 0;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #67  <Field int y>
		z = 0;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #69  <Field int z>
		B = new Notification();
	//   19   35:aload_0         
	//   20   36:new             #71  <Class Notification>
	//   21   39:dup             
	//   22   40:invokespecial   #72  <Method void Notification()>
	//   23   43:putfield        #74  <Field Notification B>
		a = context;
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:putfield        #76  <Field Context a>
		B.when = System.currentTimeMillis();
	//   27   51:aload_0         
	//   28   52:getfield        #74  <Field Notification B>
	//   29   55:invokestatic    #82  <Method long System.currentTimeMillis()>
	//   30   58:putfield        #86  <Field long Notification.when>
		B.audioStreamType = -1;
	//   31   61:aload_0         
	//   32   62:getfield        #74  <Field Notification B>
	//   33   65:iconst_m1       
	//   34   66:putfield        #89  <Field int Notification.audioStreamType>
		j = 0;
	//   35   69:aload_0         
	//   36   70:iconst_0        
	//   37   71:putfield        #91  <Field int j>
		C = new ArrayList();
	//   38   74:aload_0         
	//   39   75:new             #60  <Class ArrayList>
	//   40   78:dup             
	//   41   79:invokespecial   #61  <Method void ArrayList()>
	//   42   82:putfield        #93  <Field ArrayList C>
	//   43   85:return          
	}
}
