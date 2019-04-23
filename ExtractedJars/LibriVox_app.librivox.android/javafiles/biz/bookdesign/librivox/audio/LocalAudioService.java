// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox.audio;

import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.support.v4.a.c;
import android.support.v4.a.g;
import android.support.v4.app.cl;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.bn;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.widget.Toast;
import biz.bookdesign.librivox.ListenActivity;
import biz.bookdesign.librivox.RemoteControlReceiver;
import biz.bookdesign.librivox.ReviewComposeActivity;
import biz.bookdesign.librivox.a.e;
import biz.bookdesign.librivox.a.k;
import biz.bookdesign.librivox.b.i;
import biz.bookdesign.librivox.b.j;
import biz.bookdesign.librivox.b.m;
import biz.bookdesign.librivox.b.q;
import biz.bookdesign.librivox.bw;
import biz.bookdesign.librivox.bx;
import biz.bookdesign.librivox.client.o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.squareup.a.a;
import com.squareup.a.b;
import com.squareup.picasso.al;
import com.squareup.picasso.bb;
import com.squareup.picasso.bj;
import java.util.Locale;

// Referenced classes of package biz.bookdesign.librivox.audio:
//			b, i, c, d, 
//			e, g, h, t, 
//			a, f, q, j, 
//			o

