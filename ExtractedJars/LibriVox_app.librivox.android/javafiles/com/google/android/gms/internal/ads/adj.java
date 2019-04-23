// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.util.e;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			acm, aee, adf, adx, 
//			wx, add, zzbbi, xg, 
//			afc, afb, bct, adk, 
//			adb, acl, adc, adm, 
//			abj, adt, adh, adl, 
//			acw, adn, adw, ado, 
//			adp, adr, adq, ads

public final class adj extends acm
	implements android.view.TextureView.SurfaceTextureListener, aee
{

	public adj(Context context, adf adf1, add add1, boolean flag, boolean flag1, adc adc1)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #47  <Method void acm(Context)>
		l = 1;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #49  <Field int l>
		e = flag1;
	//    6   10:aload_0         
	//    7   11:iload           5
	//    8   13:putfield        #51  <Field boolean e>
		c = add1;
	//    9   16:aload_0         
	//   10   17:aload_3         
	//   11   18:putfield        #53  <Field add c>
		d = adf1;
	//   12   21:aload_0         
	//   13   22:aload_2         
	//   14   23:putfield        #55  <Field adf d>
		n = flag;
	//   15   26:aload_0         
	//   16   27:iload           4
	//   17   29:putfield        #57  <Field boolean n>
		f = adc1;
	//   18   32:aload_0         
	//   19   33:aload           6
	//   20   35:putfield        #59  <Field adc f>
		setSurfaceTextureListener(((android.view.TextureView.SurfaceTextureListener) (this)));
	//   21   38:aload_0         
	//   22   39:aload_0         
	//   23   40:invokevirtual   #63  <Method void setSurfaceTextureListener(android.view.TextureView$SurfaceTextureListener)>
		d.a(((acm) (this)));
	//   24   43:aload_0         
	//   25   44:getfield        #55  <Field adf d>
	//   26   47:aload_0         
	//   27   48:invokevirtual   #69  <Method void adf.a(acm)>
	//   28   51:return          
	}

	private final void a(float f1, boolean flag)
	{
		adx adx1 = i;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field adx i>
	//    2    4:astore_3        
		if(adx1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          16
		{
			adx1.a(f1, flag);
	//    5    9:aload_3         
	//    6   10:fload_1         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #77  <Method void adx.a(float, boolean)>
			return;
	//    9   15:return          
		} else
		{
			com.google.android.gms.internal.ads.wx.e("Trying to set volume before player is initalized.");
	//   10   16:ldc1            #79  <String "Trying to set volume before player is initalized.">
	//   11   18:invokestatic    #84  <Method void com.google.android.gms.internal.ads.wx.e(String)>
			return;
	//   12   21:return          
		}
	}

	private final void a(Surface surface, boolean flag)
	{
		adx adx1 = i;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field adx i>
	//    2    4:astore_3        
		if(adx1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          16
		{
			adx1.a(surface, flag);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #87  <Method void adx.a(Surface, boolean)>
			return;
	//    9   15:return          
		} else
		{
			com.google.android.gms.internal.ads.wx.e("Trying to set surface before player is initalized.");
	//   10   16:ldc1            #89  <String "Trying to set surface before player is initalized.">
	//   11   18:invokestatic    #84  <Method void com.google.android.gms.internal.ads.wx.e(String)>
			return;
	//   12   21:return          
		}
	}

	private final adx l()
	{
		return new adx(c.getContext(), f);
	//    0    0:new             #75  <Class adx>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field add c>
	//    4    8:invokeinterface #96  <Method Context add.getContext()>
	//    5   13:aload_0         
	//    6   14:getfield        #59  <Field adc f>
	//    7   17:invokespecial   #99  <Method void adx(Context, adc)>
	//    8   20:areturn         
	}

	private final String m()
	{
		return aw.e().b(c.getContext(), c.k().a);
	//    0    0:invokestatic    #105 <Method xg aw.e()>
	//    1    3:aload_0         
	//    2    4:getfield        #53  <Field add c>
	//    3    7:invokeinterface #96  <Method Context add.getContext()>
	//    4   12:aload_0         
	//    5   13:getfield        #53  <Field add c>
	//    6   16:invokeinterface #108 <Method zzbbi add.k()>
	//    7   21:getfield        #112 <Field String zzbbi.a>
	//    8   24:invokevirtual   #118 <Method String xg.b(Context, String)>
	//    9   27:areturn         
	}

	private final boolean n()
	{
		return i != null && !k;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field adx i>
	//    2    4:ifnull          16
	//    3    7:aload_0         
	//    4    8:getfield        #121 <Field boolean k>
	//    5   11:ifne            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	private final boolean o()
	{
		return n() && l != 1;
	//    0    0:aload_0         
	//    1    1:invokespecial   #123 <Method boolean n()>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:getfield        #49  <Field int l>
	//    5   11:iconst_1        
	//    6   12:icmpeq          17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	private final void p()
	{
		if(i != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field adx i>
	//*   2    4:ifnull          8
			return;
	//    3    7:return          
		String s1 = j;
	//    4    8:aload_0         
	//    5    9:getfield        #126 <Field String j>
	//    6   12:astore_2        
		if(s1 != null)
	//*   7   13:aload_2         
	//*   8   14:ifnull          257
		{
			if(h == null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #128 <Field Surface h>
	//*  11   21:ifnonnull       25
				return;
	//   12   24:return          
			if(s1.startsWith("cache:"))
	//*  13   25:aload_2         
	//*  14   26:ldc1            #130 <String "cache:">
	//*  15   28:invokevirtual   #136 <Method boolean String.startsWith(String)>
	//*  16   31:ifeq            183
			{
				Object obj = ((Object) (c.a(j)));
	//   17   34:aload_0         
	//   18   35:getfield        #53  <Field add c>
	//   19   38:aload_0         
	//   20   39:getfield        #126 <Field String j>
	//   21   42:invokeinterface #139 <Method aeq add.a(String)>
	//   22   47:astore_2        
				if(obj instanceof afc)
	//*  23   48:aload_2         
	//*  24   49:instanceof      #141 <Class afc>
	//*  25   52:ifeq            69
					i = ((afc)obj).c();
	//   26   55:aload_0         
	//   27   56:aload_2         
	//   28   57:checkcast       #141 <Class afc>
	//   29   60:invokevirtual   #143 <Method adx afc.c()>
	//   30   63:putfield        #73  <Field adx i>
				else
	//*  31   66:goto            211
				if(obj instanceof afb)
	//*  32   69:aload_2         
	//*  33   70:instanceof      #145 <Class afb>
	//*  34   73:ifeq            143
				{
					Object obj1 = ((Object) ((afb)obj));
	//   35   76:aload_2         
	//   36   77:checkcast       #145 <Class afb>
	//   37   80:astore          4
					obj = ((Object) (m()));
	//   38   82:aload_0         
	//   39   83:invokespecial   #147 <Method String m()>
	//   40   86:astore_2        
					java.nio.ByteBuffer bytebuffer = ((afb) (obj1)).e();
	//   41   87:aload           4
	//   42   89:invokevirtual   #150 <Method java.nio.ByteBuffer com.google.android.gms.internal.ads.afb.e()>
	//   43   92:astore_3        
					boolean flag = ((afb) (obj1)).d();
	//   44   93:aload           4
	//   45   95:invokevirtual   #152 <Method boolean afb.d()>
	//   46   98:istore_1        
					obj1 = ((Object) (((afb) (obj1)).c()));
	//   47   99:aload           4
	//   48  101:invokevirtual   #154 <Method String afb.c()>
	//   49  104:astore          4
					if(obj1 == null)
	//*  50  106:aload           4
	//*  51  108:ifnonnull       117
					{
						com.google.android.gms.internal.ads.wx.e("Stream cache URL is null.");
	//   52  111:ldc1            #156 <String "Stream cache URL is null.">
	//   53  113:invokestatic    #84  <Method void com.google.android.gms.internal.ads.wx.e(String)>
						return;
	//   54  116:return          
					}
					i = l();
	//   55  117:aload_0         
	//   56  118:aload_0         
	//   57  119:invokespecial   #158 <Method adx l()>
	//   58  122:putfield        #73  <Field adx i>
					i.a(Uri.parse(((String) (obj1))), ((String) (obj)), bytebuffer, flag);
	//   59  125:aload_0         
	//   60  126:getfield        #73  <Field adx i>
	//   61  129:aload           4
	//   62  131:invokestatic    #164 <Method Uri Uri.parse(String)>
	//   63  134:aload_2         
	//   64  135:aload_3         
	//   65  136:iload_1         
	//   66  137:invokevirtual   #167 <Method void adx.a(Uri, String, java.nio.ByteBuffer, boolean)>
				} else
	//*  67  140:goto            211
				{
					String s2 = String.valueOf(((Object) (j)));
	//   68  143:aload_0         
	//   69  144:getfield        #126 <Field String j>
	//   70  147:invokestatic    #171 <Method String String.valueOf(Object)>
	//   71  150:astore_2        
					if(s2.length() != 0)
	//*  72  151:aload_2         
	//*  73  152:invokevirtual   #175 <Method int String.length()>
	//*  74  155:ifeq            168
						s2 = "Stream cache miss: ".concat(s2);
	//   75  158:ldc1            #177 <String "Stream cache miss: ">
	//   76  160:aload_2         
	//   77  161:invokevirtual   #181 <Method String String.concat(String)>
	//   78  164:astore_2        
					else
	//*  79  165:goto            178
						s2 = new String("Stream cache miss: ");
	//   80  168:new             #132 <Class String>
	//   81  171:dup             
	//   82  172:ldc1            #177 <String "Stream cache miss: ">
	//   83  174:invokespecial   #183 <Method void String(String)>
	//   84  177:astore_2        
					com.google.android.gms.internal.ads.wx.e(s2);
	//   85  178:aload_2         
	//   86  179:invokestatic    #84  <Method void com.google.android.gms.internal.ads.wx.e(String)>
					return;
	//   87  182:return          
				}
			} else
			{
				i = l();
	//   88  183:aload_0         
	//   89  184:aload_0         
	//   90  185:invokespecial   #158 <Method adx l()>
	//   91  188:putfield        #73  <Field adx i>
				String s3 = m();
	//   92  191:aload_0         
	//   93  192:invokespecial   #147 <Method String m()>
	//   94  195:astore_2        
				i.a(Uri.parse(j), s3);
	//   95  196:aload_0         
	//   96  197:getfield        #73  <Field adx i>
	//   97  200:aload_0         
	//   98  201:getfield        #126 <Field String j>
	//   99  204:invokestatic    #164 <Method Uri Uri.parse(String)>
	//  100  207:aload_2         
	//  101  208:invokevirtual   #186 <Method void adx.a(Uri, String)>
			}
			i.a(((aee) (this)));
	//  102  211:aload_0         
	//  103  212:getfield        #73  <Field adx i>
	//  104  215:aload_0         
	//  105  216:invokevirtual   #189 <Method void adx.a(aee)>
			a(h, false);
	//  106  219:aload_0         
	//  107  220:aload_0         
	//  108  221:getfield        #128 <Field Surface h>
	//  109  224:iconst_0        
	//  110  225:invokespecial   #190 <Method void a(Surface, boolean)>
			l = i.a().a();
	//  111  228:aload_0         
	//  112  229:aload_0         
	//  113  230:getfield        #73  <Field adx i>
	//  114  233:invokevirtual   #193 <Method bct adx.a()>
	//  115  236:invokeinterface #197 <Method int bct.a()>
	//  116  241:putfield        #49  <Field int l>
			if(l == 3)
	//* 117  244:aload_0         
	//* 118  245:getfield        #49  <Field int l>
	//* 119  248:iconst_3        
	//* 120  249:icmpne          256
				q();
	//  121  252:aload_0         
	//  122  253:invokespecial   #199 <Method void q()>
			return;
	//  123  256:return          
		} else
		{
			return;
	//  124  257:return          
		}
	}

	private final void q()
	{
		if(o)
	//*   0    0:aload_0         
	//*   1    1:getfield        #201 <Field boolean o>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		o = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #201 <Field boolean o>
		xg.a.post(((Runnable) (new adk(this))));
	//    7   13:getstatic       #204 <Field Handler xg.a>
	//    8   16:new             #206 <Class adk>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #209 <Method void adk(adj)>
	//   12   24:invokevirtual   #215 <Method boolean Handler.post(Runnable)>
	//   13   27:pop             
		((acm)this).e();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #217 <Method void com.google.android.gms.internal.ads.acm.e()>
		d.a();
	//   16   32:aload_0         
	//   17   33:getfield        #55  <Field adf d>
	//   18   36:invokevirtual   #219 <Method void adf.a()>
		if(p)
	//*  19   39:aload_0         
	//*  20   40:getfield        #221 <Field boolean p>
	//*  21   43:ifeq            50
			((acm)this).c();
	//   22   46:aload_0         
	//   23   47:invokevirtual   #223 <Method void acm.c()>
	//   24   50:return          
	}

	private final void r()
	{
		int i1 = r;
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field int r>
	//    2    4:istore_2        
		float f1;
		if(i1 > 0)
	//*   3    5:iload_2         
	//*   4    6:ifle            21
			f1 = (float)q / (float)i1;
	//    5    9:aload_0         
	//    6   10:getfield        #227 <Field int q>
	//    7   13:i2f             
	//    8   14:iload_2         
	//    9   15:i2f             
	//   10   16:fdiv            
	//   11   17:fstore_1        
		else
	//*  12   18:goto            23
			f1 = 1.0F;
	//   13   21:fconst_1        
	//   14   22:fstore_1        
		if(u != f1)
	//*  15   23:aload_0         
	//*  16   24:getfield        #229 <Field float u>
	//*  17   27:fload_1         
	//*  18   28:fcmpl           
	//*  19   29:ifeq            41
		{
			u = f1;
	//   20   32:aload_0         
	//   21   33:fload_1         
	//   22   34:putfield        #229 <Field float u>
			requestLayout();
	//   23   37:aload_0         
	//   24   38:invokevirtual   #232 <Method void requestLayout()>
		}
	//   25   41:return          
	}

	private final void s()
	{
		adx adx1 = i;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field adx i>
	//    2    4:astore_1        
		if(adx1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			adx1.b(true);
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #235 <Method void adx.b(boolean)>
	//    8   14:return          
	}

	private final void t()
	{
		adx adx1 = i;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field adx i>
	//    2    4:astore_1        
		if(adx1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			adx1.b(false);
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #235 <Method void adx.b(boolean)>
	//    8   14:return          
	}

	public final String a()
	{
		String s2 = String.valueOf("ExoPlayer/3");
	//    0    0:ldc1            #237 <String "ExoPlayer/3">
	//    1    2:invokestatic    #171 <Method String String.valueOf(Object)>
	//    2    5:astore_2        
		String s1;
		if(n)
	//*   3    6:aload_0         
	//*   4    7:getfield        #57  <Field boolean n>
	//*   5   10:ifeq            19
			s1 = " spherical";
	//    6   13:ldc1            #239 <String " spherical">
	//    7   15:astore_1        
		else
	//*   8   16:goto            22
			s1 = "";
	//    9   19:ldc1            #241 <String "">
	//   10   21:astore_1        
		s1 = String.valueOf(((Object) (s1)));
	//   11   22:aload_1         
	//   12   23:invokestatic    #171 <Method String String.valueOf(Object)>
	//   13   26:astore_1        
		if(s1.length() != 0)
	//*  14   27:aload_1         
	//*  15   28:invokevirtual   #175 <Method int String.length()>
	//*  16   31:ifeq            40
			return s2.concat(s1);
	//   17   34:aload_2         
	//   18   35:aload_1         
	//   19   36:invokevirtual   #181 <Method String String.concat(String)>
	//   20   39:areturn         
		else
			return new String(s2);
	//   21   40:new             #132 <Class String>
	//   22   43:dup             
	//   23   44:aload_2         
	//   24   45:invokespecial   #183 <Method void String(String)>
	//   25   48:areturn         
	}

	public final void a(float f1, float f2)
	{
		adb adb1 = m;
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field adb m>
	//    2    4:astore_3        
		if(adb1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          15
			adb1.a(f1, f2);
	//    5    9:aload_3         
	//    6   10:fload_1         
	//    7   11:fload_2         
	//    8   12:invokevirtual   #248 <Method void adb.a(float, float)>
	//    9   15:return          
	}

	public final void a(int i1)
	{
		if(o())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #251 <Method boolean o()>
	//*   2    4:ifeq            21
			i.a().a(i1);
	//    3    7:aload_0         
	//    4    8:getfield        #73  <Field adx i>
	//    5   11:invokevirtual   #193 <Method bct adx.a()>
	//    6   14:iload_1         
	//    7   15:i2l             
	//    8   16:invokeinterface #254 <Method void bct.a(long)>
	//    9   21:return          
	}

	public final void a(int i1, int j1)
	{
		q = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #227 <Field int q>
		r = j1;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #225 <Field int r>
		r();
	//    6   10:aload_0         
	//    7   11:invokespecial   #257 <Method void r()>
	//    8   14:return          
	}

	public final void a(acl acl1)
	{
		g = acl1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #260 <Field acl g>
	//    3    5:return          
	}

	final void a(String s1)
	{
		acl acl1 = g;
	//    0    0:aload_0         
	//    1    1:getfield        #260 <Field acl g>
	//    2    4:astore_2        
		if(acl1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          19
			acl1.a("ExoPlayerAdapter error", s1);
	//    5    9:aload_2         
	//    6   10:ldc2            #262 <String "ExoPlayerAdapter error">
	//    7   13:aload_1         
	//    8   14:invokeinterface #267 <Method void acl.a(String, String)>
	//    9   19:return          
	}

	public final void a(String s1, Exception exception)
	{
		String s2 = ((Object) (exception)).getClass().getCanonicalName();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #274 <Method Class Object.getClass()>
	//    2    4:invokevirtual   #279 <Method String Class.getCanonicalName()>
	//    3    7:astore_3        
		exception = ((Exception) (exception.getMessage()));
	//    4    8:aload_2         
	//    5    9:invokevirtual   #284 <Method String Exception.getMessage()>
	//    6   12:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s1))).length() + 2 + String.valueOf(((Object) (s2))).length() + String.valueOf(((Object) (exception))).length());
	//    7   13:new             #286 <Class StringBuilder>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokestatic    #171 <Method String String.valueOf(Object)>
	//   11   21:invokevirtual   #175 <Method int String.length()>
	//   12   24:iconst_2        
	//   13   25:iadd            
	//   14   26:aload_3         
	//   15   27:invokestatic    #171 <Method String String.valueOf(Object)>
	//   16   30:invokevirtual   #175 <Method int String.length()>
	//   17   33:iadd            
	//   18   34:aload_2         
	//   19   35:invokestatic    #171 <Method String String.valueOf(Object)>
	//   20   38:invokevirtual   #175 <Method int String.length()>
	//   21   41:iadd            
	//   22   42:invokespecial   #288 <Method void StringBuilder(int)>
	//   23   45:astore          4
		stringbuilder.append(s1);
	//   24   47:aload           4
	//   25   49:aload_1         
	//   26   50:invokevirtual   #292 <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
		stringbuilder.append("/");
	//   28   54:aload           4
	//   29   56:ldc2            #294 <String "/">
	//   30   59:invokevirtual   #292 <Method StringBuilder StringBuilder.append(String)>
	//   31   62:pop             
		stringbuilder.append(s2);
	//   32   63:aload           4
	//   33   65:aload_3         
	//   34   66:invokevirtual   #292 <Method StringBuilder StringBuilder.append(String)>
	//   35   69:pop             
		stringbuilder.append(":");
	//   36   70:aload           4
	//   37   72:ldc2            #296 <String ":">
	//   38   75:invokevirtual   #292 <Method StringBuilder StringBuilder.append(String)>
	//   39   78:pop             
		stringbuilder.append(((String) (exception)));
	//   40   79:aload           4
	//   41   81:aload_2         
	//   42   82:invokevirtual   #292 <Method StringBuilder StringBuilder.append(String)>
	//   43   85:pop             
		exception = ((Exception) (stringbuilder.toString()));
	//   44   86:aload           4
	//   45   88:invokevirtual   #299 <Method String StringBuilder.toString()>
	//   46   91:astore_2        
		s1 = String.valueOf(((Object) (exception)));
	//   47   92:aload_2         
	//   48   93:invokestatic    #171 <Method String String.valueOf(Object)>
	//   49   96:astore_1        
		if(s1.length() != 0)
	//*  50   97:aload_1         
	//*  51   98:invokevirtual   #175 <Method int String.length()>
	//*  52  101:ifeq            115
			s1 = "ExoPlayerAdapter error: ".concat(s1);
	//   53  104:ldc2            #301 <String "ExoPlayerAdapter error: ">
	//   54  107:aload_1         
	//   55  108:invokevirtual   #181 <Method String String.concat(String)>
	//   56  111:astore_1        
		else
	//*  57  112:goto            126
			s1 = new String("ExoPlayerAdapter error: ");
	//   58  115:new             #132 <Class String>
	//   59  118:dup             
	//   60  119:ldc2            #301 <String "ExoPlayerAdapter error: ">
	//   61  122:invokespecial   #183 <Method void String(String)>
	//   62  125:astore_1        
		com.google.android.gms.internal.ads.wx.e(s1);
	//   63  126:aload_1         
	//   64  127:invokestatic    #84  <Method void com.google.android.gms.internal.ads.wx.e(String)>
		k = true;
	//   65  130:aload_0         
	//   66  131:iconst_1        
	//   67  132:putfield        #121 <Field boolean k>
		if(f.a)
	//*  68  135:aload_0         
	//*  69  136:getfield        #59  <Field adc f>
	//*  70  139:getfield        #305 <Field boolean adc.a>
	//*  71  142:ifeq            149
			t();
	//   72  145:aload_0         
	//   73  146:invokespecial   #307 <Method void t()>
		xg.a.post(((Runnable) (new adm(this, ((String) (exception))))));
	//   74  149:getstatic       #204 <Field Handler xg.a>
	//   75  152:new             #309 <Class adm>
	//   76  155:dup             
	//   77  156:aload_0         
	//   78  157:aload_2         
	//   79  158:invokespecial   #312 <Method void adm(adj, String)>
	//   80  161:invokevirtual   #215 <Method boolean Handler.post(Runnable)>
	//   81  164:pop             
	//   82  165:return          
	}

	public final void a(boolean flag, long l1)
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field add c>
	//*   2    4:ifnull          25
			abj.a.execute(((Runnable) (new adt(this, flag, l1))));
	//    3    7:getstatic       #318 <Field Executor abj.a>
	//    4   10:new             #320 <Class adt>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:iload_1         
	//    8   16:lload_2         
	//    9   17:invokespecial   #323 <Method void adt(adj, boolean, long)>
	//   10   20:invokeinterface #329 <Method void Executor.execute(Runnable)>
	//   11   25:return          
	}

	public final void b()
	{
		if(n())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #123 <Method boolean n()>
	//*   2    4:ifeq            78
		{
			i.a().c();
	//    3    7:aload_0         
	//    4    8:getfield        #73  <Field adx i>
	//    5   11:invokevirtual   #193 <Method bct adx.a()>
	//    6   14:invokeinterface #330 <Method void bct.c()>
			if(i != null)
	//*   7   19:aload_0         
	//*   8   20:getfield        #73  <Field adx i>
	//*   9   23:ifnull          78
			{
				a(((Surface) (null)), true);
	//   10   26:aload_0         
	//   11   27:aconst_null     
	//   12   28:iconst_1        
	//   13   29:invokespecial   #190 <Method void a(Surface, boolean)>
				adx adx1 = i;
	//   14   32:aload_0         
	//   15   33:getfield        #73  <Field adx i>
	//   16   36:astore_1        
				if(adx1 != null)
	//*  17   37:aload_1         
	//*  18   38:ifnull          58
				{
					adx1.a(((aee) (null)));
	//   19   41:aload_1         
	//   20   42:aconst_null     
	//   21   43:invokevirtual   #189 <Method void adx.a(aee)>
					i.e();
	//   22   46:aload_0         
	//   23   47:getfield        #73  <Field adx i>
	//   24   50:invokevirtual   #331 <Method void com.google.android.gms.internal.ads.adx.e()>
					i = null;
	//   25   53:aload_0         
	//   26   54:aconst_null     
	//   27   55:putfield        #73  <Field adx i>
				}
				l = 1;
	//   28   58:aload_0         
	//   29   59:iconst_1        
	//   30   60:putfield        #49  <Field int l>
				k = false;
	//   31   63:aload_0         
	//   32   64:iconst_0        
	//   33   65:putfield        #121 <Field boolean k>
				o = false;
	//   34   68:aload_0         
	//   35   69:iconst_0        
	//   36   70:putfield        #201 <Field boolean o>
				p = false;
	//   37   73:aload_0         
	//   38   74:iconst_0        
	//   39   75:putfield        #221 <Field boolean p>
			}
		}
		d.d();
	//   40   78:aload_0         
	//   41   79:getfield        #55  <Field adf d>
	//   42   82:invokevirtual   #333 <Method void adf.d()>
		b.c();
	//   43   85:aload_0         
	//   44   86:getfield        #336 <Field adh b>
	//   45   89:invokevirtual   #339 <Method void adh.c()>
		d.b();
	//   46   92:aload_0         
	//   47   93:getfield        #55  <Field adf d>
	//   48   96:invokevirtual   #341 <Method void adf.b()>
	//   49   99:return          
	}

	public final void b(int i1)
	{
		if(l != i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field int l>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          86
		{
			l = i1;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #49  <Field int l>
			switch(i1)
	//*   7   13:iload_1         
			{
	//*   8   14:tableswitch     3 4: default 36
	//	               3 81
	//	               4 37
			default:
				return;
	//    9   36:return          

			case 4: // '\004'
				if(f.a)
	//*  10   37:aload_0         
	//*  11   38:getfield        #59  <Field adc f>
	//*  12   41:getfield        #305 <Field boolean adc.a>
	//*  13   44:ifeq            51
					t();
	//   14   47:aload_0         
	//   15   48:invokespecial   #307 <Method void t()>
				d.d();
	//   16   51:aload_0         
	//   17   52:getfield        #55  <Field adf d>
	//   18   55:invokevirtual   #333 <Method void adf.d()>
				b.c();
	//   19   58:aload_0         
	//   20   59:getfield        #336 <Field adh b>
	//   21   62:invokevirtual   #339 <Method void adh.c()>
				xg.a.post(((Runnable) (new adl(this))));
	//   22   65:getstatic       #204 <Field Handler xg.a>
	//   23   68:new             #343 <Class adl>
	//   24   71:dup             
	//   25   72:aload_0         
	//   26   73:invokespecial   #344 <Method void adl(adj)>
	//   27   76:invokevirtual   #215 <Method boolean Handler.post(Runnable)>
	//   28   79:pop             
				return;
	//   29   80:return          

			case 3: // '\003'
				q();
	//   30   81:aload_0         
	//   31   82:invokespecial   #199 <Method void q()>
				return;
	//   32   85:return          
			}
		} else
		{
			return;
	//   33   86:return          
		}
	}

	final void b(int i1, int j1)
	{
		acl acl1 = g;
	//    0    0:aload_0         
	//    1    1:getfield        #260 <Field acl g>
	//    2    4:astore_3        
		if(acl1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          17
			acl1.a(i1, j1);
	//    5    9:aload_3         
	//    6   10:iload_1         
	//    7   11:iload_2         
	//    8   12:invokeinterface #346 <Method void acl.a(int, int)>
	//    9   17:return          
	}

	final void b(boolean flag, long l1)
	{
		c.a(flag, l1);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field add c>
	//    2    4:iload_1         
	//    3    5:lload_2         
	//    4    6:invokeinterface #348 <Method void add.a(boolean, long)>
	//    5   11:return          
	}

	public final void c()
	{
		if(o())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #251 <Method boolean o()>
	//*   2    4:ifeq            71
		{
			if(f.a)
	//*   3    7:aload_0         
	//*   4    8:getfield        #59  <Field adc f>
	//*   5   11:getfield        #305 <Field boolean adc.a>
	//*   6   14:ifeq            21
				s();
	//    7   17:aload_0         
	//    8   18:invokespecial   #350 <Method void s()>
			i.a().a(true);
	//    9   21:aload_0         
	//   10   22:getfield        #73  <Field adx i>
	//   11   25:invokevirtual   #193 <Method bct adx.a()>
	//   12   28:iconst_1        
	//   13   29:invokeinterface #352 <Method void bct.a(boolean)>
			d.c();
	//   14   34:aload_0         
	//   15   35:getfield        #55  <Field adf d>
	//   16   38:invokevirtual   #353 <Method void adf.c()>
			b.b();
	//   17   41:aload_0         
	//   18   42:getfield        #336 <Field adh b>
	//   19   45:invokevirtual   #354 <Method void adh.b()>
			a.a();
	//   20   48:aload_0         
	//   21   49:getfield        #357 <Field acw a>
	//   22   52:invokevirtual   #360 <Method void acw.a()>
			xg.a.post(((Runnable) (new adn(this))));
	//   23   55:getstatic       #204 <Field Handler xg.a>
	//   24   58:new             #362 <Class adn>
	//   25   61:dup             
	//   26   62:aload_0         
	//   27   63:invokespecial   #363 <Method void adn(adj)>
	//   28   66:invokevirtual   #215 <Method boolean Handler.post(Runnable)>
	//   29   69:pop             
			return;
	//   30   70:return          
		} else
		{
			p = true;
	//   31   71:aload_0         
	//   32   72:iconst_1        
	//   33   73:putfield        #221 <Field boolean p>
			return;
	//   34   76:return          
		}
	}

	public final void c(int i1)
	{
		adx adx1 = i;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field adx i>
	//    2    4:astore_2        
		if(adx1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
			adx1.d().a(i1);
	//    5    9:aload_2         
	//    6   10:invokevirtual   #366 <Method adw adx.d()>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #370 <Method void adw.a(int)>
	//    9   17:return          
	}

	public final void d()
	{
		if(o())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #251 <Method boolean o()>
	//*   2    4:ifeq            63
		{
			if(f.a)
	//*   3    7:aload_0         
	//*   4    8:getfield        #59  <Field adc f>
	//*   5   11:getfield        #305 <Field boolean adc.a>
	//*   6   14:ifeq            21
				t();
	//    7   17:aload_0         
	//    8   18:invokespecial   #307 <Method void t()>
			i.a().a(false);
	//    9   21:aload_0         
	//   10   22:getfield        #73  <Field adx i>
	//   11   25:invokevirtual   #193 <Method bct adx.a()>
	//   12   28:iconst_0        
	//   13   29:invokeinterface #352 <Method void bct.a(boolean)>
			d.d();
	//   14   34:aload_0         
	//   15   35:getfield        #55  <Field adf d>
	//   16   38:invokevirtual   #333 <Method void adf.d()>
			b.c();
	//   17   41:aload_0         
	//   18   42:getfield        #336 <Field adh b>
	//   19   45:invokevirtual   #339 <Method void adh.c()>
			xg.a.post(((Runnable) (new ado(this))));
	//   20   48:getstatic       #204 <Field Handler xg.a>
	//   21   51:new             #372 <Class ado>
	//   22   54:dup             
	//   23   55:aload_0         
	//   24   56:invokespecial   #373 <Method void ado(adj)>
	//   25   59:invokevirtual   #215 <Method boolean Handler.post(Runnable)>
	//   26   62:pop             
		}
	//   27   63:return          
	}

	public final void d(int i1)
	{
		adx adx1 = i;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field adx i>
	//    2    4:astore_2        
		if(adx1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
			adx1.d().b(i1);
	//    5    9:aload_2         
	//    6   10:invokevirtual   #366 <Method adw adx.d()>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #375 <Method void adw.b(int)>
	//    9   17:return          
	}

	public final void e()
	{
		a(b.a(), false);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #336 <Field adh b>
	//    3    5:invokevirtual   #378 <Method float adh.a()>
	//    4    8:iconst_0        
	//    5    9:invokespecial   #379 <Method void a(float, boolean)>
	//    6   12:return          
	}

	public final void e(int i1)
	{
		adx adx1 = i;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field adx i>
	//    2    4:astore_2        
		if(adx1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
			adx1.d().c(i1);
	//    5    9:aload_2         
	//    6   10:invokevirtual   #366 <Method adw adx.d()>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #381 <Method void adw.c(int)>
	//    9   17:return          
	}

	final void f()
	{
		acl acl1 = g;
	//    0    0:aload_0         
	//    1    1:getfield        #260 <Field acl g>
	//    2    4:astore_1        
		if(acl1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			acl1.f();
	//    5    9:aload_1         
	//    6   10:invokeinterface #383 <Method void acl.f()>
	//    7   15:return          
	}

	public final void f(int i1)
	{
		adx adx1 = i;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field adx i>
	//    2    4:astore_2        
		if(adx1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
			adx1.d().d(i1);
	//    5    9:aload_2         
	//    6   10:invokevirtual   #366 <Method adw adx.d()>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #385 <Method void adw.d(int)>
	//    9   17:return          
	}

	final void g()
	{
		acl acl1 = g;
	//    0    0:aload_0         
	//    1    1:getfield        #260 <Field acl g>
	//    2    4:astore_1        
		if(acl1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			acl1.a();
	//    5    9:aload_1         
	//    6   10:invokeinterface #386 <Method void acl.a()>
	//    7   15:return          
	}

	final void g(int i1)
	{
		acl acl1 = g;
	//    0    0:aload_0         
	//    1    1:getfield        #260 <Field acl g>
	//    2    4:astore_2        
		if(acl1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			acl1.onWindowVisibilityChanged(i1);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokeinterface #389 <Method void acl.onWindowVisibilityChanged(int)>
	//    8   16:return          
	}

	public final int getCurrentPosition()
	{
		if(o())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #251 <Method boolean o()>
	//*   2    4:ifeq            21
			return (int)i.a().g();
	//    3    7:aload_0         
	//    4    8:getfield        #73  <Field adx i>
	//    5   11:invokevirtual   #193 <Method bct adx.a()>
	//    6   14:invokeinterface #393 <Method long bct.g()>
	//    7   19:l2i             
	//    8   20:ireturn         
		else
			return 0;
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public final int getDuration()
	{
		if(o())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #251 <Method boolean o()>
	//*   2    4:ifeq            21
			return (int)i.a().f();
	//    3    7:aload_0         
	//    4    8:getfield        #73  <Field adx i>
	//    5   11:invokevirtual   #193 <Method bct adx.a()>
	//    6   14:invokeinterface #396 <Method long bct.f()>
	//    7   19:l2i             
	//    8   20:ireturn         
		else
			return 0;
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public final int getVideoHeight()
	{
		return r;
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field int r>
	//    2    4:ireturn         
	}

	public final int getVideoWidth()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field int q>
	//    2    4:ireturn         
	}

	final void h()
	{
		acl acl1 = g;
	//    0    0:aload_0         
	//    1    1:getfield        #260 <Field acl g>
	//    2    4:astore_1        
		if(acl1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			acl1.d();
	//    5    9:aload_1         
	//    6   10:invokeinterface #399 <Method void acl.d()>
	//    7   15:return          
	}

	final void i()
	{
		acl acl1 = g;
	//    0    0:aload_0         
	//    1    1:getfield        #260 <Field acl g>
	//    2    4:astore_1        
		if(acl1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			acl1.c();
	//    5    9:aload_1         
	//    6   10:invokeinterface #400 <Method void acl.c()>
	//    7   15:return          
	}

	final void j()
	{
		acl acl1 = g;
	//    0    0:aload_0         
	//    1    1:getfield        #260 <Field acl g>
	//    2    4:astore_1        
		if(acl1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			acl1.e();
	//    5    9:aload_1         
	//    6   10:invokeinterface #401 <Method void com.google.android.gms.internal.ads.acl.e()>
	//    7   15:return          
	}

	final void k()
	{
		acl acl1 = g;
	//    0    0:aload_0         
	//    1    1:getfield        #260 <Field acl g>
	//    2    4:astore_1        
		if(acl1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			acl1.b();
	//    5    9:aload_1         
	//    6   10:invokeinterface #402 <Method void acl.b()>
	//    7   15:return          
	}

	protected final void onMeasure(int i1, int j1)
	{
label0:
		{
			int k1;
label1:
			{
				super.onMeasure(i1, j1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #405 <Method void acm.onMeasure(int, int)>
				int l1 = getMeasuredWidth();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #408 <Method int getMeasuredWidth()>
	//    6   10:istore          7
				i1 = getMeasuredHeight();
	//    7   12:aload_0         
	//    8   13:invokevirtual   #411 <Method int getMeasuredHeight()>
	//    9   16:istore_1        
				float f2 = u;
	//   10   17:aload_0         
	//   11   18:getfield        #229 <Field float u>
	//   12   21:fstore          4
				k1 = l1;
	//   13   23:iload           7
	//   14   25:istore          6
				j1 = i1;
	//   15   27:iload_1         
	//   16   28:istore_2        
				if(f2 != 0.0F)
	//*  17   29:fload           4
	//*  18   31:fconst_0        
	//*  19   32:fcmpl           
	//*  20   33:ifeq            103
				{
					k1 = l1;
	//   21   36:iload           7
	//   22   38:istore          6
					j1 = i1;
	//   23   40:iload_1         
	//   24   41:istore_2        
					if(m == null)
	//*  25   42:aload_0         
	//*  26   43:getfield        #244 <Field adb m>
	//*  27   46:ifnonnull       103
					{
						float f3 = l1;
	//   28   49:iload           7
	//   29   51:i2f             
	//   30   52:fstore          5
						float f1 = f3 / (float)i1;
	//   31   54:fload           5
	//   32   56:iload_1         
	//   33   57:i2f             
	//   34   58:fdiv            
	//   35   59:fstore_3        
						if(f2 > f1)
	//*  36   60:fload           4
	//*  37   62:fload_3         
	//*  38   63:fcmpl           
	//*  39   64:ifle            74
							i1 = (int)(f3 / f2);
	//   40   67:fload           5
	//   41   69:fload           4
	//   42   71:fdiv            
	//   43   72:f2i             
	//   44   73:istore_1        
						f2 = u;
	//   45   74:aload_0         
	//   46   75:getfield        #229 <Field float u>
	//   47   78:fstore          4
						k1 = l1;
	//   48   80:iload           7
	//   49   82:istore          6
						j1 = i1;
	//   50   84:iload_1         
	//   51   85:istore_2        
						if(f2 < f1)
	//*  52   86:fload           4
	//*  53   88:fload_3         
	//*  54   89:fcmpg           
	//*  55   90:ifge            103
						{
							k1 = (int)((float)i1 * f2);
	//   56   93:iload_1         
	//   57   94:i2f             
	//   58   95:fload           4
	//   59   97:fmul            
	//   60   98:f2i             
	//   61   99:istore          6
							j1 = i1;
	//   62  101:iload_1         
	//   63  102:istore_2        
						}
					}
				}
				setMeasuredDimension(k1, j1);
	//   64  103:aload_0         
	//   65  104:iload           6
	//   66  106:iload_2         
	//   67  107:invokevirtual   #414 <Method void setMeasuredDimension(int, int)>
				adb adb1 = m;
	//   68  110:aload_0         
	//   69  111:getfield        #244 <Field adb m>
	//   70  114:astore          12
				if(adb1 != null)
	//*  71  116:aload           12
	//*  72  118:ifnull          129
					adb1.a(k1, j1);
	//   73  121:aload           12
	//   74  123:iload           6
	//   75  125:iload_2         
	//   76  126:invokevirtual   #415 <Method void adb.a(int, int)>
				if(android.os.Build.VERSION.SDK_INT != 16)
					break label0;
	//   77  129:getstatic       #420 <Field int android.os.Build$VERSION.SDK_INT>
	//   78  132:bipush          16
	//   79  134:icmpne          308
				i1 = s;
	//   80  137:aload_0         
	//   81  138:getfield        #422 <Field int s>
	//   82  141:istore_1        
				if(i1 <= 0 || i1 == k1)
	//*  83  142:iload_1         
	//*  84  143:ifle            152
	//*  85  146:iload_1         
	//*  86  147:iload           6
	//*  87  149:icmpne          166
				{
					i1 = t;
	//   88  152:aload_0         
	//   89  153:getfield        #424 <Field int t>
	//   90  156:istore_1        
					if(i1 <= 0 || i1 == j1)
						break label1;
	//   91  157:iload_1         
	//   92  158:ifle            297
	//   93  161:iload_1         
	//   94  162:iload_2         
	//   95  163:icmpeq          297
				}
				if(e && n())
	//*  96  166:aload_0         
	//*  97  167:getfield        #51  <Field boolean e>
	//*  98  170:ifeq            297
	//*  99  173:aload_0         
	//* 100  174:invokespecial   #123 <Method boolean n()>
	//* 101  177:ifeq            297
				{
					bct bct1 = i.a();
	//  102  180:aload_0         
	//  103  181:getfield        #73  <Field adx i>
	//  104  184:invokevirtual   #193 <Method bct adx.a()>
	//  105  187:astore          12
					if(bct1.g() > 0L && !bct1.b())
	//* 106  189:aload           12
	//* 107  191:invokeinterface #393 <Method long bct.g()>
	//* 108  196:lconst_0        
	//* 109  197:lcmp            
	//* 110  198:ifle            297
	//* 111  201:aload           12
	//* 112  203:invokeinterface #426 <Method boolean bct.b()>
	//* 113  208:ifeq            214
	//* 114  211:goto            297
					{
						a(0.0F, true);
	//  115  214:aload_0         
	//  116  215:fconst_0        
	//  117  216:iconst_1        
	//  118  217:invokespecial   #379 <Method void a(float, boolean)>
						bct1.a(true);
	//  119  220:aload           12
	//  120  222:iconst_1        
	//  121  223:invokeinterface #352 <Method void bct.a(boolean)>
						long l2 = bct1.g();
	//  122  228:aload           12
	//  123  230:invokeinterface #393 <Method long bct.g()>
	//  124  235:lstore          8
						for(long l3 = aw.l().a(); n() && bct1.g() == l2 && aw.l().a() - l3 <= 250L;);
	//  125  237:invokestatic    #429 <Method e aw.l()>
	//  126  240:invokeinterface #433 <Method long e.a()>
	//  127  245:lstore          10
	//  128  247:aload_0         
	//  129  248:invokespecial   #123 <Method boolean n()>
	//  130  251:ifeq            285
	//  131  254:aload           12
	//  132  256:invokeinterface #393 <Method long bct.g()>
	//  133  261:lload           8
	//  134  263:lcmp            
	//  135  264:ifne            285
	//  136  267:invokestatic    #429 <Method e aw.l()>
	//  137  270:invokeinterface #433 <Method long e.a()>
	//  138  275:lload           10
	//  139  277:lsub            
	//  140  278:ldc2w           #434 <Long 250L>
	//  141  281:lcmp            
	//  142  282:ifle            247
						bct1.a(false);
	//  143  285:aload           12
	//  144  287:iconst_0        
	//  145  288:invokeinterface #352 <Method void bct.a(boolean)>
						((acm)this).e();
	//  146  293:aload_0         
	//  147  294:invokevirtual   #217 <Method void com.google.android.gms.internal.ads.acm.e()>
					}
				}
			}
			s = k1;
	//  148  297:aload_0         
	//  149  298:iload           6
	//  150  300:putfield        #422 <Field int s>
			t = j1;
	//  151  303:aload_0         
	//  152  304:iload_2         
	//  153  305:putfield        #424 <Field int t>
		}
	//  154  308:return          
	}

	public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i1, int j1)
	{
		SurfaceTexture surfacetexture1 = surfacetexture;
	//    0    0:aload_1         
	//    1    1:astore          4
		if(n)
	//*   2    3:aload_0         
	//*   3    4:getfield        #57  <Field boolean n>
	//*   4    7:ifeq            74
		{
			m = new adb(getContext());
	//    5   10:aload_0         
	//    6   11:new             #246 <Class adb>
	//    7   14:dup             
	//    8   15:aload_0         
	//    9   16:invokevirtual   #438 <Method Context getContext()>
	//   10   19:invokespecial   #439 <Method void adb(Context)>
	//   11   22:putfield        #244 <Field adb m>
			m.a(surfacetexture, i1, j1);
	//   12   25:aload_0         
	//   13   26:getfield        #244 <Field adb m>
	//   14   29:aload_1         
	//   15   30:iload_2         
	//   16   31:iload_3         
	//   17   32:invokevirtual   #441 <Method void adb.a(SurfaceTexture, int, int)>
			m.start();
	//   18   35:aload_0         
	//   19   36:getfield        #244 <Field adb m>
	//   20   39:invokevirtual   #444 <Method void adb.start()>
			surfacetexture1 = m.c();
	//   21   42:aload_0         
	//   22   43:getfield        #244 <Field adb m>
	//   23   46:invokevirtual   #447 <Method SurfaceTexture adb.c()>
	//   24   49:astore          4
			if(surfacetexture1 == null)
	//*  25   51:aload           4
	//*  26   53:ifnull          59
	//*  27   56:goto            74
			{
				m.b();
	//   28   59:aload_0         
	//   29   60:getfield        #244 <Field adb m>
	//   30   63:invokevirtual   #448 <Method void adb.b()>
				m = null;
	//   31   66:aload_0         
	//   32   67:aconst_null     
	//   33   68:putfield        #244 <Field adb m>
				surfacetexture1 = surfacetexture;
	//   34   71:aload_1         
	//   35   72:astore          4
			}
		}
		h = new Surface(surfacetexture1);
	//   36   74:aload_0         
	//   37   75:new             #450 <Class Surface>
	//   38   78:dup             
	//   39   79:aload           4
	//   40   81:invokespecial   #453 <Method void Surface(SurfaceTexture)>
	//   41   84:putfield        #128 <Field Surface h>
		if(i == null)
	//*  42   87:aload_0         
	//*  43   88:getfield        #73  <Field adx i>
	//*  44   91:ifnonnull       101
		{
			p();
	//   45   94:aload_0         
	//   46   95:invokespecial   #455 <Method void p()>
		} else
	//*  47   98:goto            124
		{
			a(h, true);
	//   48  101:aload_0         
	//   49  102:aload_0         
	//   50  103:getfield        #128 <Field Surface h>
	//   51  106:iconst_1        
	//   52  107:invokespecial   #190 <Method void a(Surface, boolean)>
			if(!f.a)
	//*  53  110:aload_0         
	//*  54  111:getfield        #59  <Field adc f>
	//*  55  114:getfield        #305 <Field boolean adc.a>
	//*  56  117:ifne            124
				s();
	//   57  120:aload_0         
	//   58  121:invokespecial   #350 <Method void s()>
		}
		r();
	//   59  124:aload_0         
	//   60  125:invokespecial   #257 <Method void r()>
		xg.a.post(((Runnable) (new adp(this))));
	//   61  128:getstatic       #204 <Field Handler xg.a>
	//   62  131:new             #457 <Class adp>
	//   63  134:dup             
	//   64  135:aload_0         
	//   65  136:invokespecial   #458 <Method void adp(adj)>
	//   66  139:invokevirtual   #215 <Method boolean Handler.post(Runnable)>
	//   67  142:pop             
	//   68  143:return          
	}

	public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
	{
		((acm)this).d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #461 <Method void acm.d()>
		surfacetexture = ((SurfaceTexture) (m));
	//    2    4:aload_0         
	//    3    5:getfield        #244 <Field adb m>
	//    4    8:astore_1        
		if(surfacetexture != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          22
		{
			((adb) (surfacetexture)).b();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #448 <Method void adb.b()>
			m = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #244 <Field adb m>
		}
		if(i != null)
	//*  12   22:aload_0         
	//*  13   23:getfield        #73  <Field adx i>
	//*  14   26:ifnull          57
		{
			t();
	//   15   29:aload_0         
	//   16   30:invokespecial   #307 <Method void t()>
			surfacetexture = ((SurfaceTexture) (h));
	//   17   33:aload_0         
	//   18   34:getfield        #128 <Field Surface h>
	//   19   37:astore_1        
			if(surfacetexture != null)
	//*  20   38:aload_1         
	//*  21   39:ifnull          46
				((Surface) (surfacetexture)).release();
	//   22   42:aload_1         
	//   23   43:invokevirtual   #464 <Method void Surface.release()>
			h = null;
	//   24   46:aload_0         
	//   25   47:aconst_null     
	//   26   48:putfield        #128 <Field Surface h>
			a(((Surface) (null)), true);
	//   27   51:aload_0         
	//   28   52:aconst_null     
	//   29   53:iconst_1        
	//   30   54:invokespecial   #190 <Method void a(Surface, boolean)>
		}
		xg.a.post(((Runnable) (new adr(this))));
	//   31   57:getstatic       #204 <Field Handler xg.a>
	//   32   60:new             #466 <Class adr>
	//   33   63:dup             
	//   34   64:aload_0         
	//   35   65:invokespecial   #467 <Method void adr(adj)>
	//   36   68:invokevirtual   #215 <Method boolean Handler.post(Runnable)>
	//   37   71:pop             
		return true;
	//   38   72:iconst_1        
	//   39   73:ireturn         
	}

	public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i1, int j1)
	{
		surfacetexture = ((SurfaceTexture) (m));
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field adb m>
	//    2    4:astore_1        
		if(surfacetexture != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			((adb) (surfacetexture)).a(i1, j1);
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:iload_3         
	//    8   12:invokevirtual   #415 <Method void adb.a(int, int)>
		xg.a.post(((Runnable) (new adq(this, i1, j1))));
	//    9   15:getstatic       #204 <Field Handler xg.a>
	//   10   18:new             #470 <Class adq>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:iload_2         
	//   14   24:iload_3         
	//   15   25:invokespecial   #473 <Method void adq(adj, int, int)>
	//   16   28:invokevirtual   #215 <Method boolean Handler.post(Runnable)>
	//   17   31:pop             
	//   18   32:return          
	}

	public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
	{
		d.b(((acm) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field adf d>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #476 <Method void adf.b(acm)>
		a.a(surfacetexture, g);
	//    4    8:aload_0         
	//    5    9:getfield        #357 <Field acw a>
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #260 <Field acl g>
	//    9   17:invokevirtual   #479 <Method void acw.a(SurfaceTexture, acl)>
	//   10   20:return          
	}

	protected final void onWindowVisibilityChanged(int i1)
	{
		StringBuilder stringbuilder = new StringBuilder(57);
	//    0    0:new             #286 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          57
	//    3    6:invokespecial   #288 <Method void StringBuilder(int)>
	//    4    9:astore_2        
		stringbuilder.append("AdExoPlayerView3 window visibility changed to ");
	//    5   10:aload_2         
	//    6   11:ldc2            #481 <String "AdExoPlayerView3 window visibility changed to ">
	//    7   14:invokevirtual   #292 <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append(i1);
	//    9   18:aload_2         
	//   10   19:iload_1         
	//   11   20:invokevirtual   #484 <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		wx.a(stringbuilder.toString());
	//   13   24:aload_2         
	//   14   25:invokevirtual   #299 <Method String StringBuilder.toString()>
	//   15   28:invokestatic    #486 <Method void wx.a(String)>
		xg.a.post(((Runnable) (new ads(this, i1))));
	//   16   31:getstatic       #204 <Field Handler xg.a>
	//   17   34:new             #488 <Class ads>
	//   18   37:dup             
	//   19   38:aload_0         
	//   20   39:iload_1         
	//   21   40:invokespecial   #491 <Method void ads(adj, int)>
	//   22   43:invokevirtual   #215 <Method boolean Handler.post(Runnable)>
	//   23   46:pop             
		super.onWindowVisibilityChanged(i1);
	//   24   47:aload_0         
	//   25   48:iload_1         
	//   26   49:invokespecial   #492 <Method void acm.onWindowVisibilityChanged(int)>
	//   27   52:return          
	}

	public final void setVideoPath(String s1)
	{
		if(s1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
		{
			j = s1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #126 <Field String j>
			p();
	//    5    9:aload_0         
	//    6   10:invokespecial   #455 <Method void p()>
		}
	//    7   13:return          
	}

	private final add c;
	private final adf d;
	private final boolean e;
	private final adc f;
	private acl g;
	private Surface h;
	private adx i;
	private String j;
	private boolean k;
	private int l;
	private adb m;
	private final boolean n;
	private boolean o;
	private boolean p;
	private int q;
	private int r;
	private int s;
	private int t;
	private float u;
}
