// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcu, biy, bne, bok, 
//			adw, boe, bhq, xg, 
//			ber, blw, wx, bdl, 
//			bcx, bct, ady, adz, 
//			adc, aea, aeb, adu, 
//			bmm, aed, bms, bcw, 
//			aee, bki, bkv, bix, 
//			aec, blz, bml, bcs, 
//			bdk, bdp, bfb, bjo, 
//			bme, zzfs, bmp

public final class adx
	implements bcu, biy, bne, bok
{

	public adx(Context context, adc adc1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		c = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #43  <Field Context c>
		h = adc1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #45  <Field adc h>
	//    8   14:aload_0         
	//    9   15:new             #47  <Class adw>
	//   10   18:dup             
	//   11   19:invokespecial   #48  <Method void adw()>
	//   12   22:putfield        #50  <Field adw d>
		e = ((bdl) (new boe(c, bhq.a, 0L, xg.a, ((bok) (this)), -1)));
	//   13   25:aload_0         
	//   14   26:new             #52  <Class boe>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:getfield        #43  <Field Context c>
	//   18   34:getstatic       #57  <Field bhq bhq.a>
	//   19   37:lconst_0        
	//   20   38:getstatic       #62  <Field android.os.Handler xg.a>
	//   21   41:aload_0         
	//   22   42:iconst_m1       
	//   23   43:invokespecial   #65  <Method void boe(Context, bhq, long, android.os.Handler, bok, int)>
	//   24   46:putfield        #67  <Field bdl e>
		f = ((bdl) (new ber(bhq.a)));
	//   25   49:aload_0         
	//   26   50:new             #69  <Class ber>
	//   27   53:dup             
	//   28   54:getstatic       #57  <Field bhq bhq.a>
	//   29   57:invokespecial   #72  <Method void ber(bhq)>
	//   30   60:putfield        #74  <Field bdl f>
	//   31   63:aload_0         
	//   32   64:new             #76  <Class blw>
	//   33   67:dup             
	//   34   68:invokespecial   #77  <Method void blw()>
	//   35   71:putfield        #79  <Field blz g>
		if(wx.a())
	//*  36   74:invokestatic    #84  <Method boolean wx.a()>
	//*  37   77:ifeq            123
		{
			context = ((Context) (String.valueOf(((Object) (this)))));
	//   38   80:aload_0         
	//   39   81:invokestatic    #90  <Method String String.valueOf(Object)>
	//   40   84:astore_1        
			adc1 = ((adc) (new StringBuilder(String.valueOf(((Object) (context))).length() + 28)));
	//   41   85:new             #92  <Class StringBuilder>
	//   42   88:dup             
	//   43   89:aload_1         
	//   44   90:invokestatic    #90  <Method String String.valueOf(Object)>
	//   45   93:invokevirtual   #96  <Method int String.length()>
	//   46   96:bipush          28
	//   47   98:iadd            
	//   48   99:invokespecial   #99  <Method void StringBuilder(int)>
	//   49  102:astore_2        
			((StringBuilder) (adc1)).append("ExoPlayerAdapter initialize ");
	//   50  103:aload_2         
	//   51  104:ldc1            #101 <String "ExoPlayerAdapter initialize ">
	//   52  106:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   53  109:pop             
			((StringBuilder) (adc1)).append(((String) (context)));
	//   54  110:aload_2         
	//   55  111:aload_1         
	//   56  112:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   57  115:pop             
			wx.a(((StringBuilder) (adc1)).toString());
	//   58  116:aload_2         
	//   59  117:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   60  120:invokestatic    #112 <Method void wx.a(String)>
		}
		a++;
	//   61  123:getstatic       #114 <Field int a>
	//   62  126:iconst_1        
	//   63  127:iadd            
	//   64  128:putstatic       #114 <Field int a>
		context = ((Context) (f));
	//   65  131:aload_0         
	//   66  132:getfield        #74  <Field bdl f>
	//   67  135:astore_1        
		adc1 = ((adc) (e));
	//   68  136:aload_0         
	//   69  137:getfield        #67  <Field bdl e>
	//   70  140:astore_2        
		blz blz1 = g;
	//   71  141:aload_0         
	//   72  142:getfield        #79  <Field blz g>
	//   73  145:astore_3        
		adw adw1 = d;
	//   74  146:aload_0         
	//   75  147:getfield        #50  <Field adw d>
	//   76  150:astore          4
		i = bcx.a(new bdl[] {
			context, adc1
		}, ((bmf) (blz1)), ((bdi) (adw1)));
	//   77  152:aload_0         
	//   78  153:iconst_2        
	//   79  154:anewarray       bdl[]
	//   80  157:dup             
	//   81  158:iconst_0        
	//   82  159:aload_1         
	//   83  160:aastore         
	//   84  161:dup             
	//   85  162:iconst_1        
	//   86  163:aload_2         
	//   87  164:aastore         
	//   88  165:aload_3         
	//   89  166:aload           4
	//   90  168:invokestatic    #121 <Method bct bcx.a(bdl[], bmf, bdi)>
	//   91  171:putfield        #123 <Field bct i>
		i.a(((bcu) (this)));
	//   92  174:aload_0         
	//   93  175:getfield        #123 <Field bct i>
	//   94  178:aload_0         
	//   95  179:invokeinterface #128 <Method void bct.a(bcu)>
	//   96  184:return          
	}

	public static int b()
	{
		return a;
	//    0    0:getstatic       #114 <Field int a>
	//    1    3:ireturn         
	}

	private final bmm b(String s)
	{
		if(k && j.limit() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #132 <Field boolean k>
	//*   2    4:ifeq            45
	//*   3    7:aload_0         
	//*   4    8:getfield        #134 <Field ByteBuffer j>
	//*   5   11:invokevirtual   #139 <Method int ByteBuffer.limit()>
	//*   6   14:ifle            45
		{
			s = ((String) (new byte[j.limit()]));
	//    7   17:aload_0         
	//    8   18:getfield        #134 <Field ByteBuffer j>
	//    9   21:invokevirtual   #139 <Method int ByteBuffer.limit()>
	//   10   24:newarray        byte[]
	//   11   26:astore_1        
			j.get(((byte []) (s)));
	//   12   27:aload_0         
	//   13   28:getfield        #134 <Field ByteBuffer j>
	//   14   31:aload_1         
	//   15   32:invokevirtual   #143 <Method ByteBuffer ByteBuffer.get(byte[])>
	//   16   35:pop             
			return ((bmm) (new ady(((byte []) (s)))));
	//   17   36:new             #145 <Class ady>
	//   18   39:dup             
	//   19   40:aload_1         
	//   20   41:invokespecial   #148 <Method void ady(byte[])>
	//   21   44:areturn         
		}
		s = ((String) (new adz(this, s)));
	//   22   45:new             #150 <Class adz>
	//   23   48:dup             
	//   24   49:aload_0         
	//   25   50:aload_1         
	//   26   51:invokespecial   #153 <Method void adz(adx, String)>
	//   27   54:astore_1        
		if(h.i)
	//*  28   55:aload_0         
	//*  29   56:getfield        #45  <Field adc h>
	//*  30   59:getfield        #157 <Field boolean adc.i>
	//*  31   62:ifeq            78
			s = ((String) (new aea(this, ((bmm) (s)))));
	//   32   65:new             #159 <Class aea>
	//   33   68:dup             
	//   34   69:aload_0         
	//   35   70:aload_1         
	//   36   71:invokespecial   #162 <Method void aea(adx, bmm)>
	//   37   74:astore_1        
	//*  38   75:goto            78
		Object obj = ((Object) (s));
	//   39   78:aload_1         
	//   40   79:astore_2        
		if(j.limit() > 0)
	//*  41   80:aload_0         
	//*  42   81:getfield        #134 <Field ByteBuffer j>
	//*  43   84:invokevirtual   #139 <Method int ByteBuffer.limit()>
	//*  44   87:ifle            119
		{
			obj = ((Object) (new byte[j.limit()]));
	//   45   90:aload_0         
	//   46   91:getfield        #134 <Field ByteBuffer j>
	//   47   94:invokevirtual   #139 <Method int ByteBuffer.limit()>
	//   48   97:newarray        byte[]
	//   49   99:astore_2        
			j.get(((byte []) (obj)));
	//   50  100:aload_0         
	//   51  101:getfield        #134 <Field ByteBuffer j>
	//   52  104:aload_2         
	//   53  105:invokevirtual   #143 <Method ByteBuffer ByteBuffer.get(byte[])>
	//   54  108:pop             
			obj = ((Object) (new aeb(((bmm) (s)), ((byte []) (obj)))));
	//   55  109:new             #164 <Class aeb>
	//   56  112:dup             
	//   57  113:aload_1         
	//   58  114:aload_2         
	//   59  115:invokespecial   #167 <Method void aeb(bmm, byte[])>
	//   60  118:astore_2        
		}
		return ((bmm) (obj));
	//   61  119:aload_2         
	//   62  120:areturn         
	}

	public static int c()
	{
		return b;
	//    0    0:getstatic       #169 <Field int b>
	//    1    3:ireturn         
	}

	public final bct a()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field bct i>
	//    2    4:areturn         
	}

	final bml a(bmm bmm1)
	{
		return ((bml) (new adu(c, bmm1.a(), ((bne) (this)), ((adv) (new aed(this))))));
	//    0    0:new             #173 <Class adu>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field Context c>
	//    4    8:aload_1         
	//    5    9:invokeinterface #178 <Method bml bmm.a()>
	//    6   14:aload_0         
	//    7   15:new             #180 <Class aed>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #183 <Method void aed(adx)>
	//   11   23:invokespecial   #186 <Method void adu(Context, bml, bne, adv)>
	//   12   26:areturn         
	}

	final bml a(String s)
	{
		adx adx1;
		if(h.i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field adc h>
	//*   2    4:getfield        #157 <Field boolean adc.i>
	//*   3    7:ifeq            15
			adx1 = null;
	//    4   10:aconst_null     
	//    5   11:astore_2        
		else
	//*   6   12:goto            17
			adx1 = this;
	//    7   15:aload_0         
	//    8   16:astore_2        
		return ((bml) (new bms(s, ((bnq) (null)), ((bne) (adx1)), h.d, h.f, true, ((bmv) (null)))));
	//    9   17:new             #189 <Class bms>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:aconst_null     
	//   13   23:aload_2         
	//   14   24:aload_0         
	//   15   25:getfield        #45  <Field adc h>
	//   16   28:getfield        #191 <Field int adc.d>
	//   17   31:aload_0         
	//   18   32:getfield        #45  <Field adc h>
	//   19   35:getfield        #193 <Field int adc.f>
	//   20   38:iconst_1        
	//   21   39:aconst_null     
	//   22   40:invokespecial   #196 <Method void bms(String, bnq, bne, int, int, boolean, bmv)>
	//   23   43:areturn         
	}

	final void a(float f1, boolean flag)
	{
		bcw bcw1 = new bcw(((bcv) (f)), 2, ((Object) (Float.valueOf(f1))));
	//    0    0:new             #199 <Class bcw>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #74  <Field bdl f>
	//    4    8:iconst_2        
	//    5    9:fload_1         
	//    6   10:invokestatic    #204 <Method Float Float.valueOf(float)>
	//    7   13:invokespecial   #207 <Method void bcw(bcv, int, Object)>
	//    8   16:astore_3        
		if(flag)
	//*   9   17:iload_2         
	//*  10   18:ifeq            39
		{
			i.b(new bcw[] {
				bcw1
			});
	//   11   21:aload_0         
	//   12   22:getfield        #123 <Field bct i>
	//   13   25:iconst_1        
	//   14   26:anewarray       bcw[]
	//   15   29:dup             
	//   16   30:iconst_0        
	//   17   31:aload_3         
	//   18   32:aastore         
	//   19   33:invokeinterface #210 <Method void bct.b(bcw[])>
			return;
	//   20   38:return          
		} else
		{
			i.a(new bcw[] {
				bcw1
			});
	//   21   39:aload_0         
	//   22   40:getfield        #123 <Field bct i>
	//   23   43:iconst_1        
	//   24   44:anewarray       bcw[]
	//   25   47:dup             
	//   26   48:iconst_0        
	//   27   49:aload_3         
	//   28   50:aastore         
	//   29   51:invokeinterface #212 <Method void bct.a(bcw[])>
			return;
	//   30   56:return          
		}
	}

	public final void a(int i1, int j1, int k1, float f1)
	{
		aee aee1 = l;
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field aee l>
	//    2    4:astore          5
		if(aee1 != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          20
			aee1.a(i1, j1);
	//    5   11:aload           5
	//    6   13:iload_1         
	//    7   14:iload_2         
	//    8   15:invokeinterface #220 <Method void aee.a(int, int)>
	//    9   20:return          
	}

	public final void a(int i1, long l1)
	{
	//    0    0:return          
	}

	public final void a(Uri uri, String s)
	{
		a(uri, s, ByteBuffer.allocate(0), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #226 <Method ByteBuffer ByteBuffer.allocate(int)>
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #229 <Method void a(Uri, String, ByteBuffer, boolean)>
	//    7   11:return          
	}

	public final void a(Uri uri, String s, ByteBuffer bytebuffer, boolean flag)
	{
		j = bytebuffer;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #134 <Field ByteBuffer j>
		k = flag;
	//    3    5:aload_0         
	//    4    6:iload           4
	//    5    8:putfield        #132 <Field boolean k>
		if(h.j)
	//*   6   11:aload_0         
	//*   7   12:getfield        #45  <Field adc h>
	//*   8   15:getfield        #231 <Field boolean adc.j>
	//*   9   18:ifeq            52
		{
			s = ((String) (b(s)));
	//   10   21:aload_0         
	//   11   22:aload_2         
	//   12   23:invokespecial   #233 <Method bmm b(String)>
	//   13   26:astore_2        
			uri = ((Uri) (new bki(uri, ((bmm) (s)), ((bkf) (new bkv(((bmm) (s))))), xg.a, ((bie) (null)))));
	//   14   27:new             #235 <Class bki>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:aload_2         
	//   18   33:new             #237 <Class bkv>
	//   19   36:dup             
	//   20   37:aload_2         
	//   21   38:invokespecial   #240 <Method void bkv(bmm)>
	//   22   41:getstatic       #62  <Field android.os.Handler xg.a>
	//   23   44:aconst_null     
	//   24   45:invokespecial   #243 <Method void bki(Uri, bmm, bkf, android.os.Handler, bie)>
	//   25   48:astore_1        
		} else
	//*  26   49:goto            82
		{
			uri = ((Uri) (new bix(uri, b(s), aec.a, -1, xg.a, ((biy) (this)), ((String) (null)), h.g)));
	//   27   52:new             #245 <Class bix>
	//   28   55:dup             
	//   29   56:aload_1         
	//   30   57:aload_0         
	//   31   58:aload_2         
	//   32   59:invokespecial   #233 <Method bmm b(String)>
	//   33   62:getstatic       #250 <Field bfq aec.a>
	//   34   65:iconst_m1       
	//   35   66:getstatic       #62  <Field android.os.Handler xg.a>
	//   36   69:aload_0         
	//   37   70:aconst_null     
	//   38   71:aload_0         
	//   39   72:getfield        #45  <Field adc h>
	//   40   75:getfield        #252 <Field int adc.g>
	//   41   78:invokespecial   #255 <Method void bix(Uri, bmm, bfq, int, android.os.Handler, biy, String, int)>
	//   42   81:astore_1        
		}
		i.a(((bjb) (uri)));
	//   43   82:aload_0         
	//   44   83:getfield        #123 <Field bct i>
	//   45   86:aload_1         
	//   46   87:invokeinterface #258 <Method void bct.a(bjb)>
		b++;
	//   47   92:getstatic       #169 <Field int b>
	//   48   95:iconst_1        
	//   49   96:iadd            
	//   50   97:putstatic       #169 <Field int b>
	//   51  100:return          
	}

	public final void a(Surface surface)
	{
	//    0    0:return          
	}

	final void a(Surface surface, boolean flag)
	{
		surface = ((Surface) (new bcw(((bcv) (e)), 1, ((Object) (surface)))));
	//    0    0:new             #199 <Class bcw>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #67  <Field bdl e>
	//    4    8:iconst_1        
	//    5    9:aload_1         
	//    6   10:invokespecial   #207 <Method void bcw(bcv, int, Object)>
	//    7   13:astore_1        
		if(flag)
	//*   8   14:iload_2         
	//*   9   15:ifeq            36
		{
			i.b(new bcw[] {
				surface
			});
	//   10   18:aload_0         
	//   11   19:getfield        #123 <Field bct i>
	//   12   22:iconst_1        
	//   13   23:anewarray       bcw[]
	//   14   26:dup             
	//   15   27:iconst_0        
	//   16   28:aload_1         
	//   17   29:aastore         
	//   18   30:invokeinterface #210 <Method void bct.b(bcw[])>
			return;
	//   19   35:return          
		} else
		{
			i.a(new bcw[] {
				surface
			});
	//   20   36:aload_0         
	//   21   37:getfield        #123 <Field bct i>
	//   22   40:iconst_1        
	//   23   41:anewarray       bcw[]
	//   24   44:dup             
	//   25   45:iconst_0        
	//   26   46:aload_1         
	//   27   47:aastore         
	//   28   48:invokeinterface #212 <Method void bct.a(bcw[])>
			return;
	//   29   53:return          
		}
	}

	public final void a(aee aee1)
	{
		l = aee1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #215 <Field aee l>
	//    3    5:return          
	}

	public final void a(bcs bcs)
	{
		aee aee1 = l;
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field aee l>
	//    2    4:astore_2        
		if(aee1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          19
			aee1.a("onPlayerError", ((Exception) (bcs)));
	//    5    9:aload_2         
	//    6   10:ldc2            #264 <String "onPlayerError">
	//    7   13:aload_1         
	//    8   14:invokeinterface #267 <Method void aee.a(String, Exception)>
	//    9   19:return          
	}

	public final void a(bdk bdk)
	{
	//    0    0:return          
	}

	public final void a(bdp bdp, Object obj)
	{
	//    0    0:return          
	}

	public final void a(bfb bfb)
	{
	//    0    0:return          
	}

	public final void a(bjo bjo, bme bme)
	{
	//    0    0:return          
	}

	public final void a(zzfs zzfs)
	{
	//    0    0:return          
	}

	public final void a(IOException ioexception)
	{
		aee aee1 = l;
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field aee l>
	//    2    4:astore_2        
		if(aee1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          19
			aee1.a("onLoadError", ((Exception) (ioexception)));
	//    5    9:aload_2         
	//    6   10:ldc2            #275 <String "onLoadError">
	//    7   13:aload_1         
	//    8   14:invokeinterface #267 <Method void aee.a(String, Exception)>
	//    9   19:return          
	}

	public final volatile void a(Object obj)
	{
	//    0    0:return          
	}

	public final void a(Object obj, int i1)
	{
		m = m + i1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #279 <Field int m>
	//    3    5:iload_2         
	//    4    6:iadd            
	//    5    7:putfield        #279 <Field int m>
	//    6   10:return          
	}

	public final void a(Object obj, bmp bmp)
	{
		m = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #279 <Field int m>
	//    3    5:return          
	}

	public final void a(String s, long l1, long l2)
	{
	//    0    0:return          
	}

	public final void a(boolean flag)
	{
	//    0    0:return          
	}

	public final void a(boolean flag, int i1)
	{
		aee aee1 = l;
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field aee l>
	//    2    4:astore_3        
		if(aee1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          16
			aee1.b(i1);
	//    5    9:aload_3         
	//    6   10:iload_2         
	//    7   11:invokeinterface #285 <Method void aee.b(int)>
	//    8   16:return          
	}

	final void a(boolean flag, long l1)
	{
		aee aee1 = l;
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field aee l>
	//    2    4:astore          4
		if(aee1 != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          20
			aee1.a(flag, l1);
	//    5   11:aload           4
	//    6   13:iload_1         
	//    7   14:lload_2         
	//    8   15:invokeinterface #288 <Method void aee.a(boolean, long)>
	//    9   20:return          
	}

	public final void b(bfb bfb)
	{
	//    0    0:return          
	}

	final void b(boolean flag)
	{
		for(int i1 = 0; i1 < i.e(); i1++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #123 <Field bct i>
	//*   5    7:invokeinterface #290 <Method int bct.e()>
	//*   6   12:icmpge          33
			g.a(i1, flag ^ true);
	//    7   15:aload_0         
	//    8   16:getfield        #79  <Field blz g>
	//    9   19:iload_2         
	//   10   20:iload_1         
	//   11   21:iconst_1        
	//   12   22:ixor            
	//   13   23:invokevirtual   #295 <Method void blz.a(int, boolean)>

	//   14   26:iload_2         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:istore_2        
	//*  18   30:goto            2
	//   19   33:return          
	}

	public final adw d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field adw d>
	//    2    4:areturn         
	}

	public final void e()
	{
		bct bct1 = i;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field bct i>
	//    2    4:astore_1        
		if(bct1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          38
		{
			bct1.b(((bcu) (this)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #298 <Method void bct.b(bcu)>
			i.d();
	//    8   16:aload_0         
	//    9   17:getfield        #123 <Field bct i>
	//   10   20:invokeinterface #300 <Method void bct.d()>
			i = null;
	//   11   25:aload_0         
	//   12   26:aconst_null     
	//   13   27:putfield        #123 <Field bct i>
			b--;
	//   14   30:getstatic       #169 <Field int b>
	//   15   33:iconst_1        
	//   16   34:isub            
	//   17   35:putstatic       #169 <Field int b>
		}
	//   18   38:return          
	}

	public final long f()
	{
		return (long)m;
	//    0    0:aload_0         
	//    1    1:getfield        #279 <Field int m>
	//    2    4:i2l             
	//    3    5:lreturn         
	}

	public final void finalize()
	{
		a--;
	//    0    0:getstatic       #114 <Field int a>
	//    1    3:iconst_1        
	//    2    4:isub            
	//    3    5:putstatic       #114 <Field int a>
		if(wx.a())
	//*   4    8:invokestatic    #84  <Method boolean wx.a()>
	//*   5   11:ifeq            58
		{
			String s = String.valueOf(((Object) (this)));
	//    6   14:aload_0         
	//    7   15:invokestatic    #90  <Method String String.valueOf(Object)>
	//    8   18:astore_1        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 26);
	//    9   19:new             #92  <Class StringBuilder>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:invokestatic    #90  <Method String String.valueOf(Object)>
	//   13   27:invokevirtual   #96  <Method int String.length()>
	//   14   30:bipush          26
	//   15   32:iadd            
	//   16   33:invokespecial   #99  <Method void StringBuilder(int)>
	//   17   36:astore_2        
			stringbuilder.append("ExoPlayerAdapter finalize ");
	//   18   37:aload_2         
	//   19   38:ldc2            #304 <String "ExoPlayerAdapter finalize ">
	//   20   41:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
			stringbuilder.append(s);
	//   22   45:aload_2         
	//   23   46:aload_1         
	//   24   47:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
			wx.a(stringbuilder.toString());
	//   26   51:aload_2         
	//   27   52:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   28   55:invokestatic    #112 <Method void wx.a(String)>
		}
	//   29   58:return          
	}

	public final void g()
	{
	//    0    0:return          
	}

	private static int a;
	private static int b;
	private final Context c;
	private final adw d = new adw();
	private final bdl e;
	private final bdl f;
	private final blz g = new blw();
	private final adc h;
	private bct i;
	private ByteBuffer j;
	private boolean k;
	private aee l;
	private int m;
}