public class LocalAudioService extends Service
	implements biz.bookdesign.librivox.audio.b, b
{

	public LocalAudioService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Service()>
	//    2    4:aload_0         
	//    3    5:new             #50  <Class biz.bookdesign.librivox.audio.i>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #53  <Method void biz.bookdesign.librivox.audio.i(LocalAudioService)>
	//    7   13:putfield        #55  <Field IBinder c>
		k = new Handler();
	//    8   16:aload_0         
	//    9   17:new             #57  <Class Handler>
	//   10   20:dup             
	//   11   21:invokespecial   #58  <Method void Handler()>
	//   12   24:putfield        #60  <Field Handler k>
		a = null;
	//   13   27:aload_0         
	//   14   28:aconst_null     
	//   15   29:putfield        #62  <Field biz.bookdesign.librivox.b.a a>
		b = null;
	//   16   32:aload_0         
	//   17   33:aconst_null     
	//   18   34:putfield        #64  <Field m b>
		l = false;
	//   19   37:aload_0         
	//   20   38:iconst_0        
	//   21   39:putfield        #66  <Field boolean l>
		n = false;
	//   22   42:aload_0         
	//   23   43:iconst_0        
	//   24   44:putfield        #68  <Field boolean n>
		o = 1.0F;
	//   25   47:aload_0         
	//   26   48:fconst_1        
	//   27   49:putfield        #70  <Field float o>
	//   28   52:aload_0         
	//   29   53:new             #72  <Class biz.bookdesign.librivox.audio.c>
	//   30   56:dup             
	//   31   57:aload_0         
	//   32   58:invokespecial   #73  <Method void biz.bookdesign.librivox.audio.c(LocalAudioService)>
	//   33   61:putfield        #75  <Field Runnable p>
		q = ((Runnable) (new d(this)));
	//   34   64:aload_0         
	//   35   65:new             #77  <Class d>
	//   36   68:dup             
	//   37   69:aload_0         
	//   38   70:invokespecial   #78  <Method void d(LocalAudioService)>
	//   39   73:putfield        #80  <Field Runnable q>
		r = ((Runnable) (new biz.bookdesign.librivox.audio.e(this)));
	//   40   76:aload_0         
	//   41   77:new             #82  <Class biz.bookdesign.librivox.audio.e>
	//   42   80:dup             
	//   43   81:aload_0         
	//   44   82:invokespecial   #83  <Method void biz.bookdesign.librivox.audio.e(LocalAudioService)>
	//   45   85:putfield        #85  <Field Runnable r>
	//   46   88:aload_0         
	//   47   89:new             #87  <Class biz.bookdesign.librivox.audio.g>
	//   48   92:dup             
	//   49   93:aload_0         
	//   50   94:invokespecial   #88  <Method void biz.bookdesign.librivox.audio.g(LocalAudioService)>
	//   51   97:putfield        #90  <Field bj s>
	//   52  100:aload_0         
	//   53  101:new             #92  <Class h>
	//   54  104:dup             
	//   55  105:aload_0         
	//   56  106:invokespecial   #93  <Method void h(LocalAudioService)>
	//   57  109:putfield        #95  <Field bj t>
	//   58  112:return          
	}

	private void A()
	{
		q();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #99  <Method void q()>
		D();
	//    2    4:aload_0         
	//    3    5:invokespecial   #102 <Method void D()>
	//    4    8:return          
	}

	private void B()
	{
		m = 0L;
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:putfield        #105 <Field long m>
		n = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #68  <Field boolean n>
		k.removeCallbacks(p);
	//    6   10:aload_0         
	//    7   11:getfield        #60  <Field Handler k>
	//    8   14:aload_0         
	//    9   15:getfield        #75  <Field Runnable p>
	//   10   18:invokevirtual   #109 <Method void Handler.removeCallbacks(Runnable)>
		t();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #111 <Method void t()>
		i.a();
	//   13   25:aload_0         
	//   14   26:getfield        #113 <Field a i>
	//   15   29:invokevirtual   #117 <Method void a.a()>
	//   16   32:return          
	}

	private static boolean C()
	{
		return (android.os.Build.VERSION.SDK_INT == 22 || android.os.Build.VERSION.SDK_INT == 21) && Build.MANUFACTURER.toLowerCase(Locale.getDefault()).contains("huawei");
	//    0    0:getstatic       #125 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          22
	//    2    5:icmpeq          16
	//    3    8:getstatic       #125 <Field int android.os.Build$VERSION.SDK_INT>
	//    4   11:bipush          21
	//    5   13:icmpne          35
	//    6   16:getstatic       #131 <Field String Build.MANUFACTURER>
	//    7   19:invokestatic    #137 <Method Locale Locale.getDefault()>
	//    8   22:invokevirtual   #143 <Method String String.toLowerCase(Locale)>
	//    9   25:ldc1            #145 <String "huawei">
	//   10   27:invokevirtual   #149 <Method boolean String.contains(CharSequence)>
	//   11   30:ifeq            35
	//   12   33:iconst_1        
	//   13   34:ireturn         
	//   14   35:iconst_0        
	//   15   36:ireturn         
	}

	private void D()
	{
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field m b>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			Intent intent = new Intent("biz.bookdesign.librivox.CHAPTER_NOTIFICATION");
	//    4    8:new             #151 <Class Intent>
	//    5   11:dup             
	//    6   12:ldc1            #153 <String "biz.bookdesign.librivox.CHAPTER_NOTIFICATION">
	//    7   14:invokespecial   #156 <Method void Intent(String)>
	//    8   17:astore_1        
			intent.putExtra("biz.bookdesign.librivox.CHAPTER", b.b());
	//    9   18:aload_1         
	//   10   19:ldc1            #158 <String "biz.bookdesign.librivox.CHAPTER">
	//   11   21:aload_0         
	//   12   22:getfield        #64  <Field m b>
	//   13   25:invokevirtual   #163 <Method int m.b()>
	//   14   28:invokevirtual   #167 <Method Intent Intent.putExtra(String, int)>
	//   15   31:pop             
			e.a(intent);
	//   16   32:aload_0         
	//   17   33:getfield        #169 <Field g e>
	//   18   36:aload_1         
	//   19   37:invokevirtual   #174 <Method boolean g.a(Intent)>
	//   20   40:pop             
			return;
	//   21   41:return          
		}
	}

	static float a(LocalAudioService localaudioservice)
	{
		return localaudioservice.o;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field float o>
	//    2    4:freturn         
	}

	static float a(LocalAudioService localaudioservice, float f1)
	{
		localaudioservice.o = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #70  <Field float o>
		return f1;
	//    3    5:fload_1         
	//    4    6:freturn         
	}

	private void a(Bitmap bitmap)
	{
		Object obj = ((Object) (b));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field m b>
	//    2    4:astore          5
		if(obj == null)
	//*   3    6:aload           5
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		Object obj3 = ((Object) (((m) (obj)).k()));
	//    6   12:aload           5
	//    7   14:invokevirtual   #180 <Method biz.bookdesign.librivox.b.a m.k()>
	//    8   17:astore          10
		String s1 = ((biz.bookdesign.librivox.b.a) (obj3)).b();
	//    9   19:aload           10
	//   10   21:invokevirtual   #185 <Method String biz.bookdesign.librivox.b.a.b()>
	//   11   24:astore          6
		String s2 = ((m) (obj)).l();
	//   12   26:aload           5
	//   13   28:invokevirtual   #187 <Method String m.l()>
	//   14   31:astore          7
		Object obj1 = ((Object) (new Intent(((android.content.Context) (this)), biz/bookdesign/librivox/audio/LocalAudioService)));
	//   15   33:new             #151 <Class Intent>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:ldc1            #2   <Class LocalAudioService>
	//   19   40:invokespecial   #190 <Method void Intent(android.content.Context, Class)>
	//   20   43:astore          8
		Object obj2 = ((Object) (new Bundle()));
	//   21   45:new             #192 <Class Bundle>
	//   22   48:dup             
	//   23   49:invokespecial   #193 <Method void Bundle()>
	//   24   52:astore          9
		((Bundle) (obj2)).putBoolean("play_key", true);
	//   25   54:aload           9
	//   26   56:ldc1            #195 <String "play_key">
	//   27   58:iconst_1        
	//   28   59:invokevirtual   #199 <Method void Bundle.putBoolean(String, boolean)>
		((Intent) (obj1)).putExtras(((Bundle) (obj2)));
	//   29   62:aload           8
	//   30   64:aload           9
	//   31   66:invokevirtual   #203 <Method Intent Intent.putExtras(Bundle)>
	//   32   69:pop             
		obj1 = ((Object) (PendingIntent.getService(getApplicationContext(), 0, ((Intent) (obj1)), 0x8000000)));
	//   33   70:aload_0         
	//   34   71:invokevirtual   #207 <Method android.content.Context getApplicationContext()>
	//   35   74:iconst_0        
	//   36   75:aload           8
	//   37   77:ldc1            #208 <Int 0x8000000>
	//   38   79:invokestatic    #214 <Method PendingIntent PendingIntent.getService(android.content.Context, int, Intent, int)>
	//   39   82:astore          8
		obj2 = ((Object) (new Intent(((android.content.Context) (this)), biz/bookdesign/librivox/audio/LocalAudioService)));
	//   40   84:new             #151 <Class Intent>
	//   41   87:dup             
	//   42   88:aload_0         
	//   43   89:ldc1            #2   <Class LocalAudioService>
	//   44   91:invokespecial   #190 <Method void Intent(android.content.Context, Class)>
	//   45   94:astore          9
		Object obj4 = ((Object) (new Bundle()));
	//   46   96:new             #192 <Class Bundle>
	//   47   99:dup             
	//   48  100:invokespecial   #193 <Method void Bundle()>
	//   49  103:astore          11
		((Bundle) (obj4)).putBoolean("biz.bookdesign.librivox.FAST_FORWARD", true);
	//   50  105:aload           11
	//   51  107:ldc1            #216 <String "biz.bookdesign.librivox.FAST_FORWARD">
	//   52  109:iconst_1        
	//   53  110:invokevirtual   #199 <Method void Bundle.putBoolean(String, boolean)>
		((Intent) (obj2)).putExtras(((Bundle) (obj4)));
	//   54  113:aload           9
	//   55  115:aload           11
	//   56  117:invokevirtual   #203 <Method Intent Intent.putExtras(Bundle)>
	//   57  120:pop             
		obj2 = ((Object) (PendingIntent.getService(getApplicationContext(), 1, ((Intent) (obj2)), 0x8000000)));
	//   58  121:aload_0         
	//   59  122:invokevirtual   #207 <Method android.content.Context getApplicationContext()>
	//   60  125:iconst_1        
	//   61  126:aload           9
	//   62  128:ldc1            #208 <Int 0x8000000>
	//   63  130:invokestatic    #214 <Method PendingIntent PendingIntent.getService(android.content.Context, int, Intent, int)>
	//   64  133:astore          9
		obj4 = ((Object) (new Intent(((android.content.Context) (this)), biz/bookdesign/librivox/audio/LocalAudioService)));
	//   65  135:new             #151 <Class Intent>
	//   66  138:dup             
	//   67  139:aload_0         
	//   68  140:ldc1            #2   <Class LocalAudioService>
	//   69  142:invokespecial   #190 <Method void Intent(android.content.Context, Class)>
	//   70  145:astore          11
		Object obj5 = ((Object) (new Bundle()));
	//   71  147:new             #192 <Class Bundle>
	//   72  150:dup             
	//   73  151:invokespecial   #193 <Method void Bundle()>
	//   74  154:astore          12
		((Bundle) (obj5)).putBoolean("biz.bookdesign.librivox.REWIND", true);
	//   75  156:aload           12
	//   76  158:ldc1            #218 <String "biz.bookdesign.librivox.REWIND">
	//   77  160:iconst_1        
	//   78  161:invokevirtual   #199 <Method void Bundle.putBoolean(String, boolean)>
		((Intent) (obj4)).putExtras(((Bundle) (obj5)));
	//   79  164:aload           11
	//   80  166:aload           12
	//   81  168:invokevirtual   #203 <Method Intent Intent.putExtras(Bundle)>
	//   82  171:pop             
		obj4 = ((Object) (PendingIntent.getService(getApplicationContext(), 2, ((Intent) (obj4)), 0x8000000)));
	//   83  172:aload_0         
	//   84  173:invokevirtual   #207 <Method android.content.Context getApplicationContext()>
	//   85  176:iconst_2        
	//   86  177:aload           11
	//   87  179:ldc1            #208 <Int 0x8000000>
	//   88  181:invokestatic    #214 <Method PendingIntent PendingIntent.getService(android.content.Context, int, Intent, int)>
	//   89  184:astore          11
		obj5 = ((Object) (new Intent(((android.content.Context) (this)), biz/bookdesign/librivox/ListenActivity)));
	//   90  186:new             #151 <Class Intent>
	//   91  189:dup             
	//   92  190:aload_0         
	//   93  191:ldc1            #220 <Class ListenActivity>
	//   94  193:invokespecial   #190 <Method void Intent(android.content.Context, Class)>
	//   95  196:astore          12
		((Intent) (obj5)).setAction("biz.bookdesign.librivox.SHOW_PLAY");
	//   96  198:aload           12
	//   97  200:ldc1            #222 <String "biz.bookdesign.librivox.SHOW_PLAY">
	//   98  202:invokevirtual   #226 <Method Intent Intent.setAction(String)>
	//   99  205:pop             
		((Intent) (obj5)).setFlags(0x10020000);
	//  100  206:aload           12
	//  101  208:ldc1            #227 <Int 0x10020000>
	//  102  210:invokevirtual   #231 <Method Intent Intent.setFlags(int)>
	//  103  213:pop             
		((Intent) (obj5)).putExtra("lvid", ((m) (obj)).a());
	//  104  214:aload           12
	//  105  216:ldc1            #233 <String "lvid">
	//  106  218:aload           5
	//  107  220:invokevirtual   #235 <Method int m.a()>
	//  108  223:invokevirtual   #167 <Method Intent Intent.putExtra(String, int)>
	//  109  226:pop             
		obj5 = ((Object) (PendingIntent.getActivity(((android.content.Context) (this)), 0, ((Intent) (obj5)), 0x10000000)));
	//  110  227:aload_0         
	//  111  228:iconst_0        
	//  112  229:aload           12
	//  113  231:ldc1            #236 <Int 0x10000000>
	//  114  233:invokestatic    #239 <Method PendingIntent PendingIntent.getActivity(android.content.Context, int, Intent, int)>
	//  115  236:astore          12
		a(((biz.bookdesign.librivox.b.a) (obj3)), ((m) (obj)), bitmap);
	//  116  238:aload_0         
	//  117  239:aload           10
	//  118  241:aload           5
	//  119  243:aload_1         
	//  120  244:invokespecial   #242 <Method void a(biz.bookdesign.librivox.b.a, m, Bitmap)>
		int i1;
		if(k())
	//* 121  247:aload_0         
	//* 122  248:invokevirtual   #244 <Method boolean k()>
	//* 123  251:ifeq            290
		{
			e(3);
	//  124  254:aload_0         
	//  125  255:iconst_3        
	//  126  256:invokespecial   #247 <Method void e(int)>
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 127  259:getstatic       #125 <Field int android.os.Build$VERSION.SDK_INT>
	//* 128  262:bipush          21
	//* 129  264:icmplt          274
				i1 = biz.bookdesign.librivox.a.g.ic_pause_black_36dp;
	//  130  267:getstatic       #252 <Field int biz.bookdesign.librivox.a.g.ic_pause_black_36dp>
	//  131  270:istore_2        
			else
	//* 132  271:goto            278
				i1 = biz.bookdesign.librivox.a.g.ic_pause;
	//  133  274:getstatic       #255 <Field int biz.bookdesign.librivox.a.g.ic_pause>
	//  134  277:istore_2        
			obj = ((Object) (getString(k.pause)));
	//  135  278:aload_0         
	//  136  279:getstatic       #260 <Field int k.pause>
	//  137  282:invokevirtual   #264 <Method String getString(int)>
	//  138  285:astore          5
		} else
	//* 139  287:goto            323
		{
			e(2);
	//  140  290:aload_0         
	//  141  291:iconst_2        
	//  142  292:invokespecial   #247 <Method void e(int)>
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 143  295:getstatic       #125 <Field int android.os.Build$VERSION.SDK_INT>
	//* 144  298:bipush          21
	//* 145  300:icmplt          310
				i1 = biz.bookdesign.librivox.a.g.ic_play_arrow_black_36dp;
	//  146  303:getstatic       #267 <Field int biz.bookdesign.librivox.a.g.ic_play_arrow_black_36dp>
	//  147  306:istore_2        
			else
	//* 148  307:goto            314
				i1 = biz.bookdesign.librivox.a.g.ic_play;
	//  149  310:getstatic       #270 <Field int biz.bookdesign.librivox.a.g.ic_play>
	//  150  313:istore_2        
			obj = ((Object) (getString(k.play)));
	//  151  314:aload_0         
	//  152  315:getstatic       #273 <Field int k.play>
	//  153  318:invokevirtual   #264 <Method String getString(int)>
	//  154  321:astore          5
		}
		int j1;
		int k1;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 155  323:getstatic       #125 <Field int android.os.Build$VERSION.SDK_INT>
	//* 156  326:bipush          21
	//* 157  328:icmplt          343
		{
			j1 = biz.bookdesign.librivox.a.g.ic_replay_10_black_36dp;
	//  158  331:getstatic       #276 <Field int biz.bookdesign.librivox.a.g.ic_replay_10_black_36dp>
	//  159  334:istore_3        
			k1 = biz.bookdesign.librivox.a.g.ic_forward_30_black_36dp;
	//  160  335:getstatic       #279 <Field int biz.bookdesign.librivox.a.g.ic_forward_30_black_36dp>
	//  161  338:istore          4
		} else
	//* 162  340:goto            352
		{
			j1 = biz.bookdesign.librivox.a.g.ic_replay_10_white_36dp;
	//  163  343:getstatic       #282 <Field int biz.bookdesign.librivox.a.g.ic_replay_10_white_36dp>
	//  164  346:istore_3        
			k1 = biz.bookdesign.librivox.a.g.ic_forward_30_white_36dp;
	//  165  347:getstatic       #285 <Field int biz.bookdesign.librivox.a.g.ic_forward_30_white_36dp>
	//  166  350:istore          4
		}
		obj3 = ((Object) (new StringBuilder()));
	//  167  352:new             #287 <Class StringBuilder>
	//  168  355:dup             
	//  169  356:invokespecial   #288 <Method void StringBuilder()>
	//  170  359:astore          10
		((StringBuilder) (obj3)).append(s1);
	//  171  361:aload           10
	//  172  363:aload           6
	//  173  365:invokevirtual   #292 <Method StringBuilder StringBuilder.append(String)>
	//  174  368:pop             
		((StringBuilder) (obj3)).append(": ");
	//  175  369:aload           10
	//  176  371:ldc2            #294 <String ": ">
	//  177  374:invokevirtual   #292 <Method StringBuilder StringBuilder.append(String)>
	//  178  377:pop             
		((StringBuilder) (obj3)).append(s2);
	//  179  378:aload           10
	//  180  380:aload           7
	//  181  382:invokevirtual   #292 <Method StringBuilder StringBuilder.append(String)>
	//  182  385:pop             
		obj3 = ((Object) (((StringBuilder) (obj3)).toString()));
	//  183  386:aload           10
	//  184  388:invokevirtual   #297 <Method String StringBuilder.toString()>
	//  185  391:astore          10
		bitmap = ((Bitmap) ((new cl(((android.content.Context) (this)), "biz.bookdesign.librivox.notification_audio")).a(((CharSequence) (s1))).b(((CharSequence) (s2))).c(((CharSequence) (obj3))).a(biz.bookdesign.librivox.a.g.ic_lv_nm).d(android.support.v4.a.c.c(((android.content.Context) (this)), e.lv_primary_dark)).a(bitmap).a(((PendingIntent) (obj5))).e(1).a(j1, ((CharSequence) (getString(k.rewind))), ((PendingIntent) (obj4))).a(i1, ((CharSequence) (obj)), ((PendingIntent) (obj1))).a(k1, ((CharSequence) (getString(k.fast_forward))), ((PendingIntent) (obj2)))));
	//  186  393:new             #299 <Class cl>
	//  187  396:dup             
	//  188  397:aload_0         
	//  189  398:ldc2            #301 <String "biz.bookdesign.librivox.notification_audio">
	//  190  401:invokespecial   #304 <Method void cl(android.content.Context, String)>
	//  191  404:aload           6
	//  192  406:invokevirtual   #307 <Method cl cl.a(CharSequence)>
	//  193  409:aload           7
	//  194  411:invokevirtual   #309 <Method cl cl.b(CharSequence)>
	//  195  414:aload           10
	//  196  416:invokevirtual   #311 <Method cl cl.c(CharSequence)>
	//  197  419:getstatic       #314 <Field int biz.bookdesign.librivox.a.g.ic_lv_nm>
	//  198  422:invokevirtual   #317 <Method cl cl.a(int)>
	//  199  425:aload_0         
	//  200  426:getstatic       #322 <Field int e.lv_primary_dark>
	//  201  429:invokestatic    #327 <Method int c.c(android.content.Context, int)>
	//  202  432:invokevirtual   #329 <Method cl cl.d(int)>
	//  203  435:aload_1         
	//  204  436:invokevirtual   #332 <Method cl cl.a(Bitmap)>
	//  205  439:aload           12
	//  206  441:invokevirtual   #335 <Method cl cl.a(PendingIntent)>
	//  207  444:iconst_1        
	//  208  445:invokevirtual   #337 <Method cl cl.e(int)>
	//  209  448:iload_3         
	//  210  449:aload_0         
	//  211  450:getstatic       #340 <Field int k.rewind>
	//  212  453:invokevirtual   #264 <Method String getString(int)>
	//  213  456:aload           11
	//  214  458:invokevirtual   #343 <Method cl cl.a(int, CharSequence, PendingIntent)>
	//  215  461:iload_2         
	//  216  462:aload           5
	//  217  464:aload           8
	//  218  466:invokevirtual   #343 <Method cl cl.a(int, CharSequence, PendingIntent)>
	//  219  469:iload           4
	//  220  471:aload_0         
	//  221  472:getstatic       #346 <Field int k.fast_forward>
	//  222  475:invokevirtual   #264 <Method String getString(int)>
	//  223  478:aload           9
	//  224  480:invokevirtual   #343 <Method cl cl.a(int, CharSequence, PendingIntent)>
	//  225  483:astore_1        
		if(!C())
	//* 226  484:invokestatic    #348 <Method boolean C()>
	//* 227  487:ifne            522
			((cl) (bitmap)).a(((android.support.v4.app.cm) ((new android.support.v4.media.a.b()).a(new int[] {
				1
			}).a(h.c()))));
	//  228  490:aload_1         
	//  229  491:new             #350 <Class android.support.v4.media.a.b>
	//  230  494:dup             
	//  231  495:invokespecial   #351 <Method void android.support.v4.media.a.b()>
	//  232  498:iconst_1        
	//  233  499:newarray        int[]
	//  234  501:dup             
	//  235  502:iconst_0        
	//  236  503:iconst_1        
	//  237  504:iastore         
	//  238  505:invokevirtual   #354 <Method android.support.v4.media.a.b android.support.v4.media.a.b.a(int[])>
	//  239  508:aload_0         
	//  240  509:getfield        #356 <Field MediaSessionCompat h>
	//  241  512:invokevirtual   #361 <Method android.support.v4.media.session.MediaSessionCompat$Token MediaSessionCompat.c()>
	//  242  515:invokevirtual   #364 <Method android.support.v4.media.a.b android.support.v4.media.a.b.a(android.support.v4.media.session.MediaSessionCompat$Token)>
	//  243  518:invokevirtual   #367 <Method cl cl.a(android.support.v4.app.cm)>
	//  244  521:pop             
		startForeground(10, ((cl) (bitmap)).b());
	//  245  522:aload_0         
	//  246  523:bipush          10
	//  247  525:aload_1         
	//  248  526:invokevirtual   #370 <Method android.app.Notification cl.b()>
	//  249  529:invokevirtual   #374 <Method void startForeground(int, android.app.Notification)>
		if(!k())
	//* 250  532:aload_0         
	//* 251  533:invokevirtual   #244 <Method boolean k()>
	//* 252  536:ifne            544
			stopForeground(false);
	//  253  539:aload_0         
	//  254  540:iconst_0        
	//  255  541:invokevirtual   #378 <Method void stopForeground(boolean)>
	//  256  544:return          
	}

	static void a(LocalAudioService localaudioservice, int i1)
	{
		localaudioservice.e(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #247 <Method void e(int)>
	//    3    5:return          
	}

	static void a(LocalAudioService localaudioservice, Bitmap bitmap)
	{
		localaudioservice.a(bitmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #382 <Method void a(Bitmap)>
	//    3    5:return          
	}

	static void a(LocalAudioService localaudioservice, biz.bookdesign.librivox.b.a a1, m m1, Bitmap bitmap)
	{
		localaudioservice.a(a1, m1, bitmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #242 <Method void a(biz.bookdesign.librivox.b.a, m, Bitmap)>
	//    5    7:return          
	}

	static void a(LocalAudioService localaudioservice, String s1)
	{
		localaudioservice.b(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #386 <Method void b(String)>
	//    3    5:return          
	}

	private void a(biz.bookdesign.librivox.b.a a1, m m1, Bitmap bitmap)
	{
		if(m1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		a1 = ((biz.bookdesign.librivox.b.a) ((new android.support.v4.media.cl()).a("android.media.metadata.ALBUM", a1.b()).a("android.media.metadata.ARTIST", a1.d()).a("android.media.metadata.ALBUM_ART_URI", a1.a()).a("android.media.metadata.AUTHOR", a1.d()).a("android.media.metadata.DURATION", j()).a("android.media.metadata.NUM_TRACKS", a1.D()).a("android.media.metadata.TITLE", m1.l()).a("android.media.metadata.DISPLAY_TITLE", m1.l()).a("android.media.metadata.TRACK_NUMBER", m1.b()).a("android.media.metadata.DISPLAY_DESCRIPTION", a1.q()).a("android.media.metadata.MEDIA_ID", String.valueOf(a1.p())).a("android.media.metadata.MEDIA_URI", a1.F())));
	//    3    5:new             #388 <Class android.support.v4.media.cl>
	//    4    8:dup             
	//    5    9:invokespecial   #389 <Method void android.support.v4.media.cl()>
	//    6   12:ldc2            #391 <String "android.media.metadata.ALBUM">
	//    7   15:aload_1         
	//    8   16:invokevirtual   #185 <Method String biz.bookdesign.librivox.b.a.b()>
	//    9   19:invokevirtual   #394 <Method android.support.v4.media.cl android.support.v4.media.cl.a(String, String)>
	//   10   22:ldc2            #396 <String "android.media.metadata.ARTIST">
	//   11   25:aload_1         
	//   12   26:invokevirtual   #398 <Method String biz.bookdesign.librivox.b.a.d()>
	//   13   29:invokevirtual   #394 <Method android.support.v4.media.cl android.support.v4.media.cl.a(String, String)>
	//   14   32:ldc2            #400 <String "android.media.metadata.ALBUM_ART_URI">
	//   15   35:aload_1         
	//   16   36:invokevirtual   #402 <Method String biz.bookdesign.librivox.b.a.a()>
	//   17   39:invokevirtual   #394 <Method android.support.v4.media.cl android.support.v4.media.cl.a(String, String)>
	//   18   42:ldc2            #404 <String "android.media.metadata.AUTHOR">
	//   19   45:aload_1         
	//   20   46:invokevirtual   #398 <Method String biz.bookdesign.librivox.b.a.d()>
	//   21   49:invokevirtual   #394 <Method android.support.v4.media.cl android.support.v4.media.cl.a(String, String)>
	//   22   52:ldc2            #406 <String "android.media.metadata.DURATION">
	//   23   55:aload_0         
	//   24   56:invokevirtual   #408 <Method int j()>
	//   25   59:i2l             
	//   26   60:invokevirtual   #411 <Method android.support.v4.media.cl android.support.v4.media.cl.a(String, long)>
	//   27   63:ldc2            #413 <String "android.media.metadata.NUM_TRACKS">
	//   28   66:aload_1         
	//   29   67:invokevirtual   #415 <Method int biz.bookdesign.librivox.b.a.D()>
	//   30   70:i2l             
	//   31   71:invokevirtual   #411 <Method android.support.v4.media.cl android.support.v4.media.cl.a(String, long)>
	//   32   74:ldc2            #417 <String "android.media.metadata.TITLE">
	//   33   77:aload_2         
	//   34   78:invokevirtual   #187 <Method String m.l()>
	//   35   81:invokevirtual   #394 <Method android.support.v4.media.cl android.support.v4.media.cl.a(String, String)>
	//   36   84:ldc2            #419 <String "android.media.metadata.DISPLAY_TITLE">
	//   37   87:aload_2         
	//   38   88:invokevirtual   #187 <Method String m.l()>
	//   39   91:invokevirtual   #394 <Method android.support.v4.media.cl android.support.v4.media.cl.a(String, String)>
	//   40   94:ldc2            #421 <String "android.media.metadata.TRACK_NUMBER">
	//   41   97:aload_2         
	//   42   98:invokevirtual   #163 <Method int m.b()>
	//   43  101:i2l             
	//   44  102:invokevirtual   #411 <Method android.support.v4.media.cl android.support.v4.media.cl.a(String, long)>
	//   45  105:ldc2            #423 <String "android.media.metadata.DISPLAY_DESCRIPTION">
	//   46  108:aload_1         
	//   47  109:invokevirtual   #425 <Method String biz.bookdesign.librivox.b.a.q()>
	//   48  112:invokevirtual   #394 <Method android.support.v4.media.cl android.support.v4.media.cl.a(String, String)>
	//   49  115:ldc2            #427 <String "android.media.metadata.MEDIA_ID">
	//   50  118:aload_1         
	//   51  119:invokevirtual   #429 <Method int biz.bookdesign.librivox.b.a.p()>
	//   52  122:invokestatic    #432 <Method String String.valueOf(int)>
	//   53  125:invokevirtual   #394 <Method android.support.v4.media.cl android.support.v4.media.cl.a(String, String)>
	//   54  128:ldc2            #434 <String "android.media.metadata.MEDIA_URI">
	//   55  131:aload_1         
	//   56  132:invokevirtual   #436 <Method String biz.bookdesign.librivox.b.a.F()>
	//   57  135:invokevirtual   #394 <Method android.support.v4.media.cl android.support.v4.media.cl.a(String, String)>
	//   58  138:astore_1        
		if(bitmap != null)
	//*  59  139:aload_3         
	//*  60  140:ifnull          152
			((android.support.v4.media.cl) (a1)).a("android.media.metadata.ALBUM_ART", bitmap);
	//   61  143:aload_1         
	//   62  144:ldc2            #438 <String "android.media.metadata.ALBUM_ART">
	//   63  147:aload_3         
	//   64  148:invokevirtual   #441 <Method android.support.v4.media.cl android.support.v4.media.cl.a(String, Bitmap)>
	//   65  151:pop             
		h.a(((android.support.v4.media.cl) (a1)).a());
	//   66  152:aload_0         
	//   67  153:getfield        #356 <Field MediaSessionCompat h>
	//   68  156:aload_1         
	//   69  157:invokevirtual   #444 <Method android.support.v4.media.MediaMetadataCompat android.support.v4.media.cl.a()>
	//   70  160:invokevirtual   #447 <Method void MediaSessionCompat.a(android.support.v4.media.MediaMetadataCompat)>
	//   71  163:return          
	}

	private void a(m m1)
	{
		if(m1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       22
			d.a().a(((Uri) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #450 <Field t d>
	//    4    8:invokeinterface #455 <Method biz.bookdesign.librivox.audio.a biz.bookdesign.librivox.audio.t.a()>
	//    5   13:aconst_null     
	//    6   14:invokeinterface #460 <Method void biz.bookdesign.librivox.audio.a.a(Uri)>
		else
	//*   7   19:goto            51
		if(!m1.equals(((Object) (b))))
	//*   8   22:aload_1         
	//*   9   23:aload_0         
	//*  10   24:getfield        #64  <Field m b>
	//*  11   27:invokevirtual   #464 <Method boolean m.equals(Object)>
	//*  12   30:ifne            51
			d.a().a(m1.c());
	//   13   33:aload_0         
	//   14   34:getfield        #450 <Field t d>
	//   15   37:invokeinterface #455 <Method biz.bookdesign.librivox.audio.a biz.bookdesign.librivox.audio.t.a()>
	//   16   42:aload_1         
	//   17   43:invokevirtual   #467 <Method Uri m.c()>
	//   18   46:invokeinterface #460 <Method void biz.bookdesign.librivox.audio.a.a(Uri)>
		b = m1;
	//   19   51:aload_0         
	//   20   52:aload_1         
	//   21   53:putfield        #64  <Field m b>
	//   22   56:return          
	}

	private void a(Integer integer)
	{
		Object obj = ((Object) (b));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field m b>
	//    2    4:astore_2        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       20
		{
			com.crashlytics.android.a.a(4, "LibriVox-AudioService", "Can not start playback: No chapter loaded.");
	//    5    9:iconst_4        
	//    6   10:ldc2            #470 <String "LibriVox-AudioService">
	//    7   13:ldc2            #472 <String "Can not start playback: No chapter loaded.">
	//    8   16:invokestatic    #477 <Method void com.crashlytics.android.a.a(int, String, String)>
			return;
	//    9   19:return          
		}
		Uri uri = ((m) (obj)).c();
	//   10   20:aload_2         
	//   11   21:invokevirtual   #467 <Method Uri m.c()>
	//   12   24:astore_3        
		if(uri == null)
	//*  13   25:aload_3         
	//*  14   26:ifnonnull       63
		{
			integer = ((Integer) (new StringBuilder()));
	//   15   29:new             #287 <Class StringBuilder>
	//   16   32:dup             
	//   17   33:invokespecial   #288 <Method void StringBuilder()>
	//   18   36:astore_1        
			((StringBuilder) (integer)).append("Failed to retrieve audio file URL for chapter ");
	//   19   37:aload_1         
	//   20   38:ldc2            #479 <String "Failed to retrieve audio file URL for chapter ">
	//   21   41:invokevirtual   #292 <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
			((StringBuilder) (integer)).append(((Object) (b)));
	//   23   45:aload_1         
	//   24   46:aload_0         
	//   25   47:getfield        #64  <Field m b>
	//   26   50:invokevirtual   #482 <Method StringBuilder StringBuilder.append(Object)>
	//   27   53:pop             
			a(((StringBuilder) (integer)).toString());
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:invokevirtual   #297 <Method String StringBuilder.toString()>
	//   31   59:invokespecial   #484 <Method void a(String)>
			return;
	//   32   62:return          
		}
		obj = ((Object) (integer));
	//   33   63:aload_1         
	//   34   64:astore_2        
		if(integer == null)
	//*  35   65:aload_1         
	//*  36   66:ifnonnull       81
			obj = ((Object) (Integer.valueOf((int)b.o())));
	//   37   69:aload_0         
	//   38   70:getfield        #64  <Field m b>
	//   39   73:invokevirtual   #487 <Method long m.o()>
	//   40   76:l2i             
	//   41   77:invokestatic    #492 <Method Integer Integer.valueOf(int)>
	//   42   80:astore_2        
		l = false;
	//   43   81:aload_0         
	//   44   82:iconst_0        
	//   45   83:putfield        #66  <Field boolean l>
		d.a().a(uri);
	//   46   86:aload_0         
	//   47   87:getfield        #450 <Field t d>
	//   48   90:invokeinterface #455 <Method biz.bookdesign.librivox.audio.a biz.bookdesign.librivox.audio.t.a()>
	//   49   95:aload_3         
	//   50   96:invokeinterface #460 <Method void biz.bookdesign.librivox.audio.a.a(Uri)>
		d.a().a(((Integer) (obj)).intValue());
	//   51  101:aload_0         
	//   52  102:getfield        #450 <Field t d>
	//   53  105:invokeinterface #455 <Method biz.bookdesign.librivox.audio.a biz.bookdesign.librivox.audio.t.a()>
	//   54  110:aload_2         
	//   55  111:invokevirtual   #495 <Method int Integer.intValue()>
	//   56  114:invokeinterface #497 <Method void biz.bookdesign.librivox.audio.a.a(int)>
		d.a().b();
	//   57  119:aload_0         
	//   58  120:getfield        #450 <Field t d>
	//   59  123:invokeinterface #455 <Method biz.bookdesign.librivox.audio.a biz.bookdesign.librivox.audio.t.a()>
	//   60  128:invokeinterface #499 <Method void biz.bookdesign.librivox.audio.a.b()>
		f(b.r());
	//   61  133:aload_0         
	//   62  134:aload_0         
	//   63  135:getfield        #64  <Field m b>
	//   64  138:invokevirtual   #501 <Method int m.r()>
	//   65  141:invokespecial   #503 <Method void f(int)>
	//   66  144:return          
	}

	private void a(String s1)
	{
		(new o(((android.content.Context) (this)))).a(s1, ((Throwable) (null)), "audio-service-exception");
	//    0    0:new             #505 <Class o>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #508 <Method void o(android.content.Context)>
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:ldc2            #510 <String "audio-service-exception">
	//    7   13:invokevirtual   #513 <Method void o.a(String, Throwable, String)>
	//    8   16:return          
	}

	static t b(LocalAudioService localaudioservice)
	{
		return localaudioservice.d;
	//    0    0:aload_0         
	//    1    1:getfield        #450 <Field t d>
	//    2    4:areturn         
	}

	private void b(String s1)
	{
		s1 = ((String) (new Intent(s1)));
	//    0    0:new             #151 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #156 <Method void Intent(String)>
	//    4    8:astore_1        
		e.a(((Intent) (s1)));
	//    5    9:aload_0         
	//    6   10:getfield        #169 <Field g e>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #174 <Method boolean g.a(Intent)>
	//    9   17:pop             
	//   10   18:return          
	}

	static Handler c(LocalAudioService localaudioservice)
	{
		return localaudioservice.k;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Handler k>
	//    2    4:areturn         
	}

	static a d(LocalAudioService localaudioservice)
	{
		return localaudioservice.i;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field a i>
	//    2    4:areturn         
	}

	static Runnable e(LocalAudioService localaudioservice)
	{
		return localaudioservice.q;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Runnable q>
	//    2    4:areturn         
	}

	private void e(int i1)
	{
		Object obj = ((Object) (b));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field m b>
	//    2    4:astore          6
		long l1;
		if(obj != null)
	//*   3    6:aload           6
	//*   4    8:ifnull          82
		{
			l1 = 3144L;
	//    5   11:ldc2w           #518 <Long 3144L>
	//    6   14:lstore_2        
			if(((m) (obj)).b() > 1)
	//*   7   15:aload           6
	//*   8   17:invokevirtual   #163 <Method int m.b()>
	//*   9   20:iconst_1        
	//*  10   21:icmple          28
				l1 = 3160L;
	//   11   24:ldc2w           #520 <Long 3160L>
	//   12   27:lstore_2        
			long l2 = l1;
	//   13   28:lload_2         
	//   14   29:lstore          4
			if(b.b() < a.D())
	//*  15   31:aload_0         
	//*  16   32:getfield        #64  <Field m b>
	//*  17   35:invokevirtual   #163 <Method int m.b()>
	//*  18   38:aload_0         
	//*  19   39:getfield        #62  <Field biz.bookdesign.librivox.b.a a>
	//*  20   42:invokevirtual   #415 <Method int biz.bookdesign.librivox.b.a.D()>
	//*  21   45:icmpge          55
				l2 = l1 | 32L;
	//   22   48:lload_2         
	//   23   49:ldc2w           #522 <Long 32L>
	//   24   52:lor             
	//   25   53:lstore          4
			if(k())
	//*  26   55:aload_0         
	//*  27   56:invokevirtual   #244 <Method boolean k()>
	//*  28   59:ifeq            72
				l1 = l2 | 2L;
	//   29   62:lload           4
	//   30   64:ldc2w           #524 <Long 2L>
	//   31   67:lor             
	//   32   68:lstore_2        
			else
	//*  33   69:goto            86
				l1 = l2 | 4L;
	//   34   72:lload           4
	//   35   74:ldc2w           #526 <Long 4L>
	//   36   77:lor             
	//   37   78:lstore_2        
		} else
	//*  38   79:goto            86
		{
			l1 = 3072L;
	//   39   82:ldc2w           #528 <Long 3072L>
	//   40   85:lstore_2        
		}
		obj = ((Object) ((new bn()).a(l1).a(i1, i(), 1.0F, SystemClock.elapsedRealtime()).a()));
	//   41   86:new             #531 <Class bn>
	//   42   89:dup             
	//   43   90:invokespecial   #532 <Method void bn()>
	//   44   93:lload_2         
	//   45   94:invokevirtual   #535 <Method bn bn.a(long)>
	//   46   97:iload_1         
	//   47   98:aload_0         
	//   48   99:invokevirtual   #537 <Method int i()>
	//   49  102:i2l             
	//   50  103:fconst_1        
	//   51  104:invokestatic    #542 <Method long SystemClock.elapsedRealtime()>
	//   52  107:invokevirtual   #545 <Method bn bn.a(int, long, float, long)>
	//   53  110:invokevirtual   #548 <Method android.support.v4.media.session.PlaybackStateCompat bn.a()>
	//   54  113:astore          6
		h.a(((android.support.v4.media.session.PlaybackStateCompat) (obj)));
	//   55  115:aload_0         
	//   56  116:getfield        #356 <Field MediaSessionCompat h>
	//   57  119:aload           6
	//   58  121:invokevirtual   #551 <Method void MediaSessionCompat.a(android.support.v4.media.session.PlaybackStateCompat)>
	//   59  124:return          
	}

	static j f(LocalAudioService localaudioservice)
	{
		return localaudioservice.f;
	//    0    0:aload_0         
	//    1    1:getfield        #554 <Field j f>
	//    2    4:areturn         
	}

	private void f(int i1)
	{
		SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(((android.content.Context) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #560 <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(android.content.Context)>
	//    2    4:astore_3        
		if(!sharedpreferences.getBoolean("normalize_volume", true))
	//*   3    5:aload_3         
	//*   4    6:ldc2            #562 <String "normalize_volume">
	//*   5    9:iconst_1        
	//*   6   10:invokeinterface #568 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//*   7   15:ifne            19
		{
			return;
	//    8   18:return          
		} else
		{
			int j1 = sharedpreferences.getInt("normalized_volume", 0);
	//    9   19:aload_3         
	//   10   20:ldc2            #570 <String "normalized_volume">
	//   11   23:iconst_0        
	//   12   24:invokeinterface #574 <Method int SharedPreferences.getInt(String, int)>
	//   13   29:istore_2        
			d.a().a(Integer.valueOf(j1 - i1));
	//   14   30:aload_0         
	//   15   31:getfield        #450 <Field t d>
	//   16   34:invokeinterface #455 <Method biz.bookdesign.librivox.audio.a biz.bookdesign.librivox.audio.t.a()>
	//   17   39:iload_2         
	//   18   40:iload_1         
	//   19   41:isub            
	//   20   42:invokestatic    #492 <Method Integer Integer.valueOf(int)>
	//   21   45:invokeinterface #576 <Method void biz.bookdesign.librivox.audio.a.a(Integer)>
			return;
	//   22   50:return          
		}
	}

	private void x()
	{
		if(a.m() != 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field biz.bookdesign.librivox.b.a a>
	//*   2    4:invokevirtual   #579 <Method int biz.bookdesign.librivox.b.a.m()>
	//*   3    7:iconst_1        
	//*   4    8:icmpeq          12
		{
			return;
	//    5   11:return          
		} else
		{
			Intent intent = new Intent(((android.content.Context) (this)), biz/bookdesign/librivox/ReviewComposeActivity);
	//    6   12:new             #151 <Class Intent>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:ldc2            #581 <Class ReviewComposeActivity>
	//   10   20:invokespecial   #190 <Method void Intent(android.content.Context, Class)>
	//   11   23:astore_1        
			intent.setFlags(0x10000000);
	//   12   24:aload_1         
	//   13   25:ldc1            #236 <Int 0x10000000>
	//   14   27:invokevirtual   #231 <Method Intent Intent.setFlags(int)>
	//   15   30:pop             
			intent.putExtra("lvid", a.p());
	//   16   31:aload_1         
	//   17   32:ldc1            #233 <String "lvid">
	//   18   34:aload_0         
	//   19   35:getfield        #62  <Field biz.bookdesign.librivox.b.a a>
	//   20   38:invokevirtual   #429 <Method int biz.bookdesign.librivox.b.a.p()>
	//   21   41:invokevirtual   #167 <Method Intent Intent.putExtra(String, int)>
	//   22   44:pop             
			startActivity(intent);
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:invokevirtual   #585 <Method void startActivity(Intent)>
			return;
	//   26   50:return          
		}
	}

	private void y()
	{
		m m1 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field m b>
	//    2    4:astore_1        
		if(m1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			a.a(m1.b(), i());
	//    6   10:aload_0         
	//    7   11:getfield        #62  <Field biz.bookdesign.librivox.b.a a>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #163 <Method int m.b()>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #537 <Method int i()>
	//   12   22:invokevirtual   #589 <Method void biz.bookdesign.librivox.b.a.a(int, int)>
			return;
	//   13   25:return          
		}
	}

	private void z()
	{
		e(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #247 <Method void e(int)>
		stopForeground(true);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #378 <Method void stopForeground(boolean)>
		B();
	//    6   10:aload_0         
	//    7   11:invokespecial   #592 <Method void B()>
		b("biz.bookdesign.librivox.PAUSE_NOTIFICATION");
	//    8   14:aload_0         
	//    9   15:ldc2            #594 <String "biz.bookdesign.librivox.PAUSE_NOTIFICATION">
	//   10   18:invokespecial   #386 <Method void b(String)>
		stopSelf();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #597 <Method void stopSelf()>
	//   13   25:return          
	}

	public void a()
	{
		k.postDelayed(r, 1000L);
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Handler k>
	//    2    4:aload_0         
	//    3    5:getfield        #85  <Field Runnable r>
	//    4    8:ldc2w           #598 <Long 1000L>
	//    5   11:invokevirtual   #603 <Method boolean Handler.postDelayed(Runnable, long)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void a(int i1)
	{
		int j1 = i();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #537 <Method int i()>
	//    2    4:istore_2        
		if(j1 > 0)
	//*   3    5:iload_2         
	//*   4    6:ifle            35
		{
			m m1 = b;
	//    5    9:aload_0         
	//    6   10:getfield        #64  <Field m b>
	//    7   13:astore_3        
			if(m1 != null)
	//*   8   14:aload_3         
	//*   9   15:ifnull          35
			{
				a.a(m1.b(), j1);
	//   10   18:aload_0         
	//   11   19:getfield        #62  <Field biz.bookdesign.librivox.b.a a>
	//   12   22:aload_3         
	//   13   23:invokevirtual   #163 <Method int m.b()>
	//   14   26:iload_2         
	//   15   27:invokevirtual   #589 <Method void biz.bookdesign.librivox.b.a.a(int, int)>
				d(j1);
	//   16   30:aload_0         
	//   17   31:iload_2         
	//   18   32:invokevirtual   #605 <Method void d(int)>
			}
		}
		if((i1 == -1004 || i1 == -110 || i1 == -1007) && b != null)
	//*  19   35:iload_1         
	//*  20   36:sipush          -1004
	//*  21   39:icmpeq          55
	//*  22   42:iload_1         
	//*  23   43:bipush          -110
	//*  24   45:icmpeq          55
	//*  25   48:iload_1         
	//*  26   49:sipush          -1007
	//*  27   52:icmpne          179
	//*  28   55:aload_0         
	//*  29   56:getfield        #64  <Field m b>
	//*  30   59:ifnull          179
		{
			Bundle bundle = new Bundle();
	//   31   62:new             #192 <Class Bundle>
	//   32   65:dup             
	//   33   66:invokespecial   #193 <Method void Bundle()>
	//   34   69:astore_3        
			bundle.putString("item_id", a.f());
	//   35   70:aload_3         
	//   36   71:ldc2            #607 <String "item_id">
	//   37   74:aload_0         
	//   38   75:getfield        #62  <Field biz.bookdesign.librivox.b.a a>
	//   39   78:invokevirtual   #609 <Method String biz.bookdesign.librivox.b.a.f()>
	//   40   81:invokevirtual   #613 <Method void Bundle.putString(String, String)>
			bundle.putString("item_name", a.b());
	//   41   84:aload_3         
	//   42   85:ldc2            #615 <String "item_name">
	//   43   88:aload_0         
	//   44   89:getfield        #62  <Field biz.bookdesign.librivox.b.a a>
	//   45   92:invokevirtual   #185 <Method String biz.bookdesign.librivox.b.a.b()>
	//   46   95:invokevirtual   #613 <Method void Bundle.putString(String, String)>
			bundle.putInt("chid", b.b());
	//   47   98:aload_3         
	//   48   99:ldc2            #617 <String "chid">
	//   49  102:aload_0         
	//   50  103:getfield        #64  <Field m b>
	//   51  106:invokevirtual   #163 <Method int m.b()>
	//   52  109:invokevirtual   #621 <Method void Bundle.putInt(String, int)>
			if(l)
	//*  53  112:aload_0         
	//*  54  113:getfield        #66  <Field boolean l>
	//*  55  116:ifeq            133
			{
				j.a("cache_fail", bundle);
	//   56  119:aload_0         
	//   57  120:getfield        #623 <Field FirebaseAnalytics j>
	//   58  123:ldc2            #625 <String "cache_fail">
	//   59  126:aload_3         
	//   60  127:invokevirtual   #630 <Method void FirebaseAnalytics.a(String, Bundle)>
			} else
	//*  61  130:goto            179
			{
				Uri uri = b.f();
	//   62  133:aload_0         
	//   63  134:getfield        #64  <Field m b>
	//   64  137:invokevirtual   #632 <Method Uri m.f()>
	//   65  140:astore_3        
				if(uri != null)
	//*  66  141:aload_3         
	//*  67  142:ifnull          179
				{
					l = true;
	//   68  145:aload_0         
	//   69  146:iconst_1        
	//   70  147:putfield        #66  <Field boolean l>
					d.a().a(uri);
	//   71  150:aload_0         
	//   72  151:getfield        #450 <Field t d>
	//   73  154:invokeinterface #455 <Method biz.bookdesign.librivox.audio.a biz.bookdesign.librivox.audio.t.a()>
	//   74  159:aload_3         
	//   75  160:invokeinterface #460 <Method void biz.bookdesign.librivox.audio.a.a(Uri)>
					d.a().b();
	//   76  165:aload_0         
	//   77  166:getfield        #450 <Field t d>
	//   78  169:invokeinterface #455 <Method biz.bookdesign.librivox.audio.a biz.bookdesign.librivox.audio.t.a()>
	//   79  174:invokeinterface #499 <Method void biz.bookdesign.librivox.audio.a.b()>
				}
			}
		}
		z();
	//   80  179:aload_0         
	//   81  180:invokespecial   #634 <Method void z()>
		a(true);
	//   82  183:aload_0         
	//   83  184:iconst_1        
	//   84  185:invokevirtual   #636 <Method void a(boolean)>
		b("biz.bookdesign.librivox.ERROR");
	//   85  188:aload_0         
	//   86  189:ldc2            #638 <String "biz.bookdesign.librivox.ERROR">
	//   87  192:invokespecial   #386 <Method void b(String)>
	//   88  195:return          
	}

	public void a(long l1, boolean flag)
	{
		n = flag;
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:putfield        #68  <Field boolean n>
		k.removeCallbacks(p);
	//    3    5:aload_0         
	//    4    6:getfield        #60  <Field Handler k>
	//    5    9:aload_0         
	//    6   10:getfield        #75  <Field Runnable p>
	//    7   13:invokevirtual   #109 <Method void Handler.removeCallbacks(Runnable)>
		if(flag)
	//*   8   16:iload_3         
	//*   9   17:ifeq            28
		{
			m = 0L;
	//   10   20:aload_0         
	//   11   21:lconst_0        
	//   12   22:putfield        #105 <Field long m>
		} else
	//*  13   25:goto            97
		{
			m = System.currentTimeMillis() + l1;
	//   14   28:aload_0         
	//   15   29:invokestatic    #644 <Method long System.currentTimeMillis()>
	//   16   32:lload_1         
	//   17   33:ladd            
	//   18   34:putfield        #105 <Field long m>
			k.postDelayed(p, l1);
	//   19   37:aload_0         
	//   20   38:getfield        #60  <Field Handler k>
	//   21   41:aload_0         
	//   22   42:getfield        #75  <Field Runnable p>
	//   23   45:lload_1         
	//   24   46:invokevirtual   #603 <Method boolean Handler.postDelayed(Runnable, long)>
	//   25   49:pop             
			if(PreferenceManager.getDefaultSharedPreferences(((android.content.Context) (this))).getBoolean("sleep_timer_shake", true) && i.a((SensorManager)getSystemService("sensor")))
	//*  26   50:aload_0         
	//*  27   51:invokestatic    #560 <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(android.content.Context)>
	//*  28   54:ldc2            #646 <String "sleep_timer_shake">
	//*  29   57:iconst_1        
	//*  30   58:invokeinterface #568 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//*  31   63:ifeq            97
	//*  32   66:aload_0         
	//*  33   67:getfield        #113 <Field a i>
	//*  34   70:aload_0         
	//*  35   71:ldc2            #648 <String "sensor">
	//*  36   74:invokevirtual   #652 <Method Object getSystemService(String)>
	//*  37   77:checkcast       #654 <Class SensorManager>
	//*  38   80:invokevirtual   #657 <Method boolean a.a(SensorManager)>
	//*  39   83:ifeq            97
				Toast.makeText(((android.content.Context) (this)), k.shake_to_extend, 0).show();
	//   40   86:aload_0         
	//   41   87:getstatic       #660 <Field int k.shake_to_extend>
	//   42   90:iconst_0        
	//   43   91:invokestatic    #666 <Method Toast Toast.makeText(android.content.Context, int, int)>
	//   44   94:invokevirtual   #669 <Method void Toast.show()>
		}
		t();
	//   45   97:aload_0         
	//   46   98:invokevirtual   #111 <Method void t()>
	//   47  101:return          
	}

	public void a(SurfaceHolder surfaceholder)
	{
		d.a(surfaceholder);
	//    0    0:aload_0         
	//    1    1:getfield        #450 <Field t d>
	//    2    4:aload_1         
	//    3    5:invokeinterface #672 <Method void biz.bookdesign.librivox.audio.t.a(SurfaceHolder)>
	//    4   10:return          
	}

	void a(biz.bookdesign.librivox.b.a a1)
	{
		boolean flag = a1 instanceof q;
	//    0    0:aload_1         
	//    1    1:instanceof      #675 <Class q>
	//    2    4:istore_3        
		int i1 = 1;
	//    3    5:iconst_1        
	//    4    6:istore_2        
		if(flag && a1.m() == 1 && a1.o() != 1)
	//*   5    7:iload_3         
	//*   6    8:ifeq            42
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #579 <Method int biz.bookdesign.librivox.b.a.m()>
	//*   9   15:iconst_1        
	//*  10   16:icmpne          42
	//*  11   19:aload_1         
	//*  12   20:invokevirtual   #677 <Method int biz.bookdesign.librivox.b.a.o()>
	//*  13   23:iconst_1        
	//*  14   24:icmpeq          42
		{
			Toast.makeText(getApplicationContext(), k.download_retail, 0).show();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #207 <Method android.content.Context getApplicationContext()>
	//   17   31:getstatic       #680 <Field int k.download_retail>
	//   18   34:iconst_0        
	//   19   35:invokestatic    #666 <Method Toast Toast.makeText(android.content.Context, int, int)>
	//   20   38:invokevirtual   #669 <Method void Toast.show()>
			return;
	//   21   41:return          
		}
		h();
	//   22   42:aload_0         
	//   23   43:invokevirtual   #682 <Method void h()>
		Integer integer = null;
	//   24   46:aconst_null     
	//   25   47:astore          4
		i j1 = a1.z();
	//   26   49:aload_1         
	//   27   50:invokevirtual   #685 <Method i biz.bookdesign.librivox.b.a.z()>
	//   28   53:astore          5
		if(j1 != null)
	//*  29   55:aload           5
	//*  30   57:ifnull          77
		{
			i1 = j1.c();
	//   31   60:aload           5
	//   32   62:invokevirtual   #689 <Method int i.c()>
	//   33   65:istore_2        
			integer = Integer.valueOf((int)j1.e());
	//   34   66:aload           5
	//   35   68:invokevirtual   #691 <Method long i.e()>
	//   36   71:l2i             
	//   37   72:invokestatic    #492 <Method Integer Integer.valueOf(int)>
	//   38   75:astore          4
		}
		a = a1;
	//   39   77:aload_0         
	//   40   78:aload_1         
	//   41   79:putfield        #62  <Field biz.bookdesign.librivox.b.a a>
		a(a.b(i1));
	//   42   82:aload_0         
	//   43   83:aload_0         
	//   44   84:getfield        #62  <Field biz.bookdesign.librivox.b.a a>
	//   45   87:iload_2         
	//   46   88:invokevirtual   #694 <Method m biz.bookdesign.librivox.b.a.b(int)>
	//   47   91:invokespecial   #696 <Method void a(m)>
		a(integer);
	//   48   94:aload_0         
	//   49   95:aload           4
	//   50   97:invokespecial   #697 <Method void a(Integer)>
	//   51  100:return          
	}

	public void a(boolean flag)
	{
		k.removeCallbacks(r);
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Handler k>
	//    2    4:aload_0         
	//    3    5:getfield        #85  <Field Runnable r>
	//    4    8:invokevirtual   #109 <Method void Handler.removeCallbacks(Runnable)>
		k.removeCallbacks(q);
	//    5   11:aload_0         
	//    6   12:getfield        #60  <Field Handler k>
	//    7   15:aload_0         
	//    8   16:getfield        #80  <Field Runnable q>
	//    9   19:invokevirtual   #109 <Method void Handler.removeCallbacks(Runnable)>
		Intent intent = new Intent("biz.bookdesign.librivox.BUFFERING_STOP");
	//   10   22:new             #151 <Class Intent>
	//   11   25:dup             
	//   12   26:ldc2            #699 <String "biz.bookdesign.librivox.BUFFERING_STOP">
	//   13   29:invokespecial   #156 <Method void Intent(String)>
	//   14   32:astore_2        
		if(flag)
	//*  15   33:iload_1         
	//*  16   34:ifeq            49
			intent.putExtra("biz.bookdesign.librivox.ERROR", true);
	//   17   37:aload_2         
	//   18   38:ldc2            #638 <String "biz.bookdesign.librivox.ERROR">
	//   19   41:iconst_1        
	//   20   42:invokevirtual   #702 <Method Intent Intent.putExtra(String, boolean)>
	//   21   45:pop             
		else
	//*  22   46:goto            53
			A();
	//   23   49:aload_0         
	//   24   50:invokespecial   #704 <Method void A()>
		e.a(intent);
	//   25   53:aload_0         
	//   26   54:getfield        #169 <Field g e>
	//   27   57:aload_2         
	//   28   58:invokevirtual   #174 <Method boolean g.a(Intent)>
	//   29   61:pop             
	//   30   62:return          
	}

	boolean a(Intent intent)
	{
		if(!"android.intent.action.MEDIA_BUTTON".equals(((Object) (intent.getAction()))))
	//*   0    0:ldc2            #706 <String "android.intent.action.MEDIA_BUTTON">
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #709 <Method String Intent.getAction()>
	//*   3    7:invokevirtual   #710 <Method boolean String.equals(Object)>
	//*   4   10:ifne            15
			return false;
	//    5   13:iconst_0        
	//    6   14:ireturn         
		KeyEvent keyevent = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
	//    7   15:aload_1         
	//    8   16:ldc2            #712 <String "android.intent.extra.KEY_EVENT">
	//    9   19:invokevirtual   #716 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   10   22:checkcast       #718 <Class KeyEvent>
	//   11   25:astore_3        
		if(keyevent == null)
	//*  12   26:aload_3         
	//*  13   27:ifnonnull       32
			return false;
	//   14   30:iconst_0        
	//   15   31:ireturn         
		if(keyevent.getAction() != 0)
	//*  16   32:aload_3         
	//*  17   33:invokevirtual   #720 <Method int KeyEvent.getAction()>
	//*  18   36:ifeq            41
			return false;
	//   19   39:iconst_0        
	//   20   40:ireturn         
		int i1 = keyevent.getKeyCode();
	//   21   41:aload_3         
	//   22   42:invokevirtual   #723 <Method int KeyEvent.getKeyCode()>
	//   23   45:istore_2        
		if(i1 != 79)
	//*  24   46:iload_2         
	//*  25   47:bipush          79
	//*  26   49:icmpeq          212
			switch(i1)
	//*  27   52:iload_2         
			{
	//*  28   53:tableswitch     85 90: default 92
	//	               85 212
	//	               86 206
	//	               87 200
	//	               88 194
	//	               89 180
	//	               90 166
			default:
				switch(i1)
	//*  29   92:iload_2         
				{
	//*  30   93:tableswitch     126 127: default 116
	//	               126 160
	//	               127 154
				default:
					StringBuilder stringbuilder = new StringBuilder();
	//   31  116:new             #287 <Class StringBuilder>
	//   32  119:dup             
	//   33  120:invokespecial   #288 <Method void StringBuilder()>
	//   34  123:astore_3        
					stringbuilder.append("Unsupported media key action: ");
	//   35  124:aload_3         
	//   36  125:ldc2            #725 <String "Unsupported media key action: ">
	//   37  128:invokevirtual   #292 <Method StringBuilder StringBuilder.append(String)>
	//   38  131:pop             
					stringbuilder.append(intent.getAction());
	//   39  132:aload_3         
	//   40  133:aload_1         
	//   41  134:invokevirtual   #709 <Method String Intent.getAction()>
	//   42  137:invokevirtual   #292 <Method StringBuilder StringBuilder.append(String)>
	//   43  140:pop             
					com.crashlytics.android.a.a(5, "LibriVox-AudioService", stringbuilder.toString());
	//   44  141:iconst_5        
	//   45  142:ldc2            #470 <String "LibriVox-AudioService">
	//   46  145:aload_3         
	//   47  146:invokevirtual   #297 <Method String StringBuilder.toString()>
	//   48  149:invokestatic    #477 <Method void com.crashlytics.android.a.a(int, String, String)>
					return false;
	//   49  152:iconst_0        
	//   50  153:ireturn         

				case 127: // '\177'
					m();
	//   51  154:aload_0         
	//   52  155:invokevirtual   #727 <Method void m()>
					return true;
	//   53  158:iconst_1        
	//   54  159:ireturn         

				case 126: // '~'
					n();
	//   55  160:aload_0         
	//   56  161:invokevirtual   #729 <Method void n()>
					return true;
	//   57  164:iconst_1        
	//   58  165:ireturn         
				}

			case 90: // 'Z'
				d(i() + 30000);
	//   59  166:aload_0         
	//   60  167:aload_0         
	//   61  168:invokevirtual   #537 <Method int i()>
	//   62  171:sipush          30000
	//   63  174:iadd            
	//   64  175:invokevirtual   #605 <Method void d(int)>
				return true;
	//   65  178:iconst_1        
	//   66  179:ireturn         

			case 89: // 'Y'
				d(i() - 10000);
	//   67  180:aload_0         
	//   68  181:aload_0         
	//   69  182:invokevirtual   #537 <Method int i()>
	//   70  185:sipush          10000
	//   71  188:isub            
	//   72  189:invokevirtual   #605 <Method void d(int)>
				return true;
	//   73  192:iconst_1        
	//   74  193:ireturn         

			case 88: // 'X'
				p();
	//   75  194:aload_0         
	//   76  195:invokevirtual   #731 <Method void p()>
				return true;
	//   77  198:iconst_1        
	//   78  199:ireturn         

			case 87: // 'W'
				o();
	//   79  200:aload_0         
	//   80  201:invokevirtual   #733 <Method void o()>
				return true;
	//   81  204:iconst_1        
	//   82  205:ireturn         

			case 86: // 'V'
				m();
	//   83  206:aload_0         
	//   84  207:invokevirtual   #727 <Method void m()>
				return true;
	//   85  210:iconst_1        
	//   86  211:ireturn         

			case 85: // 'U'
				break;
			}
		if(k())
	//*  87  212:aload_0         
	//*  88  213:invokevirtual   #244 <Method boolean k()>
	//*  89  216:ifeq            225
		{
			m();
	//   90  219:aload_0         
	//   91  220:invokevirtual   #727 <Method void m()>
			return true;
	//   92  223:iconst_1        
	//   93  224:ireturn         
		} else
		{
			n();
	//   94  225:aload_0         
	//   95  226:invokevirtual   #729 <Method void n()>
			return true;
	//   96  229:iconst_1        
	//   97  230:ireturn         
		}
	}

	public void b()
	{
		D();
	//    0    0:aload_0         
	//    1    1:invokespecial   #102 <Method void D()>
		q();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #99  <Method void q()>
	//    4    8:return          
	}

	public void b(int i1)
	{
		Intent intent = new Intent("biz.bookdesign.librivox.BUFFER_STATUS_NOTIFICATION");
	//    0    0:new             #151 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc2            #735 <String "biz.bookdesign.librivox.BUFFER_STATUS_NOTIFICATION">
	//    3    7:invokespecial   #156 <Method void Intent(String)>
	//    4   10:astore_2        
		intent.putExtra("biz.bookdesign.librivox.BUFFER_STATUS", i1);
	//    5   11:aload_2         
	//    6   12:ldc2            #737 <String "biz.bookdesign.librivox.BUFFER_STATUS">
	//    7   15:iload_1         
	//    8   16:invokevirtual   #167 <Method Intent Intent.putExtra(String, int)>
	//    9   19:pop             
		e.a(intent);
	//   10   20:aload_0         
	//   11   21:getfield        #169 <Field g e>
	//   12   24:aload_2         
	//   13   25:invokevirtual   #174 <Method boolean g.a(Intent)>
	//   14   28:pop             
	//   15   29:return          
	}

	public void c()
	{
		b("biz.bookdesign.librivox.data_restricted");
	//    0    0:aload_0         
	//    1    1:ldc2            #739 <String "biz.bookdesign.librivox.data_restricted">
	//    2    4:invokespecial   #386 <Method void b(String)>
	//    3    7:return          
	}

	void c(int i1)
	{
		if(f.b(i1) > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #554 <Field j f>
	//*   2    4:iload_1         
	//*   3    5:i2l             
	//*   4    6:invokevirtual   #744 <Method int j.b(long)>
	//*   5    9:ifle            29
		{
			a(biz.bookdesign.librivox.b.a.a(i1, getApplicationContext(), f));
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #207 <Method android.content.Context getApplicationContext()>
	//   10   18:aload_0         
	//   11   19:getfield        #554 <Field j f>
	//   12   22:invokestatic    #747 <Method biz.bookdesign.librivox.b.a biz.bookdesign.librivox.b.a.a(int, android.content.Context, j)>
	//   13   25:invokevirtual   #749 <Method void a(biz.bookdesign.librivox.b.a)>
			return;
	//   14   28:return          
		} else
		{
			((AsyncTask) (new f(this))).execute(((Object []) (new Integer[] {
				Integer.valueOf(i1)
			})));
	//   15   29:new             #751 <Class f>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:invokespecial   #752 <Method void f(LocalAudioService)>
	//   19   37:iconst_1        
	//   20   38:anewarray       Integer[]
	//   21   41:dup             
	//   22   42:iconst_0        
	//   23   43:iload_1         
	//   24   44:invokestatic    #492 <Method Integer Integer.valueOf(int)>
	//   25   47:aastore         
	//   26   48:invokevirtual   #758 <Method AsyncTask AsyncTask.execute(Object[])>
	//   27   51:pop             
			return;
	//   28   52:return          
		}
	}

	public void d()
	{
		b("biz.bookdesign.librivox.PAUSE_NOTIFICATION");
	//    0    0:aload_0         
	//    1    1:ldc2            #594 <String "biz.bookdesign.librivox.PAUSE_NOTIFICATION">
	//    2    4:invokespecial   #386 <Method void b(String)>
		q();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #99  <Method void q()>
	//    5   11:return          
	}

	public void d(int i1)
	{
		d.a().a(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #450 <Field t d>
	//    2    4:invokeinterface #455 <Method biz.bookdesign.librivox.audio.a biz.bookdesign.librivox.audio.t.a()>
	//    3    9:iload_1         
	//    4   10:invokeinterface #497 <Method void biz.bookdesign.librivox.audio.a.a(int)>
	//    5   15:return          
	}

	public void e()
	{
		if(a.l() && m == 0L && ((bw)getApplication()).k().a(this, d.a(), a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field biz.bookdesign.librivox.b.a a>
	//*   2    4:invokevirtual   #760 <Method boolean biz.bookdesign.librivox.b.a.l()>
	//*   3    7:ifeq            52
	//*   4   10:aload_0         
	//*   5   11:getfield        #105 <Field long m>
	//*   6   14:lconst_0        
	//*   7   15:lcmp            
	//*   8   16:ifne            52
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #764 <Method android.app.Application getApplication()>
	//*  11   23:checkcast       #766 <Class bw>
	//*  12   26:invokevirtual   #769 <Method bx bw.k()>
	//*  13   29:aload_0         
	//*  14   30:aload_0         
	//*  15   31:getfield        #450 <Field t d>
	//*  16   34:invokeinterface #455 <Method biz.bookdesign.librivox.audio.a biz.bookdesign.librivox.audio.t.a()>
	//*  17   39:aload_0         
	//*  18   40:getfield        #62  <Field biz.bookdesign.librivox.b.a a>
	//*  19   43:invokeinterface #774 <Method boolean bx.a(LocalAudioService, biz.bookdesign.librivox.audio.a, biz.bookdesign.librivox.b.a)>
	//*  20   48:ifeq            52
			return;
	//   21   51:return          
		stopForeground(true);
	//   22   52:aload_0         
	//   23   53:iconst_1        
	//   24   54:invokevirtual   #378 <Method void stopForeground(boolean)>
		m m1 = b;
	//   25   57:aload_0         
	//   26   58:getfield        #64  <Field m b>
	//   27   61:astore_2        
		if(m1 != null)
	//*  28   62:aload_2         
	//*  29   63:ifnull          162
		{
			if(m1.b() == a.D())
	//*  30   66:aload_2         
	//*  31   67:invokevirtual   #163 <Method int m.b()>
	//*  32   70:aload_0         
	//*  33   71:getfield        #62  <Field biz.bookdesign.librivox.b.a a>
	//*  34   74:invokevirtual   #415 <Method int biz.bookdesign.librivox.b.a.D()>
	//*  35   77:icmpne          114
			{
				a(((m) (null)));
	//   36   80:aload_0         
	//   37   81:aconst_null     
	//   38   82:invokespecial   #696 <Method void a(m)>
				x();
	//   39   85:aload_0         
	//   40   86:invokespecial   #776 <Method void x()>
				int i1 = (int)a.b(1).o();
	//   41   89:aload_0         
	//   42   90:getfield        #62  <Field biz.bookdesign.librivox.b.a a>
	//   43   93:iconst_1        
	//   44   94:invokevirtual   #694 <Method m biz.bookdesign.librivox.b.a.b(int)>
	//   45   97:invokevirtual   #487 <Method long m.o()>
	//   46  100:l2i             
	//   47  101:istore_1        
				a.a(1, i1);
	//   48  102:aload_0         
	//   49  103:getfield        #62  <Field biz.bookdesign.librivox.b.a a>
	//   50  106:iconst_1        
	//   51  107:iload_1         
	//   52  108:invokevirtual   #589 <Method void biz.bookdesign.librivox.b.a.a(int, int)>
			} else
	//*  53  111:goto            158
			{
				a(a.c(b.b() + 1));
	//   54  114:aload_0         
	//   55  115:aload_0         
	//   56  116:getfield        #62  <Field biz.bookdesign.librivox.b.a a>
	//   57  119:aload_0         
	//   58  120:getfield        #64  <Field m b>
	//   59  123:invokevirtual   #163 <Method int m.b()>
	//   60  126:iconst_1        
	//   61  127:iadd            
	//   62  128:invokevirtual   #778 <Method m biz.bookdesign.librivox.b.a.c(int)>
	//   63  131:invokespecial   #696 <Method void a(m)>
				int j1 = (int)b.o();
	//   64  134:aload_0         
	//   65  135:getfield        #64  <Field m b>
	//   66  138:invokevirtual   #487 <Method long m.o()>
	//   67  141:l2i             
	//   68  142:istore_1        
				a.a(b.b(), j1);
	//   69  143:aload_0         
	//   70  144:getfield        #62  <Field biz.bookdesign.librivox.b.a a>
	//   71  147:aload_0         
	//   72  148:getfield        #64  <Field m b>
	//   73  151:invokevirtual   #163 <Method int m.b()>
	//   74  154:iload_1         
	//   75  155:invokevirtual   #589 <Method void biz.bookdesign.librivox.b.a.a(int, int)>
			}
			D();
	//   76  158:aload_0         
	//   77  159:invokespecial   #102 <Method void D()>
		}
		if(n)
	//*  78  162:aload_0         
	//*  79  163:getfield        #68  <Field boolean n>
	//*  80  166:ifeq            179
		{
			n = false;
	//   81  169:aload_0         
	//   82  170:iconst_0        
	//   83  171:putfield        #68  <Field boolean n>
			m();
	//   84  174:aload_0         
	//   85  175:invokevirtual   #727 <Method void m()>
			return;
	//   86  178:return          
		} else
		{
			a(((Integer) (null)));
	//   87  179:aload_0         
	//   88  180:aconst_null     
	//   89  181:invokespecial   #697 <Method void a(Integer)>
			return;
	//   90  184:return          
		}
	}

	public m f()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field m b>
	//    2    4:areturn         
	}

	public android.support.v4.media.session.MediaSessionCompat.Token g()
	{
		return h.c();
	//    0    0:aload_0         
	//    1    1:getfield        #356 <Field MediaSessionCompat h>
	//    2    4:invokevirtual   #361 <Method android.support.v4.media.session.MediaSessionCompat$Token MediaSessionCompat.c()>
	//    3    7:areturn         
	}

	public void h()
	{
		if(k())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #244 <Method boolean k()>
	//*   2    4:ifeq            11
			y();
	//    3    7:aload_0         
	//    4    8:invokespecial   #781 <Method void y()>
		z();
	//    5   11:aload_0         
	//    6   12:invokespecial   #634 <Method void z()>
	//    7   15:return          
	}

	public int i()
	{
		return d.a().c();
	//    0    0:aload_0         
	//    1    1:getfield        #450 <Field t d>
	//    2    4:invokeinterface #455 <Method biz.bookdesign.librivox.audio.a biz.bookdesign.librivox.audio.t.a()>
	//    3    9:invokeinterface #782 <Method int biz.bookdesign.librivox.audio.a.c()>
	//    4   14:ireturn         
	}

	public int j()
	{
		Object obj = ((Object) (d.a().e()));
	//    0    0:aload_0         
	//    1    1:getfield        #450 <Field t d>
	//    2    4:invokeinterface #455 <Method biz.bookdesign.librivox.audio.a biz.bookdesign.librivox.audio.t.a()>
	//    3    9:invokeinterface #785 <Method Integer biz.bookdesign.librivox.audio.a.e()>
	//    4   14:astore_1        
		if(obj != null)
	//*   5   15:aload_1         
	//*   6   16:ifnull          24
			return ((Integer) (obj)).intValue();
	//    7   19:aload_1         
	//    8   20:invokevirtual   #495 <Method int Integer.intValue()>
	//    9   23:ireturn         
		obj = ((Object) (b));
	//   10   24:aload_0         
	//   11   25:getfield        #64  <Field m b>
	//   12   28:astore_1        
		if(obj != null)
	//*  13   29:aload_1         
	//*  14   30:ifnull          39
			return (int)((m) (obj)).q();
	//   15   33:aload_1         
	//   16   34:invokevirtual   #787 <Method long m.q()>
	//   17   37:l2i             
	//   18   38:ireturn         
		else
			return 0;
	//   19   39:iconst_0        
	//   20   40:ireturn         
	}

	public boolean k()
	{
		return d.a().f();
	//    0    0:aload_0         
	//    1    1:getfield        #450 <Field t d>
	//    2    4:invokeinterface #455 <Method biz.bookdesign.librivox.audio.a biz.bookdesign.librivox.audio.t.a()>
	//    3    9:invokeinterface #789 <Method boolean a.f()>
	//    4   14:ireturn         
	}

	public boolean l()
	{
		return d.a().g();
	//    0    0:aload_0         
	//    1    1:getfield        #450 <Field t d>
	//    2    4:invokeinterface #455 <Method biz.bookdesign.librivox.audio.a biz.bookdesign.librivox.audio.t.a()>
	//    3    9:invokeinterface #791 <Method boolean biz.bookdesign.librivox.audio.a.g()>
	//    4   14:ireturn         
	}

	public void m()
	{
		d.a().h();
	//    0    0:aload_0         
	//    1    1:getfield        #450 <Field t d>
	//    2    4:invokeinterface #455 <Method biz.bookdesign.librivox.audio.a biz.bookdesign.librivox.audio.t.a()>
	//    3    9:invokeinterface #792 <Method void a.h()>
		if(b == null)
	//*   4   14:aload_0         
	//*   5   15:getfield        #64  <Field m b>
	//*   6   18:ifnonnull       32
		{
			com.crashlytics.android.a.a(4, "LibriVox-AudioService", "pause called with null chapter");
	//    7   21:iconst_4        
	//    8   22:ldc2            #470 <String "LibriVox-AudioService">
	//    9   25:ldc2            #794 <String "pause called with null chapter">
	//   10   28:invokestatic    #477 <Method void com.crashlytics.android.a.a(int, String, String)>
			return;
	//   11   31:return          
		} else
		{
			q();
	//   12   32:aload_0         
	//   13   33:invokevirtual   #99  <Method void q()>
			y();
	//   14   36:aload_0         
	//   15   37:invokespecial   #781 <Method void y()>
			B();
	//   16   40:aload_0         
	//   17   41:invokespecial   #592 <Method void B()>
			b("biz.bookdesign.librivox.PAUSE_NOTIFICATION");
	//   18   44:aload_0         
	//   19   45:ldc2            #594 <String "biz.bookdesign.librivox.PAUSE_NOTIFICATION">
	//   20   48:invokespecial   #386 <Method void b(String)>
			return;
	//   21   51:return          
		}
	}

	public void n()
	{
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field m b>
	//*   2    4:ifnonnull       18
		{
			com.crashlytics.android.a.a(4, "LibriVox-AudioService", "Can not start playback: no chapter loaded.");
	//    3    7:iconst_4        
	//    4    8:ldc2            #470 <String "LibriVox-AudioService">
	//    5   11:ldc2            #796 <String "Can not start playback: no chapter loaded.">
	//    6   14:invokestatic    #477 <Method void com.crashlytics.android.a.a(int, String, String)>
			return;
	//    7   17:return          
		} else
		{
			d.a().i();
	//    8   18:aload_0         
	//    9   19:getfield        #450 <Field t d>
	//   10   22:invokeinterface #455 <Method biz.bookdesign.librivox.audio.a biz.bookdesign.librivox.audio.t.a()>
	//   11   27:invokeinterface #798 <Method void biz.bookdesign.librivox.audio.a.i()>
			return;
	//   12   32:return          
		}
	}

	public void o()
	{
		m m1 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field m b>
	//    2    4:astore_1        
		if(m1 != null && m1.b() < a.D())
	//*   3    5:aload_1         
	//*   4    6:ifnull          52
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #163 <Method int m.b()>
	//*   7   13:aload_0         
	//*   8   14:getfield        #62  <Field biz.bookdesign.librivox.b.a a>
	//*   9   17:invokevirtual   #415 <Method int biz.bookdesign.librivox.b.a.D()>
	//*  10   20:icmpge          52
		{
			m();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #727 <Method void m()>
			a(a.c(b.b() + 1));
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #62  <Field biz.bookdesign.librivox.b.a a>
	//   16   32:aload_0         
	//   17   33:getfield        #64  <Field m b>
	//   18   36:invokevirtual   #163 <Method int m.b()>
	//   19   39:iconst_1        
	//   20   40:iadd            
	//   21   41:invokevirtual   #778 <Method m biz.bookdesign.librivox.b.a.c(int)>
	//   22   44:invokespecial   #696 <Method void a(m)>
			a(((Integer) (null)));
	//   23   47:aload_0         
	//   24   48:aconst_null     
	//   25   49:invokespecial   #697 <Method void a(Integer)>
		}
	//   26   52:return          
	}

	public IBinder onBind(Intent intent)
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field IBinder c>
	//    2    4:areturn         
	}

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #803 <Method void Service.onCreate()>
		e = android.support.v4.a.g.a(((android.content.Context) (this)));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokestatic    #806 <Method g g.a(android.content.Context)>
	//    5    9:putfield        #169 <Field g e>
		d = ((t) (new biz.bookdesign.librivox.audio.q(((android.content.Context) (this)), ((biz.bookdesign.librivox.audio.b) (this)))));
	//    6   12:aload_0         
	//    7   13:new             #808 <Class biz.bookdesign.librivox.audio.q>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:invokespecial   #811 <Method void biz.bookdesign.librivox.audio.q(android.content.Context, biz.bookdesign.librivox.audio.b)>
	//   12   22:putfield        #450 <Field t d>
		f = new j(getApplicationContext());
	//   13   25:aload_0         
	//   14   26:new             #741 <Class j>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:invokevirtual   #207 <Method android.content.Context getApplicationContext()>
	//   18   34:invokespecial   #812 <Method void j(android.content.Context)>
	//   19   37:putfield        #554 <Field j f>
		f.a();
	//   20   40:aload_0         
	//   21   41:getfield        #554 <Field j f>
	//   22   44:invokevirtual   #815 <Method j j.a()>
	//   23   47:pop             
		j = FirebaseAnalytics.getInstance(((android.content.Context) (this)));
	//   24   48:aload_0         
	//   25   49:aload_0         
	//   26   50:invokestatic    #819 <Method FirebaseAnalytics FirebaseAnalytics.getInstance(android.content.Context)>
	//   27   53:putfield        #623 <Field FirebaseAnalytics j>
		g = ((BroadcastReceiver) (new biz.bookdesign.librivox.audio.j(this, ((biz.bookdesign.librivox.audio.c) (null)))));
	//   28   56:aload_0         
	//   29   57:new             #821 <Class biz.bookdesign.librivox.audio.j>
	//   30   60:dup             
	//   31   61:aload_0         
	//   32   62:aconst_null     
	//   33   63:invokespecial   #824 <Method void biz.bookdesign.librivox.audio.j(LocalAudioService, biz.bookdesign.librivox.audio.c)>
	//   34   66:putfield        #826 <Field BroadcastReceiver g>
		Object obj = ((Object) (new IntentFilter()));
	//   35   69:new             #828 <Class IntentFilter>
	//   36   72:dup             
	//   37   73:invokespecial   #829 <Method void IntentFilter()>
	//   38   76:astore_1        
		((IntentFilter) (obj)).addAction("android.intent.action.MEDIA_BUTTON");
	//   39   77:aload_1         
	//   40   78:ldc2            #706 <String "android.intent.action.MEDIA_BUTTON">
	//   41   81:invokevirtual   #832 <Method void IntentFilter.addAction(String)>
		((IntentFilter) (obj)).addAction("biz.bookdesign.librivox.VOLUME_BOOST");
	//   42   84:aload_1         
	//   43   85:ldc2            #834 <String "biz.bookdesign.librivox.VOLUME_BOOST">
	//   44   88:invokevirtual   #832 <Method void IntentFilter.addAction(String)>
		((IntentFilter) (obj)).addAction("biz.bookdesign.librivox.VOLUME_BOOST_DISABLE");
	//   45   91:aload_1         
	//   46   92:ldc2            #836 <String "biz.bookdesign.librivox.VOLUME_BOOST_DISABLE">
	//   47   95:invokevirtual   #832 <Method void IntentFilter.addAction(String)>
		e.a(g, ((IntentFilter) (obj)));
	//   48   98:aload_0         
	//   49   99:getfield        #169 <Field g e>
	//   50  102:aload_0         
	//   51  103:getfield        #826 <Field BroadcastReceiver g>
	//   52  106:aload_1         
	//   53  107:invokevirtual   #839 <Method void g.a(BroadcastReceiver, IntentFilter)>
		i = new a(((b) (this)));
	//   54  110:aload_0         
	//   55  111:new             #115 <Class a>
	//   56  114:dup             
	//   57  115:aload_0         
	//   58  116:invokespecial   #842 <Method void a(b)>
	//   59  119:putfield        #113 <Field a i>
		h = new MediaSessionCompat(((android.content.Context) (this)), "LibriVox-AudioService", new ComponentName(((Class) (biz/bookdesign/librivox/RemoteControlReceiver)).getPackage().getName(), ((Class) (biz/bookdesign/librivox/RemoteControlReceiver)).getName()), ((PendingIntent) (null)));
	//   60  122:aload_0         
	//   61  123:new             #358 <Class MediaSessionCompat>
	//   62  126:dup             
	//   63  127:aload_0         
	//   64  128:ldc2            #470 <String "LibriVox-AudioService">
	//   65  131:new             #844 <Class ComponentName>
	//   66  134:dup             
	//   67  135:ldc2            #846 <Class RemoteControlReceiver>
	//   68  138:invokevirtual   #852 <Method Package Class.getPackage()>
	//   69  141:invokevirtual   #857 <Method String Package.getName()>
	//   70  144:ldc2            #846 <Class RemoteControlReceiver>
	//   71  147:invokevirtual   #858 <Method String Class.getName()>
	//   72  150:invokespecial   #860 <Method void ComponentName(String, String)>
	//   73  153:aconst_null     
	//   74  154:invokespecial   #863 <Method void MediaSessionCompat(android.content.Context, String, ComponentName, PendingIntent)>
	//   75  157:putfield        #356 <Field MediaSessionCompat h>
		h.a(((android.support.v4.media.session.af) (new biz.bookdesign.librivox.audio.o(this))));
	//   76  160:aload_0         
	//   77  161:getfield        #356 <Field MediaSessionCompat h>
	//   78  164:new             #865 <Class biz.bookdesign.librivox.audio.o>
	//   79  167:dup             
	//   80  168:aload_0         
	//   81  169:invokespecial   #866 <Method void biz.bookdesign.librivox.audio.o(LocalAudioService)>
	//   82  172:invokevirtual   #869 <Method void MediaSessionCompat.a(android.support.v4.media.session.af)>
		h.a(3);
	//   83  175:aload_0         
	//   84  176:getfield        #356 <Field MediaSessionCompat h>
	//   85  179:iconst_3        
	//   86  180:invokevirtual   #870 <Method void MediaSessionCompat.a(int)>
		h.a(true);
	//   87  183:aload_0         
	//   88  184:getfield        #356 <Field MediaSessionCompat h>
	//   89  187:iconst_1        
	//   90  188:invokevirtual   #871 <Method void MediaSessionCompat.a(boolean)>
		obj = ((Object) (biz.bookdesign.librivox.b.i.a(f)));
	//   91  191:aload_0         
	//   92  192:getfield        #554 <Field j f>
	//   93  195:invokestatic    #874 <Method i i.a(j)>
	//   94  198:astore_1        
		if(obj != null)
	//*  95  199:aload_1         
	//*  96  200:ifnull          275
		{
			a = biz.bookdesign.librivox.b.a.a(((i) (obj)).b(), ((android.content.Context) (this)), f);
	//   97  203:aload_0         
	//   98  204:aload_1         
	//   99  205:invokevirtual   #875 <Method int i.b()>
	//  100  208:aload_0         
	//  101  209:aload_0         
	//  102  210:getfield        #554 <Field j f>
	//  103  213:invokestatic    #747 <Method biz.bookdesign.librivox.b.a biz.bookdesign.librivox.b.a.a(int, android.content.Context, j)>
	//  104  216:putfield        #62  <Field biz.bookdesign.librivox.b.a a>
			a(a.b(((i) (obj)).c()));
	//  105  219:aload_0         
	//  106  220:aload_0         
	//  107  221:getfield        #62  <Field biz.bookdesign.librivox.b.a a>
	//  108  224:aload_1         
	//  109  225:invokevirtual   #689 <Method int i.c()>
	//  110  228:invokevirtual   #694 <Method m biz.bookdesign.librivox.b.a.b(int)>
	//  111  231:invokespecial   #696 <Method void a(m)>
			d((int)((i) (obj)).e());
	//  112  234:aload_0         
	//  113  235:aload_1         
	//  114  236:invokevirtual   #691 <Method long i.e()>
	//  115  239:l2i             
	//  116  240:invokevirtual   #605 <Method void d(int)>
			al.b().a(a.a()).b(biz.bookdesign.librivox.a.g.default_book_image).a(biz.bookdesign.librivox.a.g.default_book_image).a(t);
	//  117  243:invokestatic    #880 <Method al al.b()>
	//  118  246:aload_0         
	//  119  247:getfield        #62  <Field biz.bookdesign.librivox.b.a a>
	//  120  250:invokevirtual   #402 <Method String biz.bookdesign.librivox.b.a.a()>
	//  121  253:invokevirtual   #883 <Method bb al.a(String)>
	//  122  256:getstatic       #886 <Field int biz.bookdesign.librivox.a.g.default_book_image>
	//  123  259:invokevirtual   #891 <Method bb bb.b(int)>
	//  124  262:getstatic       #886 <Field int biz.bookdesign.librivox.a.g.default_book_image>
	//  125  265:invokevirtual   #893 <Method bb bb.a(int)>
	//  126  268:aload_0         
	//  127  269:getfield        #95  <Field bj t>
	//  128  272:invokevirtual   #896 <Method void bb.a(bj)>
		}
		e(1);
	//  129  275:aload_0         
	//  130  276:iconst_1        
	//  131  277:invokespecial   #247 <Method void e(int)>
	//  132  280:return          
	}

	public void onDestroy()
	{
		z();
	//    0    0:aload_0         
	//    1    1:invokespecial   #634 <Method void z()>
		e.a(g);
	//    2    4:aload_0         
	//    3    5:getfield        #169 <Field g e>
	//    4    8:aload_0         
	//    5    9:getfield        #826 <Field BroadcastReceiver g>
	//    6   12:invokevirtual   #900 <Method void g.a(BroadcastReceiver)>
		h.b();
	//    7   15:aload_0         
	//    8   16:getfield        #356 <Field MediaSessionCompat h>
	//    9   19:invokevirtual   #901 <Method void MediaSessionCompat.b()>
		d.b();
	//   10   22:aload_0         
	//   11   23:getfield        #450 <Field t d>
	//   12   26:invokeinterface #902 <Method void biz.bookdesign.librivox.audio.t.b()>
		f.b();
	//   13   31:aload_0         
	//   14   32:getfield        #554 <Field j f>
	//   15   35:invokevirtual   #903 <Method void j.b()>
		super.onDestroy();
	//   16   38:aload_0         
	//   17   39:invokespecial   #905 <Method void Service.onDestroy()>
	//   18   42:return          
	}

	public int onStartCommand(Intent intent, int i1, int j1)
	{
		if(intent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return 2;
	//    2    4:iconst_2        
	//    3    5:ireturn         
		intent = ((Intent) (intent.getExtras()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #911 <Method Bundle Intent.getExtras()>
	//    6   10:astore_1        
		if(intent == null)
	//*   7   11:aload_1         
	//*   8   12:ifnonnull       17
			return 2;
	//    9   15:iconst_2        
	//   10   16:ireturn         
		if(((Bundle) (intent)).containsKey("play_key"))
	//*  11   17:aload_1         
	//*  12   18:ldc1            #195 <String "play_key">
	//*  13   20:invokevirtual   #915 <Method boolean Bundle.containsKey(String)>
	//*  14   23:ifeq            45
			if(k())
	//*  15   26:aload_0         
	//*  16   27:invokevirtual   #244 <Method boolean k()>
	//*  17   30:ifeq            39
			{
				m();
	//   18   33:aload_0         
	//   19   34:invokevirtual   #727 <Method void m()>
				return 1;
	//   20   37:iconst_1        
	//   21   38:ireturn         
			} else
			{
				n();
	//   22   39:aload_0         
	//   23   40:invokevirtual   #729 <Method void n()>
				return 1;
	//   24   43:iconst_1        
	//   25   44:ireturn         
			}
		if(((Bundle) (intent)).containsKey("biz.bookdesign.librivox.FAST_FORWARD"))
	//*  26   45:aload_1         
	//*  27   46:ldc1            #216 <String "biz.bookdesign.librivox.FAST_FORWARD">
	//*  28   48:invokevirtual   #915 <Method boolean Bundle.containsKey(String)>
	//*  29   51:ifeq            68
		{
			d(i() + 30000);
	//   30   54:aload_0         
	//   31   55:aload_0         
	//   32   56:invokevirtual   #537 <Method int i()>
	//   33   59:sipush          30000
	//   34   62:iadd            
	//   35   63:invokevirtual   #605 <Method void d(int)>
			return 1;
	//   36   66:iconst_1        
	//   37   67:ireturn         
		}
		if(((Bundle) (intent)).containsKey("biz.bookdesign.librivox.REWIND"))
	//*  38   68:aload_1         
	//*  39   69:ldc1            #218 <String "biz.bookdesign.librivox.REWIND">
	//*  40   71:invokevirtual   #915 <Method boolean Bundle.containsKey(String)>
	//*  41   74:ifeq            91
		{
			d(i() - 10000);
	//   42   77:aload_0         
	//   43   78:aload_0         
	//   44   79:invokevirtual   #537 <Method int i()>
	//   45   82:sipush          10000
	//   46   85:isub            
	//   47   86:invokevirtual   #605 <Method void d(int)>
			return 1;
	//   48   89:iconst_1        
	//   49   90:ireturn         
		}
		i1 = ((Bundle) (intent)).getInt("lvid");
	//   50   91:aload_1         
	//   51   92:ldc1            #233 <String "lvid">
	//   52   94:invokevirtual   #918 <Method int Bundle.getInt(String)>
	//   53   97:istore_2        
		j1 = ((Bundle) (intent)).getInt("chid");
	//   54   98:aload_1         
	//   55   99:ldc2            #617 <String "chid">
	//   56  102:invokevirtual   #918 <Method int Bundle.getInt(String)>
	//   57  105:istore_3        
		Object obj = ((Object) (Integer.valueOf(((Bundle) (intent)).getInt("position", -1))));
	//   58  106:aload_1         
	//   59  107:ldc2            #920 <String "position">
	//   60  110:iconst_m1       
	//   61  111:invokevirtual   #921 <Method int Bundle.getInt(String, int)>
	//   62  114:invokestatic    #492 <Method Integer Integer.valueOf(int)>
	//   63  117:astore          4
		intent = ((Intent) (obj));
	//   64  119:aload           4
	//   65  121:astore_1        
		if(((Integer) (obj)).intValue() == -1)
	//*  66  122:aload           4
	//*  67  124:invokevirtual   #495 <Method int Integer.intValue()>
	//*  68  127:iconst_m1       
	//*  69  128:icmpne          133
			intent = null;
	//   70  131:aconst_null     
	//   71  132:astore_1        
		obj = ((Object) (a));
	//   72  133:aload_0         
	//   73  134:getfield        #62  <Field biz.bookdesign.librivox.b.a a>
	//   74  137:astore          4
		if(obj != null && ((biz.bookdesign.librivox.b.a) (obj)).p() == i1)
	//*  75  139:aload           4
	//*  76  141:ifnull          194
	//*  77  144:aload           4
	//*  78  146:invokevirtual   #429 <Method int biz.bookdesign.librivox.b.a.p()>
	//*  79  149:iload_2         
	//*  80  150:icmpne          194
		{
			obj = ((Object) (b));
	//   81  153:aload_0         
	//   82  154:getfield        #64  <Field m b>
	//   83  157:astore          4
			if(obj != null && ((m) (obj)).b() == j1)
	//*  84  159:aload           4
	//*  85  161:ifnull          194
	//*  86  164:aload           4
	//*  87  166:invokevirtual   #163 <Method int m.b()>
	//*  88  169:iload_3         
	//*  89  170:icmpeq          176
	//*  90  173:goto            194
			{
				if(intent != null)
	//*  91  176:aload_1         
	//*  92  177:ifnull          188
					d(((Integer) (intent)).intValue());
	//   93  180:aload_0         
	//   94  181:aload_1         
	//   95  182:invokevirtual   #495 <Method int Integer.intValue()>
	//   96  185:invokevirtual   #605 <Method void d(int)>
				n();
	//   97  188:aload_0         
	//   98  189:invokevirtual   #729 <Method void n()>
				return 1;
	//   99  192:iconst_1        
	//  100  193:ireturn         
			}
		}
		a = biz.bookdesign.librivox.b.a.a(i1, ((android.content.Context) (this)), f);
	//  101  194:aload_0         
	//  102  195:iload_2         
	//  103  196:aload_0         
	//  104  197:aload_0         
	//  105  198:getfield        #554 <Field j f>
	//  106  201:invokestatic    #747 <Method biz.bookdesign.librivox.b.a biz.bookdesign.librivox.b.a.a(int, android.content.Context, j)>
	//  107  204:putfield        #62  <Field biz.bookdesign.librivox.b.a a>
		a(a.b(j1));
	//  108  207:aload_0         
	//  109  208:aload_0         
	//  110  209:getfield        #62  <Field biz.bookdesign.librivox.b.a a>
	//  111  212:iload_3         
	//  112  213:invokevirtual   #694 <Method m biz.bookdesign.librivox.b.a.b(int)>
	//  113  216:invokespecial   #696 <Method void a(m)>
		obj = ((Object) (intent));
	//  114  219:aload_1         
	//  115  220:astore          4
		if(intent == null)
	//* 116  222:aload_1         
	//* 117  223:ifnonnull       266
		{
			i k1 = a.z();
	//  118  226:aload_0         
	//  119  227:getfield        #62  <Field biz.bookdesign.librivox.b.a a>
	//  120  230:invokevirtual   #685 <Method i biz.bookdesign.librivox.b.a.z()>
	//  121  233:astore          5
			obj = ((Object) (intent));
	//  122  235:aload_1         
	//  123  236:astore          4
			if(k1 != null)
	//* 124  238:aload           5
	//* 125  240:ifnull          266
			{
				obj = ((Object) (intent));
	//  126  243:aload_1         
	//  127  244:astore          4
				if(k1.c() == j1)
	//* 128  246:aload           5
	//* 129  248:invokevirtual   #689 <Method int i.c()>
	//* 130  251:iload_3         
	//* 131  252:icmpne          266
					obj = ((Object) (Integer.valueOf((int)k1.e())));
	//  132  255:aload           5
	//  133  257:invokevirtual   #691 <Method long i.e()>
	//  134  260:l2i             
	//  135  261:invokestatic    #492 <Method Integer Integer.valueOf(int)>
	//  136  264:astore          4
			}
		}
		a(((Integer) (obj)));
	//  137  266:aload_0         
	//  138  267:aload           4
	//  139  269:invokespecial   #697 <Method void a(Integer)>
		return 1;
	//  140  272:iconst_1        
	//  141  273:ireturn         
	}

	public void p()
	{
		m m1 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field m b>
	//    2    4:astore_1        
		if(m1 != null && m1.b() > 1)
	//*   3    5:aload_1         
	//*   4    6:ifnull          46
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #163 <Method int m.b()>
	//*   7   13:iconst_1        
	//*   8   14:icmple          46
		{
			m();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #727 <Method void m()>
			a(a.c(b.b() - 1));
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #62  <Field biz.bookdesign.librivox.b.a a>
	//   14   26:aload_0         
	//   15   27:getfield        #64  <Field m b>
	//   16   30:invokevirtual   #163 <Method int m.b()>
	//   17   33:iconst_1        
	//   18   34:isub            
	//   19   35:invokevirtual   #778 <Method m biz.bookdesign.librivox.b.a.c(int)>
	//   20   38:invokespecial   #696 <Method void a(m)>
			a(((Integer) (null)));
	//   21   41:aload_0         
	//   22   42:aconst_null     
	//   23   43:invokespecial   #697 <Method void a(Integer)>
		}
	//   24   46:return          
	}

	public void q()
	{
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field m b>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			al.b().a(a.a()).b(biz.bookdesign.librivox.a.g.default_book_image).a(biz.bookdesign.librivox.a.g.default_book_image).a(s);
	//    4    8:invokestatic    #880 <Method al al.b()>
	//    5   11:aload_0         
	//    6   12:getfield        #62  <Field biz.bookdesign.librivox.b.a a>
	//    7   15:invokevirtual   #402 <Method String biz.bookdesign.librivox.b.a.a()>
	//    8   18:invokevirtual   #883 <Method bb al.a(String)>
	//    9   21:getstatic       #886 <Field int biz.bookdesign.librivox.a.g.default_book_image>
	//   10   24:invokevirtual   #891 <Method bb bb.b(int)>
	//   11   27:getstatic       #886 <Field int biz.bookdesign.librivox.a.g.default_book_image>
	//   12   30:invokevirtual   #893 <Method bb bb.a(int)>
	//   13   33:aload_0         
	//   14   34:getfield        #90  <Field bj s>
	//   15   37:invokevirtual   #896 <Method void bb.a(bj)>
			return;
	//   16   40:return          
		}
	}

	public boolean r()
	{
		Object obj = ((Object) (b));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field m b>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		obj = ((Object) (((m) (obj)).c().getLastPathSegment()));
	//    7   11:aload_1         
	//    8   12:invokevirtual   #467 <Method Uri m.c()>
	//    9   15:invokevirtual   #926 <Method String Uri.getLastPathSegment()>
	//   10   18:astore_1        
		if(obj == null)
	//*  11   19:aload_1         
	//*  12   20:ifnonnull       25
			return false;
	//   13   23:iconst_0        
	//   14   24:ireturn         
		else
			return ((String) (obj)).endsWith(".mp4");
	//   15   25:aload_1         
	//   16   26:ldc2            #928 <String ".mp4">
	//   17   29:invokevirtual   #931 <Method boolean String.endsWith(String)>
	//   18   32:ireturn         
	}

	public int s()
	{
		return d.a().k();
	//    0    0:aload_0         
	//    1    1:getfield        #450 <Field t d>
	//    2    4:invokeinterface #455 <Method biz.bookdesign.librivox.audio.a biz.bookdesign.librivox.audio.t.a()>
	//    3    9:invokeinterface #933 <Method int biz.bookdesign.librivox.audio.a.k()>
	//    4   14:ireturn         
	}

	public void t()
	{
		Intent intent = new Intent("biz.bookdesign.librivox.SLEEP_NOTIFICATION");
	//    0    0:new             #151 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc2            #935 <String "biz.bookdesign.librivox.SLEEP_NOTIFICATION">
	//    3    7:invokespecial   #156 <Method void Intent(String)>
	//    4   10:astore_1        
		intent.putExtra("biz.bookdesign.librivox.TIME", m);
	//    5   11:aload_1         
	//    6   12:ldc2            #937 <String "biz.bookdesign.librivox.TIME">
	//    7   15:aload_0         
	//    8   16:getfield        #105 <Field long m>
	//    9   19:invokevirtual   #940 <Method Intent Intent.putExtra(String, long)>
	//   10   22:pop             
		intent.putExtra("biz.bookdesign.librivox.STOP_AT_CHAPTER_END", n);
	//   11   23:aload_1         
	//   12   24:ldc2            #942 <String "biz.bookdesign.librivox.STOP_AT_CHAPTER_END">
	//   13   27:aload_0         
	//   14   28:getfield        #68  <Field boolean n>
	//   15   31:invokevirtual   #702 <Method Intent Intent.putExtra(String, boolean)>
	//   16   34:pop             
		e.a(intent);
	//   17   35:aload_0         
	//   18   36:getfield        #169 <Field g e>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #174 <Method boolean g.a(Intent)>
	//   21   43:pop             
	//   22   44:return          
	}

	public int u()
	{
		return d.a().d();
	//    0    0:aload_0         
	//    1    1:getfield        #450 <Field t d>
	//    2    4:invokeinterface #455 <Method biz.bookdesign.librivox.audio.a biz.bookdesign.librivox.audio.t.a()>
	//    3    9:invokeinterface #945 <Method int a.d()>
	//    4   14:ireturn         
	}

	public void v()
	{
		a((m - System.currentTimeMillis()) + 0x927c0L, false);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #105 <Field long m>
	//    3    5:invokestatic    #644 <Method long System.currentTimeMillis()>
	//    4    8:lsub            
	//    5    9:ldc2w           #947 <Long 0x927c0L>
	//    6   12:ladd            
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #950 <Method void a(long, boolean)>
	//    9   17:return          
	}

	public void w()
	{
		f(250);
	//    0    0:aload_0         
	//    1    1:sipush          250
	//    2    4:invokespecial   #503 <Method void f(int)>
	//    3    7:return          
	}

	public biz.bookdesign.librivox.b.a a;
	public m b;
	private final IBinder c = new biz.bookdesign.librivox.audio.i(this);
	private t d;
	private g e;
	private j f;
	private BroadcastReceiver g;
	private MediaSessionCompat h;
	private a i;
	private FirebaseAnalytics j;
	private Handler k;
	private boolean l;
	private long m;
	private boolean n;
	private float o;
	private final Runnable p = new biz.bookdesign.librivox.audio.c(this);
	private Runnable q;
	private Runnable r;
	private final bj s = new biz.bookdesign.librivox.audio.g(this);
	private final bj t = new h(this);
}
