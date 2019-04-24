// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.richmedia;

import android.app.*;
import android.content.*;
import android.net.Uri;
import android.widget.RemoteViews;
import android.widget.Toast;
import com.baidu.android.pushservice.h.o;
import com.baidu.android.pushservice.h.u;
import java.io.File;

// Referenced classes of package com.baidu.android.pushservice.richmedia:
//			f, MediaListActivity, a, c, 
//			b, MediaViewActivity, e

class MediaListActivity$4
	implements f
{

	public void a(a a1)
	{
	//    0    0:return          
	}

	public void a(a a1, b b1)
	{
		String s = a1.d.c();
	//    0    0:aload_1         
	//    1    1:getfield        #30  <Field c a.d>
	//    2    4:invokevirtual   #36  <Method String c.c()>
	//    3    7:astore          5
		if(b1.a == b1.b)
	//*   4    9:aload_2         
	//*   5   10:getfield        #41  <Field long b.a>
	//*   6   13:aload_2         
	//*   7   14:getfield        #44  <Field long b.b>
	//*   8   17:lcmp            
	//*   9   18:ifne            22
			return;
	//   10   21:return          
		if(MediaListActivity.a(a) != null)
	//*  11   22:aload_0         
	//*  12   23:getfield        #18  <Field MediaListActivity a>
	//*  13   26:invokestatic    #47  <Method RemoteViews MediaListActivity.a(MediaListActivity)>
	//*  14   29:ifnull          273
		{
			int i = (int)(((double)b1.a * 100D) / (double)b1.b);
	//   15   32:aload_2         
	//   16   33:getfield        #41  <Field long b.a>
	//   17   36:l2d             
	//   18   37:ldc2w           #48  <Double 100D>
	//   19   40:dmul            
	//   20   41:aload_2         
	//   21   42:getfield        #44  <Field long b.b>
	//   22   45:l2d             
	//   23   46:ddiv            
	//   24   47:d2i             
	//   25   48:istore_3        
			a1 = ((a) (MediaListActivity.a(a)));
	//   26   49:aload_0         
	//   27   50:getfield        #18  <Field MediaListActivity a>
	//   28   53:invokestatic    #47  <Method RemoteViews MediaListActivity.a(MediaListActivity)>
	//   29   56:astore_1        
			int j = MediaListActivity.b(a);
	//   30   57:aload_0         
	//   31   58:getfield        #18  <Field MediaListActivity a>
	//   32   61:invokestatic    #52  <Method int MediaListActivity.b(MediaListActivity)>
	//   33   64:istore          4
			b1 = ((b) (new StringBuilder()));
	//   34   66:new             #54  <Class StringBuilder>
	//   35   69:dup             
	//   36   70:invokespecial   #55  <Method void StringBuilder()>
	//   37   73:astore_2        
			((StringBuilder) (b1)).append(i);
	//   38   74:aload_2         
	//   39   75:iload_3         
	//   40   76:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//   41   79:pop             
			((StringBuilder) (b1)).append("%");
	//   42   80:aload_2         
	//   43   81:ldc1            #61  <String "%">
	//   44   83:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   45   86:pop             
			((RemoteViews) (a1)).setTextViewText(j, ((CharSequence) (((StringBuilder) (b1)).toString())));
	//   46   87:aload_1         
	//   47   88:iload           4
	//   48   90:aload_2         
	//   49   91:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   50   94:invokevirtual   #73  <Method void RemoteViews.setTextViewText(int, CharSequence)>
			MediaListActivity.a(a).setTextViewText(MediaListActivity.c(a), ((CharSequence) (s)));
	//   51   97:aload_0         
	//   52   98:getfield        #18  <Field MediaListActivity a>
	//   53  101:invokestatic    #47  <Method RemoteViews MediaListActivity.a(MediaListActivity)>
	//   54  104:aload_0         
	//   55  105:getfield        #18  <Field MediaListActivity a>
	//   56  108:invokestatic    #75  <Method int MediaListActivity.c(MediaListActivity)>
	//   57  111:aload           5
	//   58  113:invokevirtual   #73  <Method void RemoteViews.setTextViewText(int, CharSequence)>
			MediaListActivity.a(a).setProgressBar(MediaListActivity.d(a), 100, i, false);
	//   59  116:aload_0         
	//   60  117:getfield        #18  <Field MediaListActivity a>
	//   61  120:invokestatic    #47  <Method RemoteViews MediaListActivity.a(MediaListActivity)>
	//   62  123:aload_0         
	//   63  124:getfield        #18  <Field MediaListActivity a>
	//   64  127:invokestatic    #77  <Method int MediaListActivity.d(MediaListActivity)>
	//   65  130:bipush          100
	//   66  132:iload_3         
	//   67  133:iconst_0        
	//   68  134:invokevirtual   #81  <Method void RemoteViews.setProgressBar(int, int, int, boolean)>
			MediaListActivity.a(a).setImageViewResource(MediaListActivity.e(a), 0x1080081);
	//   69  137:aload_0         
	//   70  138:getfield        #18  <Field MediaListActivity a>
	//   71  141:invokestatic    #47  <Method RemoteViews MediaListActivity.a(MediaListActivity)>
	//   72  144:aload_0         
	//   73  145:getfield        #18  <Field MediaListActivity a>
	//   74  148:invokestatic    #84  <Method int MediaListActivity.e(MediaListActivity)>
	//   75  151:ldc1            #85  <Int 0x1080081>
	//   76  153:invokevirtual   #89  <Method void RemoteViews.setImageViewResource(int, int)>
			if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  77  156:getstatic       #95  <Field int android.os.Build$VERSION.SDK_INT>
	//*  78  159:bipush          16
	//*  79  161:icmplt          193
				a1 = ((a) ((new android.app.(((android.content.Context) (a)))).setSmallIcon(0x1080081).setWhen(System.currentTimeMillis()).build()));
	//   80  164:new             #97  <Class android.app.Notification$Builder>
	//   81  167:dup             
	//   82  168:aload_0         
	//   83  169:getfield        #18  <Field MediaListActivity a>
	//   84  172:invokespecial   #100 <Method void android.app.Notification$Builder(android.content.Context)>
	//   85  175:ldc1            #85  <Int 0x1080081>
	//   86  177:invokevirtual   #104 <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int)>
	//   87  180:invokestatic    #110 <Method long System.currentTimeMillis()>
	//   88  183:invokevirtual   #114 <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
	//   89  186:invokevirtual   #118 <Method Notification android.app.Notification$Builder.build()>
	//   90  189:astore_1        
			else
	//*  91  190:goto            207
				a1 = ((a) (new Notification(0x1080081, ((CharSequence) (null)), System.currentTimeMillis())));
	//   92  193:new             #120 <Class Notification>
	//   93  196:dup             
	//   94  197:ldc1            #85  <Int 0x1080081>
	//   95  199:aconst_null     
	//   96  200:invokestatic    #110 <Method long System.currentTimeMillis()>
	//   97  203:invokespecial   #123 <Method void Notification(int, CharSequence, long)>
	//   98  206:astore_1        
			a1.contentView = MediaListActivity.a(a);
	//   99  207:aload_1         
	//  100  208:aload_0         
	//  101  209:getfield        #18  <Field MediaListActivity a>
	//  102  212:invokestatic    #47  <Method RemoteViews MediaListActivity.a(MediaListActivity)>
	//  103  215:putfield        #127 <Field RemoteViews Notification.contentView>
			a1.contentIntent = PendingIntent.getActivity(((android.content.Context) (a)), 0, new Intent(), 0);
	//  104  218:aload_1         
	//  105  219:aload_0         
	//  106  220:getfield        #18  <Field MediaListActivity a>
	//  107  223:iconst_0        
	//  108  224:new             #129 <Class Intent>
	//  109  227:dup             
	//  110  228:invokespecial   #130 <Method void Intent()>
	//  111  231:iconst_0        
	//  112  232:invokestatic    #136 <Method PendingIntent PendingIntent.getActivity(android.content.Context, int, Intent, int)>
	//  113  235:putfield        #140 <Field PendingIntent Notification.contentIntent>
			a1.flags = ((Notification) (a1)).flags | 0x20;
	//  114  238:aload_1         
	//  115  239:aload_1         
	//  116  240:getfield        #143 <Field int Notification.flags>
	//  117  243:bipush          32
	//  118  245:ior             
	//  119  246:putfield        #143 <Field int Notification.flags>
			a1.flags = ((Notification) (a1)).flags | 2;
	//  120  249:aload_1         
	//  121  250:aload_1         
	//  122  251:getfield        #143 <Field int Notification.flags>
	//  123  254:iconst_2        
	//  124  255:ior             
	//  125  256:putfield        #143 <Field int Notification.flags>
			a.b.notify(s, 0, ((Notification) (a1)));
	//  126  259:aload_0         
	//  127  260:getfield        #18  <Field MediaListActivity a>
	//  128  263:getfield        #146 <Field NotificationManager MediaListActivity.b>
	//  129  266:aload           5
	//  130  268:iconst_0        
	//  131  269:aload_1         
	//  132  270:invokevirtual   #152 <Method void NotificationManager.notify(String, int, Notification)>
		}
	//  133  273:return          
	}

	public void a(a a1, e e)
	{
		a1 = ((a) (a1.d.c()));
	//    0    0:aload_1         
	//    1    1:getfield        #30  <Field c a.d>
	//    2    4:invokevirtual   #36  <Method String c.c()>
	//    3    7:astore_1        
		a.b.cancel(((String) (a1)), 0);
	//    4    8:aload_0         
	//    5    9:getfield        #18  <Field MediaListActivity a>
	//    6   12:getfield        #146 <Field NotificationManager MediaListActivity.b>
	//    7   15:aload_1         
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #157 <Method void NotificationManager.cancel(String, int)>
		e = ((e) (o.a(((android.content.Context) (a)), ((String) (a1)))));
	//   10   20:aload_0         
	//   11   21:getfield        #18  <Field MediaListActivity a>
	//   12   24:aload_1         
	//   13   25:invokestatic    #162 <Method com.baidu.android.pushservice.h.o$h o.a(android.content.Context, String)>
	//   14   28:astore_2        
		if(e != null && ((com.baidu.android.pushservice.h.o.h) (e)).i == a.f)
	//*  15   29:aload_2         
	//*  16   30:ifnull          231
	//*  17   33:aload_2         
	//*  18   34:getfield        #167 <Field int com.baidu.android.pushservice.h.o$h.i>
	//*  19   37:getstatic       #170 <Field int a.f>
	//*  20   40:icmpne          231
		{
			a1 = ((a) (((com.baidu.android.pushservice.h.o.h) (e)).e));
	//   21   43:aload_2         
	//   22   44:getfield        #173 <Field String com.baidu.android.pushservice.h.o$h.e>
	//   23   47:astore_1        
			e = ((e) (((com.baidu.android.pushservice.h.o.h) (e)).f));
	//   24   48:aload_2         
	//   25   49:getfield        #175 <Field String com.baidu.android.pushservice.h.o$h.f>
	//   26   52:astore_2        
			if(((String) (e)).length() > 0)
	//*  27   53:aload_2         
	//*  28   54:invokevirtual   #181 <Method int String.length()>
	//*  29   57:ifle            231
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   30   60:new             #54  <Class StringBuilder>
	//   31   63:dup             
	//   32   64:invokespecial   #55  <Method void StringBuilder()>
	//   33   67:astore          4
				stringbuilder.append(((String) (a1)));
	//   34   69:aload           4
	//   35   71:aload_1         
	//   36   72:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   37   75:pop             
				stringbuilder.append("/");
	//   38   76:aload           4
	//   39   78:ldc1            #183 <String "/">
	//   40   80:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   41   83:pop             
				stringbuilder.append(((String) (e)).substring(0, ((String) (e)).lastIndexOf(".")));
	//   42   84:aload           4
	//   43   86:aload_2         
	//   44   87:iconst_0        
	//   45   88:aload_2         
	//   46   89:ldc1            #185 <String ".">
	//   47   91:invokevirtual   #189 <Method int String.lastIndexOf(String)>
	//   48   94:invokevirtual   #193 <Method String String.substring(int, int)>
	//   49   97:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   50  100:pop             
				stringbuilder.append("/index.html");
	//   51  101:aload           4
	//   52  103:ldc1            #195 <String "/index.html">
	//   53  105:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   54  108:pop             
				a1 = ((a) (stringbuilder.toString()));
	//   55  109:aload           4
	//   56  111:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   57  114:astore_1        
				e = ((e) (new Intent()));
	//   58  115:new             #129 <Class Intent>
	//   59  118:dup             
	//   60  119:invokespecial   #130 <Method void Intent()>
	//   61  122:astore_2        
				((Intent) (e)).setClass(((android.content.Context) (a)), com/baidu/android/pushservice/richmedia/MediaViewActivity);
	//   62  123:aload_2         
	//   63  124:aload_0         
	//   64  125:getfield        #18  <Field MediaListActivity a>
	//   65  128:ldc1            #197 <Class MediaViewActivity>
	//   66  130:invokevirtual   #201 <Method Intent Intent.setClass(android.content.Context, Class)>
	//   67  133:pop             
				int i = u.z(((android.content.Context) (a)), a.getPackageName());
	//   68  134:aload_0         
	//   69  135:getfield        #18  <Field MediaListActivity a>
	//   70  138:aload_0         
	//   71  139:getfield        #18  <Field MediaListActivity a>
	//   72  142:invokevirtual   #204 <Method String MediaListActivity.getPackageName()>
	//   73  145:invokestatic    #210 <Method int u.z(android.content.Context, String)>
	//   74  148:istore_3        
				a1 = ((a) (new File(((String) (a1)))));
	//   75  149:new             #212 <Class File>
	//   76  152:dup             
	//   77  153:aload_1         
	//   78  154:invokespecial   #215 <Method void File(String)>
	//   79  157:astore_1        
				if(i >= 24)
	//*  80  158:iload_3         
	//*  81  159:bipush          24
	//*  82  161:icmplt          204
				{
					ContentValues contentvalues = new ContentValues(1);
	//   83  164:new             #217 <Class ContentValues>
	//   84  167:dup             
	//   85  168:iconst_1        
	//   86  169:invokespecial   #220 <Method void ContentValues(int)>
	//   87  172:astore          4
					contentvalues.put("_data", ((File) (a1)).getAbsolutePath());
	//   88  174:aload           4
	//   89  176:ldc1            #222 <String "_data">
	//   90  178:aload_1         
	//   91  179:invokevirtual   #225 <Method String File.getAbsolutePath()>
	//   92  182:invokevirtual   #229 <Method void ContentValues.put(String, String)>
					a1 = ((a) (a.getContentResolver().insert(android.provider.dia.EXTERNAL_CONTENT_URI, contentvalues)));
	//   93  185:aload_0         
	//   94  186:getfield        #18  <Field MediaListActivity a>
	//   95  189:invokevirtual   #233 <Method ContentResolver MediaListActivity.getContentResolver()>
	//   96  192:getstatic       #239 <Field Uri android.provider.MediaStore$Images$Media.EXTERNAL_CONTENT_URI>
	//   97  195:aload           4
	//   98  197:invokevirtual   #245 <Method Uri ContentResolver.insert(Uri, ContentValues)>
	//   99  200:astore_1        
				} else
	//* 100  201:goto            209
				{
					a1 = ((a) (Uri.fromFile(((File) (a1)))));
	//  101  204:aload_1         
	//  102  205:invokestatic    #251 <Method Uri Uri.fromFile(File)>
	//  103  208:astore_1        
				}
				((Intent) (e)).setData(((Uri) (a1)));
	//  104  209:aload_2         
	//  105  210:aload_1         
	//  106  211:invokevirtual   #255 <Method Intent Intent.setData(Uri)>
	//  107  214:pop             
				((Intent) (e)).addFlags(0x10000000);
	//  108  215:aload_2         
	//  109  216:ldc2            #256 <Int 0x10000000>
	//  110  219:invokevirtual   #260 <Method Intent Intent.addFlags(int)>
	//  111  222:pop             
				a.startActivity(((Intent) (e)));
	//  112  223:aload_0         
	//  113  224:getfield        #18  <Field MediaListActivity a>
	//  114  227:aload_2         
	//  115  228:invokevirtual   #264 <Method void MediaListActivity.startActivity(Intent)>
			}
		}
	//  116  231:return          
	}

	public void a(a a1, Throwable throwable)
	{
		a1 = ((a) (a1.d.c()));
	//    0    0:aload_1         
	//    1    1:getfield        #30  <Field c a.d>
	//    2    4:invokevirtual   #36  <Method String c.c()>
	//    3    7:astore_1        
		a.b.cancel(((String) (a1)), 0);
	//    4    8:aload_0         
	//    5    9:getfield        #18  <Field MediaListActivity a>
	//    6   12:getfield        #146 <Field NotificationManager MediaListActivity.b>
	//    7   15:aload_1         
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #157 <Method void NotificationManager.cancel(String, int)>
		a.runOnUiThread(new Runnable() {

			public void run()
			{
				Toast toast = Toast.makeText(((android.content.Context) (a.a)), "\u4E0B\u8F7D\u5BCC\u5A92\u4F53\u5931\u8D25", 1);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field MediaListActivity$4 a>
			//    2    4:getfield        #24  <Field MediaListActivity MediaListActivity$4.a>
			//    3    7:ldc1            #26  <String "\u4E0B\u8F7D\u5BCC\u5A92\u4F53\u5931\u8D25">
			//    4    9:iconst_1        
			//    5   10:invokestatic    #32  <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
			//    6   13:astore_1        
				toast.setGravity(17, 0, 0);
			//    7   14:aload_1         
			//    8   15:bipush          17
			//    9   17:iconst_0        
			//   10   18:iconst_0        
			//   11   19:invokevirtual   #36  <Method void Toast.setGravity(int, int, int)>
				toast.show();
			//   12   22:aload_1         
			//   13   23:invokevirtual   #39  <Method void Toast.show()>
			//   14   26:return          
			}

			final MediaListActivity._cls4 a;

			
			{
				a = MediaListActivity._cls4.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MediaListActivity$4 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   10   20:aload_0         
	//   11   21:getfield        #18  <Field MediaListActivity a>
	//   12   24:new             #13  <Class MediaListActivity$4$1>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:invokespecial   #268 <Method void MediaListActivity$4$1(MediaListActivity$4)>
	//   16   32:invokevirtual   #272 <Method void MediaListActivity.runOnUiThread(Runnable)>
	//   17   35:return          
	}

	public void b(a a1)
	{
		a1 = ((a) (a1.d.c()));
	//    0    0:aload_1         
	//    1    1:getfield        #30  <Field c a.d>
	//    2    4:invokevirtual   #36  <Method String c.c()>
	//    3    7:astore_1        
		a.b.cancel(((String) (a1)), 0);
	//    4    8:aload_0         
	//    5    9:getfield        #18  <Field MediaListActivity a>
	//    6   12:getfield        #146 <Field NotificationManager MediaListActivity.b>
	//    7   15:aload_1         
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #157 <Method void NotificationManager.cancel(String, int)>
	//   10   20:return          
	}

	final MediaListActivity a;

	MediaListActivity$4(MediaListActivity medialistactivity)
	{
		a = medialistactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field MediaListActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
