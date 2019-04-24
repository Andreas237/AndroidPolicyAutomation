// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.RemoteViews;
import android.widget.Toast;
import com.baidu.android.pushservice.h.o;
import com.baidu.android.pushservice.h.u;
import com.baidu.android.pushservice.message.PublicMsg;
import com.baidu.android.pushservice.richmedia.MediaViewActivity;
import com.baidu.android.pushservice.richmedia.a;
import com.baidu.android.pushservice.richmedia.b;
import com.baidu.android.pushservice.richmedia.c;
import com.baidu.android.pushservice.richmedia.e;
import com.baidu.android.pushservice.richmedia.f;
import java.io.File;

// Referenced classes of package com.baidu.android.pushservice:
//			PushServiceReceiver

private static class PushServiceReceiver$a
	implements f
{

	public void a(a a1)
	{
		a1 = ((a) (a.getResources()));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Context a>
	//    2    4:invokevirtual   #58  <Method Resources Context.getResources()>
	//    3    7:astore_1        
		String s = a.getPackageName();
	//    4    8:aload_0         
	//    5    9:getfield        #30  <Field Context a>
	//    6   12:invokevirtual   #62  <Method String Context.getPackageName()>
	//    7   15:astore_3        
		if(a1 == null)
	//*   8   16:aload_1         
	//*   9   17:ifnonnull       21
			return;
	//   10   20:return          
		int i = ((Resources) (a1)).getIdentifier("bpush_download_progress", "layout", s);
	//   11   21:aload_1         
	//   12   22:ldc1            #64  <String "bpush_download_progress">
	//   13   24:ldc1            #66  <String "layout">
	//   14   26:aload_3         
	//   15   27:invokevirtual   #72  <Method int Resources.getIdentifier(String, String, String)>
	//   16   30:istore_2        
		b = new RemoteViews(a.getPackageName(), i);
	//   17   31:aload_0         
	//   18   32:new             #74  <Class RemoteViews>
	//   19   35:dup             
	//   20   36:aload_0         
	//   21   37:getfield        #30  <Field Context a>
	//   22   40:invokevirtual   #62  <Method String Context.getPackageName()>
	//   23   43:iload_2         
	//   24   44:invokespecial   #77  <Method void RemoteViews(String, int)>
	//   25   47:putfield        #32  <Field RemoteViews b>
		if(i != 0)
	//*  26   50:iload_2         
	//*  27   51:ifeq            127
		{
			c = ((Resources) (a1)).getIdentifier("bpush_download_progress", "id", s);
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:ldc1            #64  <String "bpush_download_progress">
	//   31   58:ldc1            #79  <String "id">
	//   32   60:aload_3         
	//   33   61:invokevirtual   #72  <Method int Resources.getIdentifier(String, String, String)>
	//   34   64:putfield        #34  <Field int c>
			d = ((Resources) (a1)).getIdentifier("bpush_progress_percent", "id", s);
	//   35   67:aload_0         
	//   36   68:aload_1         
	//   37   69:ldc1            #81  <String "bpush_progress_percent">
	//   38   71:ldc1            #79  <String "id">
	//   39   73:aload_3         
	//   40   74:invokevirtual   #72  <Method int Resources.getIdentifier(String, String, String)>
	//   41   77:putfield        #36  <Field int d>
			e = ((Resources) (a1)).getIdentifier("bpush_progress_text", "id", s);
	//   42   80:aload_0         
	//   43   81:aload_1         
	//   44   82:ldc1            #83  <String "bpush_progress_text">
	//   45   84:ldc1            #79  <String "id">
	//   46   86:aload_3         
	//   47   87:invokevirtual   #72  <Method int Resources.getIdentifier(String, String, String)>
	//   48   90:putfield        #38  <Field int e>
			f = ((Resources) (a1)).getIdentifier("bpush_download_icon", "id", s);
	//   49   93:aload_0         
	//   50   94:aload_1         
	//   51   95:ldc1            #85  <String "bpush_download_icon">
	//   52   97:ldc1            #79  <String "id">
	//   53   99:aload_3         
	//   54  100:invokevirtual   #72  <Method int Resources.getIdentifier(String, String, String)>
	//   55  103:putfield        #40  <Field int f>
			b.setImageViewResource(f, a.getApplicationInfo().icon);
	//   56  106:aload_0         
	//   57  107:getfield        #32  <Field RemoteViews b>
	//   58  110:aload_0         
	//   59  111:getfield        #40  <Field int f>
	//   60  114:aload_0         
	//   61  115:getfield        #30  <Field Context a>
	//   62  118:invokevirtual   #89  <Method ApplicationInfo Context.getApplicationInfo()>
	//   63  121:getfield        #94  <Field int ApplicationInfo.icon>
	//   64  124:invokevirtual   #98  <Method void RemoteViews.setImageViewResource(int, int)>
		}
	//   65  127:return          
	}

	public void a(a a1, b b1)
	{
		String s = a1.d.c();
	//    0    0:aload_1         
	//    1    1:getfield        #107 <Field c a.d>
	//    2    4:invokevirtual   #111 <Method String c.c()>
	//    3    7:astore          5
		if(b1.a == b1.b)
	//*   4    9:aload_2         
	//*   5   10:getfield        #116 <Field long b.a>
	//*   6   13:aload_2         
	//*   7   14:getfield        #118 <Field long b.b>
	//*   8   17:lcmp            
	//*   9   18:ifne            22
			return;
	//   10   21:return          
		if(b != null)
	//*  11   22:aload_0         
	//*  12   23:getfield        #32  <Field RemoteViews b>
	//*  13   26:ifnull          257
		{
			int i = (int)(((double)b1.a * 100D) / (double)b1.b);
	//   14   29:aload_2         
	//   15   30:getfield        #116 <Field long b.a>
	//   16   33:l2d             
	//   17   34:ldc2w           #119 <Double 100D>
	//   18   37:dmul            
	//   19   38:aload_2         
	//   20   39:getfield        #118 <Field long b.b>
	//   21   42:l2d             
	//   22   43:ddiv            
	//   23   44:d2i             
	//   24   45:istore_3        
			a1 = ((a) (b));
	//   25   46:aload_0         
	//   26   47:getfield        #32  <Field RemoteViews b>
	//   27   50:astore_1        
			int j = d;
	//   28   51:aload_0         
	//   29   52:getfield        #36  <Field int d>
	//   30   55:istore          4
			b1 = ((b) (new StringBuilder()));
	//   31   57:new             #122 <Class StringBuilder>
	//   32   60:dup             
	//   33   61:invokespecial   #123 <Method void StringBuilder()>
	//   34   64:astore_2        
			((StringBuilder) (b1)).append(i);
	//   35   65:aload_2         
	//   36   66:iload_3         
	//   37   67:invokevirtual   #127 <Method StringBuilder StringBuilder.append(int)>
	//   38   70:pop             
			((StringBuilder) (b1)).append("%");
	//   39   71:aload_2         
	//   40   72:ldc1            #129 <String "%">
	//   41   74:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   42   77:pop             
			((RemoteViews) (a1)).setTextViewText(j, ((CharSequence) (((StringBuilder) (b1)).toString())));
	//   43   78:aload_1         
	//   44   79:iload           4
	//   45   81:aload_2         
	//   46   82:invokevirtual   #135 <Method String StringBuilder.toString()>
	//   47   85:invokevirtual   #139 <Method void RemoteViews.setTextViewText(int, CharSequence)>
			a1 = ((a) (b));
	//   48   88:aload_0         
	//   49   89:getfield        #32  <Field RemoteViews b>
	//   50   92:astore_1        
			j = e;
	//   51   93:aload_0         
	//   52   94:getfield        #38  <Field int e>
	//   53   97:istore          4
			b1 = ((b) (new StringBuilder()));
	//   54   99:new             #122 <Class StringBuilder>
	//   55  102:dup             
	//   56  103:invokespecial   #123 <Method void StringBuilder()>
	//   57  106:astore_2        
			((StringBuilder) (b1)).append("\u6B63\u5728\u4E0B\u8F7D\u5BCC\u5A92\u4F53:");
	//   58  107:aload_2         
	//   59  108:ldc1            #141 <String "\u6B63\u5728\u4E0B\u8F7D\u5BCC\u5A92\u4F53:">
	//   60  110:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   61  113:pop             
			((StringBuilder) (b1)).append(s);
	//   62  114:aload_2         
	//   63  115:aload           5
	//   64  117:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   65  120:pop             
			((RemoteViews) (a1)).setTextViewText(j, ((CharSequence) (((StringBuilder) (b1)).toString())));
	//   66  121:aload_1         
	//   67  122:iload           4
	//   68  124:aload_2         
	//   69  125:invokevirtual   #135 <Method String StringBuilder.toString()>
	//   70  128:invokevirtual   #139 <Method void RemoteViews.setTextViewText(int, CharSequence)>
			b.setProgressBar(c, 100, i, false);
	//   71  131:aload_0         
	//   72  132:getfield        #32  <Field RemoteViews b>
	//   73  135:aload_0         
	//   74  136:getfield        #34  <Field int c>
	//   75  139:bipush          100
	//   76  141:iload_3         
	//   77  142:iconst_0        
	//   78  143:invokevirtual   #145 <Method void RemoteViews.setProgressBar(int, int, int, boolean)>
			if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  79  146:getstatic       #150 <Field int android.os.Build$VERSION.SDK_INT>
	//*  80  149:bipush          16
	//*  81  151:icmplt          183
				a1 = ((a) ((new android.app.Notification.Builder(a)).setSmallIcon(0x1080081).setWhen(System.currentTimeMillis()).build()));
	//   82  154:new             #152 <Class android.app.Notification$Builder>
	//   83  157:dup             
	//   84  158:aload_0         
	//   85  159:getfield        #30  <Field Context a>
	//   86  162:invokespecial   #155 <Method void android.app.Notification$Builder(Context)>
	//   87  165:ldc1            #156 <Int 0x1080081>
	//   88  167:invokevirtual   #160 <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int)>
	//   89  170:invokestatic    #166 <Method long System.currentTimeMillis()>
	//   90  173:invokevirtual   #170 <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
	//   91  176:invokevirtual   #174 <Method Notification android.app.Notification$Builder.build()>
	//   92  179:astore_1        
			else
	//*  93  180:goto            197
				a1 = ((a) (new Notification(0x1080081, ((CharSequence) (null)), System.currentTimeMillis())));
	//   94  183:new             #176 <Class Notification>
	//   95  186:dup             
	//   96  187:ldc1            #156 <Int 0x1080081>
	//   97  189:aconst_null     
	//   98  190:invokestatic    #166 <Method long System.currentTimeMillis()>
	//   99  193:invokespecial   #179 <Method void Notification(int, CharSequence, long)>
	//  100  196:astore_1        
			a1.contentView = b;
	//  101  197:aload_1         
	//  102  198:aload_0         
	//  103  199:getfield        #32  <Field RemoteViews b>
	//  104  202:putfield        #182 <Field RemoteViews Notification.contentView>
			a1.contentIntent = PendingIntent.getActivity(a, 0, new Intent(), 0);
	//  105  205:aload_1         
	//  106  206:aload_0         
	//  107  207:getfield        #30  <Field Context a>
	//  108  210:iconst_0        
	//  109  211:new             #184 <Class Intent>
	//  110  214:dup             
	//  111  215:invokespecial   #185 <Method void Intent()>
	//  112  218:iconst_0        
	//  113  219:invokestatic    #191 <Method PendingIntent PendingIntent.getActivity(Context, int, Intent, int)>
	//  114  222:putfield        #195 <Field PendingIntent Notification.contentIntent>
			a1.flags = ((Notification) (a1)).flags | 0x20;
	//  115  225:aload_1         
	//  116  226:aload_1         
	//  117  227:getfield        #198 <Field int Notification.flags>
	//  118  230:bipush          32
	//  119  232:ior             
	//  120  233:putfield        #198 <Field int Notification.flags>
			a1.flags = ((Notification) (a1)).flags | 2;
	//  121  236:aload_1         
	//  122  237:aload_1         
	//  123  238:getfield        #198 <Field int Notification.flags>
	//  124  241:iconst_2        
	//  125  242:ior             
	//  126  243:putfield        #198 <Field int Notification.flags>
			g.notify(s, 0, ((Notification) (a1)));
	//  127  246:aload_0         
	//  128  247:getfield        #52  <Field NotificationManager g>
	//  129  250:aload           5
	//  130  252:iconst_0        
	//  131  253:aload_1         
	//  132  254:invokevirtual   #202 <Method void NotificationManager.notify(String, int, Notification)>
		}
	//  133  257:return          
	}

	public void a(a a1, e e1)
	{
		a1 = ((a) (a1.d.c()));
	//    0    0:aload_1         
	//    1    1:getfield        #107 <Field c a.d>
	//    2    4:invokevirtual   #111 <Method String c.c()>
	//    3    7:astore_1        
		g.cancel(((String) (a1)), 0);
	//    4    8:aload_0         
	//    5    9:getfield        #52  <Field NotificationManager g>
	//    6   12:aload_1         
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #209 <Method void NotificationManager.cancel(String, int)>
		e1 = ((e) (o.a(a, ((String) (a1)))));
	//    9   17:aload_0         
	//   10   18:getfield        #30  <Field Context a>
	//   11   21:aload_1         
	//   12   22:invokestatic    #214 <Method com.baidu.android.pushservice.h.o$h o.a(Context, String)>
	//   13   25:astore_2        
		if(e1 != null && ((com.baidu.android.pushservice.h.o.h) (e1)).i == a.f)
	//*  14   26:aload_2         
	//*  15   27:ifnull          271
	//*  16   30:aload_2         
	//*  17   31:getfield        #219 <Field int com.baidu.android.pushservice.h.o$h.i>
	//*  18   34:getstatic       #220 <Field int a.f>
	//*  19   37:icmpne          271
		{
			a1 = ((a) (((com.baidu.android.pushservice.h.o.h) (e1)).e));
	//   20   40:aload_2         
	//   21   41:getfield        #223 <Field String com.baidu.android.pushservice.h.o$h.e>
	//   22   44:astore_1        
			e1 = ((e) (((com.baidu.android.pushservice.h.o.h) (e1)).f));
	//   23   45:aload_2         
	//   24   46:getfield        #225 <Field String com.baidu.android.pushservice.h.o$h.f>
	//   25   49:astore_2        
			if(!TextUtils.isEmpty(((CharSequence) (e1))) && ((String) (e1)).length() > 0)
	//*  26   50:aload_2         
	//*  27   51:invokestatic    #231 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  28   54:ifne            271
	//*  29   57:aload_2         
	//*  30   58:invokevirtual   #237 <Method int String.length()>
	//*  31   61:ifle            271
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   32   64:new             #122 <Class StringBuilder>
	//   33   67:dup             
	//   34   68:invokespecial   #123 <Method void StringBuilder()>
	//   35   71:astore          4
				stringbuilder.append(((String) (a1)));
	//   36   73:aload           4
	//   37   75:aload_1         
	//   38   76:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   39   79:pop             
				stringbuilder.append("/");
	//   40   80:aload           4
	//   41   82:ldc1            #239 <String "/">
	//   42   84:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   43   87:pop             
				stringbuilder.append(((String) (e1)).substring(0, ((String) (e1)).lastIndexOf(".")));
	//   44   88:aload           4
	//   45   90:aload_2         
	//   46   91:iconst_0        
	//   47   92:aload_2         
	//   48   93:ldc1            #241 <String ".">
	//   49   95:invokevirtual   #245 <Method int String.lastIndexOf(String)>
	//   50   98:invokevirtual   #249 <Method String String.substring(int, int)>
	//   51  101:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   52  104:pop             
				stringbuilder.append("/index.html");
	//   53  105:aload           4
	//   54  107:ldc1            #251 <String "/index.html">
	//   55  109:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   56  112:pop             
				a1 = ((a) (stringbuilder.toString()));
	//   57  113:aload           4
	//   58  115:invokevirtual   #135 <Method String StringBuilder.toString()>
	//   59  118:astore_1        
				e1 = ((e) (new Intent()));
	//   60  119:new             #184 <Class Intent>
	//   61  122:dup             
	//   62  123:invokespecial   #185 <Method void Intent()>
	//   63  126:astore_2        
				((Intent) (e1)).setClass(a, com/baidu/android/pushservice/richmedia/MediaViewActivity);
	//   64  127:aload_2         
	//   65  128:aload_0         
	//   66  129:getfield        #30  <Field Context a>
	//   67  132:ldc1            #253 <Class MediaViewActivity>
	//   68  134:invokevirtual   #257 <Method Intent Intent.setClass(Context, Class)>
	//   69  137:pop             
				int i = u.z(a, a.getPackageName());
	//   70  138:aload_0         
	//   71  139:getfield        #30  <Field Context a>
	//   72  142:aload_0         
	//   73  143:getfield        #30  <Field Context a>
	//   74  146:invokevirtual   #62  <Method String Context.getPackageName()>
	//   75  149:invokestatic    #263 <Method int u.z(Context, String)>
	//   76  152:istore_3        
				a1 = ((a) (new File(((String) (a1)))));
	//   77  153:new             #265 <Class File>
	//   78  156:dup             
	//   79  157:aload_1         
	//   80  158:invokespecial   #268 <Method void File(String)>
	//   81  161:astore_1        
				if(i >= 24)
	//*  82  162:iload_3         
	//*  83  163:bipush          24
	//*  84  165:icmplt          209
				{
					ContentValues contentvalues = new ContentValues(1);
	//   85  168:new             #270 <Class ContentValues>
	//   86  171:dup             
	//   87  172:iconst_1        
	//   88  173:invokespecial   #273 <Method void ContentValues(int)>
	//   89  176:astore          4
					contentvalues.put("_data", ((File) (a1)).getAbsolutePath());
	//   90  178:aload           4
	//   91  180:ldc2            #275 <String "_data">
	//   92  183:aload_1         
	//   93  184:invokevirtual   #278 <Method String File.getAbsolutePath()>
	//   94  187:invokevirtual   #282 <Method void ContentValues.put(String, String)>
					a1 = ((a) (a.getContentResolver().insert(android.provider.a.EXTERNAL_CONTENT_URI, contentvalues)));
	//   95  190:aload_0         
	//   96  191:getfield        #30  <Field Context a>
	//   97  194:invokevirtual   #286 <Method ContentResolver Context.getContentResolver()>
	//   98  197:getstatic       #292 <Field Uri android.provider.MediaStore$Images$Media.EXTERNAL_CONTENT_URI>
	//   99  200:aload           4
	//  100  202:invokevirtual   #298 <Method Uri ContentResolver.insert(Uri, ContentValues)>
	//  101  205:astore_1        
				} else
	//* 102  206:goto            214
				{
					a1 = ((a) (Uri.fromFile(((File) (a1)))));
	//  103  209:aload_1         
	//  104  210:invokestatic    #304 <Method Uri Uri.fromFile(File)>
	//  105  213:astore_1        
				}
				((Intent) (e1)).setData(((Uri) (a1)));
	//  106  214:aload_2         
	//  107  215:aload_1         
	//  108  216:invokevirtual   #308 <Method Intent Intent.setData(Uri)>
	//  109  219:pop             
				((Intent) (e1)).addFlags(0x10000000);
	//  110  220:aload_2         
	//  111  221:ldc2            #309 <Int 0x10000000>
	//  112  224:invokevirtual   #313 <Method Intent Intent.addFlags(int)>
	//  113  227:pop             
				try
				{
					a.startActivity(((Intent) (e1)));
	//  114  228:aload_0         
	//  115  229:getfield        #30  <Field Context a>
	//  116  232:aload_2         
	//  117  233:invokevirtual   #317 <Method void Context.startActivity(Intent)>
					return;
	//  118  236:return          
				}
				// Misplaced declaration of an exception variable
				catch(a a1)
	//* 119  237:astore_1        
				{
					(new Handler(Looper.getMainLooper())).post(new Runnable() {

						public void run()
						{
							Toast.makeText(a.a, "\u5BCC\u5A92\u4F53\u63A8\u9001\u6CA1\u6709\u58F0\u660E\u5FC5\u987B\u7684Activity\uFF0C\u8BF7\u68C0\u67E5\uFF01", 1).show();
						//    0    0:aload_0         
						//    1    1:getfield        #18  <Field PushServiceReceiver$a a>
						//    2    4:getfield        #26  <Field Context com.baidu.android.pushservice.PushServiceReceiver$a.a>
						//    3    7:ldc1            #28  <String "\u5BCC\u5A92\u4F53\u63A8\u9001\u6CA1\u6709\u58F0\u660E\u5FC5\u987B\u7684Activity\uFF0C\u8BF7\u68C0\u67E5\uFF01">
						//    4    9:iconst_1        
						//    5   10:invokestatic    #34  <Method Toast Toast.makeText(Context, CharSequence, int)>
						//    6   13:invokevirtual   #37  <Method void Toast.show()>
						//    7   16:return          
						}

						final PushServiceReceiver.a a;

			
			{
				a = PushServiceReceiver.a.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field PushServiceReceiver$a a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
					}
);
	//  120  238:new             #319 <Class Handler>
	//  121  241:dup             
	//  122  242:invokestatic    #325 <Method Looper Looper.getMainLooper()>
	//  123  245:invokespecial   #328 <Method void Handler(Looper)>
	//  124  248:new             #11  <Class PushServiceReceiver$a$1>
	//  125  251:dup             
	//  126  252:aload_0         
	//  127  253:invokespecial   #331 <Method void PushServiceReceiver$a$1(PushServiceReceiver$a)>
	//  128  256:invokevirtual   #335 <Method boolean Handler.post(Runnable)>
	//  129  259:pop             
				}
				com.baidu.android.pushservice.e.b.a("PushServiceReceiver", ((Throwable) (a1)), a);
	//  130  260:ldc2            #337 <String "PushServiceReceiver">
	//  131  263:aload_1         
	//  132  264:aload_0         
	//  133  265:getfield        #30  <Field Context a>
	//  134  268:invokestatic    #342 <Method void com.baidu.android.pushservice.e.b.a(String, Throwable, Context)>
			}
		}
	//  135  271:return          
	}

	public void a(a a1, Throwable throwable)
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field Context a>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			a1 = ((a) (a1.d.c()));
	//    4    8:aload_1         
	//    5    9:getfield        #107 <Field c a.d>
	//    6   12:invokevirtual   #111 <Method String c.c()>
	//    7   15:astore_1        
			g.cancel(((String) (a1)), 0);
	//    8   16:aload_0         
	//    9   17:getfield        #52  <Field NotificationManager g>
	//   10   20:aload_1         
	//   11   21:iconst_0        
	//   12   22:invokevirtual   #209 <Method void NotificationManager.cancel(String, int)>
			(new Handler(Looper.getMainLooper())).post(new Runnable(((String) (a1))) {

				public void run()
				{
					Object obj = ((Object) (b.a));
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field PushServiceReceiver$a b>
				//    2    4:getfield        #30  <Field Context com.baidu.android.pushservice.PushServiceReceiver$a.a>
				//    3    7:astore_1        
					StringBuilder stringbuilder = new StringBuilder();
				//    4    8:new             #32  <Class StringBuilder>
				//    5   11:dup             
				//    6   12:invokespecial   #33  <Method void StringBuilder()>
				//    7   15:astore_2        
					stringbuilder.append("\u4E0B\u8F7D\u5BCC\u5A92\u4F53");
				//    8   16:aload_2         
				//    9   17:ldc1            #35  <String "\u4E0B\u8F7D\u5BCC\u5A92\u4F53">
				//   10   19:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
				//   11   22:pop             
					stringbuilder.append(Uri.parse(a).getAuthority());
				//   12   23:aload_2         
				//   13   24:aload_0         
				//   14   25:getfield        #22  <Field String a>
				//   15   28:invokestatic    #45  <Method Uri Uri.parse(String)>
				//   16   31:invokevirtual   #49  <Method String Uri.getAuthority()>
				//   17   34:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
				//   18   37:pop             
					stringbuilder.append("\u5931\u8D25");
				//   19   38:aload_2         
				//   20   39:ldc1            #51  <String "\u5931\u8D25">
				//   21   41:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
				//   22   44:pop             
					obj = ((Object) (Toast.makeText(((Context) (obj)), ((CharSequence) (stringbuilder.toString())), 1)));
				//   23   45:aload_1         
				//   24   46:aload_2         
				//   25   47:invokevirtual   #54  <Method String StringBuilder.toString()>
				//   26   50:iconst_1        
				//   27   51:invokestatic    #60  <Method Toast Toast.makeText(Context, CharSequence, int)>
				//   28   54:astore_1        
					((Toast) (obj)).setGravity(17, 0, 0);
				//   29   55:aload_1         
				//   30   56:bipush          17
				//   31   58:iconst_0        
				//   32   59:iconst_0        
				//   33   60:invokevirtual   #64  <Method void Toast.setGravity(int, int, int)>
					((Toast) (obj)).show();
				//   34   63:aload_1         
				//   35   64:invokevirtual   #67  <Method void Toast.show()>
				//   36   67:return          
				}

				final String a;
				final PushServiceReceiver.a b;

			
			{
				b = PushServiceReceiver.a.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field PushServiceReceiver$a b>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   13   25:new             #319 <Class Handler>
	//   14   28:dup             
	//   15   29:invokestatic    #325 <Method Looper Looper.getMainLooper()>
	//   16   32:invokespecial   #328 <Method void Handler(Looper)>
	//   17   35:new             #13  <Class PushServiceReceiver$a$2>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:invokespecial   #346 <Method void PushServiceReceiver$a$2(PushServiceReceiver$a, String)>
	//   22   44:invokevirtual   #335 <Method boolean Handler.post(Runnable)>
	//   23   47:pop             
			return;
	//   24   48:return          
		}
	}

	public void b(a a1)
	{
		a1 = ((a) (a1.d.c()));
	//    0    0:aload_1         
	//    1    1:getfield        #107 <Field c a.d>
	//    2    4:invokevirtual   #111 <Method String c.c()>
	//    3    7:astore_1        
		g.cancel(((String) (a1)), 0);
	//    4    8:aload_0         
	//    5    9:getfield        #52  <Field NotificationManager g>
	//    6   12:aload_1         
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #209 <Method void NotificationManager.cancel(String, int)>
	//    9   17:return          
	}

	public Context a;
	public RemoteViews b;
	public int c;
	public int d;
	public int e;
	public int f;
	NotificationManager g;

	PushServiceReceiver$a(Context context, PublicMsg publicmsg)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #30  <Field Context a>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #32  <Field RemoteViews b>
		c = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #34  <Field int c>
		d = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #36  <Field int d>
		e = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #38  <Field int e>
		f = 0;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #40  <Field int f>
		a = context;
	//   20   34:aload_0         
	//   21   35:aload_1         
	//   22   36:putfield        #30  <Field Context a>
		g = (NotificationManager)context.getSystemService("notification");
	//   23   39:aload_0         
	//   24   40:aload_1         
	//   25   41:ldc1            #42  <String "notification">
	//   26   43:invokevirtual   #48  <Method Object Context.getSystemService(String)>
	//   27   46:checkcast       #50  <Class NotificationManager>
	//   28   49:putfield        #52  <Field NotificationManager g>
	//   29   52:return          
	}
}
