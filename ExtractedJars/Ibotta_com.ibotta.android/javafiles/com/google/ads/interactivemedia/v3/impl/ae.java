// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import android.content.Context;
import android.util.Log;
import com.google.ads.interactivemedia.v3.api.*;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.impl.data.b;
import com.google.ads.interactivemedia.v3.impl.data.l;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			al, x, g, ad, 
//			k, e, c, i, 
//			ag, ab

public class ae
	implements al
{

	public ae(String s, ad ad1, ab ab, i j, AdDisplayContainer addisplaycontainer, Context context)
		throws AdError
	{
		this(s, ad1, ab, j, addisplaycontainer, ((g) (null)), ((k) (null)), context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aconst_null     
	//    7    9:aconst_null     
	//    8   10:aload           6
	//    9   12:invokespecial   #27  <Method void ae(String, ad, ab, i, AdDisplayContainer, g, k, Context)>
	//   10   15:return          
	}

	public ae(String s, ad ad1, ab ab, i j, AdDisplayContainer addisplaycontainer, g g1, k k1, 
			Context context)
		throws AdError
	{
label0:
		{
			super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
			if(addisplaycontainer.getPlayer() != null)
	//*   2    4:aload           5
	//*   3    6:invokeinterface #38  <Method VideoAdPlayer AdDisplayContainer.getPlayer()>
	//*   4   11:ifnull          33
			{
				a = addisplaycontainer.getPlayer();
	//    5   14:aload_0         
	//    6   15:aload           5
	//    7   17:invokeinterface #38  <Method VideoAdPlayer AdDisplayContainer.getPlayer()>
	//    8   22:putfield        #40  <Field VideoAdPlayer a>
				f = true;
	//    9   25:aload_0         
	//   10   26:iconst_1        
	//   11   27:putfield        #42  <Field boolean f>
			} else
	//*  12   30:goto            66
			{
				if(android.os.Build.VERSION.SDK_INT < 16)
					break label0;
	//   13   33:getstatic       #48  <Field int android.os.Build$VERSION.SDK_INT>
	//   14   36:bipush          16
	//   15   38:icmplt          155
				a = ((VideoAdPlayer) (new x(context, addisplaycontainer.getAdContainer())));
	//   16   41:aload_0         
	//   17   42:new             #50  <Class x>
	//   18   45:dup             
	//   19   46:aload           8
	//   20   48:aload           5
	//   21   50:invokeinterface #54  <Method android.view.ViewGroup AdDisplayContainer.getAdContainer()>
	//   22   55:invokespecial   #57  <Method void x(Context, android.view.ViewGroup)>
	//   23   58:putfield        #40  <Field VideoAdPlayer a>
				f = false;
	//   24   61:aload_0         
	//   25   62:iconst_0        
	//   26   63:putfield        #42  <Field boolean f>
			}
			if(g1 != null)
	//*  27   66:aload           6
	//*  28   68:ifnull          80
				b = g1;
	//   29   71:aload_0         
	//   30   72:aload           6
	//   31   74:putfield        #59  <Field g b>
			else
	//*  32   77:goto            99
				b = new g(((com.google.ads.interactivemedia.v3.api.player.AdProgressProvider) (a)), ad1.a());
	//   33   80:aload_0         
	//   34   81:new             #61  <Class g>
	//   35   84:dup             
	//   36   85:aload_0         
	//   37   86:getfield        #40  <Field VideoAdPlayer a>
	//   38   89:aload_2         
	//   39   90:invokevirtual   #66  <Method long ad.a()>
	//   40   93:invokespecial   #69  <Method void g(com.google.ads.interactivemedia.v3.api.player.AdProgressProvider, long)>
	//   41   96:putfield        #59  <Field g b>
			c = j;
	//   42   99:aload_0         
	//   43  100:aload           4
	//   44  102:putfield        #71  <Field i c>
			if(k1 != null)
	//*  45  105:aload           7
	//*  46  107:ifnull          119
				d = k1;
	//   47  110:aload_0         
	//   48  111:aload           7
	//   49  113:putfield        #73  <Field k d>
			else
	//*  50  116:goto            137
				d = new k(s, ad1, ab, ((com.google.ads.interactivemedia.v3.api.BaseDisplayContainer) (addisplaycontainer)), context);
	//   51  119:aload_0         
	//   52  120:new             #75  <Class k>
	//   53  123:dup             
	//   54  124:aload_1         
	//   55  125:aload_2         
	//   56  126:aload_3         
	//   57  127:aload           5
	//   58  129:aload           8
	//   59  131:invokespecial   #78  <Method void k(String, ad, ab, com.google.ads.interactivemedia.v3.api.BaseDisplayContainer, Context)>
	//   60  134:putfield        #73  <Field k d>
			e = new e(ab, s, b);
	//   61  137:aload_0         
	//   62  138:new             #80  <Class e>
	//   63  141:dup             
	//   64  142:aload_3         
	//   65  143:aload_1         
	//   66  144:aload_0         
	//   67  145:getfield        #59  <Field g b>
	//   68  148:invokespecial   #83  <Method void e(ab, String, g)>
	//   69  151:putfield        #85  <Field e e>
			return;
	//   70  154:return          
		}
		throw new AdError(com.google.ads.interactivemedia.v3.api.AdError.AdErrorType.LOAD, com.google.ads.interactivemedia.v3.api.AdError.AdErrorCode.INVALID_ARGUMENTS, "Ad Player was not provided. SDK-owned ad playback requires API 16+");
	//   71  155:new             #24  <Class AdError>
	//   72  158:dup             
	//   73  159:getstatic       #91  <Field com.google.ads.interactivemedia.v3.api.AdError$AdErrorType com.google.ads.interactivemedia.v3.api.AdError$AdErrorType.LOAD>
	//   74  162:getstatic       #97  <Field com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode.INVALID_ARGUMENTS>
	//   75  165:ldc1            #99  <String "Ad Player was not provided. SDK-owned ad playback requires API 16+">
	//   76  167:invokespecial   #102 <Method void AdError(com.google.ads.interactivemedia.v3.api.AdError$AdErrorType, com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode, String)>
	//   77  170:athrow          
	}

	public void a()
	{
		b.a(((af.b) (d)));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field g b>
	//    2    4:aload_0         
	//    3    5:getfield        #73  <Field k d>
	//    4    8:invokevirtual   #105 <Method void g.a(af$b)>
		b.a(((af.b) (e)));
	//    5   11:aload_0         
	//    6   12:getfield        #59  <Field g b>
	//    7   15:aload_0         
	//    8   16:getfield        #85  <Field e e>
	//    9   19:invokevirtual   #105 <Method void g.a(af$b)>
	//   10   22:return          
	}

	public void a(b b1)
	{
		d.a(b1);
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field k d>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #108 <Method void k.a(b)>
	//    4    8:return          
	}

	public boolean a(aa.c c1, l l1)
	{
		static class _cls1
		{

			static final int a[];

			static 
			{
				a = new int[aa.c.values().length];
			//    0    0:invokestatic    #18  <Method aa$c[] aa$c.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] a>
				try
				{
					a[aa.c.play.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] a>
			//    5   12:getstatic       #24  <Field aa$c aa$c.play>
			//    6   15:invokevirtual   #28  <Method int aa$c.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] a>
			//*  10   23:getstatic       #31  <Field aa$c aa$c.pause>
			//*  11   26:invokevirtual   #28  <Method int aa$c.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] a>
			//*  15   34:getstatic       #34  <Field aa$c aa$c.resume>
			//*  16   37:invokevirtual   #28  <Method int aa$c.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] a>
			//*  20   45:getstatic       #37  <Field aa$c aa$c.load>
			//*  21   48:invokevirtual   #28  <Method int aa$c.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] a>
			//*  25   56:getstatic       #40  <Field aa$c aa$c.startTracking>
			//*  26   59:invokevirtual   #28  <Method int aa$c.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:getstatic       #20  <Field int[] a>
			//*  30   67:getstatic       #43  <Field aa$c aa$c.stopTracking>
			//*  31   70:invokevirtual   #28  <Method int aa$c.ordinal()>
			//*  32   73:bipush          6
			//*  33   75:iastore         
			//*  34   76:getstatic       #20  <Field int[] a>
			//*  35   79:getstatic       #46  <Field aa$c aa$c.showVideo>
			//*  36   82:invokevirtual   #28  <Method int aa$c.ordinal()>
			//*  37   85:bipush          7
			//*  38   87:iastore         
			//*  39   88:getstatic       #20  <Field int[] a>
			//*  40   91:getstatic       #49  <Field aa$c aa$c.hide>
			//*  41   94:invokevirtual   #28  <Method int aa$c.ordinal()>
			//*  42   97:bipush          8
			//*  43   99:iastore         
			//*  44  100:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   45  101:astore_0        
				try
				{
					a[aa.c.pause.ordinal()] = 2;
				}
			//*  46  102:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   47  105:astore_0        
				try
				{
					a[aa.c.resume.ordinal()] = 3;
				}
			//*  48  106:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   49  109:astore_0        
				try
				{
					a[aa.c.load.ordinal()] = 4;
				}
			//*  50  110:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   51  113:astore_0        
				try
				{
					a[aa.c.startTracking.ordinal()] = 5;
				}
			//*  52  114:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   53  117:astore_0        
				try
				{
					a[aa.c.stopTracking.ordinal()] = 6;
				}
			//*  54  118:goto            64
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   55  121:astore_0        
				try
				{
					a[aa.c.showVideo.ordinal()] = 7;
				}
			//*  56  122:goto            76
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   57  125:astore_0        
				try
				{
					a[aa.c.hide.ordinal()] = 8;
				}
			//*  58  126:goto            88
				catch(NoSuchFieldError nosuchfielderror7) { }
			//   59  129:astore_0        
			//*  60  130:return          
			}
		}

		switch(_cls1.a[c1.ordinal()])
	//*   0    0:getstatic       #112 <Field int[] ae$1.a>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #118 <Method int aa$c.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 6: default 48
	//	               1 153
	//	               2 141
	//	               3 129
	//	               4 70
	//	               5 60
	//	               6 50
		default:
			return false;
	//    5   48:iconst_0        
	//    6   49:ireturn         

		case 6: // '\006'
			b.c();
	//    7   50:aload_0         
	//    8   51:getfield        #59  <Field g b>
	//    9   54:invokevirtual   #120 <Method void g.c()>
			break;
	//   10   57:goto            162

		case 5: // '\005'
			b.b();
	//   11   60:aload_0         
	//   12   61:getfield        #59  <Field g b>
	//   13   64:invokevirtual   #122 <Method void com.google.ads.interactivemedia.v3.impl.g.b()>
			break;
	//   14   67:goto            162

		case 4: // '\004'
			if(l1 != null && l1.videoUrl != null)
	//*  15   70:aload_2         
	//*  16   71:ifnull          97
	//*  17   74:aload_2         
	//*  18   75:getfield        #128 <Field String l.videoUrl>
	//*  19   78:ifnull          97
				a.loadAd(l1.videoUrl);
	//   20   81:aload_0         
	//   21   82:getfield        #40  <Field VideoAdPlayer a>
	//   22   85:aload_2         
	//   23   86:getfield        #128 <Field String l.videoUrl>
	//   24   89:invokeinterface #134 <Method void VideoAdPlayer.loadAd(String)>
			else
	//*  25   94:goto            162
				c.a(((AdErrorEvent) (new c(new AdError(com.google.ads.interactivemedia.v3.api.AdError.AdErrorType.LOAD, com.google.ads.interactivemedia.v3.api.AdError.AdErrorCode.INTERNAL_ERROR, "Load message must contain video url.")))));
	//   26   97:aload_0         
	//   27   98:getfield        #71  <Field i c>
	//   28  101:new             #136 <Class c>
	//   29  104:dup             
	//   30  105:new             #24  <Class AdError>
	//   31  108:dup             
	//   32  109:getstatic       #91  <Field com.google.ads.interactivemedia.v3.api.AdError$AdErrorType com.google.ads.interactivemedia.v3.api.AdError$AdErrorType.LOAD>
	//   33  112:getstatic       #139 <Field com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode.INTERNAL_ERROR>
	//   34  115:ldc1            #141 <String "Load message must contain video url.">
	//   35  117:invokespecial   #102 <Method void AdError(com.google.ads.interactivemedia.v3.api.AdError$AdErrorType, com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode, String)>
	//   36  120:invokespecial   #144 <Method void c(AdError)>
	//   37  123:invokevirtual   #149 <Method void i.a(AdErrorEvent)>
			break;

	//*  38  126:goto            162
		case 3: // '\003'
			a.resumeAd();
	//   39  129:aload_0         
	//   40  130:getfield        #40  <Field VideoAdPlayer a>
	//   41  133:invokeinterface #152 <Method void VideoAdPlayer.resumeAd()>
			break;

	//*  42  138:goto            162
		case 2: // '\002'
			a.pauseAd();
	//   43  141:aload_0         
	//   44  142:getfield        #40  <Field VideoAdPlayer a>
	//   45  145:invokeinterface #155 <Method void VideoAdPlayer.pauseAd()>
			break;

	//*  46  150:goto            162
		case 1: // '\001'
			a.playAd();
	//   47  153:aload_0         
	//   48  154:getfield        #40  <Field VideoAdPlayer a>
	//   49  157:invokeinterface #158 <Method void VideoAdPlayer.playAd()>
			break;
		}
		return true;
	//   50  162:iconst_1        
	//   51  163:ireturn         
	}

	public void b()
	{
		a.stopAd();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field VideoAdPlayer a>
	//    2    4:invokeinterface #161 <Method void VideoAdPlayer.stopAd()>
		d.a();
	//    3    9:aload_0         
	//    4   10:getfield        #73  <Field k d>
	//    5   13:invokevirtual   #163 <Method void k.a()>
	//    6   16:return          
	}

	public boolean b(aa.c c1, l l1)
	{
		switch(_cls1.a[c1.ordinal()])
	//*   0    0:getstatic       #112 <Field int[] ae$1.a>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #118 <Method int aa$c.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     7 8: default 32
	//	               7 69
	//	               8 34
		default:
			return false;
	//    5   32:iconst_0        
	//    6   33:ireturn         

		case 8: // '\b'
			if(!f)
	//*   7   34:aload_0         
	//*   8   35:getfield        #42  <Field boolean f>
	//*   9   38:ifne            53
				((ag)a).b();
	//   10   41:aload_0         
	//   11   42:getfield        #40  <Field VideoAdPlayer a>
	//   12   45:checkcast       #165 <Class ag>
	//   13   48:invokeinterface #166 <Method void com.google.ads.interactivemedia.v3.impl.ag.b()>
			a.removeCallback(((com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback) (e)));
	//   14   53:aload_0         
	//   15   54:getfield        #40  <Field VideoAdPlayer a>
	//   16   57:aload_0         
	//   17   58:getfield        #85  <Field e e>
	//   18   61:invokeinterface #170 <Method void VideoAdPlayer.removeCallback(com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer$VideoAdPlayerCallback)>
			break;
	//   19   66:goto            101

		case 7: // '\007'
			if(!f)
	//*  20   69:aload_0         
	//*  21   70:getfield        #42  <Field boolean f>
	//*  22   73:ifne            88
				((ag)a).a();
	//   23   76:aload_0         
	//   24   77:getfield        #40  <Field VideoAdPlayer a>
	//   25   80:checkcast       #165 <Class ag>
	//   26   83:invokeinterface #171 <Method void ag.a()>
			a.addCallback(((com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback) (e)));
	//   27   88:aload_0         
	//   28   89:getfield        #40  <Field VideoAdPlayer a>
	//   29   92:aload_0         
	//   30   93:getfield        #85  <Field e e>
	//   31   96:invokeinterface #174 <Method void VideoAdPlayer.addCallback(com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer$VideoAdPlayerCallback)>
			break;
		}
		return true;
	//   32  101:iconst_1        
	//   33  102:ireturn         
	}

	public void c()
	{
	//    0    0:return          
	}

	public void d()
	{
	//    0    0:return          
	}

	public void e()
	{
		Log.d("SDK_DEBUG", "Destroying NativeVideoDisplay");
	//    0    0:ldc1            #176 <String "SDK_DEBUG">
	//    1    2:ldc1            #178 <String "Destroying NativeVideoDisplay">
	//    2    4:invokestatic    #183 <Method int Log.d(String, String)>
	//    3    7:pop             
		b.c();
	//    4    8:aload_0         
	//    5    9:getfield        #59  <Field g b>
	//    6   12:invokevirtual   #120 <Method void g.c()>
		b.b(((af.b) (d)));
	//    7   15:aload_0         
	//    8   16:getfield        #59  <Field g b>
	//    9   19:aload_0         
	//   10   20:getfield        #73  <Field k d>
	//   11   23:invokevirtual   #185 <Method void com.google.ads.interactivemedia.v3.impl.g.b(af$b)>
		b.b(((af.b) (e)));
	//   12   26:aload_0         
	//   13   27:getfield        #59  <Field g b>
	//   14   30:aload_0         
	//   15   31:getfield        #85  <Field e e>
	//   16   34:invokevirtual   #185 <Method void com.google.ads.interactivemedia.v3.impl.g.b(af$b)>
		d.a();
	//   17   37:aload_0         
	//   18   38:getfield        #73  <Field k d>
	//   19   41:invokevirtual   #163 <Method void k.a()>
		a.removeCallback(((com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback) (e)));
	//   20   44:aload_0         
	//   21   45:getfield        #40  <Field VideoAdPlayer a>
	//   22   48:aload_0         
	//   23   49:getfield        #85  <Field e e>
	//   24   52:invokeinterface #170 <Method void VideoAdPlayer.removeCallback(com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer$VideoAdPlayerCallback)>
		VideoAdPlayer videoadplayer = a;
	//   25   57:aload_0         
	//   26   58:getfield        #40  <Field VideoAdPlayer a>
	//   27   61:astore_1        
		if(videoadplayer instanceof ag)
	//*  28   62:aload_1         
	//*  29   63:instanceof      #165 <Class ag>
	//*  30   66:ifeq            78
			((ag)videoadplayer).c();
	//   31   69:aload_1         
	//   32   70:checkcast       #165 <Class ag>
	//   33   73:invokeinterface #186 <Method void ag.c()>
	//   34   78:return          
	}

	public boolean f()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field boolean f>
	//    2    4:ireturn         
	}

	public VideoProgressUpdate getAdProgress()
	{
		return a.getAdProgress();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field VideoAdPlayer a>
	//    2    4:invokeinterface #191 <Method VideoProgressUpdate VideoAdPlayer.getAdProgress()>
	//    3    9:areturn         
	}

	public void onAdError(AdErrorEvent aderrorevent)
	{
		d.a();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field k d>
	//    2    4:invokevirtual   #163 <Method void k.a()>
	//    3    7:return          
	}

	private final VideoAdPlayer a;
	private final g b;
	private final i c;
	private final k d;
	private final e e;
	private boolean f;
}
