// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.*;
import android.content.res.Resources;
import android.os.*;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.cw;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.media.session:
//			ak, bb, ae, MediaControllerCompat, 
//			g, ar, ac, ap, 
//			ad, an, al, as, 
//			PlaybackStateCompat, bn, ax, af

public class MediaSessionCompat
{

	private MediaSessionCompat(Context context, ak ak1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		d = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #19  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void ArrayList()>
	//    6   12:putfield        #22  <Field ArrayList d>
		b = ak1;
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:putfield        #24  <Field ak b>
		if(android.os.Build.VERSION.SDK_INT >= 21 && !bb.f(ak1.e()))
	//*  10   20:getstatic       #29  <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   23:bipush          21
	//*  12   25:icmplt          52
	//*  13   28:aload_2         
	//*  14   29:invokeinterface #35  <Method Object ak.e()>
	//*  15   34:invokestatic    #41  <Method boolean bb.f(Object)>
	//*  16   37:ifne            52
			a(((af) (new ae(this))));
	//   17   40:aload_0         
	//   18   41:new             #43  <Class ae>
	//   19   44:dup             
	//   20   45:aload_0         
	//   21   46:invokespecial   #46  <Method void ae(MediaSessionCompat)>
	//   22   49:invokevirtual   #49  <Method void a(af)>
		c = new MediaControllerCompat(context, this);
	//   23   52:aload_0         
	//   24   53:new             #51  <Class MediaControllerCompat>
	//   25   56:dup             
	//   26   57:aload_1         
	//   27   58:aload_0         
	//   28   59:invokespecial   #54  <Method void MediaControllerCompat(Context, MediaSessionCompat)>
	//   29   62:putfield        #56  <Field MediaControllerCompat c>
	//   30   65:return          
	}

