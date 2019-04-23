// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox;

import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.a.c;
import android.support.v4.media.al;
import android.support.v4.media.aq;
import android.support.v4.media.be;
import android.support.v4.media.cf;
import biz.bookdesign.librivox.a.g;
import biz.bookdesign.librivox.audio.LocalAudioService;
import biz.bookdesign.librivox.support.j;
import com.crashlytics.android.a;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package biz.bookdesign.librivox:
//			co, cp

public class LibriVoxMediaBrowserService extends al
{

	public LibriVoxMediaBrowserService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void al()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class co>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #22  <Method void co(LibriVoxMediaBrowserService)>
	//    7   13:putfield        #24  <Field ServiceConnection h>
	//    8   16:return          
	}

	static LocalAudioService a(LibriVoxMediaBrowserService librivoxmediabrowserservice)
	{
		return librivoxmediabrowserservice.g;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field LocalAudioService g>
	//    2    4:areturn         
	}

	static LocalAudioService a(LibriVoxMediaBrowserService librivoxmediabrowserservice, LocalAudioService localaudioservice)
	{
		librivoxmediabrowserservice.g = localaudioservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field LocalAudioService g>
		return localaudioservice;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private void c(String s, be be1)
	{
		(new cp(this, s, be1)).execute(((Object []) (new Void[0])));
	//    0    0:new             #34  <Class cp>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #37  <Method void cp(LibriVoxMediaBrowserService, String, be)>
	//    6   10:iconst_0        
	//    7   11:anewarray       Void[]
	//    8   14:invokevirtual   #43  <Method android.os.AsyncTask cp.execute(Object[])>
	//    9   17:pop             
	//   10   18:return          
	}

	public aq a(String s, int i, Bundle bundle)
	{
		if(!f.a(((android.content.Context) (this)), s, i))
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field j f>
	//*   2    4:aload_0         
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #51  <Method boolean j.a(android.content.Context, String, int)>
	//*   6   10:ifne            46
		{
			bundle = ((Bundle) (new StringBuilder()));
	//    7   13:new             #53  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #54  <Method void StringBuilder()>
	//   10   20:astore_3        
			((StringBuilder) (bundle)).append("OnGetRoot: IGNORING request from untrusted package ");
	//   11   21:aload_3         
	//   12   22:ldc1            #56  <String "OnGetRoot: IGNORING request from untrusted package ">
	//   13   24:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
			((StringBuilder) (bundle)).append(s);
	//   15   28:aload_3         
	//   16   29:aload_1         
	//   17   30:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
			com.crashlytics.android.a.a(5, "LibriVoxMBS", ((StringBuilder) (bundle)).toString());
	//   19   34:iconst_5        
	//   20   35:ldc1            #62  <String "LibriVoxMBS">
	//   21   37:aload_3         
	//   22   38:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   23   41:invokestatic    #71  <Method void a.a(int, String, String)>
			return null;
	//   24   44:aconst_null     
	//   25   45:areturn         
		} else
		{
			return new aq("__ROOT__", ((Bundle) (null)));
	//   26   46:new             #73  <Class aq>
	//   27   49:dup             
	//   28   50:ldc1            #75  <String "__ROOT__">
	//   29   52:aconst_null     
	//   30   53:invokespecial   #78  <Method void aq(String, Bundle)>
	//   31   56:areturn         
		}
	}

	public void a(String s, be be1)
	{
		ArrayList arraylist;
		if(!"__ROOT__".equals(((Object) (s))))
	//*   0    0:ldc1            #75  <String "__ROOT__">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #84  <Method boolean String.equals(Object)>
	//*   3    6:ifne            20
		{
			be1.a();
	//    4    9:aload_2         
	//    5   10:invokevirtual   #88  <Method void be.a()>
			c(s, be1);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:aload_2         
	//    9   16:invokespecial   #90  <Method void c(String, be)>
			return;
	//   10   19:return          
		}
		s = ((String) (new biz.bookdesign.librivox.b.j(((android.content.Context) (this)))));
	//   11   20:new             #92  <Class biz.bookdesign.librivox.b.j>
	//   12   23:dup             
	//   13   24:aload_0         
	//   14   25:invokespecial   #95  <Method void biz.bookdesign.librivox.b.j(android.content.Context)>
	//   15   28:astore_1        
		((biz.bookdesign.librivox.b.j) (s)).a();
	//   16   29:aload_1         
	//   17   30:invokevirtual   #98  <Method biz.bookdesign.librivox.b.j biz.bookdesign.librivox.b.j.a()>
	//   18   33:pop             
		arraylist = new ArrayList();
	//   19   34:new             #100 <Class ArrayList>
	//   20   37:dup             
	//   21   38:invokespecial   #101 <Method void ArrayList()>
	//   22   41:astore_3        
		if(((biz.bookdesign.librivox.b.j) (s)).h(1) > 0)
	//*  23   42:aload_1         
	//*  24   43:iconst_1        
	//*  25   44:invokevirtual   #104 <Method int biz.bookdesign.librivox.b.j.h(int)>
	//*  26   47:ifle            112
		{
			android.graphics.drawable.Drawable drawable = android.support.v4.a.c.a(((android.content.Context) (this)), g.ic_star_gray_48dp);
	//   27   50:aload_0         
	//   28   51:getstatic       #110 <Field int g.ic_star_gray_48dp>
	//   29   54:invokestatic    #115 <Method android.graphics.drawable.Drawable c.a(android.content.Context, int)>
	//   30   57:astore          4
			((List) (arraylist)).add(((Object) (new android.support.v4.media.MediaBrowserCompat.MediaItem((new cf()).a("__FAVORITES__").a(((CharSequence) (getResources().getStringArray(biz.bookdesign.librivox.a.c.view_types)[0]))).a(biz.bookdesign.librivox.support.a.a(drawable)).a(), 1))));
	//   31   59:aload_3         
	//   32   60:new             #117 <Class android.support.v4.media.MediaBrowserCompat$MediaItem>
	//   33   63:dup             
	//   34   64:new             #119 <Class cf>
	//   35   67:dup             
	//   36   68:invokespecial   #120 <Method void cf()>
	//   37   71:ldc1            #122 <String "__FAVORITES__">
	//   38   73:invokevirtual   #125 <Method cf cf.a(String)>
	//   39   76:aload_0         
	//   40   77:invokevirtual   #129 <Method Resources getResources()>
	//   41   80:getstatic       #134 <Field int biz.bookdesign.librivox.a.c.view_types>
	//   42   83:invokevirtual   #140 <Method String[] Resources.getStringArray(int)>
	//   43   86:iconst_0        
	//   44   87:aaload          
	//   45   88:invokevirtual   #143 <Method cf cf.a(CharSequence)>
	//   46   91:aload           4
	//   47   93:invokestatic    #148 <Method android.graphics.Bitmap biz.bookdesign.librivox.support.a.a(android.graphics.drawable.Drawable)>
	//   48   96:invokevirtual   #151 <Method cf cf.a(android.graphics.Bitmap)>
	//   49   99:invokevirtual   #154 <Method android.support.v4.media.MediaDescriptionCompat cf.a()>
	//   50  102:iconst_1        
	//   51  103:invokespecial   #157 <Method void android.support.v4.media.MediaBrowserCompat$MediaItem(android.support.v4.media.MediaDescriptionCompat, int)>
	//   52  106:invokeinterface #162 <Method boolean List.add(Object)>
	//   53  111:pop             
		}
		if(((biz.bookdesign.librivox.b.j) (s)).h(2) > 0)
	//*  54  112:aload_1         
	//*  55  113:iconst_2        
	//*  56  114:invokevirtual   #104 <Method int biz.bookdesign.librivox.b.j.h(int)>
	//*  57  117:ifle            182
		{
			android.graphics.drawable.Drawable drawable1 = android.support.v4.a.c.a(((android.content.Context) (this)), g.ic_history_gray_48dp);
	//   58  120:aload_0         
	//   59  121:getstatic       #165 <Field int g.ic_history_gray_48dp>
	//   60  124:invokestatic    #115 <Method android.graphics.drawable.Drawable c.a(android.content.Context, int)>
	//   61  127:astore          4
			((List) (arraylist)).add(((Object) (new android.support.v4.media.MediaBrowserCompat.MediaItem((new cf()).a("__RECENT__").a(((CharSequence) (getResources().getStringArray(biz.bookdesign.librivox.a.c.view_types)[1]))).a(biz.bookdesign.librivox.support.a.a(drawable1)).a(), 1))));
	//   62  129:aload_3         
	//   63  130:new             #117 <Class android.support.v4.media.MediaBrowserCompat$MediaItem>
	//   64  133:dup             
	//   65  134:new             #119 <Class cf>
	//   66  137:dup             
	//   67  138:invokespecial   #120 <Method void cf()>
	//   68  141:ldc1            #167 <String "__RECENT__">
	//   69  143:invokevirtual   #125 <Method cf cf.a(String)>
	//   70  146:aload_0         
	//   71  147:invokevirtual   #129 <Method Resources getResources()>
	//   72  150:getstatic       #134 <Field int biz.bookdesign.librivox.a.c.view_types>
	//   73  153:invokevirtual   #140 <Method String[] Resources.getStringArray(int)>
	//   74  156:iconst_1        
	//   75  157:aaload          
	//   76  158:invokevirtual   #143 <Method cf cf.a(CharSequence)>
	//   77  161:aload           4
	//   78  163:invokestatic    #148 <Method android.graphics.Bitmap biz.bookdesign.librivox.support.a.a(android.graphics.drawable.Drawable)>
	//   79  166:invokevirtual   #151 <Method cf cf.a(android.graphics.Bitmap)>
	//   80  169:invokevirtual   #154 <Method android.support.v4.media.MediaDescriptionCompat cf.a()>
	//   81  172:iconst_1        
	//   82  173:invokespecial   #157 <Method void android.support.v4.media.MediaBrowserCompat$MediaItem(android.support.v4.media.MediaDescriptionCompat, int)>
	//   83  176:invokeinterface #162 <Method boolean List.add(Object)>
	//   84  181:pop             
		}
		android.graphics.drawable.Drawable drawable2 = android.support.v4.a.c.a(((android.content.Context) (this)), g.ic_new_releases_gray_48dp);
	//   85  182:aload_0         
	//   86  183:getstatic       #170 <Field int g.ic_new_releases_gray_48dp>
	//   87  186:invokestatic    #115 <Method android.graphics.drawable.Drawable c.a(android.content.Context, int)>
	//   88  189:astore          4
		((List) (arraylist)).add(((Object) (new android.support.v4.media.MediaBrowserCompat.MediaItem((new cf()).a("__TOP__").a(((CharSequence) (getResources().getStringArray(biz.bookdesign.librivox.a.c.view_types)[2]))).a(biz.bookdesign.librivox.support.a.a(drawable2)).a(), 1))));
	//   89  191:aload_3         
	//   90  192:new             #117 <Class android.support.v4.media.MediaBrowserCompat$MediaItem>
	//   91  195:dup             
	//   92  196:new             #119 <Class cf>
	//   93  199:dup             
	//   94  200:invokespecial   #120 <Method void cf()>
	//   95  203:ldc1            #172 <String "__TOP__">
	//   96  205:invokevirtual   #125 <Method cf cf.a(String)>
	//   97  208:aload_0         
	//   98  209:invokevirtual   #129 <Method Resources getResources()>
	//   99  212:getstatic       #134 <Field int biz.bookdesign.librivox.a.c.view_types>
	//  100  215:invokevirtual   #140 <Method String[] Resources.getStringArray(int)>
	//  101  218:iconst_2        
	//  102  219:aaload          
	//  103  220:invokevirtual   #143 <Method cf cf.a(CharSequence)>
	//  104  223:aload           4
	//  105  225:invokestatic    #148 <Method android.graphics.Bitmap biz.bookdesign.librivox.support.a.a(android.graphics.drawable.Drawable)>
	//  106  228:invokevirtual   #151 <Method cf cf.a(android.graphics.Bitmap)>
	//  107  231:invokevirtual   #154 <Method android.support.v4.media.MediaDescriptionCompat cf.a()>
	//  108  234:iconst_1        
	//  109  235:invokespecial   #157 <Method void android.support.v4.media.MediaBrowserCompat$MediaItem(android.support.v4.media.MediaDescriptionCompat, int)>
	//  110  238:invokeinterface #162 <Method boolean List.add(Object)>
	//  111  243:pop             
		((biz.bookdesign.librivox.b.j) (s)).b();
	//  112  244:aload_1         
	//  113  245:invokevirtual   #175 <Method void biz.bookdesign.librivox.b.j.b()>
		be1.b(((Object) (arraylist)));
	//  114  248:aload_2         
	//  115  249:aload_3         
	//  116  250:invokevirtual   #178 <Method void be.b(Object)>
		return;
	//  117  253:return          
		be1;
	//  118  254:astore_2        
		((biz.bookdesign.librivox.b.j) (s)).b();
	//  119  255:aload_1         
	//  120  256:invokevirtual   #175 <Method void biz.bookdesign.librivox.b.j.b()>
		throw be1;
	//  121  259:aload_2         
	//  122  260:athrow          
	}

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #181 <Method void al.onCreate()>
		f = new j(((android.content.Context) (this)));
	//    2    4:aload_0         
	//    3    5:new             #48  <Class j>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #182 <Method void j(android.content.Context)>
	//    7   13:putfield        #46  <Field j f>
		bindService(new Intent(((android.content.Context) (this)), biz/bookdesign/librivox/audio/LocalAudioService), h, 1);
	//    8   16:aload_0         
	//    9   17:new             #184 <Class Intent>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:ldc1            #186 <Class LocalAudioService>
	//   13   24:invokespecial   #189 <Method void Intent(android.content.Context, Class)>
	//   14   27:aload_0         
	//   15   28:getfield        #24  <Field ServiceConnection h>
	//   16   31:iconst_1        
	//   17   32:invokevirtual   #193 <Method boolean bindService(Intent, ServiceConnection, int)>
	//   18   35:pop             
	//   19   36:return          
	}

	public void onDestroy()
	{
		if(g != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field LocalAudioService g>
	//*   2    4:ifnull          15
			unbindService(h);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field ServiceConnection h>
	//    6   12:invokevirtual   #198 <Method void unbindService(ServiceConnection)>
	//    7   15:return          
	}

	private j f;
	private LocalAudioService g;
	private final ServiceConnection h = new co(this);
}