	public MediaSessionCompat(Context context, String s, ComponentName componentname, PendingIntent pendingintent)
	{
		this(context, s, componentname, pendingintent, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:invokespecial   #61  <Method void MediaSessionCompat(Context, String, ComponentName, PendingIntent, Bundle)>
	//    7   10:return          
	}

	private MediaSessionCompat(Context context, String s, ComponentName componentname, PendingIntent pendingintent, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		d = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #19  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void ArrayList()>
	//    6   12:putfield        #22  <Field ArrayList d>
		if(context != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          313
		{
			if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   9   19:aload_2         
	//*  10   20:invokestatic    #67  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  11   23:ifne            303
			{
				ComponentName componentname1 = componentname;
	//   12   26:aload_3         
	//   13   27:astore          6
				if(componentname == null)
	//*  14   29:aload_3         
	//*  15   30:ifnonnull       56
				{
					componentname = g.a(context);
	//   16   33:aload_1         
	//   17   34:invokestatic    #72  <Method ComponentName g.a(Context)>
	//   18   37:astore_3        
					componentname1 = componentname;
	//   19   38:aload_3         
	//   20   39:astore          6
					if(componentname == null)
	//*  21   41:aload_3         
	//*  22   42:ifnonnull       56
					{
						Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
	//   23   45:ldc1            #74  <String "MediaSessionCompat">
	//   24   47:ldc1            #76  <String "Couldn't find a unique registered media button receiver in the given context.">
	//   25   49:invokestatic    #82  <Method int Log.w(String, String)>
	//   26   52:pop             
						componentname1 = componentname;
	//   27   53:aload_3         
	//   28   54:astore          6
					}
				}
				componentname = ((ComponentName) (pendingintent));
	//   29   56:aload           4
	//   30   58:astore_3        
				if(componentname1 != null)
	//*  31   59:aload           6
	//*  32   61:ifnull          97
				{
					componentname = ((ComponentName) (pendingintent));
	//   33   64:aload           4
	//   34   66:astore_3        
					if(pendingintent == null)
	//*  35   67:aload           4
	//*  36   69:ifnonnull       97
					{
						componentname = ((ComponentName) (new Intent("android.intent.action.MEDIA_BUTTON")));
	//   37   72:new             #84  <Class Intent>
	//   38   75:dup             
	//   39   76:ldc1            #86  <String "android.intent.action.MEDIA_BUTTON">
	//   40   78:invokespecial   #89  <Method void Intent(String)>
	//   41   81:astore_3        
						((Intent) (componentname)).setComponent(componentname1);
	//   42   82:aload_3         
	//   43   83:aload           6
	//   44   85:invokevirtual   #93  <Method Intent Intent.setComponent(ComponentName)>
	//   45   88:pop             
						componentname = ((ComponentName) (PendingIntent.getBroadcast(context, 0, ((Intent) (componentname)), 0)));
	//   46   89:aload_1         
	//   47   90:iconst_0        
	//   48   91:aload_3         
	//   49   92:iconst_0        
	//   50   93:invokestatic    #99  <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   51   96:astore_3        
					}
				}
				if(android.os.Build.VERSION.SDK_INT >= 28)
	//*  52   97:getstatic       #29  <Field int android.os.Build$VERSION.SDK_INT>
	//*  53  100:bipush          28
	//*  54  102:icmplt          145
				{
					b = ((ak) (new ar(context, s, bundle)));
	//   55  105:aload_0         
	//   56  106:new             #101 <Class ar>
	//   57  109:dup             
	//   58  110:aload_1         
	//   59  111:aload_2         
	//   60  112:aload           5
	//   61  114:invokespecial   #104 <Method void ar(Context, String, Bundle)>
	//   62  117:putfield        #24  <Field ak b>
					a(((af) (new ac(this))));
	//   63  120:aload_0         
	//   64  121:new             #106 <Class ac>
	//   65  124:dup             
	//   66  125:aload_0         
	//   67  126:invokespecial   #107 <Method void ac(MediaSessionCompat)>
	//   68  129:invokevirtual   #49  <Method void a(af)>
					b.b(((PendingIntent) (componentname)));
	//   69  132:aload_0         
	//   70  133:getfield        #24  <Field ak b>
	//   71  136:aload_3         
	//   72  137:invokeinterface #110 <Method void ak.b(PendingIntent)>
				} else
	//*  73  142:goto            263
				if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  74  145:getstatic       #29  <Field int android.os.Build$VERSION.SDK_INT>
	//*  75  148:bipush          21
	//*  76  150:icmplt          193
				{
					b = ((ak) (new ap(context, s, bundle)));
	//   77  153:aload_0         
	//   78  154:new             #112 <Class ap>
	//   79  157:dup             
	//   80  158:aload_1         
	//   81  159:aload_2         
	//   82  160:aload           5
	//   83  162:invokespecial   #113 <Method void ap(Context, String, Bundle)>
	//   84  165:putfield        #24  <Field ak b>
					a(((af) (new ad(this))));
	//   85  168:aload_0         
	//   86  169:new             #115 <Class ad>
	//   87  172:dup             
	//   88  173:aload_0         
	//   89  174:invokespecial   #116 <Method void ad(MediaSessionCompat)>
	//   90  177:invokevirtual   #49  <Method void a(af)>
					b.b(((PendingIntent) (componentname)));
	//   91  180:aload_0         
	//   92  181:getfield        #24  <Field ak b>
	//   93  184:aload_3         
	//   94  185:invokeinterface #110 <Method void ak.b(PendingIntent)>
				} else
	//*  95  190:goto            263
				if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  96  193:getstatic       #29  <Field int android.os.Build$VERSION.SDK_INT>
	//*  97  196:bipush          19
	//*  98  198:icmplt          220
					b = ((ak) (new an(context, s, componentname1, ((PendingIntent) (componentname)))));
	//   99  201:aload_0         
	//  100  202:new             #118 <Class an>
	//  101  205:dup             
	//  102  206:aload_1         
	//  103  207:aload_2         
	//  104  208:aload           6
	//  105  210:aload_3         
	//  106  211:invokespecial   #120 <Method void an(Context, String, ComponentName, PendingIntent)>
	//  107  214:putfield        #24  <Field ak b>
				else
	//* 108  217:goto            263
				if(android.os.Build.VERSION.SDK_INT >= 18)
	//* 109  220:getstatic       #29  <Field int android.os.Build$VERSION.SDK_INT>
	//* 110  223:bipush          18
	//* 111  225:icmplt          247
					b = ((ak) (new al(context, s, componentname1, ((PendingIntent) (componentname)))));
	//  112  228:aload_0         
	//  113  229:new             #122 <Class al>
	//  114  232:dup             
	//  115  233:aload_1         
	//  116  234:aload_2         
	//  117  235:aload           6
	//  118  237:aload_3         
	//  119  238:invokespecial   #123 <Method void al(Context, String, ComponentName, PendingIntent)>
	//  120  241:putfield        #24  <Field ak b>
				else
	//* 121  244:goto            263
					b = ((ak) (new as(context, s, componentname1, ((PendingIntent) (componentname)))));
	//  122  247:aload_0         
	//  123  248:new             #125 <Class as>
	//  124  251:dup             
	//  125  252:aload_1         
	//  126  253:aload_2         
	//  127  254:aload           6
	//  128  256:aload_3         
	//  129  257:invokespecial   #126 <Method void as(Context, String, ComponentName, PendingIntent)>
	//  130  260:putfield        #24  <Field ak b>
				c = new MediaControllerCompat(context, this);
	//  131  263:aload_0         
	//  132  264:new             #51  <Class MediaControllerCompat>
	//  133  267:dup             
	//  134  268:aload_1         
	//  135  269:aload_0         
	//  136  270:invokespecial   #54  <Method void MediaControllerCompat(Context, MediaSessionCompat)>
	//  137  273:putfield        #56  <Field MediaControllerCompat c>
				if(a == 0)
	//* 138  276:getstatic       #128 <Field int a>
	//* 139  279:ifne            302
					a = (int)(TypedValue.applyDimension(1, 320F, context.getResources().getDisplayMetrics()) + 0.5F);
	//  140  282:iconst_1        
	//  141  283:ldc1            #129 <Float 320F>
	//  142  285:aload_1         
	//  143  286:invokevirtual   #135 <Method Resources Context.getResources()>
	//  144  289:invokevirtual   #141 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//  145  292:invokestatic    #147 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//  146  295:ldc1            #148 <Float 0.5F>
	//  147  297:fadd            
	//  148  298:f2i             
	//  149  299:putstatic       #128 <Field int a>
				return;
	//  150  302:return          
			} else
			{
				throw new IllegalArgumentException("tag must not be null or empty");
	//  151  303:new             #150 <Class IllegalArgumentException>
	//  152  306:dup             
	//  153  307:ldc1            #152 <String "tag must not be null or empty">
	//  154  309:invokespecial   #153 <Method void IllegalArgumentException(String)>
	//  155  312:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("context must not be null");
	//  156  313:new             #150 <Class IllegalArgumentException>
	//  157  316:dup             
	//  158  317:ldc1            #155 <String "context must not be null">
	//  159  319:invokespecial   #153 <Method void IllegalArgumentException(String)>
	//  160  322:athrow          
		}
	}

	public static MediaSessionCompat a(Context context, Object obj)
	{
		if(context != null && obj != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          33
	//*   2    4:aload_1         
	//*   3    5:ifnull          33
	//*   4    8:getstatic       #29  <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          21
	//*   6   13:icmplt          33
			return new MediaSessionCompat(context, ((ak) (new ap(obj))));
	//    7   16:new             #2   <Class MediaSessionCompat>
	//    8   19:dup             
	//    9   20:aload_0         
	//   10   21:new             #112 <Class ap>
	//   11   24:dup             
	//   12   25:aload_1         
	//   13   26:invokespecial   #159 <Method void ap(Object)>
	//   14   29:invokespecial   #161 <Method void MediaSessionCompat(Context, ak)>
	//   15   32:areturn         
		else
			return null;
	//   16   33:aconst_null     
	//   17   34:areturn         
	}

	static PlaybackStateCompat a(PlaybackStateCompat playbackstatecompat, MediaMetadataCompat mediametadatacompat)
	{
		if(playbackstatecompat != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          167
		{
			long l = playbackstatecompat.b();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #167 <Method long PlaybackStateCompat.b()>
	//    4    8:lstore_2        
			long l2 = -1L;
	//    5    9:ldc2w           #168 <Long -1L>
	//    6   12:lstore          4
			if(l == -1L)
	//*   7   14:lload_2         
	//*   8   15:ldc2w           #168 <Long -1L>
	//*   9   18:lcmp            
	//*  10   19:ifne            24
				return playbackstatecompat;
	//   11   22:aload_0         
	//   12   23:areturn         
			if(playbackstatecompat.a() == 3 || playbackstatecompat.a() == 4 || playbackstatecompat.a() == 5)
	//*  13   24:aload_0         
	//*  14   25:invokevirtual   #172 <Method int PlaybackStateCompat.a()>
	//*  15   28:iconst_3        
	//*  16   29:icmpeq          48
	//*  17   32:aload_0         
	//*  18   33:invokevirtual   #172 <Method int PlaybackStateCompat.a()>
	//*  19   36:iconst_4        
	//*  20   37:icmpeq          48
	//*  21   40:aload_0         
	//*  22   41:invokevirtual   #172 <Method int PlaybackStateCompat.a()>
	//*  23   44:iconst_5        
	//*  24   45:icmpne          165
			{
				long l1 = playbackstatecompat.c();
	//   25   48:aload_0         
	//   26   49:invokevirtual   #174 <Method long PlaybackStateCompat.c()>
	//   27   52:lstore_2        
				if(l1 > 0L)
	//*  28   53:lload_2         
	//*  29   54:lconst_0        
	//*  30   55:lcmp            
	//*  31   56:ifle            165
				{
					long l4 = SystemClock.elapsedRealtime();
	//   32   59:invokestatic    #179 <Method long SystemClock.elapsedRealtime()>
	//   33   62:lstore          8
					long l3 = (long)(playbackstatecompat.d() * (float)(l4 - l1)) + playbackstatecompat.b();
	//   34   64:aload_0         
	//   35   65:invokevirtual   #182 <Method float PlaybackStateCompat.d()>
	//   36   68:lload           8
	//   37   70:lload_2         
	//   38   71:lsub            
	//   39   72:l2f             
	//   40   73:fmul            
	//   41   74:f2l             
	//   42   75:aload_0         
	//   43   76:invokevirtual   #167 <Method long PlaybackStateCompat.b()>
	//   44   79:ladd            
	//   45   80:lstore          6
					l1 = l2;
	//   46   82:lload           4
	//   47   84:lstore_2        
					if(mediametadatacompat != null)
	//*  48   85:aload_1         
	//*  49   86:ifnull          108
					{
						l1 = l2;
	//   50   89:lload           4
	//   51   91:lstore_2        
						if(mediametadatacompat.a("android.media.metadata.DURATION"))
	//*  52   92:aload_1         
	//*  53   93:ldc1            #184 <String "android.media.metadata.DURATION">
	//*  54   95:invokevirtual   #189 <Method boolean MediaMetadataCompat.a(String)>
	//*  55   98:ifeq            108
							l1 = mediametadatacompat.d("android.media.metadata.DURATION");
	//   56  101:aload_1         
	//   57  102:ldc1            #184 <String "android.media.metadata.DURATION">
	//   58  104:invokevirtual   #192 <Method long MediaMetadataCompat.d(String)>
	//   59  107:lstore_2        
					}
					if(l1 < 0L || l3 <= l1)
	//*  60  108:lload_2         
	//*  61  109:lconst_0        
	//*  62  110:lcmp            
	//*  63  111:iflt            124
	//*  64  114:lload           6
	//*  65  116:lload_2         
	//*  66  117:lcmp            
	//*  67  118:ifle            124
	//*  68  121:goto            139
						if(l3 < 0L)
	//*  69  124:lload           6
	//*  70  126:lconst_0        
	//*  71  127:lcmp            
	//*  72  128:ifge            136
							l1 = 0L;
	//   73  131:lconst_0        
	//   74  132:lstore_2        
						else
	//*  75  133:goto            139
							l1 = l3;
	//   76  136:lload           6
	//   77  138:lstore_2        
					return (new bn(playbackstatecompat)).a(playbackstatecompat.a(), l1, playbackstatecompat.d(), l4).a();
	//   78  139:new             #194 <Class bn>
	//   79  142:dup             
	//   80  143:aload_0         
	//   81  144:invokespecial   #197 <Method void bn(PlaybackStateCompat)>
	//   82  147:aload_0         
	//   83  148:invokevirtual   #172 <Method int PlaybackStateCompat.a()>
	//   84  151:lload_2         
	//   85  152:aload_0         
	//   86  153:invokevirtual   #182 <Method float PlaybackStateCompat.d()>
	//   87  156:lload           8
	//   88  158:invokevirtual   #200 <Method bn bn.a(int, long, float, long)>
	//   89  161:invokevirtual   #203 <Method PlaybackStateCompat bn.a()>
	//   90  164:areturn         
				}
			}
			return playbackstatecompat;
	//   91  165:aload_0         
	//   92  166:areturn         
		} else
		{
			return playbackstatecompat;
	//   93  167:aload_0         
	//   94  168:areturn         
		}
	}

	public static void a(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          13
			bundle.setClassLoader(((Class) (android/support/v4/media/session/MediaSessionCompat)).getClassLoader());
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class MediaSessionCompat>
	//    4    7:invokevirtual   #210 <Method ClassLoader Class.getClassLoader()>
	//    5   10:invokevirtual   #216 <Method void Bundle.setClassLoader(ClassLoader)>
	//    6   13:return          
	}

	public void a(int i)
	{
		b.a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ak b>
	//    2    4:iload_1         
	//    3    5:invokeinterface #219 <Method void ak.a(int)>
	//    4   10:return          
	}

	public void a(PendingIntent pendingintent)
	{
		b.a(pendingintent);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ak b>
	//    2    4:aload_1         
	//    3    5:invokeinterface #221 <Method void ak.a(PendingIntent)>
	//    4   10:return          
	}

	public void a(MediaMetadataCompat mediametadatacompat)
	{
		b.a(mediametadatacompat);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ak b>
	//    2    4:aload_1         
	//    3    5:invokeinterface #224 <Method void ak.a(MediaMetadataCompat)>
	//    4   10:return          
	}

	public void a(cw cw)
	{
		if(cw != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
		{
			b.a(cw);
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field ak b>
	//    4    8:aload_1         
	//    5    9:invokeinterface #227 <Method void ak.a(cw)>
			return;
	//    6   14:return          
		} else
		{
			throw new IllegalArgumentException("volumeProvider may not be null!");
	//    7   15:new             #150 <Class IllegalArgumentException>
	//    8   18:dup             
	//    9   19:ldc1            #229 <String "volumeProvider may not be null!">
	//   10   21:invokespecial   #153 <Method void IllegalArgumentException(String)>
	//   11   24:athrow          
		}
	}

	public void a(PlaybackStateCompat playbackstatecompat)
	{
		b.a(playbackstatecompat);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ak b>
	//    2    4:aload_1         
	//    3    5:invokeinterface #231 <Method void ak.a(PlaybackStateCompat)>
	//    4   10:return          
	}

	public void a(af af)
	{
		a(af, ((Handler) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #234 <Method void a(af, Handler)>
	//    4    6:return          
	}

	public void a(af af, Handler handler)
	{
		if(af == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       16
		{
			b.a(((af) (null)), ((Handler) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field ak b>
	//    4    8:aconst_null     
	//    5    9:aconst_null     
	//    6   10:invokeinterface #235 <Method void ak.a(af, Handler)>
			return;
	//    7   15:return          
		}
		ak ak1 = b;
	//    8   16:aload_0         
	//    9   17:getfield        #24  <Field ak b>
	//   10   20:astore_3        
		if(handler == null)
	//*  11   21:aload_2         
	//*  12   22:ifnull          28
	//*  13   25:goto            36
			handler = new Handler();
	//   14   28:new             #237 <Class Handler>
	//   15   31:dup             
	//   16   32:invokespecial   #238 <Method void Handler()>
	//   17   35:astore_2        
		ak1.a(af, handler);
	//   18   36:aload_3         
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:invokeinterface #235 <Method void ak.a(af, Handler)>
	//   22   44:return          
	}

	public void a(ax ax1)
	{
		if(ax1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          14
		{
			d.add(((Object) (ax1)));
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field ArrayList d>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #242 <Method boolean ArrayList.add(Object)>
	//    6   12:pop             
			return;
	//    7   13:return          
		} else
		{
			throw new IllegalArgumentException("Listener may not be null");
	//    8   14:new             #150 <Class IllegalArgumentException>
	//    9   17:dup             
	//   10   18:ldc1            #244 <String "Listener may not be null">
	//   11   20:invokespecial   #153 <Method void IllegalArgumentException(String)>
	//   12   23:athrow          
		}
	}

	public void a(boolean flag)
	{
		b.a(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ak b>
	//    2    4:iload_1         
	//    3    5:invokeinterface #247 <Method void ak.a(boolean)>
		for(Iterator iterator = d.iterator(); iterator.hasNext(); ((ax)iterator.next()).onActiveChanged());
	//    4   10:aload_0         
	//    5   11:getfield        #22  <Field ArrayList d>
	//    6   14:invokevirtual   #251 <Method Iterator ArrayList.iterator()>
	//    7   17:astore_2        
	//    8   18:aload_2         
	//    9   19:invokeinterface #257 <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            44
	//   11   27:aload_2         
	//   12   28:invokeinterface #260 <Method Object Iterator.next()>
	//   13   33:checkcast       #262 <Class ax>
	//   14   36:invokeinterface #265 <Method void ax.onActiveChanged()>
	//*  15   41:goto            18
	//   16   44:return          
	}

	public boolean a()
	{
		return b.a();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ak b>
	//    2    4:invokeinterface #267 <Method boolean ak.a()>
	//    3    9:ireturn         
	}

	public void b()
	{
		b.b();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ak b>
	//    2    4:invokeinterface #269 <Method void ak.b()>
	//    3    9:return          
	}

	public void b(int i)
	{
		b.b(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ak b>
	//    2    4:iload_1         
	//    3    5:invokeinterface #271 <Method void ak.b(int)>
	//    4   10:return          
	}

	public void b(ax ax1)
	{
		if(ax1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          14
		{
			d.remove(((Object) (ax1)));
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field ArrayList d>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #274 <Method boolean ArrayList.remove(Object)>
	//    6   12:pop             
			return;
	//    7   13:return          
		} else
		{
			throw new IllegalArgumentException("Listener may not be null");
	//    8   14:new             #150 <Class IllegalArgumentException>
	//    9   17:dup             
	//   10   18:ldc1            #244 <String "Listener may not be null">
	//   11   20:invokespecial   #153 <Method void IllegalArgumentException(String)>
	//   12   23:athrow          
		}
	}

	public Token c()
	{
		return b.c();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ak b>
	//    2    4:invokeinterface #277 <Method MediaSessionCompat$Token ak.c()>
	//    3    9:areturn         
	}

	public MediaControllerCompat d()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field MediaControllerCompat c>
	//    2    4:areturn         
	}

	public Object e()
	{
		return b.f();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ak b>
	//    2    4:invokeinterface #280 <Method Object ak.f()>
	//    3    9:areturn         
	}

	static int a;
	private final ak b;
	private final MediaControllerCompat c;
	private final ArrayList d;
}
